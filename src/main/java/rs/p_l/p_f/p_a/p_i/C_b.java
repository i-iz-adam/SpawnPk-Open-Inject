package rs.p_l.p_f.p_a.p_i;

import rs.C_Client_mc;

public class C_b extends rs.p_l.p_f.p_b.C_d {
   private static C_b h = null;
   private static C_g i = null;
   private final C_e j;
   private final int k;
   private final int l;
   private boolean m = false;

   public C_b(C_e var1, int var2, int var3) {
      this.j = var1;
      this.k = var2;
      this.l = var3;
   }

   @Override
   public void a() {
      if (C_Client_mc.ff % 20 < 10) {
         this.j.a().f(this.e + this.k, this.f + this.l);
      }
   }

   public static C_b k() {
      return h;
   }

   public static boolean l() {
      return h != null;
   }

   public static void m() {
      i = null;
      if (h != null) {
         try {
            rs.p_l.p_f.C_e.d().a((rs.p_l.p_f.p_b.C_d)h);
         } catch (Exception var4) {
            var4.printStackTrace();
         } finally {
            i = null;
            h = null;
         }
      }
   }

   public static void a(int var0, C_e var1, int var2, int var3) {
      m();
      h = new C_b(var1, var2, var3);
      rs.p_l.p_f.C_e.d().a(h, var0);
   }

   public static void a(int var0) {
      byte var1 = 0;
      int var2 = 0;
      C_e var3 = C_e.b;
      if (rs.p_n.C_e.H[var0].E != null) {
         int var4 = rs.p_n.C_e.H[var0].E.n;
         int var5 = rs.p_n.C_e.H[var0].E.o;
         switch (var3) {
            case b:
               var1 = -30;
               var2 = var5 / 2 - 15;
         }
      } else {
         var2 = -10;
      }

      a(var0, var3, var1, var2);
      k().b(false);
   }

   public static void a(C_g var0) {
      i = var0;
   }

   public static C_g n() {
      return i;
   }

   public C_e o() {
      return this.j;
   }

   public int p() {
      return this.k;
   }

   public int q() {
      return this.l;
   }

   public boolean r() {
      return this.m;
   }

   public void b(boolean var1) {
      this.m = var1;
   }
}
