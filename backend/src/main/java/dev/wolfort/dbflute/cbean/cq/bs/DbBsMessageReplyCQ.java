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
 * The base condition-query of message_reply.
 * @author DBFlute(AutoGenerator)
 */
public class DbBsMessageReplyCQ extends DbAbstractBsMessageReplyCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbMessageReplyCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbBsMessageReplyCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from message_reply) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public DbMessageReplyCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected DbMessageReplyCIQ xcreateCIQ() {
        DbMessageReplyCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected DbMessageReplyCIQ xnewCIQ() {
        return new DbMessageReplyCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join message_reply on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public DbMessageReplyCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        DbMessageReplyCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _messageReplyId;
    public ConditionValue xdfgetMessageReplyId()
    { if (_messageReplyId == null) { _messageReplyId = nCV(); }
      return _messageReplyId; }
    protected ConditionValue xgetCValueMessageReplyId() { return xdfgetMessageReplyId(); }

    /**
     * Add order-by as ascend. <br>
     * message_reply_id: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public DbBsMessageReplyCQ addOrderBy_MessageReplyId_Asc() { regOBA("message_reply_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * message_reply_id: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public DbBsMessageReplyCQ addOrderBy_MessageReplyId_Desc() { regOBD("message_reply_id"); return this; }

    protected ConditionValue _gameId;
    public ConditionValue xdfgetGameId()
    { if (_gameId == null) { _gameId = nCV(); }
      return _gameId; }
    protected ConditionValue xgetCValueGameId() { return xdfgetGameId(); }

    /**
     * Add order-by as ascend. <br>
     * game_id: {PK, IX, NotNull, INT UNSIGNED(10), FK to game}
     * @return this. (NotNull)
     */
    public DbBsMessageReplyCQ addOrderBy_GameId_Asc() { regOBA("game_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * game_id: {PK, IX, NotNull, INT UNSIGNED(10), FK to game}
     * @return this. (NotNull)
     */
    public DbBsMessageReplyCQ addOrderBy_GameId_Desc() { regOBD("game_id"); return this; }

    protected ConditionValue _fromMessageId;
    public ConditionValue xdfgetFromMessageId()
    { if (_fromMessageId == null) { _fromMessageId = nCV(); }
      return _fromMessageId; }
    protected ConditionValue xgetCValueFromMessageId() { return xdfgetFromMessageId(); }

    /**
     * Add order-by as ascend. <br>
     * from_message_id: {IX, NotNull, BIGINT(19), FK to message}
     * @return this. (NotNull)
     */
    public DbBsMessageReplyCQ addOrderBy_FromMessageId_Asc() { regOBA("from_message_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * from_message_id: {IX, NotNull, BIGINT(19), FK to message}
     * @return this. (NotNull)
     */
    public DbBsMessageReplyCQ addOrderBy_FromMessageId_Desc() { regOBD("from_message_id"); return this; }

    protected ConditionValue _replyMessageId;
    public ConditionValue xdfgetReplyMessageId()
    { if (_replyMessageId == null) { _replyMessageId = nCV(); }
      return _replyMessageId; }
    protected ConditionValue xgetCValueReplyMessageId() { return xdfgetReplyMessageId(); }

    /**
     * Add order-by as ascend. <br>
     * reply_message_id: {IX, NotNull, BIGINT(19), FK to message}
     * @return this. (NotNull)
     */
    public DbBsMessageReplyCQ addOrderBy_ReplyMessageId_Asc() { regOBA("reply_message_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * reply_message_id: {IX, NotNull, BIGINT(19), FK to message}
     * @return this. (NotNull)
     */
    public DbBsMessageReplyCQ addOrderBy_ReplyMessageId_Desc() { regOBD("reply_message_id"); return this; }

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
    public DbBsMessageReplyCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsMessageReplyCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public DbBsMessageReplyCQ addOrderBy_RegisterTrace_Asc() { regOBA("register_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsMessageReplyCQ addOrderBy_RegisterTrace_Desc() { regOBD("register_trace"); return this; }

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
    public DbBsMessageReplyCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public DbBsMessageReplyCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public DbBsMessageReplyCQ addOrderBy_UpdateTrace_Asc() { regOBA("update_trace"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public DbBsMessageReplyCQ addOrderBy_UpdateTrace_Desc() { regOBD("update_trace"); return this; }

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
    public DbBsMessageReplyCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public DbBsMessageReplyCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        DbMessageReplyCQ bq = (DbMessageReplyCQ)bqs;
        DbMessageReplyCQ uq = (DbMessageReplyCQ)uqs;
        if (bq.hasConditionQueryGame()) {
            uq.queryGame().reflectRelationOnUnionQuery(bq.queryGame(), uq.queryGame());
        }
        if (bq.hasConditionQueryMessageByFromMessageId()) {
            uq.queryMessageByFromMessageId().reflectRelationOnUnionQuery(bq.queryMessageByFromMessageId(), uq.queryMessageByFromMessageId());
        }
        if (bq.hasConditionQueryMessageByReplyMessageId()) {
            uq.queryMessageByReplyMessageId().reflectRelationOnUnionQuery(bq.queryMessageByReplyMessageId(), uq.queryMessageByReplyMessageId());
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
        String nrp = xresolveNRP("message_reply", "game"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new DbGameCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "game", nrp);
    }
    protected void xsetupOuterJoinGame() { xregOutJo("game"); }
    public boolean hasConditionQueryGame() { return xhasQueRlMap("game"); }

    /**
     * Get the condition-query for relation table. <br>
     * MESSAGE by my from_message_id, named 'messageByFromMessageId'.
     * @return The instance of condition-query. (NotNull)
     */
    public DbMessageCQ queryMessageByFromMessageId() {
        return xdfgetConditionQueryMessageByFromMessageId();
    }
    public DbMessageCQ xdfgetConditionQueryMessageByFromMessageId() {
        String prop = "messageByFromMessageId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMessageByFromMessageId()); xsetupOuterJoinMessageByFromMessageId(); }
        return xgetQueRlMap(prop);
    }
    protected DbMessageCQ xcreateQueryMessageByFromMessageId() {
        String nrp = xresolveNRP("message_reply", "messageByFromMessageId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new DbMessageCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "messageByFromMessageId", nrp);
    }
    protected void xsetupOuterJoinMessageByFromMessageId() { xregOutJo("messageByFromMessageId"); }
    public boolean hasConditionQueryMessageByFromMessageId() { return xhasQueRlMap("messageByFromMessageId"); }

    /**
     * Get the condition-query for relation table. <br>
     * MESSAGE by my reply_message_id, named 'messageByReplyMessageId'.
     * @return The instance of condition-query. (NotNull)
     */
    public DbMessageCQ queryMessageByReplyMessageId() {
        return xdfgetConditionQueryMessageByReplyMessageId();
    }
    public DbMessageCQ xdfgetConditionQueryMessageByReplyMessageId() {
        String prop = "messageByReplyMessageId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMessageByReplyMessageId()); xsetupOuterJoinMessageByReplyMessageId(); }
        return xgetQueRlMap(prop);
    }
    protected DbMessageCQ xcreateQueryMessageByReplyMessageId() {
        String nrp = xresolveNRP("message_reply", "messageByReplyMessageId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new DbMessageCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "messageByReplyMessageId", nrp);
    }
    protected void xsetupOuterJoinMessageByReplyMessageId() { xregOutJo("messageByReplyMessageId"); }
    public boolean hasConditionQueryMessageByReplyMessageId() { return xhasQueRlMap("messageByReplyMessageId"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, DbMessageReplyCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(DbMessageReplyCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return DbMessageReplyCB.class.getName(); }
    protected String xCQ() { return DbMessageReplyCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
