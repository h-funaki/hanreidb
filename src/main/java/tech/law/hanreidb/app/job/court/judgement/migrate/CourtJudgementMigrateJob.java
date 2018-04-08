package tech.law.hanreidb.app.job.court.judgement.migrate;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.ifNotBlank;
import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.ifNotEmpty;
import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.isNotBlank;
import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.newImmutableList;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Resource;

import org.apache.commons.lang3.RandomStringUtils;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.exception.EntityAlreadyExistsException;
import org.dbflute.optional.OptionalEntity;
import org.eclipse.collections.api.list.ImmutableList;
import org.lastaflute.db.jta.stage.TransactionStage;
import org.lastaflute.job.LaJob;
import org.lastaflute.job.LaJobRuntime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tech.law.hanreidb.app.base.exception.HanreidbSystemException;
import tech.law.hanreidb.app.base.job.JobRecorder;
import tech.law.hanreidb.app.base.job.exception.JobBusinessSkipException;
import tech.law.hanreidb.dbflute.allcommon.CDef;
import tech.law.hanreidb.dbflute.allcommon.CDef.Bench;
import tech.law.hanreidb.dbflute.allcommon.CDef.Era;
import tech.law.hanreidb.dbflute.exbhv.CaseMarkBhv;
import tech.law.hanreidb.dbflute.exbhv.CourtBhv;
import tech.law.hanreidb.dbflute.exbhv.CourtJudgementBhv;
import tech.law.hanreidb.dbflute.exbhv.JudgementBhv;
import tech.law.hanreidb.dbflute.exbhv.JudgementReportRelBhv;
import tech.law.hanreidb.dbflute.exbhv.JudgementSourceRelBhv;
import tech.law.hanreidb.dbflute.exbhv.ReportBhv;
import tech.law.hanreidb.dbflute.exentity.Court;
import tech.law.hanreidb.dbflute.exentity.CourtJudgement;
import tech.law.hanreidb.dbflute.exentity.Judgement;
import tech.law.hanreidb.dbflute.exentity.JudgementReportRel;
import tech.law.hanreidb.dbflute.exentity.JudgementSourceRel;

public class CourtJudgementMigrateJob implements LaJob {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Logger logger = LoggerFactory.getLogger(CourtJudgementMigrateJob.class);

    public static final String REPORT_PATTERN = "(\\S){2}[　|\\s]第(\\d{0,5}巻)?\\d{0,5}号\\d{0,5}頁";

    public static final String CASE_NUMBER_PATTERN = "(?<ERA>昭和|平成)(\\d{1,2})(\\D)?\\((.{1,2})\\)(\\D)?(\\d{1,6})等?"; // e.g. 平成16(ネ)3324等

    private static final Integer ERA_GOURP = 1;

    private static final Integer YEAR_GOURP = 2;

    private static final ImmutableList<Integer> CASE_MARK_GOURP = newImmutableList(3, 4, 5);

    private static final Integer SERINAL_NUMBER_GOURP = 6;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private CourtJudgementBhv courtJudgementBhv;
    @Resource
    private CourtBhv courtBhv;
    @Resource
    private CaseMarkBhv caseMarkBhv;
    @Resource
    private JudgementBhv judgementBhv;
    @Resource
    private JudgementSourceRelBhv judgementSourceRelBhv;
    @Resource
    private TransactionStage transactionStage;
    @Resource
    private JudgementReportRelBhv judgementReportRelBhv;
    @Resource
    private ReportBhv reportBhv;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Override
    public void run(LaJobRuntime runtime) {
        JobRecorder recorder = new JobRecorder();

        runtime.showEndTitleRoll(data -> {
            data.register("recorder", recorder);
        });

        List<Integer> alreadyPopulatedList = judgementSourceRelBhv.selectList(cb -> {
            cb.specify().columnJudgementSourceId();
            cb.query().setSourceCode_Equal_裁判所裁判例();
        }).extractColumnList(entity -> {
            return Integer.parseInt(entity.getJudgementSourceId());
        });

        ListResultBean<CourtJudgement> toBeMigratedList = courtJudgementBhv.selectList(cb -> {
            cb.specify().everyColumn();
            ifNotEmpty(alreadyPopulatedList).ifPresent(list -> {
                cb.query().setSourceOriginalId_NotInScope(list);
            });
        });

        logger.info("データ移行対象件数:{}", toBeMigratedList.size());

        recorder.planBatch(toBeMigratedList.size());

        for (CourtJudgement courtJudgement : toBeMigratedList) {
            Long pk = courtJudgement.getCourtJudgementId();
            Integer sourceOriginalId = courtJudgement.getSourceOriginalId();
            logger.info("target court id:{}", sourceOriginalId);
            try {
                if (!isPatternOfCaseNumber(courtJudgement.getCaseNumber())) {
                    throw new JobBusinessSkipException("事件番号が正規表現に一致しない：" + courtJudgement.getCaseNumber());
                }
                transactionStage.requiresNew(tx -> {
                    processMigrate(courtJudgement);
                });
                recorder.asSuccess();
            } catch (JobBusinessSkipException skip) {
                logger.info("business skip court_original_id {}", sourceOriginalId);
                recorder.asBusinessSkip(recordMessage(pk, sourceOriginalId, skip.getMessage()));
                courtJudgement.setMemo(skip.getMessage()); // 備考欄にメモ
                courtJudgementBhv.updateNonstrict(courtJudgement);
            } catch (Exception error) {
                logger.info("error court_original_id {}", sourceOriginalId);
                recorder.asError(recordMessage(pk, sourceOriginalId, error.getMessage()));
                courtJudgement.setMemo(error.getMessage()); // 備考欄にメモ
                courtJudgementBhv.updateNonstrict(courtJudgement);
            }
        }
    }

    private void processMigrate(CourtJudgement courtJudgement) throws JobBusinessSkipException {
        Judgement judgement = new Judgement();

        // 裁判所名、法廷名
        try {
            selectCourtOpt(courtJudgement.getCourtName()).ifPresent(entity -> { //  e.g. 千葉地方裁判所
                if (entity.isCourtTypeCode最高裁判所()) {
                    judgement.setBenchCodeAsBench(extractBench(courtJudgement.getCourtName())); // e.g. 最高裁判所第二小法廷
                }
                judgement.setCourtId(entity.getCourtId());
            });
        } catch (Exception e) {
            throw new JobBusinessSkipException("裁判所名の取得に失敗:" + courtJudgement.getCourtName());
        }

        // 事件名
        ifNotBlank(courtJudgement.getCaseName()).ifPresent(value -> {
            judgement.setCaseName(value);
        });

        // 事件番号 e.g. 平成17(ネ)707
        ifNotBlank(courtJudgement.getCaseNumber()).ifPresent(value -> {
            judgement.setCaseNumberEraCodeAsEra(extractEra(value));
            judgement.setCaseNumberYear(extractYear(value));
            // 符号ID
            judgement.setCaseMarkId(extractCaseMarkId(value));
            judgement.setCaseNumberSerialNumber(extractSerialNumber(value));
        }).orElse(() -> {
            throw new JobBusinessSkipException("事件番号の取得に失敗:" + courtJudgement.getCaseNumber());
        });

        // 裁判日
        ifNotEmpty(courtJudgement.getJudgementDate()).ifPresent(value -> {
            judgement.setJudgementDate(convertToWesternLocalDate(value)); // e.g. 平成16年10月18日
        });

        // 公開コード
        String makeNextPublicCode = makeNextPublicCode();
        judgement.setJudgementPublicCode(makeNextPublicCode);

        // JudgementResult
        ifNotBlank(courtJudgement.getJudgementResult()).ifPresent(value -> {
            try {
                judgement.setJudgementResultCodeAsJudgementResult(CDef.JudgementResult.byName(value).get());
            } catch (Exception e) {
                throw new JobBusinessSkipException("区分値JudgementResultのパースに失敗:" + value);
            }
        });

        // JudgementType
        ifNotBlank(courtJudgement.getJudgementType()).ifPresent(value -> {
            try {
                judgement.setJudgementTypeCodeAsJudgementType(CDef.JudgementType.byName(value).get());
            } catch (Exception e) {
                throw new JobBusinessSkipException("区分値JudgementTypeのパースに失敗:" + value);
            }
        });

        // 原審判決ID。挿入の順序のタイミングでひっかからない原審があるので、どうするか考える。
        String originalCaseNumber = courtJudgement.getOriginalCaseNumber();
        String originalCourtName = courtJudgement.getOriginalCourtName();
        if (isPatternOfCaseNumber(originalCaseNumber) && isNotBlank(originalCourtName)) {
            judgement.setOriginalJudgementId(selectOriginalJudgementId(originalCaseNumber, originalCourtName));
        }

        // 判決, 判決取得元リレーション, 判決判例集リレーション insert
        try {
            // 判決
            judgementBhv.insert(judgement);
            Long judgementId = judgement.getJudgementId();

            // 判決判例集リレーション
            insertJudgementReportRel(courtJudgement, judgementId);

            // 判決取得元リレーション
            JudgementSourceRel rel = new JudgementSourceRel();
            rel.setJudgementId(judgementId);
            rel.setSourceCode_裁判所裁判例();
            rel.setJudgementSourceId(courtJudgement.getSourceOriginalId().toString());
            // 判決文はinsertしない。PDFの処理が必要なので別のタイミングで。
            judgementSourceRelBhv.insert(rel);

        } catch (EntityAlreadyExistsException e) {
            throw new JobBusinessSkipException("挿入に失敗しました。JID:" + makeNextPublicCode);
        }
    }

    // -------------------------------------------------
    //                                             判例集
    //                                             -----
    private JudgementReportRel insertJudgementReportRel(CourtJudgement courtJudgement, Long judgementId) {
        JudgementReportRel rel = new JudgementReportRel();
        ifNotBlank(courtJudgement.getPrecedentReports()).ifPresent(value -> {
            if (value.matches(REPORT_PATTERN)) {
                reportBhv.selectEntity(cb -> {
                    cb.specify().columnReportId();
                    cb.query().setReportAlias_Equal(value.substring(0, 2));
                }).ifPresent(entity -> {
                    rel.setReportId(entity.getReportId());
                    rel.setJudgementId(judgementId);
                    parseReport(rel, value);
                    judgementReportRelBhv.insertOrUpdateNonstrict(rel);
                }).orElse(() -> {
                    throw new JobBusinessSkipException(
                            "判例集の取得に失敗 判例集:" + courtJudgement.getPrecedentReports() + " 最初の2文字:" + value.substring(0, 2));
                });
            }
        });
        return rel;
    }

    protected void parseReport(JudgementReportRel rel, String value) {
        try {
            rel.setReportKo(Integer.parseInt(value.substring(value.indexOf("号") + 1, value.indexOf("頁"))));
            if (value.contains("第") && value.contains("巻")) {
                rel.setReportKan(Integer.parseInt(value.substring(value.indexOf("第") + 1, value.indexOf("巻"))));
            }
            if (value.contains("巻")) {
                rel.setReportGo(Integer.parseInt(value.substring(value.indexOf("巻") + 1, value.indexOf("号"))));
            } else {
                rel.setReportGo(Integer.parseInt(value.substring(value.indexOf("第") + 1, value.indexOf("号"))));
            }
        } catch (NumberFormatException e) {
            throw new JobBusinessSkipException("判例集のパースに失敗。判例集：" + value);
        }
    }

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    private String recordMessage(Long pk, Integer sourceOriginalId, String message) {
        return String.format("court judgement id:\"%s\", source original id:\"%s\", message:\"%s\"", pk, sourceOriginalId, message);
    }

    // -----------------------------------------------------
    //                                            原審PKの取得
    //                                            ----------
    /**
     * @param originalCaseNumber 原審事件番号 (NotNull)
     * @return 原審PK (NotNull)
     */
    protected Long selectOriginalJudgementId(String originalCaseNumber, String originalCourtName) {
        return selectCourtOpt(originalCourtName).map(court -> {
            return judgementBhv.selectEntity(cb -> {
                cb.specify().columnJudgementId();
                cb.query().setCaseNumberEraCode_Equal_AsEra(extractEra(originalCaseNumber));
                cb.query().setCaseNumberYear_Equal(extractYear(originalCaseNumber));
                cb.query().setCaseMarkId_Equal(extractCaseMarkId(originalCaseNumber));
                cb.query().setCaseNumberSerialNumber_Equal(extractSerialNumber(originalCaseNumber));
                cb.query().setCourtId_Equal(court.getCourtId());
            }).map(entity -> {
                return entity.getJudgementId();
            }).orElse(null);
        }).orElse(null);
    }

    // -----------------------------------------------------
    //                                            裁判所名取得
    //                                            ----------
    protected OptionalEntity<Court> selectCourtOpt(String courtName) { //  e.g. 千葉地方裁判所, 大分地方裁判所 　中津支部
        return courtBhv.selectEntity(cb -> {
            cb.specify().columnCourtId();
            cb.specify().columnCourtTypeCode(); // 最高裁判所かどうか判別
            if (courtName.startsWith("最高裁判所")) { // 最高裁判所の場合、法廷名が入っているので e.g. 最高裁判所第二小法廷
                cb.query().setCourtName_Equal("最高裁判所");
            } else if (courtName.endsWith("部")) {
                cb.query().setCourtName_LikeSearch(courtName.substring(0, courtName.indexOf(" ")), op -> op.likePrefix());
            } else {
                cb.query().setCourtName_Equal(courtName);
            }
        });
    }

    // -----------------------------------------------------
    //                                              法廷の取得
    //                                              --------
    protected Bench extractBench(String courtName) { // e.g. 最高裁判所第二小法廷
        if (courtName.contains(CDef.Bench.大法廷.name())) {
            return CDef.Bench.大法廷;
        } else if (courtName.contains(CDef.Bench.第一小法廷.name())) {
            return CDef.Bench.第一小法廷;
        } else if (courtName.contains(CDef.Bench.第二小法廷.name())) {
            return CDef.Bench.第二小法廷;
        } else if (courtName.contains(CDef.Bench.第三小法廷.name())) {
            return CDef.Bench.第三小法廷;
        } else {
            throw new JobBusinessSkipException("法廷名の取得に失敗:" + courtName);
        }
    }

    // -----------------------------------------------------
    //                                              和暦の変換
    //                                              --------
    protected LocalDate convertToWesternLocalDate(String japaneseDate) throws JobBusinessSkipException {
        Locale locale = new Locale("ja", "JP", "JP");
        Calendar calendar = Calendar.getInstance(locale);

        //calendar.getTime()で現在日時を取得して和暦にフォーマットする
        DateFormat japaseseFormat = new SimpleDateFormat("GGGGy年M月d日", locale);

        //和暦にフォーマットした現在日時を西暦にパースする e.g. 平成16年10月18日
        //日付の妥当性をチェックするためsetLenient()にfalseを渡す
        calendar.setLenient(false);
        LocalDate date = null;
        try {
            date = japaseseFormat.parse(japaneseDate).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        } catch (ParseException | NullPointerException e) {
            throw new JobBusinessSkipException("和暦の変換に失敗:" + japaneseDate);
        }
        return date;
    }

    // -----------------------------------------------------
    //                                         事件番号のパース
    //                                         -------------
    protected boolean isPatternOfCaseNumber(String caseNumber) {
        return getMatcherOfCaseNumber(caseNumber).matches();
    }

    private Matcher getMatcherOfCaseNumber(String caseNumber) {
        Pattern pattern = Pattern.compile(CASE_NUMBER_PATTERN);
        return pattern.matcher(caseNumber);
    }

    private String getGroupOfCaseNumber(String caseNumber, Integer group) {
        Matcher m = getMatcherOfCaseNumber(caseNumber);
        if (m.find()) {
            return m.group(group);
        } else {
            throw new HanreidbSystemException("事件番号から元号の取得に失敗");
        }
    }

    protected Era extractEra(String caseNumber) { // e.g. 平成16(ネ)3324, 平成17特(わ)3838
        String substring = getGroupOfCaseNumber(caseNumber, ERA_GOURP);
        return CDef.Era.byName(substring).map(value -> {
            return value;
        }).orElseThrow(() -> {
            return new HanreidbSystemException("事件番号から元号の取得に失敗:" + substring);
        });
    }

    protected Integer extractYear(String caseNumber) { // e.g. 平成16(ネ)3324, 平成17特(わ)3838等
        Integer result = null;
        String substring = getGroupOfCaseNumber(caseNumber, YEAR_GOURP);
        try {
            result = Integer.parseInt(substring);
        } catch (NumberFormatException e) {
            throw new HanreidbSystemException("事件番号から年の取得に失敗:" + substring);
        }
        if (result > 64 || result < 1) {
            throw new HanreidbSystemException("事件番号の年の数値が異常:" + substring);
        }
        return result;
    }

    protected Integer extractCaseMarkId(String caseNumber) { // e.g. 平成16(ネ)3324, 平成17特(わ)3838等
        String substring = "";
        for (Integer integer : CASE_MARK_GOURP) {
            String str = getGroupOfCaseNumber(caseNumber, integer);
            if (isNotBlank(str)) {
                substring = substring.concat(str);
            }
        }
        String caseMark = substring;
        return caseMarkBhv.selectEntity(cb -> {
            cb.specify().columnCaseMarkId();
            cb.query().setCaseMarkName_Equal(caseMark);
        }).map(value -> {
            return value.getCaseMarkId();
        }).orElseThrow(() -> {
            return new HanreidbSystemException("事件番号から符号の取得に失敗:" + caseMark);
        });
    }

    protected Integer extractSerialNumber(String caseNumber) { // e.g. 平成16(ネ)3324, 平成17特(わ)新3838等
        Integer result = null;
        String substring = getGroupOfCaseNumber(caseNumber, SERINAL_NUMBER_GOURP);
        if (substring.endsWith("等")) {
            substring = substring.substring(0, substring.length() - 1); // e.g. 平成16(ネ)3324等
        }
        if (substring.startsWith("新")) {
            substring = substring.substring(1, substring.length() - 1);
        }
        try {
            result = Integer.parseInt(substring);
        } catch (NumberFormatException e) {
            throw new HanreidbSystemException("事件番号から連番の取得に失敗:" + substring);
        }
        return result;
    }

    protected String makeNextPublicCode() {
        return "JID" + RandomStringUtils.random(3, "ABCDEFGHIJKLMNOPQRSTUVWXYZ") + RandomStringUtils.random(6, "0123456789");
    }
}
