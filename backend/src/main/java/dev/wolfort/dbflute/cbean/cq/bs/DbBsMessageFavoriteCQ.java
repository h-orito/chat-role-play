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
 * The base condition-query of message_favorite.
 * @author DBFlute(AutoGenerator)
 */
public class DbBsMessageFavoriteCQ extends DbAbstractBsMessageFavoriteCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbMessageFavoriteCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbBsMessageFavoriteCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from message_favorite) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public DbMessageFavoriteCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected DbMessageFavoriteCIQ xcreateCIQ() {
        DbMessageFavoriteCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected DbMessageFavoriteCIQ xnewCIQ() {
        return new DbMessageFavoriteCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join message_favorite on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public DbMessageFavoriteCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        DbMessageFavoriteCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _messageFavoriteId;
    public ConditionValue xdfgetMessageFavoriteId()
    { if (_messageFavoriteId == null) { _messageFavoriteId = nCV(); }
      return _messageFavoriteId; }
    protected ConditionValue xgetCValueMessageFavoriteId() { return xdfgetMessageFavoriteId(); }

    /**
     * Add order-by as ascend. <br>
     * message_favorite_id: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public DbBsMessageFavoriteCQ addOrderBy_MessageFavoriteId_Asc() { regOBA("message_favorite_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * message_favorite_id: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public DbBsMessageFavoriteCQ addOrderBy_MessageFavoriteId_Desc() { regOBD("message_favorite_id"); return this; }

    protected ConditionValue _gameId;
    public ConditionValue xdfgetGameId()
    { if (_gameId == null) { _gameId = nCV(); }
      return _gameId; }
    protected ConditionValue xgetCValueGameId() { return xdfgetGameId(); }

    /**
     * Add order-by as ascend. <br>
     * game_id: {PK, UQ+, NotNull, INT UNSIGNED(10), FK to game}
     * @return this. (NotNull)
     */
    public DbBsMessageFavoriteCQ addOrderBy_GameId_Asc() { regOBA("game_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * game_id: {PK, UQ+, NotNull, INT UNSIGNED(10), FK to game}
     * @return this. (NotNull)
     */
    public DbBsMessageFavoriteCQ addOrderBy_GameId_Desc() { regOBD("game_id"); return this; }

    protected ConditionValue _messageId;
    public ConditionValue xdfgetMessageId()
    { if (_messageId == null) { _messageId = nCV(); }
      return _messageId; }
    protected ConditionValue xgetCValueMessageId() { return xdfgetMessageId(); }

    /**
     * Add order-by as ascend. <br>
     * message_id: {+UQ, IX, NotNull, BIGINT(19), FK to message}
     * @return this. (NotNull)
     */
    public DbBsMessageFavoriteCQ addOrderBy_MessageId_Asc() { regOBA("message_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * message_id: {+UQ, IX, NotNull, BIGINT(19), FK to message}
     * @return this. (NotNull)
     */
    public DbBsMessageFavoriteCQ addOrderBy_MessageId_Desc() { regOBD("message_id"); return this; }

    protected ConditionValue _gamePlayerId;
    public ConditionValue xdfgetGamePlayerId()
    { if (_gamePlayerId == null) { _gamePlayerId = nCV(); }
      return _gamePlayerId; }
    protected ConditionValue xgetCValueGamePlayerId() { return xdfgetGamePlayerId(); }

    /**
     * Add order-by as ascend. <br>
     * game_player_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to game_player}
     * @return this. (NotNull)
     */
    public DbBsMessageFavoriteCQ addOrderBy_GamePlayerId_Asc() { regOBA("game_player_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * game_player_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to game_player}
     * @return this. (NotNull)
     */
    public DbBsMessageFavoriteCQ addOrderBy_GamePlayerId_Desc() { regOBD("game_player_id"); return this; }

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
    public DbBsMessageFavoriteCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsMessageFavoriteCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public DbBsMessageFavoriteCQ addOrderBy_RegisterTrace_Asc() { regOBA("register_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsMessageFavoriteCQ addOrderBy_RegisterTrace_Desc() { regOBD("register_trace"); return this; }

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
    public DbBsMessageFavoriteCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsMessageFavoriteCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public DbBsMessageFavoriteCQ addOrderBy_UpdateTrace_Asc() { regOBA("update_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsMessageFavoriteCQ addOrderBy_UpdateTrace_Desc() { regOBD("update_trace"); return this; }

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
    public DbBsMessageFavoriteCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public DbBsMessageFavoriteCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        DbMessageFavoriteCQ bq = (DbMessageFavoriteCQ)bqs;
        DbMessageFavoriteCQ uq = (DbMessageFavoriteCQ)uqs;
        if (bq.hasConditionQueryGame()) {
            uq.queryGame().reflectRelationOnUnionQuery(bq.queryGame(), uq.queryGame());
        }
        if (bq.hasConditionQueryMessage()) {
            uq.queryMessage().reflectRelationOnUnionQuery(bq.queryMessage(), uq.queryMessage());
        }
        if (bq.hasConditionQueryGamePlayer()) {
            uq.queryGamePlayer().reflectRelationOnUnionQuery(bq.queryGamePlayer(), uq.queryGamePlayer());
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
        String nrp = xresolveNRP("message_favorite", "game"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new DbGameCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "game", nrp);
    }
    protected void xsetupOuterJoinGame() { xregOutJo("game"); }
    public boolean hasConditionQueryGame() { return xhasQueRlMap("game"); }

    /**
     * Get the condition-query for relation table. <br>
     * MESSAGE by my message_id, named 'message'.
     * @return The instance of condition-query. (NotNull)
     */
    public DbMessageCQ queryMessage() {
        return xdfgetConditionQueryMessage();
    }
    public DbMessageCQ xdfgetConditionQueryMessage() {
        String prop = "message";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMessage()); xsetupOuterJoinMessage(); }
        return xgetQueRlMap(prop);
    }
    protected DbMessageCQ xcreateQueryMessage() {
        String nrp = xresolveNRP("message_favorite", "message"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new DbMessageCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "message", nrp);
    }
    protected void xsetupOuterJoinMessage() { xregOutJo("message"); }
    public boolean hasConditionQueryMessage() { return xhasQueRlMap("message"); }

    /**
     * Get the condition-query for relation table. <br>
     * GAME_PLAYER by my game_player_id, named 'gamePlayer'.
     * @return The instance of condition-query. (NotNull)
     */
    public DbGamePlayerCQ queryGamePlayer() {
        return xdfgetConditionQueryGamePlayer();
    }
    public DbGamePlayerCQ xdfgetConditionQueryGamePlayer() {
        String prop = "gamePlayer";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryGamePlayer()); xsetupOuterJoinGamePlayer(); }
        return xgetQueRlMap(prop);
    }
    protected DbGamePlayerCQ xcreateQueryGamePlayer() {
        String nrp = xresolveNRP("message_favorite", "gamePlayer"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new DbGamePlayerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "gamePlayer", nrp);
    }
    protected void xsetupOuterJoinGamePlayer() { xregOutJo("gamePlayer"); }
    public boolean hasConditionQueryGamePlayer() { return xhasQueRlMap("gamePlayer"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, DbMessageFavoriteCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(DbMessageFavoriteCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return DbMessageFavoriteCB.class.getName(); }
    protected String xCQ() { return DbMessageFavoriteCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
