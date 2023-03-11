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
 * The DB meta of message. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DbMessageDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DbMessageDbm _instance = new DbMessageDbm();
    private DbMessageDbm() {}
    public static DbMessageDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((DbMessage)et).getMessageId(), (et, vl) -> ((DbMessage)et).setMessageId(ctl(vl)), "messageId");
        setupEpg(_epgMap, et -> ((DbMessage)et).getGameId(), (et, vl) -> ((DbMessage)et).setGameId(cti(vl)), "gameId");
        setupEpg(_epgMap, et -> ((DbMessage)et).getMessageTypeCode(), (et, vl) -> ((DbMessage)et).setMessageTypeCode((String)vl), "messageTypeCode");
        setupEpg(_epgMap, et -> ((DbMessage)et).getGamePeriodId(), (et, vl) -> ((DbMessage)et).setGamePeriodId(cti(vl)), "gamePeriodId");
        setupEpg(_epgMap, et -> ((DbMessage)et).getFromGamePlayerId(), (et, vl) -> ((DbMessage)et).setFromGamePlayerId(cti(vl)), "fromGamePlayerId");
        setupEpg(_epgMap, et -> ((DbMessage)et).getFromGamePlayerName(), (et, vl) -> ((DbMessage)et).setFromGamePlayerName((String)vl), "fromGamePlayerName");
        setupEpg(_epgMap, et -> ((DbMessage)et).getFromGamePlayerFaceTypeCode(), (et, vl) -> ((DbMessage)et).setFromGamePlayerFaceTypeCode((String)vl), "fromGamePlayerFaceTypeCode");
        setupEpg(_epgMap, et -> ((DbMessage)et).getMessageContent(), (et, vl) -> ((DbMessage)et).setMessageContent((String)vl), "messageContent");
        setupEpg(_epgMap, et -> ((DbMessage)et).getMessageNumber(), (et, vl) -> ((DbMessage)et).setMessageNumber(cti(vl)), "messageNumber");
        setupEpg(_epgMap, et -> ((DbMessage)et).getMessageDatetime(), (et, vl) -> ((DbMessage)et).setMessageDatetime(ctldt(vl)), "messageDatetime");
        setupEpg(_epgMap, et -> ((DbMessage)et).getMessageUnixTimestampMilli(), (et, vl) -> ((DbMessage)et).setMessageUnixTimestampMilli(ctl(vl)), "messageUnixTimestampMilli");
        setupEpg(_epgMap, et -> ((DbMessage)et).getIsDeleted(), (et, vl) -> ((DbMessage)et).setIsDeleted((Boolean)vl), "isDeleted");
        setupEpg(_epgMap, et -> ((DbMessage)et).getIsConvertDisable(), (et, vl) -> ((DbMessage)et).setIsConvertDisable((Boolean)vl), "isConvertDisable");
        setupEpg(_epgMap, et -> ((DbMessage)et).getRepliedCount(), (et, vl) -> ((DbMessage)et).setRepliedCount(cti(vl)), "repliedCount");
        setupEpg(_epgMap, et -> ((DbMessage)et).getFavoredCount(), (et, vl) -> ((DbMessage)et).setFavoredCount(cti(vl)), "favoredCount");
        setupEpg(_epgMap, et -> ((DbMessage)et).getRegisterDatetime(), (et, vl) -> ((DbMessage)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((DbMessage)et).getRegisterTrace(), (et, vl) -> ((DbMessage)et).setRegisterTrace((String)vl), "registerTrace");
        setupEpg(_epgMap, et -> ((DbMessage)et).getUpdateDatetime(), (et, vl) -> ((DbMessage)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((DbMessage)et).getUpdateTrace(), (et, vl) -> ((DbMessage)et).setUpdateTrace((String)vl), "updateTrace");
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
        setupEfpg(_efpgMap, et -> ((DbMessage)et).getGame(), (et, vl) -> ((DbMessage)et).setGame((OptionalEntity<DbGame>)vl), "game");
        setupEfpg(_efpgMap, et -> ((DbMessage)et).getGamePeriod(), (et, vl) -> ((DbMessage)et).setGamePeriod((OptionalEntity<DbGamePeriod>)vl), "gamePeriod");
        setupEfpg(_efpgMap, et -> ((DbMessage)et).getGamePlayer(), (et, vl) -> ((DbMessage)et).setGamePlayer((OptionalEntity<DbGamePlayer>)vl), "gamePlayer");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "message";
    protected final String _tableDispName = "MESSAGE";
    protected final String _tablePropertyName = "message";
    protected final TableSqlName _tableSqlName = new TableSqlName("MESSAGE", _tableDbName);
    { _tableSqlName.xacceptFilter(DbDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMessageId = cci("message_id", "message_id", null, null, Long.class, "messageId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, "messageReplyByFromMessageIdList,messageReplyByReplyMessageIdList,messageFavoriteList", null, false);
    protected final ColumnInfo _columnGameId = cci("game_id", "game_id", null, null, Integer.class, "gameId", null, true, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "game", null, null, false);
    protected final ColumnInfo _columnMessageTypeCode = cci("message_type_code", "message_type_code", null, null, String.class, "messageTypeCode", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
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
    protected final ColumnInfo _columnRepliedCount = cci("replied_count", "replied_count", null, null, Integer.class, "repliedCount", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFavoredCount = cci("favored_count", "favored_count", null, null, Integer.class, "favoredCount", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterTrace = cci("register_trace", "register_trace", null, null, String.class, "registerTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateTrace = cci("update_trace", "update_trace", null, null, String.class, "updateTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);

    /**
     * message_id: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMessageId() { return _columnMessageId; }
    /**
     * game_id: {PK, UQ+, NotNull, INT UNSIGNED(10), FK to game}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGameId() { return _columnGameId; }
    /**
     * message_type_code: {+UQ, NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMessageTypeCode() { return _columnMessageTypeCode; }
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
     * replied_count: {NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRepliedCount() { return _columnRepliedCount; }
    /**
     * favored_count: {NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFavoredCount() { return _columnFavoredCount; }
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
        ls.add(columnMessageId());
        ls.add(columnGameId());
        ls.add(columnMessageTypeCode());
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
        ls.add(columnRepliedCount());
        ls.add(columnFavoredCount());
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
        ls.add(columnMessageId());
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
        ls.add(columnMessageTypeCode());
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
        return cfi("fk_message_game", "game", this, DbGameDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "messageList", false);
    }
    /**
     * GAME_PERIOD by my game_period_id, named 'gamePeriod'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignGamePeriod() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGamePeriodId(), DbGamePeriodDbm.getInstance().columnGamePeriodId());
        return cfi("fk_message_game_period", "gamePeriod", this, DbGamePeriodDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "messageList", false);
    }
    /**
     * GAME_PLAYER by my from_game_player_id, named 'gamePlayer'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignGamePlayer() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFromGamePlayerId(), DbGamePlayerDbm.getInstance().columnGamePlayerId());
        return cfi("fk_message_game_player", "gamePlayer", this, DbGamePlayerDbm.getInstance(), mp, 2, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "messageList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * MESSAGE_REPLY by from_message_id, named 'messageReplyByFromMessageIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMessageReplyByFromMessageIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMessageId(), DbMessageReplyDbm.getInstance().columnFromMessageId());
        return cri("fk_message_reply_from_message", "messageReplyByFromMessageIdList", this, DbMessageReplyDbm.getInstance(), mp, false, "messageByFromMessageId");
    }
    /**
     * MESSAGE_REPLY by reply_message_id, named 'messageReplyByReplyMessageIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMessageReplyByReplyMessageIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMessageId(), DbMessageReplyDbm.getInstance().columnReplyMessageId());
        return cri("fk_message_reply_reply_message", "messageReplyByReplyMessageIdList", this, DbMessageReplyDbm.getInstance(), mp, false, "messageByReplyMessageId");
    }
    /**
     * MESSAGE_FAVORITE by message_id, named 'messageFavoriteList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMessageFavoriteList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMessageId(), DbMessageFavoriteDbm.getInstance().columnMessageId());
        return cri("fk_message_favorite_message", "messageFavoriteList", this, DbMessageFavoriteDbm.getInstance(), mp, false, "message");
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
    public String getEntityTypeName() { return "dev.wolfort.dbflute.exentity.DbMessage"; }
    public String getConditionBeanTypeName() { return "dev.wolfort.dbflute.cbean.DbMessageCB"; }
    public String getBehaviorTypeName() { return "dev.wolfort.dbflute.exbhv.DbMessageBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<DbMessage> getEntityType() { return DbMessage.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public DbMessage newEntity() { return new DbMessage(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((DbMessage)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((DbMessage)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
