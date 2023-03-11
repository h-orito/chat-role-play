package dev.wolfort.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import dev.wolfort.dbflute.cbean.cq.ciq.*;
import dev.wolfort.dbflute.cbean.*;
import dev.wolfort.dbflute.cbean.cq.*;

/**
 * The base condition-query of chara_image.
 * @author DBFlute(AutoGenerator)
 */
public class DbBsCharaImageCQ extends DbAbstractBsCharaImageCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbCharaImageCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbBsCharaImageCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from chara_image) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public DbCharaImageCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected DbCharaImageCIQ xcreateCIQ() {
        DbCharaImageCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected DbCharaImageCIQ xnewCIQ() {
        return new DbCharaImageCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join chara_image on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public DbCharaImageCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        DbCharaImageCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _charaImageId;
    public ConditionValue xdfgetCharaImageId()
    { if (_charaImageId == null) { _charaImageId = nCV(); }
      return _charaImageId; }
    protected ConditionValue xgetCValueCharaImageId() { return xdfgetCharaImageId(); }

    /**
     * Add order-by as ascend. <br>
     * chara_image_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsCharaImageCQ addOrderBy_CharaImageId_Asc() { regOBA("chara_image_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * chara_image_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsCharaImageCQ addOrderBy_CharaImageId_Desc() { regOBD("chara_image_id"); return this; }

    protected ConditionValue _charaId;
    public ConditionValue xdfgetCharaId()
    { if (_charaId == null) { _charaId = nCV(); }
      return _charaId; }
    protected ConditionValue xgetCValueCharaId() { return xdfgetCharaId(); }

    /**
     * Add order-by as ascend. <br>
     * chara_id: {IX, NotNull, INT UNSIGNED(10), FK to chara}
     * @return this. (NotNull)
     */
    public DbBsCharaImageCQ addOrderBy_CharaId_Asc() { regOBA("chara_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * chara_id: {IX, NotNull, INT UNSIGNED(10), FK to chara}
     * @return this. (NotNull)
     */
    public DbBsCharaImageCQ addOrderBy_CharaId_Desc() { regOBD("chara_id"); return this; }

    protected ConditionValue _faceTypeCode;
    public ConditionValue xdfgetFaceTypeCode()
    { if (_faceTypeCode == null) { _faceTypeCode = nCV(); }
      return _faceTypeCode; }
    protected ConditionValue xgetCValueFaceTypeCode() { return xdfgetFaceTypeCode(); }

    /**
     * Add order-by as ascend. <br>
     * face_type_code: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsCharaImageCQ addOrderBy_FaceTypeCode_Asc() { regOBA("face_type_code"); return this; }

    /**
     * Add order-by as descend. <br>
     * face_type_code: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsCharaImageCQ addOrderBy_FaceTypeCode_Desc() { regOBD("face_type_code"); return this; }

    protected ConditionValue _charaImgUrl;
    public ConditionValue xdfgetCharaImgUrl()
    { if (_charaImgUrl == null) { _charaImgUrl = nCV(); }
      return _charaImgUrl; }
    protected ConditionValue xgetCValueCharaImgUrl() { return xdfgetCharaImgUrl(); }

    /**
     * Add order-by as ascend. <br>
     * chara_img_url: {NotNull, VARCHAR(1000)}
     * @return this. (NotNull)
     */
    public DbBsCharaImageCQ addOrderBy_CharaImgUrl_Asc() { regOBA("chara_img_url"); return this; }

    /**
     * Add order-by as descend. <br>
     * chara_img_url: {NotNull, VARCHAR(1000)}
     * @return this. (NotNull)
     */
    public DbBsCharaImageCQ addOrderBy_CharaImgUrl_Desc() { regOBD("chara_img_url"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsCharaImageCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsCharaImageCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

    protected ConditionValue _registerTrace;
    public ConditionValue xdfgetRegisterTrace()
    { if (_registerTrace == null) { _registerTrace = nCV(); }
      return _registerTrace; }
    protected ConditionValue xgetCValueRegisterTrace() { return xdfgetRegisterTrace(); }

    /**
     * Add order-by as ascend. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsCharaImageCQ addOrderBy_RegisterTrace_Asc() { regOBA("register_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsCharaImageCQ addOrderBy_RegisterTrace_Desc() { regOBD("register_trace"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsCharaImageCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsCharaImageCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

    protected ConditionValue _updateTrace;
    public ConditionValue xdfgetUpdateTrace()
    { if (_updateTrace == null) { _updateTrace = nCV(); }
      return _updateTrace; }
    protected ConditionValue xgetCValueUpdateTrace() { return xdfgetUpdateTrace(); }

    /**
     * Add order-by as ascend. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsCharaImageCQ addOrderBy_UpdateTrace_Asc() { regOBA("update_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsCharaImageCQ addOrderBy_UpdateTrace_Desc() { regOBD("update_trace"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public DbBsCharaImageCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public DbBsCharaImageCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        DbCharaImageCQ bq = (DbCharaImageCQ)bqs;
        DbCharaImageCQ uq = (DbCharaImageCQ)uqs;
        if (bq.hasConditionQueryChara()) {
            uq.queryChara().reflectRelationOnUnionQuery(bq.queryChara(), uq.queryChara());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * CHARA by my chara_id, named 'chara'.
     * @return The instance of condition-query. (NotNull)
     */
    public DbCharaCQ queryChara() {
        return xdfgetConditionQueryChara();
    }
    public DbCharaCQ xdfgetConditionQueryChara() {
        String prop = "chara";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryChara()); xsetupOuterJoinChara(); }
        return xgetQueRlMap(prop);
    }
    protected DbCharaCQ xcreateQueryChara() {
        String nrp = xresolveNRP("chara_image", "chara"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new DbCharaCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "chara", nrp);
    }
    protected void xsetupOuterJoinChara() { xregOutJo("chara"); }
    public boolean hasConditionQueryChara() { return xhasQueRlMap("chara"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, DbCharaImageCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(DbCharaImageCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, DbCharaImageCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(DbCharaImageCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, DbCharaImageCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(DbCharaImageCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, DbCharaImageCQ> _myselfExistsMap;
    public Map<String, DbCharaImageCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(DbCharaImageCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, DbCharaImageCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(DbCharaImageCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return DbCharaImageCB.class.getName(); }
    protected String xCQ() { return DbCharaImageCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
