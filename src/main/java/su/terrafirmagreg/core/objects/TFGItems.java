package su.terrafirmagreg.core.objects;

import appeng.core.definitions.AEBlocks;
import appeng.core.definitions.AEItems;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.ItemMaterialInfo;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialStack;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.registry.GTRegistration;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;
import su.terrafirmagreg.core.TerraFirmaGreg;
import su.terrafirmagreg.core.compat.gtceu.TFGMaterials;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTItems.materialInfo;

public class TFGItems {

    public static final ItemEntry<?>[] EXTRUDER_SHAPES = new ItemEntry[17];

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

    public static void init() {
        registerExtruderMolds();

        /* Register here more shit */
    }

    private static void registerExtruderMolds() {
        EXTRUDER_SHAPES[0] = SHAPE_EXTRUDER_MINING_HAMMER_HEAD = GTRegistration.REGISTRATE.item("mining_hammer_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        EXTRUDER_SHAPES[1] = SHAPE_EXTRUDER_SWORD_HEAD = GTRegistration.REGISTRATE.item("sword_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        EXTRUDER_SHAPES[2] = SHAPE_EXTRUDER_PICKAXE_HEAD = GTRegistration.REGISTRATE.item("pickaxe_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        EXTRUDER_SHAPES[3] = SHAPE_EXTRUDER_SHOVEL_HEAD = GTRegistration.REGISTRATE.item("shovel_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        EXTRUDER_SHAPES[4] = SHAPE_EXTRUDER_AXE_HEAD = GTRegistration.REGISTRATE.item("axe_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        EXTRUDER_SHAPES[5] = SHAPE_EXTRUDER_HOE_HEAD = GTRegistration.REGISTRATE.item("hoe_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        EXTRUDER_SHAPES[6] = SHAPE_EXTRUDER_SCYTHE_HEAD = GTRegistration.REGISTRATE.item("scythe_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        EXTRUDER_SHAPES[7] = SHAPE_EXTRUDER_FILE_HEAD = GTRegistration.REGISTRATE.item("file_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        EXTRUDER_SHAPES[8] = SHAPE_EXTRUDER_HAMMER_HEAD = GTRegistration.REGISTRATE.item("hammer_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        EXTRUDER_SHAPES[9] = SHAPE_EXTRUDER_SAW_HEAD = GTRegistration.REGISTRATE.item("saw_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        EXTRUDER_SHAPES[10] = SHAPE_EXTRUDER_KNIFE_HEAD = GTRegistration.REGISTRATE.item("knife_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        EXTRUDER_SHAPES[11] = SHAPE_EXTRUDER_BUTCHERY_KNIFE_HEAD = GTRegistration.REGISTRATE.item("butchery_knife_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        EXTRUDER_SHAPES[12] = SHAPE_EXTRUDER_SPADE_HEAD = GTRegistration.REGISTRATE.item("spade_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        EXTRUDER_SHAPES[13] = SHAPE_EXTRUDER_PROPICK_HEAD = GTRegistration.REGISTRATE.item("propick_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        EXTRUDER_SHAPES[14] = SHAPE_EXTRUDER_JAVELIN_HEAD = GTRegistration.REGISTRATE.item("javelin_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        EXTRUDER_SHAPES[15] = SHAPE_EXTRUDER_CHISEL_HEAD = GTRegistration.REGISTRATE.item("chisel_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();

        EXTRUDER_SHAPES[16] = SHAPE_EXTRUDER_MACE_HEAD = GTRegistration.REGISTRATE.item("mace_head_extruder_mold", Item::new)
                .onRegister(materialInfo(new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M * 4)))).register();
    }
}
