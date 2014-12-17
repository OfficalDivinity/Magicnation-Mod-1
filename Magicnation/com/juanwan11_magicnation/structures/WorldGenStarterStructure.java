package com.juanwan11_magicnation.structures;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenStarterStructure extends WorldGenerator {

	
    public boolean generate(World world, Random random, int x, int y, int z)
    {
        while (world.isAirBlock(x, y, z) && y > 2)
        {
            --y;
        }
        world.setSpawnLocation(x, y, z);
        
        for (int i = 0; i < 10; i++) {
            for (int g = 0; g < 10; g++) {
                for (int a = 0; a <= 10; a++) {
                    
                	int blockx = x+i;
                	int blocky = y+a;
                	int blockz = z+g;
                    
                	if (a != 10 && a != 0) {
                		if ((i >= 0 && g == 0) || (i >= 0 && g == 10) || (i == 0 && g >= 0) || (i == 10 && g >= 0))
                        	world.setBlock(blockx, blocky, blockz, Blocks.stonebrick);      
                    } else {
                    	world.setBlock(blockx, blocky, blockz, Blocks.stonebrick);
                  }
                }
              }
            }
        
        return true;
    }
}
