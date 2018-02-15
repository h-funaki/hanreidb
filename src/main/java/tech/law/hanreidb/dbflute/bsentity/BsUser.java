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
 * The entity of (ユーザー)USER as TABLE. <br>
 * <pre>
 * [primary-key]
 *     USER_ID
 *
 * [column]
 *     USER_ID, MAIL_ADDRESS, PASSWORD, USER_STATUS_CODE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     USER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     CLS_USER_STATUS
 *
 * [referrer table]
 *     JUDGEMENT_USER_FAVORITE_REL, LOGIN_HISTORY, USER_STATUS_HISTORY
 *
 * [foreign property]
 *     clsUserStatus
 *
 * [referrer property]
 *     judgementUserFavoriteRelList, loginHistoryList, userStatusHistoryList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer userId = entity.getUserId();
 * String mailAddress = entity.getMailAddress();
 * String password = entity.getPassword();
 * String userStatusCode = entity.getUserStatusCode();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setUserId(userId);
 * entity.setMailAddress(mailAddress);
 * entity.setPassword(password);
 * entity.setUserStatusCode(userStatusCode);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsUser extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (ユーザーID)USER_ID: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _userId;

    /** (メールアドレス)MAIL_ADDRESS: {UQ, NotNull, VARCHAR(100)} */
    protected String _mailAddress;

    /** (パスワード)PASSWORD: {NotNull, VARCHAR(255)} */
    protected String _password;

    /** (ユーザーステータスコード)USER_STATUS_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_USER_STATUS} */
    protected String _userStatusCode;

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
        return "USER";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_userId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param mailAddress (メールアドレス): UQ, NotNull, VARCHAR(100). (NotNull)
     */
    public void uniqueBy(String mailAddress) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("mailAddress");
        setMailAddress(mailAddress);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** ([区分値]ユーザーステータス)CLS_USER_STATUS by my USER_STATUS_CODE, named 'clsUserStatus'. */
    protected OptionalEntity<ClsUserStatus> _clsUserStatus;

    /**
     * [get] ([区分値]ユーザーステータス)CLS_USER_STATUS by my USER_STATUS_CODE, named 'clsUserStatus'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'clsUserStatus'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<ClsUserStatus> getClsUserStatus() {
        if (_clsUserStatus == null) { _clsUserStatus = OptionalEntity.relationEmpty(this, "clsUserStatus"); }
        return _clsUserStatus;
    }

    /**
     * [set] ([区分値]ユーザーステータス)CLS_USER_STATUS by my USER_STATUS_CODE, named 'clsUserStatus'.
     * @param clsUserStatus The entity of foreign property 'clsUserStatus'. (NullAllowed)
     */
    public void setClsUserStatus(OptionalEntity<ClsUserStatus> clsUserStatus) {
        _clsUserStatus = clsUserStatus;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (判決ユーザーお気に入りリレーション)JUDGEMENT_USER_FAVORITE_REL by USER_ID, named 'judgementUserFavoriteRelList'. */
    protected List<JudgementUserFavoriteRel> _judgementUserFavoriteRelList;

    /**
     * [get] (判決ユーザーお気に入りリレーション)JUDGEMENT_USER_FAVORITE_REL by USER_ID, named 'judgementUserFavoriteRelList'.
     * @return The entity list of referrer property 'judgementUserFavoriteRelList'. (NotNull: even if no loading, returns empty list)
     */
    public List<JudgementUserFavoriteRel> getJudgementUserFavoriteRelList() {
        if (_judgementUserFavoriteRelList == null) { _judgementUserFavoriteRelList = newReferrerList(); }
        return _judgementUserFavoriteRelList;
    }

    /**
     * [set] (判決ユーザーお気に入りリレーション)JUDGEMENT_USER_FAVORITE_REL by USER_ID, named 'judgementUserFavoriteRelList'.
     * @param judgementUserFavoriteRelList The entity list of referrer property 'judgementUserFavoriteRelList'. (NullAllowed)
     */
    public void setJudgementUserFavoriteRelList(List<JudgementUserFavoriteRel> judgementUserFavoriteRelList) {
        _judgementUserFavoriteRelList = judgementUserFavoriteRelList;
    }

    /** (ログイン履歴)LOGIN_HISTORY by USER_ID, named 'loginHistoryList'. */
    protected List<LoginHistory> _loginHistoryList;

    /**
     * [get] (ログイン履歴)LOGIN_HISTORY by USER_ID, named 'loginHistoryList'.
     * @return The entity list of referrer property 'loginHistoryList'. (NotNull: even if no loading, returns empty list)
     */
    public List<LoginHistory> getLoginHistoryList() {
        if (_loginHistoryList == null) { _loginHistoryList = newReferrerList(); }
        return _loginHistoryList;
    }

    /**
     * [set] (ログイン履歴)LOGIN_HISTORY by USER_ID, named 'loginHistoryList'.
     * @param loginHistoryList The entity list of referrer property 'loginHistoryList'. (NullAllowed)
     */
    public void setLoginHistoryList(List<LoginHistory> loginHistoryList) {
        _loginHistoryList = loginHistoryList;
    }

    /** (ユーザーステータス履歴)USER_STATUS_HISTORY by USER_ID, named 'userStatusHistoryList'. */
    protected List<UserStatusHistory> _userStatusHistoryList;

    /**
     * [get] (ユーザーステータス履歴)USER_STATUS_HISTORY by USER_ID, named 'userStatusHistoryList'.
     * @return The entity list of referrer property 'userStatusHistoryList'. (NotNull: even if no loading, returns empty list)
     */
    public List<UserStatusHistory> getUserStatusHistoryList() {
        if (_userStatusHistoryList == null) { _userStatusHistoryList = newReferrerList(); }
        return _userStatusHistoryList;
    }

    /**
     * [set] (ユーザーステータス履歴)USER_STATUS_HISTORY by USER_ID, named 'userStatusHistoryList'.
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
        if (obj instanceof BsUser) {
            BsUser other = (BsUser)obj;
            if (!xSV(_userId, other._userId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _userId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_clsUserStatus != null && _clsUserStatus.isPresent())
        { sb.append(li).append(xbRDS(_clsUserStatus, "clsUserStatus")); }
        if (_judgementUserFavoriteRelList != null) { for (JudgementUserFavoriteRel et : _judgementUserFavoriteRelList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "judgementUserFavoriteRelList")); } } }
        if (_loginHistoryList != null) { for (LoginHistory et : _loginHistoryList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "loginHistoryList")); } } }
        if (_userStatusHistoryList != null) { for (UserStatusHistory et : _userStatusHistoryList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "userStatusHistoryList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_mailAddress));
        sb.append(dm).append(xfND(_password));
        sb.append(dm).append(xfND(_userStatusCode));
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
        if (_clsUserStatus != null && _clsUserStatus.isPresent())
        { sb.append(dm).append("clsUserStatus"); }
        if (_judgementUserFavoriteRelList != null && !_judgementUserFavoriteRelList.isEmpty())
        { sb.append(dm).append("judgementUserFavoriteRelList"); }
        if (_loginHistoryList != null && !_loginHistoryList.isEmpty())
        { sb.append(dm).append("loginHistoryList"); }
        if (_userStatusHistoryList != null && !_userStatusHistoryList.isEmpty())
        { sb.append(dm).append("userStatusHistoryList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public User clone() {
        return (User)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (ユーザーID)USER_ID: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] (ユーザーID)USER_ID: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param userId The value of the column 'USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Integer userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] (メールアドレス)MAIL_ADDRESS: {UQ, NotNull, VARCHAR(100)} <br>
     * @return The value of the column 'MAIL_ADDRESS'. (basically NotNull if selected: for the constraint)
     */
    public String getMailAddress() {
        checkSpecifiedProperty("mailAddress");
        return convertEmptyToNull(_mailAddress);
    }

    /**
     * [set] (メールアドレス)MAIL_ADDRESS: {UQ, NotNull, VARCHAR(100)} <br>
     * @param mailAddress The value of the column 'MAIL_ADDRESS'. (basically NotNull if update: for the constraint)
     */
    public void setMailAddress(String mailAddress) {
        registerModifiedProperty("mailAddress");
        _mailAddress = mailAddress;
    }

    /**
     * [get] (パスワード)PASSWORD: {NotNull, VARCHAR(255)} <br>
     * @return The value of the column 'PASSWORD'. (basically NotNull if selected: for the constraint)
     */
    public String getPassword() {
        checkSpecifiedProperty("password");
        return convertEmptyToNull(_password);
    }

    /**
     * [set] (パスワード)PASSWORD: {NotNull, VARCHAR(255)} <br>
     * @param password The value of the column 'PASSWORD'. (basically NotNull if update: for the constraint)
     */
    public void setPassword(String password) {
        registerModifiedProperty("password");
        _password = password;
    }

    /**
     * [get] (ユーザーステータスコード)USER_STATUS_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_USER_STATUS} <br>
     * @return The value of the column 'USER_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getUserStatusCode() {
        checkSpecifiedProperty("userStatusCode");
        return convertEmptyToNull(_userStatusCode);
    }

    /**
     * [set] (ユーザーステータスコード)USER_STATUS_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_USER_STATUS} <br>
     * @param userStatusCode The value of the column 'USER_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setUserStatusCode(String userStatusCode) {
        registerModifiedProperty("userStatusCode");
        _userStatusCode = userStatusCode;
    }

    /**
     * [get] (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが登録された日時
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが登録された日時
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを登録したユーザー
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        checkSpecifiedProperty("registerUser");
        return convertEmptyToNull(_registerUser);
    }

    /**
     * [set] (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを登録したユーザー
     * @param registerUser The value of the column 'REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        registerModifiedProperty("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが(最後に)更新された日時
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが(最後に)更新された日時
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを(最後に)更新したユーザー
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateUser() {
        checkSpecifiedProperty("updateUser");
        return convertEmptyToNull(_updateUser);
    }

    /**
     * [set] (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを(最後に)更新したユーザー
     * @param updateUser The value of the column 'UPDATE_USER'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateUser(String updateUser) {
        registerModifiedProperty("updateUser");
        _updateUser = updateUser;
    }

    /**
     * [get] (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]} <br>
     * バージョン番号
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]} <br>
     * バージョン番号
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }
}
