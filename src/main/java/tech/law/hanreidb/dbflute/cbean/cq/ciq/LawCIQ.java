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
 * The condition-query for in-line of LAW.
 * @author DBFlute(AutoGenerator)
 */
public class LawCIQ extends AbstractBsLawCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsLawCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LawCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsLawCQ myCQ) {
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
    protected ConditionValue xgetCValueLawId() { return _myCQ.xdfgetLawId(); }
    public String keepLawId_ExistsReferrer_LawAliasList(LawAliasCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLawId_ExistsReferrer_LawCategoryRelList(LawCategoryRelCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLawId_ExistsReferrer_LawHistoryByAmendLawIdList(LawHistoryCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLawId_ExistsReferrer_LawHistoryByLawIdList(LawHistoryCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLawId_ExistsReferrer_LawSourceRelList(LawSourceRelCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLawId_ExistsReferrer_SourceLawCategoryRelList(SourceLawCategoryRelCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLawId_NotExistsReferrer_LawAliasList(LawAliasCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLawId_NotExistsReferrer_LawCategoryRelList(LawCategoryRelCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLawId_NotExistsReferrer_LawHistoryByAmendLawIdList(LawHistoryCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLawId_NotExistsReferrer_LawHistoryByLawIdList(LawHistoryCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLawId_NotExistsReferrer_LawSourceRelList(LawSourceRelCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLawId_NotExistsReferrer_SourceLawCategoryRelList(SourceLawCategoryRelCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLawId_SpecifyDerivedReferrer_LawAliasList(LawAliasCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLawId_SpecifyDerivedReferrer_LawCategoryRelList(LawCategoryRelCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLawId_SpecifyDerivedReferrer_LawHistoryByAmendLawIdList(LawHistoryCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLawId_SpecifyDerivedReferrer_LawHistoryByLawIdList(LawHistoryCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLawId_SpecifyDerivedReferrer_LawSourceRelList(LawSourceRelCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLawId_SpecifyDerivedReferrer_SourceLawCategoryRelList(SourceLawCategoryRelCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLawId_QueryDerivedReferrer_LawAliasList(LawAliasCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLawId_QueryDerivedReferrer_LawAliasListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLawId_QueryDerivedReferrer_LawCategoryRelList(LawCategoryRelCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLawId_QueryDerivedReferrer_LawCategoryRelListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLawId_QueryDerivedReferrer_LawHistoryByAmendLawIdList(LawHistoryCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLawId_QueryDerivedReferrer_LawHistoryByAmendLawIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLawId_QueryDerivedReferrer_LawHistoryByLawIdList(LawHistoryCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLawId_QueryDerivedReferrer_LawHistoryByLawIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLawId_QueryDerivedReferrer_LawSourceRelList(LawSourceRelCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLawId_QueryDerivedReferrer_LawSourceRelListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLawId_QueryDerivedReferrer_SourceLawCategoryRelList(SourceLawCategoryRelCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLawId_QueryDerivedReferrer_SourceLawCategoryRelListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueLawTypeCode() { return _myCQ.xdfgetLawTypeCode(); }
    protected ConditionValue xgetCValueLawPublicCode() { return _myCQ.xdfgetLawPublicCode(); }
    protected ConditionValue xgetCValueLawName() { return _myCQ.xdfgetLawName(); }
    protected ConditionValue xgetCValueLawNumber() { return _myCQ.xdfgetLawNumber(); }
    protected ConditionValue xgetCValuePromulgationDate() { return _myCQ.xdfgetPromulgationDate(); }
    protected ConditionValue xgetCValueEffectiveDate() { return _myCQ.xdfgetEffectiveDate(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueRegisterUser() { return _myCQ.xdfgetRegisterUser(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected ConditionValue xgetCValueUpdateUser() { return _myCQ.xdfgetUpdateUser(); }
    protected ConditionValue xgetCValueVersionNo() { return _myCQ.xdfgetVersionNo(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(LawCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(LawCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(LawCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(LawCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return LawCB.class.getName(); }
    protected String xinCQ() { return LawCQ.class.getName(); }
}
