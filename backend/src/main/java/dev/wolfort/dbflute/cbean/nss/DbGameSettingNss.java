package dev.wolfort.dbflute.cbean.nss;

import dev.wolfort.dbflute.cbean.cq.DbGameSettingCQ;

/**
 * The nest select set-upper of game_setting.
 * @author DBFlute(AutoGenerator)
 */
public class DbGameSettingNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DbGameSettingCQ _query;
    public DbGameSettingNss(DbGameSettingCQ query) { _query = query; }
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
