package com.juanwan11_magicnation.Items;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class itemGemStoneBlood extends Item {
	



@Override
public void onCreated(ItemStack itemStack, World world, EntityPlayer player) {
	Minecraft.getMinecraft().thePlayer.sendChatMessage("Does This Have Repair Power???");

	}
}