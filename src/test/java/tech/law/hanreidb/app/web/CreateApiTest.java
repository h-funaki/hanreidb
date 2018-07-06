package tech.law.hanreidb.app.web;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.newImmutableList;
import static tech.law.hanreidb.app.web.CreateApiTestAssist.addAuthor;
import static tech.law.hanreidb.app.web.CreateApiTestAssist.addFields;
import static tech.law.hanreidb.app.web.CreateApiTestAssist.addMappings;
import static tech.law.hanreidb.app.web.CreateApiTestAssist.addPackage;
import static tech.law.hanreidb.app.web.CreateApiTestAssist.getActionClassName;
import static tech.law.hanreidb.app.web.CreateApiTestAssist.getActionTestClassName;
import static tech.law.hanreidb.app.web.CreateApiTestAssist.getBaseTableColumnInfo;
import static tech.law.hanreidb.app.web.CreateApiTestAssist.getBehaviorFieldName;
import static tech.law.hanreidb.app.web.CreateApiTestAssist.getBehaviorName;
import static tech.law.hanreidb.app.web.CreateApiTestAssist.getBodyClassName;
import static tech.law.hanreidb.app.web.CreateApiTestAssist.getContentResultClassName;
import static tech.law.hanreidb.app.web.CreateApiTestAssist.getEntityFieldName;
import static tech.law.hanreidb.app.web.CreateApiTestAssist.getEntityName;
import static tech.law.hanreidb.app.web.CreateApiTestAssist.write;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.dbflute.dbmeta.AbstractEntity;
import org.eclipse.collections.api.list.ImmutableList;

import tech.law.hanreidb.dbflute.exentity.User;
import tech.law.hanreidb.unit.UnitHanreidbTestCase;

public class CreateApiTest extends UnitHanreidbTestCase {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** path e.g. aaa/bbb/ccc */
    public final static String PATH = "user/put";

    private final boolean REAL_EXECUTE = true;

    /** base table column info e.g. JUDGEMENT */
    static AbstractEntity BASE_ENTITY = new User();

    /** base table column info e.g. JUDGEMENT */
    public static ImmutableList<? extends AbstractEntity> ENTITY_LIST = newImmutableList();

    /** do you create body class? */
    private final boolean CREATE_BODY = true;

    /** do you create content result class? */
    private final boolean CREATE_RESULT = true;

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

        new File(fileMainPath).mkdirs();
        new File(fileTestPath).mkdirs();

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
        createAction(actionClassFile);

        // body class
        if (CREATE_BODY) {
            createBody(bodyClassFile);
        }

        // content result class file
        if (CREATE_RESULT) {
            createResult(contentResultClassFile);
        }

        // test class file
        createTest(actionTestClassFile);
    }

    private void createAction(File actionClassFile) throws IOException {
        List<String> actionLines = newArrayList();
        addPackage(actionLines);
        actionLines.add("");
        actionLines.add("import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.toImmutable;");
        actionLines.add("");
        actionLines.add("import javax.annotation.Resource;");
        actionLines.add("");
        actionLines.add("import org.eclipse.collections.api.list.ImmutableList;");
        actionLines.add("import org.lastaflute.web.Execute;");
        actionLines.add("import org.lastaflute.web.response.JsonResponse;");
        actionLines.add("");
        actionLines.add("import org.slf4j.Logger;");
        actionLines.add("import org.slf4j.LoggerFactory;");
        actionLines.add("");
        actionLines.add("import tech.law.hanreidb.app.base.HanreidbBaseAction;");
        actionLines.add("import tech.law.hanreidb.dbflute.exbhv." + getBehaviorName() + ";");
        actionLines.add("import tech.law.hanreidb.dbflute.exentity." + getEntityName() + ";");
        addAuthor(actionLines);
        actionLines.add("public class " + getActionClassName() + " extends HanreidbBaseAction {");
        actionLines.add("");

        actionLines.add("    // ===================================================================================");
        actionLines.add("    //                                                                          Definition");
        actionLines.add("    //                                                                          ==========");
        actionLines.add("        private static final Logger logger = LoggerFactory.getLogger(" + getActionClassName() + ".class);");
        actionLines.add("");
        actionLines.add("    // ===================================================================================");
        actionLines.add("    //                                                                           Attribute");
        actionLines.add("    //                                                                           =========");
        actionLines.add("    @Resource");
        actionLines.add("    private " + getBehaviorName() + " " + getEntityFieldName() + "Bhv;");
        actionLines.add("");
        actionLines.add("    // ===================================================================================");
        actionLines.add("    //                                                                             Execute");
        actionLines.add("    //                                                                             =======");
        actionLines.add("    @Execute");
        actionLines.add("    public JsonResponse<" + getContentResultClassName() + "> index(" + getBodyClassName() + " body) {");
        actionLines.add("        return asJson(mappingToContent());");
        actionLines.add("    }");
        actionLines.add("");
        actionLines.add("    // ===================================================================================");
        actionLines.add("    //                                                                              Select");
        actionLines.add("    //                                                                              ======");
        actionLines.add("    private ImmutableList<" + getEntityName() + ">" + " select" + getEntityName() + "List() {");
        actionLines.add("    return toImmutable(" + getBehaviorFieldName() + ".selectList(cb ->{");
        actionLines.add("        cb.specify().everyColumn();");
        getBaseTableColumnInfo().forEach(column -> {
            // actionLines.add("        cb.specify().column" + column + "();");
        });
        actionLines.add("    }));");
        actionLines.add("    }");
        actionLines.add("");
        actionLines.add("    // ===================================================================================");
        actionLines.add("    //                                                                             Mapping");
        actionLines.add("    //                                                                             =======");
        actionLines.add(
                "    private " + getContentResultClassName() + " mappingToContent(" + getEntityName() + " " + getEntityFieldName() + ") {");
        addMappings(actionLines);
        actionLines.add("    }");
        actionLines.add("");
        actionLines.add("}");
        write(actionClassFile, actionLines);
    }

    private void createBody(File bodyClassFile) throws IOException {
        List<String> bodyLines = newArrayList();
        addPackage(bodyLines);
        addAuthor(bodyLines);
        bodyLines.add("public class " + getBodyClassName() + " {");
        bodyLines.add("    ");
        addFields(bodyLines);
        bodyLines.add("}");
        write(bodyClassFile, bodyLines);
    }

    private void createResult(File bodyClassFile) throws IOException {
        List<String> bodyLines = newArrayList();
        addPackage(bodyLines);
        addAuthor(bodyLines);
        bodyLines.add("public class " + getContentResultClassName() + " {");
        bodyLines.add("    ");
        addFields(bodyLines);
        bodyLines.add("}");
        write(bodyClassFile, bodyLines);
    }

    private void createTest(File actionTestClassFile) throws IOException {
        List<String> testLines = newArrayList();
        addPackage(testLines);
        testLines.add("");
        testLines.add("import tech.law.hanreidb.unit.UnitHanreidbTestCase;");
        addAuthor(testLines);
        testLines.add("public class " + getActionTestClassName() + " extends UnitHanreidbTestCase {");
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
        testLines.add("    " + getActionClassName() + " action = new " + getActionClassName() + "();");
        testLines.add("    inject(action);");
        testLines.add("    ");
        testLines.add("    " + getBodyClassName() + " body = new " + getBodyClassName() + "();");
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
}
