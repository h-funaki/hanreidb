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
 * The behavior of (法令)LAW as TABLE. <br>
 * <pre>
 * [primary key]
 *     LAW_ID
 *
 * [column]
 *     LAW_ID, LAW_TYPE_CODE, LAW_PUBLIC_CODE, LAW_NAME, LAW_NUMBER, PROMULGATION_DATE, EFFECTIVE_DATE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LAW_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     LAW_TYPE
 *
 * [referrer table]
 *     LAW_ALIAS, LAW_CATEGORY_REL, LAW_HISTORY, LAW_SOURCE_REL, SOURCE_LAW_CATEGORY_REL
 *
 * [foreign property]
 *     lawType
 *
 * [referrer property]
 *     lawAliasList, lawCategoryRelList, lawHistoryByAmendLawIdList, lawHistoryByLawIdList, lawSourceRelList, sourceLawCategoryRelList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsLawBhv extends AbstractBehaviorWritable<Law, LawCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public LawDbm asDBMeta() { return LawDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "LAW"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public LawCB newConditionBean() { return new LawCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of Law. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<LawCB> cbLambda) {
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
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">law</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">law</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">law</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">law</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of Law. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<Law> selectEntity(CBCall<LawCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<Law> facadeSelectEntity(LawCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends Law> OptionalEntity<ENTITY> doSelectOptionalEntity(LawCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * Law <span style="color: #553000">law</span> = <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">law</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of Law. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Law selectEntityWithDeletedCheck(CBCall<LawCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param lawId (法令ID): PK, ID, NotNull, INT(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<Law> selectByPK(Integer lawId) {
        return facadeSelectByPK(lawId);
    }

    protected OptionalEntity<Law> facadeSelectByPK(Integer lawId) {
        return doSelectOptionalByPK(lawId, typeOfSelectedEntity());
    }

    protected <ENTITY extends Law> ENTITY doSelectByPK(Integer lawId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(lawId), tp);
    }

    protected <ENTITY extends Law> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer lawId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(lawId, tp), lawId);
    }

    protected LawCB xprepareCBAsPK(Integer lawId) {
        assertObjectNotNull("lawId", lawId);
        return newConditionBean().acceptPK(lawId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param lawNumber (法令番号): UQ, NotNull, VARCHAR(200). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<Law> selectByUniqueOfLawNumber(String lawNumber) {
        return facadeSelectByUniqueOfLawNumber(lawNumber);
    }

    protected OptionalEntity<Law> facadeSelectByUniqueOfLawNumber(String lawNumber) {
        return doSelectByUniqueOfLawNumber(lawNumber, typeOfSelectedEntity());
    }

    protected <ENTITY extends Law> OptionalEntity<ENTITY> doSelectByUniqueOfLawNumber(String lawNumber, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOfLawNumber(lawNumber), tp), lawNumber);
    }

    protected LawCB xprepareCBAsUniqueOfLawNumber(String lawNumber) {
        assertObjectNotNull("lawNumber", lawNumber);
        return newConditionBean().acceptUniqueOfLawNumber(lawNumber);
    }

    /**
     * Select the entity by the unique-key value.
     * @param lawPublicCode (法令公開コード): UQ, NotNull, VARCHAR(12). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<Law> selectByUniqueOfLawPublicCode(String lawPublicCode) {
        return facadeSelectByUniqueOfLawPublicCode(lawPublicCode);
    }

    protected OptionalEntity<Law> facadeSelectByUniqueOfLawPublicCode(String lawPublicCode) {
        return doSelectByUniqueOfLawPublicCode(lawPublicCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends Law> OptionalEntity<ENTITY> doSelectByUniqueOfLawPublicCode(String lawPublicCode, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOfLawPublicCode(lawPublicCode), tp), lawPublicCode);
    }

    protected LawCB xprepareCBAsUniqueOfLawPublicCode(String lawPublicCode) {
        assertObjectNotNull("lawPublicCode", lawPublicCode);
        return newConditionBean().acceptUniqueOfLawPublicCode(lawPublicCode);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;Law&gt; <span style="color: #553000">lawList</span> = <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (Law <span style="color: #553000">law</span> : <span style="color: #553000">lawList</span>) {
     *     ... = <span style="color: #553000">law</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of Law. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<Law> selectList(CBCall<LawCB> cbLambda) {
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
     * PagingResultBean&lt;Law&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (Law law : <span style="color: #553000">page</span>) {
     *     ... = law.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of Law. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<Law> selectPage(CBCall<LawCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of Law. (NotNull)
     * @param entityLambda The handler of entity row of Law. (NotNull)
     */
    public void selectCursor(CBCall<LawCB> cbLambda, EntityRowHandler<Law> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<LawCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param lawList The entity list of law. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<Law> lawList, ReferrerLoaderHandler<LoaderOfLaw> loaderLambda) {
        xassLRArg(lawList, loaderLambda);
        loaderLambda.handle(new LoaderOfLaw().ready(lawList, _behaviorSelector));
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
     * @param law The entity of law. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(Law law, ReferrerLoaderHandler<LoaderOfLaw> loaderLambda) {
        xassLRArg(law, loaderLambda);
        loaderLambda.handle(new LoaderOfLaw().ready(xnewLRAryLs(law), _behaviorSelector));
    }

    /**
     * Load referrer of lawAliasList by the set-upper of referrer. <br>
     * (法令略称)LAW_ALIAS by LAW_ID, named 'lawAliasList'.
     * <pre>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">loadLawAlias</span>(<span style="color: #553000">lawList</span>, <span style="color: #553000">aliasCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">aliasCB</span>.setupSelect...
     *     <span style="color: #553000">aliasCB</span>.query().set...
     *     <span style="color: #553000">aliasCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (Law law : <span style="color: #553000">lawList</span>) {
     *     ... = law.<span style="color: #CC4747">getLawAliasList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLawId_InScope(pkList);
     * cb.query().addOrderBy_LawId_Asc();
     * </pre>
     * @param lawList The entity list of law. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LawAlias> loadLawAlias(List<Law> lawList, ReferrerConditionSetupper<LawAliasCB> refCBLambda) {
        xassLRArg(lawList, refCBLambda);
        return doLoadLawAlias(lawList, new LoadReferrerOption<LawAliasCB, LawAlias>().xinit(refCBLambda));
    }

    /**
     * Load referrer of lawAliasList by the set-upper of referrer. <br>
     * (法令略称)LAW_ALIAS by LAW_ID, named 'lawAliasList'.
     * <pre>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">loadLawAlias</span>(<span style="color: #553000">law</span>, <span style="color: #553000">aliasCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">aliasCB</span>.setupSelect...
     *     <span style="color: #553000">aliasCB</span>.query().set...
     *     <span style="color: #553000">aliasCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">law</span>.<span style="color: #CC4747">getLawAliasList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLawId_InScope(pkList);
     * cb.query().addOrderBy_LawId_Asc();
     * </pre>
     * @param law The entity of law. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LawAlias> loadLawAlias(Law law, ReferrerConditionSetupper<LawAliasCB> refCBLambda) {
        xassLRArg(law, refCBLambda);
        return doLoadLawAlias(xnewLRLs(law), new LoadReferrerOption<LawAliasCB, LawAlias>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<LawAlias> doLoadLawAlias(List<Law> lawList, LoadReferrerOption<LawAliasCB, LawAlias> option) {
        return helpLoadReferrerInternally(lawList, option, "lawAliasList");
    }

    /**
     * Load referrer of lawCategoryRelList by the set-upper of referrer. <br>
     * (法令カテゴリーリレーション)LAW_CATEGORY_REL by LAW_ID, named 'lawCategoryRelList'.
     * <pre>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">loadLawCategoryRel</span>(<span style="color: #553000">lawList</span>, <span style="color: #553000">relCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">relCB</span>.setupSelect...
     *     <span style="color: #553000">relCB</span>.query().set...
     *     <span style="color: #553000">relCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (Law law : <span style="color: #553000">lawList</span>) {
     *     ... = law.<span style="color: #CC4747">getLawCategoryRelList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLawId_InScope(pkList);
     * cb.query().addOrderBy_LawId_Asc();
     * </pre>
     * @param lawList The entity list of law. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LawCategoryRel> loadLawCategoryRel(List<Law> lawList, ReferrerConditionSetupper<LawCategoryRelCB> refCBLambda) {
        xassLRArg(lawList, refCBLambda);
        return doLoadLawCategoryRel(lawList, new LoadReferrerOption<LawCategoryRelCB, LawCategoryRel>().xinit(refCBLambda));
    }

    /**
     * Load referrer of lawCategoryRelList by the set-upper of referrer. <br>
     * (法令カテゴリーリレーション)LAW_CATEGORY_REL by LAW_ID, named 'lawCategoryRelList'.
     * <pre>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">loadLawCategoryRel</span>(<span style="color: #553000">law</span>, <span style="color: #553000">relCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">relCB</span>.setupSelect...
     *     <span style="color: #553000">relCB</span>.query().set...
     *     <span style="color: #553000">relCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">law</span>.<span style="color: #CC4747">getLawCategoryRelList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLawId_InScope(pkList);
     * cb.query().addOrderBy_LawId_Asc();
     * </pre>
     * @param law The entity of law. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LawCategoryRel> loadLawCategoryRel(Law law, ReferrerConditionSetupper<LawCategoryRelCB> refCBLambda) {
        xassLRArg(law, refCBLambda);
        return doLoadLawCategoryRel(xnewLRLs(law), new LoadReferrerOption<LawCategoryRelCB, LawCategoryRel>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<LawCategoryRel> doLoadLawCategoryRel(List<Law> lawList, LoadReferrerOption<LawCategoryRelCB, LawCategoryRel> option) {
        return helpLoadReferrerInternally(lawList, option, "lawCategoryRelList");
    }

    /**
     * Load referrer of lawHistoryByAmendLawIdList by the set-upper of referrer. <br>
     * (法令履歴)LAW_HISTORY by AMEND_LAW_ID, named 'lawHistoryByAmendLawIdList'.
     * <pre>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">loadLawHistoryByAmendLawId</span>(<span style="color: #553000">lawList</span>, <span style="color: #553000">historyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">historyCB</span>.setupSelect...
     *     <span style="color: #553000">historyCB</span>.query().set...
     *     <span style="color: #553000">historyCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (Law law : <span style="color: #553000">lawList</span>) {
     *     ... = law.<span style="color: #CC4747">getLawHistoryByAmendLawIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAmendLawId_InScope(pkList);
     * cb.query().addOrderBy_AmendLawId_Asc();
     * </pre>
     * @param lawList The entity list of law. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LawHistory> loadLawHistoryByAmendLawId(List<Law> lawList, ReferrerConditionSetupper<LawHistoryCB> refCBLambda) {
        xassLRArg(lawList, refCBLambda);
        return doLoadLawHistoryByAmendLawId(lawList, new LoadReferrerOption<LawHistoryCB, LawHistory>().xinit(refCBLambda));
    }

    /**
     * Load referrer of lawHistoryByAmendLawIdList by the set-upper of referrer. <br>
     * (法令履歴)LAW_HISTORY by AMEND_LAW_ID, named 'lawHistoryByAmendLawIdList'.
     * <pre>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">loadLawHistoryByAmendLawId</span>(<span style="color: #553000">law</span>, <span style="color: #553000">historyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">historyCB</span>.setupSelect...
     *     <span style="color: #553000">historyCB</span>.query().set...
     *     <span style="color: #553000">historyCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">law</span>.<span style="color: #CC4747">getLawHistoryByAmendLawIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAmendLawId_InScope(pkList);
     * cb.query().addOrderBy_AmendLawId_Asc();
     * </pre>
     * @param law The entity of law. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LawHistory> loadLawHistoryByAmendLawId(Law law, ReferrerConditionSetupper<LawHistoryCB> refCBLambda) {
        xassLRArg(law, refCBLambda);
        return doLoadLawHistoryByAmendLawId(xnewLRLs(law), new LoadReferrerOption<LawHistoryCB, LawHistory>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<LawHistory> doLoadLawHistoryByAmendLawId(List<Law> lawList, LoadReferrerOption<LawHistoryCB, LawHistory> option) {
        return helpLoadReferrerInternally(lawList, option, "lawHistoryByAmendLawIdList");
    }

    /**
     * Load referrer of lawHistoryByLawIdList by the set-upper of referrer. <br>
     * (法令履歴)LAW_HISTORY by LAW_ID, named 'lawHistoryByLawIdList'.
     * <pre>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">loadLawHistoryByLawId</span>(<span style="color: #553000">lawList</span>, <span style="color: #553000">historyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">historyCB</span>.setupSelect...
     *     <span style="color: #553000">historyCB</span>.query().set...
     *     <span style="color: #553000">historyCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (Law law : <span style="color: #553000">lawList</span>) {
     *     ... = law.<span style="color: #CC4747">getLawHistoryByLawIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLawId_InScope(pkList);
     * cb.query().addOrderBy_LawId_Asc();
     * </pre>
     * @param lawList The entity list of law. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LawHistory> loadLawHistoryByLawId(List<Law> lawList, ReferrerConditionSetupper<LawHistoryCB> refCBLambda) {
        xassLRArg(lawList, refCBLambda);
        return doLoadLawHistoryByLawId(lawList, new LoadReferrerOption<LawHistoryCB, LawHistory>().xinit(refCBLambda));
    }

    /**
     * Load referrer of lawHistoryByLawIdList by the set-upper of referrer. <br>
     * (法令履歴)LAW_HISTORY by LAW_ID, named 'lawHistoryByLawIdList'.
     * <pre>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">loadLawHistoryByLawId</span>(<span style="color: #553000">law</span>, <span style="color: #553000">historyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">historyCB</span>.setupSelect...
     *     <span style="color: #553000">historyCB</span>.query().set...
     *     <span style="color: #553000">historyCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">law</span>.<span style="color: #CC4747">getLawHistoryByLawIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLawId_InScope(pkList);
     * cb.query().addOrderBy_LawId_Asc();
     * </pre>
     * @param law The entity of law. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LawHistory> loadLawHistoryByLawId(Law law, ReferrerConditionSetupper<LawHistoryCB> refCBLambda) {
        xassLRArg(law, refCBLambda);
        return doLoadLawHistoryByLawId(xnewLRLs(law), new LoadReferrerOption<LawHistoryCB, LawHistory>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<LawHistory> doLoadLawHistoryByLawId(List<Law> lawList, LoadReferrerOption<LawHistoryCB, LawHistory> option) {
        return helpLoadReferrerInternally(lawList, option, "lawHistoryByLawIdList");
    }

    /**
     * Load referrer of lawSourceRelList by the set-upper of referrer. <br>
     * (法令取得元リレーション)LAW_SOURCE_REL by LAW_ID, named 'lawSourceRelList'.
     * <pre>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">loadLawSourceRel</span>(<span style="color: #553000">lawList</span>, <span style="color: #553000">relCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">relCB</span>.setupSelect...
     *     <span style="color: #553000">relCB</span>.query().set...
     *     <span style="color: #553000">relCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (Law law : <span style="color: #553000">lawList</span>) {
     *     ... = law.<span style="color: #CC4747">getLawSourceRelList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLawId_InScope(pkList);
     * cb.query().addOrderBy_LawId_Asc();
     * </pre>
     * @param lawList The entity list of law. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LawSourceRel> loadLawSourceRel(List<Law> lawList, ReferrerConditionSetupper<LawSourceRelCB> refCBLambda) {
        xassLRArg(lawList, refCBLambda);
        return doLoadLawSourceRel(lawList, new LoadReferrerOption<LawSourceRelCB, LawSourceRel>().xinit(refCBLambda));
    }

    /**
     * Load referrer of lawSourceRelList by the set-upper of referrer. <br>
     * (法令取得元リレーション)LAW_SOURCE_REL by LAW_ID, named 'lawSourceRelList'.
     * <pre>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">loadLawSourceRel</span>(<span style="color: #553000">law</span>, <span style="color: #553000">relCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">relCB</span>.setupSelect...
     *     <span style="color: #553000">relCB</span>.query().set...
     *     <span style="color: #553000">relCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">law</span>.<span style="color: #CC4747">getLawSourceRelList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLawId_InScope(pkList);
     * cb.query().addOrderBy_LawId_Asc();
     * </pre>
     * @param law The entity of law. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LawSourceRel> loadLawSourceRel(Law law, ReferrerConditionSetupper<LawSourceRelCB> refCBLambda) {
        xassLRArg(law, refCBLambda);
        return doLoadLawSourceRel(xnewLRLs(law), new LoadReferrerOption<LawSourceRelCB, LawSourceRel>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<LawSourceRel> doLoadLawSourceRel(List<Law> lawList, LoadReferrerOption<LawSourceRelCB, LawSourceRel> option) {
        return helpLoadReferrerInternally(lawList, option, "lawSourceRelList");
    }

    /**
     * Load referrer of sourceLawCategoryRelList by the set-upper of referrer. <br>
     * (取得元法令カテゴリーリレーション)SOURCE_LAW_CATEGORY_REL by LAW_ID, named 'sourceLawCategoryRelList'.
     * <pre>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">loadSourceLawCategoryRel</span>(<span style="color: #553000">lawList</span>, <span style="color: #553000">relCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">relCB</span>.setupSelect...
     *     <span style="color: #553000">relCB</span>.query().set...
     *     <span style="color: #553000">relCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (Law law : <span style="color: #553000">lawList</span>) {
     *     ... = law.<span style="color: #CC4747">getSourceLawCategoryRelList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLawId_InScope(pkList);
     * cb.query().addOrderBy_LawId_Asc();
     * </pre>
     * @param lawList The entity list of law. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<SourceLawCategoryRel> loadSourceLawCategoryRel(List<Law> lawList, ReferrerConditionSetupper<SourceLawCategoryRelCB> refCBLambda) {
        xassLRArg(lawList, refCBLambda);
        return doLoadSourceLawCategoryRel(lawList, new LoadReferrerOption<SourceLawCategoryRelCB, SourceLawCategoryRel>().xinit(refCBLambda));
    }

    /**
     * Load referrer of sourceLawCategoryRelList by the set-upper of referrer. <br>
     * (取得元法令カテゴリーリレーション)SOURCE_LAW_CATEGORY_REL by LAW_ID, named 'sourceLawCategoryRelList'.
     * <pre>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">loadSourceLawCategoryRel</span>(<span style="color: #553000">law</span>, <span style="color: #553000">relCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">relCB</span>.setupSelect...
     *     <span style="color: #553000">relCB</span>.query().set...
     *     <span style="color: #553000">relCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">law</span>.<span style="color: #CC4747">getSourceLawCategoryRelList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLawId_InScope(pkList);
     * cb.query().addOrderBy_LawId_Asc();
     * </pre>
     * @param law The entity of law. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<SourceLawCategoryRel> loadSourceLawCategoryRel(Law law, ReferrerConditionSetupper<SourceLawCategoryRelCB> refCBLambda) {
        xassLRArg(law, refCBLambda);
        return doLoadSourceLawCategoryRel(xnewLRLs(law), new LoadReferrerOption<SourceLawCategoryRelCB, SourceLawCategoryRel>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<SourceLawCategoryRel> doLoadSourceLawCategoryRel(List<Law> lawList, LoadReferrerOption<SourceLawCategoryRelCB, SourceLawCategoryRel> option) {
        return helpLoadReferrerInternally(lawList, option, "sourceLawCategoryRelList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'LawType'.
     * @param lawList The list of law. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LawType> pulloutLawType(List<Law> lawList)
    { return helpPulloutInternally(lawList, "lawType"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key lawId.
     * @param lawList The list of law. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractLawIdList(List<Law> lawList)
    { return helpExtractListInternally(lawList, "lawId"); }

    /**
     * Extract the value list of (single) unique key lawNumber.
     * @param lawList The list of law. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractLawNumberList(List<Law> lawList)
    { return helpExtractListInternally(lawList, "lawNumber"); }

    /**
     * Extract the value list of (single) unique key lawPublicCode.
     * @param lawList The list of law. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractLawPublicCodeList(List<Law> lawList)
    { return helpExtractListInternally(lawList, "lawPublicCode"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * Law law = <span style="color: #70226C">new</span> Law();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * law.setFoo...(value);
     * law.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//law.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//law.set...;</span>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">insert</span>(law);
     * ... = law.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param law The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(Law law) {
        doInsert(law, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * Law law = <span style="color: #70226C">new</span> Law();
     * law.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * law.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//law.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//law.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * law.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">update</span>(law);
     * </pre>
     * @param law The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(Law law) {
        doUpdate(law, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * Law law = <span style="color: #70226C">new</span> Law();
     * law.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * law.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//law.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//law.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//law.setVersionNo(value);</span>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(law);
     * </pre>
     * @param law The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(Law law) {
        doUpdateNonstrict(law, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param law The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(Law law) {
        doInsertOrUpdate(law, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param law The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(Law law) {
        doInsertOrUpdateNonstrict(law, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * Law law = <span style="color: #70226C">new</span> Law();
     * law.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * law.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">delete</span>(law);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param law The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(Law law) {
        doDelete(law, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * Law law = <span style="color: #70226C">new</span> Law();
     * law.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//law.setVersionNo(value);</span>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(law);
     * </pre>
     * @param law The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(Law law) {
        doDeleteNonstrict(law, null);
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
     *     Law law = <span style="color: #70226C">new</span> Law();
     *     law.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         law.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     lawList.add(law);
     * }
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">batchInsert</span>(lawList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param lawList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<Law> lawList) {
        return doBatchInsert(lawList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     Law law = <span style="color: #70226C">new</span> Law();
     *     law.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         law.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         law.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//law.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     lawList.add(law);
     * }
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">batchUpdate</span>(lawList);
     * </pre>
     * @param lawList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<Law> lawList) {
        return doBatchUpdate(lawList, null);
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     Law law = <span style="color: #70226C">new</span> Law();
     *     law.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         law.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         law.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//law.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     lawList.add(law);
     * }
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">batchUpdate</span>(lawList);
     * </pre>
     * @param lawList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<Law> lawList) {
        return doBatchUpdateNonstrict(lawList, null);
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param lawList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<Law> lawList) {
        return doBatchDelete(lawList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param lawList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<Law> lawList) {
        return doBatchDeleteNonstrict(lawList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;Law, LawCB&gt;() {
     *     public ConditionBean setup(Law entity, LawCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<Law, LawCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * Law law = <span style="color: #70226C">new</span> Law();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//law.setPK...(value);</span>
     * law.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//law.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//law.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//law.setVersionNo(value);</span>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">queryUpdate</span>(law, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param law The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of Law. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(Law law, CBCall<LawCB> cbLambda) {
        return doQueryUpdate(law, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">queryDelete</span>(law, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of Law. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<LawCB> cbLambda) {
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
     * Law law = <span style="color: #70226C">new</span> Law();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * law.setFoo...(value);
     * law.setBar...(value);
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">varyingInsert</span>(law, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = law.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param law The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(Law law, WritableOptionCall<LawCB, InsertOption<LawCB>> opLambda) {
        doInsert(law, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * Law law = <span style="color: #70226C">new</span> Law();
     * law.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * law.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * law.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(law, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param law The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(Law law, WritableOptionCall<LawCB, UpdateOption<LawCB>> opLambda) {
        doUpdate(law, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * Law law = <span style="color: #70226C">new</span> Law();
     * law.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * law.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//law.setVersionNo(value);</span>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(law, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param law The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(Law law, WritableOptionCall<LawCB, UpdateOption<LawCB>> opLambda) {
        doUpdateNonstrict(law, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param law The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(Law law, WritableOptionCall<LawCB, InsertOption<LawCB>> insertOpLambda, WritableOptionCall<LawCB, UpdateOption<LawCB>> updateOpLambda) {
        doInsertOrUpdate(law, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param law The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(Law law, WritableOptionCall<LawCB, InsertOption<LawCB>> insertOpLambda, WritableOptionCall<LawCB, UpdateOption<LawCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(law, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param law The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(Law law, WritableOptionCall<LawCB, DeleteOption<LawCB>> opLambda) {
        doDelete(law, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param law The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(Law law, WritableOptionCall<LawCB, DeleteOption<LawCB>> opLambda) {
        doDeleteNonstrict(law, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param lawList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<Law> lawList, WritableOptionCall<LawCB, InsertOption<LawCB>> opLambda) {
        return doBatchInsert(lawList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param lawList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<Law> lawList, WritableOptionCall<LawCB, UpdateOption<LawCB>> opLambda) {
        return doBatchUpdate(lawList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param lawList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<Law> lawList, WritableOptionCall<LawCB, UpdateOption<LawCB>> opLambda) {
        return doBatchUpdateNonstrict(lawList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param lawList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<Law> lawList, WritableOptionCall<LawCB, DeleteOption<LawCB>> opLambda) {
        return doBatchDelete(lawList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param lawList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<Law> lawList, WritableOptionCall<LawCB, DeleteOption<LawCB>> opLambda) {
        return doBatchDeleteNonstrict(lawList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<Law, LawCB> manyArgLambda, WritableOptionCall<LawCB, InsertOption<LawCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * Law law = <span style="color: #70226C">new</span> Law();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//law.setPK...(value);</span>
     * law.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//law.setVersionNo(value);</span>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(law, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param law The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of Law. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(Law law, CBCall<LawCB> cbLambda, WritableOptionCall<LawCB, UpdateOption<LawCB>> opLambda) {
        return doQueryUpdate(law, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #CC4747">queryDelete</span>(law, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of Law. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<LawCB> cbLambda, WritableOptionCall<LawCB, DeleteOption<LawCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * lawBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * lawBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * lawBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * lawBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * lawBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * lawBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * lawBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * lawBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * lawBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * lawBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * lawBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * lawBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * lawBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * lawBhv.outideSql().removeBlockComment().selectList()
     * lawBhv.outideSql().removeLineComment().selectList()
     * lawBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<LawBhv> outsideSql() {
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
    protected Class<? extends Law> typeOfSelectedEntity() { return Law.class; }
    protected Class<Law> typeOfHandlingEntity() { return Law.class; }
    protected Class<LawCB> typeOfHandlingConditionBean() { return LawCB.class; }
}
