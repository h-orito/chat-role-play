package dev.wolfort.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import dev.wolfort.dbflute.allcommon.DbDBMetaInstanceHandler;
import dev.wolfort.dbflute.exentity.*;

/**
 * The entity of GAME_SETTING as TABLE. <br>
 * <pre>
 * [primary-key]
 *     game_setting_id
 *
 * [column]
 *     game_setting_id, game_id, game_setting_item_code, game_setting_item_value
 *
 * [sequence]
 *     
 *
 * [identity]
 *     game_setting_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     GAME
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     game
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer gameSettingId = entity.getGameSettingId();
 * Integer gameId = entity.getGameId();
 * String gameSettingItemCode = entity.getGameSettingItemCode();
 * String gameSettingItemValue = entity.getGameSettingItemValue();
 * entity.setGameSettingId(gameSettingId);
 * entity.setGameId(gameId);
 * entity.setGameSettingItemCode(gameSettingItemCode);
 * entity.setGameSettingItemValue(gameSettingItemValue);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsGameSetting extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** game_setting_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _gameSettingId;

    /** game_id: {IX, NotNull, INT UNSIGNED(10), FK to game} */
    protected Integer _gameId;

    /** game_setting_item_code: {NotNull, VARCHAR(255)} */
    protected String _gameSettingItemCode;

    /** game_setting_item_value: {NotNull, VARCHAR(1000)} */
    protected String _gameSettingItemValue;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DbDBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "game_setting";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_gameSettingId == null) { return false; }
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
        if (obj instanceof DbBsGameSetting) {
            DbBsGameSetting other = (DbBsGameSetting)obj;
            if (!xSV(_gameSettingId, other._gameSettingId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _gameSettingId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_game != null && _game.isPresent())
        { sb.append(li).append(xbRDS(_game, "game")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_gameSettingId));
        sb.append(dm).append(xfND(_gameId));
        sb.append(dm).append(xfND(_gameSettingItemCode));
        sb.append(dm).append(xfND(_gameSettingItemValue));
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
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DbGameSetting clone() {
        return (DbGameSetting)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] game_setting_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'game_setting_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getGameSettingId() {
        checkSpecifiedProperty("gameSettingId");
        return _gameSettingId;
    }

    /**
     * [set] game_setting_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param gameSettingId The value of the column 'game_setting_id'. (basically NotNull if update: for the constraint)
     */
    public void setGameSettingId(Integer gameSettingId) {
        registerModifiedProperty("gameSettingId");
        _gameSettingId = gameSettingId;
    }

    /**
     * [get] game_id: {IX, NotNull, INT UNSIGNED(10), FK to game} <br>
     * @return The value of the column 'game_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getGameId() {
        checkSpecifiedProperty("gameId");
        return _gameId;
    }

    /**
     * [set] game_id: {IX, NotNull, INT UNSIGNED(10), FK to game} <br>
     * @param gameId The value of the column 'game_id'. (basically NotNull if update: for the constraint)
     */
    public void setGameId(Integer gameId) {
        registerModifiedProperty("gameId");
        _gameId = gameId;
    }

    /**
     * [get] game_setting_item_code: {NotNull, VARCHAR(255)} <br>
     * @return The value of the column 'game_setting_item_code'. (basically NotNull if selected: for the constraint)
     */
    public String getGameSettingItemCode() {
        checkSpecifiedProperty("gameSettingItemCode");
        return convertEmptyToNull(_gameSettingItemCode);
    }

    /**
     * [set] game_setting_item_code: {NotNull, VARCHAR(255)} <br>
     * @param gameSettingItemCode The value of the column 'game_setting_item_code'. (basically NotNull if update: for the constraint)
     */
    public void setGameSettingItemCode(String gameSettingItemCode) {
        registerModifiedProperty("gameSettingItemCode");
        _gameSettingItemCode = gameSettingItemCode;
    }

    /**
     * [get] game_setting_item_value: {NotNull, VARCHAR(1000)} <br>
     * @return The value of the column 'game_setting_item_value'. (basically NotNull if selected: for the constraint)
     */
    public String getGameSettingItemValue() {
        checkSpecifiedProperty("gameSettingItemValue");
        return convertEmptyToNull(_gameSettingItemValue);
    }

    /**
     * [set] game_setting_item_value: {NotNull, VARCHAR(1000)} <br>
     * @param gameSettingItemValue The value of the column 'game_setting_item_value'. (basically NotNull if update: for the constraint)
     */
    public void setGameSettingItemValue(String gameSettingItemValue) {
        registerModifiedProperty("gameSettingItemValue");
        _gameSettingItemValue = gameSettingItemValue;
    }
}
