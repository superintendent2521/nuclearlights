package com.superintendent.nuclearlighting;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(NeoForgeRegistries.BLOCKS, NuclearLights.MODID);

    // our reactor block
    public static final DeferredHolder<Block, Block> REACTOR = BLOCKS.register(
            "reactor",
            () -> new Block(
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.METAL)
                            .strength(3.0f, 9.0f)
                            .sound(SoundType.METAL)
            )
    );
}
