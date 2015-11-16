package com.github.jdkorv11.es.init;

import com.github.jdkorv11.es.helpers.RegisterHelper;
import com.github.jdkorv11.es.items.ItemExpStuff;

import net.minecraft.item.Item;

public class ModItems {

	public static Item omega = new ItemExpStuff().setUnlocalizedName("omega");

	public static void registerItems() {
		RegisterHelper.registerItem(omega);
	}
	
	public static void registerItemRenderer() {
		RegisterHelper.registerItemRenderer(omega);
	}
}
