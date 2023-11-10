package exception.terrafirmagreg.datagen;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlag;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.item.tool.GTToolType;
import com.gregtechceu.gtceu.api.item.tool.ToolHelper;
import com.gregtechceu.gtceu.api.registry.GTRegistries;
import com.gregtechceu.gtceu.data.tags.TagsHandler;
import net.dries007.tfc.common.TFCTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class TFGItemTagProvider extends ItemTagsProvider {
    public TFGItemTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, modId, existingFileHelper);
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider pProvider) {
        for (var material : GTRegistries.MATERIALS.values())
        {
            var itemStackIngot = ChemicalHelper.get(TagPrefix.ingot, material);
            var itemStackPlate = ChemicalHelper.get(TagPrefix.plate, material);

            if (!itemStackIngot.isEmpty())
            {
                this.tag(TFCTags.Items.PILEABLE_INGOTS).add(itemStackIngot.getItem());
            }

            if (!itemStackPlate.isEmpty())
            {
                this.tag(TFCTags.Items.PILEABLE_SHEETS).add(itemStackPlate.getItem());
            }

            if (material.hasProperty(PropertyKey.TOOL))
            {
                for (var toolType : GTToolType.values())
                {
                    var toolItem = ToolHelper.get(toolType, material);

                    if (!toolItem.isEmpty())
                        this.tag(TFCTags.Items.USABLE_ON_TOOL_RACK).add(toolItem.getItem());
                }
            }
        }
    }
}
