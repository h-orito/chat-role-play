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
 * The condition-query for in-line of game_period.
 * @author DBFlute(AutoGenerator)
 */
public class DbGamePeriodCIQ extends DbAbstractBsGamePeriodCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbBsGamePeriodCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbGamePeriodCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, DbBsGamePeriodCQ myCQ) {
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
    protected ConditionValue xgetCValueGamePeriodId() { return _myCQ.xdfgetGamePeriodId(); }
    public String keepGamePeriodId_ExistsReferrer_MessageList(DbMessageCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepGamePeriodId_ExistsReferrer_DirectMessageList(DbDirectMessageCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepGamePeriodId_NotExistsReferrer_MessageList(DbMessageCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepGamePeriodId_NotExistsReferrer_DirectMessageList(DbDirectMessageCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepGamePeriodId_SpecifyDerivedReferrer_MessageList(DbMessageCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepGamePeriodId_SpecifyDerivedReferrer_DirectMessageList(DbDirectMessageCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepGamePeriodId_QueryDerivedReferrer_MessageList(DbMessageCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGamePeriodId_QueryDerivedReferrer_MessageListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGamePeriodId_QueryDerivedReferrer_DirectMessageList(DbDirectMessageCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGamePeriodId_QueryDerivedReferrer_DirectMessageListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueGameId() { return _myCQ.xdfgetGameId(); }
    protected ConditionValue xgetCValuePeriod() { return _myCQ.xdfgetPeriod(); }
    protected ConditionValue xgetCValuePrefix() { return _myCQ.xdfgetPrefix(); }
    protected ConditionValue xgetCValueSuffix() { return _myCQ.xdfgetSuffix(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueRegisterTrace() { return _myCQ.xdfgetRegisterTrace(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected ConditionValue xgetCValueUpdateTrace() { return _myCQ.xdfgetUpdateTrace(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(DbGamePeriodCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(DbGamePeriodCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(DbGamePeriodCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(DbGamePeriodCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return DbGamePeriodCB.class.getName(); }
    protected String xinCQ() { return DbGamePeriodCQ.class.getName(); }
}
