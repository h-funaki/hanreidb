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
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

/**
 * Action メソッド (MappingToContent) のチェック。
 * @author awane
 */
public class ActionMethodMappingToContentPolice extends AbstractJavaParserPolice<ActionMethodMappingToContentPolice> {

    protected boolean isTargetMethod(MethodDeclaration methodDeclaration) {
        return "mappingToContent".equals(methodDeclaration.getNameAsString());
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

            public void visit(final MethodCallExpr methodCallExpr, final Void v) {
                if (targetMethod) {
                    // TODO mito select の使用を禁止する。selectだけでいいか。現状たとおそらく不完全です。 bhvやlogicやassistの利用自体は? by awane (2017/02/24)
                    if (methodCallExpr.getNameAsString().startsWith("select")) {
                        methodCallExpr.getScope().filter(sco -> sco.toString().endsWith("Bhv")).ifPresent(sco -> {
                            String detail = String.format("Line %d: %s", methodCallExpr.getBegin().map(begin -> begin.line).orElse(0),
                                    methodCallExpr);
                            errorList.add(detail);
                        });

                    }
                }
                super.visit(methodCallExpr, v);
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
        return "mappingToContent 内で select している処理が見つかりました。";
    }

    @Override
    protected void addExceptionElement(ExceptionMessageBuilder br) {
        // TODO mito もっと細かく例を書く (2017/02/24)
        br.addItem("Advice");
        br.addElement("mappingToContent は結果のみを渡してください。");
        br.addElement("結果が複雑な場合は、結果を集約するクラスを作成し、渡してください。");
    }
}
