package su.terrafirmagreg.core.mixins.common.gtceu;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.item.tool.GTToolType;
import com.gregtechceu.gtceu.data.recipe.generated.ToolRecipeHandler;
import net.minecraft.data.recipes.FinishedRecipe;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import su.terrafirmagreg.core.compat.gtceu.TFGMaterialFlags;
import su.terrafirmagreg.core.compat.gtceu.TFGTagPrefixes;
import su.terrafirmagreg.core.objects.TFGTags;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.data.recipe.generated.ToolRecipeHandler.addToolRecipe;
import static su.terrafirmagreg.core.objects.TFGTags.AllWoodenSticks;

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
                'S', TFGTags.AllRockRawBlocks);
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
        addToolRecipe(provider, material, toolType, false, "H", "S", 'H', new UnificationEntry(tagPrefix, material), 'S', AllWoodenSticks);
    }
}
