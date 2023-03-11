package dev.wolfort.dbflute.cbean.nss;

import dev.wolfort.dbflute.cbean.cq.DbCharachipCQ;

/**
 * The nest select set-upper of charachip.
 * @author DBFlute(AutoGenerator)
 */
public class DbCharachipNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DbCharachipCQ _query;
    public DbCharachipNss(DbCharachipCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * DESIGNER by my designer_id, named 'designer'.
     */
    public void withDesigner() {
        _query.xdoNss(() -> _query.queryDesigner());
    }
}
