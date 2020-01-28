package com.Zoe.PixelmonRFSupplements;


import com.Zoe.PixelmonRFSupplements.Utils.Reference;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(modid = Reference.MODID , name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class PixelmonSupplementals
{
	
	public static final Logger LOGGER = LogManager.getLogger(Reference.MODID);


    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    }

    @EventHandler
    public void Init(FMLInitializationEvent event){
        LOGGER.info("Starting Up Boss!");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    }

    public static String prependModID(String name){
        return Reference.MODID + ":" + name;
    }

}
