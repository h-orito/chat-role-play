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
 * The condition-query for in-line of game.
 * @author DBFlute(AutoGenerator)
 */
public class DbGameCIQ extends DbAbstractBsGameCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbBsGameCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbGameCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, DbBsGameCQ myCQ) {
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
    protected ConditionValue xgetCValueGameId() { return _myCQ.xdfgetGameId(); }
    public String keepGameId_ExistsReferrer_GamePeriodList(DbGamePeriodCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepGameId_ExistsReferrer_GamePlayerList(DbGamePlayerCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepGameId_ExistsReferrer_GameSettingList(DbGameSettingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepGameId_ExistsReferrer_MessageList(DbMessageCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepGameId_ExistsReferrer_MessageReplyList(DbMessageReplyCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepGameId_ExistsReferrer_MessageFavoriteList(DbMessageFavoriteCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepGameId_ExistsReferrer_DirectMessageList(DbDirectMessageCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepGameId_NotExistsReferrer_GamePeriodList(DbGamePeriodCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepGameId_NotExistsReferrer_GamePlayerList(DbGamePlayerCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepGameId_NotExistsReferrer_GameSettingList(DbGameSettingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepGameId_NotExistsReferrer_MessageList(DbMessageCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepGameId_NotExistsReferrer_MessageReplyList(DbMessageReplyCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepGameId_NotExistsReferrer_MessageFavoriteList(DbMessageFavoriteCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepGameId_NotExistsReferrer_DirectMessageList(DbDirectMessageCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepGameId_SpecifyDerivedReferrer_GamePeriodList(DbGamePeriodCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepGameId_SpecifyDerivedReferrer_GamePlayerList(DbGamePlayerCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepGameId_SpecifyDerivedReferrer_GameSettingList(DbGameSettingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepGameId_SpecifyDerivedReferrer_MessageList(DbMessageCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepGameId_SpecifyDerivedReferrer_MessageReplyList(DbMessageReplyCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepGameId_SpecifyDerivedReferrer_MessageFavoriteList(DbMessageFavoriteCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepGameId_SpecifyDerivedReferrer_DirectMessageList(DbDirectMessageCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepGameId_QueryDerivedReferrer_GamePeriodList(DbGamePeriodCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGameId_QueryDerivedReferrer_GamePeriodListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGameId_QueryDerivedReferrer_GamePlayerList(DbGamePlayerCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGameId_QueryDerivedReferrer_GamePlayerListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGameId_QueryDerivedReferrer_GameSettingList(DbGameSettingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGameId_QueryDerivedReferrer_GameSettingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGameId_QueryDerivedReferrer_MessageList(DbMessageCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGameId_QueryDerivedReferrer_MessageListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGameId_QueryDerivedReferrer_MessageReplyList(DbMessageReplyCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGameId_QueryDerivedReferrer_MessageReplyListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGameId_QueryDerivedReferrer_MessageFavoriteList(DbMessageFavoriteCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGameId_QueryDerivedReferrer_MessageFavoriteListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGameId_QueryDerivedReferrer_DirectMessageList(DbDirectMessageCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGameId_QueryDerivedReferrer_DirectMessageListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueGameName() { return _myCQ.xdfgetGameName(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueRegisterTrace() { return _myCQ.xdfgetRegisterTrace(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected ConditionValue xgetCValueUpdateTrace() { return _myCQ.xdfgetUpdateTrace(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(DbGameCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(DbGameCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(DbGameCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(DbGameCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return DbGameCB.class.getName(); }
    protected String xinCQ() { return DbGameCQ.class.getName(); }
}
