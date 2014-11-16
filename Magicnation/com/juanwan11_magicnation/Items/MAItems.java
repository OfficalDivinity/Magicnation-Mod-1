package com.juanwan11_magicnation.Items;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

import com.juanwan11_magicnation.*;

import cpw.mods.fml.common.registry.GameRegistry;

public class MAItems {
	
	public static Item itemShardGemBlood;
	public static Item itemGemStoneBlood;

	public static Item itemGemStoneBloodPickaxe;
	
	public static void makeItems() {
		itemShardGemBlood = new itemShardGemBlood().setUnlocalizedName(ModInformation.modid + "_" + "itemShardGemBlood").setTextureName(ModInformation.modid + ":" + "itemShardGemBlood").setCreativeTab(BaseClass.magicnationTab).setMaxStackSize(32);
		itemGemStoneBlood = new itemGemStoneBlood().setUnlocalizedName(ModInformation.modid + "_" + "itemGemStoneBlood").setTextureName(ModInformation.modid + ":" + "itemGemStoneBlood").setCreativeTab(BaseClass.magicnationTab).setMaxStackSize(16);
		itemGemStoneBloodPickaxe = new itemGemStoneBloodPickaxe(ToolMaterial.EMERALD).setUnlocalizedName(ModInformation.modid + "_" + "itemGemStoneBloodPickaxe").setCreativeTab(BaseClass.magicnationTab).setMaxStackSize(1);
	
	};

	public static void registerItems() {
		GameRegistry.registerItem(itemShardGemBlood, "itemShardGemBlood");
		GameRegistry.registerItem(itemGemStoneBlood, "itemGemStoneBlood");
		GameRegistry.registerItem(itemGemStoneBloodPickaxe, "itemGemStoneBloodPickaxe");

	};

}
