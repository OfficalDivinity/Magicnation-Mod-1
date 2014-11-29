package com.juanwan11_magicnation.recipies;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.juanwan11_magicnation.Items.*;

import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingRecipies {
	
	public static RecipeManaInfusion bloodRecipe;

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
	public static void BotaniaCraftingRecipe() {
		bloodRecipe = BotaniaAPI.registerManaAlchemyRecipe(new ItemStack(MAItems.itemGemStoneBlood), shardGemBloodStack, 16000);
	}
		public static void ThaumcraftCraftingRecipe() {
		GameRegistry.addRecipe(new ItemStack(MAItems.itemGemStoneBlood), "xy",	"yx", 'x', shardGemBloodStack, 'y', ItemApi.getItem("itemResource", 16));
		GameRegistry.addRecipe(new ItemStack(MAItems.itemGemStoneBlood), "xxx",	"xyx", "xxx", 'x', shardGemBloodStack, 'y', ItemApi.getItem("itemResource", 16));
	}
}
