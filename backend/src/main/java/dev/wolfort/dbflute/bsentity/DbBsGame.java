package dev.wolfort.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import dev.wolfort.dbflute.allcommon.DbEntityDefinedCommonColumn;
import dev.wolfort.dbflute.allcommon.DbDBMetaInstanceHandler;
import dev.wolfort.dbflute.exentity.*;

/**
 * The entity of GAME as TABLE. <br>
 * <pre>
 * [primary-key]
 *     game_id
 *
 * [column]
 *     game_id, game_name, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     game_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     GAME_PERIOD, GAME_PLAYER, GAME_SETTING, MESSAGE, MESSAGE_REPLY, MESSAGE_FAVORITE, DIRECT_MESSAGE
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     gamePeriodList, gamePlayerList, gameSettingList, messageList, messageReplyList, messageFavoriteList, directMessageList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer gameId = entity.getGameId();
 * String gameName = entity.getGameName();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setGameId(gameId);
 * entity.setGameName(gameName);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsGame extends AbstractEntity implements DomainEntity, DbEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** game_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _gameId;

    /** game_name: {NotNull, VARCHAR(255)} */
    protected String _gameName;

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
        return "game";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_gameId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** GAME_PERIOD by game_id, named 'gamePeriodList'. */
    protected List<DbGamePeriod> _gamePeriodList;

    /**
     * [get] GAME_PERIOD by game_id, named 'gamePeriodList'.
     * @return The entity list of referrer property 'gamePeriodList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbGamePeriod> getGamePeriodList() {
        if (_gamePeriodList == null) { _gamePeriodList = newReferrerList(); }
        return _gamePeriodList;
    }

    /**
     * [set] GAME_PERIOD by game_id, named 'gamePeriodList'.
     * @param gamePeriodList The entity list of referrer property 'gamePeriodList'. (NullAllowed)
     */
    public void setGamePeriodList(List<DbGamePeriod> gamePeriodList) {
        _gamePeriodList = gamePeriodList;
    }

    /** GAME_PLAYER by game_id, named 'gamePlayerList'. */
    protected List<DbGamePlayer> _gamePlayerList;

    /**
     * [get] GAME_PLAYER by game_id, named 'gamePlayerList'.
     * @return The entity list of referrer property 'gamePlayerList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbGamePlayer> getGamePlayerList() {
        if (_gamePlayerList == null) { _gamePlayerList = newReferrerList(); }
        return _gamePlayerList;
    }

    /**
     * [set] GAME_PLAYER by game_id, named 'gamePlayerList'.
     * @param gamePlayerList The entity list of referrer property 'gamePlayerList'. (NullAllowed)
     */
    public void setGamePlayerList(List<DbGamePlayer> gamePlayerList) {
        _gamePlayerList = gamePlayerList;
    }

    /** GAME_SETTING by game_id, named 'gameSettingList'. */
    protected List<DbGameSetting> _gameSettingList;

    /**
     * [get] GAME_SETTING by game_id, named 'gameSettingList'.
     * @return The entity list of referrer property 'gameSettingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbGameSetting> getGameSettingList() {
        if (_gameSettingList == null) { _gameSettingList = newReferrerList(); }
        return _gameSettingList;
    }

    /**
     * [set] GAME_SETTING by game_id, named 'gameSettingList'.
     * @param gameSettingList The entity list of referrer property 'gameSettingList'. (NullAllowed)
     */
    public void setGameSettingList(List<DbGameSetting> gameSettingList) {
        _gameSettingList = gameSettingList;
    }

    /** MESSAGE by game_id, named 'messageList'. */
    protected List<DbMessage> _messageList;

    /**
     * [get] MESSAGE by game_id, named 'messageList'.
     * @return The entity list of referrer property 'messageList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbMessage> getMessageList() {
        if (_messageList == null) { _messageList = newReferrerList(); }
        return _messageList;
    }

    /**
     * [set] MESSAGE by game_id, named 'messageList'.
     * @param messageList The entity list of referrer property 'messageList'. (NullAllowed)
     */
    public void setMessageList(List<DbMessage> messageList) {
        _messageList = messageList;
    }

    /** MESSAGE_REPLY by game_id, named 'messageReplyList'. */
    protected List<DbMessageReply> _messageReplyList;

    /**
     * [get] MESSAGE_REPLY by game_id, named 'messageReplyList'.
     * @return The entity list of referrer property 'messageReplyList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbMessageReply> getMessageReplyList() {
        if (_messageReplyList == null) { _messageReplyList = newReferrerList(); }
        return _messageReplyList;
    }

    /**
     * [set] MESSAGE_REPLY by game_id, named 'messageReplyList'.
     * @param messageReplyList The entity list of referrer property 'messageReplyList'. (NullAllowed)
     */
    public void setMessageReplyList(List<DbMessageReply> messageReplyList) {
        _messageReplyList = messageReplyList;
    }

    /** MESSAGE_FAVORITE by game_id, named 'messageFavoriteList'. */
    protected List<DbMessageFavorite> _messageFavoriteList;

    /**
     * [get] MESSAGE_FAVORITE by game_id, named 'messageFavoriteList'.
     * @return The entity list of referrer property 'messageFavoriteList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbMessageFavorite> getMessageFavoriteList() {
        if (_messageFavoriteList == null) { _messageFavoriteList = newReferrerList(); }
        return _messageFavoriteList;
    }

    /**
     * [set] MESSAGE_FAVORITE by game_id, named 'messageFavoriteList'.
     * @param messageFavoriteList The entity list of referrer property 'messageFavoriteList'. (NullAllowed)
     */
    public void setMessageFavoriteList(List<DbMessageFavorite> messageFavoriteList) {
        _messageFavoriteList = messageFavoriteList;
    }

    /** DIRECT_MESSAGE by game_id, named 'directMessageList'. */
    protected List<DbDirectMessage> _directMessageList;

    /**
     * [get] DIRECT_MESSAGE by game_id, named 'directMessageList'.
     * @return The entity list of referrer property 'directMessageList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbDirectMessage> getDirectMessageList() {
        if (_directMessageList == null) { _directMessageList = newReferrerList(); }
        return _directMessageList;
    }

    /**
     * [set] DIRECT_MESSAGE by game_id, named 'directMessageList'.
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
        if (obj instanceof DbBsGame) {
            DbBsGame other = (DbBsGame)obj;
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
        hs = xCH(hs, _gameId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_gamePeriodList != null) { for (DbGamePeriod et : _gamePeriodList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "gamePeriodList")); } } }
        if (_gamePlayerList != null) { for (DbGamePlayer et : _gamePlayerList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "gamePlayerList")); } } }
        if (_gameSettingList != null) { for (DbGameSetting et : _gameSettingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "gameSettingList")); } } }
        if (_messageList != null) { for (DbMessage et : _messageList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "messageList")); } } }
        if (_messageReplyList != null) { for (DbMessageReply et : _messageReplyList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "messageReplyList")); } } }
        if (_messageFavoriteList != null) { for (DbMessageFavorite et : _messageFavoriteList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "messageFavoriteList")); } } }
        if (_directMessageList != null) { for (DbDirectMessage et : _directMessageList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "directMessageList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_gameId));
        sb.append(dm).append(xfND(_gameName));
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
        if (_gamePeriodList != null && !_gamePeriodList.isEmpty())
        { sb.append(dm).append("gamePeriodList"); }
        if (_gamePlayerList != null && !_gamePlayerList.isEmpty())
        { sb.append(dm).append("gamePlayerList"); }
        if (_gameSettingList != null && !_gameSettingList.isEmpty())
        { sb.append(dm).append("gameSettingList"); }
        if (_messageList != null && !_messageList.isEmpty())
        { sb.append(dm).append("messageList"); }
        if (_messageReplyList != null && !_messageReplyList.isEmpty())
        { sb.append(dm).append("messageReplyList"); }
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
    public DbGame clone() {
        return (DbGame)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] game_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'game_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getGameId() {
        checkSpecifiedProperty("gameId");
        return _gameId;
    }

    /**
     * [set] game_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param gameId The value of the column 'game_id'. (basically NotNull if update: for the constraint)
     */
    public void setGameId(Integer gameId) {
        registerModifiedProperty("gameId");
        _gameId = gameId;
    }

    /**
     * [get] game_name: {NotNull, VARCHAR(255)} <br>
     * @return The value of the column 'game_name'. (basically NotNull if selected: for the constraint)
     */
    public String getGameName() {
        checkSpecifiedProperty("gameName");
        return convertEmptyToNull(_gameName);
    }

    /**
     * [set] game_name: {NotNull, VARCHAR(255)} <br>
     * @param gameName The value of the column 'game_name'. (basically NotNull if update: for the constraint)
     */
    public void setGameName(String gameName) {
        registerModifiedProperty("gameName");
        _gameName = gameName;
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
