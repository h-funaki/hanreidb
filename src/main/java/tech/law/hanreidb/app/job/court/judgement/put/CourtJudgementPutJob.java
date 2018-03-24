package tech.law.hanreidb.app.job.court.judgement.put;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.annotation.Resource;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.lastaflute.job.LaJob;
import org.lastaflute.job.LaJobRuntime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tech.law.hanreidb.app.base.job.JobRecorder;
import tech.law.hanreidb.app.base.job.exception.JobBusinessSkipException;
import tech.law.hanreidb.app.logic.FileLogic;
import tech.law.hanreidb.dbflute.exbhv.CourtJudgementBhv;
import tech.law.hanreidb.mylasta.direction.HanreidbEnv;

public class CourtJudgementPutJob implements LaJob {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Logger logger = LoggerFactory.getLogger(CourtJudgementPutJob.class);

    public static final String HTML_URL = "http://www.courts.go.jp/app/hanrei_jp/";

    public static final String PDF_URL = "http://www.courts.go.jp/app/files/hanrei_jp/";

    public static final String BEGIN_ID = "begin_id";

    public static final String END_ID = "end_id";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private CourtJudgementBhv courtJudgementBhv;
    @Resource
    private HanreidbEnv env;
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
            endId = 5; // 99999;
        }

        logger.info("begin id:{}, end id:{}", beginId, endId);

        recorder.planBatch(endId - beginId + 1);
        Integer targetId = beginId;
        while (targetId <= endId) {
            recorder.asProcessed();
            logger.info("target id:{}", targetId);
            try {
                putHtmlDocument(targetId, 2);
                putHtmlDocument(targetId, 3);
                putHtmlDocument(targetId, 4);
                putHtmlDocument(targetId, 5);
                putHtmlDocument(targetId, 7);
                putPdf(targetId);
                recorder.asSuccess();
            } catch (JobBusinessSkipException continued) {
                logger.info("skip! target id {}", targetId);
                recorder.asBusinessSkip(recordMessage(targetId, continued.getMessage()));
            } catch (Exception exception) {
                logger.info("error! target id {}", targetId);
                recorder.asError(recordMessage(targetId, exception.getMessage()));
            } finally {
                targetId += 1;
            }
        }
    }

    protected void putHtmlDocument(Integer targetId, Integer detail) {
        String url = HTML_URL.concat("detail").concat(detail.toString()).concat("?id=").concat(targetId.toString());
        try {
            Document document = Jsoup.connect(url).get();
            String htmlFileName = env.getCourtHtmlPath() + targetId + "_" + detail + ".html";
            if (new File(htmlFileName).exists()) {
                throw new JobBusinessSkipException("ファイルを上書き。ファイル名：" + htmlFileName);
            }
            FileWriter htmlFile = new FileWriter(htmlFileName);
            htmlFile.write(document.outerHtml());
            htmlFile.close();
        } catch (HttpStatusException ex) {
            throw new JobBusinessSkipException("");
        } catch (IOException ex) {
            throw new JobBusinessSkipException("");
        }
    }

    protected void putPdf(Integer targetId) {
        // e.g. http://www.courts.go.jp/app/files/hanrei_jp/001/000001_hanrei.pdf
        String targetIdStr = String.format("%06d", targetId);
        String url = PDF_URL.concat(targetIdStr.substring(3)).concat("/").concat(targetIdStr).concat("_hanrei.pdf"); // 586/087586
        String outputPath = env.getCourtPdfPath() + targetId + ".pdf";
        try {
            fileLogic.getFile(url, outputPath);
        } catch (Exception ex) {
            throw new JobBusinessSkipException("判決文のPDFファイルの取得に失敗。 targetId: " + targetId + " url:" + url + " outputpath:" + outputPath);
        }
    }

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    private Integer selectMaxSourceOriginalId() {
        return courtJudgementBhv.selectEntity(cb -> {
            cb.specify().columnSourceOriginalId();
            cb.query().addOrderBy_SourceOriginalId_Desc();
            cb.fetchFirst(1);
        }).map(entity -> {
            return entity.getSourceOriginalId();
        }).orElse(0);
    }

    private String recordMessage(Integer id, String message) {
        return String.format("id:\"%s\", message:\"%s\"", id, message);
    }
    //File pdf = new File(env.getCourtPdfPath() + targetId + ".pdf");
    //PDDocument document = PDDocument.load(pdf);
    //PDFTextStripper pdfStripper = new PDFTextStripper();
    //String text = pdfStripper.getText(document);
    //logger.debug(text);
    //document.close();
}
