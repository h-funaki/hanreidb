package tech.law.hanreidb.app.job.court.judgement.sentence.set;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.newArrayList;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.io.IOUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.dbflute.exception.EntityAlreadyDeletedException;
import org.dbflute.exception.EntityAlreadyExistsException;
import org.dbflute.exception.EntityDuplicatedException;
import org.lastaflute.db.jta.stage.TransactionStage;
import org.lastaflute.job.LaJob;
import org.lastaflute.job.LaJobRuntime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.emory.mathcs.backport.java.util.Arrays;
import tech.law.hanreidb.app.base.job.JobRecorder;
import tech.law.hanreidb.app.base.job.exception.JobBusinessSkipException;
import tech.law.hanreidb.app.job.court.judgement.set.CourtJudgementSetJob;
import tech.law.hanreidb.app.logic.FileLogic;
import tech.law.hanreidb.dbflute.allcommon.CDef;
import tech.law.hanreidb.dbflute.exbhv.JudgementSourceRelBhv;
import tech.law.hanreidb.dbflute.exentity.JudgementSourceRel;
import tech.law.hanreidb.mylasta.direction.HanreidbEnv;

public class CourtJudgementSentenceSetJob implements LaJob {
    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Logger logger = LoggerFactory.getLogger(CourtJudgementSetJob.class);

    public static final String BASE_URL = "http://www.courts.go.jp/app/hanrei_jp/";

    public static final String BEGIN_ID = "begin_id";

    public static final String END_ID = "end_id";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private TransactionStage transactionStage;
    @Resource
    private HanreidbEnv env;
    @Resource
    private JudgementSourceRelBhv judgementSourceRelBhv;
    @Resource
    private FileLogic fileLogic;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Override
    public void run(LaJobRuntime runtime) {
        JobRecorder recorder = new JobRecorder();

        runtime.showEndTitleRoll(data -> {
            data.register("recorder", recorder);
        });

        Integer beginId = null;
        if (runtime.getParameterMap().get(BEGIN_ID) != null) { // 引数があればそれを使う
            beginId = ((Double) runtime.getParameterMap().get(BEGIN_ID)).intValue();
        } else {
            beginId = selectMaxSourceOriginalId() + 1;
        }

        Integer endId = null;
        if (runtime.getParameterMap().get(END_ID) != null) { // 引数があればそれを使う
            endId = ((Double) runtime.getParameterMap().get(END_ID)).intValue(); // なぜかObject => Doubleになる
        } else {
            endId = beginId + 10000; // as default
        }

        List<Integer> targetIdList = getTargetIdList(beginId, endId);
        logger.info("begin id:{}, end id:{}, planCount:{}", beginId, endId, targetIdList.size());

        recorder.planBatch(targetIdList.size());

        for (Integer targetId : targetIdList) {
            recorder.asProcessed();
            logger.info("target id:{}", targetId);
            try {
                int id = targetId;
                transactionStage.requiresNew(tx -> {
                    processSentence(id); // must be final
                });
                recorder.asSuccess();
            } catch (IndexOutOfBoundsException | JobBusinessSkipException | EntityAlreadyExistsException ex) {
                logger.info("skip target id {}", targetId);
                recorder.asBusinessSkip(recordMessage(targetId, ex.getMessage()));
            } catch (Exception exception) {
                logger.info("error target id {}", targetId);
                recorder.asError(recordMessage(targetId, exception.getMessage()));
            } finally {
                targetId += 1;
            }
        }
        fileLogic.outputRecorder(recorder, getClass().getSimpleName(), beginId, endId);
    }

    public void processSentence(Integer targetId) {
        PDDocument document = null;
        StringWriter output = null;
        try {
            document = PDDocument.load(new File(env.getCourtPdfPath() + targetId + ".pdf"));
            PDFTextStripper stripper = new PDFTextStripper();
            //            String[] split = stripper.getText(document).split(stripper.getLineSeparator());
            //            for (String string : split) {
            //                if (string.startsWith("\\s")) {
            //                    logger.debug("ここ");
            //                }
            //                logger.debug(string);
            //            }
            String text = stripper.getText(document).replaceAll(stripper.getLineSeparator(), "");
            text = text.replaceAll("。(　)", "。\n$1");
            text = text.replaceAll("。( )", "。\n$1");
            text = text.replaceAll("　([１-９]　)", "\n$1");
            text = text.replaceAll("第([１-９]　)", "\n第$1");
            text = text.replaceFirst("事　実　及　び　理　由", "\n事　実　及　び　理　由\n"); // .replaceAll("\\s{2,}", "")
            text = text.replaceAll("- \\d{1,} - ", "");
            //text = text.replaceAll("", "");
            //text = text.replaceAll("", "");

            logger.debug(text);

            // updateJudgementSourceRel(targetId, stripper.getText(document));
        } catch (IOException e) {
            throw new JobBusinessSkipException("PDFファイルの取得に失敗。targetId:" + targetId);
        } catch (EntityAlreadyDeletedException | EntityDuplicatedException | EntityAlreadyExistsException e) {
            throw new JobBusinessSkipException("エンティティの更新に失敗。targetId:" + targetId);
        } finally {
            IOUtils.closeQuietly(output);
            IOUtils.closeQuietly(document);
        }
    }

    private void updateJudgementSourceRel(Integer targetId, String sentence) {
        JudgementSourceRel rel = new JudgementSourceRel();
        rel.uniqueBy(CDef.Source.裁判所裁判例.code(), targetId.toString());
        rel.setJudgementSourceSentence(sentence);
        judgementSourceRelBhv.updateNonstrict(rel);
    }

    protected List<Integer> getTargetIdList(Integer beginId, Integer endId) {
        //存在するPDFファイルのみを対象にする
        @SuppressWarnings("unchecked")
        List<String> pdfList = Arrays.asList(new File(env.getCourtPdfPath()).list());

        pdfList.forEach(pdf -> {
            logger.debug(pdf);
        });

        List<Integer> targetIdList = newArrayList();
        for (Integer targetId = beginId; targetId <= endId; targetId++) {
            if (pdfList.contains(targetId.toString().concat(".pdf"))) {
                logger.debug(targetId.toString());
                targetIdList.add(targetId);
            } else {
                logger.info("pdfファイルなし。targetId:{}", targetId);
            }
        }
        return targetIdList;
    }

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    private Integer selectMaxSourceOriginalId() {
        return judgementSourceRelBhv.selectEntity(cb -> {
            cb.specify().columnJudgementSourceId();
            cb.query().addOrderBy_JudgementSourceId_Desc();
            cb.query().setSourceCode_Equal_裁判所裁判例();
            cb.fetchFirst(1);
        }).map(entity -> {
            return Integer.parseInt(entity.getJudgementSourceId());
        }).orElse(0);
    }

    private String recordMessage(Integer id, String message) {
        return String.format("id:\"%s\"\n message:\"%s\"\n", id, message);
    }
}
