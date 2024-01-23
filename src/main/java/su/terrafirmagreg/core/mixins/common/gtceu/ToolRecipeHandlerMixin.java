package su.terrafirmagreg.core.mixins.common.gtceu;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.ToolProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.item.tool.GTToolType;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.gregtechceu.gtceu.data.recipe.generated.ToolRecipeHandler;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.terrafirmagreg.core.compat.gtceu.TFGMaterialFlags;
import su.terrafirmagreg.core.compat.gtceu.TFGTagPrefixes;
import su.terrafirmagreg.core.objects.TFGTags;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.data.recipe.generated.ToolRecipeHandler.addElectricToolRecipe;
import static com.gregtechceu.gtceu.data.recipe.generated.ToolRecipeHandler.addToolRecipe;

@Mixin(value = ToolRecipeHandler.class, remap = false)
public class ToolRecipeHandlerMixin {

    /**
     * Отключение генерации рецептов под инструменты из кремния.
     */
    @Redirect(method = "registerCustomToolRecipes", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/generated/ToolRecipeHandler;registerFlintToolRecipes(Ljava/util/function/Consumer;)V"), remap = false)
    private static void redirectRegisterFlintToolRecipes(Consumer<FinishedRecipe> provider) {}

    /**
     * Замена ванильного камня в рецепте ступки на тфк камень.
     */
    @Redirect(method = "registerMortarRecipes", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/generated/ToolRecipeHandler;addToolRecipe(Ljava/util/function/Consumer;Lcom/gregtechceu/gtceu/api/data/chemical/material/Material;Lcom/gregtechceu/gtceu/api/item/tool/GTToolType;Z[Ljava/lang/Object;)V"), remap = false)
    private static void registerMortarRecipes(Consumer<FinishedRecipe> provider, Material material, GTToolType tool, boolean mirrored, Object[] recipe) {
        addToolRecipe(provider, material, GTToolType.MORTAR, false,
                " I ", "SIS", "SSS",
                'I', new UnificationEntry(material.hasProperty(PropertyKey.GEM) ? TagPrefix.gem : TagPrefix.ingot, material),
                'S', TFGTags.Items.RawRockBlocks);
    }

    /**
     * Отключение рецептов MiningHammer.
     */
    @Redirect(method = "processTool", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/generated/ToolRecipeHandler;addToolRecipe(Ljava/util/function/Consumer;Lcom/gregtechceu/gtceu/api/data/chemical/material/Material;Lcom/gregtechceu/gtceu/api/item/tool/GTToolType;Z[Ljava/lang/Object;)V", ordinal = 0), remap = false)
    private static void processMiningHammer(Consumer<FinishedRecipe> provider, Material material, GTToolType tool, boolean mirrored, Object[] recipe) {
        if (!material.hasFlag(TFGMaterialFlags.HAS_TFC_TOOL))
            tfg$addToolRecipe(provider, material, GTToolType.MINING_HAMMER, TFGTagPrefixes.toolHeadMiningHammer);
    }

    /**
     * Отключение рецептов Spade.
     */
    //@Redirect(method = "processTool", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/generated/ToolRecipeHandler;addToolRecipe(Ljava/util/function/Consumer;Lcom/gregtechceu/gtceu/api/data/chemical/material/Material;Lcom/gregtechceu/gtceu/api/item/tool/GTToolType;Z[Ljava/lang/Object;)V", ordinal = 1), remap = false)
    //private static void processSpade(Consumer<FinishedRecipe> provider, Material material, GTToolType tool, boolean mirrored, Object[] recipe) {
    //    if (!material.hasFlag(TFGMaterialFlags.TFC_TOOL))
    //        tfg$addToolRecipe(provider, material, GTToolType.SPADE, TFGTagPrefixes.toolHeadSpade);
    //}

    /**
     * Отключение рецептов Saw.
     */
    @Redirect(method = "processTool", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/generated/ToolRecipeHandler;addToolRecipe(Ljava/util/function/Consumer;Lcom/gregtechceu/gtceu/api/data/chemical/material/Material;Lcom/gregtechceu/gtceu/api/item/tool/GTToolType;Z[Ljava/lang/Object;)V", ordinal = 2), remap = false)
    private static void processSaw(Consumer<FinishedRecipe> provider, Material material, GTToolType tool, boolean mirrored, Object[] recipe) {
        if (!material.hasFlag(TFGMaterialFlags.HAS_TFC_TOOL))
            tfg$addToolRecipe(provider, material, GTToolType.SAW, TFGTagPrefixes.toolHeadSaw);
    }

    /**
     * Отключение рецептов Axe.
     */
    @Redirect(method = "processTool", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/generated/ToolRecipeHandler;addToolRecipe(Ljava/util/function/Consumer;Lcom/gregtechceu/gtceu/api/data/chemical/material/Material;Lcom/gregtechceu/gtceu/api/item/tool/GTToolType;Z[Ljava/lang/Object;)V", ordinal = 3), remap = false)
    private static void processAxe(Consumer<FinishedRecipe> provider, Material material, GTToolType tool, boolean mirrored, Object[] recipe) {
        if (!material.hasFlag(TFGMaterialFlags.HAS_TFC_TOOL))
            tfg$addToolRecipe(provider, material, GTToolType.AXE, TFGTagPrefixes.toolHeadAxe);
    }

    /**
     * Отключение рецептов Hoe.
     */
    @Redirect(method = "processTool", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/generated/ToolRecipeHandler;addToolRecipe(Ljava/util/function/Consumer;Lcom/gregtechceu/gtceu/api/data/chemical/material/Material;Lcom/gregtechceu/gtceu/api/item/tool/GTToolType;Z[Ljava/lang/Object;)V", ordinal = 4), remap = false)
    private static void processHoe(Consumer<FinishedRecipe> provider, Material material, GTToolType tool, boolean mirrored, Object[] recipe) {
        if (!material.hasFlag(TFGMaterialFlags.HAS_TFC_TOOL))
            tfg$addToolRecipe(provider, material, GTToolType.HOE, TFGTagPrefixes.toolHeadHoe);
    }

    /**
     * Отключение рецептов Pickaxe.
     */
    @Redirect(method = "processTool", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/generated/ToolRecipeHandler;addToolRecipe(Ljava/util/function/Consumer;Lcom/gregtechceu/gtceu/api/data/chemical/material/Material;Lcom/gregtechceu/gtceu/api/item/tool/GTToolType;Z[Ljava/lang/Object;)V", ordinal = 5), remap = false)
    private static void processPickaxe(Consumer<FinishedRecipe> provider, Material material, GTToolType tool, boolean mirrored, Object[] recipe) {
        if (!material.hasFlag(TFGMaterialFlags.HAS_TFC_TOOL))
            tfg$addToolRecipe(provider, material, GTToolType.PICKAXE, TFGTagPrefixes.toolHeadPickaxe);
    }

    /**
     * Отключение рецептов Scythe.
     */
    @Redirect(method = "processTool", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/generated/ToolRecipeHandler;addToolRecipe(Ljava/util/function/Consumer;Lcom/gregtechceu/gtceu/api/data/chemical/material/Material;Lcom/gregtechceu/gtceu/api/item/tool/GTToolType;Z[Ljava/lang/Object;)V", ordinal = 6), remap = false)
    private static void processScythe(Consumer<FinishedRecipe> provider, Material material, GTToolType tool, boolean mirrored, Object[] recipe) {
        if (!material.hasFlag(TFGMaterialFlags.HAS_TFC_TOOL))
            tfg$addToolRecipe(provider, material, GTToolType.SCYTHE, TFGTagPrefixes.toolHeadScythe);
    }

    /**
     * Отключение рецептов Shovel.
     */
    @Redirect(method = "processTool", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/generated/ToolRecipeHandler;addToolRecipe(Ljava/util/function/Consumer;Lcom/gregtechceu/gtceu/api/data/chemical/material/Material;Lcom/gregtechceu/gtceu/api/item/tool/GTToolType;Z[Ljava/lang/Object;)V", ordinal = 7), remap = false)
    private static void processShovel(Consumer<FinishedRecipe> provider, Material material, GTToolType tool, boolean mirrored, Object[] recipe) {
        if (!material.hasFlag(TFGMaterialFlags.HAS_TFC_TOOL))
            tfg$addToolRecipe(provider, material, GTToolType.SHOVEL, TFGTagPrefixes.toolHeadShovel);
    }

    /**
     * Отключение рецептов Sword.
     */
    @Redirect(method = "processTool", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/generated/ToolRecipeHandler;addToolRecipe(Ljava/util/function/Consumer;Lcom/gregtechceu/gtceu/api/data/chemical/material/Material;Lcom/gregtechceu/gtceu/api/item/tool/GTToolType;Z[Ljava/lang/Object;)V", ordinal = 8), remap = false)
    private static void processSword(Consumer<FinishedRecipe> provider, Material material, GTToolType tool, boolean mirrored, Object[] recipe) {
        if (!material.hasFlag(TFGMaterialFlags.HAS_TFC_TOOL))
            tfg$addToolRecipe(provider, material, GTToolType.SWORD, TFGTagPrefixes.toolHeadSword);
    }

    /**
     * Отключение рецептов HardHammer.
     */
    @Redirect(method = "processTool", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/generated/ToolRecipeHandler;addToolRecipe(Ljava/util/function/Consumer;Lcom/gregtechceu/gtceu/api/data/chemical/material/Material;Lcom/gregtechceu/gtceu/api/item/tool/GTToolType;Z[Ljava/lang/Object;)V", ordinal = 9), remap = false)
    private static void processHardHammer(Consumer<FinishedRecipe> provider, Material material, GTToolType tool, boolean mirrored, Object[] recipe) {
        if (!material.hasFlag(TFGMaterialFlags.HAS_TFC_TOOL))
            tfg$addToolRecipe(provider, material, GTToolType.HARD_HAMMER, TFGTagPrefixes.toolHeadHammer);
    }

    /**
     * Отключение рецептов File.
     */
    @Redirect(method = "processTool", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/generated/ToolRecipeHandler;addToolRecipe(Ljava/util/function/Consumer;Lcom/gregtechceu/gtceu/api/data/chemical/material/Material;Lcom/gregtechceu/gtceu/api/item/tool/GTToolType;Z[Ljava/lang/Object;)V", ordinal = 10), remap = false)
    private static void processFile(Consumer<FinishedRecipe> provider, Material material, GTToolType tool, boolean mirrored, Object[] recipe) {
        if (!material.hasFlag(TFGMaterialFlags.HAS_TFC_TOOL))
            tfg$addToolRecipe(provider, material, GTToolType.FILE, TFGTagPrefixes.toolHeadFile);
    }

    /**
     * Отключение рецептов Knife.
     */
    @Redirect(method = "processTool", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/generated/ToolRecipeHandler;addToolRecipe(Ljava/util/function/Consumer;Lcom/gregtechceu/gtceu/api/data/chemical/material/Material;Lcom/gregtechceu/gtceu/api/item/tool/GTToolType;Z[Ljava/lang/Object;)V", ordinal = 11), remap = false)
    private static void processKnife(Consumer<FinishedRecipe> provider, Material material, GTToolType tool, boolean mirrored, Object[] recipe) {
        if (!material.hasFlag(TFGMaterialFlags.HAS_TFC_TOOL))
            tfg$addToolRecipe(provider, material, GTToolType.KNIFE, TFGTagPrefixes.toolHeadKnife);
    }

    @Unique
    private static void tfg$addToolRecipe(Consumer<FinishedRecipe> provider, Material material, GTToolType toolType, TagPrefix tagPrefix) {
        addToolRecipe(provider, material, toolType, false, "H", "S", 'H', new UnificationEntry(tagPrefix, material), 'S', TFGTags.Items.WoodenSticks);
    }


    /**
     * Доп проверка для рецепта оголовья бура
     * */
    @Inject(method = "processElectricTool", at = @At(value = "HEAD"), cancellable = true, remap = false)
    private static void onProcessElectricTool(TagPrefix prefix, Material material, ToolProperty property, Consumer<FinishedRecipe> provider, CallbackInfo ci) {
        final int voltageMultiplier = material.getBlastTemperature() > 2800 ? GTValues.VA[GTValues.LV] : GTValues.VA[GTValues.ULV];
        TagPrefix toolPrefix;
        ItemStack toolStack;

        if (material.hasFlag(GENERATE_PLATE)) {
            final UnificationEntry plate = new UnificationEntry(TagPrefix.plate, material);
            final UnificationEntry steelPlate = new UnificationEntry(TagPrefix.plate, GTMaterials.Steel);
            final UnificationEntry steelRing = new UnificationEntry(TagPrefix.ring, GTMaterials.Steel);

            // drill
            toolPrefix = TagPrefix.toolHeadDrill;
            toolStack = ChemicalHelper.get(toolPrefix, material);

            if (!toolStack.isEmpty()) {
                VanillaRecipeHelper.addShapedRecipe(provider, String.format("drill_head_%s", material.getName()),
                        toolStack,
                        "XSX", "XSX", "ShS",
                        'X', plate,
                        'S', steelPlate);

                addElectricToolRecipe(toolPrefix, material, new GTToolType[]{GTToolType.DRILL_LV, GTToolType.DRILL_MV, GTToolType.DRILL_HV, GTToolType.DRILL_EV, GTToolType.DRILL_IV}, provider);
            }


            // chainsaw
            toolPrefix = TagPrefix.toolHeadChainsaw;
            toolStack = ChemicalHelper.get(toolPrefix, material);

            if (!toolStack.isEmpty()) {
                VanillaRecipeHelper.addShapedRecipe(provider, String.format("chainsaw_head_%s", material.getName()),
                        toolStack,
                        "SRS", "XhX", "SRS",
                        'X', plate,
                        'S', steelPlate,
                        'R', steelRing);

                addElectricToolRecipe(toolPrefix, material, new GTToolType[]{GTToolType.CHAINSAW_LV}, provider);
            }

            // wrench
            toolPrefix = TagPrefix.toolHeadWrench;
            toolStack = ChemicalHelper.get(toolPrefix, material);

            if (!toolStack.isEmpty()) {
                VanillaRecipeHelper.addShapedRecipe(provider, String.format("wrench_head_%s", material.getName()),
                        ChemicalHelper.get(toolPrefix, material),
                        "hXW", "XRX", "WXd",
                        'X', plate,
                        'R', steelRing,
                        'W', new UnificationEntry(TagPrefix.screw, GTMaterials.Steel));

                addElectricToolRecipe(toolPrefix, material, new GTToolType[]{GTToolType.WRENCH_LV, GTToolType.WRENCH_HV, GTToolType.WRENCH_IV}, provider);
            }

            // buzzsaw
            toolPrefix = TagPrefix.toolHeadBuzzSaw;
            toolStack = ChemicalHelper.get(toolPrefix, material);

            if (!toolStack.isEmpty()) {
                VanillaRecipeHelper.addShapedRecipe(provider, String.format("buzzsaw_blade_%s", material.getName()),
                        ChemicalHelper.get(toolPrefix, material),
                        "sXh", "X X", "fXx",
                        'X', plate);

                addElectricToolRecipe(toolPrefix, material, new GTToolType[]{GTToolType.BUZZSAW}, provider);

                if (material.hasFlag(GENERATE_GEAR)) {
                    GTRecipeTypes.LATHE_RECIPES.recipeBuilder("buzzsaw_gear_" + material.getName())
                            .inputItems(TagPrefix.gear, material)
                            .outputItems(toolPrefix, material)
                            .duration((int) material.getMass() * 4)
                            .EUt(8L * voltageMultiplier)
                            .save(provider);
                }
            }

        }

        // screwdriver
        if (material.hasFlag(GENERATE_LONG_ROD)) {
            toolPrefix = TagPrefix.toolHeadScrewdriver;
            toolStack = ChemicalHelper.get(toolPrefix, material);

            if (!toolStack.isEmpty()) {
                addElectricToolRecipe(toolPrefix, material, new GTToolType[]{GTToolType.SCREWDRIVER_LV}, provider);

                VanillaRecipeHelper.addShapedRecipe(provider, String.format("screwdriver_tip_%s", material.getName()),
                        ChemicalHelper.get(toolPrefix, material),
                        "fR", " h",
                        'R', new UnificationEntry(TagPrefix.rodLong, material));
            }
        }

        ci.cancel();
    }
}
