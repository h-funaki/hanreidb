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
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import tech.law.hanreidb.dbflute.allcommon.*;
import tech.law.hanreidb.dbflute.exentity.*;

/**
 * The DB meta of CLS_SOURCE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ClsSourceDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ClsSourceDbm _instance = new ClsSourceDbm();
    private ClsSourceDbm() {}
    public static ClsSourceDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ClsSource)et).getSourceCode(), (et, vl) -> ((ClsSource)et).setSourceCode((String)vl), "sourceCode");
        setupEpg(_epgMap, et -> ((ClsSource)et).getSourceName(), (et, vl) -> ((ClsSource)et).setSourceName((String)vl), "sourceName");
        setupEpg(_epgMap, et -> ((ClsSource)et).getSourceAlias(), (et, vl) -> ((ClsSource)et).setSourceAlias((String)vl), "sourceAlias");
        setupEpg(_epgMap, et -> ((ClsSource)et).getDescription(), (et, vl) -> ((ClsSource)et).setDescription((String)vl), "description");
        setupEpg(_epgMap, et -> ((ClsSource)et).getDisplayOrder(), (et, vl) -> ((ClsSource)et).setDisplayOrder(cti(vl)), "displayOrder");
        setupEpg(_epgMap, et -> ((ClsSource)et).getRegisterDatetime(), (et, vl) -> ((ClsSource)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((ClsSource)et).getRegisterUser(), (et, vl) -> ((ClsSource)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((ClsSource)et).getUpdateDatetime(), (et, vl) -> ((ClsSource)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((ClsSource)et).getUpdateUser(), (et, vl) -> ((ClsSource)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((ClsSource)et).getVersionNo(), (et, vl) -> ((ClsSource)et).setVersionNo(ctl(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "CLS_SOURCE";
    protected final String _tableDispName = "CLS_SOURCE";
    protected final String _tablePropertyName = "clsSource";
    protected final TableSqlName _tableSqlName = new TableSqlName("CLS_SOURCE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "[区分値]取得元";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSourceCode = cci("SOURCE_CODE", "SOURCE_CODE", null, "取得元コード", String.class, "sourceCode", null, true, false, true, "VARCHAR", 20, 0, null, false, null, null, null, "judgementSourceRelList,lawSourceRelList,sourceLawCategoryList", CDef.DefMeta.Source, false);
    protected final ColumnInfo _columnSourceName = cci("SOURCE_NAME", "SOURCE_NAME", null, "取得元名", String.class, "sourceName", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSourceAlias = cci("SOURCE_ALIAS", "SOURCE_ALIAS", null, "取得元別名", String.class, "sourceAlias", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDescription = cci("DESCRIPTION", "DESCRIPTION", null, "説明", String.class, "description", null, false, false, true, "TEXT", 65535, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDisplayOrder = cci("DISPLAY_ORDER", "DISPLAY_ORDER", null, "順番", Integer.class, "displayOrder", null, false, false, true, "INT UNSIGNED", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザー", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョン番号", Long.class, "versionNo", null, false, false, true, "BIGINT UNSIGNED", 20, 0, "0", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * (取得元コード)SOURCE_CODE: {PK, NotNull, VARCHAR(20), classification=Source}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSourceCode() { return _columnSourceCode; }
    /**
     * (取得元名)SOURCE_NAME: {UQ, NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSourceName() { return _columnSourceName; }
    /**
     * (取得元別名)SOURCE_ALIAS: {UQ, NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSourceAlias() { return _columnSourceAlias; }
    /**
     * (説明)DESCRIPTION: {NotNull, TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDescription() { return _columnDescription; }
    /**
     * (順番)DISPLAY_ORDER: {UQ, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDisplayOrder() { return _columnDisplayOrder; }
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
        ls.add(columnSourceCode());
        ls.add(columnSourceName());
        ls.add(columnSourceAlias());
        ls.add(columnDescription());
        ls.add(columnDisplayOrder());
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
    protected UniqueInfo cpui() { return hpcpui(columnSourceCode()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOfDisplayOrder() { return hpcui(columnDisplayOrder()); }
    public UniqueInfo uniqueOfSourceAlias() { return hpcui(columnSourceAlias()); }
    public UniqueInfo uniqueOfSourceName() { return hpcui(columnSourceName()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (判決取得元リレーション)JUDGEMENT_SOURCE_REL by SOURCE_CODE, named 'judgementSourceRelList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerJudgementSourceRelList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSourceCode(), JudgementSourceRelDbm.getInstance().columnSourceCode());
        return cri("FK_JUDGEMENT_SOURCE_REL_SOURCE", "judgementSourceRelList", this, JudgementSourceRelDbm.getInstance(), mp, false, "clsSource");
    }
    /**
     * (法令取得元リレーション)LAW_SOURCE_REL by SOURCE_CODE, named 'lawSourceRelList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerLawSourceRelList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSourceCode(), LawSourceRelDbm.getInstance().columnSourceCode());
        return cri("FK_LAW_SOURCE_REL_CLS_SOURCE", "lawSourceRelList", this, LawSourceRelDbm.getInstance(), mp, false, "clsSource");
    }
    /**
     * (取得元法令カテゴリー)SOURCE_LAW_CATEGORY by SOURCE_CODE, named 'sourceLawCategoryList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerSourceLawCategoryList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSourceCode(), SourceLawCategoryDbm.getInstance().columnSourceCode());
        return cri("FK_SOURCE_LAW_CATEGORY_CLS_SOURCE", "sourceLawCategoryList", this, SourceLawCategoryDbm.getInstance(), mp, false, "clsSource");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
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
    public String getEntityTypeName() { return "tech.law.hanreidb.dbflute.exentity.ClsSource"; }
    public String getConditionBeanTypeName() { return "tech.law.hanreidb.dbflute.cbean.ClsSourceCB"; }
    public String getBehaviorTypeName() { return "tech.law.hanreidb.dbflute.exbhv.ClsSourceBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ClsSource> getEntityType() { return ClsSource.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ClsSource newEntity() { return new ClsSource(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ClsSource)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ClsSource)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
