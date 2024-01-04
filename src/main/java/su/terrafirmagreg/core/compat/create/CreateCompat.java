package su.terrafirmagreg.core.compat.create;

import com.simibubi.create.content.equipment.potatoCannon.PotatoCannonProjectileType;
import net.dries007.tfc.common.items.Food;
import net.dries007.tfc.common.items.TFCItems;
import net.minecraft.resources.ResourceLocation;

import static su.terrafirmagreg.core.TerraFirmaGreg.MOD_ID;

public class CreateCompat {

    public static void register() {
        registerPotatoGunAmmo();
        CustomArmInteractionPointTypes.register();
    }

    private static void registerPotatoGunAmmo() {

        // Все семяна имееют одинаковый урон
        for (var item : TFCItems.CROP_SEEDS.entrySet())
        {
            new PotatoCannonProjectileType.Builder(new ResourceLocation(MOD_ID, item.getKey().toString().toLowerCase() + "_seed"))
                    .damage(5)
                    .velocity(1.25F)
                    .knockback(1.5F)
                    .renderTumbling()
                    .registerAndAssign(item.getValue().get());
        }

        new PotatoCannonProjectileType.Builder(new ResourceLocation(MOD_ID, "potato"))
                .damage(9)
                .velocity(1.25F)
                .knockback(1.5F)
                .renderTumbling()
                .registerAndAssign(TFCItems.FOOD.get(Food.POTATO).get());

        new PotatoCannonProjectileType.Builder(new ResourceLocation(MOD_ID, "red_apple"))
                .damage(8)
                .velocity(1.25F)
                .knockback(1.5F)
                .renderTumbling()
                .registerAndAssign(TFCItems.FOOD.get(Food.RED_APPLE).get());

        new PotatoCannonProjectileType.Builder(new ResourceLocation(MOD_ID, "plum"))
                .damage(3)
                .velocity(1.25F)
                .knockback(1.5F)
                .renderTumbling()
                .registerAndAssign(TFCItems.FOOD.get(Food.PLUM).get());

        new PotatoCannonProjectileType.Builder(new ResourceLocation(MOD_ID, "orange"))
                .damage(6)
                .velocity(1.25F)
                .knockback(1.5F)
                .renderTumbling()
                .registerAndAssign(TFCItems.FOOD.get(Food.ORANGE).get());

        new PotatoCannonProjectileType.Builder(new ResourceLocation(MOD_ID, "peach"))
                .damage(2)
                .velocity(1.25F)
                .knockback(1.5F)
                .renderTumbling()
                .registerAndAssign(TFCItems.FOOD.get(Food.PEACH).get());

        new PotatoCannonProjectileType.Builder(new ResourceLocation(MOD_ID, "green_apple"))
                .damage(8)
                .velocity(1.25F)
                .knockback(1.5F)
                .renderTumbling()
                .registerAndAssign(TFCItems.FOOD.get(Food.GREEN_APPLE).get());

        new PotatoCannonProjectileType.Builder(new ResourceLocation(MOD_ID, "cherry"))
                .damage(3)
                .velocity(1.25F)
                .knockback(1.5F)
                .renderTumbling()
                .registerAndAssign(TFCItems.FOOD.get(Food.CHERRY).get());

        new PotatoCannonProjectileType.Builder(new ResourceLocation(MOD_ID, "wintergreen"))
                .damage(2)
                .velocity(1.25F)
                .knockback(1.5F)
                .renderTumbling()
                .registerAndAssign(TFCItems.FOOD.get(Food.WINTERGREEN_BERRY).get());

        new PotatoCannonProjectileType.Builder(new ResourceLocation(MOD_ID, "onion"))
                .damage(7)
                .velocity(1.25F)
                .knockback(1.5F)
                .renderTumbling()
                .registerAndAssign(TFCItems.FOOD.get(Food.ONION).get());

    }
}
