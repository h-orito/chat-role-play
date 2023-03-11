package dev.wolfort.dbflute.cbean.nss;

import dev.wolfort.dbflute.cbean.cq.DbCharaCQ;

/**
 * The nest select set-upper of chara.
 * @author DBFlute(AutoGenerator)
 */
public class DbCharaNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DbCharaCQ _query;
    public DbCharaNss(DbCharaCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * CHARACHIP by my charachip_id, named 'charachip'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public DbCharachipNss withCharachip() {
        _query.xdoNss(() -> _query.queryCharachip());
        return new DbCharachipNss(_query.queryCharachip());
    }
}
