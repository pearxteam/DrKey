package ru.pearx.drkey;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Collections;

/*
 * Created by mrAppleXZ on 28.01.18 16:21.
 */
@Mod(name = DrKey.NAME, modid = DrKey.MODID, version = DrKey.VERSION, acceptedMinecraftVersions = "", dependencies = "required-after:pxlmc;", clientSideOnly = true)
public class DrKey
{
    public static final String MODID = "drkey";
    public static final String NAME = "DrKey";
    public static final String VERSION = "@VERSION@";

    private Logger log;

    public Logger getLog()
    {
        return log;
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        log = e.getModLog();

        setupMetadata(e.getModMetadata());
    }

    private void setupMetadata(ModMetadata data)
    {
        data.autogenerated = false;
        data.authorList = Collections.singletonList("mrAppleXZ");
        data.description = "A simple mod that adds an improved KeyBinding setup GUI.";
        data.modId = DrKey.MODID;
        data.name = DrKey.NAME;
        data.version = DrKey.VERSION;
    }
}