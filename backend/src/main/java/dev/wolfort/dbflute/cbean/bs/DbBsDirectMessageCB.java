package dev.wolfort.dbflute.cbean.bs;

import org.dbflute.cbean.AbstractConditionBean;
import org.dbflute.cbean.ConditionBean;
import org.dbflute.cbean.ConditionQuery;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.dream.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.cbean.sqlclause.SqlClauseCreator;
import org.dbflute.cbean.scoping.*;
import org.dbflute.dbmeta.DBMetaProvider;
import org.dbflute.twowaysql.factory.SqlAnalyzerFactory;
import org.dbflute.twowaysql.style.BoundDateDisplayTimeZoneProvider;
import dev.wolfort.dbflute.allcommon.DbDBFluteConfig;
import dev.wolfort.dbflute.allcommon.DbDBMetaInstanceHandler;
import dev.wolfort.dbflute.allcommon.DbImplementedInvokerAssistant;
import dev.wolfort.dbflute.allcommon.DbImplementedSqlClauseCreator;
import dev.wolfort.dbflute.cbean.*;
import dev.wolfort.dbflute.cbean.cq.*;
import dev.wolfort.dbflute.cbean.nss.*;

/**
 * The base condition-bean of direct_message.
 * @author DBFlute(AutoGenerator)
 */
public class DbBsDirectMessageCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbDirectMessageCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbBsDirectMessageCB() {
        if (DbDBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (DbDBFluteConfig.getInstance().isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
        }
        if (DbDBFluteConfig.getInstance().isNonSpecifiedColumnAccessAllowed()) {
            enableNonSpecifiedColumnAccess();
        }
        if (DbDBFluteConfig.getInstance().isSpecifyColumnRequired()) {
            enableSpecifyColumnRequired();
        }
        xsetSpecifyColumnRequiredExceptDeterminer(DbDBFluteConfig.getInstance().getSpecifyColumnRequiredExceptDeterminer());
        if (DbDBFluteConfig.getInstance().isSpecifyColumnRequiredWarningOnly()) {
            xenableSpecifyColumnRequiredWarningOnly();
        }
        if (DbDBFluteConfig.getInstance().isQueryUpdateCountPreCheck()) {
            enableQueryUpdateCountPreCheck();
        }
    }

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    @Override
    protected SqlClause createSqlClause() {
        SqlClauseCreator creator = DbDBFluteConfig.getInstance().getSqlClauseCreator();
        if (creator != null) {
            return creator.createSqlClause(this);
        }
        return new DbImplementedSqlClauseCreator().createSqlClause(this); // as default
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return DbDBMetaInstanceHandler.getProvider(); // as default
    }

    public String asTableDbName() {
        return "direct_message";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param directMessageId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @param gameId : PK, UQ+, NotNull, INT UNSIGNED(10), FK to game. (NotNull)
     * @return this. (NotNull)
     */
    public DbDirectMessageCB acceptPK(Long directMessageId, Integer gameId) {
        assertObjectNotNull("directMessageId", directMessageId);assertObjectNotNull("gameId", gameId);
        DbBsDirectMessageCB cb = this;
        cb.query().setDirectMessageId_Equal(directMessageId);cb.query().setGameId_Equal(gameId);
        return (DbDirectMessageCB)this;
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param gameId : PK, UQ+, NotNull, INT UNSIGNED(10), FK to game. (NotNull)
     * @param gamePlayerGroupId : +UQ, IX, NotNull, INT UNSIGNED(10), FK to game_player_group. (NotNull)
     * @param messageNumber : +UQ, INT UNSIGNED(10). (NotNull)
     * @return this. (NotNull)
     */
    public DbDirectMessageCB acceptUniqueOf(Integer gameId, Integer gamePlayerGroupId, Integer messageNumber) {
        assertObjectNotNull("gameId", gameId);assertObjectNotNull("gamePlayerGroupId", gamePlayerGroupId);assertObjectNotNull("messageNumber", messageNumber);
        DbBsDirectMessageCB cb = this;
        cb.query().setGameId_Equal(gameId);cb.query().setGamePlayerGroupId_Equal(gamePlayerGroupId);cb.query().setMessageNumber_Equal(messageNumber);
        return (DbDirectMessageCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_DirectMessageId_Asc();
        query().addOrderBy_GameId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_DirectMessageId_Desc();
        query().addOrderBy_GameId_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Prepare for various queries. <br>
     * Examples of main functions are following:
     * <pre>
     * <span style="color: #3F7E5E">// Basic Queries</span>
     * cb.query().setMemberId_Equal(value);        <span style="color: #3F7E5E">// =</span>
     * cb.query().setMemberId_NotEqual(value);     <span style="color: #3F7E5E">// !=</span>
     * cb.query().setMemberId_GreaterThan(value);  <span style="color: #3F7E5E">// &gt;</span>
     * cb.query().setMemberId_LessThan(value);     <span style="color: #3F7E5E">// &lt;</span>
     * cb.query().setMemberId_GreaterEqual(value); <span style="color: #3F7E5E">// &gt;=</span>
     * cb.query().setMemberId_LessEqual(value);    <span style="color: #3F7E5E">// &lt;=</span>
     * cb.query().setMemberName_InScope(valueList);    <span style="color: #3F7E5E">// in ('a', 'b')</span>
     * cb.query().setMemberName_NotInScope(valueList); <span style="color: #3F7E5E">// not in ('a', 'b')</span>
     * <span style="color: #3F7E5E">// LikeSearch with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {like ... [options]}</span>
     * cb.query().setMemberName_LikeSearch(value, option);
     * cb.query().setMemberName_NotLikeSearch(value, option); <span style="color: #3F7E5E">// not like ...</span>
     * <span style="color: #3F7E5E">// FromTo with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {(default) fromDatetime &lt;= BIRTHDATE &lt;= toDatetime}</span>
     * cb.query().setBirthdate_FromTo(fromDatetime, toDatetime, option);
     * <span style="color: #3F7E5E">// DateFromTo: (Date means yyyy/MM/dd)</span>
     * <span style="color: #3F7E5E">// {fromDate &lt;= BIRTHDATE &lt; toDate + 1 day}</span>
     * cb.query().setBirthdate_IsNull();    <span style="color: #3F7E5E">// is null</span>
     * cb.query().setBirthdate_IsNotNull(); <span style="color: #3F7E5E">// is not null</span>
     *
     * <span style="color: #3F7E5E">// ExistsReferrer: (correlated sub-query)</span>
     * <span style="color: #3F7E5E">// {where exists (select PURCHASE_ID from PURCHASE where ...)}</span>
     * cb.query().existsPurchase(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.query().set... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     * });
     * cb.query().notExistsPurchase...
     *
     * <span style="color: #3F7E5E">// (Query)DerivedReferrer: (correlated sub-query)</span>
     * cb.query().derivedPurchaseList().max(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.specify().columnPurchasePrice(); <span style="color: #3F7E5E">// derived column for function</span>
     *     purchaseCB.query().set... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     * }).greaterEqual(value);
     *
     * <span style="color: #3F7E5E">// ScalarCondition: (self-table sub-query)</span>
     * cb.query().scalar_Equal().max(scalarCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     scalarCB.specify().columnBirthdate(); <span style="color: #3F7E5E">// derived column for function</span>
     *     scalarCB.query().set... <span style="color: #3F7E5E">// scalar sub-query condition</span>
     * });
     *
     * <span style="color: #3F7E5E">// OrderBy</span>
     * cb.query().addOrderBy_MemberName_Asc();
     * cb.query().addOrderBy_MemberName_Desc().withManualOrder(option);
     * cb.query().addOrderBy_MemberName_Desc().withNullsFirst();
     * cb.query().addOrderBy_MemberName_Desc().withNullsLast();
     * cb.query().addSpecifiedDerivedOrderBy_Desc(aliasName);
     *
     * <span style="color: #3F7E5E">// Query(Relation)</span>
     * cb.query().queryMemberStatus()...;
     * cb.query().queryMemberAddressAsValid(targetDate)...;
     * </pre>
     * @return The instance of condition-query for base-point table to set up query. (NotNull)
     */
    public DbDirectMessageCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public DbDirectMessageCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected DbDirectMessageCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected DbDirectMessageCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected DbDirectMessageCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        DbDirectMessageCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected DbDirectMessageCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new DbDirectMessageCQ(childQuery, sqlClause, aliasName, nestLevel);
    }

    /**
     * {@inheritDoc}
     */
    public ConditionQuery localCQ() {
        return doGetConditionQuery();
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    /**
     * Set up 'union' for base-point table. <br>
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">union</span>(<span style="color: #553000">unionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">unionCB</span>.query().set...
     * });
     * </pre>
     * @param unionCBLambda The callback for query of 'union'. (NotNull)
     */
    public void union(UnionQuery<DbDirectMessageCB> unionCBLambda) {
        final DbDirectMessageCB cb = new DbDirectMessageCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final DbDirectMessageCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br>
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">unionAll</span>(<span style="color: #553000">unionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">unionCB</span>.query().set...
     * });
     * </pre>
     * @param unionCBLambda The callback for query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<DbDirectMessageCB> unionCBLambda) {
        final DbDirectMessageCB cb = new DbDirectMessageCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final DbDirectMessageCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    /**
     * Set up relation columns to select clause. <br>
     * GAME by my game_id, named 'game'.
     * <pre>
     * <span style="color: #0000C0">directMessageBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_Game()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">directMessage</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">directMessage</span>.<span style="color: #CC4747">getGame()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_Game() {
        assertSetupSelectPurpose("game");
        doSetupSelect(() -> query().queryGame());
    }

    /**
     * Set up relation columns to select clause. <br>
     * GAME_PLAYER_GROUP by my game_player_group_id, named 'gamePlayerGroup'.
     * <pre>
     * <span style="color: #0000C0">directMessageBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_GamePlayerGroup()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">directMessage</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">directMessage</span>.<span style="color: #CC4747">getGamePlayerGroup()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_GamePlayerGroup() {
        assertSetupSelectPurpose("gamePlayerGroup");
        if (hasSpecifiedLocalColumn()) {
            specify().columnGamePlayerGroupId();
        }
        doSetupSelect(() -> query().queryGamePlayerGroup());
    }

    protected DbGamePeriodNss _nssGamePeriod;
    public DbGamePeriodNss xdfgetNssGamePeriod() {
        if (_nssGamePeriod == null) { _nssGamePeriod = new DbGamePeriodNss(null); }
        return _nssGamePeriod;
    }
    /**
     * Set up relation columns to select clause. <br>
     * GAME_PERIOD by my game_period_id, named 'gamePeriod'.
     * <pre>
     * <span style="color: #0000C0">directMessageBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_GamePeriod()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">directMessage</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">directMessage</span>.<span style="color: #CC4747">getGamePeriod()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public DbGamePeriodNss setupSelect_GamePeriod() {
        assertSetupSelectPurpose("gamePeriod");
        if (hasSpecifiedLocalColumn()) {
            specify().columnGamePeriodId();
        }
        doSetupSelect(() -> query().queryGamePeriod());
        if (_nssGamePeriod == null || !_nssGamePeriod.hasConditionQuery())
        { _nssGamePeriod = new DbGamePeriodNss(query().queryGamePeriod()); }
        return _nssGamePeriod;
    }

    protected DbGamePlayerNss _nssGamePlayer;
    public DbGamePlayerNss xdfgetNssGamePlayer() {
        if (_nssGamePlayer == null) { _nssGamePlayer = new DbGamePlayerNss(null); }
        return _nssGamePlayer;
    }
    /**
     * Set up relation columns to select clause. <br>
     * GAME_PLAYER by my from_game_player_id, named 'gamePlayer'.
     * <pre>
     * <span style="color: #0000C0">directMessageBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_GamePlayer()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">directMessage</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">directMessage</span>.<span style="color: #CC4747">getGamePlayer()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public DbGamePlayerNss setupSelect_GamePlayer() {
        assertSetupSelectPurpose("gamePlayer");
        if (hasSpecifiedLocalColumn()) {
            specify().columnFromGamePlayerId();
        }
        doSetupSelect(() -> query().queryGamePlayer());
        if (_nssGamePlayer == null || !_nssGamePlayer.hasConditionQuery())
        { _nssGamePlayer = new DbGamePlayerNss(query().queryGamePlayer()); }
        return _nssGamePlayer;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected HpSpecification _specification;

    /**
     * Prepare for SpecifyColumn, (Specify)DerivedReferrer. <br>
     * This method should be called after SetupSelect.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.setupSelect_MemberStatus(); <span style="color: #3F7E5E">// should be called before specify()</span>
     *     <span style="color: #553000">cb</span>.specify().columnMemberName();
     *     <span style="color: #553000">cb</span>.specify().specifyMemberStatus().columnMemberStatusName();
     *     <span style="color: #553000">cb</span>.specify().derivedPurchaseList().max(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.specify().columnPurchaseDatetime();
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *     }, aliasName);
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ...
     * });
     * </pre>
     * @return The instance of specification. (NotNull)
     */
    public HpSpecification specify() {
        assertSpecifyPurpose();
        if (_specification == null) { _specification = new HpSpecification(this
            , xcreateSpQyCall(() -> true, () -> xdfgetConditionQuery())
            , _purpose, getDBMetaProvider(), xcSDRFnFc()); }
        return _specification;
    }

    public HpColumnSpHandler localSp() {
        return specify();
    }

    public boolean hasSpecifiedLocalColumn() {
        return _specification != null && _specification.hasSpecifiedColumn();
    }

    public static class HpSpecification extends HpAbstractSpecification<DbDirectMessageCQ> {
        protected DbGameCB.HpSpecification _game;
        protected DbGamePlayerGroupCB.HpSpecification _gamePlayerGroup;
        protected DbGamePeriodCB.HpSpecification _gamePeriod;
        protected DbGamePlayerCB.HpSpecification _gamePlayer;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<DbDirectMessageCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * direct_message_id: {PK, ID, NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDirectMessageId() { return doColumn("direct_message_id"); }
        /**
         * game_id: {PK, UQ+, NotNull, INT UNSIGNED(10), FK to game}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnGameId() { return doColumn("game_id"); }
        /**
         * game_player_group_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to game_player_group}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnGamePlayerGroupId() { return doColumn("game_player_group_id"); }
        /**
         * game_period_id: {IX, NotNull, INT UNSIGNED(10), FK to game_period}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnGamePeriodId() { return doColumn("game_period_id"); }
        /**
         * from_game_player_id: {IX, INT UNSIGNED(10), FK to game_player}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFromGamePlayerId() { return doColumn("from_game_player_id"); }
        /**
         * from_game_player_name: {VARCHAR(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFromGamePlayerName() { return doColumn("from_game_player_name"); }
        /**
         * from_game_player_face_type_code: {VARCHAR(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFromGamePlayerFaceTypeCode() { return doColumn("from_game_player_face_type_code"); }
        /**
         * message_content: {VARCHAR(10000)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMessageContent() { return doColumn("message_content"); }
        /**
         * message_number: {+UQ, INT UNSIGNED(10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMessageNumber() { return doColumn("message_number"); }
        /**
         * message_datetime: {NotNull, DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMessageDatetime() { return doColumn("message_datetime"); }
        /**
         * message_unix_timestamp_milli: {NotNull, BIGINT UNSIGNED(20)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMessageUnixTimestampMilli() { return doColumn("message_unix_timestamp_milli"); }
        /**
         * is_deleted: {NotNull, BIT}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnIsDeleted() { return doColumn("is_deleted"); }
        /**
         * is_convert_disable: {NotNull, BIT}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnIsConvertDisable() { return doColumn("is_convert_disable"); }
        /**
         * register_datetime: {NotNull, DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRegisterDatetime() { return doColumn("register_datetime"); }
        /**
         * register_trace: {NotNull, VARCHAR(64)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRegisterTrace() { return doColumn("register_trace"); }
        /**
         * update_datetime: {NotNull, DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdateDatetime() { return doColumn("update_datetime"); }
        /**
         * update_trace: {NotNull, VARCHAR(64)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdateTrace() { return doColumn("update_trace"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnDirectMessageId(); // PK
            columnGameId(); // PK
            if (qyCall().qy().hasConditionQueryGamePlayerGroup()
                    || qyCall().qy().xgetReferrerQuery() instanceof DbGamePlayerGroupCQ) {
                columnGamePlayerGroupId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryGamePeriod()
                    || qyCall().qy().xgetReferrerQuery() instanceof DbGamePeriodCQ) {
                columnGamePeriodId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryGamePlayer()
                    || qyCall().qy().xgetReferrerQuery() instanceof DbGamePlayerCQ) {
                columnFromGamePlayerId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "direct_message"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * GAME by my game_id, named 'game'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public DbGameCB.HpSpecification specifyGame() {
            assertRelation("game");
            if (_game == null) {
                _game = new DbGameCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryGame()
                                    , () -> _qyCall.qy().queryGame())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _game.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryGame()
                      , () -> xsyncQyCall().qy().queryGame()));
                }
            }
            return _game;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * GAME_PLAYER_GROUP by my game_player_group_id, named 'gamePlayerGroup'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public DbGamePlayerGroupCB.HpSpecification specifyGamePlayerGroup() {
            assertRelation("gamePlayerGroup");
            if (_gamePlayerGroup == null) {
                _gamePlayerGroup = new DbGamePlayerGroupCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryGamePlayerGroup()
                                    , () -> _qyCall.qy().queryGamePlayerGroup())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _gamePlayerGroup.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryGamePlayerGroup()
                      , () -> xsyncQyCall().qy().queryGamePlayerGroup()));
                }
            }
            return _gamePlayerGroup;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * GAME_PERIOD by my game_period_id, named 'gamePeriod'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public DbGamePeriodCB.HpSpecification specifyGamePeriod() {
            assertRelation("gamePeriod");
            if (_gamePeriod == null) {
                _gamePeriod = new DbGamePeriodCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryGamePeriod()
                                    , () -> _qyCall.qy().queryGamePeriod())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _gamePeriod.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryGamePeriod()
                      , () -> xsyncQyCall().qy().queryGamePeriod()));
                }
            }
            return _gamePeriod;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * GAME_PLAYER by my from_game_player_id, named 'gamePlayer'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public DbGamePlayerCB.HpSpecification specifyGamePlayer() {
            assertRelation("gamePlayer");
            if (_gamePlayer == null) {
                _gamePlayer = new DbGamePlayerCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryGamePlayer()
                                    , () -> _qyCall.qy().queryGamePlayer())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _gamePlayer.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryGamePlayer()
                      , () -> xsyncQyCall().qy().queryGamePlayer()));
                }
            }
            return _gamePlayer;
        }
    }

    // ===================================================================================
    //                                                                        Dream Cruise
    //                                                                        ============
    /**
     * Welcome to the Dream Cruise for condition-bean deep world. <br>
     * This is very specialty so you can get the frontier spirit. Bon voyage!
     * @return The condition-bean for dream cruise, which is linked to main condition-bean.
     */
    public DbDirectMessageCB dreamCruiseCB() {
        DbDirectMessageCB cb = new DbDirectMessageCB();
        cb.xsetupForDreamCruise((DbDirectMessageCB) this);
        return cb;
    }

    protected ConditionBean xdoCreateDreamCruiseCB() {
        return dreamCruiseCB();
    }

    // [DBFlute-0.9.5.3]
    // ===================================================================================
    //                                                                        Column Query
    //                                                                        ============
    /**
     * Set up column-query. {column1 = column2}
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &lt; BAR</span>
     * cb.<span style="color: #CC4747">columnQuery</span>(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     * }).lessThan(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param colCBLambda The callback for specify-query of left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<DbDirectMessageCB> columnQuery(final SpecifyQuery<DbDirectMessageCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected DbDirectMessageCB xcreateColumnQueryCB() {
        DbDirectMessageCB cb = new DbDirectMessageCB();
        cb.xsetupForColumnQuery((DbDirectMessageCB)this);
        return cb;
    }

    // [DBFlute-0.9.6.3]
    // ===================================================================================
    //                                                                       OrScope Query
    //                                                                       =============
    /**
     * Set up the query for or-scope. <br>
     * (Same-column-and-same-condition-key conditions are allowed in or-scope)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or BAR = '...')</span>
     * cb.<span style="color: #CC4747">orScopeQuery</span>(<span style="color: #553000">orCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orCB</span>.query().setFoo...
     *     <span style="color: #553000">orCB</span>.query().setBar...
     * });
     * </pre>
     * @param orCBLambda The callback for query of or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<DbDirectMessageCB> orCBLambda) {
        xorSQ((DbDirectMessageCB)this, orCBLambda);
    }

    /**
     * Set up the and-part of or-scope. <br>
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #994747">orScopeQuery</span>(<span style="color: #553000">orCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orCB</span>.query().setFoo...
     *     <span style="color: #553000">orCB</span>.<span style="color: #CC4747">orScopeQueryAndPart</span>(<span style="color: #553000">andCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">andCB</span>.query().setBar...
     *         <span style="color: #553000">andCB</span>.query().setQux...
     *     });
     * });
     * </pre>
     * @param andCBLambda The callback for query of and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<DbDirectMessageCB> andCBLambda) {
        xorSQAP((DbDirectMessageCB)this, andCBLambda);
    }

    // ===================================================================================
    //                                                                          DisplaySQL
    //                                                                          ==========
    @Override
    protected SqlAnalyzerFactory getSqlAnalyzerFactory()
    { return new DbImplementedInvokerAssistant().assistSqlAnalyzerFactory(); }
    @Override
    protected String getConfiguredLogDatePattern() { return DbDBFluteConfig.getInstance().getLogDatePattern(); }
    @Override
    protected String getConfiguredLogTimestampPattern() { return DbDBFluteConfig.getInstance().getLogTimestampPattern(); }
    @Override
    protected String getConfiguredLogTimePattern() { return DbDBFluteConfig.getInstance().getLogTimePattern(); }
    @Override
    protected BoundDateDisplayTimeZoneProvider getConfiguredLogTimeZoneProvider() { return DbDBFluteConfig.getInstance().getLogTimeZoneProvider(); }

    // ===================================================================================
    //                                                                       Meta Handling
    //                                                                       =============
    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Purpose Type
    //                                                                        ============
    @Override
    protected void xprepareSyncQyCall(ConditionBean mainCB) {
        final DbDirectMessageCB cb;
        if (mainCB != null) {
            cb = (DbDirectMessageCB)mainCB;
        } else {
            cb = new DbDirectMessageCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return DbDirectMessageCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return DbDirectMessageCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
