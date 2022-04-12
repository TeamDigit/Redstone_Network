package com.digital.redstone_network.block;

import com.digital.redstone_network.RedstoneNetworkMod;
import com.digital.redstone_network.item.ModCreativeModTab;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.digital.redstone_network.item.ModItems.registerBlockItem;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RedstoneNetworkMod.MOD_ID);

    // Blocks
    public static final RegistryObject<Block> TEST_BLOCK = registerBlock("test_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.ICE).strength(5f).requiresCorrectToolForDrops().sound(SoundType.BAMBOO)), ModCreativeModTab.REDSTONE_NETWORK_TAB);


    // Registry block object
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    // Registry block
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}