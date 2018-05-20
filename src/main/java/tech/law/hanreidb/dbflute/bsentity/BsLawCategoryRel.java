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
 * The entity of (法令カテゴリーリレーション)LAW_CATEGORY_REL as TABLE. <br>
 * <pre>
 * [primary-key]
 *     LAW_CATEGORY_REL_ID
 *
 * [column]
 *     LAW_CATEGORY_REL_ID, LAW_ID, LAW_CATEGORY_ID, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LAW_CATEGORY_REL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     LAW_CATEGORY, LAW
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     lawCategory, law
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long lawCategoryRelId = entity.getLawCategoryRelId();
 * Integer lawId = entity.getLawId();
 * Integer lawCategoryId = entity.getLawCategoryId();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setLawCategoryRelId(lawCategoryRelId);
 * entity.setLawId(lawId);
 * entity.setLawCategoryId(lawCategoryId);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsLawCategoryRel extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (法令カテゴリーリレーションID)LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _lawCategoryRelId;

    /** (法令ID)LAW_ID: {UQ+, NotNull, INT(10), FK to LAW} */
    protected Integer _lawId;

    /** (法令カテゴリーID)LAW_CATEGORY_ID: {+UQ, IX, NotNull, INT(10), FK to LAW_CATEGORY} */
    protected Integer _lawCategoryId;

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
        return "LAW_CATEGORY_REL";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_lawCategoryRelId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param lawId (法令ID): UQ+, NotNull, INT(10), FK to LAW. (NotNull)
     * @param lawCategoryId (法令カテゴリーID): +UQ, IX, NotNull, INT(10), FK to LAW_CATEGORY. (NotNull)
     */
    public void uniqueBy(Integer lawId, Integer lawCategoryId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("lawId");
        __uniqueDrivenProperties.addPropertyName("lawCategoryId");
        setLawId(lawId);setLawCategoryId(lawCategoryId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (法令カテゴリー)LAW_CATEGORY by my LAW_CATEGORY_ID, named 'lawCategory'. */
    protected OptionalEntity<LawCategory> _lawCategory;

    /**
     * [get] (法令カテゴリー)LAW_CATEGORY by my LAW_CATEGORY_ID, named 'lawCategory'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'lawCategory'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<LawCategory> getLawCategory() {
        if (_lawCategory == null) { _lawCategory = OptionalEntity.relationEmpty(this, "lawCategory"); }
        return _lawCategory;
    }

    /**
     * [set] (法令カテゴリー)LAW_CATEGORY by my LAW_CATEGORY_ID, named 'lawCategory'.
     * @param lawCategory The entity of foreign property 'lawCategory'. (NullAllowed)
     */
    public void setLawCategory(OptionalEntity<LawCategory> lawCategory) {
        _lawCategory = lawCategory;
    }

    /** (法令)LAW by my LAW_ID, named 'law'. */
    protected OptionalEntity<Law> _law;

    /**
     * [get] (法令)LAW by my LAW_ID, named 'law'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'law'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Law> getLaw() {
        if (_law == null) { _law = OptionalEntity.relationEmpty(this, "law"); }
        return _law;
    }

    /**
     * [set] (法令)LAW by my LAW_ID, named 'law'.
     * @param law The entity of foreign property 'law'. (NullAllowed)
     */
    public void setLaw(OptionalEntity<Law> law) {
        _law = law;
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
        if (obj instanceof BsLawCategoryRel) {
            BsLawCategoryRel other = (BsLawCategoryRel)obj;
            if (!xSV(_lawCategoryRelId, other._lawCategoryRelId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _lawCategoryRelId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_lawCategory != null && _lawCategory.isPresent())
        { sb.append(li).append(xbRDS(_lawCategory, "lawCategory")); }
        if (_law != null && _law.isPresent())
        { sb.append(li).append(xbRDS(_law, "law")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_lawCategoryRelId));
        sb.append(dm).append(xfND(_lawId));
        sb.append(dm).append(xfND(_lawCategoryId));
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
        if (_lawCategory != null && _lawCategory.isPresent())
        { sb.append(dm).append("lawCategory"); }
        if (_law != null && _law.isPresent())
        { sb.append(dm).append("law"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public LawCategoryRel clone() {
        return (LawCategoryRel)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (法令カテゴリーリレーションID)LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'LAW_CATEGORY_REL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLawCategoryRelId() {
        checkSpecifiedProperty("lawCategoryRelId");
        return _lawCategoryRelId;
    }

    /**
     * [set] (法令カテゴリーリレーションID)LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param lawCategoryRelId The value of the column 'LAW_CATEGORY_REL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLawCategoryRelId(Long lawCategoryRelId) {
        registerModifiedProperty("lawCategoryRelId");
        _lawCategoryRelId = lawCategoryRelId;
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
     * [get] (法令カテゴリーID)LAW_CATEGORY_ID: {+UQ, IX, NotNull, INT(10), FK to LAW_CATEGORY} <br>
     * @return The value of the column 'LAW_CATEGORY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getLawCategoryId() {
        checkSpecifiedProperty("lawCategoryId");
        return _lawCategoryId;
    }

    /**
     * [set] (法令カテゴリーID)LAW_CATEGORY_ID: {+UQ, IX, NotNull, INT(10), FK to LAW_CATEGORY} <br>
     * @param lawCategoryId The value of the column 'LAW_CATEGORY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLawCategoryId(Integer lawCategoryId) {
        registerModifiedProperty("lawCategoryId");
        _lawCategoryId = lawCategoryId;
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
