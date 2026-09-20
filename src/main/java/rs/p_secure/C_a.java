package rs.p_secure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class C_a {
   private static String a = null;

   public static final String a() {
      if (a == null) {
         b();
      }

      if (a == null) {
         c();
      }

      return a;
   }

   private static BufferedReader a(String var0) {
      OutputStream var1 = null;
      Object var2 = null;
      Runtime var3 = Runtime.getRuntime();
      Process var4 = null;

      try {
         var4 = var3.exec(var0.split(" "));
      } catch (IOException var7) {
         return null;
      }

      var1 = var4.getOutputStream();
      var2 = var4.getInputStream();

      try {
         var1.close();
      } catch (IOException var6) {
         var6.printStackTrace();
         return null;
      }

      return new BufferedReader(new InputStreamReader((InputStream)var2));
   }

   private static void b() {
      Object var0 = null;
      String var1 = "Serial Number:";
      BufferedReader var2 = null;

      try {
         var2 = a("dmidecode -t system");
         if (var2 != null) {
            while ((var0 = var2.readLine()) != null) {
               if (var0.indexOf(var1) != -1) {
                  a = var0.split(var1)[1].trim();
                  return;
               }
            }
         }

         return;
      } catch (IOException var13) {
      } finally {
         if (var2 != null) {
            try {
               var2.close();
            } catch (IOException var12) {
            }
         }
      }
   }

   private static void c() {
      Object var0 = null;
      String var1 = "system.hardware.serial =";
      BufferedReader var2 = null;

      try {
         var2 = a("lshal");
         if (var2 != null) {
            while ((var0 = var2.readLine()) != null) {
               if (var0.indexOf(var1) != -1) {
                  a = var0.split(var1)[1].replaceAll("\\(string\\)|(\\')", "").trim();
                  break;
               }
            }
         }
      } catch (IOException var12) {
      } finally {
         if (var2 != null) {
            try {
               var2.close();
            } catch (IOException var11) {
            }
         }
      }
   }
}
