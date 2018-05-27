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
 * The entity of (法令内容)LAW_CONTENT as TABLE. <br>
 * <pre>
 * [primary-key]
 *     LAW_CONTENT_ID
 *
 * [column]
 *     LAW_CONTENT_ID, LAW_HISTORY_ID, LAW_CONTENT_RAW_XML, LAW_CONTENT_SEARCH_TEXT, LAW_CONTENT_VIEW_XML, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LAW_CONTENT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     LAW_HISTORY
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     lawHistory
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer lawContentId = entity.getLawContentId();
 * Integer lawHistoryId = entity.getLawHistoryId();
 * String lawContentRawXml = entity.getLawContentRawXml();
 * String lawContentSearchText = entity.getLawContentSearchText();
 * String lawContentViewXml = entity.getLawContentViewXml();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setLawContentId(lawContentId);
 * entity.setLawHistoryId(lawHistoryId);
 * entity.setLawContentRawXml(lawContentRawXml);
 * entity.setLawContentSearchText(lawContentSearchText);
 * entity.setLawContentViewXml(lawContentViewXml);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsLawContent extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (法令内容ID)LAW_CONTENT_ID: {PK, ID, NotNull, INT(10)} */
    protected Integer _lawContentId;

    /** (法令履歴ID)LAW_HISTORY_ID: {UQ, NotNull, INT(10), FK to LAW_HISTORY} */
    protected Integer _lawHistoryId;

    /** (法令内容加工前XML)LAW_CONTENT_RAW_XML: {NotNull, TEXT(65535)} */
    protected String _lawContentRawXml;

    /** (法令内容検索全文)LAW_CONTENT_SEARCH_TEXT: {NotNull, TEXT(65535)} */
    protected String _lawContentSearchText;

    /** (法令内容画面用XML)LAW_CONTENT_VIEW_XML: {NotNull, TEXT(65535)} */
    protected String _lawContentViewXml;

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
        return "LAW_CONTENT";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_lawContentId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param lawHistoryId (法令履歴ID): UQ, NotNull, INT(10), FK to LAW_HISTORY. (NotNull)
     */
    public void uniqueBy(Integer lawHistoryId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("lawHistoryId");
        setLawHistoryId(lawHistoryId);
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
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsLawContent) {
            BsLawContent other = (BsLawContent)obj;
            if (!xSV(_lawContentId, other._lawContentId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _lawContentId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_lawHistory != null && _lawHistory.isPresent())
        { sb.append(li).append(xbRDS(_lawHistory, "lawHistory")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_lawContentId));
        sb.append(dm).append(xfND(_lawHistoryId));
        sb.append(dm).append(xfND(_lawContentRawXml));
        sb.append(dm).append(xfND(_lawContentSearchText));
        sb.append(dm).append(xfND(_lawContentViewXml));
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
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public LawContent clone() {
        return (LawContent)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (法令内容ID)LAW_CONTENT_ID: {PK, ID, NotNull, INT(10)} <br>
     * @return The value of the column 'LAW_CONTENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getLawContentId() {
        checkSpecifiedProperty("lawContentId");
        return _lawContentId;
    }

    /**
     * [set] (法令内容ID)LAW_CONTENT_ID: {PK, ID, NotNull, INT(10)} <br>
     * @param lawContentId The value of the column 'LAW_CONTENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLawContentId(Integer lawContentId) {
        registerModifiedProperty("lawContentId");
        _lawContentId = lawContentId;
    }

    /**
     * [get] (法令履歴ID)LAW_HISTORY_ID: {UQ, NotNull, INT(10), FK to LAW_HISTORY} <br>
     * @return The value of the column 'LAW_HISTORY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getLawHistoryId() {
        checkSpecifiedProperty("lawHistoryId");
        return _lawHistoryId;
    }

    /**
     * [set] (法令履歴ID)LAW_HISTORY_ID: {UQ, NotNull, INT(10), FK to LAW_HISTORY} <br>
     * @param lawHistoryId The value of the column 'LAW_HISTORY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLawHistoryId(Integer lawHistoryId) {
        registerModifiedProperty("lawHistoryId");
        _lawHistoryId = lawHistoryId;
    }

    /**
     * [get] (法令内容加工前XML)LAW_CONTENT_RAW_XML: {NotNull, TEXT(65535)} <br>
     * @return The value of the column 'LAW_CONTENT_RAW_XML'. (basically NotNull if selected: for the constraint)
     */
    public String getLawContentRawXml() {
        checkSpecifiedProperty("lawContentRawXml");
        return convertEmptyToNull(_lawContentRawXml);
    }

    /**
     * [set] (法令内容加工前XML)LAW_CONTENT_RAW_XML: {NotNull, TEXT(65535)} <br>
     * @param lawContentRawXml The value of the column 'LAW_CONTENT_RAW_XML'. (basically NotNull if update: for the constraint)
     */
    public void setLawContentRawXml(String lawContentRawXml) {
        registerModifiedProperty("lawContentRawXml");
        _lawContentRawXml = lawContentRawXml;
    }

    /**
     * [get] (法令内容検索全文)LAW_CONTENT_SEARCH_TEXT: {NotNull, TEXT(65535)} <br>
     * @return The value of the column 'LAW_CONTENT_SEARCH_TEXT'. (basically NotNull if selected: for the constraint)
     */
    public String getLawContentSearchText() {
        checkSpecifiedProperty("lawContentSearchText");
        return convertEmptyToNull(_lawContentSearchText);
    }

    /**
     * [set] (法令内容検索全文)LAW_CONTENT_SEARCH_TEXT: {NotNull, TEXT(65535)} <br>
     * @param lawContentSearchText The value of the column 'LAW_CONTENT_SEARCH_TEXT'. (basically NotNull if update: for the constraint)
     */
    public void setLawContentSearchText(String lawContentSearchText) {
        registerModifiedProperty("lawContentSearchText");
        _lawContentSearchText = lawContentSearchText;
    }

    /**
     * [get] (法令内容画面用XML)LAW_CONTENT_VIEW_XML: {NotNull, TEXT(65535)} <br>
     * @return The value of the column 'LAW_CONTENT_VIEW_XML'. (basically NotNull if selected: for the constraint)
     */
    public String getLawContentViewXml() {
        checkSpecifiedProperty("lawContentViewXml");
        return convertEmptyToNull(_lawContentViewXml);
    }

    /**
     * [set] (法令内容画面用XML)LAW_CONTENT_VIEW_XML: {NotNull, TEXT(65535)} <br>
     * @param lawContentViewXml The value of the column 'LAW_CONTENT_VIEW_XML'. (basically NotNull if update: for the constraint)
     */
    public void setLawContentViewXml(String lawContentViewXml) {
        registerModifiedProperty("lawContentViewXml");
        _lawContentViewXml = lawContentViewXml;
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
