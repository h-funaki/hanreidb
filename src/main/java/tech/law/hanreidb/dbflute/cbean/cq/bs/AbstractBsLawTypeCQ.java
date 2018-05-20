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
 * The abstract condition-query of LAW_TYPE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsLawTypeCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsLawTypeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "LAW_TYPE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (法令種別コード)LAW_TYPE_CODE: {PK, NotNull, VARCHAR(20)}
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
     * (法令種別コード)LAW_TYPE_CODE: {PK, NotNull, VARCHAR(20)}
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
     * (法令種別コード)LAW_TYPE_CODE: {PK, NotNull, VARCHAR(20)}
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
     * (法令種別コード)LAW_TYPE_CODE: {PK, NotNull, VARCHAR(20)}
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
     * (法令種別コード)LAW_TYPE_CODE: {PK, NotNull, VARCHAR(20)} <br>
     * <pre>e.g. setLawTypeCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param lawTypeCode The value of lawTypeCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLawTypeCode_LikeSearch(String lawTypeCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLawTypeCode_LikeSearch(lawTypeCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令種別コード)LAW_TYPE_CODE: {PK, NotNull, VARCHAR(20)} <br>
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
     * (法令種別コード)LAW_TYPE_CODE: {PK, NotNull, VARCHAR(20)}
     * @param lawTypeCode The value of lawTypeCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLawTypeCode_NotLikeSearch(String lawTypeCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLawTypeCode_NotLikeSearch(lawTypeCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令種別コード)LAW_TYPE_CODE: {PK, NotNull, VARCHAR(20)}
     * @param lawTypeCode The value of lawTypeCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLawTypeCode_NotLikeSearch(String lawTypeCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lawTypeCode), xgetCValueLawTypeCode(), "LAW_TYPE_CODE", likeSearchOption);
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LAW_TYPE_CODE from LAW where ...)} <br>
     * (法令)LAW by LAW_TYPE_CODE, named 'lawAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsLaw</span>(lawCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lawCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LawList for 'exists'. (NotNull)
     */
    public void existsLaw(SubQuery<LawCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LawCB cb = new LawCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLawTypeCode_ExistsReferrer_LawList(cb.query());
        registerExistsReferrer(cb.query(), "LAW_TYPE_CODE", "LAW_TYPE_CODE", pp, "lawList");
    }
    public abstract String keepLawTypeCode_ExistsReferrer_LawList(LawCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LAW_TYPE_CODE from LAW where ...)} <br>
     * (法令)LAW by LAW_TYPE_CODE, named 'lawAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsLaw</span>(lawCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lawCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LawTypeCode_NotExistsReferrer_LawList for 'not exists'. (NotNull)
     */
    public void notExistsLaw(SubQuery<LawCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LawCB cb = new LawCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLawTypeCode_NotExistsReferrer_LawList(cb.query());
        registerNotExistsReferrer(cb.query(), "LAW_TYPE_CODE", "LAW_TYPE_CODE", pp, "lawList");
    }
    public abstract String keepLawTypeCode_NotExistsReferrer_LawList(LawCQ sq);

    public void xsderiveLawList(String fn, SubQuery<LawCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawCB cb = new LawCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLawTypeCode_SpecifyDerivedReferrer_LawList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LAW_TYPE_CODE", "LAW_TYPE_CODE", pp, "lawList", al, op);
    }
    public abstract String keepLawTypeCode_SpecifyDerivedReferrer_LawList(LawCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from LAW where ...)} <br>
     * (法令)LAW by LAW_TYPE_CODE, named 'lawAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedLaw()</span>.<span style="color: #CC4747">max</span>(lawCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lawCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     lawCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<LawCB> derivedLaw() {
        return xcreateQDRFunctionLawList();
    }
    protected HpQDRFunction<LawCB> xcreateQDRFunctionLawList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveLawList(fn, sq, rd, vl, op));
    }
    public void xqderiveLawList(String fn, SubQuery<LawCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawCB cb = new LawCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLawTypeCode_QueryDerivedReferrer_LawList(cb.query()); String prpp = keepLawTypeCode_QueryDerivedReferrer_LawListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LAW_TYPE_CODE", "LAW_TYPE_CODE", sqpp, "lawList", rd, vl, prpp, op);
    }
    public abstract String keepLawTypeCode_QueryDerivedReferrer_LawList(LawCQ sq);
    public abstract String keepLawTypeCode_QueryDerivedReferrer_LawListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (法令種別コード)LAW_TYPE_CODE: {PK, NotNull, VARCHAR(20)}
     */
    public void setLawTypeCode_IsNull() { regLawTypeCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (法令種別コード)LAW_TYPE_CODE: {PK, NotNull, VARCHAR(20)}
     */
    public void setLawTypeCode_IsNotNull() { regLawTypeCode(CK_ISNN, DOBJ); }

    protected void regLawTypeCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLawTypeCode(), "LAW_TYPE_CODE"); }
    protected abstract ConditionValue xgetCValueLawTypeCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (法令種別)LAW_TYPE_NAME: {UQ, NotNull, VARCHAR(20)}
     * @param lawTypeName The value of lawTypeName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawTypeName_Equal(String lawTypeName) {
        doSetLawTypeName_Equal(fRES(lawTypeName));
    }

    protected void doSetLawTypeName_Equal(String lawTypeName) {
        regLawTypeName(CK_EQ, lawTypeName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令種別)LAW_TYPE_NAME: {UQ, NotNull, VARCHAR(20)} <br>
     * <pre>e.g. setLawTypeName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param lawTypeName The value of lawTypeName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLawTypeName_LikeSearch(String lawTypeName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLawTypeName_LikeSearch(lawTypeName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令種別)LAW_TYPE_NAME: {UQ, NotNull, VARCHAR(20)} <br>
     * <pre>e.g. setLawTypeName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lawTypeName The value of lawTypeName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setLawTypeName_LikeSearch(String lawTypeName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lawTypeName), xgetCValueLawTypeName(), "LAW_TYPE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令種別)LAW_TYPE_NAME: {UQ, NotNull, VARCHAR(20)}
     * @param lawTypeName The value of lawTypeName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLawTypeName_NotLikeSearch(String lawTypeName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLawTypeName_NotLikeSearch(lawTypeName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令種別)LAW_TYPE_NAME: {UQ, NotNull, VARCHAR(20)}
     * @param lawTypeName The value of lawTypeName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLawTypeName_NotLikeSearch(String lawTypeName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lawTypeName), xgetCValueLawTypeName(), "LAW_TYPE_NAME", likeSearchOption);
    }

    protected void regLawTypeName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLawTypeName(), "LAW_TYPE_NAME"); }
    protected abstract ConditionValue xgetCValueLawTypeName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (法令種別別名)LAW_TYPE_ALIAS: {UQ, NotNull, VARCHAR(20)}
     * @param lawTypeAlias The value of lawTypeAlias as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawTypeAlias_Equal(String lawTypeAlias) {
        doSetLawTypeAlias_Equal(fRES(lawTypeAlias));
    }

    protected void doSetLawTypeAlias_Equal(String lawTypeAlias) {
        regLawTypeAlias(CK_EQ, lawTypeAlias);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (法令種別別名)LAW_TYPE_ALIAS: {UQ, NotNull, VARCHAR(20)}
     * @param lawTypeAlias The value of lawTypeAlias as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawTypeAlias_NotEqual(String lawTypeAlias) {
        doSetLawTypeAlias_NotEqual(fRES(lawTypeAlias));
    }

    protected void doSetLawTypeAlias_NotEqual(String lawTypeAlias) {
        regLawTypeAlias(CK_NES, lawTypeAlias);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (法令種別別名)LAW_TYPE_ALIAS: {UQ, NotNull, VARCHAR(20)}
     * @param lawTypeAliasList The collection of lawTypeAlias as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawTypeAlias_InScope(Collection<String> lawTypeAliasList) {
        doSetLawTypeAlias_InScope(lawTypeAliasList);
    }

    protected void doSetLawTypeAlias_InScope(Collection<String> lawTypeAliasList) {
        regINS(CK_INS, cTL(lawTypeAliasList), xgetCValueLawTypeAlias(), "LAW_TYPE_ALIAS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (法令種別別名)LAW_TYPE_ALIAS: {UQ, NotNull, VARCHAR(20)}
     * @param lawTypeAliasList The collection of lawTypeAlias as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawTypeAlias_NotInScope(Collection<String> lawTypeAliasList) {
        doSetLawTypeAlias_NotInScope(lawTypeAliasList);
    }

    protected void doSetLawTypeAlias_NotInScope(Collection<String> lawTypeAliasList) {
        regINS(CK_NINS, cTL(lawTypeAliasList), xgetCValueLawTypeAlias(), "LAW_TYPE_ALIAS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令種別別名)LAW_TYPE_ALIAS: {UQ, NotNull, VARCHAR(20)} <br>
     * <pre>e.g. setLawTypeAlias_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param lawTypeAlias The value of lawTypeAlias as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLawTypeAlias_LikeSearch(String lawTypeAlias, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLawTypeAlias_LikeSearch(lawTypeAlias, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令種別別名)LAW_TYPE_ALIAS: {UQ, NotNull, VARCHAR(20)} <br>
     * <pre>e.g. setLawTypeAlias_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lawTypeAlias The value of lawTypeAlias as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setLawTypeAlias_LikeSearch(String lawTypeAlias, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lawTypeAlias), xgetCValueLawTypeAlias(), "LAW_TYPE_ALIAS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令種別別名)LAW_TYPE_ALIAS: {UQ, NotNull, VARCHAR(20)}
     * @param lawTypeAlias The value of lawTypeAlias as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLawTypeAlias_NotLikeSearch(String lawTypeAlias, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLawTypeAlias_NotLikeSearch(lawTypeAlias, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令種別別名)LAW_TYPE_ALIAS: {UQ, NotNull, VARCHAR(20)}
     * @param lawTypeAlias The value of lawTypeAlias as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLawTypeAlias_NotLikeSearch(String lawTypeAlias, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lawTypeAlias), xgetCValueLawTypeAlias(), "LAW_TYPE_ALIAS", likeSearchOption);
    }

    protected void regLawTypeAlias(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLawTypeAlias(), "LAW_TYPE_ALIAS"); }
    protected abstract ConditionValue xgetCValueLawTypeAlias();

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
    public HpSLCFunction<LawTypeCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, LawTypeCB.class);
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
    public HpSLCFunction<LawTypeCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, LawTypeCB.class);
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
    public HpSLCFunction<LawTypeCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, LawTypeCB.class);
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
    public HpSLCFunction<LawTypeCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, LawTypeCB.class);
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
    public HpSLCFunction<LawTypeCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, LawTypeCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;LawTypeCB&gt;() {
     *     public void query(LawTypeCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<LawTypeCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, LawTypeCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        LawTypeCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(LawTypeCQ sq);

    protected LawTypeCB xcreateScalarConditionCB() {
        LawTypeCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected LawTypeCB xcreateScalarConditionPartitionByCB() {
        LawTypeCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<LawTypeCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawTypeCB cb = new LawTypeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "LAW_TYPE_CODE";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(LawTypeCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<LawTypeCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(LawTypeCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawTypeCB cb = new LawTypeCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "LAW_TYPE_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(LawTypeCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<LawTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LawTypeCB cb = new LawTypeCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(LawTypeCQ sq);

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
    protected LawTypeCB newMyCB() {
        return new LawTypeCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return LawTypeCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
