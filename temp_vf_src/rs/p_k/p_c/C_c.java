package rs.p_k.p_c;

import java.util.ArrayList;
import java.util.List;
import p_gnu.p_trove.p_f.p_b.C_cI_mc;
import p_gnu.p_trove.p_f.p_b.C_cc;
import p_gnu.p_trove.p_i.p_a.C_m;

public class C_c {
   private static final int a = 50;
   private static final int b = 50000;
   private static final long c = 60000L;
   private static final C_cc<C_d> d = new C_cc(100);
   private static final List<C_d> e = new ArrayList<>(100);
   private static final C_cI_mc<C_a> f = new C_cI_mc(100000);
   private static final C_m g = new C_m(100000);
   private static final List<C_a> h = new ArrayList<>(100000);
   private static long i;
   private static boolean j;

   public static C_a a(rs.p_r.C_c var0, int var1, int var2, int var3, int var4) {
      if (f.size() >= 50000) {
         c();
         System.out.println("[GPU] Reached max capacity of particle pool!");
         return null;
      } else if (h.size() == 0) {
         C_a var6 = new C_a(var0, var1, var2, var3, var4);
         var6.b();
         var6.a();
         c(var6);
         return var6;
      } else {
         C_a var5 = h.get(0);
         var5.b();
         var5.a(var0);
         var5.b(var1);
         var5.c(var2);
         var5.d(var3);
         var5.f(var4);
         var5.a();
         c(var5);
         h.remove(0);
         return var5;
      }
   }

   public static C_d a(int var0, boolean var1) {
      if (d.w_(var0)) {
         return (C_d)d.b(var0);
      } else if (!var1) {
         return null;
      } else if (d.size() >= 50) {
         c();
         return null;
      } else if (e.size() == 0) {
         C_d var3 = C_d.a();
         var3.b(var0);
         d.a(var0, var3);
         return var3;
      } else {
         C_d var2 = e.get(0);
         var2.b(var0);
         d.a(var0, var2);
         e.remove(0);
         return var2;
      }
   }

   public static boolean a() {
      return rs.p_l.p_b.C_a.a();
   }

   public static void b() {
      if (!a()) {
         int[] var0 = d.b();

         for (int var1 = 0; var1 < var0.length; var1++) {
            C_d var2 = (C_d)d.b(var0[var1]);
            if (System.currentTimeMillis() - var2.f() >= 60000L) {
               a(var0[var1]);
            }
         }

         long[] var4 = g.c();

         for (int var5 = 0; var5 < var4.length; var5++) {
            C_a var3 = a(var4[var5]);
            if (var3 != null) {
               var3.c();
               if (var3.i()) {
                  a(var3);
               }
            }
         }
      }
   }

   public static C_a a(long var0) {
      return (C_a)f.b(var0);
   }

   public static void a(C_a var0) {
      var0.a(true);
      d(var0);
      if (h.size() < 50000) {
         h.add(var0);
      }
   }

   public static void a(int var0) {
      C_d var1 = (C_d)d.b(var0);
      if (var1 != null) {
         var1.d();
         e.add(var1);
         d.c(var0);
      }
   }

   public static void c() {
      g.clear();
      f.clear();
      h.clear();
   }

   public static boolean b(C_a var0) {
      return g.y_(var0.d());
   }

   private static void c(C_a var0) {
      f.a(var0.d(), var0);
      g.b(var0.d());
   }

   private static void d(C_a var0) {
      f.c(var0.d());
      g.c(var0.d());
   }
}
