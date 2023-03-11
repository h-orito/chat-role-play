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
 * The condition-query for in-line of message.
 * @author DBFlute(AutoGenerator)
 */
public class DbMessageCIQ extends DbAbstractBsMessageCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbBsMessageCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbMessageCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, DbBsMessageCQ myCQ) {
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
    protected ConditionValue xgetCValueMessageId() { return _myCQ.xdfgetMessageId(); }
    public String keepMessageId_ExistsReferrer_MessageReplyByFromMessageIdList(DbMessageReplyCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMessageId_ExistsReferrer_MessageReplyByReplyMessageIdList(DbMessageReplyCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMessageId_ExistsReferrer_MessageFavoriteList(DbMessageFavoriteCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMessageId_NotExistsReferrer_MessageReplyByFromMessageIdList(DbMessageReplyCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMessageId_NotExistsReferrer_MessageReplyByReplyMessageIdList(DbMessageReplyCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMessageId_NotExistsReferrer_MessageFavoriteList(DbMessageFavoriteCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMessageId_SpecifyDerivedReferrer_MessageReplyByFromMessageIdList(DbMessageReplyCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepMessageId_SpecifyDerivedReferrer_MessageReplyByReplyMessageIdList(DbMessageReplyCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepMessageId_SpecifyDerivedReferrer_MessageFavoriteList(DbMessageFavoriteCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepMessageId_QueryDerivedReferrer_MessageReplyByFromMessageIdList(DbMessageReplyCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMessageId_QueryDerivedReferrer_MessageReplyByFromMessageIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMessageId_QueryDerivedReferrer_MessageReplyByReplyMessageIdList(DbMessageReplyCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMessageId_QueryDerivedReferrer_MessageReplyByReplyMessageIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMessageId_QueryDerivedReferrer_MessageFavoriteList(DbMessageFavoriteCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMessageId_QueryDerivedReferrer_MessageFavoriteListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueGameId() { return _myCQ.xdfgetGameId(); }
    protected ConditionValue xgetCValueMessageTypeCode() { return _myCQ.xdfgetMessageTypeCode(); }
    protected ConditionValue xgetCValueGamePeriodId() { return _myCQ.xdfgetGamePeriodId(); }
    protected ConditionValue xgetCValueFromGamePlayerId() { return _myCQ.xdfgetFromGamePlayerId(); }
    protected ConditionValue xgetCValueFromGamePlayerName() { return _myCQ.xdfgetFromGamePlayerName(); }
    protected ConditionValue xgetCValueFromGamePlayerFaceTypeCode() { return _myCQ.xdfgetFromGamePlayerFaceTypeCode(); }
    protected ConditionValue xgetCValueMessageContent() { return _myCQ.xdfgetMessageContent(); }
    protected ConditionValue xgetCValueMessageNumber() { return _myCQ.xdfgetMessageNumber(); }
    protected ConditionValue xgetCValueMessageDatetime() { return _myCQ.xdfgetMessageDatetime(); }
    protected ConditionValue xgetCValueMessageUnixTimestampMilli() { return _myCQ.xdfgetMessageUnixTimestampMilli(); }
    protected ConditionValue xgetCValueIsDeleted() { return _myCQ.xdfgetIsDeleted(); }
    protected ConditionValue xgetCValueIsConvertDisable() { return _myCQ.xdfgetIsConvertDisable(); }
    protected ConditionValue xgetCValueRepliedCount() { return _myCQ.xdfgetRepliedCount(); }
    protected ConditionValue xgetCValueFavoredCount() { return _myCQ.xdfgetFavoredCount(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueRegisterTrace() { return _myCQ.xdfgetRegisterTrace(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected ConditionValue xgetCValueUpdateTrace() { return _myCQ.xdfgetUpdateTrace(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(DbMessageCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return DbMessageCB.class.getName(); }
    protected String xinCQ() { return DbMessageCQ.class.getName(); }
}
