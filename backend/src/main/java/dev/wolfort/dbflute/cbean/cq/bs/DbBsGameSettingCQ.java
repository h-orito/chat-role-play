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
 * The base condition-query of game_setting.
 * @author DBFlute(AutoGenerator)
 */
public class DbBsGameSettingCQ extends DbAbstractBsGameSettingCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbGameSettingCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbBsGameSettingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from game_setting) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public DbGameSettingCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected DbGameSettingCIQ xcreateCIQ() {
        DbGameSettingCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected DbGameSettingCIQ xnewCIQ() {
        return new DbGameSettingCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join game_setting on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public DbGameSettingCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        DbGameSettingCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _gameSettingId;
    public ConditionValue xdfgetGameSettingId()
    { if (_gameSettingId == null) { _gameSettingId = nCV(); }
      return _gameSettingId; }
    protected ConditionValue xgetCValueGameSettingId() { return xdfgetGameSettingId(); }

    /**
     * Add order-by as ascend. <br>
     * game_setting_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsGameSettingCQ addOrderBy_GameSettingId_Asc() { regOBA("game_setting_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * game_setting_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsGameSettingCQ addOrderBy_GameSettingId_Desc() { regOBD("game_setting_id"); return this; }

    protected ConditionValue _gameId;
    public ConditionValue xdfgetGameId()
    { if (_gameId == null) { _gameId = nCV(); }
      return _gameId; }
    protected ConditionValue xgetCValueGameId() { return xdfgetGameId(); }

    /**
     * Add order-by as ascend. <br>
     * game_id: {IX, NotNull, INT UNSIGNED(10), FK to game}
     * @return this. (NotNull)
     */
    public DbBsGameSettingCQ addOrderBy_GameId_Asc() { regOBA("game_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * game_id: {IX, NotNull, INT UNSIGNED(10), FK to game}
     * @return this. (NotNull)
     */
    public DbBsGameSettingCQ addOrderBy_GameId_Desc() { regOBD("game_id"); return this; }

    protected ConditionValue _gameSettingItemCode;
    public ConditionValue xdfgetGameSettingItemCode()
    { if (_gameSettingItemCode == null) { _gameSettingItemCode = nCV(); }
      return _gameSettingItemCode; }
    protected ConditionValue xgetCValueGameSettingItemCode() { return xdfgetGameSettingItemCode(); }

    /**
     * Add order-by as ascend. <br>
     * game_setting_item_code: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsGameSettingCQ addOrderBy_GameSettingItemCode_Asc() { regOBA("game_setting_item_code"); return this; }

    /**
     * Add order-by as descend. <br>
     * game_setting_item_code: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsGameSettingCQ addOrderBy_GameSettingItemCode_Desc() { regOBD("game_setting_item_code"); return this; }

    protected ConditionValue _gameSettingItemValue;
    public ConditionValue xdfgetGameSettingItemValue()
    { if (_gameSettingItemValue == null) { _gameSettingItemValue = nCV(); }
      return _gameSettingItemValue; }
    protected ConditionValue xgetCValueGameSettingItemValue() { return xdfgetGameSettingItemValue(); }

    /**
     * Add order-by as ascend. <br>
     * game_setting_item_value: {NotNull, VARCHAR(1000)}
     * @return this. (NotNull)
     */
    public DbBsGameSettingCQ addOrderBy_GameSettingItemValue_Asc() { regOBA("game_setting_item_value"); return this; }

    /**
     * Add order-by as descend. <br>
     * game_setting_item_value: {NotNull, VARCHAR(1000)}
     * @return this. (NotNull)
     */
    public DbBsGameSettingCQ addOrderBy_GameSettingItemValue_Desc() { regOBD("game_setting_item_value"); return this; }

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
    public DbBsGameSettingCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public DbBsGameSettingCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        DbGameSettingCQ bq = (DbGameSettingCQ)bqs;
        DbGameSettingCQ uq = (DbGameSettingCQ)uqs;
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
        String nrp = xresolveNRP("game_setting", "game"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, DbGameSettingCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(DbGameSettingCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, DbGameSettingCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(DbGameSettingCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, DbGameSettingCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(DbGameSettingCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, DbGameSettingCQ> _myselfExistsMap;
    public Map<String, DbGameSettingCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(DbGameSettingCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, DbGameSettingCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(DbGameSettingCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return DbGameSettingCB.class.getName(); }
    protected String xCQ() { return DbGameSettingCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
