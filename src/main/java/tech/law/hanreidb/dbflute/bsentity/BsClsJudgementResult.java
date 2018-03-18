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
 * The entity of ([区分値]判決結果)CLS_JUDGEMENT_RESULT as TABLE. <br>
 * <pre>
 * [primary-key]
 *     JUDGEMENT_RESULT_CODE
 *
 * [column]
 *     JUDGEMENT_RESULT_CODE, JUDGEMENT_RESULT_NAME, JUDGEMENT_RESULT_ALIAS, DESCRIPTION, DISPLAY_ORDER, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
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
 *     JUDGEMENT
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     judgementList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String judgementResultCode = entity.getJudgementResultCode();
 * String judgementResultName = entity.getJudgementResultName();
 * String judgementResultAlias = entity.getJudgementResultAlias();
 * String description = entity.getDescription();
 * Integer displayOrder = entity.getDisplayOrder();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setJudgementResultCode(judgementResultCode);
 * entity.setJudgementResultName(judgementResultName);
 * entity.setJudgementResultAlias(judgementResultAlias);
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
public abstract class BsClsJudgementResult extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (判決結果コード)JUDGEMENT_RESULT_CODE: {PK, NotNull, VARCHAR(10), classification=JudgementResult} */
    protected String _judgementResultCode;

    /** (判決結果名)JUDGEMENT_RESULT_NAME: {UQ, NotNull, VARCHAR(10)} */
    protected String _judgementResultName;

    /** (判決結果別名)JUDGEMENT_RESULT_ALIAS: {UQ, NotNull, VARCHAR(10)} */
    protected String _judgementResultAlias;

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
        return "CLS_JUDGEMENT_RESULT";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_judgementResultCode == null) { return false; }
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
     * @param judgementResultAlias (判決結果別名): UQ, NotNull, VARCHAR(10). (NotNull)
     */
    public void uniqueByJudgementResultAlias(String judgementResultAlias) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("judgementResultAlias");
        setJudgementResultAlias(judgementResultAlias);
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param judgementResultName (判決結果名): UQ, NotNull, VARCHAR(10). (NotNull)
     */
    public void uniqueByJudgementResultName(String judgementResultName) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("judgementResultName");
        setJudgementResultName(judgementResultName);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of judgementResultCode as the classification of JudgementResult. <br>
     * (判決結果コード)JUDGEMENT_RESULT_CODE: {PK, NotNull, VARCHAR(10), classification=JudgementResult} <br>
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.JudgementResult getJudgementResultCodeAsJudgementResult() {
        return CDef.JudgementResult.codeOf(getJudgementResultCode());
    }

    /**
     * Set the value of judgementResultCode as the classification of JudgementResult. <br>
     * (判決結果コード)JUDGEMENT_RESULT_CODE: {PK, NotNull, VARCHAR(10), classification=JudgementResult} <br>
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setJudgementResultCodeAsJudgementResult(CDef.JudgementResult cdef) {
        setJudgementResultCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of judgementResultCode as 棄却 (DISMISSAL). <br>
     * 棄却: 棄却
     */
    public void setJudgementResultCode_棄却() {
        setJudgementResultCodeAsJudgementResult(CDef.JudgementResult.棄却);
    }

    /**
     * Set the value of judgementResultCode as 破棄自判 (SELF). <br>
     * 破棄自判: 破棄自判
     */
    public void setJudgementResultCode_破棄自判() {
        setJudgementResultCodeAsJudgementResult(CDef.JudgementResult.破棄自判);
    }

    /**
     * Set the value of judgementResultCode as 破棄差戻 (REMAND). <br>
     * 破棄差戻: 破棄差戻
     */
    public void setJudgementResultCode_破棄差戻() {
        setJudgementResultCodeAsJudgementResult(CDef.JudgementResult.破棄差戻);
    }

    /**
     * Set the value of judgementResultCode as 却下 (REJECTING). <br>
     * 却下: 却下
     */
    public void setJudgementResultCode_却下() {
        setJudgementResultCodeAsJudgementResult(CDef.JudgementResult.却下);
    }

    /**
     * Set the value of judgementResultCode as その他 (OTHERS). <br>
     * その他: その他
     */
    public void setJudgementResultCode_その他() {
        setJudgementResultCodeAsJudgementResult(CDef.JudgementResult.その他);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of judgementResultCode 棄却? <br>
     * 棄却: 棄却
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isJudgementResultCode棄却() {
        CDef.JudgementResult cdef = getJudgementResultCodeAsJudgementResult();
        return cdef != null ? cdef.equals(CDef.JudgementResult.棄却) : false;
    }

    /**
     * Is the value of judgementResultCode 破棄自判? <br>
     * 破棄自判: 破棄自判
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isJudgementResultCode破棄自判() {
        CDef.JudgementResult cdef = getJudgementResultCodeAsJudgementResult();
        return cdef != null ? cdef.equals(CDef.JudgementResult.破棄自判) : false;
    }

    /**
     * Is the value of judgementResultCode 破棄差戻? <br>
     * 破棄差戻: 破棄差戻
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isJudgementResultCode破棄差戻() {
        CDef.JudgementResult cdef = getJudgementResultCodeAsJudgementResult();
        return cdef != null ? cdef.equals(CDef.JudgementResult.破棄差戻) : false;
    }

    /**
     * Is the value of judgementResultCode 却下? <br>
     * 却下: 却下
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isJudgementResultCode却下() {
        CDef.JudgementResult cdef = getJudgementResultCodeAsJudgementResult();
        return cdef != null ? cdef.equals(CDef.JudgementResult.却下) : false;
    }

    /**
     * Is the value of judgementResultCode その他? <br>
     * その他: その他
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isJudgementResultCodeその他() {
        CDef.JudgementResult cdef = getJudgementResultCodeAsJudgementResult();
        return cdef != null ? cdef.equals(CDef.JudgementResult.その他) : false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (判決)JUDGEMENT by JUDGEMENT_RESULT_CODE, named 'judgementList'. */
    protected List<Judgement> _judgementList;

    /**
     * [get] (判決)JUDGEMENT by JUDGEMENT_RESULT_CODE, named 'judgementList'.
     * @return The entity list of referrer property 'judgementList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Judgement> getJudgementList() {
        if (_judgementList == null) { _judgementList = newReferrerList(); }
        return _judgementList;
    }

    /**
     * [set] (判決)JUDGEMENT by JUDGEMENT_RESULT_CODE, named 'judgementList'.
     * @param judgementList The entity list of referrer property 'judgementList'. (NullAllowed)
     */
    public void setJudgementList(List<Judgement> judgementList) {
        _judgementList = judgementList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsClsJudgementResult) {
            BsClsJudgementResult other = (BsClsJudgementResult)obj;
            if (!xSV(_judgementResultCode, other._judgementResultCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _judgementResultCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_judgementList != null) { for (Judgement et : _judgementList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "judgementList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_judgementResultCode));
        sb.append(dm).append(xfND(_judgementResultName));
        sb.append(dm).append(xfND(_judgementResultAlias));
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
        if (_judgementList != null && !_judgementList.isEmpty())
        { sb.append(dm).append("judgementList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public ClsJudgementResult clone() {
        return (ClsJudgementResult)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (判決結果コード)JUDGEMENT_RESULT_CODE: {PK, NotNull, VARCHAR(10), classification=JudgementResult} <br>
     * 判決結果コード e.g. DISMISSAL
     * @return The value of the column 'JUDGEMENT_RESULT_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getJudgementResultCode() {
        checkSpecifiedProperty("judgementResultCode");
        return convertEmptyToNull(_judgementResultCode);
    }

    /**
     * [set] (判決結果コード)JUDGEMENT_RESULT_CODE: {PK, NotNull, VARCHAR(10), classification=JudgementResult} <br>
     * 判決結果コード e.g. DISMISSAL
     * @param judgementResultCode The value of the column 'JUDGEMENT_RESULT_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setJudgementResultCode(String judgementResultCode) {
        registerModifiedProperty("judgementResultCode");
        _judgementResultCode = judgementResultCode;
    }

    /**
     * [get] (判決結果名)JUDGEMENT_RESULT_NAME: {UQ, NotNull, VARCHAR(10)} <br>
     * 判決結果名 e.g. 棄却
     * @return The value of the column 'JUDGEMENT_RESULT_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getJudgementResultName() {
        checkSpecifiedProperty("judgementResultName");
        return convertEmptyToNull(_judgementResultName);
    }

    /**
     * [set] (判決結果名)JUDGEMENT_RESULT_NAME: {UQ, NotNull, VARCHAR(10)} <br>
     * 判決結果名 e.g. 棄却
     * @param judgementResultName The value of the column 'JUDGEMENT_RESULT_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setJudgementResultName(String judgementResultName) {
        registerModifiedProperty("judgementResultName");
        _judgementResultName = judgementResultName;
    }

    /**
     * [get] (判決結果別名)JUDGEMENT_RESULT_ALIAS: {UQ, NotNull, VARCHAR(10)} <br>
     * 判決結果別名 e.g. 棄却
     * @return The value of the column 'JUDGEMENT_RESULT_ALIAS'. (basically NotNull if selected: for the constraint)
     */
    public String getJudgementResultAlias() {
        checkSpecifiedProperty("judgementResultAlias");
        return convertEmptyToNull(_judgementResultAlias);
    }

    /**
     * [set] (判決結果別名)JUDGEMENT_RESULT_ALIAS: {UQ, NotNull, VARCHAR(10)} <br>
     * 判決結果別名 e.g. 棄却
     * @param judgementResultAlias The value of the column 'JUDGEMENT_RESULT_ALIAS'. (basically NotNull if update: for the constraint)
     */
    public void setJudgementResultAlias(String judgementResultAlias) {
        registerModifiedProperty("judgementResultAlias");
        _judgementResultAlias = judgementResultAlias;
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
