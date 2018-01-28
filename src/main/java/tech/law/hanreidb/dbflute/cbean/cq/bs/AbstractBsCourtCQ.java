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
 * The abstract condition-query of COURT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsCourtCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsCourtCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "COURT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判所ID)COURT_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
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
     * (裁判所ID)COURT_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
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
     * (裁判所ID)COURT_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param courtId The value of courtId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourtId_GreaterThan(Integer courtId) {
        regCourtId(CK_GT, courtId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判所ID)COURT_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param courtId The value of courtId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourtId_LessThan(Integer courtId) {
        regCourtId(CK_LT, courtId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判所ID)COURT_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param courtId The value of courtId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourtId_GreaterEqual(Integer courtId) {
        regCourtId(CK_GE, courtId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判所ID)COURT_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param courtId The value of courtId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourtId_LessEqual(Integer courtId) {
        regCourtId(CK_LE, courtId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判所ID)COURT_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
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
     * (裁判所ID)COURT_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of courtId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of courtId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCourtId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCourtId(), "COURT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (裁判所ID)COURT_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
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
     * (裁判所ID)COURT_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param courtIdList The collection of courtId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtId_NotInScope(Collection<Integer> courtIdList) {
        doSetCourtId_NotInScope(courtIdList);
    }

    protected void doSetCourtId_NotInScope(Collection<Integer> courtIdList) {
        regINS(CK_NINS, cTL(courtIdList), xgetCValueCourtId(), "COURT_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select COURT_ID from JUDGEMENT where ...)} <br>
     * (判決)JUDGEMENT by COURT_ID, named 'judgementAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCourtId_ExistsReferrer_JudgementList(cb.query());
        registerExistsReferrer(cb.query(), "COURT_ID", "COURT_ID", pp, "judgementList");
    }
    public abstract String keepCourtId_ExistsReferrer_JudgementList(JudgementCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select COURT_ID from JUDGEMENT where ...)} <br>
     * (判決)JUDGEMENT by COURT_ID, named 'judgementAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsJudgement</span>(judgementCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     judgementCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CourtId_NotExistsReferrer_JudgementList for 'not exists'. (NotNull)
     */
    public void notExistsJudgement(SubQuery<JudgementCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        JudgementCB cb = new JudgementCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCourtId_NotExistsReferrer_JudgementList(cb.query());
        registerNotExistsReferrer(cb.query(), "COURT_ID", "COURT_ID", pp, "judgementList");
    }
    public abstract String keepCourtId_NotExistsReferrer_JudgementList(JudgementCQ sq);

    public void xsderiveJudgementList(String fn, SubQuery<JudgementCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementCB cb = new JudgementCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCourtId_SpecifyDerivedReferrer_JudgementList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "COURT_ID", "COURT_ID", pp, "judgementList", al, op);
    }
    public abstract String keepCourtId_SpecifyDerivedReferrer_JudgementList(JudgementCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from JUDGEMENT where ...)} <br>
     * (判決)JUDGEMENT by COURT_ID, named 'judgementAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepCourtId_QueryDerivedReferrer_JudgementList(cb.query()); String prpp = keepCourtId_QueryDerivedReferrer_JudgementListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "COURT_ID", "COURT_ID", sqpp, "judgementList", rd, vl, prpp, op);
    }
    public abstract String keepCourtId_QueryDerivedReferrer_JudgementList(JudgementCQ sq);
    public abstract String keepCourtId_QueryDerivedReferrer_JudgementListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (裁判所ID)COURT_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setCourtId_IsNull() { regCourtId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (裁判所ID)COURT_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setCourtId_IsNotNull() { regCourtId(CK_ISNN, DOBJ); }

    protected void regCourtId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCourtId(), "COURT_ID"); }
    protected abstract ConditionValue xgetCValueCourtId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (裁判所名)COURT_NAME: {UQ, NotNull, VARCHAR(100)}
     * @param courtName The value of courtName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtName_Equal(String courtName) {
        doSetCourtName_Equal(fRES(courtName));
    }

    protected void doSetCourtName_Equal(String courtName) {
        regCourtName(CK_EQ, courtName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判所名)COURT_NAME: {UQ, NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setCourtName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param courtName The value of courtName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCourtName_LikeSearch(String courtName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCourtName_LikeSearch(courtName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判所名)COURT_NAME: {UQ, NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setCourtName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param courtName The value of courtName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCourtName_LikeSearch(String courtName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(courtName), xgetCValueCourtName(), "COURT_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判所名)COURT_NAME: {UQ, NotNull, VARCHAR(100)}
     * @param courtName The value of courtName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCourtName_NotLikeSearch(String courtName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCourtName_NotLikeSearch(courtName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判所名)COURT_NAME: {UQ, NotNull, VARCHAR(100)}
     * @param courtName The value of courtName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCourtName_NotLikeSearch(String courtName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(courtName), xgetCValueCourtName(), "COURT_NAME", likeSearchOption);
    }

    protected void regCourtName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCourtName(), "COURT_NAME"); }
    protected abstract ConditionValue xgetCValueCourtName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (裁判所別名)COURT_ALIAS: {UQ, NotNull, VARCHAR(100)}
     * @param courtAlias The value of courtAlias as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtAlias_Equal(String courtAlias) {
        doSetCourtAlias_Equal(fRES(courtAlias));
    }

    protected void doSetCourtAlias_Equal(String courtAlias) {
        regCourtAlias(CK_EQ, courtAlias);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (裁判所別名)COURT_ALIAS: {UQ, NotNull, VARCHAR(100)}
     * @param courtAlias The value of courtAlias as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtAlias_NotEqual(String courtAlias) {
        doSetCourtAlias_NotEqual(fRES(courtAlias));
    }

    protected void doSetCourtAlias_NotEqual(String courtAlias) {
        regCourtAlias(CK_NES, courtAlias);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (裁判所別名)COURT_ALIAS: {UQ, NotNull, VARCHAR(100)}
     * @param courtAliasList The collection of courtAlias as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtAlias_InScope(Collection<String> courtAliasList) {
        doSetCourtAlias_InScope(courtAliasList);
    }

    protected void doSetCourtAlias_InScope(Collection<String> courtAliasList) {
        regINS(CK_INS, cTL(courtAliasList), xgetCValueCourtAlias(), "COURT_ALIAS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (裁判所別名)COURT_ALIAS: {UQ, NotNull, VARCHAR(100)}
     * @param courtAliasList The collection of courtAlias as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtAlias_NotInScope(Collection<String> courtAliasList) {
        doSetCourtAlias_NotInScope(courtAliasList);
    }

    protected void doSetCourtAlias_NotInScope(Collection<String> courtAliasList) {
        regINS(CK_NINS, cTL(courtAliasList), xgetCValueCourtAlias(), "COURT_ALIAS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判所別名)COURT_ALIAS: {UQ, NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setCourtAlias_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param courtAlias The value of courtAlias as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCourtAlias_LikeSearch(String courtAlias, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCourtAlias_LikeSearch(courtAlias, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判所別名)COURT_ALIAS: {UQ, NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setCourtAlias_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param courtAlias The value of courtAlias as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCourtAlias_LikeSearch(String courtAlias, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(courtAlias), xgetCValueCourtAlias(), "COURT_ALIAS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判所別名)COURT_ALIAS: {UQ, NotNull, VARCHAR(100)}
     * @param courtAlias The value of courtAlias as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCourtAlias_NotLikeSearch(String courtAlias, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCourtAlias_NotLikeSearch(courtAlias, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判所別名)COURT_ALIAS: {UQ, NotNull, VARCHAR(100)}
     * @param courtAlias The value of courtAlias as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCourtAlias_NotLikeSearch(String courtAlias, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(courtAlias), xgetCValueCourtAlias(), "COURT_ALIAS", likeSearchOption);
    }

    protected void regCourtAlias(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCourtAlias(), "COURT_ALIAS"); }
    protected abstract ConditionValue xgetCValueCourtAlias();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType}
     * @param courtTypeCode The value of courtTypeCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtTypeCode_Equal(String courtTypeCode) {
        doSetCourtTypeCode_Equal(fRES(courtTypeCode));
    }

    /**
     * Equal(=). As CourtType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType} <br>
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
     * (裁判所種別コード)COURT_TYPE_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType}
     * @param courtTypeCode The value of courtTypeCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtTypeCode_NotEqual(String courtTypeCode) {
        doSetCourtTypeCode_NotEqual(fRES(courtTypeCode));
    }

    /**
     * NotEqual(&lt;&gt;). As CourtType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType} <br>
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
     * (裁判所種別コード)COURT_TYPE_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType}
     * @param courtTypeCodeList The collection of courtTypeCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtTypeCode_InScope(Collection<String> courtTypeCodeList) {
        doSetCourtTypeCode_InScope(courtTypeCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As CourtType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType} <br>
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
     * (裁判所種別コード)COURT_TYPE_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType}
     * @param courtTypeCodeList The collection of courtTypeCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtTypeCode_NotInScope(Collection<String> courtTypeCodeList) {
        doSetCourtTypeCode_NotInScope(courtTypeCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CourtType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType} <br>
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtTypeCode_NotInScope_AsCourtType(Collection<CDef.CourtType> cdefList) {
        doSetCourtTypeCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetCourtTypeCode_NotInScope(Collection<String> courtTypeCodeList) {
        regINS(CK_NINS, cTL(courtTypeCodeList), xgetCValueCourtTypeCode(), "COURT_TYPE_CODE");
    }

    protected void regCourtTypeCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCourtTypeCode(), "COURT_TYPE_CODE"); }
    protected abstract ConditionValue xgetCValueCourtTypeCode();

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
    public HpSLCFunction<CourtCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, CourtCB.class);
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
    public HpSLCFunction<CourtCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, CourtCB.class);
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
    public HpSLCFunction<CourtCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, CourtCB.class);
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
    public HpSLCFunction<CourtCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, CourtCB.class);
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
    public HpSLCFunction<CourtCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, CourtCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;CourtCB&gt;() {
     *     public void query(CourtCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CourtCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, CourtCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        CourtCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(CourtCQ sq);

    protected CourtCB xcreateScalarConditionCB() {
        CourtCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected CourtCB xcreateScalarConditionPartitionByCB() {
        CourtCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<CourtCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CourtCB cb = new CourtCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "COURT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(CourtCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<CourtCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(CourtCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CourtCB cb = new CourtCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "COURT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(CourtCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<CourtCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CourtCB cb = new CourtCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(CourtCQ sq);

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
    protected CourtCB newMyCB() {
        return new CourtCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return CourtCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
