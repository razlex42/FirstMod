package com.razlex.firstmod.init;

import com.razlex.firstmod.block.BlockFM;
import com.razlex.firstmod.block.BlockFlag;
import com.razlex.firstmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockFM flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}
