package inno.uld.item;

import inno.uld.ULD;
import inno.uld.sound.ModSounds;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItems {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ULD.MOD_ID);
    // Create a Deferred Register to hold Items which will all be registered under the "examplemod" namespace
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ULD.MOD_ID);
    // Create a Deferred Register to hold CreativeModeTabs which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ULD.MOD_ID);

    public static final Supplier<Item> COPPER_ULD = ITEMS.registerItem("copper_uld", Item::new);
    public static final Supplier<Item> BRONZE_ULD = ITEMS.registerItem("bronze_uld", Item::new);
    public static final Supplier<Item> SILVER_ULD = ITEMS.registerItem("silver_uld", Item::new);
    public static final Supplier<Item> GOLD_ULD = ITEMS.registerItem("gold_uld", Item::new);
    public static final Supplier<Item> PLATINUM_ULD = ITEMS.registerItem("platinum_uld", Item::new);
    public static final Supplier<Item> PALLADIUM_ULD = ITEMS.registerItem("palladium_uld", Item::new);
    public static final Supplier<Item> MITHRIL_ULD = ITEMS.registerItem("mithril_uld", Item::new);


    public static final Supplier<RecordItem> COINS_FIRST_MUSIC_DISC = ITEMS.register("coins_first_music_disc",
            () -> new RecordItem(6, ModSounds.COINS_FIRST,
                    new Item.Properties()
                            .stacksTo(1)
                            .rarity(Rarity.EPIC),
                    2960)
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
