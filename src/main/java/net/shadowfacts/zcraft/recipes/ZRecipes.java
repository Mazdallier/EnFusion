package net.shadowfacts.zcraft.recipes;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.shadowfacts.zcraft.block.ZBlocks;
import net.shadowfacts.zcraft.item.ZItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class ZRecipes {
	
	public static void registerRecipes() {
		registerBlockRecipes();
		registerItemRecipes();
		registerFurnaceRecipes();
	}
	
	private static void registerBlockRecipes() {
		// Green Zinchorium Light
		GameRegistry.addShapedRecipe(new ItemStack(ZBlocks.greenZinchoriumLightIdle, 1), "IGI", "GLG", "IGI", 'I', new ItemStack(ZItems.greenZinchoriumGem), 'G', new ItemStack(Block.glass), 'L', new ItemStack(ZItems.lightBulb, 1));
	}
	
	private static void registerItemRecipes() {
		// Light bulb
		GameRegistry.addShapedRecipe(new ItemStack(ZItems.lightBulb), "GGG", "GOG", "III", 'G', new ItemStack(Block.glass), 'O', new ItemStack(Item.ingotGold), 'I', new ItemStack(Item.ingotIron));
		
	}
	
	private static void registerFurnaceRecipes() {
		GameRegistry.addSmelting(ZBlocks.oreCopper.blockID, new ItemStack(ZItems.ingotCopper, 1), 0.3f);
	}
	
	public static void registerOreDictThings() {
		// Blocks
		OreDictionary.registerOre("oreCopper", ZBlocks.oreCopper);
		
		// Items
		OreDictionary.registerOre("ingotCopper", ZItems.ingotCopper);
		
	}
	
}
