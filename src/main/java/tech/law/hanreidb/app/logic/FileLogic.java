package tech.law.hanreidb.app.logic;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.isBlank;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import tech.law.hanreidb.app.base.exception.HanreidbSystemException;

public class FileLogic {

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
}
