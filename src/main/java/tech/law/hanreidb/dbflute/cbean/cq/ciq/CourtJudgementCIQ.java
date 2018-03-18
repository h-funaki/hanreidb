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
 * The condition-query for in-line of COURT_JUDGEMENT.
 * @author DBFlute(AutoGenerator)
 */
public class CourtJudgementCIQ extends AbstractBsCourtJudgementCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsCourtJudgementCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public CourtJudgementCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsCourtJudgementCQ myCQ) {
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
    protected ConditionValue xgetCValueCourtJudgementId() { return _myCQ.xdfgetCourtJudgementId(); }
    protected ConditionValue xgetCValueCaseNumber() { return _myCQ.xdfgetCaseNumber(); }
    protected ConditionValue xgetCValueCaseName() { return _myCQ.xdfgetCaseName(); }
    protected ConditionValue xgetCValueJudgementDate() { return _myCQ.xdfgetJudgementDate(); }
    protected ConditionValue xgetCValueCourtName() { return _myCQ.xdfgetCourtName(); }
    protected ConditionValue xgetCValueJudgementType() { return _myCQ.xdfgetJudgementType(); }
    protected ConditionValue xgetCValueJudgementResult() { return _myCQ.xdfgetJudgementResult(); }
    protected ConditionValue xgetCValuePrecedentReports() { return _myCQ.xdfgetPrecedentReports(); }
    protected ConditionValue xgetCValueOriginalCourtName() { return _myCQ.xdfgetOriginalCourtName(); }
    protected ConditionValue xgetCValueOriginalCaseNumber() { return _myCQ.xdfgetOriginalCaseNumber(); }
    protected ConditionValue xgetCValueOriginalJudgementDate() { return _myCQ.xdfgetOriginalJudgementDate(); }
    protected ConditionValue xgetCValueOriginalJudgementResult() { return _myCQ.xdfgetOriginalJudgementResult(); }
    protected ConditionValue xgetCValueJudgementContent() { return _myCQ.xdfgetJudgementContent(); }
    protected ConditionValue xgetCValueJudgementSummary() { return _myCQ.xdfgetJudgementSummary(); }
    protected ConditionValue xgetCValueLaw() { return _myCQ.xdfgetLaw(); }
    protected ConditionValue xgetCValueTextUrl() { return _myCQ.xdfgetTextUrl(); }
    protected ConditionValue xgetCValueHighCourtReports() { return _myCQ.xdfgetHighCourtReports(); }
    protected ConditionValue xgetCValueJudgementContentSummary() { return _myCQ.xdfgetJudgementContentSummary(); }
    protected ConditionValue xgetCValueRightType() { return _myCQ.xdfgetRightType(); }
    protected ConditionValue xgetCValueLawsuitType() { return _myCQ.xdfgetLawsuitType(); }
    protected ConditionValue xgetCValueCaseCategory() { return _myCQ.xdfgetCaseCategory(); }
    protected ConditionValue xgetCValueSourceOriginalId() { return _myCQ.xdfgetSourceOriginalId(); }
    protected ConditionValue xgetCValueMemo() { return _myCQ.xdfgetMemo(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueRegisterUser() { return _myCQ.xdfgetRegisterUser(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected ConditionValue xgetCValueUpdateUser() { return _myCQ.xdfgetUpdateUser(); }
    protected ConditionValue xgetCValueVersionNo() { return _myCQ.xdfgetVersionNo(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(CourtJudgementCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(CourtJudgementCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(CourtJudgementCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(CourtJudgementCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return CourtJudgementCB.class.getName(); }
    protected String xinCQ() { return CourtJudgementCQ.class.getName(); }
}
