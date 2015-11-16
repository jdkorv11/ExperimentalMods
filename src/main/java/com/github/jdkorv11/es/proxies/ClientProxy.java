package com.github.jdkorv11.es.proxies;

import com.github.jdkorv11.es.init.ModBlocks;
import com.github.jdkorv11.es.init.ModItems;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenderers() {
		ModItems.registerItemRenderer();
		ModBlocks.registerBlockRenderer();
	}
}
