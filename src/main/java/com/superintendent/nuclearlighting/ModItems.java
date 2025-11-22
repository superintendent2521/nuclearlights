package com.superintendent.nuclearlighting;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(NeoForgeRegistries.ITEMS, NuclearLights.MODID);

    // Block item for the reactor block
    public static final DeferredHolder<Item, Item> REACTOR = ITEMS.register(
            "reactor",
            () -> new BlockItem(ModBlocks.REACTOR.get(), new Item.Properties())
    );
}
