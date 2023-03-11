package dev.wolfort.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import dev.wolfort.dbflute.allcommon.*;
import dev.wolfort.dbflute.exentity.*;

/**
 * The DB meta of game. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DbGameDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DbGameDbm _instance = new DbGameDbm();
    private DbGameDbm() {}
    public static DbGameDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((DbGame)et).getGameId(), (et, vl) -> ((DbGame)et).setGameId(cti(vl)), "gameId");
        setupEpg(_epgMap, et -> ((DbGame)et).getGameName(), (et, vl) -> ((DbGame)et).setGameName((String)vl), "gameName");
        setupEpg(_epgMap, et -> ((DbGame)et).getRegisterDatetime(), (et, vl) -> ((DbGame)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((DbGame)et).getRegisterTrace(), (et, vl) -> ((DbGame)et).setRegisterTrace((String)vl), "registerTrace");
        setupEpg(_epgMap, et -> ((DbGame)et).getUpdateDatetime(), (et, vl) -> ((DbGame)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((DbGame)et).getUpdateTrace(), (et, vl) -> ((DbGame)et).setUpdateTrace((String)vl), "updateTrace");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "game";
    protected final String _tableDispName = "GAME";
    protected final String _tablePropertyName = "game";
    protected final TableSqlName _tableSqlName = new TableSqlName("GAME", _tableDbName);
    { _tableSqlName.xacceptFilter(DbDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnGameId = cci("game_id", "game_id", null, null, Integer.class, "gameId", null, true, true, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, "gamePeriodList,gamePlayerList,gameSettingList,messageList,messageReplyList,messageFavoriteList,directMessageList", null, false);
    protected final ColumnInfo _columnGameName = cci("game_name", "game_name", null, null, String.class, "gameName", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterTrace = cci("register_trace", "register_trace", null, null, String.class, "registerTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateTrace = cci("update_trace", "update_trace", null, null, String.class, "updateTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);

    /**
     * game_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGameId() { return _columnGameId; }
    /**
     * game_name: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGameName() { return _columnGameName; }
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
        ls.add(columnGameId());
        ls.add(columnGameName());
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
    protected UniqueInfo cpui() { return hpcpui(columnGameId()); }
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
     * GAME_PERIOD by game_id, named 'gamePeriodList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerGamePeriodList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGameId(), DbGamePeriodDbm.getInstance().columnGameId());
        return cri("fk_game_period_game", "gamePeriodList", this, DbGamePeriodDbm.getInstance(), mp, false, "game");
    }
    /**
     * GAME_PLAYER by game_id, named 'gamePlayerList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerGamePlayerList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGameId(), DbGamePlayerDbm.getInstance().columnGameId());
        return cri("fk_game_player_game", "gamePlayerList", this, DbGamePlayerDbm.getInstance(), mp, false, "game");
    }
    /**
     * GAME_SETTING by game_id, named 'gameSettingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerGameSettingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGameId(), DbGameSettingDbm.getInstance().columnGameId());
        return cri("fk_game_setting_game", "gameSettingList", this, DbGameSettingDbm.getInstance(), mp, false, "game");
    }
    /**
     * MESSAGE by game_id, named 'messageList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMessageList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGameId(), DbMessageDbm.getInstance().columnGameId());
        return cri("fk_message_game", "messageList", this, DbMessageDbm.getInstance(), mp, false, "game");
    }
    /**
     * MESSAGE_REPLY by game_id, named 'messageReplyList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMessageReplyList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGameId(), DbMessageReplyDbm.getInstance().columnGameId());
        return cri("fk_message_reply_game", "messageReplyList", this, DbMessageReplyDbm.getInstance(), mp, false, "game");
    }
    /**
     * MESSAGE_FAVORITE by game_id, named 'messageFavoriteList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMessageFavoriteList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGameId(), DbMessageFavoriteDbm.getInstance().columnGameId());
        return cri("fk_message_favorite_game", "messageFavoriteList", this, DbMessageFavoriteDbm.getInstance(), mp, false, "game");
    }
    /**
     * DIRECT_MESSAGE by game_id, named 'directMessageList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerDirectMessageList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGameId(), DbDirectMessageDbm.getInstance().columnGameId());
        return cri("fk_direct_message_game", "directMessageList", this, DbDirectMessageDbm.getInstance(), mp, false, "game");
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
    public String getEntityTypeName() { return "dev.wolfort.dbflute.exentity.DbGame"; }
    public String getConditionBeanTypeName() { return "dev.wolfort.dbflute.cbean.DbGameCB"; }
    public String getBehaviorTypeName() { return "dev.wolfort.dbflute.exbhv.DbGameBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<DbGame> getEntityType() { return DbGame.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public DbGame newEntity() { return new DbGame(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((DbGame)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((DbGame)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
