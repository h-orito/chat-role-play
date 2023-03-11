package dev.wolfort.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import dev.wolfort.dbflute.allcommon.*;
import dev.wolfort.dbflute.cbean.*;
import dev.wolfort.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of game_period.
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbAbstractBsGamePeriodCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbAbstractBsGamePeriodCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DbDBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "game_period";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * game_period_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param gamePeriodId The value of gamePeriodId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGamePeriodId_Equal(Integer gamePeriodId) {
        doSetGamePeriodId_Equal(gamePeriodId);
    }

    protected void doSetGamePeriodId_Equal(Integer gamePeriodId) {
        regGamePeriodId(CK_EQ, gamePeriodId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * game_period_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param gamePeriodId The value of gamePeriodId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGamePeriodId_NotEqual(Integer gamePeriodId) {
        doSetGamePeriodId_NotEqual(gamePeriodId);
    }

    protected void doSetGamePeriodId_NotEqual(Integer gamePeriodId) {
        regGamePeriodId(CK_NES, gamePeriodId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * game_period_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param gamePeriodId The value of gamePeriodId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGamePeriodId_GreaterThan(Integer gamePeriodId) {
        regGamePeriodId(CK_GT, gamePeriodId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * game_period_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param gamePeriodId The value of gamePeriodId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGamePeriodId_LessThan(Integer gamePeriodId) {
        regGamePeriodId(CK_LT, gamePeriodId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * game_period_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param gamePeriodId The value of gamePeriodId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGamePeriodId_GreaterEqual(Integer gamePeriodId) {
        regGamePeriodId(CK_GE, gamePeriodId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * game_period_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param gamePeriodId The value of gamePeriodId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGamePeriodId_LessEqual(Integer gamePeriodId) {
        regGamePeriodId(CK_LE, gamePeriodId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * game_period_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of gamePeriodId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of gamePeriodId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setGamePeriodId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setGamePeriodId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * game_period_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of gamePeriodId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of gamePeriodId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setGamePeriodId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGamePeriodId(), "game_period_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * game_period_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param gamePeriodIdList The collection of gamePeriodId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGamePeriodId_InScope(Collection<Integer> gamePeriodIdList) {
        doSetGamePeriodId_InScope(gamePeriodIdList);
    }

    protected void doSetGamePeriodId_InScope(Collection<Integer> gamePeriodIdList) {
        regINS(CK_INS, cTL(gamePeriodIdList), xgetCValueGamePeriodId(), "game_period_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * game_period_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param gamePeriodIdList The collection of gamePeriodId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGamePeriodId_NotInScope(Collection<Integer> gamePeriodIdList) {
        doSetGamePeriodId_NotInScope(gamePeriodIdList);
    }

    protected void doSetGamePeriodId_NotInScope(Collection<Integer> gamePeriodIdList) {
        regINS(CK_NINS, cTL(gamePeriodIdList), xgetCValueGamePeriodId(), "game_period_id");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select game_period_id from message where ...)} <br>
     * message by game_period_id, named 'messageAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMessage</span>(messageCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     messageCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MessageList for 'exists'. (NotNull)
     */
    public void existsMessage(SubQuery<DbMessageCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbMessageCB cb = new DbMessageCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepGamePeriodId_ExistsReferrer_MessageList(cb.query());
        registerExistsReferrer(cb.query(), "game_period_id", "game_period_id", pp, "messageList");
    }
    public abstract String keepGamePeriodId_ExistsReferrer_MessageList(DbMessageCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select game_period_id from direct_message where ...)} <br>
     * direct_message by game_period_id, named 'directMessageAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsDirectMessage</span>(messageCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     messageCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of DirectMessageList for 'exists'. (NotNull)
     */
    public void existsDirectMessage(SubQuery<DbDirectMessageCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbDirectMessageCB cb = new DbDirectMessageCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepGamePeriodId_ExistsReferrer_DirectMessageList(cb.query());
        registerExistsReferrer(cb.query(), "game_period_id", "game_period_id", pp, "directMessageList");
    }
    public abstract String keepGamePeriodId_ExistsReferrer_DirectMessageList(DbDirectMessageCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select game_period_id from message where ...)} <br>
     * message by game_period_id, named 'messageAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMessage</span>(messageCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     messageCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of GamePeriodId_NotExistsReferrer_MessageList for 'not exists'. (NotNull)
     */
    public void notExistsMessage(SubQuery<DbMessageCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbMessageCB cb = new DbMessageCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepGamePeriodId_NotExistsReferrer_MessageList(cb.query());
        registerNotExistsReferrer(cb.query(), "game_period_id", "game_period_id", pp, "messageList");
    }
    public abstract String keepGamePeriodId_NotExistsReferrer_MessageList(DbMessageCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select game_period_id from direct_message where ...)} <br>
     * direct_message by game_period_id, named 'directMessageAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsDirectMessage</span>(messageCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     messageCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of GamePeriodId_NotExistsReferrer_DirectMessageList for 'not exists'. (NotNull)
     */
    public void notExistsDirectMessage(SubQuery<DbDirectMessageCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbDirectMessageCB cb = new DbDirectMessageCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepGamePeriodId_NotExistsReferrer_DirectMessageList(cb.query());
        registerNotExistsReferrer(cb.query(), "game_period_id", "game_period_id", pp, "directMessageList");
    }
    public abstract String keepGamePeriodId_NotExistsReferrer_DirectMessageList(DbDirectMessageCQ sq);

    public void xsderiveMessageList(String fn, SubQuery<DbMessageCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbMessageCB cb = new DbMessageCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepGamePeriodId_SpecifyDerivedReferrer_MessageList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "game_period_id", "game_period_id", pp, "messageList", al, op);
    }
    public abstract String keepGamePeriodId_SpecifyDerivedReferrer_MessageList(DbMessageCQ sq);

    public void xsderiveDirectMessageList(String fn, SubQuery<DbDirectMessageCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbDirectMessageCB cb = new DbDirectMessageCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepGamePeriodId_SpecifyDerivedReferrer_DirectMessageList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "game_period_id", "game_period_id", pp, "directMessageList", al, op);
    }
    public abstract String keepGamePeriodId_SpecifyDerivedReferrer_DirectMessageList(DbDirectMessageCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from message where ...)} <br>
     * message by game_period_id, named 'messageAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMessage()</span>.<span style="color: #CC4747">max</span>(messageCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     messageCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     messageCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<DbMessageCB> derivedMessage() {
        return xcreateQDRFunctionMessageList();
    }
    protected HpQDRFunction<DbMessageCB> xcreateQDRFunctionMessageList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMessageList(fn, sq, rd, vl, op));
    }
    public void xqderiveMessageList(String fn, SubQuery<DbMessageCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbMessageCB cb = new DbMessageCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepGamePeriodId_QueryDerivedReferrer_MessageList(cb.query()); String prpp = keepGamePeriodId_QueryDerivedReferrer_MessageListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "game_period_id", "game_period_id", sqpp, "messageList", rd, vl, prpp, op);
    }
    public abstract String keepGamePeriodId_QueryDerivedReferrer_MessageList(DbMessageCQ sq);
    public abstract String keepGamePeriodId_QueryDerivedReferrer_MessageListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from direct_message where ...)} <br>
     * direct_message by game_period_id, named 'directMessageAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedDirectMessage()</span>.<span style="color: #CC4747">max</span>(messageCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     messageCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     messageCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<DbDirectMessageCB> derivedDirectMessage() {
        return xcreateQDRFunctionDirectMessageList();
    }
    protected HpQDRFunction<DbDirectMessageCB> xcreateQDRFunctionDirectMessageList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveDirectMessageList(fn, sq, rd, vl, op));
    }
    public void xqderiveDirectMessageList(String fn, SubQuery<DbDirectMessageCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbDirectMessageCB cb = new DbDirectMessageCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepGamePeriodId_QueryDerivedReferrer_DirectMessageList(cb.query()); String prpp = keepGamePeriodId_QueryDerivedReferrer_DirectMessageListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "game_period_id", "game_period_id", sqpp, "directMessageList", rd, vl, prpp, op);
    }
    public abstract String keepGamePeriodId_QueryDerivedReferrer_DirectMessageList(DbDirectMessageCQ sq);
    public abstract String keepGamePeriodId_QueryDerivedReferrer_DirectMessageListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * game_period_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setGamePeriodId_IsNull() { regGamePeriodId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * game_period_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setGamePeriodId_IsNotNull() { regGamePeriodId(CK_ISNN, DOBJ); }

    protected void regGamePeriodId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGamePeriodId(), "game_period_id"); }
    protected abstract ConditionValue xgetCValueGamePeriodId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * game_id: {UQ+, NotNull, INT UNSIGNED(10), FK to game}
     * @param gameId The value of gameId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameId_Equal(Integer gameId) {
        doSetGameId_Equal(gameId);
    }

    protected void doSetGameId_Equal(Integer gameId) {
        regGameId(CK_EQ, gameId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * game_id: {UQ+, NotNull, INT UNSIGNED(10), FK to game}
     * @param gameId The value of gameId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameId_NotEqual(Integer gameId) {
        doSetGameId_NotEqual(gameId);
    }

    protected void doSetGameId_NotEqual(Integer gameId) {
        regGameId(CK_NES, gameId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * game_id: {UQ+, NotNull, INT UNSIGNED(10), FK to game}
     * @param gameId The value of gameId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameId_GreaterThan(Integer gameId) {
        regGameId(CK_GT, gameId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * game_id: {UQ+, NotNull, INT UNSIGNED(10), FK to game}
     * @param gameId The value of gameId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameId_LessThan(Integer gameId) {
        regGameId(CK_LT, gameId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * game_id: {UQ+, NotNull, INT UNSIGNED(10), FK to game}
     * @param gameId The value of gameId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameId_GreaterEqual(Integer gameId) {
        regGameId(CK_GE, gameId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * game_id: {UQ+, NotNull, INT UNSIGNED(10), FK to game}
     * @param gameId The value of gameId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameId_LessEqual(Integer gameId) {
        regGameId(CK_LE, gameId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * game_id: {UQ+, NotNull, INT UNSIGNED(10), FK to game}
     * @param minNumber The min number of gameId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of gameId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setGameId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setGameId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * game_id: {UQ+, NotNull, INT UNSIGNED(10), FK to game}
     * @param minNumber The min number of gameId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of gameId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setGameId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGameId(), "game_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * game_id: {UQ+, NotNull, INT UNSIGNED(10), FK to game}
     * @param gameIdList The collection of gameId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameId_InScope(Collection<Integer> gameIdList) {
        doSetGameId_InScope(gameIdList);
    }

    protected void doSetGameId_InScope(Collection<Integer> gameIdList) {
        regINS(CK_INS, cTL(gameIdList), xgetCValueGameId(), "game_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * game_id: {UQ+, NotNull, INT UNSIGNED(10), FK to game}
     * @param gameIdList The collection of gameId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameId_NotInScope(Collection<Integer> gameIdList) {
        doSetGameId_NotInScope(gameIdList);
    }

    protected void doSetGameId_NotInScope(Collection<Integer> gameIdList) {
        regINS(CK_NINS, cTL(gameIdList), xgetCValueGameId(), "game_id");
    }

    protected void regGameId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGameId(), "game_id"); }
    protected abstract ConditionValue xgetCValueGameId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * period: {+UQ, INT UNSIGNED(10)}
     * @param period The value of period as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPeriod_Equal(Integer period) {
        doSetPeriod_Equal(period);
    }

    protected void doSetPeriod_Equal(Integer period) {
        regPeriod(CK_EQ, period);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * period: {+UQ, INT UNSIGNED(10)}
     * @param period The value of period as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPeriod_NotEqual(Integer period) {
        doSetPeriod_NotEqual(period);
    }

    protected void doSetPeriod_NotEqual(Integer period) {
        regPeriod(CK_NES, period);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * period: {+UQ, INT UNSIGNED(10)}
     * @param period The value of period as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPeriod_GreaterThan(Integer period) {
        regPeriod(CK_GT, period);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * period: {+UQ, INT UNSIGNED(10)}
     * @param period The value of period as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPeriod_LessThan(Integer period) {
        regPeriod(CK_LT, period);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * period: {+UQ, INT UNSIGNED(10)}
     * @param period The value of period as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPeriod_GreaterEqual(Integer period) {
        regPeriod(CK_GE, period);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * period: {+UQ, INT UNSIGNED(10)}
     * @param period The value of period as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPeriod_LessEqual(Integer period) {
        regPeriod(CK_LE, period);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * period: {+UQ, INT UNSIGNED(10)}
     * @param minNumber The min number of period. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of period. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPeriod_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPeriod_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * period: {+UQ, INT UNSIGNED(10)}
     * @param minNumber The min number of period. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of period. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPeriod_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePeriod(), "period", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * period: {+UQ, INT UNSIGNED(10)}
     * @param periodList The collection of period as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPeriod_InScope(Collection<Integer> periodList) {
        doSetPeriod_InScope(periodList);
    }

    protected void doSetPeriod_InScope(Collection<Integer> periodList) {
        regINS(CK_INS, cTL(periodList), xgetCValuePeriod(), "period");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * period: {+UQ, INT UNSIGNED(10)}
     * @param periodList The collection of period as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPeriod_NotInScope(Collection<Integer> periodList) {
        doSetPeriod_NotInScope(periodList);
    }

    protected void doSetPeriod_NotInScope(Collection<Integer> periodList) {
        regINS(CK_NINS, cTL(periodList), xgetCValuePeriod(), "period");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * period: {+UQ, INT UNSIGNED(10)}
     */
    public void setPeriod_IsNull() { regPeriod(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * period: {+UQ, INT UNSIGNED(10)}
     */
    public void setPeriod_IsNotNull() { regPeriod(CK_ISNN, DOBJ); }

    protected void regPeriod(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePeriod(), "period"); }
    protected abstract ConditionValue xgetCValuePeriod();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * prefix: {VARCHAR(255)}
     * @param prefix The value of prefix as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefix_Equal(String prefix) {
        doSetPrefix_Equal(fRES(prefix));
    }

    protected void doSetPrefix_Equal(String prefix) {
        regPrefix(CK_EQ, prefix);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * prefix: {VARCHAR(255)}
     * @param prefix The value of prefix as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefix_NotEqual(String prefix) {
        doSetPrefix_NotEqual(fRES(prefix));
    }

    protected void doSetPrefix_NotEqual(String prefix) {
        regPrefix(CK_NES, prefix);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * prefix: {VARCHAR(255)}
     * @param prefix The value of prefix as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefix_GreaterThan(String prefix) {
        regPrefix(CK_GT, fRES(prefix));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * prefix: {VARCHAR(255)}
     * @param prefix The value of prefix as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefix_LessThan(String prefix) {
        regPrefix(CK_LT, fRES(prefix));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * prefix: {VARCHAR(255)}
     * @param prefix The value of prefix as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefix_GreaterEqual(String prefix) {
        regPrefix(CK_GE, fRES(prefix));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * prefix: {VARCHAR(255)}
     * @param prefix The value of prefix as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefix_LessEqual(String prefix) {
        regPrefix(CK_LE, fRES(prefix));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * prefix: {VARCHAR(255)}
     * @param prefixList The collection of prefix as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefix_InScope(Collection<String> prefixList) {
        doSetPrefix_InScope(prefixList);
    }

    protected void doSetPrefix_InScope(Collection<String> prefixList) {
        regINS(CK_INS, cTL(prefixList), xgetCValuePrefix(), "prefix");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * prefix: {VARCHAR(255)}
     * @param prefixList The collection of prefix as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefix_NotInScope(Collection<String> prefixList) {
        doSetPrefix_NotInScope(prefixList);
    }

    protected void doSetPrefix_NotInScope(Collection<String> prefixList) {
        regINS(CK_NINS, cTL(prefixList), xgetCValuePrefix(), "prefix");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * prefix: {VARCHAR(255)} <br>
     * <pre>e.g. setPrefix_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param prefix The value of prefix as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPrefix_LikeSearch(String prefix, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPrefix_LikeSearch(prefix, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * prefix: {VARCHAR(255)} <br>
     * <pre>e.g. setPrefix_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param prefix The value of prefix as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPrefix_LikeSearch(String prefix, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(prefix), xgetCValuePrefix(), "prefix", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * prefix: {VARCHAR(255)}
     * @param prefix The value of prefix as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPrefix_NotLikeSearch(String prefix, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPrefix_NotLikeSearch(prefix, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * prefix: {VARCHAR(255)}
     * @param prefix The value of prefix as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPrefix_NotLikeSearch(String prefix, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(prefix), xgetCValuePrefix(), "prefix", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * prefix: {VARCHAR(255)}
     */
    public void setPrefix_IsNull() { regPrefix(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * prefix: {VARCHAR(255)}
     */
    public void setPrefix_IsNullOrEmpty() { regPrefix(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * prefix: {VARCHAR(255)}
     */
    public void setPrefix_IsNotNull() { regPrefix(CK_ISNN, DOBJ); }

    protected void regPrefix(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrefix(), "prefix"); }
    protected abstract ConditionValue xgetCValuePrefix();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * suffix: {VARCHAR(255)}
     * @param suffix The value of suffix as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuffix_Equal(String suffix) {
        doSetSuffix_Equal(fRES(suffix));
    }

    protected void doSetSuffix_Equal(String suffix) {
        regSuffix(CK_EQ, suffix);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * suffix: {VARCHAR(255)}
     * @param suffix The value of suffix as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuffix_NotEqual(String suffix) {
        doSetSuffix_NotEqual(fRES(suffix));
    }

    protected void doSetSuffix_NotEqual(String suffix) {
        regSuffix(CK_NES, suffix);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * suffix: {VARCHAR(255)}
     * @param suffix The value of suffix as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuffix_GreaterThan(String suffix) {
        regSuffix(CK_GT, fRES(suffix));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * suffix: {VARCHAR(255)}
     * @param suffix The value of suffix as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuffix_LessThan(String suffix) {
        regSuffix(CK_LT, fRES(suffix));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * suffix: {VARCHAR(255)}
     * @param suffix The value of suffix as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuffix_GreaterEqual(String suffix) {
        regSuffix(CK_GE, fRES(suffix));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * suffix: {VARCHAR(255)}
     * @param suffix The value of suffix as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuffix_LessEqual(String suffix) {
        regSuffix(CK_LE, fRES(suffix));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * suffix: {VARCHAR(255)}
     * @param suffixList The collection of suffix as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuffix_InScope(Collection<String> suffixList) {
        doSetSuffix_InScope(suffixList);
    }

    protected void doSetSuffix_InScope(Collection<String> suffixList) {
        regINS(CK_INS, cTL(suffixList), xgetCValueSuffix(), "suffix");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * suffix: {VARCHAR(255)}
     * @param suffixList The collection of suffix as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuffix_NotInScope(Collection<String> suffixList) {
        doSetSuffix_NotInScope(suffixList);
    }

    protected void doSetSuffix_NotInScope(Collection<String> suffixList) {
        regINS(CK_NINS, cTL(suffixList), xgetCValueSuffix(), "suffix");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * suffix: {VARCHAR(255)} <br>
     * <pre>e.g. setSuffix_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param suffix The value of suffix as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSuffix_LikeSearch(String suffix, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSuffix_LikeSearch(suffix, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * suffix: {VARCHAR(255)} <br>
     * <pre>e.g. setSuffix_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param suffix The value of suffix as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setSuffix_LikeSearch(String suffix, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(suffix), xgetCValueSuffix(), "suffix", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * suffix: {VARCHAR(255)}
     * @param suffix The value of suffix as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSuffix_NotLikeSearch(String suffix, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSuffix_NotLikeSearch(suffix, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * suffix: {VARCHAR(255)}
     * @param suffix The value of suffix as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setSuffix_NotLikeSearch(String suffix, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(suffix), xgetCValueSuffix(), "suffix", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * suffix: {VARCHAR(255)}
     */
    public void setSuffix_IsNull() { regSuffix(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * suffix: {VARCHAR(255)}
     */
    public void setSuffix_IsNullOrEmpty() { regSuffix(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * suffix: {VARCHAR(255)}
     */
    public void setSuffix_IsNotNull() { regSuffix(CK_ISNN, DOBJ); }

    protected void regSuffix(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSuffix(), "suffix"); }
    protected abstract ConditionValue xgetCValueSuffix();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_Equal(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GT,  registerDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LT,  registerDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GE,  registerDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LE, registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegisterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "register_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRegisterDatetime(), nm, op);
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterDatetime(), "register_datetime"); }
    protected abstract ConditionValue xgetCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_Equal(String registerTrace) {
        doSetRegisterTrace_Equal(fRES(registerTrace));
    }

    protected void doSetRegisterTrace_Equal(String registerTrace) {
        regRegisterTrace(CK_EQ, registerTrace);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_NotEqual(String registerTrace) {
        doSetRegisterTrace_NotEqual(fRES(registerTrace));
    }

    protected void doSetRegisterTrace_NotEqual(String registerTrace) {
        regRegisterTrace(CK_NES, registerTrace);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_GreaterThan(String registerTrace) {
        regRegisterTrace(CK_GT, fRES(registerTrace));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_LessThan(String registerTrace) {
        regRegisterTrace(CK_LT, fRES(registerTrace));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_GreaterEqual(String registerTrace) {
        regRegisterTrace(CK_GE, fRES(registerTrace));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_LessEqual(String registerTrace) {
        regRegisterTrace(CK_LE, fRES(registerTrace));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @param registerTraceList The collection of registerTrace as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_InScope(Collection<String> registerTraceList) {
        doSetRegisterTrace_InScope(registerTraceList);
    }

    protected void doSetRegisterTrace_InScope(Collection<String> registerTraceList) {
        regINS(CK_INS, cTL(registerTraceList), xgetCValueRegisterTrace(), "register_trace");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @param registerTraceList The collection of registerTrace as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_NotInScope(Collection<String> registerTraceList) {
        doSetRegisterTrace_NotInScope(registerTraceList);
    }

    protected void doSetRegisterTrace_NotInScope(Collection<String> registerTraceList) {
        regINS(CK_NINS, cTL(registerTraceList), xgetCValueRegisterTrace(), "register_trace");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)} <br>
     * <pre>e.g. setRegisterTrace_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param registerTrace The value of registerTrace as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegisterTrace_LikeSearch(String registerTrace, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegisterTrace_LikeSearch(registerTrace, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)} <br>
     * <pre>e.g. setRegisterTrace_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param registerTrace The value of registerTrace as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRegisterTrace_LikeSearch(String registerTrace, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(registerTrace), xgetCValueRegisterTrace(), "register_trace", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegisterTrace_NotLikeSearch(String registerTrace, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegisterTrace_NotLikeSearch(registerTrace, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRegisterTrace_NotLikeSearch(String registerTrace, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(registerTrace), xgetCValueRegisterTrace(), "register_trace", likeSearchOption);
    }

    protected void regRegisterTrace(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterTrace(), "register_trace"); }
    protected abstract ConditionValue xgetCValueRegisterTrace();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_Equal(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GT,  updateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LT,  updateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GE,  updateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LE, updateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdateDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "update_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdateDatetime(), nm, op);
    }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDatetime(), "update_datetime"); }
    protected abstract ConditionValue xgetCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_Equal(String updateTrace) {
        doSetUpdateTrace_Equal(fRES(updateTrace));
    }

    protected void doSetUpdateTrace_Equal(String updateTrace) {
        regUpdateTrace(CK_EQ, updateTrace);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_NotEqual(String updateTrace) {
        doSetUpdateTrace_NotEqual(fRES(updateTrace));
    }

    protected void doSetUpdateTrace_NotEqual(String updateTrace) {
        regUpdateTrace(CK_NES, updateTrace);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_GreaterThan(String updateTrace) {
        regUpdateTrace(CK_GT, fRES(updateTrace));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_LessThan(String updateTrace) {
        regUpdateTrace(CK_LT, fRES(updateTrace));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_GreaterEqual(String updateTrace) {
        regUpdateTrace(CK_GE, fRES(updateTrace));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_LessEqual(String updateTrace) {
        regUpdateTrace(CK_LE, fRES(updateTrace));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @param updateTraceList The collection of updateTrace as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_InScope(Collection<String> updateTraceList) {
        doSetUpdateTrace_InScope(updateTraceList);
    }

    protected void doSetUpdateTrace_InScope(Collection<String> updateTraceList) {
        regINS(CK_INS, cTL(updateTraceList), xgetCValueUpdateTrace(), "update_trace");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @param updateTraceList The collection of updateTrace as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_NotInScope(Collection<String> updateTraceList) {
        doSetUpdateTrace_NotInScope(updateTraceList);
    }

    protected void doSetUpdateTrace_NotInScope(Collection<String> updateTraceList) {
        regINS(CK_NINS, cTL(updateTraceList), xgetCValueUpdateTrace(), "update_trace");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)} <br>
     * <pre>e.g. setUpdateTrace_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param updateTrace The value of updateTrace as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdateTrace_LikeSearch(String updateTrace, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdateTrace_LikeSearch(updateTrace, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)} <br>
     * <pre>e.g. setUpdateTrace_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updateTrace The value of updateTrace as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUpdateTrace_LikeSearch(String updateTrace, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updateTrace), xgetCValueUpdateTrace(), "update_trace", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdateTrace_NotLikeSearch(String updateTrace, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdateTrace_NotLikeSearch(updateTrace, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUpdateTrace_NotLikeSearch(String updateTrace, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updateTrace), xgetCValueUpdateTrace(), "update_trace", likeSearchOption);
    }

    protected void regUpdateTrace(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateTrace(), "update_trace"); }
    protected abstract ConditionValue xgetCValueUpdateTrace();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DbGamePeriodCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, DbGamePeriodCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DbGamePeriodCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, DbGamePeriodCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DbGamePeriodCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, DbGamePeriodCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DbGamePeriodCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, DbGamePeriodCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DbGamePeriodCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, DbGamePeriodCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;DbGamePeriodCB&gt;() {
     *     public void query(DbGamePeriodCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DbGamePeriodCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, DbGamePeriodCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        DbGamePeriodCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(DbGamePeriodCQ sq);

    protected DbGamePeriodCB xcreateScalarConditionCB() {
        DbGamePeriodCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected DbGamePeriodCB xcreateScalarConditionPartitionByCB() {
        DbGamePeriodCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<DbGamePeriodCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbGamePeriodCB cb = new DbGamePeriodCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "game_period_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(DbGamePeriodCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<DbGamePeriodCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(DbGamePeriodCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbGamePeriodCB cb = new DbGamePeriodCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "game_period_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(DbGamePeriodCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<DbGamePeriodCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbGamePeriodCB cb = new DbGamePeriodCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(DbGamePeriodCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected DbGamePeriodCB newMyCB() {
        return new DbGamePeriodCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return DbGamePeriodCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
