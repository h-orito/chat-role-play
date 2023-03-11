package dev.wolfort.dbflute.cbean.nss;

import dev.wolfort.dbflute.cbean.cq.DbGamePlayerGroupRelCQ;

/**
 * The nest select set-upper of game_player_group_rel.
 * @author DBFlute(AutoGenerator)
 */
public class DbGamePlayerGroupRelNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DbGamePlayerGroupRelCQ _query;
    public DbGamePlayerGroupRelNss(DbGamePlayerGroupRelCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * GAME_PLAYER by my game_player_id, named 'gamePlayer'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public DbGamePlayerNss withGamePlayer() {
        _query.xdoNss(() -> _query.queryGamePlayer());
        return new DbGamePlayerNss(_query.queryGamePlayer());
    }
}
