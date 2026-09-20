package rs.p_r;

import p_gnu.p_trove.p_f.p_b.C_cI_mc;

public class C_J_uc {
   private static final int a = 100000;
   private static final C_cI_mc<C_a> b = new C_cI_mc(100010, 1.0F);
   private static final p_gnu.p_trove.p_e.p_a.C_k c = new p_gnu.p_trove.p_e.p_a.C_k();
   private static int d = 0;

   public static C_a a(C_c var0, int var1, int var2, int var3, int var4) {
      if (!rs.p_l.C_E_uc.q) {
         return null;
      } else if (d >= 100000) {
         if (rs.p_f.C_a.f) {
            System.out.println("[CPU] Reached max capacity of particle pool!");
         }

         return null;
      } else if (c.size() == 0) {
         C_a var6 = new C_a(var0, var1, var2, var3, var4);
         b(var6);
         return var6;
      } else {
         C_a var5 = (C_a)b.b(c.a(0));
         var5.b();
         var5.a(var0);
         var5.a(var1);
         var5.d(var2);
         var5.e(var3);
         var5.f(var4);
         var5.a();
         b(var5);
         c.b(0);
         return var5;
      }
   }

   public static void a(C_a var0) {
      var0.a(true);
      c(var0);
   }

   public static void a() {
   }

   private static void b(C_a var0) {
      d++;
      b.a(var0.n(), var0);
   }

   private static void c(C_a var0) {
      d--;
      d(var0);
   }

   private static void d(C_a var0) {
      if (c.size() < 100000) {
         c.b(var0.n());
      } else {
         b.c(var0.n());
      }
   }
}
