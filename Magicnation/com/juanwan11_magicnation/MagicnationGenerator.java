package com.juanwan11_magicnation;

import java.util.Random;

import com.juanwan11_magicnation.blocks.MABlocks;
import com.juanwan11_magicnation.structures.WorldGenStarterStructure;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.WorldSavedData;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class MagicnationGenerator implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider){
		switch (world.provider.dimensionId){
			case -1:
				generateNether(world, random, chunkX * 16, chunkZ * 16);
			case 0:
				generateSurface(world, random, chunkX * 16, chunkZ * 16);
			case 1:
				generateEnd(world, random, chunkX * 16, chunkZ * 16);
		box(world,0,80,0,9,9,9);

	}
}

//---------------------------------------------------------------------------------------------------------------
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
//---------------------------------------------------------------------------------------------------------------

	private void generateEnd(World world, Random random, int x, int z)
	{
	 
	}
	 
	private void generateSurface(World world, Random random, int x, int z)
	{																//maxX maxZ maxVienSize chancesToSpawn minY maxY
	this.addOreSpawn(MABlocks.oreGemStoneBlood,Blocks.stone,  world, random, x, z, 16, 16, 2 + random.nextInt(3), 5, 17, 73);
	
	
	  (new WorldGenStarterStructure()).generate(world, random, 0, 70, 0);
	
	}
	 
	private void generateNether(World world, Random random, int x, int z)
	{
		this.addOreSpawn(MABlocks.oreNetherGemStoneBlood,Blocks.netherrack, world, random, x, z, 16, 16, 2 + random.nextInt(4),15, 1, 128);

	}
	 
    
    /* This method adds our block to the world.
    * It randomizes the coordinates, and does that as many times, as defined in spawnChance.
    * Then it gives all the params to WorldGenMinable, which handles the replacing of the ores for us.
    * @param block The block you want to spawn
    * @param world The world
    * @param random The Random
    * @param blockXPos the blockXpos of a chunk
    * @param blockZPos the blockZpos of a chunk
    * @param minVeinSize min vein
    * @param maxVeinSize max vein
    * @param chancesToSpawn the chance to spawn. Usually around 2
    * @param minY lowest point to spawn
    * @param maxY highest point to spawn
    */
    public void addOreSpawn(Block block,Block replaceBlock, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
    {
    assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
    assert maxX > 0 && maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
    assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
    assert maxY < 256 && maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
    assert maxZ > 0 && maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
     
    int diffBtwnMinMaxY = maxY - minY;
    for (int x = 0; x < chancesToSpawn; x++)
    {
    int posX = blockXPos + random.nextInt(maxX);
    int posY = minY + random.nextInt(diffBtwnMinMaxY);
    int posZ = blockZPos + random.nextInt(maxZ);
    (new WorldGenMinable(block, maxVeinSize,replaceBlock)).generate(world, random, posX, posY, posZ);
    }
  }
}
