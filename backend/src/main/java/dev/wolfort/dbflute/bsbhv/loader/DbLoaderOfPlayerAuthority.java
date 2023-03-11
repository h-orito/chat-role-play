package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;

/**
 * The referrer loader of PLAYER_AUTHORITY as TABLE. <br>
 * <pre>
 * [primary key]
 *     player_authority_id
 *
 * [column]
 *     player_authority_id, player_id, authority_code, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     player_authority_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     PLAYER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     player
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfPlayerAuthority {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbPlayerAuthority> _selectedList;
    protected BehaviorSelector _selector;
    protected DbPlayerAuthorityBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfPlayerAuthority ready(List<DbPlayerAuthority> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbPlayerAuthorityBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbPlayerAuthorityBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected DbLoaderOfPlayer _foreignPlayerLoader;
    public DbLoaderOfPlayer pulloutPlayer() {
        if (_foreignPlayerLoader == null)
        { _foreignPlayerLoader = new DbLoaderOfPlayer().ready(myBhv().pulloutPlayer(_selectedList), _selector); }
        return _foreignPlayerLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DbPlayerAuthority> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
