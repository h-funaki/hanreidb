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
 * The DB meta of LAW_SOURCE_REL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LawSourceRelDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LawSourceRelDbm _instance = new LawSourceRelDbm();
    private LawSourceRelDbm() {}
    public static LawSourceRelDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((LawSourceRel)et).getLawSourceRelId(), (et, vl) -> ((LawSourceRel)et).setLawSourceRelId(ctl(vl)), "lawSourceRelId");
        setupEpg(_epgMap, et -> ((LawSourceRel)et).getLawId(), (et, vl) -> ((LawSourceRel)et).setLawId(cti(vl)), "lawId");
        setupEpg(_epgMap, et -> ((LawSourceRel)et).getSourceCode(), (et, vl) -> ((LawSourceRel)et).setSourceCode((String)vl), "sourceCode");
        setupEpg(_epgMap, et -> ((LawSourceRel)et).getLawSourceId(), (et, vl) -> ((LawSourceRel)et).setLawSourceId((String)vl), "lawSourceId");
        setupEpg(_epgMap, et -> ((LawSourceRel)et).getRegisterDatetime(), (et, vl) -> ((LawSourceRel)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((LawSourceRel)et).getRegisterUser(), (et, vl) -> ((LawSourceRel)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((LawSourceRel)et).getUpdateDatetime(), (et, vl) -> ((LawSourceRel)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((LawSourceRel)et).getUpdateUser(), (et, vl) -> ((LawSourceRel)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((LawSourceRel)et).getVersionNo(), (et, vl) -> ((LawSourceRel)et).setVersionNo(ctl(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((LawSourceRel)et).getLaw(), (et, vl) -> ((LawSourceRel)et).setLaw((OptionalEntity<Law>)vl), "law");
        setupEfpg(_efpgMap, et -> ((LawSourceRel)et).getClsSource(), (et, vl) -> ((LawSourceRel)et).setClsSource((OptionalEntity<ClsSource>)vl), "clsSource");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "LAW_SOURCE_REL";
    protected final String _tableDispName = "LAW_SOURCE_REL";
    protected final String _tablePropertyName = "lawSourceRel";
    protected final TableSqlName _tableSqlName = new TableSqlName("LAW_SOURCE_REL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "法令取得元リレーション";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLawSourceRelId = cci("LAW_SOURCE_REL_ID", "LAW_SOURCE_REL_ID", null, "法令取得元リレーションID", Long.class, "lawSourceRelId", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLawId = cci("LAW_ID", "LAW_ID", null, "法令ID", Integer.class, "lawId", null, false, false, true, "INT", 10, 0, null, false, null, null, "law", null, null, false);
    protected final ColumnInfo _columnSourceCode = cci("SOURCE_CODE", "SOURCE_CODE", null, "取得元コード", String.class, "sourceCode", null, false, false, true, "VARCHAR", 20, 0, null, false, null, null, "clsSource", null, CDef.DefMeta.Source, false);
    protected final ColumnInfo _columnLawSourceId = cci("LAW_SOURCE_ID", "LAW_SOURCE_ID", null, "法令取得元ID", String.class, "lawSourceId", null, false, false, true, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザー", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョン番号", Long.class, "versionNo", null, false, false, true, "BIGINT UNSIGNED", 20, 0, "0", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * (法令取得元リレーションID)LAW_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawSourceRelId() { return _columnLawSourceRelId; }
    /**
     * (法令ID)LAW_ID: {IX, NotNull, INT(10), FK to LAW}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawId() { return _columnLawId; }
    /**
     * (取得元コード)SOURCE_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSourceCode() { return _columnSourceCode; }
    /**
     * (法令取得元ID)LAW_SOURCE_ID: {NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawSourceId() { return _columnLawSourceId; }
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
        ls.add(columnLawSourceRelId());
        ls.add(columnLawId());
        ls.add(columnSourceCode());
        ls.add(columnLawSourceId());
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
    protected UniqueInfo cpui() { return hpcpui(columnLawSourceRelId()); }
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
     * (法令)LAW by my LAW_ID, named 'law'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignLaw() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLawId(), LawDbm.getInstance().columnLawId());
        return cfi("FK_LAW_SOURCE_REL_LAW", "law", this, LawDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "lawSourceRelList", false);
    }
    /**
     * ([区分値]取得元)CLS_SOURCE by my SOURCE_CODE, named 'clsSource'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignClsSource() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSourceCode(), ClsSourceDbm.getInstance().columnSourceCode());
        return cfi("FK_LAW_SOURCE_REL_CLS_SOURCE", "clsSource", this, ClsSourceDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "lawSourceRelList", false);
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
    public String getEntityTypeName() { return "tech.law.hanreidb.dbflute.exentity.LawSourceRel"; }
    public String getConditionBeanTypeName() { return "tech.law.hanreidb.dbflute.cbean.LawSourceRelCB"; }
    public String getBehaviorTypeName() { return "tech.law.hanreidb.dbflute.exbhv.LawSourceRelBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LawSourceRel> getEntityType() { return LawSourceRel.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LawSourceRel newEntity() { return new LawSourceRel(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LawSourceRel)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LawSourceRel)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
