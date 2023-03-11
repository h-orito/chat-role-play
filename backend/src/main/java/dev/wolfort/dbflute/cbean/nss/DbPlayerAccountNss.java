package dev.wolfort.dbflute.cbean.nss;

import dev.wolfort.dbflute.cbean.cq.DbPlayerAccountCQ;

/**
 * The nest select set-upper of player_account.
 * @author DBFlute(AutoGenerator)
 */
public class DbPlayerAccountNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DbPlayerAccountCQ _query;
    public DbPlayerAccountNss(DbPlayerAccountCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * PLAYER by my player_id, named 'player'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public DbPlayerNss withPlayer() {
        _query.xdoNss(() -> _query.queryPlayer());
        return new DbPlayerNss(_query.queryPlayer());
    }
}
