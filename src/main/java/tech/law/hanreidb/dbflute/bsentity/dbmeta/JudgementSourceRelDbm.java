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
 * The DB meta of JUDGEMENT_SOURCE_REL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class JudgementSourceRelDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final JudgementSourceRelDbm _instance = new JudgementSourceRelDbm();
    private JudgementSourceRelDbm() {}
    public static JudgementSourceRelDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((JudgementSourceRel)et).getJudgementSourceRelId(), (et, vl) -> ((JudgementSourceRel)et).setJudgementSourceRelId(ctl(vl)), "judgementSourceRelId");
        setupEpg(_epgMap, et -> ((JudgementSourceRel)et).getJudgementId(), (et, vl) -> ((JudgementSourceRel)et).setJudgementId(ctl(vl)), "judgementId");
        setupEpg(_epgMap, et -> ((JudgementSourceRel)et).getSourceCode(), (et, vl) -> ((JudgementSourceRel)et).setSourceCode((String)vl), "sourceCode");
        setupEpg(_epgMap, et -> ((JudgementSourceRel)et).getJudgementSourceId(), (et, vl) -> ((JudgementSourceRel)et).setJudgementSourceId((String)vl), "judgementSourceId");
        setupEpg(_epgMap, et -> ((JudgementSourceRel)et).getJudgementSourceSentence(), (et, vl) -> ((JudgementSourceRel)et).setJudgementSourceSentence((String)vl), "judgementSourceSentence");
        setupEpg(_epgMap, et -> ((JudgementSourceRel)et).getRegisterDatetime(), (et, vl) -> ((JudgementSourceRel)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((JudgementSourceRel)et).getRegisterUser(), (et, vl) -> ((JudgementSourceRel)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((JudgementSourceRel)et).getUpdateDatetime(), (et, vl) -> ((JudgementSourceRel)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((JudgementSourceRel)et).getUpdateUser(), (et, vl) -> ((JudgementSourceRel)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((JudgementSourceRel)et).getVersionNo(), (et, vl) -> ((JudgementSourceRel)et).setVersionNo(ctl(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((JudgementSourceRel)et).getJudgement(), (et, vl) -> ((JudgementSourceRel)et).setJudgement((OptionalEntity<Judgement>)vl), "judgement");
        setupEfpg(_efpgMap, et -> ((JudgementSourceRel)et).getClsSource(), (et, vl) -> ((JudgementSourceRel)et).setClsSource((OptionalEntity<ClsSource>)vl), "clsSource");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "JUDGEMENT_SOURCE_REL";
    protected final String _tableDispName = "JUDGEMENT_SOURCE_REL";
    protected final String _tablePropertyName = "judgementSourceRel";
    protected final TableSqlName _tableSqlName = new TableSqlName("JUDGEMENT_SOURCE_REL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "判決取得元リレーション";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnJudgementSourceRelId = cci("JUDGEMENT_SOURCE_REL_ID", "JUDGEMENT_SOURCE_REL_ID", null, "判決取得元リレーションID", Long.class, "judgementSourceRelId", null, true, true, true, "BIGINT UNSIGNED", 20, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJudgementId = cci("JUDGEMENT_ID", "JUDGEMENT_ID", null, "判決ID", Long.class, "judgementId", null, false, false, true, "BIGINT UNSIGNED", 20, 0, null, false, null, null, "judgement", null, null, false);
    protected final ColumnInfo _columnSourceCode = cci("SOURCE_CODE", "SOURCE_CODE", null, "取得元コード", String.class, "sourceCode", null, false, false, true, "VARCHAR", 20, 0, null, false, null, null, "clsSource", null, CDef.DefMeta.Source, false);
    protected final ColumnInfo _columnJudgementSourceId = cci("JUDGEMENT_SOURCE_ID", "JUDGEMENT_SOURCE_ID", null, "判決取得元ID", String.class, "judgementSourceId", null, false, false, true, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJudgementSourceSentence = cci("JUDGEMENT_SOURCE_SENTENCE", "JUDGEMENT_SOURCE_SENTENCE", null, "判決文", String.class, "judgementSourceSentence", null, false, false, false, "TEXT", 65535, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザー", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョン番号", Long.class, "versionNo", null, false, false, true, "BIGINT UNSIGNED", 20, 0, "0", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * (判決取得元リレーションID)JUDGEMENT_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJudgementSourceRelId() { return _columnJudgementSourceRelId; }
    /**
     * (判決ID)JUDGEMENT_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJudgementId() { return _columnJudgementId; }
    /**
     * (取得元コード)SOURCE_CODE: {UQ+, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSourceCode() { return _columnSourceCode; }
    /**
     * (判決取得元ID)JUDGEMENT_SOURCE_ID: {+UQ, NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJudgementSourceId() { return _columnJudgementSourceId; }
    /**
     * (判決文)JUDGEMENT_SOURCE_SENTENCE: {TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJudgementSourceSentence() { return _columnJudgementSourceSentence; }
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
        ls.add(columnJudgementSourceRelId());
        ls.add(columnJudgementId());
        ls.add(columnSourceCode());
        ls.add(columnJudgementSourceId());
        ls.add(columnJudgementSourceSentence());
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
    protected UniqueInfo cpui() { return hpcpui(columnJudgementSourceRelId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnSourceCode());
        ls.add(columnJudgementSourceId());
        return hpcui(ls);
    }

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
        return cfi("FK_JUDGEMENT_SOURCE_REL_JUDGEMENT", "judgement", this, JudgementDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "judgementSourceRelList", false);
    }
    /**
     * ([区分値]取得元)CLS_SOURCE by my SOURCE_CODE, named 'clsSource'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignClsSource() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSourceCode(), ClsSourceDbm.getInstance().columnSourceCode());
        return cfi("FK_JUDGEMENT_SOURCE_REL_SOURCE", "clsSource", this, ClsSourceDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "judgementSourceRelList", false);
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
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser(), columnVersionNo()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser(), columnVersionNo()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime(), columnUpdateUser()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "tech.law.hanreidb.dbflute.exentity.JudgementSourceRel"; }
    public String getConditionBeanTypeName() { return "tech.law.hanreidb.dbflute.cbean.JudgementSourceRelCB"; }
    public String getBehaviorTypeName() { return "tech.law.hanreidb.dbflute.exbhv.JudgementSourceRelBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<JudgementSourceRel> getEntityType() { return JudgementSourceRel.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public JudgementSourceRel newEntity() { return new JudgementSourceRel(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((JudgementSourceRel)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((JudgementSourceRel)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
