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
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import tech.law.hanreidb.dbflute.allcommon.*;
import tech.law.hanreidb.dbflute.exentity.*;

/**
 * The DB meta of CLS_USER_STATUS. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ClsUserStatusDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ClsUserStatusDbm _instance = new ClsUserStatusDbm();
    private ClsUserStatusDbm() {}
    public static ClsUserStatusDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ClsUserStatus)et).getUserStatusCode(), (et, vl) -> ((ClsUserStatus)et).setUserStatusCode((String)vl), "userStatusCode");
        setupEpg(_epgMap, et -> ((ClsUserStatus)et).getUserStatusName(), (et, vl) -> ((ClsUserStatus)et).setUserStatusName((String)vl), "userStatusName");
        setupEpg(_epgMap, et -> ((ClsUserStatus)et).getUserStatusAlias(), (et, vl) -> ((ClsUserStatus)et).setUserStatusAlias((String)vl), "userStatusAlias");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "CLS_USER_STATUS";
    protected final String _tableDispName = "CLS_USER_STATUS";
    protected final String _tablePropertyName = "clsUserStatus";
    protected final TableSqlName _tableSqlName = new TableSqlName("CLS_USER_STATUS", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "[区分値]ユーザーステータス";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUserStatusCode = cci("USER_STATUS_CODE", "USER_STATUS_CODE", null, "ユーザーステータスコード", String.class, "userStatusCode", null, true, false, true, "VARCHAR", 10, 0, null, false, null, null, null, "userList", null, false);
    protected final ColumnInfo _columnUserStatusName = cci("USER_STATUS_NAME", "USER_STATUS_NAME", null, "ユーザーステータス名", String.class, "userStatusName", null, false, false, true, "VARCHAR", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserStatusAlias = cci("USER_STATUS_ALIAS", "USER_STATUS_ALIAS", null, "ユーザーステータス別名", String.class, "userStatusAlias", null, false, false, true, "VARCHAR", 10, 0, null, false, null, null, null, null, null, false);

    /**
     * (ユーザーステータスコード)USER_STATUS_CODE: {PK, NotNull, VARCHAR(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserStatusCode() { return _columnUserStatusCode; }
    /**
     * (ユーザーステータス名)USER_STATUS_NAME: {NotNull, VARCHAR(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserStatusName() { return _columnUserStatusName; }
    /**
     * (ユーザーステータス別名)USER_STATUS_ALIAS: {NotNull, VARCHAR(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserStatusAlias() { return _columnUserStatusAlias; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUserStatusCode());
        ls.add(columnUserStatusName());
        ls.add(columnUserStatusAlias());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnUserStatusCode()); }
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

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (ユーザー)USER by USER_STATUS_CODE, named 'userList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerUserList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserStatusCode(), UserDbm.getInstance().columnUserStatusCode());
        return cri("FK_USER_CLS_USER_STATUS", "userList", this, UserDbm.getInstance(), mp, false, "clsUserStatus");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "tech.law.hanreidb.dbflute.exentity.ClsUserStatus"; }
    public String getConditionBeanTypeName() { return "tech.law.hanreidb.dbflute.cbean.ClsUserStatusCB"; }
    public String getBehaviorTypeName() { return "tech.law.hanreidb.dbflute.exbhv.ClsUserStatusBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ClsUserStatus> getEntityType() { return ClsUserStatus.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ClsUserStatus newEntity() { return new ClsUserStatus(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ClsUserStatus)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ClsUserStatus)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
