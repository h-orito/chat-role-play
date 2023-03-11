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
 * The base condition-query of direct_message.
 * @author DBFlute(AutoGenerator)
 */
public class DbBsDirectMessageCQ extends DbAbstractBsDirectMessageCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbDirectMessageCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbBsDirectMessageCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from direct_message) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public DbDirectMessageCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected DbDirectMessageCIQ xcreateCIQ() {
        DbDirectMessageCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected DbDirectMessageCIQ xnewCIQ() {
        return new DbDirectMessageCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join direct_message on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public DbDirectMessageCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        DbDirectMessageCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _directMessageId;
    public ConditionValue xdfgetDirectMessageId()
    { if (_directMessageId == null) { _directMessageId = nCV(); }
      return _directMessageId; }
    protected ConditionValue xgetCValueDirectMessageId() { return xdfgetDirectMessageId(); }

    /**
     * Add order-by as ascend. <br>
     * direct_message_id: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public DbBsDirectMessageCQ addOrderBy_DirectMessageId_Asc() { regOBA("direct_message_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * direct_message_id: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public DbBsDirectMessageCQ addOrderBy_DirectMessageId_Desc() { regOBD("direct_message_id"); return this; }

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
    public DbBsDirectMessageCQ addOrderBy_GameId_Asc() { regOBA("game_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * game_id: {PK, UQ+, NotNull, INT UNSIGNED(10), FK to game}
     * @return this. (NotNull)
     */
    public DbBsDirectMessageCQ addOrderBy_GameId_Desc() { regOBD("game_id"); return this; }

    protected ConditionValue _gamePlayerGroupId;
    public ConditionValue xdfgetGamePlayerGroupId()
    { if (_gamePlayerGroupId == null) { _gamePlayerGroupId = nCV(); }
      return _gamePlayerGroupId; }
    protected ConditionValue xgetCValueGamePlayerGroupId() { return xdfgetGamePlayerGroupId(); }

    /**
     * Add order-by as ascend. <br>
     * game_player_group_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to game_player_group}
     * @return this. (NotNull)
     */
    public DbBsDirectMessageCQ addOrderBy_GamePlayerGroupId_Asc() { regOBA("game_player_group_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * game_player_group_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to game_player_group}
     * @return this. (NotNull)
     */
    public DbBsDirectMessageCQ addOrderBy_GamePlayerGroupId_Desc() { regOBD("game_player_group_id"); return this; }

    protected ConditionValue _gamePeriodId;
    public ConditionValue xdfgetGamePeriodId()
    { if (_gamePeriodId == null) { _gamePeriodId = nCV(); }
      return _gamePeriodId; }
    protected ConditionValue xgetCValueGamePeriodId() { return xdfgetGamePeriodId(); }

    /**
     * Add order-by as ascend. <br>
     * game_period_id: {IX, NotNull, INT UNSIGNED(10), FK to game_period}
     * @return this. (NotNull)
     */
    public DbBsDirectMessageCQ addOrderBy_GamePeriodId_Asc() { regOBA("game_period_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * game_period_id: {IX, NotNull, INT UNSIGNED(10), FK to game_period}
     * @return this. (NotNull)
     */
    public DbBsDirectMessageCQ addOrderBy_GamePeriodId_Desc() { regOBD("game_period_id"); return this; }

    protected ConditionValue _fromGamePlayerId;
    public ConditionValue xdfgetFromGamePlayerId()
    { if (_fromGamePlayerId == null) { _fromGamePlayerId = nCV(); }
      return _fromGamePlayerId; }
    protected ConditionValue xgetCValueFromGamePlayerId() { return xdfgetFromGamePlayerId(); }

    /**
     * Add order-by as ascend. <br>
     * from_game_player_id: {IX, INT UNSIGNED(10), FK to game_player}
     * @return this. (NotNull)
     */
    public DbBsDirectMessageCQ addOrderBy_FromGamePlayerId_Asc() { regOBA("from_game_player_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * from_game_player_id: {IX, INT UNSIGNED(10), FK to game_player}
     * @return this. (NotNull)
     */
    public DbBsDirectMessageCQ addOrderBy_FromGamePlayerId_Desc() { regOBD("from_game_player_id"); return this; }

    protected ConditionValue _fromGamePlayerName;
    public ConditionValue xdfgetFromGamePlayerName()
    { if (_fromGamePlayerName == null) { _fromGamePlayerName = nCV(); }
      return _fromGamePlayerName; }
    protected ConditionValue xgetCValueFromGamePlayerName() { return xdfgetFromGamePlayerName(); }

    /**
     * Add order-by as ascend. <br>
     * from_game_player_name: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsDirectMessageCQ addOrderBy_FromGamePlayerName_Asc() { regOBA("from_game_player_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * from_game_player_name: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsDirectMessageCQ addOrderBy_FromGamePlayerName_Desc() { regOBD("from_game_player_name"); return this; }

    protected ConditionValue _fromGamePlayerFaceTypeCode;
    public ConditionValue xdfgetFromGamePlayerFaceTypeCode()
    { if (_fromGamePlayerFaceTypeCode == null) { _fromGamePlayerFaceTypeCode = nCV(); }
      return _fromGamePlayerFaceTypeCode; }
    protected ConditionValue xgetCValueFromGamePlayerFaceTypeCode() { return xdfgetFromGamePlayerFaceTypeCode(); }

    /**
     * Add order-by as ascend. <br>
     * from_game_player_face_type_code: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsDirectMessageCQ addOrderBy_FromGamePlayerFaceTypeCode_Asc() { regOBA("from_game_player_face_type_code"); return this; }

    /**
     * Add order-by as descend. <br>
     * from_game_player_face_type_code: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public DbBsDirectMessageCQ addOrderBy_FromGamePlayerFaceTypeCode_Desc() { regOBD("from_game_player_face_type_code"); return this; }

    protected ConditionValue _messageContent;
    public ConditionValue xdfgetMessageContent()
    { if (_messageContent == null) { _messageContent = nCV(); }
      return _messageContent; }
    protected ConditionValue xgetCValueMessageContent() { return xdfgetMessageContent(); }

    /**
     * Add order-by as ascend. <br>
     * message_content: {VARCHAR(10000)}
     * @return this. (NotNull)
     */
    public DbBsDirectMessageCQ addOrderBy_MessageContent_Asc() { regOBA("message_content"); return this; }

    /**
     * Add order-by as descend. <br>
     * message_content: {VARCHAR(10000)}
     * @return this. (NotNull)
     */
    public DbBsDirectMessageCQ addOrderBy_MessageContent_Desc() { regOBD("message_content"); return this; }

    protected ConditionValue _messageNumber;
    public ConditionValue xdfgetMessageNumber()
    { if (_messageNumber == null) { _messageNumber = nCV(); }
      return _messageNumber; }
    protected ConditionValue xgetCValueMessageNumber() { return xdfgetMessageNumber(); }

    /**
     * Add order-by as ascend. <br>
     * message_number: {+UQ, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsDirectMessageCQ addOrderBy_MessageNumber_Asc() { regOBA("message_number"); return this; }

    /**
     * Add order-by as descend. <br>
     * message_number: {+UQ, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public DbBsDirectMessageCQ addOrderBy_MessageNumber_Desc() { regOBD("message_number"); return this; }

    protected ConditionValue _messageDatetime;
    public ConditionValue xdfgetMessageDatetime()
    { if (_messageDatetime == null) { _messageDatetime = nCV(); }
      return _messageDatetime; }
    protected ConditionValue xgetCValueMessageDatetime() { return xdfgetMessageDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * message_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsDirectMessageCQ addOrderBy_MessageDatetime_Asc() { regOBA("message_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * message_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsDirectMessageCQ addOrderBy_MessageDatetime_Desc() { regOBD("message_datetime"); return this; }

    protected ConditionValue _messageUnixTimestampMilli;
    public ConditionValue xdfgetMessageUnixTimestampMilli()
    { if (_messageUnixTimestampMilli == null) { _messageUnixTimestampMilli = nCV(); }
      return _messageUnixTimestampMilli; }
    protected ConditionValue xgetCValueMessageUnixTimestampMilli() { return xdfgetMessageUnixTimestampMilli(); }

    /**
     * Add order-by as ascend. <br>
     * message_unix_timestamp_milli: {NotNull, BIGINT UNSIGNED(20)}
     * @return this. (NotNull)
     */
    public DbBsDirectMessageCQ addOrderBy_MessageUnixTimestampMilli_Asc() { regOBA("message_unix_timestamp_milli"); return this; }

    /**
     * Add order-by as descend. <br>
     * message_unix_timestamp_milli: {NotNull, BIGINT UNSIGNED(20)}
     * @return this. (NotNull)
     */
    public DbBsDirectMessageCQ addOrderBy_MessageUnixTimestampMilli_Desc() { regOBD("message_unix_timestamp_milli"); return this; }

    protected ConditionValue _isDeleted;
    public ConditionValue xdfgetIsDeleted()
    { if (_isDeleted == null) { _isDeleted = nCV(); }
      return _isDeleted; }
    protected ConditionValue xgetCValueIsDeleted() { return xdfgetIsDeleted(); }

    /**
     * Add order-by as ascend. <br>
     * is_deleted: {NotNull, BIT}
     * @return this. (NotNull)
     */
    public DbBsDirectMessageCQ addOrderBy_IsDeleted_Asc() { regOBA("is_deleted"); return this; }

    /**
     * Add order-by as descend. <br>
     * is_deleted: {NotNull, BIT}
     * @return this. (NotNull)
     */
    public DbBsDirectMessageCQ addOrderBy_IsDeleted_Desc() { regOBD("is_deleted"); return this; }

    protected ConditionValue _isConvertDisable;
    public ConditionValue xdfgetIsConvertDisable()
    { if (_isConvertDisable == null) { _isConvertDisable = nCV(); }
      return _isConvertDisable; }
    protected ConditionValue xgetCValueIsConvertDisable() { return xdfgetIsConvertDisable(); }

    /**
     * Add order-by as ascend. <br>
     * is_convert_disable: {NotNull, BIT}
     * @return this. (NotNull)
     */
    public DbBsDirectMessageCQ addOrderBy_IsConvertDisable_Asc() { regOBA("is_convert_disable"); return this; }

    /**
     * Add order-by as descend. <br>
     * is_convert_disable: {NotNull, BIT}
     * @return this. (NotNull)
     */
    public DbBsDirectMessageCQ addOrderBy_IsConvertDisable_Desc() { regOBD("is_convert_disable"); return this; }

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
    public DbBsDirectMessageCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsDirectMessageCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public DbBsDirectMessageCQ addOrderBy_RegisterTrace_Asc() { regOBA("register_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsDirectMessageCQ addOrderBy_RegisterTrace_Desc() { regOBD("register_trace"); return this; }

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
    public DbBsDirectMessageCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsDirectMessageCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public DbBsDirectMessageCQ addOrderBy_UpdateTrace_Asc() { regOBA("update_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsDirectMessageCQ addOrderBy_UpdateTrace_Desc() { regOBD("update_trace"); return this; }

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
    public DbBsDirectMessageCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public DbBsDirectMessageCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        DbDirectMessageCQ bq = (DbDirectMessageCQ)bqs;
        DbDirectMessageCQ uq = (DbDirectMessageCQ)uqs;
        if (bq.hasConditionQueryGame()) {
            uq.queryGame().reflectRelationOnUnionQuery(bq.queryGame(), uq.queryGame());
        }
        if (bq.hasConditionQueryGamePlayerGroup()) {
            uq.queryGamePlayerGroup().reflectRelationOnUnionQuery(bq.queryGamePlayerGroup(), uq.queryGamePlayerGroup());
        }
        if (bq.hasConditionQueryGamePeriod()) {
            uq.queryGamePeriod().reflectRelationOnUnionQuery(bq.queryGamePeriod(), uq.queryGamePeriod());
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
        String nrp = xresolveNRP("direct_message", "game"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new DbGameCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "game", nrp);
    }
    protected void xsetupOuterJoinGame() { xregOutJo("game"); }
    public boolean hasConditionQueryGame() { return xhasQueRlMap("game"); }

    /**
     * Get the condition-query for relation table. <br>
     * GAME_PLAYER_GROUP by my game_player_group_id, named 'gamePlayerGroup'.
     * @return The instance of condition-query. (NotNull)
     */
    public DbGamePlayerGroupCQ queryGamePlayerGroup() {
        return xdfgetConditionQueryGamePlayerGroup();
    }
    public DbGamePlayerGroupCQ xdfgetConditionQueryGamePlayerGroup() {
        String prop = "gamePlayerGroup";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryGamePlayerGroup()); xsetupOuterJoinGamePlayerGroup(); }
        return xgetQueRlMap(prop);
    }
    protected DbGamePlayerGroupCQ xcreateQueryGamePlayerGroup() {
        String nrp = xresolveNRP("direct_message", "gamePlayerGroup"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new DbGamePlayerGroupCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "gamePlayerGroup", nrp);
    }
    protected void xsetupOuterJoinGamePlayerGroup() { xregOutJo("gamePlayerGroup"); }
    public boolean hasConditionQueryGamePlayerGroup() { return xhasQueRlMap("gamePlayerGroup"); }

    /**
     * Get the condition-query for relation table. <br>
     * GAME_PERIOD by my game_period_id, named 'gamePeriod'.
     * @return The instance of condition-query. (NotNull)
     */
    public DbGamePeriodCQ queryGamePeriod() {
        return xdfgetConditionQueryGamePeriod();
    }
    public DbGamePeriodCQ xdfgetConditionQueryGamePeriod() {
        String prop = "gamePeriod";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryGamePeriod()); xsetupOuterJoinGamePeriod(); }
        return xgetQueRlMap(prop);
    }
    protected DbGamePeriodCQ xcreateQueryGamePeriod() {
        String nrp = xresolveNRP("direct_message", "gamePeriod"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new DbGamePeriodCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "gamePeriod", nrp);
    }
    protected void xsetupOuterJoinGamePeriod() { xregOutJo("gamePeriod"); }
    public boolean hasConditionQueryGamePeriod() { return xhasQueRlMap("gamePeriod"); }

    /**
     * Get the condition-query for relation table. <br>
     * GAME_PLAYER by my from_game_player_id, named 'gamePlayer'.
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
        String nrp = xresolveNRP("direct_message", "gamePlayer"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, DbDirectMessageCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(DbDirectMessageCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return DbDirectMessageCB.class.getName(); }
    protected String xCQ() { return DbDirectMessageCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
