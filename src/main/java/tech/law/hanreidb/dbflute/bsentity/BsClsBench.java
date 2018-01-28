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
 * The entity of ([区分値]法廷種別)CLS_BENCH as TABLE. <br>
 * <pre>
 * [primary-key]
 *     BENCH_CODE
 *
 * [column]
 *     BENCH_CODE, BENCH_NAME, BENCH_ALIAS, DESCRIPTION, DISPLAY_ORDER, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
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
 * String benchCode = entity.getBenchCode();
 * String benchName = entity.getBenchName();
 * String benchAlias = entity.getBenchAlias();
 * String description = entity.getDescription();
 * Integer displayOrder = entity.getDisplayOrder();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setBenchCode(benchCode);
 * entity.setBenchName(benchName);
 * entity.setBenchAlias(benchAlias);
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
public abstract class BsClsBench extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (法廷種別コード)BENCH_CODE: {PK, NotNull, VARCHAR(10), classification=Bench} */
    protected String _benchCode;

    /** (法廷種別名)BENCH_NAME: {UQ, NotNull, VARCHAR(10)} */
    protected String _benchName;

    /** (法廷種別別名)BENCH_ALIAS: {UQ, NotNull, VARCHAR(10)} */
    protected String _benchAlias;

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
        return "CLS_BENCH";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_benchCode == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param benchAlias (法廷種別別名): UQ, NotNull, VARCHAR(10). (NotNull)
     */
    public void uniqueByBenchAlias(String benchAlias) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("benchAlias");
        setBenchAlias(benchAlias);
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param benchName (法廷種別名): UQ, NotNull, VARCHAR(10). (NotNull)
     */
    public void uniqueByBenchName(String benchName) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("benchName");
        setBenchName(benchName);
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

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of benchCode as the classification of Bench. <br>
     * (法廷種別コード)BENCH_CODE: {PK, NotNull, VARCHAR(10), classification=Bench} <br>
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Bench getBenchCodeAsBench() {
        return CDef.Bench.codeOf(getBenchCode());
    }

    /**
     * Set the value of benchCode as the classification of Bench. <br>
     * (法廷種別コード)BENCH_CODE: {PK, NotNull, VARCHAR(10), classification=Bench} <br>
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setBenchCodeAsBench(CDef.Bench cdef) {
        setBenchCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of benchCode as 大法廷 (FULL). <br>
     * 大法廷: 大法廷
     */
    public void setBenchCode_大法廷() {
        setBenchCodeAsBench(CDef.Bench.大法廷);
    }

    /**
     * Set the value of benchCode as 第一小法廷 (FIRST). <br>
     * 第一小法廷: 第一小法廷
     */
    public void setBenchCode_第一小法廷() {
        setBenchCodeAsBench(CDef.Bench.第一小法廷);
    }

    /**
     * Set the value of benchCode as 第二小法廷 (SECOND). <br>
     * 第二小法廷: 第二小法廷
     */
    public void setBenchCode_第二小法廷() {
        setBenchCodeAsBench(CDef.Bench.第二小法廷);
    }

    /**
     * Set the value of benchCode as 第三小法廷 (THIRD). <br>
     * 第三小法廷: 第三小法廷
     */
    public void setBenchCode_第三小法廷() {
        setBenchCodeAsBench(CDef.Bench.第三小法廷);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of benchCode 大法廷? <br>
     * 大法廷: 大法廷
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isBenchCode大法廷() {
        CDef.Bench cdef = getBenchCodeAsBench();
        return cdef != null ? cdef.equals(CDef.Bench.大法廷) : false;
    }

    /**
     * Is the value of benchCode 第一小法廷? <br>
     * 第一小法廷: 第一小法廷
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isBenchCode第一小法廷() {
        CDef.Bench cdef = getBenchCodeAsBench();
        return cdef != null ? cdef.equals(CDef.Bench.第一小法廷) : false;
    }

    /**
     * Is the value of benchCode 第二小法廷? <br>
     * 第二小法廷: 第二小法廷
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isBenchCode第二小法廷() {
        CDef.Bench cdef = getBenchCodeAsBench();
        return cdef != null ? cdef.equals(CDef.Bench.第二小法廷) : false;
    }

    /**
     * Is the value of benchCode 第三小法廷? <br>
     * 第三小法廷: 第三小法廷
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isBenchCode第三小法廷() {
        CDef.Bench cdef = getBenchCodeAsBench();
        return cdef != null ? cdef.equals(CDef.Bench.第三小法廷) : false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (判決)JUDGEMENT by BENCH_CODE, named 'judgementList'. */
    protected List<Judgement> _judgementList;

    /**
     * [get] (判決)JUDGEMENT by BENCH_CODE, named 'judgementList'.
     * @return The entity list of referrer property 'judgementList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Judgement> getJudgementList() {
        if (_judgementList == null) { _judgementList = newReferrerList(); }
        return _judgementList;
    }

    /**
     * [set] (判決)JUDGEMENT by BENCH_CODE, named 'judgementList'.
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
        if (obj instanceof BsClsBench) {
            BsClsBench other = (BsClsBench)obj;
            if (!xSV(_benchCode, other._benchCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _benchCode);
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
        sb.append(dm).append(xfND(_benchCode));
        sb.append(dm).append(xfND(_benchName));
        sb.append(dm).append(xfND(_benchAlias));
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
    public ClsBench clone() {
        return (ClsBench)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (法廷種別コード)BENCH_CODE: {PK, NotNull, VARCHAR(10), classification=Bench} <br>
     * @return The value of the column 'BENCH_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getBenchCode() {
        checkSpecifiedProperty("benchCode");
        return convertEmptyToNull(_benchCode);
    }

    /**
     * [set] (法廷種別コード)BENCH_CODE: {PK, NotNull, VARCHAR(10), classification=Bench} <br>
     * @param benchCode The value of the column 'BENCH_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setBenchCode(String benchCode) {
        registerModifiedProperty("benchCode");
        _benchCode = benchCode;
    }

    /**
     * [get] (法廷種別名)BENCH_NAME: {UQ, NotNull, VARCHAR(10)} <br>
     * @return The value of the column 'BENCH_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getBenchName() {
        checkSpecifiedProperty("benchName");
        return convertEmptyToNull(_benchName);
    }

    /**
     * [set] (法廷種別名)BENCH_NAME: {UQ, NotNull, VARCHAR(10)} <br>
     * @param benchName The value of the column 'BENCH_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setBenchName(String benchName) {
        registerModifiedProperty("benchName");
        _benchName = benchName;
    }

    /**
     * [get] (法廷種別別名)BENCH_ALIAS: {UQ, NotNull, VARCHAR(10)} <br>
     * @return The value of the column 'BENCH_ALIAS'. (basically NotNull if selected: for the constraint)
     */
    public String getBenchAlias() {
        checkSpecifiedProperty("benchAlias");
        return convertEmptyToNull(_benchAlias);
    }

    /**
     * [set] (法廷種別別名)BENCH_ALIAS: {UQ, NotNull, VARCHAR(10)} <br>
     * @param benchAlias The value of the column 'BENCH_ALIAS'. (basically NotNull if update: for the constraint)
     */
    public void setBenchAlias(String benchAlias) {
        registerModifiedProperty("benchAlias");
        _benchAlias = benchAlias;
    }

    /**
     * [get] (説明)DESCRIPTION: {NotNull, TEXT(65535)} <br>
     * 説明
     * @return The value of the column 'DESCRIPTION'. (basically NotNull if selected: for the constraint)
     */
    public String getDescription() {
        checkSpecifiedProperty("description");
        return convertEmptyToNull(_description);
    }

    /**
     * [set] (説明)DESCRIPTION: {NotNull, TEXT(65535)} <br>
     * 説明
     * @param description The value of the column 'DESCRIPTION'. (basically NotNull if update: for the constraint)
     */
    public void setDescription(String description) {
        registerModifiedProperty("description");
        _description = description;
    }

    /**
     * [get] (順番)DISPLAY_ORDER: {UQ, NotNull, INT UNSIGNED(10)} <br>
     * 順番
     * @return The value of the column 'DISPLAY_ORDER'. (basically NotNull if selected: for the constraint)
     */
    public Integer getDisplayOrder() {
        checkSpecifiedProperty("displayOrder");
        return _displayOrder;
    }

    /**
     * [set] (順番)DISPLAY_ORDER: {UQ, NotNull, INT UNSIGNED(10)} <br>
     * 順番
     * @param displayOrder The value of the column 'DISPLAY_ORDER'. (basically NotNull if update: for the constraint)
     */
    public void setDisplayOrder(Integer displayOrder) {
        registerModifiedProperty("displayOrder");
        _displayOrder = displayOrder;
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
