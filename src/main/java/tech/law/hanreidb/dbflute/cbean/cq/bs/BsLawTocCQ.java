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

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import tech.law.hanreidb.dbflute.cbean.cq.ciq.*;
import tech.law.hanreidb.dbflute.cbean.*;
import tech.law.hanreidb.dbflute.cbean.cq.*;

/**
 * The base condition-query of LAW_TOC.
 * @author DBFlute(AutoGenerator)
 */
public class BsLawTocCQ extends AbstractBsLawTocCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LawTocCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsLawTocCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from LAW_TOC) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LawTocCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LawTocCIQ xcreateCIQ() {
        LawTocCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LawTocCIQ xnewCIQ() {
        return new LawTocCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join LAW_TOC on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LawTocCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LawTocCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _lawTocId;
    public ConditionValue xdfgetLawTocId()
    { if (_lawTocId == null) { _lawTocId = nCV(); }
      return _lawTocId; }
    protected ConditionValue xgetCValueLawTocId() { return xdfgetLawTocId(); }

    public Map<String, ArticleCQ> xdfgetLawTocId_ExistsReferrer_ArticleList() { return xgetSQueMap("lawTocId_ExistsReferrer_ArticleList"); }
    public String keepLawTocId_ExistsReferrer_ArticleList(ArticleCQ sq) { return xkeepSQue("lawTocId_ExistsReferrer_ArticleList", sq); }

    public Map<String, ArticleCQ> xdfgetLawTocId_NotExistsReferrer_ArticleList() { return xgetSQueMap("lawTocId_NotExistsReferrer_ArticleList"); }
    public String keepLawTocId_NotExistsReferrer_ArticleList(ArticleCQ sq) { return xkeepSQue("lawTocId_NotExistsReferrer_ArticleList", sq); }

    public Map<String, ArticleCQ> xdfgetLawTocId_SpecifyDerivedReferrer_ArticleList() { return xgetSQueMap("lawTocId_SpecifyDerivedReferrer_ArticleList"); }
    public String keepLawTocId_SpecifyDerivedReferrer_ArticleList(ArticleCQ sq) { return xkeepSQue("lawTocId_SpecifyDerivedReferrer_ArticleList", sq); }

    public Map<String, ArticleCQ> xdfgetLawTocId_QueryDerivedReferrer_ArticleList() { return xgetSQueMap("lawTocId_QueryDerivedReferrer_ArticleList"); }
    public String keepLawTocId_QueryDerivedReferrer_ArticleList(ArticleCQ sq) { return xkeepSQue("lawTocId_QueryDerivedReferrer_ArticleList", sq); }
    public Map<String, Object> xdfgetLawTocId_QueryDerivedReferrer_ArticleListParameter() { return xgetSQuePmMap("lawTocId_QueryDerivedReferrer_ArticleList"); }
    public String keepLawTocId_QueryDerivedReferrer_ArticleListParameter(Object pm) { return xkeepSQuePm("lawTocId_QueryDerivedReferrer_ArticleList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * (法令目次ID)LAW_TOC_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_LawTocId_Asc() { regOBA("LAW_TOC_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (法令目次ID)LAW_TOC_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_LawTocId_Desc() { regOBD("LAW_TOC_ID"); return this; }

    protected ConditionValue _lawHistoryId;
    public ConditionValue xdfgetLawHistoryId()
    { if (_lawHistoryId == null) { _lawHistoryId = nCV(); }
      return _lawHistoryId; }
    protected ConditionValue xgetCValueLawHistoryId() { return xdfgetLawHistoryId(); }

    /** 
     * Add order-by as ascend. <br>
     * (法令履歴ID)LAW_HISTORY_ID: {IX, NotNull, INT(10), FK to LAW_HISTORY}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_LawHistoryId_Asc() { regOBA("LAW_HISTORY_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (法令履歴ID)LAW_HISTORY_ID: {IX, NotNull, INT(10), FK to LAW_HISTORY}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_LawHistoryId_Desc() { regOBD("LAW_HISTORY_ID"); return this; }

    protected ConditionValue _partNumber;
    public ConditionValue xdfgetPartNumber()
    { if (_partNumber == null) { _partNumber = nCV(); }
      return _partNumber; }
    protected ConditionValue xgetCValuePartNumber() { return xdfgetPartNumber(); }

    /** 
     * Add order-by as ascend. <br>
     * (編番号)PART_NUMBER: {INT(10)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_PartNumber_Asc() { regOBA("PART_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (編番号)PART_NUMBER: {INT(10)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_PartNumber_Desc() { regOBD("PART_NUMBER"); return this; }

    protected ConditionValue _partTitle;
    public ConditionValue xdfgetPartTitle()
    { if (_partTitle == null) { _partTitle = nCV(); }
      return _partTitle; }
    protected ConditionValue xgetCValuePartTitle() { return xdfgetPartTitle(); }

    /** 
     * Add order-by as ascend. <br>
     * (編タイトル)PART_TITLE: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_PartTitle_Asc() { regOBA("PART_TITLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (編タイトル)PART_TITLE: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_PartTitle_Desc() { regOBD("PART_TITLE"); return this; }

    protected ConditionValue _partCaption;
    public ConditionValue xdfgetPartCaption()
    { if (_partCaption == null) { _partCaption = nCV(); }
      return _partCaption; }
    protected ConditionValue xgetCValuePartCaption() { return xdfgetPartCaption(); }

    /** 
     * Add order-by as ascend. <br>
     * (編見出し)PART_CAPTION: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_PartCaption_Asc() { regOBA("PART_CAPTION"); return this; }

    /**
     * Add order-by as descend. <br>
     * (編見出し)PART_CAPTION: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_PartCaption_Desc() { regOBD("PART_CAPTION"); return this; }

    protected ConditionValue _chapterNumber;
    public ConditionValue xdfgetChapterNumber()
    { if (_chapterNumber == null) { _chapterNumber = nCV(); }
      return _chapterNumber; }
    protected ConditionValue xgetCValueChapterNumber() { return xdfgetChapterNumber(); }

    /** 
     * Add order-by as ascend. <br>
     * (章番号)CHAPTER_NUMBER: {INT(10)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_ChapterNumber_Asc() { regOBA("CHAPTER_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (章番号)CHAPTER_NUMBER: {INT(10)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_ChapterNumber_Desc() { regOBD("CHAPTER_NUMBER"); return this; }

    protected ConditionValue _chapterTitle;
    public ConditionValue xdfgetChapterTitle()
    { if (_chapterTitle == null) { _chapterTitle = nCV(); }
      return _chapterTitle; }
    protected ConditionValue xgetCValueChapterTitle() { return xdfgetChapterTitle(); }

    /** 
     * Add order-by as ascend. <br>
     * (章タイトル)CHAPTER_TITLE: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_ChapterTitle_Asc() { regOBA("CHAPTER_TITLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (章タイトル)CHAPTER_TITLE: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_ChapterTitle_Desc() { regOBD("CHAPTER_TITLE"); return this; }

    protected ConditionValue _chapterCaption;
    public ConditionValue xdfgetChapterCaption()
    { if (_chapterCaption == null) { _chapterCaption = nCV(); }
      return _chapterCaption; }
    protected ConditionValue xgetCValueChapterCaption() { return xdfgetChapterCaption(); }

    /** 
     * Add order-by as ascend. <br>
     * (章見出し)CHAPTER_CAPTION: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_ChapterCaption_Asc() { regOBA("CHAPTER_CAPTION"); return this; }

    /**
     * Add order-by as descend. <br>
     * (章見出し)CHAPTER_CAPTION: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_ChapterCaption_Desc() { regOBD("CHAPTER_CAPTION"); return this; }

    protected ConditionValue _sectionNumber;
    public ConditionValue xdfgetSectionNumber()
    { if (_sectionNumber == null) { _sectionNumber = nCV(); }
      return _sectionNumber; }
    protected ConditionValue xgetCValueSectionNumber() { return xdfgetSectionNumber(); }

    /** 
     * Add order-by as ascend. <br>
     * (節番号)SECTION_NUMBER: {INT(10)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_SectionNumber_Asc() { regOBA("SECTION_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (節番号)SECTION_NUMBER: {INT(10)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_SectionNumber_Desc() { regOBD("SECTION_NUMBER"); return this; }

    protected ConditionValue _sectionTitle;
    public ConditionValue xdfgetSectionTitle()
    { if (_sectionTitle == null) { _sectionTitle = nCV(); }
      return _sectionTitle; }
    protected ConditionValue xgetCValueSectionTitle() { return xdfgetSectionTitle(); }

    /** 
     * Add order-by as ascend. <br>
     * (節タイトル)SECTION_TITLE: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_SectionTitle_Asc() { regOBA("SECTION_TITLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (節タイトル)SECTION_TITLE: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_SectionTitle_Desc() { regOBD("SECTION_TITLE"); return this; }

    protected ConditionValue _sectionCaption;
    public ConditionValue xdfgetSectionCaption()
    { if (_sectionCaption == null) { _sectionCaption = nCV(); }
      return _sectionCaption; }
    protected ConditionValue xgetCValueSectionCaption() { return xdfgetSectionCaption(); }

    /** 
     * Add order-by as ascend. <br>
     * (節見出し)SECTION_CAPTION: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_SectionCaption_Asc() { regOBA("SECTION_CAPTION"); return this; }

    /**
     * Add order-by as descend. <br>
     * (節見出し)SECTION_CAPTION: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_SectionCaption_Desc() { regOBD("SECTION_CAPTION"); return this; }

    protected ConditionValue _subsectionNumber;
    public ConditionValue xdfgetSubsectionNumber()
    { if (_subsectionNumber == null) { _subsectionNumber = nCV(); }
      return _subsectionNumber; }
    protected ConditionValue xgetCValueSubsectionNumber() { return xdfgetSubsectionNumber(); }

    /** 
     * Add order-by as ascend. <br>
     * (款番号)SUBSECTION_NUMBER: {INT(10)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_SubsectionNumber_Asc() { regOBA("SUBSECTION_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (款番号)SUBSECTION_NUMBER: {INT(10)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_SubsectionNumber_Desc() { regOBD("SUBSECTION_NUMBER"); return this; }

    protected ConditionValue _subsectionTitle;
    public ConditionValue xdfgetSubsectionTitle()
    { if (_subsectionTitle == null) { _subsectionTitle = nCV(); }
      return _subsectionTitle; }
    protected ConditionValue xgetCValueSubsectionTitle() { return xdfgetSubsectionTitle(); }

    /** 
     * Add order-by as ascend. <br>
     * (款タイトル)SUBSECTION_TITLE: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_SubsectionTitle_Asc() { regOBA("SUBSECTION_TITLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (款タイトル)SUBSECTION_TITLE: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_SubsectionTitle_Desc() { regOBD("SUBSECTION_TITLE"); return this; }

    protected ConditionValue _subsectionCaption;
    public ConditionValue xdfgetSubsectionCaption()
    { if (_subsectionCaption == null) { _subsectionCaption = nCV(); }
      return _subsectionCaption; }
    protected ConditionValue xgetCValueSubsectionCaption() { return xdfgetSubsectionCaption(); }

    /** 
     * Add order-by as ascend. <br>
     * (款見出し)SUBSECTION_CAPTION: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_SubsectionCaption_Asc() { regOBA("SUBSECTION_CAPTION"); return this; }

    /**
     * Add order-by as descend. <br>
     * (款見出し)SUBSECTION_CAPTION: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_SubsectionCaption_Desc() { regOBD("SUBSECTION_CAPTION"); return this; }

    protected ConditionValue _divisionNumber;
    public ConditionValue xdfgetDivisionNumber()
    { if (_divisionNumber == null) { _divisionNumber = nCV(); }
      return _divisionNumber; }
    protected ConditionValue xgetCValueDivisionNumber() { return xdfgetDivisionNumber(); }

    /** 
     * Add order-by as ascend. <br>
     * (目番号)DIVISION_NUMBER: {INT(10)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_DivisionNumber_Asc() { regOBA("DIVISION_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (目番号)DIVISION_NUMBER: {INT(10)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_DivisionNumber_Desc() { regOBD("DIVISION_NUMBER"); return this; }

    protected ConditionValue _divisionTitle;
    public ConditionValue xdfgetDivisionTitle()
    { if (_divisionTitle == null) { _divisionTitle = nCV(); }
      return _divisionTitle; }
    protected ConditionValue xgetCValueDivisionTitle() { return xdfgetDivisionTitle(); }

    /** 
     * Add order-by as ascend. <br>
     * (目タイトル)DIVISION_TITLE: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_DivisionTitle_Asc() { regOBA("DIVISION_TITLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (目タイトル)DIVISION_TITLE: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_DivisionTitle_Desc() { regOBD("DIVISION_TITLE"); return this; }

    protected ConditionValue _divisionCaption;
    public ConditionValue xdfgetDivisionCaption()
    { if (_divisionCaption == null) { _divisionCaption = nCV(); }
      return _divisionCaption; }
    protected ConditionValue xgetCValueDivisionCaption() { return xdfgetDivisionCaption(); }

    /** 
     * Add order-by as ascend. <br>
     * (目見出し)DIVISION_CAPTION: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_DivisionCaption_Asc() { regOBA("DIVISION_CAPTION"); return this; }

    /**
     * Add order-by as descend. <br>
     * (目見出し)DIVISION_CAPTION: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_DivisionCaption_Desc() { regOBD("DIVISION_CAPTION"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue xdfgetRegisterUser()
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected ConditionValue xgetCValueRegisterUser() { return xdfgetRegisterUser(); }

    /** 
     * Add order-by as ascend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue xdfgetUpdateUser()
    { if (_updateUser == null) { _updateUser = nCV(); }
      return _updateUser; }
    protected ConditionValue xgetCValueUpdateUser() { return xdfgetUpdateUser(); }

    /** 
     * Add order-by as ascend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /** 
     * Add order-by as ascend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]}
     * @return this. (NotNull)
     */
    public BsLawTocCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsLawTocCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsLawTocCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        LawTocCQ bq = (LawTocCQ)bqs;
        LawTocCQ uq = (LawTocCQ)uqs;
        if (bq.hasConditionQueryLawHistory()) {
            uq.queryLawHistory().reflectRelationOnUnionQuery(bq.queryLawHistory(), uq.queryLawHistory());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (法令履歴)LAW_HISTORY by my LAW_HISTORY_ID, named 'lawHistory'.
     * @return The instance of condition-query. (NotNull)
     */
    public LawHistoryCQ queryLawHistory() {
        return xdfgetConditionQueryLawHistory();
    }
    public LawHistoryCQ xdfgetConditionQueryLawHistory() {
        String prop = "lawHistory";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryLawHistory()); xsetupOuterJoinLawHistory(); }
        return xgetQueRlMap(prop);
    }
    protected LawHistoryCQ xcreateQueryLawHistory() {
        String nrp = xresolveNRP("LAW_TOC", "lawHistory"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LawHistoryCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "lawHistory", nrp);
    }
    protected void xsetupOuterJoinLawHistory() { xregOutJo("lawHistory"); }
    public boolean hasConditionQueryLawHistory() { return xhasQueRlMap("lawHistory"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, LawTocCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(LawTocCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, LawTocCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(LawTocCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, LawTocCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(LawTocCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, LawTocCQ> _myselfExistsMap;
    public Map<String, LawTocCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(LawTocCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, LawTocCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(LawTocCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LawTocCB.class.getName(); }
    protected String xCQ() { return LawTocCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
