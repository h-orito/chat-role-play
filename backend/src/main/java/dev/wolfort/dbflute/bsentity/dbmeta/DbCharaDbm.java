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
 * The DB meta of chara. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DbCharaDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DbCharaDbm _instance = new DbCharaDbm();
    private DbCharaDbm() {}
    public static DbCharaDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((DbChara)et).getCharaId(), (et, vl) -> ((DbChara)et).setCharaId(cti(vl)), "charaId");
        setupEpg(_epgMap, et -> ((DbChara)et).getCharaName(), (et, vl) -> ((DbChara)et).setCharaName((String)vl), "charaName");
        setupEpg(_epgMap, et -> ((DbChara)et).getCharachipId(), (et, vl) -> ((DbChara)et).setCharachipId(cti(vl)), "charachipId");
        setupEpg(_epgMap, et -> ((DbChara)et).getDisplayWidth(), (et, vl) -> ((DbChara)et).setDisplayWidth(cti(vl)), "displayWidth");
        setupEpg(_epgMap, et -> ((DbChara)et).getDisplayHeight(), (et, vl) -> ((DbChara)et).setDisplayHeight(cti(vl)), "displayHeight");
        setupEpg(_epgMap, et -> ((DbChara)et).getRegisterDatetime(), (et, vl) -> ((DbChara)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((DbChara)et).getRegisterTrace(), (et, vl) -> ((DbChara)et).setRegisterTrace((String)vl), "registerTrace");
        setupEpg(_epgMap, et -> ((DbChara)et).getUpdateDatetime(), (et, vl) -> ((DbChara)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((DbChara)et).getUpdateTrace(), (et, vl) -> ((DbChara)et).setUpdateTrace((String)vl), "updateTrace");
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
        setupEfpg(_efpgMap, et -> ((DbChara)et).getCharachip(), (et, vl) -> ((DbChara)et).setCharachip((OptionalEntity<DbCharachip>)vl), "charachip");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "chara";
    protected final String _tableDispName = "CHARA";
    protected final String _tablePropertyName = "chara";
    protected final TableSqlName _tableSqlName = new TableSqlName("CHARA", _tableDbName);
    { _tableSqlName.xacceptFilter(DbDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCharaId = cci("chara_id", "chara_id", null, null, Integer.class, "charaId", null, true, true, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, "charaImageList,gamePlayerList", null, false);
    protected final ColumnInfo _columnCharaName = cci("chara_name", "chara_name", null, null, String.class, "charaName", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCharachipId = cci("charachip_id", "charachip_id", null, null, Integer.class, "charachipId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "charachip", null, null, false);
    protected final ColumnInfo _columnDisplayWidth = cci("display_width", "display_width", null, null, Integer.class, "displayWidth", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDisplayHeight = cci("display_height", "display_height", null, null, Integer.class, "displayHeight", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterTrace = cci("register_trace", "register_trace", null, null, String.class, "registerTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateTrace = cci("update_trace", "update_trace", null, null, String.class, "updateTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);

    /**
     * chara_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCharaId() { return _columnCharaId; }
    /**
     * chara_name: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCharaName() { return _columnCharaName; }
    /**
     * charachip_id: {IX, NotNull, INT UNSIGNED(10), FK to charachip}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCharachipId() { return _columnCharachipId; }
    /**
     * display_width: {NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDisplayWidth() { return _columnDisplayWidth; }
    /**
     * display_height: {NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDisplayHeight() { return _columnDisplayHeight; }
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
        ls.add(columnCharaId());
        ls.add(columnCharaName());
        ls.add(columnCharachipId());
        ls.add(columnDisplayWidth());
        ls.add(columnDisplayHeight());
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
    protected UniqueInfo cpui() { return hpcpui(columnCharaId()); }
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
     * CHARACHIP by my charachip_id, named 'charachip'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignCharachip() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCharachipId(), DbCharachipDbm.getInstance().columnCharachipId());
        return cfi("fk_chara_charachip", "charachip", this, DbCharachipDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "charaList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * CHARA_IMAGE by chara_id, named 'charaImageList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerCharaImageList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCharaId(), DbCharaImageDbm.getInstance().columnCharaId());
        return cri("fk_chara_image_chara", "charaImageList", this, DbCharaImageDbm.getInstance(), mp, false, "chara");
    }
    /**
     * GAME_PLAYER by chara_id, named 'gamePlayerList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerGamePlayerList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCharaId(), DbGamePlayerDbm.getInstance().columnCharaId());
        return cri("fk_game_player_chara", "gamePlayerList", this, DbGamePlayerDbm.getInstance(), mp, false, "chara");
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
    public String getEntityTypeName() { return "dev.wolfort.dbflute.exentity.DbChara"; }
    public String getConditionBeanTypeName() { return "dev.wolfort.dbflute.cbean.DbCharaCB"; }
    public String getBehaviorTypeName() { return "dev.wolfort.dbflute.exbhv.DbCharaBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<DbChara> getEntityType() { return DbChara.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public DbChara newEntity() { return new DbChara(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((DbChara)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((DbChara)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
