package com.juanwan11_magicnation;

import com.juanwan11_magicnation.Items.*;
import com.juanwan11_magicnation.Items.botania.*;
import com.juanwan11_magicnation.Items.thaumcraft.*;
import com.juanwan11_magicnation.blocks.*;
import com.juanwan11_magicnation.blocks.thaumcraft.MAThaumBlocks;
import com.juanwan11_magicnation.recipies.*;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ModInformation.modid, version = ModInformation.version, name = ModInformation.name)
public class BaseClass {
	
	
        
	// Creative Tabs
	public static CreativeTabs magicnationTab = new CreativeTabs("juanwan11_magicnationTab") {
		@Override
		public Item getTabIconItem() {
			return MAItems.itemGemStoneBlood;
		}
	};
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		MABlocks.makeBlocks();
		MABlocks.registerBlocks();
		MAItems.makeItems();
		MAItems.registerItems();
		CraftingRecipies.CraftingRecipe();
		GameRegistry.registerWorldGenerator(new OreMagicnationGenerator(), 1);

		//Mods Loaded
		modLoader.isModsLoaded();
		
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
