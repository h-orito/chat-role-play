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
 * The entity of CHARA as TABLE. <br>
 * <pre>
 * [primary-key]
 *     chara_id
 *
 * [column]
 *     chara_id, chara_name, charachip_id, display_width, display_height, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     chara_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     CHARACHIP
 *
 * [referrer table]
 *     CHARA_IMAGE, GAME_PLAYER
 *
 * [foreign property]
 *     charachip
 *
 * [referrer property]
 *     charaImageList, gamePlayerList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer charaId = entity.getCharaId();
 * String charaName = entity.getCharaName();
 * Integer charachipId = entity.getCharachipId();
 * Integer displayWidth = entity.getDisplayWidth();
 * Integer displayHeight = entity.getDisplayHeight();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setCharaId(charaId);
 * entity.setCharaName(charaName);
 * entity.setCharachipId(charachipId);
 * entity.setDisplayWidth(displayWidth);
 * entity.setDisplayHeight(displayHeight);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsChara extends AbstractEntity implements DomainEntity, DbEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** chara_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _charaId;

    /** chara_name: {NotNull, VARCHAR(255)} */
    protected String _charaName;

    /** charachip_id: {IX, NotNull, INT UNSIGNED(10), FK to charachip} */
    protected Integer _charachipId;

    /** display_width: {NotNull, INT UNSIGNED(10)} */
    protected Integer _displayWidth;

    /** display_height: {NotNull, INT UNSIGNED(10)} */
    protected Integer _displayHeight;

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
        return "chara";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_charaId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** CHARACHIP by my charachip_id, named 'charachip'. */
    protected OptionalEntity<DbCharachip> _charachip;

    /**
     * [get] CHARACHIP by my charachip_id, named 'charachip'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'charachip'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<DbCharachip> getCharachip() {
        if (_charachip == null) { _charachip = OptionalEntity.relationEmpty(this, "charachip"); }
        return _charachip;
    }

    /**
     * [set] CHARACHIP by my charachip_id, named 'charachip'.
     * @param charachip The entity of foreign property 'charachip'. (NullAllowed)
     */
    public void setCharachip(OptionalEntity<DbCharachip> charachip) {
        _charachip = charachip;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** CHARA_IMAGE by chara_id, named 'charaImageList'. */
    protected List<DbCharaImage> _charaImageList;

    /**
     * [get] CHARA_IMAGE by chara_id, named 'charaImageList'.
     * @return The entity list of referrer property 'charaImageList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbCharaImage> getCharaImageList() {
        if (_charaImageList == null) { _charaImageList = newReferrerList(); }
        return _charaImageList;
    }

    /**
     * [set] CHARA_IMAGE by chara_id, named 'charaImageList'.
     * @param charaImageList The entity list of referrer property 'charaImageList'. (NullAllowed)
     */
    public void setCharaImageList(List<DbCharaImage> charaImageList) {
        _charaImageList = charaImageList;
    }

    /** GAME_PLAYER by chara_id, named 'gamePlayerList'. */
    protected List<DbGamePlayer> _gamePlayerList;

    /**
     * [get] GAME_PLAYER by chara_id, named 'gamePlayerList'.
     * @return The entity list of referrer property 'gamePlayerList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbGamePlayer> getGamePlayerList() {
        if (_gamePlayerList == null) { _gamePlayerList = newReferrerList(); }
        return _gamePlayerList;
    }

    /**
     * [set] GAME_PLAYER by chara_id, named 'gamePlayerList'.
     * @param gamePlayerList The entity list of referrer property 'gamePlayerList'. (NullAllowed)
     */
    public void setGamePlayerList(List<DbGamePlayer> gamePlayerList) {
        _gamePlayerList = gamePlayerList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof DbBsChara) {
            DbBsChara other = (DbBsChara)obj;
            if (!xSV(_charaId, other._charaId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _charaId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_charachip != null && _charachip.isPresent())
        { sb.append(li).append(xbRDS(_charachip, "charachip")); }
        if (_charaImageList != null) { for (DbCharaImage et : _charaImageList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "charaImageList")); } } }
        if (_gamePlayerList != null) { for (DbGamePlayer et : _gamePlayerList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "gamePlayerList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_charaId));
        sb.append(dm).append(xfND(_charaName));
        sb.append(dm).append(xfND(_charachipId));
        sb.append(dm).append(xfND(_displayWidth));
        sb.append(dm).append(xfND(_displayHeight));
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
        if (_charachip != null && _charachip.isPresent())
        { sb.append(dm).append("charachip"); }
        if (_charaImageList != null && !_charaImageList.isEmpty())
        { sb.append(dm).append("charaImageList"); }
        if (_gamePlayerList != null && !_gamePlayerList.isEmpty())
        { sb.append(dm).append("gamePlayerList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DbChara clone() {
        return (DbChara)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] chara_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'chara_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCharaId() {
        checkSpecifiedProperty("charaId");
        return _charaId;
    }

    /**
     * [set] chara_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param charaId The value of the column 'chara_id'. (basically NotNull if update: for the constraint)
     */
    public void setCharaId(Integer charaId) {
        registerModifiedProperty("charaId");
        _charaId = charaId;
    }

    /**
     * [get] chara_name: {NotNull, VARCHAR(255)} <br>
     * @return The value of the column 'chara_name'. (basically NotNull if selected: for the constraint)
     */
    public String getCharaName() {
        checkSpecifiedProperty("charaName");
        return convertEmptyToNull(_charaName);
    }

    /**
     * [set] chara_name: {NotNull, VARCHAR(255)} <br>
     * @param charaName The value of the column 'chara_name'. (basically NotNull if update: for the constraint)
     */
    public void setCharaName(String charaName) {
        registerModifiedProperty("charaName");
        _charaName = charaName;
    }

    /**
     * [get] charachip_id: {IX, NotNull, INT UNSIGNED(10), FK to charachip} <br>
     * @return The value of the column 'charachip_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCharachipId() {
        checkSpecifiedProperty("charachipId");
        return _charachipId;
    }

    /**
     * [set] charachip_id: {IX, NotNull, INT UNSIGNED(10), FK to charachip} <br>
     * @param charachipId The value of the column 'charachip_id'. (basically NotNull if update: for the constraint)
     */
    public void setCharachipId(Integer charachipId) {
        registerModifiedProperty("charachipId");
        _charachipId = charachipId;
    }

    /**
     * [get] display_width: {NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'display_width'. (basically NotNull if selected: for the constraint)
     */
    public Integer getDisplayWidth() {
        checkSpecifiedProperty("displayWidth");
        return _displayWidth;
    }

    /**
     * [set] display_width: {NotNull, INT UNSIGNED(10)} <br>
     * @param displayWidth The value of the column 'display_width'. (basically NotNull if update: for the constraint)
     */
    public void setDisplayWidth(Integer displayWidth) {
        registerModifiedProperty("displayWidth");
        _displayWidth = displayWidth;
    }

    /**
     * [get] display_height: {NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'display_height'. (basically NotNull if selected: for the constraint)
     */
    public Integer getDisplayHeight() {
        checkSpecifiedProperty("displayHeight");
        return _displayHeight;
    }

    /**
     * [set] display_height: {NotNull, INT UNSIGNED(10)} <br>
     * @param displayHeight The value of the column 'display_height'. (basically NotNull if update: for the constraint)
     */
    public void setDisplayHeight(Integer displayHeight) {
        registerModifiedProperty("displayHeight");
        _displayHeight = displayHeight;
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
