package com.github.jdkorv11.es.init;

import com.github.jdkorv11.es.blocks.BlockExpStuff;
import com.github.jdkorv11.es.helpers.RegisterHelper;

import net.minecraft.block.Block;

public class ModBlocks {

	public static Block citrine_block = new BlockExpStuff(1.0F, 3.0F, "pickaxe", 1, 0F)
			.setUnlocalizedName("citrine_block");

	public static void registerBlocks() {
		RegisterHelper.registerBlock(citrine_block);
	}

	public static void registerBlockRenderer() {
		RegisterHelper.registerBlockRenderer(citrine_block);
	}
}
