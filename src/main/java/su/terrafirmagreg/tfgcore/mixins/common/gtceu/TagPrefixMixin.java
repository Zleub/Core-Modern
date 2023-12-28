package su.terrafirmagreg.tfgcore.mixins.common.gtceu;

import com.google.common.collect.ImmutableMap;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import su.terrafirmagreg.tfgcore.compat.gtceu.TFGMaterials;

import java.util.Map;

@Mixin(value = TagPrefix.class, remap = false)
public class TagPrefixMixin {

    @Shadow
    @Final
    private static Map<UnificationEntry, Long> MATERIAL_AMOUNT_MAP = ImmutableMap.ofEntries(

            // Blocks (4 materials)
            Map.entry(new UnificationEntry(TagPrefix.block, GTMaterials.Amethyst), GTValues.M * 4), // Copied from GT
            Map.entry(new UnificationEntry(TagPrefix.block, GTMaterials.Brick), GTValues.M * 4),  // Copied from GT
            Map.entry(new UnificationEntry(TagPrefix.block, GTMaterials.CertusQuartz), GTValues.M * 4),  // Copied from GT
            Map.entry(new UnificationEntry(TagPrefix.block, GTMaterials.Clay), GTValues.M * 4),  // Copied from GT
            Map.entry(new UnificationEntry(TagPrefix.block, GTMaterials.Glowstone), GTValues.M * 4),  // Copied from GT
            Map.entry(new UnificationEntry(TagPrefix.block, GTMaterials.NetherQuartz), GTValues.M * 4),  // Copied from GT
            Map.entry(new UnificationEntry(TagPrefix.block, TFGMaterials.Fluix), GTValues.M * 4),

            // Blocks (1 material)
            Map.entry(new UnificationEntry(TagPrefix.block, GTMaterials.Concrete), GTValues.M),  // Copied from GT
            Map.entry(new UnificationEntry(TagPrefix.block, GTMaterials.Glass), GTValues.M),  // Copied from GT
            Map.entry(new UnificationEntry(TagPrefix.block, GTMaterials.Ice), GTValues.M),  // Copied from GT
            Map.entry(new UnificationEntry(TagPrefix.block, GTMaterials.Obsidian), GTValues.M),  // Copied from GT

            // Stick materials
            Map.entry(new UnificationEntry(TagPrefix.rod, GTMaterials.Blaze), GTValues.M * 4),  // Copied from GT
            Map.entry(new UnificationEntry(TagPrefix.rod, GTMaterials.Bone), GTValues.M * 5)  // Copied from GT


    );

}
