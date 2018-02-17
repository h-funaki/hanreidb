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
import org.dbflute.utflute.core.policestory.pjresource.PoliceStoryProjectResourceHandler;
import org.dbflute.util.Srl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Resourceポリスの土台用。
 * @author mito
 */
public abstract class AbstractProjectResourcePolice<T extends AbstractProjectResourcePolice<T>>
        implements PoliceStoryProjectResourceHandler {
    private static final Logger logger = LoggerFactory.getLogger(AbstractProjectResourcePolice.class);

    // 除外するパス（正規表現）
    protected List<String> ignorePathRegexList = newArrayList();

    @Override
    public void handle(File resourceFile) {
        String fileName = resourceFile.getName();

        if (!isTargetExt(fileName)) {
            //logger.debug("#skip !isTargetExt ... " + fileName); // 多すぎるので出さないほうがいいかも
            return;
        }

        String path = Srl.replace(resourceFile.getAbsolutePath(), "\\", "/");

        if (ignorePathRegexList.stream().anyMatch(regex -> path.matches(regex))) {
            logger.debug("#skip ignorePathRegexList ... " + path);
            return;
        }

        logger.debug("#check ... " + path);

        validate(resourceFile).ifPresent(detail -> {
            throwException(resourceFile, detail);
        });
    }

    protected boolean isTargetExt(String fileName) {
        return true;
    }

    public abstract Optional<String> validate(File resourceFile);

    /**
     * 対象ファイルのパスに対して除外するパターンを正規表現で指定します。
     * パス区切り文字は OS にかかわらず / で指定してください。
     *
     * @param paths 除外パターンの正規表現
     * e.g. "/path/to/ignore" に対して "/to/ignore" (paths)
     * */
    @SuppressWarnings("unchecked")
    public T setIgnorePathRegex(String... paths) {
        if (!ignorePathRegexList.isEmpty()) {
            throw new IllegalStateException(getClass().getSimpleName() + "#setIgnorePathRegex は既に設定されています。複数設定必要な場合は可変長引数で渡してください。");
        }

        ignorePathRegexList = Arrays.asList(paths);
        return (T) this;
    }

    // ===================================================================================
    //                                                                           Exception
    //                                                                           =========
    protected void throwException(File resourceFile, String detail) {
        final ExceptionMessageBuilder br = new ExceptionMessageBuilder();
        br.addNotice(getExceptionNotice());
        br.addItem("File");
        br.addElement(resourceFile.getAbsolutePath());
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
