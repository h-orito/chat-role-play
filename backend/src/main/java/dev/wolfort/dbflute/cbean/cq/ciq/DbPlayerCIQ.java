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
 * The condition-query for in-line of player.
 * @author DBFlute(AutoGenerator)
 */
public class DbPlayerCIQ extends DbAbstractBsPlayerCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbBsPlayerCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbPlayerCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, DbBsPlayerCQ myCQ) {
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
    protected ConditionValue xgetCValuePlayerId() { return _myCQ.xdfgetPlayerId(); }
    public String keepPlayerId_ExistsReferrer_GamePlayerList(DbGamePlayerCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepPlayerId_ExistsReferrer_PlayerAuthorityList(DbPlayerAuthorityCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepPlayerId_NotExistsReferrer_GamePlayerList(DbGamePlayerCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepPlayerId_NotExistsReferrer_PlayerAuthorityList(DbPlayerAuthorityCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepPlayerId_SpecifyDerivedReferrer_GamePlayerList(DbGamePlayerCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepPlayerId_SpecifyDerivedReferrer_PlayerAuthorityList(DbPlayerAuthorityCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepPlayerId_QueryDerivedReferrer_GamePlayerList(DbGamePlayerCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPlayerId_QueryDerivedReferrer_GamePlayerListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPlayerId_QueryDerivedReferrer_PlayerAuthorityList(DbPlayerAuthorityCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPlayerId_QueryDerivedReferrer_PlayerAuthorityListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValuePlayerName() { return _myCQ.xdfgetPlayerName(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueRegisterTrace() { return _myCQ.xdfgetRegisterTrace(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected ConditionValue xgetCValueUpdateTrace() { return _myCQ.xdfgetUpdateTrace(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(DbPlayerCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(DbPlayerCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(DbPlayerCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(DbPlayerCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return DbPlayerCB.class.getName(); }
    protected String xinCQ() { return DbPlayerCQ.class.getName(); }
}
