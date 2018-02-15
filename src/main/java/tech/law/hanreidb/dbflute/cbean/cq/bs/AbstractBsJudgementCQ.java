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

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import tech.law.hanreidb.dbflute.allcommon.*;
import tech.law.hanreidb.dbflute.cbean.*;
import tech.law.hanreidb.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of JUDGEMENT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsJudgementCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsJudgementCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "JUDGEMENT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判決ID)JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param judgementId The value of judgementId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementId_Equal(Long judgementId) {
        doSetJudgementId_Equal(judgementId);
    }

    protected void doSetJudgementId_Equal(Long judgementId) {
        regJudgementId(CK_EQ, judgementId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判決ID)JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param judgementId The value of judgementId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementId_NotEqual(Long judgementId) {
        doSetJudgementId_NotEqual(judgementId);
    }

    protected void doSetJudgementId_NotEqual(Long judgementId) {
        regJudgementId(CK_NES, judgementId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判決ID)JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param judgementId The value of judgementId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementId_GreaterThan(Long judgementId) {
        regJudgementId(CK_GT, judgementId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判決ID)JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param judgementId The value of judgementId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementId_LessThan(Long judgementId) {
        regJudgementId(CK_LT, judgementId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判決ID)JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param judgementId The value of judgementId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementId_GreaterEqual(Long judgementId) {
        regJudgementId(CK_GE, judgementId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判決ID)JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param judgementId The value of judgementId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementId_LessEqual(Long judgementId) {
        regJudgementId(CK_LE, judgementId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (判決ID)JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param minNumber The min number of judgementId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of judgementId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setJudgementId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setJudgementId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (判決ID)JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param minNumber The min number of judgementId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of judgementId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setJudgementId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueJudgementId(), "JUDGEMENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (判決ID)JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param judgementIdList The collection of judgementId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementId_InScope(Collection<Long> judgementIdList) {
        doSetJudgementId_InScope(judgementIdList);
    }

    protected void doSetJudgementId_InScope(Collection<Long> judgementIdList) {
        regINS(CK_INS, cTL(judgementIdList), xgetCValueJudgementId(), "JUDGEMENT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (判決ID)JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param judgementIdList The collection of judgementId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementId_NotInScope(Collection<Long> judgementIdList) {
        doSetJudgementId_NotInScope(judgementIdList);
    }

    protected void doSetJudgementId_NotInScope(Collection<Long> judgementIdList) {
        regINS(CK_NINS, cTL(judgementIdList), xgetCValueJudgementId(), "JUDGEMENT_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ORIGINAL_JUDGEMENT_ID from JUDGEMENT where ...)} <br>
     * (判決)JUDGEMENT by ORIGINAL_JUDGEMENT_ID, named 'judgementSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsJudgementSelf</span>(judgementCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     judgementCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of JudgementSelfList for 'exists'. (NotNull)
     */
    public void existsJudgementSelf(SubQuery<JudgementCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        JudgementCB cb = new JudgementCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepJudgementId_ExistsReferrer_JudgementSelfList(cb.query());
        registerExistsReferrer(cb.query(), "JUDGEMENT_ID", "ORIGINAL_JUDGEMENT_ID", pp, "judgementSelfList");
    }
    public abstract String keepJudgementId_ExistsReferrer_JudgementSelfList(JudgementCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select JUDGEMENT_ID from JUDGEMENT_SOURCE_REL where ...)} <br>
     * (判決取得元リレーション)JUDGEMENT_SOURCE_REL by JUDGEMENT_ID, named 'judgementSourceRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsJudgementSourceRel</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of JudgementSourceRelList for 'exists'. (NotNull)
     */
    public void existsJudgementSourceRel(SubQuery<JudgementSourceRelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        JudgementSourceRelCB cb = new JudgementSourceRelCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepJudgementId_ExistsReferrer_JudgementSourceRelList(cb.query());
        registerExistsReferrer(cb.query(), "JUDGEMENT_ID", "JUDGEMENT_ID", pp, "judgementSourceRelList");
    }
    public abstract String keepJudgementId_ExistsReferrer_JudgementSourceRelList(JudgementSourceRelCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select JUDGEMENT_ID from JUDGEMENT_USER_FAVORITE_REL where ...)} <br>
     * (判決ユーザーお気に入りリレーション)JUDGEMENT_USER_FAVORITE_REL by JUDGEMENT_ID, named 'judgementUserFavoriteRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsJudgementUserFavoriteRel</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of JudgementUserFavoriteRelList for 'exists'. (NotNull)
     */
    public void existsJudgementUserFavoriteRel(SubQuery<JudgementUserFavoriteRelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        JudgementUserFavoriteRelCB cb = new JudgementUserFavoriteRelCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepJudgementId_ExistsReferrer_JudgementUserFavoriteRelList(cb.query());
        registerExistsReferrer(cb.query(), "JUDGEMENT_ID", "JUDGEMENT_ID", pp, "judgementUserFavoriteRelList");
    }
    public abstract String keepJudgementId_ExistsReferrer_JudgementUserFavoriteRelList(JudgementUserFavoriteRelCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ORIGINAL_JUDGEMENT_ID from JUDGEMENT where ...)} <br>
     * (判決)JUDGEMENT by ORIGINAL_JUDGEMENT_ID, named 'judgementSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsJudgementSelf</span>(judgementCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     judgementCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of JudgementId_NotExistsReferrer_JudgementSelfList for 'not exists'. (NotNull)
     */
    public void notExistsJudgementSelf(SubQuery<JudgementCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        JudgementCB cb = new JudgementCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepJudgementId_NotExistsReferrer_JudgementSelfList(cb.query());
        registerNotExistsReferrer(cb.query(), "JUDGEMENT_ID", "ORIGINAL_JUDGEMENT_ID", pp, "judgementSelfList");
    }
    public abstract String keepJudgementId_NotExistsReferrer_JudgementSelfList(JudgementCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select JUDGEMENT_ID from JUDGEMENT_SOURCE_REL where ...)} <br>
     * (判決取得元リレーション)JUDGEMENT_SOURCE_REL by JUDGEMENT_ID, named 'judgementSourceRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsJudgementSourceRel</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of JudgementId_NotExistsReferrer_JudgementSourceRelList for 'not exists'. (NotNull)
     */
    public void notExistsJudgementSourceRel(SubQuery<JudgementSourceRelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        JudgementSourceRelCB cb = new JudgementSourceRelCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepJudgementId_NotExistsReferrer_JudgementSourceRelList(cb.query());
        registerNotExistsReferrer(cb.query(), "JUDGEMENT_ID", "JUDGEMENT_ID", pp, "judgementSourceRelList");
    }
    public abstract String keepJudgementId_NotExistsReferrer_JudgementSourceRelList(JudgementSourceRelCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select JUDGEMENT_ID from JUDGEMENT_USER_FAVORITE_REL where ...)} <br>
     * (判決ユーザーお気に入りリレーション)JUDGEMENT_USER_FAVORITE_REL by JUDGEMENT_ID, named 'judgementUserFavoriteRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsJudgementUserFavoriteRel</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of JudgementId_NotExistsReferrer_JudgementUserFavoriteRelList for 'not exists'. (NotNull)
     */
    public void notExistsJudgementUserFavoriteRel(SubQuery<JudgementUserFavoriteRelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        JudgementUserFavoriteRelCB cb = new JudgementUserFavoriteRelCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepJudgementId_NotExistsReferrer_JudgementUserFavoriteRelList(cb.query());
        registerNotExistsReferrer(cb.query(), "JUDGEMENT_ID", "JUDGEMENT_ID", pp, "judgementUserFavoriteRelList");
    }
    public abstract String keepJudgementId_NotExistsReferrer_JudgementUserFavoriteRelList(JudgementUserFavoriteRelCQ sq);

    public void xsderiveJudgementSelfList(String fn, SubQuery<JudgementCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementCB cb = new JudgementCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepJudgementId_SpecifyDerivedReferrer_JudgementSelfList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "JUDGEMENT_ID", "ORIGINAL_JUDGEMENT_ID", pp, "judgementSelfList", al, op);
    }
    public abstract String keepJudgementId_SpecifyDerivedReferrer_JudgementSelfList(JudgementCQ sq);

    public void xsderiveJudgementSourceRelList(String fn, SubQuery<JudgementSourceRelCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementSourceRelCB cb = new JudgementSourceRelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepJudgementId_SpecifyDerivedReferrer_JudgementSourceRelList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "JUDGEMENT_ID", "JUDGEMENT_ID", pp, "judgementSourceRelList", al, op);
    }
    public abstract String keepJudgementId_SpecifyDerivedReferrer_JudgementSourceRelList(JudgementSourceRelCQ sq);

    public void xsderiveJudgementUserFavoriteRelList(String fn, SubQuery<JudgementUserFavoriteRelCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementUserFavoriteRelCB cb = new JudgementUserFavoriteRelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepJudgementId_SpecifyDerivedReferrer_JudgementUserFavoriteRelList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "JUDGEMENT_ID", "JUDGEMENT_ID", pp, "judgementUserFavoriteRelList", al, op);
    }
    public abstract String keepJudgementId_SpecifyDerivedReferrer_JudgementUserFavoriteRelList(JudgementUserFavoriteRelCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from JUDGEMENT where ...)} <br>
     * (判決)JUDGEMENT by ORIGINAL_JUDGEMENT_ID, named 'judgementSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedJudgementSelf()</span>.<span style="color: #CC4747">max</span>(judgementCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     judgementCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     judgementCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<JudgementCB> derivedJudgementSelf() {
        return xcreateQDRFunctionJudgementSelfList();
    }
    protected HpQDRFunction<JudgementCB> xcreateQDRFunctionJudgementSelfList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveJudgementSelfList(fn, sq, rd, vl, op));
    }
    public void xqderiveJudgementSelfList(String fn, SubQuery<JudgementCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementCB cb = new JudgementCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepJudgementId_QueryDerivedReferrer_JudgementSelfList(cb.query()); String prpp = keepJudgementId_QueryDerivedReferrer_JudgementSelfListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "JUDGEMENT_ID", "ORIGINAL_JUDGEMENT_ID", sqpp, "judgementSelfList", rd, vl, prpp, op);
    }
    public abstract String keepJudgementId_QueryDerivedReferrer_JudgementSelfList(JudgementCQ sq);
    public abstract String keepJudgementId_QueryDerivedReferrer_JudgementSelfListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from JUDGEMENT_SOURCE_REL where ...)} <br>
     * (判決取得元リレーション)JUDGEMENT_SOURCE_REL by JUDGEMENT_ID, named 'judgementSourceRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedJudgementSourceRel()</span>.<span style="color: #CC4747">max</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     relCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<JudgementSourceRelCB> derivedJudgementSourceRel() {
        return xcreateQDRFunctionJudgementSourceRelList();
    }
    protected HpQDRFunction<JudgementSourceRelCB> xcreateQDRFunctionJudgementSourceRelList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveJudgementSourceRelList(fn, sq, rd, vl, op));
    }
    public void xqderiveJudgementSourceRelList(String fn, SubQuery<JudgementSourceRelCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementSourceRelCB cb = new JudgementSourceRelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepJudgementId_QueryDerivedReferrer_JudgementSourceRelList(cb.query()); String prpp = keepJudgementId_QueryDerivedReferrer_JudgementSourceRelListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "JUDGEMENT_ID", "JUDGEMENT_ID", sqpp, "judgementSourceRelList", rd, vl, prpp, op);
    }
    public abstract String keepJudgementId_QueryDerivedReferrer_JudgementSourceRelList(JudgementSourceRelCQ sq);
    public abstract String keepJudgementId_QueryDerivedReferrer_JudgementSourceRelListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from JUDGEMENT_USER_FAVORITE_REL where ...)} <br>
     * (判決ユーザーお気に入りリレーション)JUDGEMENT_USER_FAVORITE_REL by JUDGEMENT_ID, named 'judgementUserFavoriteRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedJudgementUserFavoriteRel()</span>.<span style="color: #CC4747">max</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     relCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<JudgementUserFavoriteRelCB> derivedJudgementUserFavoriteRel() {
        return xcreateQDRFunctionJudgementUserFavoriteRelList();
    }
    protected HpQDRFunction<JudgementUserFavoriteRelCB> xcreateQDRFunctionJudgementUserFavoriteRelList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveJudgementUserFavoriteRelList(fn, sq, rd, vl, op));
    }
    public void xqderiveJudgementUserFavoriteRelList(String fn, SubQuery<JudgementUserFavoriteRelCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementUserFavoriteRelCB cb = new JudgementUserFavoriteRelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepJudgementId_QueryDerivedReferrer_JudgementUserFavoriteRelList(cb.query()); String prpp = keepJudgementId_QueryDerivedReferrer_JudgementUserFavoriteRelListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "JUDGEMENT_ID", "JUDGEMENT_ID", sqpp, "judgementUserFavoriteRelList", rd, vl, prpp, op);
    }
    public abstract String keepJudgementId_QueryDerivedReferrer_JudgementUserFavoriteRelList(JudgementUserFavoriteRelCQ sq);
    public abstract String keepJudgementId_QueryDerivedReferrer_JudgementUserFavoriteRelListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (判決ID)JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     */
    public void setJudgementId_IsNull() { regJudgementId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (判決ID)JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     */
    public void setJudgementId_IsNotNull() { regJudgementId(CK_ISNN, DOBJ); }

    protected void regJudgementId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJudgementId(), "JUDGEMENT_ID"); }
    protected abstract ConditionValue xgetCValueJudgementId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (判決公開コード)JUDGEMENT_PUBLIC_CODE: {UQ, NotNull, VARCHAR(20)}
     * @param judgementPublicCode The value of judgementPublicCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementPublicCode_Equal(String judgementPublicCode) {
        doSetJudgementPublicCode_Equal(fRES(judgementPublicCode));
    }

    protected void doSetJudgementPublicCode_Equal(String judgementPublicCode) {
        regJudgementPublicCode(CK_EQ, judgementPublicCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (判決公開コード)JUDGEMENT_PUBLIC_CODE: {UQ, NotNull, VARCHAR(20)}
     * @param judgementPublicCode The value of judgementPublicCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementPublicCode_NotEqual(String judgementPublicCode) {
        doSetJudgementPublicCode_NotEqual(fRES(judgementPublicCode));
    }

    protected void doSetJudgementPublicCode_NotEqual(String judgementPublicCode) {
        regJudgementPublicCode(CK_NES, judgementPublicCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (判決公開コード)JUDGEMENT_PUBLIC_CODE: {UQ, NotNull, VARCHAR(20)}
     * @param judgementPublicCodeList The collection of judgementPublicCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementPublicCode_InScope(Collection<String> judgementPublicCodeList) {
        doSetJudgementPublicCode_InScope(judgementPublicCodeList);
    }

    protected void doSetJudgementPublicCode_InScope(Collection<String> judgementPublicCodeList) {
        regINS(CK_INS, cTL(judgementPublicCodeList), xgetCValueJudgementPublicCode(), "JUDGEMENT_PUBLIC_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (判決公開コード)JUDGEMENT_PUBLIC_CODE: {UQ, NotNull, VARCHAR(20)}
     * @param judgementPublicCodeList The collection of judgementPublicCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementPublicCode_NotInScope(Collection<String> judgementPublicCodeList) {
        doSetJudgementPublicCode_NotInScope(judgementPublicCodeList);
    }

    protected void doSetJudgementPublicCode_NotInScope(Collection<String> judgementPublicCodeList) {
        regINS(CK_NINS, cTL(judgementPublicCodeList), xgetCValueJudgementPublicCode(), "JUDGEMENT_PUBLIC_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判決公開コード)JUDGEMENT_PUBLIC_CODE: {UQ, NotNull, VARCHAR(20)} <br>
     * <pre>e.g. setJudgementPublicCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param judgementPublicCode The value of judgementPublicCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setJudgementPublicCode_LikeSearch(String judgementPublicCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setJudgementPublicCode_LikeSearch(judgementPublicCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判決公開コード)JUDGEMENT_PUBLIC_CODE: {UQ, NotNull, VARCHAR(20)} <br>
     * <pre>e.g. setJudgementPublicCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param judgementPublicCode The value of judgementPublicCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setJudgementPublicCode_LikeSearch(String judgementPublicCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(judgementPublicCode), xgetCValueJudgementPublicCode(), "JUDGEMENT_PUBLIC_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判決公開コード)JUDGEMENT_PUBLIC_CODE: {UQ, NotNull, VARCHAR(20)}
     * @param judgementPublicCode The value of judgementPublicCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setJudgementPublicCode_NotLikeSearch(String judgementPublicCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setJudgementPublicCode_NotLikeSearch(judgementPublicCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判決公開コード)JUDGEMENT_PUBLIC_CODE: {UQ, NotNull, VARCHAR(20)}
     * @param judgementPublicCode The value of judgementPublicCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setJudgementPublicCode_NotLikeSearch(String judgementPublicCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(judgementPublicCode), xgetCValueJudgementPublicCode(), "JUDGEMENT_PUBLIC_CODE", likeSearchOption);
    }

    protected void regJudgementPublicCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJudgementPublicCode(), "JUDGEMENT_PUBLIC_CODE"); }
    protected abstract ConditionValue xgetCValueJudgementPublicCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (事件名)CASE_NAME: {TEXT(65535)}
     * @param caseName The value of caseName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseName_Equal(String caseName) {
        doSetCaseName_Equal(fRES(caseName));
    }

    protected void doSetCaseName_Equal(String caseName) {
        regCaseName(CK_EQ, caseName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件名)CASE_NAME: {TEXT(65535)} <br>
     * <pre>e.g. setCaseName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param caseName The value of caseName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCaseName_LikeSearch(String caseName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCaseName_LikeSearch(caseName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件名)CASE_NAME: {TEXT(65535)} <br>
     * <pre>e.g. setCaseName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseName The value of caseName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCaseName_LikeSearch(String caseName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseName), xgetCValueCaseName(), "CASE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件名)CASE_NAME: {TEXT(65535)}
     * @param caseName The value of caseName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCaseName_NotLikeSearch(String caseName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCaseName_NotLikeSearch(caseName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件名)CASE_NAME: {TEXT(65535)}
     * @param caseName The value of caseName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCaseName_NotLikeSearch(String caseName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseName), xgetCValueCaseName(), "CASE_NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (事件名)CASE_NAME: {TEXT(65535)}
     */
    public void setCaseName_IsNull() { regCaseName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (事件名)CASE_NAME: {TEXT(65535)}
     */
    public void setCaseName_IsNullOrEmpty() { regCaseName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (事件名)CASE_NAME: {TEXT(65535)}
     */
    public void setCaseName_IsNotNull() { regCaseName(CK_ISNN, DOBJ); }

    protected void regCaseName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseName(), "CASE_NAME"); }
    protected abstract ConditionValue xgetCValueCaseName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集巻)PRECEDENT_REPORTS_KAN: {INT UNSIGNED(10)}
     * @param precedentReportsKan The value of precedentReportsKan as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrecedentReportsKan_Equal(Integer precedentReportsKan) {
        doSetPrecedentReportsKan_Equal(precedentReportsKan);
    }

    protected void doSetPrecedentReportsKan_Equal(Integer precedentReportsKan) {
        regPrecedentReportsKan(CK_EQ, precedentReportsKan);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集巻)PRECEDENT_REPORTS_KAN: {INT UNSIGNED(10)}
     * @param precedentReportsKan The value of precedentReportsKan as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrecedentReportsKan_NotEqual(Integer precedentReportsKan) {
        doSetPrecedentReportsKan_NotEqual(precedentReportsKan);
    }

    protected void doSetPrecedentReportsKan_NotEqual(Integer precedentReportsKan) {
        regPrecedentReportsKan(CK_NES, precedentReportsKan);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集巻)PRECEDENT_REPORTS_KAN: {INT UNSIGNED(10)}
     * @param precedentReportsKan The value of precedentReportsKan as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrecedentReportsKan_GreaterThan(Integer precedentReportsKan) {
        regPrecedentReportsKan(CK_GT, precedentReportsKan);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集巻)PRECEDENT_REPORTS_KAN: {INT UNSIGNED(10)}
     * @param precedentReportsKan The value of precedentReportsKan as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrecedentReportsKan_LessThan(Integer precedentReportsKan) {
        regPrecedentReportsKan(CK_LT, precedentReportsKan);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集巻)PRECEDENT_REPORTS_KAN: {INT UNSIGNED(10)}
     * @param precedentReportsKan The value of precedentReportsKan as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrecedentReportsKan_GreaterEqual(Integer precedentReportsKan) {
        regPrecedentReportsKan(CK_GE, precedentReportsKan);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集巻)PRECEDENT_REPORTS_KAN: {INT UNSIGNED(10)}
     * @param precedentReportsKan The value of precedentReportsKan as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrecedentReportsKan_LessEqual(Integer precedentReportsKan) {
        regPrecedentReportsKan(CK_LE, precedentReportsKan);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集巻)PRECEDENT_REPORTS_KAN: {INT UNSIGNED(10)}
     * @param minNumber The min number of precedentReportsKan. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of precedentReportsKan. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPrecedentReportsKan_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPrecedentReportsKan_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集巻)PRECEDENT_REPORTS_KAN: {INT UNSIGNED(10)}
     * @param minNumber The min number of precedentReportsKan. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of precedentReportsKan. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPrecedentReportsKan_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrecedentReportsKan(), "PRECEDENT_REPORTS_KAN", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (判例集巻)PRECEDENT_REPORTS_KAN: {INT UNSIGNED(10)}
     * @param precedentReportsKanList The collection of precedentReportsKan as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPrecedentReportsKan_InScope(Collection<Integer> precedentReportsKanList) {
        doSetPrecedentReportsKan_InScope(precedentReportsKanList);
    }

    protected void doSetPrecedentReportsKan_InScope(Collection<Integer> precedentReportsKanList) {
        regINS(CK_INS, cTL(precedentReportsKanList), xgetCValuePrecedentReportsKan(), "PRECEDENT_REPORTS_KAN");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (判例集巻)PRECEDENT_REPORTS_KAN: {INT UNSIGNED(10)}
     * @param precedentReportsKanList The collection of precedentReportsKan as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPrecedentReportsKan_NotInScope(Collection<Integer> precedentReportsKanList) {
        doSetPrecedentReportsKan_NotInScope(precedentReportsKanList);
    }

    protected void doSetPrecedentReportsKan_NotInScope(Collection<Integer> precedentReportsKanList) {
        regINS(CK_NINS, cTL(precedentReportsKanList), xgetCValuePrecedentReportsKan(), "PRECEDENT_REPORTS_KAN");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (判例集巻)PRECEDENT_REPORTS_KAN: {INT UNSIGNED(10)}
     */
    public void setPrecedentReportsKan_IsNull() { regPrecedentReportsKan(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (判例集巻)PRECEDENT_REPORTS_KAN: {INT UNSIGNED(10)}
     */
    public void setPrecedentReportsKan_IsNotNull() { regPrecedentReportsKan(CK_ISNN, DOBJ); }

    protected void regPrecedentReportsKan(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrecedentReportsKan(), "PRECEDENT_REPORTS_KAN"); }
    protected abstract ConditionValue xgetCValuePrecedentReportsKan();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集号)PRECEDENT_REPORTS_GO: {INT UNSIGNED(10)}
     * @param precedentReportsGo The value of precedentReportsGo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrecedentReportsGo_Equal(Integer precedentReportsGo) {
        doSetPrecedentReportsGo_Equal(precedentReportsGo);
    }

    protected void doSetPrecedentReportsGo_Equal(Integer precedentReportsGo) {
        regPrecedentReportsGo(CK_EQ, precedentReportsGo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集号)PRECEDENT_REPORTS_GO: {INT UNSIGNED(10)}
     * @param precedentReportsGo The value of precedentReportsGo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrecedentReportsGo_NotEqual(Integer precedentReportsGo) {
        doSetPrecedentReportsGo_NotEqual(precedentReportsGo);
    }

    protected void doSetPrecedentReportsGo_NotEqual(Integer precedentReportsGo) {
        regPrecedentReportsGo(CK_NES, precedentReportsGo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集号)PRECEDENT_REPORTS_GO: {INT UNSIGNED(10)}
     * @param precedentReportsGo The value of precedentReportsGo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrecedentReportsGo_GreaterThan(Integer precedentReportsGo) {
        regPrecedentReportsGo(CK_GT, precedentReportsGo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集号)PRECEDENT_REPORTS_GO: {INT UNSIGNED(10)}
     * @param precedentReportsGo The value of precedentReportsGo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrecedentReportsGo_LessThan(Integer precedentReportsGo) {
        regPrecedentReportsGo(CK_LT, precedentReportsGo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集号)PRECEDENT_REPORTS_GO: {INT UNSIGNED(10)}
     * @param precedentReportsGo The value of precedentReportsGo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrecedentReportsGo_GreaterEqual(Integer precedentReportsGo) {
        regPrecedentReportsGo(CK_GE, precedentReportsGo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集号)PRECEDENT_REPORTS_GO: {INT UNSIGNED(10)}
     * @param precedentReportsGo The value of precedentReportsGo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrecedentReportsGo_LessEqual(Integer precedentReportsGo) {
        regPrecedentReportsGo(CK_LE, precedentReportsGo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集号)PRECEDENT_REPORTS_GO: {INT UNSIGNED(10)}
     * @param minNumber The min number of precedentReportsGo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of precedentReportsGo. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPrecedentReportsGo_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPrecedentReportsGo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集号)PRECEDENT_REPORTS_GO: {INT UNSIGNED(10)}
     * @param minNumber The min number of precedentReportsGo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of precedentReportsGo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPrecedentReportsGo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrecedentReportsGo(), "PRECEDENT_REPORTS_GO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (判例集号)PRECEDENT_REPORTS_GO: {INT UNSIGNED(10)}
     * @param precedentReportsGoList The collection of precedentReportsGo as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPrecedentReportsGo_InScope(Collection<Integer> precedentReportsGoList) {
        doSetPrecedentReportsGo_InScope(precedentReportsGoList);
    }

    protected void doSetPrecedentReportsGo_InScope(Collection<Integer> precedentReportsGoList) {
        regINS(CK_INS, cTL(precedentReportsGoList), xgetCValuePrecedentReportsGo(), "PRECEDENT_REPORTS_GO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (判例集号)PRECEDENT_REPORTS_GO: {INT UNSIGNED(10)}
     * @param precedentReportsGoList The collection of precedentReportsGo as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPrecedentReportsGo_NotInScope(Collection<Integer> precedentReportsGoList) {
        doSetPrecedentReportsGo_NotInScope(precedentReportsGoList);
    }

    protected void doSetPrecedentReportsGo_NotInScope(Collection<Integer> precedentReportsGoList) {
        regINS(CK_NINS, cTL(precedentReportsGoList), xgetCValuePrecedentReportsGo(), "PRECEDENT_REPORTS_GO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (判例集号)PRECEDENT_REPORTS_GO: {INT UNSIGNED(10)}
     */
    public void setPrecedentReportsGo_IsNull() { regPrecedentReportsGo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (判例集号)PRECEDENT_REPORTS_GO: {INT UNSIGNED(10)}
     */
    public void setPrecedentReportsGo_IsNotNull() { regPrecedentReportsGo(CK_ISNN, DOBJ); }

    protected void regPrecedentReportsGo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrecedentReportsGo(), "PRECEDENT_REPORTS_GO"); }
    protected abstract ConditionValue xgetCValuePrecedentReportsGo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集頁)PRECEDENT_REPORTS_KO: {INT UNSIGNED(10)}
     * @param precedentReportsKo The value of precedentReportsKo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrecedentReportsKo_Equal(Integer precedentReportsKo) {
        doSetPrecedentReportsKo_Equal(precedentReportsKo);
    }

    protected void doSetPrecedentReportsKo_Equal(Integer precedentReportsKo) {
        regPrecedentReportsKo(CK_EQ, precedentReportsKo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集頁)PRECEDENT_REPORTS_KO: {INT UNSIGNED(10)}
     * @param precedentReportsKo The value of precedentReportsKo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrecedentReportsKo_NotEqual(Integer precedentReportsKo) {
        doSetPrecedentReportsKo_NotEqual(precedentReportsKo);
    }

    protected void doSetPrecedentReportsKo_NotEqual(Integer precedentReportsKo) {
        regPrecedentReportsKo(CK_NES, precedentReportsKo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集頁)PRECEDENT_REPORTS_KO: {INT UNSIGNED(10)}
     * @param precedentReportsKo The value of precedentReportsKo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrecedentReportsKo_GreaterThan(Integer precedentReportsKo) {
        regPrecedentReportsKo(CK_GT, precedentReportsKo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集頁)PRECEDENT_REPORTS_KO: {INT UNSIGNED(10)}
     * @param precedentReportsKo The value of precedentReportsKo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrecedentReportsKo_LessThan(Integer precedentReportsKo) {
        regPrecedentReportsKo(CK_LT, precedentReportsKo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集頁)PRECEDENT_REPORTS_KO: {INT UNSIGNED(10)}
     * @param precedentReportsKo The value of precedentReportsKo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrecedentReportsKo_GreaterEqual(Integer precedentReportsKo) {
        regPrecedentReportsKo(CK_GE, precedentReportsKo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集頁)PRECEDENT_REPORTS_KO: {INT UNSIGNED(10)}
     * @param precedentReportsKo The value of precedentReportsKo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrecedentReportsKo_LessEqual(Integer precedentReportsKo) {
        regPrecedentReportsKo(CK_LE, precedentReportsKo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集頁)PRECEDENT_REPORTS_KO: {INT UNSIGNED(10)}
     * @param minNumber The min number of precedentReportsKo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of precedentReportsKo. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPrecedentReportsKo_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPrecedentReportsKo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集頁)PRECEDENT_REPORTS_KO: {INT UNSIGNED(10)}
     * @param minNumber The min number of precedentReportsKo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of precedentReportsKo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPrecedentReportsKo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrecedentReportsKo(), "PRECEDENT_REPORTS_KO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (判例集頁)PRECEDENT_REPORTS_KO: {INT UNSIGNED(10)}
     * @param precedentReportsKoList The collection of precedentReportsKo as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPrecedentReportsKo_InScope(Collection<Integer> precedentReportsKoList) {
        doSetPrecedentReportsKo_InScope(precedentReportsKoList);
    }

    protected void doSetPrecedentReportsKo_InScope(Collection<Integer> precedentReportsKoList) {
        regINS(CK_INS, cTL(precedentReportsKoList), xgetCValuePrecedentReportsKo(), "PRECEDENT_REPORTS_KO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (判例集頁)PRECEDENT_REPORTS_KO: {INT UNSIGNED(10)}
     * @param precedentReportsKoList The collection of precedentReportsKo as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPrecedentReportsKo_NotInScope(Collection<Integer> precedentReportsKoList) {
        doSetPrecedentReportsKo_NotInScope(precedentReportsKoList);
    }

    protected void doSetPrecedentReportsKo_NotInScope(Collection<Integer> precedentReportsKoList) {
        regINS(CK_NINS, cTL(precedentReportsKoList), xgetCValuePrecedentReportsKo(), "PRECEDENT_REPORTS_KO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (判例集頁)PRECEDENT_REPORTS_KO: {INT UNSIGNED(10)}
     */
    public void setPrecedentReportsKo_IsNull() { regPrecedentReportsKo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (判例集頁)PRECEDENT_REPORTS_KO: {INT UNSIGNED(10)}
     */
    public void setPrecedentReportsKo_IsNotNull() { regPrecedentReportsKo(CK_ISNN, DOBJ); }

    protected void regPrecedentReportsKo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrecedentReportsKo(), "PRECEDENT_REPORTS_KO"); }
    protected abstract ConditionValue xgetCValuePrecedentReportsKo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判集号)JUDGEMENT_REPORTS_GO: {INT UNSIGNED(10)}
     * @param judgementReportsGo The value of judgementReportsGo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementReportsGo_Equal(Integer judgementReportsGo) {
        doSetJudgementReportsGo_Equal(judgementReportsGo);
    }

    protected void doSetJudgementReportsGo_Equal(Integer judgementReportsGo) {
        regJudgementReportsGo(CK_EQ, judgementReportsGo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判集号)JUDGEMENT_REPORTS_GO: {INT UNSIGNED(10)}
     * @param judgementReportsGo The value of judgementReportsGo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementReportsGo_NotEqual(Integer judgementReportsGo) {
        doSetJudgementReportsGo_NotEqual(judgementReportsGo);
    }

    protected void doSetJudgementReportsGo_NotEqual(Integer judgementReportsGo) {
        regJudgementReportsGo(CK_NES, judgementReportsGo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判集号)JUDGEMENT_REPORTS_GO: {INT UNSIGNED(10)}
     * @param judgementReportsGo The value of judgementReportsGo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementReportsGo_GreaterThan(Integer judgementReportsGo) {
        regJudgementReportsGo(CK_GT, judgementReportsGo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判集号)JUDGEMENT_REPORTS_GO: {INT UNSIGNED(10)}
     * @param judgementReportsGo The value of judgementReportsGo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementReportsGo_LessThan(Integer judgementReportsGo) {
        regJudgementReportsGo(CK_LT, judgementReportsGo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判集号)JUDGEMENT_REPORTS_GO: {INT UNSIGNED(10)}
     * @param judgementReportsGo The value of judgementReportsGo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementReportsGo_GreaterEqual(Integer judgementReportsGo) {
        regJudgementReportsGo(CK_GE, judgementReportsGo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判集号)JUDGEMENT_REPORTS_GO: {INT UNSIGNED(10)}
     * @param judgementReportsGo The value of judgementReportsGo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementReportsGo_LessEqual(Integer judgementReportsGo) {
        regJudgementReportsGo(CK_LE, judgementReportsGo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判集号)JUDGEMENT_REPORTS_GO: {INT UNSIGNED(10)}
     * @param minNumber The min number of judgementReportsGo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of judgementReportsGo. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setJudgementReportsGo_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setJudgementReportsGo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判集号)JUDGEMENT_REPORTS_GO: {INT UNSIGNED(10)}
     * @param minNumber The min number of judgementReportsGo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of judgementReportsGo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setJudgementReportsGo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueJudgementReportsGo(), "JUDGEMENT_REPORTS_GO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (裁判集号)JUDGEMENT_REPORTS_GO: {INT UNSIGNED(10)}
     * @param judgementReportsGoList The collection of judgementReportsGo as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementReportsGo_InScope(Collection<Integer> judgementReportsGoList) {
        doSetJudgementReportsGo_InScope(judgementReportsGoList);
    }

    protected void doSetJudgementReportsGo_InScope(Collection<Integer> judgementReportsGoList) {
        regINS(CK_INS, cTL(judgementReportsGoList), xgetCValueJudgementReportsGo(), "JUDGEMENT_REPORTS_GO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (裁判集号)JUDGEMENT_REPORTS_GO: {INT UNSIGNED(10)}
     * @param judgementReportsGoList The collection of judgementReportsGo as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementReportsGo_NotInScope(Collection<Integer> judgementReportsGoList) {
        doSetJudgementReportsGo_NotInScope(judgementReportsGoList);
    }

    protected void doSetJudgementReportsGo_NotInScope(Collection<Integer> judgementReportsGoList) {
        regINS(CK_NINS, cTL(judgementReportsGoList), xgetCValueJudgementReportsGo(), "JUDGEMENT_REPORTS_GO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (裁判集号)JUDGEMENT_REPORTS_GO: {INT UNSIGNED(10)}
     */
    public void setJudgementReportsGo_IsNull() { regJudgementReportsGo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (裁判集号)JUDGEMENT_REPORTS_GO: {INT UNSIGNED(10)}
     */
    public void setJudgementReportsGo_IsNotNull() { regJudgementReportsGo(CK_ISNN, DOBJ); }

    protected void regJudgementReportsGo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJudgementReportsGo(), "JUDGEMENT_REPORTS_GO"); }
    protected abstract ConditionValue xgetCValueJudgementReportsGo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判集頁)JUDGEMENT_REPORTS_KO: {INT UNSIGNED(10)}
     * @param judgementReportsKo The value of judgementReportsKo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementReportsKo_Equal(Integer judgementReportsKo) {
        doSetJudgementReportsKo_Equal(judgementReportsKo);
    }

    protected void doSetJudgementReportsKo_Equal(Integer judgementReportsKo) {
        regJudgementReportsKo(CK_EQ, judgementReportsKo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判集頁)JUDGEMENT_REPORTS_KO: {INT UNSIGNED(10)}
     * @param judgementReportsKo The value of judgementReportsKo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementReportsKo_NotEqual(Integer judgementReportsKo) {
        doSetJudgementReportsKo_NotEqual(judgementReportsKo);
    }

    protected void doSetJudgementReportsKo_NotEqual(Integer judgementReportsKo) {
        regJudgementReportsKo(CK_NES, judgementReportsKo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判集頁)JUDGEMENT_REPORTS_KO: {INT UNSIGNED(10)}
     * @param judgementReportsKo The value of judgementReportsKo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementReportsKo_GreaterThan(Integer judgementReportsKo) {
        regJudgementReportsKo(CK_GT, judgementReportsKo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判集頁)JUDGEMENT_REPORTS_KO: {INT UNSIGNED(10)}
     * @param judgementReportsKo The value of judgementReportsKo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementReportsKo_LessThan(Integer judgementReportsKo) {
        regJudgementReportsKo(CK_LT, judgementReportsKo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判集頁)JUDGEMENT_REPORTS_KO: {INT UNSIGNED(10)}
     * @param judgementReportsKo The value of judgementReportsKo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementReportsKo_GreaterEqual(Integer judgementReportsKo) {
        regJudgementReportsKo(CK_GE, judgementReportsKo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判集頁)JUDGEMENT_REPORTS_KO: {INT UNSIGNED(10)}
     * @param judgementReportsKo The value of judgementReportsKo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementReportsKo_LessEqual(Integer judgementReportsKo) {
        regJudgementReportsKo(CK_LE, judgementReportsKo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判集頁)JUDGEMENT_REPORTS_KO: {INT UNSIGNED(10)}
     * @param minNumber The min number of judgementReportsKo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of judgementReportsKo. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setJudgementReportsKo_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setJudgementReportsKo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判集頁)JUDGEMENT_REPORTS_KO: {INT UNSIGNED(10)}
     * @param minNumber The min number of judgementReportsKo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of judgementReportsKo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setJudgementReportsKo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueJudgementReportsKo(), "JUDGEMENT_REPORTS_KO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (裁判集頁)JUDGEMENT_REPORTS_KO: {INT UNSIGNED(10)}
     * @param judgementReportsKoList The collection of judgementReportsKo as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementReportsKo_InScope(Collection<Integer> judgementReportsKoList) {
        doSetJudgementReportsKo_InScope(judgementReportsKoList);
    }

    protected void doSetJudgementReportsKo_InScope(Collection<Integer> judgementReportsKoList) {
        regINS(CK_INS, cTL(judgementReportsKoList), xgetCValueJudgementReportsKo(), "JUDGEMENT_REPORTS_KO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (裁判集頁)JUDGEMENT_REPORTS_KO: {INT UNSIGNED(10)}
     * @param judgementReportsKoList The collection of judgementReportsKo as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementReportsKo_NotInScope(Collection<Integer> judgementReportsKoList) {
        doSetJudgementReportsKo_NotInScope(judgementReportsKoList);
    }

    protected void doSetJudgementReportsKo_NotInScope(Collection<Integer> judgementReportsKoList) {
        regINS(CK_NINS, cTL(judgementReportsKoList), xgetCValueJudgementReportsKo(), "JUDGEMENT_REPORTS_KO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (裁判集頁)JUDGEMENT_REPORTS_KO: {INT UNSIGNED(10)}
     */
    public void setJudgementReportsKo_IsNull() { regJudgementReportsKo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (裁判集頁)JUDGEMENT_REPORTS_KO: {INT UNSIGNED(10)}
     */
    public void setJudgementReportsKo_IsNotNull() { regJudgementReportsKo(CK_ISNN, DOBJ); }

    protected void regJudgementReportsKo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJudgementReportsKo(), "JUDGEMENT_REPORTS_KO"); }
    protected abstract ConditionValue xgetCValueJudgementReportsKo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判年月日)JUDGEMENT_DATE: {DATE(10)}
     * @param judgementDate The value of judgementDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementDate_Equal(java.time.LocalDate judgementDate) {
        regJudgementDate(CK_EQ,  judgementDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判年月日)JUDGEMENT_DATE: {DATE(10)}
     * @param judgementDate The value of judgementDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementDate_GreaterThan(java.time.LocalDate judgementDate) {
        regJudgementDate(CK_GT,  judgementDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判年月日)JUDGEMENT_DATE: {DATE(10)}
     * @param judgementDate The value of judgementDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementDate_LessThan(java.time.LocalDate judgementDate) {
        regJudgementDate(CK_LT,  judgementDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判年月日)JUDGEMENT_DATE: {DATE(10)}
     * @param judgementDate The value of judgementDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementDate_GreaterEqual(java.time.LocalDate judgementDate) {
        regJudgementDate(CK_GE,  judgementDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判年月日)JUDGEMENT_DATE: {DATE(10)}
     * @param judgementDate The value of judgementDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementDate_LessEqual(java.time.LocalDate judgementDate) {
        regJudgementDate(CK_LE, judgementDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判年月日)JUDGEMENT_DATE: {DATE(10)}
     * <pre>e.g. setJudgementDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of judgementDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of judgementDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setJudgementDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setJudgementDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判年月日)JUDGEMENT_DATE: {DATE(10)}
     * <pre>e.g. setJudgementDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of judgementDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of judgementDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setJudgementDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "JUDGEMENT_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueJudgementDate(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (裁判年月日)JUDGEMENT_DATE: {DATE(10)}
     */
    public void setJudgementDate_IsNull() { regJudgementDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (裁判年月日)JUDGEMENT_DATE: {DATE(10)}
     */
    public void setJudgementDate_IsNotNull() { regJudgementDate(CK_ISNN, DOBJ); }

    protected void regJudgementDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJudgementDate(), "JUDGEMENT_DATE"); }
    protected abstract ConditionValue xgetCValueJudgementDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (原審判決ID)ORIGINAL_JUDGEMENT_ID: {IX, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     * @param originalJudgementId The value of originalJudgementId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOriginalJudgementId_Equal(Long originalJudgementId) {
        doSetOriginalJudgementId_Equal(originalJudgementId);
    }

    protected void doSetOriginalJudgementId_Equal(Long originalJudgementId) {
        regOriginalJudgementId(CK_EQ, originalJudgementId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (原審判決ID)ORIGINAL_JUDGEMENT_ID: {IX, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     * @param originalJudgementId The value of originalJudgementId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOriginalJudgementId_NotEqual(Long originalJudgementId) {
        doSetOriginalJudgementId_NotEqual(originalJudgementId);
    }

    protected void doSetOriginalJudgementId_NotEqual(Long originalJudgementId) {
        regOriginalJudgementId(CK_NES, originalJudgementId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (原審判決ID)ORIGINAL_JUDGEMENT_ID: {IX, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     * @param originalJudgementId The value of originalJudgementId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOriginalJudgementId_GreaterThan(Long originalJudgementId) {
        regOriginalJudgementId(CK_GT, originalJudgementId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (原審判決ID)ORIGINAL_JUDGEMENT_ID: {IX, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     * @param originalJudgementId The value of originalJudgementId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOriginalJudgementId_LessThan(Long originalJudgementId) {
        regOriginalJudgementId(CK_LT, originalJudgementId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (原審判決ID)ORIGINAL_JUDGEMENT_ID: {IX, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     * @param originalJudgementId The value of originalJudgementId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOriginalJudgementId_GreaterEqual(Long originalJudgementId) {
        regOriginalJudgementId(CK_GE, originalJudgementId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (原審判決ID)ORIGINAL_JUDGEMENT_ID: {IX, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     * @param originalJudgementId The value of originalJudgementId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOriginalJudgementId_LessEqual(Long originalJudgementId) {
        regOriginalJudgementId(CK_LE, originalJudgementId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (原審判決ID)ORIGINAL_JUDGEMENT_ID: {IX, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     * @param minNumber The min number of originalJudgementId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of originalJudgementId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setOriginalJudgementId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setOriginalJudgementId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (原審判決ID)ORIGINAL_JUDGEMENT_ID: {IX, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     * @param minNumber The min number of originalJudgementId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of originalJudgementId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setOriginalJudgementId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOriginalJudgementId(), "ORIGINAL_JUDGEMENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (原審判決ID)ORIGINAL_JUDGEMENT_ID: {IX, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     * @param originalJudgementIdList The collection of originalJudgementId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOriginalJudgementId_InScope(Collection<Long> originalJudgementIdList) {
        doSetOriginalJudgementId_InScope(originalJudgementIdList);
    }

    protected void doSetOriginalJudgementId_InScope(Collection<Long> originalJudgementIdList) {
        regINS(CK_INS, cTL(originalJudgementIdList), xgetCValueOriginalJudgementId(), "ORIGINAL_JUDGEMENT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (原審判決ID)ORIGINAL_JUDGEMENT_ID: {IX, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     * @param originalJudgementIdList The collection of originalJudgementId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOriginalJudgementId_NotInScope(Collection<Long> originalJudgementIdList) {
        doSetOriginalJudgementId_NotInScope(originalJudgementIdList);
    }

    protected void doSetOriginalJudgementId_NotInScope(Collection<Long> originalJudgementIdList) {
        regINS(CK_NINS, cTL(originalJudgementIdList), xgetCValueOriginalJudgementId(), "ORIGINAL_JUDGEMENT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (原審判決ID)ORIGINAL_JUDGEMENT_ID: {IX, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     */
    public void setOriginalJudgementId_IsNull() { regOriginalJudgementId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (原審判決ID)ORIGINAL_JUDGEMENT_ID: {IX, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     */
    public void setOriginalJudgementId_IsNotNull() { regOriginalJudgementId(CK_ISNN, DOBJ); }

    protected void regOriginalJudgementId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOriginalJudgementId(), "ORIGINAL_JUDGEMENT_ID"); }
    protected abstract ConditionValue xgetCValueOriginalJudgementId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (元号コード)CASE_NUMBER_ERA_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_ERA, classification=Era}
     * @param caseNumberEraCode The value of caseNumberEraCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseNumberEraCode_Equal(String caseNumberEraCode) {
        doSetCaseNumberEraCode_Equal(fRES(caseNumberEraCode));
    }

    /**
     * Equal(=). As Era. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (元号コード)CASE_NUMBER_ERA_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_ERA, classification=Era} <br>
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseNumberEraCode_Equal_AsEra(CDef.Era cdef) {
        doSetCaseNumberEraCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As 明治 (MEIJI). And OnlyOnceRegistered. <br>
     * 明治: 明治時代
     */
    public void setCaseNumberEraCode_Equal_明治() {
        setCaseNumberEraCode_Equal_AsEra(CDef.Era.明治);
    }

    /**
     * Equal(=). As 大正 (TAISHO). And OnlyOnceRegistered. <br>
     * 大正: 大正時代
     */
    public void setCaseNumberEraCode_Equal_大正() {
        setCaseNumberEraCode_Equal_AsEra(CDef.Era.大正);
    }

    /**
     * Equal(=). As 昭和 (SHOWA). And OnlyOnceRegistered. <br>
     * 昭和: 昭和時代
     */
    public void setCaseNumberEraCode_Equal_昭和() {
        setCaseNumberEraCode_Equal_AsEra(CDef.Era.昭和);
    }

    /**
     * Equal(=). As 平成 (HEISEI). And OnlyOnceRegistered. <br>
     * 平成: 平成時代
     */
    public void setCaseNumberEraCode_Equal_平成() {
        setCaseNumberEraCode_Equal_AsEra(CDef.Era.平成);
    }

    protected void doSetCaseNumberEraCode_Equal(String caseNumberEraCode) {
        regCaseNumberEraCode(CK_EQ, caseNumberEraCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (元号コード)CASE_NUMBER_ERA_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_ERA, classification=Era}
     * @param caseNumberEraCode The value of caseNumberEraCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseNumberEraCode_NotEqual(String caseNumberEraCode) {
        doSetCaseNumberEraCode_NotEqual(fRES(caseNumberEraCode));
    }

    /**
     * NotEqual(&lt;&gt;). As Era. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (元号コード)CASE_NUMBER_ERA_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_ERA, classification=Era} <br>
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseNumberEraCode_NotEqual_AsEra(CDef.Era cdef) {
        doSetCaseNumberEraCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As 明治 (MEIJI). And OnlyOnceRegistered. <br>
     * 明治: 明治時代
     */
    public void setCaseNumberEraCode_NotEqual_明治() {
        setCaseNumberEraCode_NotEqual_AsEra(CDef.Era.明治);
    }

    /**
     * NotEqual(&lt;&gt;). As 大正 (TAISHO). And OnlyOnceRegistered. <br>
     * 大正: 大正時代
     */
    public void setCaseNumberEraCode_NotEqual_大正() {
        setCaseNumberEraCode_NotEqual_AsEra(CDef.Era.大正);
    }

    /**
     * NotEqual(&lt;&gt;). As 昭和 (SHOWA). And OnlyOnceRegistered. <br>
     * 昭和: 昭和時代
     */
    public void setCaseNumberEraCode_NotEqual_昭和() {
        setCaseNumberEraCode_NotEqual_AsEra(CDef.Era.昭和);
    }

    /**
     * NotEqual(&lt;&gt;). As 平成 (HEISEI). And OnlyOnceRegistered. <br>
     * 平成: 平成時代
     */
    public void setCaseNumberEraCode_NotEqual_平成() {
        setCaseNumberEraCode_NotEqual_AsEra(CDef.Era.平成);
    }

    protected void doSetCaseNumberEraCode_NotEqual(String caseNumberEraCode) {
        regCaseNumberEraCode(CK_NES, caseNumberEraCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (元号コード)CASE_NUMBER_ERA_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_ERA, classification=Era}
     * @param caseNumberEraCodeList The collection of caseNumberEraCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseNumberEraCode_InScope(Collection<String> caseNumberEraCodeList) {
        doSetCaseNumberEraCode_InScope(caseNumberEraCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As Era. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (元号コード)CASE_NUMBER_ERA_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_ERA, classification=Era} <br>
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseNumberEraCode_InScope_AsEra(Collection<CDef.Era> cdefList) {
        doSetCaseNumberEraCode_InScope(cTStrL(cdefList));
    }

    protected void doSetCaseNumberEraCode_InScope(Collection<String> caseNumberEraCodeList) {
        regINS(CK_INS, cTL(caseNumberEraCodeList), xgetCValueCaseNumberEraCode(), "CASE_NUMBER_ERA_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (元号コード)CASE_NUMBER_ERA_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_ERA, classification=Era}
     * @param caseNumberEraCodeList The collection of caseNumberEraCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseNumberEraCode_NotInScope(Collection<String> caseNumberEraCodeList) {
        doSetCaseNumberEraCode_NotInScope(caseNumberEraCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As Era. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (元号コード)CASE_NUMBER_ERA_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_ERA, classification=Era} <br>
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseNumberEraCode_NotInScope_AsEra(Collection<CDef.Era> cdefList) {
        doSetCaseNumberEraCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetCaseNumberEraCode_NotInScope(Collection<String> caseNumberEraCodeList) {
        regINS(CK_NINS, cTL(caseNumberEraCodeList), xgetCValueCaseNumberEraCode(), "CASE_NUMBER_ERA_CODE");
    }

    protected void regCaseNumberEraCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseNumberEraCode(), "CASE_NUMBER_ERA_CODE"); }
    protected abstract ConditionValue xgetCValueCaseNumberEraCode();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (事件番号年)CASE_NUMBER_YEAR: {NotNull, INT UNSIGNED(10)}
     * @param caseNumberYear The value of caseNumberYear as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseNumberYear_Equal(Integer caseNumberYear) {
        doSetCaseNumberYear_Equal(caseNumberYear);
    }

    protected void doSetCaseNumberYear_Equal(Integer caseNumberYear) {
        regCaseNumberYear(CK_EQ, caseNumberYear);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (事件番号年)CASE_NUMBER_YEAR: {NotNull, INT UNSIGNED(10)}
     * @param caseNumberYear The value of caseNumberYear as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseNumberYear_NotEqual(Integer caseNumberYear) {
        doSetCaseNumberYear_NotEqual(caseNumberYear);
    }

    protected void doSetCaseNumberYear_NotEqual(Integer caseNumberYear) {
        regCaseNumberYear(CK_NES, caseNumberYear);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (事件番号年)CASE_NUMBER_YEAR: {NotNull, INT UNSIGNED(10)}
     * @param caseNumberYear The value of caseNumberYear as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseNumberYear_GreaterThan(Integer caseNumberYear) {
        regCaseNumberYear(CK_GT, caseNumberYear);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (事件番号年)CASE_NUMBER_YEAR: {NotNull, INT UNSIGNED(10)}
     * @param caseNumberYear The value of caseNumberYear as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseNumberYear_LessThan(Integer caseNumberYear) {
        regCaseNumberYear(CK_LT, caseNumberYear);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (事件番号年)CASE_NUMBER_YEAR: {NotNull, INT UNSIGNED(10)}
     * @param caseNumberYear The value of caseNumberYear as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseNumberYear_GreaterEqual(Integer caseNumberYear) {
        regCaseNumberYear(CK_GE, caseNumberYear);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (事件番号年)CASE_NUMBER_YEAR: {NotNull, INT UNSIGNED(10)}
     * @param caseNumberYear The value of caseNumberYear as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseNumberYear_LessEqual(Integer caseNumberYear) {
        regCaseNumberYear(CK_LE, caseNumberYear);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (事件番号年)CASE_NUMBER_YEAR: {NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of caseNumberYear. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of caseNumberYear. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCaseNumberYear_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCaseNumberYear_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (事件番号年)CASE_NUMBER_YEAR: {NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of caseNumberYear. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of caseNumberYear. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCaseNumberYear_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCaseNumberYear(), "CASE_NUMBER_YEAR", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (事件番号年)CASE_NUMBER_YEAR: {NotNull, INT UNSIGNED(10)}
     * @param caseNumberYearList The collection of caseNumberYear as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseNumberYear_InScope(Collection<Integer> caseNumberYearList) {
        doSetCaseNumberYear_InScope(caseNumberYearList);
    }

    protected void doSetCaseNumberYear_InScope(Collection<Integer> caseNumberYearList) {
        regINS(CK_INS, cTL(caseNumberYearList), xgetCValueCaseNumberYear(), "CASE_NUMBER_YEAR");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (事件番号年)CASE_NUMBER_YEAR: {NotNull, INT UNSIGNED(10)}
     * @param caseNumberYearList The collection of caseNumberYear as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseNumberYear_NotInScope(Collection<Integer> caseNumberYearList) {
        doSetCaseNumberYear_NotInScope(caseNumberYearList);
    }

    protected void doSetCaseNumberYear_NotInScope(Collection<Integer> caseNumberYearList) {
        regINS(CK_NINS, cTL(caseNumberYearList), xgetCValueCaseNumberYear(), "CASE_NUMBER_YEAR");
    }

    protected void regCaseNumberYear(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseNumberYear(), "CASE_NUMBER_YEAR"); }
    protected abstract ConditionValue xgetCValueCaseNumberYear();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (事件符号ID)CASE_MARK_ID: {IX, NotNull, INT UNSIGNED(10), FK to CASE_MARK}
     * @param caseMarkId The value of caseMarkId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseMarkId_Equal(Integer caseMarkId) {
        doSetCaseMarkId_Equal(caseMarkId);
    }

    protected void doSetCaseMarkId_Equal(Integer caseMarkId) {
        regCaseMarkId(CK_EQ, caseMarkId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (事件符号ID)CASE_MARK_ID: {IX, NotNull, INT UNSIGNED(10), FK to CASE_MARK}
     * @param caseMarkId The value of caseMarkId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseMarkId_NotEqual(Integer caseMarkId) {
        doSetCaseMarkId_NotEqual(caseMarkId);
    }

    protected void doSetCaseMarkId_NotEqual(Integer caseMarkId) {
        regCaseMarkId(CK_NES, caseMarkId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (事件符号ID)CASE_MARK_ID: {IX, NotNull, INT UNSIGNED(10), FK to CASE_MARK}
     * @param caseMarkId The value of caseMarkId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseMarkId_GreaterThan(Integer caseMarkId) {
        regCaseMarkId(CK_GT, caseMarkId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (事件符号ID)CASE_MARK_ID: {IX, NotNull, INT UNSIGNED(10), FK to CASE_MARK}
     * @param caseMarkId The value of caseMarkId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseMarkId_LessThan(Integer caseMarkId) {
        regCaseMarkId(CK_LT, caseMarkId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (事件符号ID)CASE_MARK_ID: {IX, NotNull, INT UNSIGNED(10), FK to CASE_MARK}
     * @param caseMarkId The value of caseMarkId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseMarkId_GreaterEqual(Integer caseMarkId) {
        regCaseMarkId(CK_GE, caseMarkId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (事件符号ID)CASE_MARK_ID: {IX, NotNull, INT UNSIGNED(10), FK to CASE_MARK}
     * @param caseMarkId The value of caseMarkId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseMarkId_LessEqual(Integer caseMarkId) {
        regCaseMarkId(CK_LE, caseMarkId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (事件符号ID)CASE_MARK_ID: {IX, NotNull, INT UNSIGNED(10), FK to CASE_MARK}
     * @param minNumber The min number of caseMarkId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of caseMarkId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCaseMarkId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCaseMarkId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (事件符号ID)CASE_MARK_ID: {IX, NotNull, INT UNSIGNED(10), FK to CASE_MARK}
     * @param minNumber The min number of caseMarkId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of caseMarkId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCaseMarkId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCaseMarkId(), "CASE_MARK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (事件符号ID)CASE_MARK_ID: {IX, NotNull, INT UNSIGNED(10), FK to CASE_MARK}
     * @param caseMarkIdList The collection of caseMarkId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseMarkId_InScope(Collection<Integer> caseMarkIdList) {
        doSetCaseMarkId_InScope(caseMarkIdList);
    }

    protected void doSetCaseMarkId_InScope(Collection<Integer> caseMarkIdList) {
        regINS(CK_INS, cTL(caseMarkIdList), xgetCValueCaseMarkId(), "CASE_MARK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (事件符号ID)CASE_MARK_ID: {IX, NotNull, INT UNSIGNED(10), FK to CASE_MARK}
     * @param caseMarkIdList The collection of caseMarkId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseMarkId_NotInScope(Collection<Integer> caseMarkIdList) {
        doSetCaseMarkId_NotInScope(caseMarkIdList);
    }

    protected void doSetCaseMarkId_NotInScope(Collection<Integer> caseMarkIdList) {
        regINS(CK_NINS, cTL(caseMarkIdList), xgetCValueCaseMarkId(), "CASE_MARK_ID");
    }

    protected void regCaseMarkId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseMarkId(), "CASE_MARK_ID"); }
    protected abstract ConditionValue xgetCValueCaseMarkId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (事件番号連番)CASE_NUMBER_SERIAL_NUMBER: {NotNull, INT UNSIGNED(10)}
     * @param caseNumberSerialNumber The value of caseNumberSerialNumber as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseNumberSerialNumber_Equal(Integer caseNumberSerialNumber) {
        doSetCaseNumberSerialNumber_Equal(caseNumberSerialNumber);
    }

    protected void doSetCaseNumberSerialNumber_Equal(Integer caseNumberSerialNumber) {
        regCaseNumberSerialNumber(CK_EQ, caseNumberSerialNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (事件番号連番)CASE_NUMBER_SERIAL_NUMBER: {NotNull, INT UNSIGNED(10)}
     * @param caseNumberSerialNumber The value of caseNumberSerialNumber as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseNumberSerialNumber_NotEqual(Integer caseNumberSerialNumber) {
        doSetCaseNumberSerialNumber_NotEqual(caseNumberSerialNumber);
    }

    protected void doSetCaseNumberSerialNumber_NotEqual(Integer caseNumberSerialNumber) {
        regCaseNumberSerialNumber(CK_NES, caseNumberSerialNumber);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (事件番号連番)CASE_NUMBER_SERIAL_NUMBER: {NotNull, INT UNSIGNED(10)}
     * @param caseNumberSerialNumber The value of caseNumberSerialNumber as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseNumberSerialNumber_GreaterThan(Integer caseNumberSerialNumber) {
        regCaseNumberSerialNumber(CK_GT, caseNumberSerialNumber);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (事件番号連番)CASE_NUMBER_SERIAL_NUMBER: {NotNull, INT UNSIGNED(10)}
     * @param caseNumberSerialNumber The value of caseNumberSerialNumber as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseNumberSerialNumber_LessThan(Integer caseNumberSerialNumber) {
        regCaseNumberSerialNumber(CK_LT, caseNumberSerialNumber);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (事件番号連番)CASE_NUMBER_SERIAL_NUMBER: {NotNull, INT UNSIGNED(10)}
     * @param caseNumberSerialNumber The value of caseNumberSerialNumber as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseNumberSerialNumber_GreaterEqual(Integer caseNumberSerialNumber) {
        regCaseNumberSerialNumber(CK_GE, caseNumberSerialNumber);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (事件番号連番)CASE_NUMBER_SERIAL_NUMBER: {NotNull, INT UNSIGNED(10)}
     * @param caseNumberSerialNumber The value of caseNumberSerialNumber as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseNumberSerialNumber_LessEqual(Integer caseNumberSerialNumber) {
        regCaseNumberSerialNumber(CK_LE, caseNumberSerialNumber);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (事件番号連番)CASE_NUMBER_SERIAL_NUMBER: {NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of caseNumberSerialNumber. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of caseNumberSerialNumber. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCaseNumberSerialNumber_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCaseNumberSerialNumber_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (事件番号連番)CASE_NUMBER_SERIAL_NUMBER: {NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of caseNumberSerialNumber. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of caseNumberSerialNumber. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCaseNumberSerialNumber_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCaseNumberSerialNumber(), "CASE_NUMBER_SERIAL_NUMBER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (事件番号連番)CASE_NUMBER_SERIAL_NUMBER: {NotNull, INT UNSIGNED(10)}
     * @param caseNumberSerialNumberList The collection of caseNumberSerialNumber as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseNumberSerialNumber_InScope(Collection<Integer> caseNumberSerialNumberList) {
        doSetCaseNumberSerialNumber_InScope(caseNumberSerialNumberList);
    }

    protected void doSetCaseNumberSerialNumber_InScope(Collection<Integer> caseNumberSerialNumberList) {
        regINS(CK_INS, cTL(caseNumberSerialNumberList), xgetCValueCaseNumberSerialNumber(), "CASE_NUMBER_SERIAL_NUMBER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (事件番号連番)CASE_NUMBER_SERIAL_NUMBER: {NotNull, INT UNSIGNED(10)}
     * @param caseNumberSerialNumberList The collection of caseNumberSerialNumber as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseNumberSerialNumber_NotInScope(Collection<Integer> caseNumberSerialNumberList) {
        doSetCaseNumberSerialNumber_NotInScope(caseNumberSerialNumberList);
    }

    protected void doSetCaseNumberSerialNumber_NotInScope(Collection<Integer> caseNumberSerialNumberList) {
        regINS(CK_NINS, cTL(caseNumberSerialNumberList), xgetCValueCaseNumberSerialNumber(), "CASE_NUMBER_SERIAL_NUMBER");
    }

    protected void regCaseNumberSerialNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseNumberSerialNumber(), "CASE_NUMBER_SERIAL_NUMBER"); }
    protected abstract ConditionValue xgetCValueCaseNumberSerialNumber();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判所ID)COURT_ID: {IX, NotNull, INT UNSIGNED(10), FK to COURT}
     * @param courtId The value of courtId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourtId_Equal(Integer courtId) {
        doSetCourtId_Equal(courtId);
    }

    protected void doSetCourtId_Equal(Integer courtId) {
        regCourtId(CK_EQ, courtId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判所ID)COURT_ID: {IX, NotNull, INT UNSIGNED(10), FK to COURT}
     * @param courtId The value of courtId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourtId_NotEqual(Integer courtId) {
        doSetCourtId_NotEqual(courtId);
    }

    protected void doSetCourtId_NotEqual(Integer courtId) {
        regCourtId(CK_NES, courtId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判所ID)COURT_ID: {IX, NotNull, INT UNSIGNED(10), FK to COURT}
     * @param courtId The value of courtId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourtId_GreaterThan(Integer courtId) {
        regCourtId(CK_GT, courtId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判所ID)COURT_ID: {IX, NotNull, INT UNSIGNED(10), FK to COURT}
     * @param courtId The value of courtId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourtId_LessThan(Integer courtId) {
        regCourtId(CK_LT, courtId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判所ID)COURT_ID: {IX, NotNull, INT UNSIGNED(10), FK to COURT}
     * @param courtId The value of courtId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourtId_GreaterEqual(Integer courtId) {
        regCourtId(CK_GE, courtId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判所ID)COURT_ID: {IX, NotNull, INT UNSIGNED(10), FK to COURT}
     * @param courtId The value of courtId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourtId_LessEqual(Integer courtId) {
        regCourtId(CK_LE, courtId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判所ID)COURT_ID: {IX, NotNull, INT UNSIGNED(10), FK to COURT}
     * @param minNumber The min number of courtId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of courtId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCourtId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCourtId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判所ID)COURT_ID: {IX, NotNull, INT UNSIGNED(10), FK to COURT}
     * @param minNumber The min number of courtId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of courtId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCourtId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCourtId(), "COURT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (裁判所ID)COURT_ID: {IX, NotNull, INT UNSIGNED(10), FK to COURT}
     * @param courtIdList The collection of courtId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtId_InScope(Collection<Integer> courtIdList) {
        doSetCourtId_InScope(courtIdList);
    }

    protected void doSetCourtId_InScope(Collection<Integer> courtIdList) {
        regINS(CK_INS, cTL(courtIdList), xgetCValueCourtId(), "COURT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (裁判所ID)COURT_ID: {IX, NotNull, INT UNSIGNED(10), FK to COURT}
     * @param courtIdList The collection of courtId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtId_NotInScope(Collection<Integer> courtIdList) {
        doSetCourtId_NotInScope(courtIdList);
    }

    protected void doSetCourtId_NotInScope(Collection<Integer> courtIdList) {
        regINS(CK_NINS, cTL(courtIdList), xgetCValueCourtId(), "COURT_ID");
    }

    protected void regCourtId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCourtId(), "COURT_ID"); }
    protected abstract ConditionValue xgetCValueCourtId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (法廷種別コード)BENCH_CODE: {IX, VARCHAR(10), FK to CLS_BENCH, classification=Bench}
     * @param benchCode The value of benchCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setBenchCode_Equal(String benchCode) {
        doSetBenchCode_Equal(fRES(benchCode));
    }

    /**
     * Equal(=). As Bench. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (法廷種別コード)BENCH_CODE: {IX, VARCHAR(10), FK to CLS_BENCH, classification=Bench} <br>
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setBenchCode_Equal_AsBench(CDef.Bench cdef) {
        doSetBenchCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As 大法廷 (FULL). And OnlyOnceRegistered. <br>
     * 大法廷: 大法廷
     */
    public void setBenchCode_Equal_大法廷() {
        setBenchCode_Equal_AsBench(CDef.Bench.大法廷);
    }

    /**
     * Equal(=). As 第一小法廷 (FIRST). And OnlyOnceRegistered. <br>
     * 第一小法廷: 第一小法廷
     */
    public void setBenchCode_Equal_第一小法廷() {
        setBenchCode_Equal_AsBench(CDef.Bench.第一小法廷);
    }

    /**
     * Equal(=). As 第二小法廷 (SECOND). And OnlyOnceRegistered. <br>
     * 第二小法廷: 第二小法廷
     */
    public void setBenchCode_Equal_第二小法廷() {
        setBenchCode_Equal_AsBench(CDef.Bench.第二小法廷);
    }

    /**
     * Equal(=). As 第三小法廷 (THIRD). And OnlyOnceRegistered. <br>
     * 第三小法廷: 第三小法廷
     */
    public void setBenchCode_Equal_第三小法廷() {
        setBenchCode_Equal_AsBench(CDef.Bench.第三小法廷);
    }

    protected void doSetBenchCode_Equal(String benchCode) {
        regBenchCode(CK_EQ, benchCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (法廷種別コード)BENCH_CODE: {IX, VARCHAR(10), FK to CLS_BENCH, classification=Bench}
     * @param benchCode The value of benchCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setBenchCode_NotEqual(String benchCode) {
        doSetBenchCode_NotEqual(fRES(benchCode));
    }

    /**
     * NotEqual(&lt;&gt;). As Bench. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (法廷種別コード)BENCH_CODE: {IX, VARCHAR(10), FK to CLS_BENCH, classification=Bench} <br>
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setBenchCode_NotEqual_AsBench(CDef.Bench cdef) {
        doSetBenchCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As 大法廷 (FULL). And OnlyOnceRegistered. <br>
     * 大法廷: 大法廷
     */
    public void setBenchCode_NotEqual_大法廷() {
        setBenchCode_NotEqual_AsBench(CDef.Bench.大法廷);
    }

    /**
     * NotEqual(&lt;&gt;). As 第一小法廷 (FIRST). And OnlyOnceRegistered. <br>
     * 第一小法廷: 第一小法廷
     */
    public void setBenchCode_NotEqual_第一小法廷() {
        setBenchCode_NotEqual_AsBench(CDef.Bench.第一小法廷);
    }

    /**
     * NotEqual(&lt;&gt;). As 第二小法廷 (SECOND). And OnlyOnceRegistered. <br>
     * 第二小法廷: 第二小法廷
     */
    public void setBenchCode_NotEqual_第二小法廷() {
        setBenchCode_NotEqual_AsBench(CDef.Bench.第二小法廷);
    }

    /**
     * NotEqual(&lt;&gt;). As 第三小法廷 (THIRD). And OnlyOnceRegistered. <br>
     * 第三小法廷: 第三小法廷
     */
    public void setBenchCode_NotEqual_第三小法廷() {
        setBenchCode_NotEqual_AsBench(CDef.Bench.第三小法廷);
    }

    protected void doSetBenchCode_NotEqual(String benchCode) {
        regBenchCode(CK_NES, benchCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (法廷種別コード)BENCH_CODE: {IX, VARCHAR(10), FK to CLS_BENCH, classification=Bench}
     * @param benchCodeList The collection of benchCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBenchCode_InScope(Collection<String> benchCodeList) {
        doSetBenchCode_InScope(benchCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As Bench. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (法廷種別コード)BENCH_CODE: {IX, VARCHAR(10), FK to CLS_BENCH, classification=Bench} <br>
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setBenchCode_InScope_AsBench(Collection<CDef.Bench> cdefList) {
        doSetBenchCode_InScope(cTStrL(cdefList));
    }

    protected void doSetBenchCode_InScope(Collection<String> benchCodeList) {
        regINS(CK_INS, cTL(benchCodeList), xgetCValueBenchCode(), "BENCH_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (法廷種別コード)BENCH_CODE: {IX, VARCHAR(10), FK to CLS_BENCH, classification=Bench}
     * @param benchCodeList The collection of benchCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBenchCode_NotInScope(Collection<String> benchCodeList) {
        doSetBenchCode_NotInScope(benchCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As Bench. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (法廷種別コード)BENCH_CODE: {IX, VARCHAR(10), FK to CLS_BENCH, classification=Bench} <br>
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setBenchCode_NotInScope_AsBench(Collection<CDef.Bench> cdefList) {
        doSetBenchCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetBenchCode_NotInScope(Collection<String> benchCodeList) {
        regINS(CK_NINS, cTL(benchCodeList), xgetCValueBenchCode(), "BENCH_CODE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (法廷種別コード)BENCH_CODE: {IX, VARCHAR(10), FK to CLS_BENCH, classification=Bench}
     */
    public void setBenchCode_IsNull() { regBenchCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (法廷種別コード)BENCH_CODE: {IX, VARCHAR(10), FK to CLS_BENCH, classification=Bench}
     */
    public void setBenchCode_IsNullOrEmpty() { regBenchCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (法廷種別コード)BENCH_CODE: {IX, VARCHAR(10), FK to CLS_BENCH, classification=Bench}
     */
    public void setBenchCode_IsNotNull() { regBenchCode(CK_ISNN, DOBJ); }

    protected void regBenchCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBenchCode(), "BENCH_CODE"); }
    protected abstract ConditionValue xgetCValueBenchCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (判決結果コード)JUDGEMENT_RESULT_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_RESULT, classification=JudgementResult}
     * @param judgementResultCode The value of judgementResultCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementResultCode_Equal(String judgementResultCode) {
        doSetJudgementResultCode_Equal(fRES(judgementResultCode));
    }

    /**
     * Equal(=). As JudgementResult. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (判決結果コード)JUDGEMENT_RESULT_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_RESULT, classification=JudgementResult} <br>
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementResultCode_Equal_AsJudgementResult(CDef.JudgementResult cdef) {
        doSetJudgementResultCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As 棄却 (DISMISSAL). And OnlyOnceRegistered. <br>
     * 棄却: 棄却
     */
    public void setJudgementResultCode_Equal_棄却() {
        setJudgementResultCode_Equal_AsJudgementResult(CDef.JudgementResult.棄却);
    }

    /**
     * Equal(=). As 破棄自判 (SELF). And OnlyOnceRegistered. <br>
     * 破棄自判: 破棄自判
     */
    public void setJudgementResultCode_Equal_破棄自判() {
        setJudgementResultCode_Equal_AsJudgementResult(CDef.JudgementResult.破棄自判);
    }

    /**
     * Equal(=). As 破棄差戻 (REMAND). And OnlyOnceRegistered. <br>
     * 破棄差戻: 破棄差戻
     */
    public void setJudgementResultCode_Equal_破棄差戻() {
        setJudgementResultCode_Equal_AsJudgementResult(CDef.JudgementResult.破棄差戻);
    }

    /**
     * Equal(=). As 却下 (REJECTING). And OnlyOnceRegistered. <br>
     * 却下: 却下
     */
    public void setJudgementResultCode_Equal_却下() {
        setJudgementResultCode_Equal_AsJudgementResult(CDef.JudgementResult.却下);
    }

    /**
     * Equal(=). As その他 (OTHERS). And OnlyOnceRegistered. <br>
     * その他: その他
     */
    public void setJudgementResultCode_Equal_その他() {
        setJudgementResultCode_Equal_AsJudgementResult(CDef.JudgementResult.その他);
    }

    protected void doSetJudgementResultCode_Equal(String judgementResultCode) {
        regJudgementResultCode(CK_EQ, judgementResultCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (判決結果コード)JUDGEMENT_RESULT_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_RESULT, classification=JudgementResult}
     * @param judgementResultCode The value of judgementResultCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementResultCode_NotEqual(String judgementResultCode) {
        doSetJudgementResultCode_NotEqual(fRES(judgementResultCode));
    }

    /**
     * NotEqual(&lt;&gt;). As JudgementResult. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (判決結果コード)JUDGEMENT_RESULT_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_RESULT, classification=JudgementResult} <br>
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementResultCode_NotEqual_AsJudgementResult(CDef.JudgementResult cdef) {
        doSetJudgementResultCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As 棄却 (DISMISSAL). And OnlyOnceRegistered. <br>
     * 棄却: 棄却
     */
    public void setJudgementResultCode_NotEqual_棄却() {
        setJudgementResultCode_NotEqual_AsJudgementResult(CDef.JudgementResult.棄却);
    }

    /**
     * NotEqual(&lt;&gt;). As 破棄自判 (SELF). And OnlyOnceRegistered. <br>
     * 破棄自判: 破棄自判
     */
    public void setJudgementResultCode_NotEqual_破棄自判() {
        setJudgementResultCode_NotEqual_AsJudgementResult(CDef.JudgementResult.破棄自判);
    }

    /**
     * NotEqual(&lt;&gt;). As 破棄差戻 (REMAND). And OnlyOnceRegistered. <br>
     * 破棄差戻: 破棄差戻
     */
    public void setJudgementResultCode_NotEqual_破棄差戻() {
        setJudgementResultCode_NotEqual_AsJudgementResult(CDef.JudgementResult.破棄差戻);
    }

    /**
     * NotEqual(&lt;&gt;). As 却下 (REJECTING). And OnlyOnceRegistered. <br>
     * 却下: 却下
     */
    public void setJudgementResultCode_NotEqual_却下() {
        setJudgementResultCode_NotEqual_AsJudgementResult(CDef.JudgementResult.却下);
    }

    /**
     * NotEqual(&lt;&gt;). As その他 (OTHERS). And OnlyOnceRegistered. <br>
     * その他: その他
     */
    public void setJudgementResultCode_NotEqual_その他() {
        setJudgementResultCode_NotEqual_AsJudgementResult(CDef.JudgementResult.その他);
    }

    protected void doSetJudgementResultCode_NotEqual(String judgementResultCode) {
        regJudgementResultCode(CK_NES, judgementResultCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (判決結果コード)JUDGEMENT_RESULT_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_RESULT, classification=JudgementResult}
     * @param judgementResultCodeList The collection of judgementResultCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementResultCode_InScope(Collection<String> judgementResultCodeList) {
        doSetJudgementResultCode_InScope(judgementResultCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As JudgementResult. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (判決結果コード)JUDGEMENT_RESULT_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_RESULT, classification=JudgementResult} <br>
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementResultCode_InScope_AsJudgementResult(Collection<CDef.JudgementResult> cdefList) {
        doSetJudgementResultCode_InScope(cTStrL(cdefList));
    }

    protected void doSetJudgementResultCode_InScope(Collection<String> judgementResultCodeList) {
        regINS(CK_INS, cTL(judgementResultCodeList), xgetCValueJudgementResultCode(), "JUDGEMENT_RESULT_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (判決結果コード)JUDGEMENT_RESULT_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_RESULT, classification=JudgementResult}
     * @param judgementResultCodeList The collection of judgementResultCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementResultCode_NotInScope(Collection<String> judgementResultCodeList) {
        doSetJudgementResultCode_NotInScope(judgementResultCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As JudgementResult. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (判決結果コード)JUDGEMENT_RESULT_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_RESULT, classification=JudgementResult} <br>
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementResultCode_NotInScope_AsJudgementResult(Collection<CDef.JudgementResult> cdefList) {
        doSetJudgementResultCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetJudgementResultCode_NotInScope(Collection<String> judgementResultCodeList) {
        regINS(CK_NINS, cTL(judgementResultCodeList), xgetCValueJudgementResultCode(), "JUDGEMENT_RESULT_CODE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (判決結果コード)JUDGEMENT_RESULT_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_RESULT, classification=JudgementResult}
     */
    public void setJudgementResultCode_IsNull() { regJudgementResultCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (判決結果コード)JUDGEMENT_RESULT_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_RESULT, classification=JudgementResult}
     */
    public void setJudgementResultCode_IsNullOrEmpty() { regJudgementResultCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (判決結果コード)JUDGEMENT_RESULT_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_RESULT, classification=JudgementResult}
     */
    public void setJudgementResultCode_IsNotNull() { regJudgementResultCode(CK_ISNN, DOBJ); }

    protected void regJudgementResultCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJudgementResultCode(), "JUDGEMENT_RESULT_CODE"); }
    protected abstract ConditionValue xgetCValueJudgementResultCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (判決種別コード)JUDGEMENT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_TYPE, classification=JudgementType}
     * @param judgementTypeCode The value of judgementTypeCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementTypeCode_Equal(String judgementTypeCode) {
        doSetJudgementTypeCode_Equal(fRES(judgementTypeCode));
    }

    /**
     * Equal(=). As JudgementType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (判決種別コード)JUDGEMENT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_TYPE, classification=JudgementType} <br>
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementTypeCode_Equal_AsJudgementType(CDef.JudgementType cdef) {
        doSetJudgementTypeCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As 判決 (JUDGEMENT). And OnlyOnceRegistered. <br>
     * 判決: 判決
     */
    public void setJudgementTypeCode_Equal_判決() {
        setJudgementTypeCode_Equal_AsJudgementType(CDef.JudgementType.判決);
    }

    /**
     * Equal(=). As 決定 (DECISION). And OnlyOnceRegistered. <br>
     * 決定: 決定
     */
    public void setJudgementTypeCode_Equal_決定() {
        setJudgementTypeCode_Equal_AsJudgementType(CDef.JudgementType.決定);
    }

    protected void doSetJudgementTypeCode_Equal(String judgementTypeCode) {
        regJudgementTypeCode(CK_EQ, judgementTypeCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (判決種別コード)JUDGEMENT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_TYPE, classification=JudgementType}
     * @param judgementTypeCode The value of judgementTypeCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementTypeCode_NotEqual(String judgementTypeCode) {
        doSetJudgementTypeCode_NotEqual(fRES(judgementTypeCode));
    }

    /**
     * NotEqual(&lt;&gt;). As JudgementType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (判決種別コード)JUDGEMENT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_TYPE, classification=JudgementType} <br>
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementTypeCode_NotEqual_AsJudgementType(CDef.JudgementType cdef) {
        doSetJudgementTypeCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As 判決 (JUDGEMENT). And OnlyOnceRegistered. <br>
     * 判決: 判決
     */
    public void setJudgementTypeCode_NotEqual_判決() {
        setJudgementTypeCode_NotEqual_AsJudgementType(CDef.JudgementType.判決);
    }

    /**
     * NotEqual(&lt;&gt;). As 決定 (DECISION). And OnlyOnceRegistered. <br>
     * 決定: 決定
     */
    public void setJudgementTypeCode_NotEqual_決定() {
        setJudgementTypeCode_NotEqual_AsJudgementType(CDef.JudgementType.決定);
    }

    protected void doSetJudgementTypeCode_NotEqual(String judgementTypeCode) {
        regJudgementTypeCode(CK_NES, judgementTypeCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (判決種別コード)JUDGEMENT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_TYPE, classification=JudgementType}
     * @param judgementTypeCodeList The collection of judgementTypeCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementTypeCode_InScope(Collection<String> judgementTypeCodeList) {
        doSetJudgementTypeCode_InScope(judgementTypeCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As JudgementType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (判決種別コード)JUDGEMENT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_TYPE, classification=JudgementType} <br>
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementTypeCode_InScope_AsJudgementType(Collection<CDef.JudgementType> cdefList) {
        doSetJudgementTypeCode_InScope(cTStrL(cdefList));
    }

    protected void doSetJudgementTypeCode_InScope(Collection<String> judgementTypeCodeList) {
        regINS(CK_INS, cTL(judgementTypeCodeList), xgetCValueJudgementTypeCode(), "JUDGEMENT_TYPE_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (判決種別コード)JUDGEMENT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_TYPE, classification=JudgementType}
     * @param judgementTypeCodeList The collection of judgementTypeCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementTypeCode_NotInScope(Collection<String> judgementTypeCodeList) {
        doSetJudgementTypeCode_NotInScope(judgementTypeCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As JudgementType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (判決種別コード)JUDGEMENT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_TYPE, classification=JudgementType} <br>
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementTypeCode_NotInScope_AsJudgementType(Collection<CDef.JudgementType> cdefList) {
        doSetJudgementTypeCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetJudgementTypeCode_NotInScope(Collection<String> judgementTypeCodeList) {
        regINS(CK_NINS, cTL(judgementTypeCodeList), xgetCValueJudgementTypeCode(), "JUDGEMENT_TYPE_CODE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (判決種別コード)JUDGEMENT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_TYPE, classification=JudgementType}
     */
    public void setJudgementTypeCode_IsNull() { regJudgementTypeCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (判決種別コード)JUDGEMENT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_TYPE, classification=JudgementType}
     */
    public void setJudgementTypeCode_IsNullOrEmpty() { regJudgementTypeCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (判決種別コード)JUDGEMENT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_TYPE, classification=JudgementType}
     */
    public void setJudgementTypeCode_IsNotNull() { regJudgementTypeCode(CK_ISNN, DOBJ); }

    protected void regJudgementTypeCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJudgementTypeCode(), "JUDGEMENT_TYPE_CODE"); }
    protected abstract ConditionValue xgetCValueJudgementTypeCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (判決文)SENTENCE: {TEXT(65535)}
     * @param sentence The value of sentence as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSentence_Equal(String sentence) {
        doSetSentence_Equal(fRES(sentence));
    }

    protected void doSetSentence_Equal(String sentence) {
        regSentence(CK_EQ, sentence);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判決文)SENTENCE: {TEXT(65535)} <br>
     * <pre>e.g. setSentence_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param sentence The value of sentence as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSentence_LikeSearch(String sentence, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSentence_LikeSearch(sentence, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判決文)SENTENCE: {TEXT(65535)} <br>
     * <pre>e.g. setSentence_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sentence The value of sentence as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setSentence_LikeSearch(String sentence, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sentence), xgetCValueSentence(), "SENTENCE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判決文)SENTENCE: {TEXT(65535)}
     * @param sentence The value of sentence as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSentence_NotLikeSearch(String sentence, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSentence_NotLikeSearch(sentence, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判決文)SENTENCE: {TEXT(65535)}
     * @param sentence The value of sentence as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setSentence_NotLikeSearch(String sentence, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sentence), xgetCValueSentence(), "SENTENCE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (判決文)SENTENCE: {TEXT(65535)}
     */
    public void setSentence_IsNull() { regSentence(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (判決文)SENTENCE: {TEXT(65535)}
     */
    public void setSentence_IsNullOrEmpty() { regSentence(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (判決文)SENTENCE: {TEXT(65535)}
     */
    public void setSentence_IsNotNull() { regSentence(CK_ISNN, DOBJ); }

    protected void regSentence(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSentence(), "SENTENCE"); }
    protected abstract ConditionValue xgetCValueSentence();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<JudgementCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, JudgementCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<JudgementCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, JudgementCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<JudgementCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, JudgementCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<JudgementCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, JudgementCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<JudgementCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, JudgementCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;JudgementCB&gt;() {
     *     public void query(JudgementCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<JudgementCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, JudgementCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(JudgementCQ sq);

    protected JudgementCB xcreateScalarConditionCB() {
        JudgementCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected JudgementCB xcreateScalarConditionPartitionByCB() {
        JudgementCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<JudgementCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementCB cb = new JudgementCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "JUDGEMENT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(JudgementCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<JudgementCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(JudgementCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementCB cb = new JudgementCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "JUDGEMENT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(JudgementCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<JudgementCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        JudgementCB cb = new JudgementCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(JudgementCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected JudgementCB newMyCB() {
        return new JudgementCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return JudgementCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
