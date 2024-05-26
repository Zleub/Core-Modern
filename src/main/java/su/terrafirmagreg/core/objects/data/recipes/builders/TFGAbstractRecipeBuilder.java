package su.terrafirmagreg.core.objects.data.recipes.builders;

import com.google.gson.JsonObject;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public abstract class TFGAbstractRecipeBuilder {

    protected ResourceLocation id;

    public TFGAbstractRecipeBuilder(final String id) {
        this.id = new ResourceLocation(id);
    }

    public abstract void save(Consumer<FinishedRecipe> consumer);

    @Nullable
    protected JsonObject fluidStackToJson(final FluidStack fluidStack) {
        return fluidStackToJson(fluidStack, "fluid");
    }

    @Nullable
    protected JsonObject fluidStackToJson(final FluidStack fluidStack, final String fluidIdPropName) {
        var json = new JsonObject();

        var fluid = ForgeRegistries.FLUIDS.getKey(fluidStack.getFluid());
        if (fluid == null) throw new IllegalArgumentException("Can't find fluid from fluidStack in fluid registry, its weird...");

        json.addProperty(fluidIdPropName, fluid.getNamespace() + ":" + fluid.getPath());
        json.addProperty("amount", fluidStack.getAmount());

        return json;
    }
}