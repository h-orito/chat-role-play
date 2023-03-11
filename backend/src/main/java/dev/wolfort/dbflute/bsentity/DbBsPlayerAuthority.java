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
 * The entity of PLAYER_AUTHORITY as TABLE. <br>
 * <pre>
 * [primary-key]
 *     player_authority_id
 *
 * [column]
 *     player_authority_id, player_id, authority_code, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     player_authority_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     PLAYER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     player
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer playerAuthorityId = entity.getPlayerAuthorityId();
 * Integer playerId = entity.getPlayerId();
 * String authorityCode = entity.getAuthorityCode();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setPlayerAuthorityId(playerAuthorityId);
 * entity.setPlayerId(playerId);
 * entity.setAuthorityCode(authorityCode);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsPlayerAuthority extends AbstractEntity implements DomainEntity, DbEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** player_authority_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _playerAuthorityId;

    /** player_id: {UQ+, NotNull, INT UNSIGNED(10), FK to player} */
    protected Integer _playerId;

    /** authority_code: {+UQ, NotNull, VARCHAR(255)} */
    protected String _authorityCode;

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
        return "player_authority";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_playerAuthorityId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param playerId : UQ+, NotNull, INT UNSIGNED(10), FK to player. (NotNull)
     * @param authorityCode : +UQ, NotNull, VARCHAR(255). (NotNull)
     */
    public void uniqueBy(Integer playerId, String authorityCode) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("playerId");
        __uniqueDrivenProperties.addPropertyName("authorityCode");
        setPlayerId(playerId);setAuthorityCode(authorityCode);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof DbBsPlayerAuthority) {
            DbBsPlayerAuthority other = (DbBsPlayerAuthority)obj;
            if (!xSV(_playerAuthorityId, other._playerAuthorityId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _playerAuthorityId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_player != null && _player.isPresent())
        { sb.append(li).append(xbRDS(_player, "player")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_playerAuthorityId));
        sb.append(dm).append(xfND(_playerId));
        sb.append(dm).append(xfND(_authorityCode));
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
        if (_player != null && _player.isPresent())
        { sb.append(dm).append("player"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DbPlayerAuthority clone() {
        return (DbPlayerAuthority)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] player_authority_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'player_authority_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPlayerAuthorityId() {
        checkSpecifiedProperty("playerAuthorityId");
        return _playerAuthorityId;
    }

    /**
     * [set] player_authority_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param playerAuthorityId The value of the column 'player_authority_id'. (basically NotNull if update: for the constraint)
     */
    public void setPlayerAuthorityId(Integer playerAuthorityId) {
        registerModifiedProperty("playerAuthorityId");
        _playerAuthorityId = playerAuthorityId;
    }

    /**
     * [get] player_id: {UQ+, NotNull, INT UNSIGNED(10), FK to player} <br>
     * @return The value of the column 'player_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPlayerId() {
        checkSpecifiedProperty("playerId");
        return _playerId;
    }

    /**
     * [set] player_id: {UQ+, NotNull, INT UNSIGNED(10), FK to player} <br>
     * @param playerId The value of the column 'player_id'. (basically NotNull if update: for the constraint)
     */
    public void setPlayerId(Integer playerId) {
        registerModifiedProperty("playerId");
        _playerId = playerId;
    }

    /**
     * [get] authority_code: {+UQ, NotNull, VARCHAR(255)} <br>
     * @return The value of the column 'authority_code'. (basically NotNull if selected: for the constraint)
     */
    public String getAuthorityCode() {
        checkSpecifiedProperty("authorityCode");
        return convertEmptyToNull(_authorityCode);
    }

    /**
     * [set] authority_code: {+UQ, NotNull, VARCHAR(255)} <br>
     * @param authorityCode The value of the column 'authority_code'. (basically NotNull if update: for the constraint)
     */
    public void setAuthorityCode(String authorityCode) {
        registerModifiedProperty("authorityCode");
        _authorityCode = authorityCode;
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
