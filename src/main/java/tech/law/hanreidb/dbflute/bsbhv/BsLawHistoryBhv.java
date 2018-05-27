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
package tech.law.hanreidb.dbflute.bsbhv;

import java.util.List;

import org.dbflute.*;
import org.dbflute.bhv.*;
import org.dbflute.bhv.readable.*;
import org.dbflute.bhv.writable.*;
import org.dbflute.bhv.referrer.*;
import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.HpSLSFunction;
import org.dbflute.cbean.result.*;
import org.dbflute.exception.*;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.outsidesql.executor.*;
import tech.law.hanreidb.dbflute.exbhv.*;
import tech.law.hanreidb.dbflute.bsbhv.loader.*;
import tech.law.hanreidb.dbflute.exentity.*;
import tech.law.hanreidb.dbflute.bsentity.dbmeta.*;
import tech.law.hanreidb.dbflute.cbean.*;

/**
 * The behavior of (法令履歴)LAW_HISTORY as TABLE. <br>
 * <pre>
 * [primary key]
 *     LAW_HISTORY_ID
 *
 * [column]
 *     LAW_HISTORY_ID, LAW_ID, AMEND_LAW_ID, LAW_AMEND_VERSION, LATEST_VERSION_FLG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LAW_HISTORY_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     LAW, LAW_CONTENT(AsOne)
 *
 * [referrer table]
 *     ARTICLE, LAW_TOC, LAW_CONTENT
 *
 * [foreign property]
 *     lawByAmendLawId, lawByLawId, lawContentAsOne
 *
 * [referrer property]
 *     articleList, lawTocList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsLawHistoryBhv extends AbstractBehaviorWritable<LawHistory, LawHistoryCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public LawHistoryDbm asDBMeta() { return LawHistoryDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "LAW_HISTORY"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public LawHistoryCB newConditionBean() { return new LawHistoryCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of LawHistory. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<LawHistoryCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, isPresent() and orElse(), ...</span>
     * <pre>
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">lawHistory</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">lawHistory</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">lawHistory</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">lawHistory</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of LawHistory. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<LawHistory> selectEntity(CBCall<LawHistoryCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<LawHistory> facadeSelectEntity(LawHistoryCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends LawHistory> OptionalEntity<ENTITY> doSelectOptionalEntity(LawHistoryCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * LawHistory <span style="color: #553000">lawHistory</span> = <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">lawHistory</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of LawHistory. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LawHistory selectEntityWithDeletedCheck(CBCall<LawHistoryCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param lawHistoryId (法令履歴ID): PK, ID, NotNull, INT(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<LawHistory> selectByPK(Integer lawHistoryId) {
        return facadeSelectByPK(lawHistoryId);
    }

    protected OptionalEntity<LawHistory> facadeSelectByPK(Integer lawHistoryId) {
        return doSelectOptionalByPK(lawHistoryId, typeOfSelectedEntity());
    }

    protected <ENTITY extends LawHistory> ENTITY doSelectByPK(Integer lawHistoryId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(lawHistoryId), tp);
    }

    protected <ENTITY extends LawHistory> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer lawHistoryId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(lawHistoryId, tp), lawHistoryId);
    }

    protected LawHistoryCB xprepareCBAsPK(Integer lawHistoryId) {
        assertObjectNotNull("lawHistoryId", lawHistoryId);
        return newConditionBean().acceptPK(lawHistoryId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param lawId (法令ID): UQ+, NotNull, INT(10), FK to LAW. (NotNull)
     * @param lawAmendVersion (法令改正バージョン): +UQ, NotNull, INT(10). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<LawHistory> selectByUniqueOf(Integer lawId, Integer lawAmendVersion) {
        return facadeSelectByUniqueOf(lawId, lawAmendVersion);
    }

    protected OptionalEntity<LawHistory> facadeSelectByUniqueOf(Integer lawId, Integer lawAmendVersion) {
        return doSelectByUniqueOf(lawId, lawAmendVersion, typeOfSelectedEntity());
    }

    protected <ENTITY extends LawHistory> OptionalEntity<ENTITY> doSelectByUniqueOf(Integer lawId, Integer lawAmendVersion, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(lawId, lawAmendVersion), tp), lawId, lawAmendVersion);
    }

    protected LawHistoryCB xprepareCBAsUniqueOf(Integer lawId, Integer lawAmendVersion) {
        assertObjectNotNull("lawId", lawId);assertObjectNotNull("lawAmendVersion", lawAmendVersion);
        return newConditionBean().acceptUniqueOf(lawId, lawAmendVersion);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;LawHistory&gt; <span style="color: #553000">lawHistoryList</span> = <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (LawHistory <span style="color: #553000">lawHistory</span> : <span style="color: #553000">lawHistoryList</span>) {
     *     ... = <span style="color: #553000">lawHistory</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of LawHistory. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LawHistory> selectList(CBCall<LawHistoryCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    @Override
    protected boolean isEntityDerivedMappable() { return true; }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * PagingResultBean&lt;LawHistory&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (LawHistory lawHistory : <span style="color: #553000">page</span>) {
     *     ... = lawHistory.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of LawHistory. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LawHistory> selectPage(CBCall<LawHistoryCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of LawHistory. (NotNull)
     * @param entityLambda The handler of entity row of LawHistory. (NotNull)
     */
    public void selectCursor(CBCall<LawHistoryCB> cbLambda, EntityRowHandler<LawHistory> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<LawHistoryCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + asTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer for the list by the referrer loader.
     * <pre>
     * List&lt;Member&gt; <span style="color: #553000">memberList</span> = <span style="color: #0000C0">memberBhv</span>.selectList(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * memberBhv.<span style="color: #CC4747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * <span style="color: #70226C">for</span> (Member member : <span style="color: #553000">memberList</span>) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #CC4747">getPurchaseList()</span>;
     *     <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param lawHistoryList The entity list of lawHistory. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<LawHistory> lawHistoryList, ReferrerLoaderHandler<LoaderOfLawHistory> loaderLambda) {
        xassLRArg(lawHistoryList, loaderLambda);
        loaderLambda.handle(new LoaderOfLawHistory().ready(lawHistoryList, _behaviorSelector));
    }

    /**
     * Load referrer for the entity by the referrer loader.
     * <pre>
     * Member <span style="color: #553000">member</span> = <span style="color: #0000C0">memberBhv</span>.selectEntityWithDeletedCheck(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> <span style="color: #553000">cb</span>.acceptPK(1));
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">load</span>(<span style="color: #553000">member</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * List&lt;Purchase&gt; purchaseList = <span style="color: #553000">member</span>.<span style="color: #CC4747">getPurchaseList()</span>;
     * <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *     ...
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param lawHistory The entity of lawHistory. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(LawHistory lawHistory, ReferrerLoaderHandler<LoaderOfLawHistory> loaderLambda) {
        xassLRArg(lawHistory, loaderLambda);
        loaderLambda.handle(new LoaderOfLawHistory().ready(xnewLRAryLs(lawHistory), _behaviorSelector));
    }

    /**
     * Load referrer of articleList by the set-upper of referrer. <br>
     * (条文)ARTICLE by LAW_HISTORY_ID, named 'articleList'.
     * <pre>
     * <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #CC4747">loadArticle</span>(<span style="color: #553000">lawHistoryList</span>, <span style="color: #553000">articleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">articleCB</span>.setupSelect...
     *     <span style="color: #553000">articleCB</span>.query().set...
     *     <span style="color: #553000">articleCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (LawHistory lawHistory : <span style="color: #553000">lawHistoryList</span>) {
     *     ... = lawHistory.<span style="color: #CC4747">getArticleList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLawHistoryId_InScope(pkList);
     * cb.query().addOrderBy_LawHistoryId_Asc();
     * </pre>
     * @param lawHistoryList The entity list of lawHistory. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Article> loadArticle(List<LawHistory> lawHistoryList, ReferrerConditionSetupper<ArticleCB> refCBLambda) {
        xassLRArg(lawHistoryList, refCBLambda);
        return doLoadArticle(lawHistoryList, new LoadReferrerOption<ArticleCB, Article>().xinit(refCBLambda));
    }

    /**
     * Load referrer of articleList by the set-upper of referrer. <br>
     * (条文)ARTICLE by LAW_HISTORY_ID, named 'articleList'.
     * <pre>
     * <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #CC4747">loadArticle</span>(<span style="color: #553000">lawHistory</span>, <span style="color: #553000">articleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">articleCB</span>.setupSelect...
     *     <span style="color: #553000">articleCB</span>.query().set...
     *     <span style="color: #553000">articleCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">lawHistory</span>.<span style="color: #CC4747">getArticleList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLawHistoryId_InScope(pkList);
     * cb.query().addOrderBy_LawHistoryId_Asc();
     * </pre>
     * @param lawHistory The entity of lawHistory. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Article> loadArticle(LawHistory lawHistory, ReferrerConditionSetupper<ArticleCB> refCBLambda) {
        xassLRArg(lawHistory, refCBLambda);
        return doLoadArticle(xnewLRLs(lawHistory), new LoadReferrerOption<ArticleCB, Article>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<Article> doLoadArticle(List<LawHistory> lawHistoryList, LoadReferrerOption<ArticleCB, Article> option) {
        return helpLoadReferrerInternally(lawHistoryList, option, "articleList");
    }

    /**
     * Load referrer of lawTocList by the set-upper of referrer. <br>
     * (法令目次)LAW_TOC by LAW_HISTORY_ID, named 'lawTocList'.
     * <pre>
     * <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #CC4747">loadLawToc</span>(<span style="color: #553000">lawHistoryList</span>, <span style="color: #553000">tocCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">tocCB</span>.setupSelect...
     *     <span style="color: #553000">tocCB</span>.query().set...
     *     <span style="color: #553000">tocCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (LawHistory lawHistory : <span style="color: #553000">lawHistoryList</span>) {
     *     ... = lawHistory.<span style="color: #CC4747">getLawTocList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLawHistoryId_InScope(pkList);
     * cb.query().addOrderBy_LawHistoryId_Asc();
     * </pre>
     * @param lawHistoryList The entity list of lawHistory. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LawToc> loadLawToc(List<LawHistory> lawHistoryList, ReferrerConditionSetupper<LawTocCB> refCBLambda) {
        xassLRArg(lawHistoryList, refCBLambda);
        return doLoadLawToc(lawHistoryList, new LoadReferrerOption<LawTocCB, LawToc>().xinit(refCBLambda));
    }

    /**
     * Load referrer of lawTocList by the set-upper of referrer. <br>
     * (法令目次)LAW_TOC by LAW_HISTORY_ID, named 'lawTocList'.
     * <pre>
     * <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #CC4747">loadLawToc</span>(<span style="color: #553000">lawHistory</span>, <span style="color: #553000">tocCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">tocCB</span>.setupSelect...
     *     <span style="color: #553000">tocCB</span>.query().set...
     *     <span style="color: #553000">tocCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">lawHistory</span>.<span style="color: #CC4747">getLawTocList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLawHistoryId_InScope(pkList);
     * cb.query().addOrderBy_LawHistoryId_Asc();
     * </pre>
     * @param lawHistory The entity of lawHistory. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LawToc> loadLawToc(LawHistory lawHistory, ReferrerConditionSetupper<LawTocCB> refCBLambda) {
        xassLRArg(lawHistory, refCBLambda);
        return doLoadLawToc(xnewLRLs(lawHistory), new LoadReferrerOption<LawTocCB, LawToc>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<LawToc> doLoadLawToc(List<LawHistory> lawHistoryList, LoadReferrerOption<LawTocCB, LawToc> option) {
        return helpLoadReferrerInternally(lawHistoryList, option, "lawTocList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'Law'.
     * @param lawHistoryList The list of lawHistory. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Law> pulloutLawByAmendLawId(List<LawHistory> lawHistoryList)
    { return helpPulloutInternally(lawHistoryList, "lawByAmendLawId"); }

    /**
     * Pull out the list of foreign table 'Law'.
     * @param lawHistoryList The list of lawHistory. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Law> pulloutLawByLawId(List<LawHistory> lawHistoryList)
    { return helpPulloutInternally(lawHistoryList, "lawByLawId"); }

    /**
     * Pull out the list of referrer-as-one table 'LawContent'.
     * @param lawHistoryList The list of lawHistory. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LawContent> pulloutLawContentAsOne(List<LawHistory> lawHistoryList)
    { return helpPulloutInternally(lawHistoryList, "lawContentAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key lawHistoryId.
     * @param lawHistoryList The list of lawHistory. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractLawHistoryIdList(List<LawHistory> lawHistoryList)
    { return helpExtractListInternally(lawHistoryList, "lawHistoryId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * LawHistory lawHistory = <span style="color: #70226C">new</span> LawHistory();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * lawHistory.setFoo...(value);
     * lawHistory.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//lawHistory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//lawHistory.set...;</span>
     * <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #CC4747">insert</span>(lawHistory);
     * ... = lawHistory.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param lawHistory The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LawHistory lawHistory) {
        doInsert(lawHistory, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * LawHistory lawHistory = <span style="color: #70226C">new</span> LawHistory();
     * lawHistory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * lawHistory.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//lawHistory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//lawHistory.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * lawHistory.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #CC4747">update</span>(lawHistory);
     * </pre>
     * @param lawHistory The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(LawHistory lawHistory) {
        doUpdate(lawHistory, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * LawHistory lawHistory = <span style="color: #70226C">new</span> LawHistory();
     * lawHistory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * lawHistory.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//lawHistory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//lawHistory.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//lawHistory.setVersionNo(value);</span>
     * <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(lawHistory);
     * </pre>
     * @param lawHistory The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(LawHistory lawHistory) {
        doUpdateNonstrict(lawHistory, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param lawHistory The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LawHistory lawHistory) {
        doInsertOrUpdate(lawHistory, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param lawHistory The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(LawHistory lawHistory) {
        doInsertOrUpdateNonstrict(lawHistory, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * LawHistory lawHistory = <span style="color: #70226C">new</span> LawHistory();
     * lawHistory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * lawHistory.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #CC4747">delete</span>(lawHistory);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param lawHistory The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LawHistory lawHistory) {
        doDelete(lawHistory, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * LawHistory lawHistory = <span style="color: #70226C">new</span> LawHistory();
     * lawHistory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//lawHistory.setVersionNo(value);</span>
     * <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(lawHistory);
     * </pre>
     * @param lawHistory The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LawHistory lawHistory) {
        doDeleteNonstrict(lawHistory, null);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <p><span style="color: #CC4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     LawHistory lawHistory = <span style="color: #70226C">new</span> LawHistory();
     *     lawHistory.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         lawHistory.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     lawHistoryList.add(lawHistory);
     * }
     * <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #CC4747">batchInsert</span>(lawHistoryList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param lawHistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LawHistory> lawHistoryList) {
        return doBatchInsert(lawHistoryList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LawHistory lawHistory = <span style="color: #70226C">new</span> LawHistory();
     *     lawHistory.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         lawHistory.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         lawHistory.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//lawHistory.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     lawHistoryList.add(lawHistory);
     * }
     * <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #CC4747">batchUpdate</span>(lawHistoryList);
     * </pre>
     * @param lawHistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LawHistory> lawHistoryList) {
        return doBatchUpdate(lawHistoryList, null);
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     LawHistory lawHistory = <span style="color: #70226C">new</span> LawHistory();
     *     lawHistory.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         lawHistory.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         lawHistory.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//lawHistory.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     lawHistoryList.add(lawHistory);
     * }
     * <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #CC4747">batchUpdate</span>(lawHistoryList);
     * </pre>
     * @param lawHistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LawHistory> lawHistoryList) {
        return doBatchUpdateNonstrict(lawHistoryList, null);
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param lawHistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<LawHistory> lawHistoryList) {
        return doBatchDelete(lawHistoryList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param lawHistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<LawHistory> lawHistoryList) {
        return doBatchDeleteNonstrict(lawHistoryList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;LawHistory, LawHistoryCB&gt;() {
     *     public ConditionBean setup(LawHistory entity, LawHistoryCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     *
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param manyArgLambda The callback to set up query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<LawHistory, LawHistoryCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * LawHistory lawHistory = <span style="color: #70226C">new</span> LawHistory();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//lawHistory.setPK...(value);</span>
     * lawHistory.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//lawHistory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//lawHistory.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//lawHistory.setVersionNo(value);</span>
     * <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #CC4747">queryUpdate</span>(lawHistory, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param lawHistory The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of LawHistory. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LawHistory lawHistory, CBCall<LawHistoryCB> cbLambda) {
        return doQueryUpdate(lawHistory, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #CC4747">queryDelete</span>(lawHistory, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of LawHistory. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<LawHistoryCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as insert(entity).
     * <pre>
     * LawHistory lawHistory = <span style="color: #70226C">new</span> LawHistory();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * lawHistory.setFoo...(value);
     * lawHistory.setBar...(value);
     * <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #CC4747">varyingInsert</span>(lawHistory, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = lawHistory.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param lawHistory The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(LawHistory lawHistory, WritableOptionCall<LawHistoryCB, InsertOption<LawHistoryCB>> opLambda) {
        doInsert(lawHistory, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * LawHistory lawHistory = <span style="color: #70226C">new</span> LawHistory();
     * lawHistory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * lawHistory.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * lawHistory.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(lawHistory, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param lawHistory The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(LawHistory lawHistory, WritableOptionCall<LawHistoryCB, UpdateOption<LawHistoryCB>> opLambda) {
        doUpdate(lawHistory, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * LawHistory lawHistory = <span style="color: #70226C">new</span> LawHistory();
     * lawHistory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * lawHistory.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//lawHistory.setVersionNo(value);</span>
     * <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(lawHistory, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param lawHistory The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(LawHistory lawHistory, WritableOptionCall<LawHistoryCB, UpdateOption<LawHistoryCB>> opLambda) {
        doUpdateNonstrict(lawHistory, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param lawHistory The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(LawHistory lawHistory, WritableOptionCall<LawHistoryCB, InsertOption<LawHistoryCB>> insertOpLambda, WritableOptionCall<LawHistoryCB, UpdateOption<LawHistoryCB>> updateOpLambda) {
        doInsertOrUpdate(lawHistory, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param lawHistory The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(LawHistory lawHistory, WritableOptionCall<LawHistoryCB, InsertOption<LawHistoryCB>> insertOpLambda, WritableOptionCall<LawHistoryCB, UpdateOption<LawHistoryCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(lawHistory, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param lawHistory The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(LawHistory lawHistory, WritableOptionCall<LawHistoryCB, DeleteOption<LawHistoryCB>> opLambda) {
        doDelete(lawHistory, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param lawHistory The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(LawHistory lawHistory, WritableOptionCall<LawHistoryCB, DeleteOption<LawHistoryCB>> opLambda) {
        doDeleteNonstrict(lawHistory, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param lawHistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<LawHistory> lawHistoryList, WritableOptionCall<LawHistoryCB, InsertOption<LawHistoryCB>> opLambda) {
        return doBatchInsert(lawHistoryList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param lawHistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<LawHistory> lawHistoryList, WritableOptionCall<LawHistoryCB, UpdateOption<LawHistoryCB>> opLambda) {
        return doBatchUpdate(lawHistoryList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param lawHistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<LawHistory> lawHistoryList, WritableOptionCall<LawHistoryCB, UpdateOption<LawHistoryCB>> opLambda) {
        return doBatchUpdateNonstrict(lawHistoryList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param lawHistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<LawHistory> lawHistoryList, WritableOptionCall<LawHistoryCB, DeleteOption<LawHistoryCB>> opLambda) {
        return doBatchDelete(lawHistoryList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param lawHistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<LawHistory> lawHistoryList, WritableOptionCall<LawHistoryCB, DeleteOption<LawHistoryCB>> opLambda) {
        return doBatchDeleteNonstrict(lawHistoryList, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as queryInsert(entity, setupper).
     * @param manyArgLambda The set-upper of query-insert. (NotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<LawHistory, LawHistoryCB> manyArgLambda, WritableOptionCall<LawHistoryCB, InsertOption<LawHistoryCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * LawHistory lawHistory = <span style="color: #70226C">new</span> LawHistory();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//lawHistory.setPK...(value);</span>
     * lawHistory.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//lawHistory.setVersionNo(value);</span>
     * <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(lawHistory, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param lawHistory The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of LawHistory. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(LawHistory lawHistory, CBCall<LawHistoryCB> cbLambda, WritableOptionCall<LawHistoryCB, UpdateOption<LawHistoryCB>> opLambda) {
        return doQueryUpdate(lawHistory, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #CC4747">queryDelete</span>(lawHistory, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of LawHistory. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<LawHistoryCB> cbLambda, WritableOptionCall<LawHistoryCB, DeleteOption<LawHistoryCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * lawHistoryBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * lawHistoryBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * lawHistoryBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * lawHistoryBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * lawHistoryBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * lawHistoryBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * lawHistoryBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * lawHistoryBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * lawHistoryBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * lawHistoryBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * lawHistoryBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * lawHistoryBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * lawHistoryBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * lawHistoryBhv.outideSql().removeBlockComment().selectList()
     * lawHistoryBhv.outideSql().removeLineComment().selectList()
     * lawHistoryBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<LawHistoryBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    @Override
    protected boolean hasVersionNoValue(Entity et) { return downcast(et).getVersionNo() != null; }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends LawHistory> typeOfSelectedEntity() { return LawHistory.class; }
    protected Class<LawHistory> typeOfHandlingEntity() { return LawHistory.class; }
    protected Class<LawHistoryCB> typeOfHandlingConditionBean() { return LawHistoryCB.class; }
}
