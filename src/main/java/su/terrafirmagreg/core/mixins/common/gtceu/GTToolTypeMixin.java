package su.terrafirmagreg.core.mixins.common.gtceu;

import com.gregtechceu.gtceu.api.item.tool.GTToolType;
import com.gregtechceu.gtceu.api.item.tool.ToolDefinitionBuilder;
import com.gregtechceu.gtceu.common.item.tool.behavior.HarvestIceBehavior;
import com.gregtechceu.gtceu.common.item.tool.behavior.HoeGroundBehavior;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import su.terrafirmagreg.core.compat.gtceu.behaviors.CanoeCreatorBehavior;

import java.util.function.UnaryOperator;

@Mixin(value = GTToolType.class, remap = false)
public abstract class GTToolTypeMixin {

    /**
     * Устанавливает новое поведение для пилы, чтобы та могла создавать лодки каное из FirmaCiv.
     * */
    @Redirect(method = "<clinit>", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/api/item/tool/GTToolType$Builder;toolStats(Ljava/util/function/UnaryOperator;)Lcom/gregtechceu/gtceu/api/item/tool/GTToolType$Builder;", ordinal = 3), remap = false)
    private static GTToolType.Builder tfg$clinit(GTToolType.Builder instance, UnaryOperator<ToolDefinitionBuilder> builder) {
        return instance.toolStats(b -> b.crafting().damagePerCraftingAction(2)
                .attackDamage(-1.0F).attackSpeed(-2.6F)
                .behaviors(HarvestIceBehavior.INSTANCE, CanoeCreatorBehavior.INSTANCE));
    }
}
