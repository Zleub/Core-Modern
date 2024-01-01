package su.terrafirmagreg.tfgcore.compat.create;

import com.simibubi.create.content.equipment.potatoCannon.PotatoCannonProjectileType;
import net.dries007.tfc.common.items.Food;
import net.dries007.tfc.common.items.TFCItems;
import net.minecraft.resources.ResourceLocation;

public class CreateCompat {

    public static void register() {
        registerPotatoGunAmmo();
        CustomArmInteractionPointTypes.register();
    }

    private static void registerPotatoGunAmmo() {

        // Все семяна имееют одинаковый урон
        for (var item : TFCItems.CROP_SEEDS.entrySet())
        {
            new PotatoCannonProjectileType.Builder(new ResourceLocation("tfg", item.getKey().toString() + "_seed"))
                    .damage(5)
                    .velocity(1.25F)
                    .knockback(1.5F)
                    .renderTumbling()
                    .registerAndAssign(item.getValue().get());
        }

        new PotatoCannonProjectileType.Builder(new ResourceLocation("tfg", "potato"))
                .damage(9)
                .velocity(1.25F)
                .knockback(1.5F)
                .renderTumbling()
                .registerAndAssign(TFCItems.FOOD.get(Food.POTATO).get());

        new PotatoCannonProjectileType.Builder(new ResourceLocation("tfg", "red_apple"))
                .damage(8)
                .velocity(1.25F)
                .knockback(1.5F)
                .renderTumbling()
                .registerAndAssign(TFCItems.FOOD.get(Food.RED_APPLE).get());

        new PotatoCannonProjectileType.Builder(new ResourceLocation("tfg", "plum"))
                .damage(3)
                .velocity(1.25F)
                .knockback(1.5F)
                .renderTumbling()
                .registerAndAssign(TFCItems.FOOD.get(Food.PLUM).get());

        new PotatoCannonProjectileType.Builder(new ResourceLocation("tfg", "orange"))
                .damage(6)
                .velocity(1.25F)
                .knockback(1.5F)
                .renderTumbling()
                .registerAndAssign(TFCItems.FOOD.get(Food.ORANGE).get());

        new PotatoCannonProjectileType.Builder(new ResourceLocation("tfg", "peach"))
                .damage(2)
                .velocity(1.25F)
                .knockback(1.5F)
                .renderTumbling()
                .registerAndAssign(TFCItems.FOOD.get(Food.PEACH).get());

        new PotatoCannonProjectileType.Builder(new ResourceLocation("tfg", "green_apple"))
                .damage(8)
                .velocity(1.25F)
                .knockback(1.5F)
                .renderTumbling()
                .registerAndAssign(TFCItems.FOOD.get(Food.GREEN_APPLE).get());

        new PotatoCannonProjectileType.Builder(new ResourceLocation("tfg", "cherry"))
                .damage(3)
                .velocity(1.25F)
                .knockback(1.5F)
                .renderTumbling()
                .registerAndAssign(TFCItems.FOOD.get(Food.CHERRY).get());

        new PotatoCannonProjectileType.Builder(new ResourceLocation("tfg", "wintergreen"))
                .damage(2)
                .velocity(1.25F)
                .knockback(1.5F)
                .renderTumbling()
                .registerAndAssign(TFCItems.FOOD.get(Food.WINTERGREEN_BERRY).get());

        new PotatoCannonProjectileType.Builder(new ResourceLocation("tfg", "onion"))
                .damage(7)
                .velocity(1.25F)
                .knockback(1.5F)
                .renderTumbling()
                .registerAndAssign(TFCItems.FOOD.get(Food.ONION).get());

    }
}
