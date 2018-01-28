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
 * The abstract condition-query of CLS_COURT_TYPE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsClsCourtTypeCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsClsCourtTypeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "CLS_COURT_TYPE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=CourtType}
     * @param courtTypeCode The value of courtTypeCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtTypeCode_Equal(String courtTypeCode) {
        doSetCourtTypeCode_Equal(fRES(courtTypeCode));
    }

    /**
     * Equal(=). As CourtType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=CourtType} <br>
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCourtTypeCode_Equal_AsCourtType(CDef.CourtType cdef) {
        doSetCourtTypeCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As 最高裁判所 (SUPREME). And OnlyOnceRegistered. <br>
     * 最高裁判所: 最高裁判所
     */
    public void setCourtTypeCode_Equal_最高裁判所() {
        setCourtTypeCode_Equal_AsCourtType(CDef.CourtType.最高裁判所);
    }

    /**
     * Equal(=). As 高等裁判所 (HIGH). And OnlyOnceRegistered. <br>
     * 高等裁判所: 高等裁判所
     */
    public void setCourtTypeCode_Equal_高等裁判所() {
        setCourtTypeCode_Equal_AsCourtType(CDef.CourtType.高等裁判所);
    }

    /**
     * Equal(=). As 地方裁判所 (DISTRICT). And OnlyOnceRegistered. <br>
     * 地方裁判所: 地方裁判所
     */
    public void setCourtTypeCode_Equal_地方裁判所() {
        setCourtTypeCode_Equal_AsCourtType(CDef.CourtType.地方裁判所);
    }

    /**
     * Equal(=). As 簡易裁判所 (SUMMARY). And OnlyOnceRegistered. <br>
     * 簡易裁判所: 簡易裁判所
     */
    public void setCourtTypeCode_Equal_簡易裁判所() {
        setCourtTypeCode_Equal_AsCourtType(CDef.CourtType.簡易裁判所);
    }

    /**
     * Equal(=). As 家庭裁判所 (DOMESTIC). And OnlyOnceRegistered. <br>
     * 家庭裁判所: 家庭裁判所
     */
    public void setCourtTypeCode_Equal_家庭裁判所() {
        setCourtTypeCode_Equal_AsCourtType(CDef.CourtType.家庭裁判所);
    }

    protected void doSetCourtTypeCode_Equal(String courtTypeCode) {
        regCourtTypeCode(CK_EQ, courtTypeCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=CourtType}
     * @param courtTypeCode The value of courtTypeCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtTypeCode_NotEqual(String courtTypeCode) {
        doSetCourtTypeCode_NotEqual(fRES(courtTypeCode));
    }

    /**
     * NotEqual(&lt;&gt;). As CourtType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=CourtType} <br>
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCourtTypeCode_NotEqual_AsCourtType(CDef.CourtType cdef) {
        doSetCourtTypeCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As 最高裁判所 (SUPREME). And OnlyOnceRegistered. <br>
     * 最高裁判所: 最高裁判所
     */
    public void setCourtTypeCode_NotEqual_最高裁判所() {
        setCourtTypeCode_NotEqual_AsCourtType(CDef.CourtType.最高裁判所);
    }

    /**
     * NotEqual(&lt;&gt;). As 高等裁判所 (HIGH). And OnlyOnceRegistered. <br>
     * 高等裁判所: 高等裁判所
     */
    public void setCourtTypeCode_NotEqual_高等裁判所() {
        setCourtTypeCode_NotEqual_AsCourtType(CDef.CourtType.高等裁判所);
    }

    /**
     * NotEqual(&lt;&gt;). As 地方裁判所 (DISTRICT). And OnlyOnceRegistered. <br>
     * 地方裁判所: 地方裁判所
     */
    public void setCourtTypeCode_NotEqual_地方裁判所() {
        setCourtTypeCode_NotEqual_AsCourtType(CDef.CourtType.地方裁判所);
    }

    /**
     * NotEqual(&lt;&gt;). As 簡易裁判所 (SUMMARY). And OnlyOnceRegistered. <br>
     * 簡易裁判所: 簡易裁判所
     */
    public void setCourtTypeCode_NotEqual_簡易裁判所() {
        setCourtTypeCode_NotEqual_AsCourtType(CDef.CourtType.簡易裁判所);
    }

    /**
     * NotEqual(&lt;&gt;). As 家庭裁判所 (DOMESTIC). And OnlyOnceRegistered. <br>
     * 家庭裁判所: 家庭裁判所
     */
    public void setCourtTypeCode_NotEqual_家庭裁判所() {
        setCourtTypeCode_NotEqual_AsCourtType(CDef.CourtType.家庭裁判所);
    }

    protected void doSetCourtTypeCode_NotEqual(String courtTypeCode) {
        regCourtTypeCode(CK_NES, courtTypeCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=CourtType}
     * @param courtTypeCodeList The collection of courtTypeCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtTypeCode_InScope(Collection<String> courtTypeCodeList) {
        doSetCourtTypeCode_InScope(courtTypeCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As CourtType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=CourtType} <br>
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtTypeCode_InScope_AsCourtType(Collection<CDef.CourtType> cdefList) {
        doSetCourtTypeCode_InScope(cTStrL(cdefList));
    }

    protected void doSetCourtTypeCode_InScope(Collection<String> courtTypeCodeList) {
        regINS(CK_INS, cTL(courtTypeCodeList), xgetCValueCourtTypeCode(), "COURT_TYPE_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=CourtType}
     * @param courtTypeCodeList The collection of courtTypeCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtTypeCode_NotInScope(Collection<String> courtTypeCodeList) {
        doSetCourtTypeCode_NotInScope(courtTypeCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CourtType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=CourtType} <br>
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtTypeCode_NotInScope_AsCourtType(Collection<CDef.CourtType> cdefList) {
        doSetCourtTypeCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetCourtTypeCode_NotInScope(Collection<String> courtTypeCodeList) {
        regINS(CK_NINS, cTL(courtTypeCodeList), xgetCValueCourtTypeCode(), "COURT_TYPE_CODE");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select COURT_TYPE_CODE from CASE_MARK where ...)} <br>
     * (事件符号)CASE_MARK by COURT_TYPE_CODE, named 'caseMarkAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsCaseMark</span>(markCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     markCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CaseMarkList for 'exists'. (NotNull)
     */
    public void existsCaseMark(SubQuery<CaseMarkCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CaseMarkCB cb = new CaseMarkCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCourtTypeCode_ExistsReferrer_CaseMarkList(cb.query());
        registerExistsReferrer(cb.query(), "COURT_TYPE_CODE", "COURT_TYPE_CODE", pp, "caseMarkList");
    }
    public abstract String keepCourtTypeCode_ExistsReferrer_CaseMarkList(CaseMarkCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select COURT_TYPE_CODE from COURT where ...)} <br>
     * (裁判所)COURT by COURT_TYPE_CODE, named 'courtAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsCourt</span>(courtCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     courtCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CourtList for 'exists'. (NotNull)
     */
    public void existsCourt(SubQuery<CourtCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CourtCB cb = new CourtCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCourtTypeCode_ExistsReferrer_CourtList(cb.query());
        registerExistsReferrer(cb.query(), "COURT_TYPE_CODE", "COURT_TYPE_CODE", pp, "courtList");
    }
    public abstract String keepCourtTypeCode_ExistsReferrer_CourtList(CourtCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select COURT_TYPE_CODE from CASE_MARK where ...)} <br>
     * (事件符号)CASE_MARK by COURT_TYPE_CODE, named 'caseMarkAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsCaseMark</span>(markCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     markCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CourtTypeCode_NotExistsReferrer_CaseMarkList for 'not exists'. (NotNull)
     */
    public void notExistsCaseMark(SubQuery<CaseMarkCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CaseMarkCB cb = new CaseMarkCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCourtTypeCode_NotExistsReferrer_CaseMarkList(cb.query());
        registerNotExistsReferrer(cb.query(), "COURT_TYPE_CODE", "COURT_TYPE_CODE", pp, "caseMarkList");
    }
    public abstract String keepCourtTypeCode_NotExistsReferrer_CaseMarkList(CaseMarkCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select COURT_TYPE_CODE from COURT where ...)} <br>
     * (裁判所)COURT by COURT_TYPE_CODE, named 'courtAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsCourt</span>(courtCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     courtCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CourtTypeCode_NotExistsReferrer_CourtList for 'not exists'. (NotNull)
     */
    public void notExistsCourt(SubQuery<CourtCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CourtCB cb = new CourtCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCourtTypeCode_NotExistsReferrer_CourtList(cb.query());
        registerNotExistsReferrer(cb.query(), "COURT_TYPE_CODE", "COURT_TYPE_CODE", pp, "courtList");
    }
    public abstract String keepCourtTypeCode_NotExistsReferrer_CourtList(CourtCQ sq);

    public void xsderiveCaseMarkList(String fn, SubQuery<CaseMarkCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CaseMarkCB cb = new CaseMarkCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCourtTypeCode_SpecifyDerivedReferrer_CaseMarkList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "COURT_TYPE_CODE", "COURT_TYPE_CODE", pp, "caseMarkList", al, op);
    }
    public abstract String keepCourtTypeCode_SpecifyDerivedReferrer_CaseMarkList(CaseMarkCQ sq);

    public void xsderiveCourtList(String fn, SubQuery<CourtCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CourtCB cb = new CourtCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCourtTypeCode_SpecifyDerivedReferrer_CourtList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "COURT_TYPE_CODE", "COURT_TYPE_CODE", pp, "courtList", al, op);
    }
    public abstract String keepCourtTypeCode_SpecifyDerivedReferrer_CourtList(CourtCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from CASE_MARK where ...)} <br>
     * (事件符号)CASE_MARK by COURT_TYPE_CODE, named 'caseMarkAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedCaseMark()</span>.<span style="color: #CC4747">max</span>(markCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     markCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     markCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<CaseMarkCB> derivedCaseMark() {
        return xcreateQDRFunctionCaseMarkList();
    }
    protected HpQDRFunction<CaseMarkCB> xcreateQDRFunctionCaseMarkList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveCaseMarkList(fn, sq, rd, vl, op));
    }
    public void xqderiveCaseMarkList(String fn, SubQuery<CaseMarkCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CaseMarkCB cb = new CaseMarkCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCourtTypeCode_QueryDerivedReferrer_CaseMarkList(cb.query()); String prpp = keepCourtTypeCode_QueryDerivedReferrer_CaseMarkListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "COURT_TYPE_CODE", "COURT_TYPE_CODE", sqpp, "caseMarkList", rd, vl, prpp, op);
    }
    public abstract String keepCourtTypeCode_QueryDerivedReferrer_CaseMarkList(CaseMarkCQ sq);
    public abstract String keepCourtTypeCode_QueryDerivedReferrer_CaseMarkListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from COURT where ...)} <br>
     * (裁判所)COURT by COURT_TYPE_CODE, named 'courtAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedCourt()</span>.<span style="color: #CC4747">max</span>(courtCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     courtCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     courtCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<CourtCB> derivedCourt() {
        return xcreateQDRFunctionCourtList();
    }
    protected HpQDRFunction<CourtCB> xcreateQDRFunctionCourtList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveCourtList(fn, sq, rd, vl, op));
    }
    public void xqderiveCourtList(String fn, SubQuery<CourtCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CourtCB cb = new CourtCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCourtTypeCode_QueryDerivedReferrer_CourtList(cb.query()); String prpp = keepCourtTypeCode_QueryDerivedReferrer_CourtListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "COURT_TYPE_CODE", "COURT_TYPE_CODE", sqpp, "courtList", rd, vl, prpp, op);
    }
    public abstract String keepCourtTypeCode_QueryDerivedReferrer_CourtList(CourtCQ sq);
    public abstract String keepCourtTypeCode_QueryDerivedReferrer_CourtListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=CourtType}
     */
    public void setCourtTypeCode_IsNull() { regCourtTypeCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=CourtType}
     */
    public void setCourtTypeCode_IsNotNull() { regCourtTypeCode(CK_ISNN, DOBJ); }

    protected void regCourtTypeCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCourtTypeCode(), "COURT_TYPE_CODE"); }
    protected abstract ConditionValue xgetCValueCourtTypeCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (裁判所種別名)COURT_TYPE_NAME: {UQ, NotNull, VARCHAR(10)}
     * @param courtTypeName The value of courtTypeName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtTypeName_Equal(String courtTypeName) {
        doSetCourtTypeName_Equal(fRES(courtTypeName));
    }

    protected void doSetCourtTypeName_Equal(String courtTypeName) {
        regCourtTypeName(CK_EQ, courtTypeName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判所種別名)COURT_TYPE_NAME: {UQ, NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setCourtTypeName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param courtTypeName The value of courtTypeName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCourtTypeName_LikeSearch(String courtTypeName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCourtTypeName_LikeSearch(courtTypeName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判所種別名)COURT_TYPE_NAME: {UQ, NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setCourtTypeName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param courtTypeName The value of courtTypeName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCourtTypeName_LikeSearch(String courtTypeName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(courtTypeName), xgetCValueCourtTypeName(), "COURT_TYPE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判所種別名)COURT_TYPE_NAME: {UQ, NotNull, VARCHAR(10)}
     * @param courtTypeName The value of courtTypeName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCourtTypeName_NotLikeSearch(String courtTypeName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCourtTypeName_NotLikeSearch(courtTypeName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判所種別名)COURT_TYPE_NAME: {UQ, NotNull, VARCHAR(10)}
     * @param courtTypeName The value of courtTypeName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCourtTypeName_NotLikeSearch(String courtTypeName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(courtTypeName), xgetCValueCourtTypeName(), "COURT_TYPE_NAME", likeSearchOption);
    }

    protected void regCourtTypeName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCourtTypeName(), "COURT_TYPE_NAME"); }
    protected abstract ConditionValue xgetCValueCourtTypeName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (裁判所種別別名)COURT_TYPE_ALIAS: {UQ, NotNull, VARCHAR(10)}
     * @param courtTypeAlias The value of courtTypeAlias as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtTypeAlias_Equal(String courtTypeAlias) {
        doSetCourtTypeAlias_Equal(fRES(courtTypeAlias));
    }

    protected void doSetCourtTypeAlias_Equal(String courtTypeAlias) {
        regCourtTypeAlias(CK_EQ, courtTypeAlias);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (裁判所種別別名)COURT_TYPE_ALIAS: {UQ, NotNull, VARCHAR(10)}
     * @param courtTypeAlias The value of courtTypeAlias as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtTypeAlias_NotEqual(String courtTypeAlias) {
        doSetCourtTypeAlias_NotEqual(fRES(courtTypeAlias));
    }

    protected void doSetCourtTypeAlias_NotEqual(String courtTypeAlias) {
        regCourtTypeAlias(CK_NES, courtTypeAlias);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (裁判所種別別名)COURT_TYPE_ALIAS: {UQ, NotNull, VARCHAR(10)}
     * @param courtTypeAliasList The collection of courtTypeAlias as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtTypeAlias_InScope(Collection<String> courtTypeAliasList) {
        doSetCourtTypeAlias_InScope(courtTypeAliasList);
    }

    protected void doSetCourtTypeAlias_InScope(Collection<String> courtTypeAliasList) {
        regINS(CK_INS, cTL(courtTypeAliasList), xgetCValueCourtTypeAlias(), "COURT_TYPE_ALIAS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (裁判所種別別名)COURT_TYPE_ALIAS: {UQ, NotNull, VARCHAR(10)}
     * @param courtTypeAliasList The collection of courtTypeAlias as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtTypeAlias_NotInScope(Collection<String> courtTypeAliasList) {
        doSetCourtTypeAlias_NotInScope(courtTypeAliasList);
    }

    protected void doSetCourtTypeAlias_NotInScope(Collection<String> courtTypeAliasList) {
        regINS(CK_NINS, cTL(courtTypeAliasList), xgetCValueCourtTypeAlias(), "COURT_TYPE_ALIAS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判所種別別名)COURT_TYPE_ALIAS: {UQ, NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setCourtTypeAlias_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param courtTypeAlias The value of courtTypeAlias as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCourtTypeAlias_LikeSearch(String courtTypeAlias, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCourtTypeAlias_LikeSearch(courtTypeAlias, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判所種別別名)COURT_TYPE_ALIAS: {UQ, NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setCourtTypeAlias_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param courtTypeAlias The value of courtTypeAlias as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCourtTypeAlias_LikeSearch(String courtTypeAlias, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(courtTypeAlias), xgetCValueCourtTypeAlias(), "COURT_TYPE_ALIAS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判所種別別名)COURT_TYPE_ALIAS: {UQ, NotNull, VARCHAR(10)}
     * @param courtTypeAlias The value of courtTypeAlias as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCourtTypeAlias_NotLikeSearch(String courtTypeAlias, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCourtTypeAlias_NotLikeSearch(courtTypeAlias, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判所種別別名)COURT_TYPE_ALIAS: {UQ, NotNull, VARCHAR(10)}
     * @param courtTypeAlias The value of courtTypeAlias as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCourtTypeAlias_NotLikeSearch(String courtTypeAlias, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(courtTypeAlias), xgetCValueCourtTypeAlias(), "COURT_TYPE_ALIAS", likeSearchOption);
    }

    protected void regCourtTypeAlias(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCourtTypeAlias(), "COURT_TYPE_ALIAS"); }
    protected abstract ConditionValue xgetCValueCourtTypeAlias();

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
    public HpSLCFunction<ClsCourtTypeCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ClsCourtTypeCB.class);
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
    public HpSLCFunction<ClsCourtTypeCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ClsCourtTypeCB.class);
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
    public HpSLCFunction<ClsCourtTypeCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ClsCourtTypeCB.class);
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
    public HpSLCFunction<ClsCourtTypeCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ClsCourtTypeCB.class);
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
    public HpSLCFunction<ClsCourtTypeCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ClsCourtTypeCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ClsCourtTypeCB&gt;() {
     *     public void query(ClsCourtTypeCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ClsCourtTypeCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ClsCourtTypeCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ClsCourtTypeCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ClsCourtTypeCQ sq);

    protected ClsCourtTypeCB xcreateScalarConditionCB() {
        ClsCourtTypeCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ClsCourtTypeCB xcreateScalarConditionPartitionByCB() {
        ClsCourtTypeCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ClsCourtTypeCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ClsCourtTypeCB cb = new ClsCourtTypeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "COURT_TYPE_CODE";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ClsCourtTypeCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ClsCourtTypeCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ClsCourtTypeCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ClsCourtTypeCB cb = new ClsCourtTypeCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "COURT_TYPE_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ClsCourtTypeCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ClsCourtTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ClsCourtTypeCB cb = new ClsCourtTypeCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ClsCourtTypeCQ sq);

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
    protected ClsCourtTypeCB newMyCB() {
        return new ClsCourtTypeCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ClsCourtTypeCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
