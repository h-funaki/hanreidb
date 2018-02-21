package tech.law.hanreidb.app.job.court.judgement;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.ifNotBlank;
import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.ifNotEmpty;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.apache.commons.lang3.RandomStringUtils;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.exception.EntityAlreadyExistsException;
import org.dbflute.optional.OptionalEntity;
import org.lastaflute.db.jta.stage.TransactionStage;
import org.lastaflute.job.LaJob;
import org.lastaflute.job.LaJobRuntime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

public class CourtJudgementJob implements LaJob {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Logger logger = LoggerFactory.getLogger(CourtJudgementJob.class);

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
            cb.specify().columnSourceJudgementId();
            cb.query().setSourceCode_Equal_裁判所裁判例();
        }).extractColumnList(entity -> {
            return Integer.parseInt(entity.getSourceJudgementId());
        });

        ListResultBean<CourtJudgement> toBeMigratedList = courtJudgementBhv.selectList(cb -> {
            cb.specify().everyColumn();
            cb.query().setSourceOriginalId_NotInScope(alreadyPopulatedList);
        });

        logger.info("データ移行対象件数:{}", toBeMigratedList.size());

        recorder.planBatch(toBeMigratedList.size());

        for (CourtJudgement courtJudgement : toBeMigratedList) {
            Long pk = courtJudgement.getCourtJudgementId();
            Integer sourceOriginalId = courtJudgement.getSourceOriginalId();
            logger.info("target court id:{}", sourceOriginalId);
            try {
                transactionStage.requiresNew(tx -> {
                    processMigrate(courtJudgement);
                });
            } catch (JobBusinessSkipException skip) {
                logger.info("business skip court id {}", sourceOriginalId);
                recorder.asBusinessSkip(recordMessage(pk, sourceOriginalId, skip.getMessage()));
            } catch (Exception error) {
                logger.info("error court id {}", sourceOriginalId);
                recorder.asError(recordMessage(pk, sourceOriginalId, error.getMessage()));
            }
        }
    }

    private void processMigrate(CourtJudgement courtJudgement) throws JobBusinessSkipException {
        Judgement judgement = new Judgement();

        // 裁判所名、法廷名
        selectCourtOpt(courtJudgement.getCourtName()).ifPresent(entity -> { //  e.g. 千葉地方裁判所
            if (entity.isCourtTypeCode最高裁判所()) {
                judgement.setBenchCodeAsBench(extractBench(courtJudgement.getCourtName())); // e.g. 最高裁判所第二小法廷
            }
            judgement.setCourtId(entity.getCourtId());
        }).orElse(() -> {
            throw new JobBusinessSkipException("裁判所名の取得に失敗:" + courtJudgement.getCourtName());
        });

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

        // 原審判決ID
        ifNotBlank(courtJudgement.getOriginalCaseNumber()).ifPresent(value -> {
            judgement.setOriginalJudgementId(selectOriginalJudgementId(value));
        });

        // 判例集
        ifNotBlank(courtJudgement.getPrecedentReports()).ifPresent(value -> {
            reportBhv.selectEntity(cb -> {
                cb.specify().columnReportId();
                cb.query().setReportName_Equal(value.substring(0, 2));
            }).ifPresent(entity -> {
                insertJudgementReportRel(value, entity.getReportId());
            });
        });

        // 判決 insert
        try {
            judgementBhv.insert(judgement);
        } catch (EntityAlreadyExistsException e) {
            throw new JobBusinessSkipException("挿入に失敗しました。JID:" + makeNextPublicCode);
        }
    }

    // -------------------------------------------------
    //                                             判例集
    //                                             -----
    protected void insertJudgementReportRel(String value, Integer reportId) {
        try {
            JudgementReportRel rel = new JudgementReportRel();
            rel.setReportId(reportId);
            rel.setReportGo(Integer.parseInt(value.substring(value.indexOf("第") + 1, value.indexOf("巻"))));
            rel.setReportKan(Integer.parseInt(value.substring(value.indexOf("巻") + 1, value.indexOf("号"))));
            rel.setReportKo(Integer.parseInt(value.substring(value.indexOf("号") + 1, value.indexOf("頁"))));
            judgementReportRelBhv.insert(rel);
        } catch (NumberFormatException e) {
            throw new JobBusinessSkipException("判例集のパースに失敗");
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
    protected Long selectOriginalJudgementId(String originalCaseNumber) {
        return judgementBhv.selectEntity(cb -> {
            cb.specify().columnJudgementId();
            cb.query().setCaseNumberEraCode_Equal_AsEra(extractEra(originalCaseNumber));
            cb.query().setCaseNumberYear_Equal(extractYear(originalCaseNumber));
            cb.query().setCaseMarkId_Equal(extractCaseMarkId(originalCaseNumber));
            cb.query().setCaseNumberSerialNumber_Equal(extractSerialNumber(originalCaseNumber));
        }).map(entity -> {
            return entity.getJudgementId();
        }).orElse(null);
    }

    // -----------------------------------------------------
    //                                            裁判所名取得
    //                                            ----------
    protected OptionalEntity<Court> selectCourtOpt(String courtName) { //  e.g. 千葉地方裁判所
        return courtBhv.selectEntity(cb -> {
            cb.specify().columnCourtId();
            cb.specify().columnCourtTypeCode(); // 最高裁判所かどうか判別
            if (courtName.startsWith("最高裁判所")) { // 最高裁判所の場合、法廷名が入っているので e.g. 最高裁判所第二小法廷
                cb.query().setCourtName_Equal("最高裁判所");
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
    protected Era extractEra(String caseNumber) { // e.g. 平成16(ネ)3324
        String substring = caseNumber.substring(0, 2);
        return CDef.Era.byName(substring).map(value -> {
            return value;
        }).orElseThrow(() -> {
            return new JobBusinessSkipException("事件番号から元号の取得に失敗:" + substring);
        });
    }

    protected Integer extractYear(String caseNumber) { // e.g. 平成16(ネ)3324
        Integer result = null;
        String substring = caseNumber.substring(2, caseNumber.indexOf("("));
        try {
            result = Integer.parseInt(substring);
        } catch (NumberFormatException e) {
            throw new JobBusinessSkipException("事件番号から年の取得に失敗:" + substring);
        }
        if (result > 64 || result < 1) {
            throw new JobBusinessSkipException("事件番号から年の取得に失敗:" + substring);
        }
        return result;
    }

    protected Integer extractCaseMarkId(String caseNumber) { // e.g. 平成16(ネ)3324
        String substring = caseNumber.substring(caseNumber.indexOf("(") + 1, caseNumber.indexOf(")"));
        return caseMarkBhv.selectEntity(cb -> {
            cb.specify().columnCaseMarkId();
            cb.query().setCaseMarkName_Equal(substring);
        }).map(value -> {
            return value.getCaseMarkId();
        }).orElseThrow(() -> {
            return new JobBusinessSkipException("事件番号から符号の取得に失敗:" + substring);
        });
    }

    protected Integer extractSerialNumber(String caseNumber) { // e.g. 平成16(ネ)3324
        Integer result = null;
        String substring = caseNumber.substring(caseNumber.indexOf(")") + 1);
        try {
            result = Integer.parseInt(substring);
        } catch (NumberFormatException e) {
            throw new JobBusinessSkipException("事件番号から連番の取得に失敗:" + substring);
        }
        return result;
    }

    protected String makeNextPublicCode() {
        return "JID" + RandomStringUtils.random(9, "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    }
}
