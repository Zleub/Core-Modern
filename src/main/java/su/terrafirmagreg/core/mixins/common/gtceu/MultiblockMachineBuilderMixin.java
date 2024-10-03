package su.terrafirmagreg.core.mixins.common.gtceu;

import com.gregtechceu.gtceu.api.block.IMachineBlock;
import com.gregtechceu.gtceu.api.item.MetaMachineItem;
import com.gregtechceu.gtceu.api.machine.IMachineBlockEntity;
import com.gregtechceu.gtceu.api.machine.MetaMachine;
import com.gregtechceu.gtceu.api.machine.MultiblockMachineDefinition;
import com.gregtechceu.gtceu.api.registry.registrate.MachineBuilder;
import com.gregtechceu.gtceu.api.registry.registrate.MultiblockMachineBuilder;
import com.tterrag.registrate.Registrate;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.apache.commons.lang3.function.TriFunction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;

@Mixin(value = MultiblockMachineBuilder.class, remap = false)
public abstract class MultiblockMachineBuilderMixin extends MachineBuilder<MultiblockMachineDefinition> {

    @Unique
    private static boolean isTriedToRegister = false;

    protected MultiblockMachineBuilderMixin(Registrate registrate, String name, Function<ResourceLocation, MultiblockMachineDefinition> definitionFactory, Function<IMachineBlockEntity, MetaMachine> metaMachine, BiFunction<BlockBehaviour.Properties, MultiblockMachineDefinition, IMachineBlock> blockFactory, BiFunction<IMachineBlock, Item.Properties, MetaMachineItem> itemFactory, TriFunction<BlockEntityType<?>, BlockPos, BlockState, IMachineBlockEntity> blockEntityFactory) {
        super(registrate, name, definitionFactory, metaMachine, blockFactory, itemFactory, blockEntityFactory);
    }

    @Inject(method = "register()Lcom/gregtechceu/gtceu/api/machine/MultiblockMachineDefinition;", at = @At("HEAD"), remap = false, cancellable = true)
    private void registerMultiblockMachineDefinitionMixin$123(CallbackInfoReturnable<MultiblockMachineDefinition> cir) {
        if (Objects.equals(name, "charcoal_pile_igniter")) {
            if (isTriedToRegister) {
                isTriedToRegister = false;
            }
            else {
                isTriedToRegister = true;
                cir.setReturnValue(null);
            }
        }
    }

}
