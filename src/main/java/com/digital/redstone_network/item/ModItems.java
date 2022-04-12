package com.digital.redstone_network.item;

import com.digital.redstone_network.RedstoneNetworkMod;
import com.digital.redstone_network.item.ModCreativeModTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RedstoneNetworkMod.MOD_ID);

    // Items
    public static final RegistryObject<Item> NEO_CRYSTAL = ITEMS.register("neo_crystal",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).tab(ModCreativeModTab.REDSTONE_NETWORK_TAB)));
    //


    //Registry block item
    public static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    // Registry item
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

