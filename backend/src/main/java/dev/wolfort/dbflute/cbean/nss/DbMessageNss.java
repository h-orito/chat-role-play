package dev.wolfort.dbflute.cbean.nss;

import dev.wolfort.dbflute.cbean.cq.DbMessageCQ;

/**
 * The nest select set-upper of message.
 * @author DBFlute(AutoGenerator)
 */
public class DbMessageNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DbMessageCQ _query;
    public DbMessageNss(DbMessageCQ query) { _query = query; }
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
     * GAME_PERIOD by my game_period_id, named 'gamePeriod'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public DbGamePeriodNss withGamePeriod() {
        _query.xdoNss(() -> _query.queryGamePeriod());
        return new DbGamePeriodNss(_query.queryGamePeriod());
    }
    /**
     * With nested relation columns to select clause. <br>
     * GAME_PLAYER by my from_game_player_id, named 'gamePlayer'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public DbGamePlayerNss withGamePlayer() {
        _query.xdoNss(() -> _query.queryGamePlayer());
        return new DbGamePlayerNss(_query.queryGamePlayer());
    }
}
