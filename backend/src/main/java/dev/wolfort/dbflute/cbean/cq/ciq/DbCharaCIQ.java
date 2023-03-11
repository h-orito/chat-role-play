package dev.wolfort.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import dev.wolfort.dbflute.cbean.*;
import dev.wolfort.dbflute.cbean.cq.bs.*;
import dev.wolfort.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of chara.
 * @author DBFlute(AutoGenerator)
 */
public class DbCharaCIQ extends DbAbstractBsCharaCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbBsCharaCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbCharaCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, DbBsCharaCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueCharaId() { return _myCQ.xdfgetCharaId(); }
    public String keepCharaId_ExistsReferrer_CharaImageList(DbCharaImageCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCharaId_ExistsReferrer_GamePlayerList(DbGamePlayerCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCharaId_NotExistsReferrer_CharaImageList(DbCharaImageCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCharaId_NotExistsReferrer_GamePlayerList(DbGamePlayerCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCharaId_SpecifyDerivedReferrer_CharaImageList(DbCharaImageCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCharaId_SpecifyDerivedReferrer_GamePlayerList(DbGamePlayerCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCharaId_QueryDerivedReferrer_CharaImageList(DbCharaImageCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCharaId_QueryDerivedReferrer_CharaImageListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCharaId_QueryDerivedReferrer_GamePlayerList(DbGamePlayerCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCharaId_QueryDerivedReferrer_GamePlayerListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueCharaName() { return _myCQ.xdfgetCharaName(); }
    protected ConditionValue xgetCValueCharachipId() { return _myCQ.xdfgetCharachipId(); }
    protected ConditionValue xgetCValueDisplayWidth() { return _myCQ.xdfgetDisplayWidth(); }
    protected ConditionValue xgetCValueDisplayHeight() { return _myCQ.xdfgetDisplayHeight(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueRegisterTrace() { return _myCQ.xdfgetRegisterTrace(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected ConditionValue xgetCValueUpdateTrace() { return _myCQ.xdfgetUpdateTrace(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(DbCharaCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(DbCharaCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(DbCharaCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(DbCharaCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return DbCharaCB.class.getName(); }
    protected String xinCQ() { return DbCharaCQ.class.getName(); }
}
