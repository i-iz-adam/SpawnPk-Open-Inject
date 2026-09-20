package rs;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C_e {
   public static final String a = "./clipdump/";
   public static final Map<Integer, List<C_e.a>> b = new HashMap<>();
   public static final List<String> c = new ArrayList<>();

   public static int a(int var0, int var1) {
      int var2 = var0 >> 6;
      int var3 = var1 >> 6;
      return var2 * 256 + var3;
   }

   public static String a(int var0, int var1, int var2) {
      return var0 + "," + var1 + "," + var2;
   }

   public static void a(int var0, int var1, int var2, int var3, boolean var4) {
      String var5 = a(var0, var1, var2);
      if (!c.contains(var5)) {
         if (var3 != 0) {
            int var6 = var0 >> 6;
            int var7 = var1 >> 6;
            int var8 = var6 * 256 + var7;
            C_e.a var9 = new C_e.a(var0, var1, var2, var3, var4);
            List<C_e.a> var10 = b.get(var8);
            if (var10 == null) {
               var10 = new ArrayList<>();
            }

            var10.add(var9);
            c.add(var5);
            b.put(var8, (List<C_e.a>)var10);
         }
      }
   }

   public static void a() {
      b.clear();
      c.clear();
      System.out.println("Cleared saved map and position cache!");
   }

   public static void b() {
      System.out.println("Dumping " + b.size() + " regions..");

      for (int var1 : b.keySet()) {
         File var2 = new File("./clipdump/" + var1);

         try {
            BufferedOutputStream var3 = new BufferedOutputStream(new FileOutputStream(var2));
            DataOutputStream var4 = new DataOutputStream(var3);

            try {
               for (C_e.a var6 : b.get(var1)) {
                  var4.writeInt(var6.a);
                  var4.writeInt(var6.b);
                  var4.writeInt(var6.c);
                  var4.writeInt(var6.d);
                  var4.writeBoolean(var6.d == 0);
                  var4.writeBoolean(var6.e);
               }
            } catch (IOException var7) {
               var7.printStackTrace();
               var2.delete();
            }

            var4.close();
         } catch (FileNotFoundException var8) {
            var8.printStackTrace();
         } catch (IOException var9) {
            var9.printStackTrace();
         }
      }

      System.out.println("Dump successful!");
   }

   static class a {
      public int a;
      public int b;
      public int c;
      public int d;
      public boolean e;

      public a(int var1, int var2, int var3, int var4, boolean var5) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
         this.d = var4;
         this.e = var5;
      }
   }
}
