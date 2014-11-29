package com.juanwan11_magicnation.Items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class itemGemStoneBloodSword extends ItemSword{
//vars
	private int type=0;
	
	public itemGemStoneBloodSword(ToolMaterial toolMaterial) {
		super(toolMaterial.EMERALD);
		setMaxDamage(1561);
	}
	
	private int checkType(){
		switch(type){
		case 0:
			type++;
			break;
		case 1:
			type++;
			break;
		case 2:
			type++;
			break;
		case 3:
			type++;
			break;
		case 4:
			type=0;
			break;
		}
		return type;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {		
		checkType();
		return itemStack;
		}		
		
	 public boolean hitEntity(ItemStack itemStack, EntityLivingBase entity, EntityLivingBase entity1)
	    {
			type=checkType();
			if (type==1){
		        itemStack.damageItem(1, entity1);
				entity.addPotionEffect(new PotionEffect(Potion.poison.id, 25,3));			
			}else if(type==2){
				 itemStack.damageItem(1, entity1);
					entity.addPotionEffect(new PotionEffect(Potion.wither.id, 25,3));	
			}else if(type==3){
				 itemStack.damageItem(1, entity1);
					entity.addPotionEffect(new PotionEffect(Potion.hunger.id, 25,3));	
			}else if(type==4){
				 itemStack.damageItem(1, entity1);
					entity.addPotionEffect(new PotionEffect(Potion.poison.id, 10,1));	
					entity1.addPotionEffect(new PotionEffect(Potion.regeneration.id, 10,1));	
			}
	       
				return true;
	    }

}
