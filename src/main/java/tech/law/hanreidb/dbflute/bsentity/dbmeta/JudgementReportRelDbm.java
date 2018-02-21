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
 * The DB meta of JUDGEMENT_REPORT_REL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class JudgementReportRelDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final JudgementReportRelDbm _instance = new JudgementReportRelDbm();
    private JudgementReportRelDbm() {}
    public static JudgementReportRelDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((JudgementReportRel)et).getJudgementReportsRelId(), (et, vl) -> ((JudgementReportRel)et).setJudgementReportsRelId(ctl(vl)), "judgementReportsRelId");
        setupEpg(_epgMap, et -> ((JudgementReportRel)et).getJudgementId(), (et, vl) -> ((JudgementReportRel)et).setJudgementId(ctl(vl)), "judgementId");
        setupEpg(_epgMap, et -> ((JudgementReportRel)et).getReportId(), (et, vl) -> ((JudgementReportRel)et).setReportId(cti(vl)), "reportId");
        setupEpg(_epgMap, et -> ((JudgementReportRel)et).getReportKan(), (et, vl) -> ((JudgementReportRel)et).setReportKan(cti(vl)), "reportKan");
        setupEpg(_epgMap, et -> ((JudgementReportRel)et).getReportGo(), (et, vl) -> ((JudgementReportRel)et).setReportGo(cti(vl)), "reportGo");
        setupEpg(_epgMap, et -> ((JudgementReportRel)et).getReportKo(), (et, vl) -> ((JudgementReportRel)et).setReportKo(cti(vl)), "reportKo");
        setupEpg(_epgMap, et -> ((JudgementReportRel)et).getRegisterDatetime(), (et, vl) -> ((JudgementReportRel)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((JudgementReportRel)et).getRegisterUser(), (et, vl) -> ((JudgementReportRel)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((JudgementReportRel)et).getUpdateDatetime(), (et, vl) -> ((JudgementReportRel)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((JudgementReportRel)et).getUpdateUser(), (et, vl) -> ((JudgementReportRel)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((JudgementReportRel)et).getVersionNo(), (et, vl) -> ((JudgementReportRel)et).setVersionNo(ctl(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((JudgementReportRel)et).getJudgement(), (et, vl) -> ((JudgementReportRel)et).setJudgement((OptionalEntity<Judgement>)vl), "judgement");
        setupEfpg(_efpgMap, et -> ((JudgementReportRel)et).getReport(), (et, vl) -> ((JudgementReportRel)et).setReport((OptionalEntity<Report>)vl), "report");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "JUDGEMENT_REPORT_REL";
    protected final String _tableDispName = "JUDGEMENT_REPORT_REL";
    protected final String _tablePropertyName = "judgementReportRel";
    protected final TableSqlName _tableSqlName = new TableSqlName("JUDGEMENT_REPORT_REL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "判決判例集リレーション";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnJudgementReportsRelId = cci("JUDGEMENT_REPORTS_REL_ID", "JUDGEMENT_REPORTS_REL_ID", null, "判決判例集リレーションID", Long.class, "judgementReportsRelId", null, true, true, true, "BIGINT UNSIGNED", 20, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJudgementId = cci("JUDGEMENT_ID", "JUDGEMENT_ID", null, "判決ID", Long.class, "judgementId", null, false, false, true, "BIGINT UNSIGNED", 20, 0, null, false, null, null, "judgement", null, null, false);
    protected final ColumnInfo _columnReportId = cci("REPORT_ID", "REPORT_ID", null, "判例集ID", Integer.class, "reportId", null, false, false, true, "INT UNSIGNED", 10, 0, null, false, null, null, "report", null, null, false);
    protected final ColumnInfo _columnReportKan = cci("REPORT_KAN", "REPORT_KAN", null, "判例集巻", Integer.class, "reportKan", null, false, false, false, "INT UNSIGNED", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReportGo = cci("REPORT_GO", "REPORT_GO", null, "判例集号", Integer.class, "reportGo", null, false, false, false, "INT UNSIGNED", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReportKo = cci("REPORT_KO", "REPORT_KO", null, "判例集頁", Integer.class, "reportKo", null, false, false, false, "INT UNSIGNED", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザー", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョン番号", Long.class, "versionNo", null, false, false, true, "BIGINT UNSIGNED", 20, 0, "0", false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * (判決判例集リレーションID)JUDGEMENT_REPORTS_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJudgementReportsRelId() { return _columnJudgementReportsRelId; }
    /**
     * (判決ID)JUDGEMENT_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJudgementId() { return _columnJudgementId; }
    /**
     * (判例集ID)REPORT_ID: {IX, NotNull, INT UNSIGNED(10), FK to REPORT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReportId() { return _columnReportId; }
    /**
     * (判例集巻)REPORT_KAN: {INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReportKan() { return _columnReportKan; }
    /**
     * (判例集号)REPORT_GO: {INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReportGo() { return _columnReportGo; }
    /**
     * (判例集頁)REPORT_KO: {INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReportKo() { return _columnReportKo; }
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
        ls.add(columnJudgementReportsRelId());
        ls.add(columnJudgementId());
        ls.add(columnReportId());
        ls.add(columnReportKan());
        ls.add(columnReportGo());
        ls.add(columnReportKo());
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
    protected UniqueInfo cpui() { return hpcpui(columnJudgementReportsRelId()); }
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
     * (判決)JUDGEMENT by my JUDGEMENT_ID, named 'judgement'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignJudgement() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnJudgementId(), JudgementDbm.getInstance().columnJudgementId());
        return cfi("FK_JUDGEMENT_REPORT_REL_JUDGEMENT", "judgement", this, JudgementDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "judgementReportRelList", false);
    }
    /**
     * (判例集)REPORT by my REPORT_ID, named 'report'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignReport() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReportId(), ReportDbm.getInstance().columnReportId());
        return cfi("FK_JUDGEMENT_REPORT_REL_REPORT", "report", this, ReportDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "judgementReportRelList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
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
    public String getEntityTypeName() { return "tech.law.hanreidb.dbflute.exentity.JudgementReportRel"; }
    public String getConditionBeanTypeName() { return "tech.law.hanreidb.dbflute.cbean.JudgementReportRelCB"; }
    public String getBehaviorTypeName() { return "tech.law.hanreidb.dbflute.exbhv.JudgementReportRelBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<JudgementReportRel> getEntityType() { return JudgementReportRel.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public JudgementReportRel newEntity() { return new JudgementReportRel(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((JudgementReportRel)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((JudgementReportRel)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
