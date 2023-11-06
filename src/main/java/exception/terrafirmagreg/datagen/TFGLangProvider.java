package exception.terrafirmagreg.datagen;

import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.registry.GTRegistries;
import net.dries007.tfc.common.blocks.rock.Rock;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class TFGLangProvider extends LanguageProvider {
    public TFGLangProvider(PackOutput output, String modid, String locale) {
        super(output, modid, locale);
    }

    @Override
    protected void addTranslations() {
        for (var rock : Rock.values())
        {
            for (var material : GTRegistries.MATERIALS.values())
            {
                if (material.hasProperty(PropertyKey.ORE))
                {
                    this.add(
                            String.format("block.gtceu.tfc_%s_%s_ore.prospected", rock.getSerializedName(), material.getName()),
                            CapitalizeWords(material.getName().split("_"))
                    );
                }
            }
        }
    }

    private static String CapitalizeWords(String[] materialNameParts)
    {
        var sb = new StringBuilder();

        for (var i = 0; i < materialNameParts.length; i++)
        {
            var word = materialNameParts[i].substring(0, 1).toUpperCase() + materialNameParts[i].substring(1);

            if (i == materialNameParts.length - 1)
                sb.append(word);
            else sb.append(word).append(" ");
        }

        return sb.toString();
    }
}
