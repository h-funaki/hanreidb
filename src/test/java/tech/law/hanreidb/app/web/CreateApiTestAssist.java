package tech.law.hanreidb.app.web;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.newArrayList;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.info.ColumnInfo;

public class CreateApiTestAssist {

    // -----------------------------------------------------
    //                                               書く処理
    //                                               -------
    public static void write(File file, List<String> lines) throws IOException {
        try {
            FileUtils.writeLines(file, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // -----------------------------------------------------
    //                                                共通部分
    //                                                ------
    public static void addPackage(List<String> lines) {
        lines.add("package tech.law.hanreidb.app.web" + getPackage() + ";");
    }

    /**
     * @param lines (NotNull)
     */
    public static void addAuthor(List<String> lines) {
        lines.add("");
        lines.add("/**");
        lines.add(" * @author h-funaki");
        lines.add(" */");
    }

    public static void addFields(List<String> lines) {
        List<ColumnInfo> columnList = newArrayList();
        getBaseTableColumnInfo().forEach(column -> {
            if (column.isNotNull()) {
                lines.add("    /** " + column.getColumnAlias() + " e.g. " + column.getColumnComment() + " */");
                lines.add("    @Required");
            } else {
                lines.add("    /** " + column.getColumnAlias() + " e.g. " + column.getColumnComment() + " (NullAllowed)*/");
            }
            lines.add("    public " + getJavaType(column) + " " + column.getColumnSqlName().toString().toLowerCase() + ";");
            lines.add("    ");
            columnList.add(column); // 同じ名前のフィールドを作らないようにするため
        });
        getRelatedTableColumnInfo().forEach(column -> {
            if (!columnList.contains(column)) {
                if (column.isNotNull()) {
                    lines.add("    /** " + column.getColumnAlias() + " e.g. " + column.getColumnComment() + " */");
                    lines.add("    @Required");
                } else {
                    lines.add("    /** " + column.getColumnAlias() + " e.g. " + column.getColumnComment() + " (NullAllowed)*/");
                }
                lines.add("    public " + getJavaType(column) + " " + column.getColumnSqlName().toString().toLowerCase() + ";");
                lines.add("    ");
            }
        });
    }

    public static void addMappings(List<String> lines) {
        List<ColumnInfo> columnList = newArrayList();
        lines.add("    " + getContentResultClassName() + " content = new " + getContentResultClassName() + "();");
        getBaseTableColumnInfo().forEach(column -> {
            lines.add("        content." + column.getColumnSqlName().toString().toLowerCase() + " = " + getEntityFieldName() + "."
                    + getGetterName(column.getColumnSqlName().toString()) + ";");
            lines.add("    ");
        });
        getRelatedTableColumnInfo().forEach(column -> {
            if (!columnList.contains(column)) {
                lines.add("        content." + column.getColumnSqlName().toString().toLowerCase() + " = " + getEntityFieldName() + "."
                        + getGetterName(column.getColumnSqlName().toString()) + ";");
                lines.add("    ");
            }
        });
        lines.add("    return content;");
    }

    // ===================================================================================
    //                                                                             Public
    //                                                                             =======
    /**
     * e.g. String, Long
     * @param column (NotNull)
     * @return java type (NotNull)
     */
    public static String getJavaType(ColumnInfo column) {
        String typeName = column.getPropertyAccessType().getTypeName();
        typeName = typeName.replace("java.lang.", "");
        typeName = typeName.replace("java.time.", "");
        return typeName;
    }

    /**
     * Entity => column info
     * @return column info (NotNull)
     */
    public static List<ColumnInfo> getBaseTableColumnInfo() {
        return CreateApiTest.BASE_ENTITY.asDBMeta().getColumnInfoList();
    }

    /**
     * Entity List => column info list
     * @return column info (NotNull)
     */
    private static List<ColumnInfo> getRelatedTableColumnInfo() {
        List<ColumnInfo> list = newArrayList();
        for (AbstractEntity entity : CreateApiTest.ENTITY_LIST) {
            List<ColumnInfo> columnInfoList = entity.asDBMeta().getColumnInfoList();
            for (ColumnInfo columnInfo : columnInfoList) {
                list.add(columnInfo);
            }
        }
        return list;
    }

    /**
     * @return e.g. Judgement (NotNull)
     */
    public static String getEntityName() {
        return CreateApiTest.BASE_ENTITY.asDBMeta().getEntityTypeName().replace("tech.law.hanreidb.dbflute.exentity.", "");
    }

    /**
     * @return e.g. judgement (NotNull)
     */
    public static String getEntityFieldName() {
        return getFieldName(getEntityName());
    }

    /**
     * @return JUDGEMENT_ID -> judgementId
     */
    public static String getCamelName(String snake_name) {
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
     * @param column_snake_name (NotNull)
     * @return getter name e.g. getJudgementId() (NotNull)
     */
    public static String getGetterName(String column_snake_name) {
        return getCamelName("GET_" + column_snake_name) + "()";
    }

    // -----------------------------------------------------
    //                                         Behavior名取得
    //                                         -------------
    /**
     * @return e.g. JudgementBhv (NotNull)
     */
    public static String getBehaviorName() {
        return getEntityName() + "Bhv";
    }

    /**
     * @return e.g. judgementBhv (NotNull)
     */
    public static String getBehaviorFieldName() {
        return getFieldName(getBehaviorName());
    }

    // -----------------------------------------------------
    //                                            クラス名取得
    //                                            ----------
    /**
     * @return action class name e.g. AaaBbbCccAction (NotNull)
     */
    public static String getActionClassName() {
        return getBaseClassName() + "Action";
    }

    /**
     * @return body class name e.g. AaaBbbCccBody (NotNull)
     */
    public static String getBodyClassName() {
        return getBaseClassName() + "Body";
    }

    /**
     * @return result class name e.g. AaaBbbCccContentResult (NotNull)
     */
    public static String getContentResultClassName() {
        return getBaseClassName() + "ContentResult";
    }

    /**
     * @return test class name e.g. AaaBbbCccActionTest (NotNull)
     */
    public static String getActionTestClassName() {
        return getBaseClassName() + "ActionTest";
    }

    // ===================================================================================
    //                                                                             Private 
    //                                                                             =======
    // -----------------------------------------------------
    //                                            クラス名取得
    //                                            ----------
    /**
     * @return base class name  e.g. AaaBbbCcc (NotNull)
     */
    private static String getBaseClassName() {
        return pathToClassName(CreateApiTest.PATH);
    }

    /**
     * @param path e.g. aaa/bbb/ccc (NotNull)
     * @return class name e.g. AaaBbbCcc (NotNull)
     */
    private static String pathToClassName(String path) {
        String className = "";
        String[] split = path.split("/");
        for (String string : split) {
            className = className + string.substring(0, 1).toUpperCase() + string.substring(1);
        }
        return className;
    }

    // -----------------------------------------------------
    //                                          package名取得
    //                                          ------------
    /**
     * e.g. aaa/bbb/ccc -> .aaa.bbb.ccc
     * @return package e.g. .aaa.bbb.ccc (NotNull)
     */
    private static String getPackage() {
        String packagePath = "";
        String[] split = CreateApiTest.PATH.split("/");
        for (String string : split) {
            packagePath = packagePath + "." + string;
        }
        return packagePath;
    }

    // -----------------------------------------------------
    //                                            フィールド名
    //                                            ----------
    /**
     * e.g. JudgementId -> judgementId
     * @param column name e.g. JudgementId (NotNull)
     * @return field name judgementId (NotNull)
     */
    private static String getFieldName(String string) {
        return string.substring(0, 1).toLowerCase() + string.substring(1);
    }

    private static String getExampleValue(ColumnInfo column) {
        if (column.isObjectNativeTypeDate()) {
            return "2018-1-23";
        } else if (column.isObjectNativeTypeNumber()) {
            return "10";
        } else if (column.isObjectNativeTypeString()) {
            return "";
        } else if (column.isObjectNativeTypeJustTime()) {
            return "2018-1-23T11:22:33";
        } else {
            return null;
        }
    }
}
