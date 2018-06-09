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
 * The DB meta of CASE_MARK. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class CaseMarkDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final CaseMarkDbm _instance = new CaseMarkDbm();
    private CaseMarkDbm() {}
    public static CaseMarkDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((CaseMark)et).getCaseMarkId(), (et, vl) -> ((CaseMark)et).setCaseMarkId(cti(vl)), "caseMarkId");
        setupEpg(_epgMap, et -> ((CaseMark)et).getCaseMarkName(), (et, vl) -> ((CaseMark)et).setCaseMarkName((String)vl), "caseMarkName");
        setupEpg(_epgMap, et -> ((CaseMark)et).getCaseMarkAlias(), (et, vl) -> ((CaseMark)et).setCaseMarkAlias((String)vl), "caseMarkAlias");
        setupEpg(_epgMap, et -> ((CaseMark)et).getCaseCategoryCode(), (et, vl) -> ((CaseMark)et).setCaseCategoryCode((String)vl), "caseCategoryCode");
        setupEpg(_epgMap, et -> ((CaseMark)et).getCourtTypeCode(), (et, vl) -> ((CaseMark)et).setCourtTypeCode((String)vl), "courtTypeCode");
        setupEpg(_epgMap, et -> ((CaseMark)et).getCaseMarkDetail(), (et, vl) -> ((CaseMark)et).setCaseMarkDetail((String)vl), "caseMarkDetail");
        setupEpg(_epgMap, et -> ((CaseMark)et).getRegisterDatetime(), (et, vl) -> ((CaseMark)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((CaseMark)et).getRegisterUser(), (et, vl) -> ((CaseMark)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((CaseMark)et).getUpdateDatetime(), (et, vl) -> ((CaseMark)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((CaseMark)et).getUpdateUser(), (et, vl) -> ((CaseMark)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((CaseMark)et).getVersionNo(), (et, vl) -> ((CaseMark)et).setVersionNo(ctl(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((CaseMark)et).getClsCaseCategory(), (et, vl) -> ((CaseMark)et).setClsCaseCategory((OptionalEntity<ClsCaseCategory>)vl), "clsCaseCategory");
        setupEfpg(_efpgMap, et -> ((CaseMark)et).getClsCourtType(), (et, vl) -> ((CaseMark)et).setClsCourtType((OptionalEntity<ClsCourtType>)vl), "clsCourtType");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "CASE_MARK";
    protected final String _tableDispName = "CASE_MARK";
    protected final String _tablePropertyName = "caseMark";
    protected final TableSqlName _tableSqlName = new TableSqlName("CASE_MARK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "事件符号";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCaseMarkId = cci("CASE_MARK_ID", "CASE_MARK_ID", null, "事件符号ID", Integer.class, "caseMarkId", null, true, true, true, "INT UNSIGNED", 10, 0, null, false, null, null, null, "judgementList", null, false);
    protected final ColumnInfo _columnCaseMarkName = cci("CASE_MARK_NAME", "CASE_MARK_NAME", null, "事件符号名", String.class, "caseMarkName", null, false, false, true, "VARCHAR", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseMarkAlias = cci("CASE_MARK_ALIAS", "CASE_MARK_ALIAS", null, "事件符号別名", String.class, "caseMarkAlias", null, false, false, true, "VARCHAR", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseCategoryCode = cci("CASE_CATEGORY_CODE", "CASE_CATEGORY_CODE", null, "事件カテゴリーコード", String.class, "caseCategoryCode", null, false, false, false, "VARCHAR", 10, 0, null, false, null, null, "clsCaseCategory", null, CDef.DefMeta.CaseCategory, false);
    protected final ColumnInfo _columnCourtTypeCode = cci("COURT_TYPE_CODE", "COURT_TYPE_CODE", null, "裁判所種別コード", String.class, "courtTypeCode", null, false, false, false, "VARCHAR", 10, 0, null, false, null, null, "clsCourtType", null, CDef.DefMeta.CourtType, false);
    protected final ColumnInfo _columnCaseMarkDetail = cci("CASE_MARK_DETAIL", "CASE_MARK_DETAIL", null, "事件符号詳細", String.class, "caseMarkDetail", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザー", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョン番号", Long.class, "versionNo", null, false, false, true, "BIGINT UNSIGNED", 20, 0, "0", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * (事件符号ID)CASE_MARK_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseMarkId() { return _columnCaseMarkId; }
    /**
     * (事件符号名)CASE_MARK_NAME: {NotNull, VARCHAR(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseMarkName() { return _columnCaseMarkName; }
    /**
     * (事件符号別名)CASE_MARK_ALIAS: {NotNull, VARCHAR(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseMarkAlias() { return _columnCaseMarkAlias; }
    /**
     * (事件カテゴリーコード)CASE_CATEGORY_CODE: {IX, VARCHAR(10), FK to CLS_CASE_CATEGORY, classification=CaseCategory}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseCategoryCode() { return _columnCaseCategoryCode; }
    /**
     * (裁判所種別コード)COURT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCourtTypeCode() { return _columnCourtTypeCode; }
    /**
     * (事件符号詳細)CASE_MARK_DETAIL: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseMarkDetail() { return _columnCaseMarkDetail; }
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
        ls.add(columnCaseMarkId());
        ls.add(columnCaseMarkName());
        ls.add(columnCaseMarkAlias());
        ls.add(columnCaseCategoryCode());
        ls.add(columnCourtTypeCode());
        ls.add(columnCaseMarkDetail());
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
    protected UniqueInfo cpui() { return hpcpui(columnCaseMarkId()); }
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
     * ([区分値]事件カテゴリー)CLS_CASE_CATEGORY by my CASE_CATEGORY_CODE, named 'clsCaseCategory'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignClsCaseCategory() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCaseCategoryCode(), ClsCaseCategoryDbm.getInstance().columnCaseCategoryCode());
        return cfi("FK_CASE_MARK_CLS_CASE_CATEGORY", "clsCaseCategory", this, ClsCaseCategoryDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "caseMarkList", false);
    }
    /**
     * ([区分値]裁判所種別)CLS_COURT_TYPE by my COURT_TYPE_CODE, named 'clsCourtType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignClsCourtType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCourtTypeCode(), ClsCourtTypeDbm.getInstance().columnCourtTypeCode());
        return cfi("FK_CASE_MARK_CLS_COURT_TYPE", "clsCourtType", this, ClsCourtTypeDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "caseMarkList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (判決)JUDGEMENT by CASE_MARK_ID, named 'judgementList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerJudgementList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCaseMarkId(), JudgementDbm.getInstance().columnCaseMarkId());
        return cri("FK_JUDGEMENT_CASE_MARK", "judgementList", this, JudgementDbm.getInstance(), mp, false, "caseMark");
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
    public String getEntityTypeName() { return "tech.law.hanreidb.dbflute.exentity.CaseMark"; }
    public String getConditionBeanTypeName() { return "tech.law.hanreidb.dbflute.cbean.CaseMarkCB"; }
    public String getBehaviorTypeName() { return "tech.law.hanreidb.dbflute.exbhv.CaseMarkBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<CaseMark> getEntityType() { return CaseMark.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public CaseMark newEntity() { return new CaseMark(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((CaseMark)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((CaseMark)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
