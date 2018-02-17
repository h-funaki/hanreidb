/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.unit.police;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * ".project" ファイルをチェックする。
 * @author mito
 */
public class DotProjectPolice extends AbstractProjectResourcePolice<DotProjectPolice> {

    @Override
    public Optional<String> validate(File resourceFile) {
        try (Stream<String> lineStream = Files.lines(resourceFile.toPath())) {
            // Checkstyle が有効になっているかチェック
            if (!lineStream.anyMatch(line -> line.contains("CheckstyleNature"))) {
                return Optional.of(
                        "Eclipse の CheckStyle が有効になっていません。\n プロジェクトを右クリック\n  - Properties\n  - Checkstyle\n  を開いて Main タブの\n 「Checkstyle active for this project」 をチェックして下さい。");
            }
        } catch (IOException e) {
            throw new RuntimeException(resourceFile.getAbsolutePath() + " の読み込み中にエラーが発生しました。", e);
        }

        return Optional.empty();
    }

    @Override
    protected boolean isTargetExt(String fileName) {
        return fileName.endsWith(".project");
    }

    @Override
    protected String getExceptionNotice() {
        return "プロジェクトの .project ファイルが不正です。";
    }
}
