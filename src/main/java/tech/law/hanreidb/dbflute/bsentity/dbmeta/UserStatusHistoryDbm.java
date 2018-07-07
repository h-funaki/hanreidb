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
 * The DB meta of USER_STATUS_HISTORY. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class UserStatusHistoryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final UserStatusHistoryDbm _instance = new UserStatusHistoryDbm();
    private UserStatusHistoryDbm() {}
    public static UserStatusHistoryDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((UserStatusHistory)et).getUserStatusHistoryId(), (et, vl) -> ((UserStatusHistory)et).setUserStatusHistoryId(ctl(vl)), "userStatusHistoryId");
        setupEpg(_epgMap, et -> ((UserStatusHistory)et).getUserId(), (et, vl) -> ((UserStatusHistory)et).setUserId(cti(vl)), "userId");
        setupEpg(_epgMap, et -> ((UserStatusHistory)et).getUserNewStatusCode(), (et, vl) -> ((UserStatusHistory)et).setUserNewStatusCode((String)vl), "userNewStatusCode");
        setupEpg(_epgMap, et -> ((UserStatusHistory)et).getUserStatusUpdateDatetime(), (et, vl) -> ((UserStatusHistory)et).setUserStatusUpdateDatetime(ctldt(vl)), "userStatusUpdateDatetime");
        setupEpg(_epgMap, et -> ((UserStatusHistory)et).getRegisterDatetime(), (et, vl) -> ((UserStatusHistory)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((UserStatusHistory)et).getRegisterUser(), (et, vl) -> ((UserStatusHistory)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((UserStatusHistory)et).getUpdateDatetime(), (et, vl) -> ((UserStatusHistory)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((UserStatusHistory)et).getUpdateUser(), (et, vl) -> ((UserStatusHistory)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((UserStatusHistory)et).getVersionNo(), (et, vl) -> ((UserStatusHistory)et).setVersionNo(ctl(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((UserStatusHistory)et).getUser(), (et, vl) -> ((UserStatusHistory)et).setUser((OptionalEntity<User>)vl), "user");
        setupEfpg(_efpgMap, et -> ((UserStatusHistory)et).getClsUserStatus(), (et, vl) -> ((UserStatusHistory)et).setClsUserStatus((OptionalEntity<ClsUserStatus>)vl), "clsUserStatus");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "USER_STATUS_HISTORY";
    protected final String _tableDispName = "USER_STATUS_HISTORY";
    protected final String _tablePropertyName = "userStatusHistory";
    protected final TableSqlName _tableSqlName = new TableSqlName("USER_STATUS_HISTORY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "ユーザーステータス履歴";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUserStatusHistoryId = cci("USER_STATUS_HISTORY_ID", "USER_STATUS_HISTORY_ID", null, "ユーザーステータス履歴ID", Long.class, "userStatusHistoryId", null, true, true, true, "BIGINT UNSIGNED", 20, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserId = cci("USER_ID", "USER_ID", null, "ユーザーID", Integer.class, "userId", null, false, false, true, "INT UNSIGNED", 10, 0, null, false, null, null, "user", null, null, false);
    protected final ColumnInfo _columnUserNewStatusCode = cci("USER_NEW_STATUS_CODE", "USER_NEW_STATUS_CODE", null, "ユーザー新ステータスコード", String.class, "userNewStatusCode", null, false, false, true, "VARCHAR", 20, 0, null, false, null, null, "clsUserStatus", null, CDef.DefMeta.UserStatus, false);
    protected final ColumnInfo _columnUserStatusUpdateDatetime = cci("USER_STATUS_UPDATE_DATETIME", "USER_STATUS_UPDATE_DATETIME", null, "ユーザーステータス更新日時", java.time.LocalDateTime.class, "userStatusUpdateDatetime", null, false, false, true, "DATETIME", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザー", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョン番号", Long.class, "versionNo", null, false, false, true, "BIGINT UNSIGNED", 20, 0, "0", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * (ユーザーステータス履歴ID)USER_STATUS_HISTORY_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserStatusHistoryId() { return _columnUserStatusHistoryId; }
    /**
     * (ユーザーID)USER_ID: {IX, NotNull, INT UNSIGNED(10), FK to USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * (ユーザー新ステータスコード)USER_NEW_STATUS_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_USER_STATUS, classification=UserStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserNewStatusCode() { return _columnUserNewStatusCode; }
    /**
     * (ユーザーステータス更新日時)USER_STATUS_UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserStatusUpdateDatetime() { return _columnUserStatusUpdateDatetime; }
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
        ls.add(columnUserStatusHistoryId());
        ls.add(columnUserId());
        ls.add(columnUserNewStatusCode());
        ls.add(columnUserStatusUpdateDatetime());
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
    protected UniqueInfo cpui() { return hpcpui(columnUserStatusHistoryId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * (ユーザー)USER by my USER_ID, named 'user'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUser() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), UserDbm.getInstance().columnUserId());
        return cfi("FK_USER_STATUS_HISTORY_USER", "user", this, UserDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "userStatusHistoryList", false);
    }
    /**
     * ([区分値]ユーザーステータス)CLS_USER_STATUS by my USER_NEW_STATUS_CODE, named 'clsUserStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignClsUserStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserNewStatusCode(), ClsUserStatusDbm.getInstance().columnUserStatusCode());
        return cfi("FK_USER_STATUS_HISTORY_CLS_USER_STATUS", "clsUserStatus", this, ClsUserStatusDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "userStatusHistoryList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

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
    public String getEntityTypeName() { return "tech.law.hanreidb.dbflute.exentity.UserStatusHistory"; }
    public String getConditionBeanTypeName() { return "tech.law.hanreidb.dbflute.cbean.UserStatusHistoryCB"; }
    public String getBehaviorTypeName() { return "tech.law.hanreidb.dbflute.exbhv.UserStatusHistoryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<UserStatusHistory> getEntityType() { return UserStatusHistory.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public UserStatusHistory newEntity() { return new UserStatusHistory(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((UserStatusHistory)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((UserStatusHistory)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
