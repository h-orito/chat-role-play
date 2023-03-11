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
 * The base condition-query of game_player.
 * @author DBFlute(AutoGenerator)
 */
public class DbBsGamePlayerCQ extends DbAbstractBsGamePlayerCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbGamePlayerCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbBsGamePlayerCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from game_player) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public DbGamePlayerCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected DbGamePlayerCIQ xcreateCIQ() {
        DbGamePlayerCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected DbGamePlayerCIQ xnewCIQ() {
        return new DbGamePlayerCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join game_player on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public DbGamePlayerCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        DbGamePlayerCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _gamePlayerId;
    public ConditionValue xdfgetGamePlayerId()
    { if (_gamePlayerId == null) { _gamePlayerId = nCV(); }
      return _gamePlayerId; }
    protected ConditionValue xgetCValueGamePlayerId() { return xdfgetGamePlayerId(); }

    public Map<String, DbGamePlayerGroupRelCQ> xdfgetGamePlayerId_ExistsReferrer_GamePlayerGroupRelList() { return xgetSQueMap("gamePlayerId_ExistsReferrer_GamePlayerGroupRelList"); }
    public String keepGamePlayerId_ExistsReferrer_GamePlayerGroupRelList(DbGamePlayerGroupRelCQ sq) { return xkeepSQue("gamePlayerId_ExistsReferrer_GamePlayerGroupRelList", sq); }

    public Map<String, DbMessageCQ> xdfgetGamePlayerId_ExistsReferrer_MessageList() { return xgetSQueMap("gamePlayerId_ExistsReferrer_MessageList"); }
    public String keepGamePlayerId_ExistsReferrer_MessageList(DbMessageCQ sq) { return xkeepSQue("gamePlayerId_ExistsReferrer_MessageList", sq); }

    public Map<String, DbMessageFavoriteCQ> xdfgetGamePlayerId_ExistsReferrer_MessageFavoriteList() { return xgetSQueMap("gamePlayerId_ExistsReferrer_MessageFavoriteList"); }
    public String keepGamePlayerId_ExistsReferrer_MessageFavoriteList(DbMessageFavoriteCQ sq) { return xkeepSQue("gamePlayerId_ExistsReferrer_MessageFavoriteList", sq); }

    public Map<String, DbDirectMessageCQ> xdfgetGamePlayerId_ExistsReferrer_DirectMessageList() { return xgetSQueMap("gamePlayerId_ExistsReferrer_DirectMessageList"); }
    public String keepGamePlayerId_ExistsReferrer_DirectMessageList(DbDirectMessageCQ sq) { return xkeepSQue("gamePlayerId_ExistsReferrer_DirectMessageList", sq); }

    public Map<String, DbGamePlayerGroupRelCQ> xdfgetGamePlayerId_NotExistsReferrer_GamePlayerGroupRelList() { return xgetSQueMap("gamePlayerId_NotExistsReferrer_GamePlayerGroupRelList"); }
    public String keepGamePlayerId_NotExistsReferrer_GamePlayerGroupRelList(DbGamePlayerGroupRelCQ sq) { return xkeepSQue("gamePlayerId_NotExistsReferrer_GamePlayerGroupRelList", sq); }

    public Map<String, DbMessageCQ> xdfgetGamePlayerId_NotExistsReferrer_MessageList() { return xgetSQueMap("gamePlayerId_NotExistsReferrer_MessageList"); }
    public String keepGamePlayerId_NotExistsReferrer_MessageList(DbMessageCQ sq) { return xkeepSQue("gamePlayerId_NotExistsReferrer_MessageList", sq); }

    public Map<String, DbMessageFavoriteCQ> xdfgetGamePlayerId_NotExistsReferrer_MessageFavoriteList() { return xgetSQueMap("gamePlayerId_NotExistsReferrer_MessageFavoriteList"); }
    public String keepGamePlayerId_NotExistsReferrer_MessageFavoriteList(DbMessageFavoriteCQ sq) { return xkeepSQue("gamePlayerId_NotExistsReferrer_MessageFavoriteList", sq); }

    public Map<String, DbDirectMessageCQ> xdfgetGamePlayerId_NotExistsReferrer_DirectMessageList() { return xgetSQueMap("gamePlayerId_NotExistsReferrer_DirectMessageList"); }
    public String keepGamePlayerId_NotExistsReferrer_DirectMessageList(DbDirectMessageCQ sq) { return xkeepSQue("gamePlayerId_NotExistsReferrer_DirectMessageList", sq); }

    public Map<String, DbGamePlayerGroupRelCQ> xdfgetGamePlayerId_SpecifyDerivedReferrer_GamePlayerGroupRelList() { return xgetSQueMap("gamePlayerId_SpecifyDerivedReferrer_GamePlayerGroupRelList"); }
    public String keepGamePlayerId_SpecifyDerivedReferrer_GamePlayerGroupRelList(DbGamePlayerGroupRelCQ sq) { return xkeepSQue("gamePlayerId_SpecifyDerivedReferrer_GamePlayerGroupRelList", sq); }

    public Map<String, DbMessageCQ> xdfgetGamePlayerId_SpecifyDerivedReferrer_MessageList() { return xgetSQueMap("gamePlayerId_SpecifyDerivedReferrer_MessageList"); }
    public String keepGamePlayerId_SpecifyDerivedReferrer_MessageList(DbMessageCQ sq) { return xkeepSQue("gamePlayerId_SpecifyDerivedReferrer_MessageList", sq); }

    public Map<String, DbMessageFavoriteCQ> xdfgetGamePlayerId_SpecifyDerivedReferrer_MessageFavoriteList() { return xgetSQueMap("gamePlayerId_SpecifyDerivedReferrer_MessageFavoriteList"); }
    public String keepGamePlayerId_SpecifyDerivedReferrer_MessageFavoriteList(DbMessageFavoriteCQ sq) { return xkeepSQue("gamePlayerId_SpecifyDerivedReferrer_MessageFavoriteList", sq); }

    public Map<String, DbDirectMessageCQ> xdfgetGamePlayerId_SpecifyDerivedReferrer_DirectMessageList() { return xgetSQueMap("gamePlayerId_SpecifyDerivedReferrer_DirectMessageList"); }
    public String keepGamePlayerId_SpecifyDerivedReferrer_DirectMessageList(DbDirectMessageCQ sq) { return xkeepSQue("gamePlayerId_SpecifyDerivedReferrer_DirectMessageList", sq); }

    public Map<String, DbGamePlayerGroupRelCQ> xdfgetGamePlayerId_QueryDerivedReferrer_GamePlayerGroupRelList() { return xgetSQueMap("gamePlayerId_QueryDerivedReferrer_GamePlayerGroupRelList"); }
    public String keepGamePlayerId_QueryDerivedReferrer_GamePlayerGroupRelList(DbGamePlayerGroupRelCQ sq) { return xkeepSQue("gamePlayerId_QueryDerivedReferrer_GamePlayerGroupRelList", sq); }
    public Map<String, Object> xdfgetGamePlayerId_QueryDerivedReferrer_GamePlayerGroupRelListParameter() { return xgetSQuePmMap("gamePlayerId_QueryDerivedReferrer_GamePlayerGroupRelList"); }
    public String keepGamePlayerId_QueryDerivedReferrer_GamePlayerGroupRelListParameter(Object pm) { return xkeepSQuePm("gamePlayerId_QueryDerivedReferrer_GamePlayerGroupRelList", pm); }

    public Map<String, DbMessageCQ> xdfgetGamePlayerId_QueryDerivedReferrer_MessageList() { return xgetSQueMap("gamePlayerId_QueryDerivedReferrer_MessageList"); }
    public String keepGamePlayerId_QueryDerivedReferrer_MessageList(DbMessageCQ sq) { return xkeepSQue("gamePlayerId_QueryDerivedReferrer_MessageList", sq); }
    public Map<String, Object> xdfgetGamePlayerId_QueryDerivedReferrer_MessageListParameter() { return xgetSQuePmMap("gamePlayerId_QueryDerivedReferrer_MessageList"); }
    public String keepGamePlayerId_QueryDerivedReferrer_MessageListParameter(Object pm) { return xkeepSQuePm("gamePlayerId_QueryDerivedReferrer_MessageList", pm); }

    public Map<String, DbMessageFavoriteCQ> xdfgetGamePlayerId_QueryDerivedReferrer_MessageFavoriteList() { return xgetSQueMap("gamePlayerId_QueryDerivedReferrer_MessageFavoriteList"); }
    public String keepGamePlayerId_QueryDerivedReferrer_MessageFavoriteList(DbMessageFavoriteCQ sq) { return xkeepSQue("gamePlayerId_QueryDerivedReferrer_MessageFavoriteList", sq); }
    public Map<String, Object> xdfgetGamePlayerId_QueryDerivedReferrer_MessageFavoriteListParameter() { return xgetSQuePmMap("gamePlayerId_QueryDerivedReferrer_MessageFavoriteList"); }
    public String keepGamePlayerId_QueryDerivedReferrer_MessageFavoriteListParameter(Object pm) { return xkeepSQuePm("gamePlayerId_QueryDerivedReferrer_MessageFavoriteList", pm); }

    public Map<String, DbDirectMessageCQ> xdfgetGamePlayerId_QueryDerivedReferrer_DirectMessageList() { return xgetSQueMap("gamePlayerId_QueryDerivedReferrer_DirectMessageList"); }
    public String keepGamePlayerId_QueryDerivedReferrer_DirectMessageList(DbDirectMessageCQ sq) { return xkeepSQue("gamePlayerId_QueryDerivedReferrer_DirectMessageList", sq); }
    public Map<String, Object> xdfgetGamePlayerId_QueryDerivedReferrer_DirectMessageListParameter() { return xgetSQuePmMap("gamePlayerId_QueryDerivedReferrer_DirectMessageList"); }
    public String keepGamePlayerId_QueryDerivedReferrer_DirectMessageListParameter(Object pm) { return xkeepSQuePm("gamePlayerId_QueryDerivedReferrer_DirectMessageList", pm); }

    /**
     * Add order-by as ascend. <br>
     * game_player_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsGamePlayerCQ addOrderBy_GamePlayerId_Asc() { regOBA("game_player_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * game_player_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsGamePlayerCQ addOrderBy_GamePlayerId_Desc() { regOBD("game_player_id"); return this; }

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
    public DbBsGamePlayerCQ addOrderBy_GameId_Asc() { regOBA("game_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * game_id: {UQ+, NotNull, INT UNSIGNED(10), FK to game}
     * @return this. (NotNull)
     */
    public DbBsGamePlayerCQ addOrderBy_GameId_Desc() { regOBD("game_id"); return this; }

    protected ConditionValue _playerId;
    public ConditionValue xdfgetPlayerId()
    { if (_playerId == null) { _playerId = nCV(); }
      return _playerId; }
    protected ConditionValue xgetCValuePlayerId() { return xdfgetPlayerId(); }

    /**
     * Add order-by as ascend. <br>
     * player_id: {IX, NotNull, INT UNSIGNED(10), FK to player}
     * @return this. (NotNull)
     */
    public DbBsGamePlayerCQ addOrderBy_PlayerId_Asc() { regOBA("player_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * player_id: {IX, NotNull, INT UNSIGNED(10), FK to player}
     * @return this. (NotNull)
     */
    public DbBsGamePlayerCQ addOrderBy_PlayerId_Desc() { regOBD("player_id"); return this; }

    protected ConditionValue _gamePlayerName;
    public ConditionValue xdfgetGamePlayerName()
    { if (_gamePlayerName == null) { _gamePlayerName = nCV(); }
      return _gamePlayerName; }
    protected ConditionValue xgetCValueGamePlayerName() { return xdfgetGamePlayerName(); }

    /**
     * Add order-by as ascend. <br>
     * game_player_name: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsGamePlayerCQ addOrderBy_GamePlayerName_Asc() { regOBA("game_player_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * game_player_name: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsGamePlayerCQ addOrderBy_GamePlayerName_Desc() { regOBD("game_player_name"); return this; }

    protected ConditionValue _charaId;
    public ConditionValue xdfgetCharaId()
    { if (_charaId == null) { _charaId = nCV(); }
      return _charaId; }
    protected ConditionValue xgetCValueCharaId() { return xdfgetCharaId(); }

    /**
     * Add order-by as ascend. <br>
     * chara_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to chara}
     * @return this. (NotNull)
     */
    public DbBsGamePlayerCQ addOrderBy_CharaId_Asc() { regOBA("chara_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * chara_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to chara}
     * @return this. (NotNull)
     */
    public DbBsGamePlayerCQ addOrderBy_CharaId_Desc() { regOBD("chara_id"); return this; }

    protected ConditionValue _isDeleted;
    public ConditionValue xdfgetIsDeleted()
    { if (_isDeleted == null) { _isDeleted = nCV(); }
      return _isDeleted; }
    protected ConditionValue xgetCValueIsDeleted() { return xdfgetIsDeleted(); }

    /**
     * Add order-by as ascend. <br>
     * is_deleted: {+UQ, NotNull, BIT}
     * @return this. (NotNull)
     */
    public DbBsGamePlayerCQ addOrderBy_IsDeleted_Asc() { regOBA("is_deleted"); return this; }

    /**
     * Add order-by as descend. <br>
     * is_deleted: {+UQ, NotNull, BIT}
     * @return this. (NotNull)
     */
    public DbBsGamePlayerCQ addOrderBy_IsDeleted_Desc() { regOBD("is_deleted"); return this; }

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
    public DbBsGamePlayerCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsGamePlayerCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public DbBsGamePlayerCQ addOrderBy_RegisterTrace_Asc() { regOBA("register_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsGamePlayerCQ addOrderBy_RegisterTrace_Desc() { regOBD("register_trace"); return this; }

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
    public DbBsGamePlayerCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsGamePlayerCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public DbBsGamePlayerCQ addOrderBy_UpdateTrace_Asc() { regOBA("update_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsGamePlayerCQ addOrderBy_UpdateTrace_Desc() { regOBD("update_trace"); return this; }

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
    public DbBsGamePlayerCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public DbBsGamePlayerCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        DbGamePlayerCQ bq = (DbGamePlayerCQ)bqs;
        DbGamePlayerCQ uq = (DbGamePlayerCQ)uqs;
        if (bq.hasConditionQueryChara()) {
            uq.queryChara().reflectRelationOnUnionQuery(bq.queryChara(), uq.queryChara());
        }
        if (bq.hasConditionQueryGame()) {
            uq.queryGame().reflectRelationOnUnionQuery(bq.queryGame(), uq.queryGame());
        }
        if (bq.hasConditionQueryPlayer()) {
            uq.queryPlayer().reflectRelationOnUnionQuery(bq.queryPlayer(), uq.queryPlayer());
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
        String nrp = xresolveNRP("game_player", "chara"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new DbCharaCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "chara", nrp);
    }
    protected void xsetupOuterJoinChara() { xregOutJo("chara"); }
    public boolean hasConditionQueryChara() { return xhasQueRlMap("chara"); }

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
        String nrp = xresolveNRP("game_player", "game"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new DbGameCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "game", nrp);
    }
    protected void xsetupOuterJoinGame() { xregOutJo("game"); }
    public boolean hasConditionQueryGame() { return xhasQueRlMap("game"); }

    /**
     * Get the condition-query for relation table. <br>
     * PLAYER by my player_id, named 'player'.
     * @return The instance of condition-query. (NotNull)
     */
    public DbPlayerCQ queryPlayer() {
        return xdfgetConditionQueryPlayer();
    }
    public DbPlayerCQ xdfgetConditionQueryPlayer() {
        String prop = "player";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryPlayer()); xsetupOuterJoinPlayer(); }
        return xgetQueRlMap(prop);
    }
    protected DbPlayerCQ xcreateQueryPlayer() {
        String nrp = xresolveNRP("game_player", "player"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new DbPlayerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "player", nrp);
    }
    protected void xsetupOuterJoinPlayer() { xregOutJo("player"); }
    public boolean hasConditionQueryPlayer() { return xhasQueRlMap("player"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, DbGamePlayerCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(DbGamePlayerCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, DbGamePlayerCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(DbGamePlayerCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, DbGamePlayerCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(DbGamePlayerCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, DbGamePlayerCQ> _myselfExistsMap;
    public Map<String, DbGamePlayerCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(DbGamePlayerCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, DbGamePlayerCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(DbGamePlayerCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return DbGamePlayerCB.class.getName(); }
    protected String xCQ() { return DbGamePlayerCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
