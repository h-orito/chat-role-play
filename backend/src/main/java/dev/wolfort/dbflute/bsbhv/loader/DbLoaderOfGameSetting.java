package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;

/**
 * The referrer loader of GAME_SETTING as TABLE. <br>
 * <pre>
 * [primary key]
 *     game_setting_id
 *
 * [column]
 *     game_setting_id, game_id, game_setting_item_code, game_setting_item_value
 *
 * [sequence]
 *     
 *
 * [identity]
 *     game_setting_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     GAME
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     game
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfGameSetting {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbGameSetting> _selectedList;
    protected BehaviorSelector _selector;
    protected DbGameSettingBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfGameSetting ready(List<DbGameSetting> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbGameSettingBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbGameSettingBhv.class); return _myBhv; } }

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
    public List<DbGameSetting> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
