package dev.wolfort.dbflute.cbean.nss;

import dev.wolfort.dbflute.cbean.cq.DbGamePeriodCQ;

/**
 * The nest select set-upper of game_period.
 * @author DBFlute(AutoGenerator)
 */
public class DbGamePeriodNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DbGamePeriodCQ _query;
    public DbGamePeriodNss(DbGamePeriodCQ query) { _query = query; }
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
}
