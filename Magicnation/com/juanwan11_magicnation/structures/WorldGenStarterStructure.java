package com.juanwan11_magicnation.structures;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenStarterStructure extends WorldGenerator {

	int j,k;
	int x = 9,y = 9,z = 9;
	
	public boolean generate(World world, Random random, int blockx, int blocky, int blockz) {

		while (world.isAirBlock(blockx, blocky, blockz) && blocky > 2) {
			--blocky;
		}

		world.setSpawnLocation(blockx, blocky, blockz);
		
		for (int i = 0; i < coords.length; i=+3) {
			world.setBlock(blockx + coords[i], blocky + coords[i+1], blockz + coords[i+2], Blocks.stonebrick);
		} */
		
		for(j=0;j<x;j++)
			for(k=0;k<y;k++){
				world.setBlock(j, k, 0, Blocks.stonebrick);
				if(j==1)continue;
				world.setBlock(j, k, z, Blocks.stonebrick);
			}
		

		for(j=1;j<y;j++)
			for(k=0;k<y;k++){
				world.setBlock(0, j, k, Blocks.stonebrick);
				if(j==(y-1))continue;
				world.setBlock(x, j, k, Blocks.stonebrick);
			}
		
		

		for(j=1;j<z-1;j++)
			for(k=1;k<x-1;k++){
				world.setBlock(k, 0, z, Blocks.stonebrick);
				world.setBlock(k, y, z, Blocks.stonebrick);
			}
		
		
		
		
		return true;
	}
}
