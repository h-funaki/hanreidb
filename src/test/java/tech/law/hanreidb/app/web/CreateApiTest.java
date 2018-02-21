package tech.law.hanreidb.app.web;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

import tech.law.hanreidb.unit.UnitHanreidbTestCase;

public class CreateApiTest extends UnitHanreidbTestCase {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** path e.g. aaa/bbb/ccc */
    public final String PATH = "judgement/favorite/put";

    private final boolean REAL_EXECUTE = false;

    /** base table e.g. JUDGEMENT */
    public final String BASE_TABLE = "";

    // ===================================================================================
    //                                                                        Create Files
    //                                                                        ============
    public void test_createApi() throws IOException {
        if (!REAL_EXECUTE) {
            log("APIクラスを作成せずに終了しました。");
            return;
        }
        // path
        String fileMainPath = "/Users/h-funaki/Documents/hanreidb/src/main/java/tech/law/hanreidb/app/web/" + PATH + "/";
        String fileTestPath = "/Users/h-funaki/Documents/hanreidb/src/test/java/tech/law/hanreidb/app/web/" + PATH + "/";

        File fileMainDir = new File(fileMainPath);
        File fileTestDir = new File(fileTestPath);

        // 不要なテストで落ちないように
        if (fileMainDir.mkdirs()) {
            log("ディレクトリの作成に成功しました");
        } else {
            log("ディレクトリの作成に失敗しました");
            return;
        }

        if (fileTestDir.mkdirs()) {
            log("ディレクトリの作成に成功しました");
        } else {
            log("ディレクトリの作成に失敗しました");
            return;
        }

        // class name
        String className = pathToClass(PATH);
        String actionClassName = className + "Action";
        String bodyClassName = className + "Body";
        String resultClassName = className + "ContentResult";
        String actionTestClassName = className + "TestAction";

        //  files
        File actionClassFile = new File(fileMainPath + actionClassName + ".java");
        File bodyClassFile = new File(fileMainPath + bodyClassName + ".java");
        File contentResultClassFile = new File(fileMainPath + resultClassName + ".java");
        File actionTestClassFile = new File(fileTestPath + actionTestClassName + ".java");

        // action class file
        List<String> actionLines = newArrayList();
        addPackage(actionLines);
        actionLines.add("");
        actionLines.add("import org.lastaflute.web.Execute;");
        actionLines.add("import org.lastaflute.web.response.JsonResponse;");
        actionLines.add("");
        actionLines.add("import tech.law.hanreidb.HanreidbBaseAction;");
        actionLines.add("import org.slf4j.Logger;");
        actionLines.add("import org.slf4j.LoggerFactory;");
        addAuthor(actionLines);
        actionLines.add("public class " + actionClassName + " extends HanreidbBaseAction {");
        actionLines.add("");
        actionLines.add("        private static final Logger logger = LoggerFactory.getLogger(" + actionClassName + ".class);");
        actionLines.add("");
        actionLines.add("    // ===================================================================================");
        actionLines.add("    //                                                                           Attribute");
        actionLines.add("    //                                                                           =========");
        actionLines.add("");
        actionLines.add("    // ===================================================================================");
        actionLines.add("    //                                                                             Execute");
        actionLines.add("    //                                                                             =======");
        actionLines.add("    @Execute");
        actionLines.add("    public JsonResponse<" + resultClassName + "> index(" + bodyClassName + " body) {");
        actionLines.add("        return asJson(mappingToContent());");
        actionLines.add("    }");
        actionLines.add("}");
        write(actionClassFile, actionLines);

        // body class
        List<String> bodyLines = newArrayList();
        addPackage(bodyLines);
        addAuthor(bodyLines);
        bodyLines.add("public class " + bodyClassName + " {");
        bodyLines.add("    ");
        bodyLines.add("}");
        write(bodyClassFile, bodyLines);

        // content result class file
        List<String> resultLines = newArrayList();
        addPackage(resultLines);
        addAuthor(resultLines);
        resultLines.add("public class " + resultClassName + " {");
        resultLines.add("    ");
        resultLines.add("}");
        write(contentResultClassFile, resultLines);

        // test class file
        List<String> testLines = newArrayList();
        addPackage(testLines);
        testLines.add("");
        testLines.add("import tech.law.hanreidb.unit.UnitHanreidbTestCase;");
        addAuthor(testLines);
        testLines.add("public class " + actionTestClassName + " extends UnitHanreidbTestCase {");
        testLines.add("");
        testLines.add("    // ===================================================================================");
        testLines.add("    //                                                                           Attribute");
        testLines.add("    //                                                                           =========");
        testLines.add("    ");
        testLines.add("    // ===================================================================================");
        testLines.add("    //                                                                               正常系");
        testLines.add("    //                                                                               =====");
        testLines.add("    public void test_正常に登録されている() {");
        testLines.add("    // ## Arrange ##");
        testLines.add("    " + actionClassName + " action = new " + actionClassName + "();");
        testLines.add("    inject(action);");
        testLines.add("    ");
        testLines.add("    " + bodyClassName + " body = new " + bodyClassName + "();");
        testLines.add("    ");
        testLines.add("    // ## Act ##");
        testLines.add("    ");
        testLines.add("    // ## Assert ##");
        testLines.add("    ");
        testLines.add("    }");
        testLines.add("    // ===================================================================================");
        testLines.add("    //                                                                               異常系");
        testLines.add("    //                                                                               =====");
        testLines.add("}");
        write(actionTestClassFile, testLines);
    }

    private void write(File file, List<String> lines) throws IOException {
        try {
            FileUtils.writeLines(file, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addPackage(List<String> lines) {
        lines.add("package tech.law.hanreidb.app.web" + pathToPackage(PATH) + ";");
    }

    private void addAuthor(List<String> lines) {
        lines.add("");
        lines.add("/**");
        lines.add(" * @author h-funaki");
        lines.add(" */");
    }

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    /**
     * @param path e.g. aaa/bbb/ccc (NotNull)
     * @return class name e.g. AaaBbbCcc (NotNull)
     */
    private String pathToClass(String path) {
        String className = "";
        String[] split = path.split("/");
        for (String string : split) {
            className = className + string.substring(0, 1).toUpperCase() + string.substring(1);
        }
        return className;
    }

    /**
     * @param path e.g. aaa/bbb/ccc (NotNull)
     * @return package e.g. .aaa.bbb.ccc (NotNull)
     */
    private String pathToPackage(String path) {
        String packagePath = "";
        String[] split = path.split("/");
        for (String string : split) {
            packagePath = packagePath + "." + string;
        }
        return packagePath;
    }
}
