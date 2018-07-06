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
 * The entity of (ユーザーステータス履歴)USER_STATUS_HISTORY as TABLE. <br>
 * <pre>
 * [primary-key]
 *     USER_STATUS_HISTORY_ID
 *
 * [column]
 *     USER_STATUS_HISTORY_ID, USER_ID, USER_NEW_STATUS_CODE, USER_STATUS_UPDATE_DATETIME, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     USER_STATUS_HISTORY_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     USER, CLS_USER_STATUS
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     user, clsUserStatus
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long userStatusHistoryId = entity.getUserStatusHistoryId();
 * Integer userId = entity.getUserId();
 * String userNewStatusCode = entity.getUserNewStatusCode();
 * java.time.LocalDateTime userStatusUpdateDatetime = entity.getUserStatusUpdateDatetime();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setUserStatusHistoryId(userStatusHistoryId);
 * entity.setUserId(userId);
 * entity.setUserNewStatusCode(userNewStatusCode);
 * entity.setUserStatusUpdateDatetime(userStatusUpdateDatetime);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsUserStatusHistory extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** USER_STATUS_HISTORY_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)} */
    protected Long _userStatusHistoryId;

    /** (ユーザーID)USER_ID: {IX, NotNull, INT UNSIGNED(10), FK to USER} */
    protected Integer _userId;

    /** (ユーザー新ステータスコード)USER_NEW_STATUS_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_USER_STATUS, classification=UserStatus} */
    protected String _userNewStatusCode;

    /** (ユーザーステータス更新日時)USER_STATUS_UPDATE_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _userStatusUpdateDatetime;

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
        return "USER_STATUS_HISTORY";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_userStatusHistoryId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of userNewStatusCode as the classification of UserStatus. <br>
     * (ユーザー新ステータスコード)USER_NEW_STATUS_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_USER_STATUS, classification=UserStatus} <br>
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.UserStatus getUserNewStatusCodeAsUserStatus() {
        return CDef.UserStatus.codeOf(getUserNewStatusCode());
    }

    /**
     * Set the value of userNewStatusCode as the classification of UserStatus. <br>
     * (ユーザー新ステータスコード)USER_NEW_STATUS_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_USER_STATUS, classification=UserStatus} <br>
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setUserNewStatusCodeAsUserStatus(CDef.UserStatus cdef) {
        setUserNewStatusCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of userNewStatusCode as 正式会員 (FML). <br>
     * 正式会員: 正式会員
     */
    public void setUserNewStatusCode_正式会員() {
        setUserNewStatusCodeAsUserStatus(CDef.UserStatus.正式会員);
    }

    /**
     * Set the value of userNewStatusCode as 仮会員 (PRO). <br>
     * 仮会員: 仮会員
     */
    public void setUserNewStatusCode_仮会員() {
        setUserNewStatusCodeAsUserStatus(CDef.UserStatus.仮会員);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of userNewStatusCode 正式会員? <br>
     * 正式会員: 正式会員
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isUserNewStatusCode正式会員() {
        CDef.UserStatus cdef = getUserNewStatusCodeAsUserStatus();
        return cdef != null ? cdef.equals(CDef.UserStatus.正式会員) : false;
    }

    /**
     * Is the value of userNewStatusCode 仮会員? <br>
     * 仮会員: 仮会員
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isUserNewStatusCode仮会員() {
        CDef.UserStatus cdef = getUserNewStatusCodeAsUserStatus();
        return cdef != null ? cdef.equals(CDef.UserStatus.仮会員) : false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (ユーザー)USER by my USER_ID, named 'user'. */
    protected OptionalEntity<User> _user;

    /**
     * [get] (ユーザー)USER by my USER_ID, named 'user'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'user'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<User> getUser() {
        if (_user == null) { _user = OptionalEntity.relationEmpty(this, "user"); }
        return _user;
    }

    /**
     * [set] (ユーザー)USER by my USER_ID, named 'user'.
     * @param user The entity of foreign property 'user'. (NullAllowed)
     */
    public void setUser(OptionalEntity<User> user) {
        _user = user;
    }

    /** ([区分値]ユーザーステータス)CLS_USER_STATUS by my USER_NEW_STATUS_CODE, named 'clsUserStatus'. */
    protected OptionalEntity<ClsUserStatus> _clsUserStatus;

    /**
     * [get] ([区分値]ユーザーステータス)CLS_USER_STATUS by my USER_NEW_STATUS_CODE, named 'clsUserStatus'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'clsUserStatus'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<ClsUserStatus> getClsUserStatus() {
        if (_clsUserStatus == null) { _clsUserStatus = OptionalEntity.relationEmpty(this, "clsUserStatus"); }
        return _clsUserStatus;
    }

    /**
     * [set] ([区分値]ユーザーステータス)CLS_USER_STATUS by my USER_NEW_STATUS_CODE, named 'clsUserStatus'.
     * @param clsUserStatus The entity of foreign property 'clsUserStatus'. (NullAllowed)
     */
    public void setClsUserStatus(OptionalEntity<ClsUserStatus> clsUserStatus) {
        _clsUserStatus = clsUserStatus;
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
        if (obj instanceof BsUserStatusHistory) {
            BsUserStatusHistory other = (BsUserStatusHistory)obj;
            if (!xSV(_userStatusHistoryId, other._userStatusHistoryId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _userStatusHistoryId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_user != null && _user.isPresent())
        { sb.append(li).append(xbRDS(_user, "user")); }
        if (_clsUserStatus != null && _clsUserStatus.isPresent())
        { sb.append(li).append(xbRDS(_clsUserStatus, "clsUserStatus")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_userStatusHistoryId));
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_userNewStatusCode));
        sb.append(dm).append(xfND(_userStatusUpdateDatetime));
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
        if (_user != null && _user.isPresent())
        { sb.append(dm).append("user"); }
        if (_clsUserStatus != null && _clsUserStatus.isPresent())
        { sb.append(dm).append("clsUserStatus"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public UserStatusHistory clone() {
        return (UserStatusHistory)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] USER_STATUS_HISTORY_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)} <br>
     * @return The value of the column 'USER_STATUS_HISTORY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUserStatusHistoryId() {
        checkSpecifiedProperty("userStatusHistoryId");
        return _userStatusHistoryId;
    }

    /**
     * [set] USER_STATUS_HISTORY_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)} <br>
     * @param userStatusHistoryId The value of the column 'USER_STATUS_HISTORY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUserStatusHistoryId(Long userStatusHistoryId) {
        registerModifiedProperty("userStatusHistoryId");
        _userStatusHistoryId = userStatusHistoryId;
    }

    /**
     * [get] (ユーザーID)USER_ID: {IX, NotNull, INT UNSIGNED(10), FK to USER} <br>
     * @return The value of the column 'USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] (ユーザーID)USER_ID: {IX, NotNull, INT UNSIGNED(10), FK to USER} <br>
     * @param userId The value of the column 'USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Integer userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] (ユーザー新ステータスコード)USER_NEW_STATUS_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_USER_STATUS, classification=UserStatus} <br>
     * @return The value of the column 'USER_NEW_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getUserNewStatusCode() {
        checkSpecifiedProperty("userNewStatusCode");
        return convertEmptyToNull(_userNewStatusCode);
    }

    /**
     * [set] (ユーザー新ステータスコード)USER_NEW_STATUS_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_USER_STATUS, classification=UserStatus} <br>
     * @param userNewStatusCode The value of the column 'USER_NEW_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setUserNewStatusCode(String userNewStatusCode) {
        registerModifiedProperty("userNewStatusCode");
        _userNewStatusCode = userNewStatusCode;
    }

    /**
     * [get] (ユーザーステータス更新日時)USER_STATUS_UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * ユーザーステータスが更新された日時
     * @return The value of the column 'USER_STATUS_UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUserStatusUpdateDatetime() {
        checkSpecifiedProperty("userStatusUpdateDatetime");
        return _userStatusUpdateDatetime;
    }

    /**
     * [set] (ユーザーステータス更新日時)USER_STATUS_UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * ユーザーステータスが更新された日時
     * @param userStatusUpdateDatetime The value of the column 'USER_STATUS_UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setUserStatusUpdateDatetime(java.time.LocalDateTime userStatusUpdateDatetime) {
        registerModifiedProperty("userStatusUpdateDatetime");
        _userStatusUpdateDatetime = userStatusUpdateDatetime;
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
