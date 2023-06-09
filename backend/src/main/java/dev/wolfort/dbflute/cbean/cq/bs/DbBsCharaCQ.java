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
 * The base condition-query of chara.
 * @author DBFlute(AutoGenerator)
 */
public class DbBsCharaCQ extends DbAbstractBsCharaCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbCharaCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbBsCharaCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from chara) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public DbCharaCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected DbCharaCIQ xcreateCIQ() {
        DbCharaCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected DbCharaCIQ xnewCIQ() {
        return new DbCharaCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join chara on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public DbCharaCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        DbCharaCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _charaId;
    public ConditionValue xdfgetCharaId()
    { if (_charaId == null) { _charaId = nCV(); }
      return _charaId; }
    protected ConditionValue xgetCValueCharaId() { return xdfgetCharaId(); }

    public Map<String, DbCharaImageCQ> xdfgetCharaId_ExistsReferrer_CharaImageList() { return xgetSQueMap("charaId_ExistsReferrer_CharaImageList"); }
    public String keepCharaId_ExistsReferrer_CharaImageList(DbCharaImageCQ sq) { return xkeepSQue("charaId_ExistsReferrer_CharaImageList", sq); }

    public Map<String, DbGamePlayerCQ> xdfgetCharaId_ExistsReferrer_GamePlayerList() { return xgetSQueMap("charaId_ExistsReferrer_GamePlayerList"); }
    public String keepCharaId_ExistsReferrer_GamePlayerList(DbGamePlayerCQ sq) { return xkeepSQue("charaId_ExistsReferrer_GamePlayerList", sq); }

    public Map<String, DbCharaImageCQ> xdfgetCharaId_NotExistsReferrer_CharaImageList() { return xgetSQueMap("charaId_NotExistsReferrer_CharaImageList"); }
    public String keepCharaId_NotExistsReferrer_CharaImageList(DbCharaImageCQ sq) { return xkeepSQue("charaId_NotExistsReferrer_CharaImageList", sq); }

    public Map<String, DbGamePlayerCQ> xdfgetCharaId_NotExistsReferrer_GamePlayerList() { return xgetSQueMap("charaId_NotExistsReferrer_GamePlayerList"); }
    public String keepCharaId_NotExistsReferrer_GamePlayerList(DbGamePlayerCQ sq) { return xkeepSQue("charaId_NotExistsReferrer_GamePlayerList", sq); }

    public Map<String, DbCharaImageCQ> xdfgetCharaId_SpecifyDerivedReferrer_CharaImageList() { return xgetSQueMap("charaId_SpecifyDerivedReferrer_CharaImageList"); }
    public String keepCharaId_SpecifyDerivedReferrer_CharaImageList(DbCharaImageCQ sq) { return xkeepSQue("charaId_SpecifyDerivedReferrer_CharaImageList", sq); }

    public Map<String, DbGamePlayerCQ> xdfgetCharaId_SpecifyDerivedReferrer_GamePlayerList() { return xgetSQueMap("charaId_SpecifyDerivedReferrer_GamePlayerList"); }
    public String keepCharaId_SpecifyDerivedReferrer_GamePlayerList(DbGamePlayerCQ sq) { return xkeepSQue("charaId_SpecifyDerivedReferrer_GamePlayerList", sq); }

    public Map<String, DbCharaImageCQ> xdfgetCharaId_QueryDerivedReferrer_CharaImageList() { return xgetSQueMap("charaId_QueryDerivedReferrer_CharaImageList"); }
    public String keepCharaId_QueryDerivedReferrer_CharaImageList(DbCharaImageCQ sq) { return xkeepSQue("charaId_QueryDerivedReferrer_CharaImageList", sq); }
    public Map<String, Object> xdfgetCharaId_QueryDerivedReferrer_CharaImageListParameter() { return xgetSQuePmMap("charaId_QueryDerivedReferrer_CharaImageList"); }
    public String keepCharaId_QueryDerivedReferrer_CharaImageListParameter(Object pm) { return xkeepSQuePm("charaId_QueryDerivedReferrer_CharaImageList", pm); }

    public Map<String, DbGamePlayerCQ> xdfgetCharaId_QueryDerivedReferrer_GamePlayerList() { return xgetSQueMap("charaId_QueryDerivedReferrer_GamePlayerList"); }
    public String keepCharaId_QueryDerivedReferrer_GamePlayerList(DbGamePlayerCQ sq) { return xkeepSQue("charaId_QueryDerivedReferrer_GamePlayerList", sq); }
    public Map<String, Object> xdfgetCharaId_QueryDerivedReferrer_GamePlayerListParameter() { return xgetSQuePmMap("charaId_QueryDerivedReferrer_GamePlayerList"); }
    public String keepCharaId_QueryDerivedReferrer_GamePlayerListParameter(Object pm) { return xkeepSQuePm("charaId_QueryDerivedReferrer_GamePlayerList", pm); }

    /**
     * Add order-by as ascend. <br>
     * chara_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsCharaCQ addOrderBy_CharaId_Asc() { regOBA("chara_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * chara_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsCharaCQ addOrderBy_CharaId_Desc() { regOBD("chara_id"); return this; }

    protected ConditionValue _charaName;
    public ConditionValue xdfgetCharaName()
    { if (_charaName == null) { _charaName = nCV(); }
      return _charaName; }
    protected ConditionValue xgetCValueCharaName() { return xdfgetCharaName(); }

    /**
     * Add order-by as ascend. <br>
     * chara_name: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsCharaCQ addOrderBy_CharaName_Asc() { regOBA("chara_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * chara_name: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsCharaCQ addOrderBy_CharaName_Desc() { regOBD("chara_name"); return this; }

    protected ConditionValue _charachipId;
    public ConditionValue xdfgetCharachipId()
    { if (_charachipId == null) { _charachipId = nCV(); }
      return _charachipId; }
    protected ConditionValue xgetCValueCharachipId() { return xdfgetCharachipId(); }

    /**
     * Add order-by as ascend. <br>
     * charachip_id: {IX, NotNull, INT UNSIGNED(10), FK to charachip}
     * @return this. (NotNull)
     */
    public DbBsCharaCQ addOrderBy_CharachipId_Asc() { regOBA("charachip_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * charachip_id: {IX, NotNull, INT UNSIGNED(10), FK to charachip}
     * @return this. (NotNull)
     */
    public DbBsCharaCQ addOrderBy_CharachipId_Desc() { regOBD("charachip_id"); return this; }

    protected ConditionValue _displayWidth;
    public ConditionValue xdfgetDisplayWidth()
    { if (_displayWidth == null) { _displayWidth = nCV(); }
      return _displayWidth; }
    protected ConditionValue xgetCValueDisplayWidth() { return xdfgetDisplayWidth(); }

    /**
     * Add order-by as ascend. <br>
     * display_width: {NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsCharaCQ addOrderBy_DisplayWidth_Asc() { regOBA("display_width"); return this; }

    /**
     * Add order-by as descend. <br>
     * display_width: {NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsCharaCQ addOrderBy_DisplayWidth_Desc() { regOBD("display_width"); return this; }

    protected ConditionValue _displayHeight;
    public ConditionValue xdfgetDisplayHeight()
    { if (_displayHeight == null) { _displayHeight = nCV(); }
      return _displayHeight; }
    protected ConditionValue xgetCValueDisplayHeight() { return xdfgetDisplayHeight(); }

    /**
     * Add order-by as ascend. <br>
     * display_height: {NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsCharaCQ addOrderBy_DisplayHeight_Asc() { regOBA("display_height"); return this; }

    /**
     * Add order-by as descend. <br>
     * display_height: {NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsCharaCQ addOrderBy_DisplayHeight_Desc() { regOBD("display_height"); return this; }

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
    public DbBsCharaCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsCharaCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public DbBsCharaCQ addOrderBy_RegisterTrace_Asc() { regOBA("register_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsCharaCQ addOrderBy_RegisterTrace_Desc() { regOBD("register_trace"); return this; }

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
    public DbBsCharaCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsCharaCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public DbBsCharaCQ addOrderBy_UpdateTrace_Asc() { regOBA("update_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsCharaCQ addOrderBy_UpdateTrace_Desc() { regOBD("update_trace"); return this; }

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
    public DbBsCharaCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public DbBsCharaCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        DbCharaCQ bq = (DbCharaCQ)bqs;
        DbCharaCQ uq = (DbCharaCQ)uqs;
        if (bq.hasConditionQueryCharachip()) {
            uq.queryCharachip().reflectRelationOnUnionQuery(bq.queryCharachip(), uq.queryCharachip());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * CHARACHIP by my charachip_id, named 'charachip'.
     * @return The instance of condition-query. (NotNull)
     */
    public DbCharachipCQ queryCharachip() {
        return xdfgetConditionQueryCharachip();
    }
    public DbCharachipCQ xdfgetConditionQueryCharachip() {
        String prop = "charachip";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryCharachip()); xsetupOuterJoinCharachip(); }
        return xgetQueRlMap(prop);
    }
    protected DbCharachipCQ xcreateQueryCharachip() {
        String nrp = xresolveNRP("chara", "charachip"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new DbCharachipCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "charachip", nrp);
    }
    protected void xsetupOuterJoinCharachip() { xregOutJo("charachip"); }
    public boolean hasConditionQueryCharachip() { return xhasQueRlMap("charachip"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, DbCharaCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(DbCharaCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, DbCharaCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(DbCharaCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, DbCharaCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(DbCharaCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, DbCharaCQ> _myselfExistsMap;
    public Map<String, DbCharaCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(DbCharaCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, DbCharaCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(DbCharaCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return DbCharaCB.class.getName(); }
    protected String xCQ() { return DbCharaCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
