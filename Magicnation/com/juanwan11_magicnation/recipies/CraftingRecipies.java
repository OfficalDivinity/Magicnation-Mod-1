package com.juanwan11_magicnation.recipies;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.juanwan11_magicnation.Items.*;
import com.juanwan11_magicnation.interfaces.CraftingRecipesStacks;

import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingRecipies implements CraftingRecipesStacks {
	

	public static void CraftingRecipe(){
		Item BrassIngot = GameRegistry.findItem("Steamcraft", "ingotBrass");
		Item EncrustedDiamond = GameRegistry.findItem("erebus", "encrustedDiamond");
		Item BrassIngot = GameRegistry.findItem("", "");
		
		GameRegistry.addRecipe(gemBloodStack, "xyx",	"yzy", "xyx", 'x', shardGemBloodStack, 'y', goldNuggetStack,'z', diamondStack);
		GameRegistry.addRecipe(bloodstonePickaxe,"dsd"," g "," g ",'d',diamondStack,'s',gemBloodStack,'g',goldIngotStack);

	};
}
