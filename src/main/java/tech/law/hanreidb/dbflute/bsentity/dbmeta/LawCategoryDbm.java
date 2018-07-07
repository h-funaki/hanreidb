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
 * The DB meta of LAW_CATEGORY. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LawCategoryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LawCategoryDbm _instance = new LawCategoryDbm();
    private LawCategoryDbm() {}
    public static LawCategoryDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((LawCategory)et).getLawCategoryId(), (et, vl) -> ((LawCategory)et).setLawCategoryId(cti(vl)), "lawCategoryId");
        setupEpg(_epgMap, et -> ((LawCategory)et).getLawCategoryName(), (et, vl) -> ((LawCategory)et).setLawCategoryName((String)vl), "lawCategoryName");
        setupEpg(_epgMap, et -> ((LawCategory)et).getLawCategoryAlias(), (et, vl) -> ((LawCategory)et).setLawCategoryAlias((String)vl), "lawCategoryAlias");
        setupEpg(_epgMap, et -> ((LawCategory)et).getRegisterDatetime(), (et, vl) -> ((LawCategory)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((LawCategory)et).getRegisterUser(), (et, vl) -> ((LawCategory)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((LawCategory)et).getUpdateDatetime(), (et, vl) -> ((LawCategory)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((LawCategory)et).getUpdateUser(), (et, vl) -> ((LawCategory)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((LawCategory)et).getVersionNo(), (et, vl) -> ((LawCategory)et).setVersionNo(ctl(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "LAW_CATEGORY";
    protected final String _tableDispName = "LAW_CATEGORY";
    protected final String _tablePropertyName = "lawCategory";
    protected final TableSqlName _tableSqlName = new TableSqlName("LAW_CATEGORY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "法令カテゴリー";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLawCategoryId = cci("LAW_CATEGORY_ID", "LAW_CATEGORY_ID", null, "法令カテゴリーID", Integer.class, "lawCategoryId", null, true, true, true, "INT", 10, 0, null, false, null, null, null, "lawCategoryRelList,sourceLawCategoryList", null, false);
    protected final ColumnInfo _columnLawCategoryName = cci("LAW_CATEGORY_NAME", "LAW_CATEGORY_NAME", null, "法令カテゴリー名", String.class, "lawCategoryName", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLawCategoryAlias = cci("LAW_CATEGORY_ALIAS", "LAW_CATEGORY_ALIAS", null, "法令カテゴリー別名", String.class, "lawCategoryAlias", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザー", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョン番号", Long.class, "versionNo", null, false, false, true, "BIGINT UNSIGNED", 20, 0, "0", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * (法令カテゴリーID)LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawCategoryId() { return _columnLawCategoryId; }
    /**
     * (法令カテゴリー名)LAW_CATEGORY_NAME: {UQ, NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawCategoryName() { return _columnLawCategoryName; }
    /**
     * (法令カテゴリー別名)LAW_CATEGORY_ALIAS: {UQ, NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawCategoryAlias() { return _columnLawCategoryAlias; }
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
        ls.add(columnLawCategoryId());
        ls.add(columnLawCategoryName());
        ls.add(columnLawCategoryAlias());
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
    protected UniqueInfo cpui() { return hpcpui(columnLawCategoryId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOfLawCategoryAlias() { return hpcui(columnLawCategoryAlias()); }
    public UniqueInfo uniqueOfLawCategoryName() { return hpcui(columnLawCategoryName()); }

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
     * (法令カテゴリーリレーション)LAW_CATEGORY_REL by LAW_CATEGORY_ID, named 'lawCategoryRelList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerLawCategoryRelList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLawCategoryId(), LawCategoryRelDbm.getInstance().columnLawCategoryId());
        return cri("FK_LAW_CATEGORY_REL_LAW_CATEGORY", "lawCategoryRelList", this, LawCategoryRelDbm.getInstance(), mp, false, "lawCategory");
    }
    /**
     * (取得元法令カテゴリー)SOURCE_LAW_CATEGORY by LAW_CATEGORY_ID, named 'sourceLawCategoryList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerSourceLawCategoryList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLawCategoryId(), SourceLawCategoryDbm.getInstance().columnLawCategoryId());
        return cri("FK_SOURCE_LAW_CATEGORY_LAW_CATEGORY", "sourceLawCategoryList", this, SourceLawCategoryDbm.getInstance(), mp, false, "lawCategory");
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
    public String getEntityTypeName() { return "tech.law.hanreidb.dbflute.exentity.LawCategory"; }
    public String getConditionBeanTypeName() { return "tech.law.hanreidb.dbflute.cbean.LawCategoryCB"; }
    public String getBehaviorTypeName() { return "tech.law.hanreidb.dbflute.exbhv.LawCategoryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LawCategory> getEntityType() { return LawCategory.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LawCategory newEntity() { return new LawCategory(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LawCategory)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LawCategory)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
