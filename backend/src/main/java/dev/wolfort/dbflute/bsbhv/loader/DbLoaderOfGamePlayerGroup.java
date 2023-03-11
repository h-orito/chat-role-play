package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;
import dev.wolfort.dbflute.cbean.*;

/**
 * The referrer loader of GAME_PLAYER_GROUP as TABLE. <br>
 * <pre>
 * [primary key]
 *     game_player_group_id
 *
 * [column]
 *     game_player_group_id, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     game_player_group_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     DIRECT_MESSAGE
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     directMessageList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfGamePlayerGroup {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbGamePlayerGroup> _selectedList;
    protected BehaviorSelector _selector;
    protected DbGamePlayerGroupBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfGamePlayerGroup ready(List<DbGamePlayerGroup> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbGamePlayerGroupBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbGamePlayerGroupBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<DbDirectMessage> _referrerDirectMessage;

    /**
     * Load referrer of directMessageList by the set-upper of referrer. <br>
     * DIRECT_MESSAGE by game_player_group_id, named 'directMessageList'.
     * <pre>
     * <span style="color: #0000C0">gamePlayerGroupBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">gamePlayerGroupList</span>, <span style="color: #553000">groupLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">groupLoader</span>.<span style="color: #CC4747">loadDirectMessage</span>(<span style="color: #553000">messageCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">messageCB</span>.setupSelect...
     *         <span style="color: #553000">messageCB</span>.query().set...
     *         <span style="color: #553000">messageCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">messageLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    messageLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbGamePlayerGroup gamePlayerGroup : <span style="color: #553000">gamePlayerGroupList</span>) {
     *     ... = gamePlayerGroup.<span style="color: #CC4747">getDirectMessageList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGamePlayerGroupId_InScope(pkList);
     * cb.query().addOrderBy_GamePlayerGroupId_Asc();
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
    public List<DbGamePlayerGroup> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
