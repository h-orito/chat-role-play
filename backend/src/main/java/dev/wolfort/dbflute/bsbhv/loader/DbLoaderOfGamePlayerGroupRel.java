package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;

/**
 * The referrer loader of GAME_PLAYER_GROUP_REL as TABLE. <br>
 * <pre>
 * [primary key]
 *     game_player_group_rel_id
 *
 * [column]
 *     game_player_group_rel_id, game_player_group, game_player_id, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     game_player_group_rel_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     GAME_PLAYER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     gamePlayer
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfGamePlayerGroupRel {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbGamePlayerGroupRel> _selectedList;
    protected BehaviorSelector _selector;
    protected DbGamePlayerGroupRelBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfGamePlayerGroupRel ready(List<DbGamePlayerGroupRel> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbGamePlayerGroupRelBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbGamePlayerGroupRelBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected DbLoaderOfGamePlayer _foreignGamePlayerLoader;
    public DbLoaderOfGamePlayer pulloutGamePlayer() {
        if (_foreignGamePlayerLoader == null)
        { _foreignGamePlayerLoader = new DbLoaderOfGamePlayer().ready(myBhv().pulloutGamePlayer(_selectedList), _selector); }
        return _foreignGamePlayerLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DbGamePlayerGroupRel> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
