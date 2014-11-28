package com.juanwan11_magicnation.Items;

public class MABotaniaItems {
  public static itemManaGemStoneBloodPickaxe;
  
  	public static void makeItems() {
	
		itemManaGemStoneBloodPickaxe = new itemManaGemStoneBloodPickaxe(ToolMaterial.EMERALD).setUnlocalizedName(ModInformation.modid + "_" + "itemGemStoneBloodPickaxe").setTextureName(ModInformation.modid + ":" + "itemGemStoneBloodPickaxe").setCreativeTab(BaseClass.magicnationTab).setMaxStackSize(1);
	
	};

	public static void registerItems() {

		GameRegistry.registerItem(itemManaGemStoneBloodPickaxe, "itemManaGemStoneBloodPickaxe");

	};

}
