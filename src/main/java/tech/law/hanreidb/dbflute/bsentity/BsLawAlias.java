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
 * The entity of (法令略称)LAW_ALIAS as TABLE. <br>
 * <pre>
 * [primary-key]
 *     LAW_ALIAS_ID
 *
 * [column]
 *     LAW_ALIAS_ID, LAW_ALIAS, LAW_ID, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LAW_ALIAS_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     LAW
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     law
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer lawAliasId = entity.getLawAliasId();
 * String lawAlias = entity.getLawAlias();
 * Integer lawId = entity.getLawId();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setLawAliasId(lawAliasId);
 * entity.setLawAlias(lawAlias);
 * entity.setLawId(lawId);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsLawAlias extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (法令通称ID)LAW_ALIAS_ID: {PK, ID, NotNull, INT(10)} */
    protected Integer _lawAliasId;

    /** (法令略称)LAW_ALIAS: {UQ+, NotNull, VARCHAR(200)} */
    protected String _lawAlias;

    /** (法令ID)LAW_ID: {+UQ, IX, NotNull, INT(10), FK to LAW} */
    protected Integer _lawId;

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
        return "LAW_ALIAS";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_lawAliasId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param lawAlias (法令略称): UQ+, NotNull, VARCHAR(200). (NotNull)
     * @param lawId (法令ID): +UQ, IX, NotNull, INT(10), FK to LAW. (NotNull)
     */
    public void uniqueBy(String lawAlias, Integer lawId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("lawAlias");
        __uniqueDrivenProperties.addPropertyName("lawId");
        setLawAlias(lawAlias);setLawId(lawId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
        if (obj instanceof BsLawAlias) {
            BsLawAlias other = (BsLawAlias)obj;
            if (!xSV(_lawAliasId, other._lawAliasId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _lawAliasId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
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
        sb.append(dm).append(xfND(_lawAliasId));
        sb.append(dm).append(xfND(_lawAlias));
        sb.append(dm).append(xfND(_lawId));
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
        if (_law != null && _law.isPresent())
        { sb.append(dm).append("law"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public LawAlias clone() {
        return (LawAlias)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (法令通称ID)LAW_ALIAS_ID: {PK, ID, NotNull, INT(10)} <br>
     * @return The value of the column 'LAW_ALIAS_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getLawAliasId() {
        checkSpecifiedProperty("lawAliasId");
        return _lawAliasId;
    }

    /**
     * [set] (法令通称ID)LAW_ALIAS_ID: {PK, ID, NotNull, INT(10)} <br>
     * @param lawAliasId The value of the column 'LAW_ALIAS_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLawAliasId(Integer lawAliasId) {
        registerModifiedProperty("lawAliasId");
        _lawAliasId = lawAliasId;
    }

    /**
     * [get] (法令略称)LAW_ALIAS: {UQ+, NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'LAW_ALIAS'. (basically NotNull if selected: for the constraint)
     */
    public String getLawAlias() {
        checkSpecifiedProperty("lawAlias");
        return convertEmptyToNull(_lawAlias);
    }

    /**
     * [set] (法令略称)LAW_ALIAS: {UQ+, NotNull, VARCHAR(200)} <br>
     * @param lawAlias The value of the column 'LAW_ALIAS'. (basically NotNull if update: for the constraint)
     */
    public void setLawAlias(String lawAlias) {
        registerModifiedProperty("lawAlias");
        _lawAlias = lawAlias;
    }

    /**
     * [get] (法令ID)LAW_ID: {+UQ, IX, NotNull, INT(10), FK to LAW} <br>
     * @return The value of the column 'LAW_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getLawId() {
        checkSpecifiedProperty("lawId");
        return _lawId;
    }

    /**
     * [set] (法令ID)LAW_ID: {+UQ, IX, NotNull, INT(10), FK to LAW} <br>
     * @param lawId The value of the column 'LAW_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLawId(Integer lawId) {
        registerModifiedProperty("lawId");
        _lawId = lawId;
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
