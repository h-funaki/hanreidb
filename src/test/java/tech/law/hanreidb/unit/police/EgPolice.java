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
import org.lastaflute.web.Execute;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.github.javaparser.javadoc.JavadocBlockTag;

/**
 * e.g. が含まれている事をチェックする。
 *
 * 対象
 * o Action 内 Execute メソッドのURLパラメータコメント
 * o Form まは Body のフィールド
 * o ContentResult のフィールド
 *
 * @author mito
 */
public class EgPolice extends AbstractJavaParserPolice<EgPolice> {

    @Override
    protected boolean isTargetClass(Class<?> clazz) {
        String name = clazz.getSimpleName();

        if (name.endsWith("BaseAction") || name.endsWith("SwaggerAction")) {
            // 特殊クラスなので除外
            return false;
        }

        // 特殊じゃないやつら
        return name.endsWith("Action") || name.endsWith("Form") || name.endsWith("Body") || name.endsWith("ContentResult");
    }

    @Override
    protected Optional<String> validate(File srcFile, Class<?> clazz, CompilationUnit compilationUnit) {
        List<String> errorList = DfCollectionUtil.newArrayList();

        VoidVisitorAdapter<Void> adapter = new VoidVisitorAdapter<Void>() {
            @Override
            public void visit(FieldDeclaration declare, Void arg) {
                if (isActionClass(clazz)) {
                    super.visit(declare, arg);
                    return; // Action はフィールドチェックしない。
                }

                VariableDeclarator variable =
                        declare.getChildNodes().stream().filter(child -> child instanceof VariableDeclarator).map(child -> {
                            return ((VariableDeclarator) child);
                        }).findFirst().get();
                if (variable.getName().toString().endsWith("_list") || variable.getType().toString().contains("List<")) {
                    // _list で終わるフィールドは対象外
                    super.visit(declare, arg);
                    return;
                }

                boolean isPartClass = declare.getVariables().stream().anyMatch(val -> val.getType().asString().endsWith("Part"));
                if (isPartClass) {
                    // part クラスなので除外
                    super.visit(declare, arg);
                    return;
                }

                declare.getJavadoc().ifPresent(doc -> {
                    if (!doc.toString().contains("e.g.")) { // e.g. が含まれているか
                        String detail = String.format("Line %d: %s %s", declare.getBegin().map(begin -> begin.line).orElse(0),
                                variable.getName(), doc.getDescription().toText());
                        errorList.add(detail);
                    }
                });

                super.visit(declare, arg);
            }

            @Override
            public void visit(MethodDeclaration declare, Void arg) {
                if (!declare.getAnnotationByClass(Execute.class).isPresent()) { // Execute メソッドじゃなければ用はない。
                    super.visit(declare, arg);
                    return;
                }

                // Action の Execute メソッドの Param に e.g. がついてるかを調べる。
                declare.getJavadoc()
                        .get() // Execute メソッドに JavaDoc ついてないのはそもそも警告になるので、つっきる。
                        .getBlockTags()
                        .stream()
                        .filter(block -> block.getType() == JavadocBlockTag.Type.PARAM)
                        .forEach(block -> {
                            String paramName = block.getName().get(); // param に name が無いのはそもそも警告でるのでここも強行する。
                            if (paramName.equals("form") || paramName.equals("body")) {
                                return; // form や body には e.g. 書かない。（そっちのクラスフィールドに書いてある）
                            }

                            if (!block.getContent().toText().contains("e.g.")) {
                                String detail = String.format("Line %d行目付近のURLパラメータ: %s",
                                        declare.getBegin().map(begin -> begin.line).orElse(0), paramName);
                                errorList.add(detail);
                            }
                        });

                super.visit(declare, arg);
            }
        };

        adapter.visit(compilationUnit, null);
        if (errorList.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(errorList.stream().collect(Collectors.joining(System.lineSeparator())));
    }

    private boolean isActionClass(Class<?> clazz) {
        return clazz.getSimpleName().endsWith("Action");
    }

    @Override
    protected String getExceptionNotice() {
        return "JavaDoc に e.g. が含まれていません。\n以下の JavaDoc 内には e.g. が必須です。\n o Action 内 Execute メソッドのURLパラメータコメント\n o Form まは Body のフィールド\n o ContentResult のフィールド";
    }

    @Override
    protected void addExceptionElement(ExceptionMessageBuilder br) {
        br.addItem("Advice");
        br.addElement("  (x):");
        br.addElement("    ");
        br.addElement("    /** 郵便番号。 */");
        br.addElement("    public String zip_code;");
        br.addElement("    ");
        br.addElement("    * @param memberId 会員ID");
        br.addElement("    ");
        br.addElement("  (o):");
        br.addElement("    ");
        br.addElement("    /** 郵便番号。 e.g. 110-0015 */");
        br.addElement("    public String zip_code;");
        br.addElement("    ");
        br.addElement("    * @param memberId 会員ID e.g. 125");
    }
}
