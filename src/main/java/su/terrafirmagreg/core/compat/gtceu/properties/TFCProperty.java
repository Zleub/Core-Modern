package su.terrafirmagreg.core.compat.gtceu.properties;

import com.gregtechceu.gtceu.api.data.chemical.material.properties.IMaterialProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.MaterialProperties;

import javax.annotation.Nullable;

public class TFCProperty implements IMaterialProperty<TFCProperty> {

    private int forgingTemp;
    private int weldingTemp;
    private int meltTemp;

    @Nullable
    private String fluidInputName;

    @Nullable
    private String fluidOutputName;

    private int tier;
    private int percentOfMaterial;

    public TFCProperty() {
        setForgingTemp(0);
        setWeldingTemp(0);
        setMeltTemp(0);
        setFluidInputName(null);
        setFluidOutputName(null);
        setTier(0);
        setPercentOfMaterial(0);
    }

    public TFCProperty(int forgingTemp, int weldingTemp, int meltTemp, @Nullable String fluidInputName, @Nullable String fluidOutputName, int tier, int percentOfMaterial) {
        setForgingTemp(forgingTemp);
        setWeldingTemp(weldingTemp);
        setMeltTemp(meltTemp);
        setFluidInputName(fluidInputName);
        setFluidOutputName(fluidOutputName);
        setTier(tier);
        setPercentOfMaterial(percentOfMaterial);
    }

    public int getForgingTemp() {
        return forgingTemp;
    }

    public void setForgingTemp(int forgingTemp) {
        this.forgingTemp = Math.max(forgingTemp, 0);
    }

    public int getWeldingTemp() {
        return weldingTemp;
    }

    public void setWeldingTemp(int weldingTemp) {
        this.weldingTemp = Math.max(weldingTemp, 0);
    }

    public int getMeltTemp() {
        return meltTemp;
    }

    public void setMeltTemp(int meltTemp) {
        this.meltTemp = Math.max(meltTemp, 0);
    }

    public String getInputFluidName() {
        return fluidInputName;
    }

    public void setFluidInputName(@Nullable String fluidInputName) {
        this.fluidInputName = fluidInputName;
    }

    public String getOutputFluidName() {
        return fluidOutputName;
    }

    public void setFluidOutputName(@Nullable String fluidOutputName) {
        this.fluidOutputName = fluidOutputName;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = 0;

        if (tier < 7 && tier > 0)
            this.tier = tier;
    }

    public int getPercentOfMaterial() {
        return percentOfMaterial;
    }

    public void setPercentOfMaterial(int percentOfMaterial) {
        this.percentOfMaterial = Math.max(percentOfMaterial, 0);
    }

    @Override
    public void verifyProperty(MaterialProperties materialProperties) {
        // materialProperties.ensureSet(PropertyKey.INGOT, true);
    }
}