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
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

/**
 * CDef クラスを使っているところで、CDef. を省略して宣言してる箇所を捕まえる。
 * @author mito
 */
public class DeclareCDefPolice extends AbstractJavaParserPolice<DeclareCDefPolice> {

    protected List<String> importList = newArrayList();

    @Override
    protected Optional<String> validate(File srcFile, Class<?> clazz, CompilationUnit compilationUnit) {
        VoidVisitorAdapter<Void> adapter = new VoidVisitorAdapter<Void>() {
            @Override
            public void visit(ImportDeclaration impportDeclare, Void arg) {
                importList.add(impportDeclare.getNameAsString()); // 後で使うので import 文を記録しておく。
                super.visit(impportDeclare, arg);
            }
        };
        adapter.visit(compilationUnit, null);

        // visit だと全部やると大変な事になるので、行数は取れないけど import でチェックする。
        // http://static.javadoc.io/com.github.javaparser/javaparser-core/3.0.1/com/github/javaparser/ast/visitor/VoidVisitorAdapter.html
        List<String> importNgList = importList.stream().filter(importDecralre -> importDecralre.contains("CDef.")).map(declare -> {
            return String.format("import 文に %s を発見しました。 省略指定している箇所があります。", declare);
        }).collect(Collectors.toList());
        if (importNgList.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(importNgList.stream().collect(Collectors.joining(System.lineSeparator())));
    }

    // 省略された CDef 型の場合 true
    protected boolean isOmittedCdefType(String typeName) {
        if (typeName.contains("CDef.")) {
            return false; // 宣言に CDef が含まれていればもうチェック不要。 e.g. CDef.Status, AppCdef.Status
        }

        // その型が CDef を省略した CDef 型の型であれば true
        return importList.stream().anyMatch(importSentence -> {
            return importSentence.contains("CDef." + typeName); // 型名が import のところで CDef. が前に入っていればそれは CDef 系とみなす。
        });
    }

    @Override
    protected String getExceptionNotice() {
        return "(Xxx)CDef. を省略してはいけません。";
    }

    @Override
    protected void addExceptionElement(ExceptionMessageBuilder br) {
        br.addItem("Advice");
        br.addElement("For example:");
        br.addElement("  (x):");
        br.addElement("    public void xxx(Operation operation)");
        br.addElement("    ");
        br.addElement("    if(xxx == MemberStatus.Formalized)");
        br.addElement("  (o):");
        br.addElement("    public void xxx(CDef.Operation operation)");
        br.addElement("    ");
        br.addElement("    if(xxx == AppCDef.MemberStatus.Formalized)");
    }
}
