/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.unit.police;

import java.io.File;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.dbflute.helper.message.ExceptionMessageBuilder;
import org.dbflute.util.DfCollectionUtil;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

/**
 * Optional(OptionalThing).orElse(method()) を禁止する。
 * @author mito
 */
public class OrElseMethodPolice extends AbstractJavaParserPolice<OrElseMethodPolice> {

    @Override
    protected Optional<String> validate(File srcFile, Class<?> clazz, CompilationUnit compilationUnit) {
        List<String> errorList = DfCollectionUtil.newArrayList();

        VoidVisitorAdapter<Void> adapter = new VoidVisitorAdapter<Void>() {
            @Override
            public void visit(MethodCallExpr methodCall, Void arg) {
                if ("orElse".equals(methodCall.getNameAsString())) {
                    if (methodCall.getArgument(0) instanceof MethodCallExpr) {
                        String detail = String.format("Line %d: %s", methodCall.getBegin().map(begin -> begin.line).orElse(0),
                                methodCall.toString());
                        errorList.add(detail);
                    }
                }

                super.visit(methodCall, arg);
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
        return "orElse にメソッドが指定されています。";
    }

    @Override
    protected void addExceptionElement(ExceptionMessageBuilder br) {
        br.addItem("Advice");
        br.addElement("For example(not primitive type):");
        br.addElement("  (x):");
        br.addElement("    Optional.orElse(method())");
        br.addElement("    OptionalThing.orElse(method())");
        br.addElement("  (o):");
        br.addElement("    Optional.orElse(123)");
        br.addElement("    Optional.orElseGet(() -> method())");
        br.addElement("    OptionalThing.orElseGet(() -> method())");
    }
}
