package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;
import dev.wolfort.dbflute.cbean.*;

/**
 * The referrer loader of DESIGNER as TABLE. <br>
 * <pre>
 * [primary key]
 *     designer_id
 *
 * [column]
 *     designer_id, designer_name, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     designer_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     CHARACHIP
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     charachipList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfDesigner {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbDesigner> _selectedList;
    protected BehaviorSelector _selector;
    protected DbDesignerBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfDesigner ready(List<DbDesigner> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbDesignerBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbDesignerBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<DbCharachip> _referrerCharachip;

    /**
     * Load referrer of charachipList by the set-upper of referrer. <br>
     * CHARACHIP by designer_id, named 'charachipList'.
     * <pre>
     * <span style="color: #0000C0">designerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">designerList</span>, <span style="color: #553000">designerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">designerLoader</span>.<span style="color: #CC4747">loadCharachip</span>(<span style="color: #553000">charachipCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">charachipCB</span>.setupSelect...
     *         <span style="color: #553000">charachipCB</span>.query().set...
     *         <span style="color: #553000">charachipCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">charachipLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    charachipLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbDesigner designer : <span style="color: #553000">designerList</span>) {
     *     ... = designer.<span style="color: #CC4747">getCharachipList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDesignerId_InScope(pkList);
     * cb.query().addOrderBy_DesignerId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfCharachip> loadCharachip(ReferrerConditionSetupper<DbCharachipCB> refCBLambda) {
        myBhv().loadCharachip(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerCharachip = refLs);
        return hd -> hd.handle(new DbLoaderOfCharachip().ready(_referrerCharachip, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DbDesigner> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
