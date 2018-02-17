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
import com.github.javaparser.ast.expr.LambdaExpr;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

/**
 * Optional(OptionalThing).orElseThrow(() -> new Exception()) で return の無いパターンを抽出する。
 *
 * TODO mito orElseThrow だけではなく、 supplier や function を受け取るメソッド全般に言えるんだけど、
 * 容易に抽出できなかったのでメジャーなこのパターンだけ適用する。 (2017/08/04)
 *
 * @author mito
 */
public class OrElseThrowMethodPolice extends AbstractJavaParserPolice<OrElseThrowMethodPolice> {

    @Override
    protected Optional<String> validate(File srcFile, Class<?> clazz, CompilationUnit compilationUnit) {
        List<String> errorList = DfCollectionUtil.newArrayList();

        VoidVisitorAdapter<Void> adapter = new VoidVisitorAdapter<Void>() {
            @Override
            public void visit(MethodCallExpr methodCall, Void arg) {
                if ("orElseThrow".equals(methodCall.getNameAsString()) || "orElseTranslatingThrow".equals(methodCall.getNameAsString()) // orElseThrow メソッドで値が lambda だった場合
                        && methodCall.getArgument(0) instanceof LambdaExpr) { // methodCall.getChildNodes() でメソッドを読んでるクラスが何かはわかる。
                    LambdaExpr lambda = (LambdaExpr) methodCall.getArgument(0);

                    // 一行ラムダの場合は return が必要ないので、 { があるかどうかで一行ラムダかを判定してる
                    String lambdaValue = lambda.toString();
                    if (lambdaValue.contains("{") && !lambdaValue.contains("return")) {
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
        return "orElseThrow は return が必要です。\nthrow new ... しちゃってませんか？";
    }

    @Override
    protected void addExceptionElement(ExceptionMessageBuilder br) {
        br.addItem("Advice");
        br.addElement("For example(not primitive type):");
        br.addElement("  (x):");
        br.addElement("    Optional.orElseThrow(() -> {");
        br.addElement("        throw new IllegalStateException();");
        br.addElement("    }");
        br.addElement("    OptionalThing.orElseThrow(() -> {");
        br.addElement("        throw new IllegalStateException();");
        br.addElement("    }");
        br.addElement("  (o):");
        br.addElement("    Optional.orElseThrow(() -> {");
        br.addElement("        return new IllegalStateException();");
        br.addElement("    }");
        br.addElement("    OptionalThing.orElseThrow(() -> {");
        br.addElement("        return new IllegalStateException();");
        br.addElement("    }");

    }
}
