package com.razlex.firstmod.init;

import com.razlex.firstmod.item.ItemFM;
import com.razlex.firstmod.item.ItemMapleLeaf;
import com.razlex.firstmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemFM mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }

}
