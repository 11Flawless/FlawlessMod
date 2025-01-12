package net.flawless.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.flawless.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PINK_GEM = registerItem("pink_gem", new Item(new Item.Settings()));
    public static final Item RED_GEM = registerItem("red_gem",new Item (new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID,name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering mod item for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(PINK_GEM);
            entries.add(RED_GEM);
        });
    }
}
