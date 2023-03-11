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
 * The entity of PLAYER as TABLE. <br>
 * <pre>
 * [primary-key]
 *     player_id
 *
 * [column]
 *     player_id, player_name, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     player_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     PLAYER_ACCOUNT(AsOne)
 *
 * [referrer table]
 *     GAME_PLAYER, PLAYER_AUTHORITY, PLAYER_ACCOUNT
 *
 * [foreign property]
 *     playerAccountAsOne
 *
 * [referrer property]
 *     gamePlayerList, playerAuthorityList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer playerId = entity.getPlayerId();
 * String playerName = entity.getPlayerName();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setPlayerId(playerId);
 * entity.setPlayerName(playerName);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsPlayer extends AbstractEntity implements DomainEntity, DbEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** player_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _playerId;

    /** player_name: {NotNull, VARCHAR(255)} */
    protected String _playerName;

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
        return "player";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_playerId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** player_account by player_id, named 'playerAccountAsOne'. */
    protected OptionalEntity<DbPlayerAccount> _playerAccountAsOne;

    /**
     * [get] player_account by player_id, named 'playerAccountAsOne'.
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return the entity of foreign property(referrer-as-one) 'playerAccountAsOne'. (NotNull, EmptyAllowed: when e.g. no data, no setupSelect)
     */
    public OptionalEntity<DbPlayerAccount> getPlayerAccountAsOne() {
        if (_playerAccountAsOne == null) { _playerAccountAsOne = OptionalEntity.relationEmpty(this, "playerAccountAsOne"); }
        return _playerAccountAsOne;
    }

    /**
     * [set] player_account by player_id, named 'playerAccountAsOne'.
     * @param playerAccountAsOne The entity of foreign property(referrer-as-one) 'playerAccountAsOne'. (NullAllowed)
     */
    public void setPlayerAccountAsOne(OptionalEntity<DbPlayerAccount> playerAccountAsOne) {
        _playerAccountAsOne = playerAccountAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** GAME_PLAYER by player_id, named 'gamePlayerList'. */
    protected List<DbGamePlayer> _gamePlayerList;

    /**
     * [get] GAME_PLAYER by player_id, named 'gamePlayerList'.
     * @return The entity list of referrer property 'gamePlayerList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbGamePlayer> getGamePlayerList() {
        if (_gamePlayerList == null) { _gamePlayerList = newReferrerList(); }
        return _gamePlayerList;
    }

    /**
     * [set] GAME_PLAYER by player_id, named 'gamePlayerList'.
     * @param gamePlayerList The entity list of referrer property 'gamePlayerList'. (NullAllowed)
     */
    public void setGamePlayerList(List<DbGamePlayer> gamePlayerList) {
        _gamePlayerList = gamePlayerList;
    }

    /** PLAYER_AUTHORITY by player_id, named 'playerAuthorityList'. */
    protected List<DbPlayerAuthority> _playerAuthorityList;

    /**
     * [get] PLAYER_AUTHORITY by player_id, named 'playerAuthorityList'.
     * @return The entity list of referrer property 'playerAuthorityList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbPlayerAuthority> getPlayerAuthorityList() {
        if (_playerAuthorityList == null) { _playerAuthorityList = newReferrerList(); }
        return _playerAuthorityList;
    }

    /**
     * [set] PLAYER_AUTHORITY by player_id, named 'playerAuthorityList'.
     * @param playerAuthorityList The entity list of referrer property 'playerAuthorityList'. (NullAllowed)
     */
    public void setPlayerAuthorityList(List<DbPlayerAuthority> playerAuthorityList) {
        _playerAuthorityList = playerAuthorityList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof DbBsPlayer) {
            DbBsPlayer other = (DbBsPlayer)obj;
            if (!xSV(_playerId, other._playerId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _playerId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_playerAccountAsOne != null && _playerAccountAsOne.isPresent())
        { sb.append(li).append(xbRDS(_playerAccountAsOne, "playerAccountAsOne")); }
        if (_gamePlayerList != null) { for (DbGamePlayer et : _gamePlayerList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "gamePlayerList")); } } }
        if (_playerAuthorityList != null) { for (DbPlayerAuthority et : _playerAuthorityList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "playerAuthorityList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_playerId));
        sb.append(dm).append(xfND(_playerName));
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
        if (_playerAccountAsOne != null && _playerAccountAsOne.isPresent())
        { sb.append(dm).append("playerAccountAsOne"); }
        if (_gamePlayerList != null && !_gamePlayerList.isEmpty())
        { sb.append(dm).append("gamePlayerList"); }
        if (_playerAuthorityList != null && !_playerAuthorityList.isEmpty())
        { sb.append(dm).append("playerAuthorityList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DbPlayer clone() {
        return (DbPlayer)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] player_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'player_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPlayerId() {
        checkSpecifiedProperty("playerId");
        return _playerId;
    }

    /**
     * [set] player_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param playerId The value of the column 'player_id'. (basically NotNull if update: for the constraint)
     */
    public void setPlayerId(Integer playerId) {
        registerModifiedProperty("playerId");
        _playerId = playerId;
    }

    /**
     * [get] player_name: {NotNull, VARCHAR(255)} <br>
     * @return The value of the column 'player_name'. (basically NotNull if selected: for the constraint)
     */
    public String getPlayerName() {
        checkSpecifiedProperty("playerName");
        return convertEmptyToNull(_playerName);
    }

    /**
     * [set] player_name: {NotNull, VARCHAR(255)} <br>
     * @param playerName The value of the column 'player_name'. (basically NotNull if update: for the constraint)
     */
    public void setPlayerName(String playerName) {
        registerModifiedProperty("playerName");
        _playerName = playerName;
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
