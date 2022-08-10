package net.wbmjunior.juniormod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.wbmjunior.juniormod.WBMJuniorMod;

public class ModItemGroup {
    public static final ItemGroup WBMITEMS = FabricItemGroupBuilder.build(new Identifier(WBMJuniorMod.MOD_ID, "wbmitems"),
            () -> new ItemStack(ModItems.MYTHRIL_INGOT));
}
