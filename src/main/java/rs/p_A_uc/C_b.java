package rs.p_A_uc;

import com.google.common.cache.CacheLoader;

class C_b extends CacheLoader<C_a.a, C_d> {
   final C_a a;

   C_b(C_a var1) {
      this.a = var1;
   }

   @Override
   public C_d load(C_a.a var1) {
      return this.a.a(var1.a(), var1.b(), var1.c());
   }
}
