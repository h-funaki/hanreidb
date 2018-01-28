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
 * The DB meta of CLS_JUDGEMENT_RESULT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ClsJudgementResultDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ClsJudgementResultDbm _instance = new ClsJudgementResultDbm();
    private ClsJudgementResultDbm() {}
    public static ClsJudgementResultDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ClsJudgementResult)et).getJudgementResultCode(), (et, vl) -> ((ClsJudgementResult)et).setJudgementResultCode((String)vl), "judgementResultCode");
        setupEpg(_epgMap, et -> ((ClsJudgementResult)et).getJudgementResultName(), (et, vl) -> ((ClsJudgementResult)et).setJudgementResultName((String)vl), "judgementResultName");
        setupEpg(_epgMap, et -> ((ClsJudgementResult)et).getJudgementResultAlias(), (et, vl) -> ((ClsJudgementResult)et).setJudgementResultAlias((String)vl), "judgementResultAlias");
        setupEpg(_epgMap, et -> ((ClsJudgementResult)et).getDescription(), (et, vl) -> ((ClsJudgementResult)et).setDescription((String)vl), "description");
        setupEpg(_epgMap, et -> ((ClsJudgementResult)et).getDisplayOrder(), (et, vl) -> ((ClsJudgementResult)et).setDisplayOrder(cti(vl)), "displayOrder");
        setupEpg(_epgMap, et -> ((ClsJudgementResult)et).getRegisterDatetime(), (et, vl) -> ((ClsJudgementResult)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((ClsJudgementResult)et).getRegisterUser(), (et, vl) -> ((ClsJudgementResult)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((ClsJudgementResult)et).getUpdateDatetime(), (et, vl) -> ((ClsJudgementResult)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((ClsJudgementResult)et).getUpdateUser(), (et, vl) -> ((ClsJudgementResult)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((ClsJudgementResult)et).getVersionNo(), (et, vl) -> ((ClsJudgementResult)et).setVersionNo(ctl(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "CLS_JUDGEMENT_RESULT";
    protected final String _tableDispName = "CLS_JUDGEMENT_RESULT";
    protected final String _tablePropertyName = "clsJudgementResult";
    protected final TableSqlName _tableSqlName = new TableSqlName("CLS_JUDGEMENT_RESULT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "[区分値]判決結果";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnJudgementResultCode = cci("JUDGEMENT_RESULT_CODE", "JUDGEMENT_RESULT_CODE", null, "判決結果コード", String.class, "judgementResultCode", null, true, false, true, "VARCHAR", 10, 0, null, false, null, null, null, "judgementList", CDef.DefMeta.JudgementResult, false);
    protected final ColumnInfo _columnJudgementResultName = cci("JUDGEMENT_RESULT_NAME", "JUDGEMENT_RESULT_NAME", null, "判決結果名", String.class, "judgementResultName", null, false, false, true, "VARCHAR", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJudgementResultAlias = cci("JUDGEMENT_RESULT_ALIAS", "JUDGEMENT_RESULT_ALIAS", null, "判決結果別名", String.class, "judgementResultAlias", null, false, false, true, "VARCHAR", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDescription = cci("DESCRIPTION", "DESCRIPTION", null, "説明", String.class, "description", null, false, false, true, "TEXT", 65535, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDisplayOrder = cci("DISPLAY_ORDER", "DISPLAY_ORDER", null, "順番", Integer.class, "displayOrder", null, false, false, true, "INT UNSIGNED", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザー", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョン番号", Long.class, "versionNo", null, false, false, true, "BIGINT UNSIGNED", 20, 0, "0", false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * (判決結果コード)JUDGEMENT_RESULT_CODE: {PK, NotNull, VARCHAR(10), classification=JudgementResult}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJudgementResultCode() { return _columnJudgementResultCode; }
    /**
     * (判決結果名)JUDGEMENT_RESULT_NAME: {UQ, NotNull, VARCHAR(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJudgementResultName() { return _columnJudgementResultName; }
    /**
     * (判決結果別名)JUDGEMENT_RESULT_ALIAS: {UQ, NotNull, VARCHAR(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJudgementResultAlias() { return _columnJudgementResultAlias; }
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
        ls.add(columnJudgementResultCode());
        ls.add(columnJudgementResultName());
        ls.add(columnJudgementResultAlias());
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
    protected UniqueInfo cpui() { return hpcpui(columnJudgementResultCode()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOfDisplayOrder() { return hpcui(columnDisplayOrder()); }
    public UniqueInfo uniqueOfJudgementResultAlias() { return hpcui(columnJudgementResultAlias()); }
    public UniqueInfo uniqueOfJudgementResultName() { return hpcui(columnJudgementResultName()); }

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
     * (判決)JUDGEMENT by JUDGEMENT_RESULT_CODE, named 'judgementList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerJudgementList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnJudgementResultCode(), JudgementDbm.getInstance().columnJudgementResultCode());
        return cri("FK_JUDGEMENT_CLS_JUDGEMENT_RESULT", "judgementList", this, JudgementDbm.getInstance(), mp, false, "clsJudgementResult");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime(), columnUpdateUser()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "tech.law.hanreidb.dbflute.exentity.ClsJudgementResult"; }
    public String getConditionBeanTypeName() { return "tech.law.hanreidb.dbflute.cbean.ClsJudgementResultCB"; }
    public String getBehaviorTypeName() { return "tech.law.hanreidb.dbflute.exbhv.ClsJudgementResultBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ClsJudgementResult> getEntityType() { return ClsJudgementResult.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ClsJudgementResult newEntity() { return new ClsJudgementResult(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ClsJudgementResult)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ClsJudgementResult)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
