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
 * The base condition-query of game_period.
 * @author DBFlute(AutoGenerator)
 */
public class DbBsGamePeriodCQ extends DbAbstractBsGamePeriodCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbGamePeriodCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbBsGamePeriodCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from game_period) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public DbGamePeriodCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected DbGamePeriodCIQ xcreateCIQ() {
        DbGamePeriodCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected DbGamePeriodCIQ xnewCIQ() {
        return new DbGamePeriodCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join game_period on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public DbGamePeriodCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        DbGamePeriodCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _gamePeriodId;
    public ConditionValue xdfgetGamePeriodId()
    { if (_gamePeriodId == null) { _gamePeriodId = nCV(); }
      return _gamePeriodId; }
    protected ConditionValue xgetCValueGamePeriodId() { return xdfgetGamePeriodId(); }

    public Map<String, DbMessageCQ> xdfgetGamePeriodId_ExistsReferrer_MessageList() { return xgetSQueMap("gamePeriodId_ExistsReferrer_MessageList"); }
    public String keepGamePeriodId_ExistsReferrer_MessageList(DbMessageCQ sq) { return xkeepSQue("gamePeriodId_ExistsReferrer_MessageList", sq); }

    public Map<String, DbDirectMessageCQ> xdfgetGamePeriodId_ExistsReferrer_DirectMessageList() { return xgetSQueMap("gamePeriodId_ExistsReferrer_DirectMessageList"); }
    public String keepGamePeriodId_ExistsReferrer_DirectMessageList(DbDirectMessageCQ sq) { return xkeepSQue("gamePeriodId_ExistsReferrer_DirectMessageList", sq); }

    public Map<String, DbMessageCQ> xdfgetGamePeriodId_NotExistsReferrer_MessageList() { return xgetSQueMap("gamePeriodId_NotExistsReferrer_MessageList"); }
    public String keepGamePeriodId_NotExistsReferrer_MessageList(DbMessageCQ sq) { return xkeepSQue("gamePeriodId_NotExistsReferrer_MessageList", sq); }

    public Map<String, DbDirectMessageCQ> xdfgetGamePeriodId_NotExistsReferrer_DirectMessageList() { return xgetSQueMap("gamePeriodId_NotExistsReferrer_DirectMessageList"); }
    public String keepGamePeriodId_NotExistsReferrer_DirectMessageList(DbDirectMessageCQ sq) { return xkeepSQue("gamePeriodId_NotExistsReferrer_DirectMessageList", sq); }

    public Map<String, DbMessageCQ> xdfgetGamePeriodId_SpecifyDerivedReferrer_MessageList() { return xgetSQueMap("gamePeriodId_SpecifyDerivedReferrer_MessageList"); }
    public String keepGamePeriodId_SpecifyDerivedReferrer_MessageList(DbMessageCQ sq) { return xkeepSQue("gamePeriodId_SpecifyDerivedReferrer_MessageList", sq); }

    public Map<String, DbDirectMessageCQ> xdfgetGamePeriodId_SpecifyDerivedReferrer_DirectMessageList() { return xgetSQueMap("gamePeriodId_SpecifyDerivedReferrer_DirectMessageList"); }
    public String keepGamePeriodId_SpecifyDerivedReferrer_DirectMessageList(DbDirectMessageCQ sq) { return xkeepSQue("gamePeriodId_SpecifyDerivedReferrer_DirectMessageList", sq); }

    public Map<String, DbMessageCQ> xdfgetGamePeriodId_QueryDerivedReferrer_MessageList() { return xgetSQueMap("gamePeriodId_QueryDerivedReferrer_MessageList"); }
    public String keepGamePeriodId_QueryDerivedReferrer_MessageList(DbMessageCQ sq) { return xkeepSQue("gamePeriodId_QueryDerivedReferrer_MessageList", sq); }
    public Map<String, Object> xdfgetGamePeriodId_QueryDerivedReferrer_MessageListParameter() { return xgetSQuePmMap("gamePeriodId_QueryDerivedReferrer_MessageList"); }
    public String keepGamePeriodId_QueryDerivedReferrer_MessageListParameter(Object pm) { return xkeepSQuePm("gamePeriodId_QueryDerivedReferrer_MessageList", pm); }

    public Map<String, DbDirectMessageCQ> xdfgetGamePeriodId_QueryDerivedReferrer_DirectMessageList() { return xgetSQueMap("gamePeriodId_QueryDerivedReferrer_DirectMessageList"); }
    public String keepGamePeriodId_QueryDerivedReferrer_DirectMessageList(DbDirectMessageCQ sq) { return xkeepSQue("gamePeriodId_QueryDerivedReferrer_DirectMessageList", sq); }
    public Map<String, Object> xdfgetGamePeriodId_QueryDerivedReferrer_DirectMessageListParameter() { return xgetSQuePmMap("gamePeriodId_QueryDerivedReferrer_DirectMessageList"); }
    public String keepGamePeriodId_QueryDerivedReferrer_DirectMessageListParameter(Object pm) { return xkeepSQuePm("gamePeriodId_QueryDerivedReferrer_DirectMessageList", pm); }

    /**
     * Add order-by as ascend. <br>
     * game_period_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsGamePeriodCQ addOrderBy_GamePeriodId_Asc() { regOBA("game_period_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * game_period_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsGamePeriodCQ addOrderBy_GamePeriodId_Desc() { regOBD("game_period_id"); return this; }

    protected ConditionValue _gameId;
    public ConditionValue xdfgetGameId()
    { if (_gameId == null) { _gameId = nCV(); }
      return _gameId; }
    protected ConditionValue xgetCValueGameId() { return xdfgetGameId(); }

    /**
     * Add order-by as ascend. <br>
     * game_id: {UQ+, NotNull, INT UNSIGNED(10), FK to game}
     * @return this. (NotNull)
     */
    public DbBsGamePeriodCQ addOrderBy_GameId_Asc() { regOBA("game_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * game_id: {UQ+, NotNull, INT UNSIGNED(10), FK to game}
     * @return this. (NotNull)
     */
    public DbBsGamePeriodCQ addOrderBy_GameId_Desc() { regOBD("game_id"); return this; }

    protected ConditionValue _period;
    public ConditionValue xdfgetPeriod()
    { if (_period == null) { _period = nCV(); }
      return _period; }
    protected ConditionValue xgetCValuePeriod() { return xdfgetPeriod(); }

    /**
     * Add order-by as ascend. <br>
     * period: {+UQ, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsGamePeriodCQ addOrderBy_Period_Asc() { regOBA("period"); return this; }

    /**
     * Add order-by as descend. <br>
     * period: {+UQ, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsGamePeriodCQ addOrderBy_Period_Desc() { regOBD("period"); return this; }

    protected ConditionValue _prefix;
    public ConditionValue xdfgetPrefix()
    { if (_prefix == null) { _prefix = nCV(); }
      return _prefix; }
    protected ConditionValue xgetCValuePrefix() { return xdfgetPrefix(); }

    /**
     * Add order-by as ascend. <br>
     * prefix: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsGamePeriodCQ addOrderBy_Prefix_Asc() { regOBA("prefix"); return this; }

    /**
     * Add order-by as descend. <br>
     * prefix: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsGamePeriodCQ addOrderBy_Prefix_Desc() { regOBD("prefix"); return this; }

    protected ConditionValue _suffix;
    public ConditionValue xdfgetSuffix()
    { if (_suffix == null) { _suffix = nCV(); }
      return _suffix; }
    protected ConditionValue xgetCValueSuffix() { return xdfgetSuffix(); }

    /**
     * Add order-by as ascend. <br>
     * suffix: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsGamePeriodCQ addOrderBy_Suffix_Asc() { regOBA("suffix"); return this; }

    /**
     * Add order-by as descend. <br>
     * suffix: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsGamePeriodCQ addOrderBy_Suffix_Desc() { regOBD("suffix"); return this; }

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
    public DbBsGamePeriodCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsGamePeriodCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public DbBsGamePeriodCQ addOrderBy_RegisterTrace_Asc() { regOBA("register_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsGamePeriodCQ addOrderBy_RegisterTrace_Desc() { regOBD("register_trace"); return this; }

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
    public DbBsGamePeriodCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsGamePeriodCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public DbBsGamePeriodCQ addOrderBy_UpdateTrace_Asc() { regOBA("update_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsGamePeriodCQ addOrderBy_UpdateTrace_Desc() { regOBD("update_trace"); return this; }

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
    public DbBsGamePeriodCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public DbBsGamePeriodCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        DbGamePeriodCQ bq = (DbGamePeriodCQ)bqs;
        DbGamePeriodCQ uq = (DbGamePeriodCQ)uqs;
        if (bq.hasConditionQueryGame()) {
            uq.queryGame().reflectRelationOnUnionQuery(bq.queryGame(), uq.queryGame());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * GAME by my game_id, named 'game'.
     * @return The instance of condition-query. (NotNull)
     */
    public DbGameCQ queryGame() {
        return xdfgetConditionQueryGame();
    }
    public DbGameCQ xdfgetConditionQueryGame() {
        String prop = "game";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryGame()); xsetupOuterJoinGame(); }
        return xgetQueRlMap(prop);
    }
    protected DbGameCQ xcreateQueryGame() {
        String nrp = xresolveNRP("game_period", "game"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new DbGameCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "game", nrp);
    }
    protected void xsetupOuterJoinGame() { xregOutJo("game"); }
    public boolean hasConditionQueryGame() { return xhasQueRlMap("game"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, DbGamePeriodCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(DbGamePeriodCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, DbGamePeriodCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(DbGamePeriodCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, DbGamePeriodCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(DbGamePeriodCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, DbGamePeriodCQ> _myselfExistsMap;
    public Map<String, DbGamePeriodCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(DbGamePeriodCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, DbGamePeriodCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(DbGamePeriodCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return DbGamePeriodCB.class.getName(); }
    protected String xCQ() { return DbGamePeriodCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
