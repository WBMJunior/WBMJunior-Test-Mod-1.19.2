package net.wbmjunior.juniormod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.wbmjunior.juniormod.WBMJuniorMod;

public class ModItems {

    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.WBMITEMS)));
    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.WBMITEMS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(WBMJuniorMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        WBMJuniorMod.LOGGER.info("Registering Mod Items for "+WBMJuniorMod.MOD_ID);
    }

}
