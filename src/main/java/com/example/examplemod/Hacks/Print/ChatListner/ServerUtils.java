package com.example.examplemod.Hacks.Print.ChatListner;

import net.minecraft.client.Minecraft;

public class ServerUtils {
   private static Minecraft mc = Minecraft.getMinecraft();

   public static boolean isOnServer() {
      return mc.getCurrentServerData() != null;
   }
}
