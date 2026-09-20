package rs.p_cache.p_osrs.p_util;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Map;
import rs.p_d.C_r;
import rs.p_t.p_a.C_f;

class C_b extends C_f {
   C_b(C_OsrsMapDependencyScanner_mc var1, byte[] var2, byte[] var3, byte[] var4, byte[] var5) {
      this.e = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.d = var5;
   }

   @Override
   public void a() {
      try {
         this.i = C_OsrsMapDependencyScanner_mc.b(C_OsrsMapDependencyScanner_mc.a(this.e).resolve("configs/objects.yaml"));
         this.h.clear();

         for (int var2 : this.i.keySet()) {
            Map var3 = this.i.get(var2);
            boolean var4 = var3.keySet().stream().anyMatch(var0 -> var0.equalsIgnoreCase("forceAllRevisions"));
            if (Boolean.TRUE.equals(var3.get("osrs")) || var4) {
               boolean var5 = var3.containsKey("osrs");
               C_r.a(var5 ? C_r.a.d : C_r.a.a, var5 ? this.a : this.b, var5 ? this.c : this.d);
               if (var2 < 0 || var2 >= C_r.A) {
                  throw new IllegalArgumentException("Object override outside definition table: " + var2);
               }

               this.h.a(var2, this.b(var2, var3));
            }
         }
      } catch (IOException var6) {
         throw new UncheckedIOException(var6);
      }
   }
}
