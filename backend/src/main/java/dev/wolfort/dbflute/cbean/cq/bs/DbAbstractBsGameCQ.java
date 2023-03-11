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
 * The abstract condition-query of game.
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbAbstractBsGameCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbAbstractBsGameCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "game";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * game_id: {PK, ID, NotNull, INT UNSIGNED(10)}
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
     * game_id: {PK, ID, NotNull, INT UNSIGNED(10)}
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
     * game_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param gameId The value of gameId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameId_GreaterThan(Integer gameId) {
        regGameId(CK_GT, gameId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * game_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param gameId The value of gameId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameId_LessThan(Integer gameId) {
        regGameId(CK_LT, gameId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * game_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param gameId The value of gameId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameId_GreaterEqual(Integer gameId) {
        regGameId(CK_GE, gameId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * game_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param gameId The value of gameId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGameId_LessEqual(Integer gameId) {
        regGameId(CK_LE, gameId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * game_id: {PK, ID, NotNull, INT UNSIGNED(10)}
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
     * game_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of gameId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of gameId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setGameId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGameId(), "game_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * game_id: {PK, ID, NotNull, INT UNSIGNED(10)}
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
     * game_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param gameIdList The collection of gameId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameId_NotInScope(Collection<Integer> gameIdList) {
        doSetGameId_NotInScope(gameIdList);
    }

    protected void doSetGameId_NotInScope(Collection<Integer> gameIdList) {
        regINS(CK_NINS, cTL(gameIdList), xgetCValueGameId(), "game_id");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select game_id from game_period where ...)} <br>
     * game_period by game_id, named 'gamePeriodAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsGamePeriod</span>(periodCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     periodCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of GamePeriodList for 'exists'. (NotNull)
     */
    public void existsGamePeriod(SubQuery<DbGamePeriodCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbGamePeriodCB cb = new DbGamePeriodCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepGameId_ExistsReferrer_GamePeriodList(cb.query());
        registerExistsReferrer(cb.query(), "game_id", "game_id", pp, "gamePeriodList");
    }
    public abstract String keepGameId_ExistsReferrer_GamePeriodList(DbGamePeriodCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select game_id from game_player where ...)} <br>
     * game_player by game_id, named 'gamePlayerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsGamePlayer</span>(playerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     playerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of GamePlayerList for 'exists'. (NotNull)
     */
    public void existsGamePlayer(SubQuery<DbGamePlayerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbGamePlayerCB cb = new DbGamePlayerCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepGameId_ExistsReferrer_GamePlayerList(cb.query());
        registerExistsReferrer(cb.query(), "game_id", "game_id", pp, "gamePlayerList");
    }
    public abstract String keepGameId_ExistsReferrer_GamePlayerList(DbGamePlayerCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select game_id from game_setting where ...)} <br>
     * game_setting by game_id, named 'gameSettingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsGameSetting</span>(settingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     settingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of GameSettingList for 'exists'. (NotNull)
     */
    public void existsGameSetting(SubQuery<DbGameSettingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbGameSettingCB cb = new DbGameSettingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepGameId_ExistsReferrer_GameSettingList(cb.query());
        registerExistsReferrer(cb.query(), "game_id", "game_id", pp, "gameSettingList");
    }
    public abstract String keepGameId_ExistsReferrer_GameSettingList(DbGameSettingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select game_id from message where ...)} <br>
     * message by game_id, named 'messageAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepGameId_ExistsReferrer_MessageList(cb.query());
        registerExistsReferrer(cb.query(), "game_id", "game_id", pp, "messageList");
    }
    public abstract String keepGameId_ExistsReferrer_MessageList(DbMessageCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select game_id from message_reply where ...)} <br>
     * message_reply by game_id, named 'messageReplyAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMessageReply</span>(replyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     replyCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MessageReplyList for 'exists'. (NotNull)
     */
    public void existsMessageReply(SubQuery<DbMessageReplyCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbMessageReplyCB cb = new DbMessageReplyCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepGameId_ExistsReferrer_MessageReplyList(cb.query());
        registerExistsReferrer(cb.query(), "game_id", "game_id", pp, "messageReplyList");
    }
    public abstract String keepGameId_ExistsReferrer_MessageReplyList(DbMessageReplyCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select game_id from message_favorite where ...)} <br>
     * message_favorite by game_id, named 'messageFavoriteAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMessageFavorite</span>(favoriteCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     favoriteCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MessageFavoriteList for 'exists'. (NotNull)
     */
    public void existsMessageFavorite(SubQuery<DbMessageFavoriteCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbMessageFavoriteCB cb = new DbMessageFavoriteCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepGameId_ExistsReferrer_MessageFavoriteList(cb.query());
        registerExistsReferrer(cb.query(), "game_id", "game_id", pp, "messageFavoriteList");
    }
    public abstract String keepGameId_ExistsReferrer_MessageFavoriteList(DbMessageFavoriteCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select game_id from direct_message where ...)} <br>
     * direct_message by game_id, named 'directMessageAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepGameId_ExistsReferrer_DirectMessageList(cb.query());
        registerExistsReferrer(cb.query(), "game_id", "game_id", pp, "directMessageList");
    }
    public abstract String keepGameId_ExistsReferrer_DirectMessageList(DbDirectMessageCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select game_id from game_period where ...)} <br>
     * game_period by game_id, named 'gamePeriodAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsGamePeriod</span>(periodCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     periodCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of GameId_NotExistsReferrer_GamePeriodList for 'not exists'. (NotNull)
     */
    public void notExistsGamePeriod(SubQuery<DbGamePeriodCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbGamePeriodCB cb = new DbGamePeriodCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepGameId_NotExistsReferrer_GamePeriodList(cb.query());
        registerNotExistsReferrer(cb.query(), "game_id", "game_id", pp, "gamePeriodList");
    }
    public abstract String keepGameId_NotExistsReferrer_GamePeriodList(DbGamePeriodCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select game_id from game_player where ...)} <br>
     * game_player by game_id, named 'gamePlayerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsGamePlayer</span>(playerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     playerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of GameId_NotExistsReferrer_GamePlayerList for 'not exists'. (NotNull)
     */
    public void notExistsGamePlayer(SubQuery<DbGamePlayerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbGamePlayerCB cb = new DbGamePlayerCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepGameId_NotExistsReferrer_GamePlayerList(cb.query());
        registerNotExistsReferrer(cb.query(), "game_id", "game_id", pp, "gamePlayerList");
    }
    public abstract String keepGameId_NotExistsReferrer_GamePlayerList(DbGamePlayerCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select game_id from game_setting where ...)} <br>
     * game_setting by game_id, named 'gameSettingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsGameSetting</span>(settingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     settingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of GameId_NotExistsReferrer_GameSettingList for 'not exists'. (NotNull)
     */
    public void notExistsGameSetting(SubQuery<DbGameSettingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbGameSettingCB cb = new DbGameSettingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepGameId_NotExistsReferrer_GameSettingList(cb.query());
        registerNotExistsReferrer(cb.query(), "game_id", "game_id", pp, "gameSettingList");
    }
    public abstract String keepGameId_NotExistsReferrer_GameSettingList(DbGameSettingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select game_id from message where ...)} <br>
     * message by game_id, named 'messageAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMessage</span>(messageCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     messageCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of GameId_NotExistsReferrer_MessageList for 'not exists'. (NotNull)
     */
    public void notExistsMessage(SubQuery<DbMessageCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbMessageCB cb = new DbMessageCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepGameId_NotExistsReferrer_MessageList(cb.query());
        registerNotExistsReferrer(cb.query(), "game_id", "game_id", pp, "messageList");
    }
    public abstract String keepGameId_NotExistsReferrer_MessageList(DbMessageCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select game_id from message_reply where ...)} <br>
     * message_reply by game_id, named 'messageReplyAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMessageReply</span>(replyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     replyCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of GameId_NotExistsReferrer_MessageReplyList for 'not exists'. (NotNull)
     */
    public void notExistsMessageReply(SubQuery<DbMessageReplyCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbMessageReplyCB cb = new DbMessageReplyCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepGameId_NotExistsReferrer_MessageReplyList(cb.query());
        registerNotExistsReferrer(cb.query(), "game_id", "game_id", pp, "messageReplyList");
    }
    public abstract String keepGameId_NotExistsReferrer_MessageReplyList(DbMessageReplyCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select game_id from message_favorite where ...)} <br>
     * message_favorite by game_id, named 'messageFavoriteAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMessageFavorite</span>(favoriteCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     favoriteCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of GameId_NotExistsReferrer_MessageFavoriteList for 'not exists'. (NotNull)
     */
    public void notExistsMessageFavorite(SubQuery<DbMessageFavoriteCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbMessageFavoriteCB cb = new DbMessageFavoriteCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepGameId_NotExistsReferrer_MessageFavoriteList(cb.query());
        registerNotExistsReferrer(cb.query(), "game_id", "game_id", pp, "messageFavoriteList");
    }
    public abstract String keepGameId_NotExistsReferrer_MessageFavoriteList(DbMessageFavoriteCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select game_id from direct_message where ...)} <br>
     * direct_message by game_id, named 'directMessageAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsDirectMessage</span>(messageCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     messageCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of GameId_NotExistsReferrer_DirectMessageList for 'not exists'. (NotNull)
     */
    public void notExistsDirectMessage(SubQuery<DbDirectMessageCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbDirectMessageCB cb = new DbDirectMessageCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepGameId_NotExistsReferrer_DirectMessageList(cb.query());
        registerNotExistsReferrer(cb.query(), "game_id", "game_id", pp, "directMessageList");
    }
    public abstract String keepGameId_NotExistsReferrer_DirectMessageList(DbDirectMessageCQ sq);

    public void xsderiveGamePeriodList(String fn, SubQuery<DbGamePeriodCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbGamePeriodCB cb = new DbGamePeriodCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepGameId_SpecifyDerivedReferrer_GamePeriodList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "game_id", "game_id", pp, "gamePeriodList", al, op);
    }
    public abstract String keepGameId_SpecifyDerivedReferrer_GamePeriodList(DbGamePeriodCQ sq);

    public void xsderiveGamePlayerList(String fn, SubQuery<DbGamePlayerCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbGamePlayerCB cb = new DbGamePlayerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepGameId_SpecifyDerivedReferrer_GamePlayerList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "game_id", "game_id", pp, "gamePlayerList", al, op);
    }
    public abstract String keepGameId_SpecifyDerivedReferrer_GamePlayerList(DbGamePlayerCQ sq);

    public void xsderiveGameSettingList(String fn, SubQuery<DbGameSettingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbGameSettingCB cb = new DbGameSettingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepGameId_SpecifyDerivedReferrer_GameSettingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "game_id", "game_id", pp, "gameSettingList", al, op);
    }
    public abstract String keepGameId_SpecifyDerivedReferrer_GameSettingList(DbGameSettingCQ sq);

    public void xsderiveMessageList(String fn, SubQuery<DbMessageCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbMessageCB cb = new DbMessageCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepGameId_SpecifyDerivedReferrer_MessageList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "game_id", "game_id", pp, "messageList", al, op);
    }
    public abstract String keepGameId_SpecifyDerivedReferrer_MessageList(DbMessageCQ sq);

    public void xsderiveMessageReplyList(String fn, SubQuery<DbMessageReplyCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbMessageReplyCB cb = new DbMessageReplyCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepGameId_SpecifyDerivedReferrer_MessageReplyList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "game_id", "game_id", pp, "messageReplyList", al, op);
    }
    public abstract String keepGameId_SpecifyDerivedReferrer_MessageReplyList(DbMessageReplyCQ sq);

    public void xsderiveMessageFavoriteList(String fn, SubQuery<DbMessageFavoriteCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbMessageFavoriteCB cb = new DbMessageFavoriteCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepGameId_SpecifyDerivedReferrer_MessageFavoriteList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "game_id", "game_id", pp, "messageFavoriteList", al, op);
    }
    public abstract String keepGameId_SpecifyDerivedReferrer_MessageFavoriteList(DbMessageFavoriteCQ sq);

    public void xsderiveDirectMessageList(String fn, SubQuery<DbDirectMessageCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbDirectMessageCB cb = new DbDirectMessageCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepGameId_SpecifyDerivedReferrer_DirectMessageList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "game_id", "game_id", pp, "directMessageList", al, op);
    }
    public abstract String keepGameId_SpecifyDerivedReferrer_DirectMessageList(DbDirectMessageCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from game_period where ...)} <br>
     * game_period by game_id, named 'gamePeriodAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedGamePeriod()</span>.<span style="color: #CC4747">max</span>(periodCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     periodCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     periodCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<DbGamePeriodCB> derivedGamePeriod() {
        return xcreateQDRFunctionGamePeriodList();
    }
    protected HpQDRFunction<DbGamePeriodCB> xcreateQDRFunctionGamePeriodList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveGamePeriodList(fn, sq, rd, vl, op));
    }
    public void xqderiveGamePeriodList(String fn, SubQuery<DbGamePeriodCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbGamePeriodCB cb = new DbGamePeriodCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepGameId_QueryDerivedReferrer_GamePeriodList(cb.query()); String prpp = keepGameId_QueryDerivedReferrer_GamePeriodListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "game_id", "game_id", sqpp, "gamePeriodList", rd, vl, prpp, op);
    }
    public abstract String keepGameId_QueryDerivedReferrer_GamePeriodList(DbGamePeriodCQ sq);
    public abstract String keepGameId_QueryDerivedReferrer_GamePeriodListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from game_player where ...)} <br>
     * game_player by game_id, named 'gamePlayerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedGamePlayer()</span>.<span style="color: #CC4747">max</span>(playerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     playerCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     playerCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<DbGamePlayerCB> derivedGamePlayer() {
        return xcreateQDRFunctionGamePlayerList();
    }
    protected HpQDRFunction<DbGamePlayerCB> xcreateQDRFunctionGamePlayerList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveGamePlayerList(fn, sq, rd, vl, op));
    }
    public void xqderiveGamePlayerList(String fn, SubQuery<DbGamePlayerCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbGamePlayerCB cb = new DbGamePlayerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepGameId_QueryDerivedReferrer_GamePlayerList(cb.query()); String prpp = keepGameId_QueryDerivedReferrer_GamePlayerListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "game_id", "game_id", sqpp, "gamePlayerList", rd, vl, prpp, op);
    }
    public abstract String keepGameId_QueryDerivedReferrer_GamePlayerList(DbGamePlayerCQ sq);
    public abstract String keepGameId_QueryDerivedReferrer_GamePlayerListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from game_setting where ...)} <br>
     * game_setting by game_id, named 'gameSettingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedGameSetting()</span>.<span style="color: #CC4747">max</span>(settingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     settingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     settingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<DbGameSettingCB> derivedGameSetting() {
        return xcreateQDRFunctionGameSettingList();
    }
    protected HpQDRFunction<DbGameSettingCB> xcreateQDRFunctionGameSettingList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveGameSettingList(fn, sq, rd, vl, op));
    }
    public void xqderiveGameSettingList(String fn, SubQuery<DbGameSettingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbGameSettingCB cb = new DbGameSettingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepGameId_QueryDerivedReferrer_GameSettingList(cb.query()); String prpp = keepGameId_QueryDerivedReferrer_GameSettingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "game_id", "game_id", sqpp, "gameSettingList", rd, vl, prpp, op);
    }
    public abstract String keepGameId_QueryDerivedReferrer_GameSettingList(DbGameSettingCQ sq);
    public abstract String keepGameId_QueryDerivedReferrer_GameSettingListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from message where ...)} <br>
     * message by game_id, named 'messageAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepGameId_QueryDerivedReferrer_MessageList(cb.query()); String prpp = keepGameId_QueryDerivedReferrer_MessageListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "game_id", "game_id", sqpp, "messageList", rd, vl, prpp, op);
    }
    public abstract String keepGameId_QueryDerivedReferrer_MessageList(DbMessageCQ sq);
    public abstract String keepGameId_QueryDerivedReferrer_MessageListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from message_reply where ...)} <br>
     * message_reply by game_id, named 'messageReplyAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMessageReply()</span>.<span style="color: #CC4747">max</span>(replyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     replyCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     replyCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<DbMessageReplyCB> derivedMessageReply() {
        return xcreateQDRFunctionMessageReplyList();
    }
    protected HpQDRFunction<DbMessageReplyCB> xcreateQDRFunctionMessageReplyList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMessageReplyList(fn, sq, rd, vl, op));
    }
    public void xqderiveMessageReplyList(String fn, SubQuery<DbMessageReplyCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbMessageReplyCB cb = new DbMessageReplyCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepGameId_QueryDerivedReferrer_MessageReplyList(cb.query()); String prpp = keepGameId_QueryDerivedReferrer_MessageReplyListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "game_id", "game_id", sqpp, "messageReplyList", rd, vl, prpp, op);
    }
    public abstract String keepGameId_QueryDerivedReferrer_MessageReplyList(DbMessageReplyCQ sq);
    public abstract String keepGameId_QueryDerivedReferrer_MessageReplyListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from message_favorite where ...)} <br>
     * message_favorite by game_id, named 'messageFavoriteAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMessageFavorite()</span>.<span style="color: #CC4747">max</span>(favoriteCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     favoriteCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     favoriteCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<DbMessageFavoriteCB> derivedMessageFavorite() {
        return xcreateQDRFunctionMessageFavoriteList();
    }
    protected HpQDRFunction<DbMessageFavoriteCB> xcreateQDRFunctionMessageFavoriteList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMessageFavoriteList(fn, sq, rd, vl, op));
    }
    public void xqderiveMessageFavoriteList(String fn, SubQuery<DbMessageFavoriteCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbMessageFavoriteCB cb = new DbMessageFavoriteCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepGameId_QueryDerivedReferrer_MessageFavoriteList(cb.query()); String prpp = keepGameId_QueryDerivedReferrer_MessageFavoriteListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "game_id", "game_id", sqpp, "messageFavoriteList", rd, vl, prpp, op);
    }
    public abstract String keepGameId_QueryDerivedReferrer_MessageFavoriteList(DbMessageFavoriteCQ sq);
    public abstract String keepGameId_QueryDerivedReferrer_MessageFavoriteListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from direct_message where ...)} <br>
     * direct_message by game_id, named 'directMessageAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepGameId_QueryDerivedReferrer_DirectMessageList(cb.query()); String prpp = keepGameId_QueryDerivedReferrer_DirectMessageListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "game_id", "game_id", sqpp, "directMessageList", rd, vl, prpp, op);
    }
    public abstract String keepGameId_QueryDerivedReferrer_DirectMessageList(DbDirectMessageCQ sq);
    public abstract String keepGameId_QueryDerivedReferrer_DirectMessageListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * game_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setGameId_IsNull() { regGameId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * game_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setGameId_IsNotNull() { regGameId(CK_ISNN, DOBJ); }

    protected void regGameId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGameId(), "game_id"); }
    protected abstract ConditionValue xgetCValueGameId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * game_name: {NotNull, VARCHAR(255)}
     * @param gameName The value of gameName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameName_Equal(String gameName) {
        doSetGameName_Equal(fRES(gameName));
    }

    protected void doSetGameName_Equal(String gameName) {
        regGameName(CK_EQ, gameName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * game_name: {NotNull, VARCHAR(255)}
     * @param gameName The value of gameName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameName_NotEqual(String gameName) {
        doSetGameName_NotEqual(fRES(gameName));
    }

    protected void doSetGameName_NotEqual(String gameName) {
        regGameName(CK_NES, gameName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * game_name: {NotNull, VARCHAR(255)}
     * @param gameName The value of gameName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameName_GreaterThan(String gameName) {
        regGameName(CK_GT, fRES(gameName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * game_name: {NotNull, VARCHAR(255)}
     * @param gameName The value of gameName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameName_LessThan(String gameName) {
        regGameName(CK_LT, fRES(gameName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * game_name: {NotNull, VARCHAR(255)}
     * @param gameName The value of gameName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameName_GreaterEqual(String gameName) {
        regGameName(CK_GE, fRES(gameName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * game_name: {NotNull, VARCHAR(255)}
     * @param gameName The value of gameName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameName_LessEqual(String gameName) {
        regGameName(CK_LE, fRES(gameName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * game_name: {NotNull, VARCHAR(255)}
     * @param gameNameList The collection of gameName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameName_InScope(Collection<String> gameNameList) {
        doSetGameName_InScope(gameNameList);
    }

    protected void doSetGameName_InScope(Collection<String> gameNameList) {
        regINS(CK_INS, cTL(gameNameList), xgetCValueGameName(), "game_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * game_name: {NotNull, VARCHAR(255)}
     * @param gameNameList The collection of gameName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGameName_NotInScope(Collection<String> gameNameList) {
        doSetGameName_NotInScope(gameNameList);
    }

    protected void doSetGameName_NotInScope(Collection<String> gameNameList) {
        regINS(CK_NINS, cTL(gameNameList), xgetCValueGameName(), "game_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * game_name: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setGameName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param gameName The value of gameName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGameName_LikeSearch(String gameName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGameName_LikeSearch(gameName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * game_name: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setGameName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param gameName The value of gameName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setGameName_LikeSearch(String gameName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(gameName), xgetCValueGameName(), "game_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * game_name: {NotNull, VARCHAR(255)}
     * @param gameName The value of gameName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGameName_NotLikeSearch(String gameName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGameName_NotLikeSearch(gameName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * game_name: {NotNull, VARCHAR(255)}
     * @param gameName The value of gameName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setGameName_NotLikeSearch(String gameName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(gameName), xgetCValueGameName(), "game_name", likeSearchOption);
    }

    protected void regGameName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGameName(), "game_name"); }
    protected abstract ConditionValue xgetCValueGameName();

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
    public HpSLCFunction<DbGameCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, DbGameCB.class);
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
    public HpSLCFunction<DbGameCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, DbGameCB.class);
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
    public HpSLCFunction<DbGameCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, DbGameCB.class);
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
    public HpSLCFunction<DbGameCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, DbGameCB.class);
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
    public HpSLCFunction<DbGameCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, DbGameCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;DbGameCB&gt;() {
     *     public void query(DbGameCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DbGameCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, DbGameCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        DbGameCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(DbGameCQ sq);

    protected DbGameCB xcreateScalarConditionCB() {
        DbGameCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected DbGameCB xcreateScalarConditionPartitionByCB() {
        DbGameCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<DbGameCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbGameCB cb = new DbGameCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "game_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(DbGameCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<DbGameCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(DbGameCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbGameCB cb = new DbGameCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "game_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(DbGameCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<DbGameCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbGameCB cb = new DbGameCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(DbGameCQ sq);

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
    protected DbGameCB newMyCB() {
        return new DbGameCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return DbGameCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
