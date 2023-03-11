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
 * The DB meta of game_player. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DbGamePlayerDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DbGamePlayerDbm _instance = new DbGamePlayerDbm();
    private DbGamePlayerDbm() {}
    public static DbGamePlayerDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((DbGamePlayer)et).getGamePlayerId(), (et, vl) -> ((DbGamePlayer)et).setGamePlayerId(cti(vl)), "gamePlayerId");
        setupEpg(_epgMap, et -> ((DbGamePlayer)et).getGameId(), (et, vl) -> ((DbGamePlayer)et).setGameId(cti(vl)), "gameId");
        setupEpg(_epgMap, et -> ((DbGamePlayer)et).getPlayerId(), (et, vl) -> ((DbGamePlayer)et).setPlayerId(cti(vl)), "playerId");
        setupEpg(_epgMap, et -> ((DbGamePlayer)et).getGamePlayerName(), (et, vl) -> ((DbGamePlayer)et).setGamePlayerName((String)vl), "gamePlayerName");
        setupEpg(_epgMap, et -> ((DbGamePlayer)et).getCharaId(), (et, vl) -> ((DbGamePlayer)et).setCharaId(cti(vl)), "charaId");
        setupEpg(_epgMap, et -> ((DbGamePlayer)et).getIsDeleted(), (et, vl) -> ((DbGamePlayer)et).setIsDeleted((Boolean)vl), "isDeleted");
        setupEpg(_epgMap, et -> ((DbGamePlayer)et).getRegisterDatetime(), (et, vl) -> ((DbGamePlayer)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((DbGamePlayer)et).getRegisterTrace(), (et, vl) -> ((DbGamePlayer)et).setRegisterTrace((String)vl), "registerTrace");
        setupEpg(_epgMap, et -> ((DbGamePlayer)et).getUpdateDatetime(), (et, vl) -> ((DbGamePlayer)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((DbGamePlayer)et).getUpdateTrace(), (et, vl) -> ((DbGamePlayer)et).setUpdateTrace((String)vl), "updateTrace");
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
        setupEfpg(_efpgMap, et -> ((DbGamePlayer)et).getChara(), (et, vl) -> ((DbGamePlayer)et).setChara((OptionalEntity<DbChara>)vl), "chara");
        setupEfpg(_efpgMap, et -> ((DbGamePlayer)et).getGame(), (et, vl) -> ((DbGamePlayer)et).setGame((OptionalEntity<DbGame>)vl), "game");
        setupEfpg(_efpgMap, et -> ((DbGamePlayer)et).getPlayer(), (et, vl) -> ((DbGamePlayer)et).setPlayer((OptionalEntity<DbPlayer>)vl), "player");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "game_player";
    protected final String _tableDispName = "GAME_PLAYER";
    protected final String _tablePropertyName = "gamePlayer";
    protected final TableSqlName _tableSqlName = new TableSqlName("GAME_PLAYER", _tableDbName);
    { _tableSqlName.xacceptFilter(DbDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnGamePlayerId = cci("game_player_id", "game_player_id", null, null, Integer.class, "gamePlayerId", null, true, true, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, "gamePlayerGroupRelList,messageList,messageFavoriteList,directMessageList", null, false);
    protected final ColumnInfo _columnGameId = cci("game_id", "game_id", null, null, Integer.class, "gameId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "game", null, null, false);
    protected final ColumnInfo _columnPlayerId = cci("player_id", "player_id", null, null, Integer.class, "playerId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "player", null, null, false);
    protected final ColumnInfo _columnGamePlayerName = cci("game_player_name", "game_player_name", null, null, String.class, "gamePlayerName", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCharaId = cci("chara_id", "chara_id", null, null, Integer.class, "charaId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "chara", null, null, false);
    protected final ColumnInfo _columnIsDeleted = cci("is_deleted", "is_deleted", null, null, Boolean.class, "isDeleted", null, false, false, true, "BIT", null, null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterTrace = cci("register_trace", "register_trace", null, null, String.class, "registerTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateTrace = cci("update_trace", "update_trace", null, null, String.class, "updateTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);

    /**
     * game_player_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGamePlayerId() { return _columnGamePlayerId; }
    /**
     * game_id: {UQ+, NotNull, INT UNSIGNED(10), FK to game}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGameId() { return _columnGameId; }
    /**
     * player_id: {IX, NotNull, INT UNSIGNED(10), FK to player}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlayerId() { return _columnPlayerId; }
    /**
     * game_player_name: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGamePlayerName() { return _columnGamePlayerName; }
    /**
     * chara_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to chara}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCharaId() { return _columnCharaId; }
    /**
     * is_deleted: {+UQ, NotNull, BIT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIsDeleted() { return _columnIsDeleted; }
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
        ls.add(columnGamePlayerId());
        ls.add(columnGameId());
        ls.add(columnPlayerId());
        ls.add(columnGamePlayerName());
        ls.add(columnCharaId());
        ls.add(columnIsDeleted());
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
    protected UniqueInfo cpui() { return hpcpui(columnGamePlayerId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnGameId());
        ls.add(columnCharaId());
        ls.add(columnIsDeleted());
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
     * CHARA by my chara_id, named 'chara'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignChara() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCharaId(), DbCharaDbm.getInstance().columnCharaId());
        return cfi("fk_game_player_chara", "chara", this, DbCharaDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "gamePlayerList", false);
    }
    /**
     * GAME by my game_id, named 'game'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignGame() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGameId(), DbGameDbm.getInstance().columnGameId());
        return cfi("fk_game_player_game", "game", this, DbGameDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "gamePlayerList", false);
    }
    /**
     * PLAYER by my player_id, named 'player'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPlayer() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPlayerId(), DbPlayerDbm.getInstance().columnPlayerId());
        return cfi("fk_game_player_player", "player", this, DbPlayerDbm.getInstance(), mp, 2, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "gamePlayerList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * GAME_PLAYER_GROUP_REL by game_player_id, named 'gamePlayerGroupRelList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerGamePlayerGroupRelList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGamePlayerId(), DbGamePlayerGroupRelDbm.getInstance().columnGamePlayerId());
        return cri("fk_game_player_group_rel_game_player", "gamePlayerGroupRelList", this, DbGamePlayerGroupRelDbm.getInstance(), mp, false, "gamePlayer");
    }
    /**
     * MESSAGE by from_game_player_id, named 'messageList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMessageList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGamePlayerId(), DbMessageDbm.getInstance().columnFromGamePlayerId());
        return cri("fk_message_game_player", "messageList", this, DbMessageDbm.getInstance(), mp, false, "gamePlayer");
    }
    /**
     * MESSAGE_FAVORITE by game_player_id, named 'messageFavoriteList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMessageFavoriteList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGamePlayerId(), DbMessageFavoriteDbm.getInstance().columnGamePlayerId());
        return cri("fk_message_favorite_game_player", "messageFavoriteList", this, DbMessageFavoriteDbm.getInstance(), mp, false, "gamePlayer");
    }
    /**
     * DIRECT_MESSAGE by from_game_player_id, named 'directMessageList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerDirectMessageList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGamePlayerId(), DbDirectMessageDbm.getInstance().columnFromGamePlayerId());
        return cri("fk_direct_message_from_game_player", "directMessageList", this, DbDirectMessageDbm.getInstance(), mp, false, "gamePlayer");
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
    public String getEntityTypeName() { return "dev.wolfort.dbflute.exentity.DbGamePlayer"; }
    public String getConditionBeanTypeName() { return "dev.wolfort.dbflute.cbean.DbGamePlayerCB"; }
    public String getBehaviorTypeName() { return "dev.wolfort.dbflute.exbhv.DbGamePlayerBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<DbGamePlayer> getEntityType() { return DbGamePlayer.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public DbGamePlayer newEntity() { return new DbGamePlayer(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((DbGamePlayer)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((DbGamePlayer)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
