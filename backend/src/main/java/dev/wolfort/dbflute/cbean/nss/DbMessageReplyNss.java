package dev.wolfort.dbflute.cbean.nss;

import dev.wolfort.dbflute.cbean.cq.DbMessageReplyCQ;

/**
 * The nest select set-upper of message_reply.
 * @author DBFlute(AutoGenerator)
 */
public class DbMessageReplyNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DbMessageReplyCQ _query;
    public DbMessageReplyNss(DbMessageReplyCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * GAME by my game_id, named 'game'.
     */
    public void withGame() {
        _query.xdoNss(() -> _query.queryGame());
    }
    /**
     * With nested relation columns to select clause. <br>
     * MESSAGE by my from_message_id, named 'messageByFromMessageId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public DbMessageNss withMessageByFromMessageId() {
        _query.xdoNss(() -> _query.queryMessageByFromMessageId());
        return new DbMessageNss(_query.queryMessageByFromMessageId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * MESSAGE by my reply_message_id, named 'messageByReplyMessageId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public DbMessageNss withMessageByReplyMessageId() {
        _query.xdoNss(() -> _query.queryMessageByReplyMessageId());
        return new DbMessageNss(_query.queryMessageByReplyMessageId());
    }
}
