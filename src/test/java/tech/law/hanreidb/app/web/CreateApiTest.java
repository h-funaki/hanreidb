package tech.law.hanreidb.app.web;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.info.ColumnInfo;

import tech.law.hanreidb.dbflute.exentity.Judgement;
import tech.law.hanreidb.unit.UnitHanreidbTestCase;

public class CreateApiTest extends UnitHanreidbTestCase {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** path e.g. aaa/bbb/ccc */
    public final String PATH = "judgement/get";

    private final boolean REAL_EXECUTE = false;

    /** base table column info e.g. JUDGEMENT */
    private AbstractEntity entity = new Judgement();

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
        String actionClassName = getActionClassName();
        String bodyClassName = getBodyClassName();
        String resultClassName = getContentResultClassName();
        String actionTestClassName = getActionTestClassName();

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
        actionLines.add("    @Resource");
        actionLines.add("    private " + getBehaviorName() + getEntityFieldName() + ";");
        actionLines.add("");
        actionLines.add("    // ===================================================================================");
        actionLines.add("    //                                                                             Execute");
        actionLines.add("    //                                                                             =======");
        actionLines.add("    @Execute");
        actionLines.add("    public JsonResponse<" + resultClassName + "> index(" + bodyClassName + " body) {");
        actionLines.add("        return asJson(mappingToContent());");
        actionLines.add("    }");
        actionLines.add("");
        actionLines.add("    // ===================================================================================");
        actionLines.add("    //                                                                              Select");
        actionLines.add("    //                                                                              ======");
        actionLines.add("    private ImmutableList<" + getEntityName() + ">" + " select" + getEntityName() + "List() {");
        actionLines.add("    return toImmutable(" + getBehaviorFieldName() + ".selectList(cb ->{");
        getBaseTableColumnInfo().forEach(column -> {
            actionLines.add("        cb.specify().column" + column + "();");
        });
        actionLines.add("    });");
        actionLines.add("    }");
        actionLines.add("");
        actionLines.add("    // ===================================================================================");
        actionLines.add("    //                                                                             Mapping");
        actionLines.add("    //                                                                             =======");
        actionLines.add("    private " + resultClassName + " mappingToContent(" + getEntityName() + getEntityFieldName() + ") {");
        addMappings(actionLines);
        actionLines.add("    ");
        actionLines.add("    }");
        actionLines.add("");
        actionLines.add("}");
        write(actionClassFile, actionLines);

        // body class
        List<String> bodyLines = newArrayList();
        addPackage(bodyLines);
        addAuthor(bodyLines);
        bodyLines.add("public class " + bodyClassName + " {");
        bodyLines.add("    ");
        addFields(bodyLines);
        bodyLines.add("}");
        write(bodyClassFile, bodyLines);

        // content result class file
        List<String> resultLines = newArrayList();
        addPackage(resultLines);
        addAuthor(resultLines);
        resultLines.add("public class " + resultClassName + " {");
        resultLines.add("    ");
        addFields(resultLines);
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

    // -----------------------------------------------------
    //                                               書く処理
    //                                               -------
    private void write(File file, List<String> lines) throws IOException {
        try {
            FileUtils.writeLines(file, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // -----------------------------------------------------
    //                                                共通部分
    //                                                ------
    private void addPackage(List<String> lines) {
        lines.add("package tech.law.hanreidb.app.web" + pathToPackage(PATH) + ";");
    }

    private void addAuthor(List<String> lines) {
        lines.add("");
        lines.add("/**");
        lines.add(" * @author h-funaki");
        lines.add(" */");
    }

    private void addFields(List<String> lines) {
        getBaseTableColumnInfo().forEach(column -> {
            if (column.isNotNull()) {
                lines.add("    /** " + column.getColumnAlias() + " e.g. " + column.getColumnComment() + " */");
                lines.add("    @Required");
            } else {
                lines.add("    /** " + column.getColumnAlias() + " e.g. " + column.getColumnComment() + " (NullAllowed)*/");
            }
            lines.add("    public " + getFieldName(column.getColumnSqlName().toString()) + " "
                    + column.getColumnSqlName().toString().toLowerCase() + ";");
            lines.add("    ");
        });
    }

    private void addMappings(List<String> lines) {
        lines.add("    " + getContentResultClassName() + "content = new " + getContentResultClassName() + "();");
        getBaseTableColumnInfo().forEach(column -> {
            lines.add("        content." + column.getColumnSqlName().toString().toLowerCase() + " = " + getEntityFieldName() + "."
                    + getGetterName(column.getColumnSqlName().toString()) + ";");
            lines.add("    ");
        });
        lines.add("    return content;");
    }

    // ===================================================================================
    //                                                                        Assist Tests
    //                                                                        ============
    public void test_something() throws Exception {
        List<String> lines = newArrayList();
        addMappings(lines);
        lines.forEach(line -> {
            log(line);
        });
    }

    // ===================================================================================
    //                                                                        Small Helper
    //                                                                        ============
    /**
     * Entity => column info
     * @return column info (NotNull)
     */
    private List<ColumnInfo> getBaseTableColumnInfo() {
        return entity.asDBMeta().getColumnInfoList();
    }

    /**
     * @return e.g. Judgement (NotNull)
     */
    private String getEntityName() {
        return entity.asDBMeta().getEntityTypeName().replace("tech.law.hanreidb.dbflute.exentity.", "");
    }

    /**
     * @return e.g. judgement (NotNull)
     */
    private String getEntityFieldName() {
        return getFieldName(getEntityName());
    }

    /**
     * @return JUDGEMENT_ID -> judgementId
     */
    private String getCamelName(String snake_name) {
        String field = "";
        String[] words = snake_name.split("_");
        for (int i = 0; i < words.length; i++) {
            if (i == 0) {
                field = words[i].toLowerCase();
            } else {
                field = field + words[i].substring(0, 1) + words[i].substring(1).toLowerCase();
            }
        }
        return field;
    }

    /**
     * getJudgementId()
     */
    private String getGetterName(String column_snake_name) {
        return getCamelName("GET_" + column_snake_name) + "()";
    }

    // -----------------------------------------------------
    //                                         Behavior名取得
    //                                         -------------
    /**
     * @return e.g. JudgementBhv (NotNull)
     */
    private String getBehaviorName() {
        return getEntityName() + "Bhv";
    }

    /**
     * @return e.g. judgementBhv (NotNull)
     */
    private String getBehaviorFieldName() {
        return getFieldName(getBehaviorName());
    }

    // -----------------------------------------------------
    //                                            フィールド名
    //                                            ----------
    /**
     * @return e.g. JudgementId -> judgementId (NotNull)
     */
    private String getFieldName(String string) {
        return string.substring(0, 1).toLowerCase() + string.substring(1);
    }

    // -----------------------------------------------------
    //                                          package名取得
    //                                          ------------
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

    // -----------------------------------------------------
    //                                            クラス名取得
    //                                            ----------
    /**
     * @param path e.g. aaa/bbb/ccc (NotNull)
     * @return class name e.g. AaaBbbCcc (NotNull)
     */
    private String pathToClassName(String path) {
        String className = "";
        String[] split = path.split("/");
        for (String string : split) {
            className = className + string.substring(0, 1).toUpperCase() + string.substring(1);
        }
        return className;
    }

    private String getClassName() {
        return pathToClassName(PATH);
    }

    private String getActionClassName() {
        return getClassName() + "Action";
    }

    private String getBodyClassName() {
        return getClassName() + "Body";
    }

    private String getContentResultClassName() {
        return getClassName() + "ContentResult";
    }

    private String getActionTestClassName() {
        return getClassName() + "ActionTest";
    }
}
