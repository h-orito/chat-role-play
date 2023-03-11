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
 * The base condition-query of player.
 * @author DBFlute(AutoGenerator)
 */
public class DbBsPlayerCQ extends DbAbstractBsPlayerCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbPlayerCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbBsPlayerCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from player) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public DbPlayerCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected DbPlayerCIQ xcreateCIQ() {
        DbPlayerCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected DbPlayerCIQ xnewCIQ() {
        return new DbPlayerCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join player on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public DbPlayerCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        DbPlayerCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _playerId;
    public ConditionValue xdfgetPlayerId()
    { if (_playerId == null) { _playerId = nCV(); }
      return _playerId; }
    protected ConditionValue xgetCValuePlayerId() { return xdfgetPlayerId(); }

    public Map<String, DbGamePlayerCQ> xdfgetPlayerId_ExistsReferrer_GamePlayerList() { return xgetSQueMap("playerId_ExistsReferrer_GamePlayerList"); }
    public String keepPlayerId_ExistsReferrer_GamePlayerList(DbGamePlayerCQ sq) { return xkeepSQue("playerId_ExistsReferrer_GamePlayerList", sq); }

    public Map<String, DbPlayerAuthorityCQ> xdfgetPlayerId_ExistsReferrer_PlayerAuthorityList() { return xgetSQueMap("playerId_ExistsReferrer_PlayerAuthorityList"); }
    public String keepPlayerId_ExistsReferrer_PlayerAuthorityList(DbPlayerAuthorityCQ sq) { return xkeepSQue("playerId_ExistsReferrer_PlayerAuthorityList", sq); }

    public Map<String, DbGamePlayerCQ> xdfgetPlayerId_NotExistsReferrer_GamePlayerList() { return xgetSQueMap("playerId_NotExistsReferrer_GamePlayerList"); }
    public String keepPlayerId_NotExistsReferrer_GamePlayerList(DbGamePlayerCQ sq) { return xkeepSQue("playerId_NotExistsReferrer_GamePlayerList", sq); }

    public Map<String, DbPlayerAuthorityCQ> xdfgetPlayerId_NotExistsReferrer_PlayerAuthorityList() { return xgetSQueMap("playerId_NotExistsReferrer_PlayerAuthorityList"); }
    public String keepPlayerId_NotExistsReferrer_PlayerAuthorityList(DbPlayerAuthorityCQ sq) { return xkeepSQue("playerId_NotExistsReferrer_PlayerAuthorityList", sq); }

    public Map<String, DbGamePlayerCQ> xdfgetPlayerId_SpecifyDerivedReferrer_GamePlayerList() { return xgetSQueMap("playerId_SpecifyDerivedReferrer_GamePlayerList"); }
    public String keepPlayerId_SpecifyDerivedReferrer_GamePlayerList(DbGamePlayerCQ sq) { return xkeepSQue("playerId_SpecifyDerivedReferrer_GamePlayerList", sq); }

    public Map<String, DbPlayerAuthorityCQ> xdfgetPlayerId_SpecifyDerivedReferrer_PlayerAuthorityList() { return xgetSQueMap("playerId_SpecifyDerivedReferrer_PlayerAuthorityList"); }
    public String keepPlayerId_SpecifyDerivedReferrer_PlayerAuthorityList(DbPlayerAuthorityCQ sq) { return xkeepSQue("playerId_SpecifyDerivedReferrer_PlayerAuthorityList", sq); }

    public Map<String, DbGamePlayerCQ> xdfgetPlayerId_QueryDerivedReferrer_GamePlayerList() { return xgetSQueMap("playerId_QueryDerivedReferrer_GamePlayerList"); }
    public String keepPlayerId_QueryDerivedReferrer_GamePlayerList(DbGamePlayerCQ sq) { return xkeepSQue("playerId_QueryDerivedReferrer_GamePlayerList", sq); }
    public Map<String, Object> xdfgetPlayerId_QueryDerivedReferrer_GamePlayerListParameter() { return xgetSQuePmMap("playerId_QueryDerivedReferrer_GamePlayerList"); }
    public String keepPlayerId_QueryDerivedReferrer_GamePlayerListParameter(Object pm) { return xkeepSQuePm("playerId_QueryDerivedReferrer_GamePlayerList", pm); }

    public Map<String, DbPlayerAuthorityCQ> xdfgetPlayerId_QueryDerivedReferrer_PlayerAuthorityList() { return xgetSQueMap("playerId_QueryDerivedReferrer_PlayerAuthorityList"); }
    public String keepPlayerId_QueryDerivedReferrer_PlayerAuthorityList(DbPlayerAuthorityCQ sq) { return xkeepSQue("playerId_QueryDerivedReferrer_PlayerAuthorityList", sq); }
    public Map<String, Object> xdfgetPlayerId_QueryDerivedReferrer_PlayerAuthorityListParameter() { return xgetSQuePmMap("playerId_QueryDerivedReferrer_PlayerAuthorityList"); }
    public String keepPlayerId_QueryDerivedReferrer_PlayerAuthorityListParameter(Object pm) { return xkeepSQuePm("playerId_QueryDerivedReferrer_PlayerAuthorityList", pm); }

    /**
     * Add order-by as ascend. <br>
     * player_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsPlayerCQ addOrderBy_PlayerId_Asc() { regOBA("player_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * player_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsPlayerCQ addOrderBy_PlayerId_Desc() { regOBD("player_id"); return this; }

    protected ConditionValue _playerName;
    public ConditionValue xdfgetPlayerName()
    { if (_playerName == null) { _playerName = nCV(); }
      return _playerName; }
    protected ConditionValue xgetCValuePlayerName() { return xdfgetPlayerName(); }

    /**
     * Add order-by as ascend. <br>
     * player_name: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsPlayerCQ addOrderBy_PlayerName_Asc() { regOBA("player_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * player_name: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsPlayerCQ addOrderBy_PlayerName_Desc() { regOBD("player_name"); return this; }

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
    public DbBsPlayerCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsPlayerCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public DbBsPlayerCQ addOrderBy_RegisterTrace_Asc() { regOBA("register_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsPlayerCQ addOrderBy_RegisterTrace_Desc() { regOBD("register_trace"); return this; }

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
    public DbBsPlayerCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsPlayerCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public DbBsPlayerCQ addOrderBy_UpdateTrace_Asc() { regOBA("update_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsPlayerCQ addOrderBy_UpdateTrace_Desc() { regOBD("update_trace"); return this; }

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
    public DbBsPlayerCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public DbBsPlayerCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        DbPlayerCQ bq = (DbPlayerCQ)bqs;
        DbPlayerCQ uq = (DbPlayerCQ)uqs;
        if (bq.hasConditionQueryPlayerAccountAsOne()) {
            uq.queryPlayerAccountAsOne().reflectRelationOnUnionQuery(bq.queryPlayerAccountAsOne(), uq.queryPlayerAccountAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * player_account by player_id, named 'playerAccountAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public DbPlayerAccountCQ queryPlayerAccountAsOne() { return xdfgetConditionQueryPlayerAccountAsOne(); }
    public DbPlayerAccountCQ xdfgetConditionQueryPlayerAccountAsOne() {
        String prop = "playerAccountAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryPlayerAccountAsOne()); xsetupOuterJoinPlayerAccountAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected DbPlayerAccountCQ xcreateQueryPlayerAccountAsOne() {
        String nrp = xresolveNRP("player", "playerAccountAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new DbPlayerAccountCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "playerAccountAsOne", nrp);
    }
    protected void xsetupOuterJoinPlayerAccountAsOne() { xregOutJo("playerAccountAsOne"); }
    public boolean hasConditionQueryPlayerAccountAsOne() { return xhasQueRlMap("playerAccountAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, DbPlayerCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(DbPlayerCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, DbPlayerCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(DbPlayerCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, DbPlayerCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(DbPlayerCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, DbPlayerCQ> _myselfExistsMap;
    public Map<String, DbPlayerCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(DbPlayerCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, DbPlayerCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(DbPlayerCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return DbPlayerCB.class.getName(); }
    protected String xCQ() { return DbPlayerCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
