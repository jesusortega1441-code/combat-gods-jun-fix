package com.zanvik.combatgods;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("combatgods")
public class CombatGodsMod {
    public static final String MOD_ID = "combatgods";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public CombatGodsMod() {
        LOGGER.info("¡Combat Gods de Zanvik se está cargando correctamente en Minecraft 1.20.1!");
    }
}
