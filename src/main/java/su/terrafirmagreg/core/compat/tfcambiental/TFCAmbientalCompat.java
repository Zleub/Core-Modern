package su.terrafirmagreg.core.compat.tfcambiental;

import com.gregtechceu.gtceu.api.block.ActiveBlock;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.GTMachines;
import com.lumintorious.tfcambiental.api.AmbientalRegistry;
import com.lumintorious.tfcambiental.modifier.TempModifier;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TFCAmbientalCompat {

    private static final List<String> stringList = Arrays.asList("lv", "mv", "hv", "ev", "iv", "luv", "zpm", "uv");

    public static void register() {
        // Паровые машинки
        AmbientalRegistry.BLOCKS.register((player, blockPos, state) -> Optional.of(new TempModifier("hp_steam_solid_boiler", 4.0F, 2.0F)).filter((mod) -> state.getBlock() == GTMachines.get("hp_steam_solid_boiler").getBlock() && state.getValue(ActiveBlock.ACTIVE)));
        AmbientalRegistry.BLOCKS.register((player, blockPos, state) -> Optional.of(new TempModifier("hp_steam_liquid_boiler", 4.0F, 2.0F)).filter((mod) -> state.getBlock() == GTMachines.get("hp_steam_liquid_boiler").getBlock() && state.getValue(ActiveBlock.ACTIVE)));
        AmbientalRegistry.BLOCKS.register((player, blockPos, state) -> Optional.of(new TempModifier("hp_steam_furnace", 4.0F, 2.0F)).filter((mod) -> state.getBlock() == GTMachines.get("hp_steam_furnace").getBlock() && state.getValue(ActiveBlock.ACTIVE)));
        AmbientalRegistry.BLOCKS.register((player, blockPos, state) -> Optional.of(new TempModifier("hp_steam_alloy_smelter", 4.0F, 2.0F)).filter((mod) -> state.getBlock() == GTMachines.get("hp_steam_alloy_smelter").getBlock() && state.getValue(ActiveBlock.ACTIVE)));

        // Бойлеры
        AmbientalRegistry.BLOCKS.register((player, blockPos, state) -> Optional.of(new TempModifier("bronze_large_boiler", 30.0F, 3.0F)).filter((mod) -> state.getBlock() == GTMachines.get("bronze_large_boiler").getBlock() && state.getValue(ActiveBlock.ACTIVE)));
        AmbientalRegistry.BLOCKS.register((player, blockPos, state) -> Optional.of(new TempModifier("steel_large_boiler", 40.0F, 3.0F)).filter((mod) -> state.getBlock() == GTMachines.get("steel_large_boiler").getBlock() && state.getValue(ActiveBlock.ACTIVE)));
        AmbientalRegistry.BLOCKS.register((player, blockPos, state) -> Optional.of(new TempModifier("titanium_large_boiler", 50.0F, 3.0F)).filter((mod) -> state.getBlock() == GTMachines.get("titanium_large_boiler").getBlock() && state.getValue(ActiveBlock.ACTIVE)));
        AmbientalRegistry.BLOCKS.register((player, blockPos, state) -> Optional.of(new TempModifier("tungstensteel_large_boiler", 60.0F, 3.0F)).filter((mod) -> state.getBlock() == GTMachines.get("tungstensteel_large_boiler").getBlock() && state.getValue(ActiveBlock.ACTIVE)));

        // Электро-печи
        for (var item : stringList)
        {
            AmbientalRegistry.BLOCKS.register((player, blockPos, state) -> Optional.of(new TempModifier(item + "_electric_furnace", 12.0F, 3.0F)).filter((mod) -> state.getBlock() == GTMachines.get(item + "_electric_furnace").getBlock() && state.getValue(ActiveBlock.ACTIVE)));
            AmbientalRegistry.BLOCKS.register((player, blockPos, state) -> Optional.of(new TempModifier(item + "_arc_furnace", 10.0F, 3.0F)).filter((mod) -> state.getBlock() == GTMachines.get(item + "_arc_furnace").getBlock() && state.getValue(ActiveBlock.ACTIVE)));
            AmbientalRegistry.BLOCKS.register((player, blockPos, state) -> Optional.of(new TempModifier(item + "_alloy_smelter", 7.0F, 3.0F)).filter((mod) -> state.getBlock() == GTMachines.get(item + "_alloy_smelter").getBlock() && state.getValue(ActiveBlock.ACTIVE)));
            AmbientalRegistry.BLOCKS.register((player, blockPos, state) -> Optional.of(new TempModifier(item + "_fluid_heater", 8.0F, 3.0F)).filter((mod) -> state.getBlock() == GTMachines.get(item + "_fluid_heater").getBlock() && state.getValue(ActiveBlock.ACTIVE)));
        }

        // Койлы доменки
        AmbientalRegistry.BLOCKS.register((player, blockPos, state) -> Optional.of(new TempModifier("cupronickel_coil", 18.0F, 3.0F)).filter((mod) -> state.getBlock() == GTBlocks.COIL_CUPRONICKEL.get() && state.getValue(ActiveBlock.ACTIVE)));
        AmbientalRegistry.BLOCKS.register((player, blockPos, state) -> Optional.of(new TempModifier("kanthal_coil", 28.0F, 3.0F)).filter((mod) -> state.getBlock() == GTBlocks.COIL_KANTHAL.get() && state.getValue(ActiveBlock.ACTIVE)));
        AmbientalRegistry.BLOCKS.register((player, blockPos, state) -> Optional.of(new TempModifier("nichrome_coil", 38.0F, 3.0F)).filter((mod) -> state.getBlock() == GTBlocks.COIL_NICHROME.get() && state.getValue(ActiveBlock.ACTIVE)));
        AmbientalRegistry.BLOCKS.register((player, blockPos, state) -> Optional.of(new TempModifier("tungstensteel_coil", 48.0F, 3.0F)).filter((mod) -> state.getBlock() == GTBlocks.COIL_TUNGSTENSTEEL.get() && state.getValue(ActiveBlock.ACTIVE)));
        AmbientalRegistry.BLOCKS.register((player, blockPos, state) -> Optional.of(new TempModifier("hssg_coil", 58.0F, 3.0F)).filter((mod) -> state.getBlock() == GTBlocks.COIL_HSSG.get() && state.getValue(ActiveBlock.ACTIVE)));
        AmbientalRegistry.BLOCKS.register((player, blockPos, state) -> Optional.of(new TempModifier("naquadah_coil", 78.0F, 3.0F)).filter((mod) -> state.getBlock() == GTBlocks.COIL_NAQUADAH.get() && state.getValue(ActiveBlock.ACTIVE)));
        AmbientalRegistry.BLOCKS.register((player, blockPos, state) -> Optional.of(new TempModifier("trinium_coil", 88.0F, 3.0F)).filter((mod) -> state.getBlock() == GTBlocks.COIL_TRINIUM.get() && state.getValue(ActiveBlock.ACTIVE)));
        AmbientalRegistry.BLOCKS.register((player, blockPos, state) -> Optional.of(new TempModifier("tritanium_coil", 98.0F, 3.0F)).filter((mod) -> state.getBlock() == GTBlocks.COIL_TRITANIUM.get() && state.getValue(ActiveBlock.ACTIVE)));
    }

}
