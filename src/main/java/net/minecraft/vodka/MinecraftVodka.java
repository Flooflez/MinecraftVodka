package net.minecraft.vodka;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinecraftVodka implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.

	// an instance of our new item
	public static final Item VODKA = new Item(new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1).food(new FoodComponent.Builder().hunger(4).saturationModifier(10f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20*10, 2), 1).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20*60*3), 1).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20*60*3), 1).build()));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("minecraftvodka", "vodka"), VODKA);
	}
}
