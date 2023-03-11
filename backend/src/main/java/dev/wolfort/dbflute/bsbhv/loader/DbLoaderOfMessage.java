package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;
import dev.wolfort.dbflute.cbean.*;

/**
 * The referrer loader of MESSAGE as TABLE. <br>
 * <pre>
 * [primary key]
 *     message_id, game_id
 *
 * [column]
 *     message_id, game_id, message_type_code, game_period_id, from_game_player_id, from_game_player_name, from_game_player_face_type_code, message_content, message_number, message_datetime, message_unix_timestamp_milli, is_deleted, is_convert_disable, replied_count, favored_count, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     message_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     GAME, GAME_PERIOD, GAME_PLAYER
 *
 * [referrer table]
 *     MESSAGE_REPLY, MESSAGE_FAVORITE
 *
 * [foreign property]
 *     game, gamePeriod, gamePlayer
 *
 * [referrer property]
 *     messageReplyByFromMessageIdList, messageReplyByReplyMessageIdList, messageFavoriteList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfMessage {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbMessage> _selectedList;
    protected BehaviorSelector _selector;
    protected DbMessageBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfMessage ready(List<DbMessage> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbMessageBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbMessageBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<DbMessageReply> _referrerMessageReplyByFromMessageId;

    /**
     * Load referrer of messageReplyByFromMessageIdList by the set-upper of referrer. <br>
     * MESSAGE_REPLY by from_message_id, named 'messageReplyByFromMessageIdList'.
     * <pre>
     * <span style="color: #0000C0">messageBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">messageList</span>, <span style="color: #553000">messageLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">messageLoader</span>.<span style="color: #CC4747">loadMessageReplyByFromMessageId</span>(<span style="color: #553000">replyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">replyCB</span>.setupSelect...
     *         <span style="color: #553000">replyCB</span>.query().set...
     *         <span style="color: #553000">replyCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">replyLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    replyLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbMessage message : <span style="color: #553000">messageList</span>) {
     *     ... = message.<span style="color: #CC4747">getMessageReplyByFromMessageIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFromMessageId_InScope(pkList);
     * cb.query().addOrderBy_FromMessageId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfMessageReply> loadMessageReplyByFromMessageId(ReferrerConditionSetupper<DbMessageReplyCB> refCBLambda) {
        myBhv().loadMessageReplyByFromMessageId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMessageReplyByFromMessageId = refLs);
        return hd -> hd.handle(new DbLoaderOfMessageReply().ready(_referrerMessageReplyByFromMessageId, _selector));
    }

    protected List<DbMessageReply> _referrerMessageReplyByReplyMessageId;

    /**
     * Load referrer of messageReplyByReplyMessageIdList by the set-upper of referrer. <br>
     * MESSAGE_REPLY by reply_message_id, named 'messageReplyByReplyMessageIdList'.
     * <pre>
     * <span style="color: #0000C0">messageBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">messageList</span>, <span style="color: #553000">messageLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">messageLoader</span>.<span style="color: #CC4747">loadMessageReplyByReplyMessageId</span>(<span style="color: #553000">replyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">replyCB</span>.setupSelect...
     *         <span style="color: #553000">replyCB</span>.query().set...
     *         <span style="color: #553000">replyCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">replyLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    replyLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbMessage message : <span style="color: #553000">messageList</span>) {
     *     ... = message.<span style="color: #CC4747">getMessageReplyByReplyMessageIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReplyMessageId_InScope(pkList);
     * cb.query().addOrderBy_ReplyMessageId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfMessageReply> loadMessageReplyByReplyMessageId(ReferrerConditionSetupper<DbMessageReplyCB> refCBLambda) {
        myBhv().loadMessageReplyByReplyMessageId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMessageReplyByReplyMessageId = refLs);
        return hd -> hd.handle(new DbLoaderOfMessageReply().ready(_referrerMessageReplyByReplyMessageId, _selector));
    }

    protected List<DbMessageFavorite> _referrerMessageFavorite;

    /**
     * Load referrer of messageFavoriteList by the set-upper of referrer. <br>
     * MESSAGE_FAVORITE by message_id, named 'messageFavoriteList'.
     * <pre>
     * <span style="color: #0000C0">messageBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">messageList</span>, <span style="color: #553000">messageLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">messageLoader</span>.<span style="color: #CC4747">loadMessageFavorite</span>(<span style="color: #553000">favoriteCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">favoriteCB</span>.setupSelect...
     *         <span style="color: #553000">favoriteCB</span>.query().set...
     *         <span style="color: #553000">favoriteCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">favoriteLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    favoriteLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbMessage message : <span style="color: #553000">messageList</span>) {
     *     ... = message.<span style="color: #CC4747">getMessageFavoriteList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMessageId_InScope(pkList);
     * cb.query().addOrderBy_MessageId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfMessageFavorite> loadMessageFavorite(ReferrerConditionSetupper<DbMessageFavoriteCB> refCBLambda) {
        myBhv().loadMessageFavorite(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMessageFavorite = refLs);
        return hd -> hd.handle(new DbLoaderOfMessageFavorite().ready(_referrerMessageFavorite, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected DbLoaderOfGame _foreignGameLoader;
    public DbLoaderOfGame pulloutGame() {
        if (_foreignGameLoader == null)
        { _foreignGameLoader = new DbLoaderOfGame().ready(myBhv().pulloutGame(_selectedList), _selector); }
        return _foreignGameLoader;
    }

    protected DbLoaderOfGamePeriod _foreignGamePeriodLoader;
    public DbLoaderOfGamePeriod pulloutGamePeriod() {
        if (_foreignGamePeriodLoader == null)
        { _foreignGamePeriodLoader = new DbLoaderOfGamePeriod().ready(myBhv().pulloutGamePeriod(_selectedList), _selector); }
        return _foreignGamePeriodLoader;
    }

    protected DbLoaderOfGamePlayer _foreignGamePlayerLoader;
    public DbLoaderOfGamePlayer pulloutGamePlayer() {
        if (_foreignGamePlayerLoader == null)
        { _foreignGamePlayerLoader = new DbLoaderOfGamePlayer().ready(myBhv().pulloutGamePlayer(_selectedList), _selector); }
        return _foreignGamePlayerLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DbMessage> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
