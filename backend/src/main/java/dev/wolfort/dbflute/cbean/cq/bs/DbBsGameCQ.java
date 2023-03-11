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
 * The base condition-query of game.
 * @author DBFlute(AutoGenerator)
 */
public class DbBsGameCQ extends DbAbstractBsGameCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbGameCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbBsGameCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from game) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public DbGameCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected DbGameCIQ xcreateCIQ() {
        DbGameCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected DbGameCIQ xnewCIQ() {
        return new DbGameCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join game on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public DbGameCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        DbGameCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _gameId;
    public ConditionValue xdfgetGameId()
    { if (_gameId == null) { _gameId = nCV(); }
      return _gameId; }
    protected ConditionValue xgetCValueGameId() { return xdfgetGameId(); }

    public Map<String, DbGamePeriodCQ> xdfgetGameId_ExistsReferrer_GamePeriodList() { return xgetSQueMap("gameId_ExistsReferrer_GamePeriodList"); }
    public String keepGameId_ExistsReferrer_GamePeriodList(DbGamePeriodCQ sq) { return xkeepSQue("gameId_ExistsReferrer_GamePeriodList", sq); }

    public Map<String, DbGamePlayerCQ> xdfgetGameId_ExistsReferrer_GamePlayerList() { return xgetSQueMap("gameId_ExistsReferrer_GamePlayerList"); }
    public String keepGameId_ExistsReferrer_GamePlayerList(DbGamePlayerCQ sq) { return xkeepSQue("gameId_ExistsReferrer_GamePlayerList", sq); }

    public Map<String, DbGameSettingCQ> xdfgetGameId_ExistsReferrer_GameSettingList() { return xgetSQueMap("gameId_ExistsReferrer_GameSettingList"); }
    public String keepGameId_ExistsReferrer_GameSettingList(DbGameSettingCQ sq) { return xkeepSQue("gameId_ExistsReferrer_GameSettingList", sq); }

    public Map<String, DbMessageCQ> xdfgetGameId_ExistsReferrer_MessageList() { return xgetSQueMap("gameId_ExistsReferrer_MessageList"); }
    public String keepGameId_ExistsReferrer_MessageList(DbMessageCQ sq) { return xkeepSQue("gameId_ExistsReferrer_MessageList", sq); }

    public Map<String, DbMessageReplyCQ> xdfgetGameId_ExistsReferrer_MessageReplyList() { return xgetSQueMap("gameId_ExistsReferrer_MessageReplyList"); }
    public String keepGameId_ExistsReferrer_MessageReplyList(DbMessageReplyCQ sq) { return xkeepSQue("gameId_ExistsReferrer_MessageReplyList", sq); }

    public Map<String, DbMessageFavoriteCQ> xdfgetGameId_ExistsReferrer_MessageFavoriteList() { return xgetSQueMap("gameId_ExistsReferrer_MessageFavoriteList"); }
    public String keepGameId_ExistsReferrer_MessageFavoriteList(DbMessageFavoriteCQ sq) { return xkeepSQue("gameId_ExistsReferrer_MessageFavoriteList", sq); }

    public Map<String, DbDirectMessageCQ> xdfgetGameId_ExistsReferrer_DirectMessageList() { return xgetSQueMap("gameId_ExistsReferrer_DirectMessageList"); }
    public String keepGameId_ExistsReferrer_DirectMessageList(DbDirectMessageCQ sq) { return xkeepSQue("gameId_ExistsReferrer_DirectMessageList", sq); }

    public Map<String, DbGamePeriodCQ> xdfgetGameId_NotExistsReferrer_GamePeriodList() { return xgetSQueMap("gameId_NotExistsReferrer_GamePeriodList"); }
    public String keepGameId_NotExistsReferrer_GamePeriodList(DbGamePeriodCQ sq) { return xkeepSQue("gameId_NotExistsReferrer_GamePeriodList", sq); }

    public Map<String, DbGamePlayerCQ> xdfgetGameId_NotExistsReferrer_GamePlayerList() { return xgetSQueMap("gameId_NotExistsReferrer_GamePlayerList"); }
    public String keepGameId_NotExistsReferrer_GamePlayerList(DbGamePlayerCQ sq) { return xkeepSQue("gameId_NotExistsReferrer_GamePlayerList", sq); }

    public Map<String, DbGameSettingCQ> xdfgetGameId_NotExistsReferrer_GameSettingList() { return xgetSQueMap("gameId_NotExistsReferrer_GameSettingList"); }
    public String keepGameId_NotExistsReferrer_GameSettingList(DbGameSettingCQ sq) { return xkeepSQue("gameId_NotExistsReferrer_GameSettingList", sq); }

    public Map<String, DbMessageCQ> xdfgetGameId_NotExistsReferrer_MessageList() { return xgetSQueMap("gameId_NotExistsReferrer_MessageList"); }
    public String keepGameId_NotExistsReferrer_MessageList(DbMessageCQ sq) { return xkeepSQue("gameId_NotExistsReferrer_MessageList", sq); }

    public Map<String, DbMessageReplyCQ> xdfgetGameId_NotExistsReferrer_MessageReplyList() { return xgetSQueMap("gameId_NotExistsReferrer_MessageReplyList"); }
    public String keepGameId_NotExistsReferrer_MessageReplyList(DbMessageReplyCQ sq) { return xkeepSQue("gameId_NotExistsReferrer_MessageReplyList", sq); }

    public Map<String, DbMessageFavoriteCQ> xdfgetGameId_NotExistsReferrer_MessageFavoriteList() { return xgetSQueMap("gameId_NotExistsReferrer_MessageFavoriteList"); }
    public String keepGameId_NotExistsReferrer_MessageFavoriteList(DbMessageFavoriteCQ sq) { return xkeepSQue("gameId_NotExistsReferrer_MessageFavoriteList", sq); }

    public Map<String, DbDirectMessageCQ> xdfgetGameId_NotExistsReferrer_DirectMessageList() { return xgetSQueMap("gameId_NotExistsReferrer_DirectMessageList"); }
    public String keepGameId_NotExistsReferrer_DirectMessageList(DbDirectMessageCQ sq) { return xkeepSQue("gameId_NotExistsReferrer_DirectMessageList", sq); }

    public Map<String, DbGamePeriodCQ> xdfgetGameId_SpecifyDerivedReferrer_GamePeriodList() { return xgetSQueMap("gameId_SpecifyDerivedReferrer_GamePeriodList"); }
    public String keepGameId_SpecifyDerivedReferrer_GamePeriodList(DbGamePeriodCQ sq) { return xkeepSQue("gameId_SpecifyDerivedReferrer_GamePeriodList", sq); }

    public Map<String, DbGamePlayerCQ> xdfgetGameId_SpecifyDerivedReferrer_GamePlayerList() { return xgetSQueMap("gameId_SpecifyDerivedReferrer_GamePlayerList"); }
    public String keepGameId_SpecifyDerivedReferrer_GamePlayerList(DbGamePlayerCQ sq) { return xkeepSQue("gameId_SpecifyDerivedReferrer_GamePlayerList", sq); }

    public Map<String, DbGameSettingCQ> xdfgetGameId_SpecifyDerivedReferrer_GameSettingList() { return xgetSQueMap("gameId_SpecifyDerivedReferrer_GameSettingList"); }
    public String keepGameId_SpecifyDerivedReferrer_GameSettingList(DbGameSettingCQ sq) { return xkeepSQue("gameId_SpecifyDerivedReferrer_GameSettingList", sq); }

    public Map<String, DbMessageCQ> xdfgetGameId_SpecifyDerivedReferrer_MessageList() { return xgetSQueMap("gameId_SpecifyDerivedReferrer_MessageList"); }
    public String keepGameId_SpecifyDerivedReferrer_MessageList(DbMessageCQ sq) { return xkeepSQue("gameId_SpecifyDerivedReferrer_MessageList", sq); }

    public Map<String, DbMessageReplyCQ> xdfgetGameId_SpecifyDerivedReferrer_MessageReplyList() { return xgetSQueMap("gameId_SpecifyDerivedReferrer_MessageReplyList"); }
    public String keepGameId_SpecifyDerivedReferrer_MessageReplyList(DbMessageReplyCQ sq) { return xkeepSQue("gameId_SpecifyDerivedReferrer_MessageReplyList", sq); }

    public Map<String, DbMessageFavoriteCQ> xdfgetGameId_SpecifyDerivedReferrer_MessageFavoriteList() { return xgetSQueMap("gameId_SpecifyDerivedReferrer_MessageFavoriteList"); }
    public String keepGameId_SpecifyDerivedReferrer_MessageFavoriteList(DbMessageFavoriteCQ sq) { return xkeepSQue("gameId_SpecifyDerivedReferrer_MessageFavoriteList", sq); }

    public Map<String, DbDirectMessageCQ> xdfgetGameId_SpecifyDerivedReferrer_DirectMessageList() { return xgetSQueMap("gameId_SpecifyDerivedReferrer_DirectMessageList"); }
    public String keepGameId_SpecifyDerivedReferrer_DirectMessageList(DbDirectMessageCQ sq) { return xkeepSQue("gameId_SpecifyDerivedReferrer_DirectMessageList", sq); }

    public Map<String, DbGamePeriodCQ> xdfgetGameId_QueryDerivedReferrer_GamePeriodList() { return xgetSQueMap("gameId_QueryDerivedReferrer_GamePeriodList"); }
    public String keepGameId_QueryDerivedReferrer_GamePeriodList(DbGamePeriodCQ sq) { return xkeepSQue("gameId_QueryDerivedReferrer_GamePeriodList", sq); }
    public Map<String, Object> xdfgetGameId_QueryDerivedReferrer_GamePeriodListParameter() { return xgetSQuePmMap("gameId_QueryDerivedReferrer_GamePeriodList"); }
    public String keepGameId_QueryDerivedReferrer_GamePeriodListParameter(Object pm) { return xkeepSQuePm("gameId_QueryDerivedReferrer_GamePeriodList", pm); }

    public Map<String, DbGamePlayerCQ> xdfgetGameId_QueryDerivedReferrer_GamePlayerList() { return xgetSQueMap("gameId_QueryDerivedReferrer_GamePlayerList"); }
    public String keepGameId_QueryDerivedReferrer_GamePlayerList(DbGamePlayerCQ sq) { return xkeepSQue("gameId_QueryDerivedReferrer_GamePlayerList", sq); }
    public Map<String, Object> xdfgetGameId_QueryDerivedReferrer_GamePlayerListParameter() { return xgetSQuePmMap("gameId_QueryDerivedReferrer_GamePlayerList"); }
    public String keepGameId_QueryDerivedReferrer_GamePlayerListParameter(Object pm) { return xkeepSQuePm("gameId_QueryDerivedReferrer_GamePlayerList", pm); }

    public Map<String, DbGameSettingCQ> xdfgetGameId_QueryDerivedReferrer_GameSettingList() { return xgetSQueMap("gameId_QueryDerivedReferrer_GameSettingList"); }
    public String keepGameId_QueryDerivedReferrer_GameSettingList(DbGameSettingCQ sq) { return xkeepSQue("gameId_QueryDerivedReferrer_GameSettingList", sq); }
    public Map<String, Object> xdfgetGameId_QueryDerivedReferrer_GameSettingListParameter() { return xgetSQuePmMap("gameId_QueryDerivedReferrer_GameSettingList"); }
    public String keepGameId_QueryDerivedReferrer_GameSettingListParameter(Object pm) { return xkeepSQuePm("gameId_QueryDerivedReferrer_GameSettingList", pm); }

    public Map<String, DbMessageCQ> xdfgetGameId_QueryDerivedReferrer_MessageList() { return xgetSQueMap("gameId_QueryDerivedReferrer_MessageList"); }
    public String keepGameId_QueryDerivedReferrer_MessageList(DbMessageCQ sq) { return xkeepSQue("gameId_QueryDerivedReferrer_MessageList", sq); }
    public Map<String, Object> xdfgetGameId_QueryDerivedReferrer_MessageListParameter() { return xgetSQuePmMap("gameId_QueryDerivedReferrer_MessageList"); }
    public String keepGameId_QueryDerivedReferrer_MessageListParameter(Object pm) { return xkeepSQuePm("gameId_QueryDerivedReferrer_MessageList", pm); }

    public Map<String, DbMessageReplyCQ> xdfgetGameId_QueryDerivedReferrer_MessageReplyList() { return xgetSQueMap("gameId_QueryDerivedReferrer_MessageReplyList"); }
    public String keepGameId_QueryDerivedReferrer_MessageReplyList(DbMessageReplyCQ sq) { return xkeepSQue("gameId_QueryDerivedReferrer_MessageReplyList", sq); }
    public Map<String, Object> xdfgetGameId_QueryDerivedReferrer_MessageReplyListParameter() { return xgetSQuePmMap("gameId_QueryDerivedReferrer_MessageReplyList"); }
    public String keepGameId_QueryDerivedReferrer_MessageReplyListParameter(Object pm) { return xkeepSQuePm("gameId_QueryDerivedReferrer_MessageReplyList", pm); }

    public Map<String, DbMessageFavoriteCQ> xdfgetGameId_QueryDerivedReferrer_MessageFavoriteList() { return xgetSQueMap("gameId_QueryDerivedReferrer_MessageFavoriteList"); }
    public String keepGameId_QueryDerivedReferrer_MessageFavoriteList(DbMessageFavoriteCQ sq) { return xkeepSQue("gameId_QueryDerivedReferrer_MessageFavoriteList", sq); }
    public Map<String, Object> xdfgetGameId_QueryDerivedReferrer_MessageFavoriteListParameter() { return xgetSQuePmMap("gameId_QueryDerivedReferrer_MessageFavoriteList"); }
    public String keepGameId_QueryDerivedReferrer_MessageFavoriteListParameter(Object pm) { return xkeepSQuePm("gameId_QueryDerivedReferrer_MessageFavoriteList", pm); }

    public Map<String, DbDirectMessageCQ> xdfgetGameId_QueryDerivedReferrer_DirectMessageList() { return xgetSQueMap("gameId_QueryDerivedReferrer_DirectMessageList"); }
    public String keepGameId_QueryDerivedReferrer_DirectMessageList(DbDirectMessageCQ sq) { return xkeepSQue("gameId_QueryDerivedReferrer_DirectMessageList", sq); }
    public Map<String, Object> xdfgetGameId_QueryDerivedReferrer_DirectMessageListParameter() { return xgetSQuePmMap("gameId_QueryDerivedReferrer_DirectMessageList"); }
    public String keepGameId_QueryDerivedReferrer_DirectMessageListParameter(Object pm) { return xkeepSQuePm("gameId_QueryDerivedReferrer_DirectMessageList", pm); }

    /**
     * Add order-by as ascend. <br>
     * game_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsGameCQ addOrderBy_GameId_Asc() { regOBA("game_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * game_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsGameCQ addOrderBy_GameId_Desc() { regOBD("game_id"); return this; }

    protected ConditionValue _gameName;
    public ConditionValue xdfgetGameName()
    { if (_gameName == null) { _gameName = nCV(); }
      return _gameName; }
    protected ConditionValue xgetCValueGameName() { return xdfgetGameName(); }

    /**
     * Add order-by as ascend. <br>
     * game_name: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsGameCQ addOrderBy_GameName_Asc() { regOBA("game_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * game_name: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsGameCQ addOrderBy_GameName_Desc() { regOBD("game_name"); return this; }

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
    public DbBsGameCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsGameCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public DbBsGameCQ addOrderBy_RegisterTrace_Asc() { regOBA("register_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsGameCQ addOrderBy_RegisterTrace_Desc() { regOBD("register_trace"); return this; }

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
    public DbBsGameCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsGameCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public DbBsGameCQ addOrderBy_UpdateTrace_Asc() { regOBA("update_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsGameCQ addOrderBy_UpdateTrace_Desc() { regOBD("update_trace"); return this; }

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
    public DbBsGameCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public DbBsGameCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, DbGameCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(DbGameCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, DbGameCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(DbGameCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, DbGameCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(DbGameCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, DbGameCQ> _myselfExistsMap;
    public Map<String, DbGameCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(DbGameCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, DbGameCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(DbGameCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return DbGameCB.class.getName(); }
    protected String xCQ() { return DbGameCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
