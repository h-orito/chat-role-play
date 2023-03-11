package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;
import dev.wolfort.dbflute.cbean.*;

/**
 * The referrer loader of GAME as TABLE. <br>
 * <pre>
 * [primary key]
 *     game_id
 *
 * [column]
 *     game_id, game_name, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     game_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     GAME_PERIOD, GAME_PLAYER, GAME_SETTING, MESSAGE, MESSAGE_REPLY, MESSAGE_FAVORITE, DIRECT_MESSAGE
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     gamePeriodList, gamePlayerList, gameSettingList, messageList, messageReplyList, messageFavoriteList, directMessageList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfGame {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbGame> _selectedList;
    protected BehaviorSelector _selector;
    protected DbGameBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfGame ready(List<DbGame> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbGameBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbGameBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<DbGamePeriod> _referrerGamePeriod;

    /**
     * Load referrer of gamePeriodList by the set-upper of referrer. <br>
     * GAME_PERIOD by game_id, named 'gamePeriodList'.
     * <pre>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">gameList</span>, <span style="color: #553000">gameLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">gameLoader</span>.<span style="color: #CC4747">loadGamePeriod</span>(<span style="color: #553000">periodCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">periodCB</span>.setupSelect...
     *         <span style="color: #553000">periodCB</span>.query().set...
     *         <span style="color: #553000">periodCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">periodLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    periodLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbGame game : <span style="color: #553000">gameList</span>) {
     *     ... = game.<span style="color: #CC4747">getGamePeriodList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameId_InScope(pkList);
     * cb.query().addOrderBy_GameId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfGamePeriod> loadGamePeriod(ReferrerConditionSetupper<DbGamePeriodCB> refCBLambda) {
        myBhv().loadGamePeriod(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerGamePeriod = refLs);
        return hd -> hd.handle(new DbLoaderOfGamePeriod().ready(_referrerGamePeriod, _selector));
    }

    protected List<DbGamePlayer> _referrerGamePlayer;

    /**
     * Load referrer of gamePlayerList by the set-upper of referrer. <br>
     * GAME_PLAYER by game_id, named 'gamePlayerList'.
     * <pre>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">gameList</span>, <span style="color: #553000">gameLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">gameLoader</span>.<span style="color: #CC4747">loadGamePlayer</span>(<span style="color: #553000">playerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">playerCB</span>.setupSelect...
     *         <span style="color: #553000">playerCB</span>.query().set...
     *         <span style="color: #553000">playerCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">playerLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    playerLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbGame game : <span style="color: #553000">gameList</span>) {
     *     ... = game.<span style="color: #CC4747">getGamePlayerList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameId_InScope(pkList);
     * cb.query().addOrderBy_GameId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfGamePlayer> loadGamePlayer(ReferrerConditionSetupper<DbGamePlayerCB> refCBLambda) {
        myBhv().loadGamePlayer(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerGamePlayer = refLs);
        return hd -> hd.handle(new DbLoaderOfGamePlayer().ready(_referrerGamePlayer, _selector));
    }

    protected List<DbGameSetting> _referrerGameSetting;

    /**
     * Load referrer of gameSettingList by the set-upper of referrer. <br>
     * GAME_SETTING by game_id, named 'gameSettingList'.
     * <pre>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">gameList</span>, <span style="color: #553000">gameLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">gameLoader</span>.<span style="color: #CC4747">loadGameSetting</span>(<span style="color: #553000">settingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">settingCB</span>.setupSelect...
     *         <span style="color: #553000">settingCB</span>.query().set...
     *         <span style="color: #553000">settingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">settingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    settingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbGame game : <span style="color: #553000">gameList</span>) {
     *     ... = game.<span style="color: #CC4747">getGameSettingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameId_InScope(pkList);
     * cb.query().addOrderBy_GameId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfGameSetting> loadGameSetting(ReferrerConditionSetupper<DbGameSettingCB> refCBLambda) {
        myBhv().loadGameSetting(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerGameSetting = refLs);
        return hd -> hd.handle(new DbLoaderOfGameSetting().ready(_referrerGameSetting, _selector));
    }

    protected List<DbMessage> _referrerMessage;

    /**
     * Load referrer of messageList by the set-upper of referrer. <br>
     * MESSAGE by game_id, named 'messageList'.
     * <pre>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">gameList</span>, <span style="color: #553000">gameLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">gameLoader</span>.<span style="color: #CC4747">loadMessage</span>(<span style="color: #553000">messageCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">messageCB</span>.setupSelect...
     *         <span style="color: #553000">messageCB</span>.query().set...
     *         <span style="color: #553000">messageCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">messageLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    messageLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbGame game : <span style="color: #553000">gameList</span>) {
     *     ... = game.<span style="color: #CC4747">getMessageList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameId_InScope(pkList);
     * cb.query().addOrderBy_GameId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfMessage> loadMessage(ReferrerConditionSetupper<DbMessageCB> refCBLambda) {
        myBhv().loadMessage(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMessage = refLs);
        return hd -> hd.handle(new DbLoaderOfMessage().ready(_referrerMessage, _selector));
    }

    protected List<DbMessageReply> _referrerMessageReply;

    /**
     * Load referrer of messageReplyList by the set-upper of referrer. <br>
     * MESSAGE_REPLY by game_id, named 'messageReplyList'.
     * <pre>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">gameList</span>, <span style="color: #553000">gameLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">gameLoader</span>.<span style="color: #CC4747">loadMessageReply</span>(<span style="color: #553000">replyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">replyCB</span>.setupSelect...
     *         <span style="color: #553000">replyCB</span>.query().set...
     *         <span style="color: #553000">replyCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">replyLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    replyLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbGame game : <span style="color: #553000">gameList</span>) {
     *     ... = game.<span style="color: #CC4747">getMessageReplyList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameId_InScope(pkList);
     * cb.query().addOrderBy_GameId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfMessageReply> loadMessageReply(ReferrerConditionSetupper<DbMessageReplyCB> refCBLambda) {
        myBhv().loadMessageReply(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMessageReply = refLs);
        return hd -> hd.handle(new DbLoaderOfMessageReply().ready(_referrerMessageReply, _selector));
    }

    protected List<DbMessageFavorite> _referrerMessageFavorite;

    /**
     * Load referrer of messageFavoriteList by the set-upper of referrer. <br>
     * MESSAGE_FAVORITE by game_id, named 'messageFavoriteList'.
     * <pre>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">gameList</span>, <span style="color: #553000">gameLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">gameLoader</span>.<span style="color: #CC4747">loadMessageFavorite</span>(<span style="color: #553000">favoriteCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">favoriteCB</span>.setupSelect...
     *         <span style="color: #553000">favoriteCB</span>.query().set...
     *         <span style="color: #553000">favoriteCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">favoriteLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    favoriteLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbGame game : <span style="color: #553000">gameList</span>) {
     *     ... = game.<span style="color: #CC4747">getMessageFavoriteList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameId_InScope(pkList);
     * cb.query().addOrderBy_GameId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfMessageFavorite> loadMessageFavorite(ReferrerConditionSetupper<DbMessageFavoriteCB> refCBLambda) {
        myBhv().loadMessageFavorite(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMessageFavorite = refLs);
        return hd -> hd.handle(new DbLoaderOfMessageFavorite().ready(_referrerMessageFavorite, _selector));
    }

    protected List<DbDirectMessage> _referrerDirectMessage;

    /**
     * Load referrer of directMessageList by the set-upper of referrer. <br>
     * DIRECT_MESSAGE by game_id, named 'directMessageList'.
     * <pre>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">gameList</span>, <span style="color: #553000">gameLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">gameLoader</span>.<span style="color: #CC4747">loadDirectMessage</span>(<span style="color: #553000">messageCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">messageCB</span>.setupSelect...
     *         <span style="color: #553000">messageCB</span>.query().set...
     *         <span style="color: #553000">messageCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">messageLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    messageLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbGame game : <span style="color: #553000">gameList</span>) {
     *     ... = game.<span style="color: #CC4747">getDirectMessageList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameId_InScope(pkList);
     * cb.query().addOrderBy_GameId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfDirectMessage> loadDirectMessage(ReferrerConditionSetupper<DbDirectMessageCB> refCBLambda) {
        myBhv().loadDirectMessage(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerDirectMessage = refLs);
        return hd -> hd.handle(new DbLoaderOfDirectMessage().ready(_referrerDirectMessage, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DbGame> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
