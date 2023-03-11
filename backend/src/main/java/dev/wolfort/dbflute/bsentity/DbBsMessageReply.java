package dev.wolfort.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import dev.wolfort.dbflute.allcommon.DbEntityDefinedCommonColumn;
import dev.wolfort.dbflute.allcommon.DbDBMetaInstanceHandler;
import dev.wolfort.dbflute.exentity.*;

/**
 * The entity of MESSAGE_REPLY as TABLE. <br>
 * <pre>
 * [primary-key]
 *     message_reply_id, game_id
 *
 * [column]
 *     message_reply_id, game_id, from_message_id, reply_message_id, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     message_reply_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     GAME, MESSAGE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     game, messageByFromMessageId, messageByReplyMessageId
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long messageReplyId = entity.getMessageReplyId();
 * Integer gameId = entity.getGameId();
 * Long fromMessageId = entity.getFromMessageId();
 * Long replyMessageId = entity.getReplyMessageId();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setMessageReplyId(messageReplyId);
 * entity.setGameId(gameId);
 * entity.setFromMessageId(fromMessageId);
 * entity.setReplyMessageId(replyMessageId);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsMessageReply extends AbstractEntity implements DomainEntity, DbEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** message_reply_id: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _messageReplyId;

    /** game_id: {PK, IX, NotNull, INT UNSIGNED(10), FK to game} */
    protected Integer _gameId;

    /** from_message_id: {IX, NotNull, BIGINT(19), FK to message} */
    protected Long _fromMessageId;

    /** reply_message_id: {IX, NotNull, BIGINT(19), FK to message} */
    protected Long _replyMessageId;

    /** register_datetime: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _registerDatetime;

    /** register_trace: {NotNull, VARCHAR(64)} */
    protected String _registerTrace;

    /** update_datetime: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _updateDatetime;

    /** update_trace: {NotNull, VARCHAR(64)} */
    protected String _updateTrace;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DbDBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "message_reply";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_messageReplyId == null) { return false; }
        if (_gameId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** GAME by my game_id, named 'game'. */
    protected OptionalEntity<DbGame> _game;

    /**
     * [get] GAME by my game_id, named 'game'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'game'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<DbGame> getGame() {
        if (_game == null) { _game = OptionalEntity.relationEmpty(this, "game"); }
        return _game;
    }

    /**
     * [set] GAME by my game_id, named 'game'.
     * @param game The entity of foreign property 'game'. (NullAllowed)
     */
    public void setGame(OptionalEntity<DbGame> game) {
        _game = game;
    }

    /** MESSAGE by my from_message_id, named 'messageByFromMessageId'. */
    protected OptionalEntity<DbMessage> _messageByFromMessageId;

    /**
     * [get] MESSAGE by my from_message_id, named 'messageByFromMessageId'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'messageByFromMessageId'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<DbMessage> getMessageByFromMessageId() {
        if (_messageByFromMessageId == null) { _messageByFromMessageId = OptionalEntity.relationEmpty(this, "messageByFromMessageId"); }
        return _messageByFromMessageId;
    }

    /**
     * [set] MESSAGE by my from_message_id, named 'messageByFromMessageId'.
     * @param messageByFromMessageId The entity of foreign property 'messageByFromMessageId'. (NullAllowed)
     */
    public void setMessageByFromMessageId(OptionalEntity<DbMessage> messageByFromMessageId) {
        _messageByFromMessageId = messageByFromMessageId;
    }

    /** MESSAGE by my reply_message_id, named 'messageByReplyMessageId'. */
    protected OptionalEntity<DbMessage> _messageByReplyMessageId;

    /**
     * [get] MESSAGE by my reply_message_id, named 'messageByReplyMessageId'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'messageByReplyMessageId'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<DbMessage> getMessageByReplyMessageId() {
        if (_messageByReplyMessageId == null) { _messageByReplyMessageId = OptionalEntity.relationEmpty(this, "messageByReplyMessageId"); }
        return _messageByReplyMessageId;
    }

    /**
     * [set] MESSAGE by my reply_message_id, named 'messageByReplyMessageId'.
     * @param messageByReplyMessageId The entity of foreign property 'messageByReplyMessageId'. (NullAllowed)
     */
    public void setMessageByReplyMessageId(OptionalEntity<DbMessage> messageByReplyMessageId) {
        _messageByReplyMessageId = messageByReplyMessageId;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof DbBsMessageReply) {
            DbBsMessageReply other = (DbBsMessageReply)obj;
            if (!xSV(_messageReplyId, other._messageReplyId)) { return false; }
            if (!xSV(_gameId, other._gameId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _messageReplyId);
        hs = xCH(hs, _gameId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_game != null && _game.isPresent())
        { sb.append(li).append(xbRDS(_game, "game")); }
        if (_messageByFromMessageId != null && _messageByFromMessageId.isPresent())
        { sb.append(li).append(xbRDS(_messageByFromMessageId, "messageByFromMessageId")); }
        if (_messageByReplyMessageId != null && _messageByReplyMessageId.isPresent())
        { sb.append(li).append(xbRDS(_messageByReplyMessageId, "messageByReplyMessageId")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_messageReplyId));
        sb.append(dm).append(xfND(_gameId));
        sb.append(dm).append(xfND(_fromMessageId));
        sb.append(dm).append(xfND(_replyMessageId));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerTrace));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateTrace));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_game != null && _game.isPresent())
        { sb.append(dm).append("game"); }
        if (_messageByFromMessageId != null && _messageByFromMessageId.isPresent())
        { sb.append(dm).append("messageByFromMessageId"); }
        if (_messageByReplyMessageId != null && _messageByReplyMessageId.isPresent())
        { sb.append(dm).append("messageByReplyMessageId"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DbMessageReply clone() {
        return (DbMessageReply)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] message_reply_id: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'message_reply_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getMessageReplyId() {
        checkSpecifiedProperty("messageReplyId");
        return _messageReplyId;
    }

    /**
     * [set] message_reply_id: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param messageReplyId The value of the column 'message_reply_id'. (basically NotNull if update: for the constraint)
     */
    public void setMessageReplyId(Long messageReplyId) {
        registerModifiedProperty("messageReplyId");
        _messageReplyId = messageReplyId;
    }

    /**
     * [get] game_id: {PK, IX, NotNull, INT UNSIGNED(10), FK to game} <br>
     * @return The value of the column 'game_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getGameId() {
        checkSpecifiedProperty("gameId");
        return _gameId;
    }

    /**
     * [set] game_id: {PK, IX, NotNull, INT UNSIGNED(10), FK to game} <br>
     * @param gameId The value of the column 'game_id'. (basically NotNull if update: for the constraint)
     */
    public void setGameId(Integer gameId) {
        registerModifiedProperty("gameId");
        _gameId = gameId;
    }

    /**
     * [get] from_message_id: {IX, NotNull, BIGINT(19), FK to message} <br>
     * @return The value of the column 'from_message_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getFromMessageId() {
        checkSpecifiedProperty("fromMessageId");
        return _fromMessageId;
    }

    /**
     * [set] from_message_id: {IX, NotNull, BIGINT(19), FK to message} <br>
     * @param fromMessageId The value of the column 'from_message_id'. (basically NotNull if update: for the constraint)
     */
    public void setFromMessageId(Long fromMessageId) {
        registerModifiedProperty("fromMessageId");
        _fromMessageId = fromMessageId;
    }

    /**
     * [get] reply_message_id: {IX, NotNull, BIGINT(19), FK to message} <br>
     * @return The value of the column 'reply_message_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getReplyMessageId() {
        checkSpecifiedProperty("replyMessageId");
        return _replyMessageId;
    }

    /**
     * [set] reply_message_id: {IX, NotNull, BIGINT(19), FK to message} <br>
     * @param replyMessageId The value of the column 'reply_message_id'. (basically NotNull if update: for the constraint)
     */
    public void setReplyMessageId(Long replyMessageId) {
        registerModifiedProperty("replyMessageId");
        _replyMessageId = replyMessageId;
    }

    /**
     * [get] register_datetime: {NotNull, DATETIME(19)} <br>
     * @return The value of the column 'register_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] register_datetime: {NotNull, DATETIME(19)} <br>
     * @param registerDatetime The value of the column 'register_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] register_trace: {NotNull, VARCHAR(64)} <br>
     * @return The value of the column 'register_trace'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterTrace() {
        checkSpecifiedProperty("registerTrace");
        return convertEmptyToNull(_registerTrace);
    }

    /**
     * [set] register_trace: {NotNull, VARCHAR(64)} <br>
     * @param registerTrace The value of the column 'register_trace'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterTrace(String registerTrace) {
        registerModifiedProperty("registerTrace");
        _registerTrace = registerTrace;
    }

    /**
     * [get] update_datetime: {NotNull, DATETIME(19)} <br>
     * @return The value of the column 'update_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] update_datetime: {NotNull, DATETIME(19)} <br>
     * @param updateDatetime The value of the column 'update_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] update_trace: {NotNull, VARCHAR(64)} <br>
     * @return The value of the column 'update_trace'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateTrace() {
        checkSpecifiedProperty("updateTrace");
        return convertEmptyToNull(_updateTrace);
    }

    /**
     * [set] update_trace: {NotNull, VARCHAR(64)} <br>
     * @param updateTrace The value of the column 'update_trace'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateTrace(String updateTrace) {
        registerModifiedProperty("updateTrace");
        _updateTrace = updateTrace;
    }
}
