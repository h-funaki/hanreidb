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
 * The DB meta of LAW_HISTORY. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LawHistoryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LawHistoryDbm _instance = new LawHistoryDbm();
    private LawHistoryDbm() {}
    public static LawHistoryDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((LawHistory)et).getLawHistoryId(), (et, vl) -> ((LawHistory)et).setLawHistoryId(cti(vl)), "lawHistoryId");
        setupEpg(_epgMap, et -> ((LawHistory)et).getLawId(), (et, vl) -> ((LawHistory)et).setLawId(cti(vl)), "lawId");
        setupEpg(_epgMap, et -> ((LawHistory)et).getAmendLawId(), (et, vl) -> ((LawHistory)et).setAmendLawId(cti(vl)), "amendLawId");
        setupEpg(_epgMap, et -> ((LawHistory)et).getLawAmendVersion(), (et, vl) -> ((LawHistory)et).setLawAmendVersion(cti(vl)), "lawAmendVersion");
        setupEpg(_epgMap, et -> ((LawHistory)et).getLatestVersionFlg(), (et, vl) -> {
            ((LawHistory)et).setLatestVersionFlg((Boolean)vl);
        }, "latestVersionFlg");
        setupEpg(_epgMap, et -> ((LawHistory)et).getRegisterDatetime(), (et, vl) -> ((LawHistory)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((LawHistory)et).getRegisterUser(), (et, vl) -> ((LawHistory)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((LawHistory)et).getUpdateDatetime(), (et, vl) -> ((LawHistory)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((LawHistory)et).getUpdateUser(), (et, vl) -> ((LawHistory)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((LawHistory)et).getVersionNo(), (et, vl) -> ((LawHistory)et).setVersionNo(ctl(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((LawHistory)et).getLawByAmendLawId(), (et, vl) -> ((LawHistory)et).setLawByAmendLawId((OptionalEntity<Law>)vl), "lawByAmendLawId");
        setupEfpg(_efpgMap, et -> ((LawHistory)et).getLawByLawId(), (et, vl) -> ((LawHistory)et).setLawByLawId((OptionalEntity<Law>)vl), "lawByLawId");
        setupEfpg(_efpgMap, et -> ((LawHistory)et).getLawContentAsOne(), (et, vl) -> ((LawHistory)et).setLawContentAsOne((OptionalEntity<LawContent>)vl), "lawContentAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "LAW_HISTORY";
    protected final String _tableDispName = "LAW_HISTORY";
    protected final String _tablePropertyName = "lawHistory";
    protected final TableSqlName _tableSqlName = new TableSqlName("LAW_HISTORY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "法令履歴";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLawHistoryId = cci("LAW_HISTORY_ID", "LAW_HISTORY_ID", null, "法令履歴ID", Integer.class, "lawHistoryId", null, true, true, true, "INT", 10, 0, null, false, null, null, null, "articleList,lawTocList", null, false);
    protected final ColumnInfo _columnLawId = cci("LAW_ID", "LAW_ID", null, "法令ID", Integer.class, "lawId", null, false, false, true, "INT", 10, 0, null, false, null, null, "lawByLawId", null, null, false);
    protected final ColumnInfo _columnAmendLawId = cci("AMEND_LAW_ID", "AMEND_LAW_ID", null, "改正法令ID", Integer.class, "amendLawId", null, false, false, false, "INT", 10, 0, null, false, null, null, "lawByAmendLawId", null, null, false);
    protected final ColumnInfo _columnLawAmendVersion = cci("LAW_AMEND_VERSION", "LAW_AMEND_VERSION", null, "法令改正バージョン", Integer.class, "lawAmendVersion", null, false, false, true, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLatestVersionFlg = cci("LATEST_VERSION_FLG", "LATEST_VERSION_FLG", null, "最新フラグ", Boolean.class, "latestVersionFlg", null, false, false, true, "BIT", null, null, null, false, null, null, null, null, CDef.DefMeta.Flg, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザー", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョン番号", Long.class, "versionNo", null, false, false, true, "BIGINT UNSIGNED", 20, 0, "0", false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * (法令履歴ID)LAW_HISTORY_ID: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawHistoryId() { return _columnLawHistoryId; }
    /**
     * (法令ID)LAW_ID: {UQ+, NotNull, INT(10), FK to LAW}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawId() { return _columnLawId; }
    /**
     * (改正法令ID)AMEND_LAW_ID: {IX, INT(10), FK to LAW}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAmendLawId() { return _columnAmendLawId; }
    /**
     * (法令改正バージョン)LAW_AMEND_VERSION: {+UQ, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawAmendVersion() { return _columnLawAmendVersion; }
    /**
     * (最新フラグ)LATEST_VERSION_FLG: {NotNull, BIT, classification=Flg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLatestVersionFlg() { return _columnLatestVersionFlg; }
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
        ls.add(columnLawHistoryId());
        ls.add(columnLawId());
        ls.add(columnAmendLawId());
        ls.add(columnLawAmendVersion());
        ls.add(columnLatestVersionFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnLawHistoryId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnLawId());
        ls.add(columnLawAmendVersion());
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
     * (法令)LAW by my AMEND_LAW_ID, named 'lawByAmendLawId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignLawByAmendLawId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAmendLawId(), LawDbm.getInstance().columnLawId());
        return cfi("FK_LAW_HISTORY_AMEND_LAW", "lawByAmendLawId", this, LawDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "lawHistoryByAmendLawIdList", false);
    }
    /**
     * (法令)LAW by my LAW_ID, named 'lawByLawId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignLawByLawId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLawId(), LawDbm.getInstance().columnLawId());
        return cfi("FK_LAW_HISTORY_LAW", "lawByLawId", this, LawDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "lawHistoryByLawIdList", false);
    }
    /**
     * (法令内容)LAW_CONTENT by LAW_HISTORY_ID, named 'lawContentAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignLawContentAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLawHistoryId(), LawContentDbm.getInstance().columnLawHistoryId());
        return cfi("FK_LAW_CONTENT_LAW_HISTORY", "lawContentAsOne", this, LawContentDbm.getInstance(), mp, 2, org.dbflute.optional.OptionalEntity.class, true, false, true, false, null, null, false, "lawHistory", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (条文)ARTICLE by LAW_HISTORY_ID, named 'articleList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerArticleList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLawHistoryId(), ArticleDbm.getInstance().columnLawHistoryId());
        return cri("FK_ARTICLE_LAW_HISTORY", "articleList", this, ArticleDbm.getInstance(), mp, false, "lawHistory");
    }
    /**
     * (法令目次)LAW_TOC by LAW_HISTORY_ID, named 'lawTocList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerLawTocList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLawHistoryId(), LawTocDbm.getInstance().columnLawHistoryId());
        return cri("FK_LAW_TOC_LAW_HISTORY", "lawTocList", this, LawTocDbm.getInstance(), mp, false, "lawHistory");
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
    public String getEntityTypeName() { return "tech.law.hanreidb.dbflute.exentity.LawHistory"; }
    public String getConditionBeanTypeName() { return "tech.law.hanreidb.dbflute.cbean.LawHistoryCB"; }
    public String getBehaviorTypeName() { return "tech.law.hanreidb.dbflute.exbhv.LawHistoryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LawHistory> getEntityType() { return LawHistory.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LawHistory newEntity() { return new LawHistory(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LawHistory)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LawHistory)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
