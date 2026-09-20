package rs.p_cache.p_b.p_a;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import rs.p_cache.p_b.C_e;

public class C_c extends rs.p_cache.p_b.C_d {
   private static final String e = rs.p_f.C_a.m + "configs.zip";
   private static final String f = "configs.zip";
   private static final String g = rs.p_v.C_a.f() + "configs";
   private C_e h = new C_e("config_version");

   public C_c() {
      super("Configs");
   }

   @Override
   public boolean a() {
      try {
         URL var1 = new URL(e);
         File var2 = new File(g);
         if (var2.exists()) {
            var2.delete();
         }

         var2.mkdirs();
         rs.p_cache.p_a.C_a var3 = new rs.p_cache.p_a.C_a(
            this.c, "Downloading game configs..", var1, new File(var2.getAbsolutePath() + File.separator + "configs.zip")
         );
         File var4 = var3.b();
         if (var4 != null) {
            if (!this.a(var2.getAbsolutePath(), var4)) {
               this.a(rs.p_cache.p_b.C_b.b);
               return false;
            } else {
               var4.delete();
               return true;
            }
         } else {
            this.a(rs.p_cache.p_b.C_b.b);
            return false;
         }
      } catch (MalformedURLException var5) {
         var5.printStackTrace();
         return false;
      }
   }

   @Override
   public C_e b() {
      return this.h;
   }

   @Override
   public boolean f() {
      return true;
   }
}
