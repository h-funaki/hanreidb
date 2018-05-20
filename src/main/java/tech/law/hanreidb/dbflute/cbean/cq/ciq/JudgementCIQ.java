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
package tech.law.hanreidb.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import tech.law.hanreidb.dbflute.cbean.*;
import tech.law.hanreidb.dbflute.cbean.cq.bs.*;
import tech.law.hanreidb.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of JUDGEMENT.
 * @author DBFlute(AutoGenerator)
 */
public class JudgementCIQ extends AbstractBsJudgementCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsJudgementCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public JudgementCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsJudgementCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueJudgementId() { return _myCQ.xdfgetJudgementId(); }
    public String keepJudgementId_ExistsReferrer_JudgementSelfList(JudgementCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepJudgementId_ExistsReferrer_JudgementArticleRelList(JudgementArticleRelCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepJudgementId_ExistsReferrer_JudgementReportRelList(JudgementReportRelCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepJudgementId_ExistsReferrer_JudgementSourceRelList(JudgementSourceRelCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepJudgementId_ExistsReferrer_JudgementUserFavoriteRelList(JudgementUserFavoriteRelCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepJudgementId_NotExistsReferrer_JudgementSelfList(JudgementCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepJudgementId_NotExistsReferrer_JudgementArticleRelList(JudgementArticleRelCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepJudgementId_NotExistsReferrer_JudgementReportRelList(JudgementReportRelCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepJudgementId_NotExistsReferrer_JudgementSourceRelList(JudgementSourceRelCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepJudgementId_NotExistsReferrer_JudgementUserFavoriteRelList(JudgementUserFavoriteRelCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepJudgementId_SpecifyDerivedReferrer_JudgementSelfList(JudgementCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepJudgementId_SpecifyDerivedReferrer_JudgementArticleRelList(JudgementArticleRelCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepJudgementId_SpecifyDerivedReferrer_JudgementReportRelList(JudgementReportRelCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepJudgementId_SpecifyDerivedReferrer_JudgementSourceRelList(JudgementSourceRelCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepJudgementId_SpecifyDerivedReferrer_JudgementUserFavoriteRelList(JudgementUserFavoriteRelCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepJudgementId_QueryDerivedReferrer_JudgementSelfList(JudgementCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepJudgementId_QueryDerivedReferrer_JudgementSelfListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepJudgementId_QueryDerivedReferrer_JudgementArticleRelList(JudgementArticleRelCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepJudgementId_QueryDerivedReferrer_JudgementArticleRelListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepJudgementId_QueryDerivedReferrer_JudgementReportRelList(JudgementReportRelCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepJudgementId_QueryDerivedReferrer_JudgementReportRelListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepJudgementId_QueryDerivedReferrer_JudgementSourceRelList(JudgementSourceRelCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepJudgementId_QueryDerivedReferrer_JudgementSourceRelListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepJudgementId_QueryDerivedReferrer_JudgementUserFavoriteRelList(JudgementUserFavoriteRelCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepJudgementId_QueryDerivedReferrer_JudgementUserFavoriteRelListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueJudgementPublicCode() { return _myCQ.xdfgetJudgementPublicCode(); }
    protected ConditionValue xgetCValueCaseName() { return _myCQ.xdfgetCaseName(); }
    protected ConditionValue xgetCValueJudgementDate() { return _myCQ.xdfgetJudgementDate(); }
    protected ConditionValue xgetCValueOriginalJudgementId() { return _myCQ.xdfgetOriginalJudgementId(); }
    protected ConditionValue xgetCValueCaseNumberEraCode() { return _myCQ.xdfgetCaseNumberEraCode(); }
    protected ConditionValue xgetCValueCaseNumberYear() { return _myCQ.xdfgetCaseNumberYear(); }
    protected ConditionValue xgetCValueCaseMarkId() { return _myCQ.xdfgetCaseMarkId(); }
    protected ConditionValue xgetCValueCaseNumberSerialNumber() { return _myCQ.xdfgetCaseNumberSerialNumber(); }
    protected ConditionValue xgetCValueCourtId() { return _myCQ.xdfgetCourtId(); }
    protected ConditionValue xgetCValueBenchCode() { return _myCQ.xdfgetBenchCode(); }
    protected ConditionValue xgetCValueJudgementResultCode() { return _myCQ.xdfgetJudgementResultCode(); }
    protected ConditionValue xgetCValueJudgementTypeCode() { return _myCQ.xdfgetJudgementTypeCode(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueRegisterUser() { return _myCQ.xdfgetRegisterUser(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected ConditionValue xgetCValueUpdateUser() { return _myCQ.xdfgetUpdateUser(); }
    protected ConditionValue xgetCValueVersionNo() { return _myCQ.xdfgetVersionNo(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(JudgementCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(JudgementCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(JudgementCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(JudgementCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return JudgementCB.class.getName(); }
    protected String xinCQ() { return JudgementCQ.class.getName(); }
}
