package rs.p_secure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class C_b {
   private static String a = null;

   public static final String a() {
      if (a != null) {
         return a;
      } else {
         OutputStream var0 = null;
         InputStream var1 = null;
         Runtime var2 = Runtime.getRuntime();
         Process var3 = null;

         try {
            var3 = var2.exec(new String[]{"/usr/sbin/system_profiler", "SPHardwareDataType"});
         } catch (IOException var21) {
            return null;
         }

         var0 = var3.getOutputStream();
         var1 = var3.getInputStream();

         try {
            var0.close();
         } catch (IOException var20) {
            var20.printStackTrace();
            return null;
         }

         BufferedReader var4 = new BufferedReader(new InputStreamReader(var1));
         Object var5 = null;
         String var6 = "Serial Number";

         label100: {
            Object var8;
            try {
               do {
                  if ((var5 = var4.readLine()) == null) {
                     break label100;
                  }
               } while (!var5.contains(var6));

               a = var5.split(":")[1].trim();
               break label100;
            } catch (IOException var22) {
               var8 = null;
            } finally {
               try {
                  var1.close();
               } catch (IOException var19) {
                  return null;
               }
            }

            return (String)var8;
         }

         if (a != null) {
            a = "MACOSX " + a;
         }

         return a;
      }
   }
}
