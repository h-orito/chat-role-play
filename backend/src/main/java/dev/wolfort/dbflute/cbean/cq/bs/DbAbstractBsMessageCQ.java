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
 * The abstract condition-query of message.
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbAbstractBsMessageCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbAbstractBsMessageCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "message";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * message_id: {PK, ID, NotNull, BIGINT(19)}
     * @param messageId The value of messageId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageId_Equal(Long messageId) {
        doSetMessageId_Equal(messageId);
    }

    protected void doSetMessageId_Equal(Long messageId) {
        regMessageId(CK_EQ, messageId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * message_id: {PK, ID, NotNull, BIGINT(19)}
     * @param messageId The value of messageId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageId_NotEqual(Long messageId) {
        doSetMessageId_NotEqual(messageId);
    }

    protected void doSetMessageId_NotEqual(Long messageId) {
        regMessageId(CK_NES, messageId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * message_id: {PK, ID, NotNull, BIGINT(19)}
     * @param messageId The value of messageId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageId_GreaterThan(Long messageId) {
        regMessageId(CK_GT, messageId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * message_id: {PK, ID, NotNull, BIGINT(19)}
     * @param messageId The value of messageId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageId_LessThan(Long messageId) {
        regMessageId(CK_LT, messageId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * message_id: {PK, ID, NotNull, BIGINT(19)}
     * @param messageId The value of messageId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageId_GreaterEqual(Long messageId) {
        regMessageId(CK_GE, messageId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * message_id: {PK, ID, NotNull, BIGINT(19)}
     * @param messageId The value of messageId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageId_LessEqual(Long messageId) {
        regMessageId(CK_LE, messageId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * message_id: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of messageId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of messageId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMessageId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMessageId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * message_id: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of messageId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of messageId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMessageId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMessageId(), "message_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * message_id: {PK, ID, NotNull, BIGINT(19)}
     * @param messageIdList The collection of messageId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageId_InScope(Collection<Long> messageIdList) {
        doSetMessageId_InScope(messageIdList);
    }

    protected void doSetMessageId_InScope(Collection<Long> messageIdList) {
        regINS(CK_INS, cTL(messageIdList), xgetCValueMessageId(), "message_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * message_id: {PK, ID, NotNull, BIGINT(19)}
     * @param messageIdList The collection of messageId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageId_NotInScope(Collection<Long> messageIdList) {
        doSetMessageId_NotInScope(messageIdList);
    }

    protected void doSetMessageId_NotInScope(Collection<Long> messageIdList) {
        regINS(CK_NINS, cTL(messageIdList), xgetCValueMessageId(), "message_id");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select from_message_id from message_reply where ...)} <br>
     * message_reply by from_message_id, named 'messageReplyByFromMessageIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMessageReplyByFromMessageId</span>(replyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     replyCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MessageReplyByFromMessageIdList for 'exists'. (NotNull)
     */
    public void existsMessageReplyByFromMessageId(SubQuery<DbMessageReplyCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbMessageReplyCB cb = new DbMessageReplyCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMessageId_ExistsReferrer_MessageReplyByFromMessageIdList(cb.query());
        registerExistsReferrer(cb.query(), "message_id", "from_message_id", pp, "messageReplyByFromMessageIdList");
    }
    public abstract String keepMessageId_ExistsReferrer_MessageReplyByFromMessageIdList(DbMessageReplyCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select reply_message_id from message_reply where ...)} <br>
     * message_reply by reply_message_id, named 'messageReplyByReplyMessageIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMessageReplyByReplyMessageId</span>(replyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     replyCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MessageReplyByReplyMessageIdList for 'exists'. (NotNull)
     */
    public void existsMessageReplyByReplyMessageId(SubQuery<DbMessageReplyCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbMessageReplyCB cb = new DbMessageReplyCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMessageId_ExistsReferrer_MessageReplyByReplyMessageIdList(cb.query());
        registerExistsReferrer(cb.query(), "message_id", "reply_message_id", pp, "messageReplyByReplyMessageIdList");
    }
    public abstract String keepMessageId_ExistsReferrer_MessageReplyByReplyMessageIdList(DbMessageReplyCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select message_id from message_favorite where ...)} <br>
     * message_favorite by message_id, named 'messageFavoriteAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMessageId_ExistsReferrer_MessageFavoriteList(cb.query());
        registerExistsReferrer(cb.query(), "message_id", "message_id", pp, "messageFavoriteList");
    }
    public abstract String keepMessageId_ExistsReferrer_MessageFavoriteList(DbMessageFavoriteCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select from_message_id from message_reply where ...)} <br>
     * message_reply by from_message_id, named 'messageReplyByFromMessageIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMessageReplyByFromMessageId</span>(replyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     replyCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MessageId_NotExistsReferrer_MessageReplyByFromMessageIdList for 'not exists'. (NotNull)
     */
    public void notExistsMessageReplyByFromMessageId(SubQuery<DbMessageReplyCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbMessageReplyCB cb = new DbMessageReplyCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMessageId_NotExistsReferrer_MessageReplyByFromMessageIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "message_id", "from_message_id", pp, "messageReplyByFromMessageIdList");
    }
    public abstract String keepMessageId_NotExistsReferrer_MessageReplyByFromMessageIdList(DbMessageReplyCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select reply_message_id from message_reply where ...)} <br>
     * message_reply by reply_message_id, named 'messageReplyByReplyMessageIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMessageReplyByReplyMessageId</span>(replyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     replyCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MessageId_NotExistsReferrer_MessageReplyByReplyMessageIdList for 'not exists'. (NotNull)
     */
    public void notExistsMessageReplyByReplyMessageId(SubQuery<DbMessageReplyCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbMessageReplyCB cb = new DbMessageReplyCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMessageId_NotExistsReferrer_MessageReplyByReplyMessageIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "message_id", "reply_message_id", pp, "messageReplyByReplyMessageIdList");
    }
    public abstract String keepMessageId_NotExistsReferrer_MessageReplyByReplyMessageIdList(DbMessageReplyCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select message_id from message_favorite where ...)} <br>
     * message_favorite by message_id, named 'messageFavoriteAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMessageFavorite</span>(favoriteCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     favoriteCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MessageId_NotExistsReferrer_MessageFavoriteList for 'not exists'. (NotNull)
     */
    public void notExistsMessageFavorite(SubQuery<DbMessageFavoriteCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbMessageFavoriteCB cb = new DbMessageFavoriteCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMessageId_NotExistsReferrer_MessageFavoriteList(cb.query());
        registerNotExistsReferrer(cb.query(), "message_id", "message_id", pp, "messageFavoriteList");
    }
    public abstract String keepMessageId_NotExistsReferrer_MessageFavoriteList(DbMessageFavoriteCQ sq);

    public void xsderiveMessageReplyByFromMessageIdList(String fn, SubQuery<DbMessageReplyCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbMessageReplyCB cb = new DbMessageReplyCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMessageId_SpecifyDerivedReferrer_MessageReplyByFromMessageIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "message_id", "from_message_id", pp, "messageReplyByFromMessageIdList", al, op);
    }
    public abstract String keepMessageId_SpecifyDerivedReferrer_MessageReplyByFromMessageIdList(DbMessageReplyCQ sq);

    public void xsderiveMessageReplyByReplyMessageIdList(String fn, SubQuery<DbMessageReplyCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbMessageReplyCB cb = new DbMessageReplyCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMessageId_SpecifyDerivedReferrer_MessageReplyByReplyMessageIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "message_id", "reply_message_id", pp, "messageReplyByReplyMessageIdList", al, op);
    }
    public abstract String keepMessageId_SpecifyDerivedReferrer_MessageReplyByReplyMessageIdList(DbMessageReplyCQ sq);

    public void xsderiveMessageFavoriteList(String fn, SubQuery<DbMessageFavoriteCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbMessageFavoriteCB cb = new DbMessageFavoriteCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMessageId_SpecifyDerivedReferrer_MessageFavoriteList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "message_id", "message_id", pp, "messageFavoriteList", al, op);
    }
    public abstract String keepMessageId_SpecifyDerivedReferrer_MessageFavoriteList(DbMessageFavoriteCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from message_reply where ...)} <br>
     * message_reply by from_message_id, named 'messageReplyByFromMessageIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMessageReplyByFromMessageId()</span>.<span style="color: #CC4747">max</span>(replyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     replyCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     replyCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<DbMessageReplyCB> derivedMessageReplyByFromMessageId() {
        return xcreateQDRFunctionMessageReplyByFromMessageIdList();
    }
    protected HpQDRFunction<DbMessageReplyCB> xcreateQDRFunctionMessageReplyByFromMessageIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMessageReplyByFromMessageIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveMessageReplyByFromMessageIdList(String fn, SubQuery<DbMessageReplyCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbMessageReplyCB cb = new DbMessageReplyCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMessageId_QueryDerivedReferrer_MessageReplyByFromMessageIdList(cb.query()); String prpp = keepMessageId_QueryDerivedReferrer_MessageReplyByFromMessageIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "message_id", "from_message_id", sqpp, "messageReplyByFromMessageIdList", rd, vl, prpp, op);
    }
    public abstract String keepMessageId_QueryDerivedReferrer_MessageReplyByFromMessageIdList(DbMessageReplyCQ sq);
    public abstract String keepMessageId_QueryDerivedReferrer_MessageReplyByFromMessageIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from message_reply where ...)} <br>
     * message_reply by reply_message_id, named 'messageReplyByReplyMessageIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMessageReplyByReplyMessageId()</span>.<span style="color: #CC4747">max</span>(replyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     replyCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     replyCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<DbMessageReplyCB> derivedMessageReplyByReplyMessageId() {
        return xcreateQDRFunctionMessageReplyByReplyMessageIdList();
    }
    protected HpQDRFunction<DbMessageReplyCB> xcreateQDRFunctionMessageReplyByReplyMessageIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMessageReplyByReplyMessageIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveMessageReplyByReplyMessageIdList(String fn, SubQuery<DbMessageReplyCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbMessageReplyCB cb = new DbMessageReplyCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMessageId_QueryDerivedReferrer_MessageReplyByReplyMessageIdList(cb.query()); String prpp = keepMessageId_QueryDerivedReferrer_MessageReplyByReplyMessageIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "message_id", "reply_message_id", sqpp, "messageReplyByReplyMessageIdList", rd, vl, prpp, op);
    }
    public abstract String keepMessageId_QueryDerivedReferrer_MessageReplyByReplyMessageIdList(DbMessageReplyCQ sq);
    public abstract String keepMessageId_QueryDerivedReferrer_MessageReplyByReplyMessageIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from message_favorite where ...)} <br>
     * message_favorite by message_id, named 'messageFavoriteAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepMessageId_QueryDerivedReferrer_MessageFavoriteList(cb.query()); String prpp = keepMessageId_QueryDerivedReferrer_MessageFavoriteListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "message_id", "message_id", sqpp, "messageFavoriteList", rd, vl, prpp, op);
    }
    public abstract String keepMessageId_QueryDerivedReferrer_MessageFavoriteList(DbMessageFavoriteCQ sq);
    public abstract String keepMessageId_QueryDerivedReferrer_MessageFavoriteListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * message_id: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setMessageId_IsNull() { regMessageId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * message_id: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setMessageId_IsNotNull() { regMessageId(CK_ISNN, DOBJ); }

    protected void regMessageId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMessageId(), "message_id"); }
    protected abstract ConditionValue xgetCValueMessageId();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * message_type_code: {+UQ, NotNull, VARCHAR(255)}
     * @param messageTypeCode The value of messageTypeCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageTypeCode_Equal(String messageTypeCode) {
        doSetMessageTypeCode_Equal(fRES(messageTypeCode));
    }

    protected void doSetMessageTypeCode_Equal(String messageTypeCode) {
        regMessageTypeCode(CK_EQ, messageTypeCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * message_type_code: {+UQ, NotNull, VARCHAR(255)}
     * @param messageTypeCode The value of messageTypeCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageTypeCode_NotEqual(String messageTypeCode) {
        doSetMessageTypeCode_NotEqual(fRES(messageTypeCode));
    }

    protected void doSetMessageTypeCode_NotEqual(String messageTypeCode) {
        regMessageTypeCode(CK_NES, messageTypeCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * message_type_code: {+UQ, NotNull, VARCHAR(255)}
     * @param messageTypeCode The value of messageTypeCode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageTypeCode_GreaterThan(String messageTypeCode) {
        regMessageTypeCode(CK_GT, fRES(messageTypeCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * message_type_code: {+UQ, NotNull, VARCHAR(255)}
     * @param messageTypeCode The value of messageTypeCode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageTypeCode_LessThan(String messageTypeCode) {
        regMessageTypeCode(CK_LT, fRES(messageTypeCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * message_type_code: {+UQ, NotNull, VARCHAR(255)}
     * @param messageTypeCode The value of messageTypeCode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageTypeCode_GreaterEqual(String messageTypeCode) {
        regMessageTypeCode(CK_GE, fRES(messageTypeCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * message_type_code: {+UQ, NotNull, VARCHAR(255)}
     * @param messageTypeCode The value of messageTypeCode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageTypeCode_LessEqual(String messageTypeCode) {
        regMessageTypeCode(CK_LE, fRES(messageTypeCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * message_type_code: {+UQ, NotNull, VARCHAR(255)}
     * @param messageTypeCodeList The collection of messageTypeCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageTypeCode_InScope(Collection<String> messageTypeCodeList) {
        doSetMessageTypeCode_InScope(messageTypeCodeList);
    }

    protected void doSetMessageTypeCode_InScope(Collection<String> messageTypeCodeList) {
        regINS(CK_INS, cTL(messageTypeCodeList), xgetCValueMessageTypeCode(), "message_type_code");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * message_type_code: {+UQ, NotNull, VARCHAR(255)}
     * @param messageTypeCodeList The collection of messageTypeCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageTypeCode_NotInScope(Collection<String> messageTypeCodeList) {
        doSetMessageTypeCode_NotInScope(messageTypeCodeList);
    }

    protected void doSetMessageTypeCode_NotInScope(Collection<String> messageTypeCodeList) {
        regINS(CK_NINS, cTL(messageTypeCodeList), xgetCValueMessageTypeCode(), "message_type_code");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * message_type_code: {+UQ, NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setMessageTypeCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param messageTypeCode The value of messageTypeCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMessageTypeCode_LikeSearch(String messageTypeCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMessageTypeCode_LikeSearch(messageTypeCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * message_type_code: {+UQ, NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setMessageTypeCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param messageTypeCode The value of messageTypeCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setMessageTypeCode_LikeSearch(String messageTypeCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(messageTypeCode), xgetCValueMessageTypeCode(), "message_type_code", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * message_type_code: {+UQ, NotNull, VARCHAR(255)}
     * @param messageTypeCode The value of messageTypeCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMessageTypeCode_NotLikeSearch(String messageTypeCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMessageTypeCode_NotLikeSearch(messageTypeCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * message_type_code: {+UQ, NotNull, VARCHAR(255)}
     * @param messageTypeCode The value of messageTypeCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setMessageTypeCode_NotLikeSearch(String messageTypeCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(messageTypeCode), xgetCValueMessageTypeCode(), "message_type_code", likeSearchOption);
    }

    protected void regMessageTypeCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMessageTypeCode(), "message_type_code"); }
    protected abstract ConditionValue xgetCValueMessageTypeCode();

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
     * replied_count: {NotNull, INT UNSIGNED(10)}
     * @param repliedCount The value of repliedCount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRepliedCount_Equal(Integer repliedCount) {
        doSetRepliedCount_Equal(repliedCount);
    }

    protected void doSetRepliedCount_Equal(Integer repliedCount) {
        regRepliedCount(CK_EQ, repliedCount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * replied_count: {NotNull, INT UNSIGNED(10)}
     * @param repliedCount The value of repliedCount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRepliedCount_NotEqual(Integer repliedCount) {
        doSetRepliedCount_NotEqual(repliedCount);
    }

    protected void doSetRepliedCount_NotEqual(Integer repliedCount) {
        regRepliedCount(CK_NES, repliedCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * replied_count: {NotNull, INT UNSIGNED(10)}
     * @param repliedCount The value of repliedCount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRepliedCount_GreaterThan(Integer repliedCount) {
        regRepliedCount(CK_GT, repliedCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * replied_count: {NotNull, INT UNSIGNED(10)}
     * @param repliedCount The value of repliedCount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRepliedCount_LessThan(Integer repliedCount) {
        regRepliedCount(CK_LT, repliedCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * replied_count: {NotNull, INT UNSIGNED(10)}
     * @param repliedCount The value of repliedCount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRepliedCount_GreaterEqual(Integer repliedCount) {
        regRepliedCount(CK_GE, repliedCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * replied_count: {NotNull, INT UNSIGNED(10)}
     * @param repliedCount The value of repliedCount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRepliedCount_LessEqual(Integer repliedCount) {
        regRepliedCount(CK_LE, repliedCount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * replied_count: {NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of repliedCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of repliedCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setRepliedCount_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setRepliedCount_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * replied_count: {NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of repliedCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of repliedCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setRepliedCount_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRepliedCount(), "replied_count", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * replied_count: {NotNull, INT UNSIGNED(10)}
     * @param repliedCountList The collection of repliedCount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRepliedCount_InScope(Collection<Integer> repliedCountList) {
        doSetRepliedCount_InScope(repliedCountList);
    }

    protected void doSetRepliedCount_InScope(Collection<Integer> repliedCountList) {
        regINS(CK_INS, cTL(repliedCountList), xgetCValueRepliedCount(), "replied_count");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * replied_count: {NotNull, INT UNSIGNED(10)}
     * @param repliedCountList The collection of repliedCount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRepliedCount_NotInScope(Collection<Integer> repliedCountList) {
        doSetRepliedCount_NotInScope(repliedCountList);
    }

    protected void doSetRepliedCount_NotInScope(Collection<Integer> repliedCountList) {
        regINS(CK_NINS, cTL(repliedCountList), xgetCValueRepliedCount(), "replied_count");
    }

    protected void regRepliedCount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRepliedCount(), "replied_count"); }
    protected abstract ConditionValue xgetCValueRepliedCount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * favored_count: {NotNull, INT UNSIGNED(10)}
     * @param favoredCount The value of favoredCount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFavoredCount_Equal(Integer favoredCount) {
        doSetFavoredCount_Equal(favoredCount);
    }

    protected void doSetFavoredCount_Equal(Integer favoredCount) {
        regFavoredCount(CK_EQ, favoredCount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * favored_count: {NotNull, INT UNSIGNED(10)}
     * @param favoredCount The value of favoredCount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFavoredCount_NotEqual(Integer favoredCount) {
        doSetFavoredCount_NotEqual(favoredCount);
    }

    protected void doSetFavoredCount_NotEqual(Integer favoredCount) {
        regFavoredCount(CK_NES, favoredCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * favored_count: {NotNull, INT UNSIGNED(10)}
     * @param favoredCount The value of favoredCount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFavoredCount_GreaterThan(Integer favoredCount) {
        regFavoredCount(CK_GT, favoredCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * favored_count: {NotNull, INT UNSIGNED(10)}
     * @param favoredCount The value of favoredCount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFavoredCount_LessThan(Integer favoredCount) {
        regFavoredCount(CK_LT, favoredCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * favored_count: {NotNull, INT UNSIGNED(10)}
     * @param favoredCount The value of favoredCount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFavoredCount_GreaterEqual(Integer favoredCount) {
        regFavoredCount(CK_GE, favoredCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * favored_count: {NotNull, INT UNSIGNED(10)}
     * @param favoredCount The value of favoredCount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFavoredCount_LessEqual(Integer favoredCount) {
        regFavoredCount(CK_LE, favoredCount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * favored_count: {NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of favoredCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of favoredCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setFavoredCount_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setFavoredCount_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * favored_count: {NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of favoredCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of favoredCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setFavoredCount_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFavoredCount(), "favored_count", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * favored_count: {NotNull, INT UNSIGNED(10)}
     * @param favoredCountList The collection of favoredCount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFavoredCount_InScope(Collection<Integer> favoredCountList) {
        doSetFavoredCount_InScope(favoredCountList);
    }

    protected void doSetFavoredCount_InScope(Collection<Integer> favoredCountList) {
        regINS(CK_INS, cTL(favoredCountList), xgetCValueFavoredCount(), "favored_count");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * favored_count: {NotNull, INT UNSIGNED(10)}
     * @param favoredCountList The collection of favoredCount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFavoredCount_NotInScope(Collection<Integer> favoredCountList) {
        doSetFavoredCount_NotInScope(favoredCountList);
    }

    protected void doSetFavoredCount_NotInScope(Collection<Integer> favoredCountList) {
        regINS(CK_NINS, cTL(favoredCountList), xgetCValueFavoredCount(), "favored_count");
    }

    protected void regFavoredCount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFavoredCount(), "favored_count"); }
    protected abstract ConditionValue xgetCValueFavoredCount();

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
    public HpSLCFunction<DbMessageCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, DbMessageCB.class);
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
    public HpSLCFunction<DbMessageCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, DbMessageCB.class);
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
    public HpSLCFunction<DbMessageCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, DbMessageCB.class);
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
    public HpSLCFunction<DbMessageCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, DbMessageCB.class);
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
    public HpSLCFunction<DbMessageCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, DbMessageCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;DbMessageCB&gt;() {
     *     public void query(DbMessageCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DbMessageCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, DbMessageCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        DbMessageCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(DbMessageCQ sq);

    protected DbMessageCB xcreateScalarConditionCB() {
        DbMessageCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected DbMessageCB xcreateScalarConditionPartitionByCB() {
        DbMessageCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
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
    protected DbMessageCB newMyCB() {
        return new DbMessageCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return DbMessageCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
