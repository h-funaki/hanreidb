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
 * The DB meta of ARTICLE_CONTENT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ArticleContentDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ArticleContentDbm _instance = new ArticleContentDbm();
    private ArticleContentDbm() {}
    public static ArticleContentDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ArticleContent)et).getArticleContentId(), (et, vl) -> ((ArticleContent)et).setArticleContentId(ctl(vl)), "articleContentId");
        setupEpg(_epgMap, et -> ((ArticleContent)et).getArticleId(), (et, vl) -> ((ArticleContent)et).setArticleId(ctl(vl)), "articleId");
        setupEpg(_epgMap, et -> ((ArticleContent)et).getArticleContentRawXml(), (et, vl) -> ((ArticleContent)et).setArticleContentRawXml((String)vl), "articleContentRawXml");
        setupEpg(_epgMap, et -> ((ArticleContent)et).getArticleContentViewXml(), (et, vl) -> ((ArticleContent)et).setArticleContentViewXml((String)vl), "articleContentViewXml");
        setupEpg(_epgMap, et -> ((ArticleContent)et).getRegisterDatetime(), (et, vl) -> ((ArticleContent)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((ArticleContent)et).getRegisterUser(), (et, vl) -> ((ArticleContent)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((ArticleContent)et).getUpdateDatetime(), (et, vl) -> ((ArticleContent)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((ArticleContent)et).getUpdateUser(), (et, vl) -> ((ArticleContent)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((ArticleContent)et).getVersionNo(), (et, vl) -> ((ArticleContent)et).setVersionNo(ctl(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((ArticleContent)et).getArticle(), (et, vl) -> ((ArticleContent)et).setArticle((OptionalEntity<Article>)vl), "article");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "ARTICLE_CONTENT";
    protected final String _tableDispName = "ARTICLE_CONTENT";
    protected final String _tablePropertyName = "articleContent";
    protected final TableSqlName _tableSqlName = new TableSqlName("ARTICLE_CONTENT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "条文内容";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnArticleContentId = cci("ARTICLE_CONTENT_ID", "ARTICLE_CONTENT_ID", null, "条文内容ID", Long.class, "articleContentId", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnArticleId = cci("ARTICLE_ID", "ARTICLE_ID", null, "条文ID", Long.class, "articleId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "article", null, null, false);
    protected final ColumnInfo _columnArticleContentRawXml = cci("ARTICLE_CONTENT_RAW_XML", "ARTICLE_CONTENT_RAW_XML", null, "条文内容加工前XML", String.class, "articleContentRawXml", null, false, false, true, "TEXT", 65535, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnArticleContentViewXml = cci("ARTICLE_CONTENT_VIEW_XML", "ARTICLE_CONTENT_VIEW_XML", null, "条文内容画面用XML", String.class, "articleContentViewXml", null, false, false, true, "TEXT", 65535, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザー", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョン番号", Long.class, "versionNo", null, false, false, true, "BIGINT UNSIGNED", 20, 0, "0", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * (条文内容ID)ARTICLE_CONTENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArticleContentId() { return _columnArticleContentId; }
    /**
     * (条文ID)ARTICLE_ID: {IX, NotNull, BIGINT(19), FK to ARTICLE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArticleId() { return _columnArticleId; }
    /**
     * (条文内容加工前XML)ARTICLE_CONTENT_RAW_XML: {NotNull, TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArticleContentRawXml() { return _columnArticleContentRawXml; }
    /**
     * (条文内容画面用XML)ARTICLE_CONTENT_VIEW_XML: {NotNull, TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArticleContentViewXml() { return _columnArticleContentViewXml; }
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
        ls.add(columnArticleContentId());
        ls.add(columnArticleId());
        ls.add(columnArticleContentRawXml());
        ls.add(columnArticleContentViewXml());
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
    protected UniqueInfo cpui() { return hpcpui(columnArticleContentId()); }
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
     * (条文)ARTICLE by my ARTICLE_ID, named 'article'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignArticle() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnArticleId(), ArticleDbm.getInstance().columnArticleId());
        return cfi("FK_ARTICLE_CONTENT_ARTICLE", "article", this, ArticleDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "articleContentList", false);
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
    public String getEntityTypeName() { return "tech.law.hanreidb.dbflute.exentity.ArticleContent"; }
    public String getConditionBeanTypeName() { return "tech.law.hanreidb.dbflute.cbean.ArticleContentCB"; }
    public String getBehaviorTypeName() { return "tech.law.hanreidb.dbflute.exbhv.ArticleContentBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ArticleContent> getEntityType() { return ArticleContent.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ArticleContent newEntity() { return new ArticleContent(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ArticleContent)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ArticleContent)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
