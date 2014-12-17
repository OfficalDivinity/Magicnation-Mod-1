package com.juanwan11_magicnation.structures;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenStarterStructure extends WorldGenerator {

	public boolean generate(World world, Random random, int x, int y, int z) {

		while (world.isAirBlock(x, y, z) && y > 2) {
			--y;
		}

		world.setSpawnLocation(x, y, z);

		//Array list containing x,y,z multiples
		int[] coords = {0,0,0,1,0,0,2,0,0}
		for (int i = 0; i < coords.length/3; i=+3) {
			int x = coords[i];
			int y = coords[i+1];
			int z = coords[i+2];
			world.setBlock(x, y, z, Blocks.stonebrick);
		}
		
		return true;
	}
}
