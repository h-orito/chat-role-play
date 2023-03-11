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
 * The condition-query for in-line of game_player.
 * @author DBFlute(AutoGenerator)
 */
public class DbGamePlayerCIQ extends DbAbstractBsGamePlayerCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbBsGamePlayerCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbGamePlayerCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, DbBsGamePlayerCQ myCQ) {
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
    protected ConditionValue xgetCValueGamePlayerId() { return _myCQ.xdfgetGamePlayerId(); }
    public String keepGamePlayerId_ExistsReferrer_GamePlayerGroupRelList(DbGamePlayerGroupRelCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepGamePlayerId_ExistsReferrer_MessageList(DbMessageCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepGamePlayerId_ExistsReferrer_MessageFavoriteList(DbMessageFavoriteCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepGamePlayerId_ExistsReferrer_DirectMessageList(DbDirectMessageCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepGamePlayerId_NotExistsReferrer_GamePlayerGroupRelList(DbGamePlayerGroupRelCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepGamePlayerId_NotExistsReferrer_MessageList(DbMessageCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepGamePlayerId_NotExistsReferrer_MessageFavoriteList(DbMessageFavoriteCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepGamePlayerId_NotExistsReferrer_DirectMessageList(DbDirectMessageCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepGamePlayerId_SpecifyDerivedReferrer_GamePlayerGroupRelList(DbGamePlayerGroupRelCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepGamePlayerId_SpecifyDerivedReferrer_MessageList(DbMessageCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepGamePlayerId_SpecifyDerivedReferrer_MessageFavoriteList(DbMessageFavoriteCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepGamePlayerId_SpecifyDerivedReferrer_DirectMessageList(DbDirectMessageCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepGamePlayerId_QueryDerivedReferrer_GamePlayerGroupRelList(DbGamePlayerGroupRelCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGamePlayerId_QueryDerivedReferrer_GamePlayerGroupRelListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGamePlayerId_QueryDerivedReferrer_MessageList(DbMessageCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGamePlayerId_QueryDerivedReferrer_MessageListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGamePlayerId_QueryDerivedReferrer_MessageFavoriteList(DbMessageFavoriteCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGamePlayerId_QueryDerivedReferrer_MessageFavoriteListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGamePlayerId_QueryDerivedReferrer_DirectMessageList(DbDirectMessageCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGamePlayerId_QueryDerivedReferrer_DirectMessageListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueGameId() { return _myCQ.xdfgetGameId(); }
    protected ConditionValue xgetCValuePlayerId() { return _myCQ.xdfgetPlayerId(); }
    protected ConditionValue xgetCValueGamePlayerName() { return _myCQ.xdfgetGamePlayerName(); }
    protected ConditionValue xgetCValueCharaId() { return _myCQ.xdfgetCharaId(); }
    protected ConditionValue xgetCValueIsDeleted() { return _myCQ.xdfgetIsDeleted(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueRegisterTrace() { return _myCQ.xdfgetRegisterTrace(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected ConditionValue xgetCValueUpdateTrace() { return _myCQ.xdfgetUpdateTrace(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(DbGamePlayerCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(DbGamePlayerCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(DbGamePlayerCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(DbGamePlayerCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return DbGamePlayerCB.class.getName(); }
    protected String xinCQ() { return DbGamePlayerCQ.class.getName(); }
}
