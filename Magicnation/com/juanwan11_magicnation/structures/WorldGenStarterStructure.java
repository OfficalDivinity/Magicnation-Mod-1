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
	
	
}
