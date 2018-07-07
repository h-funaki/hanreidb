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
 * The entity of (取得元法令カテゴリー)SOURCE_LAW_CATEGORY as TABLE. <br>
 * マスタは以下のサイトから手動で取得。http://elaws.e-gov.go.jp/search/elawsSearch/elaws_search/lsg0100/init/
 * <pre>
 * [primary-key]
 *     SOURCE_LAW_CATEGORY_ID
 *
 * [column]
 *     SOURCE_LAW_CATEGORY_ID, SOURCE_CODE, LAW_CATEGORY_ID, SOURCE_LAW_CATEGORY_NAME, SOURCE_LAW_CATEGORY_ALIAS, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SOURCE_LAW_CATEGORY_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     LAW_CATEGORY, CLS_SOURCE
 *
 * [referrer table]
 *     SOURCE_LAW_CATEGORY_REL
 *
 * [foreign property]
 *     lawCategory, clsSource
 *
 * [referrer property]
 *     sourceLawCategoryRelList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer sourceLawCategoryId = entity.getSourceLawCategoryId();
 * String sourceCode = entity.getSourceCode();
 * Integer lawCategoryId = entity.getLawCategoryId();
 * String sourceLawCategoryName = entity.getSourceLawCategoryName();
 * String sourceLawCategoryAlias = entity.getSourceLawCategoryAlias();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setSourceLawCategoryId(sourceLawCategoryId);
 * entity.setSourceCode(sourceCode);
 * entity.setLawCategoryId(lawCategoryId);
 * entity.setSourceLawCategoryName(sourceLawCategoryName);
 * entity.setSourceLawCategoryAlias(sourceLawCategoryAlias);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSourceLawCategory extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (取得元法令カテゴリーID)SOURCE_LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)} */
    protected Integer _sourceLawCategoryId;

    /** (取得元コード)SOURCE_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source} */
    protected String _sourceCode;

    /** (法令カテゴリーID)LAW_CATEGORY_ID: {IX, NotNull, INT(10), FK to LAW_CATEGORY} */
    protected Integer _lawCategoryId;

    /** (取得元法令カテゴリー名)SOURCE_LAW_CATEGORY_NAME: {NotNull, VARCHAR(50)} */
    protected String _sourceLawCategoryName;

    /** (取得元法令カテゴリー別名)SOURCE_LAW_CATEGORY_ALIAS: {NotNull, VARCHAR(50)} */
    protected String _sourceLawCategoryAlias;

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
        return "SOURCE_LAW_CATEGORY";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_sourceLawCategoryId == null) { return false; }
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
    /** (取得元法令カテゴリーリレーション)SOURCE_LAW_CATEGORY_REL by SOURCE_LAW_CATEGORY_ID, named 'sourceLawCategoryRelList'. */
    protected List<SourceLawCategoryRel> _sourceLawCategoryRelList;

    /**
     * [get] (取得元法令カテゴリーリレーション)SOURCE_LAW_CATEGORY_REL by SOURCE_LAW_CATEGORY_ID, named 'sourceLawCategoryRelList'.
     * @return The entity list of referrer property 'sourceLawCategoryRelList'. (NotNull: even if no loading, returns empty list)
     */
    public List<SourceLawCategoryRel> getSourceLawCategoryRelList() {
        if (_sourceLawCategoryRelList == null) { _sourceLawCategoryRelList = newReferrerList(); }
        return _sourceLawCategoryRelList;
    }

    /**
     * [set] (取得元法令カテゴリーリレーション)SOURCE_LAW_CATEGORY_REL by SOURCE_LAW_CATEGORY_ID, named 'sourceLawCategoryRelList'.
     * @param sourceLawCategoryRelList The entity list of referrer property 'sourceLawCategoryRelList'. (NullAllowed)
     */
    public void setSourceLawCategoryRelList(List<SourceLawCategoryRel> sourceLawCategoryRelList) {
        _sourceLawCategoryRelList = sourceLawCategoryRelList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsSourceLawCategory) {
            BsSourceLawCategory other = (BsSourceLawCategory)obj;
            if (!xSV(_sourceLawCategoryId, other._sourceLawCategoryId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _sourceLawCategoryId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_lawCategory != null && _lawCategory.isPresent())
        { sb.append(li).append(xbRDS(_lawCategory, "lawCategory")); }
        if (_clsSource != null && _clsSource.isPresent())
        { sb.append(li).append(xbRDS(_clsSource, "clsSource")); }
        if (_sourceLawCategoryRelList != null) { for (SourceLawCategoryRel et : _sourceLawCategoryRelList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "sourceLawCategoryRelList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_sourceLawCategoryId));
        sb.append(dm).append(xfND(_sourceCode));
        sb.append(dm).append(xfND(_lawCategoryId));
        sb.append(dm).append(xfND(_sourceLawCategoryName));
        sb.append(dm).append(xfND(_sourceLawCategoryAlias));
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
        if (_clsSource != null && _clsSource.isPresent())
        { sb.append(dm).append("clsSource"); }
        if (_sourceLawCategoryRelList != null && !_sourceLawCategoryRelList.isEmpty())
        { sb.append(dm).append("sourceLawCategoryRelList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public SourceLawCategory clone() {
        return (SourceLawCategory)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (取得元法令カテゴリーID)SOURCE_LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)} <br>
     * @return The value of the column 'SOURCE_LAW_CATEGORY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSourceLawCategoryId() {
        checkSpecifiedProperty("sourceLawCategoryId");
        return _sourceLawCategoryId;
    }

    /**
     * [set] (取得元法令カテゴリーID)SOURCE_LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)} <br>
     * @param sourceLawCategoryId The value of the column 'SOURCE_LAW_CATEGORY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSourceLawCategoryId(Integer sourceLawCategoryId) {
        registerModifiedProperty("sourceLawCategoryId");
        _sourceLawCategoryId = sourceLawCategoryId;
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
     * [get] (法令カテゴリーID)LAW_CATEGORY_ID: {IX, NotNull, INT(10), FK to LAW_CATEGORY} <br>
     * @return The value of the column 'LAW_CATEGORY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getLawCategoryId() {
        checkSpecifiedProperty("lawCategoryId");
        return _lawCategoryId;
    }

    /**
     * [set] (法令カテゴリーID)LAW_CATEGORY_ID: {IX, NotNull, INT(10), FK to LAW_CATEGORY} <br>
     * @param lawCategoryId The value of the column 'LAW_CATEGORY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLawCategoryId(Integer lawCategoryId) {
        registerModifiedProperty("lawCategoryId");
        _lawCategoryId = lawCategoryId;
    }

    /**
     * [get] (取得元法令カテゴリー名)SOURCE_LAW_CATEGORY_NAME: {NotNull, VARCHAR(50)} <br>
     * @return The value of the column 'SOURCE_LAW_CATEGORY_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getSourceLawCategoryName() {
        checkSpecifiedProperty("sourceLawCategoryName");
        return convertEmptyToNull(_sourceLawCategoryName);
    }

    /**
     * [set] (取得元法令カテゴリー名)SOURCE_LAW_CATEGORY_NAME: {NotNull, VARCHAR(50)} <br>
     * @param sourceLawCategoryName The value of the column 'SOURCE_LAW_CATEGORY_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setSourceLawCategoryName(String sourceLawCategoryName) {
        registerModifiedProperty("sourceLawCategoryName");
        _sourceLawCategoryName = sourceLawCategoryName;
    }

    /**
     * [get] (取得元法令カテゴリー別名)SOURCE_LAW_CATEGORY_ALIAS: {NotNull, VARCHAR(50)} <br>
     * @return The value of the column 'SOURCE_LAW_CATEGORY_ALIAS'. (basically NotNull if selected: for the constraint)
     */
    public String getSourceLawCategoryAlias() {
        checkSpecifiedProperty("sourceLawCategoryAlias");
        return convertEmptyToNull(_sourceLawCategoryAlias);
    }

    /**
     * [set] (取得元法令カテゴリー別名)SOURCE_LAW_CATEGORY_ALIAS: {NotNull, VARCHAR(50)} <br>
     * @param sourceLawCategoryAlias The value of the column 'SOURCE_LAW_CATEGORY_ALIAS'. (basically NotNull if update: for the constraint)
     */
    public void setSourceLawCategoryAlias(String sourceLawCategoryAlias) {
        registerModifiedProperty("sourceLawCategoryAlias");
        _sourceLawCategoryAlias = sourceLawCategoryAlias;
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
