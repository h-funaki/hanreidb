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
 * The DB meta of COURT_SCRAPE_RESULT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class CourtScrapeResultDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final CourtScrapeResultDbm _instance = new CourtScrapeResultDbm();
    private CourtScrapeResultDbm() {}
    public static CourtScrapeResultDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((CourtScrapeResult)et).getCourtScrapeResultId(), (et, vl) -> ((CourtScrapeResult)et).setCourtScrapeResultId(ctl(vl)), "courtScrapeResultId");
        setupEpg(_epgMap, et -> ((CourtScrapeResult)et).getCaseNumber(), (et, vl) -> ((CourtScrapeResult)et).setCaseNumber((String)vl), "caseNumber");
        setupEpg(_epgMap, et -> ((CourtScrapeResult)et).getCaseName(), (et, vl) -> ((CourtScrapeResult)et).setCaseName((String)vl), "caseName");
        setupEpg(_epgMap, et -> ((CourtScrapeResult)et).getJudgementDate(), (et, vl) -> ((CourtScrapeResult)et).setJudgementDate((String)vl), "judgementDate");
        setupEpg(_epgMap, et -> ((CourtScrapeResult)et).getCourtName(), (et, vl) -> ((CourtScrapeResult)et).setCourtName((String)vl), "courtName");
        setupEpg(_epgMap, et -> ((CourtScrapeResult)et).getJudgementType(), (et, vl) -> ((CourtScrapeResult)et).setJudgementType((String)vl), "judgementType");
        setupEpg(_epgMap, et -> ((CourtScrapeResult)et).getJudgementResult(), (et, vl) -> ((CourtScrapeResult)et).setJudgementResult((String)vl), "judgementResult");
        setupEpg(_epgMap, et -> ((CourtScrapeResult)et).getPrecedentReports(), (et, vl) -> ((CourtScrapeResult)et).setPrecedentReports((String)vl), "precedentReports");
        setupEpg(_epgMap, et -> ((CourtScrapeResult)et).getOriginalCourtName(), (et, vl) -> ((CourtScrapeResult)et).setOriginalCourtName((String)vl), "originalCourtName");
        setupEpg(_epgMap, et -> ((CourtScrapeResult)et).getOriginalCaseNumber(), (et, vl) -> ((CourtScrapeResult)et).setOriginalCaseNumber((String)vl), "originalCaseNumber");
        setupEpg(_epgMap, et -> ((CourtScrapeResult)et).getOriginalJudgementDate(), (et, vl) -> ((CourtScrapeResult)et).setOriginalJudgementDate((String)vl), "originalJudgementDate");
        setupEpg(_epgMap, et -> ((CourtScrapeResult)et).getOriginalJudgementResult(), (et, vl) -> ((CourtScrapeResult)et).setOriginalJudgementResult((String)vl), "originalJudgementResult");
        setupEpg(_epgMap, et -> ((CourtScrapeResult)et).getJudgementContent(), (et, vl) -> ((CourtScrapeResult)et).setJudgementContent((String)vl), "judgementContent");
        setupEpg(_epgMap, et -> ((CourtScrapeResult)et).getJudgementSummary(), (et, vl) -> ((CourtScrapeResult)et).setJudgementSummary((String)vl), "judgementSummary");
        setupEpg(_epgMap, et -> ((CourtScrapeResult)et).getLaw(), (et, vl) -> ((CourtScrapeResult)et).setLaw((String)vl), "law");
        setupEpg(_epgMap, et -> ((CourtScrapeResult)et).getTextUrl(), (et, vl) -> ((CourtScrapeResult)et).setTextUrl((String)vl), "textUrl");
        setupEpg(_epgMap, et -> ((CourtScrapeResult)et).getHighCourtReports(), (et, vl) -> ((CourtScrapeResult)et).setHighCourtReports((String)vl), "highCourtReports");
        setupEpg(_epgMap, et -> ((CourtScrapeResult)et).getJudgementContentSummary(), (et, vl) -> ((CourtScrapeResult)et).setJudgementContentSummary((String)vl), "judgementContentSummary");
        setupEpg(_epgMap, et -> ((CourtScrapeResult)et).getRightType(), (et, vl) -> ((CourtScrapeResult)et).setRightType((String)vl), "rightType");
        setupEpg(_epgMap, et -> ((CourtScrapeResult)et).getLawsuitType(), (et, vl) -> ((CourtScrapeResult)et).setLawsuitType((String)vl), "lawsuitType");
        setupEpg(_epgMap, et -> ((CourtScrapeResult)et).getCaseCategory(), (et, vl) -> ((CourtScrapeResult)et).setCaseCategory((String)vl), "caseCategory");
        setupEpg(_epgMap, et -> ((CourtScrapeResult)et).getSourceOriginalId(), (et, vl) -> ((CourtScrapeResult)et).setSourceOriginalId(cti(vl)), "sourceOriginalId");
        setupEpg(_epgMap, et -> ((CourtScrapeResult)et).getRegisterDatetime(), (et, vl) -> ((CourtScrapeResult)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((CourtScrapeResult)et).getRegisterUser(), (et, vl) -> ((CourtScrapeResult)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((CourtScrapeResult)et).getUpdateDatetime(), (et, vl) -> ((CourtScrapeResult)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((CourtScrapeResult)et).getUpdateUser(), (et, vl) -> ((CourtScrapeResult)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((CourtScrapeResult)et).getVersionNo(), (et, vl) -> ((CourtScrapeResult)et).setVersionNo(ctl(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "COURT_SCRAPE_RESULT";
    protected final String _tableDispName = "COURT_SCRAPE_RESULT";
    protected final String _tablePropertyName = "courtScrapeResult";
    protected final TableSqlName _tableSqlName = new TableSqlName("COURT_SCRAPE_RESULT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "裁判所スクレイピング結果";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCourtScrapeResultId = cci("COURT_SCRAPE_RESULT_ID", "COURT_SCRAPE_RESULT_ID", null, "裁判所スクレイピング結果ID", Long.class, "courtScrapeResultId", null, true, true, true, "BIGINT UNSIGNED", 20, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseNumber = cci("CASE_NUMBER", "CASE_NUMBER", null, "事件番号", String.class, "caseNumber", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseName = cci("CASE_NAME", "CASE_NAME", null, "事件名", String.class, "caseName", null, false, false, false, "TEXT", 65535, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJudgementDate = cci("JUDGEMENT_DATE", "JUDGEMENT_DATE", null, "裁判年月日", String.class, "judgementDate", null, false, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCourtName = cci("COURT_NAME", "COURT_NAME", null, "裁判所名", String.class, "courtName", null, false, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJudgementType = cci("JUDGEMENT_TYPE", "JUDGEMENT_TYPE", null, "裁判種別", String.class, "judgementType", null, false, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJudgementResult = cci("JUDGEMENT_RESULT", "JUDGEMENT_RESULT", null, "結果", String.class, "judgementResult", null, false, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrecedentReports = cci("PRECEDENT_REPORTS", "PRECEDENT_REPORTS", null, "判例集", String.class, "precedentReports", null, false, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOriginalCourtName = cci("ORIGINAL_COURT_NAME", "ORIGINAL_COURT_NAME", null, "原審裁判所名", String.class, "originalCourtName", null, false, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOriginalCaseNumber = cci("ORIGINAL_CASE_NUMBER", "ORIGINAL_CASE_NUMBER", null, "原審事件番号", String.class, "originalCaseNumber", null, false, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOriginalJudgementDate = cci("ORIGINAL_JUDGEMENT_DATE", "ORIGINAL_JUDGEMENT_DATE", null, "原審裁判年月日", String.class, "originalJudgementDate", null, false, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOriginalJudgementResult = cci("ORIGINAL_JUDGEMENT_RESULT", "ORIGINAL_JUDGEMENT_RESULT", null, "原審結果", String.class, "originalJudgementResult", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJudgementContent = cci("JUDGEMENT_CONTENT", "JUDGEMENT_CONTENT", null, "判示事項", String.class, "judgementContent", null, false, false, false, "TEXT", 65535, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJudgementSummary = cci("JUDGEMENT_SUMMARY", "JUDGEMENT_SUMMARY", null, "裁判要旨", String.class, "judgementSummary", null, false, false, false, "TEXT", 65535, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLaw = cci("LAW", "LAW", null, "参照法条", String.class, "law", null, false, false, false, "TEXT", 65535, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTextUrl = cci("TEXT_URL", "TEXT_URL", null, "全文URL", String.class, "textUrl", null, false, false, false, "VARCHAR", 150, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHighCourtReports = cci("HIGH_COURT_REPORTS", "HIGH_COURT_REPORTS", null, "高裁判例集", String.class, "highCourtReports", null, false, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJudgementContentSummary = cci("JUDGEMENT_CONTENT_SUMMARY", "JUDGEMENT_CONTENT_SUMMARY", null, "判示事項の要旨", String.class, "judgementContentSummary", null, false, false, false, "TEXT", 65535, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRightType = cci("RIGHT_TYPE", "RIGHT_TYPE", null, "権利種別", String.class, "rightType", null, false, false, false, "TEXT", 65535, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLawsuitType = cci("LAWSUIT_TYPE", "LAWSUIT_TYPE", null, "訴訟類型", String.class, "lawsuitType", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseCategory = cci("CASE_CATEGORY", "CASE_CATEGORY", null, "事件分野", String.class, "caseCategory", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSourceOriginalId = cci("SOURCE_ORIGINAL_ID", "SOURCE_ORIGINAL_ID", null, "取得元ID", Integer.class, "sourceOriginalId", null, false, false, true, "INT UNSIGNED", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザー", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョン番号", Long.class, "versionNo", null, false, false, true, "BIGINT UNSIGNED", 20, 0, "0", false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * (裁判所スクレイピング結果ID)COURT_SCRAPE_RESULT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCourtScrapeResultId() { return _columnCourtScrapeResultId; }
    /**
     * (事件番号)CASE_NUMBER: {UQ, NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseNumber() { return _columnCaseNumber; }
    /**
     * (事件名)CASE_NAME: {TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseName() { return _columnCaseName; }
    /**
     * (裁判年月日)JUDGEMENT_DATE: {VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJudgementDate() { return _columnJudgementDate; }
    /**
     * (裁判所名)COURT_NAME: {VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCourtName() { return _columnCourtName; }
    /**
     * (裁判種別)JUDGEMENT_TYPE: {VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJudgementType() { return _columnJudgementType; }
    /**
     * (結果)JUDGEMENT_RESULT: {VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJudgementResult() { return _columnJudgementResult; }
    /**
     * (判例集)PRECEDENT_REPORTS: {VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrecedentReports() { return _columnPrecedentReports; }
    /**
     * (原審裁判所名)ORIGINAL_COURT_NAME: {VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOriginalCourtName() { return _columnOriginalCourtName; }
    /**
     * (原審事件番号)ORIGINAL_CASE_NUMBER: {VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOriginalCaseNumber() { return _columnOriginalCaseNumber; }
    /**
     * (原審裁判年月日)ORIGINAL_JUDGEMENT_DATE: {VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOriginalJudgementDate() { return _columnOriginalJudgementDate; }
    /**
     * (原審結果)ORIGINAL_JUDGEMENT_RESULT: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOriginalJudgementResult() { return _columnOriginalJudgementResult; }
    /**
     * (判示事項)JUDGEMENT_CONTENT: {TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJudgementContent() { return _columnJudgementContent; }
    /**
     * (裁判要旨)JUDGEMENT_SUMMARY: {TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJudgementSummary() { return _columnJudgementSummary; }
    /**
     * (参照法条)LAW: {TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLaw() { return _columnLaw; }
    /**
     * (全文URL)TEXT_URL: {VARCHAR(150)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTextUrl() { return _columnTextUrl; }
    /**
     * (高裁判例集)HIGH_COURT_REPORTS: {VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHighCourtReports() { return _columnHighCourtReports; }
    /**
     * (判示事項の要旨)JUDGEMENT_CONTENT_SUMMARY: {TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJudgementContentSummary() { return _columnJudgementContentSummary; }
    /**
     * (権利種別)RIGHT_TYPE: {TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRightType() { return _columnRightType; }
    /**
     * (訴訟類型)LAWSUIT_TYPE: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawsuitType() { return _columnLawsuitType; }
    /**
     * (事件分野)CASE_CATEGORY: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseCategory() { return _columnCaseCategory; }
    /**
     * (取得元ID)SOURCE_ORIGINAL_ID: {UQ, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSourceOriginalId() { return _columnSourceOriginalId; }
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
        ls.add(columnCourtScrapeResultId());
        ls.add(columnCaseNumber());
        ls.add(columnCaseName());
        ls.add(columnJudgementDate());
        ls.add(columnCourtName());
        ls.add(columnJudgementType());
        ls.add(columnJudgementResult());
        ls.add(columnPrecedentReports());
        ls.add(columnOriginalCourtName());
        ls.add(columnOriginalCaseNumber());
        ls.add(columnOriginalJudgementDate());
        ls.add(columnOriginalJudgementResult());
        ls.add(columnJudgementContent());
        ls.add(columnJudgementSummary());
        ls.add(columnLaw());
        ls.add(columnTextUrl());
        ls.add(columnHighCourtReports());
        ls.add(columnJudgementContentSummary());
        ls.add(columnRightType());
        ls.add(columnLawsuitType());
        ls.add(columnCaseCategory());
        ls.add(columnSourceOriginalId());
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
    protected UniqueInfo cpui() { return hpcpui(columnCourtScrapeResultId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOfCaseNumber() { return hpcui(columnCaseNumber()); }
    public UniqueInfo uniqueOfSourceOriginalId() { return hpcui(columnSourceOriginalId()); }

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
    public String getEntityTypeName() { return "tech.law.hanreidb.dbflute.exentity.CourtScrapeResult"; }
    public String getConditionBeanTypeName() { return "tech.law.hanreidb.dbflute.cbean.CourtScrapeResultCB"; }
    public String getBehaviorTypeName() { return "tech.law.hanreidb.dbflute.exbhv.CourtScrapeResultBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<CourtScrapeResult> getEntityType() { return CourtScrapeResult.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public CourtScrapeResult newEntity() { return new CourtScrapeResult(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((CourtScrapeResult)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((CourtScrapeResult)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
