package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;
import dev.wolfort.dbflute.cbean.*;

/**
 * The referrer loader of CHARA as TABLE. <br>
 * <pre>
 * [primary key]
 *     chara_id
 *
 * [column]
 *     chara_id, chara_name, charachip_id, display_width, display_height, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     chara_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     CHARACHIP
 *
 * [referrer table]
 *     CHARA_IMAGE, GAME_PLAYER
 *
 * [foreign property]
 *     charachip
 *
 * [referrer property]
 *     charaImageList, gamePlayerList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfChara {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbChara> _selectedList;
    protected BehaviorSelector _selector;
    protected DbCharaBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfChara ready(List<DbChara> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbCharaBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbCharaBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<DbCharaImage> _referrerCharaImage;

    /**
     * Load referrer of charaImageList by the set-upper of referrer. <br>
     * CHARA_IMAGE by chara_id, named 'charaImageList'.
     * <pre>
     * <span style="color: #0000C0">charaBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">charaList</span>, <span style="color: #553000">charaLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">charaLoader</span>.<span style="color: #CC4747">loadCharaImage</span>(<span style="color: #553000">imageCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">imageCB</span>.setupSelect...
     *         <span style="color: #553000">imageCB</span>.query().set...
     *         <span style="color: #553000">imageCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">imageLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    imageLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbChara chara : <span style="color: #553000">charaList</span>) {
     *     ... = chara.<span style="color: #CC4747">getCharaImageList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCharaId_InScope(pkList);
     * cb.query().addOrderBy_CharaId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfCharaImage> loadCharaImage(ReferrerConditionSetupper<DbCharaImageCB> refCBLambda) {
        myBhv().loadCharaImage(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerCharaImage = refLs);
        return hd -> hd.handle(new DbLoaderOfCharaImage().ready(_referrerCharaImage, _selector));
    }

    protected List<DbGamePlayer> _referrerGamePlayer;

    /**
     * Load referrer of gamePlayerList by the set-upper of referrer. <br>
     * GAME_PLAYER by chara_id, named 'gamePlayerList'.
     * <pre>
     * <span style="color: #0000C0">charaBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">charaList</span>, <span style="color: #553000">charaLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">charaLoader</span>.<span style="color: #CC4747">loadGamePlayer</span>(<span style="color: #553000">playerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">playerCB</span>.setupSelect...
     *         <span style="color: #553000">playerCB</span>.query().set...
     *         <span style="color: #553000">playerCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">playerLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    playerLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbChara chara : <span style="color: #553000">charaList</span>) {
     *     ... = chara.<span style="color: #CC4747">getGamePlayerList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCharaId_InScope(pkList);
     * cb.query().addOrderBy_CharaId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfGamePlayer> loadGamePlayer(ReferrerConditionSetupper<DbGamePlayerCB> refCBLambda) {
        myBhv().loadGamePlayer(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerGamePlayer = refLs);
        return hd -> hd.handle(new DbLoaderOfGamePlayer().ready(_referrerGamePlayer, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected DbLoaderOfCharachip _foreignCharachipLoader;
    public DbLoaderOfCharachip pulloutCharachip() {
        if (_foreignCharachipLoader == null)
        { _foreignCharachipLoader = new DbLoaderOfCharachip().ready(myBhv().pulloutCharachip(_selectedList), _selector); }
        return _foreignCharachipLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DbChara> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
