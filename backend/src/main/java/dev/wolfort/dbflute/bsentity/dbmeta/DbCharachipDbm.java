package dev.wolfort.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import dev.wolfort.dbflute.allcommon.*;
import dev.wolfort.dbflute.exentity.*;

/**
 * The DB meta of charachip. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DbCharachipDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DbCharachipDbm _instance = new DbCharachipDbm();
    private DbCharachipDbm() {}
    public static DbCharachipDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DbDBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DbDBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DbDBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DbDBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((DbCharachip)et).getCharachipId(), (et, vl) -> ((DbCharachip)et).setCharachipId(cti(vl)), "charachipId");
        setupEpg(_epgMap, et -> ((DbCharachip)et).getCharachipName(), (et, vl) -> ((DbCharachip)et).setCharachipName((String)vl), "charachipName");
        setupEpg(_epgMap, et -> ((DbCharachip)et).getDesignerId(), (et, vl) -> ((DbCharachip)et).setDesignerId(cti(vl)), "designerId");
        setupEpg(_epgMap, et -> ((DbCharachip)et).getRegisterDatetime(), (et, vl) -> ((DbCharachip)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((DbCharachip)et).getRegisterTrace(), (et, vl) -> ((DbCharachip)et).setRegisterTrace((String)vl), "registerTrace");
        setupEpg(_epgMap, et -> ((DbCharachip)et).getUpdateDatetime(), (et, vl) -> ((DbCharachip)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((DbCharachip)et).getUpdateTrace(), (et, vl) -> ((DbCharachip)et).setUpdateTrace((String)vl), "updateTrace");
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
        setupEfpg(_efpgMap, et -> ((DbCharachip)et).getDesigner(), (et, vl) -> ((DbCharachip)et).setDesigner((OptionalEntity<DbDesigner>)vl), "designer");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "charachip";
    protected final String _tableDispName = "CHARACHIP";
    protected final String _tablePropertyName = "charachip";
    protected final TableSqlName _tableSqlName = new TableSqlName("CHARACHIP", _tableDbName);
    { _tableSqlName.xacceptFilter(DbDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCharachipId = cci("charachip_id", "charachip_id", null, null, Integer.class, "charachipId", null, true, true, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, "charaList", null, false);
    protected final ColumnInfo _columnCharachipName = cci("charachip_name", "charachip_name", null, null, String.class, "charachipName", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesignerId = cci("designer_id", "designer_id", null, null, Integer.class, "designerId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "designer", null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterTrace = cci("register_trace", "register_trace", null, null, String.class, "registerTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateTrace = cci("update_trace", "update_trace", null, null, String.class, "updateTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);

    /**
     * charachip_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCharachipId() { return _columnCharachipId; }
    /**
     * charachip_name: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCharachipName() { return _columnCharachipName; }
    /**
     * designer_id: {IX, NotNull, INT UNSIGNED(10), FK to designer}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesignerId() { return _columnDesignerId; }
    /**
     * register_datetime: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * register_trace: {NotNull, VARCHAR(64)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterTrace() { return _columnRegisterTrace; }
    /**
     * update_datetime: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * update_trace: {NotNull, VARCHAR(64)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateTrace() { return _columnUpdateTrace; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCharachipId());
        ls.add(columnCharachipName());
        ls.add(columnDesignerId());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterTrace());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateTrace());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnCharachipId()); }
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
     * DESIGNER by my designer_id, named 'designer'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignDesigner() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDesignerId(), DbDesignerDbm.getInstance().columnDesignerId());
        return cfi("fk_charachip_designer", "designer", this, DbDesignerDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "charachipList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * CHARA by charachip_id, named 'charaList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerCharaList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCharachipId(), DbCharaDbm.getInstance().columnCharachipId());
        return cri("fk_chara_charachip", "charaList", this, DbCharaDbm.getInstance(), mp, false, "charachip");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterTrace(), columnUpdateDatetime(), columnUpdateTrace()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterTrace(), columnUpdateDatetime(), columnUpdateTrace()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime(), columnUpdateTrace()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "dev.wolfort.dbflute.exentity.DbCharachip"; }
    public String getConditionBeanTypeName() { return "dev.wolfort.dbflute.cbean.DbCharachipCB"; }
    public String getBehaviorTypeName() { return "dev.wolfort.dbflute.exbhv.DbCharachipBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<DbCharachip> getEntityType() { return DbCharachip.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public DbCharachip newEntity() { return new DbCharachip(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((DbCharachip)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((DbCharachip)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
