package net.shadowfacts.enfusion.block;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.block.Block;

import net.shadowfacts.enfusion.EnFusion;
import net.shadowfacts.enfusion.block.decoration.BlockZinchoriumLight;
import net.shadowfacts.enfusion.client.gui.EFCreativeTabs;
import net.shadowfacts.enfusion.machine.conveyor.block.BlockBlockConveyor;
import net.shadowfacts.enfusion.machine.conveyor.entity.BlockEntityConveyor;
import net.shadowfacts.enfusion.machine.conveyor.item.BlockItemConveyor;
import net.shadowfacts.enfusion.machine.generator.solar.BlockSolarPanel;
import net.shadowfacts.enfusion.machine.zinchoriumfurnace.BlockZinchoriumFurnace;

public class EFBlocks {
//	Blocks
//	Ores
	public static EFOre oreZinchorium;
	public static EFOre oreCopper;


//	Machines
	public static BlockSolarPanel solarPanelTier1;
	public static BlockSolarPanel solarPanelTier2;
	public static BlockSolarPanel solarPanelTier3;
	public static BlockSolarPanel solarPanelTier4;
	public static BlockZinchoriumFurnace zinchoriumFurnace;
	public static BlockItemConveyor itemConveyor;
	public static BlockBlockConveyor blockConveyor;
	public static BlockEntityConveyor entityConveyor;


	//	Miscellaneous
	public static BlockZinchoriumLight greenZinchoriumLightActive;
	public static BlockZinchoriumLight greenZinchoriumLightIdle;
	public static EFBlock blockZinchorium;
	
	// Methods
	public static void preInit() {
//		Create Blocks
//		Ores
		oreZinchorium = new EFOre();
		oreZinchorium.setBlockName("oreZinchorium").setCreativeTab(EFCreativeTabs.tabCore)
				.setHardness(1.0f).setStepSound(Block.soundTypeStone)
				.setBlockTextureName(EnFusion.modId + ":ore/zinchorium")
				.setHarvestLevel("pickaxe", 1);

		oreCopper = new EFOre();
		oreCopper.setBlockName("oreCopper")
				.setBlockTextureName(EnFusion.modId + ":ore/copper").setCreativeTab(EFCreativeTabs.tabCore)
				.setHardness(1.5f).setStepSound(Block.soundTypeStone)
				.setHarvestLevel("pickaxe", 1);


//		Machines
		solarPanelTier1 = new BlockSolarPanel("solarPanelTier1", 16, 8000);
		solarPanelTier1.setBlockName("solarPanelTier1").setHardness(0.9f).setStepSound(Block.soundTypePiston)
				.setCreativeTab(EFCreativeTabs.tabMachines).setBlockTextureName(EnFusion.modId + ":machine/solarPanel/tier1")
				.setHarvestLevel("pickaxe", 2);

		solarPanelTier2 = new BlockSolarPanel("solarPanelTier2", 32, 16000);
		solarPanelTier2.setBlockName("solarPanelTier2").setHardness(0.9f).setStepSound(Block.soundTypePiston)
				.setCreativeTab(EFCreativeTabs.tabMachines).setBlockTextureName(EnFusion.modId + ":machine/solarPanel/tier2")
				.setHarvestLevel("pickaxe", 2);

		solarPanelTier3 = new BlockSolarPanel("solarPanelTier3", 64, 32000);
		solarPanelTier3.setBlockName("solarPanelTier3").setHardness(0.9f).setStepSound(Block.soundTypePiston)
				.setCreativeTab(EFCreativeTabs.tabMachines).setBlockTextureName(EnFusion.modId + ":machine/solarPanel/tier3")
				.setHarvestLevel("pickaxe", 2);

		solarPanelTier4 = new BlockSolarPanel("solarPanelTier4", 128, 64000);
		solarPanelTier4.setBlockName("solarPanelTier4").setHardness(0.9f).setStepSound(Block.soundTypePiston)
				.setCreativeTab(EFCreativeTabs.tabMachines).setBlockTextureName(EnFusion.modId + ":machine/solarPanel/tier4")
				.setHarvestLevel("pickaxe", 2);

		zinchoriumFurnace = new BlockZinchoriumFurnace("zinchoriumFurnace");
		zinchoriumFurnace.setBlockName("zinchoriumFurnace").setHardness(2.0f).setStepSound(Block.soundTypePiston)
				.setCreativeTab(EFCreativeTabs.tabMachines).setHarvestLevel("pickaxe", 2);

		itemConveyor = new BlockItemConveyor("itemConveyor");
		itemConveyor.setBlockName("itemConveyor").setHardness(2.0f).setStepSound(Block.soundTypePiston)
				.setCreativeTab(EFCreativeTabs.tabMachines).setHarvestLevel("pickaxe", 2);

		blockConveyor = new BlockBlockConveyor("blockConveyor");
		blockConveyor.setBlockName("blockConveyor").setHardness(2.0f).setStepSound(Block.soundTypePiston)
				.setCreativeTab(EFCreativeTabs.tabMachines).setHarvestLevel("pickaxe", 2);

		entityConveyor = new BlockEntityConveyor("entityConveyor");
		entityConveyor.setBlockName("entityConveyor").setHardness(2.0f).setStepSound(Block.soundTypePiston)
				.setCreativeTab(EFCreativeTabs.tabMachines).setHarvestLevel("pickaxe", 2);


//		Miscellaneous
		blockZinchorium = new EFBlock();
		blockZinchorium.setBlockName("blockZinchorium").setBlockTextureName(EnFusion.modId + ":blockZinchorium")
				.setHardness(2.5f).setStepSound(Block.soundTypeStone)
				.setHarvestLevel("pickaxe", 1);
		
		greenZinchoriumLightActive = new BlockZinchoriumLight(true);
		greenZinchoriumLightActive.setBlockName("greenZinchoriumLightActive")
								.setBlockTextureName(EnFusion.modId + ":zinchoriumLight/green")
								.setHardness(1.0f).setStepSound(Block.soundTypeMetal)
								.setHarvestLevel("pickaxe", 2);
		
		greenZinchoriumLightIdle = new BlockZinchoriumLight(false);
		greenZinchoriumLightIdle.setBlockName("greenZinchoriumLightIdle")
								.setCreativeTab(EFCreativeTabs.tabCore).setBlockTextureName(EnFusion.modId + ":zinchoriumLight/green")
								.setHardness(1.0f).setStepSound(Block.soundTypeMetal)
								.setHarvestLevel("pickaxe", 2);
		
		
		
//		Register blocks
//		Ores
		GameRegistry.registerBlock(oreZinchorium, "oreZinchorium");
		GameRegistry.registerBlock(oreCopper, "oreCopper");


//		Machines
		GameRegistry.registerBlock(solarPanelTier1, "solarPanelTier1");
		GameRegistry.registerBlock(solarPanelTier2, "solarPanelTier2");
		GameRegistry.registerBlock(solarPanelTier3, "solarPanelTier3");
		GameRegistry.registerBlock(solarPanelTier4, "solarPanelTier4");
		GameRegistry.registerBlock(zinchoriumFurnace, "zinchoriumFurnace");
		GameRegistry.registerBlock(itemConveyor, "itemConveyor");
		GameRegistry.registerBlock(blockConveyor, "blockConveyor");
		GameRegistry.registerBlock(entityConveyor, "entityConveyor");


//		Miscellaneous
		GameRegistry.registerBlock(blockZinchorium, "blockZinchorium");
		GameRegistry.registerBlock(greenZinchoriumLightActive, "greenZinchoriumLightActive");
		GameRegistry.registerBlock(greenZinchoriumLightIdle, "greenZinchoriumLightIdle");
	}
	
	public static void init() {
		
	}
	
	public static void postInit() {
		
	}
	
}
