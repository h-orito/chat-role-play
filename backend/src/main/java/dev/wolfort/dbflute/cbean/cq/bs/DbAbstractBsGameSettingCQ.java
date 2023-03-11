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
 * The abstract condition-query of game_setting.
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbAbstractBsGameSettingCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbAbstractBsGameSettingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "game_setting";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * game_setting_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param gameSettingId The value of gameSettingId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameSettingId_Equal(Integer gameSettingId) {
        doSetGameSettingId_Equal(gameSettingId);
    }

    protected void doSetGameSettingId_Equal(Integer gameSettingId) {
        regGameSettingId(CK_EQ, gameSettingId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * game_setting_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param gameSettingId The value of gameSettingId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameSettingId_NotEqual(Integer gameSettingId) {
        doSetGameSettingId_NotEqual(gameSettingId);
    }

    protected void doSetGameSettingId_NotEqual(Integer gameSettingId) {
        regGameSettingId(CK_NES, gameSettingId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * game_setting_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param gameSettingId The value of gameSettingId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameSettingId_GreaterThan(Integer gameSettingId) {
        regGameSettingId(CK_GT, gameSettingId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * game_setting_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param gameSettingId The value of gameSettingId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameSettingId_LessThan(Integer gameSettingId) {
        regGameSettingId(CK_LT, gameSettingId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * game_setting_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param gameSettingId The value of gameSettingId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameSettingId_GreaterEqual(Integer gameSettingId) {
        regGameSettingId(CK_GE, gameSettingId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * game_setting_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param gameSettingId The value of gameSettingId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameSettingId_LessEqual(Integer gameSettingId) {
        regGameSettingId(CK_LE, gameSettingId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * game_setting_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of gameSettingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of gameSettingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setGameSettingId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setGameSettingId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * game_setting_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of gameSettingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of gameSettingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setGameSettingId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGameSettingId(), "game_setting_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * game_setting_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param gameSettingIdList The collection of gameSettingId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameSettingId_InScope(Collection<Integer> gameSettingIdList) {
        doSetGameSettingId_InScope(gameSettingIdList);
    }

    protected void doSetGameSettingId_InScope(Collection<Integer> gameSettingIdList) {
        regINS(CK_INS, cTL(gameSettingIdList), xgetCValueGameSettingId(), "game_setting_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * game_setting_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param gameSettingIdList The collection of gameSettingId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameSettingId_NotInScope(Collection<Integer> gameSettingIdList) {
        doSetGameSettingId_NotInScope(gameSettingIdList);
    }

    protected void doSetGameSettingId_NotInScope(Collection<Integer> gameSettingIdList) {
        regINS(CK_NINS, cTL(gameSettingIdList), xgetCValueGameSettingId(), "game_setting_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * game_setting_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setGameSettingId_IsNull() { regGameSettingId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * game_setting_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setGameSettingId_IsNotNull() { regGameSettingId(CK_ISNN, DOBJ); }

    protected void regGameSettingId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGameSettingId(), "game_setting_id"); }
    protected abstract ConditionValue xgetCValueGameSettingId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * game_id: {IX, NotNull, INT UNSIGNED(10), FK to game}
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
     * game_id: {IX, NotNull, INT UNSIGNED(10), FK to game}
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
     * game_id: {IX, NotNull, INT UNSIGNED(10), FK to game}
     * @param gameId The value of gameId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameId_GreaterThan(Integer gameId) {
        regGameId(CK_GT, gameId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * game_id: {IX, NotNull, INT UNSIGNED(10), FK to game}
     * @param gameId The value of gameId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameId_LessThan(Integer gameId) {
        regGameId(CK_LT, gameId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * game_id: {IX, NotNull, INT UNSIGNED(10), FK to game}
     * @param gameId The value of gameId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameId_GreaterEqual(Integer gameId) {
        regGameId(CK_GE, gameId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * game_id: {IX, NotNull, INT UNSIGNED(10), FK to game}
     * @param gameId The value of gameId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameId_LessEqual(Integer gameId) {
        regGameId(CK_LE, gameId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * game_id: {IX, NotNull, INT UNSIGNED(10), FK to game}
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
     * game_id: {IX, NotNull, INT UNSIGNED(10), FK to game}
     * @param minNumber The min number of gameId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of gameId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setGameId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGameId(), "game_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * game_id: {IX, NotNull, INT UNSIGNED(10), FK to game}
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
     * game_id: {IX, NotNull, INT UNSIGNED(10), FK to game}
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * game_setting_item_code: {NotNull, VARCHAR(255)}
     * @param gameSettingItemCode The value of gameSettingItemCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameSettingItemCode_Equal(String gameSettingItemCode) {
        doSetGameSettingItemCode_Equal(fRES(gameSettingItemCode));
    }

    protected void doSetGameSettingItemCode_Equal(String gameSettingItemCode) {
        regGameSettingItemCode(CK_EQ, gameSettingItemCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * game_setting_item_code: {NotNull, VARCHAR(255)}
     * @param gameSettingItemCode The value of gameSettingItemCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameSettingItemCode_NotEqual(String gameSettingItemCode) {
        doSetGameSettingItemCode_NotEqual(fRES(gameSettingItemCode));
    }

    protected void doSetGameSettingItemCode_NotEqual(String gameSettingItemCode) {
        regGameSettingItemCode(CK_NES, gameSettingItemCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * game_setting_item_code: {NotNull, VARCHAR(255)}
     * @param gameSettingItemCode The value of gameSettingItemCode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameSettingItemCode_GreaterThan(String gameSettingItemCode) {
        regGameSettingItemCode(CK_GT, fRES(gameSettingItemCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * game_setting_item_code: {NotNull, VARCHAR(255)}
     * @param gameSettingItemCode The value of gameSettingItemCode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameSettingItemCode_LessThan(String gameSettingItemCode) {
        regGameSettingItemCode(CK_LT, fRES(gameSettingItemCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * game_setting_item_code: {NotNull, VARCHAR(255)}
     * @param gameSettingItemCode The value of gameSettingItemCode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameSettingItemCode_GreaterEqual(String gameSettingItemCode) {
        regGameSettingItemCode(CK_GE, fRES(gameSettingItemCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * game_setting_item_code: {NotNull, VARCHAR(255)}
     * @param gameSettingItemCode The value of gameSettingItemCode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameSettingItemCode_LessEqual(String gameSettingItemCode) {
        regGameSettingItemCode(CK_LE, fRES(gameSettingItemCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * game_setting_item_code: {NotNull, VARCHAR(255)}
     * @param gameSettingItemCodeList The collection of gameSettingItemCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameSettingItemCode_InScope(Collection<String> gameSettingItemCodeList) {
        doSetGameSettingItemCode_InScope(gameSettingItemCodeList);
    }

    protected void doSetGameSettingItemCode_InScope(Collection<String> gameSettingItemCodeList) {
        regINS(CK_INS, cTL(gameSettingItemCodeList), xgetCValueGameSettingItemCode(), "game_setting_item_code");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * game_setting_item_code: {NotNull, VARCHAR(255)}
     * @param gameSettingItemCodeList The collection of gameSettingItemCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameSettingItemCode_NotInScope(Collection<String> gameSettingItemCodeList) {
        doSetGameSettingItemCode_NotInScope(gameSettingItemCodeList);
    }

    protected void doSetGameSettingItemCode_NotInScope(Collection<String> gameSettingItemCodeList) {
        regINS(CK_NINS, cTL(gameSettingItemCodeList), xgetCValueGameSettingItemCode(), "game_setting_item_code");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * game_setting_item_code: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setGameSettingItemCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param gameSettingItemCode The value of gameSettingItemCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGameSettingItemCode_LikeSearch(String gameSettingItemCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGameSettingItemCode_LikeSearch(gameSettingItemCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * game_setting_item_code: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setGameSettingItemCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param gameSettingItemCode The value of gameSettingItemCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setGameSettingItemCode_LikeSearch(String gameSettingItemCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(gameSettingItemCode), xgetCValueGameSettingItemCode(), "game_setting_item_code", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * game_setting_item_code: {NotNull, VARCHAR(255)}
     * @param gameSettingItemCode The value of gameSettingItemCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGameSettingItemCode_NotLikeSearch(String gameSettingItemCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGameSettingItemCode_NotLikeSearch(gameSettingItemCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * game_setting_item_code: {NotNull, VARCHAR(255)}
     * @param gameSettingItemCode The value of gameSettingItemCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setGameSettingItemCode_NotLikeSearch(String gameSettingItemCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(gameSettingItemCode), xgetCValueGameSettingItemCode(), "game_setting_item_code", likeSearchOption);
    }

    protected void regGameSettingItemCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGameSettingItemCode(), "game_setting_item_code"); }
    protected abstract ConditionValue xgetCValueGameSettingItemCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * game_setting_item_value: {NotNull, VARCHAR(1000)}
     * @param gameSettingItemValue The value of gameSettingItemValue as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameSettingItemValue_Equal(String gameSettingItemValue) {
        doSetGameSettingItemValue_Equal(fRES(gameSettingItemValue));
    }

    protected void doSetGameSettingItemValue_Equal(String gameSettingItemValue) {
        regGameSettingItemValue(CK_EQ, gameSettingItemValue);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * game_setting_item_value: {NotNull, VARCHAR(1000)}
     * @param gameSettingItemValue The value of gameSettingItemValue as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameSettingItemValue_NotEqual(String gameSettingItemValue) {
        doSetGameSettingItemValue_NotEqual(fRES(gameSettingItemValue));
    }

    protected void doSetGameSettingItemValue_NotEqual(String gameSettingItemValue) {
        regGameSettingItemValue(CK_NES, gameSettingItemValue);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * game_setting_item_value: {NotNull, VARCHAR(1000)}
     * @param gameSettingItemValue The value of gameSettingItemValue as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameSettingItemValue_GreaterThan(String gameSettingItemValue) {
        regGameSettingItemValue(CK_GT, fRES(gameSettingItemValue));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * game_setting_item_value: {NotNull, VARCHAR(1000)}
     * @param gameSettingItemValue The value of gameSettingItemValue as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameSettingItemValue_LessThan(String gameSettingItemValue) {
        regGameSettingItemValue(CK_LT, fRES(gameSettingItemValue));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * game_setting_item_value: {NotNull, VARCHAR(1000)}
     * @param gameSettingItemValue The value of gameSettingItemValue as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameSettingItemValue_GreaterEqual(String gameSettingItemValue) {
        regGameSettingItemValue(CK_GE, fRES(gameSettingItemValue));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * game_setting_item_value: {NotNull, VARCHAR(1000)}
     * @param gameSettingItemValue The value of gameSettingItemValue as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameSettingItemValue_LessEqual(String gameSettingItemValue) {
        regGameSettingItemValue(CK_LE, fRES(gameSettingItemValue));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * game_setting_item_value: {NotNull, VARCHAR(1000)}
     * @param gameSettingItemValueList The collection of gameSettingItemValue as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameSettingItemValue_InScope(Collection<String> gameSettingItemValueList) {
        doSetGameSettingItemValue_InScope(gameSettingItemValueList);
    }

    protected void doSetGameSettingItemValue_InScope(Collection<String> gameSettingItemValueList) {
        regINS(CK_INS, cTL(gameSettingItemValueList), xgetCValueGameSettingItemValue(), "game_setting_item_value");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * game_setting_item_value: {NotNull, VARCHAR(1000)}
     * @param gameSettingItemValueList The collection of gameSettingItemValue as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameSettingItemValue_NotInScope(Collection<String> gameSettingItemValueList) {
        doSetGameSettingItemValue_NotInScope(gameSettingItemValueList);
    }

    protected void doSetGameSettingItemValue_NotInScope(Collection<String> gameSettingItemValueList) {
        regINS(CK_NINS, cTL(gameSettingItemValueList), xgetCValueGameSettingItemValue(), "game_setting_item_value");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * game_setting_item_value: {NotNull, VARCHAR(1000)} <br>
     * <pre>e.g. setGameSettingItemValue_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param gameSettingItemValue The value of gameSettingItemValue as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGameSettingItemValue_LikeSearch(String gameSettingItemValue, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGameSettingItemValue_LikeSearch(gameSettingItemValue, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * game_setting_item_value: {NotNull, VARCHAR(1000)} <br>
     * <pre>e.g. setGameSettingItemValue_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param gameSettingItemValue The value of gameSettingItemValue as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setGameSettingItemValue_LikeSearch(String gameSettingItemValue, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(gameSettingItemValue), xgetCValueGameSettingItemValue(), "game_setting_item_value", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * game_setting_item_value: {NotNull, VARCHAR(1000)}
     * @param gameSettingItemValue The value of gameSettingItemValue as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGameSettingItemValue_NotLikeSearch(String gameSettingItemValue, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGameSettingItemValue_NotLikeSearch(gameSettingItemValue, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * game_setting_item_value: {NotNull, VARCHAR(1000)}
     * @param gameSettingItemValue The value of gameSettingItemValue as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setGameSettingItemValue_NotLikeSearch(String gameSettingItemValue, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(gameSettingItemValue), xgetCValueGameSettingItemValue(), "game_setting_item_value", likeSearchOption);
    }

    protected void regGameSettingItemValue(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGameSettingItemValue(), "game_setting_item_value"); }
    protected abstract ConditionValue xgetCValueGameSettingItemValue();

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
    public HpSLCFunction<DbGameSettingCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, DbGameSettingCB.class);
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
    public HpSLCFunction<DbGameSettingCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, DbGameSettingCB.class);
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
    public HpSLCFunction<DbGameSettingCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, DbGameSettingCB.class);
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
    public HpSLCFunction<DbGameSettingCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, DbGameSettingCB.class);
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
    public HpSLCFunction<DbGameSettingCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, DbGameSettingCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;DbGameSettingCB&gt;() {
     *     public void query(DbGameSettingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DbGameSettingCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, DbGameSettingCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        DbGameSettingCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(DbGameSettingCQ sq);

    protected DbGameSettingCB xcreateScalarConditionCB() {
        DbGameSettingCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected DbGameSettingCB xcreateScalarConditionPartitionByCB() {
        DbGameSettingCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<DbGameSettingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbGameSettingCB cb = new DbGameSettingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "game_setting_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(DbGameSettingCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<DbGameSettingCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(DbGameSettingCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbGameSettingCB cb = new DbGameSettingCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "game_setting_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(DbGameSettingCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<DbGameSettingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbGameSettingCB cb = new DbGameSettingCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(DbGameSettingCQ sq);

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
    protected DbGameSettingCB newMyCB() {
        return new DbGameSettingCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return DbGameSettingCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
