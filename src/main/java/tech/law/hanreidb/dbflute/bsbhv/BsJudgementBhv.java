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
 * The behavior of (判決)JUDGEMENT as TABLE. <br>
 * <pre>
 * [primary key]
 *     JUDGEMENT_ID
 *
 * [column]
 *     JUDGEMENT_ID, JUDGEMENT_PUBLIC_CODE, CASE_NAME, JUDGEMENT_DATE, ORIGINAL_JUDGEMENT_ID, CASE_NUMBER_ERA_CODE, CASE_NUMBER_YEAR, CASE_MARK_ID, CASE_NUMBER_SERIAL_NUMBER, COURT_ID, BENCH_CODE, JUDGEMENT_RESULT_CODE, JUDGEMENT_TYPE_CODE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     JUDGEMENT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     CLS_BENCH, CASE_MARK, CLS_ERA, COURT, CLS_JUDGEMENT_RESULT, CLS_JUDGEMENT_TYPE, JUDGEMENT
 *
 * [referrer table]
 *     JUDGEMENT, JUDGEMENT_ARTICLE_REL, JUDGEMENT_REPORT_REL, JUDGEMENT_SOURCE_REL, JUDGEMENT_USER_FAVORITE_REL
 *
 * [foreign property]
 *     clsBench, caseMark, clsEra, court, clsJudgementResult, clsJudgementType, judgementSelf
 *
 * [referrer property]
 *     judgementSelfList, judgementArticleRelList, judgementReportRelList, judgementSourceRelList, judgementUserFavoriteRelList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsJudgementBhv extends AbstractBehaviorWritable<Judgement, JudgementCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public JudgementDbm asDBMeta() { return JudgementDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "JUDGEMENT"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public JudgementCB newConditionBean() { return new JudgementCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of Judgement. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<JudgementCB> cbLambda) {
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
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">judgement</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">judgement</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">judgement</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">judgement</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of Judgement. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<Judgement> selectEntity(CBCall<JudgementCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<Judgement> facadeSelectEntity(JudgementCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends Judgement> OptionalEntity<ENTITY> doSelectOptionalEntity(JudgementCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * Judgement <span style="color: #553000">judgement</span> = <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">judgement</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of Judgement. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Judgement selectEntityWithDeletedCheck(CBCall<JudgementCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param judgementId (判決ID): PK, ID, NotNull, BIGINT UNSIGNED(20). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<Judgement> selectByPK(Long judgementId) {
        return facadeSelectByPK(judgementId);
    }

    protected OptionalEntity<Judgement> facadeSelectByPK(Long judgementId) {
        return doSelectOptionalByPK(judgementId, typeOfSelectedEntity());
    }

    protected <ENTITY extends Judgement> ENTITY doSelectByPK(Long judgementId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(judgementId), tp);
    }

    protected <ENTITY extends Judgement> OptionalEntity<ENTITY> doSelectOptionalByPK(Long judgementId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(judgementId, tp), judgementId);
    }

    protected JudgementCB xprepareCBAsPK(Long judgementId) {
        assertObjectNotNull("judgementId", judgementId);
        return newConditionBean().acceptPK(judgementId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param judgementPublicCode (判決公開コード): UQ, NotNull, VARCHAR(12). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<Judgement> selectByUniqueOf(String judgementPublicCode) {
        return facadeSelectByUniqueOf(judgementPublicCode);
    }

    protected OptionalEntity<Judgement> facadeSelectByUniqueOf(String judgementPublicCode) {
        return doSelectByUniqueOf(judgementPublicCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends Judgement> OptionalEntity<ENTITY> doSelectByUniqueOf(String judgementPublicCode, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(judgementPublicCode), tp), judgementPublicCode);
    }

    protected JudgementCB xprepareCBAsUniqueOf(String judgementPublicCode) {
        assertObjectNotNull("judgementPublicCode", judgementPublicCode);
        return newConditionBean().acceptUniqueOf(judgementPublicCode);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;Judgement&gt; <span style="color: #553000">judgementList</span> = <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (Judgement <span style="color: #553000">judgement</span> : <span style="color: #553000">judgementList</span>) {
     *     ... = <span style="color: #553000">judgement</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of Judgement. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<Judgement> selectList(CBCall<JudgementCB> cbLambda) {
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
     * PagingResultBean&lt;Judgement&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (Judgement judgement : <span style="color: #553000">page</span>) {
     *     ... = judgement.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of Judgement. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<Judgement> selectPage(CBCall<JudgementCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of Judgement. (NotNull)
     * @param entityLambda The handler of entity row of Judgement. (NotNull)
     */
    public void selectCursor(CBCall<JudgementCB> cbLambda, EntityRowHandler<Judgement> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<JudgementCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param judgementList The entity list of judgement. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<Judgement> judgementList, ReferrerLoaderHandler<LoaderOfJudgement> loaderLambda) {
        xassLRArg(judgementList, loaderLambda);
        loaderLambda.handle(new LoaderOfJudgement().ready(judgementList, _behaviorSelector));
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
     * @param judgement The entity of judgement. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(Judgement judgement, ReferrerLoaderHandler<LoaderOfJudgement> loaderLambda) {
        xassLRArg(judgement, loaderLambda);
        loaderLambda.handle(new LoaderOfJudgement().ready(xnewLRAryLs(judgement), _behaviorSelector));
    }

    /**
     * Load referrer of judgementSelfList by the set-upper of referrer. <br>
     * (判決)JUDGEMENT by ORIGINAL_JUDGEMENT_ID, named 'judgementSelfList'.
     * <pre>
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">loadJudgementSelf</span>(<span style="color: #553000">judgementList</span>, <span style="color: #553000">judgementCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">judgementCB</span>.setupSelect...
     *     <span style="color: #553000">judgementCB</span>.query().set...
     *     <span style="color: #553000">judgementCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (Judgement judgement : <span style="color: #553000">judgementList</span>) {
     *     ... = judgement.<span style="color: #CC4747">getJudgementSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setOriginalJudgementId_InScope(pkList);
     * cb.query().addOrderBy_OriginalJudgementId_Asc();
     * </pre>
     * @param judgementList The entity list of judgement. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Judgement> loadJudgementSelf(List<Judgement> judgementList, ReferrerConditionSetupper<JudgementCB> refCBLambda) {
        xassLRArg(judgementList, refCBLambda);
        return doLoadJudgementSelf(judgementList, new LoadReferrerOption<JudgementCB, Judgement>().xinit(refCBLambda));
    }

    /**
     * Load referrer of judgementSelfList by the set-upper of referrer. <br>
     * (判決)JUDGEMENT by ORIGINAL_JUDGEMENT_ID, named 'judgementSelfList'.
     * <pre>
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">loadJudgementSelf</span>(<span style="color: #553000">judgement</span>, <span style="color: #553000">judgementCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">judgementCB</span>.setupSelect...
     *     <span style="color: #553000">judgementCB</span>.query().set...
     *     <span style="color: #553000">judgementCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">judgement</span>.<span style="color: #CC4747">getJudgementSelfList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setOriginalJudgementId_InScope(pkList);
     * cb.query().addOrderBy_OriginalJudgementId_Asc();
     * </pre>
     * @param judgement The entity of judgement. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Judgement> loadJudgementSelf(Judgement judgement, ReferrerConditionSetupper<JudgementCB> refCBLambda) {
        xassLRArg(judgement, refCBLambda);
        return doLoadJudgementSelf(xnewLRLs(judgement), new LoadReferrerOption<JudgementCB, Judgement>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<Judgement> doLoadJudgementSelf(List<Judgement> judgementList, LoadReferrerOption<JudgementCB, Judgement> option) {
        return helpLoadReferrerInternally(judgementList, option, "judgementSelfList");
    }

    /**
     * Load referrer of judgementArticleRelList by the set-upper of referrer. <br>
     * (判決条文リレーション)JUDGEMENT_ARTICLE_REL by JUDGEMENT_ID, named 'judgementArticleRelList'.
     * <pre>
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">loadJudgementArticleRel</span>(<span style="color: #553000">judgementList</span>, <span style="color: #553000">relCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">relCB</span>.setupSelect...
     *     <span style="color: #553000">relCB</span>.query().set...
     *     <span style="color: #553000">relCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (Judgement judgement : <span style="color: #553000">judgementList</span>) {
     *     ... = judgement.<span style="color: #CC4747">getJudgementArticleRelList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setJudgementId_InScope(pkList);
     * cb.query().addOrderBy_JudgementId_Asc();
     * </pre>
     * @param judgementList The entity list of judgement. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<JudgementArticleRel> loadJudgementArticleRel(List<Judgement> judgementList, ReferrerConditionSetupper<JudgementArticleRelCB> refCBLambda) {
        xassLRArg(judgementList, refCBLambda);
        return doLoadJudgementArticleRel(judgementList, new LoadReferrerOption<JudgementArticleRelCB, JudgementArticleRel>().xinit(refCBLambda));
    }

    /**
     * Load referrer of judgementArticleRelList by the set-upper of referrer. <br>
     * (判決条文リレーション)JUDGEMENT_ARTICLE_REL by JUDGEMENT_ID, named 'judgementArticleRelList'.
     * <pre>
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">loadJudgementArticleRel</span>(<span style="color: #553000">judgement</span>, <span style="color: #553000">relCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">relCB</span>.setupSelect...
     *     <span style="color: #553000">relCB</span>.query().set...
     *     <span style="color: #553000">relCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">judgement</span>.<span style="color: #CC4747">getJudgementArticleRelList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setJudgementId_InScope(pkList);
     * cb.query().addOrderBy_JudgementId_Asc();
     * </pre>
     * @param judgement The entity of judgement. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<JudgementArticleRel> loadJudgementArticleRel(Judgement judgement, ReferrerConditionSetupper<JudgementArticleRelCB> refCBLambda) {
        xassLRArg(judgement, refCBLambda);
        return doLoadJudgementArticleRel(xnewLRLs(judgement), new LoadReferrerOption<JudgementArticleRelCB, JudgementArticleRel>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<JudgementArticleRel> doLoadJudgementArticleRel(List<Judgement> judgementList, LoadReferrerOption<JudgementArticleRelCB, JudgementArticleRel> option) {
        return helpLoadReferrerInternally(judgementList, option, "judgementArticleRelList");
    }

    /**
     * Load referrer of judgementReportRelList by the set-upper of referrer. <br>
     * (判決判例集リレーション)JUDGEMENT_REPORT_REL by JUDGEMENT_ID, named 'judgementReportRelList'.
     * <pre>
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">loadJudgementReportRel</span>(<span style="color: #553000">judgementList</span>, <span style="color: #553000">relCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">relCB</span>.setupSelect...
     *     <span style="color: #553000">relCB</span>.query().set...
     *     <span style="color: #553000">relCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (Judgement judgement : <span style="color: #553000">judgementList</span>) {
     *     ... = judgement.<span style="color: #CC4747">getJudgementReportRelList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setJudgementId_InScope(pkList);
     * cb.query().addOrderBy_JudgementId_Asc();
     * </pre>
     * @param judgementList The entity list of judgement. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<JudgementReportRel> loadJudgementReportRel(List<Judgement> judgementList, ReferrerConditionSetupper<JudgementReportRelCB> refCBLambda) {
        xassLRArg(judgementList, refCBLambda);
        return doLoadJudgementReportRel(judgementList, new LoadReferrerOption<JudgementReportRelCB, JudgementReportRel>().xinit(refCBLambda));
    }

    /**
     * Load referrer of judgementReportRelList by the set-upper of referrer. <br>
     * (判決判例集リレーション)JUDGEMENT_REPORT_REL by JUDGEMENT_ID, named 'judgementReportRelList'.
     * <pre>
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">loadJudgementReportRel</span>(<span style="color: #553000">judgement</span>, <span style="color: #553000">relCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">relCB</span>.setupSelect...
     *     <span style="color: #553000">relCB</span>.query().set...
     *     <span style="color: #553000">relCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">judgement</span>.<span style="color: #CC4747">getJudgementReportRelList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setJudgementId_InScope(pkList);
     * cb.query().addOrderBy_JudgementId_Asc();
     * </pre>
     * @param judgement The entity of judgement. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<JudgementReportRel> loadJudgementReportRel(Judgement judgement, ReferrerConditionSetupper<JudgementReportRelCB> refCBLambda) {
        xassLRArg(judgement, refCBLambda);
        return doLoadJudgementReportRel(xnewLRLs(judgement), new LoadReferrerOption<JudgementReportRelCB, JudgementReportRel>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<JudgementReportRel> doLoadJudgementReportRel(List<Judgement> judgementList, LoadReferrerOption<JudgementReportRelCB, JudgementReportRel> option) {
        return helpLoadReferrerInternally(judgementList, option, "judgementReportRelList");
    }

    /**
     * Load referrer of judgementSourceRelList by the set-upper of referrer. <br>
     * (判決取得元リレーション)JUDGEMENT_SOURCE_REL by JUDGEMENT_ID, named 'judgementSourceRelList'.
     * <pre>
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">loadJudgementSourceRel</span>(<span style="color: #553000">judgementList</span>, <span style="color: #553000">relCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">relCB</span>.setupSelect...
     *     <span style="color: #553000">relCB</span>.query().set...
     *     <span style="color: #553000">relCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (Judgement judgement : <span style="color: #553000">judgementList</span>) {
     *     ... = judgement.<span style="color: #CC4747">getJudgementSourceRelList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setJudgementId_InScope(pkList);
     * cb.query().addOrderBy_JudgementId_Asc();
     * </pre>
     * @param judgementList The entity list of judgement. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<JudgementSourceRel> loadJudgementSourceRel(List<Judgement> judgementList, ReferrerConditionSetupper<JudgementSourceRelCB> refCBLambda) {
        xassLRArg(judgementList, refCBLambda);
        return doLoadJudgementSourceRel(judgementList, new LoadReferrerOption<JudgementSourceRelCB, JudgementSourceRel>().xinit(refCBLambda));
    }

    /**
     * Load referrer of judgementSourceRelList by the set-upper of referrer. <br>
     * (判決取得元リレーション)JUDGEMENT_SOURCE_REL by JUDGEMENT_ID, named 'judgementSourceRelList'.
     * <pre>
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">loadJudgementSourceRel</span>(<span style="color: #553000">judgement</span>, <span style="color: #553000">relCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">relCB</span>.setupSelect...
     *     <span style="color: #553000">relCB</span>.query().set...
     *     <span style="color: #553000">relCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">judgement</span>.<span style="color: #CC4747">getJudgementSourceRelList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setJudgementId_InScope(pkList);
     * cb.query().addOrderBy_JudgementId_Asc();
     * </pre>
     * @param judgement The entity of judgement. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<JudgementSourceRel> loadJudgementSourceRel(Judgement judgement, ReferrerConditionSetupper<JudgementSourceRelCB> refCBLambda) {
        xassLRArg(judgement, refCBLambda);
        return doLoadJudgementSourceRel(xnewLRLs(judgement), new LoadReferrerOption<JudgementSourceRelCB, JudgementSourceRel>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<JudgementSourceRel> doLoadJudgementSourceRel(List<Judgement> judgementList, LoadReferrerOption<JudgementSourceRelCB, JudgementSourceRel> option) {
        return helpLoadReferrerInternally(judgementList, option, "judgementSourceRelList");
    }

    /**
     * Load referrer of judgementUserFavoriteRelList by the set-upper of referrer. <br>
     * (判決ユーザーお気に入りリレーション)JUDGEMENT_USER_FAVORITE_REL by JUDGEMENT_ID, named 'judgementUserFavoriteRelList'.
     * <pre>
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">loadJudgementUserFavoriteRel</span>(<span style="color: #553000">judgementList</span>, <span style="color: #553000">relCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">relCB</span>.setupSelect...
     *     <span style="color: #553000">relCB</span>.query().set...
     *     <span style="color: #553000">relCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (Judgement judgement : <span style="color: #553000">judgementList</span>) {
     *     ... = judgement.<span style="color: #CC4747">getJudgementUserFavoriteRelList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setJudgementId_InScope(pkList);
     * cb.query().addOrderBy_JudgementId_Asc();
     * </pre>
     * @param judgementList The entity list of judgement. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<JudgementUserFavoriteRel> loadJudgementUserFavoriteRel(List<Judgement> judgementList, ReferrerConditionSetupper<JudgementUserFavoriteRelCB> refCBLambda) {
        xassLRArg(judgementList, refCBLambda);
        return doLoadJudgementUserFavoriteRel(judgementList, new LoadReferrerOption<JudgementUserFavoriteRelCB, JudgementUserFavoriteRel>().xinit(refCBLambda));
    }

    /**
     * Load referrer of judgementUserFavoriteRelList by the set-upper of referrer. <br>
     * (判決ユーザーお気に入りリレーション)JUDGEMENT_USER_FAVORITE_REL by JUDGEMENT_ID, named 'judgementUserFavoriteRelList'.
     * <pre>
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">loadJudgementUserFavoriteRel</span>(<span style="color: #553000">judgement</span>, <span style="color: #553000">relCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">relCB</span>.setupSelect...
     *     <span style="color: #553000">relCB</span>.query().set...
     *     <span style="color: #553000">relCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">judgement</span>.<span style="color: #CC4747">getJudgementUserFavoriteRelList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setJudgementId_InScope(pkList);
     * cb.query().addOrderBy_JudgementId_Asc();
     * </pre>
     * @param judgement The entity of judgement. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<JudgementUserFavoriteRel> loadJudgementUserFavoriteRel(Judgement judgement, ReferrerConditionSetupper<JudgementUserFavoriteRelCB> refCBLambda) {
        xassLRArg(judgement, refCBLambda);
        return doLoadJudgementUserFavoriteRel(xnewLRLs(judgement), new LoadReferrerOption<JudgementUserFavoriteRelCB, JudgementUserFavoriteRel>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<JudgementUserFavoriteRel> doLoadJudgementUserFavoriteRel(List<Judgement> judgementList, LoadReferrerOption<JudgementUserFavoriteRelCB, JudgementUserFavoriteRel> option) {
        return helpLoadReferrerInternally(judgementList, option, "judgementUserFavoriteRelList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'ClsBench'.
     * @param judgementList The list of judgement. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<ClsBench> pulloutClsBench(List<Judgement> judgementList)
    { return helpPulloutInternally(judgementList, "clsBench"); }

    /**
     * Pull out the list of foreign table 'CaseMark'.
     * @param judgementList The list of judgement. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<CaseMark> pulloutCaseMark(List<Judgement> judgementList)
    { return helpPulloutInternally(judgementList, "caseMark"); }

    /**
     * Pull out the list of foreign table 'ClsEra'.
     * @param judgementList The list of judgement. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<ClsEra> pulloutClsEra(List<Judgement> judgementList)
    { return helpPulloutInternally(judgementList, "clsEra"); }

    /**
     * Pull out the list of foreign table 'Court'.
     * @param judgementList The list of judgement. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Court> pulloutCourt(List<Judgement> judgementList)
    { return helpPulloutInternally(judgementList, "court"); }

    /**
     * Pull out the list of foreign table 'ClsJudgementResult'.
     * @param judgementList The list of judgement. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<ClsJudgementResult> pulloutClsJudgementResult(List<Judgement> judgementList)
    { return helpPulloutInternally(judgementList, "clsJudgementResult"); }

    /**
     * Pull out the list of foreign table 'ClsJudgementType'.
     * @param judgementList The list of judgement. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<ClsJudgementType> pulloutClsJudgementType(List<Judgement> judgementList)
    { return helpPulloutInternally(judgementList, "clsJudgementType"); }

    /**
     * Pull out the list of foreign table 'Judgement'.
     * @param judgementList The list of judgement. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Judgement> pulloutJudgementSelf(List<Judgement> judgementList)
    { return helpPulloutInternally(judgementList, "judgementSelf"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key judgementId.
     * @param judgementList The list of judgement. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractJudgementIdList(List<Judgement> judgementList)
    { return helpExtractListInternally(judgementList, "judgementId"); }

    /**
     * Extract the value list of (single) unique key judgementPublicCode.
     * @param judgementList The list of judgement. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractJudgementPublicCodeList(List<Judgement> judgementList)
    { return helpExtractListInternally(judgementList, "judgementPublicCode"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * Judgement judgement = <span style="color: #70226C">new</span> Judgement();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * judgement.setFoo...(value);
     * judgement.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//judgement.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//judgement.set...;</span>
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">insert</span>(judgement);
     * ... = judgement.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param judgement The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(Judgement judgement) {
        doInsert(judgement, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * Judgement judgement = <span style="color: #70226C">new</span> Judgement();
     * judgement.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * judgement.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//judgement.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//judgement.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * judgement.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">update</span>(judgement);
     * </pre>
     * @param judgement The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(Judgement judgement) {
        doUpdate(judgement, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * Judgement judgement = <span style="color: #70226C">new</span> Judgement();
     * judgement.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * judgement.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//judgement.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//judgement.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//judgement.setVersionNo(value);</span>
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(judgement);
     * </pre>
     * @param judgement The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(Judgement judgement) {
        doUpdateNonstrict(judgement, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param judgement The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(Judgement judgement) {
        doInsertOrUpdate(judgement, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param judgement The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(Judgement judgement) {
        doInsertOrUpdateNonstrict(judgement, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * Judgement judgement = <span style="color: #70226C">new</span> Judgement();
     * judgement.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * judgement.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">delete</span>(judgement);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param judgement The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(Judgement judgement) {
        doDelete(judgement, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * Judgement judgement = <span style="color: #70226C">new</span> Judgement();
     * judgement.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//judgement.setVersionNo(value);</span>
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(judgement);
     * </pre>
     * @param judgement The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(Judgement judgement) {
        doDeleteNonstrict(judgement, null);
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
     *     Judgement judgement = <span style="color: #70226C">new</span> Judgement();
     *     judgement.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         judgement.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     judgementList.add(judgement);
     * }
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">batchInsert</span>(judgementList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param judgementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<Judgement> judgementList) {
        return doBatchInsert(judgementList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     Judgement judgement = <span style="color: #70226C">new</span> Judgement();
     *     judgement.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         judgement.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         judgement.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//judgement.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     judgementList.add(judgement);
     * }
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">batchUpdate</span>(judgementList);
     * </pre>
     * @param judgementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<Judgement> judgementList) {
        return doBatchUpdate(judgementList, null);
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     Judgement judgement = <span style="color: #70226C">new</span> Judgement();
     *     judgement.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         judgement.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         judgement.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//judgement.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     judgementList.add(judgement);
     * }
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">batchUpdate</span>(judgementList);
     * </pre>
     * @param judgementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<Judgement> judgementList) {
        return doBatchUpdateNonstrict(judgementList, null);
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param judgementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<Judgement> judgementList) {
        return doBatchDelete(judgementList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param judgementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<Judgement> judgementList) {
        return doBatchDeleteNonstrict(judgementList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;Judgement, JudgementCB&gt;() {
     *     public ConditionBean setup(Judgement entity, JudgementCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<Judgement, JudgementCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * Judgement judgement = <span style="color: #70226C">new</span> Judgement();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//judgement.setPK...(value);</span>
     * judgement.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//judgement.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//judgement.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//judgement.setVersionNo(value);</span>
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">queryUpdate</span>(judgement, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param judgement The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of Judgement. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(Judgement judgement, CBCall<JudgementCB> cbLambda) {
        return doQueryUpdate(judgement, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">queryDelete</span>(judgement, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of Judgement. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<JudgementCB> cbLambda) {
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
     * Judgement judgement = <span style="color: #70226C">new</span> Judgement();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * judgement.setFoo...(value);
     * judgement.setBar...(value);
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">varyingInsert</span>(judgement, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = judgement.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param judgement The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(Judgement judgement, WritableOptionCall<JudgementCB, InsertOption<JudgementCB>> opLambda) {
        doInsert(judgement, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * Judgement judgement = <span style="color: #70226C">new</span> Judgement();
     * judgement.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * judgement.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * judgement.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(judgement, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param judgement The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(Judgement judgement, WritableOptionCall<JudgementCB, UpdateOption<JudgementCB>> opLambda) {
        doUpdate(judgement, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * Judgement judgement = <span style="color: #70226C">new</span> Judgement();
     * judgement.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * judgement.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//judgement.setVersionNo(value);</span>
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(judgement, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param judgement The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(Judgement judgement, WritableOptionCall<JudgementCB, UpdateOption<JudgementCB>> opLambda) {
        doUpdateNonstrict(judgement, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param judgement The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(Judgement judgement, WritableOptionCall<JudgementCB, InsertOption<JudgementCB>> insertOpLambda, WritableOptionCall<JudgementCB, UpdateOption<JudgementCB>> updateOpLambda) {
        doInsertOrUpdate(judgement, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param judgement The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(Judgement judgement, WritableOptionCall<JudgementCB, InsertOption<JudgementCB>> insertOpLambda, WritableOptionCall<JudgementCB, UpdateOption<JudgementCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(judgement, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param judgement The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(Judgement judgement, WritableOptionCall<JudgementCB, DeleteOption<JudgementCB>> opLambda) {
        doDelete(judgement, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param judgement The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(Judgement judgement, WritableOptionCall<JudgementCB, DeleteOption<JudgementCB>> opLambda) {
        doDeleteNonstrict(judgement, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param judgementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<Judgement> judgementList, WritableOptionCall<JudgementCB, InsertOption<JudgementCB>> opLambda) {
        return doBatchInsert(judgementList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param judgementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<Judgement> judgementList, WritableOptionCall<JudgementCB, UpdateOption<JudgementCB>> opLambda) {
        return doBatchUpdate(judgementList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param judgementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<Judgement> judgementList, WritableOptionCall<JudgementCB, UpdateOption<JudgementCB>> opLambda) {
        return doBatchUpdateNonstrict(judgementList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param judgementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<Judgement> judgementList, WritableOptionCall<JudgementCB, DeleteOption<JudgementCB>> opLambda) {
        return doBatchDelete(judgementList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param judgementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<Judgement> judgementList, WritableOptionCall<JudgementCB, DeleteOption<JudgementCB>> opLambda) {
        return doBatchDeleteNonstrict(judgementList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<Judgement, JudgementCB> manyArgLambda, WritableOptionCall<JudgementCB, InsertOption<JudgementCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * Judgement judgement = <span style="color: #70226C">new</span> Judgement();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//judgement.setPK...(value);</span>
     * judgement.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//judgement.setVersionNo(value);</span>
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(judgement, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param judgement The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of Judgement. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(Judgement judgement, CBCall<JudgementCB> cbLambda, WritableOptionCall<JudgementCB, UpdateOption<JudgementCB>> opLambda) {
        return doQueryUpdate(judgement, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #CC4747">queryDelete</span>(judgement, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of Judgement. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<JudgementCB> cbLambda, WritableOptionCall<JudgementCB, DeleteOption<JudgementCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * judgementBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * judgementBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * judgementBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * judgementBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * judgementBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * judgementBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * judgementBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * judgementBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * judgementBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * judgementBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * judgementBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * judgementBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * judgementBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * judgementBhv.outideSql().removeBlockComment().selectList()
     * judgementBhv.outideSql().removeLineComment().selectList()
     * judgementBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<JudgementBhv> outsideSql() {
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
    protected Class<? extends Judgement> typeOfSelectedEntity() { return Judgement.class; }
    protected Class<Judgement> typeOfHandlingEntity() { return Judgement.class; }
    protected Class<JudgementCB> typeOfHandlingConditionBean() { return JudgementCB.class; }
}
