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
 * The behavior of GAME_PLAYER_GROUP_REL as TABLE. <br>
 * <pre>
 * [primary key]
 *     game_player_group_rel_id
 *
 * [column]
 *     game_player_group_rel_id, game_player_group, game_player_id, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     game_player_group_rel_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     GAME_PLAYER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     gamePlayer
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsGamePlayerGroupRelBhv extends AbstractBehaviorWritable<DbGamePlayerGroupRel, DbGamePlayerGroupRelCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DbGamePlayerGroupRelDbm asDBMeta() { return DbGamePlayerGroupRelDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "game_player_group_rel"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public DbGamePlayerGroupRelCB newConditionBean() { return new DbGamePlayerGroupRelCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">gamePlayerGroupRelBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGamePlayerGroupRel. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<DbGamePlayerGroupRelCB> cbLambda) {
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
     * <span style="color: #0000C0">gamePlayerGroupRelBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">gamePlayerGroupRel</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">gamePlayerGroupRel</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">gamePlayerGroupRelBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">gamePlayerGroupRel</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">gamePlayerGroupRel</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGamePlayerGroupRel. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<DbGamePlayerGroupRel> selectEntity(CBCall<DbGamePlayerGroupRelCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<DbGamePlayerGroupRel> facadeSelectEntity(DbGamePlayerGroupRelCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends DbGamePlayerGroupRel> OptionalEntity<ENTITY> doSelectOptionalEntity(DbGamePlayerGroupRelCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * DbGamePlayerGroupRel <span style="color: #553000">gamePlayerGroupRel</span> = <span style="color: #0000C0">gamePlayerGroupRelBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">gamePlayerGroupRel</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGamePlayerGroupRel. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public DbGamePlayerGroupRel selectEntityWithDeletedCheck(CBCall<DbGamePlayerGroupRelCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param gamePlayerGroupRelId : PK, ID, NotNull, INT UNSIGNED(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<DbGamePlayerGroupRel> selectByPK(Integer gamePlayerGroupRelId) {
        return facadeSelectByPK(gamePlayerGroupRelId);
    }

    protected OptionalEntity<DbGamePlayerGroupRel> facadeSelectByPK(Integer gamePlayerGroupRelId) {
        return doSelectOptionalByPK(gamePlayerGroupRelId, typeOfSelectedEntity());
    }

    protected <ENTITY extends DbGamePlayerGroupRel> ENTITY doSelectByPK(Integer gamePlayerGroupRelId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(gamePlayerGroupRelId), tp);
    }

    protected <ENTITY extends DbGamePlayerGroupRel> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer gamePlayerGroupRelId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(gamePlayerGroupRelId, tp), gamePlayerGroupRelId);
    }

    protected DbGamePlayerGroupRelCB xprepareCBAsPK(Integer gamePlayerGroupRelId) {
        assertObjectNotNull("gamePlayerGroupRelId", gamePlayerGroupRelId);
        return newConditionBean().acceptPK(gamePlayerGroupRelId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param gamePlayerGroup : UQ+, NotNull, INT UNSIGNED(10). (NotNull)
     * @param gamePlayerId : +UQ, IX, NotNull, INT UNSIGNED(10), FK to game_player. (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<DbGamePlayerGroupRel> selectByUniqueOf(Integer gamePlayerGroup, Integer gamePlayerId) {
        return facadeSelectByUniqueOf(gamePlayerGroup, gamePlayerId);
    }

    protected OptionalEntity<DbGamePlayerGroupRel> facadeSelectByUniqueOf(Integer gamePlayerGroup, Integer gamePlayerId) {
        return doSelectByUniqueOf(gamePlayerGroup, gamePlayerId, typeOfSelectedEntity());
    }

    protected <ENTITY extends DbGamePlayerGroupRel> OptionalEntity<ENTITY> doSelectByUniqueOf(Integer gamePlayerGroup, Integer gamePlayerId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(gamePlayerGroup, gamePlayerId), tp), gamePlayerGroup, gamePlayerId);
    }

    protected DbGamePlayerGroupRelCB xprepareCBAsUniqueOf(Integer gamePlayerGroup, Integer gamePlayerId) {
        assertObjectNotNull("gamePlayerGroup", gamePlayerGroup);assertObjectNotNull("gamePlayerId", gamePlayerId);
        return newConditionBean().acceptUniqueOf(gamePlayerGroup, gamePlayerId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;DbGamePlayerGroupRel&gt; <span style="color: #553000">gamePlayerGroupRelList</span> = <span style="color: #0000C0">gamePlayerGroupRelBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (DbGamePlayerGroupRel <span style="color: #553000">gamePlayerGroupRel</span> : <span style="color: #553000">gamePlayerGroupRelList</span>) {
     *     ... = <span style="color: #553000">gamePlayerGroupRel</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGamePlayerGroupRel. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<DbGamePlayerGroupRel> selectList(CBCall<DbGamePlayerGroupRelCB> cbLambda) {
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
     * PagingResultBean&lt;DbGamePlayerGroupRel&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">gamePlayerGroupRelBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (DbGamePlayerGroupRel gamePlayerGroupRel : <span style="color: #553000">page</span>) {
     *     ... = gamePlayerGroupRel.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGamePlayerGroupRel. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<DbGamePlayerGroupRel> selectPage(CBCall<DbGamePlayerGroupRelCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">gamePlayerGroupRelBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGamePlayerGroupRel. (NotNull)
     * @param entityLambda The handler of entity row of DbGamePlayerGroupRel. (NotNull)
     */
    public void selectCursor(CBCall<DbGamePlayerGroupRelCB> cbLambda, EntityRowHandler<DbGamePlayerGroupRel> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">gamePlayerGroupRelBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<DbGamePlayerGroupRelCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param gamePlayerGroupRelList The entity list of gamePlayerGroupRel. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<DbGamePlayerGroupRel> gamePlayerGroupRelList, ReferrerLoaderHandler<DbLoaderOfGamePlayerGroupRel> loaderLambda) {
        xassLRArg(gamePlayerGroupRelList, loaderLambda);
        loaderLambda.handle(new DbLoaderOfGamePlayerGroupRel().ready(gamePlayerGroupRelList, _behaviorSelector));
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
     * @param gamePlayerGroupRel The entity of gamePlayerGroupRel. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(DbGamePlayerGroupRel gamePlayerGroupRel, ReferrerLoaderHandler<DbLoaderOfGamePlayerGroupRel> loaderLambda) {
        xassLRArg(gamePlayerGroupRel, loaderLambda);
        loaderLambda.handle(new DbLoaderOfGamePlayerGroupRel().ready(xnewLRAryLs(gamePlayerGroupRel), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'DbGamePlayer'.
     * @param gamePlayerGroupRelList The list of gamePlayerGroupRel. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<DbGamePlayer> pulloutGamePlayer(List<DbGamePlayerGroupRel> gamePlayerGroupRelList)
    { return helpPulloutInternally(gamePlayerGroupRelList, "gamePlayer"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key gamePlayerGroupRelId.
     * @param gamePlayerGroupRelList The list of gamePlayerGroupRel. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractGamePlayerGroupRelIdList(List<DbGamePlayerGroupRel> gamePlayerGroupRelList)
    { return helpExtractListInternally(gamePlayerGroupRelList, "gamePlayerGroupRelId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * DbGamePlayerGroupRel gamePlayerGroupRel = <span style="color: #70226C">new</span> DbGamePlayerGroupRel();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * gamePlayerGroupRel.setFoo...(value);
     * gamePlayerGroupRel.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//gamePlayerGroupRel.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//gamePlayerGroupRel.set...;</span>
     * <span style="color: #0000C0">gamePlayerGroupRelBhv</span>.<span style="color: #CC4747">insert</span>(gamePlayerGroupRel);
     * ... = gamePlayerGroupRel.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param gamePlayerGroupRel The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(DbGamePlayerGroupRel gamePlayerGroupRel) {
        doInsert(gamePlayerGroupRel, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * DbGamePlayerGroupRel gamePlayerGroupRel = <span style="color: #70226C">new</span> DbGamePlayerGroupRel();
     * gamePlayerGroupRel.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * gamePlayerGroupRel.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//gamePlayerGroupRel.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//gamePlayerGroupRel.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * gamePlayerGroupRel.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">gamePlayerGroupRelBhv</span>.<span style="color: #CC4747">update</span>(gamePlayerGroupRel);
     * </pre>
     * @param gamePlayerGroupRel The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(DbGamePlayerGroupRel gamePlayerGroupRel) {
        doUpdate(gamePlayerGroupRel, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param gamePlayerGroupRel The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(DbGamePlayerGroupRel gamePlayerGroupRel) {
        doInsertOrUpdate(gamePlayerGroupRel, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * DbGamePlayerGroupRel gamePlayerGroupRel = <span style="color: #70226C">new</span> DbGamePlayerGroupRel();
     * gamePlayerGroupRel.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * gamePlayerGroupRel.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">gamePlayerGroupRelBhv</span>.<span style="color: #CC4747">delete</span>(gamePlayerGroupRel);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param gamePlayerGroupRel The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(DbGamePlayerGroupRel gamePlayerGroupRel) {
        doDelete(gamePlayerGroupRel, null);
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
     *     DbGamePlayerGroupRel gamePlayerGroupRel = <span style="color: #70226C">new</span> DbGamePlayerGroupRel();
     *     gamePlayerGroupRel.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         gamePlayerGroupRel.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     gamePlayerGroupRelList.add(gamePlayerGroupRel);
     * }
     * <span style="color: #0000C0">gamePlayerGroupRelBhv</span>.<span style="color: #CC4747">batchInsert</span>(gamePlayerGroupRelList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param gamePlayerGroupRelList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<DbGamePlayerGroupRel> gamePlayerGroupRelList) {
        return doBatchInsert(gamePlayerGroupRelList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     DbGamePlayerGroupRel gamePlayerGroupRel = <span style="color: #70226C">new</span> DbGamePlayerGroupRel();
     *     gamePlayerGroupRel.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         gamePlayerGroupRel.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         gamePlayerGroupRel.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//gamePlayerGroupRel.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     gamePlayerGroupRelList.add(gamePlayerGroupRel);
     * }
     * <span style="color: #0000C0">gamePlayerGroupRelBhv</span>.<span style="color: #CC4747">batchUpdate</span>(gamePlayerGroupRelList);
     * </pre>
     * @param gamePlayerGroupRelList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<DbGamePlayerGroupRel> gamePlayerGroupRelList) {
        return doBatchUpdate(gamePlayerGroupRelList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param gamePlayerGroupRelList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<DbGamePlayerGroupRel> gamePlayerGroupRelList) {
        return doBatchDelete(gamePlayerGroupRelList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">gamePlayerGroupRelBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;DbGamePlayerGroupRel, DbGamePlayerGroupRelCB&gt;() {
     *     public ConditionBean setup(DbGamePlayerGroupRel entity, DbGamePlayerGroupRelCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<DbGamePlayerGroupRel, DbGamePlayerGroupRelCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * DbGamePlayerGroupRel gamePlayerGroupRel = <span style="color: #70226C">new</span> DbGamePlayerGroupRel();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//gamePlayerGroupRel.setPK...(value);</span>
     * gamePlayerGroupRel.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//gamePlayerGroupRel.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//gamePlayerGroupRel.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//gamePlayerGroupRel.setVersionNo(value);</span>
     * <span style="color: #0000C0">gamePlayerGroupRelBhv</span>.<span style="color: #CC4747">queryUpdate</span>(gamePlayerGroupRel, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param gamePlayerGroupRel The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of DbGamePlayerGroupRel. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(DbGamePlayerGroupRel gamePlayerGroupRel, CBCall<DbGamePlayerGroupRelCB> cbLambda) {
        return doQueryUpdate(gamePlayerGroupRel, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">gamePlayerGroupRelBhv</span>.<span style="color: #CC4747">queryDelete</span>(gamePlayerGroupRel, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGamePlayerGroupRel. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<DbGamePlayerGroupRelCB> cbLambda) {
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
     * DbGamePlayerGroupRel gamePlayerGroupRel = <span style="color: #70226C">new</span> DbGamePlayerGroupRel();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * gamePlayerGroupRel.setFoo...(value);
     * gamePlayerGroupRel.setBar...(value);
     * <span style="color: #0000C0">gamePlayerGroupRelBhv</span>.<span style="color: #CC4747">varyingInsert</span>(gamePlayerGroupRel, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = gamePlayerGroupRel.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param gamePlayerGroupRel The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(DbGamePlayerGroupRel gamePlayerGroupRel, WritableOptionCall<DbGamePlayerGroupRelCB, InsertOption<DbGamePlayerGroupRelCB>> opLambda) {
        doInsert(gamePlayerGroupRel, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * DbGamePlayerGroupRel gamePlayerGroupRel = <span style="color: #70226C">new</span> DbGamePlayerGroupRel();
     * gamePlayerGroupRel.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * gamePlayerGroupRel.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * gamePlayerGroupRel.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">gamePlayerGroupRelBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(gamePlayerGroupRel, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param gamePlayerGroupRel The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(DbGamePlayerGroupRel gamePlayerGroupRel, WritableOptionCall<DbGamePlayerGroupRelCB, UpdateOption<DbGamePlayerGroupRelCB>> opLambda) {
        doUpdate(gamePlayerGroupRel, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param gamePlayerGroupRel The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(DbGamePlayerGroupRel gamePlayerGroupRel, WritableOptionCall<DbGamePlayerGroupRelCB, InsertOption<DbGamePlayerGroupRelCB>> insertOpLambda, WritableOptionCall<DbGamePlayerGroupRelCB, UpdateOption<DbGamePlayerGroupRelCB>> updateOpLambda) {
        doInsertOrUpdate(gamePlayerGroupRel, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param gamePlayerGroupRel The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(DbGamePlayerGroupRel gamePlayerGroupRel, WritableOptionCall<DbGamePlayerGroupRelCB, DeleteOption<DbGamePlayerGroupRelCB>> opLambda) {
        doDelete(gamePlayerGroupRel, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param gamePlayerGroupRelList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<DbGamePlayerGroupRel> gamePlayerGroupRelList, WritableOptionCall<DbGamePlayerGroupRelCB, InsertOption<DbGamePlayerGroupRelCB>> opLambda) {
        return doBatchInsert(gamePlayerGroupRelList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param gamePlayerGroupRelList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<DbGamePlayerGroupRel> gamePlayerGroupRelList, WritableOptionCall<DbGamePlayerGroupRelCB, UpdateOption<DbGamePlayerGroupRelCB>> opLambda) {
        return doBatchUpdate(gamePlayerGroupRelList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param gamePlayerGroupRelList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<DbGamePlayerGroupRel> gamePlayerGroupRelList, WritableOptionCall<DbGamePlayerGroupRelCB, DeleteOption<DbGamePlayerGroupRelCB>> opLambda) {
        return doBatchDelete(gamePlayerGroupRelList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<DbGamePlayerGroupRel, DbGamePlayerGroupRelCB> manyArgLambda, WritableOptionCall<DbGamePlayerGroupRelCB, InsertOption<DbGamePlayerGroupRelCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * DbGamePlayerGroupRel gamePlayerGroupRel = <span style="color: #70226C">new</span> DbGamePlayerGroupRel();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//gamePlayerGroupRel.setPK...(value);</span>
     * gamePlayerGroupRel.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//gamePlayerGroupRel.setVersionNo(value);</span>
     * <span style="color: #0000C0">gamePlayerGroupRelBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(gamePlayerGroupRel, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param gamePlayerGroupRel The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of DbGamePlayerGroupRel. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(DbGamePlayerGroupRel gamePlayerGroupRel, CBCall<DbGamePlayerGroupRelCB> cbLambda, WritableOptionCall<DbGamePlayerGroupRelCB, UpdateOption<DbGamePlayerGroupRelCB>> opLambda) {
        return doQueryUpdate(gamePlayerGroupRel, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">gamePlayerGroupRelBhv</span>.<span style="color: #CC4747">queryDelete</span>(gamePlayerGroupRel, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DbGamePlayerGroupRel. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<DbGamePlayerGroupRelCB> cbLambda, WritableOptionCall<DbGamePlayerGroupRelCB, DeleteOption<DbGamePlayerGroupRelCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * gamePlayerGroupRelBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * gamePlayerGroupRelBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * gamePlayerGroupRelBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * gamePlayerGroupRelBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * gamePlayerGroupRelBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * gamePlayerGroupRelBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * gamePlayerGroupRelBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * gamePlayerGroupRelBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * gamePlayerGroupRelBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * gamePlayerGroupRelBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * gamePlayerGroupRelBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * gamePlayerGroupRelBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * gamePlayerGroupRelBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * gamePlayerGroupRelBhv.outideSql().removeBlockComment().selectList()
     * gamePlayerGroupRelBhv.outideSql().removeLineComment().selectList()
     * gamePlayerGroupRelBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<DbGamePlayerGroupRelBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends DbGamePlayerGroupRel> typeOfSelectedEntity() { return DbGamePlayerGroupRel.class; }
    protected Class<DbGamePlayerGroupRel> typeOfHandlingEntity() { return DbGamePlayerGroupRel.class; }
    protected Class<DbGamePlayerGroupRelCB> typeOfHandlingConditionBean() { return DbGamePlayerGroupRelCB.class; }

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
