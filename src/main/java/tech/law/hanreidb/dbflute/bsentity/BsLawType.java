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
import tech.law.hanreidb.dbflute.allcommon.DBMetaInstanceHandler;
import tech.law.hanreidb.dbflute.exentity.*;

/**
 * The entity of (法令種別)LAW_TYPE as TABLE. <br>
 * e.g. 法律, 政令
 * <pre>
 * [primary-key]
 *     LAW_TYPE_CODE
 *
 * [column]
 *     LAW_TYPE_CODE, LAW_TYPE_NAME, LAW_TYPE_ALIAS, DESCRIPTION, DISPLAY_ORDER
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     LAW
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     lawList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String lawTypeCode = entity.getLawTypeCode();
 * String lawTypeName = entity.getLawTypeName();
 * String lawTypeAlias = entity.getLawTypeAlias();
 * String description = entity.getDescription();
 * Integer displayOrder = entity.getDisplayOrder();
 * entity.setLawTypeCode(lawTypeCode);
 * entity.setLawTypeName(lawTypeName);
 * entity.setLawTypeAlias(lawTypeAlias);
 * entity.setDescription(description);
 * entity.setDisplayOrder(displayOrder);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsLawType extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (法令種別コード)LAW_TYPE_CODE: {PK, NotNull, VARCHAR(20)} */
    protected String _lawTypeCode;

    /** (法令種別)LAW_TYPE_NAME: {UQ, NotNull, VARCHAR(20)} */
    protected String _lawTypeName;

    /** (法令種別別名)LAW_TYPE_ALIAS: {UQ, NotNull, VARCHAR(20)} */
    protected String _lawTypeAlias;

    /** (説明)DESCRIPTION: {NotNull, TEXT(65535)} */
    protected String _description;

    /** (順番)DISPLAY_ORDER: {UQ, NotNull, INT UNSIGNED(10)} */
    protected Integer _displayOrder;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "LAW_TYPE";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_lawTypeCode == null) { return false; }
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
     * @param lawTypeAlias (法令種別別名): UQ, NotNull, VARCHAR(20). (NotNull)
     */
    public void uniqueByLawTypeAlias(String lawTypeAlias) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("lawTypeAlias");
        setLawTypeAlias(lawTypeAlias);
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param lawTypeName (法令種別): UQ, NotNull, VARCHAR(20). (NotNull)
     */
    public void uniqueByLawTypeName(String lawTypeName) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("lawTypeName");
        setLawTypeName(lawTypeName);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (法令)LAW by LAW_TYPE_CODE, named 'lawList'. */
    protected List<Law> _lawList;

    /**
     * [get] (法令)LAW by LAW_TYPE_CODE, named 'lawList'.
     * @return The entity list of referrer property 'lawList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Law> getLawList() {
        if (_lawList == null) { _lawList = newReferrerList(); }
        return _lawList;
    }

    /**
     * [set] (法令)LAW by LAW_TYPE_CODE, named 'lawList'.
     * @param lawList The entity list of referrer property 'lawList'. (NullAllowed)
     */
    public void setLawList(List<Law> lawList) {
        _lawList = lawList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsLawType) {
            BsLawType other = (BsLawType)obj;
            if (!xSV(_lawTypeCode, other._lawTypeCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _lawTypeCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_lawList != null) { for (Law et : _lawList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "lawList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_lawTypeCode));
        sb.append(dm).append(xfND(_lawTypeName));
        sb.append(dm).append(xfND(_lawTypeAlias));
        sb.append(dm).append(xfND(_description));
        sb.append(dm).append(xfND(_displayOrder));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_lawList != null && !_lawList.isEmpty())
        { sb.append(dm).append("lawList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public LawType clone() {
        return (LawType)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (法令種別コード)LAW_TYPE_CODE: {PK, NotNull, VARCHAR(20)} <br>
     * @return The value of the column 'LAW_TYPE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getLawTypeCode() {
        checkSpecifiedProperty("lawTypeCode");
        return convertEmptyToNull(_lawTypeCode);
    }

    /**
     * [set] (法令種別コード)LAW_TYPE_CODE: {PK, NotNull, VARCHAR(20)} <br>
     * @param lawTypeCode The value of the column 'LAW_TYPE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setLawTypeCode(String lawTypeCode) {
        registerModifiedProperty("lawTypeCode");
        _lawTypeCode = lawTypeCode;
    }

    /**
     * [get] (法令種別)LAW_TYPE_NAME: {UQ, NotNull, VARCHAR(20)} <br>
     * @return The value of the column 'LAW_TYPE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getLawTypeName() {
        checkSpecifiedProperty("lawTypeName");
        return convertEmptyToNull(_lawTypeName);
    }

    /**
     * [set] (法令種別)LAW_TYPE_NAME: {UQ, NotNull, VARCHAR(20)} <br>
     * @param lawTypeName The value of the column 'LAW_TYPE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setLawTypeName(String lawTypeName) {
        registerModifiedProperty("lawTypeName");
        _lawTypeName = lawTypeName;
    }

    /**
     * [get] (法令種別別名)LAW_TYPE_ALIAS: {UQ, NotNull, VARCHAR(20)} <br>
     * @return The value of the column 'LAW_TYPE_ALIAS'. (basically NotNull if selected: for the constraint)
     */
    public String getLawTypeAlias() {
        checkSpecifiedProperty("lawTypeAlias");
        return convertEmptyToNull(_lawTypeAlias);
    }

    /**
     * [set] (法令種別別名)LAW_TYPE_ALIAS: {UQ, NotNull, VARCHAR(20)} <br>
     * @param lawTypeAlias The value of the column 'LAW_TYPE_ALIAS'. (basically NotNull if update: for the constraint)
     */
    public void setLawTypeAlias(String lawTypeAlias) {
        registerModifiedProperty("lawTypeAlias");
        _lawTypeAlias = lawTypeAlias;
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
}
