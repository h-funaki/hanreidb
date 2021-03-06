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
 * The DB meta of SOURCE_LAW_CATEGORY_REL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SourceLawCategoryRelDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SourceLawCategoryRelDbm _instance = new SourceLawCategoryRelDbm();
    private SourceLawCategoryRelDbm() {}
    public static SourceLawCategoryRelDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SourceLawCategoryRel)et).getSourceLawCategoryRelId(), (et, vl) -> ((SourceLawCategoryRel)et).setSourceLawCategoryRelId(ctl(vl)), "sourceLawCategoryRelId");
        setupEpg(_epgMap, et -> ((SourceLawCategoryRel)et).getLawId(), (et, vl) -> ((SourceLawCategoryRel)et).setLawId(cti(vl)), "lawId");
        setupEpg(_epgMap, et -> ((SourceLawCategoryRel)et).getSourceLawCategoryId(), (et, vl) -> ((SourceLawCategoryRel)et).setSourceLawCategoryId(cti(vl)), "sourceLawCategoryId");
        setupEpg(_epgMap, et -> ((SourceLawCategoryRel)et).getRegisterDatetime(), (et, vl) -> ((SourceLawCategoryRel)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((SourceLawCategoryRel)et).getRegisterUser(), (et, vl) -> ((SourceLawCategoryRel)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((SourceLawCategoryRel)et).getUpdateDatetime(), (et, vl) -> ((SourceLawCategoryRel)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((SourceLawCategoryRel)et).getUpdateUser(), (et, vl) -> ((SourceLawCategoryRel)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((SourceLawCategoryRel)et).getVersionNo(), (et, vl) -> ((SourceLawCategoryRel)et).setVersionNo(ctl(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((SourceLawCategoryRel)et).getLaw(), (et, vl) -> ((SourceLawCategoryRel)et).setLaw((OptionalEntity<Law>)vl), "law");
        setupEfpg(_efpgMap, et -> ((SourceLawCategoryRel)et).getSourceLawCategory(), (et, vl) -> ((SourceLawCategoryRel)et).setSourceLawCategory((OptionalEntity<SourceLawCategory>)vl), "sourceLawCategory");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SOURCE_LAW_CATEGORY_REL";
    protected final String _tableDispName = "SOURCE_LAW_CATEGORY_REL";
    protected final String _tablePropertyName = "sourceLawCategoryRel";
    protected final TableSqlName _tableSqlName = new TableSqlName("SOURCE_LAW_CATEGORY_REL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "取得元法令カテゴリーリレーション";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSourceLawCategoryRelId = cci("SOURCE_LAW_CATEGORY_REL_ID", "SOURCE_LAW_CATEGORY_REL_ID", null, "取得元法令カテゴリーリレーションID", Long.class, "sourceLawCategoryRelId", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLawId = cci("LAW_ID", "LAW_ID", null, "法令ID", Integer.class, "lawId", null, false, false, true, "INT", 10, 0, null, false, null, null, "law", null, null, false);
    protected final ColumnInfo _columnSourceLawCategoryId = cci("SOURCE_LAW_CATEGORY_ID", "SOURCE_LAW_CATEGORY_ID", null, "取得元法令カテゴリーID", Integer.class, "sourceLawCategoryId", null, false, false, true, "INT", 10, 0, null, false, null, null, "sourceLawCategory", null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザー", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョン番号", Long.class, "versionNo", null, false, false, true, "BIGINT UNSIGNED", 20, 0, "0", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * (取得元法令カテゴリーリレーションID)SOURCE_LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSourceLawCategoryRelId() { return _columnSourceLawCategoryRelId; }
    /**
     * (法令ID)LAW_ID: {IX, NotNull, INT(10), FK to LAW}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawId() { return _columnLawId; }
    /**
     * (取得元法令カテゴリーID)SOURCE_LAW_CATEGORY_ID: {IX, NotNull, INT(10), FK to SOURCE_LAW_CATEGORY}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSourceLawCategoryId() { return _columnSourceLawCategoryId; }
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
        ls.add(columnSourceLawCategoryRelId());
        ls.add(columnLawId());
        ls.add(columnSourceLawCategoryId());
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
    protected UniqueInfo cpui() { return hpcpui(columnSourceLawCategoryRelId()); }
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
        return cfi("FK_SOURCE_LAW_CATEGORY_REL_LAW", "law", this, LawDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "sourceLawCategoryRelList", false);
    }
    /**
     * (取得元法令カテゴリー)SOURCE_LAW_CATEGORY by my SOURCE_LAW_CATEGORY_ID, named 'sourceLawCategory'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignSourceLawCategory() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSourceLawCategoryId(), SourceLawCategoryDbm.getInstance().columnSourceLawCategoryId());
        return cfi("FK_SOURCE_LAW_CATEGORY_REL_SOURCE_LAW_CATEGORY", "sourceLawCategory", this, SourceLawCategoryDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "sourceLawCategoryRelList", false);
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
    public String getEntityTypeName() { return "tech.law.hanreidb.dbflute.exentity.SourceLawCategoryRel"; }
    public String getConditionBeanTypeName() { return "tech.law.hanreidb.dbflute.cbean.SourceLawCategoryRelCB"; }
    public String getBehaviorTypeName() { return "tech.law.hanreidb.dbflute.exbhv.SourceLawCategoryRelBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SourceLawCategoryRel> getEntityType() { return SourceLawCategoryRel.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SourceLawCategoryRel newEntity() { return new SourceLawCategoryRel(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SourceLawCategoryRel)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SourceLawCategoryRel)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
