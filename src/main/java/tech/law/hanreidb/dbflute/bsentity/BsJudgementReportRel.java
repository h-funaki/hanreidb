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
 * The entity of (判決判例集リレーション)JUDGEMENT_REPORT_REL as TABLE. <br>
 * いったん、巻、号、頁という単位がある前提にする。
 * <pre>
 * [primary-key]
 *     JUDGEMENT_REPORTS_REL_ID
 *
 * [column]
 *     JUDGEMENT_REPORTS_REL_ID, JUDGEMENT_ID, REPORT_ID, REPORT_KAN, REPORT_GO, REPORT_KO, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     JUDGEMENT_REPORTS_REL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     JUDGEMENT, REPORT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     judgement, report
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long judgementReportsRelId = entity.getJudgementReportsRelId();
 * Long judgementId = entity.getJudgementId();
 * Integer reportId = entity.getReportId();
 * Integer reportKan = entity.getReportKan();
 * Integer reportGo = entity.getReportGo();
 * Integer reportKo = entity.getReportKo();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setJudgementReportsRelId(judgementReportsRelId);
 * entity.setJudgementId(judgementId);
 * entity.setReportId(reportId);
 * entity.setReportKan(reportKan);
 * entity.setReportGo(reportGo);
 * entity.setReportKo(reportKo);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsJudgementReportRel extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (判決判例集リレーションID)JUDGEMENT_REPORTS_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)} */
    protected Long _judgementReportsRelId;

    /** (判決ID)JUDGEMENT_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to JUDGEMENT} */
    protected Long _judgementId;

    /** (判例集ID)REPORT_ID: {IX, NotNull, INT UNSIGNED(10), FK to REPORT} */
    protected Integer _reportId;

    /** (判例集巻)REPORT_KAN: {INT UNSIGNED(10)} */
    protected Integer _reportKan;

    /** (判例集号)REPORT_GO: {INT UNSIGNED(10)} */
    protected Integer _reportGo;

    /** (判例集頁)REPORT_KO: {INT UNSIGNED(10)} */
    protected Integer _reportKo;

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
        return "JUDGEMENT_REPORT_REL";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_judgementReportsRelId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (判決)JUDGEMENT by my JUDGEMENT_ID, named 'judgement'. */
    protected OptionalEntity<Judgement> _judgement;

    /**
     * [get] (判決)JUDGEMENT by my JUDGEMENT_ID, named 'judgement'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'judgement'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Judgement> getJudgement() {
        if (_judgement == null) { _judgement = OptionalEntity.relationEmpty(this, "judgement"); }
        return _judgement;
    }

    /**
     * [set] (判決)JUDGEMENT by my JUDGEMENT_ID, named 'judgement'.
     * @param judgement The entity of foreign property 'judgement'. (NullAllowed)
     */
    public void setJudgement(OptionalEntity<Judgement> judgement) {
        _judgement = judgement;
    }

    /** (判例集)REPORT by my REPORT_ID, named 'report'. */
    protected OptionalEntity<Report> _report;

    /**
     * [get] (判例集)REPORT by my REPORT_ID, named 'report'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'report'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Report> getReport() {
        if (_report == null) { _report = OptionalEntity.relationEmpty(this, "report"); }
        return _report;
    }

    /**
     * [set] (判例集)REPORT by my REPORT_ID, named 'report'.
     * @param report The entity of foreign property 'report'. (NullAllowed)
     */
    public void setReport(OptionalEntity<Report> report) {
        _report = report;
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
        if (obj instanceof BsJudgementReportRel) {
            BsJudgementReportRel other = (BsJudgementReportRel)obj;
            if (!xSV(_judgementReportsRelId, other._judgementReportsRelId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _judgementReportsRelId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_judgement != null && _judgement.isPresent())
        { sb.append(li).append(xbRDS(_judgement, "judgement")); }
        if (_report != null && _report.isPresent())
        { sb.append(li).append(xbRDS(_report, "report")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_judgementReportsRelId));
        sb.append(dm).append(xfND(_judgementId));
        sb.append(dm).append(xfND(_reportId));
        sb.append(dm).append(xfND(_reportKan));
        sb.append(dm).append(xfND(_reportGo));
        sb.append(dm).append(xfND(_reportKo));
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
        if (_judgement != null && _judgement.isPresent())
        { sb.append(dm).append("judgement"); }
        if (_report != null && _report.isPresent())
        { sb.append(dm).append("report"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public JudgementReportRel clone() {
        return (JudgementReportRel)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (判決判例集リレーションID)JUDGEMENT_REPORTS_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)} <br>
     * 判決判例集リレーションID e.g. 1
     * @return The value of the column 'JUDGEMENT_REPORTS_REL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getJudgementReportsRelId() {
        checkSpecifiedProperty("judgementReportsRelId");
        return _judgementReportsRelId;
    }

    /**
     * [set] (判決判例集リレーションID)JUDGEMENT_REPORTS_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)} <br>
     * 判決判例集リレーションID e.g. 1
     * @param judgementReportsRelId The value of the column 'JUDGEMENT_REPORTS_REL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setJudgementReportsRelId(Long judgementReportsRelId) {
        registerModifiedProperty("judgementReportsRelId");
        _judgementReportsRelId = judgementReportsRelId;
    }

    /**
     * [get] (判決ID)JUDGEMENT_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to JUDGEMENT} <br>
     * 判決ID e.g. 1
     * @return The value of the column 'JUDGEMENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getJudgementId() {
        checkSpecifiedProperty("judgementId");
        return _judgementId;
    }

    /**
     * [set] (判決ID)JUDGEMENT_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to JUDGEMENT} <br>
     * 判決ID e.g. 1
     * @param judgementId The value of the column 'JUDGEMENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setJudgementId(Long judgementId) {
        registerModifiedProperty("judgementId");
        _judgementId = judgementId;
    }

    /**
     * [get] (判例集ID)REPORT_ID: {IX, NotNull, INT UNSIGNED(10), FK to REPORT} <br>
     * 判例集ID e.g. 1
     * @return The value of the column 'REPORT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getReportId() {
        checkSpecifiedProperty("reportId");
        return _reportId;
    }

    /**
     * [set] (判例集ID)REPORT_ID: {IX, NotNull, INT UNSIGNED(10), FK to REPORT} <br>
     * 判例集ID e.g. 1
     * @param reportId The value of the column 'REPORT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReportId(Integer reportId) {
        registerModifiedProperty("reportId");
        _reportId = reportId;
    }

    /**
     * [get] (判例集巻)REPORT_KAN: {INT UNSIGNED(10)} <br>
     * 判例集巻 e.g. 12
     * @return The value of the column 'REPORT_KAN'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getReportKan() {
        checkSpecifiedProperty("reportKan");
        return _reportKan;
    }

    /**
     * [set] (判例集巻)REPORT_KAN: {INT UNSIGNED(10)} <br>
     * 判例集巻 e.g. 12
     * @param reportKan The value of the column 'REPORT_KAN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReportKan(Integer reportKan) {
        registerModifiedProperty("reportKan");
        _reportKan = reportKan;
    }

    /**
     * [get] (判例集号)REPORT_GO: {INT UNSIGNED(10)} <br>
     * 判例集号 e.g. 34
     * @return The value of the column 'REPORT_GO'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getReportGo() {
        checkSpecifiedProperty("reportGo");
        return _reportGo;
    }

    /**
     * [set] (判例集号)REPORT_GO: {INT UNSIGNED(10)} <br>
     * 判例集号 e.g. 34
     * @param reportGo The value of the column 'REPORT_GO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReportGo(Integer reportGo) {
        registerModifiedProperty("reportGo");
        _reportGo = reportGo;
    }

    /**
     * [get] (判例集頁)REPORT_KO: {INT UNSIGNED(10)} <br>
     * 判例集頁 e.g. 56
     * @return The value of the column 'REPORT_KO'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getReportKo() {
        checkSpecifiedProperty("reportKo");
        return _reportKo;
    }

    /**
     * [set] (判例集頁)REPORT_KO: {INT UNSIGNED(10)} <br>
     * 判例集頁 e.g. 56
     * @param reportKo The value of the column 'REPORT_KO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReportKo(Integer reportKo) {
        registerModifiedProperty("reportKo");
        _reportKo = reportKo;
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
