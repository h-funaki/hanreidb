/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.unit.police;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.newArrayList;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.dbflute.util.DfReflectionUtil;

/**
 * フィールドの名前と型の組み合わせをチェックしたいポリス用。
 * @author mito
 */
public abstract class AbstractFiledTypePolice extends AbstractJavaPolice<AbstractFiledTypePolice> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    protected static final List<String> defaultTargetClassSuffixList = Arrays.asList("Form", "ContentResult", "Part");
    protected List<String> targetClassSuffixList;
    protected List<String> ignoreFiledNameList = newArrayList();

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    public AbstractFiledTypePolice setIgnoreFieldName(String... fieldName) {
        ignoreFiledNameList = Arrays.asList(fieldName);

        return this;
    }

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Override
    public Optional<String> validate(File srcFile, Class<?> clazz) {
        List<String> errorMessageList = validateField(clazz);
        if (!errorMessageList.isEmpty()) {
            return Optional.of(String.join("\n", errorMessageList));
        }

        // インナークラス対応
        for (Class<?> innerClass : clazz.getDeclaredClasses()) {
            handle(srcFile, innerClass);
        }

        return Optional.empty();
    }

    // return error message list.
    protected List<String> validateField(Class<?> clazz) {
        List<Field> fieldList = DfReflectionUtil.getPublicFieldList(clazz);

        return fieldList.stream().map(field -> {
            return (isTargetField(field) && !ignoreFiledNameList.contains(field.getName()) && !validateFieldType(field))
                    ? String.format("%s.%s", clazz.getName(), field.getName())
                    : null;
        }).filter(Objects::nonNull).collect(Collectors.toList());
    }

    // ===================================================================================
    //                                                                            Override
    //                                                                            ========
    abstract protected boolean isTargetField(Field field);

    abstract protected boolean validateFieldType(Field field);

    public AbstractFiledTypePolice setTargetClassSuffix(String... suffixArray) {
        targetClassSuffixList = Arrays.asList(suffixArray);
        return this;
    }
}
