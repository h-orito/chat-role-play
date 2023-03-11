package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;
import dev.wolfort.dbflute.cbean.*;

/**
 * The referrer loader of GAME_PERIOD as TABLE. <br>
 * <pre>
 * [primary key]
 *     game_period_id
 *
 * [column]
 *     game_period_id, game_id, period, prefix, suffix, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     game_period_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     GAME
 *
 * [referrer table]
 *     MESSAGE, DIRECT_MESSAGE
 *
 * [foreign property]
 *     game
 *
 * [referrer property]
 *     messageList, directMessageList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfGamePeriod {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbGamePeriod> _selectedList;
    protected BehaviorSelector _selector;
    protected DbGamePeriodBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfGamePeriod ready(List<DbGamePeriod> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbGamePeriodBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbGamePeriodBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<DbMessage> _referrerMessage;

    /**
     * Load referrer of messageList by the set-upper of referrer. <br>
     * MESSAGE by game_period_id, named 'messageList'.
     * <pre>
     * <span style="color: #0000C0">gamePeriodBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">gamePeriodList</span>, <span style="color: #553000">periodLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">periodLoader</span>.<span style="color: #CC4747">loadMessage</span>(<span style="color: #553000">messageCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">messageCB</span>.setupSelect...
     *         <span style="color: #553000">messageCB</span>.query().set...
     *         <span style="color: #553000">messageCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">messageLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    messageLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbGamePeriod gamePeriod : <span style="color: #553000">gamePeriodList</span>) {
     *     ... = gamePeriod.<span style="color: #CC4747">getMessageList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGamePeriodId_InScope(pkList);
     * cb.query().addOrderBy_GamePeriodId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfMessage> loadMessage(ReferrerConditionSetupper<DbMessageCB> refCBLambda) {
        myBhv().loadMessage(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMessage = refLs);
        return hd -> hd.handle(new DbLoaderOfMessage().ready(_referrerMessage, _selector));
    }

    protected List<DbDirectMessage> _referrerDirectMessage;

    /**
     * Load referrer of directMessageList by the set-upper of referrer. <br>
     * DIRECT_MESSAGE by game_period_id, named 'directMessageList'.
     * <pre>
     * <span style="color: #0000C0">gamePeriodBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">gamePeriodList</span>, <span style="color: #553000">periodLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">periodLoader</span>.<span style="color: #CC4747">loadDirectMessage</span>(<span style="color: #553000">messageCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">messageCB</span>.setupSelect...
     *         <span style="color: #553000">messageCB</span>.query().set...
     *         <span style="color: #553000">messageCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">messageLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    messageLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbGamePeriod gamePeriod : <span style="color: #553000">gamePeriodList</span>) {
     *     ... = gamePeriod.<span style="color: #CC4747">getDirectMessageList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGamePeriodId_InScope(pkList);
     * cb.query().addOrderBy_GamePeriodId_Asc();
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
    protected DbLoaderOfGame _foreignGameLoader;
    public DbLoaderOfGame pulloutGame() {
        if (_foreignGameLoader == null)
        { _foreignGameLoader = new DbLoaderOfGame().ready(myBhv().pulloutGame(_selectedList), _selector); }
        return _foreignGameLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DbGamePeriod> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
