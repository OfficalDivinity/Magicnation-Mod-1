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
		
		return true;
	}
	

	
}
