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
 * The DB meta of JUDGEMENT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class JudgementDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final JudgementDbm _instance = new JudgementDbm();
    private JudgementDbm() {}
    public static JudgementDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Judgement)et).getJudgementId(), (et, vl) -> ((Judgement)et).setJudgementId(ctl(vl)), "judgementId");
        setupEpg(_epgMap, et -> ((Judgement)et).getJudgementPublicCode(), (et, vl) -> ((Judgement)et).setJudgementPublicCode((String)vl), "judgementPublicCode");
        setupEpg(_epgMap, et -> ((Judgement)et).getCaseName(), (et, vl) -> ((Judgement)et).setCaseName((String)vl), "caseName");
        setupEpg(_epgMap, et -> ((Judgement)et).getPrecedentReportsKan(), (et, vl) -> ((Judgement)et).setPrecedentReportsKan(cti(vl)), "precedentReportsKan");
        setupEpg(_epgMap, et -> ((Judgement)et).getPrecedentReportsGo(), (et, vl) -> ((Judgement)et).setPrecedentReportsGo(cti(vl)), "precedentReportsGo");
        setupEpg(_epgMap, et -> ((Judgement)et).getPrecedentReportsKo(), (et, vl) -> ((Judgement)et).setPrecedentReportsKo(cti(vl)), "precedentReportsKo");
        setupEpg(_epgMap, et -> ((Judgement)et).getJudgementReportsGo(), (et, vl) -> ((Judgement)et).setJudgementReportsGo(cti(vl)), "judgementReportsGo");
        setupEpg(_epgMap, et -> ((Judgement)et).getJudgementReportsKo(), (et, vl) -> ((Judgement)et).setJudgementReportsKo(cti(vl)), "judgementReportsKo");
        setupEpg(_epgMap, et -> ((Judgement)et).getJudgementDate(), (et, vl) -> ((Judgement)et).setJudgementDate(ctld(vl)), "judgementDate");
        setupEpg(_epgMap, et -> ((Judgement)et).getOriginalJudgementId(), (et, vl) -> ((Judgement)et).setOriginalJudgementId(ctl(vl)), "originalJudgementId");
        setupEpg(_epgMap, et -> ((Judgement)et).getCaseNumberEraCode(), (et, vl) -> ((Judgement)et).setCaseNumberEraCode((String)vl), "caseNumberEraCode");
        setupEpg(_epgMap, et -> ((Judgement)et).getCaseNumberYear(), (et, vl) -> ((Judgement)et).setCaseNumberYear(cti(vl)), "caseNumberYear");
        setupEpg(_epgMap, et -> ((Judgement)et).getCaseMarkId(), (et, vl) -> ((Judgement)et).setCaseMarkId(cti(vl)), "caseMarkId");
        setupEpg(_epgMap, et -> ((Judgement)et).getCaseNumberSerialNumber(), (et, vl) -> ((Judgement)et).setCaseNumberSerialNumber(cti(vl)), "caseNumberSerialNumber");
        setupEpg(_epgMap, et -> ((Judgement)et).getCourtId(), (et, vl) -> ((Judgement)et).setCourtId(cti(vl)), "courtId");
        setupEpg(_epgMap, et -> ((Judgement)et).getBenchCode(), (et, vl) -> ((Judgement)et).setBenchCode((String)vl), "benchCode");
        setupEpg(_epgMap, et -> ((Judgement)et).getJudgementResultCode(), (et, vl) -> ((Judgement)et).setJudgementResultCode((String)vl), "judgementResultCode");
        setupEpg(_epgMap, et -> ((Judgement)et).getJudgementTypeCode(), (et, vl) -> ((Judgement)et).setJudgementTypeCode((String)vl), "judgementTypeCode");
        setupEpg(_epgMap, et -> ((Judgement)et).getSentence(), (et, vl) -> ((Judgement)et).setSentence((String)vl), "sentence");
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
        setupEfpg(_efpgMap, et -> ((Judgement)et).getClsBench(), (et, vl) -> ((Judgement)et).setClsBench((OptionalEntity<ClsBench>)vl), "clsBench");
        setupEfpg(_efpgMap, et -> ((Judgement)et).getCaseMark(), (et, vl) -> ((Judgement)et).setCaseMark((OptionalEntity<CaseMark>)vl), "caseMark");
        setupEfpg(_efpgMap, et -> ((Judgement)et).getClsEra(), (et, vl) -> ((Judgement)et).setClsEra((OptionalEntity<ClsEra>)vl), "clsEra");
        setupEfpg(_efpgMap, et -> ((Judgement)et).getCourt(), (et, vl) -> ((Judgement)et).setCourt((OptionalEntity<Court>)vl), "court");
        setupEfpg(_efpgMap, et -> ((Judgement)et).getClsJudgementResult(), (et, vl) -> ((Judgement)et).setClsJudgementResult((OptionalEntity<ClsJudgementResult>)vl), "clsJudgementResult");
        setupEfpg(_efpgMap, et -> ((Judgement)et).getClsJudgementType(), (et, vl) -> ((Judgement)et).setClsJudgementType((OptionalEntity<ClsJudgementType>)vl), "clsJudgementType");
        setupEfpg(_efpgMap, et -> ((Judgement)et).getJudgementSelf(), (et, vl) -> ((Judgement)et).setJudgementSelf((OptionalEntity<Judgement>)vl), "judgementSelf");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "JUDGEMENT";
    protected final String _tableDispName = "JUDGEMENT";
    protected final String _tablePropertyName = "judgement";
    protected final TableSqlName _tableSqlName = new TableSqlName("JUDGEMENT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "判決";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnJudgementId = cci("JUDGEMENT_ID", "JUDGEMENT_ID", null, "判決ID", Long.class, "judgementId", null, true, true, true, "BIGINT UNSIGNED", 20, 0, null, false, null, null, null, "judgementSelfList,judgementSourceRelList,judgementUserFavoriteRelList", null, false);
    protected final ColumnInfo _columnJudgementPublicCode = cci("JUDGEMENT_PUBLIC_CODE", "JUDGEMENT_PUBLIC_CODE", null, "判決公開コード", String.class, "judgementPublicCode", null, false, false, true, "VARCHAR", 20, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseName = cci("CASE_NAME", "CASE_NAME", null, "事件名", String.class, "caseName", null, false, false, false, "TEXT", 65535, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrecedentReportsKan = cci("PRECEDENT_REPORTS_KAN", "PRECEDENT_REPORTS_KAN", null, "判例集巻", Integer.class, "precedentReportsKan", null, false, false, false, "INT UNSIGNED", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrecedentReportsGo = cci("PRECEDENT_REPORTS_GO", "PRECEDENT_REPORTS_GO", null, "判例集号", Integer.class, "precedentReportsGo", null, false, false, false, "INT UNSIGNED", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrecedentReportsKo = cci("PRECEDENT_REPORTS_KO", "PRECEDENT_REPORTS_KO", null, "判例集頁", Integer.class, "precedentReportsKo", null, false, false, false, "INT UNSIGNED", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJudgementReportsGo = cci("JUDGEMENT_REPORTS_GO", "JUDGEMENT_REPORTS_GO", null, "裁判集号", Integer.class, "judgementReportsGo", null, false, false, false, "INT UNSIGNED", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJudgementReportsKo = cci("JUDGEMENT_REPORTS_KO", "JUDGEMENT_REPORTS_KO", null, "裁判集頁", Integer.class, "judgementReportsKo", null, false, false, false, "INT UNSIGNED", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJudgementDate = cci("JUDGEMENT_DATE", "JUDGEMENT_DATE", null, "裁判年月日", java.time.LocalDate.class, "judgementDate", null, false, false, false, "DATE", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOriginalJudgementId = cci("ORIGINAL_JUDGEMENT_ID", "ORIGINAL_JUDGEMENT_ID", null, "原審判決ID", Long.class, "originalJudgementId", null, false, false, false, "BIGINT UNSIGNED", 20, 0, null, false, null, null, "judgementSelf", null, null, false);
    protected final ColumnInfo _columnCaseNumberEraCode = cci("CASE_NUMBER_ERA_CODE", "CASE_NUMBER_ERA_CODE", null, "元号コード", String.class, "caseNumberEraCode", null, false, false, true, "VARCHAR", 10, 0, null, false, null, null, "clsEra", null, CDef.DefMeta.Era, false);
    protected final ColumnInfo _columnCaseNumberYear = cci("CASE_NUMBER_YEAR", "CASE_NUMBER_YEAR", null, "事件番号年", Integer.class, "caseNumberYear", null, false, false, true, "INT UNSIGNED", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseMarkId = cci("CASE_MARK_ID", "CASE_MARK_ID", null, "事件符号ID", Integer.class, "caseMarkId", null, false, false, true, "INT UNSIGNED", 10, 0, null, false, null, null, "caseMark", null, null, false);
    protected final ColumnInfo _columnCaseNumberSerialNumber = cci("CASE_NUMBER_SERIAL_NUMBER", "CASE_NUMBER_SERIAL_NUMBER", null, "事件番号連番", Integer.class, "caseNumberSerialNumber", null, false, false, true, "INT UNSIGNED", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCourtId = cci("COURT_ID", "COURT_ID", null, "裁判所ID", Integer.class, "courtId", null, false, false, true, "INT UNSIGNED", 10, 0, null, false, null, null, "court", null, null, false);
    protected final ColumnInfo _columnBenchCode = cci("BENCH_CODE", "BENCH_CODE", null, "法廷種別コード", String.class, "benchCode", null, false, false, false, "VARCHAR", 10, 0, null, false, null, null, "clsBench", null, CDef.DefMeta.Bench, false);
    protected final ColumnInfo _columnJudgementResultCode = cci("JUDGEMENT_RESULT_CODE", "JUDGEMENT_RESULT_CODE", null, "判決結果コード", String.class, "judgementResultCode", null, false, false, false, "VARCHAR", 10, 0, null, false, null, null, "clsJudgementResult", null, CDef.DefMeta.JudgementResult, false);
    protected final ColumnInfo _columnJudgementTypeCode = cci("JUDGEMENT_TYPE_CODE", "JUDGEMENT_TYPE_CODE", null, "判決種別コード", String.class, "judgementTypeCode", null, false, false, false, "VARCHAR", 10, 0, null, false, null, null, "clsJudgementType", null, CDef.DefMeta.JudgementType, false);
    protected final ColumnInfo _columnSentence = cci("SENTENCE", "SENTENCE", null, "判決文", String.class, "sentence", null, false, false, false, "TEXT", 65535, 0, null, false, null, null, null, null, null, false);

    /**
     * (判決ID)JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJudgementId() { return _columnJudgementId; }
    /**
     * (判決公開コード)JUDGEMENT_PUBLIC_CODE: {UQ, NotNull, VARCHAR(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJudgementPublicCode() { return _columnJudgementPublicCode; }
    /**
     * (事件名)CASE_NAME: {TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseName() { return _columnCaseName; }
    /**
     * (判例集巻)PRECEDENT_REPORTS_KAN: {INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrecedentReportsKan() { return _columnPrecedentReportsKan; }
    /**
     * (判例集号)PRECEDENT_REPORTS_GO: {INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrecedentReportsGo() { return _columnPrecedentReportsGo; }
    /**
     * (判例集頁)PRECEDENT_REPORTS_KO: {INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrecedentReportsKo() { return _columnPrecedentReportsKo; }
    /**
     * (裁判集号)JUDGEMENT_REPORTS_GO: {INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJudgementReportsGo() { return _columnJudgementReportsGo; }
    /**
     * (裁判集頁)JUDGEMENT_REPORTS_KO: {INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJudgementReportsKo() { return _columnJudgementReportsKo; }
    /**
     * (裁判年月日)JUDGEMENT_DATE: {DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJudgementDate() { return _columnJudgementDate; }
    /**
     * (原審判決ID)ORIGINAL_JUDGEMENT_ID: {IX, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOriginalJudgementId() { return _columnOriginalJudgementId; }
    /**
     * (元号コード)CASE_NUMBER_ERA_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_ERA, classification=Era}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseNumberEraCode() { return _columnCaseNumberEraCode; }
    /**
     * (事件番号年)CASE_NUMBER_YEAR: {NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseNumberYear() { return _columnCaseNumberYear; }
    /**
     * (事件符号ID)CASE_MARK_ID: {IX, NotNull, INT UNSIGNED(10), FK to CASE_MARK}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseMarkId() { return _columnCaseMarkId; }
    /**
     * (事件番号連番)CASE_NUMBER_SERIAL_NUMBER: {NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseNumberSerialNumber() { return _columnCaseNumberSerialNumber; }
    /**
     * (裁判所ID)COURT_ID: {IX, NotNull, INT UNSIGNED(10), FK to COURT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCourtId() { return _columnCourtId; }
    /**
     * (法廷種別コード)BENCH_CODE: {IX, VARCHAR(10), FK to CLS_BENCH, classification=Bench}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBenchCode() { return _columnBenchCode; }
    /**
     * (判決結果コード)JUDGEMENT_RESULT_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_RESULT, classification=JudgementResult}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJudgementResultCode() { return _columnJudgementResultCode; }
    /**
     * (判決種別コード)JUDGEMENT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_TYPE, classification=JudgementType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJudgementTypeCode() { return _columnJudgementTypeCode; }
    /**
     * (判決文)SENTENCE: {TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSentence() { return _columnSentence; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnJudgementId());
        ls.add(columnJudgementPublicCode());
        ls.add(columnCaseName());
        ls.add(columnPrecedentReportsKan());
        ls.add(columnPrecedentReportsGo());
        ls.add(columnPrecedentReportsKo());
        ls.add(columnJudgementReportsGo());
        ls.add(columnJudgementReportsKo());
        ls.add(columnJudgementDate());
        ls.add(columnOriginalJudgementId());
        ls.add(columnCaseNumberEraCode());
        ls.add(columnCaseNumberYear());
        ls.add(columnCaseMarkId());
        ls.add(columnCaseNumberSerialNumber());
        ls.add(columnCourtId());
        ls.add(columnBenchCode());
        ls.add(columnJudgementResultCode());
        ls.add(columnJudgementTypeCode());
        ls.add(columnSentence());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnJudgementId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnJudgementPublicCode()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * ([区分値]法廷種別)CLS_BENCH by my BENCH_CODE, named 'clsBench'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignClsBench() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBenchCode(), ClsBenchDbm.getInstance().columnBenchCode());
        return cfi("FK_JUDGEMENT_CLS_BENCH", "clsBench", this, ClsBenchDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "judgementList", false);
    }
    /**
     * (事件符号)CASE_MARK by my CASE_MARK_ID, named 'caseMark'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignCaseMark() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCaseMarkId(), CaseMarkDbm.getInstance().columnCaseMarkId());
        return cfi("FK_JUDGEMENT_CASE_MARK", "caseMark", this, CaseMarkDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "judgementList", false);
    }
    /**
     * ([区分値]元号)CLS_ERA by my CASE_NUMBER_ERA_CODE, named 'clsEra'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignClsEra() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCaseNumberEraCode(), ClsEraDbm.getInstance().columnEraCode());
        return cfi("FK_JUDGEMENT_CLS_ERA", "clsEra", this, ClsEraDbm.getInstance(), mp, 2, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "judgementList", false);
    }
    /**
     * (裁判所)COURT by my COURT_ID, named 'court'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignCourt() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCourtId(), CourtDbm.getInstance().columnCourtId());
        return cfi("FK_JUDGEMENT_COURT", "court", this, CourtDbm.getInstance(), mp, 3, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "judgementList", false);
    }
    /**
     * ([区分値]判決結果)CLS_JUDGEMENT_RESULT by my JUDGEMENT_RESULT_CODE, named 'clsJudgementResult'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignClsJudgementResult() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnJudgementResultCode(), ClsJudgementResultDbm.getInstance().columnJudgementResultCode());
        return cfi("FK_JUDGEMENT_CLS_JUDGEMENT_RESULT", "clsJudgementResult", this, ClsJudgementResultDbm.getInstance(), mp, 4, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "judgementList", false);
    }
    /**
     * ([区分値]判決種別)CLS_JUDGEMENT_TYPE by my JUDGEMENT_TYPE_CODE, named 'clsJudgementType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignClsJudgementType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnJudgementTypeCode(), ClsJudgementTypeDbm.getInstance().columnJudgementTypeCode());
        return cfi("FK_JUDGEMENT_CLS_JUDGEMENT_TYPE", "clsJudgementType", this, ClsJudgementTypeDbm.getInstance(), mp, 5, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "judgementList", false);
    }
    /**
     * (判決)JUDGEMENT by my ORIGINAL_JUDGEMENT_ID, named 'judgementSelf'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignJudgementSelf() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnOriginalJudgementId(), JudgementDbm.getInstance().columnJudgementId());
        return cfi("FK_JUDGEMENT_JUDGEMENT", "judgementSelf", this, JudgementDbm.getInstance(), mp, 6, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "judgementSelfList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (判決)JUDGEMENT by ORIGINAL_JUDGEMENT_ID, named 'judgementSelfList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerJudgementSelfList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnJudgementId(), JudgementDbm.getInstance().columnOriginalJudgementId());
        return cri("FK_JUDGEMENT_JUDGEMENT", "judgementSelfList", this, JudgementDbm.getInstance(), mp, false, "judgementSelf");
    }
    /**
     * (判決取得元リレーション)JUDGEMENT_SOURCE_REL by JUDGEMENT_ID, named 'judgementSourceRelList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerJudgementSourceRelList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnJudgementId(), JudgementSourceRelDbm.getInstance().columnJudgementId());
        return cri("FK_JUDGEMENT_SOURCE_REL_JUDGEMENT", "judgementSourceRelList", this, JudgementSourceRelDbm.getInstance(), mp, false, "judgement");
    }
    /**
     * (判決ユーザーお気に入りリレーション)JUDGEMENT_USER_FAVORITE_REL by JUDGEMENT_ID, named 'judgementUserFavoriteRelList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerJudgementUserFavoriteRelList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnJudgementId(), JudgementUserFavoriteRelDbm.getInstance().columnJudgementId());
        return cri("FK_JUDGEMENT_USER_FAVORITE_REL_JUDGEMENT", "judgementUserFavoriteRelList", this, JudgementUserFavoriteRelDbm.getInstance(), mp, false, "judgement");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "tech.law.hanreidb.dbflute.exentity.Judgement"; }
    public String getConditionBeanTypeName() { return "tech.law.hanreidb.dbflute.cbean.JudgementCB"; }
    public String getBehaviorTypeName() { return "tech.law.hanreidb.dbflute.exbhv.JudgementBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Judgement> getEntityType() { return Judgement.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Judgement newEntity() { return new Judgement(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Judgement)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Judgement)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
