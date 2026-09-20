package rs.p_k.p_d;

import com.google.a.j.v;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class C_a {
   private final List<Function<String, String>> a = new ArrayList<>();

   public String a(String var1) {
      StringBuilder var2 = new StringBuilder();

      for (String var6 : var1.split("\r?\n")) {
         if (var6.startsWith("#include ")) {
            String var7 = var6.substring(9);
            String var8 = this.b(var7);
            var2.append(var8);
         } else {
            var2.append(var6).append('\n');
         }
      }

      return var2.toString();
   }

   public String b(String var1) {
      for (Function var3 : this.a) {
         String var4 = (String)var3.apply(var1);
         if (var4 != null) {
            return this.a(var4);
         }
      }

      return "";
   }

   public C_a a(Function<String, String> var1) {
      this.a.add(var1);
      return this;
   }

   public C_a a(Class<?> var1) {
      return this.a(var1x -> {
         try {
            InputStream var2 = var1.getResourceAsStream(var1x);

            String var3;
            label49: {
               try {
                  if (var2 != null) {
                     var3 = a(var2);
                     break label49;
                  }
               } catch (Throwable var6) {
                  if (var2 != null) {
                     try {
                        var2.close();
                     } catch (Throwable var5) {
                        var6.addSuppressed(var5);
                     }
                  }

                  throw var6;
               }

               if (var2 != null) {
                  var2.close();
               }

               return null;
            }

            if (var2 != null) {
               var2.close();
            }

            return var3;
         } catch (IOException var7) {
            return null;
         }
      });
   }

   private static String a(InputStream var0) {
      try {
         return v.a(new InputStreamReader(var0, StandardCharsets.UTF_8));
      } catch (IOException var2) {
         throw new RuntimeException(var2);
      }
   }
}
