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
 * The entity of (判例集)REPORT as TABLE. <br>
 * <pre>
 * [primary-key]
 *     REPORT_ID
 *
 * [column]
 *     REPORT_ID, REPORT_NAME, REPORT_ALIAS, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     REPORT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     JUDGEMENT_REPORT_REL
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     judgementReportRelList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer reportId = entity.getReportId();
 * String reportName = entity.getReportName();
 * String reportAlias = entity.getReportAlias();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setReportId(reportId);
 * entity.setReportName(reportName);
 * entity.setReportAlias(reportAlias);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsReport extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (判例集ID)REPORT_ID: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _reportId;

    /** (判例集名)REPORT_NAME: {UQ, NotNull, VARCHAR(100)} */
    protected String _reportName;

    /** (判例集別名)REPORT_ALIAS: {UQ, NotNull, VARCHAR(100)} */
    protected String _reportAlias;

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
        return "REPORT";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_reportId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param reportAlias (判例集別名): UQ, NotNull, VARCHAR(100). (NotNull)
     */
    public void uniqueByReportAlias(String reportAlias) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("reportAlias");
        setReportAlias(reportAlias);
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param reportName (判例集名): UQ, NotNull, VARCHAR(100). (NotNull)
     */
    public void uniqueByReportName(String reportName) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("reportName");
        setReportName(reportName);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (判決判例集リレーション)JUDGEMENT_REPORT_REL by REPORT_ID, named 'judgementReportRelList'. */
    protected List<JudgementReportRel> _judgementReportRelList;

    /**
     * [get] (判決判例集リレーション)JUDGEMENT_REPORT_REL by REPORT_ID, named 'judgementReportRelList'.
     * @return The entity list of referrer property 'judgementReportRelList'. (NotNull: even if no loading, returns empty list)
     */
    public List<JudgementReportRel> getJudgementReportRelList() {
        if (_judgementReportRelList == null) { _judgementReportRelList = newReferrerList(); }
        return _judgementReportRelList;
    }

    /**
     * [set] (判決判例集リレーション)JUDGEMENT_REPORT_REL by REPORT_ID, named 'judgementReportRelList'.
     * @param judgementReportRelList The entity list of referrer property 'judgementReportRelList'. (NullAllowed)
     */
    public void setJudgementReportRelList(List<JudgementReportRel> judgementReportRelList) {
        _judgementReportRelList = judgementReportRelList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsReport) {
            BsReport other = (BsReport)obj;
            if (!xSV(_reportId, other._reportId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _reportId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_judgementReportRelList != null) { for (JudgementReportRel et : _judgementReportRelList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "judgementReportRelList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_reportId));
        sb.append(dm).append(xfND(_reportName));
        sb.append(dm).append(xfND(_reportAlias));
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
        if (_judgementReportRelList != null && !_judgementReportRelList.isEmpty())
        { sb.append(dm).append("judgementReportRelList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Report clone() {
        return (Report)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (判例集ID)REPORT_ID: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'REPORT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getReportId() {
        checkSpecifiedProperty("reportId");
        return _reportId;
    }

    /**
     * [set] (判例集ID)REPORT_ID: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param reportId The value of the column 'REPORT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReportId(Integer reportId) {
        registerModifiedProperty("reportId");
        _reportId = reportId;
    }

    /**
     * [get] (判例集名)REPORT_NAME: {UQ, NotNull, VARCHAR(100)} <br>
     * @return The value of the column 'REPORT_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getReportName() {
        checkSpecifiedProperty("reportName");
        return convertEmptyToNull(_reportName);
    }

    /**
     * [set] (判例集名)REPORT_NAME: {UQ, NotNull, VARCHAR(100)} <br>
     * @param reportName The value of the column 'REPORT_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setReportName(String reportName) {
        registerModifiedProperty("reportName");
        _reportName = reportName;
    }

    /**
     * [get] (判例集別名)REPORT_ALIAS: {UQ, NotNull, VARCHAR(100)} <br>
     * @return The value of the column 'REPORT_ALIAS'. (basically NotNull if selected: for the constraint)
     */
    public String getReportAlias() {
        checkSpecifiedProperty("reportAlias");
        return convertEmptyToNull(_reportAlias);
    }

    /**
     * [set] (判例集別名)REPORT_ALIAS: {UQ, NotNull, VARCHAR(100)} <br>
     * @param reportAlias The value of the column 'REPORT_ALIAS'. (basically NotNull if update: for the constraint)
     */
    public void setReportAlias(String reportAlias) {
        registerModifiedProperty("reportAlias");
        _reportAlias = reportAlias;
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
