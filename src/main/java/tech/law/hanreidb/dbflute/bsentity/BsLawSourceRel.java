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
 * The entity of (法令取得元リレーション)LAW_SOURCE_REL as TABLE. <br>
 * <pre>
 * [primary-key]
 *     LAW_SOURCE_REL_ID
 *
 * [column]
 *     LAW_SOURCE_REL_ID, LAW_ID, SOURCE_CODE, LAW_SOURCE_ID, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LAW_SOURCE_REL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     LAW, CLS_SOURCE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     law, clsSource
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long lawSourceRelId = entity.getLawSourceRelId();
 * Integer lawId = entity.getLawId();
 * String sourceCode = entity.getSourceCode();
 * String lawSourceId = entity.getLawSourceId();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setLawSourceRelId(lawSourceRelId);
 * entity.setLawId(lawId);
 * entity.setSourceCode(sourceCode);
 * entity.setLawSourceId(lawSourceId);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsLawSourceRel extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (法令取得元リレーションID)LAW_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _lawSourceRelId;

    /** (法令ID)LAW_ID: {IX, NotNull, INT(10), FK to LAW} */
    protected Integer _lawId;

    /** (取得元コード)SOURCE_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source} */
    protected String _sourceCode;

    /** (法令取得元ID)LAW_SOURCE_ID: {NotNull, VARCHAR(100)} */
    protected String _lawSourceId;

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
        return "LAW_SOURCE_REL";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_lawSourceRelId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of sourceCode as the classification of Source. <br>
     * (取得元コード)SOURCE_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source} <br>
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Source getSourceCodeAsSource() {
        return CDef.Source.codeOf(getSourceCode());
    }

    /**
     * Set the value of sourceCode as the classification of Source. <br>
     * (取得元コード)SOURCE_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source} <br>
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setSourceCodeAsSource(CDef.Source cdef) {
        setSourceCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of sourceCode as 裁判所裁判例 (COURT). <br>
     * 裁判所裁判例: 裁判所裁判例
     */
    public void setSourceCode_裁判所裁判例() {
        setSourceCodeAsSource(CDef.Source.裁判所裁判例);
    }

    /**
     * Set the value of sourceCode as Egov (EGOV). <br>
     * e-Gov: e-Gov
     */
    public void setSourceCode_Egov() {
        setSourceCodeAsSource(CDef.Source.Egov);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of sourceCode 裁判所裁判例? <br>
     * 裁判所裁判例: 裁判所裁判例
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSourceCode裁判所裁判例() {
        CDef.Source cdef = getSourceCodeAsSource();
        return cdef != null ? cdef.equals(CDef.Source.裁判所裁判例) : false;
    }

    /**
     * Is the value of sourceCode Egov? <br>
     * e-Gov: e-Gov
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSourceCodeEgov() {
        CDef.Source cdef = getSourceCodeAsSource();
        return cdef != null ? cdef.equals(CDef.Source.Egov) : false;
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

    /** ([区分値]取得元)CLS_SOURCE by my SOURCE_CODE, named 'clsSource'. */
    protected OptionalEntity<ClsSource> _clsSource;

    /**
     * [get] ([区分値]取得元)CLS_SOURCE by my SOURCE_CODE, named 'clsSource'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'clsSource'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<ClsSource> getClsSource() {
        if (_clsSource == null) { _clsSource = OptionalEntity.relationEmpty(this, "clsSource"); }
        return _clsSource;
    }

    /**
     * [set] ([区分値]取得元)CLS_SOURCE by my SOURCE_CODE, named 'clsSource'.
     * @param clsSource The entity of foreign property 'clsSource'. (NullAllowed)
     */
    public void setClsSource(OptionalEntity<ClsSource> clsSource) {
        _clsSource = clsSource;
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
        if (obj instanceof BsLawSourceRel) {
            BsLawSourceRel other = (BsLawSourceRel)obj;
            if (!xSV(_lawSourceRelId, other._lawSourceRelId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _lawSourceRelId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_law != null && _law.isPresent())
        { sb.append(li).append(xbRDS(_law, "law")); }
        if (_clsSource != null && _clsSource.isPresent())
        { sb.append(li).append(xbRDS(_clsSource, "clsSource")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_lawSourceRelId));
        sb.append(dm).append(xfND(_lawId));
        sb.append(dm).append(xfND(_sourceCode));
        sb.append(dm).append(xfND(_lawSourceId));
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
        if (_clsSource != null && _clsSource.isPresent())
        { sb.append(dm).append("clsSource"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public LawSourceRel clone() {
        return (LawSourceRel)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (法令取得元リレーションID)LAW_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'LAW_SOURCE_REL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLawSourceRelId() {
        checkSpecifiedProperty("lawSourceRelId");
        return _lawSourceRelId;
    }

    /**
     * [set] (法令取得元リレーションID)LAW_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param lawSourceRelId The value of the column 'LAW_SOURCE_REL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLawSourceRelId(Long lawSourceRelId) {
        registerModifiedProperty("lawSourceRelId");
        _lawSourceRelId = lawSourceRelId;
    }

    /**
     * [get] (法令ID)LAW_ID: {IX, NotNull, INT(10), FK to LAW} <br>
     * @return The value of the column 'LAW_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getLawId() {
        checkSpecifiedProperty("lawId");
        return _lawId;
    }

    /**
     * [set] (法令ID)LAW_ID: {IX, NotNull, INT(10), FK to LAW} <br>
     * @param lawId The value of the column 'LAW_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLawId(Integer lawId) {
        registerModifiedProperty("lawId");
        _lawId = lawId;
    }

    /**
     * [get] (取得元コード)SOURCE_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source} <br>
     * 取得元コード e.g. COURT
     * @return The value of the column 'SOURCE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getSourceCode() {
        checkSpecifiedProperty("sourceCode");
        return convertEmptyToNull(_sourceCode);
    }

    /**
     * [set] (取得元コード)SOURCE_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source} <br>
     * 取得元コード e.g. COURT
     * @param sourceCode The value of the column 'SOURCE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setSourceCode(String sourceCode) {
        registerModifiedProperty("sourceCode");
        _sourceCode = sourceCode;
    }

    /**
     * [get] (法令取得元ID)LAW_SOURCE_ID: {NotNull, VARCHAR(100)} <br>
     * @return The value of the column 'LAW_SOURCE_ID'. (basically NotNull if selected: for the constraint)
     */
    public String getLawSourceId() {
        checkSpecifiedProperty("lawSourceId");
        return convertEmptyToNull(_lawSourceId);
    }

    /**
     * [set] (法令取得元ID)LAW_SOURCE_ID: {NotNull, VARCHAR(100)} <br>
     * @param lawSourceId The value of the column 'LAW_SOURCE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLawSourceId(String lawSourceId) {
        registerModifiedProperty("lawSourceId");
        _lawSourceId = lawSourceId;
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
