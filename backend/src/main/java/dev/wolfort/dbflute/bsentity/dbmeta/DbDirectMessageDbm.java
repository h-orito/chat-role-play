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
 * The DB meta of direct_message. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DbDirectMessageDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DbDirectMessageDbm _instance = new DbDirectMessageDbm();
    private DbDirectMessageDbm() {}
    public static DbDirectMessageDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((DbDirectMessage)et).getDirectMessageId(), (et, vl) -> ((DbDirectMessage)et).setDirectMessageId(ctl(vl)), "directMessageId");
        setupEpg(_epgMap, et -> ((DbDirectMessage)et).getGameId(), (et, vl) -> ((DbDirectMessage)et).setGameId(cti(vl)), "gameId");
        setupEpg(_epgMap, et -> ((DbDirectMessage)et).getGamePlayerGroupId(), (et, vl) -> ((DbDirectMessage)et).setGamePlayerGroupId(cti(vl)), "gamePlayerGroupId");
        setupEpg(_epgMap, et -> ((DbDirectMessage)et).getGamePeriodId(), (et, vl) -> ((DbDirectMessage)et).setGamePeriodId(cti(vl)), "gamePeriodId");
        setupEpg(_epgMap, et -> ((DbDirectMessage)et).getFromGamePlayerId(), (et, vl) -> ((DbDirectMessage)et).setFromGamePlayerId(cti(vl)), "fromGamePlayerId");
        setupEpg(_epgMap, et -> ((DbDirectMessage)et).getFromGamePlayerName(), (et, vl) -> ((DbDirectMessage)et).setFromGamePlayerName((String)vl), "fromGamePlayerName");
        setupEpg(_epgMap, et -> ((DbDirectMessage)et).getFromGamePlayerFaceTypeCode(), (et, vl) -> ((DbDirectMessage)et).setFromGamePlayerFaceTypeCode((String)vl), "fromGamePlayerFaceTypeCode");
        setupEpg(_epgMap, et -> ((DbDirectMessage)et).getMessageContent(), (et, vl) -> ((DbDirectMessage)et).setMessageContent((String)vl), "messageContent");
        setupEpg(_epgMap, et -> ((DbDirectMessage)et).getMessageNumber(), (et, vl) -> ((DbDirectMessage)et).setMessageNumber(cti(vl)), "messageNumber");
        setupEpg(_epgMap, et -> ((DbDirectMessage)et).getMessageDatetime(), (et, vl) -> ((DbDirectMessage)et).setMessageDatetime(ctldt(vl)), "messageDatetime");
        setupEpg(_epgMap, et -> ((DbDirectMessage)et).getMessageUnixTimestampMilli(), (et, vl) -> ((DbDirectMessage)et).setMessageUnixTimestampMilli(ctl(vl)), "messageUnixTimestampMilli");
        setupEpg(_epgMap, et -> ((DbDirectMessage)et).getIsDeleted(), (et, vl) -> ((DbDirectMessage)et).setIsDeleted((Boolean)vl), "isDeleted");
        setupEpg(_epgMap, et -> ((DbDirectMessage)et).getIsConvertDisable(), (et, vl) -> ((DbDirectMessage)et).setIsConvertDisable((Boolean)vl), "isConvertDisable");
        setupEpg(_epgMap, et -> ((DbDirectMessage)et).getRegisterDatetime(), (et, vl) -> ((DbDirectMessage)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((DbDirectMessage)et).getRegisterTrace(), (et, vl) -> ((DbDirectMessage)et).setRegisterTrace((String)vl), "registerTrace");
        setupEpg(_epgMap, et -> ((DbDirectMessage)et).getUpdateDatetime(), (et, vl) -> ((DbDirectMessage)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((DbDirectMessage)et).getUpdateTrace(), (et, vl) -> ((DbDirectMessage)et).setUpdateTrace((String)vl), "updateTrace");
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
        setupEfpg(_efpgMap, et -> ((DbDirectMessage)et).getGame(), (et, vl) -> ((DbDirectMessage)et).setGame((OptionalEntity<DbGame>)vl), "game");
        setupEfpg(_efpgMap, et -> ((DbDirectMessage)et).getGamePlayerGroup(), (et, vl) -> ((DbDirectMessage)et).setGamePlayerGroup((OptionalEntity<DbGamePlayerGroup>)vl), "gamePlayerGroup");
        setupEfpg(_efpgMap, et -> ((DbDirectMessage)et).getGamePeriod(), (et, vl) -> ((DbDirectMessage)et).setGamePeriod((OptionalEntity<DbGamePeriod>)vl), "gamePeriod");
        setupEfpg(_efpgMap, et -> ((DbDirectMessage)et).getGamePlayer(), (et, vl) -> ((DbDirectMessage)et).setGamePlayer((OptionalEntity<DbGamePlayer>)vl), "gamePlayer");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "direct_message";
    protected final String _tableDispName = "DIRECT_MESSAGE";
    protected final String _tablePropertyName = "directMessage";
    protected final TableSqlName _tableSqlName = new TableSqlName("DIRECT_MESSAGE", _tableDbName);
    { _tableSqlName.xacceptFilter(DbDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDirectMessageId = cci("direct_message_id", "direct_message_id", null, null, Long.class, "directMessageId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGameId = cci("game_id", "game_id", null, null, Integer.class, "gameId", null, true, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "game", null, null, false);
    protected final ColumnInfo _columnGamePlayerGroupId = cci("game_player_group_id", "game_player_group_id", null, null, Integer.class, "gamePlayerGroupId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "gamePlayerGroup", null, null, false);
    protected final ColumnInfo _columnGamePeriodId = cci("game_period_id", "game_period_id", null, null, Integer.class, "gamePeriodId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "gamePeriod", null, null, false);
    protected final ColumnInfo _columnFromGamePlayerId = cci("from_game_player_id", "from_game_player_id", null, null, Integer.class, "fromGamePlayerId", null, false, false, false, "INT UNSIGNED", 10, 0, null, null, false, null, null, "gamePlayer", null, null, false);
    protected final ColumnInfo _columnFromGamePlayerName = cci("from_game_player_name", "from_game_player_name", null, null, String.class, "fromGamePlayerName", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromGamePlayerFaceTypeCode = cci("from_game_player_face_type_code", "from_game_player_face_type_code", null, null, String.class, "fromGamePlayerFaceTypeCode", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMessageContent = cci("message_content", "message_content", null, null, String.class, "messageContent", null, false, false, false, "VARCHAR", 10000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMessageNumber = cci("message_number", "message_number", null, null, Integer.class, "messageNumber", null, false, false, false, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMessageDatetime = cci("message_datetime", "message_datetime", null, null, java.time.LocalDateTime.class, "messageDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMessageUnixTimestampMilli = cci("message_unix_timestamp_milli", "message_unix_timestamp_milli", null, null, Long.class, "messageUnixTimestampMilli", null, false, false, true, "BIGINT UNSIGNED", 20, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIsDeleted = cci("is_deleted", "is_deleted", null, null, Boolean.class, "isDeleted", null, false, false, true, "BIT", null, null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIsConvertDisable = cci("is_convert_disable", "is_convert_disable", null, null, Boolean.class, "isConvertDisable", null, false, false, true, "BIT", null, null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterTrace = cci("register_trace", "register_trace", null, null, String.class, "registerTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateTrace = cci("update_trace", "update_trace", null, null, String.class, "updateTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);

    /**
     * direct_message_id: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDirectMessageId() { return _columnDirectMessageId; }
    /**
     * game_id: {PK, UQ+, NotNull, INT UNSIGNED(10), FK to game}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGameId() { return _columnGameId; }
    /**
     * game_player_group_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to game_player_group}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGamePlayerGroupId() { return _columnGamePlayerGroupId; }
    /**
     * game_period_id: {IX, NotNull, INT UNSIGNED(10), FK to game_period}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGamePeriodId() { return _columnGamePeriodId; }
    /**
     * from_game_player_id: {IX, INT UNSIGNED(10), FK to game_player}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromGamePlayerId() { return _columnFromGamePlayerId; }
    /**
     * from_game_player_name: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromGamePlayerName() { return _columnFromGamePlayerName; }
    /**
     * from_game_player_face_type_code: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromGamePlayerFaceTypeCode() { return _columnFromGamePlayerFaceTypeCode; }
    /**
     * message_content: {VARCHAR(10000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMessageContent() { return _columnMessageContent; }
    /**
     * message_number: {+UQ, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMessageNumber() { return _columnMessageNumber; }
    /**
     * message_datetime: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMessageDatetime() { return _columnMessageDatetime; }
    /**
     * message_unix_timestamp_milli: {NotNull, BIGINT UNSIGNED(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMessageUnixTimestampMilli() { return _columnMessageUnixTimestampMilli; }
    /**
     * is_deleted: {NotNull, BIT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIsDeleted() { return _columnIsDeleted; }
    /**
     * is_convert_disable: {NotNull, BIT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIsConvertDisable() { return _columnIsConvertDisable; }
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
        ls.add(columnDirectMessageId());
        ls.add(columnGameId());
        ls.add(columnGamePlayerGroupId());
        ls.add(columnGamePeriodId());
        ls.add(columnFromGamePlayerId());
        ls.add(columnFromGamePlayerName());
        ls.add(columnFromGamePlayerFaceTypeCode());
        ls.add(columnMessageContent());
        ls.add(columnMessageNumber());
        ls.add(columnMessageDatetime());
        ls.add(columnMessageUnixTimestampMilli());
        ls.add(columnIsDeleted());
        ls.add(columnIsConvertDisable());
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
        ls.add(columnDirectMessageId());
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
        ls.add(columnGamePlayerGroupId());
        ls.add(columnMessageNumber());
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
        return cfi("fk_direct_message_game", "game", this, DbGameDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "directMessageList", false);
    }
    /**
     * GAME_PLAYER_GROUP by my game_player_group_id, named 'gamePlayerGroup'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignGamePlayerGroup() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGamePlayerGroupId(), DbGamePlayerGroupDbm.getInstance().columnGamePlayerGroupId());
        return cfi("fk_direct_message_game_player_group", "gamePlayerGroup", this, DbGamePlayerGroupDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "directMessageList", false);
    }
    /**
     * GAME_PERIOD by my game_period_id, named 'gamePeriod'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignGamePeriod() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGamePeriodId(), DbGamePeriodDbm.getInstance().columnGamePeriodId());
        return cfi("fk_direct_message_game_period", "gamePeriod", this, DbGamePeriodDbm.getInstance(), mp, 2, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "directMessageList", false);
    }
    /**
     * GAME_PLAYER by my from_game_player_id, named 'gamePlayer'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignGamePlayer() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFromGamePlayerId(), DbGamePlayerDbm.getInstance().columnGamePlayerId());
        return cfi("fk_direct_message_from_game_player", "gamePlayer", this, DbGamePlayerDbm.getInstance(), mp, 3, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "directMessageList", false);
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
    public String getEntityTypeName() { return "dev.wolfort.dbflute.exentity.DbDirectMessage"; }
    public String getConditionBeanTypeName() { return "dev.wolfort.dbflute.cbean.DbDirectMessageCB"; }
    public String getBehaviorTypeName() { return "dev.wolfort.dbflute.exbhv.DbDirectMessageBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<DbDirectMessage> getEntityType() { return DbDirectMessage.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public DbDirectMessage newEntity() { return new DbDirectMessage(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((DbDirectMessage)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((DbDirectMessage)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
