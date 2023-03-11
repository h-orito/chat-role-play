package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;

/**
 * The referrer loader of DIRECT_MESSAGE as TABLE. <br>
 * <pre>
 * [primary key]
 *     direct_message_id, game_id
 *
 * [column]
 *     direct_message_id, game_id, game_player_group_id, game_period_id, from_game_player_id, from_game_player_name, from_game_player_face_type_code, message_content, message_number, message_datetime, message_unix_timestamp_milli, is_deleted, is_convert_disable, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     direct_message_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     GAME, GAME_PLAYER_GROUP, GAME_PERIOD, GAME_PLAYER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     game, gamePlayerGroup, gamePeriod, gamePlayer
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfDirectMessage {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbDirectMessage> _selectedList;
    protected BehaviorSelector _selector;
    protected DbDirectMessageBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfDirectMessage ready(List<DbDirectMessage> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbDirectMessageBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbDirectMessageBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected DbLoaderOfGame _foreignGameLoader;
    public DbLoaderOfGame pulloutGame() {
        if (_foreignGameLoader == null)
        { _foreignGameLoader = new DbLoaderOfGame().ready(myBhv().pulloutGame(_selectedList), _selector); }
        return _foreignGameLoader;
    }

    protected DbLoaderOfGamePlayerGroup _foreignGamePlayerGroupLoader;
    public DbLoaderOfGamePlayerGroup pulloutGamePlayerGroup() {
        if (_foreignGamePlayerGroupLoader == null)
        { _foreignGamePlayerGroupLoader = new DbLoaderOfGamePlayerGroup().ready(myBhv().pulloutGamePlayerGroup(_selectedList), _selector); }
        return _foreignGamePlayerGroupLoader;
    }

    protected DbLoaderOfGamePeriod _foreignGamePeriodLoader;
    public DbLoaderOfGamePeriod pulloutGamePeriod() {
        if (_foreignGamePeriodLoader == null)
        { _foreignGamePeriodLoader = new DbLoaderOfGamePeriod().ready(myBhv().pulloutGamePeriod(_selectedList), _selector); }
        return _foreignGamePeriodLoader;
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
    public List<DbDirectMessage> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
