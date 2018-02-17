/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.unit.police;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.newArrayList;

import java.io.File;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.dbflute.helper.message.ExceptionMessageBuilder;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

/**
 * Form(Body) クラスのフィールドをチェックします。
 * @author mito
 */
public class FormFieldPolice extends AbstractJavaParserPolice<FormFieldPolice> {

    @Override
    protected boolean isTargetClass(Class<?> clazz) {
        return clazz.getName().endsWith("Form") || clazz.getName().endsWith("Body");
    }

    @Override
    protected Optional<String> validate(File srcFile, Class<?> clazz, CompilationUnit compilationUnit) {
        List<String> errorList = newArrayList();
        VoidVisitorAdapter<Void> adapter = new VoidVisitorAdapter<Void>() {
            @Override
            public void visit(FieldDeclaration fieldDeclaration, Void arg) {
                String typeName = fieldDeclaration.getElementType().toString();
                if (typeName.startsWith("List<")) {
                    String detail = String.format("Line %d: %s", fieldDeclaration.getBegin().map(begin -> begin.line).orElse(0), typeName);
                    errorList.add(detail);
                }
                super.visit(fieldDeclaration, arg);
            }
        };
        adapter.visit(compilationUnit, null);

        if (errorList.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(errorList.stream().collect(Collectors.joining(System.lineSeparator())));
    }

    @Override
    protected String getExceptionNotice() {
        return "Form の field に List は指定できません。";
    }

    @Override
    protected void addExceptionElement(ExceptionMessageBuilder br) {
        br.addItem("Advice");
        br.addElement("For example:");
        br.addElement("  (x):");
        br.addElement("    public List<String> sakuhin_code_list");
        br.addElement("  (o):");
        br.addElement("    public ImmutableList<String> sakuhin_code_list");
    }
}
