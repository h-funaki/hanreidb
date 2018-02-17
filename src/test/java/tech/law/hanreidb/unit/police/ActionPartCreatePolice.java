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
import org.lastaflute.web.LastaAction;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

/**
 * Action クラス内での Part の作成をチェックします。
 * Part の作成は mappingToContent または convertToXxxPart のみ許可されます。
 *
 * @author mito
 */
public class ActionPartCreatePolice extends AbstractJavaParserPolice<ActionPartCreatePolice> {

    protected boolean isTargetMethod(MethodDeclaration methodDeclaration) {
        String methodName = methodDeclaration.getNameAsString();

        return !("mappingToContent".equals(methodName)
                || (methodName.startsWith("convertTo") || methodName.startsWith("create")) && methodName.endsWith("Part"));
    }

    @Override
    protected Optional<String> validate(File srcFile, Class<?> clazz, CompilationUnit compilationUnit) {
        if (!LastaAction.class.isAssignableFrom(clazz)) {
            return Optional.empty();
        }

        List<String> errorList = newArrayList();
        VoidVisitorAdapter<Void> adapter = new VoidVisitorAdapter<Void>() {
            boolean targetMethod = false;

            public void visit(final MethodDeclaration methodDeclaration, final Void v) {
                targetMethod = isTargetMethod(methodDeclaration);
                super.visit(methodDeclaration, v);
            }

            @Override
            public void visit(ObjectCreationExpr objectExpr, Void arg) {
                if (targetMethod) {
                    String objectName = objectExpr.getType().getNameAsString();
                    if (!objectName.startsWith("Remote") && objectName.endsWith("Part")) {
                        String detail = String.format("Line %d: %s", objectExpr.getBegin().map(begin -> begin.line).orElse(0), objectExpr);
                        errorList.add(detail);
                    }
                }
                super.visit(objectExpr, arg);
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
        return "mappingToContent 以前に Part を作成してはいけません。\nまた、Part を作成するメソッド名は [convertTo|create]${任意の文字列}Part にマッチする命名にして下さい。\nPartList のように List を受け渡しするメソッドも許可されません。";
    }

    @Override
    protected void addExceptionElement(ExceptionMessageBuilder br) {
        br.addItem("Advice");
        br.addElement("For example:");
        br.addElement("  (x):");
        br.addElement("    public void index() {");
        br.addElement("        XxxPart part = new XxxPart();");
        br.addElement("        // ... ");
        br.addElement("    }");
        br.addElement("  (o):");
        br.addElement("    private XxxContentResult mappingToContent() {");
        br.addElement("        XxxPart part = new XxxPart();");
        br.addElement("        // ... ");
        br.addElement("    }");
        br.addElement("    ");
        br.addElement("    private XxxContentResult mappingToContent() {");
        br.addElement("        XxxPart part = convertToXxxPart();");
        br.addElement("        // ... ");
        br.addElement("    }");
        br.addElement("    private XxxPart convertToXxxPart() {");
        br.addElement("        XxxPart part = convertToXxxPart();");
        br.addElement("        return part;");
        br.addElement("    }");
    }
}
