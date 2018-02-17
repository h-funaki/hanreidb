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
import org.lastaflute.web.Execute;
import org.lastaflute.web.LastaAction;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

/**
 * Action の Execute メソッドで http method の指定を強制します。
 * @author mito
 */
public class ActionHttpMethodPolice extends AbstractJavaParserPolice<ActionHttpMethodPolice> {

    @Override
    protected Optional<String> validate(File srcFile, Class<?> clazz, CompilationUnit compilationUnit) {
        if (!LastaAction.class.isAssignableFrom(clazz)) {
            return Optional.empty();
        }

        List<String> errorList = newArrayList();
        VoidVisitorAdapter<Void> adapter = new VoidVisitorAdapter<Void>() {
            public void visit(final MethodDeclaration methodDeclaration, final Void v) {
                if (methodDeclaration.getAnnotationByClass(Execute.class).isPresent()) {
                    String methodName = methodDeclaration.getNameAsString();
                    if (!methodName.startsWith("get$") //
                            && !methodName.startsWith("post$") //
                            && !methodName.startsWith("put$") //
                            && !methodName.startsWith("delete$") //
                            && !methodName.startsWith("patch$") //
                    ) {
                        errorList.add(methodDeclaration.toString());
                    }
                }
                super.visit(methodDeclaration, v);
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
        return "Action の @Execute メソッドは http method の指定が必須です。";
    }

    @Override
    protected void addExceptionElement(ExceptionMessageBuilder br) {
        br.addItem("Advice");
        br.addElement("For example:");
        br.addElement("  (x):");
        br.addElement("    @Execute");
        br.addElement("    public JsonResponse<WholeResult<SakuhinListContentResult>> index(SakuhinListForm form) {");
        br.addElement("  (o):");
        br.addElement("    @Execute");
        br.addElement("    public JsonResponse<WholeResult<SakuhinListContentResult>> get$index(SakuhinListForm form) {");
        br.addElement("");
        br.addElement("    @Execute");
        br.addElement("    public JsonResponse<WholeResult<SakuhinAddResult>> post$index(SakuhinAddForm form) {");
    }
}