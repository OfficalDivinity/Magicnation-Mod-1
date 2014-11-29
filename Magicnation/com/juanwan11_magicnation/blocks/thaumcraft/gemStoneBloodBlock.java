package com.juanwan11_magicnation.blocks.thaumcraft;

import java.awt.Color;

import thaumcraft.api.crafting.IInfusionStabiliser;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class gemStoneBloodBlock extends Block implements IInfusionStabiliser
{
        public gemStoneBloodBlock(Material material) 
        {
                super(material);
            	setHarvestLevel("pickaxe", 1);
            	setCreativeTab(CreativeTabs.tabBlock);
        }
        
        public MapColor getMapColor(int p_149728_1_)
        {
            return MapColor.obsidianColor;
        }

		@Override
		public boolean canStabaliseInfusion(World world, int x, int y, int z) {
			
			return true;
		}
        

}