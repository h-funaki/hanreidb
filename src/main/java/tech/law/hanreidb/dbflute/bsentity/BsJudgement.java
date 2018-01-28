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
import tech.law.hanreidb.dbflute.allcommon.DBMetaInstanceHandler;
import tech.law.hanreidb.dbflute.allcommon.CDef;
import tech.law.hanreidb.dbflute.exentity.*;

/**
 * The entity of (判決)JUDGEMENT as TABLE. <br>
 * <pre>
 * [primary-key]
 *     JUDGEMENT_ID
 *
 * [column]
 *     JUDGEMENT_ID, JUDGEMENT_PUBLIC_CODE, CASE_NAME, PRECEDENT_REPORTS_KAN, PRECEDENT_REPORTS_GO, PRECEDENT_REPORTS_KO, JUDGEMENT_REPORTS_GO, JUDGEMENT_REPORTS_KO, JUDGEMENT_DATE, ORIGINAL_JUDGEMENT_ID, CASE_NUMBER_ERA_CODE, CASE_NUMBER_YEAR, CASE_MARK_ID, CASE_NUMBER_SERIAL_NUMBER, COURT_ID, BENCH_CODE, JUDGEMENT_RESULT_CODE, JUDGEMENT_TYPE_CODE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     JUDGEMENT_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     CLS_BENCH, CASE_MARK, CLS_ERA, COURT, CLS_JUDGEMENT_RESULT, CLS_JUDGEMENT_TYPE, JUDGEMENT
 *
 * [referrer table]
 *     JUDGEMENT, JUDGEMENT_SOURCE_REL
 *
 * [foreign property]
 *     clsBench, caseMark, clsEra, court, clsJudgementResult, clsJudgementType, judgementSelf
 *
 * [referrer property]
 *     judgementSelfList, judgementSourceRelList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long judgementId = entity.getJudgementId();
 * String judgementPublicCode = entity.getJudgementPublicCode();
 * String caseName = entity.getCaseName();
 * Integer precedentReportsKan = entity.getPrecedentReportsKan();
 * Integer precedentReportsGo = entity.getPrecedentReportsGo();
 * Integer precedentReportsKo = entity.getPrecedentReportsKo();
 * Integer judgementReportsGo = entity.getJudgementReportsGo();
 * Integer judgementReportsKo = entity.getJudgementReportsKo();
 * java.time.LocalDate judgementDate = entity.getJudgementDate();
 * Long originalJudgementId = entity.getOriginalJudgementId();
 * String caseNumberEraCode = entity.getCaseNumberEraCode();
 * Integer caseNumberYear = entity.getCaseNumberYear();
 * Integer caseMarkId = entity.getCaseMarkId();
 * Integer caseNumberSerialNumber = entity.getCaseNumberSerialNumber();
 * Integer courtId = entity.getCourtId();
 * String benchCode = entity.getBenchCode();
 * String judgementResultCode = entity.getJudgementResultCode();
 * String judgementTypeCode = entity.getJudgementTypeCode();
 * entity.setJudgementId(judgementId);
 * entity.setJudgementPublicCode(judgementPublicCode);
 * entity.setCaseName(caseName);
 * entity.setPrecedentReportsKan(precedentReportsKan);
 * entity.setPrecedentReportsGo(precedentReportsGo);
 * entity.setPrecedentReportsKo(precedentReportsKo);
 * entity.setJudgementReportsGo(judgementReportsGo);
 * entity.setJudgementReportsKo(judgementReportsKo);
 * entity.setJudgementDate(judgementDate);
 * entity.setOriginalJudgementId(originalJudgementId);
 * entity.setCaseNumberEraCode(caseNumberEraCode);
 * entity.setCaseNumberYear(caseNumberYear);
 * entity.setCaseMarkId(caseMarkId);
 * entity.setCaseNumberSerialNumber(caseNumberSerialNumber);
 * entity.setCourtId(courtId);
 * entity.setBenchCode(benchCode);
 * entity.setJudgementResultCode(judgementResultCode);
 * entity.setJudgementTypeCode(judgementTypeCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsJudgement extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (判決ID)JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)} */
    protected Long _judgementId;

    /** (判決公開コード)JUDGEMENT_PUBLIC_CODE: {UQ, NotNull, VARCHAR(20)} */
    protected String _judgementPublicCode;

    /** (事件名)CASE_NAME: {TEXT(65535)} */
    protected String _caseName;

    /** (判例集巻)PRECEDENT_REPORTS_KAN: {INT UNSIGNED(10)} */
    protected Integer _precedentReportsKan;

    /** (判例集号)PRECEDENT_REPORTS_GO: {INT UNSIGNED(10)} */
    protected Integer _precedentReportsGo;

    /** (判例集頁)PRECEDENT_REPORTS_KO: {INT UNSIGNED(10)} */
    protected Integer _precedentReportsKo;

    /** (裁判集号)JUDGEMENT_REPORTS_GO: {INT UNSIGNED(10)} */
    protected Integer _judgementReportsGo;

    /** (裁判集頁)JUDGEMENT_REPORTS_KO: {INT UNSIGNED(10)} */
    protected Integer _judgementReportsKo;

    /** (裁判年月日)JUDGEMENT_DATE: {DATE(10)} */
    protected java.time.LocalDate _judgementDate;

    /** (原審判決ID)ORIGINAL_JUDGEMENT_ID: {IX, BIGINT UNSIGNED(20), FK to JUDGEMENT} */
    protected Long _originalJudgementId;

    /** (元号コード)CASE_NUMBER_ERA_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_ERA, classification=Era} */
    protected String _caseNumberEraCode;

    /** (事件番号年)CASE_NUMBER_YEAR: {NotNull, INT UNSIGNED(10)} */
    protected Integer _caseNumberYear;

    /** (事件符号ID)CASE_MARK_ID: {IX, NotNull, INT UNSIGNED(10), FK to CASE_MARK} */
    protected Integer _caseMarkId;

    /** (事件番号連番)CASE_NUMBER_SERIAL_NUMBER: {NotNull, INT UNSIGNED(10)} */
    protected Integer _caseNumberSerialNumber;

    /** (裁判所ID)COURT_ID: {IX, NotNull, INT UNSIGNED(10), FK to COURT} */
    protected Integer _courtId;

    /** (法廷種別コード)BENCH_CODE: {IX, VARCHAR(10), FK to CLS_BENCH, classification=Bench} */
    protected String _benchCode;

    /** (判決結果コード)JUDGEMENT_RESULT_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_RESULT, classification=JudgementResult} */
    protected String _judgementResultCode;

    /** (判決種別コード)JUDGEMENT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_TYPE, classification=JudgementType} */
    protected String _judgementTypeCode;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "JUDGEMENT";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_judgementId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param judgementPublicCode (判決公開コード): UQ, NotNull, VARCHAR(20). (NotNull)
     */
    public void uniqueBy(String judgementPublicCode) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("judgementPublicCode");
        setJudgementPublicCode(judgementPublicCode);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of caseNumberEraCode as the classification of Era. <br>
     * (元号コード)CASE_NUMBER_ERA_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_ERA, classification=Era} <br>
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Era getCaseNumberEraCodeAsEra() {
        return CDef.Era.codeOf(getCaseNumberEraCode());
    }

    /**
     * Set the value of caseNumberEraCode as the classification of Era. <br>
     * (元号コード)CASE_NUMBER_ERA_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_ERA, classification=Era} <br>
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setCaseNumberEraCodeAsEra(CDef.Era cdef) {
        setCaseNumberEraCode(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of benchCode as the classification of Bench. <br>
     * (法廷種別コード)BENCH_CODE: {IX, VARCHAR(10), FK to CLS_BENCH, classification=Bench} <br>
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Bench getBenchCodeAsBench() {
        return CDef.Bench.codeOf(getBenchCode());
    }

    /**
     * Set the value of benchCode as the classification of Bench. <br>
     * (法廷種別コード)BENCH_CODE: {IX, VARCHAR(10), FK to CLS_BENCH, classification=Bench} <br>
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setBenchCodeAsBench(CDef.Bench cdef) {
        setBenchCode(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of judgementResultCode as the classification of JudgementResult. <br>
     * (判決結果コード)JUDGEMENT_RESULT_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_RESULT, classification=JudgementResult} <br>
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.JudgementResult getJudgementResultCodeAsJudgementResult() {
        return CDef.JudgementResult.codeOf(getJudgementResultCode());
    }

    /**
     * Set the value of judgementResultCode as the classification of JudgementResult. <br>
     * (判決結果コード)JUDGEMENT_RESULT_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_RESULT, classification=JudgementResult} <br>
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setJudgementResultCodeAsJudgementResult(CDef.JudgementResult cdef) {
        setJudgementResultCode(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of judgementTypeCode as the classification of JudgementType. <br>
     * (判決種別コード)JUDGEMENT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_TYPE, classification=JudgementType} <br>
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.JudgementType getJudgementTypeCodeAsJudgementType() {
        return CDef.JudgementType.codeOf(getJudgementTypeCode());
    }

    /**
     * Set the value of judgementTypeCode as the classification of JudgementType. <br>
     * (判決種別コード)JUDGEMENT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_TYPE, classification=JudgementType} <br>
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setJudgementTypeCodeAsJudgementType(CDef.JudgementType cdef) {
        setJudgementTypeCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of caseNumberEraCode as 明治 (MEIJI). <br>
     * 明治: 明治時代
     */
    public void setCaseNumberEraCode_明治() {
        setCaseNumberEraCodeAsEra(CDef.Era.明治);
    }

    /**
     * Set the value of caseNumberEraCode as 大正 (TAISHO). <br>
     * 大正: 大正時代
     */
    public void setCaseNumberEraCode_大正() {
        setCaseNumberEraCodeAsEra(CDef.Era.大正);
    }

    /**
     * Set the value of caseNumberEraCode as 昭和 (SHOWA). <br>
     * 昭和: 昭和時代
     */
    public void setCaseNumberEraCode_昭和() {
        setCaseNumberEraCodeAsEra(CDef.Era.昭和);
    }

    /**
     * Set the value of caseNumberEraCode as 平成 (HEISEI). <br>
     * 平成: 平成時代
     */
    public void setCaseNumberEraCode_平成() {
        setCaseNumberEraCodeAsEra(CDef.Era.平成);
    }

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

    /**
     * Set the value of judgementTypeCode as 判決 (JUDGEMENT). <br>
     * 判決: 判決
     */
    public void setJudgementTypeCode_判決() {
        setJudgementTypeCodeAsJudgementType(CDef.JudgementType.判決);
    }

    /**
     * Set the value of judgementTypeCode as 決定 (DECISION). <br>
     * 決定: 決定
     */
    public void setJudgementTypeCode_決定() {
        setJudgementTypeCodeAsJudgementType(CDef.JudgementType.決定);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of caseNumberEraCode 明治? <br>
     * 明治: 明治時代
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCaseNumberEraCode明治() {
        CDef.Era cdef = getCaseNumberEraCodeAsEra();
        return cdef != null ? cdef.equals(CDef.Era.明治) : false;
    }

    /**
     * Is the value of caseNumberEraCode 大正? <br>
     * 大正: 大正時代
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCaseNumberEraCode大正() {
        CDef.Era cdef = getCaseNumberEraCodeAsEra();
        return cdef != null ? cdef.equals(CDef.Era.大正) : false;
    }

    /**
     * Is the value of caseNumberEraCode 昭和? <br>
     * 昭和: 昭和時代
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCaseNumberEraCode昭和() {
        CDef.Era cdef = getCaseNumberEraCodeAsEra();
        return cdef != null ? cdef.equals(CDef.Era.昭和) : false;
    }

    /**
     * Is the value of caseNumberEraCode 平成? <br>
     * 平成: 平成時代
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCaseNumberEraCode平成() {
        CDef.Era cdef = getCaseNumberEraCodeAsEra();
        return cdef != null ? cdef.equals(CDef.Era.平成) : false;
    }

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

    /**
     * Is the value of judgementTypeCode 判決? <br>
     * 判決: 判決
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isJudgementTypeCode判決() {
        CDef.JudgementType cdef = getJudgementTypeCodeAsJudgementType();
        return cdef != null ? cdef.equals(CDef.JudgementType.判決) : false;
    }

    /**
     * Is the value of judgementTypeCode 決定? <br>
     * 決定: 決定
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isJudgementTypeCode決定() {
        CDef.JudgementType cdef = getJudgementTypeCodeAsJudgementType();
        return cdef != null ? cdef.equals(CDef.JudgementType.決定) : false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** ([区分値]法廷種別)CLS_BENCH by my BENCH_CODE, named 'clsBench'. */
    protected OptionalEntity<ClsBench> _clsBench;

    /**
     * [get] ([区分値]法廷種別)CLS_BENCH by my BENCH_CODE, named 'clsBench'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'clsBench'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<ClsBench> getClsBench() {
        if (_clsBench == null) { _clsBench = OptionalEntity.relationEmpty(this, "clsBench"); }
        return _clsBench;
    }

    /**
     * [set] ([区分値]法廷種別)CLS_BENCH by my BENCH_CODE, named 'clsBench'.
     * @param clsBench The entity of foreign property 'clsBench'. (NullAllowed)
     */
    public void setClsBench(OptionalEntity<ClsBench> clsBench) {
        _clsBench = clsBench;
    }

    /** (事件符号)CASE_MARK by my CASE_MARK_ID, named 'caseMark'. */
    protected OptionalEntity<CaseMark> _caseMark;

    /**
     * [get] (事件符号)CASE_MARK by my CASE_MARK_ID, named 'caseMark'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'caseMark'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<CaseMark> getCaseMark() {
        if (_caseMark == null) { _caseMark = OptionalEntity.relationEmpty(this, "caseMark"); }
        return _caseMark;
    }

    /**
     * [set] (事件符号)CASE_MARK by my CASE_MARK_ID, named 'caseMark'.
     * @param caseMark The entity of foreign property 'caseMark'. (NullAllowed)
     */
    public void setCaseMark(OptionalEntity<CaseMark> caseMark) {
        _caseMark = caseMark;
    }

    /** ([区分値]元号)CLS_ERA by my CASE_NUMBER_ERA_CODE, named 'clsEra'. */
    protected OptionalEntity<ClsEra> _clsEra;

    /**
     * [get] ([区分値]元号)CLS_ERA by my CASE_NUMBER_ERA_CODE, named 'clsEra'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'clsEra'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<ClsEra> getClsEra() {
        if (_clsEra == null) { _clsEra = OptionalEntity.relationEmpty(this, "clsEra"); }
        return _clsEra;
    }

    /**
     * [set] ([区分値]元号)CLS_ERA by my CASE_NUMBER_ERA_CODE, named 'clsEra'.
     * @param clsEra The entity of foreign property 'clsEra'. (NullAllowed)
     */
    public void setClsEra(OptionalEntity<ClsEra> clsEra) {
        _clsEra = clsEra;
    }

    /** (裁判所)COURT by my COURT_ID, named 'court'. */
    protected OptionalEntity<Court> _court;

    /**
     * [get] (裁判所)COURT by my COURT_ID, named 'court'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'court'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Court> getCourt() {
        if (_court == null) { _court = OptionalEntity.relationEmpty(this, "court"); }
        return _court;
    }

    /**
     * [set] (裁判所)COURT by my COURT_ID, named 'court'.
     * @param court The entity of foreign property 'court'. (NullAllowed)
     */
    public void setCourt(OptionalEntity<Court> court) {
        _court = court;
    }

    /** ([区分値]判決結果)CLS_JUDGEMENT_RESULT by my JUDGEMENT_RESULT_CODE, named 'clsJudgementResult'. */
    protected OptionalEntity<ClsJudgementResult> _clsJudgementResult;

    /**
     * [get] ([区分値]判決結果)CLS_JUDGEMENT_RESULT by my JUDGEMENT_RESULT_CODE, named 'clsJudgementResult'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'clsJudgementResult'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<ClsJudgementResult> getClsJudgementResult() {
        if (_clsJudgementResult == null) { _clsJudgementResult = OptionalEntity.relationEmpty(this, "clsJudgementResult"); }
        return _clsJudgementResult;
    }

    /**
     * [set] ([区分値]判決結果)CLS_JUDGEMENT_RESULT by my JUDGEMENT_RESULT_CODE, named 'clsJudgementResult'.
     * @param clsJudgementResult The entity of foreign property 'clsJudgementResult'. (NullAllowed)
     */
    public void setClsJudgementResult(OptionalEntity<ClsJudgementResult> clsJudgementResult) {
        _clsJudgementResult = clsJudgementResult;
    }

    /** ([区分値]判決種別)CLS_JUDGEMENT_TYPE by my JUDGEMENT_TYPE_CODE, named 'clsJudgementType'. */
    protected OptionalEntity<ClsJudgementType> _clsJudgementType;

    /**
     * [get] ([区分値]判決種別)CLS_JUDGEMENT_TYPE by my JUDGEMENT_TYPE_CODE, named 'clsJudgementType'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'clsJudgementType'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<ClsJudgementType> getClsJudgementType() {
        if (_clsJudgementType == null) { _clsJudgementType = OptionalEntity.relationEmpty(this, "clsJudgementType"); }
        return _clsJudgementType;
    }

    /**
     * [set] ([区分値]判決種別)CLS_JUDGEMENT_TYPE by my JUDGEMENT_TYPE_CODE, named 'clsJudgementType'.
     * @param clsJudgementType The entity of foreign property 'clsJudgementType'. (NullAllowed)
     */
    public void setClsJudgementType(OptionalEntity<ClsJudgementType> clsJudgementType) {
        _clsJudgementType = clsJudgementType;
    }

    /** (判決)JUDGEMENT by my ORIGINAL_JUDGEMENT_ID, named 'judgementSelf'. */
    protected OptionalEntity<Judgement> _judgementSelf;

    /**
     * [get] (判決)JUDGEMENT by my ORIGINAL_JUDGEMENT_ID, named 'judgementSelf'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'judgementSelf'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Judgement> getJudgementSelf() {
        if (_judgementSelf == null) { _judgementSelf = OptionalEntity.relationEmpty(this, "judgementSelf"); }
        return _judgementSelf;
    }

    /**
     * [set] (判決)JUDGEMENT by my ORIGINAL_JUDGEMENT_ID, named 'judgementSelf'.
     * @param judgementSelf The entity of foreign property 'judgementSelf'. (NullAllowed)
     */
    public void setJudgementSelf(OptionalEntity<Judgement> judgementSelf) {
        _judgementSelf = judgementSelf;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (判決)JUDGEMENT by ORIGINAL_JUDGEMENT_ID, named 'judgementSelfList'. */
    protected List<Judgement> _judgementSelfList;

    /**
     * [get] (判決)JUDGEMENT by ORIGINAL_JUDGEMENT_ID, named 'judgementSelfList'.
     * @return The entity list of referrer property 'judgementSelfList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Judgement> getJudgementSelfList() {
        if (_judgementSelfList == null) { _judgementSelfList = newReferrerList(); }
        return _judgementSelfList;
    }

    /**
     * [set] (判決)JUDGEMENT by ORIGINAL_JUDGEMENT_ID, named 'judgementSelfList'.
     * @param judgementSelfList The entity list of referrer property 'judgementSelfList'. (NullAllowed)
     */
    public void setJudgementSelfList(List<Judgement> judgementSelfList) {
        _judgementSelfList = judgementSelfList;
    }

    /** (判決取得元リレーション)JUDGEMENT_SOURCE_REL by JUDGEMENT_ID, named 'judgementSourceRelList'. */
    protected List<JudgementSourceRel> _judgementSourceRelList;

    /**
     * [get] (判決取得元リレーション)JUDGEMENT_SOURCE_REL by JUDGEMENT_ID, named 'judgementSourceRelList'.
     * @return The entity list of referrer property 'judgementSourceRelList'. (NotNull: even if no loading, returns empty list)
     */
    public List<JudgementSourceRel> getJudgementSourceRelList() {
        if (_judgementSourceRelList == null) { _judgementSourceRelList = newReferrerList(); }
        return _judgementSourceRelList;
    }

    /**
     * [set] (判決取得元リレーション)JUDGEMENT_SOURCE_REL by JUDGEMENT_ID, named 'judgementSourceRelList'.
     * @param judgementSourceRelList The entity list of referrer property 'judgementSourceRelList'. (NullAllowed)
     */
    public void setJudgementSourceRelList(List<JudgementSourceRel> judgementSourceRelList) {
        _judgementSourceRelList = judgementSourceRelList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsJudgement) {
            BsJudgement other = (BsJudgement)obj;
            if (!xSV(_judgementId, other._judgementId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _judgementId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_clsBench != null && _clsBench.isPresent())
        { sb.append(li).append(xbRDS(_clsBench, "clsBench")); }
        if (_caseMark != null && _caseMark.isPresent())
        { sb.append(li).append(xbRDS(_caseMark, "caseMark")); }
        if (_clsEra != null && _clsEra.isPresent())
        { sb.append(li).append(xbRDS(_clsEra, "clsEra")); }
        if (_court != null && _court.isPresent())
        { sb.append(li).append(xbRDS(_court, "court")); }
        if (_clsJudgementResult != null && _clsJudgementResult.isPresent())
        { sb.append(li).append(xbRDS(_clsJudgementResult, "clsJudgementResult")); }
        if (_clsJudgementType != null && _clsJudgementType.isPresent())
        { sb.append(li).append(xbRDS(_clsJudgementType, "clsJudgementType")); }
        if (_judgementSelf != null && _judgementSelf.isPresent())
        { sb.append(li).append(xbRDS(_judgementSelf, "judgementSelf")); }
        if (_judgementSelfList != null) { for (Judgement et : _judgementSelfList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "judgementSelfList")); } } }
        if (_judgementSourceRelList != null) { for (JudgementSourceRel et : _judgementSourceRelList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "judgementSourceRelList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_judgementId));
        sb.append(dm).append(xfND(_judgementPublicCode));
        sb.append(dm).append(xfND(_caseName));
        sb.append(dm).append(xfND(_precedentReportsKan));
        sb.append(dm).append(xfND(_precedentReportsGo));
        sb.append(dm).append(xfND(_precedentReportsKo));
        sb.append(dm).append(xfND(_judgementReportsGo));
        sb.append(dm).append(xfND(_judgementReportsKo));
        sb.append(dm).append(xfND(_judgementDate));
        sb.append(dm).append(xfND(_originalJudgementId));
        sb.append(dm).append(xfND(_caseNumberEraCode));
        sb.append(dm).append(xfND(_caseNumberYear));
        sb.append(dm).append(xfND(_caseMarkId));
        sb.append(dm).append(xfND(_caseNumberSerialNumber));
        sb.append(dm).append(xfND(_courtId));
        sb.append(dm).append(xfND(_benchCode));
        sb.append(dm).append(xfND(_judgementResultCode));
        sb.append(dm).append(xfND(_judgementTypeCode));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_clsBench != null && _clsBench.isPresent())
        { sb.append(dm).append("clsBench"); }
        if (_caseMark != null && _caseMark.isPresent())
        { sb.append(dm).append("caseMark"); }
        if (_clsEra != null && _clsEra.isPresent())
        { sb.append(dm).append("clsEra"); }
        if (_court != null && _court.isPresent())
        { sb.append(dm).append("court"); }
        if (_clsJudgementResult != null && _clsJudgementResult.isPresent())
        { sb.append(dm).append("clsJudgementResult"); }
        if (_clsJudgementType != null && _clsJudgementType.isPresent())
        { sb.append(dm).append("clsJudgementType"); }
        if (_judgementSelf != null && _judgementSelf.isPresent())
        { sb.append(dm).append("judgementSelf"); }
        if (_judgementSelfList != null && !_judgementSelfList.isEmpty())
        { sb.append(dm).append("judgementSelfList"); }
        if (_judgementSourceRelList != null && !_judgementSourceRelList.isEmpty())
        { sb.append(dm).append("judgementSourceRelList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Judgement clone() {
        return (Judgement)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (判決ID)JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)} <br>
     * @return The value of the column 'JUDGEMENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getJudgementId() {
        checkSpecifiedProperty("judgementId");
        return _judgementId;
    }

    /**
     * [set] (判決ID)JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)} <br>
     * @param judgementId The value of the column 'JUDGEMENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setJudgementId(Long judgementId) {
        registerModifiedProperty("judgementId");
        _judgementId = judgementId;
    }

    /**
     * [get] (判決公開コード)JUDGEMENT_PUBLIC_CODE: {UQ, NotNull, VARCHAR(20)} <br>
     * @return The value of the column 'JUDGEMENT_PUBLIC_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getJudgementPublicCode() {
        checkSpecifiedProperty("judgementPublicCode");
        return convertEmptyToNull(_judgementPublicCode);
    }

    /**
     * [set] (判決公開コード)JUDGEMENT_PUBLIC_CODE: {UQ, NotNull, VARCHAR(20)} <br>
     * @param judgementPublicCode The value of the column 'JUDGEMENT_PUBLIC_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setJudgementPublicCode(String judgementPublicCode) {
        registerModifiedProperty("judgementPublicCode");
        _judgementPublicCode = judgementPublicCode;
    }

    /**
     * [get] (事件名)CASE_NAME: {TEXT(65535)} <br>
     * @return The value of the column 'CASE_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseName() {
        checkSpecifiedProperty("caseName");
        return convertEmptyToNull(_caseName);
    }

    /**
     * [set] (事件名)CASE_NAME: {TEXT(65535)} <br>
     * @param caseName The value of the column 'CASE_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseName(String caseName) {
        registerModifiedProperty("caseName");
        _caseName = caseName;
    }

    /**
     * [get] (判例集巻)PRECEDENT_REPORTS_KAN: {INT UNSIGNED(10)} <br>
     * @return The value of the column 'PRECEDENT_REPORTS_KAN'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getPrecedentReportsKan() {
        checkSpecifiedProperty("precedentReportsKan");
        return _precedentReportsKan;
    }

    /**
     * [set] (判例集巻)PRECEDENT_REPORTS_KAN: {INT UNSIGNED(10)} <br>
     * @param precedentReportsKan The value of the column 'PRECEDENT_REPORTS_KAN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrecedentReportsKan(Integer precedentReportsKan) {
        registerModifiedProperty("precedentReportsKan");
        _precedentReportsKan = precedentReportsKan;
    }

    /**
     * [get] (判例集号)PRECEDENT_REPORTS_GO: {INT UNSIGNED(10)} <br>
     * @return The value of the column 'PRECEDENT_REPORTS_GO'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getPrecedentReportsGo() {
        checkSpecifiedProperty("precedentReportsGo");
        return _precedentReportsGo;
    }

    /**
     * [set] (判例集号)PRECEDENT_REPORTS_GO: {INT UNSIGNED(10)} <br>
     * @param precedentReportsGo The value of the column 'PRECEDENT_REPORTS_GO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrecedentReportsGo(Integer precedentReportsGo) {
        registerModifiedProperty("precedentReportsGo");
        _precedentReportsGo = precedentReportsGo;
    }

    /**
     * [get] (判例集頁)PRECEDENT_REPORTS_KO: {INT UNSIGNED(10)} <br>
     * @return The value of the column 'PRECEDENT_REPORTS_KO'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getPrecedentReportsKo() {
        checkSpecifiedProperty("precedentReportsKo");
        return _precedentReportsKo;
    }

    /**
     * [set] (判例集頁)PRECEDENT_REPORTS_KO: {INT UNSIGNED(10)} <br>
     * @param precedentReportsKo The value of the column 'PRECEDENT_REPORTS_KO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrecedentReportsKo(Integer precedentReportsKo) {
        registerModifiedProperty("precedentReportsKo");
        _precedentReportsKo = precedentReportsKo;
    }

    /**
     * [get] (裁判集号)JUDGEMENT_REPORTS_GO: {INT UNSIGNED(10)} <br>
     * @return The value of the column 'JUDGEMENT_REPORTS_GO'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getJudgementReportsGo() {
        checkSpecifiedProperty("judgementReportsGo");
        return _judgementReportsGo;
    }

    /**
     * [set] (裁判集号)JUDGEMENT_REPORTS_GO: {INT UNSIGNED(10)} <br>
     * @param judgementReportsGo The value of the column 'JUDGEMENT_REPORTS_GO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJudgementReportsGo(Integer judgementReportsGo) {
        registerModifiedProperty("judgementReportsGo");
        _judgementReportsGo = judgementReportsGo;
    }

    /**
     * [get] (裁判集頁)JUDGEMENT_REPORTS_KO: {INT UNSIGNED(10)} <br>
     * @return The value of the column 'JUDGEMENT_REPORTS_KO'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getJudgementReportsKo() {
        checkSpecifiedProperty("judgementReportsKo");
        return _judgementReportsKo;
    }

    /**
     * [set] (裁判集頁)JUDGEMENT_REPORTS_KO: {INT UNSIGNED(10)} <br>
     * @param judgementReportsKo The value of the column 'JUDGEMENT_REPORTS_KO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJudgementReportsKo(Integer judgementReportsKo) {
        registerModifiedProperty("judgementReportsKo");
        _judgementReportsKo = judgementReportsKo;
    }

    /**
     * [get] (裁判年月日)JUDGEMENT_DATE: {DATE(10)} <br>
     * @return The value of the column 'JUDGEMENT_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getJudgementDate() {
        checkSpecifiedProperty("judgementDate");
        return _judgementDate;
    }

    /**
     * [set] (裁判年月日)JUDGEMENT_DATE: {DATE(10)} <br>
     * @param judgementDate The value of the column 'JUDGEMENT_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJudgementDate(java.time.LocalDate judgementDate) {
        registerModifiedProperty("judgementDate");
        _judgementDate = judgementDate;
    }

    /**
     * [get] (原審判決ID)ORIGINAL_JUDGEMENT_ID: {IX, BIGINT UNSIGNED(20), FK to JUDGEMENT} <br>
     * @return The value of the column 'ORIGINAL_JUDGEMENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOriginalJudgementId() {
        checkSpecifiedProperty("originalJudgementId");
        return _originalJudgementId;
    }

    /**
     * [set] (原審判決ID)ORIGINAL_JUDGEMENT_ID: {IX, BIGINT UNSIGNED(20), FK to JUDGEMENT} <br>
     * @param originalJudgementId The value of the column 'ORIGINAL_JUDGEMENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOriginalJudgementId(Long originalJudgementId) {
        registerModifiedProperty("originalJudgementId");
        _originalJudgementId = originalJudgementId;
    }

    /**
     * [get] (元号コード)CASE_NUMBER_ERA_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_ERA, classification=Era} <br>
     * @return The value of the column 'CASE_NUMBER_ERA_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getCaseNumberEraCode() {
        checkSpecifiedProperty("caseNumberEraCode");
        return convertEmptyToNull(_caseNumberEraCode);
    }

    /**
     * [set] (元号コード)CASE_NUMBER_ERA_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_ERA, classification=Era} <br>
     * @param caseNumberEraCode The value of the column 'CASE_NUMBER_ERA_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setCaseNumberEraCode(String caseNumberEraCode) {
        registerModifiedProperty("caseNumberEraCode");
        _caseNumberEraCode = caseNumberEraCode;
    }

    /**
     * [get] (事件番号年)CASE_NUMBER_YEAR: {NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'CASE_NUMBER_YEAR'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCaseNumberYear() {
        checkSpecifiedProperty("caseNumberYear");
        return _caseNumberYear;
    }

    /**
     * [set] (事件番号年)CASE_NUMBER_YEAR: {NotNull, INT UNSIGNED(10)} <br>
     * @param caseNumberYear The value of the column 'CASE_NUMBER_YEAR'. (basically NotNull if update: for the constraint)
     */
    public void setCaseNumberYear(Integer caseNumberYear) {
        registerModifiedProperty("caseNumberYear");
        _caseNumberYear = caseNumberYear;
    }

    /**
     * [get] (事件符号ID)CASE_MARK_ID: {IX, NotNull, INT UNSIGNED(10), FK to CASE_MARK} <br>
     * @return The value of the column 'CASE_MARK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCaseMarkId() {
        checkSpecifiedProperty("caseMarkId");
        return _caseMarkId;
    }

    /**
     * [set] (事件符号ID)CASE_MARK_ID: {IX, NotNull, INT UNSIGNED(10), FK to CASE_MARK} <br>
     * @param caseMarkId The value of the column 'CASE_MARK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCaseMarkId(Integer caseMarkId) {
        registerModifiedProperty("caseMarkId");
        _caseMarkId = caseMarkId;
    }

    /**
     * [get] (事件番号連番)CASE_NUMBER_SERIAL_NUMBER: {NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'CASE_NUMBER_SERIAL_NUMBER'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCaseNumberSerialNumber() {
        checkSpecifiedProperty("caseNumberSerialNumber");
        return _caseNumberSerialNumber;
    }

    /**
     * [set] (事件番号連番)CASE_NUMBER_SERIAL_NUMBER: {NotNull, INT UNSIGNED(10)} <br>
     * @param caseNumberSerialNumber The value of the column 'CASE_NUMBER_SERIAL_NUMBER'. (basically NotNull if update: for the constraint)
     */
    public void setCaseNumberSerialNumber(Integer caseNumberSerialNumber) {
        registerModifiedProperty("caseNumberSerialNumber");
        _caseNumberSerialNumber = caseNumberSerialNumber;
    }

    /**
     * [get] (裁判所ID)COURT_ID: {IX, NotNull, INT UNSIGNED(10), FK to COURT} <br>
     * @return The value of the column 'COURT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCourtId() {
        checkSpecifiedProperty("courtId");
        return _courtId;
    }

    /**
     * [set] (裁判所ID)COURT_ID: {IX, NotNull, INT UNSIGNED(10), FK to COURT} <br>
     * @param courtId The value of the column 'COURT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCourtId(Integer courtId) {
        registerModifiedProperty("courtId");
        _courtId = courtId;
    }

    /**
     * [get] (法廷種別コード)BENCH_CODE: {IX, VARCHAR(10), FK to CLS_BENCH, classification=Bench} <br>
     * @return The value of the column 'BENCH_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getBenchCode() {
        checkSpecifiedProperty("benchCode");
        return convertEmptyToNull(_benchCode);
    }

    /**
     * [set] (法廷種別コード)BENCH_CODE: {IX, VARCHAR(10), FK to CLS_BENCH, classification=Bench} <br>
     * @param benchCode The value of the column 'BENCH_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBenchCode(String benchCode) {
        registerModifiedProperty("benchCode");
        _benchCode = benchCode;
    }

    /**
     * [get] (判決結果コード)JUDGEMENT_RESULT_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_RESULT, classification=JudgementResult} <br>
     * @return The value of the column 'JUDGEMENT_RESULT_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getJudgementResultCode() {
        checkSpecifiedProperty("judgementResultCode");
        return convertEmptyToNull(_judgementResultCode);
    }

    /**
     * [set] (判決結果コード)JUDGEMENT_RESULT_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_RESULT, classification=JudgementResult} <br>
     * @param judgementResultCode The value of the column 'JUDGEMENT_RESULT_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJudgementResultCode(String judgementResultCode) {
        registerModifiedProperty("judgementResultCode");
        _judgementResultCode = judgementResultCode;
    }

    /**
     * [get] (判決種別コード)JUDGEMENT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_TYPE, classification=JudgementType} <br>
     * @return The value of the column 'JUDGEMENT_TYPE_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getJudgementTypeCode() {
        checkSpecifiedProperty("judgementTypeCode");
        return convertEmptyToNull(_judgementTypeCode);
    }

    /**
     * [set] (判決種別コード)JUDGEMENT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_TYPE, classification=JudgementType} <br>
     * @param judgementTypeCode The value of the column 'JUDGEMENT_TYPE_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJudgementTypeCode(String judgementTypeCode) {
        registerModifiedProperty("judgementTypeCode");
        _judgementTypeCode = judgementTypeCode;
    }
}
