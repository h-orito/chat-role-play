package dev.wolfort.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import dev.wolfort.dbflute.allcommon.*;
import dev.wolfort.dbflute.exentity.*;

/**
 * The DB meta of game_setting. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DbGameSettingDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DbGameSettingDbm _instance = new DbGameSettingDbm();
    private DbGameSettingDbm() {}
    public static DbGameSettingDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DbDBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DbDBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DbDBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DbDBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((DbGameSetting)et).getGameSettingId(), (et, vl) -> ((DbGameSetting)et).setGameSettingId(cti(vl)), "gameSettingId");
        setupEpg(_epgMap, et -> ((DbGameSetting)et).getGameId(), (et, vl) -> ((DbGameSetting)et).setGameId(cti(vl)), "gameId");
        setupEpg(_epgMap, et -> ((DbGameSetting)et).getGameSettingItemCode(), (et, vl) -> ((DbGameSetting)et).setGameSettingItemCode((String)vl), "gameSettingItemCode");
        setupEpg(_epgMap, et -> ((DbGameSetting)et).getGameSettingItemValue(), (et, vl) -> ((DbGameSetting)et).setGameSettingItemValue((String)vl), "gameSettingItemValue");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((DbGameSetting)et).getGame(), (et, vl) -> ((DbGameSetting)et).setGame((OptionalEntity<DbGame>)vl), "game");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "game_setting";
    protected final String _tableDispName = "GAME_SETTING";
    protected final String _tablePropertyName = "gameSetting";
    protected final TableSqlName _tableSqlName = new TableSqlName("GAME_SETTING", _tableDbName);
    { _tableSqlName.xacceptFilter(DbDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnGameSettingId = cci("game_setting_id", "game_setting_id", null, null, Integer.class, "gameSettingId", null, true, true, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGameId = cci("game_id", "game_id", null, null, Integer.class, "gameId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "game", null, null, false);
    protected final ColumnInfo _columnGameSettingItemCode = cci("game_setting_item_code", "game_setting_item_code", null, null, String.class, "gameSettingItemCode", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGameSettingItemValue = cci("game_setting_item_value", "game_setting_item_value", null, null, String.class, "gameSettingItemValue", null, false, false, true, "VARCHAR", 1000, 0, null, null, false, null, null, null, null, null, false);

    /**
     * game_setting_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGameSettingId() { return _columnGameSettingId; }
    /**
     * game_id: {IX, NotNull, INT UNSIGNED(10), FK to game}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGameId() { return _columnGameId; }
    /**
     * game_setting_item_code: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGameSettingItemCode() { return _columnGameSettingItemCode; }
    /**
     * game_setting_item_value: {NotNull, VARCHAR(1000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGameSettingItemValue() { return _columnGameSettingItemValue; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnGameSettingId());
        ls.add(columnGameId());
        ls.add(columnGameSettingItemCode());
        ls.add(columnGameSettingItemValue());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnGameSettingId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * GAME by my game_id, named 'game'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignGame() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGameId(), DbGameDbm.getInstance().columnGameId());
        return cfi("fk_game_setting_game", "game", this, DbGameDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "gameSettingList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "dev.wolfort.dbflute.exentity.DbGameSetting"; }
    public String getConditionBeanTypeName() { return "dev.wolfort.dbflute.cbean.DbGameSettingCB"; }
    public String getBehaviorTypeName() { return "dev.wolfort.dbflute.exbhv.DbGameSettingBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<DbGameSetting> getEntityType() { return DbGameSetting.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public DbGameSetting newEntity() { return new DbGameSetting(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((DbGameSetting)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((DbGameSetting)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
