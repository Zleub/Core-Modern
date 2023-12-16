package exception.terrafirmagreg.mixins.common.gtceu;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.OreProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.data.tag.TagUtil;
import com.gregtechceu.gtceu.api.item.TagPrefixItem;
import com.gregtechceu.gtceu.api.recipe.content.Content;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.integration.GTOreProcessingWidget;
import com.lowdragmc.lowdraglib.gui.widget.WidgetGroup;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.List;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.crushed;

@Mixin(value = GTOreProcessingWidget.class, remap = false)
public class GTOreProcessingWidgetMixin extends WidgetGroup {

    // Я ебал грег
    @Inject(method = "setupMainProducts", at = @At(value = "HEAD"), remap = false, cancellable = true)
    private void onFuckGTCEu(List<List<ItemStack>> mainproducts, Material material, OreProperty prop, List<Content> chanceContent, CallbackInfo ci) {
        // Ore
        var oreTag = TagUtil.optionalTag(BuiltInRegistries.ITEM, new ResourceLocation(String.format("forge:ores/%s", material.getName())));
        List<ItemStack> oreSlot = BuiltInRegistries.ITEM.getOrCreateTag(oreTag).stream().map(Holder::value).map(ItemStack::new).toList();

        mainproducts.add(oreSlot);
        //Direct Smelt Result
        Material smeltingResult = prop.getDirectSmeltResult() != null ? prop.getDirectSmeltResult() : material;
        List<ItemStack> smeltSlot = new ArrayList<>();
        if(smeltingResult.hasProperty(PropertyKey.INGOT)){
            smeltSlot.add(ChemicalHelper.get(ingot,smeltingResult));
        }else if(smeltingResult.hasProperty(PropertyKey.GEM)) {
            smeltSlot.add(ChemicalHelper.get(gem,smeltingResult));
        }else if(smeltingResult.hasProperty(PropertyKey.DUST)){
            smeltSlot.add(ChemicalHelper.get(dust,smeltingResult));
        }else{
            smeltSlot.add(new ItemStack(Items.AIR));
        }
        mainproducts.add(smeltSlot);
        //Crushed Ore
        List<ItemStack> crushedSlot = BuiltInRegistries.ITEM.getOrCreateTag(ChemicalHelper.getTag(TagPrefix.crushed, material)).stream().map(Holder::value).map(item -> new ItemStack(item, 2 * prop.getOreMultiplier())).toList();
        mainproducts.add(crushedSlot);
        //Washed Ore
        List<ItemStack> crushedPurifiedSlot = BuiltInRegistries.ITEM.getOrCreateTag(ChemicalHelper.getTag(crushedPurified, material)).stream().map(Holder::value).map(ItemStack::new).toList();
        mainproducts.add(crushedPurifiedSlot);
        //TC'ed Ore
        List<ItemStack> crushedRefinedSlot = BuiltInRegistries.ITEM.getOrCreateTag(ChemicalHelper.getTag(crushedRefined, material)).stream().map(Holder::value).map(ItemStack::new).toList();
        mainproducts.add(crushedRefinedSlot);
        //Impure Dust
        List<ItemStack> dustImpureSlot = BuiltInRegistries.ITEM.getOrCreateTag(ChemicalHelper.getTag(dustImpure, material)).stream().map(Holder::value).map(ItemStack::new).toList();
        mainproducts.add(dustImpureSlot);
        //Pure Dust
        List<ItemStack> dustPureSlot = BuiltInRegistries.ITEM.getOrCreateTag(ChemicalHelper.getTag(dustPure, material)).stream().map(Holder::value).map(ItemStack::new).toList();
        mainproducts.add(dustPureSlot);
        //Dust
        List<ItemStack> dustSlot = BuiltInRegistries.ITEM.getOrCreateTag(ChemicalHelper.getTag(dust, material)).stream().map(Holder::value).map(ItemStack::new).toList();
        mainproducts.add(dustSlot);
        //Gem
        List<ItemStack> gemSlot = new ArrayList<>();
        if(material.hasProperty(PropertyKey.GEM)){
            gemSlot.add(ChemicalHelper.get(gem, material));
        }
        mainproducts.add(gemSlot);
        chanceContent.add(new Content(gemSlot,0.35f,0.05f,null,null));
        List<ItemStack> simpleCrushedSlot = BuiltInRegistries.ITEM.getOrCreateTag(ChemicalHelper.getTag(crushed, material)).stream().map(Holder::value).map(ItemStack::new).toList();
        mainproducts.add(simpleCrushedSlot);

        ci.cancel();
    }
}
