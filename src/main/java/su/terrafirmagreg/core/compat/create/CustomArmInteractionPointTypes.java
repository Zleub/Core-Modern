package su.terrafirmagreg.core.compat.create;

import com.eerussianguy.firmalife.common.blocks.OvenBottomBlock;
import com.eerussianguy.firmalife.common.blocks.OvenHopperBlock;
import com.eerussianguy.firmalife.common.blocks.OvenTopBlock;
import com.simibubi.create.Create;
import com.simibubi.create.content.kinetics.mechanicalArm.ArmInteractionPoint;
import com.simibubi.create.content.kinetics.mechanicalArm.ArmInteractionPointType;
import net.dries007.tfc.common.blocks.devices.CharcoalForgeBlock;
import net.dries007.tfc.common.blocks.devices.CrucibleBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Function;

public final class CustomArmInteractionPointTypes {

    public static final CrucibleType CRUCIBLE = register("crucible", CrucibleType::new);
    public static final CharcoalForgeType CHARCOAL_FORGE = register("charcoal_forge", CharcoalForgeType::new);

    public static final OvenTopBlockType BRICK_OVEN_TOP = register("brick_oven_top", OvenTopBlockType::new);
    public static final OvenBottomBlockType BRICK_OVEN_BOTTOM = register("brick_oven_bottom", OvenBottomBlockType::new);
    public static final OvenHopperBlockType OVEN_HOPPER = register("oven_hopper", OvenHopperBlockType::new);

    private static <T extends ArmInteractionPointType> T register(String id, Function<ResourceLocation, T> factory) {
        var type = factory.apply(Create.asResource(id));
        ArmInteractionPointType.register(type);
        return type;
    }

    public static void register() {}

    public static class CrucibleType extends ArmInteractionPointType {
        public CrucibleType(ResourceLocation id) {
            super(id);
        }

        @Override
        public boolean canCreatePoint(Level level, BlockPos pos, BlockState state) {
            return state.getBlock() instanceof CrucibleBlock;
        }

        @Override
        public ArmInteractionPoint createPoint(Level level, BlockPos pos, BlockState state) {
            return new ArmInteractionPoint(this, level, pos, state);
        }
    }

    public static class CharcoalForgeType extends ArmInteractionPointType {
        public CharcoalForgeType(ResourceLocation id) {
            super(id);
        }

        @Override
        public boolean canCreatePoint(Level level, BlockPos pos, BlockState state) {
            return state.getBlock() instanceof CharcoalForgeBlock;
        }

        @Override
        public ArmInteractionPoint createPoint(Level level, BlockPos pos, BlockState state) {
            return new ArmInteractionPoint(this, level, pos, state);
        }
    }

    public static class OvenTopBlockType extends ArmInteractionPointType {
        public OvenTopBlockType(ResourceLocation id) {
            super(id);
        }

        @Override
        public boolean canCreatePoint(Level level, BlockPos pos, BlockState state) {
            return state.getBlock() instanceof OvenTopBlock;
        }

        @Override
        public ArmInteractionPoint createPoint(Level level, BlockPos pos, BlockState state) {
            return new ArmInteractionPoint(this, level, pos, state);
        }
    }

    public static class OvenBottomBlockType extends ArmInteractionPointType {
        public OvenBottomBlockType(ResourceLocation id) {
            super(id);
        }

        @Override
        public boolean canCreatePoint(Level level, BlockPos pos, BlockState state) {
            return state.getBlock() instanceof OvenBottomBlock;
        }

        @Override
        public ArmInteractionPoint createPoint(Level level, BlockPos pos, BlockState state) {
            return new ArmInteractionPoint(this, level, pos, state);
        }
    }

    public static class OvenHopperBlockType extends ArmInteractionPointType {
        public OvenHopperBlockType(ResourceLocation id) {
            super(id);
        }

        @Override
        public boolean canCreatePoint(Level level, BlockPos pos, BlockState state) {
            return state.getBlock() instanceof OvenHopperBlock;
        }

        @Override
        public ArmInteractionPoint createPoint(Level level, BlockPos pos, BlockState state) {
            return new ArmInteractionPoint(this, level, pos, state);
        }
    }

}
