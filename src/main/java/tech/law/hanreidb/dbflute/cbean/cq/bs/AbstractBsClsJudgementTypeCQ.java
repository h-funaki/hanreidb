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
 * The abstract condition-query of CLS_JUDGEMENT_TYPE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsClsJudgementTypeCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsClsJudgementTypeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "CLS_JUDGEMENT_TYPE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (判決種別コード)JUDGEMENT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=JudgementType}
     * @param judgementTypeCode The value of judgementTypeCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementTypeCode_Equal(String judgementTypeCode) {
        doSetJudgementTypeCode_Equal(fRES(judgementTypeCode));
    }

    /**
     * Equal(=). As JudgementType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (判決種別コード)JUDGEMENT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=JudgementType} <br>
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
     * (判決種別コード)JUDGEMENT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=JudgementType}
     * @param judgementTypeCode The value of judgementTypeCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementTypeCode_NotEqual(String judgementTypeCode) {
        doSetJudgementTypeCode_NotEqual(fRES(judgementTypeCode));
    }

    /**
     * NotEqual(&lt;&gt;). As JudgementType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (判決種別コード)JUDGEMENT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=JudgementType} <br>
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
     * (判決種別コード)JUDGEMENT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=JudgementType}
     * @param judgementTypeCodeList The collection of judgementTypeCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementTypeCode_InScope(Collection<String> judgementTypeCodeList) {
        doSetJudgementTypeCode_InScope(judgementTypeCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As JudgementType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (判決種別コード)JUDGEMENT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=JudgementType} <br>
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
     * (判決種別コード)JUDGEMENT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=JudgementType}
     * @param judgementTypeCodeList The collection of judgementTypeCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementTypeCode_NotInScope(Collection<String> judgementTypeCodeList) {
        doSetJudgementTypeCode_NotInScope(judgementTypeCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As JudgementType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (判決種別コード)JUDGEMENT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=JudgementType} <br>
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementTypeCode_NotInScope_AsJudgementType(Collection<CDef.JudgementType> cdefList) {
        doSetJudgementTypeCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetJudgementTypeCode_NotInScope(Collection<String> judgementTypeCodeList) {
        regINS(CK_NINS, cTL(judgementTypeCodeList), xgetCValueJudgementTypeCode(), "JUDGEMENT_TYPE_CODE");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select JUDGEMENT_TYPE_CODE from JUDGEMENT where ...)} <br>
     * (判決)JUDGEMENT by JUDGEMENT_TYPE_CODE, named 'judgementAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsJudgement</span>(judgementCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     judgementCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of JudgementList for 'exists'. (NotNull)
     */
    public void existsJudgement(SubQuery<JudgementCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        JudgementCB cb = new JudgementCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepJudgementTypeCode_ExistsReferrer_JudgementList(cb.query());
        registerExistsReferrer(cb.query(), "JUDGEMENT_TYPE_CODE", "JUDGEMENT_TYPE_CODE", pp, "judgementList");
    }
    public abstract String keepJudgementTypeCode_ExistsReferrer_JudgementList(JudgementCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select JUDGEMENT_TYPE_CODE from JUDGEMENT where ...)} <br>
     * (判決)JUDGEMENT by JUDGEMENT_TYPE_CODE, named 'judgementAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsJudgement</span>(judgementCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     judgementCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of JudgementTypeCode_NotExistsReferrer_JudgementList for 'not exists'. (NotNull)
     */
    public void notExistsJudgement(SubQuery<JudgementCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        JudgementCB cb = new JudgementCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepJudgementTypeCode_NotExistsReferrer_JudgementList(cb.query());
        registerNotExistsReferrer(cb.query(), "JUDGEMENT_TYPE_CODE", "JUDGEMENT_TYPE_CODE", pp, "judgementList");
    }
    public abstract String keepJudgementTypeCode_NotExistsReferrer_JudgementList(JudgementCQ sq);

    public void xsderiveJudgementList(String fn, SubQuery<JudgementCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementCB cb = new JudgementCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepJudgementTypeCode_SpecifyDerivedReferrer_JudgementList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "JUDGEMENT_TYPE_CODE", "JUDGEMENT_TYPE_CODE", pp, "judgementList", al, op);
    }
    public abstract String keepJudgementTypeCode_SpecifyDerivedReferrer_JudgementList(JudgementCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from JUDGEMENT where ...)} <br>
     * (判決)JUDGEMENT by JUDGEMENT_TYPE_CODE, named 'judgementAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedJudgement()</span>.<span style="color: #CC4747">max</span>(judgementCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     judgementCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     judgementCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<JudgementCB> derivedJudgement() {
        return xcreateQDRFunctionJudgementList();
    }
    protected HpQDRFunction<JudgementCB> xcreateQDRFunctionJudgementList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveJudgementList(fn, sq, rd, vl, op));
    }
    public void xqderiveJudgementList(String fn, SubQuery<JudgementCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementCB cb = new JudgementCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepJudgementTypeCode_QueryDerivedReferrer_JudgementList(cb.query()); String prpp = keepJudgementTypeCode_QueryDerivedReferrer_JudgementListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "JUDGEMENT_TYPE_CODE", "JUDGEMENT_TYPE_CODE", sqpp, "judgementList", rd, vl, prpp, op);
    }
    public abstract String keepJudgementTypeCode_QueryDerivedReferrer_JudgementList(JudgementCQ sq);
    public abstract String keepJudgementTypeCode_QueryDerivedReferrer_JudgementListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (判決種別コード)JUDGEMENT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=JudgementType}
     */
    public void setJudgementTypeCode_IsNull() { regJudgementTypeCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (判決種別コード)JUDGEMENT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=JudgementType}
     */
    public void setJudgementTypeCode_IsNotNull() { regJudgementTypeCode(CK_ISNN, DOBJ); }

    protected void regJudgementTypeCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJudgementTypeCode(), "JUDGEMENT_TYPE_CODE"); }
    protected abstract ConditionValue xgetCValueJudgementTypeCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (判決種別名)JUDGEMENT_TYPE_NAME: {UQ, NotNull, VARCHAR(10)}
     * @param judgementTypeName The value of judgementTypeName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementTypeName_Equal(String judgementTypeName) {
        doSetJudgementTypeName_Equal(fRES(judgementTypeName));
    }

    protected void doSetJudgementTypeName_Equal(String judgementTypeName) {
        regJudgementTypeName(CK_EQ, judgementTypeName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判決種別名)JUDGEMENT_TYPE_NAME: {UQ, NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setJudgementTypeName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param judgementTypeName The value of judgementTypeName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setJudgementTypeName_LikeSearch(String judgementTypeName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setJudgementTypeName_LikeSearch(judgementTypeName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判決種別名)JUDGEMENT_TYPE_NAME: {UQ, NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setJudgementTypeName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param judgementTypeName The value of judgementTypeName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setJudgementTypeName_LikeSearch(String judgementTypeName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(judgementTypeName), xgetCValueJudgementTypeName(), "JUDGEMENT_TYPE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判決種別名)JUDGEMENT_TYPE_NAME: {UQ, NotNull, VARCHAR(10)}
     * @param judgementTypeName The value of judgementTypeName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setJudgementTypeName_NotLikeSearch(String judgementTypeName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setJudgementTypeName_NotLikeSearch(judgementTypeName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判決種別名)JUDGEMENT_TYPE_NAME: {UQ, NotNull, VARCHAR(10)}
     * @param judgementTypeName The value of judgementTypeName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setJudgementTypeName_NotLikeSearch(String judgementTypeName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(judgementTypeName), xgetCValueJudgementTypeName(), "JUDGEMENT_TYPE_NAME", likeSearchOption);
    }

    protected void regJudgementTypeName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJudgementTypeName(), "JUDGEMENT_TYPE_NAME"); }
    protected abstract ConditionValue xgetCValueJudgementTypeName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (判決種別別名)JUDGEMENT_TYPE_ALIAS: {UQ, NotNull, VARCHAR(10)}
     * @param judgementTypeAlias The value of judgementTypeAlias as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementTypeAlias_Equal(String judgementTypeAlias) {
        doSetJudgementTypeAlias_Equal(fRES(judgementTypeAlias));
    }

    protected void doSetJudgementTypeAlias_Equal(String judgementTypeAlias) {
        regJudgementTypeAlias(CK_EQ, judgementTypeAlias);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (判決種別別名)JUDGEMENT_TYPE_ALIAS: {UQ, NotNull, VARCHAR(10)}
     * @param judgementTypeAlias The value of judgementTypeAlias as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementTypeAlias_NotEqual(String judgementTypeAlias) {
        doSetJudgementTypeAlias_NotEqual(fRES(judgementTypeAlias));
    }

    protected void doSetJudgementTypeAlias_NotEqual(String judgementTypeAlias) {
        regJudgementTypeAlias(CK_NES, judgementTypeAlias);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (判決種別別名)JUDGEMENT_TYPE_ALIAS: {UQ, NotNull, VARCHAR(10)}
     * @param judgementTypeAliasList The collection of judgementTypeAlias as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementTypeAlias_InScope(Collection<String> judgementTypeAliasList) {
        doSetJudgementTypeAlias_InScope(judgementTypeAliasList);
    }

    protected void doSetJudgementTypeAlias_InScope(Collection<String> judgementTypeAliasList) {
        regINS(CK_INS, cTL(judgementTypeAliasList), xgetCValueJudgementTypeAlias(), "JUDGEMENT_TYPE_ALIAS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (判決種別別名)JUDGEMENT_TYPE_ALIAS: {UQ, NotNull, VARCHAR(10)}
     * @param judgementTypeAliasList The collection of judgementTypeAlias as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementTypeAlias_NotInScope(Collection<String> judgementTypeAliasList) {
        doSetJudgementTypeAlias_NotInScope(judgementTypeAliasList);
    }

    protected void doSetJudgementTypeAlias_NotInScope(Collection<String> judgementTypeAliasList) {
        regINS(CK_NINS, cTL(judgementTypeAliasList), xgetCValueJudgementTypeAlias(), "JUDGEMENT_TYPE_ALIAS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判決種別別名)JUDGEMENT_TYPE_ALIAS: {UQ, NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setJudgementTypeAlias_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param judgementTypeAlias The value of judgementTypeAlias as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setJudgementTypeAlias_LikeSearch(String judgementTypeAlias, ConditionOptionCall<LikeSearchOption> opLambda) {
        setJudgementTypeAlias_LikeSearch(judgementTypeAlias, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判決種別別名)JUDGEMENT_TYPE_ALIAS: {UQ, NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setJudgementTypeAlias_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param judgementTypeAlias The value of judgementTypeAlias as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setJudgementTypeAlias_LikeSearch(String judgementTypeAlias, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(judgementTypeAlias), xgetCValueJudgementTypeAlias(), "JUDGEMENT_TYPE_ALIAS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判決種別別名)JUDGEMENT_TYPE_ALIAS: {UQ, NotNull, VARCHAR(10)}
     * @param judgementTypeAlias The value of judgementTypeAlias as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setJudgementTypeAlias_NotLikeSearch(String judgementTypeAlias, ConditionOptionCall<LikeSearchOption> opLambda) {
        setJudgementTypeAlias_NotLikeSearch(judgementTypeAlias, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判決種別別名)JUDGEMENT_TYPE_ALIAS: {UQ, NotNull, VARCHAR(10)}
     * @param judgementTypeAlias The value of judgementTypeAlias as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setJudgementTypeAlias_NotLikeSearch(String judgementTypeAlias, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(judgementTypeAlias), xgetCValueJudgementTypeAlias(), "JUDGEMENT_TYPE_ALIAS", likeSearchOption);
    }

    protected void regJudgementTypeAlias(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJudgementTypeAlias(), "JUDGEMENT_TYPE_ALIAS"); }
    protected abstract ConditionValue xgetCValueJudgementTypeAlias();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (説明)DESCRIPTION: {NotNull, TEXT(65535)}
     * @param description The value of description as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setDescription_Equal(String description) {
        doSetDescription_Equal(fRES(description));
    }

    protected void doSetDescription_Equal(String description) {
        regDescription(CK_EQ, description);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (説明)DESCRIPTION: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setDescription_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param description The value of description as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDescription_LikeSearch(String description, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDescription_LikeSearch(description, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (説明)DESCRIPTION: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setDescription_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param description The value of description as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setDescription_LikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(description), xgetCValueDescription(), "DESCRIPTION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (説明)DESCRIPTION: {NotNull, TEXT(65535)}
     * @param description The value of description as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDescription_NotLikeSearch(String description, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDescription_NotLikeSearch(description, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (説明)DESCRIPTION: {NotNull, TEXT(65535)}
     * @param description The value of description as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setDescription_NotLikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(description), xgetCValueDescription(), "DESCRIPTION", likeSearchOption);
    }

    protected void regDescription(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDescription(), "DESCRIPTION"); }
    protected abstract ConditionValue xgetCValueDescription();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (順番)DISPLAY_ORDER: {UQ, NotNull, INT UNSIGNED(10)}
     * @param displayOrder The value of displayOrder as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDisplayOrder_Equal(Integer displayOrder) {
        doSetDisplayOrder_Equal(displayOrder);
    }

    protected void doSetDisplayOrder_Equal(Integer displayOrder) {
        regDisplayOrder(CK_EQ, displayOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (順番)DISPLAY_ORDER: {UQ, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of displayOrder. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of displayOrder. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDisplayOrder_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDisplayOrder_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (順番)DISPLAY_ORDER: {UQ, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of displayOrder. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of displayOrder. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDisplayOrder_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDisplayOrder(), "DISPLAY_ORDER", rangeOfOption);
    }

    protected void regDisplayOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDisplayOrder(), "DISPLAY_ORDER"); }
    protected abstract ConditionValue xgetCValueDisplayOrder();

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
    public HpSLCFunction<ClsJudgementTypeCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ClsJudgementTypeCB.class);
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
    public HpSLCFunction<ClsJudgementTypeCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ClsJudgementTypeCB.class);
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
    public HpSLCFunction<ClsJudgementTypeCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ClsJudgementTypeCB.class);
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
    public HpSLCFunction<ClsJudgementTypeCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ClsJudgementTypeCB.class);
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
    public HpSLCFunction<ClsJudgementTypeCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ClsJudgementTypeCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ClsJudgementTypeCB&gt;() {
     *     public void query(ClsJudgementTypeCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ClsJudgementTypeCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ClsJudgementTypeCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ClsJudgementTypeCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ClsJudgementTypeCQ sq);

    protected ClsJudgementTypeCB xcreateScalarConditionCB() {
        ClsJudgementTypeCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ClsJudgementTypeCB xcreateScalarConditionPartitionByCB() {
        ClsJudgementTypeCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ClsJudgementTypeCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ClsJudgementTypeCB cb = new ClsJudgementTypeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "JUDGEMENT_TYPE_CODE";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ClsJudgementTypeCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ClsJudgementTypeCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ClsJudgementTypeCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ClsJudgementTypeCB cb = new ClsJudgementTypeCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "JUDGEMENT_TYPE_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ClsJudgementTypeCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ClsJudgementTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ClsJudgementTypeCB cb = new ClsJudgementTypeCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ClsJudgementTypeCQ sq);

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
    protected ClsJudgementTypeCB newMyCB() {
        return new ClsJudgementTypeCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ClsJudgementTypeCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
