package exception.terrafirmagreg.mixins.client.simplelogin;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.MultiLineTextWidget;
import net.minecraft.client.gui.components.StringWidget;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import top.seraphjack.simplelogin.client.SetPasswordScreen;

@SuppressWarnings("all")
@OnlyIn(Dist.CLIENT)
@Mixin(value = SetPasswordScreen.class, remap = false)
public final class SetPasswordScreenMixin extends Screen {

    @Unique
    private MultiLineTextWidget terraFirmaGreg_1_20_x$textField;

    private SetPasswordScreenMixin(Component pTitle) {
        super(pTitle);
    }

    @Inject(method = "m_7856_", at = @At(value = "TAIL"), remap = false)
    private void onInit(CallbackInfo ci) {
        this.terraFirmaGreg_1_20_x$textField = new MultiLineTextWidget(
                this.width / 2 - 200,
                this.height / 3,
                Component.translatable("tfg.simplelogin.description"), this.font).setMaxWidth(400).setCentered(true).setMaxRows(5);
    }

    @Inject(method = "m_88315_", at = @At(value = "TAIL"), remap = false)
    private void onRender(GuiGraphics gui, int mouseX, int mouseY, float partialTicks, CallbackInfo ci) {
        this.terraFirmaGreg_1_20_x$textField.render(gui, mouseX, mouseY, partialTicks);
    }
}
