/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.unit.police;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.isNotEmpty;

import java.io.File;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;
import org.dbflute.helper.message.ExceptionMessageBuilder;
import org.lastaflute.core.json.annotation.JsonDatePattern;

/**
 * JsonDateFormat で指定しているパターンをチェックします。
 * @author mito
 */
public class JsonDateFormatPatternPolice extends AbstractJavaPolice<JsonDateFormatPatternPolice> {

    private String defaultPattern = "yyyy-MM-dd'T'HH:mm:ss.SSS";

    @Override
    public Optional<String> validate(File srcFile, Class<?> clazz) {
        String detail = Stream.of(clazz.getDeclaredFields()).filter(field -> {
            return Stream.of(field.getAnnotations()).anyMatch(anno -> anno instanceof JsonDatePattern);
        }).map(field -> {
            String value = field.getAnnotation(JsonDatePattern.class).value();
            return StringUtils.equals(value, defaultPattern) ? //
            String.format("%s.%s", clazz.getName(), field) : null;
        }).filter(Objects::nonNull).collect(Collectors.joining("\n"));

        if (isNotEmpty(detail)) {
            return Optional.of(detail);
        }

        return Optional.empty();
    }

    @Override
    protected boolean isTargetClass(Class<?> clazz) {
        String name = clazz.getSimpleName();
        return name.endsWith("ContentResult") || name.endsWith("Part");
    }

    @Override
    protected boolean isValidateInnerClass() {
        return true;
    }

    @Override
    protected String getExceptionNotice() {
        return "JsonDatePttern にデフォルト値が設定されているフィールドが見つかりました。";
    }

    @Override
    protected void addExceptionElement(ExceptionMessageBuilder br) {
        br.addItem("Default Pattern");
        br.addElement(defaultPattern);
    }

    public JsonDateFormatPatternPolice setDefaultPattern(String defaultPattern) {
        this.defaultPattern = defaultPattern;
        return this;
    }

}
