package dev.wolfort.dbflute.cbean.nss;

import dev.wolfort.dbflute.cbean.cq.DbCharaImageCQ;

/**
 * The nest select set-upper of chara_image.
 * @author DBFlute(AutoGenerator)
 */
public class DbCharaImageNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DbCharaImageCQ _query;
    public DbCharaImageNss(DbCharaImageCQ query) { _query = query; }
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
}
