package com.Zoe.PixelmonRFSupplements.Handlers;

import com.Zoe.PixelmonRFSupplements.Items.ModItems;
import com.Zoe.PixelmonRFSupplements.PixelmonSupplementals;
import com.Zoe.PixelmonRFSupplements.Utils.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(value = Side.CLIENT, modid = Reference.MODID)
public class ModelRegistrationHandler {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event){
        registerModel(ModItems.ANN_TICKET, 0);
    }

    public static void registerModel(Item item, int meta){
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        PixelmonSupplementals.LOGGER.error(item.getRegistryName());
    }

}
