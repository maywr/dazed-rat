package com.example.examplemod;

import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Dupe {
   private final Random random = new Random();

   @SubscribeEvent
   public void ChatEvent(ClientChatEvent e) {
      String msg = e.getMessage();
      String[] sentences = e.getMessage().split(" ");
      if (e.getMessage().contains(".dupe")) {
         this.onEnable();
      }

   }

   public void onEnable() {
      EntityPlayerSP player = Minecraft.getMinecraft().player;
      WorldClient world = Minecraft.getMinecraft().world;
      if (player != null && Minecraft.getMinecraft().world != null) {
         ItemStack itemStack = player.getHeldItemMainhand();
         if (!itemStack.isEmpty()) {
            int count = this.random.nextInt(31) + 1;

            for(int i = 0; i <= count; ++i) {
               EntityItem entityItem = player.dropItem(itemStack.copy(), false, true);
               if (entityItem != null) {
                  world.addEntityToWorld(entityItem.getEntityId(), entityItem);
               }
            }

            int var10000 = count * itemStack.getCount();
            player.sendChatMessage("f3dot gandon umri scotina");
         }
      }
   }
}
