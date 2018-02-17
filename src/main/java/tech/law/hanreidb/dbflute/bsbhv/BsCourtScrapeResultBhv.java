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
 * The behavior of (裁判所スクレイピング結果)COURT_SCRAPE_RESULT as TABLE. <br>
 * <pre>
 * [primary key]
 *     COURT_SCRAPE_RESULT_ID
 *
 * [column]
 *     COURT_SCRAPE_RESULT_ID, CASE_NUMBER, CASE_NAME, JUDGEMENT_DATE, COURT_NAME, JUDGEMENT_TYPE, JUDGEMENT_RESULT, PRECEDENT_REPORTS, ORIGINAL_COURT_NAME, ORIGINAL_CASE_NUMBER, ORIGINAL_JUDGEMENT_DATE, ORIGINAL_JUDGEMENT_RESULT, JUDGEMENT_CONTENT, JUDGEMENT_SUMMARY, LAW, TEXT_URL, HIGH_COURT_REPORTS, JUDGEMENT_CONTENT_SUMMARY, RIGHT_TYPE, LAWSUIT_TYPE, CASE_CATEGORY, SOURCE_ORIGINAL_ID, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COURT_SCRAPE_RESULT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsCourtScrapeResultBhv extends AbstractBehaviorWritable<CourtScrapeResult, CourtScrapeResultCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public CourtScrapeResultDbm asDBMeta() { return CourtScrapeResultDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "COURT_SCRAPE_RESULT"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public CourtScrapeResultCB newConditionBean() { return new CourtScrapeResultCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">courtScrapeResultBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of CourtScrapeResult. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<CourtScrapeResultCB> cbLambda) {
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
     * <span style="color: #0000C0">courtScrapeResultBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">courtScrapeResult</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">courtScrapeResult</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">courtScrapeResultBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">courtScrapeResult</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">courtScrapeResult</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of CourtScrapeResult. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<CourtScrapeResult> selectEntity(CBCall<CourtScrapeResultCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<CourtScrapeResult> facadeSelectEntity(CourtScrapeResultCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends CourtScrapeResult> OptionalEntity<ENTITY> doSelectOptionalEntity(CourtScrapeResultCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * CourtScrapeResult <span style="color: #553000">courtScrapeResult</span> = <span style="color: #0000C0">courtScrapeResultBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">courtScrapeResult</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of CourtScrapeResult. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public CourtScrapeResult selectEntityWithDeletedCheck(CBCall<CourtScrapeResultCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param courtScrapeResultId (裁判所スクレイピング結果ID): PK, ID, NotNull, BIGINT UNSIGNED(20). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<CourtScrapeResult> selectByPK(Long courtScrapeResultId) {
        return facadeSelectByPK(courtScrapeResultId);
    }

    protected OptionalEntity<CourtScrapeResult> facadeSelectByPK(Long courtScrapeResultId) {
        return doSelectOptionalByPK(courtScrapeResultId, typeOfSelectedEntity());
    }

    protected <ENTITY extends CourtScrapeResult> ENTITY doSelectByPK(Long courtScrapeResultId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(courtScrapeResultId), tp);
    }

    protected <ENTITY extends CourtScrapeResult> OptionalEntity<ENTITY> doSelectOptionalByPK(Long courtScrapeResultId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(courtScrapeResultId, tp), courtScrapeResultId);
    }

    protected CourtScrapeResultCB xprepareCBAsPK(Long courtScrapeResultId) {
        assertObjectNotNull("courtScrapeResultId", courtScrapeResultId);
        return newConditionBean().acceptPK(courtScrapeResultId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param caseNumber (事件番号): UQ, NotNull, VARCHAR(50). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<CourtScrapeResult> selectByUniqueOfCaseNumber(String caseNumber) {
        return facadeSelectByUniqueOfCaseNumber(caseNumber);
    }

    protected OptionalEntity<CourtScrapeResult> facadeSelectByUniqueOfCaseNumber(String caseNumber) {
        return doSelectByUniqueOfCaseNumber(caseNumber, typeOfSelectedEntity());
    }

    protected <ENTITY extends CourtScrapeResult> OptionalEntity<ENTITY> doSelectByUniqueOfCaseNumber(String caseNumber, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOfCaseNumber(caseNumber), tp), caseNumber);
    }

    protected CourtScrapeResultCB xprepareCBAsUniqueOfCaseNumber(String caseNumber) {
        assertObjectNotNull("caseNumber", caseNumber);
        return newConditionBean().acceptUniqueOfCaseNumber(caseNumber);
    }

    /**
     * Select the entity by the unique-key value.
     * @param sourceOriginalId (取得元ID): UQ, NotNull, INT UNSIGNED(10). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<CourtScrapeResult> selectByUniqueOfSourceOriginalId(Integer sourceOriginalId) {
        return facadeSelectByUniqueOfSourceOriginalId(sourceOriginalId);
    }

    protected OptionalEntity<CourtScrapeResult> facadeSelectByUniqueOfSourceOriginalId(Integer sourceOriginalId) {
        return doSelectByUniqueOfSourceOriginalId(sourceOriginalId, typeOfSelectedEntity());
    }

    protected <ENTITY extends CourtScrapeResult> OptionalEntity<ENTITY> doSelectByUniqueOfSourceOriginalId(Integer sourceOriginalId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOfSourceOriginalId(sourceOriginalId), tp), sourceOriginalId);
    }

    protected CourtScrapeResultCB xprepareCBAsUniqueOfSourceOriginalId(Integer sourceOriginalId) {
        assertObjectNotNull("sourceOriginalId", sourceOriginalId);
        return newConditionBean().acceptUniqueOfSourceOriginalId(sourceOriginalId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;CourtScrapeResult&gt; <span style="color: #553000">courtScrapeResultList</span> = <span style="color: #0000C0">courtScrapeResultBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (CourtScrapeResult <span style="color: #553000">courtScrapeResult</span> : <span style="color: #553000">courtScrapeResultList</span>) {
     *     ... = <span style="color: #553000">courtScrapeResult</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of CourtScrapeResult. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<CourtScrapeResult> selectList(CBCall<CourtScrapeResultCB> cbLambda) {
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
     * PagingResultBean&lt;CourtScrapeResult&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">courtScrapeResultBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (CourtScrapeResult courtScrapeResult : <span style="color: #553000">page</span>) {
     *     ... = courtScrapeResult.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of CourtScrapeResult. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<CourtScrapeResult> selectPage(CBCall<CourtScrapeResultCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">courtScrapeResultBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of CourtScrapeResult. (NotNull)
     * @param entityLambda The handler of entity row of CourtScrapeResult. (NotNull)
     */
    public void selectCursor(CBCall<CourtScrapeResultCB> cbLambda, EntityRowHandler<CourtScrapeResult> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">courtScrapeResultBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<CourtScrapeResultCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param courtScrapeResultList The entity list of courtScrapeResult. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<CourtScrapeResult> courtScrapeResultList, ReferrerLoaderHandler<LoaderOfCourtScrapeResult> loaderLambda) {
        xassLRArg(courtScrapeResultList, loaderLambda);
        loaderLambda.handle(new LoaderOfCourtScrapeResult().ready(courtScrapeResultList, _behaviorSelector));
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
     * @param courtScrapeResult The entity of courtScrapeResult. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(CourtScrapeResult courtScrapeResult, ReferrerLoaderHandler<LoaderOfCourtScrapeResult> loaderLambda) {
        xassLRArg(courtScrapeResult, loaderLambda);
        loaderLambda.handle(new LoaderOfCourtScrapeResult().ready(xnewLRAryLs(courtScrapeResult), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key courtScrapeResultId.
     * @param courtScrapeResultList The list of courtScrapeResult. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractCourtScrapeResultIdList(List<CourtScrapeResult> courtScrapeResultList)
    { return helpExtractListInternally(courtScrapeResultList, "courtScrapeResultId"); }

    /**
     * Extract the value list of (single) unique key caseNumber.
     * @param courtScrapeResultList The list of courtScrapeResult. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractCaseNumberList(List<CourtScrapeResult> courtScrapeResultList)
    { return helpExtractListInternally(courtScrapeResultList, "caseNumber"); }

    /**
     * Extract the value list of (single) unique key sourceOriginalId.
     * @param courtScrapeResultList The list of courtScrapeResult. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractSourceOriginalIdList(List<CourtScrapeResult> courtScrapeResultList)
    { return helpExtractListInternally(courtScrapeResultList, "sourceOriginalId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * CourtScrapeResult courtScrapeResult = <span style="color: #70226C">new</span> CourtScrapeResult();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * courtScrapeResult.setFoo...(value);
     * courtScrapeResult.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//courtScrapeResult.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//courtScrapeResult.set...;</span>
     * <span style="color: #0000C0">courtScrapeResultBhv</span>.<span style="color: #CC4747">insert</span>(courtScrapeResult);
     * ... = courtScrapeResult.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param courtScrapeResult The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(CourtScrapeResult courtScrapeResult) {
        doInsert(courtScrapeResult, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * CourtScrapeResult courtScrapeResult = <span style="color: #70226C">new</span> CourtScrapeResult();
     * courtScrapeResult.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * courtScrapeResult.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//courtScrapeResult.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//courtScrapeResult.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * courtScrapeResult.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">courtScrapeResultBhv</span>.<span style="color: #CC4747">update</span>(courtScrapeResult);
     * </pre>
     * @param courtScrapeResult The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(CourtScrapeResult courtScrapeResult) {
        doUpdate(courtScrapeResult, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * CourtScrapeResult courtScrapeResult = <span style="color: #70226C">new</span> CourtScrapeResult();
     * courtScrapeResult.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * courtScrapeResult.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//courtScrapeResult.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//courtScrapeResult.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//courtScrapeResult.setVersionNo(value);</span>
     * <span style="color: #0000C0">courtScrapeResultBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(courtScrapeResult);
     * </pre>
     * @param courtScrapeResult The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(CourtScrapeResult courtScrapeResult) {
        doUpdateNonstrict(courtScrapeResult, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param courtScrapeResult The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(CourtScrapeResult courtScrapeResult) {
        doInsertOrUpdate(courtScrapeResult, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param courtScrapeResult The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(CourtScrapeResult courtScrapeResult) {
        doInsertOrUpdateNonstrict(courtScrapeResult, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * CourtScrapeResult courtScrapeResult = <span style="color: #70226C">new</span> CourtScrapeResult();
     * courtScrapeResult.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * courtScrapeResult.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">courtScrapeResultBhv</span>.<span style="color: #CC4747">delete</span>(courtScrapeResult);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param courtScrapeResult The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(CourtScrapeResult courtScrapeResult) {
        doDelete(courtScrapeResult, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * CourtScrapeResult courtScrapeResult = <span style="color: #70226C">new</span> CourtScrapeResult();
     * courtScrapeResult.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//courtScrapeResult.setVersionNo(value);</span>
     * <span style="color: #0000C0">courtScrapeResultBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(courtScrapeResult);
     * </pre>
     * @param courtScrapeResult The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(CourtScrapeResult courtScrapeResult) {
        doDeleteNonstrict(courtScrapeResult, null);
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
     *     CourtScrapeResult courtScrapeResult = <span style="color: #70226C">new</span> CourtScrapeResult();
     *     courtScrapeResult.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         courtScrapeResult.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     courtScrapeResultList.add(courtScrapeResult);
     * }
     * <span style="color: #0000C0">courtScrapeResultBhv</span>.<span style="color: #CC4747">batchInsert</span>(courtScrapeResultList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param courtScrapeResultList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<CourtScrapeResult> courtScrapeResultList) {
        return doBatchInsert(courtScrapeResultList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     CourtScrapeResult courtScrapeResult = <span style="color: #70226C">new</span> CourtScrapeResult();
     *     courtScrapeResult.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         courtScrapeResult.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         courtScrapeResult.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//courtScrapeResult.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     courtScrapeResultList.add(courtScrapeResult);
     * }
     * <span style="color: #0000C0">courtScrapeResultBhv</span>.<span style="color: #CC4747">batchUpdate</span>(courtScrapeResultList);
     * </pre>
     * @param courtScrapeResultList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<CourtScrapeResult> courtScrapeResultList) {
        return doBatchUpdate(courtScrapeResultList, null);
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     CourtScrapeResult courtScrapeResult = <span style="color: #70226C">new</span> CourtScrapeResult();
     *     courtScrapeResult.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         courtScrapeResult.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         courtScrapeResult.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//courtScrapeResult.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     courtScrapeResultList.add(courtScrapeResult);
     * }
     * <span style="color: #0000C0">courtScrapeResultBhv</span>.<span style="color: #CC4747">batchUpdate</span>(courtScrapeResultList);
     * </pre>
     * @param courtScrapeResultList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<CourtScrapeResult> courtScrapeResultList) {
        return doBatchUpdateNonstrict(courtScrapeResultList, null);
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param courtScrapeResultList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<CourtScrapeResult> courtScrapeResultList) {
        return doBatchDelete(courtScrapeResultList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param courtScrapeResultList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<CourtScrapeResult> courtScrapeResultList) {
        return doBatchDeleteNonstrict(courtScrapeResultList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">courtScrapeResultBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;CourtScrapeResult, CourtScrapeResultCB&gt;() {
     *     public ConditionBean setup(CourtScrapeResult entity, CourtScrapeResultCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<CourtScrapeResult, CourtScrapeResultCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * CourtScrapeResult courtScrapeResult = <span style="color: #70226C">new</span> CourtScrapeResult();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//courtScrapeResult.setPK...(value);</span>
     * courtScrapeResult.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//courtScrapeResult.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//courtScrapeResult.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//courtScrapeResult.setVersionNo(value);</span>
     * <span style="color: #0000C0">courtScrapeResultBhv</span>.<span style="color: #CC4747">queryUpdate</span>(courtScrapeResult, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param courtScrapeResult The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of CourtScrapeResult. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(CourtScrapeResult courtScrapeResult, CBCall<CourtScrapeResultCB> cbLambda) {
        return doQueryUpdate(courtScrapeResult, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">courtScrapeResultBhv</span>.<span style="color: #CC4747">queryDelete</span>(courtScrapeResult, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of CourtScrapeResult. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<CourtScrapeResultCB> cbLambda) {
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
     * CourtScrapeResult courtScrapeResult = <span style="color: #70226C">new</span> CourtScrapeResult();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * courtScrapeResult.setFoo...(value);
     * courtScrapeResult.setBar...(value);
     * <span style="color: #0000C0">courtScrapeResultBhv</span>.<span style="color: #CC4747">varyingInsert</span>(courtScrapeResult, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = courtScrapeResult.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param courtScrapeResult The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(CourtScrapeResult courtScrapeResult, WritableOptionCall<CourtScrapeResultCB, InsertOption<CourtScrapeResultCB>> opLambda) {
        doInsert(courtScrapeResult, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * CourtScrapeResult courtScrapeResult = <span style="color: #70226C">new</span> CourtScrapeResult();
     * courtScrapeResult.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * courtScrapeResult.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * courtScrapeResult.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">courtScrapeResultBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(courtScrapeResult, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param courtScrapeResult The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(CourtScrapeResult courtScrapeResult, WritableOptionCall<CourtScrapeResultCB, UpdateOption<CourtScrapeResultCB>> opLambda) {
        doUpdate(courtScrapeResult, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * CourtScrapeResult courtScrapeResult = <span style="color: #70226C">new</span> CourtScrapeResult();
     * courtScrapeResult.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * courtScrapeResult.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//courtScrapeResult.setVersionNo(value);</span>
     * <span style="color: #0000C0">courtScrapeResultBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(courtScrapeResult, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param courtScrapeResult The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(CourtScrapeResult courtScrapeResult, WritableOptionCall<CourtScrapeResultCB, UpdateOption<CourtScrapeResultCB>> opLambda) {
        doUpdateNonstrict(courtScrapeResult, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param courtScrapeResult The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(CourtScrapeResult courtScrapeResult, WritableOptionCall<CourtScrapeResultCB, InsertOption<CourtScrapeResultCB>> insertOpLambda, WritableOptionCall<CourtScrapeResultCB, UpdateOption<CourtScrapeResultCB>> updateOpLambda) {
        doInsertOrUpdate(courtScrapeResult, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param courtScrapeResult The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(CourtScrapeResult courtScrapeResult, WritableOptionCall<CourtScrapeResultCB, InsertOption<CourtScrapeResultCB>> insertOpLambda, WritableOptionCall<CourtScrapeResultCB, UpdateOption<CourtScrapeResultCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(courtScrapeResult, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param courtScrapeResult The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(CourtScrapeResult courtScrapeResult, WritableOptionCall<CourtScrapeResultCB, DeleteOption<CourtScrapeResultCB>> opLambda) {
        doDelete(courtScrapeResult, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param courtScrapeResult The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(CourtScrapeResult courtScrapeResult, WritableOptionCall<CourtScrapeResultCB, DeleteOption<CourtScrapeResultCB>> opLambda) {
        doDeleteNonstrict(courtScrapeResult, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param courtScrapeResultList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<CourtScrapeResult> courtScrapeResultList, WritableOptionCall<CourtScrapeResultCB, InsertOption<CourtScrapeResultCB>> opLambda) {
        return doBatchInsert(courtScrapeResultList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param courtScrapeResultList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<CourtScrapeResult> courtScrapeResultList, WritableOptionCall<CourtScrapeResultCB, UpdateOption<CourtScrapeResultCB>> opLambda) {
        return doBatchUpdate(courtScrapeResultList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param courtScrapeResultList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<CourtScrapeResult> courtScrapeResultList, WritableOptionCall<CourtScrapeResultCB, UpdateOption<CourtScrapeResultCB>> opLambda) {
        return doBatchUpdateNonstrict(courtScrapeResultList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param courtScrapeResultList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<CourtScrapeResult> courtScrapeResultList, WritableOptionCall<CourtScrapeResultCB, DeleteOption<CourtScrapeResultCB>> opLambda) {
        return doBatchDelete(courtScrapeResultList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param courtScrapeResultList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<CourtScrapeResult> courtScrapeResultList, WritableOptionCall<CourtScrapeResultCB, DeleteOption<CourtScrapeResultCB>> opLambda) {
        return doBatchDeleteNonstrict(courtScrapeResultList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<CourtScrapeResult, CourtScrapeResultCB> manyArgLambda, WritableOptionCall<CourtScrapeResultCB, InsertOption<CourtScrapeResultCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * CourtScrapeResult courtScrapeResult = <span style="color: #70226C">new</span> CourtScrapeResult();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//courtScrapeResult.setPK...(value);</span>
     * courtScrapeResult.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//courtScrapeResult.setVersionNo(value);</span>
     * <span style="color: #0000C0">courtScrapeResultBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(courtScrapeResult, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param courtScrapeResult The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of CourtScrapeResult. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(CourtScrapeResult courtScrapeResult, CBCall<CourtScrapeResultCB> cbLambda, WritableOptionCall<CourtScrapeResultCB, UpdateOption<CourtScrapeResultCB>> opLambda) {
        return doQueryUpdate(courtScrapeResult, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">courtScrapeResultBhv</span>.<span style="color: #CC4747">queryDelete</span>(courtScrapeResult, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of CourtScrapeResult. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<CourtScrapeResultCB> cbLambda, WritableOptionCall<CourtScrapeResultCB, DeleteOption<CourtScrapeResultCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * courtScrapeResultBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * courtScrapeResultBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * courtScrapeResultBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * courtScrapeResultBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * courtScrapeResultBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * courtScrapeResultBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * courtScrapeResultBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * courtScrapeResultBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * courtScrapeResultBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * courtScrapeResultBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * courtScrapeResultBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * courtScrapeResultBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * courtScrapeResultBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * courtScrapeResultBhv.outideSql().removeBlockComment().selectList()
     * courtScrapeResultBhv.outideSql().removeLineComment().selectList()
     * courtScrapeResultBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<CourtScrapeResultBhv> outsideSql() {
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
    protected Class<? extends CourtScrapeResult> typeOfSelectedEntity() { return CourtScrapeResult.class; }
    protected Class<CourtScrapeResult> typeOfHandlingEntity() { return CourtScrapeResult.class; }
    protected Class<CourtScrapeResultCB> typeOfHandlingConditionBean() { return CourtScrapeResultCB.class; }
}
