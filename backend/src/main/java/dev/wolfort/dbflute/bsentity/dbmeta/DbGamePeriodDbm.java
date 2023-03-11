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
 * The DB meta of game_period. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DbGamePeriodDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DbGamePeriodDbm _instance = new DbGamePeriodDbm();
    private DbGamePeriodDbm() {}
    public static DbGamePeriodDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((DbGamePeriod)et).getGamePeriodId(), (et, vl) -> ((DbGamePeriod)et).setGamePeriodId(cti(vl)), "gamePeriodId");
        setupEpg(_epgMap, et -> ((DbGamePeriod)et).getGameId(), (et, vl) -> ((DbGamePeriod)et).setGameId(cti(vl)), "gameId");
        setupEpg(_epgMap, et -> ((DbGamePeriod)et).getPeriod(), (et, vl) -> ((DbGamePeriod)et).setPeriod(cti(vl)), "period");
        setupEpg(_epgMap, et -> ((DbGamePeriod)et).getPrefix(), (et, vl) -> ((DbGamePeriod)et).setPrefix((String)vl), "prefix");
        setupEpg(_epgMap, et -> ((DbGamePeriod)et).getSuffix(), (et, vl) -> ((DbGamePeriod)et).setSuffix((String)vl), "suffix");
        setupEpg(_epgMap, et -> ((DbGamePeriod)et).getRegisterDatetime(), (et, vl) -> ((DbGamePeriod)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((DbGamePeriod)et).getRegisterTrace(), (et, vl) -> ((DbGamePeriod)et).setRegisterTrace((String)vl), "registerTrace");
        setupEpg(_epgMap, et -> ((DbGamePeriod)et).getUpdateDatetime(), (et, vl) -> ((DbGamePeriod)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((DbGamePeriod)et).getUpdateTrace(), (et, vl) -> ((DbGamePeriod)et).setUpdateTrace((String)vl), "updateTrace");
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
        setupEfpg(_efpgMap, et -> ((DbGamePeriod)et).getGame(), (et, vl) -> ((DbGamePeriod)et).setGame((OptionalEntity<DbGame>)vl), "game");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "game_period";
    protected final String _tableDispName = "GAME_PERIOD";
    protected final String _tablePropertyName = "gamePeriod";
    protected final TableSqlName _tableSqlName = new TableSqlName("GAME_PERIOD", _tableDbName);
    { _tableSqlName.xacceptFilter(DbDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnGamePeriodId = cci("game_period_id", "game_period_id", null, null, Integer.class, "gamePeriodId", null, true, true, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, "messageList,directMessageList", null, false);
    protected final ColumnInfo _columnGameId = cci("game_id", "game_id", null, null, Integer.class, "gameId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "game", null, null, false);
    protected final ColumnInfo _columnPeriod = cci("period", "period", null, null, Integer.class, "period", null, false, false, false, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrefix = cci("prefix", "prefix", null, null, String.class, "prefix", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSuffix = cci("suffix", "suffix", null, null, String.class, "suffix", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterTrace = cci("register_trace", "register_trace", null, null, String.class, "registerTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateTrace = cci("update_trace", "update_trace", null, null, String.class, "updateTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);

    /**
     * game_period_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGamePeriodId() { return _columnGamePeriodId; }
    /**
     * game_id: {UQ+, NotNull, INT UNSIGNED(10), FK to game}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGameId() { return _columnGameId; }
    /**
     * period: {+UQ, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPeriod() { return _columnPeriod; }
    /**
     * prefix: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrefix() { return _columnPrefix; }
    /**
     * suffix: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSuffix() { return _columnSuffix; }
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
        ls.add(columnGamePeriodId());
        ls.add(columnGameId());
        ls.add(columnPeriod());
        ls.add(columnPrefix());
        ls.add(columnSuffix());
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
    protected UniqueInfo cpui() { return hpcpui(columnGamePeriodId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnGameId());
        ls.add(columnPeriod());
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
     * GAME by my game_id, named 'game'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignGame() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGameId(), DbGameDbm.getInstance().columnGameId());
        return cfi("fk_game_period_game", "game", this, DbGameDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "gamePeriodList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * MESSAGE by game_period_id, named 'messageList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMessageList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGamePeriodId(), DbMessageDbm.getInstance().columnGamePeriodId());
        return cri("fk_message_game_period", "messageList", this, DbMessageDbm.getInstance(), mp, false, "gamePeriod");
    }
    /**
     * DIRECT_MESSAGE by game_period_id, named 'directMessageList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerDirectMessageList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGamePeriodId(), DbDirectMessageDbm.getInstance().columnGamePeriodId());
        return cri("fk_direct_message_game_period", "directMessageList", this, DbDirectMessageDbm.getInstance(), mp, false, "gamePeriod");
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
    public String getEntityTypeName() { return "dev.wolfort.dbflute.exentity.DbGamePeriod"; }
    public String getConditionBeanTypeName() { return "dev.wolfort.dbflute.cbean.DbGamePeriodCB"; }
    public String getBehaviorTypeName() { return "dev.wolfort.dbflute.exbhv.DbGamePeriodBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<DbGamePeriod> getEntityType() { return DbGamePeriod.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public DbGamePeriod newEntity() { return new DbGamePeriod(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((DbGamePeriod)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((DbGamePeriod)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
