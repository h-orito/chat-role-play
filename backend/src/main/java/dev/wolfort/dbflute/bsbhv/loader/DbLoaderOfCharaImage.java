package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;

/**
 * The referrer loader of CHARA_IMAGE as TABLE. <br>
 * <pre>
 * [primary key]
 *     chara_image_id
 *
 * [column]
 *     chara_image_id, chara_id, face_type_code, chara_img_url, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     chara_image_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     CHARA
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     chara
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfCharaImage {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbCharaImage> _selectedList;
    protected BehaviorSelector _selector;
    protected DbCharaImageBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfCharaImage ready(List<DbCharaImage> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbCharaImageBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbCharaImageBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected DbLoaderOfChara _foreignCharaLoader;
    public DbLoaderOfChara pulloutChara() {
        if (_foreignCharaLoader == null)
        { _foreignCharaLoader = new DbLoaderOfChara().ready(myBhv().pulloutChara(_selectedList), _selector); }
        return _foreignCharaLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DbCharaImage> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
