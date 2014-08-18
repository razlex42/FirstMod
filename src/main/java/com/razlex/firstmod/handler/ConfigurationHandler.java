package com.razlex.firstmod.handler;

import com.razlex.firstmod.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean configValue = false;

    public static void init(File configFile)
    {
        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "Example config value").getBoolean(true);
        if(configuration.hasChanged())
        {
            configuration.save();
        }
    }

}
