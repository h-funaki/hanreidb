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
package tech.law.hanreidb.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import tech.law.hanreidb.dbflute.allcommon.EntityDefinedCommonColumn;
import tech.law.hanreidb.dbflute.allcommon.DBMetaInstanceHandler;
import tech.law.hanreidb.dbflute.exentity.*;

/**
 * The entity of (法令目次)LAW_TOC as TABLE. <br>
 * <pre>
 * [primary-key]
 *     LAW_TOC_ID
 *
 * [column]
 *     LAW_TOC_ID, LAW_HISTORY_ID, PART_NUMBER, PART_TITLE, PART_CAPTION, CHAPTER_NUMBER, CHAPTER_TITLE, CHAPTER_CAPTION, SECTION_NUMBER, SECTION_TITLE, SECTION_CAPTION, SUBSECTION_NUMBER, SUBSECTION_TITLE, SUBSECTION_CAPTION, DIVISION_NUMBER, DIVISION_TITLE, DIVISION_CAPTION, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LAW_TOC_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     LAW_HISTORY
 *
 * [referrer table]
 *     ARTICLE
 *
 * [foreign property]
 *     lawHistory
 *
 * [referrer property]
 *     articleList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long lawTocId = entity.getLawTocId();
 * Integer lawHistoryId = entity.getLawHistoryId();
 * Integer partNumber = entity.getPartNumber();
 * String partTitle = entity.getPartTitle();
 * String partCaption = entity.getPartCaption();
 * Integer chapterNumber = entity.getChapterNumber();
 * String chapterTitle = entity.getChapterTitle();
 * String chapterCaption = entity.getChapterCaption();
 * Integer sectionNumber = entity.getSectionNumber();
 * String sectionTitle = entity.getSectionTitle();
 * String sectionCaption = entity.getSectionCaption();
 * Integer subsectionNumber = entity.getSubsectionNumber();
 * String subsectionTitle = entity.getSubsectionTitle();
 * String subsectionCaption = entity.getSubsectionCaption();
 * Integer divisionNumber = entity.getDivisionNumber();
 * String divisionTitle = entity.getDivisionTitle();
 * String divisionCaption = entity.getDivisionCaption();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setLawTocId(lawTocId);
 * entity.setLawHistoryId(lawHistoryId);
 * entity.setPartNumber(partNumber);
 * entity.setPartTitle(partTitle);
 * entity.setPartCaption(partCaption);
 * entity.setChapterNumber(chapterNumber);
 * entity.setChapterTitle(chapterTitle);
 * entity.setChapterCaption(chapterCaption);
 * entity.setSectionNumber(sectionNumber);
 * entity.setSectionTitle(sectionTitle);
 * entity.setSectionCaption(sectionCaption);
 * entity.setSubsectionNumber(subsectionNumber);
 * entity.setSubsectionTitle(subsectionTitle);
 * entity.setSubsectionCaption(subsectionCaption);
 * entity.setDivisionNumber(divisionNumber);
 * entity.setDivisionTitle(divisionTitle);
 * entity.setDivisionCaption(divisionCaption);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsLawToc extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (法令目次ID)LAW_TOC_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _lawTocId;

    /** (法令履歴ID)LAW_HISTORY_ID: {IX, NotNull, INT(10), FK to LAW_HISTORY} */
    protected Integer _lawHistoryId;

    /** (編番号)PART_NUMBER: {INT(10)} */
    protected Integer _partNumber;

    /** (編タイトル)PART_TITLE: {VARCHAR(100)} */
    protected String _partTitle;

    /** (編見出し)PART_CAPTION: {VARCHAR(200)} */
    protected String _partCaption;

    /** (章番号)CHAPTER_NUMBER: {INT(10)} */
    protected Integer _chapterNumber;

    /** (章タイトル)CHAPTER_TITLE: {VARCHAR(100)} */
    protected String _chapterTitle;

    /** (章見出し)CHAPTER_CAPTION: {VARCHAR(200)} */
    protected String _chapterCaption;

    /** (節番号)SECTION_NUMBER: {INT(10)} */
    protected Integer _sectionNumber;

    /** (節タイトル)SECTION_TITLE: {VARCHAR(100)} */
    protected String _sectionTitle;

    /** (節見出し)SECTION_CAPTION: {VARCHAR(200)} */
    protected String _sectionCaption;

    /** (款番号)SUBSECTION_NUMBER: {INT(10)} */
    protected Integer _subsectionNumber;

    /** (款タイトル)SUBSECTION_TITLE: {VARCHAR(100)} */
    protected String _subsectionTitle;

    /** (款見出し)SUBSECTION_CAPTION: {VARCHAR(200)} */
    protected String _subsectionCaption;

    /** (目番号)DIVISION_NUMBER: {INT(10)} */
    protected Integer _divisionNumber;

    /** (目タイトル)DIVISION_TITLE: {VARCHAR(100)} */
    protected String _divisionTitle;

    /** (目見出し)DIVISION_CAPTION: {VARCHAR(200)} */
    protected String _divisionCaption;

    /** (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _registerDatetime;

    /** (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} */
    protected String _registerUser;

    /** (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _updateDatetime;

    /** (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)} */
    protected String _updateUser;

    /** (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]} */
    protected Long _versionNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "LAW_TOC";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_lawTocId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (法令履歴)LAW_HISTORY by my LAW_HISTORY_ID, named 'lawHistory'. */
    protected OptionalEntity<LawHistory> _lawHistory;

    /**
     * [get] (法令履歴)LAW_HISTORY by my LAW_HISTORY_ID, named 'lawHistory'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'lawHistory'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<LawHistory> getLawHistory() {
        if (_lawHistory == null) { _lawHistory = OptionalEntity.relationEmpty(this, "lawHistory"); }
        return _lawHistory;
    }

    /**
     * [set] (法令履歴)LAW_HISTORY by my LAW_HISTORY_ID, named 'lawHistory'.
     * @param lawHistory The entity of foreign property 'lawHistory'. (NullAllowed)
     */
    public void setLawHistory(OptionalEntity<LawHistory> lawHistory) {
        _lawHistory = lawHistory;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (条文)ARTICLE by LAW_TOC_ID, named 'articleList'. */
    protected List<Article> _articleList;

    /**
     * [get] (条文)ARTICLE by LAW_TOC_ID, named 'articleList'.
     * @return The entity list of referrer property 'articleList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Article> getArticleList() {
        if (_articleList == null) { _articleList = newReferrerList(); }
        return _articleList;
    }

    /**
     * [set] (条文)ARTICLE by LAW_TOC_ID, named 'articleList'.
     * @param articleList The entity list of referrer property 'articleList'. (NullAllowed)
     */
    public void setArticleList(List<Article> articleList) {
        _articleList = articleList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsLawToc) {
            BsLawToc other = (BsLawToc)obj;
            if (!xSV(_lawTocId, other._lawTocId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _lawTocId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_lawHistory != null && _lawHistory.isPresent())
        { sb.append(li).append(xbRDS(_lawHistory, "lawHistory")); }
        if (_articleList != null) { for (Article et : _articleList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "articleList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_lawTocId));
        sb.append(dm).append(xfND(_lawHistoryId));
        sb.append(dm).append(xfND(_partNumber));
        sb.append(dm).append(xfND(_partTitle));
        sb.append(dm).append(xfND(_partCaption));
        sb.append(dm).append(xfND(_chapterNumber));
        sb.append(dm).append(xfND(_chapterTitle));
        sb.append(dm).append(xfND(_chapterCaption));
        sb.append(dm).append(xfND(_sectionNumber));
        sb.append(dm).append(xfND(_sectionTitle));
        sb.append(dm).append(xfND(_sectionCaption));
        sb.append(dm).append(xfND(_subsectionNumber));
        sb.append(dm).append(xfND(_subsectionTitle));
        sb.append(dm).append(xfND(_subsectionCaption));
        sb.append(dm).append(xfND(_divisionNumber));
        sb.append(dm).append(xfND(_divisionTitle));
        sb.append(dm).append(xfND(_divisionCaption));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerUser));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateUser));
        sb.append(dm).append(xfND(_versionNo));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_lawHistory != null && _lawHistory.isPresent())
        { sb.append(dm).append("lawHistory"); }
        if (_articleList != null && !_articleList.isEmpty())
        { sb.append(dm).append("articleList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public LawToc clone() {
        return (LawToc)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (法令目次ID)LAW_TOC_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'LAW_TOC_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLawTocId() {
        checkSpecifiedProperty("lawTocId");
        return _lawTocId;
    }

    /**
     * [set] (法令目次ID)LAW_TOC_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param lawTocId The value of the column 'LAW_TOC_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLawTocId(Long lawTocId) {
        registerModifiedProperty("lawTocId");
        _lawTocId = lawTocId;
    }

    /**
     * [get] (法令履歴ID)LAW_HISTORY_ID: {IX, NotNull, INT(10), FK to LAW_HISTORY} <br>
     * @return The value of the column 'LAW_HISTORY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getLawHistoryId() {
        checkSpecifiedProperty("lawHistoryId");
        return _lawHistoryId;
    }

    /**
     * [set] (法令履歴ID)LAW_HISTORY_ID: {IX, NotNull, INT(10), FK to LAW_HISTORY} <br>
     * @param lawHistoryId The value of the column 'LAW_HISTORY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLawHistoryId(Integer lawHistoryId) {
        registerModifiedProperty("lawHistoryId");
        _lawHistoryId = lawHistoryId;
    }

    /**
     * [get] (編番号)PART_NUMBER: {INT(10)} <br>
     * @return The value of the column 'PART_NUMBER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getPartNumber() {
        checkSpecifiedProperty("partNumber");
        return _partNumber;
    }

    /**
     * [set] (編番号)PART_NUMBER: {INT(10)} <br>
     * @param partNumber The value of the column 'PART_NUMBER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPartNumber(Integer partNumber) {
        registerModifiedProperty("partNumber");
        _partNumber = partNumber;
    }

    /**
     * [get] (編タイトル)PART_TITLE: {VARCHAR(100)} <br>
     * @return The value of the column 'PART_TITLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPartTitle() {
        checkSpecifiedProperty("partTitle");
        return convertEmptyToNull(_partTitle);
    }

    /**
     * [set] (編タイトル)PART_TITLE: {VARCHAR(100)} <br>
     * @param partTitle The value of the column 'PART_TITLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPartTitle(String partTitle) {
        registerModifiedProperty("partTitle");
        _partTitle = partTitle;
    }

    /**
     * [get] (編見出し)PART_CAPTION: {VARCHAR(200)} <br>
     * @return The value of the column 'PART_CAPTION'. (NullAllowed even if selected: for no constraint)
     */
    public String getPartCaption() {
        checkSpecifiedProperty("partCaption");
        return convertEmptyToNull(_partCaption);
    }

    /**
     * [set] (編見出し)PART_CAPTION: {VARCHAR(200)} <br>
     * @param partCaption The value of the column 'PART_CAPTION'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPartCaption(String partCaption) {
        registerModifiedProperty("partCaption");
        _partCaption = partCaption;
    }

    /**
     * [get] (章番号)CHAPTER_NUMBER: {INT(10)} <br>
     * @return The value of the column 'CHAPTER_NUMBER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getChapterNumber() {
        checkSpecifiedProperty("chapterNumber");
        return _chapterNumber;
    }

    /**
     * [set] (章番号)CHAPTER_NUMBER: {INT(10)} <br>
     * @param chapterNumber The value of the column 'CHAPTER_NUMBER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setChapterNumber(Integer chapterNumber) {
        registerModifiedProperty("chapterNumber");
        _chapterNumber = chapterNumber;
    }

    /**
     * [get] (章タイトル)CHAPTER_TITLE: {VARCHAR(100)} <br>
     * @return The value of the column 'CHAPTER_TITLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getChapterTitle() {
        checkSpecifiedProperty("chapterTitle");
        return convertEmptyToNull(_chapterTitle);
    }

    /**
     * [set] (章タイトル)CHAPTER_TITLE: {VARCHAR(100)} <br>
     * @param chapterTitle The value of the column 'CHAPTER_TITLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setChapterTitle(String chapterTitle) {
        registerModifiedProperty("chapterTitle");
        _chapterTitle = chapterTitle;
    }

    /**
     * [get] (章見出し)CHAPTER_CAPTION: {VARCHAR(200)} <br>
     * @return The value of the column 'CHAPTER_CAPTION'. (NullAllowed even if selected: for no constraint)
     */
    public String getChapterCaption() {
        checkSpecifiedProperty("chapterCaption");
        return convertEmptyToNull(_chapterCaption);
    }

    /**
     * [set] (章見出し)CHAPTER_CAPTION: {VARCHAR(200)} <br>
     * @param chapterCaption The value of the column 'CHAPTER_CAPTION'. (NullAllowed: null update allowed for no constraint)
     */
    public void setChapterCaption(String chapterCaption) {
        registerModifiedProperty("chapterCaption");
        _chapterCaption = chapterCaption;
    }

    /**
     * [get] (節番号)SECTION_NUMBER: {INT(10)} <br>
     * @return The value of the column 'SECTION_NUMBER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getSectionNumber() {
        checkSpecifiedProperty("sectionNumber");
        return _sectionNumber;
    }

    /**
     * [set] (節番号)SECTION_NUMBER: {INT(10)} <br>
     * @param sectionNumber The value of the column 'SECTION_NUMBER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSectionNumber(Integer sectionNumber) {
        registerModifiedProperty("sectionNumber");
        _sectionNumber = sectionNumber;
    }

    /**
     * [get] (節タイトル)SECTION_TITLE: {VARCHAR(100)} <br>
     * @return The value of the column 'SECTION_TITLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSectionTitle() {
        checkSpecifiedProperty("sectionTitle");
        return convertEmptyToNull(_sectionTitle);
    }

    /**
     * [set] (節タイトル)SECTION_TITLE: {VARCHAR(100)} <br>
     * @param sectionTitle The value of the column 'SECTION_TITLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSectionTitle(String sectionTitle) {
        registerModifiedProperty("sectionTitle");
        _sectionTitle = sectionTitle;
    }

    /**
     * [get] (節見出し)SECTION_CAPTION: {VARCHAR(200)} <br>
     * @return The value of the column 'SECTION_CAPTION'. (NullAllowed even if selected: for no constraint)
     */
    public String getSectionCaption() {
        checkSpecifiedProperty("sectionCaption");
        return convertEmptyToNull(_sectionCaption);
    }

    /**
     * [set] (節見出し)SECTION_CAPTION: {VARCHAR(200)} <br>
     * @param sectionCaption The value of the column 'SECTION_CAPTION'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSectionCaption(String sectionCaption) {
        registerModifiedProperty("sectionCaption");
        _sectionCaption = sectionCaption;
    }

    /**
     * [get] (款番号)SUBSECTION_NUMBER: {INT(10)} <br>
     * @return The value of the column 'SUBSECTION_NUMBER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getSubsectionNumber() {
        checkSpecifiedProperty("subsectionNumber");
        return _subsectionNumber;
    }

    /**
     * [set] (款番号)SUBSECTION_NUMBER: {INT(10)} <br>
     * @param subsectionNumber The value of the column 'SUBSECTION_NUMBER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSubsectionNumber(Integer subsectionNumber) {
        registerModifiedProperty("subsectionNumber");
        _subsectionNumber = subsectionNumber;
    }

    /**
     * [get] (款タイトル)SUBSECTION_TITLE: {VARCHAR(100)} <br>
     * @return The value of the column 'SUBSECTION_TITLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSubsectionTitle() {
        checkSpecifiedProperty("subsectionTitle");
        return convertEmptyToNull(_subsectionTitle);
    }

    /**
     * [set] (款タイトル)SUBSECTION_TITLE: {VARCHAR(100)} <br>
     * @param subsectionTitle The value of the column 'SUBSECTION_TITLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSubsectionTitle(String subsectionTitle) {
        registerModifiedProperty("subsectionTitle");
        _subsectionTitle = subsectionTitle;
    }

    /**
     * [get] (款見出し)SUBSECTION_CAPTION: {VARCHAR(200)} <br>
     * @return The value of the column 'SUBSECTION_CAPTION'. (NullAllowed even if selected: for no constraint)
     */
    public String getSubsectionCaption() {
        checkSpecifiedProperty("subsectionCaption");
        return convertEmptyToNull(_subsectionCaption);
    }

    /**
     * [set] (款見出し)SUBSECTION_CAPTION: {VARCHAR(200)} <br>
     * @param subsectionCaption The value of the column 'SUBSECTION_CAPTION'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSubsectionCaption(String subsectionCaption) {
        registerModifiedProperty("subsectionCaption");
        _subsectionCaption = subsectionCaption;
    }

    /**
     * [get] (目番号)DIVISION_NUMBER: {INT(10)} <br>
     * @return The value of the column 'DIVISION_NUMBER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getDivisionNumber() {
        checkSpecifiedProperty("divisionNumber");
        return _divisionNumber;
    }

    /**
     * [set] (目番号)DIVISION_NUMBER: {INT(10)} <br>
     * @param divisionNumber The value of the column 'DIVISION_NUMBER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDivisionNumber(Integer divisionNumber) {
        registerModifiedProperty("divisionNumber");
        _divisionNumber = divisionNumber;
    }

    /**
     * [get] (目タイトル)DIVISION_TITLE: {VARCHAR(100)} <br>
     * @return The value of the column 'DIVISION_TITLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getDivisionTitle() {
        checkSpecifiedProperty("divisionTitle");
        return convertEmptyToNull(_divisionTitle);
    }

    /**
     * [set] (目タイトル)DIVISION_TITLE: {VARCHAR(100)} <br>
     * @param divisionTitle The value of the column 'DIVISION_TITLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDivisionTitle(String divisionTitle) {
        registerModifiedProperty("divisionTitle");
        _divisionTitle = divisionTitle;
    }

    /**
     * [get] (目見出し)DIVISION_CAPTION: {VARCHAR(200)} <br>
     * @return The value of the column 'DIVISION_CAPTION'. (NullAllowed even if selected: for no constraint)
     */
    public String getDivisionCaption() {
        checkSpecifiedProperty("divisionCaption");
        return convertEmptyToNull(_divisionCaption);
    }

    /**
     * [set] (目見出し)DIVISION_CAPTION: {VARCHAR(200)} <br>
     * @param divisionCaption The value of the column 'DIVISION_CAPTION'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDivisionCaption(String divisionCaption) {
        registerModifiedProperty("divisionCaption");
        _divisionCaption = divisionCaption;
    }

    /**
     * [get] (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが登録された日時 e.g. 2018-01-02T12:34:56
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが登録された日時 e.g. 2018-01-02T12:34:56
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを登録したユーザー e.g. funa
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        checkSpecifiedProperty("registerUser");
        return convertEmptyToNull(_registerUser);
    }

    /**
     * [set] (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを登録したユーザー e.g. funa
     * @param registerUser The value of the column 'REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        registerModifiedProperty("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが(最後に)更新された日時 e.g. 2018-01-02T12:34:56
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが(最後に)更新された日時 e.g. 2018-01-02T12:34:56
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを(最後に)更新したユーザー e.g. funa
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateUser() {
        checkSpecifiedProperty("updateUser");
        return convertEmptyToNull(_updateUser);
    }

    /**
     * [set] (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを(最後に)更新したユーザー e.g. funa
     * @param updateUser The value of the column 'UPDATE_USER'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateUser(String updateUser) {
        registerModifiedProperty("updateUser");
        _updateUser = updateUser;
    }

    /**
     * [get] (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]} <br>
     * バージョン番号 e.g. 0
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]} <br>
     * バージョン番号 e.g. 0
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }
}
