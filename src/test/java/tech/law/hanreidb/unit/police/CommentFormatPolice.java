/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.unit.police;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Optional;

import org.dbflute.helper.message.ExceptionMessageBuilder;
import org.eclipse.collections.impl.Counter;

/**
 * コメントフォーマットのチェック。
 * @author awane
 */
public class CommentFormatPolice extends AbstractJavaPolice<CommentFormatPolice> {

    @Override
    public boolean containsTestClass() {
        return true;
    }

    @Override
    public Optional<String> validate(File srcFile, Class<?> clazz) {
        try {
            Counter counter = new Counter();
            for (String line : Files.readAllLines(srcFile.toPath(), StandardCharsets.UTF_8)) {
                counter.increment();
                if (line.matches(".*\\s*//\\s*(TODO|FIXME|XXX)( (?!\\p{ASCII}+ .+ \\(\\d{4}/\\d{2}/\\d{2}\\)$).*|$)")) {
                    String detail = String.format("Line %d: %s", counter.getCount(), line);
                    return Optional.of(detail);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("チェックしたいファイルを読み込めません。filePath = " + srcFile.getAbsolutePath(), e);
        }

        return Optional.empty();
    }

    @Override
    protected String getExceptionNotice() {
        return "TODO、FIXME、XXXコメントには、名前、メッセージ、日付を入れてください。";
    }

    @Override
    protected void addExceptionElement(ExceptionMessageBuilder br) {
        br.addItem("Advice");
        br.addElement("For example:");
        br.addElement("  (x):");
        br.addElement("    // TODO ${user}");
        br.addElement("    // FIXME ${message}");
        br.addElement("    // XXX ${message}");
        br.addElement("  (o):");
        br.addElement("    // TODO ${you} ${message} by ${user} (${date})");
        br.addElement("    // TODO ${user} ${message} (${date})");
        br.addElement("    // FIXME ${user} ${message} (${date})");
        br.addElement("    // XXX ${user} ${message} (${date})");
    }
}
