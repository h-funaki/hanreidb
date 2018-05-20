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
 * The abstract condition-query of LAW.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsLawCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsLawCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "LAW";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令ID)LAW_ID: {PK, ID, NotNull, INT(10)}
     * @param lawId The value of lawId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawId_Equal(Integer lawId) {
        doSetLawId_Equal(lawId);
    }

    protected void doSetLawId_Equal(Integer lawId) {
        regLawId(CK_EQ, lawId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令ID)LAW_ID: {PK, ID, NotNull, INT(10)}
     * @param lawId The value of lawId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawId_NotEqual(Integer lawId) {
        doSetLawId_NotEqual(lawId);
    }

    protected void doSetLawId_NotEqual(Integer lawId) {
        regLawId(CK_NES, lawId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令ID)LAW_ID: {PK, ID, NotNull, INT(10)}
     * @param lawId The value of lawId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawId_GreaterThan(Integer lawId) {
        regLawId(CK_GT, lawId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令ID)LAW_ID: {PK, ID, NotNull, INT(10)}
     * @param lawId The value of lawId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawId_LessThan(Integer lawId) {
        regLawId(CK_LT, lawId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令ID)LAW_ID: {PK, ID, NotNull, INT(10)}
     * @param lawId The value of lawId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawId_GreaterEqual(Integer lawId) {
        regLawId(CK_GE, lawId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令ID)LAW_ID: {PK, ID, NotNull, INT(10)}
     * @param lawId The value of lawId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawId_LessEqual(Integer lawId) {
        regLawId(CK_LE, lawId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (法令ID)LAW_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of lawId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of lawId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setLawId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setLawId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (法令ID)LAW_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of lawId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of lawId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setLawId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLawId(), "LAW_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (法令ID)LAW_ID: {PK, ID, NotNull, INT(10)}
     * @param lawIdList The collection of lawId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawId_InScope(Collection<Integer> lawIdList) {
        doSetLawId_InScope(lawIdList);
    }

    protected void doSetLawId_InScope(Collection<Integer> lawIdList) {
        regINS(CK_INS, cTL(lawIdList), xgetCValueLawId(), "LAW_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (法令ID)LAW_ID: {PK, ID, NotNull, INT(10)}
     * @param lawIdList The collection of lawId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawId_NotInScope(Collection<Integer> lawIdList) {
        doSetLawId_NotInScope(lawIdList);
    }

    protected void doSetLawId_NotInScope(Collection<Integer> lawIdList) {
        regINS(CK_NINS, cTL(lawIdList), xgetCValueLawId(), "LAW_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LAW_ID from LAW_ALIAS where ...)} <br>
     * (法令略称)LAW_ALIAS by LAW_ID, named 'lawAliasAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsLawAlias</span>(aliasCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     aliasCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LawAliasList for 'exists'. (NotNull)
     */
    public void existsLawAlias(SubQuery<LawAliasCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LawAliasCB cb = new LawAliasCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLawId_ExistsReferrer_LawAliasList(cb.query());
        registerExistsReferrer(cb.query(), "LAW_ID", "LAW_ID", pp, "lawAliasList");
    }
    public abstract String keepLawId_ExistsReferrer_LawAliasList(LawAliasCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LAW_ID from LAW_CATEGORY_REL where ...)} <br>
     * (法令カテゴリーリレーション)LAW_CATEGORY_REL by LAW_ID, named 'lawCategoryRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsLawCategoryRel</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LawCategoryRelList for 'exists'. (NotNull)
     */
    public void existsLawCategoryRel(SubQuery<LawCategoryRelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LawCategoryRelCB cb = new LawCategoryRelCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLawId_ExistsReferrer_LawCategoryRelList(cb.query());
        registerExistsReferrer(cb.query(), "LAW_ID", "LAW_ID", pp, "lawCategoryRelList");
    }
    public abstract String keepLawId_ExistsReferrer_LawCategoryRelList(LawCategoryRelCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select AMEND_LAW_ID from LAW_HISTORY where ...)} <br>
     * (法令履歴)LAW_HISTORY by AMEND_LAW_ID, named 'lawHistoryByAmendLawIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsLawHistoryByAmendLawId</span>(historyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     historyCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LawHistoryByAmendLawIdList for 'exists'. (NotNull)
     */
    public void existsLawHistoryByAmendLawId(SubQuery<LawHistoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LawHistoryCB cb = new LawHistoryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLawId_ExistsReferrer_LawHistoryByAmendLawIdList(cb.query());
        registerExistsReferrer(cb.query(), "LAW_ID", "AMEND_LAW_ID", pp, "lawHistoryByAmendLawIdList");
    }
    public abstract String keepLawId_ExistsReferrer_LawHistoryByAmendLawIdList(LawHistoryCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LAW_ID from LAW_HISTORY where ...)} <br>
     * (法令履歴)LAW_HISTORY by LAW_ID, named 'lawHistoryByLawIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsLawHistoryByLawId</span>(historyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     historyCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LawHistoryByLawIdList for 'exists'. (NotNull)
     */
    public void existsLawHistoryByLawId(SubQuery<LawHistoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LawHistoryCB cb = new LawHistoryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLawId_ExistsReferrer_LawHistoryByLawIdList(cb.query());
        registerExistsReferrer(cb.query(), "LAW_ID", "LAW_ID", pp, "lawHistoryByLawIdList");
    }
    public abstract String keepLawId_ExistsReferrer_LawHistoryByLawIdList(LawHistoryCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LAW_ID from LAW_SOURCE_REL where ...)} <br>
     * (法令取得元リレーション)LAW_SOURCE_REL by LAW_ID, named 'lawSourceRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsLawSourceRel</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LawSourceRelList for 'exists'. (NotNull)
     */
    public void existsLawSourceRel(SubQuery<LawSourceRelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LawSourceRelCB cb = new LawSourceRelCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLawId_ExistsReferrer_LawSourceRelList(cb.query());
        registerExistsReferrer(cb.query(), "LAW_ID", "LAW_ID", pp, "lawSourceRelList");
    }
    public abstract String keepLawId_ExistsReferrer_LawSourceRelList(LawSourceRelCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LAW_ID from SOURCE_LAW_CATEGORY_REL where ...)} <br>
     * (取得元法令カテゴリーリレーション)SOURCE_LAW_CATEGORY_REL by LAW_ID, named 'sourceLawCategoryRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsSourceLawCategoryRel</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of SourceLawCategoryRelList for 'exists'. (NotNull)
     */
    public void existsSourceLawCategoryRel(SubQuery<SourceLawCategoryRelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        SourceLawCategoryRelCB cb = new SourceLawCategoryRelCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLawId_ExistsReferrer_SourceLawCategoryRelList(cb.query());
        registerExistsReferrer(cb.query(), "LAW_ID", "LAW_ID", pp, "sourceLawCategoryRelList");
    }
    public abstract String keepLawId_ExistsReferrer_SourceLawCategoryRelList(SourceLawCategoryRelCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LAW_ID from LAW_ALIAS where ...)} <br>
     * (法令略称)LAW_ALIAS by LAW_ID, named 'lawAliasAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsLawAlias</span>(aliasCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     aliasCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LawId_NotExistsReferrer_LawAliasList for 'not exists'. (NotNull)
     */
    public void notExistsLawAlias(SubQuery<LawAliasCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LawAliasCB cb = new LawAliasCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLawId_NotExistsReferrer_LawAliasList(cb.query());
        registerNotExistsReferrer(cb.query(), "LAW_ID", "LAW_ID", pp, "lawAliasList");
    }
    public abstract String keepLawId_NotExistsReferrer_LawAliasList(LawAliasCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LAW_ID from LAW_CATEGORY_REL where ...)} <br>
     * (法令カテゴリーリレーション)LAW_CATEGORY_REL by LAW_ID, named 'lawCategoryRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsLawCategoryRel</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LawId_NotExistsReferrer_LawCategoryRelList for 'not exists'. (NotNull)
     */
    public void notExistsLawCategoryRel(SubQuery<LawCategoryRelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LawCategoryRelCB cb = new LawCategoryRelCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLawId_NotExistsReferrer_LawCategoryRelList(cb.query());
        registerNotExistsReferrer(cb.query(), "LAW_ID", "LAW_ID", pp, "lawCategoryRelList");
    }
    public abstract String keepLawId_NotExistsReferrer_LawCategoryRelList(LawCategoryRelCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select AMEND_LAW_ID from LAW_HISTORY where ...)} <br>
     * (法令履歴)LAW_HISTORY by AMEND_LAW_ID, named 'lawHistoryByAmendLawIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsLawHistoryByAmendLawId</span>(historyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     historyCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LawId_NotExistsReferrer_LawHistoryByAmendLawIdList for 'not exists'. (NotNull)
     */
    public void notExistsLawHistoryByAmendLawId(SubQuery<LawHistoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LawHistoryCB cb = new LawHistoryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLawId_NotExistsReferrer_LawHistoryByAmendLawIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "LAW_ID", "AMEND_LAW_ID", pp, "lawHistoryByAmendLawIdList");
    }
    public abstract String keepLawId_NotExistsReferrer_LawHistoryByAmendLawIdList(LawHistoryCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LAW_ID from LAW_HISTORY where ...)} <br>
     * (法令履歴)LAW_HISTORY by LAW_ID, named 'lawHistoryByLawIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsLawHistoryByLawId</span>(historyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     historyCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LawId_NotExistsReferrer_LawHistoryByLawIdList for 'not exists'. (NotNull)
     */
    public void notExistsLawHistoryByLawId(SubQuery<LawHistoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LawHistoryCB cb = new LawHistoryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLawId_NotExistsReferrer_LawHistoryByLawIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "LAW_ID", "LAW_ID", pp, "lawHistoryByLawIdList");
    }
    public abstract String keepLawId_NotExistsReferrer_LawHistoryByLawIdList(LawHistoryCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LAW_ID from LAW_SOURCE_REL where ...)} <br>
     * (法令取得元リレーション)LAW_SOURCE_REL by LAW_ID, named 'lawSourceRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsLawSourceRel</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LawId_NotExistsReferrer_LawSourceRelList for 'not exists'. (NotNull)
     */
    public void notExistsLawSourceRel(SubQuery<LawSourceRelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LawSourceRelCB cb = new LawSourceRelCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLawId_NotExistsReferrer_LawSourceRelList(cb.query());
        registerNotExistsReferrer(cb.query(), "LAW_ID", "LAW_ID", pp, "lawSourceRelList");
    }
    public abstract String keepLawId_NotExistsReferrer_LawSourceRelList(LawSourceRelCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LAW_ID from SOURCE_LAW_CATEGORY_REL where ...)} <br>
     * (取得元法令カテゴリーリレーション)SOURCE_LAW_CATEGORY_REL by LAW_ID, named 'sourceLawCategoryRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsSourceLawCategoryRel</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LawId_NotExistsReferrer_SourceLawCategoryRelList for 'not exists'. (NotNull)
     */
    public void notExistsSourceLawCategoryRel(SubQuery<SourceLawCategoryRelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        SourceLawCategoryRelCB cb = new SourceLawCategoryRelCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLawId_NotExistsReferrer_SourceLawCategoryRelList(cb.query());
        registerNotExistsReferrer(cb.query(), "LAW_ID", "LAW_ID", pp, "sourceLawCategoryRelList");
    }
    public abstract String keepLawId_NotExistsReferrer_SourceLawCategoryRelList(SourceLawCategoryRelCQ sq);

    public void xsderiveLawAliasList(String fn, SubQuery<LawAliasCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawAliasCB cb = new LawAliasCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLawId_SpecifyDerivedReferrer_LawAliasList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LAW_ID", "LAW_ID", pp, "lawAliasList", al, op);
    }
    public abstract String keepLawId_SpecifyDerivedReferrer_LawAliasList(LawAliasCQ sq);

    public void xsderiveLawCategoryRelList(String fn, SubQuery<LawCategoryRelCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawCategoryRelCB cb = new LawCategoryRelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLawId_SpecifyDerivedReferrer_LawCategoryRelList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LAW_ID", "LAW_ID", pp, "lawCategoryRelList", al, op);
    }
    public abstract String keepLawId_SpecifyDerivedReferrer_LawCategoryRelList(LawCategoryRelCQ sq);

    public void xsderiveLawHistoryByAmendLawIdList(String fn, SubQuery<LawHistoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawHistoryCB cb = new LawHistoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLawId_SpecifyDerivedReferrer_LawHistoryByAmendLawIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LAW_ID", "AMEND_LAW_ID", pp, "lawHistoryByAmendLawIdList", al, op);
    }
    public abstract String keepLawId_SpecifyDerivedReferrer_LawHistoryByAmendLawIdList(LawHistoryCQ sq);

    public void xsderiveLawHistoryByLawIdList(String fn, SubQuery<LawHistoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawHistoryCB cb = new LawHistoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLawId_SpecifyDerivedReferrer_LawHistoryByLawIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LAW_ID", "LAW_ID", pp, "lawHistoryByLawIdList", al, op);
    }
    public abstract String keepLawId_SpecifyDerivedReferrer_LawHistoryByLawIdList(LawHistoryCQ sq);

    public void xsderiveLawSourceRelList(String fn, SubQuery<LawSourceRelCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawSourceRelCB cb = new LawSourceRelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLawId_SpecifyDerivedReferrer_LawSourceRelList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LAW_ID", "LAW_ID", pp, "lawSourceRelList", al, op);
    }
    public abstract String keepLawId_SpecifyDerivedReferrer_LawSourceRelList(LawSourceRelCQ sq);

    public void xsderiveSourceLawCategoryRelList(String fn, SubQuery<SourceLawCategoryRelCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SourceLawCategoryRelCB cb = new SourceLawCategoryRelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLawId_SpecifyDerivedReferrer_SourceLawCategoryRelList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LAW_ID", "LAW_ID", pp, "sourceLawCategoryRelList", al, op);
    }
    public abstract String keepLawId_SpecifyDerivedReferrer_SourceLawCategoryRelList(SourceLawCategoryRelCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from LAW_ALIAS where ...)} <br>
     * (法令略称)LAW_ALIAS by LAW_ID, named 'lawAliasAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedLawAlias()</span>.<span style="color: #CC4747">max</span>(aliasCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     aliasCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     aliasCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<LawAliasCB> derivedLawAlias() {
        return xcreateQDRFunctionLawAliasList();
    }
    protected HpQDRFunction<LawAliasCB> xcreateQDRFunctionLawAliasList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveLawAliasList(fn, sq, rd, vl, op));
    }
    public void xqderiveLawAliasList(String fn, SubQuery<LawAliasCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawAliasCB cb = new LawAliasCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLawId_QueryDerivedReferrer_LawAliasList(cb.query()); String prpp = keepLawId_QueryDerivedReferrer_LawAliasListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LAW_ID", "LAW_ID", sqpp, "lawAliasList", rd, vl, prpp, op);
    }
    public abstract String keepLawId_QueryDerivedReferrer_LawAliasList(LawAliasCQ sq);
    public abstract String keepLawId_QueryDerivedReferrer_LawAliasListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from LAW_CATEGORY_REL where ...)} <br>
     * (法令カテゴリーリレーション)LAW_CATEGORY_REL by LAW_ID, named 'lawCategoryRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedLawCategoryRel()</span>.<span style="color: #CC4747">max</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     relCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<LawCategoryRelCB> derivedLawCategoryRel() {
        return xcreateQDRFunctionLawCategoryRelList();
    }
    protected HpQDRFunction<LawCategoryRelCB> xcreateQDRFunctionLawCategoryRelList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveLawCategoryRelList(fn, sq, rd, vl, op));
    }
    public void xqderiveLawCategoryRelList(String fn, SubQuery<LawCategoryRelCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawCategoryRelCB cb = new LawCategoryRelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLawId_QueryDerivedReferrer_LawCategoryRelList(cb.query()); String prpp = keepLawId_QueryDerivedReferrer_LawCategoryRelListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LAW_ID", "LAW_ID", sqpp, "lawCategoryRelList", rd, vl, prpp, op);
    }
    public abstract String keepLawId_QueryDerivedReferrer_LawCategoryRelList(LawCategoryRelCQ sq);
    public abstract String keepLawId_QueryDerivedReferrer_LawCategoryRelListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from LAW_HISTORY where ...)} <br>
     * (法令履歴)LAW_HISTORY by AMEND_LAW_ID, named 'lawHistoryByAmendLawIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedLawHistoryByAmendLawId()</span>.<span style="color: #CC4747">max</span>(historyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     historyCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     historyCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<LawHistoryCB> derivedLawHistoryByAmendLawId() {
        return xcreateQDRFunctionLawHistoryByAmendLawIdList();
    }
    protected HpQDRFunction<LawHistoryCB> xcreateQDRFunctionLawHistoryByAmendLawIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveLawHistoryByAmendLawIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveLawHistoryByAmendLawIdList(String fn, SubQuery<LawHistoryCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawHistoryCB cb = new LawHistoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLawId_QueryDerivedReferrer_LawHistoryByAmendLawIdList(cb.query()); String prpp = keepLawId_QueryDerivedReferrer_LawHistoryByAmendLawIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LAW_ID", "AMEND_LAW_ID", sqpp, "lawHistoryByAmendLawIdList", rd, vl, prpp, op);
    }
    public abstract String keepLawId_QueryDerivedReferrer_LawHistoryByAmendLawIdList(LawHistoryCQ sq);
    public abstract String keepLawId_QueryDerivedReferrer_LawHistoryByAmendLawIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from LAW_HISTORY where ...)} <br>
     * (法令履歴)LAW_HISTORY by LAW_ID, named 'lawHistoryByLawIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedLawHistoryByLawId()</span>.<span style="color: #CC4747">max</span>(historyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     historyCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     historyCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<LawHistoryCB> derivedLawHistoryByLawId() {
        return xcreateQDRFunctionLawHistoryByLawIdList();
    }
    protected HpQDRFunction<LawHistoryCB> xcreateQDRFunctionLawHistoryByLawIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveLawHistoryByLawIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveLawHistoryByLawIdList(String fn, SubQuery<LawHistoryCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawHistoryCB cb = new LawHistoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLawId_QueryDerivedReferrer_LawHistoryByLawIdList(cb.query()); String prpp = keepLawId_QueryDerivedReferrer_LawHistoryByLawIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LAW_ID", "LAW_ID", sqpp, "lawHistoryByLawIdList", rd, vl, prpp, op);
    }
    public abstract String keepLawId_QueryDerivedReferrer_LawHistoryByLawIdList(LawHistoryCQ sq);
    public abstract String keepLawId_QueryDerivedReferrer_LawHistoryByLawIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from LAW_SOURCE_REL where ...)} <br>
     * (法令取得元リレーション)LAW_SOURCE_REL by LAW_ID, named 'lawSourceRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedLawSourceRel()</span>.<span style="color: #CC4747">max</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     relCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<LawSourceRelCB> derivedLawSourceRel() {
        return xcreateQDRFunctionLawSourceRelList();
    }
    protected HpQDRFunction<LawSourceRelCB> xcreateQDRFunctionLawSourceRelList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveLawSourceRelList(fn, sq, rd, vl, op));
    }
    public void xqderiveLawSourceRelList(String fn, SubQuery<LawSourceRelCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawSourceRelCB cb = new LawSourceRelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLawId_QueryDerivedReferrer_LawSourceRelList(cb.query()); String prpp = keepLawId_QueryDerivedReferrer_LawSourceRelListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LAW_ID", "LAW_ID", sqpp, "lawSourceRelList", rd, vl, prpp, op);
    }
    public abstract String keepLawId_QueryDerivedReferrer_LawSourceRelList(LawSourceRelCQ sq);
    public abstract String keepLawId_QueryDerivedReferrer_LawSourceRelListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from SOURCE_LAW_CATEGORY_REL where ...)} <br>
     * (取得元法令カテゴリーリレーション)SOURCE_LAW_CATEGORY_REL by LAW_ID, named 'sourceLawCategoryRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedSourceLawCategoryRel()</span>.<span style="color: #CC4747">max</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     relCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<SourceLawCategoryRelCB> derivedSourceLawCategoryRel() {
        return xcreateQDRFunctionSourceLawCategoryRelList();
    }
    protected HpQDRFunction<SourceLawCategoryRelCB> xcreateQDRFunctionSourceLawCategoryRelList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveSourceLawCategoryRelList(fn, sq, rd, vl, op));
    }
    public void xqderiveSourceLawCategoryRelList(String fn, SubQuery<SourceLawCategoryRelCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SourceLawCategoryRelCB cb = new SourceLawCategoryRelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLawId_QueryDerivedReferrer_SourceLawCategoryRelList(cb.query()); String prpp = keepLawId_QueryDerivedReferrer_SourceLawCategoryRelListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LAW_ID", "LAW_ID", sqpp, "sourceLawCategoryRelList", rd, vl, prpp, op);
    }
    public abstract String keepLawId_QueryDerivedReferrer_SourceLawCategoryRelList(SourceLawCategoryRelCQ sq);
    public abstract String keepLawId_QueryDerivedReferrer_SourceLawCategoryRelListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (法令ID)LAW_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setLawId_IsNull() { regLawId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (法令ID)LAW_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setLawId_IsNotNull() { regLawId(CK_ISNN, DOBJ); }

    protected void regLawId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLawId(), "LAW_ID"); }
    protected abstract ConditionValue xgetCValueLawId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (法令種別コード)LAW_TYPE_CODE: {IX, NotNull, VARCHAR(20), FK to LAW_TYPE}
     * @param lawTypeCode The value of lawTypeCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawTypeCode_Equal(String lawTypeCode) {
        doSetLawTypeCode_Equal(fRES(lawTypeCode));
    }

    protected void doSetLawTypeCode_Equal(String lawTypeCode) {
        regLawTypeCode(CK_EQ, lawTypeCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (法令種別コード)LAW_TYPE_CODE: {IX, NotNull, VARCHAR(20), FK to LAW_TYPE}
     * @param lawTypeCode The value of lawTypeCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawTypeCode_NotEqual(String lawTypeCode) {
        doSetLawTypeCode_NotEqual(fRES(lawTypeCode));
    }

    protected void doSetLawTypeCode_NotEqual(String lawTypeCode) {
        regLawTypeCode(CK_NES, lawTypeCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (法令種別コード)LAW_TYPE_CODE: {IX, NotNull, VARCHAR(20), FK to LAW_TYPE}
     * @param lawTypeCodeList The collection of lawTypeCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawTypeCode_InScope(Collection<String> lawTypeCodeList) {
        doSetLawTypeCode_InScope(lawTypeCodeList);
    }

    protected void doSetLawTypeCode_InScope(Collection<String> lawTypeCodeList) {
        regINS(CK_INS, cTL(lawTypeCodeList), xgetCValueLawTypeCode(), "LAW_TYPE_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (法令種別コード)LAW_TYPE_CODE: {IX, NotNull, VARCHAR(20), FK to LAW_TYPE}
     * @param lawTypeCodeList The collection of lawTypeCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawTypeCode_NotInScope(Collection<String> lawTypeCodeList) {
        doSetLawTypeCode_NotInScope(lawTypeCodeList);
    }

    protected void doSetLawTypeCode_NotInScope(Collection<String> lawTypeCodeList) {
        regINS(CK_NINS, cTL(lawTypeCodeList), xgetCValueLawTypeCode(), "LAW_TYPE_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令種別コード)LAW_TYPE_CODE: {IX, NotNull, VARCHAR(20), FK to LAW_TYPE} <br>
     * <pre>e.g. setLawTypeCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param lawTypeCode The value of lawTypeCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLawTypeCode_LikeSearch(String lawTypeCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLawTypeCode_LikeSearch(lawTypeCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令種別コード)LAW_TYPE_CODE: {IX, NotNull, VARCHAR(20), FK to LAW_TYPE} <br>
     * <pre>e.g. setLawTypeCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lawTypeCode The value of lawTypeCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setLawTypeCode_LikeSearch(String lawTypeCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lawTypeCode), xgetCValueLawTypeCode(), "LAW_TYPE_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令種別コード)LAW_TYPE_CODE: {IX, NotNull, VARCHAR(20), FK to LAW_TYPE}
     * @param lawTypeCode The value of lawTypeCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLawTypeCode_NotLikeSearch(String lawTypeCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLawTypeCode_NotLikeSearch(lawTypeCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令種別コード)LAW_TYPE_CODE: {IX, NotNull, VARCHAR(20), FK to LAW_TYPE}
     * @param lawTypeCode The value of lawTypeCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLawTypeCode_NotLikeSearch(String lawTypeCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lawTypeCode), xgetCValueLawTypeCode(), "LAW_TYPE_CODE", likeSearchOption);
    }

    protected void regLawTypeCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLawTypeCode(), "LAW_TYPE_CODE"); }
    protected abstract ConditionValue xgetCValueLawTypeCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (法令公開コード)LAW_PUBLIC_CODE: {UQ, NotNull, VARCHAR(12)}
     * @param lawPublicCode The value of lawPublicCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawPublicCode_Equal(String lawPublicCode) {
        doSetLawPublicCode_Equal(fRES(lawPublicCode));
    }

    protected void doSetLawPublicCode_Equal(String lawPublicCode) {
        regLawPublicCode(CK_EQ, lawPublicCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (法令公開コード)LAW_PUBLIC_CODE: {UQ, NotNull, VARCHAR(12)}
     * @param lawPublicCode The value of lawPublicCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawPublicCode_NotEqual(String lawPublicCode) {
        doSetLawPublicCode_NotEqual(fRES(lawPublicCode));
    }

    protected void doSetLawPublicCode_NotEqual(String lawPublicCode) {
        regLawPublicCode(CK_NES, lawPublicCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (法令公開コード)LAW_PUBLIC_CODE: {UQ, NotNull, VARCHAR(12)}
     * @param lawPublicCodeList The collection of lawPublicCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawPublicCode_InScope(Collection<String> lawPublicCodeList) {
        doSetLawPublicCode_InScope(lawPublicCodeList);
    }

    protected void doSetLawPublicCode_InScope(Collection<String> lawPublicCodeList) {
        regINS(CK_INS, cTL(lawPublicCodeList), xgetCValueLawPublicCode(), "LAW_PUBLIC_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (法令公開コード)LAW_PUBLIC_CODE: {UQ, NotNull, VARCHAR(12)}
     * @param lawPublicCodeList The collection of lawPublicCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawPublicCode_NotInScope(Collection<String> lawPublicCodeList) {
        doSetLawPublicCode_NotInScope(lawPublicCodeList);
    }

    protected void doSetLawPublicCode_NotInScope(Collection<String> lawPublicCodeList) {
        regINS(CK_NINS, cTL(lawPublicCodeList), xgetCValueLawPublicCode(), "LAW_PUBLIC_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令公開コード)LAW_PUBLIC_CODE: {UQ, NotNull, VARCHAR(12)} <br>
     * <pre>e.g. setLawPublicCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param lawPublicCode The value of lawPublicCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLawPublicCode_LikeSearch(String lawPublicCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLawPublicCode_LikeSearch(lawPublicCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令公開コード)LAW_PUBLIC_CODE: {UQ, NotNull, VARCHAR(12)} <br>
     * <pre>e.g. setLawPublicCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lawPublicCode The value of lawPublicCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setLawPublicCode_LikeSearch(String lawPublicCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lawPublicCode), xgetCValueLawPublicCode(), "LAW_PUBLIC_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令公開コード)LAW_PUBLIC_CODE: {UQ, NotNull, VARCHAR(12)}
     * @param lawPublicCode The value of lawPublicCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLawPublicCode_NotLikeSearch(String lawPublicCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLawPublicCode_NotLikeSearch(lawPublicCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令公開コード)LAW_PUBLIC_CODE: {UQ, NotNull, VARCHAR(12)}
     * @param lawPublicCode The value of lawPublicCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLawPublicCode_NotLikeSearch(String lawPublicCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lawPublicCode), xgetCValueLawPublicCode(), "LAW_PUBLIC_CODE", likeSearchOption);
    }

    protected void regLawPublicCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLawPublicCode(), "LAW_PUBLIC_CODE"); }
    protected abstract ConditionValue xgetCValueLawPublicCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (法令名)LAW_NAME: {NotNull, TEXT(65535)}
     * @param lawName The value of lawName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawName_Equal(String lawName) {
        doSetLawName_Equal(fRES(lawName));
    }

    protected void doSetLawName_Equal(String lawName) {
        regLawName(CK_EQ, lawName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令名)LAW_NAME: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setLawName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param lawName The value of lawName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLawName_LikeSearch(String lawName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLawName_LikeSearch(lawName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令名)LAW_NAME: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setLawName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lawName The value of lawName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setLawName_LikeSearch(String lawName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lawName), xgetCValueLawName(), "LAW_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令名)LAW_NAME: {NotNull, TEXT(65535)}
     * @param lawName The value of lawName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLawName_NotLikeSearch(String lawName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLawName_NotLikeSearch(lawName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令名)LAW_NAME: {NotNull, TEXT(65535)}
     * @param lawName The value of lawName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLawName_NotLikeSearch(String lawName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lawName), xgetCValueLawName(), "LAW_NAME", likeSearchOption);
    }

    protected void regLawName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLawName(), "LAW_NAME"); }
    protected abstract ConditionValue xgetCValueLawName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (法令番号)LAW_NUMBER: {UQ, NotNull, VARCHAR(200)}
     * @param lawNumber The value of lawNumber as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawNumber_Equal(String lawNumber) {
        doSetLawNumber_Equal(fRES(lawNumber));
    }

    protected void doSetLawNumber_Equal(String lawNumber) {
        regLawNumber(CK_EQ, lawNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (法令番号)LAW_NUMBER: {UQ, NotNull, VARCHAR(200)}
     * @param lawNumber The value of lawNumber as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawNumber_NotEqual(String lawNumber) {
        doSetLawNumber_NotEqual(fRES(lawNumber));
    }

    protected void doSetLawNumber_NotEqual(String lawNumber) {
        regLawNumber(CK_NES, lawNumber);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (法令番号)LAW_NUMBER: {UQ, NotNull, VARCHAR(200)}
     * @param lawNumberList The collection of lawNumber as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawNumber_InScope(Collection<String> lawNumberList) {
        doSetLawNumber_InScope(lawNumberList);
    }

    protected void doSetLawNumber_InScope(Collection<String> lawNumberList) {
        regINS(CK_INS, cTL(lawNumberList), xgetCValueLawNumber(), "LAW_NUMBER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (法令番号)LAW_NUMBER: {UQ, NotNull, VARCHAR(200)}
     * @param lawNumberList The collection of lawNumber as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawNumber_NotInScope(Collection<String> lawNumberList) {
        doSetLawNumber_NotInScope(lawNumberList);
    }

    protected void doSetLawNumber_NotInScope(Collection<String> lawNumberList) {
        regINS(CK_NINS, cTL(lawNumberList), xgetCValueLawNumber(), "LAW_NUMBER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令番号)LAW_NUMBER: {UQ, NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setLawNumber_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param lawNumber The value of lawNumber as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLawNumber_LikeSearch(String lawNumber, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLawNumber_LikeSearch(lawNumber, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令番号)LAW_NUMBER: {UQ, NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setLawNumber_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lawNumber The value of lawNumber as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setLawNumber_LikeSearch(String lawNumber, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lawNumber), xgetCValueLawNumber(), "LAW_NUMBER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令番号)LAW_NUMBER: {UQ, NotNull, VARCHAR(200)}
     * @param lawNumber The value of lawNumber as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLawNumber_NotLikeSearch(String lawNumber, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLawNumber_NotLikeSearch(lawNumber, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令番号)LAW_NUMBER: {UQ, NotNull, VARCHAR(200)}
     * @param lawNumber The value of lawNumber as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLawNumber_NotLikeSearch(String lawNumber, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lawNumber), xgetCValueLawNumber(), "LAW_NUMBER", likeSearchOption);
    }

    protected void regLawNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLawNumber(), "LAW_NUMBER"); }
    protected abstract ConditionValue xgetCValueLawNumber();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (公布日)PROMULGATION_DATE: {DATE(10)}
     * @param promulgationDate The value of promulgationDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPromulgationDate_Equal(java.time.LocalDate promulgationDate) {
        regPromulgationDate(CK_EQ,  promulgationDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (公布日)PROMULGATION_DATE: {DATE(10)}
     * @param promulgationDate The value of promulgationDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPromulgationDate_GreaterThan(java.time.LocalDate promulgationDate) {
        regPromulgationDate(CK_GT,  promulgationDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (公布日)PROMULGATION_DATE: {DATE(10)}
     * @param promulgationDate The value of promulgationDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPromulgationDate_LessThan(java.time.LocalDate promulgationDate) {
        regPromulgationDate(CK_LT,  promulgationDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (公布日)PROMULGATION_DATE: {DATE(10)}
     * @param promulgationDate The value of promulgationDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPromulgationDate_GreaterEqual(java.time.LocalDate promulgationDate) {
        regPromulgationDate(CK_GE,  promulgationDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (公布日)PROMULGATION_DATE: {DATE(10)}
     * @param promulgationDate The value of promulgationDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPromulgationDate_LessEqual(java.time.LocalDate promulgationDate) {
        regPromulgationDate(CK_LE, promulgationDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (公布日)PROMULGATION_DATE: {DATE(10)}
     * <pre>e.g. setPromulgationDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of promulgationDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of promulgationDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setPromulgationDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setPromulgationDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (公布日)PROMULGATION_DATE: {DATE(10)}
     * <pre>e.g. setPromulgationDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of promulgationDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of promulgationDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setPromulgationDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "PROMULGATION_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValuePromulgationDate(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (公布日)PROMULGATION_DATE: {DATE(10)}
     */
    public void setPromulgationDate_IsNull() { regPromulgationDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (公布日)PROMULGATION_DATE: {DATE(10)}
     */
    public void setPromulgationDate_IsNotNull() { regPromulgationDate(CK_ISNN, DOBJ); }

    protected void regPromulgationDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePromulgationDate(), "PROMULGATION_DATE"); }
    protected abstract ConditionValue xgetCValuePromulgationDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (施行日)EFFECTIVE_DATE: {DATE(10)}
     * @param effectiveDate The value of effectiveDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEffectiveDate_Equal(java.time.LocalDate effectiveDate) {
        regEffectiveDate(CK_EQ,  effectiveDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (施行日)EFFECTIVE_DATE: {DATE(10)}
     * @param effectiveDate The value of effectiveDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEffectiveDate_GreaterThan(java.time.LocalDate effectiveDate) {
        regEffectiveDate(CK_GT,  effectiveDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (施行日)EFFECTIVE_DATE: {DATE(10)}
     * @param effectiveDate The value of effectiveDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEffectiveDate_LessThan(java.time.LocalDate effectiveDate) {
        regEffectiveDate(CK_LT,  effectiveDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (施行日)EFFECTIVE_DATE: {DATE(10)}
     * @param effectiveDate The value of effectiveDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEffectiveDate_GreaterEqual(java.time.LocalDate effectiveDate) {
        regEffectiveDate(CK_GE,  effectiveDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (施行日)EFFECTIVE_DATE: {DATE(10)}
     * @param effectiveDate The value of effectiveDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEffectiveDate_LessEqual(java.time.LocalDate effectiveDate) {
        regEffectiveDate(CK_LE, effectiveDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (施行日)EFFECTIVE_DATE: {DATE(10)}
     * <pre>e.g. setEffectiveDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of effectiveDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of effectiveDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setEffectiveDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setEffectiveDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (施行日)EFFECTIVE_DATE: {DATE(10)}
     * <pre>e.g. setEffectiveDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of effectiveDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of effectiveDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setEffectiveDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "EFFECTIVE_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueEffectiveDate(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (施行日)EFFECTIVE_DATE: {DATE(10)}
     */
    public void setEffectiveDate_IsNull() { regEffectiveDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (施行日)EFFECTIVE_DATE: {DATE(10)}
     */
    public void setEffectiveDate_IsNotNull() { regEffectiveDate(CK_ISNN, DOBJ); }

    protected void regEffectiveDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEffectiveDate(), "EFFECTIVE_DATE"); }
    protected abstract ConditionValue xgetCValueEffectiveDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_Equal(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegisterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "REGISTER_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRegisterDatetime(), nm, op);
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterDatetime(), "REGISTER_DATETIME"); }
    protected abstract ConditionValue xgetCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_Equal(String registerUser) {
        doSetRegisterUser_Equal(fRES(registerUser));
    }

    protected void doSetRegisterUser_Equal(String registerUser) {
        regRegisterUser(CK_EQ, registerUser);
    }

    protected void regRegisterUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterUser(), "REGISTER_USER"); }
    protected abstract ConditionValue xgetCValueRegisterUser();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_Equal(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdateDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "UPDATE_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdateDatetime(), nm, op);
    }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDatetime(), "UPDATE_DATETIME"); }
    protected abstract ConditionValue xgetCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_Equal(String updateUser) {
        doSetUpdateUser_Equal(fRES(updateUser));
    }

    protected void doSetUpdateUser_Equal(String updateUser) {
        regUpdateUser(CK_EQ, updateUser);
    }

    protected void regUpdateUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateUser(), "UPDATE_USER"); }
    protected abstract ConditionValue xgetCValueUpdateUser();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]}
     * @param versionNo The value of versionNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_Equal(Long versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Long versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVersionNo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setVersionNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVersionNo(), "VERSION_NO"); }
    protected abstract ConditionValue xgetCValueVersionNo();

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
    public HpSLCFunction<LawCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, LawCB.class);
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
    public HpSLCFunction<LawCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, LawCB.class);
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
    public HpSLCFunction<LawCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, LawCB.class);
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
    public HpSLCFunction<LawCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, LawCB.class);
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
    public HpSLCFunction<LawCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, LawCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;LawCB&gt;() {
     *     public void query(LawCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<LawCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, LawCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        LawCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(LawCQ sq);

    protected LawCB xcreateScalarConditionCB() {
        LawCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected LawCB xcreateScalarConditionPartitionByCB() {
        LawCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<LawCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawCB cb = new LawCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "LAW_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(LawCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<LawCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(LawCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawCB cb = new LawCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "LAW_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(LawCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<LawCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LawCB cb = new LawCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(LawCQ sq);

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
    protected LawCB newMyCB() {
        return new LawCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return LawCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
