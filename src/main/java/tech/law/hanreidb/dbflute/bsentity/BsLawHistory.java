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
import tech.law.hanreidb.dbflute.allcommon.CDef;
import tech.law.hanreidb.dbflute.exentity.*;

/**
 * The entity of (法令履歴)LAW_HISTORY as TABLE. <br>
 * <pre>
 * [primary-key]
 *     LAW_HISTORY_ID
 *
 * [column]
 *     LAW_HISTORY_ID, LAW_ID, AMEND_LAW_ID, LAW_AMEND_VERSION, LATEST_VERSION_FLG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LAW_HISTORY_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     LAW, LAW_CONTENT(AsOne)
 *
 * [referrer table]
 *     ARTICLE, LAW_TOC, LAW_CONTENT
 *
 * [foreign property]
 *     lawByAmendLawId, lawByLawId, lawContentAsOne
 *
 * [referrer property]
 *     articleList, lawTocList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer lawHistoryId = entity.getLawHistoryId();
 * Integer lawId = entity.getLawId();
 * Integer amendLawId = entity.getAmendLawId();
 * Integer lawAmendVersion = entity.getLawAmendVersion();
 * Boolean latestVersionFlg = entity.getLatestVersionFlg();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setLawHistoryId(lawHistoryId);
 * entity.setLawId(lawId);
 * entity.setAmendLawId(amendLawId);
 * entity.setLawAmendVersion(lawAmendVersion);
 * entity.setLatestVersionFlg(latestVersionFlg);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsLawHistory extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (法令履歴ID)LAW_HISTORY_ID: {PK, ID, NotNull, INT(10)} */
    protected Integer _lawHistoryId;

    /** (法令ID)LAW_ID: {UQ+, NotNull, INT(10), FK to LAW} */
    protected Integer _lawId;

    /** (改正法令ID)AMEND_LAW_ID: {IX, INT(10), FK to LAW} */
    protected Integer _amendLawId;

    /** (法令改正バージョン)LAW_AMEND_VERSION: {+UQ, NotNull, INT(10)} */
    protected Integer _lawAmendVersion;

    /** (最新フラグ)LATEST_VERSION_FLG: {NotNull, BIT, classification=Flg} */
    protected Boolean _latestVersionFlg;

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
        return "LAW_HISTORY";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_lawHistoryId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param lawId (法令ID): UQ+, NotNull, INT(10), FK to LAW. (NotNull)
     * @param lawAmendVersion (法令改正バージョン): +UQ, NotNull, INT(10). (NotNull)
     */
    public void uniqueBy(Integer lawId, Integer lawAmendVersion) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("lawId");
        __uniqueDrivenProperties.addPropertyName("lawAmendVersion");
        setLawId(lawId);setLawAmendVersion(lawAmendVersion);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of latestVersionFlg as the classification of Flg. <br>
     * (最新フラグ)LATEST_VERSION_FLG: {NotNull, BIT, classification=Flg} <br>
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Flg getLatestVersionFlgAsFlg() {
        return CDef.Flg.codeOf(getLatestVersionFlg());
    }

    /**
     * Set the value of latestVersionFlg as the classification of Flg. <br>
     * (最新フラグ)LATEST_VERSION_FLG: {NotNull, BIT, classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLatestVersionFlgAsFlg(CDef.Flg cdef) {
        setLatestVersionFlg(cdef != null ? toBoolean(cdef.code()) : null);
    }

    /**
     * Set the value of latestVersionFlg as boolean. <br>
     * (最新フラグ)LATEST_VERSION_FLG: {NotNull, BIT, classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param determination The determination, true or false. (NullAllowed: if null, null value is set to the column)
     */
    public void setLatestVersionFlgAsBoolean(Boolean determination) {
        setLatestVersionFlgAsFlg(CDef.Flg.codeOf(determination));
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of latestVersionFlg as True (1). <br>
     * Checked: means yes
     */
    public void setLatestVersionFlg_True() {
        setLatestVersionFlgAsFlg(CDef.Flg.True);
    }

    /**
     * Set the value of latestVersionFlg as False (0). <br>
     * Unchecked: means no
     */
    public void setLatestVersionFlg_False() {
        setLatestVersionFlgAsFlg(CDef.Flg.False);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of latestVersionFlg True? <br>
     * Checked: means yes
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLatestVersionFlgTrue() {
        CDef.Flg cdef = getLatestVersionFlgAsFlg();
        return cdef != null ? cdef.equals(CDef.Flg.True) : false;
    }

    /**
     * Is the value of latestVersionFlg False? <br>
     * Unchecked: means no
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLatestVersionFlgFalse() {
        CDef.Flg cdef = getLatestVersionFlgAsFlg();
        return cdef != null ? cdef.equals(CDef.Flg.False) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'latestVersionFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLatestVersionFlgName() {
        CDef.Flg cdef = getLatestVersionFlgAsFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'latestVersionFlg' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getLatestVersionFlgAlias() {
        CDef.Flg cdef = getLatestVersionFlgAsFlg();
        return cdef != null ? cdef.alias() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (法令)LAW by my AMEND_LAW_ID, named 'lawByAmendLawId'. */
    protected OptionalEntity<Law> _lawByAmendLawId;

    /**
     * [get] (法令)LAW by my AMEND_LAW_ID, named 'lawByAmendLawId'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'lawByAmendLawId'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Law> getLawByAmendLawId() {
        if (_lawByAmendLawId == null) { _lawByAmendLawId = OptionalEntity.relationEmpty(this, "lawByAmendLawId"); }
        return _lawByAmendLawId;
    }

    /**
     * [set] (法令)LAW by my AMEND_LAW_ID, named 'lawByAmendLawId'.
     * @param lawByAmendLawId The entity of foreign property 'lawByAmendLawId'. (NullAllowed)
     */
    public void setLawByAmendLawId(OptionalEntity<Law> lawByAmendLawId) {
        _lawByAmendLawId = lawByAmendLawId;
    }

    /** (法令)LAW by my LAW_ID, named 'lawByLawId'. */
    protected OptionalEntity<Law> _lawByLawId;

    /**
     * [get] (法令)LAW by my LAW_ID, named 'lawByLawId'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'lawByLawId'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Law> getLawByLawId() {
        if (_lawByLawId == null) { _lawByLawId = OptionalEntity.relationEmpty(this, "lawByLawId"); }
        return _lawByLawId;
    }

    /**
     * [set] (法令)LAW by my LAW_ID, named 'lawByLawId'.
     * @param lawByLawId The entity of foreign property 'lawByLawId'. (NullAllowed)
     */
    public void setLawByLawId(OptionalEntity<Law> lawByLawId) {
        _lawByLawId = lawByLawId;
    }

    /** (法令内容)LAW_CONTENT by LAW_HISTORY_ID, named 'lawContentAsOne'. */
    protected OptionalEntity<LawContent> _lawContentAsOne;

    /**
     * [get] (法令内容)LAW_CONTENT by LAW_HISTORY_ID, named 'lawContentAsOne'.
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return the entity of foreign property(referrer-as-one) 'lawContentAsOne'. (NotNull, EmptyAllowed: when e.g. no data, no setupSelect)
     */
    public OptionalEntity<LawContent> getLawContentAsOne() {
        if (_lawContentAsOne == null) { _lawContentAsOne = OptionalEntity.relationEmpty(this, "lawContentAsOne"); }
        return _lawContentAsOne;
    }

    /**
     * [set] (法令内容)LAW_CONTENT by LAW_HISTORY_ID, named 'lawContentAsOne'.
     * @param lawContentAsOne The entity of foreign property(referrer-as-one) 'lawContentAsOne'. (NullAllowed)
     */
    public void setLawContentAsOne(OptionalEntity<LawContent> lawContentAsOne) {
        _lawContentAsOne = lawContentAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (条文)ARTICLE by LAW_HISTORY_ID, named 'articleList'. */
    protected List<Article> _articleList;

    /**
     * [get] (条文)ARTICLE by LAW_HISTORY_ID, named 'articleList'.
     * @return The entity list of referrer property 'articleList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Article> getArticleList() {
        if (_articleList == null) { _articleList = newReferrerList(); }
        return _articleList;
    }

    /**
     * [set] (条文)ARTICLE by LAW_HISTORY_ID, named 'articleList'.
     * @param articleList The entity list of referrer property 'articleList'. (NullAllowed)
     */
    public void setArticleList(List<Article> articleList) {
        _articleList = articleList;
    }

    /** (法令目次)LAW_TOC by LAW_HISTORY_ID, named 'lawTocList'. */
    protected List<LawToc> _lawTocList;

    /**
     * [get] (法令目次)LAW_TOC by LAW_HISTORY_ID, named 'lawTocList'.
     * @return The entity list of referrer property 'lawTocList'. (NotNull: even if no loading, returns empty list)
     */
    public List<LawToc> getLawTocList() {
        if (_lawTocList == null) { _lawTocList = newReferrerList(); }
        return _lawTocList;
    }

    /**
     * [set] (法令目次)LAW_TOC by LAW_HISTORY_ID, named 'lawTocList'.
     * @param lawTocList The entity list of referrer property 'lawTocList'. (NullAllowed)
     */
    public void setLawTocList(List<LawToc> lawTocList) {
        _lawTocList = lawTocList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsLawHistory) {
            BsLawHistory other = (BsLawHistory)obj;
            if (!xSV(_lawHistoryId, other._lawHistoryId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _lawHistoryId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_lawByAmendLawId != null && _lawByAmendLawId.isPresent())
        { sb.append(li).append(xbRDS(_lawByAmendLawId, "lawByAmendLawId")); }
        if (_lawByLawId != null && _lawByLawId.isPresent())
        { sb.append(li).append(xbRDS(_lawByLawId, "lawByLawId")); }
        if (_lawContentAsOne != null && _lawContentAsOne.isPresent())
        { sb.append(li).append(xbRDS(_lawContentAsOne, "lawContentAsOne")); }
        if (_articleList != null) { for (Article et : _articleList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "articleList")); } } }
        if (_lawTocList != null) { for (LawToc et : _lawTocList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "lawTocList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_lawHistoryId));
        sb.append(dm).append(xfND(_lawId));
        sb.append(dm).append(xfND(_amendLawId));
        sb.append(dm).append(xfND(_lawAmendVersion));
        sb.append(dm).append(xfND(_latestVersionFlg));
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
        if (_lawByAmendLawId != null && _lawByAmendLawId.isPresent())
        { sb.append(dm).append("lawByAmendLawId"); }
        if (_lawByLawId != null && _lawByLawId.isPresent())
        { sb.append(dm).append("lawByLawId"); }
        if (_lawContentAsOne != null && _lawContentAsOne.isPresent())
        { sb.append(dm).append("lawContentAsOne"); }
        if (_articleList != null && !_articleList.isEmpty())
        { sb.append(dm).append("articleList"); }
        if (_lawTocList != null && !_lawTocList.isEmpty())
        { sb.append(dm).append("lawTocList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public LawHistory clone() {
        return (LawHistory)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (法令履歴ID)LAW_HISTORY_ID: {PK, ID, NotNull, INT(10)} <br>
     * @return The value of the column 'LAW_HISTORY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getLawHistoryId() {
        checkSpecifiedProperty("lawHistoryId");
        return _lawHistoryId;
    }

    /**
     * [set] (法令履歴ID)LAW_HISTORY_ID: {PK, ID, NotNull, INT(10)} <br>
     * @param lawHistoryId The value of the column 'LAW_HISTORY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLawHistoryId(Integer lawHistoryId) {
        registerModifiedProperty("lawHistoryId");
        _lawHistoryId = lawHistoryId;
    }

    /**
     * [get] (法令ID)LAW_ID: {UQ+, NotNull, INT(10), FK to LAW} <br>
     * @return The value of the column 'LAW_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getLawId() {
        checkSpecifiedProperty("lawId");
        return _lawId;
    }

    /**
     * [set] (法令ID)LAW_ID: {UQ+, NotNull, INT(10), FK to LAW} <br>
     * @param lawId The value of the column 'LAW_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLawId(Integer lawId) {
        registerModifiedProperty("lawId");
        _lawId = lawId;
    }

    /**
     * [get] (改正法令ID)AMEND_LAW_ID: {IX, INT(10), FK to LAW} <br>
     * @return The value of the column 'AMEND_LAW_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getAmendLawId() {
        checkSpecifiedProperty("amendLawId");
        return _amendLawId;
    }

    /**
     * [set] (改正法令ID)AMEND_LAW_ID: {IX, INT(10), FK to LAW} <br>
     * @param amendLawId The value of the column 'AMEND_LAW_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAmendLawId(Integer amendLawId) {
        registerModifiedProperty("amendLawId");
        _amendLawId = amendLawId;
    }

    /**
     * [get] (法令改正バージョン)LAW_AMEND_VERSION: {+UQ, NotNull, INT(10)} <br>
     * データ取得した中で最古のバージョンを1として改正法令が制定されるたびにインクリメントしていく。
     * @return The value of the column 'LAW_AMEND_VERSION'. (basically NotNull if selected: for the constraint)
     */
    public Integer getLawAmendVersion() {
        checkSpecifiedProperty("lawAmendVersion");
        return _lawAmendVersion;
    }

    /**
     * [set] (法令改正バージョン)LAW_AMEND_VERSION: {+UQ, NotNull, INT(10)} <br>
     * データ取得した中で最古のバージョンを1として改正法令が制定されるたびにインクリメントしていく。
     * @param lawAmendVersion The value of the column 'LAW_AMEND_VERSION'. (basically NotNull if update: for the constraint)
     */
    public void setLawAmendVersion(Integer lawAmendVersion) {
        registerModifiedProperty("lawAmendVersion");
        _lawAmendVersion = lawAmendVersion;
    }

    /**
     * [get] (最新フラグ)LATEST_VERSION_FLG: {NotNull, BIT, classification=Flg} <br>
     * @return The value of the column 'LATEST_VERSION_FLG'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getLatestVersionFlg() {
        checkSpecifiedProperty("latestVersionFlg");
        return _latestVersionFlg;
    }

    /**
     * [set] (最新フラグ)LATEST_VERSION_FLG: {NotNull, BIT, classification=Flg} <br>
     * @param latestVersionFlg The value of the column 'LATEST_VERSION_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setLatestVersionFlg(Boolean latestVersionFlg) {
        checkClassificationCode("LATEST_VERSION_FLG", CDef.DefMeta.Flg, latestVersionFlg);
        registerModifiedProperty("latestVersionFlg");
        _latestVersionFlg = latestVersionFlg;
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
