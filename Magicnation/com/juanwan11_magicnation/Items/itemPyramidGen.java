package com.juanwan11_magicnation.Items;

import com.juanwan11_magicnation.structures.WorldGenPyramidStructure;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class itemPyramidGen extends Item {

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player){
		
		try {
			WorldGenPyramidStructure.pyramid(world, 10, 80, 10, Blocks.sandstone, 10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return itemStack;
	}
	
}
