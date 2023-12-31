package su.terrafirmagreg.tfgcore.compat.create;

import com.simibubi.create.content.equipment.potatoCannon.PotatoCannonProjectileType;
import net.dries007.tfc.common.blocks.crop.Crop;
import net.dries007.tfc.common.items.TFCItems;
import net.minecraft.resources.ResourceLocation;

public class CreateCompat {

    public static void register() {
        registerPotatoGunAmmo();
        CustomArmInteractionPointTypes.register();
    }

    private static void registerPotatoGunAmmo() {
        new PotatoCannonProjectileType.Builder(new ResourceLocation("tfg", "gay"))
                .damage(5)
                .velocity(1.25F)
                .knockback(1.5F)
                .renderTumbling()
                .registerAndAssign(TFCItems.CROP_SEEDS.get(Crop.POTATO).get());
    }

}
