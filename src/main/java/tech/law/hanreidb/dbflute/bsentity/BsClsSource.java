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
 * The entity of ([区分値]取得元)CLS_SOURCE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     SOURCE_CODE
 *
 * [column]
 *     SOURCE_CODE, SOURCE_NAME, SOURCE_ALIAS, DESCRIPTION, DISPLAY_ORDER, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
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
 *     JUDGEMENT_SOURCE_REL, LAW_SOURCE_REL, SOURCE_LAW_CATEGORY
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     judgementSourceRelList, lawSourceRelList, sourceLawCategoryList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String sourceCode = entity.getSourceCode();
 * String sourceName = entity.getSourceName();
 * String sourceAlias = entity.getSourceAlias();
 * String description = entity.getDescription();
 * Integer displayOrder = entity.getDisplayOrder();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setSourceCode(sourceCode);
 * entity.setSourceName(sourceName);
 * entity.setSourceAlias(sourceAlias);
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
public abstract class BsClsSource extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (取得元コード)SOURCE_CODE: {PK, NotNull, VARCHAR(10), classification=Source} */
    protected String _sourceCode;

    /** (取得元名)SOURCE_NAME: {UQ, NotNull, VARCHAR(100)} */
    protected String _sourceName;

    /** (取得元別名)SOURCE_ALIAS: {UQ, NotNull, VARCHAR(100)} */
    protected String _sourceAlias;

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
        return "CLS_SOURCE";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_sourceCode == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param displayOrder (順番): UQ, NotNull, INT UNSIGNED(10). (NotNull)
     */
    public void uniqueByDisplayOrder(Integer displayOrder) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("displayOrder");
        setDisplayOrder(displayOrder);
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param sourceAlias (取得元別名): UQ, NotNull, VARCHAR(100). (NotNull)
     */
    public void uniqueBySourceAlias(String sourceAlias) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("sourceAlias");
        setSourceAlias(sourceAlias);
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param sourceName (取得元名): UQ, NotNull, VARCHAR(100). (NotNull)
     */
    public void uniqueBySourceName(String sourceName) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("sourceName");
        setSourceName(sourceName);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of sourceCode as the classification of Source. <br>
     * (取得元コード)SOURCE_CODE: {PK, NotNull, VARCHAR(10), classification=Source} <br>
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Source getSourceCodeAsSource() {
        return CDef.Source.codeOf(getSourceCode());
    }

    /**
     * Set the value of sourceCode as the classification of Source. <br>
     * (取得元コード)SOURCE_CODE: {PK, NotNull, VARCHAR(10), classification=Source} <br>
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
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (判決取得元リレーション)JUDGEMENT_SOURCE_REL by SOURCE_CODE, named 'judgementSourceRelList'. */
    protected List<JudgementSourceRel> _judgementSourceRelList;

    /**
     * [get] (判決取得元リレーション)JUDGEMENT_SOURCE_REL by SOURCE_CODE, named 'judgementSourceRelList'.
     * @return The entity list of referrer property 'judgementSourceRelList'. (NotNull: even if no loading, returns empty list)
     */
    public List<JudgementSourceRel> getJudgementSourceRelList() {
        if (_judgementSourceRelList == null) { _judgementSourceRelList = newReferrerList(); }
        return _judgementSourceRelList;
    }

    /**
     * [set] (判決取得元リレーション)JUDGEMENT_SOURCE_REL by SOURCE_CODE, named 'judgementSourceRelList'.
     * @param judgementSourceRelList The entity list of referrer property 'judgementSourceRelList'. (NullAllowed)
     */
    public void setJudgementSourceRelList(List<JudgementSourceRel> judgementSourceRelList) {
        _judgementSourceRelList = judgementSourceRelList;
    }

    /** (法令取得元リレーション)LAW_SOURCE_REL by SOURCE_CODE, named 'lawSourceRelList'. */
    protected List<LawSourceRel> _lawSourceRelList;

    /**
     * [get] (法令取得元リレーション)LAW_SOURCE_REL by SOURCE_CODE, named 'lawSourceRelList'.
     * @return The entity list of referrer property 'lawSourceRelList'. (NotNull: even if no loading, returns empty list)
     */
    public List<LawSourceRel> getLawSourceRelList() {
        if (_lawSourceRelList == null) { _lawSourceRelList = newReferrerList(); }
        return _lawSourceRelList;
    }

    /**
     * [set] (法令取得元リレーション)LAW_SOURCE_REL by SOURCE_CODE, named 'lawSourceRelList'.
     * @param lawSourceRelList The entity list of referrer property 'lawSourceRelList'. (NullAllowed)
     */
    public void setLawSourceRelList(List<LawSourceRel> lawSourceRelList) {
        _lawSourceRelList = lawSourceRelList;
    }

    /** (取得元法令カテゴリー)SOURCE_LAW_CATEGORY by SOURCE_CODE, named 'sourceLawCategoryList'. */
    protected List<SourceLawCategory> _sourceLawCategoryList;

    /**
     * [get] (取得元法令カテゴリー)SOURCE_LAW_CATEGORY by SOURCE_CODE, named 'sourceLawCategoryList'.
     * @return The entity list of referrer property 'sourceLawCategoryList'. (NotNull: even if no loading, returns empty list)
     */
    public List<SourceLawCategory> getSourceLawCategoryList() {
        if (_sourceLawCategoryList == null) { _sourceLawCategoryList = newReferrerList(); }
        return _sourceLawCategoryList;
    }

    /**
     * [set] (取得元法令カテゴリー)SOURCE_LAW_CATEGORY by SOURCE_CODE, named 'sourceLawCategoryList'.
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
        if (obj instanceof BsClsSource) {
            BsClsSource other = (BsClsSource)obj;
            if (!xSV(_sourceCode, other._sourceCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _sourceCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_judgementSourceRelList != null) { for (JudgementSourceRel et : _judgementSourceRelList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "judgementSourceRelList")); } } }
        if (_lawSourceRelList != null) { for (LawSourceRel et : _lawSourceRelList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "lawSourceRelList")); } } }
        if (_sourceLawCategoryList != null) { for (SourceLawCategory et : _sourceLawCategoryList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "sourceLawCategoryList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_sourceCode));
        sb.append(dm).append(xfND(_sourceName));
        sb.append(dm).append(xfND(_sourceAlias));
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
        if (_judgementSourceRelList != null && !_judgementSourceRelList.isEmpty())
        { sb.append(dm).append("judgementSourceRelList"); }
        if (_lawSourceRelList != null && !_lawSourceRelList.isEmpty())
        { sb.append(dm).append("lawSourceRelList"); }
        if (_sourceLawCategoryList != null && !_sourceLawCategoryList.isEmpty())
        { sb.append(dm).append("sourceLawCategoryList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public ClsSource clone() {
        return (ClsSource)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (取得元コード)SOURCE_CODE: {PK, NotNull, VARCHAR(10), classification=Source} <br>
     * 取得元コード e.g. COURT
     * @return The value of the column 'SOURCE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getSourceCode() {
        checkSpecifiedProperty("sourceCode");
        return convertEmptyToNull(_sourceCode);
    }

    /**
     * [set] (取得元コード)SOURCE_CODE: {PK, NotNull, VARCHAR(10), classification=Source} <br>
     * 取得元コード e.g. COURT
     * @param sourceCode The value of the column 'SOURCE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setSourceCode(String sourceCode) {
        registerModifiedProperty("sourceCode");
        _sourceCode = sourceCode;
    }

    /**
     * [get] (取得元名)SOURCE_NAME: {UQ, NotNull, VARCHAR(100)} <br>
     * 取得元名 e.g. 裁判所裁判例
     * @return The value of the column 'SOURCE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getSourceName() {
        checkSpecifiedProperty("sourceName");
        return convertEmptyToNull(_sourceName);
    }

    /**
     * [set] (取得元名)SOURCE_NAME: {UQ, NotNull, VARCHAR(100)} <br>
     * 取得元名 e.g. 裁判所裁判例
     * @param sourceName The value of the column 'SOURCE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setSourceName(String sourceName) {
        registerModifiedProperty("sourceName");
        _sourceName = sourceName;
    }

    /**
     * [get] (取得元別名)SOURCE_ALIAS: {UQ, NotNull, VARCHAR(100)} <br>
     * 取得元別名 e.g. 裁判所裁判例
     * @return The value of the column 'SOURCE_ALIAS'. (basically NotNull if selected: for the constraint)
     */
    public String getSourceAlias() {
        checkSpecifiedProperty("sourceAlias");
        return convertEmptyToNull(_sourceAlias);
    }

    /**
     * [set] (取得元別名)SOURCE_ALIAS: {UQ, NotNull, VARCHAR(100)} <br>
     * 取得元別名 e.g. 裁判所裁判例
     * @param sourceAlias The value of the column 'SOURCE_ALIAS'. (basically NotNull if update: for the constraint)
     */
    public void setSourceAlias(String sourceAlias) {
        registerModifiedProperty("sourceAlias");
        _sourceAlias = sourceAlias;
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
