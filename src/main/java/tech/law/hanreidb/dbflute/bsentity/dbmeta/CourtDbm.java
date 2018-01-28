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
 * The DB meta of COURT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class CourtDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final CourtDbm _instance = new CourtDbm();
    private CourtDbm() {}
    public static CourtDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Court)et).getCourtId(), (et, vl) -> ((Court)et).setCourtId(cti(vl)), "courtId");
        setupEpg(_epgMap, et -> ((Court)et).getCourtName(), (et, vl) -> ((Court)et).setCourtName((String)vl), "courtName");
        setupEpg(_epgMap, et -> ((Court)et).getCourtAlias(), (et, vl) -> ((Court)et).setCourtAlias((String)vl), "courtAlias");
        setupEpg(_epgMap, et -> ((Court)et).getCourtTypeCode(), (et, vl) -> ((Court)et).setCourtTypeCode((String)vl), "courtTypeCode");
        setupEpg(_epgMap, et -> ((Court)et).getRegisterDatetime(), (et, vl) -> ((Court)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((Court)et).getRegisterUser(), (et, vl) -> ((Court)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((Court)et).getUpdateDatetime(), (et, vl) -> ((Court)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((Court)et).getUpdateUser(), (et, vl) -> ((Court)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((Court)et).getVersionNo(), (et, vl) -> ((Court)et).setVersionNo(ctl(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((Court)et).getClsCourtType(), (et, vl) -> ((Court)et).setClsCourtType((OptionalEntity<ClsCourtType>)vl), "clsCourtType");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "COURT";
    protected final String _tableDispName = "COURT";
    protected final String _tablePropertyName = "court";
    protected final TableSqlName _tableSqlName = new TableSqlName("COURT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "裁判所";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCourtId = cci("COURT_ID", "COURT_ID", null, "裁判所ID", Integer.class, "courtId", null, true, true, true, "INT UNSIGNED", 10, 0, null, false, null, null, null, "judgementList", null, false);
    protected final ColumnInfo _columnCourtName = cci("COURT_NAME", "COURT_NAME", null, "裁判所名", String.class, "courtName", null, false, false, true, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCourtAlias = cci("COURT_ALIAS", "COURT_ALIAS", null, "裁判所別名", String.class, "courtAlias", null, false, false, true, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCourtTypeCode = cci("COURT_TYPE_CODE", "COURT_TYPE_CODE", null, "裁判所種別コード", String.class, "courtTypeCode", null, false, false, true, "VARCHAR", 10, 0, null, false, null, null, "clsCourtType", null, CDef.DefMeta.CourtType, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザー", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョン番号", Long.class, "versionNo", null, false, false, true, "BIGINT UNSIGNED", 20, 0, "0", false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * (裁判所ID)COURT_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCourtId() { return _columnCourtId; }
    /**
     * (裁判所名)COURT_NAME: {UQ, NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCourtName() { return _columnCourtName; }
    /**
     * (裁判所別名)COURT_ALIAS: {UQ, NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCourtAlias() { return _columnCourtAlias; }
    /**
     * (裁判所種別コード)COURT_TYPE_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCourtTypeCode() { return _columnCourtTypeCode; }
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
        ls.add(columnCourtId());
        ls.add(columnCourtName());
        ls.add(columnCourtAlias());
        ls.add(columnCourtTypeCode());
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
    protected UniqueInfo cpui() { return hpcpui(columnCourtId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOfCourtAlias() { return hpcui(columnCourtAlias()); }
    public UniqueInfo uniqueOfCourtName() { return hpcui(columnCourtName()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * ([区分値]裁判所種別)CLS_COURT_TYPE by my COURT_TYPE_CODE, named 'clsCourtType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignClsCourtType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCourtTypeCode(), ClsCourtTypeDbm.getInstance().columnCourtTypeCode());
        return cfi("FK_COURT_CLS_COURT_TYPE", "clsCourtType", this, ClsCourtTypeDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "courtList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (判決)JUDGEMENT by COURT_ID, named 'judgementList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerJudgementList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCourtId(), JudgementDbm.getInstance().columnCourtId());
        return cri("FK_JUDGEMENT_COURT", "judgementList", this, JudgementDbm.getInstance(), mp, false, "court");
    }

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
    public String getEntityTypeName() { return "tech.law.hanreidb.dbflute.exentity.Court"; }
    public String getConditionBeanTypeName() { return "tech.law.hanreidb.dbflute.cbean.CourtCB"; }
    public String getBehaviorTypeName() { return "tech.law.hanreidb.dbflute.exbhv.CourtBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Court> getEntityType() { return Court.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Court newEntity() { return new Court(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Court)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Court)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
