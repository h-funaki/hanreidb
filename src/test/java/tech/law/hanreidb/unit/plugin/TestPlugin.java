package tech.law.hanreidb.unit.plugin;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Arrays;

/**
 * テストプラグイン
 * @author h-funaki
 */
public interface TestPlugin {

    /**
     * setup。
     */
    void setUp();

    /**
     * tearDown。
     */
    void tearDown();

    default File getRootProjectDir() {
        for (File dir = new File("").getAbsoluteFile(); dir != null; dir = dir.getParentFile()) {
            if (Arrays.stream(dir.listFiles()).anyMatch(file -> file.getName().equals("settings.gradle"))) {
                for (File base : dir.listFiles()) {
                    if (base.isDirectory() && base.getName().endsWith("-base")) {
                        return base;
                    }
                }
            }
        }

        throw new IllegalStateException("マルチプロジェクトの場合しか考慮されていません。");
    }

    // 既に起動してたら true
    default boolean isAddressAlreadyInUse(String hostName, int port) {
        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress(hostName, port), 2000); // とりあえずタイムアウトは2秒
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    default void gradleExecute(String... command) {
        ProcessBuilder processBuilder = new ProcessBuilder(command);
        processBuilder.directory(getRootProjectDir());
        processBuilder.redirectErrorStream(true);
        try {
            Process process = processBuilder.start();
            process.waitFor();
            String str;
            try (BufferedReader brstd = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                while ((str = brstd.readLine()) != null) {
                    System.out.println(str);
                }
            }
            if (process.exitValue() != 0) {
                throw new IllegalStateException("gradle実行エラー。exitValue=" + process.exitValue());
            }
        } catch (IOException | InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    default String gradleCommand() {
        return isWin() ? "gradlew.bat" : "./gradlew";
    }

    default boolean isWin() {
        return System.getProperty("os.name").toLowerCase().startsWith("windows");
    }
}
