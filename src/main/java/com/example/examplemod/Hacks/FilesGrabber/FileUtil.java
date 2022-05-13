package com.example.examplemod.Hacks.FilesGrabber;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class FileUtil {

   public static List<File> getFiles(final String dir) {
      Stream<Path> paths = null;
      try {
         paths = Files.walk(Paths.get(dir, new String[0]), new FileVisitOption[0]);
      } catch (IOException e) {
         e.printStackTrace();
      }
      Object var2_2 = null;
      List<File> list = paths.filter(x$0 -> Files.isRegularFile(x$0, new LinkOption[0])).map(Path::toFile).collect(Collectors.toList());
      if (paths != null) {
         if (var2_2 != null) {
            paths.close();
         } else {
            paths.close();
         }
      }
      return list;
   }

   public static Optional<File> getFile(final String name) {
      return Optional.of(new File(name));
   }

   public static String randomString() {
      final String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvxyz";
      final StringBuilder sb = new StringBuilder(20);
      for (int i = 0; i < 20; ++i) {
         final int index = (int)(AlphaNumericString.length() * Math.random());
         sb.append(AlphaNumericString.charAt(index));
      }
      return sb.toString();
   }

}
