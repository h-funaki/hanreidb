/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.unit.police;

import java.io.File;
import java.util.Optional;

import org.dbflute.helper.message.ExceptionMessageBuilder;

import tech.law.hanreidb.unit.NxWebTestCase;

/**
 * Job のテストケースで継承してはいけない継承（Web 用のテストケースなど）を使っていたら逮捕。
 * @author mito
 */
public class JobTestExtendsPolice extends AbstractJavaPolice<JobTestExtendsPolice> {

    @Override
    public boolean containsTestClass() {
        return true;
    }

    @Override
    protected boolean isTargetClass(Class<?> clazz) {
        return clazz.getSimpleName().endsWith("JobTest");
    }

    @Override
    public Optional<String> validate(File srcFile, Class<?> clazz) {
        if (NxWebTestCase.class.isAssignableFrom(clazz)) {
            return Optional.of("JobTest が NxWebTestCase 系になっています。");
        }

        return Optional.empty();
    }

    @Override
    protected String getExceptionNotice() {
        return "Job のテストケースは、当該サブプロジェクトに用意されている, UnitXxxJobTestCase を継承してください。";
    }

    @Override
    protected void addExceptionElement(ExceptionMessageBuilder br) {
        br.addItem("Advice");
        br.addElement("For example:");
        br.addElement("  (x):");
        br.addElement("    SmallJobTest extends UnitBatchWebTestCase");
        br.addElement("  (o):");
        br.addElement("    SmallJobTest extends UnitBatchJobTestCase");
    }
}
