package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;
import dev.wolfort.dbflute.cbean.*;

/**
 * The referrer loader of CHARACHIP as TABLE. <br>
 * <pre>
 * [primary key]
 *     charachip_id
 *
 * [column]
 *     charachip_id, charachip_name, designer_id, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     charachip_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     DESIGNER
 *
 * [referrer table]
 *     CHARA
 *
 * [foreign property]
 *     designer
 *
 * [referrer property]
 *     charaList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfCharachip {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbCharachip> _selectedList;
    protected BehaviorSelector _selector;
    protected DbCharachipBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfCharachip ready(List<DbCharachip> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbCharachipBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbCharachipBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<DbChara> _referrerChara;

    /**
     * Load referrer of charaList by the set-upper of referrer. <br>
     * CHARA by charachip_id, named 'charaList'.
     * <pre>
     * <span style="color: #0000C0">charachipBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">charachipList</span>, <span style="color: #553000">charachipLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">charachipLoader</span>.<span style="color: #CC4747">loadChara</span>(<span style="color: #553000">charaCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">charaCB</span>.setupSelect...
     *         <span style="color: #553000">charaCB</span>.query().set...
     *         <span style="color: #553000">charaCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">charaLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    charaLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbCharachip charachip : <span style="color: #553000">charachipList</span>) {
     *     ... = charachip.<span style="color: #CC4747">getCharaList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCharachipId_InScope(pkList);
     * cb.query().addOrderBy_CharachipId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfChara> loadChara(ReferrerConditionSetupper<DbCharaCB> refCBLambda) {
        myBhv().loadChara(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerChara = refLs);
        return hd -> hd.handle(new DbLoaderOfChara().ready(_referrerChara, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected DbLoaderOfDesigner _foreignDesignerLoader;
    public DbLoaderOfDesigner pulloutDesigner() {
        if (_foreignDesignerLoader == null)
        { _foreignDesignerLoader = new DbLoaderOfDesigner().ready(myBhv().pulloutDesigner(_selectedList), _selector); }
        return _foreignDesignerLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DbCharachip> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
