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
 * The entity of GAME_PLAYER as TABLE. <br>
 * <pre>
 * [primary-key]
 *     game_player_id
 *
 * [column]
 *     game_player_id, game_id, player_id, game_player_name, chara_id, is_deleted, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     game_player_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     CHARA, GAME, PLAYER
 *
 * [referrer table]
 *     GAME_PLAYER_GROUP_REL, MESSAGE, MESSAGE_FAVORITE, DIRECT_MESSAGE
 *
 * [foreign property]
 *     chara, game, player
 *
 * [referrer property]
 *     gamePlayerGroupRelList, messageList, messageFavoriteList, directMessageList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer gamePlayerId = entity.getGamePlayerId();
 * Integer gameId = entity.getGameId();
 * Integer playerId = entity.getPlayerId();
 * String gamePlayerName = entity.getGamePlayerName();
 * Integer charaId = entity.getCharaId();
 * Boolean isDeleted = entity.getIsDeleted();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setGamePlayerId(gamePlayerId);
 * entity.setGameId(gameId);
 * entity.setPlayerId(playerId);
 * entity.setGamePlayerName(gamePlayerName);
 * entity.setCharaId(charaId);
 * entity.setIsDeleted(isDeleted);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsGamePlayer extends AbstractEntity implements DomainEntity, DbEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** game_player_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _gamePlayerId;

    /** game_id: {UQ+, NotNull, INT UNSIGNED(10), FK to game} */
    protected Integer _gameId;

    /** player_id: {IX, NotNull, INT UNSIGNED(10), FK to player} */
    protected Integer _playerId;

    /** game_player_name: {NotNull, VARCHAR(255)} */
    protected String _gamePlayerName;

    /** chara_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to chara} */
    protected Integer _charaId;

    /** is_deleted: {+UQ, NotNull, BIT} */
    protected Boolean _isDeleted;

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
        return "game_player";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_gamePlayerId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param gameId : UQ+, NotNull, INT UNSIGNED(10), FK to game. (NotNull)
     * @param charaId : +UQ, IX, NotNull, INT UNSIGNED(10), FK to chara. (NotNull)
     * @param isDeleted : +UQ, NotNull, BIT. (NotNull)
     */
    public void uniqueBy(Integer gameId, Integer charaId, Boolean isDeleted) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("gameId");
        __uniqueDrivenProperties.addPropertyName("charaId");
        __uniqueDrivenProperties.addPropertyName("isDeleted");
        setGameId(gameId);setCharaId(charaId);setIsDeleted(isDeleted);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** CHARA by my chara_id, named 'chara'. */
    protected OptionalEntity<DbChara> _chara;

    /**
     * [get] CHARA by my chara_id, named 'chara'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'chara'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<DbChara> getChara() {
        if (_chara == null) { _chara = OptionalEntity.relationEmpty(this, "chara"); }
        return _chara;
    }

    /**
     * [set] CHARA by my chara_id, named 'chara'.
     * @param chara The entity of foreign property 'chara'. (NullAllowed)
     */
    public void setChara(OptionalEntity<DbChara> chara) {
        _chara = chara;
    }

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

    /** PLAYER by my player_id, named 'player'. */
    protected OptionalEntity<DbPlayer> _player;

    /**
     * [get] PLAYER by my player_id, named 'player'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'player'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<DbPlayer> getPlayer() {
        if (_player == null) { _player = OptionalEntity.relationEmpty(this, "player"); }
        return _player;
    }

    /**
     * [set] PLAYER by my player_id, named 'player'.
     * @param player The entity of foreign property 'player'. (NullAllowed)
     */
    public void setPlayer(OptionalEntity<DbPlayer> player) {
        _player = player;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** GAME_PLAYER_GROUP_REL by game_player_id, named 'gamePlayerGroupRelList'. */
    protected List<DbGamePlayerGroupRel> _gamePlayerGroupRelList;

    /**
     * [get] GAME_PLAYER_GROUP_REL by game_player_id, named 'gamePlayerGroupRelList'.
     * @return The entity list of referrer property 'gamePlayerGroupRelList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbGamePlayerGroupRel> getGamePlayerGroupRelList() {
        if (_gamePlayerGroupRelList == null) { _gamePlayerGroupRelList = newReferrerList(); }
        return _gamePlayerGroupRelList;
    }

    /**
     * [set] GAME_PLAYER_GROUP_REL by game_player_id, named 'gamePlayerGroupRelList'.
     * @param gamePlayerGroupRelList The entity list of referrer property 'gamePlayerGroupRelList'. (NullAllowed)
     */
    public void setGamePlayerGroupRelList(List<DbGamePlayerGroupRel> gamePlayerGroupRelList) {
        _gamePlayerGroupRelList = gamePlayerGroupRelList;
    }

    /** MESSAGE by from_game_player_id, named 'messageList'. */
    protected List<DbMessage> _messageList;

    /**
     * [get] MESSAGE by from_game_player_id, named 'messageList'.
     * @return The entity list of referrer property 'messageList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbMessage> getMessageList() {
        if (_messageList == null) { _messageList = newReferrerList(); }
        return _messageList;
    }

    /**
     * [set] MESSAGE by from_game_player_id, named 'messageList'.
     * @param messageList The entity list of referrer property 'messageList'. (NullAllowed)
     */
    public void setMessageList(List<DbMessage> messageList) {
        _messageList = messageList;
    }

    /** MESSAGE_FAVORITE by game_player_id, named 'messageFavoriteList'. */
    protected List<DbMessageFavorite> _messageFavoriteList;

    /**
     * [get] MESSAGE_FAVORITE by game_player_id, named 'messageFavoriteList'.
     * @return The entity list of referrer property 'messageFavoriteList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbMessageFavorite> getMessageFavoriteList() {
        if (_messageFavoriteList == null) { _messageFavoriteList = newReferrerList(); }
        return _messageFavoriteList;
    }

    /**
     * [set] MESSAGE_FAVORITE by game_player_id, named 'messageFavoriteList'.
     * @param messageFavoriteList The entity list of referrer property 'messageFavoriteList'. (NullAllowed)
     */
    public void setMessageFavoriteList(List<DbMessageFavorite> messageFavoriteList) {
        _messageFavoriteList = messageFavoriteList;
    }

    /** DIRECT_MESSAGE by from_game_player_id, named 'directMessageList'. */
    protected List<DbDirectMessage> _directMessageList;

    /**
     * [get] DIRECT_MESSAGE by from_game_player_id, named 'directMessageList'.
     * @return The entity list of referrer property 'directMessageList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbDirectMessage> getDirectMessageList() {
        if (_directMessageList == null) { _directMessageList = newReferrerList(); }
        return _directMessageList;
    }

    /**
     * [set] DIRECT_MESSAGE by from_game_player_id, named 'directMessageList'.
     * @param directMessageList The entity list of referrer property 'directMessageList'. (NullAllowed)
     */
    public void setDirectMessageList(List<DbDirectMessage> directMessageList) {
        _directMessageList = directMessageList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof DbBsGamePlayer) {
            DbBsGamePlayer other = (DbBsGamePlayer)obj;
            if (!xSV(_gamePlayerId, other._gamePlayerId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _gamePlayerId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_chara != null && _chara.isPresent())
        { sb.append(li).append(xbRDS(_chara, "chara")); }
        if (_game != null && _game.isPresent())
        { sb.append(li).append(xbRDS(_game, "game")); }
        if (_player != null && _player.isPresent())
        { sb.append(li).append(xbRDS(_player, "player")); }
        if (_gamePlayerGroupRelList != null) { for (DbGamePlayerGroupRel et : _gamePlayerGroupRelList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "gamePlayerGroupRelList")); } } }
        if (_messageList != null) { for (DbMessage et : _messageList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "messageList")); } } }
        if (_messageFavoriteList != null) { for (DbMessageFavorite et : _messageFavoriteList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "messageFavoriteList")); } } }
        if (_directMessageList != null) { for (DbDirectMessage et : _directMessageList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "directMessageList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_gamePlayerId));
        sb.append(dm).append(xfND(_gameId));
        sb.append(dm).append(xfND(_playerId));
        sb.append(dm).append(xfND(_gamePlayerName));
        sb.append(dm).append(xfND(_charaId));
        sb.append(dm).append(xfND(_isDeleted));
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
        if (_chara != null && _chara.isPresent())
        { sb.append(dm).append("chara"); }
        if (_game != null && _game.isPresent())
        { sb.append(dm).append("game"); }
        if (_player != null && _player.isPresent())
        { sb.append(dm).append("player"); }
        if (_gamePlayerGroupRelList != null && !_gamePlayerGroupRelList.isEmpty())
        { sb.append(dm).append("gamePlayerGroupRelList"); }
        if (_messageList != null && !_messageList.isEmpty())
        { sb.append(dm).append("messageList"); }
        if (_messageFavoriteList != null && !_messageFavoriteList.isEmpty())
        { sb.append(dm).append("messageFavoriteList"); }
        if (_directMessageList != null && !_directMessageList.isEmpty())
        { sb.append(dm).append("directMessageList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DbGamePlayer clone() {
        return (DbGamePlayer)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] game_player_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'game_player_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getGamePlayerId() {
        checkSpecifiedProperty("gamePlayerId");
        return _gamePlayerId;
    }

    /**
     * [set] game_player_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param gamePlayerId The value of the column 'game_player_id'. (basically NotNull if update: for the constraint)
     */
    public void setGamePlayerId(Integer gamePlayerId) {
        registerModifiedProperty("gamePlayerId");
        _gamePlayerId = gamePlayerId;
    }

    /**
     * [get] game_id: {UQ+, NotNull, INT UNSIGNED(10), FK to game} <br>
     * @return The value of the column 'game_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getGameId() {
        checkSpecifiedProperty("gameId");
        return _gameId;
    }

    /**
     * [set] game_id: {UQ+, NotNull, INT UNSIGNED(10), FK to game} <br>
     * @param gameId The value of the column 'game_id'. (basically NotNull if update: for the constraint)
     */
    public void setGameId(Integer gameId) {
        registerModifiedProperty("gameId");
        _gameId = gameId;
    }

    /**
     * [get] player_id: {IX, NotNull, INT UNSIGNED(10), FK to player} <br>
     * @return The value of the column 'player_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPlayerId() {
        checkSpecifiedProperty("playerId");
        return _playerId;
    }

    /**
     * [set] player_id: {IX, NotNull, INT UNSIGNED(10), FK to player} <br>
     * @param playerId The value of the column 'player_id'. (basically NotNull if update: for the constraint)
     */
    public void setPlayerId(Integer playerId) {
        registerModifiedProperty("playerId");
        _playerId = playerId;
    }

    /**
     * [get] game_player_name: {NotNull, VARCHAR(255)} <br>
     * @return The value of the column 'game_player_name'. (basically NotNull if selected: for the constraint)
     */
    public String getGamePlayerName() {
        checkSpecifiedProperty("gamePlayerName");
        return convertEmptyToNull(_gamePlayerName);
    }

    /**
     * [set] game_player_name: {NotNull, VARCHAR(255)} <br>
     * @param gamePlayerName The value of the column 'game_player_name'. (basically NotNull if update: for the constraint)
     */
    public void setGamePlayerName(String gamePlayerName) {
        registerModifiedProperty("gamePlayerName");
        _gamePlayerName = gamePlayerName;
    }

    /**
     * [get] chara_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to chara} <br>
     * @return The value of the column 'chara_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCharaId() {
        checkSpecifiedProperty("charaId");
        return _charaId;
    }

    /**
     * [set] chara_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to chara} <br>
     * @param charaId The value of the column 'chara_id'. (basically NotNull if update: for the constraint)
     */
    public void setCharaId(Integer charaId) {
        registerModifiedProperty("charaId");
        _charaId = charaId;
    }

    /**
     * [get] is_deleted: {+UQ, NotNull, BIT} <br>
     * @return The value of the column 'is_deleted'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getIsDeleted() {
        checkSpecifiedProperty("isDeleted");
        return _isDeleted;
    }

    /**
     * [set] is_deleted: {+UQ, NotNull, BIT} <br>
     * @param isDeleted The value of the column 'is_deleted'. (basically NotNull if update: for the constraint)
     */
    public void setIsDeleted(Boolean isDeleted) {
        registerModifiedProperty("isDeleted");
        _isDeleted = isDeleted;
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
