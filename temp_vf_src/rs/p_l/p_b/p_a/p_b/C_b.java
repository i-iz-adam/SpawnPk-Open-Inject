package rs.p_l.p_b.p_a.p_b;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import rs.p_a.C_h;

public class C_b {
   public static List<Integer> a = new ArrayList<>();
   public static List<Integer> b = new ArrayList<>();
   public static List<Integer> c = new ArrayList<>();
   public static List<Integer> d = new ArrayList<>();
   public static List<Integer> e = new ArrayList<>();
   public static List<Integer> f = new ArrayList<>();

   public static void a() {
      a.clear();
      b.clear();
      c.clear();
      d.clear();
      e.clear();
      f.clear();
      File var0 = new File("./debug");
      if (!var0.exists()) {
         var0.mkdir();
      }

      try {
         BufferedReader var1 = new BufferedReader(new FileReader(new File("./debug/textures.txt")));
         C_b.a var3 = null;

         String var2;
         while ((var2 = var1.readLine()) != null) {
            if (!var2.contains("#")) {
               if (var2.toLowerCase().contains("[textur")) {
                  var3 = C_b.a.a;
               } else if (var2.toLowerCase().contains("[random")) {
                  var3 = C_b.a.b;
               } else if (var2.toLowerCase().contains("[recolor")) {
                  var3 = C_b.a.c;
               } else if (var3 != null && !var2.isEmpty() && var3 == C_b.a.a) {
                  String var4 = var2.split(" ")[0];
                  String var5 = var2.split(" ")[1];
                  int var6 = 1;
                  if (var4.contains(",")) {
                     var6 = 0;

                     for (String var10 : var4.split(",")) {
                        var6++;
                        a.add(Integer.parseInt(var10));
                     }
                  } else {
                     a.add(Integer.parseInt(var4));
                  }

                  for (int var12 = 0; var12 < var6; var12++) {
                     b.add(Integer.parseInt(var5));
                  }
               }
            }
         }

         var1.close();
      } catch (IOException var11) {
         var11.printStackTrace();
      }
   }

   public static void a(C_h var0) {
   }

   public static enum a {
      a,
      b,
      c;
   }
}
