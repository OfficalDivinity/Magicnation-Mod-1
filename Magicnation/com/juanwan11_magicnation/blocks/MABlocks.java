package com.juanwan11_magicnation.blocks;

import net.minecraft.block.Block;
import net.minecraft.init.Items;

import com.juanwan11_magicnation.*;

import cpw.mods.fml.common.registry.GameRegistry;

public class MABlocks {
	
	public static Block oreGemStoneBlood;
	
	public static void makeBlocks() {
		oreGemStoneBlood = new oreGemStoneBlood().setCreativeTab(BaseClass.magicnationTab).setBlockName(ModInformation.modid + "_" + "oreGemStoneBlood").setBlockTextureName(ModInformation.modid + ":" + "oreGemStoneBlood").setHardness(2.5f).setResistance(10f);
	};

	public static void registerBlocks() {
		GameRegistry.registerBlock(oreGemStoneBlood, "oreGemStoneBlood");

	};
	
	

}
