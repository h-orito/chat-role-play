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
 * The DB meta of message_reply. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DbMessageReplyDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DbMessageReplyDbm _instance = new DbMessageReplyDbm();
    private DbMessageReplyDbm() {}
    public static DbMessageReplyDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((DbMessageReply)et).getMessageReplyId(), (et, vl) -> ((DbMessageReply)et).setMessageReplyId(ctl(vl)), "messageReplyId");
        setupEpg(_epgMap, et -> ((DbMessageReply)et).getGameId(), (et, vl) -> ((DbMessageReply)et).setGameId(cti(vl)), "gameId");
        setupEpg(_epgMap, et -> ((DbMessageReply)et).getFromMessageId(), (et, vl) -> ((DbMessageReply)et).setFromMessageId(ctl(vl)), "fromMessageId");
        setupEpg(_epgMap, et -> ((DbMessageReply)et).getReplyMessageId(), (et, vl) -> ((DbMessageReply)et).setReplyMessageId(ctl(vl)), "replyMessageId");
        setupEpg(_epgMap, et -> ((DbMessageReply)et).getRegisterDatetime(), (et, vl) -> ((DbMessageReply)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((DbMessageReply)et).getRegisterTrace(), (et, vl) -> ((DbMessageReply)et).setRegisterTrace((String)vl), "registerTrace");
        setupEpg(_epgMap, et -> ((DbMessageReply)et).getUpdateDatetime(), (et, vl) -> ((DbMessageReply)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((DbMessageReply)et).getUpdateTrace(), (et, vl) -> ((DbMessageReply)et).setUpdateTrace((String)vl), "updateTrace");
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
        setupEfpg(_efpgMap, et -> ((DbMessageReply)et).getGame(), (et, vl) -> ((DbMessageReply)et).setGame((OptionalEntity<DbGame>)vl), "game");
        setupEfpg(_efpgMap, et -> ((DbMessageReply)et).getMessageByFromMessageId(), (et, vl) -> ((DbMessageReply)et).setMessageByFromMessageId((OptionalEntity<DbMessage>)vl), "messageByFromMessageId");
        setupEfpg(_efpgMap, et -> ((DbMessageReply)et).getMessageByReplyMessageId(), (et, vl) -> ((DbMessageReply)et).setMessageByReplyMessageId((OptionalEntity<DbMessage>)vl), "messageByReplyMessageId");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "message_reply";
    protected final String _tableDispName = "MESSAGE_REPLY";
    protected final String _tablePropertyName = "messageReply";
    protected final TableSqlName _tableSqlName = new TableSqlName("MESSAGE_REPLY", _tableDbName);
    { _tableSqlName.xacceptFilter(DbDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMessageReplyId = cci("message_reply_id", "message_reply_id", null, null, Long.class, "messageReplyId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGameId = cci("game_id", "game_id", null, null, Integer.class, "gameId", null, true, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "game", null, null, false);
    protected final ColumnInfo _columnFromMessageId = cci("from_message_id", "from_message_id", null, null, Long.class, "fromMessageId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "messageByFromMessageId", null, null, false);
    protected final ColumnInfo _columnReplyMessageId = cci("reply_message_id", "reply_message_id", null, null, Long.class, "replyMessageId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "messageByReplyMessageId", null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterTrace = cci("register_trace", "register_trace", null, null, String.class, "registerTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateTrace = cci("update_trace", "update_trace", null, null, String.class, "updateTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);

    /**
     * message_reply_id: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMessageReplyId() { return _columnMessageReplyId; }
    /**
     * game_id: {PK, IX, NotNull, INT UNSIGNED(10), FK to game}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGameId() { return _columnGameId; }
    /**
     * from_message_id: {IX, NotNull, BIGINT(19), FK to message}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromMessageId() { return _columnFromMessageId; }
    /**
     * reply_message_id: {IX, NotNull, BIGINT(19), FK to message}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplyMessageId() { return _columnReplyMessageId; }
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
        ls.add(columnMessageReplyId());
        ls.add(columnGameId());
        ls.add(columnFromMessageId());
        ls.add(columnReplyMessageId());
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
        ls.add(columnMessageReplyId());
        ls.add(columnGameId());
        return hpcpui(ls);
    }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return true; }

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
        return cfi("fk_message_reply_game", "game", this, DbGameDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "messageReplyList", false);
    }
    /**
     * MESSAGE by my from_message_id, named 'messageByFromMessageId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMessageByFromMessageId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFromMessageId(), DbMessageDbm.getInstance().columnMessageId());
        return cfi("fk_message_reply_from_message", "messageByFromMessageId", this, DbMessageDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "messageReplyByFromMessageIdList", false);
    }
    /**
     * MESSAGE by my reply_message_id, named 'messageByReplyMessageId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMessageByReplyMessageId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReplyMessageId(), DbMessageDbm.getInstance().columnMessageId());
        return cfi("fk_message_reply_reply_message", "messageByReplyMessageId", this, DbMessageDbm.getInstance(), mp, 2, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "messageReplyByReplyMessageIdList", false);
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
    public String getEntityTypeName() { return "dev.wolfort.dbflute.exentity.DbMessageReply"; }
    public String getConditionBeanTypeName() { return "dev.wolfort.dbflute.cbean.DbMessageReplyCB"; }
    public String getBehaviorTypeName() { return "dev.wolfort.dbflute.exbhv.DbMessageReplyBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<DbMessageReply> getEntityType() { return DbMessageReply.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public DbMessageReply newEntity() { return new DbMessageReply(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((DbMessageReply)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((DbMessageReply)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
