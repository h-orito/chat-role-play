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
 * The entity of CHARACHIP as TABLE. <br>
 * <pre>
 * [primary-key]
 *     charachip_id
 *
 * [column]
 *     charachip_id, charachip_name, designer_id, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     charachip_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     DESIGNER
 *
 * [referrer table]
 *     CHARA
 *
 * [foreign property]
 *     designer
 *
 * [referrer property]
 *     charaList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer charachipId = entity.getCharachipId();
 * String charachipName = entity.getCharachipName();
 * Integer designerId = entity.getDesignerId();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setCharachipId(charachipId);
 * entity.setCharachipName(charachipName);
 * entity.setDesignerId(designerId);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsCharachip extends AbstractEntity implements DomainEntity, DbEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** charachip_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _charachipId;

    /** charachip_name: {VARCHAR(255)} */
    protected String _charachipName;

    /** designer_id: {IX, NotNull, INT UNSIGNED(10), FK to designer} */
    protected Integer _designerId;

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
        return "charachip";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_charachipId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** DESIGNER by my designer_id, named 'designer'. */
    protected OptionalEntity<DbDesigner> _designer;

    /**
     * [get] DESIGNER by my designer_id, named 'designer'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'designer'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<DbDesigner> getDesigner() {
        if (_designer == null) { _designer = OptionalEntity.relationEmpty(this, "designer"); }
        return _designer;
    }

    /**
     * [set] DESIGNER by my designer_id, named 'designer'.
     * @param designer The entity of foreign property 'designer'. (NullAllowed)
     */
    public void setDesigner(OptionalEntity<DbDesigner> designer) {
        _designer = designer;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** CHARA by charachip_id, named 'charaList'. */
    protected List<DbChara> _charaList;

    /**
     * [get] CHARA by charachip_id, named 'charaList'.
     * @return The entity list of referrer property 'charaList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbChara> getCharaList() {
        if (_charaList == null) { _charaList = newReferrerList(); }
        return _charaList;
    }

    /**
     * [set] CHARA by charachip_id, named 'charaList'.
     * @param charaList The entity list of referrer property 'charaList'. (NullAllowed)
     */
    public void setCharaList(List<DbChara> charaList) {
        _charaList = charaList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof DbBsCharachip) {
            DbBsCharachip other = (DbBsCharachip)obj;
            if (!xSV(_charachipId, other._charachipId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _charachipId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_designer != null && _designer.isPresent())
        { sb.append(li).append(xbRDS(_designer, "designer")); }
        if (_charaList != null) { for (DbChara et : _charaList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "charaList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_charachipId));
        sb.append(dm).append(xfND(_charachipName));
        sb.append(dm).append(xfND(_designerId));
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
        if (_designer != null && _designer.isPresent())
        { sb.append(dm).append("designer"); }
        if (_charaList != null && !_charaList.isEmpty())
        { sb.append(dm).append("charaList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DbCharachip clone() {
        return (DbCharachip)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] charachip_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'charachip_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCharachipId() {
        checkSpecifiedProperty("charachipId");
        return _charachipId;
    }

    /**
     * [set] charachip_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param charachipId The value of the column 'charachip_id'. (basically NotNull if update: for the constraint)
     */
    public void setCharachipId(Integer charachipId) {
        registerModifiedProperty("charachipId");
        _charachipId = charachipId;
    }

    /**
     * [get] charachip_name: {VARCHAR(255)} <br>
     * @return The value of the column 'charachip_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getCharachipName() {
        checkSpecifiedProperty("charachipName");
        return convertEmptyToNull(_charachipName);
    }

    /**
     * [set] charachip_name: {VARCHAR(255)} <br>
     * @param charachipName The value of the column 'charachip_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCharachipName(String charachipName) {
        registerModifiedProperty("charachipName");
        _charachipName = charachipName;
    }

    /**
     * [get] designer_id: {IX, NotNull, INT UNSIGNED(10), FK to designer} <br>
     * @return The value of the column 'designer_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getDesignerId() {
        checkSpecifiedProperty("designerId");
        return _designerId;
    }

    /**
     * [set] designer_id: {IX, NotNull, INT UNSIGNED(10), FK to designer} <br>
     * @param designerId The value of the column 'designer_id'. (basically NotNull if update: for the constraint)
     */
    public void setDesignerId(Integer designerId) {
        registerModifiedProperty("designerId");
        _designerId = designerId;
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
