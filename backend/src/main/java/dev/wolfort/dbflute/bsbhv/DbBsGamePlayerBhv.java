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
 * The behavior of GAME_PLAYER as TABLE. <br>
 * <pre>
 * [primary key]
 *     game_player_id
 *
 * [column]
 *     game_player_id, game_id, player_id, game_player_name, chara_id, is_deleted, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     game_player_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     CHARA, GAME, PLAYER
 *
 * [referrer table]
 *     GAME_PLAYER_GROUP_REL, MESSAGE, MESSAGE_FAVORITE, DIRECT_MESSAGE
 *
 * [foreign property]
 *     chara, game, player
 *
 * [referrer property]
 *     gamePlayerGroupRelList, messageList, messageFavoriteList, directMessageList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsGamePlayerBhv extends AbstractBehaviorWritable<DbGamePlayer, DbGamePlayerCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DbGamePlayerDbm asDBMeta() { return DbGamePlayerDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "game_player"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public DbGamePlayerCB newConditionBean() { return new DbGamePlayerCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGamePlayer. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<DbGamePlayerCB> cbLambda) {
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
     * <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">gamePlayer</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">gamePlayer</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">gamePlayer</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">gamePlayer</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGamePlayer. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<DbGamePlayer> selectEntity(CBCall<DbGamePlayerCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<DbGamePlayer> facadeSelectEntity(DbGamePlayerCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends DbGamePlayer> OptionalEntity<ENTITY> doSelectOptionalEntity(DbGamePlayerCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * DbGamePlayer <span style="color: #553000">gamePlayer</span> = <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">gamePlayer</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGamePlayer. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public DbGamePlayer selectEntityWithDeletedCheck(CBCall<DbGamePlayerCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param gamePlayerId : PK, ID, NotNull, INT UNSIGNED(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<DbGamePlayer> selectByPK(Integer gamePlayerId) {
        return facadeSelectByPK(gamePlayerId);
    }

    protected OptionalEntity<DbGamePlayer> facadeSelectByPK(Integer gamePlayerId) {
        return doSelectOptionalByPK(gamePlayerId, typeOfSelectedEntity());
    }

    protected <ENTITY extends DbGamePlayer> ENTITY doSelectByPK(Integer gamePlayerId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(gamePlayerId), tp);
    }

    protected <ENTITY extends DbGamePlayer> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer gamePlayerId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(gamePlayerId, tp), gamePlayerId);
    }

    protected DbGamePlayerCB xprepareCBAsPK(Integer gamePlayerId) {
        assertObjectNotNull("gamePlayerId", gamePlayerId);
        return newConditionBean().acceptPK(gamePlayerId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param gameId : UQ+, NotNull, INT UNSIGNED(10), FK to game. (NotNull)
     * @param charaId : +UQ, IX, NotNull, INT UNSIGNED(10), FK to chara. (NotNull)
     * @param isDeleted : +UQ, NotNull, BIT. (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<DbGamePlayer> selectByUniqueOf(Integer gameId, Integer charaId, Boolean isDeleted) {
        return facadeSelectByUniqueOf(gameId, charaId, isDeleted);
    }

    protected OptionalEntity<DbGamePlayer> facadeSelectByUniqueOf(Integer gameId, Integer charaId, Boolean isDeleted) {
        return doSelectByUniqueOf(gameId, charaId, isDeleted, typeOfSelectedEntity());
    }

    protected <ENTITY extends DbGamePlayer> OptionalEntity<ENTITY> doSelectByUniqueOf(Integer gameId, Integer charaId, Boolean isDeleted, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(gameId, charaId, isDeleted), tp), gameId, charaId, isDeleted);
    }

    protected DbGamePlayerCB xprepareCBAsUniqueOf(Integer gameId, Integer charaId, Boolean isDeleted) {
        assertObjectNotNull("gameId", gameId);assertObjectNotNull("charaId", charaId);assertObjectNotNull("isDeleted", isDeleted);
        return newConditionBean().acceptUniqueOf(gameId, charaId, isDeleted);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;DbGamePlayer&gt; <span style="color: #553000">gamePlayerList</span> = <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (DbGamePlayer <span style="color: #553000">gamePlayer</span> : <span style="color: #553000">gamePlayerList</span>) {
     *     ... = <span style="color: #553000">gamePlayer</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGamePlayer. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<DbGamePlayer> selectList(CBCall<DbGamePlayerCB> cbLambda) {
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
     * PagingResultBean&lt;DbGamePlayer&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (DbGamePlayer gamePlayer : <span style="color: #553000">page</span>) {
     *     ... = gamePlayer.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGamePlayer. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<DbGamePlayer> selectPage(CBCall<DbGamePlayerCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGamePlayer. (NotNull)
     * @param entityLambda The handler of entity row of DbGamePlayer. (NotNull)
     */
    public void selectCursor(CBCall<DbGamePlayerCB> cbLambda, EntityRowHandler<DbGamePlayer> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<DbGamePlayerCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param gamePlayerList The entity list of gamePlayer. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<DbGamePlayer> gamePlayerList, ReferrerLoaderHandler<DbLoaderOfGamePlayer> loaderLambda) {
        xassLRArg(gamePlayerList, loaderLambda);
        loaderLambda.handle(new DbLoaderOfGamePlayer().ready(gamePlayerList, _behaviorSelector));
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
     * @param gamePlayer The entity of gamePlayer. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(DbGamePlayer gamePlayer, ReferrerLoaderHandler<DbLoaderOfGamePlayer> loaderLambda) {
        xassLRArg(gamePlayer, loaderLambda);
        loaderLambda.handle(new DbLoaderOfGamePlayer().ready(xnewLRAryLs(gamePlayer), _behaviorSelector));
    }

    /**
     * Load referrer of gamePlayerGroupRelList by the set-upper of referrer. <br>
     * GAME_PLAYER_GROUP_REL by game_player_id, named 'gamePlayerGroupRelList'.
     * <pre>
     * <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #CC4747">loadGamePlayerGroupRel</span>(<span style="color: #553000">gamePlayerList</span>, <span style="color: #553000">relCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">relCB</span>.setupSelect...
     *     <span style="color: #553000">relCB</span>.query().set...
     *     <span style="color: #553000">relCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (DbGamePlayer gamePlayer : <span style="color: #553000">gamePlayerList</span>) {
     *     ... = gamePlayer.<span style="color: #CC4747">getGamePlayerGroupRelList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGamePlayerId_InScope(pkList);
     * cb.query().addOrderBy_GamePlayerId_Asc();
     * </pre>
     * @param gamePlayerList The entity list of gamePlayer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbGamePlayerGroupRel> loadGamePlayerGroupRel(List<DbGamePlayer> gamePlayerList, ReferrerConditionSetupper<DbGamePlayerGroupRelCB> refCBLambda) {
        xassLRArg(gamePlayerList, refCBLambda);
        return doLoadGamePlayerGroupRel(gamePlayerList, new LoadReferrerOption<DbGamePlayerGroupRelCB, DbGamePlayerGroupRel>().xinit(refCBLambda));
    }

    /**
     * Load referrer of gamePlayerGroupRelList by the set-upper of referrer. <br>
     * GAME_PLAYER_GROUP_REL by game_player_id, named 'gamePlayerGroupRelList'.
     * <pre>
     * <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #CC4747">loadGamePlayerGroupRel</span>(<span style="color: #553000">gamePlayer</span>, <span style="color: #553000">relCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">relCB</span>.setupSelect...
     *     <span style="color: #553000">relCB</span>.query().set...
     *     <span style="color: #553000">relCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">gamePlayer</span>.<span style="color: #CC4747">getGamePlayerGroupRelList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGamePlayerId_InScope(pkList);
     * cb.query().addOrderBy_GamePlayerId_Asc();
     * </pre>
     * @param gamePlayer The entity of gamePlayer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbGamePlayerGroupRel> loadGamePlayerGroupRel(DbGamePlayer gamePlayer, ReferrerConditionSetupper<DbGamePlayerGroupRelCB> refCBLambda) {
        xassLRArg(gamePlayer, refCBLambda);
        return doLoadGamePlayerGroupRel(xnewLRLs(gamePlayer), new LoadReferrerOption<DbGamePlayerGroupRelCB, DbGamePlayerGroupRel>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<DbGamePlayerGroupRel> doLoadGamePlayerGroupRel(List<DbGamePlayer> gamePlayerList, LoadReferrerOption<DbGamePlayerGroupRelCB, DbGamePlayerGroupRel> option) {
        return helpLoadReferrerInternally(gamePlayerList, option, "gamePlayerGroupRelList");
    }

    /**
     * Load referrer of messageList by the set-upper of referrer. <br>
     * MESSAGE by from_game_player_id, named 'messageList'.
     * <pre>
     * <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #CC4747">loadMessage</span>(<span style="color: #553000">gamePlayerList</span>, <span style="color: #553000">messageCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">messageCB</span>.setupSelect...
     *     <span style="color: #553000">messageCB</span>.query().set...
     *     <span style="color: #553000">messageCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (DbGamePlayer gamePlayer : <span style="color: #553000">gamePlayerList</span>) {
     *     ... = gamePlayer.<span style="color: #CC4747">getMessageList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFromGamePlayerId_InScope(pkList);
     * cb.query().addOrderBy_FromGamePlayerId_Asc();
     * </pre>
     * @param gamePlayerList The entity list of gamePlayer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbMessage> loadMessage(List<DbGamePlayer> gamePlayerList, ReferrerConditionSetupper<DbMessageCB> refCBLambda) {
        xassLRArg(gamePlayerList, refCBLambda);
        return doLoadMessage(gamePlayerList, new LoadReferrerOption<DbMessageCB, DbMessage>().xinit(refCBLambda));
    }

    /**
     * Load referrer of messageList by the set-upper of referrer. <br>
     * MESSAGE by from_game_player_id, named 'messageList'.
     * <pre>
     * <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #CC4747">loadMessage</span>(<span style="color: #553000">gamePlayer</span>, <span style="color: #553000">messageCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">messageCB</span>.setupSelect...
     *     <span style="color: #553000">messageCB</span>.query().set...
     *     <span style="color: #553000">messageCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">gamePlayer</span>.<span style="color: #CC4747">getMessageList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFromGamePlayerId_InScope(pkList);
     * cb.query().addOrderBy_FromGamePlayerId_Asc();
     * </pre>
     * @param gamePlayer The entity of gamePlayer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbMessage> loadMessage(DbGamePlayer gamePlayer, ReferrerConditionSetupper<DbMessageCB> refCBLambda) {
        xassLRArg(gamePlayer, refCBLambda);
        return doLoadMessage(xnewLRLs(gamePlayer), new LoadReferrerOption<DbMessageCB, DbMessage>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<DbMessage> doLoadMessage(List<DbGamePlayer> gamePlayerList, LoadReferrerOption<DbMessageCB, DbMessage> option) {
        return helpLoadReferrerInternally(gamePlayerList, option, "messageList");
    }

    /**
     * Load referrer of messageFavoriteList by the set-upper of referrer. <br>
     * MESSAGE_FAVORITE by game_player_id, named 'messageFavoriteList'.
     * <pre>
     * <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #CC4747">loadMessageFavorite</span>(<span style="color: #553000">gamePlayerList</span>, <span style="color: #553000">favoriteCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">favoriteCB</span>.setupSelect...
     *     <span style="color: #553000">favoriteCB</span>.query().set...
     *     <span style="color: #553000">favoriteCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (DbGamePlayer gamePlayer : <span style="color: #553000">gamePlayerList</span>) {
     *     ... = gamePlayer.<span style="color: #CC4747">getMessageFavoriteList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGamePlayerId_InScope(pkList);
     * cb.query().addOrderBy_GamePlayerId_Asc();
     * </pre>
     * @param gamePlayerList The entity list of gamePlayer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbMessageFavorite> loadMessageFavorite(List<DbGamePlayer> gamePlayerList, ReferrerConditionSetupper<DbMessageFavoriteCB> refCBLambda) {
        xassLRArg(gamePlayerList, refCBLambda);
        return doLoadMessageFavorite(gamePlayerList, new LoadReferrerOption<DbMessageFavoriteCB, DbMessageFavorite>().xinit(refCBLambda));
    }

    /**
     * Load referrer of messageFavoriteList by the set-upper of referrer. <br>
     * MESSAGE_FAVORITE by game_player_id, named 'messageFavoriteList'.
     * <pre>
     * <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #CC4747">loadMessageFavorite</span>(<span style="color: #553000">gamePlayer</span>, <span style="color: #553000">favoriteCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">favoriteCB</span>.setupSelect...
     *     <span style="color: #553000">favoriteCB</span>.query().set...
     *     <span style="color: #553000">favoriteCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">gamePlayer</span>.<span style="color: #CC4747">getMessageFavoriteList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGamePlayerId_InScope(pkList);
     * cb.query().addOrderBy_GamePlayerId_Asc();
     * </pre>
     * @param gamePlayer The entity of gamePlayer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbMessageFavorite> loadMessageFavorite(DbGamePlayer gamePlayer, ReferrerConditionSetupper<DbMessageFavoriteCB> refCBLambda) {
        xassLRArg(gamePlayer, refCBLambda);
        return doLoadMessageFavorite(xnewLRLs(gamePlayer), new LoadReferrerOption<DbMessageFavoriteCB, DbMessageFavorite>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<DbMessageFavorite> doLoadMessageFavorite(List<DbGamePlayer> gamePlayerList, LoadReferrerOption<DbMessageFavoriteCB, DbMessageFavorite> option) {
        return helpLoadReferrerInternally(gamePlayerList, option, "messageFavoriteList");
    }

    /**
     * Load referrer of directMessageList by the set-upper of referrer. <br>
     * DIRECT_MESSAGE by from_game_player_id, named 'directMessageList'.
     * <pre>
     * <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #CC4747">loadDirectMessage</span>(<span style="color: #553000">gamePlayerList</span>, <span style="color: #553000">messageCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">messageCB</span>.setupSelect...
     *     <span style="color: #553000">messageCB</span>.query().set...
     *     <span style="color: #553000">messageCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (DbGamePlayer gamePlayer : <span style="color: #553000">gamePlayerList</span>) {
     *     ... = gamePlayer.<span style="color: #CC4747">getDirectMessageList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFromGamePlayerId_InScope(pkList);
     * cb.query().addOrderBy_FromGamePlayerId_Asc();
     * </pre>
     * @param gamePlayerList The entity list of gamePlayer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbDirectMessage> loadDirectMessage(List<DbGamePlayer> gamePlayerList, ReferrerConditionSetupper<DbDirectMessageCB> refCBLambda) {
        xassLRArg(gamePlayerList, refCBLambda);
        return doLoadDirectMessage(gamePlayerList, new LoadReferrerOption<DbDirectMessageCB, DbDirectMessage>().xinit(refCBLambda));
    }

    /**
     * Load referrer of directMessageList by the set-upper of referrer. <br>
     * DIRECT_MESSAGE by from_game_player_id, named 'directMessageList'.
     * <pre>
     * <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #CC4747">loadDirectMessage</span>(<span style="color: #553000">gamePlayer</span>, <span style="color: #553000">messageCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">messageCB</span>.setupSelect...
     *     <span style="color: #553000">messageCB</span>.query().set...
     *     <span style="color: #553000">messageCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">gamePlayer</span>.<span style="color: #CC4747">getDirectMessageList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFromGamePlayerId_InScope(pkList);
     * cb.query().addOrderBy_FromGamePlayerId_Asc();
     * </pre>
     * @param gamePlayer The entity of gamePlayer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DbDirectMessage> loadDirectMessage(DbGamePlayer gamePlayer, ReferrerConditionSetupper<DbDirectMessageCB> refCBLambda) {
        xassLRArg(gamePlayer, refCBLambda);
        return doLoadDirectMessage(xnewLRLs(gamePlayer), new LoadReferrerOption<DbDirectMessageCB, DbDirectMessage>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<DbDirectMessage> doLoadDirectMessage(List<DbGamePlayer> gamePlayerList, LoadReferrerOption<DbDirectMessageCB, DbDirectMessage> option) {
        return helpLoadReferrerInternally(gamePlayerList, option, "directMessageList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'DbChara'.
     * @param gamePlayerList The list of gamePlayer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<DbChara> pulloutChara(List<DbGamePlayer> gamePlayerList)
    { return helpPulloutInternally(gamePlayerList, "chara"); }

    /**
     * Pull out the list of foreign table 'DbGame'.
     * @param gamePlayerList The list of gamePlayer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<DbGame> pulloutGame(List<DbGamePlayer> gamePlayerList)
    { return helpPulloutInternally(gamePlayerList, "game"); }

    /**
     * Pull out the list of foreign table 'DbPlayer'.
     * @param gamePlayerList The list of gamePlayer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<DbPlayer> pulloutPlayer(List<DbGamePlayer> gamePlayerList)
    { return helpPulloutInternally(gamePlayerList, "player"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key gamePlayerId.
     * @param gamePlayerList The list of gamePlayer. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractGamePlayerIdList(List<DbGamePlayer> gamePlayerList)
    { return helpExtractListInternally(gamePlayerList, "gamePlayerId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * DbGamePlayer gamePlayer = <span style="color: #70226C">new</span> DbGamePlayer();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * gamePlayer.setFoo...(value);
     * gamePlayer.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//gamePlayer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//gamePlayer.set...;</span>
     * <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #CC4747">insert</span>(gamePlayer);
     * ... = gamePlayer.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param gamePlayer The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(DbGamePlayer gamePlayer) {
        doInsert(gamePlayer, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * DbGamePlayer gamePlayer = <span style="color: #70226C">new</span> DbGamePlayer();
     * gamePlayer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * gamePlayer.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//gamePlayer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//gamePlayer.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * gamePlayer.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #CC4747">update</span>(gamePlayer);
     * </pre>
     * @param gamePlayer The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(DbGamePlayer gamePlayer) {
        doUpdate(gamePlayer, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param gamePlayer The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(DbGamePlayer gamePlayer) {
        doInsertOrUpdate(gamePlayer, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * DbGamePlayer gamePlayer = <span style="color: #70226C">new</span> DbGamePlayer();
     * gamePlayer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * gamePlayer.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #CC4747">delete</span>(gamePlayer);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param gamePlayer The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(DbGamePlayer gamePlayer) {
        doDelete(gamePlayer, null);
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
     *     DbGamePlayer gamePlayer = <span style="color: #70226C">new</span> DbGamePlayer();
     *     gamePlayer.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         gamePlayer.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     gamePlayerList.add(gamePlayer);
     * }
     * <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #CC4747">batchInsert</span>(gamePlayerList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param gamePlayerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<DbGamePlayer> gamePlayerList) {
        return doBatchInsert(gamePlayerList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     DbGamePlayer gamePlayer = <span style="color: #70226C">new</span> DbGamePlayer();
     *     gamePlayer.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         gamePlayer.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         gamePlayer.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//gamePlayer.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     gamePlayerList.add(gamePlayer);
     * }
     * <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #CC4747">batchUpdate</span>(gamePlayerList);
     * </pre>
     * @param gamePlayerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<DbGamePlayer> gamePlayerList) {
        return doBatchUpdate(gamePlayerList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param gamePlayerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<DbGamePlayer> gamePlayerList) {
        return doBatchDelete(gamePlayerList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;DbGamePlayer, DbGamePlayerCB&gt;() {
     *     public ConditionBean setup(DbGamePlayer entity, DbGamePlayerCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<DbGamePlayer, DbGamePlayerCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * DbGamePlayer gamePlayer = <span style="color: #70226C">new</span> DbGamePlayer();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//gamePlayer.setPK...(value);</span>
     * gamePlayer.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//gamePlayer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//gamePlayer.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//gamePlayer.setVersionNo(value);</span>
     * <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #CC4747">queryUpdate</span>(gamePlayer, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param gamePlayer The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of DbGamePlayer. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(DbGamePlayer gamePlayer, CBCall<DbGamePlayerCB> cbLambda) {
        return doQueryUpdate(gamePlayer, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #CC4747">queryDelete</span>(gamePlayer, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGamePlayer. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<DbGamePlayerCB> cbLambda) {
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
     * DbGamePlayer gamePlayer = <span style="color: #70226C">new</span> DbGamePlayer();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * gamePlayer.setFoo...(value);
     * gamePlayer.setBar...(value);
     * <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #CC4747">varyingInsert</span>(gamePlayer, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = gamePlayer.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param gamePlayer The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(DbGamePlayer gamePlayer, WritableOptionCall<DbGamePlayerCB, InsertOption<DbGamePlayerCB>> opLambda) {
        doInsert(gamePlayer, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * DbGamePlayer gamePlayer = <span style="color: #70226C">new</span> DbGamePlayer();
     * gamePlayer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * gamePlayer.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * gamePlayer.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(gamePlayer, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param gamePlayer The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(DbGamePlayer gamePlayer, WritableOptionCall<DbGamePlayerCB, UpdateOption<DbGamePlayerCB>> opLambda) {
        doUpdate(gamePlayer, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param gamePlayer The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(DbGamePlayer gamePlayer, WritableOptionCall<DbGamePlayerCB, InsertOption<DbGamePlayerCB>> insertOpLambda, WritableOptionCall<DbGamePlayerCB, UpdateOption<DbGamePlayerCB>> updateOpLambda) {
        doInsertOrUpdate(gamePlayer, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param gamePlayer The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(DbGamePlayer gamePlayer, WritableOptionCall<DbGamePlayerCB, DeleteOption<DbGamePlayerCB>> opLambda) {
        doDelete(gamePlayer, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param gamePlayerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<DbGamePlayer> gamePlayerList, WritableOptionCall<DbGamePlayerCB, InsertOption<DbGamePlayerCB>> opLambda) {
        return doBatchInsert(gamePlayerList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param gamePlayerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<DbGamePlayer> gamePlayerList, WritableOptionCall<DbGamePlayerCB, UpdateOption<DbGamePlayerCB>> opLambda) {
        return doBatchUpdate(gamePlayerList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param gamePlayerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<DbGamePlayer> gamePlayerList, WritableOptionCall<DbGamePlayerCB, DeleteOption<DbGamePlayerCB>> opLambda) {
        return doBatchDelete(gamePlayerList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<DbGamePlayer, DbGamePlayerCB> manyArgLambda, WritableOptionCall<DbGamePlayerCB, InsertOption<DbGamePlayerCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * DbGamePlayer gamePlayer = <span style="color: #70226C">new</span> DbGamePlayer();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//gamePlayer.setPK...(value);</span>
     * gamePlayer.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//gamePlayer.setVersionNo(value);</span>
     * <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(gamePlayer, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param gamePlayer The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of DbGamePlayer. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(DbGamePlayer gamePlayer, CBCall<DbGamePlayerCB> cbLambda, WritableOptionCall<DbGamePlayerCB, UpdateOption<DbGamePlayerCB>> opLambda) {
        return doQueryUpdate(gamePlayer, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">gamePlayerBhv</span>.<span style="color: #CC4747">queryDelete</span>(gamePlayer, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGamePlayer. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<DbGamePlayerCB> cbLambda, WritableOptionCall<DbGamePlayerCB, DeleteOption<DbGamePlayerCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * gamePlayerBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * gamePlayerBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * gamePlayerBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * gamePlayerBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * gamePlayerBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * gamePlayerBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * gamePlayerBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * gamePlayerBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * gamePlayerBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * gamePlayerBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * gamePlayerBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * gamePlayerBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * gamePlayerBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * gamePlayerBhv.outideSql().removeBlockComment().selectList()
     * gamePlayerBhv.outideSql().removeLineComment().selectList()
     * gamePlayerBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<DbGamePlayerBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends DbGamePlayer> typeOfSelectedEntity() { return DbGamePlayer.class; }
    protected Class<DbGamePlayer> typeOfHandlingEntity() { return DbGamePlayer.class; }
    protected Class<DbGamePlayerCB> typeOfHandlingConditionBean() { return DbGamePlayerCB.class; }

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
