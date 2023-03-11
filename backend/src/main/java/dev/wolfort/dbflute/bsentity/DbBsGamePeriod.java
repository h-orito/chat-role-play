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
 * The entity of GAME_PERIOD as TABLE. <br>
 * <pre>
 * [primary-key]
 *     game_period_id
 *
 * [column]
 *     game_period_id, game_id, period, prefix, suffix, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     game_period_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     GAME
 *
 * [referrer table]
 *     MESSAGE, DIRECT_MESSAGE
 *
 * [foreign property]
 *     game
 *
 * [referrer property]
 *     messageList, directMessageList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer gamePeriodId = entity.getGamePeriodId();
 * Integer gameId = entity.getGameId();
 * Integer period = entity.getPeriod();
 * String prefix = entity.getPrefix();
 * String suffix = entity.getSuffix();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setGamePeriodId(gamePeriodId);
 * entity.setGameId(gameId);
 * entity.setPeriod(period);
 * entity.setPrefix(prefix);
 * entity.setSuffix(suffix);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsGamePeriod extends AbstractEntity implements DomainEntity, DbEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** game_period_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _gamePeriodId;

    /** game_id: {UQ+, NotNull, INT UNSIGNED(10), FK to game} */
    protected Integer _gameId;

    /** period: {+UQ, INT UNSIGNED(10)} */
    protected Integer _period;

    /** prefix: {VARCHAR(255)} */
    protected String _prefix;

    /** suffix: {VARCHAR(255)} */
    protected String _suffix;

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
        return "game_period";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_gamePeriodId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param gameId : UQ+, NotNull, INT UNSIGNED(10), FK to game. (NotNull)
     * @param period : +UQ, INT UNSIGNED(10). (NotNull)
     */
    public void uniqueBy(Integer gameId, Integer period) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("gameId");
        __uniqueDrivenProperties.addPropertyName("period");
        setGameId(gameId);setPeriod(period);
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

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** MESSAGE by game_period_id, named 'messageList'. */
    protected List<DbMessage> _messageList;

    /**
     * [get] MESSAGE by game_period_id, named 'messageList'.
     * @return The entity list of referrer property 'messageList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbMessage> getMessageList() {
        if (_messageList == null) { _messageList = newReferrerList(); }
        return _messageList;
    }

    /**
     * [set] MESSAGE by game_period_id, named 'messageList'.
     * @param messageList The entity list of referrer property 'messageList'. (NullAllowed)
     */
    public void setMessageList(List<DbMessage> messageList) {
        _messageList = messageList;
    }

    /** DIRECT_MESSAGE by game_period_id, named 'directMessageList'. */
    protected List<DbDirectMessage> _directMessageList;

    /**
     * [get] DIRECT_MESSAGE by game_period_id, named 'directMessageList'.
     * @return The entity list of referrer property 'directMessageList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbDirectMessage> getDirectMessageList() {
        if (_directMessageList == null) { _directMessageList = newReferrerList(); }
        return _directMessageList;
    }

    /**
     * [set] DIRECT_MESSAGE by game_period_id, named 'directMessageList'.
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
        if (obj instanceof DbBsGamePeriod) {
            DbBsGamePeriod other = (DbBsGamePeriod)obj;
            if (!xSV(_gamePeriodId, other._gamePeriodId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _gamePeriodId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_game != null && _game.isPresent())
        { sb.append(li).append(xbRDS(_game, "game")); }
        if (_messageList != null) { for (DbMessage et : _messageList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "messageList")); } } }
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
        sb.append(dm).append(xfND(_gamePeriodId));
        sb.append(dm).append(xfND(_gameId));
        sb.append(dm).append(xfND(_period));
        sb.append(dm).append(xfND(_prefix));
        sb.append(dm).append(xfND(_suffix));
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
        if (_messageList != null && !_messageList.isEmpty())
        { sb.append(dm).append("messageList"); }
        if (_directMessageList != null && !_directMessageList.isEmpty())
        { sb.append(dm).append("directMessageList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DbGamePeriod clone() {
        return (DbGamePeriod)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] game_period_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'game_period_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getGamePeriodId() {
        checkSpecifiedProperty("gamePeriodId");
        return _gamePeriodId;
    }

    /**
     * [set] game_period_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param gamePeriodId The value of the column 'game_period_id'. (basically NotNull if update: for the constraint)
     */
    public void setGamePeriodId(Integer gamePeriodId) {
        registerModifiedProperty("gamePeriodId");
        _gamePeriodId = gamePeriodId;
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
     * [get] period: {+UQ, INT UNSIGNED(10)} <br>
     * @return The value of the column 'period'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getPeriod() {
        checkSpecifiedProperty("period");
        return _period;
    }

    /**
     * [set] period: {+UQ, INT UNSIGNED(10)} <br>
     * @param period The value of the column 'period'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPeriod(Integer period) {
        registerModifiedProperty("period");
        _period = period;
    }

    /**
     * [get] prefix: {VARCHAR(255)} <br>
     * @return The value of the column 'prefix'. (NullAllowed even if selected: for no constraint)
     */
    public String getPrefix() {
        checkSpecifiedProperty("prefix");
        return convertEmptyToNull(_prefix);
    }

    /**
     * [set] prefix: {VARCHAR(255)} <br>
     * @param prefix The value of the column 'prefix'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrefix(String prefix) {
        registerModifiedProperty("prefix");
        _prefix = prefix;
    }

    /**
     * [get] suffix: {VARCHAR(255)} <br>
     * @return The value of the column 'suffix'. (NullAllowed even if selected: for no constraint)
     */
    public String getSuffix() {
        checkSpecifiedProperty("suffix");
        return convertEmptyToNull(_suffix);
    }

    /**
     * [set] suffix: {VARCHAR(255)} <br>
     * @param suffix The value of the column 'suffix'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSuffix(String suffix) {
        registerModifiedProperty("suffix");
        _suffix = suffix;
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
