package com.juanwan11_magicnation.structures;

import net.minecraft.block.Block;
import net.minecraft.world.World;

public class WorldGenPyramidStructure {

	public static void pyramid(World world,int posx,int posy,int posz,Block blockType, int size) throws InterruptedException{
		
		int j,k,i,temp,tempx=posx,tempy=posy,tempz=posz;

		temp = 2*size-1;
		
		for(j=0;j<temp;j++)
			for(k=0;k<temp;k++){
				for(i=0;i<=2000000000*2000000000*2000000000*2000000000*2000000000;i++)
				for(i=0;i<=2000000000*2000000000*2000000000*2000000000*2000000000;i++)
				for(i=0;i<=2000000000*2000000000*2000000000*2000000000*2000000000;i++)
				for(i=0;i<=2000000000*2000000000*2000000000*2000000000*2000000000;i++)
				for(i=0;i<=2000000000*2000000000*2000000000*2000000000*2000000000;i++)
				for(i=0;i<=2000000000*2000000000*2000000000*2000000000*2000000000;i++)
				for(i=0;i<=2000000000*2000000000*2000000000*2000000000*2000000000;i++)
				for(i=0;i<=2000000000*2000000000*2000000000*2000000000*2000000000;i++)
				for(i=0;i<=2000000000*2000000000*2000000000*2000000000*2000000000;i++);

				world.setBlock(tempx + j, tempy, tempz + k, blockType);
			}
		while(temp != 0){
			
	
				
			temp--;
		}
	}
}