package com.razlex.firstmod.block;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockFlag extends BlockFM
{
    public BlockFlag()
    {
        super();
        this.setBlockName("flag");
        this.setBlockTextureName("flag");
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemstack) {
        //Super
        super.onBlockPlacedBy(world, x, y, z, entity, itemstack);

        //Sets the block to air on the x, y, and z coords from where you placed the block
        world.setBlockToAir(x, y + 1, z);

        for (int q = 1; q < 10; q++) {
            for (int u = 1; u < 10; u++) {
                for (int p = 1; p < 10; p++) {
                    //Sets the block on the x, y, and z coords starting from where you placed the block
                    world.setBlock(x + q + 12, y + u, z + p, b.cobblestone);
                }
            }
        }

        //Sets the block(with set metadata) on the x, y, and z coords from where you placed the block
        world.setBlock(x, y + 3, z, b.planks, 2, 2); //This is for birch planks, if you want other planks, search 'Minecraft Block Metadata' in google or find it on the MinecraftWiki

    }

}
