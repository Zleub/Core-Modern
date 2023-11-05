package exception.terrafirmagreg.datagen;

import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.registry.GTRegistries;
import net.dries007.tfc.common.TFCTags;
import net.dries007.tfc.common.blocks.rock.Rock;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class TFGBlockTagProvider extends BlockTagsProvider {

    public TFGBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, modId, existingFileHelper);
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider pProvider) {
        for (var rock : Rock.values())
        {
            for (var material : GTRegistries.MATERIALS.values())
            {
                if (material.hasProperty(PropertyKey.ORE))
                {
                    var block = ForgeRegistries.BLOCKS.getValue(
                            new ResourceLocation("gtceu", String.format("tfc_%s_%s_ore", rock.getSerializedName(), material.getName()))
                    );
                    if (block != null)
                    {
                        this.tag(BlockTags.NEEDS_IRON_TOOL).add(block);
                        this.tag(TFCTags.Blocks.MONSTER_SPAWNS_ON).add(block);
                        this.tag(TFCTags.Blocks.CAN_COLLAPSE).add(block);
                        this.tag(TFCTags.Blocks.CAN_START_COLLAPSE).add(block);
                        this.tag(TFCTags.Blocks.CAN_TRIGGER_COLLAPSE).add(block);
                        this.tag(TFCTags.Blocks.PROSPECTABLE).add(block);
                    }
                }
            }
        }

    }
}
