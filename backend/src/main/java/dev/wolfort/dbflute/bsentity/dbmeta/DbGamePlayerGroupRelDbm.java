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
 * The DB meta of game_player_group_rel. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DbGamePlayerGroupRelDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DbGamePlayerGroupRelDbm _instance = new DbGamePlayerGroupRelDbm();
    private DbGamePlayerGroupRelDbm() {}
    public static DbGamePlayerGroupRelDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((DbGamePlayerGroupRel)et).getGamePlayerGroupRelId(), (et, vl) -> ((DbGamePlayerGroupRel)et).setGamePlayerGroupRelId(cti(vl)), "gamePlayerGroupRelId");
        setupEpg(_epgMap, et -> ((DbGamePlayerGroupRel)et).getGamePlayerGroup(), (et, vl) -> ((DbGamePlayerGroupRel)et).setGamePlayerGroup(cti(vl)), "gamePlayerGroup");
        setupEpg(_epgMap, et -> ((DbGamePlayerGroupRel)et).getGamePlayerId(), (et, vl) -> ((DbGamePlayerGroupRel)et).setGamePlayerId(cti(vl)), "gamePlayerId");
        setupEpg(_epgMap, et -> ((DbGamePlayerGroupRel)et).getRegisterDatetime(), (et, vl) -> ((DbGamePlayerGroupRel)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((DbGamePlayerGroupRel)et).getRegisterTrace(), (et, vl) -> ((DbGamePlayerGroupRel)et).setRegisterTrace((String)vl), "registerTrace");
        setupEpg(_epgMap, et -> ((DbGamePlayerGroupRel)et).getUpdateDatetime(), (et, vl) -> ((DbGamePlayerGroupRel)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((DbGamePlayerGroupRel)et).getUpdateTrace(), (et, vl) -> ((DbGamePlayerGroupRel)et).setUpdateTrace((String)vl), "updateTrace");
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
        setupEfpg(_efpgMap, et -> ((DbGamePlayerGroupRel)et).getGamePlayer(), (et, vl) -> ((DbGamePlayerGroupRel)et).setGamePlayer((OptionalEntity<DbGamePlayer>)vl), "gamePlayer");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "game_player_group_rel";
    protected final String _tableDispName = "GAME_PLAYER_GROUP_REL";
    protected final String _tablePropertyName = "gamePlayerGroupRel";
    protected final TableSqlName _tableSqlName = new TableSqlName("GAME_PLAYER_GROUP_REL", _tableDbName);
    { _tableSqlName.xacceptFilter(DbDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnGamePlayerGroupRelId = cci("game_player_group_rel_id", "game_player_group_rel_id", null, null, Integer.class, "gamePlayerGroupRelId", null, true, true, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGamePlayerGroup = cci("game_player_group", "game_player_group", null, null, Integer.class, "gamePlayerGroup", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGamePlayerId = cci("game_player_id", "game_player_id", null, null, Integer.class, "gamePlayerId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "gamePlayer", null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterTrace = cci("register_trace", "register_trace", null, null, String.class, "registerTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateTrace = cci("update_trace", "update_trace", null, null, String.class, "updateTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);

    /**
     * game_player_group_rel_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGamePlayerGroupRelId() { return _columnGamePlayerGroupRelId; }
    /**
     * game_player_group: {UQ+, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGamePlayerGroup() { return _columnGamePlayerGroup; }
    /**
     * game_player_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to game_player}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGamePlayerId() { return _columnGamePlayerId; }
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
        ls.add(columnGamePlayerGroupRelId());
        ls.add(columnGamePlayerGroup());
        ls.add(columnGamePlayerId());
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
    protected UniqueInfo cpui() { return hpcpui(columnGamePlayerGroupRelId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnGamePlayerGroup());
        ls.add(columnGamePlayerId());
        return hpcui(ls);
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * GAME_PLAYER by my game_player_id, named 'gamePlayer'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignGamePlayer() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGamePlayerId(), DbGamePlayerDbm.getInstance().columnGamePlayerId());
        return cfi("fk_game_player_group_rel_game_player", "gamePlayer", this, DbGamePlayerDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "gamePlayerGroupRelList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

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
    public String getEntityTypeName() { return "dev.wolfort.dbflute.exentity.DbGamePlayerGroupRel"; }
    public String getConditionBeanTypeName() { return "dev.wolfort.dbflute.cbean.DbGamePlayerGroupRelCB"; }
    public String getBehaviorTypeName() { return "dev.wolfort.dbflute.exbhv.DbGamePlayerGroupRelBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<DbGamePlayerGroupRel> getEntityType() { return DbGamePlayerGroupRel.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public DbGamePlayerGroupRel newEntity() { return new DbGamePlayerGroupRel(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((DbGamePlayerGroupRel)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((DbGamePlayerGroupRel)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
