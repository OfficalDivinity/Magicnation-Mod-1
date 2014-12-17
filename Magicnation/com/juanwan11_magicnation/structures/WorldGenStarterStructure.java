package com.juanwan11_magicnation.structures;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenStarterStructure extends WorldGenerator {
	public boolean generate(World world, Random random, int blockx, int blocky, int blockz) {

		while (world.isAirBlock(blockx, blocky, blockz) && blocky > 2) {
			--blocky;
		}

		world.setSpawnLocation(blockx, blocky, blockz);

		world.setBlock(blockx, blocky, blockz, Blocks.diamond_block);
		for (int x = 0; x < 3; x++) {
        		for (int y = 0; y <= 3; y++) {
        			for (int z = 0; z < 3; z++) {

					 int Blockx = blockx+x;
					 int Blocky = blocky+y;
					 int Blockz = blockz+z;

					if (y != 3 && y != 0) {
						if ((x >= 0 && y == 0) || (x >= 0 && z == 2) || (x == 0 && z >= 0) || (x == 2 && z >= 0))
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
