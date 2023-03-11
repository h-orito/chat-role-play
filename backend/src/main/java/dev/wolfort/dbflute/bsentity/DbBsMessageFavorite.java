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
 * The entity of MESSAGE_FAVORITE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     message_favorite_id, game_id
 *
 * [column]
 *     message_favorite_id, game_id, message_id, game_player_id, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     message_favorite_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     GAME, MESSAGE, GAME_PLAYER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     game, message, gamePlayer
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long messageFavoriteId = entity.getMessageFavoriteId();
 * Integer gameId = entity.getGameId();
 * Long messageId = entity.getMessageId();
 * Integer gamePlayerId = entity.getGamePlayerId();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setMessageFavoriteId(messageFavoriteId);
 * entity.setGameId(gameId);
 * entity.setMessageId(messageId);
 * entity.setGamePlayerId(gamePlayerId);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsMessageFavorite extends AbstractEntity implements DomainEntity, DbEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** message_favorite_id: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _messageFavoriteId;

    /** game_id: {PK, UQ+, NotNull, INT UNSIGNED(10), FK to game} */
    protected Integer _gameId;

    /** message_id: {+UQ, IX, NotNull, BIGINT(19), FK to message} */
    protected Long _messageId;

    /** game_player_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to game_player} */
    protected Integer _gamePlayerId;

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
        return "message_favorite";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_messageFavoriteId == null) { return false; }
        if (_gameId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param gameId : PK, UQ+, NotNull, INT UNSIGNED(10), FK to game. (NotNull)
     * @param messageId : +UQ, IX, NotNull, BIGINT(19), FK to message. (NotNull)
     * @param gamePlayerId : +UQ, IX, NotNull, INT UNSIGNED(10), FK to game_player. (NotNull)
     */
    public void uniqueBy(Integer gameId, Long messageId, Integer gamePlayerId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("gameId");
        __uniqueDrivenProperties.addPropertyName("messageId");
        __uniqueDrivenProperties.addPropertyName("gamePlayerId");
        setGameId(gameId);setMessageId(messageId);setGamePlayerId(gamePlayerId);
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

    /** MESSAGE by my message_id, named 'message'. */
    protected OptionalEntity<DbMessage> _message;

    /**
     * [get] MESSAGE by my message_id, named 'message'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'message'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<DbMessage> getMessage() {
        if (_message == null) { _message = OptionalEntity.relationEmpty(this, "message"); }
        return _message;
    }

    /**
     * [set] MESSAGE by my message_id, named 'message'.
     * @param message The entity of foreign property 'message'. (NullAllowed)
     */
    public void setMessage(OptionalEntity<DbMessage> message) {
        _message = message;
    }

    /** GAME_PLAYER by my game_player_id, named 'gamePlayer'. */
    protected OptionalEntity<DbGamePlayer> _gamePlayer;

    /**
     * [get] GAME_PLAYER by my game_player_id, named 'gamePlayer'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'gamePlayer'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<DbGamePlayer> getGamePlayer() {
        if (_gamePlayer == null) { _gamePlayer = OptionalEntity.relationEmpty(this, "gamePlayer"); }
        return _gamePlayer;
    }

    /**
     * [set] GAME_PLAYER by my game_player_id, named 'gamePlayer'.
     * @param gamePlayer The entity of foreign property 'gamePlayer'. (NullAllowed)
     */
    public void setGamePlayer(OptionalEntity<DbGamePlayer> gamePlayer) {
        _gamePlayer = gamePlayer;
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
        if (obj instanceof DbBsMessageFavorite) {
            DbBsMessageFavorite other = (DbBsMessageFavorite)obj;
            if (!xSV(_messageFavoriteId, other._messageFavoriteId)) { return false; }
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
        hs = xCH(hs, _messageFavoriteId);
        hs = xCH(hs, _gameId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_game != null && _game.isPresent())
        { sb.append(li).append(xbRDS(_game, "game")); }
        if (_message != null && _message.isPresent())
        { sb.append(li).append(xbRDS(_message, "message")); }
        if (_gamePlayer != null && _gamePlayer.isPresent())
        { sb.append(li).append(xbRDS(_gamePlayer, "gamePlayer")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_messageFavoriteId));
        sb.append(dm).append(xfND(_gameId));
        sb.append(dm).append(xfND(_messageId));
        sb.append(dm).append(xfND(_gamePlayerId));
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
        if (_message != null && _message.isPresent())
        { sb.append(dm).append("message"); }
        if (_gamePlayer != null && _gamePlayer.isPresent())
        { sb.append(dm).append("gamePlayer"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DbMessageFavorite clone() {
        return (DbMessageFavorite)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] message_favorite_id: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'message_favorite_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getMessageFavoriteId() {
        checkSpecifiedProperty("messageFavoriteId");
        return _messageFavoriteId;
    }

    /**
     * [set] message_favorite_id: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param messageFavoriteId The value of the column 'message_favorite_id'. (basically NotNull if update: for the constraint)
     */
    public void setMessageFavoriteId(Long messageFavoriteId) {
        registerModifiedProperty("messageFavoriteId");
        _messageFavoriteId = messageFavoriteId;
    }

    /**
     * [get] game_id: {PK, UQ+, NotNull, INT UNSIGNED(10), FK to game} <br>
     * @return The value of the column 'game_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getGameId() {
        checkSpecifiedProperty("gameId");
        return _gameId;
    }

    /**
     * [set] game_id: {PK, UQ+, NotNull, INT UNSIGNED(10), FK to game} <br>
     * @param gameId The value of the column 'game_id'. (basically NotNull if update: for the constraint)
     */
    public void setGameId(Integer gameId) {
        registerModifiedProperty("gameId");
        _gameId = gameId;
    }

    /**
     * [get] message_id: {+UQ, IX, NotNull, BIGINT(19), FK to message} <br>
     * @return The value of the column 'message_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getMessageId() {
        checkSpecifiedProperty("messageId");
        return _messageId;
    }

    /**
     * [set] message_id: {+UQ, IX, NotNull, BIGINT(19), FK to message} <br>
     * @param messageId The value of the column 'message_id'. (basically NotNull if update: for the constraint)
     */
    public void setMessageId(Long messageId) {
        registerModifiedProperty("messageId");
        _messageId = messageId;
    }

    /**
     * [get] game_player_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to game_player} <br>
     * @return The value of the column 'game_player_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getGamePlayerId() {
        checkSpecifiedProperty("gamePlayerId");
        return _gamePlayerId;
    }

    /**
     * [set] game_player_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to game_player} <br>
     * @param gamePlayerId The value of the column 'game_player_id'. (basically NotNull if update: for the constraint)
     */
    public void setGamePlayerId(Integer gamePlayerId) {
        registerModifiedProperty("gamePlayerId");
        _gamePlayerId = gamePlayerId;
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
