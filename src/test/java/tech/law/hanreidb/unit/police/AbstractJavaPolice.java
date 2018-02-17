/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.unit.police;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.newArrayList;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.dbflute.helper.message.ExceptionMessageBuilder;
import org.dbflute.utflute.core.policestory.javaclass.PoliceStoryJavaClassHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Java ポリスの土台用。
 * @author mito
 */
public abstract class AbstractJavaPolice<T extends AbstractJavaPolice<T>> implements PoliceStoryJavaClassHandler {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Logger logger = LoggerFactory.getLogger(AbstractJavaPolice.class);
    // 除外するクラス
    protected List<Class<?>> ignoreClassList = newArrayList();
    // 除外するクラス（正規表現）
    protected List<String> ignoreClassRegexList = newArrayList();
    // 除外するパッケージ名（前方一致）
    protected List<String> ignorePackageList = newArrayList();
    // 除外するFQCN（正規表現）
    protected List<String> ignoreFqcnRegexList = newArrayList();
    // デバッグモード（修正対象クラスがどのぐらいあるのか見るために用意）確認用のおまけ機能なので簡易実装
    // 今の実装だとファイル数はわかっても個数がわからない(個々のクラスで debugMode 実装すればいけるけど）
    private boolean debugMode = false;

    @Override
    public void handle(File srcFile, Class<?> clazz) {
        String fqcn = clazz.getName();
        String className = clazz.getSimpleName();
        String packageName = clazz.getPackage().getName();

        if (ignoreClassList.contains(clazz)) {
            logger.debug("#skip ignoreClass ... " + fqcn);
            return;
        }

        if (ignorePackageList.stream().anyMatch(ignoreName -> packageName.startsWith(ignoreName))) {
            logger.debug("#skip ignorePackage ... " + fqcn);
            return;
        }

        if (ignoreClassRegexList.stream().anyMatch(regex -> className.matches(regex))) {
            logger.debug("#skip ignoreClassRegex ... " + className);
            return;
        }

        if (ignoreFqcnRegexList.stream().anyMatch(regex -> fqcn.matches(regex))) {
            logger.debug("#skip ignoreFqcnRegex ... " + fqcn);
            return;
        }

        if (!isTargetClass(clazz)) {
            logger.debug("#skip !isTargetClass ... " + fqcn);
            return;
        }

        logger.debug("#check ... " + fqcn);

        validate(srcFile, clazz).ifPresent(detail -> {
            throwException(clazz, detail);
        });

        if (!isValidateInnerClass()) {
            return;
        }

        // インナークラスもチェック
        for (Class<?> innerClass : clazz.getDeclaredClasses()) {
            handle(srcFile, innerClass);
        }
    }

    protected boolean isValidateInnerClass() {
        return false;
    }

    public abstract Optional<String> validate(File srcFile, Class<?> clazz);

    // 対象にするクラスを制限する。（外からは書き換えられない内部用）
    protected boolean isTargetClass(Class<?> clazz) {
        return true;
    }

    /**
     * 除外するクラスを指定します。
     * @param classes 除外するクラス
     * */
    @SuppressWarnings("unchecked")
    public T setIgnoreClass(Class<?>... classes) {
        if (!ignoreClassList.isEmpty()) {
            throw new IllegalStateException(getClass().getSimpleName() + "#setIgnoreClass は既に設定されています。複数設定必要な場合は可変長引数で渡してください。");
        }

        ignoreClassList = Arrays.asList(classes);
        return (T) this;
    }

    /**
     * クラス名に対して除外するパターンを正規表現で指定します。
     * @param classes 除外パターンの正規表現
     * e.g. "PlazaLoginAssist" に対して ".*LoginAssist$" (classes)
     * */
    @SuppressWarnings("unchecked")
    public T setIgnoreClassRegex(String... classes) {
        if (!ignoreClassRegexList.isEmpty()) {
            throw new IllegalStateException(getClass().getSimpleName() + "#setIgnoreClassRegex は既に設定されています。複数設定必要な場合は可変長引数で渡してください。");
        }

        ignoreClassRegexList = Arrays.asList(classes);
        return (T) this;
    }

    /**
     * パッケージ名に対して除外するパターンを前方一致で指定します。
     * @param packages 除外パターン(前方一致させる部分）
     * e.g. "org.lastaflute.web" に対して "org.lasta" (packages)
     * */
    @SuppressWarnings("unchecked")
    public T setIgnorePackage(String... packages) {
        if (!ignorePackageList.isEmpty()) {
            throw new IllegalStateException(getClass().getSimpleName() + "#setIgnorePackageList は既に設定されています。複数設定必要な場合は可変長引数で渡してください。");
        }

        ignorePackageList = Arrays.asList(packages);
        return (T) this;
    }

    /**
     * FQCN に対して除外するパターンを正規表現で指定します。
     * @param fqcn 除外パターンの正規表現
     * e.g. "org.lastaflute.web.LastaAction" に対して "org\\..*Action" (fqcn)
     * */
    @SuppressWarnings("unchecked")
    public T setIgnoreRegexFqcn(String... fqcn) {
        if (!ignoreFqcnRegexList.isEmpty()) {
            throw new IllegalStateException(getClass().getSimpleName() + "#setIgnoreRegexFqcn は既に設定されています。複数設定必要な場合は可変長引数で渡してください。");
        }

        ignoreFqcnRegexList = Arrays.asList(fqcn);
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T debugMode(boolean debugMode) {
        this.debugMode = debugMode;
        return (T) this;
    }

    // ===================================================================================
    //                                                                           Exception
    //                                                                           =========
    protected void throwException(Class<?> clazz, String detail) {
        if (debugMode) {
            logger.debug("[{}] class:{}, detail:{}", getClass().getSimpleName(), clazz.getName(), detail);
            return;
        }

        final ExceptionMessageBuilder br = new ExceptionMessageBuilder();
        br.addNotice(getExceptionNotice());
        br.addItem("Class");
        br.addElement(clazz.getName());
        br.addItem("Detail");
        br.addElement(detail);
        addExceptionElement(br);
        final String msg = br.buildExceptionMessage();
        throw new IllegalStateException(msg);
    }

    protected String getExceptionNotice() {
        return getClass().getName();
    }

    protected void addExceptionElement(ExceptionMessageBuilder br) {
    }
}