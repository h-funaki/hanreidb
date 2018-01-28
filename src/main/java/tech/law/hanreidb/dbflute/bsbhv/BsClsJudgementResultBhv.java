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
 * The behavior of ([区分値]判決結果)CLS_JUDGEMENT_RESULT as TABLE. <br>
 * <pre>
 * [primary key]
 *     JUDGEMENT_RESULT_CODE
 *
 * [column]
 *     JUDGEMENT_RESULT_CODE, JUDGEMENT_RESULT_NAME, JUDGEMENT_RESULT_ALIAS, DESCRIPTION, DISPLAY_ORDER, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     JUDGEMENT
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     judgementList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsClsJudgementResultBhv extends AbstractBehaviorWritable<ClsJudgementResult, ClsJudgementResultCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public ClsJudgementResultDbm asDBMeta() { return ClsJudgementResultDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "CLS_JUDGEMENT_RESULT"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public ClsJudgementResultCB newConditionBean() { return new ClsJudgementResultCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">clsJudgementResultBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of ClsJudgementResult. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<ClsJudgementResultCB> cbLambda) {
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
     * <span style="color: #0000C0">clsJudgementResultBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">clsJudgementResult</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">clsJudgementResult</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">clsJudgementResultBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">clsJudgementResult</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">clsJudgementResult</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of ClsJudgementResult. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<ClsJudgementResult> selectEntity(CBCall<ClsJudgementResultCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<ClsJudgementResult> facadeSelectEntity(ClsJudgementResultCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends ClsJudgementResult> OptionalEntity<ENTITY> doSelectOptionalEntity(ClsJudgementResultCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * ClsJudgementResult <span style="color: #553000">clsJudgementResult</span> = <span style="color: #0000C0">clsJudgementResultBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">clsJudgementResult</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of ClsJudgementResult. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public ClsJudgementResult selectEntityWithDeletedCheck(CBCall<ClsJudgementResultCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param judgementResultCode (判決結果コード): PK, NotNull, VARCHAR(10), classification=JudgementResult. (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<ClsJudgementResult> selectByPK(String judgementResultCode) {
        return facadeSelectByPK(judgementResultCode);
    }

    protected OptionalEntity<ClsJudgementResult> facadeSelectByPK(String judgementResultCode) {
        return doSelectOptionalByPK(judgementResultCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends ClsJudgementResult> ENTITY doSelectByPK(String judgementResultCode, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(judgementResultCode), tp);
    }

    protected <ENTITY extends ClsJudgementResult> OptionalEntity<ENTITY> doSelectOptionalByPK(String judgementResultCode, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(judgementResultCode, tp), judgementResultCode);
    }

    protected ClsJudgementResultCB xprepareCBAsPK(String judgementResultCode) {
        assertObjectNotNull("judgementResultCode", judgementResultCode);
        return newConditionBean().acceptPK(judgementResultCode);
    }

    /**
     * Select the entity by the unique-key value.
     * @param displayOrder (順番): UQ, NotNull, INT UNSIGNED(10). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<ClsJudgementResult> selectByUniqueOfDisplayOrder(Integer displayOrder) {
        return facadeSelectByUniqueOfDisplayOrder(displayOrder);
    }

    protected OptionalEntity<ClsJudgementResult> facadeSelectByUniqueOfDisplayOrder(Integer displayOrder) {
        return doSelectByUniqueOfDisplayOrder(displayOrder, typeOfSelectedEntity());
    }

    protected <ENTITY extends ClsJudgementResult> OptionalEntity<ENTITY> doSelectByUniqueOfDisplayOrder(Integer displayOrder, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOfDisplayOrder(displayOrder), tp), displayOrder);
    }

    protected ClsJudgementResultCB xprepareCBAsUniqueOfDisplayOrder(Integer displayOrder) {
        assertObjectNotNull("displayOrder", displayOrder);
        return newConditionBean().acceptUniqueOfDisplayOrder(displayOrder);
    }

    /**
     * Select the entity by the unique-key value.
     * @param judgementResultAlias (判決結果別名): UQ, NotNull, VARCHAR(10). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<ClsJudgementResult> selectByUniqueOfJudgementResultAlias(String judgementResultAlias) {
        return facadeSelectByUniqueOfJudgementResultAlias(judgementResultAlias);
    }

    protected OptionalEntity<ClsJudgementResult> facadeSelectByUniqueOfJudgementResultAlias(String judgementResultAlias) {
        return doSelectByUniqueOfJudgementResultAlias(judgementResultAlias, typeOfSelectedEntity());
    }

    protected <ENTITY extends ClsJudgementResult> OptionalEntity<ENTITY> doSelectByUniqueOfJudgementResultAlias(String judgementResultAlias, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOfJudgementResultAlias(judgementResultAlias), tp), judgementResultAlias);
    }

    protected ClsJudgementResultCB xprepareCBAsUniqueOfJudgementResultAlias(String judgementResultAlias) {
        assertObjectNotNull("judgementResultAlias", judgementResultAlias);
        return newConditionBean().acceptUniqueOfJudgementResultAlias(judgementResultAlias);
    }

    /**
     * Select the entity by the unique-key value.
     * @param judgementResultName (判決結果名): UQ, NotNull, VARCHAR(10). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<ClsJudgementResult> selectByUniqueOfJudgementResultName(String judgementResultName) {
        return facadeSelectByUniqueOfJudgementResultName(judgementResultName);
    }

    protected OptionalEntity<ClsJudgementResult> facadeSelectByUniqueOfJudgementResultName(String judgementResultName) {
        return doSelectByUniqueOfJudgementResultName(judgementResultName, typeOfSelectedEntity());
    }

    protected <ENTITY extends ClsJudgementResult> OptionalEntity<ENTITY> doSelectByUniqueOfJudgementResultName(String judgementResultName, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOfJudgementResultName(judgementResultName), tp), judgementResultName);
    }

    protected ClsJudgementResultCB xprepareCBAsUniqueOfJudgementResultName(String judgementResultName) {
        assertObjectNotNull("judgementResultName", judgementResultName);
        return newConditionBean().acceptUniqueOfJudgementResultName(judgementResultName);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;ClsJudgementResult&gt; <span style="color: #553000">clsJudgementResultList</span> = <span style="color: #0000C0">clsJudgementResultBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (ClsJudgementResult <span style="color: #553000">clsJudgementResult</span> : <span style="color: #553000">clsJudgementResultList</span>) {
     *     ... = <span style="color: #553000">clsJudgementResult</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of ClsJudgementResult. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<ClsJudgementResult> selectList(CBCall<ClsJudgementResultCB> cbLambda) {
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
     * PagingResultBean&lt;ClsJudgementResult&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">clsJudgementResultBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (ClsJudgementResult clsJudgementResult : <span style="color: #553000">page</span>) {
     *     ... = clsJudgementResult.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of ClsJudgementResult. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<ClsJudgementResult> selectPage(CBCall<ClsJudgementResultCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">clsJudgementResultBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of ClsJudgementResult. (NotNull)
     * @param entityLambda The handler of entity row of ClsJudgementResult. (NotNull)
     */
    public void selectCursor(CBCall<ClsJudgementResultCB> cbLambda, EntityRowHandler<ClsJudgementResult> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">clsJudgementResultBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<ClsJudgementResultCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param clsJudgementResultList The entity list of clsJudgementResult. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<ClsJudgementResult> clsJudgementResultList, ReferrerLoaderHandler<LoaderOfClsJudgementResult> loaderLambda) {
        xassLRArg(clsJudgementResultList, loaderLambda);
        loaderLambda.handle(new LoaderOfClsJudgementResult().ready(clsJudgementResultList, _behaviorSelector));
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
     * @param clsJudgementResult The entity of clsJudgementResult. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(ClsJudgementResult clsJudgementResult, ReferrerLoaderHandler<LoaderOfClsJudgementResult> loaderLambda) {
        xassLRArg(clsJudgementResult, loaderLambda);
        loaderLambda.handle(new LoaderOfClsJudgementResult().ready(xnewLRAryLs(clsJudgementResult), _behaviorSelector));
    }

    /**
     * Load referrer of judgementList by the set-upper of referrer. <br>
     * (判決)JUDGEMENT by JUDGEMENT_RESULT_CODE, named 'judgementList'.
     * <pre>
     * <span style="color: #0000C0">clsJudgementResultBhv</span>.<span style="color: #CC4747">loadJudgement</span>(<span style="color: #553000">clsJudgementResultList</span>, <span style="color: #553000">judgementCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">judgementCB</span>.setupSelect...
     *     <span style="color: #553000">judgementCB</span>.query().set...
     *     <span style="color: #553000">judgementCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (ClsJudgementResult clsJudgementResult : <span style="color: #553000">clsJudgementResultList</span>) {
     *     ... = clsJudgementResult.<span style="color: #CC4747">getJudgementList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setJudgementResultCode_InScope(pkList);
     * cb.query().addOrderBy_JudgementResultCode_Asc();
     * </pre>
     * @param clsJudgementResultList The entity list of clsJudgementResult. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Judgement> loadJudgement(List<ClsJudgementResult> clsJudgementResultList, ReferrerConditionSetupper<JudgementCB> refCBLambda) {
        xassLRArg(clsJudgementResultList, refCBLambda);
        return doLoadJudgement(clsJudgementResultList, new LoadReferrerOption<JudgementCB, Judgement>().xinit(refCBLambda));
    }

    /**
     * Load referrer of judgementList by the set-upper of referrer. <br>
     * (判決)JUDGEMENT by JUDGEMENT_RESULT_CODE, named 'judgementList'.
     * <pre>
     * <span style="color: #0000C0">clsJudgementResultBhv</span>.<span style="color: #CC4747">loadJudgement</span>(<span style="color: #553000">clsJudgementResult</span>, <span style="color: #553000">judgementCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">judgementCB</span>.setupSelect...
     *     <span style="color: #553000">judgementCB</span>.query().set...
     *     <span style="color: #553000">judgementCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">clsJudgementResult</span>.<span style="color: #CC4747">getJudgementList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setJudgementResultCode_InScope(pkList);
     * cb.query().addOrderBy_JudgementResultCode_Asc();
     * </pre>
     * @param clsJudgementResult The entity of clsJudgementResult. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Judgement> loadJudgement(ClsJudgementResult clsJudgementResult, ReferrerConditionSetupper<JudgementCB> refCBLambda) {
        xassLRArg(clsJudgementResult, refCBLambda);
        return doLoadJudgement(xnewLRLs(clsJudgementResult), new LoadReferrerOption<JudgementCB, Judgement>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<Judgement> doLoadJudgement(List<ClsJudgementResult> clsJudgementResultList, LoadReferrerOption<JudgementCB, Judgement> option) {
        return helpLoadReferrerInternally(clsJudgementResultList, option, "judgementList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key judgementResultCode.
     * @param clsJudgementResultList The list of clsJudgementResult. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractJudgementResultCodeList(List<ClsJudgementResult> clsJudgementResultList)
    { return helpExtractListInternally(clsJudgementResultList, "judgementResultCode"); }

    /**
     * Extract the value list of (single) unique key displayOrder.
     * @param clsJudgementResultList The list of clsJudgementResult. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractDisplayOrderList(List<ClsJudgementResult> clsJudgementResultList)
    { return helpExtractListInternally(clsJudgementResultList, "displayOrder"); }

    /**
     * Extract the value list of (single) unique key judgementResultAlias.
     * @param clsJudgementResultList The list of clsJudgementResult. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractJudgementResultAliasList(List<ClsJudgementResult> clsJudgementResultList)
    { return helpExtractListInternally(clsJudgementResultList, "judgementResultAlias"); }

    /**
     * Extract the value list of (single) unique key judgementResultName.
     * @param clsJudgementResultList The list of clsJudgementResult. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractJudgementResultNameList(List<ClsJudgementResult> clsJudgementResultList)
    { return helpExtractListInternally(clsJudgementResultList, "judgementResultName"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * ClsJudgementResult clsJudgementResult = <span style="color: #70226C">new</span> ClsJudgementResult();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * clsJudgementResult.setFoo...(value);
     * clsJudgementResult.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//clsJudgementResult.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//clsJudgementResult.set...;</span>
     * <span style="color: #0000C0">clsJudgementResultBhv</span>.<span style="color: #CC4747">insert</span>(clsJudgementResult);
     * ... = clsJudgementResult.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param clsJudgementResult The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(ClsJudgementResult clsJudgementResult) {
        doInsert(clsJudgementResult, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * ClsJudgementResult clsJudgementResult = <span style="color: #70226C">new</span> ClsJudgementResult();
     * clsJudgementResult.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * clsJudgementResult.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//clsJudgementResult.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//clsJudgementResult.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * clsJudgementResult.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">clsJudgementResultBhv</span>.<span style="color: #CC4747">update</span>(clsJudgementResult);
     * </pre>
     * @param clsJudgementResult The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(ClsJudgementResult clsJudgementResult) {
        doUpdate(clsJudgementResult, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * ClsJudgementResult clsJudgementResult = <span style="color: #70226C">new</span> ClsJudgementResult();
     * clsJudgementResult.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * clsJudgementResult.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//clsJudgementResult.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//clsJudgementResult.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//clsJudgementResult.setVersionNo(value);</span>
     * <span style="color: #0000C0">clsJudgementResultBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(clsJudgementResult);
     * </pre>
     * @param clsJudgementResult The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(ClsJudgementResult clsJudgementResult) {
        doUpdateNonstrict(clsJudgementResult, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param clsJudgementResult The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(ClsJudgementResult clsJudgementResult) {
        doInsertOrUpdate(clsJudgementResult, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param clsJudgementResult The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(ClsJudgementResult clsJudgementResult) {
        doInsertOrUpdateNonstrict(clsJudgementResult, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * ClsJudgementResult clsJudgementResult = <span style="color: #70226C">new</span> ClsJudgementResult();
     * clsJudgementResult.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * clsJudgementResult.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">clsJudgementResultBhv</span>.<span style="color: #CC4747">delete</span>(clsJudgementResult);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param clsJudgementResult The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(ClsJudgementResult clsJudgementResult) {
        doDelete(clsJudgementResult, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * ClsJudgementResult clsJudgementResult = <span style="color: #70226C">new</span> ClsJudgementResult();
     * clsJudgementResult.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//clsJudgementResult.setVersionNo(value);</span>
     * <span style="color: #0000C0">clsJudgementResultBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(clsJudgementResult);
     * </pre>
     * @param clsJudgementResult The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(ClsJudgementResult clsJudgementResult) {
        doDeleteNonstrict(clsJudgementResult, null);
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
     *     ClsJudgementResult clsJudgementResult = <span style="color: #70226C">new</span> ClsJudgementResult();
     *     clsJudgementResult.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         clsJudgementResult.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     clsJudgementResultList.add(clsJudgementResult);
     * }
     * <span style="color: #0000C0">clsJudgementResultBhv</span>.<span style="color: #CC4747">batchInsert</span>(clsJudgementResultList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param clsJudgementResultList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<ClsJudgementResult> clsJudgementResultList) {
        return doBatchInsert(clsJudgementResultList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     ClsJudgementResult clsJudgementResult = <span style="color: #70226C">new</span> ClsJudgementResult();
     *     clsJudgementResult.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         clsJudgementResult.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         clsJudgementResult.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//clsJudgementResult.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     clsJudgementResultList.add(clsJudgementResult);
     * }
     * <span style="color: #0000C0">clsJudgementResultBhv</span>.<span style="color: #CC4747">batchUpdate</span>(clsJudgementResultList);
     * </pre>
     * @param clsJudgementResultList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<ClsJudgementResult> clsJudgementResultList) {
        return doBatchUpdate(clsJudgementResultList, null);
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     ClsJudgementResult clsJudgementResult = <span style="color: #70226C">new</span> ClsJudgementResult();
     *     clsJudgementResult.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         clsJudgementResult.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         clsJudgementResult.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//clsJudgementResult.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     clsJudgementResultList.add(clsJudgementResult);
     * }
     * <span style="color: #0000C0">clsJudgementResultBhv</span>.<span style="color: #CC4747">batchUpdate</span>(clsJudgementResultList);
     * </pre>
     * @param clsJudgementResultList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<ClsJudgementResult> clsJudgementResultList) {
        return doBatchUpdateNonstrict(clsJudgementResultList, null);
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param clsJudgementResultList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<ClsJudgementResult> clsJudgementResultList) {
        return doBatchDelete(clsJudgementResultList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param clsJudgementResultList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<ClsJudgementResult> clsJudgementResultList) {
        return doBatchDeleteNonstrict(clsJudgementResultList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">clsJudgementResultBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;ClsJudgementResult, ClsJudgementResultCB&gt;() {
     *     public ConditionBean setup(ClsJudgementResult entity, ClsJudgementResultCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<ClsJudgementResult, ClsJudgementResultCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * ClsJudgementResult clsJudgementResult = <span style="color: #70226C">new</span> ClsJudgementResult();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//clsJudgementResult.setPK...(value);</span>
     * clsJudgementResult.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//clsJudgementResult.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//clsJudgementResult.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//clsJudgementResult.setVersionNo(value);</span>
     * <span style="color: #0000C0">clsJudgementResultBhv</span>.<span style="color: #CC4747">queryUpdate</span>(clsJudgementResult, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param clsJudgementResult The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of ClsJudgementResult. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(ClsJudgementResult clsJudgementResult, CBCall<ClsJudgementResultCB> cbLambda) {
        return doQueryUpdate(clsJudgementResult, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">clsJudgementResultBhv</span>.<span style="color: #CC4747">queryDelete</span>(clsJudgementResult, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of ClsJudgementResult. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<ClsJudgementResultCB> cbLambda) {
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
     * ClsJudgementResult clsJudgementResult = <span style="color: #70226C">new</span> ClsJudgementResult();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * clsJudgementResult.setFoo...(value);
     * clsJudgementResult.setBar...(value);
     * <span style="color: #0000C0">clsJudgementResultBhv</span>.<span style="color: #CC4747">varyingInsert</span>(clsJudgementResult, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = clsJudgementResult.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param clsJudgementResult The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(ClsJudgementResult clsJudgementResult, WritableOptionCall<ClsJudgementResultCB, InsertOption<ClsJudgementResultCB>> opLambda) {
        doInsert(clsJudgementResult, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * ClsJudgementResult clsJudgementResult = <span style="color: #70226C">new</span> ClsJudgementResult();
     * clsJudgementResult.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * clsJudgementResult.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * clsJudgementResult.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">clsJudgementResultBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(clsJudgementResult, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param clsJudgementResult The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(ClsJudgementResult clsJudgementResult, WritableOptionCall<ClsJudgementResultCB, UpdateOption<ClsJudgementResultCB>> opLambda) {
        doUpdate(clsJudgementResult, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * ClsJudgementResult clsJudgementResult = <span style="color: #70226C">new</span> ClsJudgementResult();
     * clsJudgementResult.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * clsJudgementResult.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//clsJudgementResult.setVersionNo(value);</span>
     * <span style="color: #0000C0">clsJudgementResultBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(clsJudgementResult, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param clsJudgementResult The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(ClsJudgementResult clsJudgementResult, WritableOptionCall<ClsJudgementResultCB, UpdateOption<ClsJudgementResultCB>> opLambda) {
        doUpdateNonstrict(clsJudgementResult, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param clsJudgementResult The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(ClsJudgementResult clsJudgementResult, WritableOptionCall<ClsJudgementResultCB, InsertOption<ClsJudgementResultCB>> insertOpLambda, WritableOptionCall<ClsJudgementResultCB, UpdateOption<ClsJudgementResultCB>> updateOpLambda) {
        doInsertOrUpdate(clsJudgementResult, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param clsJudgementResult The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(ClsJudgementResult clsJudgementResult, WritableOptionCall<ClsJudgementResultCB, InsertOption<ClsJudgementResultCB>> insertOpLambda, WritableOptionCall<ClsJudgementResultCB, UpdateOption<ClsJudgementResultCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(clsJudgementResult, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param clsJudgementResult The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(ClsJudgementResult clsJudgementResult, WritableOptionCall<ClsJudgementResultCB, DeleteOption<ClsJudgementResultCB>> opLambda) {
        doDelete(clsJudgementResult, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param clsJudgementResult The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(ClsJudgementResult clsJudgementResult, WritableOptionCall<ClsJudgementResultCB, DeleteOption<ClsJudgementResultCB>> opLambda) {
        doDeleteNonstrict(clsJudgementResult, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param clsJudgementResultList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<ClsJudgementResult> clsJudgementResultList, WritableOptionCall<ClsJudgementResultCB, InsertOption<ClsJudgementResultCB>> opLambda) {
        return doBatchInsert(clsJudgementResultList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param clsJudgementResultList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<ClsJudgementResult> clsJudgementResultList, WritableOptionCall<ClsJudgementResultCB, UpdateOption<ClsJudgementResultCB>> opLambda) {
        return doBatchUpdate(clsJudgementResultList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param clsJudgementResultList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<ClsJudgementResult> clsJudgementResultList, WritableOptionCall<ClsJudgementResultCB, UpdateOption<ClsJudgementResultCB>> opLambda) {
        return doBatchUpdateNonstrict(clsJudgementResultList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param clsJudgementResultList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<ClsJudgementResult> clsJudgementResultList, WritableOptionCall<ClsJudgementResultCB, DeleteOption<ClsJudgementResultCB>> opLambda) {
        return doBatchDelete(clsJudgementResultList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param clsJudgementResultList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<ClsJudgementResult> clsJudgementResultList, WritableOptionCall<ClsJudgementResultCB, DeleteOption<ClsJudgementResultCB>> opLambda) {
        return doBatchDeleteNonstrict(clsJudgementResultList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<ClsJudgementResult, ClsJudgementResultCB> manyArgLambda, WritableOptionCall<ClsJudgementResultCB, InsertOption<ClsJudgementResultCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * ClsJudgementResult clsJudgementResult = <span style="color: #70226C">new</span> ClsJudgementResult();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//clsJudgementResult.setPK...(value);</span>
     * clsJudgementResult.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//clsJudgementResult.setVersionNo(value);</span>
     * <span style="color: #0000C0">clsJudgementResultBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(clsJudgementResult, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param clsJudgementResult The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of ClsJudgementResult. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(ClsJudgementResult clsJudgementResult, CBCall<ClsJudgementResultCB> cbLambda, WritableOptionCall<ClsJudgementResultCB, UpdateOption<ClsJudgementResultCB>> opLambda) {
        return doQueryUpdate(clsJudgementResult, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">clsJudgementResultBhv</span>.<span style="color: #CC4747">queryDelete</span>(clsJudgementResult, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of ClsJudgementResult. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<ClsJudgementResultCB> cbLambda, WritableOptionCall<ClsJudgementResultCB, DeleteOption<ClsJudgementResultCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * clsJudgementResultBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * clsJudgementResultBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * clsJudgementResultBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * clsJudgementResultBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * clsJudgementResultBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * clsJudgementResultBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * clsJudgementResultBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * clsJudgementResultBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * clsJudgementResultBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * clsJudgementResultBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * clsJudgementResultBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * clsJudgementResultBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * clsJudgementResultBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * clsJudgementResultBhv.outideSql().removeBlockComment().selectList()
     * clsJudgementResultBhv.outideSql().removeLineComment().selectList()
     * clsJudgementResultBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<ClsJudgementResultBhv> outsideSql() {
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
    protected Class<? extends ClsJudgementResult> typeOfSelectedEntity() { return ClsJudgementResult.class; }
    protected Class<ClsJudgementResult> typeOfHandlingEntity() { return ClsJudgementResult.class; }
    protected Class<ClsJudgementResultCB> typeOfHandlingConditionBean() { return ClsJudgementResultCB.class; }
}
