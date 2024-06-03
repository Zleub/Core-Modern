//package su.terrafirmagreg.core.old_remove_after_1_21_release.recipes.builders.tfc;

//public final class TFGHeatingRecipeBuilder extends TFGAbstractRecipeBuilder {
//
//    private Ingredient input;
//    private ItemStackProviderJS outputStack;
//    private FluidStack outputFluidStack;
//    private int temperature;
//    private boolean useDurablility = false;
//    private double chance = 1f;
//
//    public TFGHeatingRecipeBuilder(String id) {
//        super(id);
//    }
//
//    public TFGHeatingRecipeBuilder input(final TagKey<Item> itemStack) {
//        return input(Ingredient.of(itemStack));
//    }
//
//    public TFGHeatingRecipeBuilder input(final ItemStack itemStack) {
//        if (itemStack.hasTag() || itemStack.getDamageValue() > 0) {
//            input = NBTIngredient.createNBTIngredient(itemStack);
//        } else {
//            input = Ingredient.of(itemStack);
//        }
//        return this;
//    }
//
//    public TFGHeatingRecipeBuilder input(final ItemLike itemLike) {
//        return input(Ingredient.of(itemLike));
//    }
//
//    public TFGHeatingRecipeBuilder input(final Ingredient ingredient) {
//        input = ingredient;
//        return this;
//    }
//
//    public TFGHeatingRecipeBuilder output(final ItemStackProviderJS stackProvider) {
//        this.outputStack = stackProvider.copy();
//        return this;
//    }
//
//    public TFGHeatingRecipeBuilder output(final ItemStack stack) {
//        this.outputStack = new ItemStackProviderJS(stack, new JsonArray());
//        return this;
//    }
//
//    public TFGHeatingRecipeBuilder output(final Fluid fluid, final int amount) {
//        this.outputFluidStack = new FluidStack(fluid, amount);
//        return this;
//    }
//
//    public TFGHeatingRecipeBuilder useDurability() {
//        this.useDurablility = true;
//        return this;
//    }
//
//    public TFGHeatingRecipeBuilder temperature(final int temperature) {
//        this.temperature = temperature;
//        return this;
//    }
//
//    public TFGHeatingRecipeBuilder chance(final double chance) {
//        this.chance = chance;
//        return this;
//    }
//
//    public void save(final Consumer<FinishedRecipe> consumer) {
//        consumer.accept(new FinishedRecipe() {
//
//            @Override
//            public void serializeRecipeData(@NotNull JsonObject pJson) {
//                if (input == null)
//                    throw new IllegalArgumentException("Heating recipe must have at least one input: " + id);
//
//                pJson.add("ingredient", input.toJson());
//
//                if (outputStack != null) {
//                    pJson.add("result_item", outputStack.toJson());
//                }
//
//                if (outputFluidStack != null) {
//                    pJson.add("result_fluid", fluidStackToJson(outputFluidStack));
//                }
//
//                pJson.addProperty("temperature", temperature);
//                pJson.addProperty("use_durability", useDurablility);
//                pJson.addProperty("chance", chance);
//            }
//
//            @NotNull
//            @Override
//            public ResourceLocation getId() {
//                return new ResourceLocation(id.getNamespace(), "heating/" + id.getPath());
//            }
//
//            @NotNull
//            @Override
//            public RecipeSerializer<?> getType() {
//                return TFCRecipeSerializers.HEATING.get();
//            }
//
//            @Nullable
//            @Override
//            public JsonObject serializeAdvancement() {
//                return null;
//            }
//
//            @Nullable
//            @Override
//            public ResourceLocation getAdvancementId() {
//                return null;
//            }
//        });
//    }
//
//}
