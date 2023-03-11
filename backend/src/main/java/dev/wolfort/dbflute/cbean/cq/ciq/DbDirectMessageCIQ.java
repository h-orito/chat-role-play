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
 * The condition-query for in-line of direct_message.
 * @author DBFlute(AutoGenerator)
 */
public class DbDirectMessageCIQ extends DbAbstractBsDirectMessageCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbBsDirectMessageCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbDirectMessageCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, DbBsDirectMessageCQ myCQ) {
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
    protected ConditionValue xgetCValueDirectMessageId() { return _myCQ.xdfgetDirectMessageId(); }
    protected ConditionValue xgetCValueGameId() { return _myCQ.xdfgetGameId(); }
    protected ConditionValue xgetCValueGamePlayerGroupId() { return _myCQ.xdfgetGamePlayerGroupId(); }
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
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueRegisterTrace() { return _myCQ.xdfgetRegisterTrace(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected ConditionValue xgetCValueUpdateTrace() { return _myCQ.xdfgetUpdateTrace(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(DbDirectMessageCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return DbDirectMessageCB.class.getName(); }
    protected String xinCQ() { return DbDirectMessageCQ.class.getName(); }
}
