package su.terrafirmagreg.core.mixins.common.gtceu;

import com.gregtechceu.gtceu.api.item.tool.GTToolType;
import com.gregtechceu.gtceu.api.item.tool.ToolDefinitionBuilder;
import com.gregtechceu.gtceu.common.item.tool.behavior.HoeGroundBehavior;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.function.UnaryOperator;

@Mixin(value = GTToolType.class, remap = false)
public class GTToolTypeMixin {

    @Redirect(method = "<clinit>", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/api/item/tool/GTToolType$Builder;toolStats(Ljava/util/function/UnaryOperator;)Lcom/gregtechceu/gtceu/api/item/tool/GTToolType$Builder;", ordinal = 4), remap = false)
    private static GTToolType.Builder onCreateToolStatsForHoe(GTToolType.Builder instance, UnaryOperator<ToolDefinitionBuilder> builder) {
        return instance.toolStats(b -> b.cannotAttack().attackSpeed(-1.0F).behaviors(HoeGroundBehavior.INSTANCE));
    }

}
