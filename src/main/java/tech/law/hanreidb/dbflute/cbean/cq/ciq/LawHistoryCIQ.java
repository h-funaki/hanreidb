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
 * The condition-query for in-line of LAW_HISTORY.
 * @author DBFlute(AutoGenerator)
 */
public class LawHistoryCIQ extends AbstractBsLawHistoryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsLawHistoryCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LawHistoryCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsLawHistoryCQ myCQ) {
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
    protected ConditionValue xgetCValueLawHistoryId() { return _myCQ.xdfgetLawHistoryId(); }
    public String keepLawHistoryId_ExistsReferrer_ArticleList(ArticleCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLawHistoryId_ExistsReferrer_LawContentList(LawContentCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLawHistoryId_ExistsReferrer_LawTocList(LawTocCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLawHistoryId_NotExistsReferrer_ArticleList(ArticleCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLawHistoryId_NotExistsReferrer_LawContentList(LawContentCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLawHistoryId_NotExistsReferrer_LawTocList(LawTocCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLawHistoryId_SpecifyDerivedReferrer_ArticleList(ArticleCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLawHistoryId_SpecifyDerivedReferrer_LawContentList(LawContentCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLawHistoryId_SpecifyDerivedReferrer_LawTocList(LawTocCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLawHistoryId_QueryDerivedReferrer_ArticleList(ArticleCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLawHistoryId_QueryDerivedReferrer_ArticleListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLawHistoryId_QueryDerivedReferrer_LawContentList(LawContentCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLawHistoryId_QueryDerivedReferrer_LawContentListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLawHistoryId_QueryDerivedReferrer_LawTocList(LawTocCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLawHistoryId_QueryDerivedReferrer_LawTocListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueLawId() { return _myCQ.xdfgetLawId(); }
    protected ConditionValue xgetCValueAmendLawId() { return _myCQ.xdfgetAmendLawId(); }
    protected ConditionValue xgetCValueLawAmendVersion() { return _myCQ.xdfgetLawAmendVersion(); }
    protected ConditionValue xgetCValueLatestVersionFlg() { return _myCQ.xdfgetLatestVersionFlg(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueRegisterUser() { return _myCQ.xdfgetRegisterUser(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected ConditionValue xgetCValueUpdateUser() { return _myCQ.xdfgetUpdateUser(); }
    protected ConditionValue xgetCValueVersionNo() { return _myCQ.xdfgetVersionNo(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(LawHistoryCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(LawHistoryCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(LawHistoryCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(LawHistoryCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return LawHistoryCB.class.getName(); }
    protected String xinCQ() { return LawHistoryCQ.class.getName(); }
}
