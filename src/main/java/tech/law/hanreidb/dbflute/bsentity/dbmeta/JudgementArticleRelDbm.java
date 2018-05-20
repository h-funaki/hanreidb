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
 * The DB meta of JUDGEMENT_ARTICLE_REL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class JudgementArticleRelDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final JudgementArticleRelDbm _instance = new JudgementArticleRelDbm();
    private JudgementArticleRelDbm() {}
    public static JudgementArticleRelDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((JudgementArticleRel)et).getJudgementArticleRelId(), (et, vl) -> ((JudgementArticleRel)et).setJudgementArticleRelId(ctl(vl)), "judgementArticleRelId");
        setupEpg(_epgMap, et -> ((JudgementArticleRel)et).getJudgementId(), (et, vl) -> ((JudgementArticleRel)et).setJudgementId(ctl(vl)), "judgementId");
        setupEpg(_epgMap, et -> ((JudgementArticleRel)et).getArticleId(), (et, vl) -> ((JudgementArticleRel)et).setArticleId(ctl(vl)), "articleId");
        setupEpg(_epgMap, et -> ((JudgementArticleRel)et).getRegisterDatetime(), (et, vl) -> ((JudgementArticleRel)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((JudgementArticleRel)et).getRegisterUser(), (et, vl) -> ((JudgementArticleRel)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((JudgementArticleRel)et).getUpdateDatetime(), (et, vl) -> ((JudgementArticleRel)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((JudgementArticleRel)et).getUpdateUser(), (et, vl) -> ((JudgementArticleRel)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((JudgementArticleRel)et).getVersionNo(), (et, vl) -> ((JudgementArticleRel)et).setVersionNo(ctl(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((JudgementArticleRel)et).getArticle(), (et, vl) -> ((JudgementArticleRel)et).setArticle((OptionalEntity<Article>)vl), "article");
        setupEfpg(_efpgMap, et -> ((JudgementArticleRel)et).getJudgement(), (et, vl) -> ((JudgementArticleRel)et).setJudgement((OptionalEntity<Judgement>)vl), "judgement");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "JUDGEMENT_ARTICLE_REL";
    protected final String _tableDispName = "JUDGEMENT_ARTICLE_REL";
    protected final String _tablePropertyName = "judgementArticleRel";
    protected final TableSqlName _tableSqlName = new TableSqlName("JUDGEMENT_ARTICLE_REL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "判決条文リレーション";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnJudgementArticleRelId = cci("JUDGEMENT_ARTICLE_REL_ID", "JUDGEMENT_ARTICLE_REL_ID", null, "判決法令リレーションID", Long.class, "judgementArticleRelId", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJudgementId = cci("JUDGEMENT_ID", "JUDGEMENT_ID", null, "判決ID", Long.class, "judgementId", null, false, false, true, "BIGINT UNSIGNED", 20, 0, null, false, null, null, "judgement", null, null, false);
    protected final ColumnInfo _columnArticleId = cci("ARTICLE_ID", "ARTICLE_ID", null, "条文ID", Long.class, "articleId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "article", null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザー", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョン番号", Long.class, "versionNo", null, false, false, true, "BIGINT UNSIGNED", 20, 0, "0", false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * (判決法令リレーションID)JUDGEMENT_ARTICLE_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJudgementArticleRelId() { return _columnJudgementArticleRelId; }
    /**
     * (判決ID)JUDGEMENT_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJudgementId() { return _columnJudgementId; }
    /**
     * (条文ID)ARTICLE_ID: {IX, NotNull, BIGINT(19), FK to ARTICLE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArticleId() { return _columnArticleId; }
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
        ls.add(columnJudgementArticleRelId());
        ls.add(columnJudgementId());
        ls.add(columnArticleId());
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
    protected UniqueInfo cpui() { return hpcpui(columnJudgementArticleRelId()); }
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
        return cfi("FK_JUDGEMENT_ARTICLE_REL_ARTICLE", "article", this, ArticleDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "judgementArticleRelList", false);
    }
    /**
     * (判決)JUDGEMENT by my JUDGEMENT_ID, named 'judgement'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignJudgement() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnJudgementId(), JudgementDbm.getInstance().columnJudgementId());
        return cfi("FK_JUDGEMENT_ARTICLE_REL_JUDGEMENT", "judgement", this, JudgementDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "judgementArticleRelList", false);
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
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime(), columnUpdateUser()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "tech.law.hanreidb.dbflute.exentity.JudgementArticleRel"; }
    public String getConditionBeanTypeName() { return "tech.law.hanreidb.dbflute.cbean.JudgementArticleRelCB"; }
    public String getBehaviorTypeName() { return "tech.law.hanreidb.dbflute.exbhv.JudgementArticleRelBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<JudgementArticleRel> getEntityType() { return JudgementArticleRel.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public JudgementArticleRel newEntity() { return new JudgementArticleRel(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((JudgementArticleRel)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((JudgementArticleRel)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
