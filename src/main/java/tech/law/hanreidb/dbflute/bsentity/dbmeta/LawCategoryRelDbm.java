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
 * The DB meta of LAW_CATEGORY_REL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LawCategoryRelDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LawCategoryRelDbm _instance = new LawCategoryRelDbm();
    private LawCategoryRelDbm() {}
    public static LawCategoryRelDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((LawCategoryRel)et).getLawCategoryRelId(), (et, vl) -> ((LawCategoryRel)et).setLawCategoryRelId(ctl(vl)), "lawCategoryRelId");
        setupEpg(_epgMap, et -> ((LawCategoryRel)et).getLawId(), (et, vl) -> ((LawCategoryRel)et).setLawId(cti(vl)), "lawId");
        setupEpg(_epgMap, et -> ((LawCategoryRel)et).getLawCategoryId(), (et, vl) -> ((LawCategoryRel)et).setLawCategoryId(cti(vl)), "lawCategoryId");
        setupEpg(_epgMap, et -> ((LawCategoryRel)et).getRegisterDatetime(), (et, vl) -> ((LawCategoryRel)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((LawCategoryRel)et).getRegisterUser(), (et, vl) -> ((LawCategoryRel)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((LawCategoryRel)et).getUpdateDatetime(), (et, vl) -> ((LawCategoryRel)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((LawCategoryRel)et).getUpdateUser(), (et, vl) -> ((LawCategoryRel)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((LawCategoryRel)et).getVersionNo(), (et, vl) -> ((LawCategoryRel)et).setVersionNo(ctl(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((LawCategoryRel)et).getLawCategory(), (et, vl) -> ((LawCategoryRel)et).setLawCategory((OptionalEntity<LawCategory>)vl), "lawCategory");
        setupEfpg(_efpgMap, et -> ((LawCategoryRel)et).getLaw(), (et, vl) -> ((LawCategoryRel)et).setLaw((OptionalEntity<Law>)vl), "law");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "LAW_CATEGORY_REL";
    protected final String _tableDispName = "LAW_CATEGORY_REL";
    protected final String _tablePropertyName = "lawCategoryRel";
    protected final TableSqlName _tableSqlName = new TableSqlName("LAW_CATEGORY_REL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "法令カテゴリーリレーション";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLawCategoryRelId = cci("LAW_CATEGORY_REL_ID", "LAW_CATEGORY_REL_ID", null, "法令カテゴリーリレーションID", Long.class, "lawCategoryRelId", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLawId = cci("LAW_ID", "LAW_ID", null, "法令ID", Integer.class, "lawId", null, false, false, true, "INT", 10, 0, null, false, null, null, "law", null, null, false);
    protected final ColumnInfo _columnLawCategoryId = cci("LAW_CATEGORY_ID", "LAW_CATEGORY_ID", null, "法令カテゴリーID", Integer.class, "lawCategoryId", null, false, false, true, "INT", 10, 0, null, false, null, null, "lawCategory", null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザー", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョン番号", Long.class, "versionNo", null, false, false, true, "BIGINT UNSIGNED", 20, 0, "0", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * (法令カテゴリーリレーションID)LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawCategoryRelId() { return _columnLawCategoryRelId; }
    /**
     * (法令ID)LAW_ID: {UQ+, NotNull, INT(10), FK to LAW}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawId() { return _columnLawId; }
    /**
     * (法令カテゴリーID)LAW_CATEGORY_ID: {+UQ, IX, NotNull, INT(10), FK to LAW_CATEGORY}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawCategoryId() { return _columnLawCategoryId; }
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
        ls.add(columnLawCategoryRelId());
        ls.add(columnLawId());
        ls.add(columnLawCategoryId());
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
    protected UniqueInfo cpui() { return hpcpui(columnLawCategoryRelId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnLawId());
        ls.add(columnLawCategoryId());
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
     * (法令カテゴリー)LAW_CATEGORY by my LAW_CATEGORY_ID, named 'lawCategory'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignLawCategory() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLawCategoryId(), LawCategoryDbm.getInstance().columnLawCategoryId());
        return cfi("FK_LAW_CATEGORY_REL_LAW_CATEGORY", "lawCategory", this, LawCategoryDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "lawCategoryRelList", false);
    }
    /**
     * (法令)LAW by my LAW_ID, named 'law'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignLaw() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLawId(), LawDbm.getInstance().columnLawId());
        return cfi("FK_LAW_CATEGORY_REL_LAW", "law", this, LawDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "lawCategoryRelList", false);
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
    public String getEntityTypeName() { return "tech.law.hanreidb.dbflute.exentity.LawCategoryRel"; }
    public String getConditionBeanTypeName() { return "tech.law.hanreidb.dbflute.cbean.LawCategoryRelCB"; }
    public String getBehaviorTypeName() { return "tech.law.hanreidb.dbflute.exbhv.LawCategoryRelBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LawCategoryRel> getEntityType() { return LawCategoryRel.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LawCategoryRel newEntity() { return new LawCategoryRel(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LawCategoryRel)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LawCategoryRel)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
