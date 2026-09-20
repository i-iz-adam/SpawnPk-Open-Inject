package rs.p_cache.p_osrs.p_util;

import java.io.IOException;
import java.io.UncheckedIOException;

class C_a extends rs.p_t.p_a.C_a {
   final C_OsrsMapDependencyScanner_mc a;

   C_a(C_OsrsMapDependencyScanner_mc var1) {
      this.a = var1;
   }

   @Override
   public void a() {
      try {
         this.i = C_OsrsMapDependencyScanner_mc.b(this.a.a().resolve("configs/anims.yaml"));
         this.h.clear();

         for (int var2 : this.i.keySet()) {
            if (!this.h.w_(var2)) {
               this.h.a(var2, this.a(var2, this.i.get(var2)));
            }
         }
      } catch (IOException var3) {
         throw new UncheckedIOException(var3);
      }
   }
}
