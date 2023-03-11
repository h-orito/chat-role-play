package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;
import dev.wolfort.dbflute.cbean.*;

/**
 * The referrer loader of PLAYER as TABLE. <br>
 * <pre>
 * [primary key]
 *     player_id
 *
 * [column]
 *     player_id, player_name, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     player_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     PLAYER_ACCOUNT(AsOne)
 *
 * [referrer table]
 *     GAME_PLAYER, PLAYER_AUTHORITY, PLAYER_ACCOUNT
 *
 * [foreign property]
 *     playerAccountAsOne
 *
 * [referrer property]
 *     gamePlayerList, playerAuthorityList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfPlayer {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbPlayer> _selectedList;
    protected BehaviorSelector _selector;
    protected DbPlayerBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfPlayer ready(List<DbPlayer> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbPlayerBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbPlayerBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<DbGamePlayer> _referrerGamePlayer;

    /**
     * Load referrer of gamePlayerList by the set-upper of referrer. <br>
     * GAME_PLAYER by player_id, named 'gamePlayerList'.
     * <pre>
     * <span style="color: #0000C0">playerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">playerList</span>, <span style="color: #553000">playerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">playerLoader</span>.<span style="color: #CC4747">loadGamePlayer</span>(<span style="color: #553000">playerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">playerCB</span>.setupSelect...
     *         <span style="color: #553000">playerCB</span>.query().set...
     *         <span style="color: #553000">playerCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">playerLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    playerLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbPlayer player : <span style="color: #553000">playerList</span>) {
     *     ... = player.<span style="color: #CC4747">getGamePlayerList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPlayerId_InScope(pkList);
     * cb.query().addOrderBy_PlayerId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfGamePlayer> loadGamePlayer(ReferrerConditionSetupper<DbGamePlayerCB> refCBLambda) {
        myBhv().loadGamePlayer(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerGamePlayer = refLs);
        return hd -> hd.handle(new DbLoaderOfGamePlayer().ready(_referrerGamePlayer, _selector));
    }

    protected List<DbPlayerAuthority> _referrerPlayerAuthority;

    /**
     * Load referrer of playerAuthorityList by the set-upper of referrer. <br>
     * PLAYER_AUTHORITY by player_id, named 'playerAuthorityList'.
     * <pre>
     * <span style="color: #0000C0">playerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">playerList</span>, <span style="color: #553000">playerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">playerLoader</span>.<span style="color: #CC4747">loadPlayerAuthority</span>(<span style="color: #553000">authorityCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">authorityCB</span>.setupSelect...
     *         <span style="color: #553000">authorityCB</span>.query().set...
     *         <span style="color: #553000">authorityCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">authorityLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    authorityLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbPlayer player : <span style="color: #553000">playerList</span>) {
     *     ... = player.<span style="color: #CC4747">getPlayerAuthorityList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPlayerId_InScope(pkList);
     * cb.query().addOrderBy_PlayerId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfPlayerAuthority> loadPlayerAuthority(ReferrerConditionSetupper<DbPlayerAuthorityCB> refCBLambda) {
        myBhv().loadPlayerAuthority(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPlayerAuthority = refLs);
        return hd -> hd.handle(new DbLoaderOfPlayerAuthority().ready(_referrerPlayerAuthority, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected DbLoaderOfPlayerAccount _foreignPlayerAccountAsOneLoader;
    public DbLoaderOfPlayerAccount pulloutPlayerAccountAsOne() {
        if (_foreignPlayerAccountAsOneLoader == null)
        { _foreignPlayerAccountAsOneLoader = new DbLoaderOfPlayerAccount().ready(myBhv().pulloutPlayerAccountAsOne(_selectedList), _selector); }
        return _foreignPlayerAccountAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DbPlayer> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
