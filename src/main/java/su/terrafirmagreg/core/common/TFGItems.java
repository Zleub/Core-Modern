package su.terrafirmagreg.core.common;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.ItemMaterialInfo;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialStack;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;
import su.terrafirmagreg.core.TFGCore;

import static com.gregtechceu.gtceu.common.data.GTItems.materialInfo;

public final class TFGItems {

    public static final ItemEntry<?>[] SHAPE_EXTRUDERS = new ItemEntry[17];
    public static final ItemEntry<?>[] SHAPE_MOLDS = new ItemEntry[4];
    public static final ItemEntry<?>[] PLANET_PLACEHOLDERS = new ItemEntry[6];

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

    public static void init() {
        registerExtruderMolds();
        registerShapeModlds();
    }

    private static void registerExtruderMolds() {
        SHAPE_EXTRUDERS[0] = SHAPE_EXTRUDER_MINING_HAMMER_HEAD = TFGCore.REGISTRATE.item("mining_hammer_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[1] = SHAPE_EXTRUDER_SWORD_HEAD = TFGCore.REGISTRATE.item("sword_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[2] = SHAPE_EXTRUDER_PICKAXE_HEAD = TFGCore.REGISTRATE.item("pickaxe_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[3] = SHAPE_EXTRUDER_SHOVEL_HEAD = TFGCore.REGISTRATE.item("shovel_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[4] = SHAPE_EXTRUDER_AXE_HEAD = TFGCore.REGISTRATE.item("axe_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[5] = SHAPE_EXTRUDER_HOE_HEAD = TFGCore.REGISTRATE.item("hoe_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[6] = SHAPE_EXTRUDER_SCYTHE_HEAD = TFGCore.REGISTRATE.item("scythe_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[7] = SHAPE_EXTRUDER_FILE_HEAD = TFGCore.REGISTRATE.item("file_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[8] = SHAPE_EXTRUDER_HAMMER_HEAD = TFGCore.REGISTRATE.item("hammer_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[9] = SHAPE_EXTRUDER_SAW_HEAD = TFGCore.REGISTRATE.item("saw_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[10] = SHAPE_EXTRUDER_KNIFE_HEAD = TFGCore.REGISTRATE.item("knife_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[11] = SHAPE_EXTRUDER_BUTCHERY_KNIFE_HEAD = TFGCore.REGISTRATE.item("butchery_knife_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[12] = SHAPE_EXTRUDER_SPADE_HEAD = TFGCore.REGISTRATE.item("spade_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[13] = SHAPE_EXTRUDER_PROPICK_HEAD = TFGCore.REGISTRATE.item("propick_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[14] = SHAPE_EXTRUDER_JAVELIN_HEAD = TFGCore.REGISTRATE.item("javelin_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[15] = SHAPE_EXTRUDER_CHISEL_HEAD = TFGCore.REGISTRATE.item("chisel_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_EXTRUDERS[16] = SHAPE_EXTRUDER_MACE_HEAD = TFGCore.REGISTRATE.item("mace_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();
    }

    private static void registerShapeModlds() {
        SHAPE_MOLDS[0] = SHAPE_MOLD_UNFINISHED_LAMP = TFGCore.REGISTRATE.item("lamp_casting_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_MOLDS[1] = SHAPE_MOLD_TRAPDOOR = TFGCore.REGISTRATE.item("trapdoor_casting_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_MOLDS[2] = SHAPE_MOLD_CHAIN = TFGCore.REGISTRATE.item("chain_casting_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        SHAPE_MOLDS[3] = SHAPE_MOLD_BELL = TFGCore.REGISTRATE.item("bell_casting_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();
    }
}
