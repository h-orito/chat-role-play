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
 * The entity of CHARA_IMAGE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     chara_image_id
 *
 * [column]
 *     chara_image_id, chara_id, face_type_code, chara_img_url, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     chara_image_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     CHARA
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     chara
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer charaImageId = entity.getCharaImageId();
 * Integer charaId = entity.getCharaId();
 * String faceTypeCode = entity.getFaceTypeCode();
 * String charaImgUrl = entity.getCharaImgUrl();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setCharaImageId(charaImageId);
 * entity.setCharaId(charaId);
 * entity.setFaceTypeCode(faceTypeCode);
 * entity.setCharaImgUrl(charaImgUrl);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsCharaImage extends AbstractEntity implements DomainEntity, DbEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** chara_image_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _charaImageId;

    /** chara_id: {IX, NotNull, INT UNSIGNED(10), FK to chara} */
    protected Integer _charaId;

    /** face_type_code: {NotNull, VARCHAR(255)} */
    protected String _faceTypeCode;

    /** chara_img_url: {NotNull, VARCHAR(1000)} */
    protected String _charaImgUrl;

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
        return "chara_image";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_charaImageId == null) { return false; }
        return true;
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
        if (obj instanceof DbBsCharaImage) {
            DbBsCharaImage other = (DbBsCharaImage)obj;
            if (!xSV(_charaImageId, other._charaImageId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _charaImageId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_chara != null && _chara.isPresent())
        { sb.append(li).append(xbRDS(_chara, "chara")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_charaImageId));
        sb.append(dm).append(xfND(_charaId));
        sb.append(dm).append(xfND(_faceTypeCode));
        sb.append(dm).append(xfND(_charaImgUrl));
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
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DbCharaImage clone() {
        return (DbCharaImage)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] chara_image_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'chara_image_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCharaImageId() {
        checkSpecifiedProperty("charaImageId");
        return _charaImageId;
    }

    /**
     * [set] chara_image_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param charaImageId The value of the column 'chara_image_id'. (basically NotNull if update: for the constraint)
     */
    public void setCharaImageId(Integer charaImageId) {
        registerModifiedProperty("charaImageId");
        _charaImageId = charaImageId;
    }

    /**
     * [get] chara_id: {IX, NotNull, INT UNSIGNED(10), FK to chara} <br>
     * @return The value of the column 'chara_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCharaId() {
        checkSpecifiedProperty("charaId");
        return _charaId;
    }

    /**
     * [set] chara_id: {IX, NotNull, INT UNSIGNED(10), FK to chara} <br>
     * @param charaId The value of the column 'chara_id'. (basically NotNull if update: for the constraint)
     */
    public void setCharaId(Integer charaId) {
        registerModifiedProperty("charaId");
        _charaId = charaId;
    }

    /**
     * [get] face_type_code: {NotNull, VARCHAR(255)} <br>
     * @return The value of the column 'face_type_code'. (basically NotNull if selected: for the constraint)
     */
    public String getFaceTypeCode() {
        checkSpecifiedProperty("faceTypeCode");
        return convertEmptyToNull(_faceTypeCode);
    }

    /**
     * [set] face_type_code: {NotNull, VARCHAR(255)} <br>
     * @param faceTypeCode The value of the column 'face_type_code'. (basically NotNull if update: for the constraint)
     */
    public void setFaceTypeCode(String faceTypeCode) {
        registerModifiedProperty("faceTypeCode");
        _faceTypeCode = faceTypeCode;
    }

    /**
     * [get] chara_img_url: {NotNull, VARCHAR(1000)} <br>
     * @return The value of the column 'chara_img_url'. (basically NotNull if selected: for the constraint)
     */
    public String getCharaImgUrl() {
        checkSpecifiedProperty("charaImgUrl");
        return convertEmptyToNull(_charaImgUrl);
    }

    /**
     * [set] chara_img_url: {NotNull, VARCHAR(1000)} <br>
     * @param charaImgUrl The value of the column 'chara_img_url'. (basically NotNull if update: for the constraint)
     */
    public void setCharaImgUrl(String charaImgUrl) {
        registerModifiedProperty("charaImgUrl");
        _charaImgUrl = charaImgUrl;
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
