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
package tech.law.hanreidb.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import tech.law.hanreidb.dbflute.cbean.cq.ciq.*;
import tech.law.hanreidb.dbflute.cbean.*;
import tech.law.hanreidb.dbflute.cbean.cq.*;

/**
 * The base condition-query of ARTICLE.
 * @author DBFlute(AutoGenerator)
 */
public class BsArticleCQ extends AbstractBsArticleCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ArticleCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsArticleCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from ARTICLE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ArticleCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ArticleCIQ xcreateCIQ() {
        ArticleCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ArticleCIQ xnewCIQ() {
        return new ArticleCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join ARTICLE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ArticleCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ArticleCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _articleId;
    public ConditionValue xdfgetArticleId()
    { if (_articleId == null) { _articleId = nCV(); }
      return _articleId; }
    protected ConditionValue xgetCValueArticleId() { return xdfgetArticleId(); }

    public Map<String, ArticleContentCQ> xdfgetArticleId_ExistsReferrer_ArticleContentList() { return xgetSQueMap("articleId_ExistsReferrer_ArticleContentList"); }
    public String keepArticleId_ExistsReferrer_ArticleContentList(ArticleContentCQ sq) { return xkeepSQue("articleId_ExistsReferrer_ArticleContentList", sq); }

    public Map<String, JudgementArticleRelCQ> xdfgetArticleId_ExistsReferrer_JudgementArticleRelList() { return xgetSQueMap("articleId_ExistsReferrer_JudgementArticleRelList"); }
    public String keepArticleId_ExistsReferrer_JudgementArticleRelList(JudgementArticleRelCQ sq) { return xkeepSQue("articleId_ExistsReferrer_JudgementArticleRelList", sq); }

    public Map<String, ArticleContentCQ> xdfgetArticleId_NotExistsReferrer_ArticleContentList() { return xgetSQueMap("articleId_NotExistsReferrer_ArticleContentList"); }
    public String keepArticleId_NotExistsReferrer_ArticleContentList(ArticleContentCQ sq) { return xkeepSQue("articleId_NotExistsReferrer_ArticleContentList", sq); }

    public Map<String, JudgementArticleRelCQ> xdfgetArticleId_NotExistsReferrer_JudgementArticleRelList() { return xgetSQueMap("articleId_NotExistsReferrer_JudgementArticleRelList"); }
    public String keepArticleId_NotExistsReferrer_JudgementArticleRelList(JudgementArticleRelCQ sq) { return xkeepSQue("articleId_NotExistsReferrer_JudgementArticleRelList", sq); }

    public Map<String, ArticleContentCQ> xdfgetArticleId_SpecifyDerivedReferrer_ArticleContentList() { return xgetSQueMap("articleId_SpecifyDerivedReferrer_ArticleContentList"); }
    public String keepArticleId_SpecifyDerivedReferrer_ArticleContentList(ArticleContentCQ sq) { return xkeepSQue("articleId_SpecifyDerivedReferrer_ArticleContentList", sq); }

    public Map<String, JudgementArticleRelCQ> xdfgetArticleId_SpecifyDerivedReferrer_JudgementArticleRelList() { return xgetSQueMap("articleId_SpecifyDerivedReferrer_JudgementArticleRelList"); }
    public String keepArticleId_SpecifyDerivedReferrer_JudgementArticleRelList(JudgementArticleRelCQ sq) { return xkeepSQue("articleId_SpecifyDerivedReferrer_JudgementArticleRelList", sq); }

    public Map<String, ArticleContentCQ> xdfgetArticleId_QueryDerivedReferrer_ArticleContentList() { return xgetSQueMap("articleId_QueryDerivedReferrer_ArticleContentList"); }
    public String keepArticleId_QueryDerivedReferrer_ArticleContentList(ArticleContentCQ sq) { return xkeepSQue("articleId_QueryDerivedReferrer_ArticleContentList", sq); }
    public Map<String, Object> xdfgetArticleId_QueryDerivedReferrer_ArticleContentListParameter() { return xgetSQuePmMap("articleId_QueryDerivedReferrer_ArticleContentList"); }
    public String keepArticleId_QueryDerivedReferrer_ArticleContentListParameter(Object pm) { return xkeepSQuePm("articleId_QueryDerivedReferrer_ArticleContentList", pm); }

    public Map<String, JudgementArticleRelCQ> xdfgetArticleId_QueryDerivedReferrer_JudgementArticleRelList() { return xgetSQueMap("articleId_QueryDerivedReferrer_JudgementArticleRelList"); }
    public String keepArticleId_QueryDerivedReferrer_JudgementArticleRelList(JudgementArticleRelCQ sq) { return xkeepSQue("articleId_QueryDerivedReferrer_JudgementArticleRelList", sq); }
    public Map<String, Object> xdfgetArticleId_QueryDerivedReferrer_JudgementArticleRelListParameter() { return xgetSQuePmMap("articleId_QueryDerivedReferrer_JudgementArticleRelList"); }
    public String keepArticleId_QueryDerivedReferrer_JudgementArticleRelListParameter(Object pm) { return xkeepSQuePm("articleId_QueryDerivedReferrer_JudgementArticleRelList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * (条文ID)ARTICLE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsArticleCQ addOrderBy_ArticleId_Asc() { regOBA("ARTICLE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (条文ID)ARTICLE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsArticleCQ addOrderBy_ArticleId_Desc() { regOBD("ARTICLE_ID"); return this; }

    protected ConditionValue _lawTocId;
    public ConditionValue xdfgetLawTocId()
    { if (_lawTocId == null) { _lawTocId = nCV(); }
      return _lawTocId; }
    protected ConditionValue xgetCValueLawTocId() { return xdfgetLawTocId(); }

    /** 
     * Add order-by as ascend. <br>
     * (法令目次ID)LAW_TOC_ID: {IX, NotNull, BIGINT(19), FK to LAW_TOC}
     * @return this. (NotNull)
     */
    public BsArticleCQ addOrderBy_LawTocId_Asc() { regOBA("LAW_TOC_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (法令目次ID)LAW_TOC_ID: {IX, NotNull, BIGINT(19), FK to LAW_TOC}
     * @return this. (NotNull)
     */
    public BsArticleCQ addOrderBy_LawTocId_Desc() { regOBD("LAW_TOC_ID"); return this; }

    protected ConditionValue _lawHistoryId;
    public ConditionValue xdfgetLawHistoryId()
    { if (_lawHistoryId == null) { _lawHistoryId = nCV(); }
      return _lawHistoryId; }
    protected ConditionValue xgetCValueLawHistoryId() { return xdfgetLawHistoryId(); }

    /** 
     * Add order-by as ascend. <br>
     * (法令履歴ID)LAW_HISTORY_ID: {IX, NotNull, INT(10), FK to LAW_HISTORY}
     * @return this. (NotNull)
     */
    public BsArticleCQ addOrderBy_LawHistoryId_Asc() { regOBA("LAW_HISTORY_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (法令履歴ID)LAW_HISTORY_ID: {IX, NotNull, INT(10), FK to LAW_HISTORY}
     * @return this. (NotNull)
     */
    public BsArticleCQ addOrderBy_LawHistoryId_Desc() { regOBD("LAW_HISTORY_ID"); return this; }

    protected ConditionValue _articleNumber;
    public ConditionValue xdfgetArticleNumber()
    { if (_articleNumber == null) { _articleNumber = nCV(); }
      return _articleNumber; }
    protected ConditionValue xgetCValueArticleNumber() { return xdfgetArticleNumber(); }

    /** 
     * Add order-by as ascend. <br>
     * (条文番号)ARTICLE_NUMBER: {VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsArticleCQ addOrderBy_ArticleNumber_Asc() { regOBA("ARTICLE_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (条文番号)ARTICLE_NUMBER: {VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsArticleCQ addOrderBy_ArticleNumber_Desc() { regOBD("ARTICLE_NUMBER"); return this; }

    protected ConditionValue _articleCaption;
    public ConditionValue xdfgetArticleCaption()
    { if (_articleCaption == null) { _articleCaption = nCV(); }
      return _articleCaption; }
    protected ConditionValue xgetCValueArticleCaption() { return xdfgetArticleCaption(); }

    /** 
     * Add order-by as ascend. <br>
     * (条文見出し)ARTICLE_CAPTION: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsArticleCQ addOrderBy_ArticleCaption_Asc() { regOBA("ARTICLE_CAPTION"); return this; }

    /**
     * Add order-by as descend. <br>
     * (条文見出し)ARTICLE_CAPTION: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsArticleCQ addOrderBy_ArticleCaption_Desc() { regOBD("ARTICLE_CAPTION"); return this; }

    protected ConditionValue _articleTitle;
    public ConditionValue xdfgetArticleTitle()
    { if (_articleTitle == null) { _articleTitle = nCV(); }
      return _articleTitle; }
    protected ConditionValue xgetCValueArticleTitle() { return xdfgetArticleTitle(); }

    /** 
     * Add order-by as ascend. <br>
     * (条文タイトル)ARTICLE_TITLE: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsArticleCQ addOrderBy_ArticleTitle_Asc() { regOBA("ARTICLE_TITLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (条文タイトル)ARTICLE_TITLE: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsArticleCQ addOrderBy_ArticleTitle_Desc() { regOBD("ARTICLE_TITLE"); return this; }

    protected ConditionValue _articleDisplayOrder;
    public ConditionValue xdfgetArticleDisplayOrder()
    { if (_articleDisplayOrder == null) { _articleDisplayOrder = nCV(); }
      return _articleDisplayOrder; }
    protected ConditionValue xgetCValueArticleDisplayOrder() { return xdfgetArticleDisplayOrder(); }

    /** 
     * Add order-by as ascend. <br>
     * (条文整列順)ARTICLE_DISPLAY_ORDER: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsArticleCQ addOrderBy_ArticleDisplayOrder_Asc() { regOBA("ARTICLE_DISPLAY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (条文整列順)ARTICLE_DISPLAY_ORDER: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsArticleCQ addOrderBy_ArticleDisplayOrder_Desc() { regOBD("ARTICLE_DISPLAY_ORDER"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsArticleCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsArticleCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue xdfgetRegisterUser()
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected ConditionValue xgetCValueRegisterUser() { return xdfgetRegisterUser(); }

    /** 
     * Add order-by as ascend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsArticleCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsArticleCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsArticleCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsArticleCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue xdfgetUpdateUser()
    { if (_updateUser == null) { _updateUser = nCV(); }
      return _updateUser; }
    protected ConditionValue xgetCValueUpdateUser() { return xdfgetUpdateUser(); }

    /** 
     * Add order-by as ascend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsArticleCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsArticleCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /** 
     * Add order-by as ascend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]}
     * @return this. (NotNull)
     */
    public BsArticleCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]}
     * @return this. (NotNull)
     */
    public BsArticleCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsArticleCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsArticleCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        ArticleCQ bq = (ArticleCQ)bqs;
        ArticleCQ uq = (ArticleCQ)uqs;
        if (bq.hasConditionQueryLawHistory()) {
            uq.queryLawHistory().reflectRelationOnUnionQuery(bq.queryLawHistory(), uq.queryLawHistory());
        }
        if (bq.hasConditionQueryLawToc()) {
            uq.queryLawToc().reflectRelationOnUnionQuery(bq.queryLawToc(), uq.queryLawToc());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (法令履歴)LAW_HISTORY by my LAW_HISTORY_ID, named 'lawHistory'.
     * @return The instance of condition-query. (NotNull)
     */
    public LawHistoryCQ queryLawHistory() {
        return xdfgetConditionQueryLawHistory();
    }
    public LawHistoryCQ xdfgetConditionQueryLawHistory() {
        String prop = "lawHistory";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryLawHistory()); xsetupOuterJoinLawHistory(); }
        return xgetQueRlMap(prop);
    }
    protected LawHistoryCQ xcreateQueryLawHistory() {
        String nrp = xresolveNRP("ARTICLE", "lawHistory"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LawHistoryCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "lawHistory", nrp);
    }
    protected void xsetupOuterJoinLawHistory() { xregOutJo("lawHistory"); }
    public boolean hasConditionQueryLawHistory() { return xhasQueRlMap("lawHistory"); }

    /**
     * Get the condition-query for relation table. <br>
     * (法令目次)LAW_TOC by my LAW_TOC_ID, named 'lawToc'.
     * @return The instance of condition-query. (NotNull)
     */
    public LawTocCQ queryLawToc() {
        return xdfgetConditionQueryLawToc();
    }
    public LawTocCQ xdfgetConditionQueryLawToc() {
        String prop = "lawToc";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryLawToc()); xsetupOuterJoinLawToc(); }
        return xgetQueRlMap(prop);
    }
    protected LawTocCQ xcreateQueryLawToc() {
        String nrp = xresolveNRP("ARTICLE", "lawToc"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LawTocCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "lawToc", nrp);
    }
    protected void xsetupOuterJoinLawToc() { xregOutJo("lawToc"); }
    public boolean hasConditionQueryLawToc() { return xhasQueRlMap("lawToc"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, ArticleCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ArticleCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ArticleCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ArticleCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ArticleCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ArticleCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ArticleCQ> _myselfExistsMap;
    public Map<String, ArticleCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ArticleCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ArticleCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ArticleCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ArticleCB.class.getName(); }
    protected String xCQ() { return ArticleCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
