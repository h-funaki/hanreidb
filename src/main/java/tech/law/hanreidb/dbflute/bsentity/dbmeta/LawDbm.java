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
 * The DB meta of LAW. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LawDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LawDbm _instance = new LawDbm();
    private LawDbm() {}
    public static LawDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Law)et).getLawId(), (et, vl) -> ((Law)et).setLawId(cti(vl)), "lawId");
        setupEpg(_epgMap, et -> ((Law)et).getLawTypeCode(), (et, vl) -> ((Law)et).setLawTypeCode((String)vl), "lawTypeCode");
        setupEpg(_epgMap, et -> ((Law)et).getLawPublicCode(), (et, vl) -> ((Law)et).setLawPublicCode((String)vl), "lawPublicCode");
        setupEpg(_epgMap, et -> ((Law)et).getLawName(), (et, vl) -> ((Law)et).setLawName((String)vl), "lawName");
        setupEpg(_epgMap, et -> ((Law)et).getLawNumber(), (et, vl) -> ((Law)et).setLawNumber((String)vl), "lawNumber");
        setupEpg(_epgMap, et -> ((Law)et).getPromulgationDate(), (et, vl) -> ((Law)et).setPromulgationDate(ctld(vl)), "promulgationDate");
        setupEpg(_epgMap, et -> ((Law)et).getEffectiveDate(), (et, vl) -> ((Law)et).setEffectiveDate(ctld(vl)), "effectiveDate");
        setupEpg(_epgMap, et -> ((Law)et).getRegisterDatetime(), (et, vl) -> ((Law)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((Law)et).getRegisterUser(), (et, vl) -> ((Law)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((Law)et).getUpdateDatetime(), (et, vl) -> ((Law)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((Law)et).getUpdateUser(), (et, vl) -> ((Law)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((Law)et).getVersionNo(), (et, vl) -> ((Law)et).setVersionNo(ctl(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((Law)et).getLawType(), (et, vl) -> ((Law)et).setLawType((OptionalEntity<LawType>)vl), "lawType");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "LAW";
    protected final String _tableDispName = "LAW";
    protected final String _tablePropertyName = "law";
    protected final TableSqlName _tableSqlName = new TableSqlName("LAW", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "法令";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLawId = cci("LAW_ID", "LAW_ID", null, "法令ID", Integer.class, "lawId", null, true, true, true, "INT", 10, 0, null, false, null, null, null, "lawAliasList,lawCategoryRelList,lawHistoryByAmendLawIdList,lawHistoryByLawIdList,lawSourceRelList,sourceLawCategoryRelList", null, false);
    protected final ColumnInfo _columnLawTypeCode = cci("LAW_TYPE_CODE", "LAW_TYPE_CODE", null, "法令種別コード", String.class, "lawTypeCode", null, false, false, true, "VARCHAR", 20, 0, null, false, null, null, "lawType", null, null, false);
    protected final ColumnInfo _columnLawPublicCode = cci("LAW_PUBLIC_CODE", "LAW_PUBLIC_CODE", null, "法令公開コード", String.class, "lawPublicCode", null, false, false, true, "VARCHAR", 12, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLawName = cci("LAW_NAME", "LAW_NAME", null, "法令名", String.class, "lawName", null, false, false, true, "TEXT", 65535, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLawNumber = cci("LAW_NUMBER", "LAW_NUMBER", null, "法令番号", String.class, "lawNumber", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPromulgationDate = cci("PROMULGATION_DATE", "PROMULGATION_DATE", null, "公布日", java.time.LocalDate.class, "promulgationDate", null, false, false, false, "DATE", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEffectiveDate = cci("EFFECTIVE_DATE", "EFFECTIVE_DATE", null, "施行日", java.time.LocalDate.class, "effectiveDate", null, false, false, false, "DATE", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザー", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョン番号", Long.class, "versionNo", null, false, false, true, "BIGINT UNSIGNED", 20, 0, "0", false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * (法令ID)LAW_ID: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawId() { return _columnLawId; }
    /**
     * (法令種別コード)LAW_TYPE_CODE: {IX, NotNull, VARCHAR(20), FK to LAW_TYPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawTypeCode() { return _columnLawTypeCode; }
    /**
     * (法令公開コード)LAW_PUBLIC_CODE: {UQ, NotNull, VARCHAR(12)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawPublicCode() { return _columnLawPublicCode; }
    /**
     * (法令名)LAW_NAME: {NotNull, TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawName() { return _columnLawName; }
    /**
     * (法令番号)LAW_NUMBER: {UQ, NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawNumber() { return _columnLawNumber; }
    /**
     * (公布日)PROMULGATION_DATE: {DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPromulgationDate() { return _columnPromulgationDate; }
    /**
     * (施行日)EFFECTIVE_DATE: {DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEffectiveDate() { return _columnEffectiveDate; }
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
        ls.add(columnLawId());
        ls.add(columnLawTypeCode());
        ls.add(columnLawPublicCode());
        ls.add(columnLawName());
        ls.add(columnLawNumber());
        ls.add(columnPromulgationDate());
        ls.add(columnEffectiveDate());
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
    protected UniqueInfo cpui() { return hpcpui(columnLawId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOfLawNumber() { return hpcui(columnLawNumber()); }
    public UniqueInfo uniqueOfLawPublicCode() { return hpcui(columnLawPublicCode()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * (法令種別)LAW_TYPE by my LAW_TYPE_CODE, named 'lawType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignLawType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLawTypeCode(), LawTypeDbm.getInstance().columnLawTypeCode());
        return cfi("FK_LAW_LAW_TYPE", "lawType", this, LawTypeDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "lawList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (法令略称)LAW_ALIAS by LAW_ID, named 'lawAliasList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerLawAliasList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLawId(), LawAliasDbm.getInstance().columnLawId());
        return cri("FK_LAW_ALIAS_LAW", "lawAliasList", this, LawAliasDbm.getInstance(), mp, false, "law");
    }
    /**
     * (法令カテゴリーリレーション)LAW_CATEGORY_REL by LAW_ID, named 'lawCategoryRelList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerLawCategoryRelList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLawId(), LawCategoryRelDbm.getInstance().columnLawId());
        return cri("FK_LAW_CATEGORY_REL_LAW", "lawCategoryRelList", this, LawCategoryRelDbm.getInstance(), mp, false, "law");
    }
    /**
     * (法令履歴)LAW_HISTORY by AMEND_LAW_ID, named 'lawHistoryByAmendLawIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerLawHistoryByAmendLawIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLawId(), LawHistoryDbm.getInstance().columnAmendLawId());
        return cri("FK_LAW_HISTORY_AMEND_LAW", "lawHistoryByAmendLawIdList", this, LawHistoryDbm.getInstance(), mp, false, "lawByAmendLawId");
    }
    /**
     * (法令履歴)LAW_HISTORY by LAW_ID, named 'lawHistoryByLawIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerLawHistoryByLawIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLawId(), LawHistoryDbm.getInstance().columnLawId());
        return cri("FK_LAW_HISTORY_LAW", "lawHistoryByLawIdList", this, LawHistoryDbm.getInstance(), mp, false, "lawByLawId");
    }
    /**
     * (法令取得元リレーション)LAW_SOURCE_REL by LAW_ID, named 'lawSourceRelList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerLawSourceRelList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLawId(), LawSourceRelDbm.getInstance().columnLawId());
        return cri("FK_LAW_SOURCE_REL_LAW", "lawSourceRelList", this, LawSourceRelDbm.getInstance(), mp, false, "law");
    }
    /**
     * (取得元法令カテゴリーリレーション)SOURCE_LAW_CATEGORY_REL by LAW_ID, named 'sourceLawCategoryRelList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerSourceLawCategoryRelList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLawId(), SourceLawCategoryRelDbm.getInstance().columnLawId());
        return cri("FK_SOURCE_LAW_CATEGORY_REL_LAW", "sourceLawCategoryRelList", this, SourceLawCategoryRelDbm.getInstance(), mp, false, "law");
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
    public String getEntityTypeName() { return "tech.law.hanreidb.dbflute.exentity.Law"; }
    public String getConditionBeanTypeName() { return "tech.law.hanreidb.dbflute.cbean.LawCB"; }
    public String getBehaviorTypeName() { return "tech.law.hanreidb.dbflute.exbhv.LawBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Law> getEntityType() { return Law.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Law newEntity() { return new Law(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Law)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Law)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
