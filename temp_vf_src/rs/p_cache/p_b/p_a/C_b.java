package rs.p_cache.p_b.p_a;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import rs.p_cache.p_b.C_e;

public class C_b extends rs.p_cache.p_b.C_d {
   private static final String e = rs.p_f.C_a.z + "/assets/client.jar";
   private static final String f = rs.p_v.C_a.b() + "client.jar";
   private C_e g = new C_e(f, "client_version");

   public C_b(String var1) {
      super(var1);
   }

   @Override
   public boolean a() {
      try {
         URL var1 = new URL(e);
         File var2 = new File(f);
         if (var2.exists()) {
            var2.delete();
         }

         var2.mkdirs();
         rs.p_cache.p_a.C_a var3 = new rs.p_cache.p_a.C_a(this.c, "Downloading client..", var1, new File(var2.getAbsolutePath()));
         File var4 = var3.b();
         return var4 != null && var4.exists();
      } catch (MalformedURLException var5) {
         var5.printStackTrace();
         return false;
      }
   }

   @Override
   public C_e b() {
      return this.g;
   }

   @Override
   public boolean f() {
      return true;
   }
}
