package dev.wolfort.dbflute.cbean.nss;

import dev.wolfort.dbflute.cbean.cq.DbMessageFavoriteCQ;

/**
 * The nest select set-upper of message_favorite.
 * @author DBFlute(AutoGenerator)
 */
public class DbMessageFavoriteNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DbMessageFavoriteCQ _query;
    public DbMessageFavoriteNss(DbMessageFavoriteCQ query) { _query = query; }
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
     * MESSAGE by my message_id, named 'message'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public DbMessageNss withMessage() {
        _query.xdoNss(() -> _query.queryMessage());
        return new DbMessageNss(_query.queryMessage());
    }
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
