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
 * The DB meta of LAW_TYPE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LawTypeDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LawTypeDbm _instance = new LawTypeDbm();
    private LawTypeDbm() {}
    public static LawTypeDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((LawType)et).getLawTypeCode(), (et, vl) -> ((LawType)et).setLawTypeCode((String)vl), "lawTypeCode");
        setupEpg(_epgMap, et -> ((LawType)et).getLawTypeName(), (et, vl) -> ((LawType)et).setLawTypeName((String)vl), "lawTypeName");
        setupEpg(_epgMap, et -> ((LawType)et).getLawTypeAlias(), (et, vl) -> ((LawType)et).setLawTypeAlias((String)vl), "lawTypeAlias");
        setupEpg(_epgMap, et -> ((LawType)et).getDescription(), (et, vl) -> ((LawType)et).setDescription((String)vl), "description");
        setupEpg(_epgMap, et -> ((LawType)et).getDisplayOrder(), (et, vl) -> ((LawType)et).setDisplayOrder(cti(vl)), "displayOrder");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "LAW_TYPE";
    protected final String _tableDispName = "LAW_TYPE";
    protected final String _tablePropertyName = "lawType";
    protected final TableSqlName _tableSqlName = new TableSqlName("LAW_TYPE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "法令種別";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLawTypeCode = cci("LAW_TYPE_CODE", "LAW_TYPE_CODE", null, "法令種別コード", String.class, "lawTypeCode", null, true, false, true, "VARCHAR", 20, 0, null, false, null, null, null, "lawList", null, false);
    protected final ColumnInfo _columnLawTypeName = cci("LAW_TYPE_NAME", "LAW_TYPE_NAME", null, "法令種別", String.class, "lawTypeName", null, false, false, true, "VARCHAR", 20, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLawTypeAlias = cci("LAW_TYPE_ALIAS", "LAW_TYPE_ALIAS", null, "法令種別別名", String.class, "lawTypeAlias", null, false, false, true, "VARCHAR", 20, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDescription = cci("DESCRIPTION", "DESCRIPTION", null, "説明", String.class, "description", null, false, false, true, "TEXT", 65535, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDisplayOrder = cci("DISPLAY_ORDER", "DISPLAY_ORDER", null, "順番", Integer.class, "displayOrder", null, false, false, true, "INT UNSIGNED", 10, 0, null, false, null, null, null, null, null, false);

    /**
     * (法令種別コード)LAW_TYPE_CODE: {PK, NotNull, VARCHAR(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawTypeCode() { return _columnLawTypeCode; }
    /**
     * (法令種別)LAW_TYPE_NAME: {UQ, NotNull, VARCHAR(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawTypeName() { return _columnLawTypeName; }
    /**
     * (法令種別別名)LAW_TYPE_ALIAS: {UQ, NotNull, VARCHAR(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLawTypeAlias() { return _columnLawTypeAlias; }
    /**
     * (説明)DESCRIPTION: {NotNull, TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDescription() { return _columnDescription; }
    /**
     * (順番)DISPLAY_ORDER: {UQ, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDisplayOrder() { return _columnDisplayOrder; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnLawTypeCode());
        ls.add(columnLawTypeName());
        ls.add(columnLawTypeAlias());
        ls.add(columnDescription());
        ls.add(columnDisplayOrder());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnLawTypeCode()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOfDisplayOrder() { return hpcui(columnDisplayOrder()); }
    public UniqueInfo uniqueOfLawTypeAlias() { return hpcui(columnLawTypeAlias()); }
    public UniqueInfo uniqueOfLawTypeName() { return hpcui(columnLawTypeName()); }

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
     * (法令)LAW by LAW_TYPE_CODE, named 'lawList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerLawList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLawTypeCode(), LawDbm.getInstance().columnLawTypeCode());
        return cri("FK_LAW_LAW_TYPE", "lawList", this, LawDbm.getInstance(), mp, false, "lawType");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "tech.law.hanreidb.dbflute.exentity.LawType"; }
    public String getConditionBeanTypeName() { return "tech.law.hanreidb.dbflute.cbean.LawTypeCB"; }
    public String getBehaviorTypeName() { return "tech.law.hanreidb.dbflute.exbhv.LawTypeBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LawType> getEntityType() { return LawType.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LawType newEntity() { return new LawType(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LawType)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LawType)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
