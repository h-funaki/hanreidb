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
 * The behavior of ([区分値]判決種別)CLS_JUDGEMENT_TYPE as TABLE. <br>
 * <pre>
 * [primary key]
 *     JUDGEMENT_TYPE_CODE
 *
 * [column]
 *     JUDGEMENT_TYPE_CODE, JUDGEMENT_TYPE_NAME, JUDGEMENT_TYPE_ALIAS, DESCRIPTION, DISPLAY_ORDER, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
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
public abstract class BsClsJudgementTypeBhv extends AbstractBehaviorWritable<ClsJudgementType, ClsJudgementTypeCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public ClsJudgementTypeDbm asDBMeta() { return ClsJudgementTypeDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "CLS_JUDGEMENT_TYPE"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public ClsJudgementTypeCB newConditionBean() { return new ClsJudgementTypeCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">clsJudgementTypeBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of ClsJudgementType. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<ClsJudgementTypeCB> cbLambda) {
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
     * <span style="color: #0000C0">clsJudgementTypeBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">clsJudgementType</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">clsJudgementType</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">clsJudgementTypeBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">clsJudgementType</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">clsJudgementType</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of ClsJudgementType. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<ClsJudgementType> selectEntity(CBCall<ClsJudgementTypeCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<ClsJudgementType> facadeSelectEntity(ClsJudgementTypeCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends ClsJudgementType> OptionalEntity<ENTITY> doSelectOptionalEntity(ClsJudgementTypeCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * ClsJudgementType <span style="color: #553000">clsJudgementType</span> = <span style="color: #0000C0">clsJudgementTypeBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">clsJudgementType</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of ClsJudgementType. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public ClsJudgementType selectEntityWithDeletedCheck(CBCall<ClsJudgementTypeCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param judgementTypeCode (判決種別コード): PK, NotNull, VARCHAR(10), classification=JudgementType. (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<ClsJudgementType> selectByPK(String judgementTypeCode) {
        return facadeSelectByPK(judgementTypeCode);
    }

    protected OptionalEntity<ClsJudgementType> facadeSelectByPK(String judgementTypeCode) {
        return doSelectOptionalByPK(judgementTypeCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends ClsJudgementType> ENTITY doSelectByPK(String judgementTypeCode, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(judgementTypeCode), tp);
    }

    protected <ENTITY extends ClsJudgementType> OptionalEntity<ENTITY> doSelectOptionalByPK(String judgementTypeCode, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(judgementTypeCode, tp), judgementTypeCode);
    }

    protected ClsJudgementTypeCB xprepareCBAsPK(String judgementTypeCode) {
        assertObjectNotNull("judgementTypeCode", judgementTypeCode);
        return newConditionBean().acceptPK(judgementTypeCode);
    }

    /**
     * Select the entity by the unique-key value.
     * @param displayOrder (順番): UQ, NotNull, INT UNSIGNED(10). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<ClsJudgementType> selectByUniqueOfDisplayOrder(Integer displayOrder) {
        return facadeSelectByUniqueOfDisplayOrder(displayOrder);
    }

    protected OptionalEntity<ClsJudgementType> facadeSelectByUniqueOfDisplayOrder(Integer displayOrder) {
        return doSelectByUniqueOfDisplayOrder(displayOrder, typeOfSelectedEntity());
    }

    protected <ENTITY extends ClsJudgementType> OptionalEntity<ENTITY> doSelectByUniqueOfDisplayOrder(Integer displayOrder, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOfDisplayOrder(displayOrder), tp), displayOrder);
    }

    protected ClsJudgementTypeCB xprepareCBAsUniqueOfDisplayOrder(Integer displayOrder) {
        assertObjectNotNull("displayOrder", displayOrder);
        return newConditionBean().acceptUniqueOfDisplayOrder(displayOrder);
    }

    /**
     * Select the entity by the unique-key value.
     * @param judgementTypeAlias (判決種別別名): UQ, NotNull, VARCHAR(10). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<ClsJudgementType> selectByUniqueOfJudgementTypeAlias(String judgementTypeAlias) {
        return facadeSelectByUniqueOfJudgementTypeAlias(judgementTypeAlias);
    }

    protected OptionalEntity<ClsJudgementType> facadeSelectByUniqueOfJudgementTypeAlias(String judgementTypeAlias) {
        return doSelectByUniqueOfJudgementTypeAlias(judgementTypeAlias, typeOfSelectedEntity());
    }

    protected <ENTITY extends ClsJudgementType> OptionalEntity<ENTITY> doSelectByUniqueOfJudgementTypeAlias(String judgementTypeAlias, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOfJudgementTypeAlias(judgementTypeAlias), tp), judgementTypeAlias);
    }

    protected ClsJudgementTypeCB xprepareCBAsUniqueOfJudgementTypeAlias(String judgementTypeAlias) {
        assertObjectNotNull("judgementTypeAlias", judgementTypeAlias);
        return newConditionBean().acceptUniqueOfJudgementTypeAlias(judgementTypeAlias);
    }

    /**
     * Select the entity by the unique-key value.
     * @param judgementTypeName (判決種別名): UQ, NotNull, VARCHAR(10). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<ClsJudgementType> selectByUniqueOfJudgementTypeName(String judgementTypeName) {
        return facadeSelectByUniqueOfJudgementTypeName(judgementTypeName);
    }

    protected OptionalEntity<ClsJudgementType> facadeSelectByUniqueOfJudgementTypeName(String judgementTypeName) {
        return doSelectByUniqueOfJudgementTypeName(judgementTypeName, typeOfSelectedEntity());
    }

    protected <ENTITY extends ClsJudgementType> OptionalEntity<ENTITY> doSelectByUniqueOfJudgementTypeName(String judgementTypeName, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOfJudgementTypeName(judgementTypeName), tp), judgementTypeName);
    }

    protected ClsJudgementTypeCB xprepareCBAsUniqueOfJudgementTypeName(String judgementTypeName) {
        assertObjectNotNull("judgementTypeName", judgementTypeName);
        return newConditionBean().acceptUniqueOfJudgementTypeName(judgementTypeName);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;ClsJudgementType&gt; <span style="color: #553000">clsJudgementTypeList</span> = <span style="color: #0000C0">clsJudgementTypeBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (ClsJudgementType <span style="color: #553000">clsJudgementType</span> : <span style="color: #553000">clsJudgementTypeList</span>) {
     *     ... = <span style="color: #553000">clsJudgementType</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of ClsJudgementType. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<ClsJudgementType> selectList(CBCall<ClsJudgementTypeCB> cbLambda) {
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
     * PagingResultBean&lt;ClsJudgementType&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">clsJudgementTypeBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (ClsJudgementType clsJudgementType : <span style="color: #553000">page</span>) {
     *     ... = clsJudgementType.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of ClsJudgementType. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<ClsJudgementType> selectPage(CBCall<ClsJudgementTypeCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">clsJudgementTypeBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of ClsJudgementType. (NotNull)
     * @param entityLambda The handler of entity row of ClsJudgementType. (NotNull)
     */
    public void selectCursor(CBCall<ClsJudgementTypeCB> cbLambda, EntityRowHandler<ClsJudgementType> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">clsJudgementTypeBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<ClsJudgementTypeCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param clsJudgementTypeList The entity list of clsJudgementType. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<ClsJudgementType> clsJudgementTypeList, ReferrerLoaderHandler<LoaderOfClsJudgementType> loaderLambda) {
        xassLRArg(clsJudgementTypeList, loaderLambda);
        loaderLambda.handle(new LoaderOfClsJudgementType().ready(clsJudgementTypeList, _behaviorSelector));
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
     * @param clsJudgementType The entity of clsJudgementType. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(ClsJudgementType clsJudgementType, ReferrerLoaderHandler<LoaderOfClsJudgementType> loaderLambda) {
        xassLRArg(clsJudgementType, loaderLambda);
        loaderLambda.handle(new LoaderOfClsJudgementType().ready(xnewLRAryLs(clsJudgementType), _behaviorSelector));
    }

    /**
     * Load referrer of judgementList by the set-upper of referrer. <br>
     * (判決)JUDGEMENT by JUDGEMENT_TYPE_CODE, named 'judgementList'.
     * <pre>
     * <span style="color: #0000C0">clsJudgementTypeBhv</span>.<span style="color: #CC4747">loadJudgement</span>(<span style="color: #553000">clsJudgementTypeList</span>, <span style="color: #553000">judgementCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">judgementCB</span>.setupSelect...
     *     <span style="color: #553000">judgementCB</span>.query().set...
     *     <span style="color: #553000">judgementCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (ClsJudgementType clsJudgementType : <span style="color: #553000">clsJudgementTypeList</span>) {
     *     ... = clsJudgementType.<span style="color: #CC4747">getJudgementList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setJudgementTypeCode_InScope(pkList);
     * cb.query().addOrderBy_JudgementTypeCode_Asc();
     * </pre>
     * @param clsJudgementTypeList The entity list of clsJudgementType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Judgement> loadJudgement(List<ClsJudgementType> clsJudgementTypeList, ReferrerConditionSetupper<JudgementCB> refCBLambda) {
        xassLRArg(clsJudgementTypeList, refCBLambda);
        return doLoadJudgement(clsJudgementTypeList, new LoadReferrerOption<JudgementCB, Judgement>().xinit(refCBLambda));
    }

    /**
     * Load referrer of judgementList by the set-upper of referrer. <br>
     * (判決)JUDGEMENT by JUDGEMENT_TYPE_CODE, named 'judgementList'.
     * <pre>
     * <span style="color: #0000C0">clsJudgementTypeBhv</span>.<span style="color: #CC4747">loadJudgement</span>(<span style="color: #553000">clsJudgementType</span>, <span style="color: #553000">judgementCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">judgementCB</span>.setupSelect...
     *     <span style="color: #553000">judgementCB</span>.query().set...
     *     <span style="color: #553000">judgementCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">clsJudgementType</span>.<span style="color: #CC4747">getJudgementList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setJudgementTypeCode_InScope(pkList);
     * cb.query().addOrderBy_JudgementTypeCode_Asc();
     * </pre>
     * @param clsJudgementType The entity of clsJudgementType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Judgement> loadJudgement(ClsJudgementType clsJudgementType, ReferrerConditionSetupper<JudgementCB> refCBLambda) {
        xassLRArg(clsJudgementType, refCBLambda);
        return doLoadJudgement(xnewLRLs(clsJudgementType), new LoadReferrerOption<JudgementCB, Judgement>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<Judgement> doLoadJudgement(List<ClsJudgementType> clsJudgementTypeList, LoadReferrerOption<JudgementCB, Judgement> option) {
        return helpLoadReferrerInternally(clsJudgementTypeList, option, "judgementList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key judgementTypeCode.
     * @param clsJudgementTypeList The list of clsJudgementType. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractJudgementTypeCodeList(List<ClsJudgementType> clsJudgementTypeList)
    { return helpExtractListInternally(clsJudgementTypeList, "judgementTypeCode"); }

    /**
     * Extract the value list of (single) unique key displayOrder.
     * @param clsJudgementTypeList The list of clsJudgementType. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractDisplayOrderList(List<ClsJudgementType> clsJudgementTypeList)
    { return helpExtractListInternally(clsJudgementTypeList, "displayOrder"); }

    /**
     * Extract the value list of (single) unique key judgementTypeAlias.
     * @param clsJudgementTypeList The list of clsJudgementType. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractJudgementTypeAliasList(List<ClsJudgementType> clsJudgementTypeList)
    { return helpExtractListInternally(clsJudgementTypeList, "judgementTypeAlias"); }

    /**
     * Extract the value list of (single) unique key judgementTypeName.
     * @param clsJudgementTypeList The list of clsJudgementType. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractJudgementTypeNameList(List<ClsJudgementType> clsJudgementTypeList)
    { return helpExtractListInternally(clsJudgementTypeList, "judgementTypeName"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * ClsJudgementType clsJudgementType = <span style="color: #70226C">new</span> ClsJudgementType();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * clsJudgementType.setFoo...(value);
     * clsJudgementType.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//clsJudgementType.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//clsJudgementType.set...;</span>
     * <span style="color: #0000C0">clsJudgementTypeBhv</span>.<span style="color: #CC4747">insert</span>(clsJudgementType);
     * ... = clsJudgementType.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param clsJudgementType The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(ClsJudgementType clsJudgementType) {
        doInsert(clsJudgementType, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * ClsJudgementType clsJudgementType = <span style="color: #70226C">new</span> ClsJudgementType();
     * clsJudgementType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * clsJudgementType.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//clsJudgementType.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//clsJudgementType.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * clsJudgementType.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">clsJudgementTypeBhv</span>.<span style="color: #CC4747">update</span>(clsJudgementType);
     * </pre>
     * @param clsJudgementType The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(ClsJudgementType clsJudgementType) {
        doUpdate(clsJudgementType, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * ClsJudgementType clsJudgementType = <span style="color: #70226C">new</span> ClsJudgementType();
     * clsJudgementType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * clsJudgementType.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//clsJudgementType.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//clsJudgementType.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//clsJudgementType.setVersionNo(value);</span>
     * <span style="color: #0000C0">clsJudgementTypeBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(clsJudgementType);
     * </pre>
     * @param clsJudgementType The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(ClsJudgementType clsJudgementType) {
        doUpdateNonstrict(clsJudgementType, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param clsJudgementType The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(ClsJudgementType clsJudgementType) {
        doInsertOrUpdate(clsJudgementType, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param clsJudgementType The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(ClsJudgementType clsJudgementType) {
        doInsertOrUpdateNonstrict(clsJudgementType, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * ClsJudgementType clsJudgementType = <span style="color: #70226C">new</span> ClsJudgementType();
     * clsJudgementType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * clsJudgementType.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">clsJudgementTypeBhv</span>.<span style="color: #CC4747">delete</span>(clsJudgementType);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param clsJudgementType The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(ClsJudgementType clsJudgementType) {
        doDelete(clsJudgementType, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * ClsJudgementType clsJudgementType = <span style="color: #70226C">new</span> ClsJudgementType();
     * clsJudgementType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//clsJudgementType.setVersionNo(value);</span>
     * <span style="color: #0000C0">clsJudgementTypeBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(clsJudgementType);
     * </pre>
     * @param clsJudgementType The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(ClsJudgementType clsJudgementType) {
        doDeleteNonstrict(clsJudgementType, null);
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
     *     ClsJudgementType clsJudgementType = <span style="color: #70226C">new</span> ClsJudgementType();
     *     clsJudgementType.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         clsJudgementType.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     clsJudgementTypeList.add(clsJudgementType);
     * }
     * <span style="color: #0000C0">clsJudgementTypeBhv</span>.<span style="color: #CC4747">batchInsert</span>(clsJudgementTypeList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param clsJudgementTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<ClsJudgementType> clsJudgementTypeList) {
        return doBatchInsert(clsJudgementTypeList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     ClsJudgementType clsJudgementType = <span style="color: #70226C">new</span> ClsJudgementType();
     *     clsJudgementType.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         clsJudgementType.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         clsJudgementType.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//clsJudgementType.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     clsJudgementTypeList.add(clsJudgementType);
     * }
     * <span style="color: #0000C0">clsJudgementTypeBhv</span>.<span style="color: #CC4747">batchUpdate</span>(clsJudgementTypeList);
     * </pre>
     * @param clsJudgementTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<ClsJudgementType> clsJudgementTypeList) {
        return doBatchUpdate(clsJudgementTypeList, null);
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     ClsJudgementType clsJudgementType = <span style="color: #70226C">new</span> ClsJudgementType();
     *     clsJudgementType.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         clsJudgementType.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         clsJudgementType.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//clsJudgementType.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     clsJudgementTypeList.add(clsJudgementType);
     * }
     * <span style="color: #0000C0">clsJudgementTypeBhv</span>.<span style="color: #CC4747">batchUpdate</span>(clsJudgementTypeList);
     * </pre>
     * @param clsJudgementTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<ClsJudgementType> clsJudgementTypeList) {
        return doBatchUpdateNonstrict(clsJudgementTypeList, null);
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param clsJudgementTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<ClsJudgementType> clsJudgementTypeList) {
        return doBatchDelete(clsJudgementTypeList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param clsJudgementTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<ClsJudgementType> clsJudgementTypeList) {
        return doBatchDeleteNonstrict(clsJudgementTypeList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">clsJudgementTypeBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;ClsJudgementType, ClsJudgementTypeCB&gt;() {
     *     public ConditionBean setup(ClsJudgementType entity, ClsJudgementTypeCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<ClsJudgementType, ClsJudgementTypeCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * ClsJudgementType clsJudgementType = <span style="color: #70226C">new</span> ClsJudgementType();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//clsJudgementType.setPK...(value);</span>
     * clsJudgementType.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//clsJudgementType.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//clsJudgementType.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//clsJudgementType.setVersionNo(value);</span>
     * <span style="color: #0000C0">clsJudgementTypeBhv</span>.<span style="color: #CC4747">queryUpdate</span>(clsJudgementType, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param clsJudgementType The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of ClsJudgementType. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(ClsJudgementType clsJudgementType, CBCall<ClsJudgementTypeCB> cbLambda) {
        return doQueryUpdate(clsJudgementType, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">clsJudgementTypeBhv</span>.<span style="color: #CC4747">queryDelete</span>(clsJudgementType, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of ClsJudgementType. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<ClsJudgementTypeCB> cbLambda) {
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
     * ClsJudgementType clsJudgementType = <span style="color: #70226C">new</span> ClsJudgementType();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * clsJudgementType.setFoo...(value);
     * clsJudgementType.setBar...(value);
     * <span style="color: #0000C0">clsJudgementTypeBhv</span>.<span style="color: #CC4747">varyingInsert</span>(clsJudgementType, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = clsJudgementType.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param clsJudgementType The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(ClsJudgementType clsJudgementType, WritableOptionCall<ClsJudgementTypeCB, InsertOption<ClsJudgementTypeCB>> opLambda) {
        doInsert(clsJudgementType, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * ClsJudgementType clsJudgementType = <span style="color: #70226C">new</span> ClsJudgementType();
     * clsJudgementType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * clsJudgementType.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * clsJudgementType.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">clsJudgementTypeBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(clsJudgementType, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param clsJudgementType The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(ClsJudgementType clsJudgementType, WritableOptionCall<ClsJudgementTypeCB, UpdateOption<ClsJudgementTypeCB>> opLambda) {
        doUpdate(clsJudgementType, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * ClsJudgementType clsJudgementType = <span style="color: #70226C">new</span> ClsJudgementType();
     * clsJudgementType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * clsJudgementType.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//clsJudgementType.setVersionNo(value);</span>
     * <span style="color: #0000C0">clsJudgementTypeBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(clsJudgementType, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param clsJudgementType The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(ClsJudgementType clsJudgementType, WritableOptionCall<ClsJudgementTypeCB, UpdateOption<ClsJudgementTypeCB>> opLambda) {
        doUpdateNonstrict(clsJudgementType, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param clsJudgementType The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(ClsJudgementType clsJudgementType, WritableOptionCall<ClsJudgementTypeCB, InsertOption<ClsJudgementTypeCB>> insertOpLambda, WritableOptionCall<ClsJudgementTypeCB, UpdateOption<ClsJudgementTypeCB>> updateOpLambda) {
        doInsertOrUpdate(clsJudgementType, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param clsJudgementType The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(ClsJudgementType clsJudgementType, WritableOptionCall<ClsJudgementTypeCB, InsertOption<ClsJudgementTypeCB>> insertOpLambda, WritableOptionCall<ClsJudgementTypeCB, UpdateOption<ClsJudgementTypeCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(clsJudgementType, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param clsJudgementType The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(ClsJudgementType clsJudgementType, WritableOptionCall<ClsJudgementTypeCB, DeleteOption<ClsJudgementTypeCB>> opLambda) {
        doDelete(clsJudgementType, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param clsJudgementType The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(ClsJudgementType clsJudgementType, WritableOptionCall<ClsJudgementTypeCB, DeleteOption<ClsJudgementTypeCB>> opLambda) {
        doDeleteNonstrict(clsJudgementType, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param clsJudgementTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<ClsJudgementType> clsJudgementTypeList, WritableOptionCall<ClsJudgementTypeCB, InsertOption<ClsJudgementTypeCB>> opLambda) {
        return doBatchInsert(clsJudgementTypeList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param clsJudgementTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<ClsJudgementType> clsJudgementTypeList, WritableOptionCall<ClsJudgementTypeCB, UpdateOption<ClsJudgementTypeCB>> opLambda) {
        return doBatchUpdate(clsJudgementTypeList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param clsJudgementTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<ClsJudgementType> clsJudgementTypeList, WritableOptionCall<ClsJudgementTypeCB, UpdateOption<ClsJudgementTypeCB>> opLambda) {
        return doBatchUpdateNonstrict(clsJudgementTypeList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param clsJudgementTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<ClsJudgementType> clsJudgementTypeList, WritableOptionCall<ClsJudgementTypeCB, DeleteOption<ClsJudgementTypeCB>> opLambda) {
        return doBatchDelete(clsJudgementTypeList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param clsJudgementTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<ClsJudgementType> clsJudgementTypeList, WritableOptionCall<ClsJudgementTypeCB, DeleteOption<ClsJudgementTypeCB>> opLambda) {
        return doBatchDeleteNonstrict(clsJudgementTypeList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<ClsJudgementType, ClsJudgementTypeCB> manyArgLambda, WritableOptionCall<ClsJudgementTypeCB, InsertOption<ClsJudgementTypeCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * ClsJudgementType clsJudgementType = <span style="color: #70226C">new</span> ClsJudgementType();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//clsJudgementType.setPK...(value);</span>
     * clsJudgementType.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//clsJudgementType.setVersionNo(value);</span>
     * <span style="color: #0000C0">clsJudgementTypeBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(clsJudgementType, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param clsJudgementType The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of ClsJudgementType. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(ClsJudgementType clsJudgementType, CBCall<ClsJudgementTypeCB> cbLambda, WritableOptionCall<ClsJudgementTypeCB, UpdateOption<ClsJudgementTypeCB>> opLambda) {
        return doQueryUpdate(clsJudgementType, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">clsJudgementTypeBhv</span>.<span style="color: #CC4747">queryDelete</span>(clsJudgementType, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of ClsJudgementType. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<ClsJudgementTypeCB> cbLambda, WritableOptionCall<ClsJudgementTypeCB, DeleteOption<ClsJudgementTypeCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * clsJudgementTypeBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * clsJudgementTypeBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * clsJudgementTypeBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * clsJudgementTypeBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * clsJudgementTypeBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * clsJudgementTypeBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * clsJudgementTypeBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * clsJudgementTypeBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * clsJudgementTypeBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * clsJudgementTypeBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * clsJudgementTypeBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * clsJudgementTypeBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * clsJudgementTypeBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * clsJudgementTypeBhv.outideSql().removeBlockComment().selectList()
     * clsJudgementTypeBhv.outideSql().removeLineComment().selectList()
     * clsJudgementTypeBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<ClsJudgementTypeBhv> outsideSql() {
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
    protected Class<? extends ClsJudgementType> typeOfSelectedEntity() { return ClsJudgementType.class; }
    protected Class<ClsJudgementType> typeOfHandlingEntity() { return ClsJudgementType.class; }
    protected Class<ClsJudgementTypeCB> typeOfHandlingConditionBean() { return ClsJudgementTypeCB.class; }
}
