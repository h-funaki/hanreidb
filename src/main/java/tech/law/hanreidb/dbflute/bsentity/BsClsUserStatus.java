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
 * The entity of ([区分値]ユーザーステータス)CLS_USER_STATUS as TABLE. <br>
 * <pre>
 * [primary-key]
 *     USER_STATUS_CODE
 *
 * [column]
 *     USER_STATUS_CODE, USER_STATUS_NAME, USER_STATUS_ALIAS
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
 *     USER
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     userList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String userStatusCode = entity.getUserStatusCode();
 * String userStatusName = entity.getUserStatusName();
 * String userStatusAlias = entity.getUserStatusAlias();
 * entity.setUserStatusCode(userStatusCode);
 * entity.setUserStatusName(userStatusName);
 * entity.setUserStatusAlias(userStatusAlias);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsClsUserStatus extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (ユーザーステータスコード)USER_STATUS_CODE: {PK, NotNull, VARCHAR(10)} */
    protected String _userStatusCode;

    /** (ユーザーステータス名)USER_STATUS_NAME: {NotNull, VARCHAR(10)} */
    protected String _userStatusName;

    /** (ユーザーステータス別名)USER_STATUS_ALIAS: {NotNull, VARCHAR(10)} */
    protected String _userStatusAlias;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "CLS_USER_STATUS";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_userStatusCode == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (ユーザー)USER by USER_STATUS_CODE, named 'userList'. */
    protected List<User> _userList;

    /**
     * [get] (ユーザー)USER by USER_STATUS_CODE, named 'userList'.
     * @return The entity list of referrer property 'userList'. (NotNull: even if no loading, returns empty list)
     */
    public List<User> getUserList() {
        if (_userList == null) { _userList = newReferrerList(); }
        return _userList;
    }

    /**
     * [set] (ユーザー)USER by USER_STATUS_CODE, named 'userList'.
     * @param userList The entity list of referrer property 'userList'. (NullAllowed)
     */
    public void setUserList(List<User> userList) {
        _userList = userList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsClsUserStatus) {
            BsClsUserStatus other = (BsClsUserStatus)obj;
            if (!xSV(_userStatusCode, other._userStatusCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _userStatusCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_userList != null) { for (User et : _userList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "userList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_userStatusCode));
        sb.append(dm).append(xfND(_userStatusName));
        sb.append(dm).append(xfND(_userStatusAlias));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_userList != null && !_userList.isEmpty())
        { sb.append(dm).append("userList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public ClsUserStatus clone() {
        return (ClsUserStatus)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (ユーザーステータスコード)USER_STATUS_CODE: {PK, NotNull, VARCHAR(10)} <br>
     * @return The value of the column 'USER_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getUserStatusCode() {
        checkSpecifiedProperty("userStatusCode");
        return convertEmptyToNull(_userStatusCode);
    }

    /**
     * [set] (ユーザーステータスコード)USER_STATUS_CODE: {PK, NotNull, VARCHAR(10)} <br>
     * @param userStatusCode The value of the column 'USER_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setUserStatusCode(String userStatusCode) {
        registerModifiedProperty("userStatusCode");
        _userStatusCode = userStatusCode;
    }

    /**
     * [get] (ユーザーステータス名)USER_STATUS_NAME: {NotNull, VARCHAR(10)} <br>
     * @return The value of the column 'USER_STATUS_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getUserStatusName() {
        checkSpecifiedProperty("userStatusName");
        return convertEmptyToNull(_userStatusName);
    }

    /**
     * [set] (ユーザーステータス名)USER_STATUS_NAME: {NotNull, VARCHAR(10)} <br>
     * @param userStatusName The value of the column 'USER_STATUS_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setUserStatusName(String userStatusName) {
        registerModifiedProperty("userStatusName");
        _userStatusName = userStatusName;
    }

    /**
     * [get] (ユーザーステータス別名)USER_STATUS_ALIAS: {NotNull, VARCHAR(10)} <br>
     * @return The value of the column 'USER_STATUS_ALIAS'. (basically NotNull if selected: for the constraint)
     */
    public String getUserStatusAlias() {
        checkSpecifiedProperty("userStatusAlias");
        return convertEmptyToNull(_userStatusAlias);
    }

    /**
     * [set] (ユーザーステータス別名)USER_STATUS_ALIAS: {NotNull, VARCHAR(10)} <br>
     * @param userStatusAlias The value of the column 'USER_STATUS_ALIAS'. (basically NotNull if update: for the constraint)
     */
    public void setUserStatusAlias(String userStatusAlias) {
        registerModifiedProperty("userStatusAlias");
        _userStatusAlias = userStatusAlias;
    }
}
