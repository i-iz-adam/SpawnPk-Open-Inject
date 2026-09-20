package rs.p_cache.p_osrs;

import java.io.File;
import java.io.FileInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.C_Client_mc;

public class C_b {
   private static final Logger a = LoggerFactory.getLogger(C_b.class);
   private final rs.p_cache.C_b b;

   public C_b(rs.p_cache.C_b var1) {
      this.b = var1;
   }

   public void a() {
      if (rs.p_f.C_a.c()) {
         for (C_a var4 : C_a.values()) {
            File var5 = new File(var4.c());
            if (var5.exists() && var5.listFiles().length > 0) {
               this.a(var4, var5.listFiles());
            }
         }
      }
   }

   public void a(C_a var1, File[] var2) {
      int var3 = 0;
      a.info("Scanning assets in pack directory {} index (file count: {})", var1.b(), var2.length);

      for (File var7 : var2) {
         if (var7.getName().contains(".gz")) {
            int var8 = Integer.parseInt(C_Client_mc.e(var7.getName()));
            byte[] var9 = this.a(var7);
            if (var9 != null && var9.length > 0) {
               this.b.a()[var1.a()].a(var9.length, var9, var8);
               var3++;
            } else {
               a.info("Unable to locate index {}.", var1.b());
            }
         }
      }

      if (var3 > 0) {
         a.info("Packed new assets into {} index ({} files)", var1.b(), var3);
      }
   }

   private byte[] a(File var1) {
      try {
         byte[] var2 = new byte[(int)var1.length()];
         FileInputStream var3 = new FileInputStream(var1);
         var3.read(var2);
         var3.close();
         return var2;
      } catch (Exception var4) {
         return null;
      }
   }
}
