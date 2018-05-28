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
 * The base condition-query of ARTICLE_CONTENT.
 * @author DBFlute(AutoGenerator)
 */
public class BsArticleContentCQ extends AbstractBsArticleContentCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ArticleContentCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsArticleContentCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from ARTICLE_CONTENT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ArticleContentCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ArticleContentCIQ xcreateCIQ() {
        ArticleContentCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ArticleContentCIQ xnewCIQ() {
        return new ArticleContentCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join ARTICLE_CONTENT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ArticleContentCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ArticleContentCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _articleContentId;
    public ConditionValue xdfgetArticleContentId()
    { if (_articleContentId == null) { _articleContentId = nCV(); }
      return _articleContentId; }
    protected ConditionValue xgetCValueArticleContentId() { return xdfgetArticleContentId(); }

    /** 
     * Add order-by as ascend. <br>
     * (条文内容ID)ARTICLE_CONTENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsArticleContentCQ addOrderBy_ArticleContentId_Asc() { regOBA("ARTICLE_CONTENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (条文内容ID)ARTICLE_CONTENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsArticleContentCQ addOrderBy_ArticleContentId_Desc() { regOBD("ARTICLE_CONTENT_ID"); return this; }

    protected ConditionValue _articleId;
    public ConditionValue xdfgetArticleId()
    { if (_articleId == null) { _articleId = nCV(); }
      return _articleId; }
    protected ConditionValue xgetCValueArticleId() { return xdfgetArticleId(); }

    /** 
     * Add order-by as ascend. <br>
     * (条文ID)ARTICLE_ID: {IX, NotNull, BIGINT(19), FK to ARTICLE}
     * @return this. (NotNull)
     */
    public BsArticleContentCQ addOrderBy_ArticleId_Asc() { regOBA("ARTICLE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (条文ID)ARTICLE_ID: {IX, NotNull, BIGINT(19), FK to ARTICLE}
     * @return this. (NotNull)
     */
    public BsArticleContentCQ addOrderBy_ArticleId_Desc() { regOBD("ARTICLE_ID"); return this; }

    protected ConditionValue _articleContentRawXml;
    public ConditionValue xdfgetArticleContentRawXml()
    { if (_articleContentRawXml == null) { _articleContentRawXml = nCV(); }
      return _articleContentRawXml; }
    protected ConditionValue xgetCValueArticleContentRawXml() { return xdfgetArticleContentRawXml(); }

    protected ConditionValue _articleContentViewXml;
    public ConditionValue xdfgetArticleContentViewXml()
    { if (_articleContentViewXml == null) { _articleContentViewXml = nCV(); }
      return _articleContentViewXml; }
    protected ConditionValue xgetCValueArticleContentViewXml() { return xdfgetArticleContentViewXml(); }

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
    public BsArticleContentCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsArticleContentCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsArticleContentCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsArticleContentCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public BsArticleContentCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsArticleContentCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsArticleContentCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsArticleContentCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public BsArticleContentCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]}
     * @return this. (NotNull)
     */
    public BsArticleContentCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsArticleContentCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsArticleContentCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        ArticleContentCQ bq = (ArticleContentCQ)bqs;
        ArticleContentCQ uq = (ArticleContentCQ)uqs;
        if (bq.hasConditionQueryArticle()) {
            uq.queryArticle().reflectRelationOnUnionQuery(bq.queryArticle(), uq.queryArticle());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (条文)ARTICLE by my ARTICLE_ID, named 'article'.
     * @return The instance of condition-query. (NotNull)
     */
    public ArticleCQ queryArticle() {
        return xdfgetConditionQueryArticle();
    }
    public ArticleCQ xdfgetConditionQueryArticle() {
        String prop = "article";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryArticle()); xsetupOuterJoinArticle(); }
        return xgetQueRlMap(prop);
    }
    protected ArticleCQ xcreateQueryArticle() {
        String nrp = xresolveNRP("ARTICLE_CONTENT", "article"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ArticleCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "article", nrp);
    }
    protected void xsetupOuterJoinArticle() { xregOutJo("article"); }
    public boolean hasConditionQueryArticle() { return xhasQueRlMap("article"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, ArticleContentCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ArticleContentCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ArticleContentCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ArticleContentCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ArticleContentCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ArticleContentCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ArticleContentCQ> _myselfExistsMap;
    public Map<String, ArticleContentCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ArticleContentCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ArticleContentCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ArticleContentCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ArticleContentCB.class.getName(); }
    protected String xCQ() { return ArticleContentCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
