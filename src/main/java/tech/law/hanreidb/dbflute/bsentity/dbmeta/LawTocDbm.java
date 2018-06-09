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
 * The DB meta of LAW_TOC. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LawTocDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LawTocDbm _instance = new LawTocDbm();
    private LawTocDbm() {}
    public static LawTocDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((LawToc)et).getLawTocId(), (et, vl) -> ((LawToc)et).setLawTocId(ctl(vl)), "lawTocId");
        setupEpg(_epgMap, et -> ((LawToc)et).getLawHistoryId(), (et, vl) -> ((LawToc)et).setLawHistoryId(cti(vl)), "lawHistoryId");
        setupEpg(_epgMap, et -> ((LawToc)et).getPartNumber(), (et, vl) -> ((LawToc)et).setPartNumber(cti(vl)), "partNumber");
        setupEpg(_epgMap, et -> ((LawToc)et).getPartTitle(), (et, vl) -> ((LawToc)et).setPartTitle((String)vl), "partTitle");
        setupEpg(_epgMap, et -> ((LawToc)et).getPartCaption(), (et, vl) -> ((LawToc)et).setPartCaption((String)vl), "partCaption");
        setupEpg(_epgMap, et -> ((LawToc)et).getChapterNumber(), (et, vl) -> ((LawToc)et).setChapterNumber(cti(vl)), "chapterNumber");
        setupEpg(_epgMap, et -> ((LawToc)et).getChapterTitle(), (et, vl) -> ((LawToc)et).setChapterTitle((String)vl), "chapterTitle");
        setupEpg(_epgMap, et -> ((LawToc)et).getChapterCaption(), (et, vl) -> ((LawToc)et).setChapterCaption((String)vl), "chapterCaption");
        setupEpg(_epgMap, et -> ((LawToc)et).getSectionNumber(), (et, vl) -> ((LawToc)et).setSectionNumber(cti(vl)), "sectionNumber");
        setupEpg(_epgMap, et -> ((LawToc)et).getSectionTitle(), (et, vl) -> ((LawToc)et).setSectionTitle((String)vl), "sectionTitle");
        setupEpg(_epgMap, et -> ((LawToc)et).getSectionCaption(), (et, vl) -> ((LawToc)et).setSectionCaption((String)vl), "sectionCaption");
        setupEpg(_epgMap, et -> ((LawToc)et).getSubsectionNumber(), (et, vl) -> ((LawToc)et).setSubsectionNumber(cti(vl)), "subsectionNumber");
        setupEpg(_epgMap, et -> ((LawToc)et).getSubsectionTitle(), (et, vl) -> ((LawToc)et).setSubsectionTitle((String)vl), "subsectionTitle");
        setupEpg(_epgMap, et -> ((LawToc)et).getSubsectionCaption(), (et, vl) -> ((LawToc)et).setSubsectionCaption((String)vl), "subsectionCaption");
        setupEpg(_epgMap, et -> ((LawToc)et).getDivisionNumber(), (et, vl) -> ((LawToc)et).setDivisionNumber(cti(vl)), "divisionNumber");
        setupEpg(_epgMap, et -> ((LawToc)et).getDivisionTitle(), (et, vl) -> ((LawToc)et).setDivisionTitle((String)vl), "divisionTitle");
        setupEpg(_epgMap, et -> ((LawToc)et).getDivisionCaption(), (et, vl) -> ((LawToc)et).setDivisionCaption((String)vl), "divisionCaption");
        setupEpg(_epgMap, et -> ((LawToc)et).getRegisterDatetime(), (et, vl) -> ((LawToc)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((LawToc)et).getRegisterUser(), (et, vl) -> ((LawToc)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((LawToc)et).getUpdateDatetime(), (et, vl) -> ((LawToc)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((LawToc)et).getUpdateUser(), (et, vl) -> ((LawToc)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((LawToc)et).getVersionNo(), (et, vl) -> ((LawToc)et).setVersionNo(ctl(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((LawToc)et).getLawHistory(), (et, vl) -> ((LawToc)et).setLawHistory((OptionalEntity<LawHistory>)vl), "lawHistory");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "LAW_TOC";
    protected final String _tableDispName = "LAW_TOC";
    protected final String _tablePropertyName = "lawToc";
    protected final TableSqlName _tableSqlName = new TableSqlName("LAW_TOC", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "法令目次";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLawTocId = cci("LAW_TOC_ID", "LAW_TOC_ID", null, "法令目次ID", Long.class, "lawTocId", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, "articleList", null, false);
    protected final ColumnInfo _columnLawHistoryId = cci("LAW_HISTORY_ID", "LAW_HISTORY_ID", null, "法令履歴ID", Integer.class, "lawHistoryId", null, false, false, true, "INT", 10, 0, null, false, null, null, "lawHistory", null, null, false);
    protected final ColumnInfo _columnPartNumber = cci("PART_NUMBER", "PART_NUMBER", null, "編番号", Integer.class, "partNumber", null, false, false, false, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPartTitle = cci("PART_TITLE", "PART_TITLE", null, "編タイトル", String.class, "partTitle", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPartCaption = cci("PART_CAPTION", "PART_CAPTION", null, "編見出し", String.class, "partCaption", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnChapterNumber = cci("CHAPTER_NUMBER", "CHAPTER_NUMBER", null, "章番号", Integer.class, "chapterNumber", null, false, false, false, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnChapterTitle = cci("CHAPTER_TITLE", "CHAPTER_TITLE", null, "章タイトル", String.class, "chapterTitle", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnChapterCaption = cci("CHAPTER_CAPTION", "CHAPTER_CAPTION", null, "章見出し", String.class, "chapterCaption", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSectionNumber = cci("SECTION_NUMBER", "SECTION_NUMBER", null, "節番号", Integer.class, "sectionNumber", null, false, false, false, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSectionTitle = cci("SECTION_TITLE", "SECTION_TITLE", null, "節タイトル", String.class, "sectionTitle", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSectionCaption = cci("SECTION_CAPTION", "SECTION_CAPTION", null, "節見出し", String.class, "sectionCaption", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSubsectionNumber = cci("SUBSECTION_NUMBER", "SUBSECTION_NUMBER", null, "款番号", Integer.class, "subsectionNumber", null, false, false, false, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSubsectionTitle = cci("SUBSECTION_TITLE", "SUBSECTION_TITLE", null, "款タイトル", String.class, "subsectionTitle", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSubsectionCaption = cci("SUBSECTION_CAPTION", "SUBSECTION_CAPTION", null, "款見出し", String.class, "subsectionCaption", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDivisionNumber = cci("DIVISION_NUMBER", "DIVISION_NUMBER", null, "目番号", Integer.class, "divisionNumber", null, false, false, false, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDivisionTitle = cci("DIVISION_TITLE", "DIVISION_TITLE", null, "目タイトル", String.class, "divisionTitle", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDivisionCaption = cci("DIVISION_CAPTION", "DIVISION_CAPTION", null, "目見出し", String.class, "divisionCaption", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザー", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョン番号", Long.class, "versionNo", null, false, false, true, "BIGINT UNSIGNED", 20, 0, "0", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * (法令目次ID)LAW_TOC_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawTocId() { return _columnLawTocId; }
    /**
     * (法令履歴ID)LAW_HISTORY_ID: {IX, NotNull, INT(10), FK to LAW_HISTORY}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawHistoryId() { return _columnLawHistoryId; }
    /**
     * (編番号)PART_NUMBER: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPartNumber() { return _columnPartNumber; }
    /**
     * (編タイトル)PART_TITLE: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPartTitle() { return _columnPartTitle; }
    /**
     * (編見出し)PART_CAPTION: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPartCaption() { return _columnPartCaption; }
    /**
     * (章番号)CHAPTER_NUMBER: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChapterNumber() { return _columnChapterNumber; }
    /**
     * (章タイトル)CHAPTER_TITLE: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChapterTitle() { return _columnChapterTitle; }
    /**
     * (章見出し)CHAPTER_CAPTION: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChapterCaption() { return _columnChapterCaption; }
    /**
     * (節番号)SECTION_NUMBER: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSectionNumber() { return _columnSectionNumber; }
    /**
     * (節タイトル)SECTION_TITLE: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSectionTitle() { return _columnSectionTitle; }
    /**
     * (節見出し)SECTION_CAPTION: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSectionCaption() { return _columnSectionCaption; }
    /**
     * (款番号)SUBSECTION_NUMBER: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSubsectionNumber() { return _columnSubsectionNumber; }
    /**
     * (款タイトル)SUBSECTION_TITLE: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSubsectionTitle() { return _columnSubsectionTitle; }
    /**
     * (款見出し)SUBSECTION_CAPTION: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSubsectionCaption() { return _columnSubsectionCaption; }
    /**
     * (目番号)DIVISION_NUMBER: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDivisionNumber() { return _columnDivisionNumber; }
    /**
     * (目タイトル)DIVISION_TITLE: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDivisionTitle() { return _columnDivisionTitle; }
    /**
     * (目見出し)DIVISION_CAPTION: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDivisionCaption() { return _columnDivisionCaption; }
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
        ls.add(columnLawTocId());
        ls.add(columnLawHistoryId());
        ls.add(columnPartNumber());
        ls.add(columnPartTitle());
        ls.add(columnPartCaption());
        ls.add(columnChapterNumber());
        ls.add(columnChapterTitle());
        ls.add(columnChapterCaption());
        ls.add(columnSectionNumber());
        ls.add(columnSectionTitle());
        ls.add(columnSectionCaption());
        ls.add(columnSubsectionNumber());
        ls.add(columnSubsectionTitle());
        ls.add(columnSubsectionCaption());
        ls.add(columnDivisionNumber());
        ls.add(columnDivisionTitle());
        ls.add(columnDivisionCaption());
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
    protected UniqueInfo cpui() { return hpcpui(columnLawTocId()); }
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
     * (法令履歴)LAW_HISTORY by my LAW_HISTORY_ID, named 'lawHistory'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignLawHistory() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLawHistoryId(), LawHistoryDbm.getInstance().columnLawHistoryId());
        return cfi("FK_LAW_TOC_LAW_HISTORY", "lawHistory", this, LawHistoryDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "lawTocList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (条文)ARTICLE by LAW_TOC_ID, named 'articleList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerArticleList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLawTocId(), ArticleDbm.getInstance().columnLawTocId());
        return cri("FK_ARTICLE_LAW_TOC", "articleList", this, ArticleDbm.getInstance(), mp, false, "lawToc");
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
    public String getEntityTypeName() { return "tech.law.hanreidb.dbflute.exentity.LawToc"; }
    public String getConditionBeanTypeName() { return "tech.law.hanreidb.dbflute.cbean.LawTocCB"; }
    public String getBehaviorTypeName() { return "tech.law.hanreidb.dbflute.exbhv.LawTocBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LawToc> getEntityType() { return LawToc.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LawToc newEntity() { return new LawToc(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LawToc)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LawToc)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
