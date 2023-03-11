package dev.wolfort.dbflute.cbean.nss;

import dev.wolfort.dbflute.cbean.cq.DbPlayerCQ;

/**
 * The nest select set-upper of player.
 * @author DBFlute(AutoGenerator)
 */
public class DbPlayerNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DbPlayerCQ _query;
    public DbPlayerNss(DbPlayerCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * player_account by player_id, named 'playerAccountAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public DbPlayerAccountNss withPlayerAccountAsOne() {
        _query.xdoNss(() -> _query.queryPlayerAccountAsOne());
        return new DbPlayerAccountNss(_query.queryPlayerAccountAsOne());
    }
}
