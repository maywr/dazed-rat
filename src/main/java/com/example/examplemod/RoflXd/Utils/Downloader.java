package com.example.examplemod.RoflXd.Utils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import org.apache.commons.io.FileUtils;

public class Downloader {
   public static void download(String url, File file, boolean forceDownload) {
      try {
         if (forceDownload || !file.exists()) {
            FileUtils.copyURLToFile(new URL(url), file);
         }
      } catch (IOException var4) {
         System.out.println(var4.getMessage());
      }

   }
}
