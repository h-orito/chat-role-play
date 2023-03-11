package dev.wolfort.dbflute.cbean.nss;

import dev.wolfort.dbflute.cbean.cq.DbGamePlayerCQ;

/**
 * The nest select set-upper of game_player.
 * @author DBFlute(AutoGenerator)
 */
public class DbGamePlayerNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DbGamePlayerCQ _query;
    public DbGamePlayerNss(DbGamePlayerCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * CHARA by my chara_id, named 'chara'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public DbCharaNss withChara() {
        _query.xdoNss(() -> _query.queryChara());
        return new DbCharaNss(_query.queryChara());
    }
    /**
     * With nested relation columns to select clause. <br>
     * GAME by my game_id, named 'game'.
     */
    public void withGame() {
        _query.xdoNss(() -> _query.queryGame());
    }
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
