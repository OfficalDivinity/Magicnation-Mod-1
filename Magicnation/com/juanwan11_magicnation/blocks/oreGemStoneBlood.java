package com.juanwan11_magicnation.blocks;

import java.util.Random;

import com.juanwan11_magicnation.BaseClass;
import com.juanwan11_magicnation.ModInformation;
import com.juanwan11_magicnation.Items.MAItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class oreGemStoneBlood extends Block {

	public oreGemStoneBlood() {
		super(Material.rock);

	}
	public int getExpDrop(IBlockAccess world, int metadata, int fortune) {
		return (int) 5;
	}

	   public Item getItemDropped(int damage, Random random, int fortune)
	    {
	        return MAItems.itemShardGemBlood;
	    }

	    public int quantityDropped(Random random)
	    {
	        return 1;
	    }

	    public int quantityDroppedWithBonus(int fortune, Random random)
	    {
	        if (fortune > 0)
	        {
	            int j = random.nextInt(fortune + 2) - 1;

	            if (j < 0)
	            {
	                j = 0;
	            }

	            return quantityDropped(random) * (j + 1);
	        }
	        else
	        {
	            return quantityDropped(random);
	        }
	    }
}