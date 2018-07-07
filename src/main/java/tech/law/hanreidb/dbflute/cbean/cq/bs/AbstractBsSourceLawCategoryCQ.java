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
 * The abstract condition-query of SOURCE_LAW_CATEGORY.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsSourceLawCategoryCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsSourceLawCategoryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "SOURCE_LAW_CATEGORY";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元法令カテゴリーID)SOURCE_LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)}
     * @param sourceLawCategoryId The value of sourceLawCategoryId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceLawCategoryId_Equal(Integer sourceLawCategoryId) {
        doSetSourceLawCategoryId_Equal(sourceLawCategoryId);
    }

    protected void doSetSourceLawCategoryId_Equal(Integer sourceLawCategoryId) {
        regSourceLawCategoryId(CK_EQ, sourceLawCategoryId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元法令カテゴリーID)SOURCE_LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)}
     * @param sourceLawCategoryId The value of sourceLawCategoryId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceLawCategoryId_NotEqual(Integer sourceLawCategoryId) {
        doSetSourceLawCategoryId_NotEqual(sourceLawCategoryId);
    }

    protected void doSetSourceLawCategoryId_NotEqual(Integer sourceLawCategoryId) {
        regSourceLawCategoryId(CK_NES, sourceLawCategoryId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元法令カテゴリーID)SOURCE_LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)}
     * @param sourceLawCategoryId The value of sourceLawCategoryId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceLawCategoryId_GreaterThan(Integer sourceLawCategoryId) {
        regSourceLawCategoryId(CK_GT, sourceLawCategoryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元法令カテゴリーID)SOURCE_LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)}
     * @param sourceLawCategoryId The value of sourceLawCategoryId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceLawCategoryId_LessThan(Integer sourceLawCategoryId) {
        regSourceLawCategoryId(CK_LT, sourceLawCategoryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元法令カテゴリーID)SOURCE_LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)}
     * @param sourceLawCategoryId The value of sourceLawCategoryId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceLawCategoryId_GreaterEqual(Integer sourceLawCategoryId) {
        regSourceLawCategoryId(CK_GE, sourceLawCategoryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元法令カテゴリーID)SOURCE_LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)}
     * @param sourceLawCategoryId The value of sourceLawCategoryId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceLawCategoryId_LessEqual(Integer sourceLawCategoryId) {
        regSourceLawCategoryId(CK_LE, sourceLawCategoryId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元法令カテゴリーID)SOURCE_LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of sourceLawCategoryId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sourceLawCategoryId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSourceLawCategoryId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSourceLawCategoryId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元法令カテゴリーID)SOURCE_LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of sourceLawCategoryId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sourceLawCategoryId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSourceLawCategoryId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSourceLawCategoryId(), "SOURCE_LAW_CATEGORY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (取得元法令カテゴリーID)SOURCE_LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)}
     * @param sourceLawCategoryIdList The collection of sourceLawCategoryId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceLawCategoryId_InScope(Collection<Integer> sourceLawCategoryIdList) {
        doSetSourceLawCategoryId_InScope(sourceLawCategoryIdList);
    }

    protected void doSetSourceLawCategoryId_InScope(Collection<Integer> sourceLawCategoryIdList) {
        regINS(CK_INS, cTL(sourceLawCategoryIdList), xgetCValueSourceLawCategoryId(), "SOURCE_LAW_CATEGORY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (取得元法令カテゴリーID)SOURCE_LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)}
     * @param sourceLawCategoryIdList The collection of sourceLawCategoryId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceLawCategoryId_NotInScope(Collection<Integer> sourceLawCategoryIdList) {
        doSetSourceLawCategoryId_NotInScope(sourceLawCategoryIdList);
    }

    protected void doSetSourceLawCategoryId_NotInScope(Collection<Integer> sourceLawCategoryIdList) {
        regINS(CK_NINS, cTL(sourceLawCategoryIdList), xgetCValueSourceLawCategoryId(), "SOURCE_LAW_CATEGORY_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SOURCE_LAW_CATEGORY_ID from SOURCE_LAW_CATEGORY_REL where ...)} <br>
     * (取得元法令カテゴリーリレーション)SOURCE_LAW_CATEGORY_REL by SOURCE_LAW_CATEGORY_ID, named 'sourceLawCategoryRelAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSourceLawCategoryId_ExistsReferrer_SourceLawCategoryRelList(cb.query());
        registerExistsReferrer(cb.query(), "SOURCE_LAW_CATEGORY_ID", "SOURCE_LAW_CATEGORY_ID", pp, "sourceLawCategoryRelList");
    }
    public abstract String keepSourceLawCategoryId_ExistsReferrer_SourceLawCategoryRelList(SourceLawCategoryRelCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SOURCE_LAW_CATEGORY_ID from SOURCE_LAW_CATEGORY_REL where ...)} <br>
     * (取得元法令カテゴリーリレーション)SOURCE_LAW_CATEGORY_REL by SOURCE_LAW_CATEGORY_ID, named 'sourceLawCategoryRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsSourceLawCategoryRel</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of SourceLawCategoryId_NotExistsReferrer_SourceLawCategoryRelList for 'not exists'. (NotNull)
     */
    public void notExistsSourceLawCategoryRel(SubQuery<SourceLawCategoryRelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        SourceLawCategoryRelCB cb = new SourceLawCategoryRelCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSourceLawCategoryId_NotExistsReferrer_SourceLawCategoryRelList(cb.query());
        registerNotExistsReferrer(cb.query(), "SOURCE_LAW_CATEGORY_ID", "SOURCE_LAW_CATEGORY_ID", pp, "sourceLawCategoryRelList");
    }
    public abstract String keepSourceLawCategoryId_NotExistsReferrer_SourceLawCategoryRelList(SourceLawCategoryRelCQ sq);

    public void xsderiveSourceLawCategoryRelList(String fn, SubQuery<SourceLawCategoryRelCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SourceLawCategoryRelCB cb = new SourceLawCategoryRelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSourceLawCategoryId_SpecifyDerivedReferrer_SourceLawCategoryRelList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SOURCE_LAW_CATEGORY_ID", "SOURCE_LAW_CATEGORY_ID", pp, "sourceLawCategoryRelList", al, op);
    }
    public abstract String keepSourceLawCategoryId_SpecifyDerivedReferrer_SourceLawCategoryRelList(SourceLawCategoryRelCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from SOURCE_LAW_CATEGORY_REL where ...)} <br>
     * (取得元法令カテゴリーリレーション)SOURCE_LAW_CATEGORY_REL by SOURCE_LAW_CATEGORY_ID, named 'sourceLawCategoryRelAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepSourceLawCategoryId_QueryDerivedReferrer_SourceLawCategoryRelList(cb.query()); String prpp = keepSourceLawCategoryId_QueryDerivedReferrer_SourceLawCategoryRelListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SOURCE_LAW_CATEGORY_ID", "SOURCE_LAW_CATEGORY_ID", sqpp, "sourceLawCategoryRelList", rd, vl, prpp, op);
    }
    public abstract String keepSourceLawCategoryId_QueryDerivedReferrer_SourceLawCategoryRelList(SourceLawCategoryRelCQ sq);
    public abstract String keepSourceLawCategoryId_QueryDerivedReferrer_SourceLawCategoryRelListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (取得元法令カテゴリーID)SOURCE_LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setSourceLawCategoryId_IsNull() { regSourceLawCategoryId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (取得元法令カテゴリーID)SOURCE_LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setSourceLawCategoryId_IsNotNull() { regSourceLawCategoryId(CK_ISNN, DOBJ); }

    protected void regSourceLawCategoryId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSourceLawCategoryId(), "SOURCE_LAW_CATEGORY_ID"); }
    protected abstract ConditionValue xgetCValueSourceLawCategoryId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (取得元コード)SOURCE_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source}
     * @param sourceCode The value of sourceCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceCode_Equal(String sourceCode) {
        doSetSourceCode_Equal(fRES(sourceCode));
    }

    /**
     * Equal(=). As Source. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (取得元コード)SOURCE_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source} <br>
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceCode_Equal_AsSource(CDef.Source cdef) {
        doSetSourceCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As 裁判所裁判例 (COURT). And OnlyOnceRegistered. <br>
     * 裁判所裁判例: 裁判所裁判例
     */
    public void setSourceCode_Equal_裁判所裁判例() {
        setSourceCode_Equal_AsSource(CDef.Source.裁判所裁判例);
    }

    /**
     * Equal(=). As Egov (EGOV). And OnlyOnceRegistered. <br>
     * e-Gov: e-Gov
     */
    public void setSourceCode_Equal_Egov() {
        setSourceCode_Equal_AsSource(CDef.Source.Egov);
    }

    protected void doSetSourceCode_Equal(String sourceCode) {
        regSourceCode(CK_EQ, sourceCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (取得元コード)SOURCE_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source}
     * @param sourceCode The value of sourceCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceCode_NotEqual(String sourceCode) {
        doSetSourceCode_NotEqual(fRES(sourceCode));
    }

    /**
     * NotEqual(&lt;&gt;). As Source. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (取得元コード)SOURCE_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source} <br>
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceCode_NotEqual_AsSource(CDef.Source cdef) {
        doSetSourceCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As 裁判所裁判例 (COURT). And OnlyOnceRegistered. <br>
     * 裁判所裁判例: 裁判所裁判例
     */
    public void setSourceCode_NotEqual_裁判所裁判例() {
        setSourceCode_NotEqual_AsSource(CDef.Source.裁判所裁判例);
    }

    /**
     * NotEqual(&lt;&gt;). As Egov (EGOV). And OnlyOnceRegistered. <br>
     * e-Gov: e-Gov
     */
    public void setSourceCode_NotEqual_Egov() {
        setSourceCode_NotEqual_AsSource(CDef.Source.Egov);
    }

    protected void doSetSourceCode_NotEqual(String sourceCode) {
        regSourceCode(CK_NES, sourceCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (取得元コード)SOURCE_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source}
     * @param sourceCodeList The collection of sourceCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceCode_InScope(Collection<String> sourceCodeList) {
        doSetSourceCode_InScope(sourceCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As Source. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (取得元コード)SOURCE_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source} <br>
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceCode_InScope_AsSource(Collection<CDef.Source> cdefList) {
        doSetSourceCode_InScope(cTStrL(cdefList));
    }

    protected void doSetSourceCode_InScope(Collection<String> sourceCodeList) {
        regINS(CK_INS, cTL(sourceCodeList), xgetCValueSourceCode(), "SOURCE_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (取得元コード)SOURCE_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source}
     * @param sourceCodeList The collection of sourceCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceCode_NotInScope(Collection<String> sourceCodeList) {
        doSetSourceCode_NotInScope(sourceCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As Source. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (取得元コード)SOURCE_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source} <br>
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceCode_NotInScope_AsSource(Collection<CDef.Source> cdefList) {
        doSetSourceCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetSourceCode_NotInScope(Collection<String> sourceCodeList) {
        regINS(CK_NINS, cTL(sourceCodeList), xgetCValueSourceCode(), "SOURCE_CODE");
    }

    protected void regSourceCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSourceCode(), "SOURCE_CODE"); }
    protected abstract ConditionValue xgetCValueSourceCode();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {IX, NotNull, INT(10), FK to LAW_CATEGORY}
     * @param lawCategoryId The value of lawCategoryId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawCategoryId_Equal(Integer lawCategoryId) {
        doSetLawCategoryId_Equal(lawCategoryId);
    }

    protected void doSetLawCategoryId_Equal(Integer lawCategoryId) {
        regLawCategoryId(CK_EQ, lawCategoryId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {IX, NotNull, INT(10), FK to LAW_CATEGORY}
     * @param lawCategoryId The value of lawCategoryId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawCategoryId_NotEqual(Integer lawCategoryId) {
        doSetLawCategoryId_NotEqual(lawCategoryId);
    }

    protected void doSetLawCategoryId_NotEqual(Integer lawCategoryId) {
        regLawCategoryId(CK_NES, lawCategoryId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {IX, NotNull, INT(10), FK to LAW_CATEGORY}
     * @param lawCategoryId The value of lawCategoryId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawCategoryId_GreaterThan(Integer lawCategoryId) {
        regLawCategoryId(CK_GT, lawCategoryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {IX, NotNull, INT(10), FK to LAW_CATEGORY}
     * @param lawCategoryId The value of lawCategoryId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawCategoryId_LessThan(Integer lawCategoryId) {
        regLawCategoryId(CK_LT, lawCategoryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {IX, NotNull, INT(10), FK to LAW_CATEGORY}
     * @param lawCategoryId The value of lawCategoryId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawCategoryId_GreaterEqual(Integer lawCategoryId) {
        regLawCategoryId(CK_GE, lawCategoryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {IX, NotNull, INT(10), FK to LAW_CATEGORY}
     * @param lawCategoryId The value of lawCategoryId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawCategoryId_LessEqual(Integer lawCategoryId) {
        regLawCategoryId(CK_LE, lawCategoryId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {IX, NotNull, INT(10), FK to LAW_CATEGORY}
     * @param minNumber The min number of lawCategoryId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of lawCategoryId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setLawCategoryId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setLawCategoryId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {IX, NotNull, INT(10), FK to LAW_CATEGORY}
     * @param minNumber The min number of lawCategoryId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of lawCategoryId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setLawCategoryId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLawCategoryId(), "LAW_CATEGORY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {IX, NotNull, INT(10), FK to LAW_CATEGORY}
     * @param lawCategoryIdList The collection of lawCategoryId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawCategoryId_InScope(Collection<Integer> lawCategoryIdList) {
        doSetLawCategoryId_InScope(lawCategoryIdList);
    }

    protected void doSetLawCategoryId_InScope(Collection<Integer> lawCategoryIdList) {
        regINS(CK_INS, cTL(lawCategoryIdList), xgetCValueLawCategoryId(), "LAW_CATEGORY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {IX, NotNull, INT(10), FK to LAW_CATEGORY}
     * @param lawCategoryIdList The collection of lawCategoryId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawCategoryId_NotInScope(Collection<Integer> lawCategoryIdList) {
        doSetLawCategoryId_NotInScope(lawCategoryIdList);
    }

    protected void doSetLawCategoryId_NotInScope(Collection<Integer> lawCategoryIdList) {
        regINS(CK_NINS, cTL(lawCategoryIdList), xgetCValueLawCategoryId(), "LAW_CATEGORY_ID");
    }

    protected void regLawCategoryId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLawCategoryId(), "LAW_CATEGORY_ID"); }
    protected abstract ConditionValue xgetCValueLawCategoryId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (取得元法令カテゴリー名)SOURCE_LAW_CATEGORY_NAME: {NotNull, VARCHAR(50)}
     * @param sourceLawCategoryName The value of sourceLawCategoryName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceLawCategoryName_Equal(String sourceLawCategoryName) {
        doSetSourceLawCategoryName_Equal(fRES(sourceLawCategoryName));
    }

    protected void doSetSourceLawCategoryName_Equal(String sourceLawCategoryName) {
        regSourceLawCategoryName(CK_EQ, sourceLawCategoryName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (取得元法令カテゴリー名)SOURCE_LAW_CATEGORY_NAME: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setSourceLawCategoryName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param sourceLawCategoryName The value of sourceLawCategoryName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSourceLawCategoryName_LikeSearch(String sourceLawCategoryName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSourceLawCategoryName_LikeSearch(sourceLawCategoryName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (取得元法令カテゴリー名)SOURCE_LAW_CATEGORY_NAME: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setSourceLawCategoryName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sourceLawCategoryName The value of sourceLawCategoryName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setSourceLawCategoryName_LikeSearch(String sourceLawCategoryName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sourceLawCategoryName), xgetCValueSourceLawCategoryName(), "SOURCE_LAW_CATEGORY_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (取得元法令カテゴリー名)SOURCE_LAW_CATEGORY_NAME: {NotNull, VARCHAR(50)}
     * @param sourceLawCategoryName The value of sourceLawCategoryName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSourceLawCategoryName_NotLikeSearch(String sourceLawCategoryName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSourceLawCategoryName_NotLikeSearch(sourceLawCategoryName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (取得元法令カテゴリー名)SOURCE_LAW_CATEGORY_NAME: {NotNull, VARCHAR(50)}
     * @param sourceLawCategoryName The value of sourceLawCategoryName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setSourceLawCategoryName_NotLikeSearch(String sourceLawCategoryName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sourceLawCategoryName), xgetCValueSourceLawCategoryName(), "SOURCE_LAW_CATEGORY_NAME", likeSearchOption);
    }

    protected void regSourceLawCategoryName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSourceLawCategoryName(), "SOURCE_LAW_CATEGORY_NAME"); }
    protected abstract ConditionValue xgetCValueSourceLawCategoryName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (取得元法令カテゴリー別名)SOURCE_LAW_CATEGORY_ALIAS: {NotNull, VARCHAR(50)}
     * @param sourceLawCategoryAlias The value of sourceLawCategoryAlias as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceLawCategoryAlias_Equal(String sourceLawCategoryAlias) {
        doSetSourceLawCategoryAlias_Equal(fRES(sourceLawCategoryAlias));
    }

    protected void doSetSourceLawCategoryAlias_Equal(String sourceLawCategoryAlias) {
        regSourceLawCategoryAlias(CK_EQ, sourceLawCategoryAlias);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (取得元法令カテゴリー別名)SOURCE_LAW_CATEGORY_ALIAS: {NotNull, VARCHAR(50)}
     * @param sourceLawCategoryAlias The value of sourceLawCategoryAlias as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceLawCategoryAlias_NotEqual(String sourceLawCategoryAlias) {
        doSetSourceLawCategoryAlias_NotEqual(fRES(sourceLawCategoryAlias));
    }

    protected void doSetSourceLawCategoryAlias_NotEqual(String sourceLawCategoryAlias) {
        regSourceLawCategoryAlias(CK_NES, sourceLawCategoryAlias);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (取得元法令カテゴリー別名)SOURCE_LAW_CATEGORY_ALIAS: {NotNull, VARCHAR(50)}
     * @param sourceLawCategoryAliasList The collection of sourceLawCategoryAlias as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceLawCategoryAlias_InScope(Collection<String> sourceLawCategoryAliasList) {
        doSetSourceLawCategoryAlias_InScope(sourceLawCategoryAliasList);
    }

    protected void doSetSourceLawCategoryAlias_InScope(Collection<String> sourceLawCategoryAliasList) {
        regINS(CK_INS, cTL(sourceLawCategoryAliasList), xgetCValueSourceLawCategoryAlias(), "SOURCE_LAW_CATEGORY_ALIAS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (取得元法令カテゴリー別名)SOURCE_LAW_CATEGORY_ALIAS: {NotNull, VARCHAR(50)}
     * @param sourceLawCategoryAliasList The collection of sourceLawCategoryAlias as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceLawCategoryAlias_NotInScope(Collection<String> sourceLawCategoryAliasList) {
        doSetSourceLawCategoryAlias_NotInScope(sourceLawCategoryAliasList);
    }

    protected void doSetSourceLawCategoryAlias_NotInScope(Collection<String> sourceLawCategoryAliasList) {
        regINS(CK_NINS, cTL(sourceLawCategoryAliasList), xgetCValueSourceLawCategoryAlias(), "SOURCE_LAW_CATEGORY_ALIAS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (取得元法令カテゴリー別名)SOURCE_LAW_CATEGORY_ALIAS: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setSourceLawCategoryAlias_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param sourceLawCategoryAlias The value of sourceLawCategoryAlias as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSourceLawCategoryAlias_LikeSearch(String sourceLawCategoryAlias, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSourceLawCategoryAlias_LikeSearch(sourceLawCategoryAlias, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (取得元法令カテゴリー別名)SOURCE_LAW_CATEGORY_ALIAS: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setSourceLawCategoryAlias_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sourceLawCategoryAlias The value of sourceLawCategoryAlias as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setSourceLawCategoryAlias_LikeSearch(String sourceLawCategoryAlias, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sourceLawCategoryAlias), xgetCValueSourceLawCategoryAlias(), "SOURCE_LAW_CATEGORY_ALIAS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (取得元法令カテゴリー別名)SOURCE_LAW_CATEGORY_ALIAS: {NotNull, VARCHAR(50)}
     * @param sourceLawCategoryAlias The value of sourceLawCategoryAlias as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSourceLawCategoryAlias_NotLikeSearch(String sourceLawCategoryAlias, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSourceLawCategoryAlias_NotLikeSearch(sourceLawCategoryAlias, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (取得元法令カテゴリー別名)SOURCE_LAW_CATEGORY_ALIAS: {NotNull, VARCHAR(50)}
     * @param sourceLawCategoryAlias The value of sourceLawCategoryAlias as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setSourceLawCategoryAlias_NotLikeSearch(String sourceLawCategoryAlias, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sourceLawCategoryAlias), xgetCValueSourceLawCategoryAlias(), "SOURCE_LAW_CATEGORY_ALIAS", likeSearchOption);
    }

    protected void regSourceLawCategoryAlias(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSourceLawCategoryAlias(), "SOURCE_LAW_CATEGORY_ALIAS"); }
    protected abstract ConditionValue xgetCValueSourceLawCategoryAlias();

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
    public HpSLCFunction<SourceLawCategoryCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, SourceLawCategoryCB.class);
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
    public HpSLCFunction<SourceLawCategoryCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, SourceLawCategoryCB.class);
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
    public HpSLCFunction<SourceLawCategoryCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, SourceLawCategoryCB.class);
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
    public HpSLCFunction<SourceLawCategoryCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, SourceLawCategoryCB.class);
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
    public HpSLCFunction<SourceLawCategoryCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, SourceLawCategoryCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;SourceLawCategoryCB&gt;() {
     *     public void query(SourceLawCategoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<SourceLawCategoryCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, SourceLawCategoryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        SourceLawCategoryCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(SourceLawCategoryCQ sq);

    protected SourceLawCategoryCB xcreateScalarConditionCB() {
        SourceLawCategoryCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected SourceLawCategoryCB xcreateScalarConditionPartitionByCB() {
        SourceLawCategoryCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<SourceLawCategoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SourceLawCategoryCB cb = new SourceLawCategoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SOURCE_LAW_CATEGORY_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(SourceLawCategoryCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<SourceLawCategoryCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(SourceLawCategoryCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SourceLawCategoryCB cb = new SourceLawCategoryCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SOURCE_LAW_CATEGORY_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(SourceLawCategoryCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<SourceLawCategoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        SourceLawCategoryCB cb = new SourceLawCategoryCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(SourceLawCategoryCQ sq);

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
    protected SourceLawCategoryCB newMyCB() {
        return new SourceLawCategoryCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return SourceLawCategoryCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
