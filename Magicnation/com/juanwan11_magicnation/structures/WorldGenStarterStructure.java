package com.juanwan11_magicnation.structures;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenStarterStructure extends WorldGenerator {

	int blockx,blocky,blockz=0;
	
	public boolean generate(World world, Random random, int x, int y, int z) {

		while (world.isAirBlock(x, y, z) && y > 2) {
			--y;
		}

		world.setSpawnLocation(x, y, z);

		for (int i = 0; i < 10; i++) {
        	for (int g = 0; g < 10; g++) {
        		for (int a = 0; a <= 10; a++) {

					 blockx = blockx+i;
					 blocky = blocky+a;
					 blockz = blockz+g;

					if (a != 10 && a != 0) {
						if ((i >= 0 && g == 0) || (i >= 0 && g == 9) || (i == 0 && g >= 0) || (i == 9 && g >= 0))
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
