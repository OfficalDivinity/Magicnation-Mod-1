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

import net.minecraft.world.World;


@Mod(modid = ModInformation.modid, version = ModInformation.version, name = ModInformation.name)
public class BaseClass {
	
	public void box(World world,int posx, int posy, int posz,int x, int y, int z) {
		
		int j,k;
	
		//build walls 
		for(j=0;j<x;j++)
			for(k=0;k<y;k++){
				world.setBlock(posx +j,posy +k,posz, Blocks.stonebrick);
				if(j==1)continue;
				world.setBlock(posx +j,posy +k,posz +z, Blocks.stonebrick);
			}

		for(j=1;j<y;j++)
			for(k=0;k<y;k++){
				world.setBlock(posx,posy +j,posz +k, Blocks.stonebrick);
				if(j==(y-1))continue;
				world.setBlock(posx +x,posy +j,posy +k, Blocks.stonebrick);
			}
		
		for(j=1;j<z-1;j++)
			for(k=1;k<x-1;k++){
				world.setBlock(posx, posy,posz +z, Blocks.stonebrick);
				world.setBlock(posy +k,posy +y,posy +z, Blocks.stonebrick);
			}
		
		
		
		
	}
        
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
		GameRegistry.registerWorldGenerator(new MagicnationGenerator(), 1);

		//Mods Loaded
		modLoader.isModsLoaded();
		
		box(new world, posx, posy, posz,9,9,9);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
