/*
 * Copyright 2015-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package tech.law.hanreidb.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import tech.law.hanreidb.dbflute.allcommon.*;
import tech.law.hanreidb.dbflute.exentity.*;

/**
 * The DB meta of SOURCE_LAW_CATEGORY. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SourceLawCategoryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SourceLawCategoryDbm _instance = new SourceLawCategoryDbm();
    private SourceLawCategoryDbm() {}
    public static SourceLawCategoryDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((SourceLawCategory)et).getSourceLawCategoryId(), (et, vl) -> ((SourceLawCategory)et).setSourceLawCategoryId(cti(vl)), "sourceLawCategoryId");
        setupEpg(_epgMap, et -> ((SourceLawCategory)et).getSourceCode(), (et, vl) -> ((SourceLawCategory)et).setSourceCode((String)vl), "sourceCode");
        setupEpg(_epgMap, et -> ((SourceLawCategory)et).getLawCategoryId(), (et, vl) -> ((SourceLawCategory)et).setLawCategoryId(cti(vl)), "lawCategoryId");
        setupEpg(_epgMap, et -> ((SourceLawCategory)et).getSourceLawCategoryName(), (et, vl) -> ((SourceLawCategory)et).setSourceLawCategoryName((String)vl), "sourceLawCategoryName");
        setupEpg(_epgMap, et -> ((SourceLawCategory)et).getSourceLawCategoryAlias(), (et, vl) -> ((SourceLawCategory)et).setSourceLawCategoryAlias((String)vl), "sourceLawCategoryAlias");
        setupEpg(_epgMap, et -> ((SourceLawCategory)et).getRegisterDatetime(), (et, vl) -> ((SourceLawCategory)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((SourceLawCategory)et).getRegisterUser(), (et, vl) -> ((SourceLawCategory)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((SourceLawCategory)et).getUpdateDatetime(), (et, vl) -> ((SourceLawCategory)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((SourceLawCategory)et).getUpdateUser(), (et, vl) -> ((SourceLawCategory)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((SourceLawCategory)et).getVersionNo(), (et, vl) -> ((SourceLawCategory)et).setVersionNo(ctl(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((SourceLawCategory)et).getLawCategory(), (et, vl) -> ((SourceLawCategory)et).setLawCategory((OptionalEntity<LawCategory>)vl), "lawCategory");
        setupEfpg(_efpgMap, et -> ((SourceLawCategory)et).getClsSource(), (et, vl) -> ((SourceLawCategory)et).setClsSource((OptionalEntity<ClsSource>)vl), "clsSource");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SOURCE_LAW_CATEGORY";
    protected final String _tableDispName = "SOURCE_LAW_CATEGORY";
    protected final String _tablePropertyName = "sourceLawCategory";
    protected final TableSqlName _tableSqlName = new TableSqlName("SOURCE_LAW_CATEGORY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "取得元法令カテゴリー";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSourceLawCategoryId = cci("SOURCE_LAW_CATEGORY_ID", "SOURCE_LAW_CATEGORY_ID", null, "取得元法令カテゴリーID", Integer.class, "sourceLawCategoryId", null, true, true, true, "INT", 10, 0, null, false, null, null, null, "sourceLawCategoryRelList", null, false);
    protected final ColumnInfo _columnSourceCode = cci("SOURCE_CODE", "SOURCE_CODE", null, "取得元コード", String.class, "sourceCode", null, false, false, true, "VARCHAR", 10, 0, null, false, null, null, "clsSource", null, CDef.DefMeta.Source, false);
    protected final ColumnInfo _columnLawCategoryId = cci("LAW_CATEGORY_ID", "LAW_CATEGORY_ID", null, "法令カテゴリーID", Integer.class, "lawCategoryId", null, false, false, true, "INT", 10, 0, null, false, null, null, "lawCategory", null, null, false);
    protected final ColumnInfo _columnSourceLawCategoryName = cci("SOURCE_LAW_CATEGORY_NAME", "SOURCE_LAW_CATEGORY_NAME", null, "取得元法令カテゴリー名", String.class, "sourceLawCategoryName", null, false, false, true, "VARCHAR", 20, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSourceLawCategoryAlias = cci("SOURCE_LAW_CATEGORY_ALIAS", "SOURCE_LAW_CATEGORY_ALIAS", null, "取得元法令カテゴリー別名", String.class, "sourceLawCategoryAlias", null, false, false, true, "VARCHAR", 20, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザー", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョン番号", Long.class, "versionNo", null, false, false, true, "BIGINT UNSIGNED", 20, 0, "0", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * (取得元法令カテゴリーID)SOURCE_LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSourceLawCategoryId() { return _columnSourceLawCategoryId; }
    /**
     * (取得元コード)SOURCE_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_SOURCE, classification=Source}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSourceCode() { return _columnSourceCode; }
    /**
     * (法令カテゴリーID)LAW_CATEGORY_ID: {IX, NotNull, INT(10), FK to LAW_CATEGORY}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawCategoryId() { return _columnLawCategoryId; }
    /**
     * (取得元法令カテゴリー名)SOURCE_LAW_CATEGORY_NAME: {NotNull, VARCHAR(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSourceLawCategoryName() { return _columnSourceLawCategoryName; }
    /**
     * (取得元法令カテゴリー別名)SOURCE_LAW_CATEGORY_ALIAS: {NotNull, VARCHAR(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSourceLawCategoryAlias() { return _columnSourceLawCategoryAlias; }
    /**
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    /**
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    /**
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSourceLawCategoryId());
        ls.add(columnSourceCode());
        ls.add(columnLawCategoryId());
        ls.add(columnSourceLawCategoryName());
        ls.add(columnSourceLawCategoryAlias());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        ls.add(columnVersionNo());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnSourceLawCategoryId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * (法令カテゴリー)LAW_CATEGORY by my LAW_CATEGORY_ID, named 'lawCategory'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignLawCategory() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLawCategoryId(), LawCategoryDbm.getInstance().columnLawCategoryId());
        return cfi("FK_SOURCE_LAW_CATEGORY_LAW_CATEGORY", "lawCategory", this, LawCategoryDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "sourceLawCategoryList", false);
    }
    /**
     * ([区分値]取得元)CLS_SOURCE by my SOURCE_CODE, named 'clsSource'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignClsSource() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSourceCode(), ClsSourceDbm.getInstance().columnSourceCode());
        return cfi("FK_SOURCE_LAW_CATEGORY_CLS_SOURCE", "clsSource", this, ClsSourceDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "sourceLawCategoryList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (取得元法令カテゴリーリレーション)SOURCE_LAW_CATEGORY_REL by SOURCE_LAW_CATEGORY_ID, named 'sourceLawCategoryRelList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerSourceLawCategoryRelList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSourceLawCategoryId(), SourceLawCategoryRelDbm.getInstance().columnSourceLawCategoryId());
        return cri("FK_SOURCE_LAW_CATEGORY_REL_SOURCE_LAW_CATEGORY", "sourceLawCategoryRelList", this, SourceLawCategoryRelDbm.getInstance(), mp, false, "sourceLawCategory");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser(), columnVersionNo()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser(), columnVersionNo()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime(), columnUpdateUser()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "tech.law.hanreidb.dbflute.exentity.SourceLawCategory"; }
    public String getConditionBeanTypeName() { return "tech.law.hanreidb.dbflute.cbean.SourceLawCategoryCB"; }
    public String getBehaviorTypeName() { return "tech.law.hanreidb.dbflute.exbhv.SourceLawCategoryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SourceLawCategory> getEntityType() { return SourceLawCategory.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SourceLawCategory newEntity() { return new SourceLawCategory(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SourceLawCategory)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SourceLawCategory)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
