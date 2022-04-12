package com.digital.redstone_network.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModCreativeModTab {
    public static final CreativeModeTab REDSTONE_NETWORK_TAB = new CreativeModeTab("redstone_network_tab") {
        // Icon
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.DIAMOND);
        }
    };
}
