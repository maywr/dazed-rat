package com.example.examplemod.RoflXd.Utils;

import java.io.InputStream;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class SoundUtil {
   public static final SoundUtil INSTANCE = new SoundUtil();

   public static void playSound(ResourceLocation rl) {
      try {
         InputStream sound = Minecraft.getMinecraft().getResourceManager().getResource(rl).getInputStream();
         AudioStream as = new AudioStream(sound);
         AudioPlayer.player.start(as);
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }
}
