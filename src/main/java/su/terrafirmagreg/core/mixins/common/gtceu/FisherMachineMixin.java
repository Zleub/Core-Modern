package su.terrafirmagreg.core.mixins.common.gtceu;

import com.gregtechceu.gtceu.api.machine.IMachineBlockEntity;
import com.gregtechceu.gtceu.api.machine.TickableSubscription;
import com.gregtechceu.gtceu.api.machine.TieredEnergyMachine;
import com.gregtechceu.gtceu.api.machine.trait.NotifiableItemStackHandler;
import com.gregtechceu.gtceu.common.machine.electric.FisherMachine;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.terrafirmagreg.core.objects.TFGTags;

import java.util.function.Function;

@Mixin(value = FisherMachine.class, remap = false)
public abstract class FisherMachineMixin extends TieredEnergyMachine {

    @Shadow @Final
    protected NotifiableItemStackHandler baitHandler;

    @Shadow
    protected @Nullable TickableSubscription fishingSubs;

    public FisherMachineMixin(IMachineBlockEntity holder, int tier, Object... args) {
        super(holder, tier, args);
    }

    @Shadow
    public boolean drainEnergy(boolean simulate) {
        throw new AssertionError();
    }

    @Shadow
    public void fishingUpdate() {
        throw new AssertionError();
    }

    @Inject(method = "updateFishingUpdateSubscription", at = @At(value = "HEAD"), cancellable = true, remap = false)
    private void onUpdateFishingUpdateSubscription(CallbackInfo ci) {
        if (drainEnergy(true) && baitHandler.getStackInSlot(0).is(TFGTags.Items.Strings)) {
            fishingSubs = subscribeServerTick(fishingSubs, this::fishingUpdate);
        } else if (fishingSubs != null) {
            fishingSubs.unsubscribe();
            fishingSubs = null;
        }

        ci.cancel();
    }

    /**
     * Проверка на тег ниток, а не на только ванильные нитки
     * */
    @Redirect(method = "createBaitItemHandler", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/api/machine/trait/NotifiableItemStackHandler;setFilter(Ljava/util/function/Function;)Lcom/gregtechceu/gtceu/api/machine/trait/NotifiableItemStackHandler;"), remap = false)
    private NotifiableItemStackHandler onCreateBaitItemHandler(NotifiableItemStackHandler instance, Function<ItemStack, Boolean> filter) {
        return instance.setFilter((item) -> item.is(TFGTags.Items.Strings));
    }
}
