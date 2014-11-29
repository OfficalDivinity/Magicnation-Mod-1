package com.juanwan11_magicnation.interfaces;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.juanwan11_magicnation.Items.MAItems;

public interface CraftingRecipesStacks {
	ItemStack diamondStack = new ItemStack(Items.diamond);
	ItemStack goldNuggetStack = new ItemStack(Items.gold_nugget);
	ItemStack goldIngotStack = new ItemStack(Items.gold_ingot);
	ItemStack shardGemBloodStack = new ItemStack(MAItems.itemShardGemBlood);
	ItemStack bloodstonePickaxe = new ItemStack(MAItems.itemGemStoneBloodPickaxe);
	ItemStack gemBloodStack = new ItemStack(MAItems.itemGemStoneBlood);
}
