package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;

/**
 * The referrer loader of MESSAGE_FAVORITE as TABLE. <br>
 * <pre>
 * [primary key]
 *     message_favorite_id, game_id
 *
 * [column]
 *     message_favorite_id, game_id, message_id, game_player_id, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     message_favorite_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     GAME, MESSAGE, GAME_PLAYER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     game, message, gamePlayer
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfMessageFavorite {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbMessageFavorite> _selectedList;
    protected BehaviorSelector _selector;
    protected DbMessageFavoriteBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfMessageFavorite ready(List<DbMessageFavorite> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbMessageFavoriteBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbMessageFavoriteBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected DbLoaderOfGame _foreignGameLoader;
    public DbLoaderOfGame pulloutGame() {
        if (_foreignGameLoader == null)
        { _foreignGameLoader = new DbLoaderOfGame().ready(myBhv().pulloutGame(_selectedList), _selector); }
        return _foreignGameLoader;
    }

    protected DbLoaderOfMessage _foreignMessageLoader;
    public DbLoaderOfMessage pulloutMessage() {
        if (_foreignMessageLoader == null)
        { _foreignMessageLoader = new DbLoaderOfMessage().ready(myBhv().pulloutMessage(_selectedList), _selector); }
        return _foreignMessageLoader;
    }

    protected DbLoaderOfGamePlayer _foreignGamePlayerLoader;
    public DbLoaderOfGamePlayer pulloutGamePlayer() {
        if (_foreignGamePlayerLoader == null)
        { _foreignGamePlayerLoader = new DbLoaderOfGamePlayer().ready(myBhv().pulloutGamePlayer(_selectedList), _selector); }
        return _foreignGamePlayerLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DbMessageFavorite> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
