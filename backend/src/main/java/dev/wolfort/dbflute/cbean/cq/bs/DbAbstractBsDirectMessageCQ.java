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
 * The abstract condition-query of direct_message.
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbAbstractBsDirectMessageCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbAbstractBsDirectMessageCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "direct_message";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * direct_message_id: {PK, ID, NotNull, BIGINT(19)}
     * @param directMessageId The value of directMessageId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectMessageId_Equal(Long directMessageId) {
        doSetDirectMessageId_Equal(directMessageId);
    }

    protected void doSetDirectMessageId_Equal(Long directMessageId) {
        regDirectMessageId(CK_EQ, directMessageId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * direct_message_id: {PK, ID, NotNull, BIGINT(19)}
     * @param directMessageId The value of directMessageId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectMessageId_NotEqual(Long directMessageId) {
        doSetDirectMessageId_NotEqual(directMessageId);
    }

    protected void doSetDirectMessageId_NotEqual(Long directMessageId) {
        regDirectMessageId(CK_NES, directMessageId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * direct_message_id: {PK, ID, NotNull, BIGINT(19)}
     * @param directMessageId The value of directMessageId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectMessageId_GreaterThan(Long directMessageId) {
        regDirectMessageId(CK_GT, directMessageId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * direct_message_id: {PK, ID, NotNull, BIGINT(19)}
     * @param directMessageId The value of directMessageId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectMessageId_LessThan(Long directMessageId) {
        regDirectMessageId(CK_LT, directMessageId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * direct_message_id: {PK, ID, NotNull, BIGINT(19)}
     * @param directMessageId The value of directMessageId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectMessageId_GreaterEqual(Long directMessageId) {
        regDirectMessageId(CK_GE, directMessageId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * direct_message_id: {PK, ID, NotNull, BIGINT(19)}
     * @param directMessageId The value of directMessageId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectMessageId_LessEqual(Long directMessageId) {
        regDirectMessageId(CK_LE, directMessageId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * direct_message_id: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of directMessageId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of directMessageId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDirectMessageId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDirectMessageId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * direct_message_id: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of directMessageId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of directMessageId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDirectMessageId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDirectMessageId(), "direct_message_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * direct_message_id: {PK, ID, NotNull, BIGINT(19)}
     * @param directMessageIdList The collection of directMessageId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectMessageId_InScope(Collection<Long> directMessageIdList) {
        doSetDirectMessageId_InScope(directMessageIdList);
    }

    protected void doSetDirectMessageId_InScope(Collection<Long> directMessageIdList) {
        regINS(CK_INS, cTL(directMessageIdList), xgetCValueDirectMessageId(), "direct_message_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * direct_message_id: {PK, ID, NotNull, BIGINT(19)}
     * @param directMessageIdList The collection of directMessageId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectMessageId_NotInScope(Collection<Long> directMessageIdList) {
        doSetDirectMessageId_NotInScope(directMessageIdList);
    }

    protected void doSetDirectMessageId_NotInScope(Collection<Long> directMessageIdList) {
        regINS(CK_NINS, cTL(directMessageIdList), xgetCValueDirectMessageId(), "direct_message_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * direct_message_id: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setDirectMessageId_IsNull() { regDirectMessageId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * direct_message_id: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setDirectMessageId_IsNotNull() { regDirectMessageId(CK_ISNN, DOBJ); }

    protected void regDirectMessageId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDirectMessageId(), "direct_message_id"); }
    protected abstract ConditionValue xgetCValueDirectMessageId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * game_id: {PK, UQ+, NotNull, INT UNSIGNED(10), FK to game}
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
     * game_id: {PK, UQ+, NotNull, INT UNSIGNED(10), FK to game}
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
     * game_id: {PK, UQ+, NotNull, INT UNSIGNED(10), FK to game}
     * @param gameId The value of gameId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameId_GreaterThan(Integer gameId) {
        regGameId(CK_GT, gameId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * game_id: {PK, UQ+, NotNull, INT UNSIGNED(10), FK to game}
     * @param gameId The value of gameId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameId_LessThan(Integer gameId) {
        regGameId(CK_LT, gameId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * game_id: {PK, UQ+, NotNull, INT UNSIGNED(10), FK to game}
     * @param gameId The value of gameId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameId_GreaterEqual(Integer gameId) {
        regGameId(CK_GE, gameId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * game_id: {PK, UQ+, NotNull, INT UNSIGNED(10), FK to game}
     * @param gameId The value of gameId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameId_LessEqual(Integer gameId) {
        regGameId(CK_LE, gameId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * game_id: {PK, UQ+, NotNull, INT UNSIGNED(10), FK to game}
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
     * game_id: {PK, UQ+, NotNull, INT UNSIGNED(10), FK to game}
     * @param minNumber The min number of gameId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of gameId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setGameId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGameId(), "game_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * game_id: {PK, UQ+, NotNull, INT UNSIGNED(10), FK to game}
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
     * game_id: {PK, UQ+, NotNull, INT UNSIGNED(10), FK to game}
     * @param gameIdList The collection of gameId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameId_NotInScope(Collection<Integer> gameIdList) {
        doSetGameId_NotInScope(gameIdList);
    }

    protected void doSetGameId_NotInScope(Collection<Integer> gameIdList) {
        regINS(CK_NINS, cTL(gameIdList), xgetCValueGameId(), "game_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * game_id: {PK, UQ+, NotNull, INT UNSIGNED(10), FK to game}
     */
    public void setGameId_IsNull() { regGameId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * game_id: {PK, UQ+, NotNull, INT UNSIGNED(10), FK to game}
     */
    public void setGameId_IsNotNull() { regGameId(CK_ISNN, DOBJ); }

    protected void regGameId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGameId(), "game_id"); }
    protected abstract ConditionValue xgetCValueGameId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * game_player_group_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to game_player_group}
     * @param gamePlayerGroupId The value of gamePlayerGroupId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGamePlayerGroupId_Equal(Integer gamePlayerGroupId) {
        doSetGamePlayerGroupId_Equal(gamePlayerGroupId);
    }

    protected void doSetGamePlayerGroupId_Equal(Integer gamePlayerGroupId) {
        regGamePlayerGroupId(CK_EQ, gamePlayerGroupId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * game_player_group_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to game_player_group}
     * @param gamePlayerGroupId The value of gamePlayerGroupId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGamePlayerGroupId_NotEqual(Integer gamePlayerGroupId) {
        doSetGamePlayerGroupId_NotEqual(gamePlayerGroupId);
    }

    protected void doSetGamePlayerGroupId_NotEqual(Integer gamePlayerGroupId) {
        regGamePlayerGroupId(CK_NES, gamePlayerGroupId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * game_player_group_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to game_player_group}
     * @param gamePlayerGroupId The value of gamePlayerGroupId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGamePlayerGroupId_GreaterThan(Integer gamePlayerGroupId) {
        regGamePlayerGroupId(CK_GT, gamePlayerGroupId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * game_player_group_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to game_player_group}
     * @param gamePlayerGroupId The value of gamePlayerGroupId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGamePlayerGroupId_LessThan(Integer gamePlayerGroupId) {
        regGamePlayerGroupId(CK_LT, gamePlayerGroupId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * game_player_group_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to game_player_group}
     * @param gamePlayerGroupId The value of gamePlayerGroupId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGamePlayerGroupId_GreaterEqual(Integer gamePlayerGroupId) {
        regGamePlayerGroupId(CK_GE, gamePlayerGroupId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * game_player_group_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to game_player_group}
     * @param gamePlayerGroupId The value of gamePlayerGroupId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGamePlayerGroupId_LessEqual(Integer gamePlayerGroupId) {
        regGamePlayerGroupId(CK_LE, gamePlayerGroupId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * game_player_group_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to game_player_group}
     * @param minNumber The min number of gamePlayerGroupId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of gamePlayerGroupId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setGamePlayerGroupId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setGamePlayerGroupId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * game_player_group_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to game_player_group}
     * @param minNumber The min number of gamePlayerGroupId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of gamePlayerGroupId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setGamePlayerGroupId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGamePlayerGroupId(), "game_player_group_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * game_player_group_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to game_player_group}
     * @param gamePlayerGroupIdList The collection of gamePlayerGroupId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGamePlayerGroupId_InScope(Collection<Integer> gamePlayerGroupIdList) {
        doSetGamePlayerGroupId_InScope(gamePlayerGroupIdList);
    }

    protected void doSetGamePlayerGroupId_InScope(Collection<Integer> gamePlayerGroupIdList) {
        regINS(CK_INS, cTL(gamePlayerGroupIdList), xgetCValueGamePlayerGroupId(), "game_player_group_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * game_player_group_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to game_player_group}
     * @param gamePlayerGroupIdList The collection of gamePlayerGroupId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGamePlayerGroupId_NotInScope(Collection<Integer> gamePlayerGroupIdList) {
        doSetGamePlayerGroupId_NotInScope(gamePlayerGroupIdList);
    }

    protected void doSetGamePlayerGroupId_NotInScope(Collection<Integer> gamePlayerGroupIdList) {
        regINS(CK_NINS, cTL(gamePlayerGroupIdList), xgetCValueGamePlayerGroupId(), "game_player_group_id");
    }

    protected void regGamePlayerGroupId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGamePlayerGroupId(), "game_player_group_id"); }
    protected abstract ConditionValue xgetCValueGamePlayerGroupId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * game_period_id: {IX, NotNull, INT UNSIGNED(10), FK to game_period}
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
     * game_period_id: {IX, NotNull, INT UNSIGNED(10), FK to game_period}
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
     * game_period_id: {IX, NotNull, INT UNSIGNED(10), FK to game_period}
     * @param gamePeriodId The value of gamePeriodId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGamePeriodId_GreaterThan(Integer gamePeriodId) {
        regGamePeriodId(CK_GT, gamePeriodId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * game_period_id: {IX, NotNull, INT UNSIGNED(10), FK to game_period}
     * @param gamePeriodId The value of gamePeriodId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGamePeriodId_LessThan(Integer gamePeriodId) {
        regGamePeriodId(CK_LT, gamePeriodId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * game_period_id: {IX, NotNull, INT UNSIGNED(10), FK to game_period}
     * @param gamePeriodId The value of gamePeriodId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGamePeriodId_GreaterEqual(Integer gamePeriodId) {
        regGamePeriodId(CK_GE, gamePeriodId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * game_period_id: {IX, NotNull, INT UNSIGNED(10), FK to game_period}
     * @param gamePeriodId The value of gamePeriodId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGamePeriodId_LessEqual(Integer gamePeriodId) {
        regGamePeriodId(CK_LE, gamePeriodId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * game_period_id: {IX, NotNull, INT UNSIGNED(10), FK to game_period}
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
     * game_period_id: {IX, NotNull, INT UNSIGNED(10), FK to game_period}
     * @param minNumber The min number of gamePeriodId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of gamePeriodId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setGamePeriodId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGamePeriodId(), "game_period_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * game_period_id: {IX, NotNull, INT UNSIGNED(10), FK to game_period}
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
     * game_period_id: {IX, NotNull, INT UNSIGNED(10), FK to game_period}
     * @param gamePeriodIdList The collection of gamePeriodId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGamePeriodId_NotInScope(Collection<Integer> gamePeriodIdList) {
        doSetGamePeriodId_NotInScope(gamePeriodIdList);
    }

    protected void doSetGamePeriodId_NotInScope(Collection<Integer> gamePeriodIdList) {
        regINS(CK_NINS, cTL(gamePeriodIdList), xgetCValueGamePeriodId(), "game_period_id");
    }

    protected void regGamePeriodId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGamePeriodId(), "game_period_id"); }
    protected abstract ConditionValue xgetCValueGamePeriodId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * from_game_player_id: {IX, INT UNSIGNED(10), FK to game_player}
     * @param fromGamePlayerId The value of fromGamePlayerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromGamePlayerId_Equal(Integer fromGamePlayerId) {
        doSetFromGamePlayerId_Equal(fromGamePlayerId);
    }

    protected void doSetFromGamePlayerId_Equal(Integer fromGamePlayerId) {
        regFromGamePlayerId(CK_EQ, fromGamePlayerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * from_game_player_id: {IX, INT UNSIGNED(10), FK to game_player}
     * @param fromGamePlayerId The value of fromGamePlayerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromGamePlayerId_NotEqual(Integer fromGamePlayerId) {
        doSetFromGamePlayerId_NotEqual(fromGamePlayerId);
    }

    protected void doSetFromGamePlayerId_NotEqual(Integer fromGamePlayerId) {
        regFromGamePlayerId(CK_NES, fromGamePlayerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * from_game_player_id: {IX, INT UNSIGNED(10), FK to game_player}
     * @param fromGamePlayerId The value of fromGamePlayerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromGamePlayerId_GreaterThan(Integer fromGamePlayerId) {
        regFromGamePlayerId(CK_GT, fromGamePlayerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * from_game_player_id: {IX, INT UNSIGNED(10), FK to game_player}
     * @param fromGamePlayerId The value of fromGamePlayerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromGamePlayerId_LessThan(Integer fromGamePlayerId) {
        regFromGamePlayerId(CK_LT, fromGamePlayerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * from_game_player_id: {IX, INT UNSIGNED(10), FK to game_player}
     * @param fromGamePlayerId The value of fromGamePlayerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromGamePlayerId_GreaterEqual(Integer fromGamePlayerId) {
        regFromGamePlayerId(CK_GE, fromGamePlayerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * from_game_player_id: {IX, INT UNSIGNED(10), FK to game_player}
     * @param fromGamePlayerId The value of fromGamePlayerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromGamePlayerId_LessEqual(Integer fromGamePlayerId) {
        regFromGamePlayerId(CK_LE, fromGamePlayerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * from_game_player_id: {IX, INT UNSIGNED(10), FK to game_player}
     * @param minNumber The min number of fromGamePlayerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fromGamePlayerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setFromGamePlayerId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setFromGamePlayerId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * from_game_player_id: {IX, INT UNSIGNED(10), FK to game_player}
     * @param minNumber The min number of fromGamePlayerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fromGamePlayerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setFromGamePlayerId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFromGamePlayerId(), "from_game_player_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * from_game_player_id: {IX, INT UNSIGNED(10), FK to game_player}
     * @param fromGamePlayerIdList The collection of fromGamePlayerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromGamePlayerId_InScope(Collection<Integer> fromGamePlayerIdList) {
        doSetFromGamePlayerId_InScope(fromGamePlayerIdList);
    }

    protected void doSetFromGamePlayerId_InScope(Collection<Integer> fromGamePlayerIdList) {
        regINS(CK_INS, cTL(fromGamePlayerIdList), xgetCValueFromGamePlayerId(), "from_game_player_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * from_game_player_id: {IX, INT UNSIGNED(10), FK to game_player}
     * @param fromGamePlayerIdList The collection of fromGamePlayerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromGamePlayerId_NotInScope(Collection<Integer> fromGamePlayerIdList) {
        doSetFromGamePlayerId_NotInScope(fromGamePlayerIdList);
    }

    protected void doSetFromGamePlayerId_NotInScope(Collection<Integer> fromGamePlayerIdList) {
        regINS(CK_NINS, cTL(fromGamePlayerIdList), xgetCValueFromGamePlayerId(), "from_game_player_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * from_game_player_id: {IX, INT UNSIGNED(10), FK to game_player}
     */
    public void setFromGamePlayerId_IsNull() { regFromGamePlayerId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * from_game_player_id: {IX, INT UNSIGNED(10), FK to game_player}
     */
    public void setFromGamePlayerId_IsNotNull() { regFromGamePlayerId(CK_ISNN, DOBJ); }

    protected void regFromGamePlayerId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromGamePlayerId(), "from_game_player_id"); }
    protected abstract ConditionValue xgetCValueFromGamePlayerId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * from_game_player_name: {VARCHAR(255)}
     * @param fromGamePlayerName The value of fromGamePlayerName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromGamePlayerName_Equal(String fromGamePlayerName) {
        doSetFromGamePlayerName_Equal(fRES(fromGamePlayerName));
    }

    protected void doSetFromGamePlayerName_Equal(String fromGamePlayerName) {
        regFromGamePlayerName(CK_EQ, fromGamePlayerName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * from_game_player_name: {VARCHAR(255)}
     * @param fromGamePlayerName The value of fromGamePlayerName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromGamePlayerName_NotEqual(String fromGamePlayerName) {
        doSetFromGamePlayerName_NotEqual(fRES(fromGamePlayerName));
    }

    protected void doSetFromGamePlayerName_NotEqual(String fromGamePlayerName) {
        regFromGamePlayerName(CK_NES, fromGamePlayerName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * from_game_player_name: {VARCHAR(255)}
     * @param fromGamePlayerName The value of fromGamePlayerName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromGamePlayerName_GreaterThan(String fromGamePlayerName) {
        regFromGamePlayerName(CK_GT, fRES(fromGamePlayerName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * from_game_player_name: {VARCHAR(255)}
     * @param fromGamePlayerName The value of fromGamePlayerName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromGamePlayerName_LessThan(String fromGamePlayerName) {
        regFromGamePlayerName(CK_LT, fRES(fromGamePlayerName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * from_game_player_name: {VARCHAR(255)}
     * @param fromGamePlayerName The value of fromGamePlayerName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromGamePlayerName_GreaterEqual(String fromGamePlayerName) {
        regFromGamePlayerName(CK_GE, fRES(fromGamePlayerName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * from_game_player_name: {VARCHAR(255)}
     * @param fromGamePlayerName The value of fromGamePlayerName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromGamePlayerName_LessEqual(String fromGamePlayerName) {
        regFromGamePlayerName(CK_LE, fRES(fromGamePlayerName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * from_game_player_name: {VARCHAR(255)}
     * @param fromGamePlayerNameList The collection of fromGamePlayerName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromGamePlayerName_InScope(Collection<String> fromGamePlayerNameList) {
        doSetFromGamePlayerName_InScope(fromGamePlayerNameList);
    }

    protected void doSetFromGamePlayerName_InScope(Collection<String> fromGamePlayerNameList) {
        regINS(CK_INS, cTL(fromGamePlayerNameList), xgetCValueFromGamePlayerName(), "from_game_player_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * from_game_player_name: {VARCHAR(255)}
     * @param fromGamePlayerNameList The collection of fromGamePlayerName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromGamePlayerName_NotInScope(Collection<String> fromGamePlayerNameList) {
        doSetFromGamePlayerName_NotInScope(fromGamePlayerNameList);
    }

    protected void doSetFromGamePlayerName_NotInScope(Collection<String> fromGamePlayerNameList) {
        regINS(CK_NINS, cTL(fromGamePlayerNameList), xgetCValueFromGamePlayerName(), "from_game_player_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * from_game_player_name: {VARCHAR(255)} <br>
     * <pre>e.g. setFromGamePlayerName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param fromGamePlayerName The value of fromGamePlayerName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFromGamePlayerName_LikeSearch(String fromGamePlayerName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFromGamePlayerName_LikeSearch(fromGamePlayerName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * from_game_player_name: {VARCHAR(255)} <br>
     * <pre>e.g. setFromGamePlayerName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fromGamePlayerName The value of fromGamePlayerName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setFromGamePlayerName_LikeSearch(String fromGamePlayerName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fromGamePlayerName), xgetCValueFromGamePlayerName(), "from_game_player_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * from_game_player_name: {VARCHAR(255)}
     * @param fromGamePlayerName The value of fromGamePlayerName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFromGamePlayerName_NotLikeSearch(String fromGamePlayerName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFromGamePlayerName_NotLikeSearch(fromGamePlayerName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * from_game_player_name: {VARCHAR(255)}
     * @param fromGamePlayerName The value of fromGamePlayerName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setFromGamePlayerName_NotLikeSearch(String fromGamePlayerName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fromGamePlayerName), xgetCValueFromGamePlayerName(), "from_game_player_name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * from_game_player_name: {VARCHAR(255)}
     */
    public void setFromGamePlayerName_IsNull() { regFromGamePlayerName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * from_game_player_name: {VARCHAR(255)}
     */
    public void setFromGamePlayerName_IsNullOrEmpty() { regFromGamePlayerName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * from_game_player_name: {VARCHAR(255)}
     */
    public void setFromGamePlayerName_IsNotNull() { regFromGamePlayerName(CK_ISNN, DOBJ); }

    protected void regFromGamePlayerName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromGamePlayerName(), "from_game_player_name"); }
    protected abstract ConditionValue xgetCValueFromGamePlayerName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * from_game_player_face_type_code: {VARCHAR(255)}
     * @param fromGamePlayerFaceTypeCode The value of fromGamePlayerFaceTypeCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromGamePlayerFaceTypeCode_Equal(String fromGamePlayerFaceTypeCode) {
        doSetFromGamePlayerFaceTypeCode_Equal(fRES(fromGamePlayerFaceTypeCode));
    }

    protected void doSetFromGamePlayerFaceTypeCode_Equal(String fromGamePlayerFaceTypeCode) {
        regFromGamePlayerFaceTypeCode(CK_EQ, fromGamePlayerFaceTypeCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * from_game_player_face_type_code: {VARCHAR(255)}
     * @param fromGamePlayerFaceTypeCode The value of fromGamePlayerFaceTypeCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromGamePlayerFaceTypeCode_NotEqual(String fromGamePlayerFaceTypeCode) {
        doSetFromGamePlayerFaceTypeCode_NotEqual(fRES(fromGamePlayerFaceTypeCode));
    }

    protected void doSetFromGamePlayerFaceTypeCode_NotEqual(String fromGamePlayerFaceTypeCode) {
        regFromGamePlayerFaceTypeCode(CK_NES, fromGamePlayerFaceTypeCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * from_game_player_face_type_code: {VARCHAR(255)}
     * @param fromGamePlayerFaceTypeCode The value of fromGamePlayerFaceTypeCode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromGamePlayerFaceTypeCode_GreaterThan(String fromGamePlayerFaceTypeCode) {
        regFromGamePlayerFaceTypeCode(CK_GT, fRES(fromGamePlayerFaceTypeCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * from_game_player_face_type_code: {VARCHAR(255)}
     * @param fromGamePlayerFaceTypeCode The value of fromGamePlayerFaceTypeCode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromGamePlayerFaceTypeCode_LessThan(String fromGamePlayerFaceTypeCode) {
        regFromGamePlayerFaceTypeCode(CK_LT, fRES(fromGamePlayerFaceTypeCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * from_game_player_face_type_code: {VARCHAR(255)}
     * @param fromGamePlayerFaceTypeCode The value of fromGamePlayerFaceTypeCode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromGamePlayerFaceTypeCode_GreaterEqual(String fromGamePlayerFaceTypeCode) {
        regFromGamePlayerFaceTypeCode(CK_GE, fRES(fromGamePlayerFaceTypeCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * from_game_player_face_type_code: {VARCHAR(255)}
     * @param fromGamePlayerFaceTypeCode The value of fromGamePlayerFaceTypeCode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromGamePlayerFaceTypeCode_LessEqual(String fromGamePlayerFaceTypeCode) {
        regFromGamePlayerFaceTypeCode(CK_LE, fRES(fromGamePlayerFaceTypeCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * from_game_player_face_type_code: {VARCHAR(255)}
     * @param fromGamePlayerFaceTypeCodeList The collection of fromGamePlayerFaceTypeCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromGamePlayerFaceTypeCode_InScope(Collection<String> fromGamePlayerFaceTypeCodeList) {
        doSetFromGamePlayerFaceTypeCode_InScope(fromGamePlayerFaceTypeCodeList);
    }

    protected void doSetFromGamePlayerFaceTypeCode_InScope(Collection<String> fromGamePlayerFaceTypeCodeList) {
        regINS(CK_INS, cTL(fromGamePlayerFaceTypeCodeList), xgetCValueFromGamePlayerFaceTypeCode(), "from_game_player_face_type_code");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * from_game_player_face_type_code: {VARCHAR(255)}
     * @param fromGamePlayerFaceTypeCodeList The collection of fromGamePlayerFaceTypeCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromGamePlayerFaceTypeCode_NotInScope(Collection<String> fromGamePlayerFaceTypeCodeList) {
        doSetFromGamePlayerFaceTypeCode_NotInScope(fromGamePlayerFaceTypeCodeList);
    }

    protected void doSetFromGamePlayerFaceTypeCode_NotInScope(Collection<String> fromGamePlayerFaceTypeCodeList) {
        regINS(CK_NINS, cTL(fromGamePlayerFaceTypeCodeList), xgetCValueFromGamePlayerFaceTypeCode(), "from_game_player_face_type_code");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * from_game_player_face_type_code: {VARCHAR(255)} <br>
     * <pre>e.g. setFromGamePlayerFaceTypeCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param fromGamePlayerFaceTypeCode The value of fromGamePlayerFaceTypeCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFromGamePlayerFaceTypeCode_LikeSearch(String fromGamePlayerFaceTypeCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFromGamePlayerFaceTypeCode_LikeSearch(fromGamePlayerFaceTypeCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * from_game_player_face_type_code: {VARCHAR(255)} <br>
     * <pre>e.g. setFromGamePlayerFaceTypeCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fromGamePlayerFaceTypeCode The value of fromGamePlayerFaceTypeCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setFromGamePlayerFaceTypeCode_LikeSearch(String fromGamePlayerFaceTypeCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fromGamePlayerFaceTypeCode), xgetCValueFromGamePlayerFaceTypeCode(), "from_game_player_face_type_code", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * from_game_player_face_type_code: {VARCHAR(255)}
     * @param fromGamePlayerFaceTypeCode The value of fromGamePlayerFaceTypeCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFromGamePlayerFaceTypeCode_NotLikeSearch(String fromGamePlayerFaceTypeCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFromGamePlayerFaceTypeCode_NotLikeSearch(fromGamePlayerFaceTypeCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * from_game_player_face_type_code: {VARCHAR(255)}
     * @param fromGamePlayerFaceTypeCode The value of fromGamePlayerFaceTypeCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setFromGamePlayerFaceTypeCode_NotLikeSearch(String fromGamePlayerFaceTypeCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fromGamePlayerFaceTypeCode), xgetCValueFromGamePlayerFaceTypeCode(), "from_game_player_face_type_code", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * from_game_player_face_type_code: {VARCHAR(255)}
     */
    public void setFromGamePlayerFaceTypeCode_IsNull() { regFromGamePlayerFaceTypeCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * from_game_player_face_type_code: {VARCHAR(255)}
     */
    public void setFromGamePlayerFaceTypeCode_IsNullOrEmpty() { regFromGamePlayerFaceTypeCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * from_game_player_face_type_code: {VARCHAR(255)}
     */
    public void setFromGamePlayerFaceTypeCode_IsNotNull() { regFromGamePlayerFaceTypeCode(CK_ISNN, DOBJ); }

    protected void regFromGamePlayerFaceTypeCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromGamePlayerFaceTypeCode(), "from_game_player_face_type_code"); }
    protected abstract ConditionValue xgetCValueFromGamePlayerFaceTypeCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * message_content: {VARCHAR(10000)}
     * @param messageContent The value of messageContent as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageContent_Equal(String messageContent) {
        doSetMessageContent_Equal(fRES(messageContent));
    }

    protected void doSetMessageContent_Equal(String messageContent) {
        regMessageContent(CK_EQ, messageContent);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * message_content: {VARCHAR(10000)}
     * @param messageContent The value of messageContent as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageContent_NotEqual(String messageContent) {
        doSetMessageContent_NotEqual(fRES(messageContent));
    }

    protected void doSetMessageContent_NotEqual(String messageContent) {
        regMessageContent(CK_NES, messageContent);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * message_content: {VARCHAR(10000)}
     * @param messageContent The value of messageContent as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageContent_GreaterThan(String messageContent) {
        regMessageContent(CK_GT, fRES(messageContent));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * message_content: {VARCHAR(10000)}
     * @param messageContent The value of messageContent as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageContent_LessThan(String messageContent) {
        regMessageContent(CK_LT, fRES(messageContent));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * message_content: {VARCHAR(10000)}
     * @param messageContent The value of messageContent as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageContent_GreaterEqual(String messageContent) {
        regMessageContent(CK_GE, fRES(messageContent));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * message_content: {VARCHAR(10000)}
     * @param messageContent The value of messageContent as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageContent_LessEqual(String messageContent) {
        regMessageContent(CK_LE, fRES(messageContent));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * message_content: {VARCHAR(10000)}
     * @param messageContentList The collection of messageContent as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageContent_InScope(Collection<String> messageContentList) {
        doSetMessageContent_InScope(messageContentList);
    }

    protected void doSetMessageContent_InScope(Collection<String> messageContentList) {
        regINS(CK_INS, cTL(messageContentList), xgetCValueMessageContent(), "message_content");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * message_content: {VARCHAR(10000)}
     * @param messageContentList The collection of messageContent as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageContent_NotInScope(Collection<String> messageContentList) {
        doSetMessageContent_NotInScope(messageContentList);
    }

    protected void doSetMessageContent_NotInScope(Collection<String> messageContentList) {
        regINS(CK_NINS, cTL(messageContentList), xgetCValueMessageContent(), "message_content");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * message_content: {VARCHAR(10000)} <br>
     * <pre>e.g. setMessageContent_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param messageContent The value of messageContent as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMessageContent_LikeSearch(String messageContent, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMessageContent_LikeSearch(messageContent, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * message_content: {VARCHAR(10000)} <br>
     * <pre>e.g. setMessageContent_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param messageContent The value of messageContent as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setMessageContent_LikeSearch(String messageContent, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(messageContent), xgetCValueMessageContent(), "message_content", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * message_content: {VARCHAR(10000)}
     * @param messageContent The value of messageContent as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMessageContent_NotLikeSearch(String messageContent, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMessageContent_NotLikeSearch(messageContent, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * message_content: {VARCHAR(10000)}
     * @param messageContent The value of messageContent as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setMessageContent_NotLikeSearch(String messageContent, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(messageContent), xgetCValueMessageContent(), "message_content", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * message_content: {VARCHAR(10000)}
     */
    public void setMessageContent_IsNull() { regMessageContent(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * message_content: {VARCHAR(10000)}
     */
    public void setMessageContent_IsNullOrEmpty() { regMessageContent(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * message_content: {VARCHAR(10000)}
     */
    public void setMessageContent_IsNotNull() { regMessageContent(CK_ISNN, DOBJ); }

    protected void regMessageContent(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMessageContent(), "message_content"); }
    protected abstract ConditionValue xgetCValueMessageContent();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * message_number: {+UQ, INT UNSIGNED(10)}
     * @param messageNumber The value of messageNumber as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageNumber_Equal(Integer messageNumber) {
        doSetMessageNumber_Equal(messageNumber);
    }

    protected void doSetMessageNumber_Equal(Integer messageNumber) {
        regMessageNumber(CK_EQ, messageNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * message_number: {+UQ, INT UNSIGNED(10)}
     * @param messageNumber The value of messageNumber as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageNumber_NotEqual(Integer messageNumber) {
        doSetMessageNumber_NotEqual(messageNumber);
    }

    protected void doSetMessageNumber_NotEqual(Integer messageNumber) {
        regMessageNumber(CK_NES, messageNumber);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * message_number: {+UQ, INT UNSIGNED(10)}
     * @param messageNumber The value of messageNumber as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageNumber_GreaterThan(Integer messageNumber) {
        regMessageNumber(CK_GT, messageNumber);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * message_number: {+UQ, INT UNSIGNED(10)}
     * @param messageNumber The value of messageNumber as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageNumber_LessThan(Integer messageNumber) {
        regMessageNumber(CK_LT, messageNumber);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * message_number: {+UQ, INT UNSIGNED(10)}
     * @param messageNumber The value of messageNumber as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageNumber_GreaterEqual(Integer messageNumber) {
        regMessageNumber(CK_GE, messageNumber);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * message_number: {+UQ, INT UNSIGNED(10)}
     * @param messageNumber The value of messageNumber as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageNumber_LessEqual(Integer messageNumber) {
        regMessageNumber(CK_LE, messageNumber);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * message_number: {+UQ, INT UNSIGNED(10)}
     * @param minNumber The min number of messageNumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of messageNumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMessageNumber_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMessageNumber_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * message_number: {+UQ, INT UNSIGNED(10)}
     * @param minNumber The min number of messageNumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of messageNumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMessageNumber_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMessageNumber(), "message_number", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * message_number: {+UQ, INT UNSIGNED(10)}
     * @param messageNumberList The collection of messageNumber as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageNumber_InScope(Collection<Integer> messageNumberList) {
        doSetMessageNumber_InScope(messageNumberList);
    }

    protected void doSetMessageNumber_InScope(Collection<Integer> messageNumberList) {
        regINS(CK_INS, cTL(messageNumberList), xgetCValueMessageNumber(), "message_number");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * message_number: {+UQ, INT UNSIGNED(10)}
     * @param messageNumberList The collection of messageNumber as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageNumber_NotInScope(Collection<Integer> messageNumberList) {
        doSetMessageNumber_NotInScope(messageNumberList);
    }

    protected void doSetMessageNumber_NotInScope(Collection<Integer> messageNumberList) {
        regINS(CK_NINS, cTL(messageNumberList), xgetCValueMessageNumber(), "message_number");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * message_number: {+UQ, INT UNSIGNED(10)}
     */
    public void setMessageNumber_IsNull() { regMessageNumber(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * message_number: {+UQ, INT UNSIGNED(10)}
     */
    public void setMessageNumber_IsNotNull() { regMessageNumber(CK_ISNN, DOBJ); }

    protected void regMessageNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMessageNumber(), "message_number"); }
    protected abstract ConditionValue xgetCValueMessageNumber();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * message_datetime: {NotNull, DATETIME(19)}
     * @param messageDatetime The value of messageDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageDatetime_Equal(java.time.LocalDateTime messageDatetime) {
        regMessageDatetime(CK_EQ,  messageDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * message_datetime: {NotNull, DATETIME(19)}
     * @param messageDatetime The value of messageDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageDatetime_GreaterThan(java.time.LocalDateTime messageDatetime) {
        regMessageDatetime(CK_GT,  messageDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * message_datetime: {NotNull, DATETIME(19)}
     * @param messageDatetime The value of messageDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageDatetime_LessThan(java.time.LocalDateTime messageDatetime) {
        regMessageDatetime(CK_LT,  messageDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * message_datetime: {NotNull, DATETIME(19)}
     * @param messageDatetime The value of messageDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageDatetime_GreaterEqual(java.time.LocalDateTime messageDatetime) {
        regMessageDatetime(CK_GE,  messageDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * message_datetime: {NotNull, DATETIME(19)}
     * @param messageDatetime The value of messageDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageDatetime_LessEqual(java.time.LocalDateTime messageDatetime) {
        regMessageDatetime(CK_LE, messageDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * message_datetime: {NotNull, DATETIME(19)}
     * <pre>e.g. setMessageDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of messageDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of messageDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setMessageDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setMessageDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * message_datetime: {NotNull, DATETIME(19)}
     * <pre>e.g. setMessageDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of messageDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of messageDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setMessageDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "message_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueMessageDatetime(), nm, op);
    }

    protected void regMessageDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMessageDatetime(), "message_datetime"); }
    protected abstract ConditionValue xgetCValueMessageDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * message_unix_timestamp_milli: {NotNull, BIGINT UNSIGNED(20)}
     * @param messageUnixTimestampMilli The value of messageUnixTimestampMilli as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageUnixTimestampMilli_Equal(Long messageUnixTimestampMilli) {
        doSetMessageUnixTimestampMilli_Equal(messageUnixTimestampMilli);
    }

    protected void doSetMessageUnixTimestampMilli_Equal(Long messageUnixTimestampMilli) {
        regMessageUnixTimestampMilli(CK_EQ, messageUnixTimestampMilli);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * message_unix_timestamp_milli: {NotNull, BIGINT UNSIGNED(20)}
     * @param messageUnixTimestampMilli The value of messageUnixTimestampMilli as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageUnixTimestampMilli_NotEqual(Long messageUnixTimestampMilli) {
        doSetMessageUnixTimestampMilli_NotEqual(messageUnixTimestampMilli);
    }

    protected void doSetMessageUnixTimestampMilli_NotEqual(Long messageUnixTimestampMilli) {
        regMessageUnixTimestampMilli(CK_NES, messageUnixTimestampMilli);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * message_unix_timestamp_milli: {NotNull, BIGINT UNSIGNED(20)}
     * @param messageUnixTimestampMilli The value of messageUnixTimestampMilli as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageUnixTimestampMilli_GreaterThan(Long messageUnixTimestampMilli) {
        regMessageUnixTimestampMilli(CK_GT, messageUnixTimestampMilli);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * message_unix_timestamp_milli: {NotNull, BIGINT UNSIGNED(20)}
     * @param messageUnixTimestampMilli The value of messageUnixTimestampMilli as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageUnixTimestampMilli_LessThan(Long messageUnixTimestampMilli) {
        regMessageUnixTimestampMilli(CK_LT, messageUnixTimestampMilli);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * message_unix_timestamp_milli: {NotNull, BIGINT UNSIGNED(20)}
     * @param messageUnixTimestampMilli The value of messageUnixTimestampMilli as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageUnixTimestampMilli_GreaterEqual(Long messageUnixTimestampMilli) {
        regMessageUnixTimestampMilli(CK_GE, messageUnixTimestampMilli);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * message_unix_timestamp_milli: {NotNull, BIGINT UNSIGNED(20)}
     * @param messageUnixTimestampMilli The value of messageUnixTimestampMilli as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageUnixTimestampMilli_LessEqual(Long messageUnixTimestampMilli) {
        regMessageUnixTimestampMilli(CK_LE, messageUnixTimestampMilli);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * message_unix_timestamp_milli: {NotNull, BIGINT UNSIGNED(20)}
     * @param minNumber The min number of messageUnixTimestampMilli. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of messageUnixTimestampMilli. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMessageUnixTimestampMilli_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMessageUnixTimestampMilli_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * message_unix_timestamp_milli: {NotNull, BIGINT UNSIGNED(20)}
     * @param minNumber The min number of messageUnixTimestampMilli. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of messageUnixTimestampMilli. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMessageUnixTimestampMilli_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMessageUnixTimestampMilli(), "message_unix_timestamp_milli", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * message_unix_timestamp_milli: {NotNull, BIGINT UNSIGNED(20)}
     * @param messageUnixTimestampMilliList The collection of messageUnixTimestampMilli as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageUnixTimestampMilli_InScope(Collection<Long> messageUnixTimestampMilliList) {
        doSetMessageUnixTimestampMilli_InScope(messageUnixTimestampMilliList);
    }

    protected void doSetMessageUnixTimestampMilli_InScope(Collection<Long> messageUnixTimestampMilliList) {
        regINS(CK_INS, cTL(messageUnixTimestampMilliList), xgetCValueMessageUnixTimestampMilli(), "message_unix_timestamp_milli");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * message_unix_timestamp_milli: {NotNull, BIGINT UNSIGNED(20)}
     * @param messageUnixTimestampMilliList The collection of messageUnixTimestampMilli as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageUnixTimestampMilli_NotInScope(Collection<Long> messageUnixTimestampMilliList) {
        doSetMessageUnixTimestampMilli_NotInScope(messageUnixTimestampMilliList);
    }

    protected void doSetMessageUnixTimestampMilli_NotInScope(Collection<Long> messageUnixTimestampMilliList) {
        regINS(CK_NINS, cTL(messageUnixTimestampMilliList), xgetCValueMessageUnixTimestampMilli(), "message_unix_timestamp_milli");
    }

    protected void regMessageUnixTimestampMilli(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMessageUnixTimestampMilli(), "message_unix_timestamp_milli"); }
    protected abstract ConditionValue xgetCValueMessageUnixTimestampMilli();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * is_deleted: {NotNull, BIT}
     * @param isDeleted The value of isDeleted as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setIsDeleted_Equal(Boolean isDeleted) {
        regIsDeleted(CK_EQ, isDeleted);
    }

    protected void regIsDeleted(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIsDeleted(), "is_deleted"); }
    protected abstract ConditionValue xgetCValueIsDeleted();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * is_convert_disable: {NotNull, BIT}
     * @param isConvertDisable The value of isConvertDisable as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setIsConvertDisable_Equal(Boolean isConvertDisable) {
        regIsConvertDisable(CK_EQ, isConvertDisable);
    }

    protected void regIsConvertDisable(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIsConvertDisable(), "is_convert_disable"); }
    protected abstract ConditionValue xgetCValueIsConvertDisable();

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
    public HpSLCFunction<DbDirectMessageCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, DbDirectMessageCB.class);
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
    public HpSLCFunction<DbDirectMessageCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, DbDirectMessageCB.class);
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
    public HpSLCFunction<DbDirectMessageCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, DbDirectMessageCB.class);
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
    public HpSLCFunction<DbDirectMessageCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, DbDirectMessageCB.class);
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
    public HpSLCFunction<DbDirectMessageCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, DbDirectMessageCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;DbDirectMessageCB&gt;() {
     *     public void query(DbDirectMessageCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DbDirectMessageCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, DbDirectMessageCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        DbDirectMessageCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(DbDirectMessageCQ sq);

    protected DbDirectMessageCB xcreateScalarConditionCB() {
        DbDirectMessageCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected DbDirectMessageCB xcreateScalarConditionPartitionByCB() {
        DbDirectMessageCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

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
    protected DbDirectMessageCB newMyCB() {
        return new DbDirectMessageCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return DbDirectMessageCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
