package su.terrafirmagreg.core.objects;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.ItemMaterialInfo;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialStack;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.registry.GTRegistration;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;

import static com.gregtechceu.gtceu.common.data.GTItems.materialInfo;

public final class TFGItems {

    public static final ItemEntry<?>[] SHAPE_EXTRUDERS = new ItemEntry[17];
    public static final ItemEntry<?>[] SHAPE_MOLDS = new ItemEntry[4];

    public static ItemEntry<Item> SHAPE_EXTRUDER_MINING_HAMMER_HEAD;
    public static ItemEntry<Item> SHAPE_EXTRUDER_SWORD_HEAD;
    public static ItemEntry<Item> SHAPE_EXTRUDER_PICKAXE_HEAD;
    public static ItemEntry<Item> SHAPE_EXTRUDER_SHOVEL_HEAD;
    public static ItemEntry<Item> SHAPE_EXTRUDER_AXE_HEAD;
    public static ItemEntry<Item> SHAPE_EXTRUDER_HOE_HEAD;
    public static ItemEntry<Item> SHAPE_EXTRUDER_SCYTHE_HEAD;
    public static ItemEntry<Item> SHAPE_EXTRUDER_FILE_HEAD;
    public static ItemEntry<Item> SHAPE_EXTRUDER_HAMMER_HEAD;
    public static ItemEntry<Item> SHAPE_EXTRUDER_SAW_HEAD;
    public static ItemEntry<Item> SHAPE_EXTRUDER_KNIFE_HEAD;
    public static ItemEntry<Item> SHAPE_EXTRUDER_BUTCHERY_KNIFE_HEAD;
    public static ItemEntry<Item> SHAPE_EXTRUDER_SPADE_HEAD;
    public static ItemEntry<Item> SHAPE_EXTRUDER_PROPICK_HEAD;
    public static ItemEntry<Item> SHAPE_EXTRUDER_JAVELIN_HEAD;
    public static ItemEntry<Item> SHAPE_EXTRUDER_CHISEL_HEAD;
    public static ItemEntry<Item> SHAPE_EXTRUDER_MACE_HEAD;

    public static ItemEntry<Item> SHAPE_MOLD_UNFINISHED_LAMP;
    public static ItemEntry<Item> SHAPE_MOLD_TRAPDOOR;
    public static ItemEntry<Item> SHAPE_MOLD_CHAIN;
    public static ItemEntry<Item> SHAPE_MOLD_BELL;

    public static ItemEntry<Item> EarthPlaceholder;
    public static ItemEntry<Item> MoonPlaceholder;
    public static ItemEntry<Item> MarsPlaceholder;
    public static ItemEntry<Item> VenusPlaceholder;

    public static void init() {
        registerExtruderMolds();
        registerShapeModlds();
        // registerPlanetItems();
    }

    private static void registerExtruderMolds() {
        SHAPE_EXTRUDERS[0] = SHAPE_EXTRUDER_MINING_HAMMER_HEAD = GTRegistration.REGISTRATE.item("mining_hammer_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[1] = SHAPE_EXTRUDER_SWORD_HEAD = GTRegistration.REGISTRATE.item("sword_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[2] = SHAPE_EXTRUDER_PICKAXE_HEAD = GTRegistration.REGISTRATE.item("pickaxe_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[3] = SHAPE_EXTRUDER_SHOVEL_HEAD = GTRegistration.REGISTRATE.item("shovel_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[4] = SHAPE_EXTRUDER_AXE_HEAD = GTRegistration.REGISTRATE.item("axe_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[5] = SHAPE_EXTRUDER_HOE_HEAD = GTRegistration.REGISTRATE.item("hoe_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[6] = SHAPE_EXTRUDER_SCYTHE_HEAD = GTRegistration.REGISTRATE.item("scythe_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[7] = SHAPE_EXTRUDER_FILE_HEAD = GTRegistration.REGISTRATE.item("file_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[8] = SHAPE_EXTRUDER_HAMMER_HEAD = GTRegistration.REGISTRATE.item("hammer_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[9] = SHAPE_EXTRUDER_SAW_HEAD = GTRegistration.REGISTRATE.item("saw_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[10] = SHAPE_EXTRUDER_KNIFE_HEAD = GTRegistration.REGISTRATE.item("knife_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[11] = SHAPE_EXTRUDER_BUTCHERY_KNIFE_HEAD = GTRegistration.REGISTRATE.item("butchery_knife_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[12] = SHAPE_EXTRUDER_SPADE_HEAD = GTRegistration.REGISTRATE.item("spade_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[13] = SHAPE_EXTRUDER_PROPICK_HEAD = GTRegistration.REGISTRATE.item("propick_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[14] = SHAPE_EXTRUDER_JAVELIN_HEAD = GTRegistration.REGISTRATE.item("javelin_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[15] = SHAPE_EXTRUDER_CHISEL_HEAD = GTRegistration.REGISTRATE.item("chisel_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[16] = SHAPE_EXTRUDER_MACE_HEAD = GTRegistration.REGISTRATE.item("mace_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();
    }

    private static void registerShapeModlds() {
        SHAPE_MOLDS[0] = SHAPE_MOLD_UNFINISHED_LAMP = GTRegistration.REGISTRATE.item("lamp_casting_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_MOLDS[1] = SHAPE_MOLD_TRAPDOOR = GTRegistration.REGISTRATE.item("trapdoor_casting_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_MOLDS[2] = SHAPE_MOLD_CHAIN = GTRegistration.REGISTRATE.item("chain_casting_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_MOLDS[3] = SHAPE_MOLD_BELL = GTRegistration.REGISTRATE.item("bell_casting_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();
    }

    private static void registerPlanetItems() {
        EarthPlaceholder = GTRegistration.REGISTRATE.item("earth_placeholder", Item::new).register();
        MoonPlaceholder = GTRegistration.REGISTRATE.item("moon_placeholder", Item::new).register();
        MarsPlaceholder = GTRegistration.REGISTRATE.item("mars_placeholder", Item::new).register();
        VenusPlaceholder = GTRegistration.REGISTRATE.item("venus_placeholder", Item::new).register();
    }
}
