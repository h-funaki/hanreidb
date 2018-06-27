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
 * The DB meta of LAW_CONTENT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LawContentDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LawContentDbm _instance = new LawContentDbm();
    private LawContentDbm() {}
    public static LawContentDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((LawContent)et).getLawContentId(), (et, vl) -> ((LawContent)et).setLawContentId(cti(vl)), "lawContentId");
        setupEpg(_epgMap, et -> ((LawContent)et).getLawHistoryId(), (et, vl) -> ((LawContent)et).setLawHistoryId(cti(vl)), "lawHistoryId");
        setupEpg(_epgMap, et -> ((LawContent)et).getLawContentRawXml(), (et, vl) -> ((LawContent)et).setLawContentRawXml((String)vl), "lawContentRawXml");
        setupEpg(_epgMap, et -> ((LawContent)et).getLawContentSearchText(), (et, vl) -> ((LawContent)et).setLawContentSearchText((String)vl), "lawContentSearchText");
        setupEpg(_epgMap, et -> ((LawContent)et).getLawContentViewXml(), (et, vl) -> ((LawContent)et).setLawContentViewXml((String)vl), "lawContentViewXml");
        setupEpg(_epgMap, et -> ((LawContent)et).getRegisterDatetime(), (et, vl) -> ((LawContent)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((LawContent)et).getRegisterUser(), (et, vl) -> ((LawContent)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((LawContent)et).getUpdateDatetime(), (et, vl) -> ((LawContent)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((LawContent)et).getUpdateUser(), (et, vl) -> ((LawContent)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((LawContent)et).getVersionNo(), (et, vl) -> ((LawContent)et).setVersionNo(ctl(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((LawContent)et).getLawHistory(), (et, vl) -> ((LawContent)et).setLawHistory((OptionalEntity<LawHistory>)vl), "lawHistory");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "LAW_CONTENT";
    protected final String _tableDispName = "LAW_CONTENT";
    protected final String _tablePropertyName = "lawContent";
    protected final TableSqlName _tableSqlName = new TableSqlName("LAW_CONTENT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "法令内容";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLawContentId = cci("LAW_CONTENT_ID", "LAW_CONTENT_ID", null, "法令内容ID", Integer.class, "lawContentId", null, true, true, true, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLawHistoryId = cci("LAW_HISTORY_ID", "LAW_HISTORY_ID", null, "法令履歴ID", Integer.class, "lawHistoryId", null, false, false, true, "INT", 10, 0, null, false, null, null, "lawHistory", null, null, false);
    protected final ColumnInfo _columnLawContentRawXml = cci("LAW_CONTENT_RAW_XML", "LAW_CONTENT_RAW_XML", null, "法令内容加工前XML", String.class, "lawContentRawXml", null, false, false, true, "MEDIUMTEXT", 16777215, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLawContentSearchText = cci("LAW_CONTENT_SEARCH_TEXT", "LAW_CONTENT_SEARCH_TEXT", null, "法令内容検索全文", String.class, "lawContentSearchText", null, false, false, true, "MEDIUMTEXT", 16777215, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLawContentViewXml = cci("LAW_CONTENT_VIEW_XML", "LAW_CONTENT_VIEW_XML", null, "法令内容画面用XML", String.class, "lawContentViewXml", null, false, false, true, "MEDIUMTEXT", 16777215, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザー", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョン番号", Long.class, "versionNo", null, false, false, true, "BIGINT UNSIGNED", 20, 0, "0", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * (法令内容ID)LAW_CONTENT_ID: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawContentId() { return _columnLawContentId; }
    /**
     * (法令履歴ID)LAW_HISTORY_ID: {UQ, NotNull, INT(10), FK to LAW_HISTORY}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawHistoryId() { return _columnLawHistoryId; }
    /**
     * (法令内容加工前XML)LAW_CONTENT_RAW_XML: {NotNull, MEDIUMTEXT(16777215)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawContentRawXml() { return _columnLawContentRawXml; }
    /**
     * (法令内容検索全文)LAW_CONTENT_SEARCH_TEXT: {NotNull, MEDIUMTEXT(16777215)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawContentSearchText() { return _columnLawContentSearchText; }
    /**
     * (法令内容画面用XML)LAW_CONTENT_VIEW_XML: {NotNull, MEDIUMTEXT(16777215)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawContentViewXml() { return _columnLawContentViewXml; }
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
        ls.add(columnLawContentId());
        ls.add(columnLawHistoryId());
        ls.add(columnLawContentRawXml());
        ls.add(columnLawContentSearchText());
        ls.add(columnLawContentViewXml());
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
    protected UniqueInfo cpui() { return hpcpui(columnLawContentId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnLawHistoryId()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * (法令履歴)LAW_HISTORY by my LAW_HISTORY_ID, named 'lawHistory'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignLawHistory() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLawHistoryId(), LawHistoryDbm.getInstance().columnLawHistoryId());
        return cfi("FK_LAW_CONTENT_LAW_HISTORY", "lawHistory", this, LawHistoryDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, true, false, false, false, null, null, false, "lawContentAsOne", false);
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
    public String getEntityTypeName() { return "tech.law.hanreidb.dbflute.exentity.LawContent"; }
    public String getConditionBeanTypeName() { return "tech.law.hanreidb.dbflute.cbean.LawContentCB"; }
    public String getBehaviorTypeName() { return "tech.law.hanreidb.dbflute.exbhv.LawContentBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LawContent> getEntityType() { return LawContent.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LawContent newEntity() { return new LawContent(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LawContent)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LawContent)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
