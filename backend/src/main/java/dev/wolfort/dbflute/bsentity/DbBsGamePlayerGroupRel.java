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
 * The entity of GAME_PLAYER_GROUP_REL as TABLE. <br>
 * <pre>
 * [primary-key]
 *     game_player_group_rel_id
 *
 * [column]
 *     game_player_group_rel_id, game_player_group, game_player_id, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     game_player_group_rel_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     GAME_PLAYER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     gamePlayer
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer gamePlayerGroupRelId = entity.getGamePlayerGroupRelId();
 * Integer gamePlayerGroup = entity.getGamePlayerGroup();
 * Integer gamePlayerId = entity.getGamePlayerId();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setGamePlayerGroupRelId(gamePlayerGroupRelId);
 * entity.setGamePlayerGroup(gamePlayerGroup);
 * entity.setGamePlayerId(gamePlayerId);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsGamePlayerGroupRel extends AbstractEntity implements DomainEntity, DbEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** game_player_group_rel_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _gamePlayerGroupRelId;

    /** game_player_group: {UQ+, NotNull, INT UNSIGNED(10)} */
    protected Integer _gamePlayerGroup;

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
        return "game_player_group_rel";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_gamePlayerGroupRelId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param gamePlayerGroup : UQ+, NotNull, INT UNSIGNED(10). (NotNull)
     * @param gamePlayerId : +UQ, IX, NotNull, INT UNSIGNED(10), FK to game_player. (NotNull)
     */
    public void uniqueBy(Integer gamePlayerGroup, Integer gamePlayerId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("gamePlayerGroup");
        __uniqueDrivenProperties.addPropertyName("gamePlayerId");
        setGamePlayerGroup(gamePlayerGroup);setGamePlayerId(gamePlayerId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
        if (obj instanceof DbBsGamePlayerGroupRel) {
            DbBsGamePlayerGroupRel other = (DbBsGamePlayerGroupRel)obj;
            if (!xSV(_gamePlayerGroupRelId, other._gamePlayerGroupRelId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _gamePlayerGroupRelId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
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
        sb.append(dm).append(xfND(_gamePlayerGroupRelId));
        sb.append(dm).append(xfND(_gamePlayerGroup));
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
        if (_gamePlayer != null && _gamePlayer.isPresent())
        { sb.append(dm).append("gamePlayer"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DbGamePlayerGroupRel clone() {
        return (DbGamePlayerGroupRel)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] game_player_group_rel_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'game_player_group_rel_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getGamePlayerGroupRelId() {
        checkSpecifiedProperty("gamePlayerGroupRelId");
        return _gamePlayerGroupRelId;
    }

    /**
     * [set] game_player_group_rel_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param gamePlayerGroupRelId The value of the column 'game_player_group_rel_id'. (basically NotNull if update: for the constraint)
     */
    public void setGamePlayerGroupRelId(Integer gamePlayerGroupRelId) {
        registerModifiedProperty("gamePlayerGroupRelId");
        _gamePlayerGroupRelId = gamePlayerGroupRelId;
    }

    /**
     * [get] game_player_group: {UQ+, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'game_player_group'. (basically NotNull if selected: for the constraint)
     */
    public Integer getGamePlayerGroup() {
        checkSpecifiedProperty("gamePlayerGroup");
        return _gamePlayerGroup;
    }

    /**
     * [set] game_player_group: {UQ+, NotNull, INT UNSIGNED(10)} <br>
     * @param gamePlayerGroup The value of the column 'game_player_group'. (basically NotNull if update: for the constraint)
     */
    public void setGamePlayerGroup(Integer gamePlayerGroup) {
        registerModifiedProperty("gamePlayerGroup");
        _gamePlayerGroup = gamePlayerGroup;
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
