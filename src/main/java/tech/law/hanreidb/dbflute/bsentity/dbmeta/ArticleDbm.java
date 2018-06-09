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
 * The DB meta of ARTICLE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ArticleDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ArticleDbm _instance = new ArticleDbm();
    private ArticleDbm() {}
    public static ArticleDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Article)et).getArticleId(), (et, vl) -> ((Article)et).setArticleId(ctl(vl)), "articleId");
        setupEpg(_epgMap, et -> ((Article)et).getLawTocId(), (et, vl) -> ((Article)et).setLawTocId(ctl(vl)), "lawTocId");
        setupEpg(_epgMap, et -> ((Article)et).getLawHistoryId(), (et, vl) -> ((Article)et).setLawHistoryId(cti(vl)), "lawHistoryId");
        setupEpg(_epgMap, et -> ((Article)et).getArticleNumber(), (et, vl) -> ((Article)et).setArticleNumber((String)vl), "articleNumber");
        setupEpg(_epgMap, et -> ((Article)et).getArticleCaption(), (et, vl) -> ((Article)et).setArticleCaption((String)vl), "articleCaption");
        setupEpg(_epgMap, et -> ((Article)et).getArticleTitle(), (et, vl) -> ((Article)et).setArticleTitle((String)vl), "articleTitle");
        setupEpg(_epgMap, et -> ((Article)et).getArticleDisplayOrder(), (et, vl) -> ((Article)et).setArticleDisplayOrder(cti(vl)), "articleDisplayOrder");
        setupEpg(_epgMap, et -> ((Article)et).getRegisterDatetime(), (et, vl) -> ((Article)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((Article)et).getRegisterUser(), (et, vl) -> ((Article)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((Article)et).getUpdateDatetime(), (et, vl) -> ((Article)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((Article)et).getUpdateUser(), (et, vl) -> ((Article)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((Article)et).getVersionNo(), (et, vl) -> ((Article)et).setVersionNo(ctl(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((Article)et).getLawHistory(), (et, vl) -> ((Article)et).setLawHistory((OptionalEntity<LawHistory>)vl), "lawHistory");
        setupEfpg(_efpgMap, et -> ((Article)et).getLawToc(), (et, vl) -> ((Article)et).setLawToc((OptionalEntity<LawToc>)vl), "lawToc");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "ARTICLE";
    protected final String _tableDispName = "ARTICLE";
    protected final String _tablePropertyName = "article";
    protected final TableSqlName _tableSqlName = new TableSqlName("ARTICLE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "条文";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnArticleId = cci("ARTICLE_ID", "ARTICLE_ID", null, "条文ID", Long.class, "articleId", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, "articleContentList,judgementArticleRelList", null, false);
    protected final ColumnInfo _columnLawTocId = cci("LAW_TOC_ID", "LAW_TOC_ID", null, "法令目次ID", Long.class, "lawTocId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "lawToc", null, null, false);
    protected final ColumnInfo _columnLawHistoryId = cci("LAW_HISTORY_ID", "LAW_HISTORY_ID", null, "法令履歴ID", Integer.class, "lawHistoryId", null, false, false, true, "INT", 10, 0, null, false, null, null, "lawHistory", null, null, false);
    protected final ColumnInfo _columnArticleNumber = cci("ARTICLE_NUMBER", "ARTICLE_NUMBER", null, "条文番号", String.class, "articleNumber", null, false, false, false, "VARCHAR", 20, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnArticleCaption = cci("ARTICLE_CAPTION", "ARTICLE_CAPTION", null, "条文見出し", String.class, "articleCaption", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnArticleTitle = cci("ARTICLE_TITLE", "ARTICLE_TITLE", null, "条文タイトル", String.class, "articleTitle", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnArticleDisplayOrder = cci("ARTICLE_DISPLAY_ORDER", "ARTICLE_DISPLAY_ORDER", null, "条文整列順", Integer.class, "articleDisplayOrder", null, false, false, true, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザー", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョン番号", Long.class, "versionNo", null, false, false, true, "BIGINT UNSIGNED", 20, 0, "0", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * (条文ID)ARTICLE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArticleId() { return _columnArticleId; }
    /**
     * (法令目次ID)LAW_TOC_ID: {IX, NotNull, BIGINT(19), FK to LAW_TOC}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawTocId() { return _columnLawTocId; }
    /**
     * (法令履歴ID)LAW_HISTORY_ID: {IX, NotNull, INT(10), FK to LAW_HISTORY}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawHistoryId() { return _columnLawHistoryId; }
    /**
     * (条文番号)ARTICLE_NUMBER: {VARCHAR(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArticleNumber() { return _columnArticleNumber; }
    /**
     * (条文見出し)ARTICLE_CAPTION: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArticleCaption() { return _columnArticleCaption; }
    /**
     * (条文タイトル)ARTICLE_TITLE: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArticleTitle() { return _columnArticleTitle; }
    /**
     * (条文整列順)ARTICLE_DISPLAY_ORDER: {NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArticleDisplayOrder() { return _columnArticleDisplayOrder; }
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
        ls.add(columnArticleId());
        ls.add(columnLawTocId());
        ls.add(columnLawHistoryId());
        ls.add(columnArticleNumber());
        ls.add(columnArticleCaption());
        ls.add(columnArticleTitle());
        ls.add(columnArticleDisplayOrder());
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
    protected UniqueInfo cpui() { return hpcpui(columnArticleId()); }
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
        return cfi("FK_ARTICLE_LAW_HISTORY", "lawHistory", this, LawHistoryDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "articleList", false);
    }
    /**
     * (法令目次)LAW_TOC by my LAW_TOC_ID, named 'lawToc'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignLawToc() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLawTocId(), LawTocDbm.getInstance().columnLawTocId());
        return cfi("FK_ARTICLE_LAW_TOC", "lawToc", this, LawTocDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "articleList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (条文内容)ARTICLE_CONTENT by ARTICLE_ID, named 'articleContentList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerArticleContentList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnArticleId(), ArticleContentDbm.getInstance().columnArticleId());
        return cri("FK_ARTICLE_CONTENT_ARTICLE", "articleContentList", this, ArticleContentDbm.getInstance(), mp, false, "article");
    }
    /**
     * (判決条文リレーション)JUDGEMENT_ARTICLE_REL by ARTICLE_ID, named 'judgementArticleRelList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerJudgementArticleRelList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnArticleId(), JudgementArticleRelDbm.getInstance().columnArticleId());
        return cri("FK_JUDGEMENT_ARTICLE_REL_ARTICLE", "judgementArticleRelList", this, JudgementArticleRelDbm.getInstance(), mp, false, "article");
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
    public String getEntityTypeName() { return "tech.law.hanreidb.dbflute.exentity.Article"; }
    public String getConditionBeanTypeName() { return "tech.law.hanreidb.dbflute.cbean.ArticleCB"; }
    public String getBehaviorTypeName() { return "tech.law.hanreidb.dbflute.exbhv.ArticleBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Article> getEntityType() { return Article.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Article newEntity() { return new Article(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Article)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Article)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
