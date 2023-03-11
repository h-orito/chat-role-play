package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;
import dev.wolfort.dbflute.cbean.*;

/**
 * The referrer loader of GAME_PLAYER as TABLE. <br>
 * <pre>
 * [primary key]
 *     game_player_id
 *
 * [column]
 *     game_player_id, game_id, player_id, game_player_name, chara_id, is_deleted, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     game_player_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     CHARA, GAME, PLAYER
 *
 * [referrer table]
 *     GAME_PLAYER_GROUP_REL, MESSAGE, MESSAGE_FAVORITE, DIRECT_MESSAGE
 *
 * [foreign property]
 *     chara, game, player
 *
 * [referrer property]
 *     gamePlayerGroupRelList, messageList, messageFavoriteList, directMessageList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfGamePlayer {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbGamePlayer> _selectedList;
    protected BehaviorSelector _selector;
    protected DbGamePlayerBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfGamePlayer ready(List<DbGamePlayer> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbGamePlayerBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbGamePlayerBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<DbGamePlayerGroupRel> _referrerGamePlayerGroupRel;

    /**
     * Load referrer of gamePlayerGroupRelList by the set-upper of referrer. <br>
     * GAME_PLAYER_GROUP_REL by game_player_id, named 'gamePlayerGroupRelList'.
     * <pre>
     * <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">gamePlayerList</span>, <span style="color: #553000">playerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">playerLoader</span>.<span style="color: #CC4747">loadGamePlayerGroupRel</span>(<span style="color: #553000">relCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">relCB</span>.setupSelect...
     *         <span style="color: #553000">relCB</span>.query().set...
     *         <span style="color: #553000">relCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">relLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    relLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbGamePlayer gamePlayer : <span style="color: #553000">gamePlayerList</span>) {
     *     ... = gamePlayer.<span style="color: #CC4747">getGamePlayerGroupRelList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGamePlayerId_InScope(pkList);
     * cb.query().addOrderBy_GamePlayerId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfGamePlayerGroupRel> loadGamePlayerGroupRel(ReferrerConditionSetupper<DbGamePlayerGroupRelCB> refCBLambda) {
        myBhv().loadGamePlayerGroupRel(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerGamePlayerGroupRel = refLs);
        return hd -> hd.handle(new DbLoaderOfGamePlayerGroupRel().ready(_referrerGamePlayerGroupRel, _selector));
    }

    protected List<DbMessage> _referrerMessage;

    /**
     * Load referrer of messageList by the set-upper of referrer. <br>
     * MESSAGE by from_game_player_id, named 'messageList'.
     * <pre>
     * <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">gamePlayerList</span>, <span style="color: #553000">playerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">playerLoader</span>.<span style="color: #CC4747">loadMessage</span>(<span style="color: #553000">messageCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">messageCB</span>.setupSelect...
     *         <span style="color: #553000">messageCB</span>.query().set...
     *         <span style="color: #553000">messageCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">messageLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    messageLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbGamePlayer gamePlayer : <span style="color: #553000">gamePlayerList</span>) {
     *     ... = gamePlayer.<span style="color: #CC4747">getMessageList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFromGamePlayerId_InScope(pkList);
     * cb.query().addOrderBy_FromGamePlayerId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfMessage> loadMessage(ReferrerConditionSetupper<DbMessageCB> refCBLambda) {
        myBhv().loadMessage(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMessage = refLs);
        return hd -> hd.handle(new DbLoaderOfMessage().ready(_referrerMessage, _selector));
    }

    protected List<DbMessageFavorite> _referrerMessageFavorite;

    /**
     * Load referrer of messageFavoriteList by the set-upper of referrer. <br>
     * MESSAGE_FAVORITE by game_player_id, named 'messageFavoriteList'.
     * <pre>
     * <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">gamePlayerList</span>, <span style="color: #553000">playerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">playerLoader</span>.<span style="color: #CC4747">loadMessageFavorite</span>(<span style="color: #553000">favoriteCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">favoriteCB</span>.setupSelect...
     *         <span style="color: #553000">favoriteCB</span>.query().set...
     *         <span style="color: #553000">favoriteCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">favoriteLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    favoriteLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbGamePlayer gamePlayer : <span style="color: #553000">gamePlayerList</span>) {
     *     ... = gamePlayer.<span style="color: #CC4747">getMessageFavoriteList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGamePlayerId_InScope(pkList);
     * cb.query().addOrderBy_GamePlayerId_Asc();
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
     * DIRECT_MESSAGE by from_game_player_id, named 'directMessageList'.
     * <pre>
     * <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">gamePlayerList</span>, <span style="color: #553000">playerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">playerLoader</span>.<span style="color: #CC4747">loadDirectMessage</span>(<span style="color: #553000">messageCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">messageCB</span>.setupSelect...
     *         <span style="color: #553000">messageCB</span>.query().set...
     *         <span style="color: #553000">messageCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">messageLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    messageLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbGamePlayer gamePlayer : <span style="color: #553000">gamePlayerList</span>) {
     *     ... = gamePlayer.<span style="color: #CC4747">getDirectMessageList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFromGamePlayerId_InScope(pkList);
     * cb.query().addOrderBy_FromGamePlayerId_Asc();
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
    protected DbLoaderOfChara _foreignCharaLoader;
    public DbLoaderOfChara pulloutChara() {
        if (_foreignCharaLoader == null)
        { _foreignCharaLoader = new DbLoaderOfChara().ready(myBhv().pulloutChara(_selectedList), _selector); }
        return _foreignCharaLoader;
    }

    protected DbLoaderOfGame _foreignGameLoader;
    public DbLoaderOfGame pulloutGame() {
        if (_foreignGameLoader == null)
        { _foreignGameLoader = new DbLoaderOfGame().ready(myBhv().pulloutGame(_selectedList), _selector); }
        return _foreignGameLoader;
    }

    protected DbLoaderOfPlayer _foreignPlayerLoader;
    public DbLoaderOfPlayer pulloutPlayer() {
        if (_foreignPlayerLoader == null)
        { _foreignPlayerLoader = new DbLoaderOfPlayer().ready(myBhv().pulloutPlayer(_selectedList), _selector); }
        return _foreignPlayerLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DbGamePlayer> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
