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

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import tech.law.hanreidb.dbflute.allcommon.EntityDefinedCommonColumn;
import tech.law.hanreidb.dbflute.allcommon.DBMetaInstanceHandler;
import tech.law.hanreidb.dbflute.allcommon.CDef;
import tech.law.hanreidb.dbflute.exentity.*;

/**
 * The entity of ([区分値]ユーザーステータス)CLS_USER_STATUS as TABLE. <br>
 * <pre>
 * [primary-key]
 *     USER_STATUS_CODE
 *
 * [column]
 *     USER_STATUS_CODE, USER_STATUS_NAME, USER_STATUS_ALIAS, DESCRIPTION, DISPLAY_ORDER, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     USER, USER_STATUS_HISTORY
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     userList, userStatusHistoryList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String userStatusCode = entity.getUserStatusCode();
 * String userStatusName = entity.getUserStatusName();
 * String userStatusAlias = entity.getUserStatusAlias();
 * String description = entity.getDescription();
 * Integer displayOrder = entity.getDisplayOrder();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setUserStatusCode(userStatusCode);
 * entity.setUserStatusName(userStatusName);
 * entity.setUserStatusAlias(userStatusAlias);
 * entity.setDescription(description);
 * entity.setDisplayOrder(displayOrder);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsClsUserStatus extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (ユーザーステータスコード)USER_STATUS_CODE: {PK, NotNull, VARCHAR(10), classification=UserStatus} */
    protected String _userStatusCode;

    /** (ユーザーステータス名)USER_STATUS_NAME: {NotNull, VARCHAR(10)} */
    protected String _userStatusName;

    /** (ユーザーステータス別名)USER_STATUS_ALIAS: {NotNull, VARCHAR(10)} */
    protected String _userStatusAlias;

    /** (説明)DESCRIPTION: {NotNull, TEXT(65535)} */
    protected String _description;

    /** (順番)DISPLAY_ORDER: {UQ, NotNull, INT UNSIGNED(10)} */
    protected Integer _displayOrder;

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
        return "CLS_USER_STATUS";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_userStatusCode == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param displayOrder (順番): UQ, NotNull, INT UNSIGNED(10). (NotNull)
     */
    public void uniqueBy(Integer displayOrder) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("displayOrder");
        setDisplayOrder(displayOrder);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of userStatusCode as the classification of UserStatus. <br>
     * (ユーザーステータスコード)USER_STATUS_CODE: {PK, NotNull, VARCHAR(10), classification=UserStatus} <br>
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.UserStatus getUserStatusCodeAsUserStatus() {
        return CDef.UserStatus.codeOf(getUserStatusCode());
    }

    /**
     * Set the value of userStatusCode as the classification of UserStatus. <br>
     * (ユーザーステータスコード)USER_STATUS_CODE: {PK, NotNull, VARCHAR(10), classification=UserStatus} <br>
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setUserStatusCodeAsUserStatus(CDef.UserStatus cdef) {
        setUserStatusCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of userStatusCode as 正式会員 (FML). <br>
     * 正式会員: 正式会員
     */
    public void setUserStatusCode_正式会員() {
        setUserStatusCodeAsUserStatus(CDef.UserStatus.正式会員);
    }

    /**
     * Set the value of userStatusCode as 仮会員 (PRO). <br>
     * 仮会員: 仮会員
     */
    public void setUserStatusCode_仮会員() {
        setUserStatusCodeAsUserStatus(CDef.UserStatus.仮会員);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of userStatusCode 正式会員? <br>
     * 正式会員: 正式会員
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isUserStatusCode正式会員() {
        CDef.UserStatus cdef = getUserStatusCodeAsUserStatus();
        return cdef != null ? cdef.equals(CDef.UserStatus.正式会員) : false;
    }

    /**
     * Is the value of userStatusCode 仮会員? <br>
     * 仮会員: 仮会員
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isUserStatusCode仮会員() {
        CDef.UserStatus cdef = getUserStatusCodeAsUserStatus();
        return cdef != null ? cdef.equals(CDef.UserStatus.仮会員) : false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (ユーザー)USER by USER_STATUS_CODE, named 'userList'. */
    protected List<User> _userList;

    /**
     * [get] (ユーザー)USER by USER_STATUS_CODE, named 'userList'.
     * @return The entity list of referrer property 'userList'. (NotNull: even if no loading, returns empty list)
     */
    public List<User> getUserList() {
        if (_userList == null) { _userList = newReferrerList(); }
        return _userList;
    }

    /**
     * [set] (ユーザー)USER by USER_STATUS_CODE, named 'userList'.
     * @param userList The entity list of referrer property 'userList'. (NullAllowed)
     */
    public void setUserList(List<User> userList) {
        _userList = userList;
    }

    /** (ユーザーステータス履歴)USER_STATUS_HISTORY by USER_NEW_STATUS_CODE, named 'userStatusHistoryList'. */
    protected List<UserStatusHistory> _userStatusHistoryList;

    /**
     * [get] (ユーザーステータス履歴)USER_STATUS_HISTORY by USER_NEW_STATUS_CODE, named 'userStatusHistoryList'.
     * @return The entity list of referrer property 'userStatusHistoryList'. (NotNull: even if no loading, returns empty list)
     */
    public List<UserStatusHistory> getUserStatusHistoryList() {
        if (_userStatusHistoryList == null) { _userStatusHistoryList = newReferrerList(); }
        return _userStatusHistoryList;
    }

    /**
     * [set] (ユーザーステータス履歴)USER_STATUS_HISTORY by USER_NEW_STATUS_CODE, named 'userStatusHistoryList'.
     * @param userStatusHistoryList The entity list of referrer property 'userStatusHistoryList'. (NullAllowed)
     */
    public void setUserStatusHistoryList(List<UserStatusHistory> userStatusHistoryList) {
        _userStatusHistoryList = userStatusHistoryList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsClsUserStatus) {
            BsClsUserStatus other = (BsClsUserStatus)obj;
            if (!xSV(_userStatusCode, other._userStatusCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _userStatusCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_userList != null) { for (User et : _userList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "userList")); } } }
        if (_userStatusHistoryList != null) { for (UserStatusHistory et : _userStatusHistoryList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "userStatusHistoryList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_userStatusCode));
        sb.append(dm).append(xfND(_userStatusName));
        sb.append(dm).append(xfND(_userStatusAlias));
        sb.append(dm).append(xfND(_description));
        sb.append(dm).append(xfND(_displayOrder));
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
        if (_userList != null && !_userList.isEmpty())
        { sb.append(dm).append("userList"); }
        if (_userStatusHistoryList != null && !_userStatusHistoryList.isEmpty())
        { sb.append(dm).append("userStatusHistoryList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public ClsUserStatus clone() {
        return (ClsUserStatus)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (ユーザーステータスコード)USER_STATUS_CODE: {PK, NotNull, VARCHAR(10), classification=UserStatus} <br>
     * @return The value of the column 'USER_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getUserStatusCode() {
        checkSpecifiedProperty("userStatusCode");
        return convertEmptyToNull(_userStatusCode);
    }

    /**
     * [set] (ユーザーステータスコード)USER_STATUS_CODE: {PK, NotNull, VARCHAR(10), classification=UserStatus} <br>
     * @param userStatusCode The value of the column 'USER_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setUserStatusCode(String userStatusCode) {
        registerModifiedProperty("userStatusCode");
        _userStatusCode = userStatusCode;
    }

    /**
     * [get] (ユーザーステータス名)USER_STATUS_NAME: {NotNull, VARCHAR(10)} <br>
     * @return The value of the column 'USER_STATUS_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getUserStatusName() {
        checkSpecifiedProperty("userStatusName");
        return convertEmptyToNull(_userStatusName);
    }

    /**
     * [set] (ユーザーステータス名)USER_STATUS_NAME: {NotNull, VARCHAR(10)} <br>
     * @param userStatusName The value of the column 'USER_STATUS_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setUserStatusName(String userStatusName) {
        registerModifiedProperty("userStatusName");
        _userStatusName = userStatusName;
    }

    /**
     * [get] (ユーザーステータス別名)USER_STATUS_ALIAS: {NotNull, VARCHAR(10)} <br>
     * @return The value of the column 'USER_STATUS_ALIAS'. (basically NotNull if selected: for the constraint)
     */
    public String getUserStatusAlias() {
        checkSpecifiedProperty("userStatusAlias");
        return convertEmptyToNull(_userStatusAlias);
    }

    /**
     * [set] (ユーザーステータス別名)USER_STATUS_ALIAS: {NotNull, VARCHAR(10)} <br>
     * @param userStatusAlias The value of the column 'USER_STATUS_ALIAS'. (basically NotNull if update: for the constraint)
     */
    public void setUserStatusAlias(String userStatusAlias) {
        registerModifiedProperty("userStatusAlias");
        _userStatusAlias = userStatusAlias;
    }

    /**
     * [get] (説明)DESCRIPTION: {NotNull, TEXT(65535)} <br>
     * 説明 e.g. これこれするときのなになにです。
     * @return The value of the column 'DESCRIPTION'. (basically NotNull if selected: for the constraint)
     */
    public String getDescription() {
        checkSpecifiedProperty("description");
        return convertEmptyToNull(_description);
    }

    /**
     * [set] (説明)DESCRIPTION: {NotNull, TEXT(65535)} <br>
     * 説明 e.g. これこれするときのなになにです。
     * @param description The value of the column 'DESCRIPTION'. (basically NotNull if update: for the constraint)
     */
    public void setDescription(String description) {
        registerModifiedProperty("description");
        _description = description;
    }

    /**
     * [get] (順番)DISPLAY_ORDER: {UQ, NotNull, INT UNSIGNED(10)} <br>
     * 順番 e.g. 1
     * @return The value of the column 'DISPLAY_ORDER'. (basically NotNull if selected: for the constraint)
     */
    public Integer getDisplayOrder() {
        checkSpecifiedProperty("displayOrder");
        return _displayOrder;
    }

    /**
     * [set] (順番)DISPLAY_ORDER: {UQ, NotNull, INT UNSIGNED(10)} <br>
     * 順番 e.g. 1
     * @param displayOrder The value of the column 'DISPLAY_ORDER'. (basically NotNull if update: for the constraint)
     */
    public void setDisplayOrder(Integer displayOrder) {
        registerModifiedProperty("displayOrder");
        _displayOrder = displayOrder;
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
