package dev.wolfort.dbflute.bsbhv;

import java.util.List;

import org.dbflute.*;
import org.dbflute.bhv.*;
import org.dbflute.bhv.core.BehaviorCommandInvoker;
import org.dbflute.bhv.readable.*;
import org.dbflute.bhv.writable.*;
import org.dbflute.bhv.referrer.*;
import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.HpSLSFunction;
import org.dbflute.cbean.result.*;
import org.dbflute.exception.*;
import org.dbflute.hook.CommonColumnAutoSetupper;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.outsidesql.executor.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.bsbhv.loader.*;
import dev.wolfort.dbflute.exentity.*;
import dev.wolfort.dbflute.bsentity.dbmeta.*;
import dev.wolfort.dbflute.cbean.*;

/**
 * The behavior of GAME as TABLE. <br>
 * <pre>
 * [primary key]
 *     game_id
 *
 * [column]
 *     game_id, game_name, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     game_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     GAME_PERIOD, GAME_PLAYER, GAME_SETTING, MESSAGE, MESSAGE_REPLY, MESSAGE_FAVORITE, DIRECT_MESSAGE
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     gamePeriodList, gamePlayerList, gameSettingList, messageList, messageReplyList, messageFavoriteList, directMessageList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsGameBhv extends AbstractBehaviorWritable<DbGame, DbGameCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DbGameDbm asDBMeta() { return DbGameDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "game"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public DbGameCB newConditionBean() { return new DbGameCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGame. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<DbGameCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, isPresent() and orElse(), ...</span>
     * <pre>
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">game</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">game</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">game</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">game</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGame. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<DbGame> selectEntity(CBCall<DbGameCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<DbGame> facadeSelectEntity(DbGameCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends DbGame> OptionalEntity<ENTITY> doSelectOptionalEntity(DbGameCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * DbGame <span style="color: #553000">game</span> = <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">game</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGame. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public DbGame selectEntityWithDeletedCheck(CBCall<DbGameCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param gameId : PK, ID, NotNull, INT UNSIGNED(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<DbGame> selectByPK(Integer gameId) {
        return facadeSelectByPK(gameId);
    }

    protected OptionalEntity<DbGame> facadeSelectByPK(Integer gameId) {
        return doSelectOptionalByPK(gameId, typeOfSelectedEntity());
    }

    protected <ENTITY extends DbGame> ENTITY doSelectByPK(Integer gameId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(gameId), tp);
    }

    protected <ENTITY extends DbGame> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer gameId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(gameId, tp), gameId);
    }

    protected DbGameCB xprepareCBAsPK(Integer gameId) {
        assertObjectNotNull("gameId", gameId);
        return newConditionBean().acceptPK(gameId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;DbGame&gt; <span style="color: #553000">gameList</span> = <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (DbGame <span style="color: #553000">game</span> : <span style="color: #553000">gameList</span>) {
     *     ... = <span style="color: #553000">game</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGame. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<DbGame> selectList(CBCall<DbGameCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    @Override
    protected boolean isEntityDerivedMappable() { return true; }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * PagingResultBean&lt;DbGame&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (DbGame game : <span style="color: #553000">page</span>) {
     *     ... = game.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGame. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<DbGame> selectPage(CBCall<DbGameCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGame. (NotNull)
     * @param entityLambda The handler of entity row of DbGame. (NotNull)
     */
    public void selectCursor(CBCall<DbGameCB> cbLambda, EntityRowHandler<DbGame> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<DbGameCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + asTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer for the list by the referrer loader.
     * <pre>
     * List&lt;Member&gt; <span style="color: #553000">memberList</span> = <span style="color: #0000C0">memberBhv</span>.selectList(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * memberBhv.<span style="color: #CC4747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * <span style="color: #70226C">for</span> (Member member : <span style="color: #553000">memberList</span>) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #CC4747">getPurchaseList()</span>;
     *     <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param gameList The entity list of game. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<DbGame> gameList, ReferrerLoaderHandler<DbLoaderOfGame> loaderLambda) {
        xassLRArg(gameList, loaderLambda);
        loaderLambda.handle(new DbLoaderOfGame().ready(gameList, _behaviorSelector));
    }

    /**
     * Load referrer for the entity by the referrer loader.
     * <pre>
     * Member <span style="color: #553000">member</span> = <span style="color: #0000C0">memberBhv</span>.selectEntityWithDeletedCheck(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> <span style="color: #553000">cb</span>.acceptPK(1));
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">load</span>(<span style="color: #553000">member</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * List&lt;Purchase&gt; purchaseList = <span style="color: #553000">member</span>.<span style="color: #CC4747">getPurchaseList()</span>;
     * <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *     ...
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param game The entity of game. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(DbGame game, ReferrerLoaderHandler<DbLoaderOfGame> loaderLambda) {
        xassLRArg(game, loaderLambda);
        loaderLambda.handle(new DbLoaderOfGame().ready(xnewLRAryLs(game), _behaviorSelector));
    }

    /**
     * Load referrer of gamePeriodList by the set-upper of referrer. <br>
     * GAME_PERIOD by game_id, named 'gamePeriodList'.
     * <pre>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">loadGamePeriod</span>(<span style="color: #553000">gameList</span>, <span style="color: #553000">periodCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">periodCB</span>.setupSelect...
     *     <span style="color: #553000">periodCB</span>.query().set...
     *     <span style="color: #553000">periodCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (DbGame game : <span style="color: #553000">gameList</span>) {
     *     ... = game.<span style="color: #CC4747">getGamePeriodList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameId_InScope(pkList);
     * cb.query().addOrderBy_GameId_Asc();
     * </pre>
     * @param gameList The entity list of game. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbGamePeriod> loadGamePeriod(List<DbGame> gameList, ReferrerConditionSetupper<DbGamePeriodCB> refCBLambda) {
        xassLRArg(gameList, refCBLambda);
        return doLoadGamePeriod(gameList, new LoadReferrerOption<DbGamePeriodCB, DbGamePeriod>().xinit(refCBLambda));
    }

    /**
     * Load referrer of gamePeriodList by the set-upper of referrer. <br>
     * GAME_PERIOD by game_id, named 'gamePeriodList'.
     * <pre>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">loadGamePeriod</span>(<span style="color: #553000">game</span>, <span style="color: #553000">periodCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">periodCB</span>.setupSelect...
     *     <span style="color: #553000">periodCB</span>.query().set...
     *     <span style="color: #553000">periodCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">game</span>.<span style="color: #CC4747">getGamePeriodList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameId_InScope(pkList);
     * cb.query().addOrderBy_GameId_Asc();
     * </pre>
     * @param game The entity of game. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbGamePeriod> loadGamePeriod(DbGame game, ReferrerConditionSetupper<DbGamePeriodCB> refCBLambda) {
        xassLRArg(game, refCBLambda);
        return doLoadGamePeriod(xnewLRLs(game), new LoadReferrerOption<DbGamePeriodCB, DbGamePeriod>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<DbGamePeriod> doLoadGamePeriod(List<DbGame> gameList, LoadReferrerOption<DbGamePeriodCB, DbGamePeriod> option) {
        return helpLoadReferrerInternally(gameList, option, "gamePeriodList");
    }

    /**
     * Load referrer of gamePlayerList by the set-upper of referrer. <br>
     * GAME_PLAYER by game_id, named 'gamePlayerList'.
     * <pre>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">loadGamePlayer</span>(<span style="color: #553000">gameList</span>, <span style="color: #553000">playerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">playerCB</span>.setupSelect...
     *     <span style="color: #553000">playerCB</span>.query().set...
     *     <span style="color: #553000">playerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (DbGame game : <span style="color: #553000">gameList</span>) {
     *     ... = game.<span style="color: #CC4747">getGamePlayerList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameId_InScope(pkList);
     * cb.query().addOrderBy_GameId_Asc();
     * </pre>
     * @param gameList The entity list of game. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbGamePlayer> loadGamePlayer(List<DbGame> gameList, ReferrerConditionSetupper<DbGamePlayerCB> refCBLambda) {
        xassLRArg(gameList, refCBLambda);
        return doLoadGamePlayer(gameList, new LoadReferrerOption<DbGamePlayerCB, DbGamePlayer>().xinit(refCBLambda));
    }

    /**
     * Load referrer of gamePlayerList by the set-upper of referrer. <br>
     * GAME_PLAYER by game_id, named 'gamePlayerList'.
     * <pre>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">loadGamePlayer</span>(<span style="color: #553000">game</span>, <span style="color: #553000">playerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">playerCB</span>.setupSelect...
     *     <span style="color: #553000">playerCB</span>.query().set...
     *     <span style="color: #553000">playerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">game</span>.<span style="color: #CC4747">getGamePlayerList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameId_InScope(pkList);
     * cb.query().addOrderBy_GameId_Asc();
     * </pre>
     * @param game The entity of game. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbGamePlayer> loadGamePlayer(DbGame game, ReferrerConditionSetupper<DbGamePlayerCB> refCBLambda) {
        xassLRArg(game, refCBLambda);
        return doLoadGamePlayer(xnewLRLs(game), new LoadReferrerOption<DbGamePlayerCB, DbGamePlayer>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<DbGamePlayer> doLoadGamePlayer(List<DbGame> gameList, LoadReferrerOption<DbGamePlayerCB, DbGamePlayer> option) {
        return helpLoadReferrerInternally(gameList, option, "gamePlayerList");
    }

    /**
     * Load referrer of gameSettingList by the set-upper of referrer. <br>
     * GAME_SETTING by game_id, named 'gameSettingList'.
     * <pre>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">loadGameSetting</span>(<span style="color: #553000">gameList</span>, <span style="color: #553000">settingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">settingCB</span>.setupSelect...
     *     <span style="color: #553000">settingCB</span>.query().set...
     *     <span style="color: #553000">settingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (DbGame game : <span style="color: #553000">gameList</span>) {
     *     ... = game.<span style="color: #CC4747">getGameSettingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameId_InScope(pkList);
     * cb.query().addOrderBy_GameId_Asc();
     * </pre>
     * @param gameList The entity list of game. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbGameSetting> loadGameSetting(List<DbGame> gameList, ReferrerConditionSetupper<DbGameSettingCB> refCBLambda) {
        xassLRArg(gameList, refCBLambda);
        return doLoadGameSetting(gameList, new LoadReferrerOption<DbGameSettingCB, DbGameSetting>().xinit(refCBLambda));
    }

    /**
     * Load referrer of gameSettingList by the set-upper of referrer. <br>
     * GAME_SETTING by game_id, named 'gameSettingList'.
     * <pre>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">loadGameSetting</span>(<span style="color: #553000">game</span>, <span style="color: #553000">settingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">settingCB</span>.setupSelect...
     *     <span style="color: #553000">settingCB</span>.query().set...
     *     <span style="color: #553000">settingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">game</span>.<span style="color: #CC4747">getGameSettingList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameId_InScope(pkList);
     * cb.query().addOrderBy_GameId_Asc();
     * </pre>
     * @param game The entity of game. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbGameSetting> loadGameSetting(DbGame game, ReferrerConditionSetupper<DbGameSettingCB> refCBLambda) {
        xassLRArg(game, refCBLambda);
        return doLoadGameSetting(xnewLRLs(game), new LoadReferrerOption<DbGameSettingCB, DbGameSetting>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<DbGameSetting> doLoadGameSetting(List<DbGame> gameList, LoadReferrerOption<DbGameSettingCB, DbGameSetting> option) {
        return helpLoadReferrerInternally(gameList, option, "gameSettingList");
    }

    /**
     * Load referrer of messageList by the set-upper of referrer. <br>
     * MESSAGE by game_id, named 'messageList'.
     * <pre>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">loadMessage</span>(<span style="color: #553000">gameList</span>, <span style="color: #553000">messageCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">messageCB</span>.setupSelect...
     *     <span style="color: #553000">messageCB</span>.query().set...
     *     <span style="color: #553000">messageCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (DbGame game : <span style="color: #553000">gameList</span>) {
     *     ... = game.<span style="color: #CC4747">getMessageList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameId_InScope(pkList);
     * cb.query().addOrderBy_GameId_Asc();
     * </pre>
     * @param gameList The entity list of game. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbMessage> loadMessage(List<DbGame> gameList, ReferrerConditionSetupper<DbMessageCB> refCBLambda) {
        xassLRArg(gameList, refCBLambda);
        return doLoadMessage(gameList, new LoadReferrerOption<DbMessageCB, DbMessage>().xinit(refCBLambda));
    }

    /**
     * Load referrer of messageList by the set-upper of referrer. <br>
     * MESSAGE by game_id, named 'messageList'.
     * <pre>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">loadMessage</span>(<span style="color: #553000">game</span>, <span style="color: #553000">messageCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">messageCB</span>.setupSelect...
     *     <span style="color: #553000">messageCB</span>.query().set...
     *     <span style="color: #553000">messageCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">game</span>.<span style="color: #CC4747">getMessageList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameId_InScope(pkList);
     * cb.query().addOrderBy_GameId_Asc();
     * </pre>
     * @param game The entity of game. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbMessage> loadMessage(DbGame game, ReferrerConditionSetupper<DbMessageCB> refCBLambda) {
        xassLRArg(game, refCBLambda);
        return doLoadMessage(xnewLRLs(game), new LoadReferrerOption<DbMessageCB, DbMessage>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<DbMessage> doLoadMessage(List<DbGame> gameList, LoadReferrerOption<DbMessageCB, DbMessage> option) {
        return helpLoadReferrerInternally(gameList, option, "messageList");
    }

    /**
     * Load referrer of messageReplyList by the set-upper of referrer. <br>
     * MESSAGE_REPLY by game_id, named 'messageReplyList'.
     * <pre>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">loadMessageReply</span>(<span style="color: #553000">gameList</span>, <span style="color: #553000">replyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">replyCB</span>.setupSelect...
     *     <span style="color: #553000">replyCB</span>.query().set...
     *     <span style="color: #553000">replyCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (DbGame game : <span style="color: #553000">gameList</span>) {
     *     ... = game.<span style="color: #CC4747">getMessageReplyList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameId_InScope(pkList);
     * cb.query().addOrderBy_GameId_Asc();
     * </pre>
     * @param gameList The entity list of game. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbMessageReply> loadMessageReply(List<DbGame> gameList, ReferrerConditionSetupper<DbMessageReplyCB> refCBLambda) {
        xassLRArg(gameList, refCBLambda);
        return doLoadMessageReply(gameList, new LoadReferrerOption<DbMessageReplyCB, DbMessageReply>().xinit(refCBLambda));
    }

    /**
     * Load referrer of messageReplyList by the set-upper of referrer. <br>
     * MESSAGE_REPLY by game_id, named 'messageReplyList'.
     * <pre>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">loadMessageReply</span>(<span style="color: #553000">game</span>, <span style="color: #553000">replyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">replyCB</span>.setupSelect...
     *     <span style="color: #553000">replyCB</span>.query().set...
     *     <span style="color: #553000">replyCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">game</span>.<span style="color: #CC4747">getMessageReplyList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameId_InScope(pkList);
     * cb.query().addOrderBy_GameId_Asc();
     * </pre>
     * @param game The entity of game. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbMessageReply> loadMessageReply(DbGame game, ReferrerConditionSetupper<DbMessageReplyCB> refCBLambda) {
        xassLRArg(game, refCBLambda);
        return doLoadMessageReply(xnewLRLs(game), new LoadReferrerOption<DbMessageReplyCB, DbMessageReply>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<DbMessageReply> doLoadMessageReply(List<DbGame> gameList, LoadReferrerOption<DbMessageReplyCB, DbMessageReply> option) {
        return helpLoadReferrerInternally(gameList, option, "messageReplyList");
    }

    /**
     * Load referrer of messageFavoriteList by the set-upper of referrer. <br>
     * MESSAGE_FAVORITE by game_id, named 'messageFavoriteList'.
     * <pre>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">loadMessageFavorite</span>(<span style="color: #553000">gameList</span>, <span style="color: #553000">favoriteCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">favoriteCB</span>.setupSelect...
     *     <span style="color: #553000">favoriteCB</span>.query().set...
     *     <span style="color: #553000">favoriteCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (DbGame game : <span style="color: #553000">gameList</span>) {
     *     ... = game.<span style="color: #CC4747">getMessageFavoriteList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameId_InScope(pkList);
     * cb.query().addOrderBy_GameId_Asc();
     * </pre>
     * @param gameList The entity list of game. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbMessageFavorite> loadMessageFavorite(List<DbGame> gameList, ReferrerConditionSetupper<DbMessageFavoriteCB> refCBLambda) {
        xassLRArg(gameList, refCBLambda);
        return doLoadMessageFavorite(gameList, new LoadReferrerOption<DbMessageFavoriteCB, DbMessageFavorite>().xinit(refCBLambda));
    }

    /**
     * Load referrer of messageFavoriteList by the set-upper of referrer. <br>
     * MESSAGE_FAVORITE by game_id, named 'messageFavoriteList'.
     * <pre>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">loadMessageFavorite</span>(<span style="color: #553000">game</span>, <span style="color: #553000">favoriteCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">favoriteCB</span>.setupSelect...
     *     <span style="color: #553000">favoriteCB</span>.query().set...
     *     <span style="color: #553000">favoriteCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">game</span>.<span style="color: #CC4747">getMessageFavoriteList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameId_InScope(pkList);
     * cb.query().addOrderBy_GameId_Asc();
     * </pre>
     * @param game The entity of game. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbMessageFavorite> loadMessageFavorite(DbGame game, ReferrerConditionSetupper<DbMessageFavoriteCB> refCBLambda) {
        xassLRArg(game, refCBLambda);
        return doLoadMessageFavorite(xnewLRLs(game), new LoadReferrerOption<DbMessageFavoriteCB, DbMessageFavorite>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<DbMessageFavorite> doLoadMessageFavorite(List<DbGame> gameList, LoadReferrerOption<DbMessageFavoriteCB, DbMessageFavorite> option) {
        return helpLoadReferrerInternally(gameList, option, "messageFavoriteList");
    }

    /**
     * Load referrer of directMessageList by the set-upper of referrer. <br>
     * DIRECT_MESSAGE by game_id, named 'directMessageList'.
     * <pre>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">loadDirectMessage</span>(<span style="color: #553000">gameList</span>, <span style="color: #553000">messageCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">messageCB</span>.setupSelect...
     *     <span style="color: #553000">messageCB</span>.query().set...
     *     <span style="color: #553000">messageCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (DbGame game : <span style="color: #553000">gameList</span>) {
     *     ... = game.<span style="color: #CC4747">getDirectMessageList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameId_InScope(pkList);
     * cb.query().addOrderBy_GameId_Asc();
     * </pre>
     * @param gameList The entity list of game. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbDirectMessage> loadDirectMessage(List<DbGame> gameList, ReferrerConditionSetupper<DbDirectMessageCB> refCBLambda) {
        xassLRArg(gameList, refCBLambda);
        return doLoadDirectMessage(gameList, new LoadReferrerOption<DbDirectMessageCB, DbDirectMessage>().xinit(refCBLambda));
    }

    /**
     * Load referrer of directMessageList by the set-upper of referrer. <br>
     * DIRECT_MESSAGE by game_id, named 'directMessageList'.
     * <pre>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">loadDirectMessage</span>(<span style="color: #553000">game</span>, <span style="color: #553000">messageCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">messageCB</span>.setupSelect...
     *     <span style="color: #553000">messageCB</span>.query().set...
     *     <span style="color: #553000">messageCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">game</span>.<span style="color: #CC4747">getDirectMessageList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGameId_InScope(pkList);
     * cb.query().addOrderBy_GameId_Asc();
     * </pre>
     * @param game The entity of game. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbDirectMessage> loadDirectMessage(DbGame game, ReferrerConditionSetupper<DbDirectMessageCB> refCBLambda) {
        xassLRArg(game, refCBLambda);
        return doLoadDirectMessage(xnewLRLs(game), new LoadReferrerOption<DbDirectMessageCB, DbDirectMessage>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<DbDirectMessage> doLoadDirectMessage(List<DbGame> gameList, LoadReferrerOption<DbDirectMessageCB, DbDirectMessage> option) {
        return helpLoadReferrerInternally(gameList, option, "directMessageList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key gameId.
     * @param gameList The list of game. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractGameIdList(List<DbGame> gameList)
    { return helpExtractListInternally(gameList, "gameId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * DbGame game = <span style="color: #70226C">new</span> DbGame();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * game.setFoo...(value);
     * game.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//game.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//game.set...;</span>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">insert</span>(game);
     * ... = game.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param game The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(DbGame game) {
        doInsert(game, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * DbGame game = <span style="color: #70226C">new</span> DbGame();
     * game.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * game.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//game.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//game.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * game.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">update</span>(game);
     * </pre>
     * @param game The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(DbGame game) {
        doUpdate(game, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param game The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(DbGame game) {
        doInsertOrUpdate(game, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * DbGame game = <span style="color: #70226C">new</span> DbGame();
     * game.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * game.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">delete</span>(game);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param game The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(DbGame game) {
        doDelete(game, null);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <p><span style="color: #CC4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     DbGame game = <span style="color: #70226C">new</span> DbGame();
     *     game.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         game.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     gameList.add(game);
     * }
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">batchInsert</span>(gameList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param gameList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<DbGame> gameList) {
        return doBatchInsert(gameList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     DbGame game = <span style="color: #70226C">new</span> DbGame();
     *     game.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         game.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         game.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//game.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     gameList.add(game);
     * }
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">batchUpdate</span>(gameList);
     * </pre>
     * @param gameList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<DbGame> gameList) {
        return doBatchUpdate(gameList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param gameList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<DbGame> gameList) {
        return doBatchDelete(gameList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;DbGame, DbGameCB&gt;() {
     *     public ConditionBean setup(DbGame entity, DbGameCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     *
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param manyArgLambda The callback to set up query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<DbGame, DbGameCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * DbGame game = <span style="color: #70226C">new</span> DbGame();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//game.setPK...(value);</span>
     * game.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//game.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//game.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//game.setVersionNo(value);</span>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">queryUpdate</span>(game, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param game The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of DbGame. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(DbGame game, CBCall<DbGameCB> cbLambda) {
        return doQueryUpdate(game, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">queryDelete</span>(game, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGame. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<DbGameCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as insert(entity).
     * <pre>
     * DbGame game = <span style="color: #70226C">new</span> DbGame();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * game.setFoo...(value);
     * game.setBar...(value);
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">varyingInsert</span>(game, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = game.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param game The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(DbGame game, WritableOptionCall<DbGameCB, InsertOption<DbGameCB>> opLambda) {
        doInsert(game, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * DbGame game = <span style="color: #70226C">new</span> DbGame();
     * game.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * game.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * game.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(game, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param game The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(DbGame game, WritableOptionCall<DbGameCB, UpdateOption<DbGameCB>> opLambda) {
        doUpdate(game, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param game The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(DbGame game, WritableOptionCall<DbGameCB, InsertOption<DbGameCB>> insertOpLambda, WritableOptionCall<DbGameCB, UpdateOption<DbGameCB>> updateOpLambda) {
        doInsertOrUpdate(game, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param game The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(DbGame game, WritableOptionCall<DbGameCB, DeleteOption<DbGameCB>> opLambda) {
        doDelete(game, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param gameList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<DbGame> gameList, WritableOptionCall<DbGameCB, InsertOption<DbGameCB>> opLambda) {
        return doBatchInsert(gameList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param gameList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<DbGame> gameList, WritableOptionCall<DbGameCB, UpdateOption<DbGameCB>> opLambda) {
        return doBatchUpdate(gameList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param gameList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<DbGame> gameList, WritableOptionCall<DbGameCB, DeleteOption<DbGameCB>> opLambda) {
        return doBatchDelete(gameList, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as queryInsert(entity, setupper).
     * @param manyArgLambda The set-upper of query-insert. (NotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<DbGame, DbGameCB> manyArgLambda, WritableOptionCall<DbGameCB, InsertOption<DbGameCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * DbGame game = <span style="color: #70226C">new</span> DbGame();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//game.setPK...(value);</span>
     * game.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//game.setVersionNo(value);</span>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(game, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param game The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of DbGame. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(DbGame game, CBCall<DbGameCB> cbLambda, WritableOptionCall<DbGameCB, UpdateOption<DbGameCB>> opLambda) {
        return doQueryUpdate(game, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">gameBhv</span>.<span style="color: #CC4747">queryDelete</span>(game, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGame. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<DbGameCB> cbLambda, WritableOptionCall<DbGameCB, DeleteOption<DbGameCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * gameBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * gameBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * gameBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * gameBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * gameBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * gameBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * gameBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * gameBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * gameBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * gameBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * gameBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * gameBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * gameBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * gameBhv.outideSql().removeBlockComment().selectList()
     * gameBhv.outideSql().removeLineComment().selectList()
     * gameBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<DbGameBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends DbGame> typeOfSelectedEntity() { return DbGame.class; }
    protected Class<DbGame> typeOfHandlingEntity() { return DbGame.class; }
    protected Class<DbGameCB> typeOfHandlingConditionBean() { return DbGameCB.class; }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    @Override
    @jakarta.annotation.Resource(name="dbBehaviorCommandInvoker")
    public void setBehaviorCommandInvoker(BehaviorCommandInvoker behaviorCommandInvoker) {
        super.setBehaviorCommandInvoker(behaviorCommandInvoker);
    }

    @Override
    @jakarta.annotation.Resource(name="dbBehaviorSelector")
    public void setBehaviorSelector(BehaviorSelector behaviorSelector) {
        super.setBehaviorSelector(behaviorSelector);
    }

    @Override
    @jakarta.annotation.Resource(name="dbCommonColumnAutoSetupper")
    public void setCommonColumnAutoSetupper(CommonColumnAutoSetupper commonColumnAutoSetupper) {
        super.setCommonColumnAutoSetupper(commonColumnAutoSetupper);
    }
}
