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
import tech.law.hanreidb.dbflute.exentity.*;

/**
 * The entity of (法令カテゴリー)LAW_CATEGORY as TABLE. <br>
 * マスタは以下のサイトから手動で取得。http://elaws.e-gov.go.jp/search/elawsSearch/elaws_search/lsg0100/init/
 * <pre>
 * [primary-key]
 *     LAW_CATEGORY_ID
 *
 * [column]
 *     LAW_CATEGORY_ID, LAW_CATEGORY_NAME, LAW_CATEGORY_ALIAS, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LAW_CATEGORY_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     LAW_CATEGORY_REL, SOURCE_LAW_CATEGORY
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     lawCategoryRelList, sourceLawCategoryList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer lawCategoryId = entity.getLawCategoryId();
 * String lawCategoryName = entity.getLawCategoryName();
 * String lawCategoryAlias = entity.getLawCategoryAlias();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setLawCategoryId(lawCategoryId);
 * entity.setLawCategoryName(lawCategoryName);
 * entity.setLawCategoryAlias(lawCategoryAlias);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsLawCategory extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (法令カテゴリーID)LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)} */
    protected Integer _lawCategoryId;

    /** (法令カテゴリー名)LAW_CATEGORY_NAME: {UQ, NotNull, VARCHAR(20)} */
    protected String _lawCategoryName;

    /** (法令カテゴリー別名)LAW_CATEGORY_ALIAS: {UQ, NotNull, VARCHAR(20)} */
    protected String _lawCategoryAlias;

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
        return "LAW_CATEGORY";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_lawCategoryId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param lawCategoryAlias (法令カテゴリー別名): UQ, NotNull, VARCHAR(20). (NotNull)
     */
    public void uniqueByLawCategoryAlias(String lawCategoryAlias) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("lawCategoryAlias");
        setLawCategoryAlias(lawCategoryAlias);
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param lawCategoryName (法令カテゴリー名): UQ, NotNull, VARCHAR(20). (NotNull)
     */
    public void uniqueByLawCategoryName(String lawCategoryName) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("lawCategoryName");
        setLawCategoryName(lawCategoryName);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (法令カテゴリーリレーション)LAW_CATEGORY_REL by LAW_CATEGORY_ID, named 'lawCategoryRelList'. */
    protected List<LawCategoryRel> _lawCategoryRelList;

    /**
     * [get] (法令カテゴリーリレーション)LAW_CATEGORY_REL by LAW_CATEGORY_ID, named 'lawCategoryRelList'.
     * @return The entity list of referrer property 'lawCategoryRelList'. (NotNull: even if no loading, returns empty list)
     */
    public List<LawCategoryRel> getLawCategoryRelList() {
        if (_lawCategoryRelList == null) { _lawCategoryRelList = newReferrerList(); }
        return _lawCategoryRelList;
    }

    /**
     * [set] (法令カテゴリーリレーション)LAW_CATEGORY_REL by LAW_CATEGORY_ID, named 'lawCategoryRelList'.
     * @param lawCategoryRelList The entity list of referrer property 'lawCategoryRelList'. (NullAllowed)
     */
    public void setLawCategoryRelList(List<LawCategoryRel> lawCategoryRelList) {
        _lawCategoryRelList = lawCategoryRelList;
    }

    /** (取得元法令カテゴリー)SOURCE_LAW_CATEGORY by LAW_CATEGORY_ID, named 'sourceLawCategoryList'. */
    protected List<SourceLawCategory> _sourceLawCategoryList;

    /**
     * [get] (取得元法令カテゴリー)SOURCE_LAW_CATEGORY by LAW_CATEGORY_ID, named 'sourceLawCategoryList'.
     * @return The entity list of referrer property 'sourceLawCategoryList'. (NotNull: even if no loading, returns empty list)
     */
    public List<SourceLawCategory> getSourceLawCategoryList() {
        if (_sourceLawCategoryList == null) { _sourceLawCategoryList = newReferrerList(); }
        return _sourceLawCategoryList;
    }

    /**
     * [set] (取得元法令カテゴリー)SOURCE_LAW_CATEGORY by LAW_CATEGORY_ID, named 'sourceLawCategoryList'.
     * @param sourceLawCategoryList The entity list of referrer property 'sourceLawCategoryList'. (NullAllowed)
     */
    public void setSourceLawCategoryList(List<SourceLawCategory> sourceLawCategoryList) {
        _sourceLawCategoryList = sourceLawCategoryList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsLawCategory) {
            BsLawCategory other = (BsLawCategory)obj;
            if (!xSV(_lawCategoryId, other._lawCategoryId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _lawCategoryId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_lawCategoryRelList != null) { for (LawCategoryRel et : _lawCategoryRelList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "lawCategoryRelList")); } } }
        if (_sourceLawCategoryList != null) { for (SourceLawCategory et : _sourceLawCategoryList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "sourceLawCategoryList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_lawCategoryId));
        sb.append(dm).append(xfND(_lawCategoryName));
        sb.append(dm).append(xfND(_lawCategoryAlias));
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
        if (_lawCategoryRelList != null && !_lawCategoryRelList.isEmpty())
        { sb.append(dm).append("lawCategoryRelList"); }
        if (_sourceLawCategoryList != null && !_sourceLawCategoryList.isEmpty())
        { sb.append(dm).append("sourceLawCategoryList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public LawCategory clone() {
        return (LawCategory)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (法令カテゴリーID)LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)} <br>
     * @return The value of the column 'LAW_CATEGORY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getLawCategoryId() {
        checkSpecifiedProperty("lawCategoryId");
        return _lawCategoryId;
    }

    /**
     * [set] (法令カテゴリーID)LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)} <br>
     * @param lawCategoryId The value of the column 'LAW_CATEGORY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLawCategoryId(Integer lawCategoryId) {
        registerModifiedProperty("lawCategoryId");
        _lawCategoryId = lawCategoryId;
    }

    /**
     * [get] (法令カテゴリー名)LAW_CATEGORY_NAME: {UQ, NotNull, VARCHAR(20)} <br>
     * @return The value of the column 'LAW_CATEGORY_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getLawCategoryName() {
        checkSpecifiedProperty("lawCategoryName");
        return convertEmptyToNull(_lawCategoryName);
    }

    /**
     * [set] (法令カテゴリー名)LAW_CATEGORY_NAME: {UQ, NotNull, VARCHAR(20)} <br>
     * @param lawCategoryName The value of the column 'LAW_CATEGORY_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setLawCategoryName(String lawCategoryName) {
        registerModifiedProperty("lawCategoryName");
        _lawCategoryName = lawCategoryName;
    }

    /**
     * [get] (法令カテゴリー別名)LAW_CATEGORY_ALIAS: {UQ, NotNull, VARCHAR(20)} <br>
     * @return The value of the column 'LAW_CATEGORY_ALIAS'. (basically NotNull if selected: for the constraint)
     */
    public String getLawCategoryAlias() {
        checkSpecifiedProperty("lawCategoryAlias");
        return convertEmptyToNull(_lawCategoryAlias);
    }

    /**
     * [set] (法令カテゴリー別名)LAW_CATEGORY_ALIAS: {UQ, NotNull, VARCHAR(20)} <br>
     * @param lawCategoryAlias The value of the column 'LAW_CATEGORY_ALIAS'. (basically NotNull if update: for the constraint)
     */
    public void setLawCategoryAlias(String lawCategoryAlias) {
        registerModifiedProperty("lawCategoryAlias");
        _lawCategoryAlias = lawCategoryAlias;
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
