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
 * DateTimeFormatter の使用をチェックするポリス。
 * @author mito
 */
public class DateTimeFormatterPolice extends AbstractJavaPolice<DateTimeFormatterPolice> {

    @Override
    public Optional<String> validate(File srcFile, Class<?> clazz) {
        try {
            Counter counter = new Counter();
            for (String line : Files.readAllLines(srcFile.toPath(), StandardCharsets.UTF_8)) {
                counter.increment();
                if (line.contains("DateTimeFormatter")) {
                    String detail = String.format("Line %d: %s", counter.getCount(), clazz.getName());
                    return Optional.of(detail);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("チェックしたいファイルを読み込めません。filePath = " + srcFile.getAbsolutePath(), e);
        }

        return Optional.empty();
    }

    @Override
    protected boolean isTargetClass(Class<?> clazz) {
        String name = clazz.getSimpleName();
        return name.endsWith("Action") || name.endsWith("Assist");
    }

    @Override
    protected String getExceptionNotice() {
        return "DateTimeFormatter を使用してはいけないクラスでの使用が見つかりました。";
    }

    @Override
    protected void addExceptionElement(ExceptionMessageBuilder br) {
        br.addItem("Advice");
        br.addElement("For example:");
        br.addElement("  (o):");
        br.addElement("    public XxxContentResult implements ContentResult {");
        br.addElement("        ... ");
        br.addElement("        @JsonDatePattern(\"yyyy-MM-dd'T'HH:mm:ss.SSS\")");
        br.addElement("        public LocalDateTime login_datetime;");
        br.addElement("        ... ");
        br.addElement("    }");
    }
}
