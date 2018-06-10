package tech.law.hanreidb.app.logic;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.isBlank;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tech.law.hanreidb.app.base.exception.HanreidbSystemException;
import tech.law.hanreidb.app.base.job.JobRecorder;
import tech.law.hanreidb.mylasta.direction.HanreidbEnv;

public class FileLogic {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Logger logger = LoggerFactory.getLogger(FileLogic.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private HanreidbEnv env;

    // ===================================================================================
    //                                                                               Logic
    //                                                                               =====

    public void getFile(String url, String outputPath) {
        if (isBlank(url) || isBlank(outputPath)) {
            throw new HanreidbSystemException("urlかoutputPathがBlank. url:" + url + " outputPath:" + outputPath);
        }
        try {
            HttpURLConnection urlConnection = (HttpURLConnection) new URL(url).openConnection();
            // false の場合、ユーザーとの対話処理は許可されていません。
            urlConnection.setAllowUserInteraction(false);
            // true の場合、プロトコルは自動的にリダイレクトに従います
            urlConnection.setInstanceFollowRedirects(true);
            // URL 要求のメソッドを"GET"に設定
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();

            // HTTP 応答メッセージから状態コードを取得します
            int httpStatusCode = urlConnection.getResponseCode();
            if (httpStatusCode != HttpURLConnection.HTTP_OK) {
                throw new Exception();
            }
            writeStream(urlConnection.getInputStream(), outputPath);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void writeStream(InputStream inputStream, String outputPath) throws Exception {
        int availableByteNumber;
        byte[] buffers = new byte[4096];
        try (DataInputStream dataInputStream = new DataInputStream(inputStream);
                DataOutputStream outputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(outputPath)))) {
            while ((availableByteNumber = dataInputStream.read(buffers)) > 0) {
                outputStream.write(buffers, 0, availableByteNumber);
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    public String readAll(final String path) throws IOException {
        return Files.lines(Paths.get(path), Charset.forName("UTF-8")).collect(Collectors.joining(System.getProperty("line.separator")));
    }

    /**
     * recorderの内容をファイル出力
     * e.g. /court/recorder/CourtJudgementPutJob_10-20.txt
     * @param recorder レコーダー (NotNull)
     * @param jobName Jobの名前 (NotNull)
     * @param beginId 処理対象の最初のID (NotNull)
     * @param endId 処理対象最後のID (NotNull)
     */
    public void outputRecorder(JobRecorder recorder, String jobName, Integer beginId, Integer endId) {
        String fileName = env.getLogCourtJobRecorderFileBasedir() + jobName + "_" + beginId + "-" + endId + ".txt";
        File file = new File(fileName);
        Integer serialNumber = 1;
        while (file.exists()) {
            serialNumber += 1;
            file = new File(
                    env.getLogCourtJobRecorderFileBasedir() + jobName + "_" + beginId + "-" + endId + "_No" + serialNumber + ".txt");
        }
        FileWriter filewriter = null;
        try {
            filewriter = new FileWriter(file);
            filewriter.write(recorder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                filewriter.close();
                logger.info("出力したレコーダーファイル名:{}", file.getName());
            } catch (Exception e2) {
                // 握りつぶす
            }
        }
    };

    /**
     * recorderの内容をファイル出力
     * e.g. /court/recorder/CourtJudgementPutJob_No2.txt
     * @param recorder レコーダー (NotNull)
     * @param jobName Jobの名前 (NotNull)
     * @param beginId 処理対象の最初のID (NotNull)
     * @param endId 処理対象最後のID (NotNull)
     */
    public void outputRecorder(JobRecorder recorder, String jobName) {
        String fileName = env.getLogCourtJobRecorderFileBasedir() + jobName + ".txt";
        File file = new File(fileName);
        Integer serialNumber = 1;
        while (file.exists()) {
            serialNumber += 1;
            file = new File(env.getLogCourtJobRecorderFileBasedir() + jobName + "_No" + serialNumber + ".txt");
        }
        FileWriter filewriter = null;
        try {
            filewriter = new FileWriter(file);
            filewriter.write(recorder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                filewriter.close();
                logger.info("出力したレコーダーファイル名:{}", file.getName());
            } catch (Exception e2) {
                // 握りつぶす
            }
        }
    };
}
