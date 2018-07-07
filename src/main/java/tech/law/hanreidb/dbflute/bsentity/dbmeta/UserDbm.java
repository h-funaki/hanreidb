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
package tech.law.hanreidb.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import tech.law.hanreidb.dbflute.allcommon.*;
import tech.law.hanreidb.dbflute.exentity.*;

/**
 * The DB meta of USER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class UserDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final UserDbm _instance = new UserDbm();
    private UserDbm() {}
    public static UserDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((User)et).getUserId(), (et, vl) -> ((User)et).setUserId(cti(vl)), "userId");
        setupEpg(_epgMap, et -> ((User)et).getMailAddress(), (et, vl) -> ((User)et).setMailAddress((String)vl), "mailAddress");
        setupEpg(_epgMap, et -> ((User)et).getPassword(), (et, vl) -> ((User)et).setPassword((String)vl), "password");
        setupEpg(_epgMap, et -> ((User)et).getUserStatusCode(), (et, vl) -> ((User)et).setUserStatusCode((String)vl), "userStatusCode");
        setupEpg(_epgMap, et -> ((User)et).getRegisterDatetime(), (et, vl) -> ((User)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((User)et).getRegisterUser(), (et, vl) -> ((User)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((User)et).getUpdateDatetime(), (et, vl) -> ((User)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((User)et).getUpdateUser(), (et, vl) -> ((User)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((User)et).getVersionNo(), (et, vl) -> ((User)et).setVersionNo(ctl(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((User)et).getClsUserStatus(), (et, vl) -> ((User)et).setClsUserStatus((OptionalEntity<ClsUserStatus>)vl), "clsUserStatus");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "USER";
    protected final String _tableDispName = "USER";
    protected final String _tablePropertyName = "user";
    protected final TableSqlName _tableSqlName = new TableSqlName("USER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "ユーザー";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUserId = cci("USER_ID", "USER_ID", null, "ユーザーID", Integer.class, "userId", null, true, true, true, "INT UNSIGNED", 10, 0, null, false, null, null, null, "judgementUserFavoriteRelList,loginHistoryList,userStatusHistoryList", null, false);
    protected final ColumnInfo _columnMailAddress = cci("MAIL_ADDRESS", "MAIL_ADDRESS", null, "メールアドレス", String.class, "mailAddress", null, false, false, true, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPassword = cci("PASSWORD", "PASSWORD", null, "パスワード", String.class, "password", null, false, false, true, "VARCHAR", 255, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserStatusCode = cci("USER_STATUS_CODE", "USER_STATUS_CODE", null, "ユーザーステータスコード", String.class, "userStatusCode", null, false, false, true, "VARCHAR", 20, 0, null, false, null, null, "clsUserStatus", null, CDef.DefMeta.UserStatus, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザー", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョン番号", Long.class, "versionNo", null, false, false, true, "BIGINT UNSIGNED", 20, 0, "0", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * (ユーザーID)USER_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * (メールアドレス)MAIL_ADDRESS: {UQ, NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMailAddress() { return _columnMailAddress; }
    /**
     * (パスワード)PASSWORD: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPassword() { return _columnPassword; }
    /**
     * (ユーザーステータスコード)USER_STATUS_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_USER_STATUS, classification=UserStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserStatusCode() { return _columnUserStatusCode; }
    /**
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    /**
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    /**
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUserId());
        ls.add(columnMailAddress());
        ls.add(columnPassword());
        ls.add(columnUserStatusCode());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        ls.add(columnVersionNo());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnUserId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnMailAddress()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * ([区分値]ユーザーステータス)CLS_USER_STATUS by my USER_STATUS_CODE, named 'clsUserStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignClsUserStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserStatusCode(), ClsUserStatusDbm.getInstance().columnUserStatusCode());
        return cfi("FK_USER_CLS_USER_STATUS", "clsUserStatus", this, ClsUserStatusDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "userList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (判決ユーザーお気に入りリレーション)JUDGEMENT_USER_FAVORITE_REL by USER_ID, named 'judgementUserFavoriteRelList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerJudgementUserFavoriteRelList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), JudgementUserFavoriteRelDbm.getInstance().columnUserId());
        return cri("FK_JUDGEMENT_USER_FAVORITE_REL_USER", "judgementUserFavoriteRelList", this, JudgementUserFavoriteRelDbm.getInstance(), mp, false, "user");
    }
    /**
     * (ログイン履歴)LOGIN_HISTORY by USER_ID, named 'loginHistoryList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerLoginHistoryList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), LoginHistoryDbm.getInstance().columnUserId());
        return cri("FK_LOGIN_HISTORY_USER", "loginHistoryList", this, LoginHistoryDbm.getInstance(), mp, false, "user");
    }
    /**
     * (ユーザーステータス履歴)USER_STATUS_HISTORY by USER_ID, named 'userStatusHistoryList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerUserStatusHistoryList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), UserStatusHistoryDbm.getInstance().columnUserId());
        return cri("FK_USER_STATUS_HISTORY_USER", "userStatusHistoryList", this, UserStatusHistoryDbm.getInstance(), mp, false, "user");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser(), columnVersionNo()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser(), columnVersionNo()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime(), columnUpdateUser()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "tech.law.hanreidb.dbflute.exentity.User"; }
    public String getConditionBeanTypeName() { return "tech.law.hanreidb.dbflute.cbean.UserCB"; }
    public String getBehaviorTypeName() { return "tech.law.hanreidb.dbflute.exbhv.UserBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<User> getEntityType() { return User.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public User newEntity() { return new User(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((User)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((User)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
