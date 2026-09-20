package rs.p_A_uc;

import com.google.common.cache.CacheLoader;

class C_c extends CacheLoader<C_a.b, C_d> {
   final C_a a;

   C_c(C_a var1) {
      this.a = var1;
   }

   @Override
   public C_d load(C_a.b var1) {
      return this.a.a(var1.a(), var1.b());
   }
}
