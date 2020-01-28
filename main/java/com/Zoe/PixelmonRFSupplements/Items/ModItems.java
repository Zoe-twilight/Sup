package com.Zoe.PixelmonRFSupplements.Items;

import com.Zoe.PixelmonRFSupplements.PixelmonSupplementals;
import com.Zoe.PixelmonRFSupplements.Utils.Reference;
import com.google.common.eventbus.AllowConcurrentEvents;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@GameRegistry.ObjectHolder(Reference.MODID)
public class ModItems {

    public static final Item ANN_TICKET = null;

    @Mod.EventBusSubscriber
    public static class RegistrationHandler{

        public static final Logger LOGGER = LogManager.getLogger(Reference.MODID);


        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event){
            LOGGER.info("Registering Items");

            final Item[] items = {
              new Item().setRegistryName(Reference.MODID, "ann_ticket").setCreativeTab(CreativeTabs.REDSTONE)
            };

            for (Item item : items) {
                nameItems(item);
            }


            LOGGER.info("Registered Ann Ticket");
            event.getRegistry().registerAll(items);
            LOGGER.info("Registered All Items Boss!");

        }


        public static void nameItems(Item item){
            LOGGER.info("Naming " + item);
            item.setUnlocalizedName("ticket");
            LOGGER.info("Named " + item + " Boss!");
        }
    }


}
