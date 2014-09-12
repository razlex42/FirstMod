package com.razlex.firstmod.creativetab;

import com.razlex.firstmod.init.ModItems;
import com.razlex.firstmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabFM
{
    public static final CreativeTabs FM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.mapleLeaf;
        }
    };
}
