package com.juanwan11_magicnation.recipies;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.juanwan11_magicnation.Items.*;

import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingRecipies {

	public static void CraftingRecipe() {
		ItemStack diamondStack = new ItemStack(Items.diamond);
		ItemStack goldNuggetStack = new ItemStack(Items.gold_nugget);
		ItemStack goldIngotStack = new ItemStack(Items.gold_ingot);
		ItemStack shardGemBloodStack = new ItemStack(MAItems.itemShardGemBlood);
		ItemStack bloodstonePickaxe = new ItemStack(MAItems.itemGemStoneBloodPickaxe);
		ItemStack gemBloodStack = new ItemStack(MAItems.itemGemStoneBlood);
		
		GameRegistry.addRecipe(new ItemStack(MAItems.itemGemStoneBlood), "xyx",	"yzy", "xyx", 'x', shardGemBloodStack, 'y', goldNuggetStack,'z', diamondStack);
                                               
		GameRegistry.addRecipe(new ItemStack(MAItems.itemGemStoneBloodPickaxe),"dsd"," g "," g ",'d',diamondStack,'s',gemBloodStack,'g',goldIngotStack);

	};
}
