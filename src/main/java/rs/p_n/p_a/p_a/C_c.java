package rs.p_n.p_a.p_a;

import rs.C_Client_mc;
import rs.p_gui.C_Launcher_mc;
import rs.p_l.C_F_uc;

public class C_c {
   public static C_F_uc a;
   public static C_F_uc b;
   public static C_b c;

   public static void a() {
      C_Client_mc.cI = -1;
      b = new C_F_uc("misc/dd1");
      a = new C_F_uc("misc/dd2");
      c = new C_b();
   }

   public static void a(C_a var0, int var1, int var2, boolean var3) {
      if (C_Client_mc.cH > 0) {
         if (C_Client_mc.cI == var0.aw && var3) {
         }

         rs.p_n.C_e var4 = rs.p_n.C_e.H[C_Client_mc.cH];
         byte var5 = 1;
         C_Client_mc var6 = C_Launcher_mc.n().o();
         rs.p_l.C_c.a(var1, var2, var0.P, var0.aR, 4602929, 255);
         rs.p_l.C_c.d(var1 - var5, var0.P + var5 * 2, var0.aR + var5 * 2, 2630172, var2 - var5);
         rs.p_l.C_c.d(var1 - var5, var0.P + var5 * 2, var0.aR + var5 * 2, 2630172, var2 - var5);
         rs.p_l.C_c.d(var1, var0.P, var0.aR, 4539457, var2);
         C_F_uc var7 = C_Client_mc.cI == var0.aw ? a : b;
         int var8 = var1 + var5 - var7.n / 2;
         int var9 = var2 + var0.aR / 2 - var0.ao.r / 2;
         rs.p_l.p_b.C_d.a(C_Launcher_mc.n().o(), var4, var0, var8, var9);
         int var10 = var1 + var0.P - var7.n - var5;
         int var11 = var2 + var0.aR / 2 - var7.o / 2;
         var7.f(var10, var11);
         if (var6.em == var0.aw || var6.em == var0.aw || var6.ef == var0.aw) {
            rs.p_l.C_c.a(var1, var2, var0.P, var0.aR, 1, 75);
         }
      }
   }

   public static void a(int var0) {
      if (rs.p_n.C_e.H[var0] != null && rs.p_n.C_e.H[var0] instanceof C_a) {
         C_a var1 = (C_a)rs.p_n.C_e.H[var0];
         c.a(var1);
         c.bf = true;
         C_Client_mc.cI = var0;
      } else {
         new IllegalArgumentException("The interface ID " + var0 + " is not a drop down component").printStackTrace();
      }
   }

   public static void b() {
      C_Client_mc.cI = -1;
      if (c != null) {
         c.bf = false;
      }
   }

   public static boolean c() {
      if (c == null || c.h() == null) {
         return false;
      } else {
         return C_Client_mc.cI <= 0 ? false : c.b();
      }
   }
}
