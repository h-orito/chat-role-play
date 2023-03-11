package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;

/**
 * The referrer loader of MESSAGE_REPLY as TABLE. <br>
 * <pre>
 * [primary key]
 *     message_reply_id, game_id
 *
 * [column]
 *     message_reply_id, game_id, from_message_id, reply_message_id, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     message_reply_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     GAME, MESSAGE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     game, messageByFromMessageId, messageByReplyMessageId
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfMessageReply {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbMessageReply> _selectedList;
    protected BehaviorSelector _selector;
    protected DbMessageReplyBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfMessageReply ready(List<DbMessageReply> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbMessageReplyBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbMessageReplyBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected DbLoaderOfGame _foreignGameLoader;
    public DbLoaderOfGame pulloutGame() {
        if (_foreignGameLoader == null)
        { _foreignGameLoader = new DbLoaderOfGame().ready(myBhv().pulloutGame(_selectedList), _selector); }
        return _foreignGameLoader;
    }

    protected DbLoaderOfMessage _foreignMessageByFromMessageIdLoader;
    public DbLoaderOfMessage pulloutMessageByFromMessageId() {
        if (_foreignMessageByFromMessageIdLoader == null)
        { _foreignMessageByFromMessageIdLoader = new DbLoaderOfMessage().ready(myBhv().pulloutMessageByFromMessageId(_selectedList), _selector); }
        return _foreignMessageByFromMessageIdLoader;
    }

    protected DbLoaderOfMessage _foreignMessageByReplyMessageIdLoader;
    public DbLoaderOfMessage pulloutMessageByReplyMessageId() {
        if (_foreignMessageByReplyMessageIdLoader == null)
        { _foreignMessageByReplyMessageIdLoader = new DbLoaderOfMessage().ready(myBhv().pulloutMessageByReplyMessageId(_selectedList), _selector); }
        return _foreignMessageByReplyMessageIdLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DbMessageReply> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
