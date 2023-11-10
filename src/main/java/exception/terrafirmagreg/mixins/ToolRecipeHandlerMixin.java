package exception.terrafirmagreg.mixins;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.item.tool.GTToolType;
import com.gregtechceu.gtceu.api.item.tool.ToolHelper;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.gregtechceu.gtceu.data.recipe.generated.ToolRecipeHandler;
import exception.terrafirmagreg.compat.gregtech.TFGTagPrefixes;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import javax.annotation.Nonnull;
import java.util.function.Consumer;

@Mixin(value = ToolRecipeHandler.class, remap = false)
public class ToolRecipeHandlerMixin {

    /**
     * Отключение генерации рецептов под инструменты из кремния.
     * */
    @Redirect(method = "registerCustomToolRecipes", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/generated/ToolRecipeHandler;registerFlintToolRecipes(Ljava/util/function/Consumer;)V"), remap = false)
    private static void redirectRegisterFlintToolRecipes(Consumer<FinishedRecipe> provider) {}

    /**
     * Фикс рецепта miningHammer
     * */
    @Redirect(method = "processTool", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/generated/ToolRecipeHandler;addToolRecipe(Ljava/util/function/Consumer;Lcom/gregtechceu/gtceu/api/data/chemical/material/Material;Lcom/gregtechceu/gtceu/api/item/tool/GTToolType;Z[Ljava/lang/Object;)V", ordinal = 0), remap = false)
    private static void processMiningHammer(Consumer<FinishedRecipe> provider, Material material, GTToolType tool, boolean mirrored, Object[] recipe) {
        ItemStack stick = new ItemStack(Items.STICK);
        UnificationEntry head = new UnificationEntry(TFGTagPrefixes.toolHeadMiningHammer, material);

        terraFirmaGreg_1_20_x$addToolRecipe(provider, material, GTToolType.MINING_HAMMER, false, head, stick);
    }

    /**
     * Фикс рецепта saw
     * */
    @Redirect(method = "processTool", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/generated/ToolRecipeHandler;addToolRecipe(Ljava/util/function/Consumer;Lcom/gregtechceu/gtceu/api/data/chemical/material/Material;Lcom/gregtechceu/gtceu/api/item/tool/GTToolType;Z[Ljava/lang/Object;)V", ordinal = 1), remap = false)
    private static void processSaw(Consumer<FinishedRecipe> provider, Material material, GTToolType tool, boolean mirrored, Object[] recipe) {
        ItemStack stick = new ItemStack(Items.STICK);
        UnificationEntry head = new UnificationEntry(TFGTagPrefixes.toolHeadSaw, material);

        terraFirmaGreg_1_20_x$addToolRecipe(provider, material, GTToolType.SAW, head, stick);
    }

    /**
     * Фикс рецепта axe
     * */
    @Redirect(method = "processTool", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/generated/ToolRecipeHandler;addToolRecipe(Ljava/util/function/Consumer;Lcom/gregtechceu/gtceu/api/data/chemical/material/Material;Lcom/gregtechceu/gtceu/api/item/tool/GTToolType;Z[Ljava/lang/Object;)V", ordinal = 2), remap = false)
    private static void processAxe(Consumer<FinishedRecipe> provider, Material material, GTToolType tool, boolean mirrored, Object[] recipe) {
        ItemStack stick = new ItemStack(Items.STICK);
        UnificationEntry head = new UnificationEntry(TFGTagPrefixes.toolHeadAxe, material);

        terraFirmaGreg_1_20_x$addToolRecipe(provider, material, GTToolType.AXE, head, stick);
    }

    /**
     * Фикс рецепта hoe
     * */
    @Redirect(method = "processTool", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/generated/ToolRecipeHandler;addToolRecipe(Ljava/util/function/Consumer;Lcom/gregtechceu/gtceu/api/data/chemical/material/Material;Lcom/gregtechceu/gtceu/api/item/tool/GTToolType;Z[Ljava/lang/Object;)V", ordinal = 3), remap = false)
    private static void processHoe(Consumer<FinishedRecipe> provider, Material material, GTToolType tool, boolean mirrored, Object[] recipe) {
        ItemStack stick = new ItemStack(Items.STICK);
        UnificationEntry head = new UnificationEntry(TFGTagPrefixes.toolHeadHoe, material);

        terraFirmaGreg_1_20_x$addToolRecipe(provider, material, GTToolType.HOE, head, stick);
    }

    /**
     * Фикс рецепта pickaxe
     * */
    @Redirect(method = "processTool", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/generated/ToolRecipeHandler;addToolRecipe(Ljava/util/function/Consumer;Lcom/gregtechceu/gtceu/api/data/chemical/material/Material;Lcom/gregtechceu/gtceu/api/item/tool/GTToolType;Z[Ljava/lang/Object;)V", ordinal = 4), remap = false)
    private static void processPickaxe(Consumer<FinishedRecipe> provider, Material material, GTToolType tool, boolean mirrored, Object[] recipe) {
        ItemStack stick = new ItemStack(Items.STICK);
        UnificationEntry head = new UnificationEntry(TFGTagPrefixes.toolHeadPickaxe, material);

        terraFirmaGreg_1_20_x$addToolRecipe(provider, material, GTToolType.PICKAXE, head, stick);
    }

    /**
     * Фикс рецепта scythe
     * */
    @Redirect(method = "processTool", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/generated/ToolRecipeHandler;addToolRecipe(Ljava/util/function/Consumer;Lcom/gregtechceu/gtceu/api/data/chemical/material/Material;Lcom/gregtechceu/gtceu/api/item/tool/GTToolType;Z[Ljava/lang/Object;)V", ordinal = 5), remap = false)
    private static void processScythe(Consumer<FinishedRecipe> provider, Material material, GTToolType tool, boolean mirrored, Object[] recipe) {
        ItemStack stick = new ItemStack(Items.STICK);
        UnificationEntry head = new UnificationEntry(TFGTagPrefixes.toolHeadScythe, material);

        terraFirmaGreg_1_20_x$addToolRecipe(provider, material, GTToolType.SCYTHE, head, stick);
    }

    /**
     * Фикс рецепта shovel
     * */
    @Redirect(method = "processTool", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/generated/ToolRecipeHandler;addToolRecipe(Ljava/util/function/Consumer;Lcom/gregtechceu/gtceu/api/data/chemical/material/Material;Lcom/gregtechceu/gtceu/api/item/tool/GTToolType;Z[Ljava/lang/Object;)V", ordinal = 6), remap = false)
    private static void processShovel(Consumer<FinishedRecipe> provider, Material material, GTToolType tool, boolean mirrored, Object[] recipe) {
        ItemStack stick = new ItemStack(Items.STICK);
        UnificationEntry head = new UnificationEntry(TFGTagPrefixes.toolHeadShovel, material);

        terraFirmaGreg_1_20_x$addToolRecipe(provider, material, GTToolType.SHOVEL, head, stick);
    }

    /**
     * Фикс рецепта sword
     * */
    @Redirect(method = "processTool", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/generated/ToolRecipeHandler;addToolRecipe(Ljava/util/function/Consumer;Lcom/gregtechceu/gtceu/api/data/chemical/material/Material;Lcom/gregtechceu/gtceu/api/item/tool/GTToolType;Z[Ljava/lang/Object;)V", ordinal = 7), remap = false)
    private static void processSword(Consumer<FinishedRecipe> provider, Material material, GTToolType tool, boolean mirrored, Object[] recipe) {
        ItemStack stick = new ItemStack(Items.STICK);
        UnificationEntry head = new UnificationEntry(TFGTagPrefixes.toolHeadSword, material);

        terraFirmaGreg_1_20_x$addToolRecipe(provider, material, GTToolType.SWORD, head, stick);
    }

    /**
     * Фикс рецепта hammer
     * */
    @Redirect(method = "processTool", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/generated/ToolRecipeHandler;addToolRecipe(Ljava/util/function/Consumer;Lcom/gregtechceu/gtceu/api/data/chemical/material/Material;Lcom/gregtechceu/gtceu/api/item/tool/GTToolType;Z[Ljava/lang/Object;)V", ordinal = 8), remap = false)
    private static void processHammer(Consumer<FinishedRecipe> provider, Material material, GTToolType tool, boolean mirrored, Object[] recipe) {
        ItemStack stick = new ItemStack(Items.STICK);
        UnificationEntry head = new UnificationEntry(TFGTagPrefixes.toolHeadHammer, material);

        terraFirmaGreg_1_20_x$addToolRecipe(provider, material, GTToolType.HARD_HAMMER, head, stick);
    }

    /**
     * Фикс рецепта file
     * */
    @Redirect(method = "processTool", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/generated/ToolRecipeHandler;addToolRecipe(Ljava/util/function/Consumer;Lcom/gregtechceu/gtceu/api/data/chemical/material/Material;Lcom/gregtechceu/gtceu/api/item/tool/GTToolType;Z[Ljava/lang/Object;)V", ordinal = 9), remap = false)
    private static void processFile(Consumer<FinishedRecipe> provider, Material material, GTToolType tool, boolean mirrored, Object[] recipe) {
        ItemStack stick = new ItemStack(Items.STICK);
        UnificationEntry head = new UnificationEntry(TFGTagPrefixes.toolHeadFile, material);

        terraFirmaGreg_1_20_x$addToolRecipe(provider, material, GTToolType.FILE, head, stick);
    }

    /**
     * Фикс рецепта knife
     * */
    @Redirect(method = "processTool", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/generated/ToolRecipeHandler;addToolRecipe(Ljava/util/function/Consumer;Lcom/gregtechceu/gtceu/api/data/chemical/material/Material;Lcom/gregtechceu/gtceu/api/item/tool/GTToolType;Z[Ljava/lang/Object;)V", ordinal = 10), remap = false)
    private static void processKnife(Consumer<FinishedRecipe> provider, Material material, GTToolType tool, boolean mirrored, Object[] recipe) {
        ItemStack stick = new ItemStack(Items.STICK);
        UnificationEntry head = new UnificationEntry(TFGTagPrefixes.toolHeadKnife, material);

        terraFirmaGreg_1_20_x$addToolRecipe(provider, material, GTToolType.KNIFE, head, stick);
    }

    @Unique
    private static void terraFirmaGreg_1_20_x$addToolRecipe(Consumer<FinishedRecipe> provider, @Nonnull Material material, @Nonnull GTToolType tool, Object... recipe) {
        ItemStack toolStack = ToolHelper.get(tool, material);

        if (toolStack.isEmpty()) return;

        VanillaRecipeHelper.addShapelessRecipe(provider, String.format("%s_%s", tool.name, material),
                toolStack, recipe);
    }
}
