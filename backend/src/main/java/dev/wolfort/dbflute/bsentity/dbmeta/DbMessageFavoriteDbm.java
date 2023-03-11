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
 * The DB meta of message_favorite. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DbMessageFavoriteDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DbMessageFavoriteDbm _instance = new DbMessageFavoriteDbm();
    private DbMessageFavoriteDbm() {}
    public static DbMessageFavoriteDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((DbMessageFavorite)et).getMessageFavoriteId(), (et, vl) -> ((DbMessageFavorite)et).setMessageFavoriteId(ctl(vl)), "messageFavoriteId");
        setupEpg(_epgMap, et -> ((DbMessageFavorite)et).getGameId(), (et, vl) -> ((DbMessageFavorite)et).setGameId(cti(vl)), "gameId");
        setupEpg(_epgMap, et -> ((DbMessageFavorite)et).getMessageId(), (et, vl) -> ((DbMessageFavorite)et).setMessageId(ctl(vl)), "messageId");
        setupEpg(_epgMap, et -> ((DbMessageFavorite)et).getGamePlayerId(), (et, vl) -> ((DbMessageFavorite)et).setGamePlayerId(cti(vl)), "gamePlayerId");
        setupEpg(_epgMap, et -> ((DbMessageFavorite)et).getRegisterDatetime(), (et, vl) -> ((DbMessageFavorite)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((DbMessageFavorite)et).getRegisterTrace(), (et, vl) -> ((DbMessageFavorite)et).setRegisterTrace((String)vl), "registerTrace");
        setupEpg(_epgMap, et -> ((DbMessageFavorite)et).getUpdateDatetime(), (et, vl) -> ((DbMessageFavorite)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((DbMessageFavorite)et).getUpdateTrace(), (et, vl) -> ((DbMessageFavorite)et).setUpdateTrace((String)vl), "updateTrace");
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
        setupEfpg(_efpgMap, et -> ((DbMessageFavorite)et).getGame(), (et, vl) -> ((DbMessageFavorite)et).setGame((OptionalEntity<DbGame>)vl), "game");
        setupEfpg(_efpgMap, et -> ((DbMessageFavorite)et).getMessage(), (et, vl) -> ((DbMessageFavorite)et).setMessage((OptionalEntity<DbMessage>)vl), "message");
        setupEfpg(_efpgMap, et -> ((DbMessageFavorite)et).getGamePlayer(), (et, vl) -> ((DbMessageFavorite)et).setGamePlayer((OptionalEntity<DbGamePlayer>)vl), "gamePlayer");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "message_favorite";
    protected final String _tableDispName = "MESSAGE_FAVORITE";
    protected final String _tablePropertyName = "messageFavorite";
    protected final TableSqlName _tableSqlName = new TableSqlName("MESSAGE_FAVORITE", _tableDbName);
    { _tableSqlName.xacceptFilter(DbDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMessageFavoriteId = cci("message_favorite_id", "message_favorite_id", null, null, Long.class, "messageFavoriteId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGameId = cci("game_id", "game_id", null, null, Integer.class, "gameId", null, true, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "game", null, null, false);
    protected final ColumnInfo _columnMessageId = cci("message_id", "message_id", null, null, Long.class, "messageId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "message", null, null, false);
    protected final ColumnInfo _columnGamePlayerId = cci("game_player_id", "game_player_id", null, null, Integer.class, "gamePlayerId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "gamePlayer", null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterTrace = cci("register_trace", "register_trace", null, null, String.class, "registerTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateTrace = cci("update_trace", "update_trace", null, null, String.class, "updateTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);

    /**
     * message_favorite_id: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMessageFavoriteId() { return _columnMessageFavoriteId; }
    /**
     * game_id: {PK, UQ+, NotNull, INT UNSIGNED(10), FK to game}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGameId() { return _columnGameId; }
    /**
     * message_id: {+UQ, IX, NotNull, BIGINT(19), FK to message}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMessageId() { return _columnMessageId; }
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
        ls.add(columnMessageFavoriteId());
        ls.add(columnGameId());
        ls.add(columnMessageId());
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
    protected UniqueInfo cpui() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnMessageFavoriteId());
        ls.add(columnGameId());
        return hpcpui(ls);
    }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return true; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnGameId());
        ls.add(columnMessageId());
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
     * GAME by my game_id, named 'game'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignGame() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGameId(), DbGameDbm.getInstance().columnGameId());
        return cfi("fk_message_favorite_game", "game", this, DbGameDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "messageFavoriteList", false);
    }
    /**
     * MESSAGE by my message_id, named 'message'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMessage() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMessageId(), DbMessageDbm.getInstance().columnMessageId());
        return cfi("fk_message_favorite_message", "message", this, DbMessageDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "messageFavoriteList", false);
    }
    /**
     * GAME_PLAYER by my game_player_id, named 'gamePlayer'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignGamePlayer() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGamePlayerId(), DbGamePlayerDbm.getInstance().columnGamePlayerId());
        return cfi("fk_message_favorite_game_player", "gamePlayer", this, DbGamePlayerDbm.getInstance(), mp, 2, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "messageFavoriteList", false);
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
    public String getEntityTypeName() { return "dev.wolfort.dbflute.exentity.DbMessageFavorite"; }
    public String getConditionBeanTypeName() { return "dev.wolfort.dbflute.cbean.DbMessageFavoriteCB"; }
    public String getBehaviorTypeName() { return "dev.wolfort.dbflute.exbhv.DbMessageFavoriteBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<DbMessageFavorite> getEntityType() { return DbMessageFavorite.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public DbMessageFavorite newEntity() { return new DbMessageFavorite(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((DbMessageFavorite)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((DbMessageFavorite)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
