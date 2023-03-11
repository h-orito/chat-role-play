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
 * The entity of DIRECT_MESSAGE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     direct_message_id, game_id
 *
 * [column]
 *     direct_message_id, game_id, game_player_group_id, game_period_id, from_game_player_id, from_game_player_name, from_game_player_face_type_code, message_content, message_number, message_datetime, message_unix_timestamp_milli, is_deleted, is_convert_disable, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     direct_message_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     GAME, GAME_PLAYER_GROUP, GAME_PERIOD, GAME_PLAYER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     game, gamePlayerGroup, gamePeriod, gamePlayer
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long directMessageId = entity.getDirectMessageId();
 * Integer gameId = entity.getGameId();
 * Integer gamePlayerGroupId = entity.getGamePlayerGroupId();
 * Integer gamePeriodId = entity.getGamePeriodId();
 * Integer fromGamePlayerId = entity.getFromGamePlayerId();
 * String fromGamePlayerName = entity.getFromGamePlayerName();
 * String fromGamePlayerFaceTypeCode = entity.getFromGamePlayerFaceTypeCode();
 * String messageContent = entity.getMessageContent();
 * Integer messageNumber = entity.getMessageNumber();
 * java.time.LocalDateTime messageDatetime = entity.getMessageDatetime();
 * Long messageUnixTimestampMilli = entity.getMessageUnixTimestampMilli();
 * Boolean isDeleted = entity.getIsDeleted();
 * Boolean isConvertDisable = entity.getIsConvertDisable();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setDirectMessageId(directMessageId);
 * entity.setGameId(gameId);
 * entity.setGamePlayerGroupId(gamePlayerGroupId);
 * entity.setGamePeriodId(gamePeriodId);
 * entity.setFromGamePlayerId(fromGamePlayerId);
 * entity.setFromGamePlayerName(fromGamePlayerName);
 * entity.setFromGamePlayerFaceTypeCode(fromGamePlayerFaceTypeCode);
 * entity.setMessageContent(messageContent);
 * entity.setMessageNumber(messageNumber);
 * entity.setMessageDatetime(messageDatetime);
 * entity.setMessageUnixTimestampMilli(messageUnixTimestampMilli);
 * entity.setIsDeleted(isDeleted);
 * entity.setIsConvertDisable(isConvertDisable);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsDirectMessage extends AbstractEntity implements DomainEntity, DbEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** direct_message_id: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _directMessageId;

    /** game_id: {PK, UQ+, NotNull, INT UNSIGNED(10), FK to game} */
    protected Integer _gameId;

    /** game_player_group_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to game_player_group} */
    protected Integer _gamePlayerGroupId;

    /** game_period_id: {IX, NotNull, INT UNSIGNED(10), FK to game_period} */
    protected Integer _gamePeriodId;

    /** from_game_player_id: {IX, INT UNSIGNED(10), FK to game_player} */
    protected Integer _fromGamePlayerId;

    /** from_game_player_name: {VARCHAR(255)} */
    protected String _fromGamePlayerName;

    /** from_game_player_face_type_code: {VARCHAR(255)} */
    protected String _fromGamePlayerFaceTypeCode;

    /** message_content: {VARCHAR(10000)} */
    protected String _messageContent;

    /** message_number: {+UQ, INT UNSIGNED(10)} */
    protected Integer _messageNumber;

    /** message_datetime: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _messageDatetime;

    /** message_unix_timestamp_milli: {NotNull, BIGINT UNSIGNED(20)} */
    protected Long _messageUnixTimestampMilli;

    /** is_deleted: {NotNull, BIT} */
    protected Boolean _isDeleted;

    /** is_convert_disable: {NotNull, BIT} */
    protected Boolean _isConvertDisable;

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
        return "direct_message";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_directMessageId == null) { return false; }
        if (_gameId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param gameId : PK, UQ+, NotNull, INT UNSIGNED(10), FK to game. (NotNull)
     * @param gamePlayerGroupId : +UQ, IX, NotNull, INT UNSIGNED(10), FK to game_player_group. (NotNull)
     * @param messageNumber : +UQ, INT UNSIGNED(10). (NotNull)
     */
    public void uniqueBy(Integer gameId, Integer gamePlayerGroupId, Integer messageNumber) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("gameId");
        __uniqueDrivenProperties.addPropertyName("gamePlayerGroupId");
        __uniqueDrivenProperties.addPropertyName("messageNumber");
        setGameId(gameId);setGamePlayerGroupId(gamePlayerGroupId);setMessageNumber(messageNumber);
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

    /** GAME_PLAYER_GROUP by my game_player_group_id, named 'gamePlayerGroup'. */
    protected OptionalEntity<DbGamePlayerGroup> _gamePlayerGroup;

    /**
     * [get] GAME_PLAYER_GROUP by my game_player_group_id, named 'gamePlayerGroup'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'gamePlayerGroup'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<DbGamePlayerGroup> getGamePlayerGroup() {
        if (_gamePlayerGroup == null) { _gamePlayerGroup = OptionalEntity.relationEmpty(this, "gamePlayerGroup"); }
        return _gamePlayerGroup;
    }

    /**
     * [set] GAME_PLAYER_GROUP by my game_player_group_id, named 'gamePlayerGroup'.
     * @param gamePlayerGroup The entity of foreign property 'gamePlayerGroup'. (NullAllowed)
     */
    public void setGamePlayerGroup(OptionalEntity<DbGamePlayerGroup> gamePlayerGroup) {
        _gamePlayerGroup = gamePlayerGroup;
    }

    /** GAME_PERIOD by my game_period_id, named 'gamePeriod'. */
    protected OptionalEntity<DbGamePeriod> _gamePeriod;

    /**
     * [get] GAME_PERIOD by my game_period_id, named 'gamePeriod'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'gamePeriod'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<DbGamePeriod> getGamePeriod() {
        if (_gamePeriod == null) { _gamePeriod = OptionalEntity.relationEmpty(this, "gamePeriod"); }
        return _gamePeriod;
    }

    /**
     * [set] GAME_PERIOD by my game_period_id, named 'gamePeriod'.
     * @param gamePeriod The entity of foreign property 'gamePeriod'. (NullAllowed)
     */
    public void setGamePeriod(OptionalEntity<DbGamePeriod> gamePeriod) {
        _gamePeriod = gamePeriod;
    }

    /** GAME_PLAYER by my from_game_player_id, named 'gamePlayer'. */
    protected OptionalEntity<DbGamePlayer> _gamePlayer;

    /**
     * [get] GAME_PLAYER by my from_game_player_id, named 'gamePlayer'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'gamePlayer'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<DbGamePlayer> getGamePlayer() {
        if (_gamePlayer == null) { _gamePlayer = OptionalEntity.relationEmpty(this, "gamePlayer"); }
        return _gamePlayer;
    }

    /**
     * [set] GAME_PLAYER by my from_game_player_id, named 'gamePlayer'.
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
        if (obj instanceof DbBsDirectMessage) {
            DbBsDirectMessage other = (DbBsDirectMessage)obj;
            if (!xSV(_directMessageId, other._directMessageId)) { return false; }
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
        hs = xCH(hs, _directMessageId);
        hs = xCH(hs, _gameId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_game != null && _game.isPresent())
        { sb.append(li).append(xbRDS(_game, "game")); }
        if (_gamePlayerGroup != null && _gamePlayerGroup.isPresent())
        { sb.append(li).append(xbRDS(_gamePlayerGroup, "gamePlayerGroup")); }
        if (_gamePeriod != null && _gamePeriod.isPresent())
        { sb.append(li).append(xbRDS(_gamePeriod, "gamePeriod")); }
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
        sb.append(dm).append(xfND(_directMessageId));
        sb.append(dm).append(xfND(_gameId));
        sb.append(dm).append(xfND(_gamePlayerGroupId));
        sb.append(dm).append(xfND(_gamePeriodId));
        sb.append(dm).append(xfND(_fromGamePlayerId));
        sb.append(dm).append(xfND(_fromGamePlayerName));
        sb.append(dm).append(xfND(_fromGamePlayerFaceTypeCode));
        sb.append(dm).append(xfND(_messageContent));
        sb.append(dm).append(xfND(_messageNumber));
        sb.append(dm).append(xfND(_messageDatetime));
        sb.append(dm).append(xfND(_messageUnixTimestampMilli));
        sb.append(dm).append(xfND(_isDeleted));
        sb.append(dm).append(xfND(_isConvertDisable));
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
        if (_gamePlayerGroup != null && _gamePlayerGroup.isPresent())
        { sb.append(dm).append("gamePlayerGroup"); }
        if (_gamePeriod != null && _gamePeriod.isPresent())
        { sb.append(dm).append("gamePeriod"); }
        if (_gamePlayer != null && _gamePlayer.isPresent())
        { sb.append(dm).append("gamePlayer"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DbDirectMessage clone() {
        return (DbDirectMessage)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] direct_message_id: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'direct_message_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getDirectMessageId() {
        checkSpecifiedProperty("directMessageId");
        return _directMessageId;
    }

    /**
     * [set] direct_message_id: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param directMessageId The value of the column 'direct_message_id'. (basically NotNull if update: for the constraint)
     */
    public void setDirectMessageId(Long directMessageId) {
        registerModifiedProperty("directMessageId");
        _directMessageId = directMessageId;
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
     * [get] game_player_group_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to game_player_group} <br>
     * @return The value of the column 'game_player_group_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getGamePlayerGroupId() {
        checkSpecifiedProperty("gamePlayerGroupId");
        return _gamePlayerGroupId;
    }

    /**
     * [set] game_player_group_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to game_player_group} <br>
     * @param gamePlayerGroupId The value of the column 'game_player_group_id'. (basically NotNull if update: for the constraint)
     */
    public void setGamePlayerGroupId(Integer gamePlayerGroupId) {
        registerModifiedProperty("gamePlayerGroupId");
        _gamePlayerGroupId = gamePlayerGroupId;
    }

    /**
     * [get] game_period_id: {IX, NotNull, INT UNSIGNED(10), FK to game_period} <br>
     * @return The value of the column 'game_period_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getGamePeriodId() {
        checkSpecifiedProperty("gamePeriodId");
        return _gamePeriodId;
    }

    /**
     * [set] game_period_id: {IX, NotNull, INT UNSIGNED(10), FK to game_period} <br>
     * @param gamePeriodId The value of the column 'game_period_id'. (basically NotNull if update: for the constraint)
     */
    public void setGamePeriodId(Integer gamePeriodId) {
        registerModifiedProperty("gamePeriodId");
        _gamePeriodId = gamePeriodId;
    }

    /**
     * [get] from_game_player_id: {IX, INT UNSIGNED(10), FK to game_player} <br>
     * @return The value of the column 'from_game_player_id'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getFromGamePlayerId() {
        checkSpecifiedProperty("fromGamePlayerId");
        return _fromGamePlayerId;
    }

    /**
     * [set] from_game_player_id: {IX, INT UNSIGNED(10), FK to game_player} <br>
     * @param fromGamePlayerId The value of the column 'from_game_player_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromGamePlayerId(Integer fromGamePlayerId) {
        registerModifiedProperty("fromGamePlayerId");
        _fromGamePlayerId = fromGamePlayerId;
    }

    /**
     * [get] from_game_player_name: {VARCHAR(255)} <br>
     * @return The value of the column 'from_game_player_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromGamePlayerName() {
        checkSpecifiedProperty("fromGamePlayerName");
        return convertEmptyToNull(_fromGamePlayerName);
    }

    /**
     * [set] from_game_player_name: {VARCHAR(255)} <br>
     * @param fromGamePlayerName The value of the column 'from_game_player_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromGamePlayerName(String fromGamePlayerName) {
        registerModifiedProperty("fromGamePlayerName");
        _fromGamePlayerName = fromGamePlayerName;
    }

    /**
     * [get] from_game_player_face_type_code: {VARCHAR(255)} <br>
     * @return The value of the column 'from_game_player_face_type_code'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromGamePlayerFaceTypeCode() {
        checkSpecifiedProperty("fromGamePlayerFaceTypeCode");
        return convertEmptyToNull(_fromGamePlayerFaceTypeCode);
    }

    /**
     * [set] from_game_player_face_type_code: {VARCHAR(255)} <br>
     * @param fromGamePlayerFaceTypeCode The value of the column 'from_game_player_face_type_code'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromGamePlayerFaceTypeCode(String fromGamePlayerFaceTypeCode) {
        registerModifiedProperty("fromGamePlayerFaceTypeCode");
        _fromGamePlayerFaceTypeCode = fromGamePlayerFaceTypeCode;
    }

    /**
     * [get] message_content: {VARCHAR(10000)} <br>
     * @return The value of the column 'message_content'. (NullAllowed even if selected: for no constraint)
     */
    public String getMessageContent() {
        checkSpecifiedProperty("messageContent");
        return convertEmptyToNull(_messageContent);
    }

    /**
     * [set] message_content: {VARCHAR(10000)} <br>
     * @param messageContent The value of the column 'message_content'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMessageContent(String messageContent) {
        registerModifiedProperty("messageContent");
        _messageContent = messageContent;
    }

    /**
     * [get] message_number: {+UQ, INT UNSIGNED(10)} <br>
     * @return The value of the column 'message_number'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getMessageNumber() {
        checkSpecifiedProperty("messageNumber");
        return _messageNumber;
    }

    /**
     * [set] message_number: {+UQ, INT UNSIGNED(10)} <br>
     * @param messageNumber The value of the column 'message_number'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMessageNumber(Integer messageNumber) {
        registerModifiedProperty("messageNumber");
        _messageNumber = messageNumber;
    }

    /**
     * [get] message_datetime: {NotNull, DATETIME(19)} <br>
     * @return The value of the column 'message_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getMessageDatetime() {
        checkSpecifiedProperty("messageDatetime");
        return _messageDatetime;
    }

    /**
     * [set] message_datetime: {NotNull, DATETIME(19)} <br>
     * @param messageDatetime The value of the column 'message_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setMessageDatetime(java.time.LocalDateTime messageDatetime) {
        registerModifiedProperty("messageDatetime");
        _messageDatetime = messageDatetime;
    }

    /**
     * [get] message_unix_timestamp_milli: {NotNull, BIGINT UNSIGNED(20)} <br>
     * @return The value of the column 'message_unix_timestamp_milli'. (basically NotNull if selected: for the constraint)
     */
    public Long getMessageUnixTimestampMilli() {
        checkSpecifiedProperty("messageUnixTimestampMilli");
        return _messageUnixTimestampMilli;
    }

    /**
     * [set] message_unix_timestamp_milli: {NotNull, BIGINT UNSIGNED(20)} <br>
     * @param messageUnixTimestampMilli The value of the column 'message_unix_timestamp_milli'. (basically NotNull if update: for the constraint)
     */
    public void setMessageUnixTimestampMilli(Long messageUnixTimestampMilli) {
        registerModifiedProperty("messageUnixTimestampMilli");
        _messageUnixTimestampMilli = messageUnixTimestampMilli;
    }

    /**
     * [get] is_deleted: {NotNull, BIT} <br>
     * @return The value of the column 'is_deleted'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getIsDeleted() {
        checkSpecifiedProperty("isDeleted");
        return _isDeleted;
    }

    /**
     * [set] is_deleted: {NotNull, BIT} <br>
     * @param isDeleted The value of the column 'is_deleted'. (basically NotNull if update: for the constraint)
     */
    public void setIsDeleted(Boolean isDeleted) {
        registerModifiedProperty("isDeleted");
        _isDeleted = isDeleted;
    }

    /**
     * [get] is_convert_disable: {NotNull, BIT} <br>
     * @return The value of the column 'is_convert_disable'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getIsConvertDisable() {
        checkSpecifiedProperty("isConvertDisable");
        return _isConvertDisable;
    }

    /**
     * [set] is_convert_disable: {NotNull, BIT} <br>
     * @param isConvertDisable The value of the column 'is_convert_disable'. (basically NotNull if update: for the constraint)
     */
    public void setIsConvertDisable(Boolean isConvertDisable) {
        registerModifiedProperty("isConvertDisable");
        _isConvertDisable = isConvertDisable;
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
