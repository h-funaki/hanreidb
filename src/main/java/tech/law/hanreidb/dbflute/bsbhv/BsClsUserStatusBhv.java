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
 * The behavior of ([区分値]ユーザーステータス)CLS_USER_STATUS as TABLE. <br>
 * <pre>
 * [primary key]
 *     USER_STATUS_CODE
 *
 * [column]
 *     USER_STATUS_CODE, USER_STATUS_NAME, USER_STATUS_ALIAS, DESCRIPTION, DISPLAY_ORDER, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
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
 *     USER, USER_STATUS_HISTORY
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     userList, userStatusHistoryList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsClsUserStatusBhv extends AbstractBehaviorWritable<ClsUserStatus, ClsUserStatusCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public ClsUserStatusDbm asDBMeta() { return ClsUserStatusDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "CLS_USER_STATUS"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public ClsUserStatusCB newConditionBean() { return new ClsUserStatusCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">clsUserStatusBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of ClsUserStatus. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<ClsUserStatusCB> cbLambda) {
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
     * <span style="color: #0000C0">clsUserStatusBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">clsUserStatus</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">clsUserStatus</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">clsUserStatusBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">clsUserStatus</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">clsUserStatus</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of ClsUserStatus. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<ClsUserStatus> selectEntity(CBCall<ClsUserStatusCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<ClsUserStatus> facadeSelectEntity(ClsUserStatusCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends ClsUserStatus> OptionalEntity<ENTITY> doSelectOptionalEntity(ClsUserStatusCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * ClsUserStatus <span style="color: #553000">clsUserStatus</span> = <span style="color: #0000C0">clsUserStatusBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">clsUserStatus</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of ClsUserStatus. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public ClsUserStatus selectEntityWithDeletedCheck(CBCall<ClsUserStatusCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param userStatusCode (ユーザーステータスコード): PK, NotNull, VARCHAR(10), classification=UserStatus. (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<ClsUserStatus> selectByPK(String userStatusCode) {
        return facadeSelectByPK(userStatusCode);
    }

    protected OptionalEntity<ClsUserStatus> facadeSelectByPK(String userStatusCode) {
        return doSelectOptionalByPK(userStatusCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends ClsUserStatus> ENTITY doSelectByPK(String userStatusCode, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(userStatusCode), tp);
    }

    protected <ENTITY extends ClsUserStatus> OptionalEntity<ENTITY> doSelectOptionalByPK(String userStatusCode, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(userStatusCode, tp), userStatusCode);
    }

    protected ClsUserStatusCB xprepareCBAsPK(String userStatusCode) {
        assertObjectNotNull("userStatusCode", userStatusCode);
        return newConditionBean().acceptPK(userStatusCode);
    }

    /**
     * Select the entity by the unique-key value.
     * @param displayOrder (順番): UQ, NotNull, INT UNSIGNED(10). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<ClsUserStatus> selectByUniqueOf(Integer displayOrder) {
        return facadeSelectByUniqueOf(displayOrder);
    }

    protected OptionalEntity<ClsUserStatus> facadeSelectByUniqueOf(Integer displayOrder) {
        return doSelectByUniqueOf(displayOrder, typeOfSelectedEntity());
    }

    protected <ENTITY extends ClsUserStatus> OptionalEntity<ENTITY> doSelectByUniqueOf(Integer displayOrder, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(displayOrder), tp), displayOrder);
    }

    protected ClsUserStatusCB xprepareCBAsUniqueOf(Integer displayOrder) {
        assertObjectNotNull("displayOrder", displayOrder);
        return newConditionBean().acceptUniqueOf(displayOrder);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;ClsUserStatus&gt; <span style="color: #553000">clsUserStatusList</span> = <span style="color: #0000C0">clsUserStatusBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (ClsUserStatus <span style="color: #553000">clsUserStatus</span> : <span style="color: #553000">clsUserStatusList</span>) {
     *     ... = <span style="color: #553000">clsUserStatus</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of ClsUserStatus. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<ClsUserStatus> selectList(CBCall<ClsUserStatusCB> cbLambda) {
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
     * PagingResultBean&lt;ClsUserStatus&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">clsUserStatusBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (ClsUserStatus clsUserStatus : <span style="color: #553000">page</span>) {
     *     ... = clsUserStatus.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of ClsUserStatus. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<ClsUserStatus> selectPage(CBCall<ClsUserStatusCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">clsUserStatusBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of ClsUserStatus. (NotNull)
     * @param entityLambda The handler of entity row of ClsUserStatus. (NotNull)
     */
    public void selectCursor(CBCall<ClsUserStatusCB> cbLambda, EntityRowHandler<ClsUserStatus> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">clsUserStatusBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<ClsUserStatusCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param clsUserStatusList The entity list of clsUserStatus. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<ClsUserStatus> clsUserStatusList, ReferrerLoaderHandler<LoaderOfClsUserStatus> loaderLambda) {
        xassLRArg(clsUserStatusList, loaderLambda);
        loaderLambda.handle(new LoaderOfClsUserStatus().ready(clsUserStatusList, _behaviorSelector));
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
     * @param clsUserStatus The entity of clsUserStatus. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(ClsUserStatus clsUserStatus, ReferrerLoaderHandler<LoaderOfClsUserStatus> loaderLambda) {
        xassLRArg(clsUserStatus, loaderLambda);
        loaderLambda.handle(new LoaderOfClsUserStatus().ready(xnewLRAryLs(clsUserStatus), _behaviorSelector));
    }

    /**
     * Load referrer of userList by the set-upper of referrer. <br>
     * (ユーザー)USER by USER_STATUS_CODE, named 'userList'.
     * <pre>
     * <span style="color: #0000C0">clsUserStatusBhv</span>.<span style="color: #CC4747">loadUser</span>(<span style="color: #553000">clsUserStatusList</span>, <span style="color: #553000">userCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userCB</span>.setupSelect...
     *     <span style="color: #553000">userCB</span>.query().set...
     *     <span style="color: #553000">userCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (ClsUserStatus clsUserStatus : <span style="color: #553000">clsUserStatusList</span>) {
     *     ... = clsUserStatus.<span style="color: #CC4747">getUserList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserStatusCode_InScope(pkList);
     * cb.query().addOrderBy_UserStatusCode_Asc();
     * </pre>
     * @param clsUserStatusList The entity list of clsUserStatus. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<User> loadUser(List<ClsUserStatus> clsUserStatusList, ReferrerConditionSetupper<UserCB> refCBLambda) {
        xassLRArg(clsUserStatusList, refCBLambda);
        return doLoadUser(clsUserStatusList, new LoadReferrerOption<UserCB, User>().xinit(refCBLambda));
    }

    /**
     * Load referrer of userList by the set-upper of referrer. <br>
     * (ユーザー)USER by USER_STATUS_CODE, named 'userList'.
     * <pre>
     * <span style="color: #0000C0">clsUserStatusBhv</span>.<span style="color: #CC4747">loadUser</span>(<span style="color: #553000">clsUserStatus</span>, <span style="color: #553000">userCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userCB</span>.setupSelect...
     *     <span style="color: #553000">userCB</span>.query().set...
     *     <span style="color: #553000">userCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">clsUserStatus</span>.<span style="color: #CC4747">getUserList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserStatusCode_InScope(pkList);
     * cb.query().addOrderBy_UserStatusCode_Asc();
     * </pre>
     * @param clsUserStatus The entity of clsUserStatus. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<User> loadUser(ClsUserStatus clsUserStatus, ReferrerConditionSetupper<UserCB> refCBLambda) {
        xassLRArg(clsUserStatus, refCBLambda);
        return doLoadUser(xnewLRLs(clsUserStatus), new LoadReferrerOption<UserCB, User>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<User> doLoadUser(List<ClsUserStatus> clsUserStatusList, LoadReferrerOption<UserCB, User> option) {
        return helpLoadReferrerInternally(clsUserStatusList, option, "userList");
    }

    /**
     * Load referrer of userStatusHistoryList by the set-upper of referrer. <br>
     * (ユーザーステータス履歴)USER_STATUS_HISTORY by USER_NEW_STATUS_CODE, named 'userStatusHistoryList'.
     * <pre>
     * <span style="color: #0000C0">clsUserStatusBhv</span>.<span style="color: #CC4747">loadUserStatusHistory</span>(<span style="color: #553000">clsUserStatusList</span>, <span style="color: #553000">historyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">historyCB</span>.setupSelect...
     *     <span style="color: #553000">historyCB</span>.query().set...
     *     <span style="color: #553000">historyCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (ClsUserStatus clsUserStatus : <span style="color: #553000">clsUserStatusList</span>) {
     *     ... = clsUserStatus.<span style="color: #CC4747">getUserStatusHistoryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserNewStatusCode_InScope(pkList);
     * cb.query().addOrderBy_UserNewStatusCode_Asc();
     * </pre>
     * @param clsUserStatusList The entity list of clsUserStatus. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<UserStatusHistory> loadUserStatusHistory(List<ClsUserStatus> clsUserStatusList, ReferrerConditionSetupper<UserStatusHistoryCB> refCBLambda) {
        xassLRArg(clsUserStatusList, refCBLambda);
        return doLoadUserStatusHistory(clsUserStatusList, new LoadReferrerOption<UserStatusHistoryCB, UserStatusHistory>().xinit(refCBLambda));
    }

    /**
     * Load referrer of userStatusHistoryList by the set-upper of referrer. <br>
     * (ユーザーステータス履歴)USER_STATUS_HISTORY by USER_NEW_STATUS_CODE, named 'userStatusHistoryList'.
     * <pre>
     * <span style="color: #0000C0">clsUserStatusBhv</span>.<span style="color: #CC4747">loadUserStatusHistory</span>(<span style="color: #553000">clsUserStatus</span>, <span style="color: #553000">historyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">historyCB</span>.setupSelect...
     *     <span style="color: #553000">historyCB</span>.query().set...
     *     <span style="color: #553000">historyCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">clsUserStatus</span>.<span style="color: #CC4747">getUserStatusHistoryList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserNewStatusCode_InScope(pkList);
     * cb.query().addOrderBy_UserNewStatusCode_Asc();
     * </pre>
     * @param clsUserStatus The entity of clsUserStatus. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<UserStatusHistory> loadUserStatusHistory(ClsUserStatus clsUserStatus, ReferrerConditionSetupper<UserStatusHistoryCB> refCBLambda) {
        xassLRArg(clsUserStatus, refCBLambda);
        return doLoadUserStatusHistory(xnewLRLs(clsUserStatus), new LoadReferrerOption<UserStatusHistoryCB, UserStatusHistory>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<UserStatusHistory> doLoadUserStatusHistory(List<ClsUserStatus> clsUserStatusList, LoadReferrerOption<UserStatusHistoryCB, UserStatusHistory> option) {
        return helpLoadReferrerInternally(clsUserStatusList, option, "userStatusHistoryList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key userStatusCode.
     * @param clsUserStatusList The list of clsUserStatus. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractUserStatusCodeList(List<ClsUserStatus> clsUserStatusList)
    { return helpExtractListInternally(clsUserStatusList, "userStatusCode"); }

    /**
     * Extract the value list of (single) unique key displayOrder.
     * @param clsUserStatusList The list of clsUserStatus. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractDisplayOrderList(List<ClsUserStatus> clsUserStatusList)
    { return helpExtractListInternally(clsUserStatusList, "displayOrder"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * ClsUserStatus clsUserStatus = <span style="color: #70226C">new</span> ClsUserStatus();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * clsUserStatus.setFoo...(value);
     * clsUserStatus.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//clsUserStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//clsUserStatus.set...;</span>
     * <span style="color: #0000C0">clsUserStatusBhv</span>.<span style="color: #CC4747">insert</span>(clsUserStatus);
     * ... = clsUserStatus.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param clsUserStatus The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(ClsUserStatus clsUserStatus) {
        doInsert(clsUserStatus, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * ClsUserStatus clsUserStatus = <span style="color: #70226C">new</span> ClsUserStatus();
     * clsUserStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * clsUserStatus.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//clsUserStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//clsUserStatus.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * clsUserStatus.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">clsUserStatusBhv</span>.<span style="color: #CC4747">update</span>(clsUserStatus);
     * </pre>
     * @param clsUserStatus The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(ClsUserStatus clsUserStatus) {
        doUpdate(clsUserStatus, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * ClsUserStatus clsUserStatus = <span style="color: #70226C">new</span> ClsUserStatus();
     * clsUserStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * clsUserStatus.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//clsUserStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//clsUserStatus.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//clsUserStatus.setVersionNo(value);</span>
     * <span style="color: #0000C0">clsUserStatusBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(clsUserStatus);
     * </pre>
     * @param clsUserStatus The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(ClsUserStatus clsUserStatus) {
        doUpdateNonstrict(clsUserStatus, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param clsUserStatus The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(ClsUserStatus clsUserStatus) {
        doInsertOrUpdate(clsUserStatus, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param clsUserStatus The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(ClsUserStatus clsUserStatus) {
        doInsertOrUpdateNonstrict(clsUserStatus, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * ClsUserStatus clsUserStatus = <span style="color: #70226C">new</span> ClsUserStatus();
     * clsUserStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * clsUserStatus.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">clsUserStatusBhv</span>.<span style="color: #CC4747">delete</span>(clsUserStatus);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param clsUserStatus The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(ClsUserStatus clsUserStatus) {
        doDelete(clsUserStatus, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * ClsUserStatus clsUserStatus = <span style="color: #70226C">new</span> ClsUserStatus();
     * clsUserStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//clsUserStatus.setVersionNo(value);</span>
     * <span style="color: #0000C0">clsUserStatusBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(clsUserStatus);
     * </pre>
     * @param clsUserStatus The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(ClsUserStatus clsUserStatus) {
        doDeleteNonstrict(clsUserStatus, null);
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
     *     ClsUserStatus clsUserStatus = <span style="color: #70226C">new</span> ClsUserStatus();
     *     clsUserStatus.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         clsUserStatus.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     clsUserStatusList.add(clsUserStatus);
     * }
     * <span style="color: #0000C0">clsUserStatusBhv</span>.<span style="color: #CC4747">batchInsert</span>(clsUserStatusList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param clsUserStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<ClsUserStatus> clsUserStatusList) {
        return doBatchInsert(clsUserStatusList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     ClsUserStatus clsUserStatus = <span style="color: #70226C">new</span> ClsUserStatus();
     *     clsUserStatus.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         clsUserStatus.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         clsUserStatus.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//clsUserStatus.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     clsUserStatusList.add(clsUserStatus);
     * }
     * <span style="color: #0000C0">clsUserStatusBhv</span>.<span style="color: #CC4747">batchUpdate</span>(clsUserStatusList);
     * </pre>
     * @param clsUserStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<ClsUserStatus> clsUserStatusList) {
        return doBatchUpdate(clsUserStatusList, null);
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     ClsUserStatus clsUserStatus = <span style="color: #70226C">new</span> ClsUserStatus();
     *     clsUserStatus.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         clsUserStatus.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         clsUserStatus.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//clsUserStatus.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     clsUserStatusList.add(clsUserStatus);
     * }
     * <span style="color: #0000C0">clsUserStatusBhv</span>.<span style="color: #CC4747">batchUpdate</span>(clsUserStatusList);
     * </pre>
     * @param clsUserStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<ClsUserStatus> clsUserStatusList) {
        return doBatchUpdateNonstrict(clsUserStatusList, null);
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param clsUserStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<ClsUserStatus> clsUserStatusList) {
        return doBatchDelete(clsUserStatusList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param clsUserStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<ClsUserStatus> clsUserStatusList) {
        return doBatchDeleteNonstrict(clsUserStatusList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">clsUserStatusBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;ClsUserStatus, ClsUserStatusCB&gt;() {
     *     public ConditionBean setup(ClsUserStatus entity, ClsUserStatusCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<ClsUserStatus, ClsUserStatusCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * ClsUserStatus clsUserStatus = <span style="color: #70226C">new</span> ClsUserStatus();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//clsUserStatus.setPK...(value);</span>
     * clsUserStatus.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//clsUserStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//clsUserStatus.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//clsUserStatus.setVersionNo(value);</span>
     * <span style="color: #0000C0">clsUserStatusBhv</span>.<span style="color: #CC4747">queryUpdate</span>(clsUserStatus, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param clsUserStatus The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of ClsUserStatus. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(ClsUserStatus clsUserStatus, CBCall<ClsUserStatusCB> cbLambda) {
        return doQueryUpdate(clsUserStatus, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">clsUserStatusBhv</span>.<span style="color: #CC4747">queryDelete</span>(clsUserStatus, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of ClsUserStatus. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<ClsUserStatusCB> cbLambda) {
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
     * ClsUserStatus clsUserStatus = <span style="color: #70226C">new</span> ClsUserStatus();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * clsUserStatus.setFoo...(value);
     * clsUserStatus.setBar...(value);
     * <span style="color: #0000C0">clsUserStatusBhv</span>.<span style="color: #CC4747">varyingInsert</span>(clsUserStatus, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = clsUserStatus.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param clsUserStatus The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(ClsUserStatus clsUserStatus, WritableOptionCall<ClsUserStatusCB, InsertOption<ClsUserStatusCB>> opLambda) {
        doInsert(clsUserStatus, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * ClsUserStatus clsUserStatus = <span style="color: #70226C">new</span> ClsUserStatus();
     * clsUserStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * clsUserStatus.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * clsUserStatus.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">clsUserStatusBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(clsUserStatus, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param clsUserStatus The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(ClsUserStatus clsUserStatus, WritableOptionCall<ClsUserStatusCB, UpdateOption<ClsUserStatusCB>> opLambda) {
        doUpdate(clsUserStatus, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * ClsUserStatus clsUserStatus = <span style="color: #70226C">new</span> ClsUserStatus();
     * clsUserStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * clsUserStatus.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//clsUserStatus.setVersionNo(value);</span>
     * <span style="color: #0000C0">clsUserStatusBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(clsUserStatus, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param clsUserStatus The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(ClsUserStatus clsUserStatus, WritableOptionCall<ClsUserStatusCB, UpdateOption<ClsUserStatusCB>> opLambda) {
        doUpdateNonstrict(clsUserStatus, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param clsUserStatus The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(ClsUserStatus clsUserStatus, WritableOptionCall<ClsUserStatusCB, InsertOption<ClsUserStatusCB>> insertOpLambda, WritableOptionCall<ClsUserStatusCB, UpdateOption<ClsUserStatusCB>> updateOpLambda) {
        doInsertOrUpdate(clsUserStatus, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param clsUserStatus The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(ClsUserStatus clsUserStatus, WritableOptionCall<ClsUserStatusCB, InsertOption<ClsUserStatusCB>> insertOpLambda, WritableOptionCall<ClsUserStatusCB, UpdateOption<ClsUserStatusCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(clsUserStatus, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param clsUserStatus The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(ClsUserStatus clsUserStatus, WritableOptionCall<ClsUserStatusCB, DeleteOption<ClsUserStatusCB>> opLambda) {
        doDelete(clsUserStatus, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param clsUserStatus The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(ClsUserStatus clsUserStatus, WritableOptionCall<ClsUserStatusCB, DeleteOption<ClsUserStatusCB>> opLambda) {
        doDeleteNonstrict(clsUserStatus, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param clsUserStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<ClsUserStatus> clsUserStatusList, WritableOptionCall<ClsUserStatusCB, InsertOption<ClsUserStatusCB>> opLambda) {
        return doBatchInsert(clsUserStatusList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param clsUserStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<ClsUserStatus> clsUserStatusList, WritableOptionCall<ClsUserStatusCB, UpdateOption<ClsUserStatusCB>> opLambda) {
        return doBatchUpdate(clsUserStatusList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param clsUserStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<ClsUserStatus> clsUserStatusList, WritableOptionCall<ClsUserStatusCB, UpdateOption<ClsUserStatusCB>> opLambda) {
        return doBatchUpdateNonstrict(clsUserStatusList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param clsUserStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<ClsUserStatus> clsUserStatusList, WritableOptionCall<ClsUserStatusCB, DeleteOption<ClsUserStatusCB>> opLambda) {
        return doBatchDelete(clsUserStatusList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param clsUserStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<ClsUserStatus> clsUserStatusList, WritableOptionCall<ClsUserStatusCB, DeleteOption<ClsUserStatusCB>> opLambda) {
        return doBatchDeleteNonstrict(clsUserStatusList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<ClsUserStatus, ClsUserStatusCB> manyArgLambda, WritableOptionCall<ClsUserStatusCB, InsertOption<ClsUserStatusCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * ClsUserStatus clsUserStatus = <span style="color: #70226C">new</span> ClsUserStatus();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//clsUserStatus.setPK...(value);</span>
     * clsUserStatus.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//clsUserStatus.setVersionNo(value);</span>
     * <span style="color: #0000C0">clsUserStatusBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(clsUserStatus, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param clsUserStatus The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of ClsUserStatus. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(ClsUserStatus clsUserStatus, CBCall<ClsUserStatusCB> cbLambda, WritableOptionCall<ClsUserStatusCB, UpdateOption<ClsUserStatusCB>> opLambda) {
        return doQueryUpdate(clsUserStatus, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">clsUserStatusBhv</span>.<span style="color: #CC4747">queryDelete</span>(clsUserStatus, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of ClsUserStatus. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<ClsUserStatusCB> cbLambda, WritableOptionCall<ClsUserStatusCB, DeleteOption<ClsUserStatusCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * clsUserStatusBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * clsUserStatusBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * clsUserStatusBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * clsUserStatusBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * clsUserStatusBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * clsUserStatusBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * clsUserStatusBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * clsUserStatusBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * clsUserStatusBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * clsUserStatusBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * clsUserStatusBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * clsUserStatusBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * clsUserStatusBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * clsUserStatusBhv.outideSql().removeBlockComment().selectList()
     * clsUserStatusBhv.outideSql().removeLineComment().selectList()
     * clsUserStatusBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<ClsUserStatusBhv> outsideSql() {
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
    protected Class<? extends ClsUserStatus> typeOfSelectedEntity() { return ClsUserStatus.class; }
    protected Class<ClsUserStatus> typeOfHandlingEntity() { return ClsUserStatus.class; }
    protected Class<ClsUserStatusCB> typeOfHandlingConditionBean() { return ClsUserStatusCB.class; }
}
