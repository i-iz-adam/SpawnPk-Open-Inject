package rs.p_n.p_c;

import java.util.ArrayList;
import java.util.List;

public class C_J_uc extends rs.p_n.C_c {
   private static final int d = 30333;
   private static final int e = 6;
   private static int f;
   private static List<C_J_uc.a> g = new ArrayList<>();
   public static rs.p_q.p_a.p_a.C_a c = new C_K_uc();

   public C_J_uc(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(30072);
      rs.p_n.p_b.p_a.C_a.c.a(30072, new C_L_uc(this, 500L));
      h(30330, "popups/activities 1");
      h(30331, "popups/activities 2");
      rs.p_n.C_e var2 = d(30332);
      var2.al = new int[1];
      var2.am = new int[1];
      var2.bc = new int[1];
      var2.aH = 750;
      var2.P = 449;
      var2.aR = 235;
      var2.bj = 87;

      for (short var3 = 30333; var3 <= 30369; var3 += 6) {
         a(var3, "", this.a, 2, 16750623, false, true);
         a(var3 + 1, 440, 14, 1, 1, 7960953, 16760832, 16721949);
         a(var3 + 2, "", this.a, 0, 1, true, false);
         a(var3 + 3, "", this.a, 0, 12171349, false, true);
         a(var3 + 4, "", this.a, 0, 12171349, false, true);
         a(var3 + 5, "", this.a, 0, 12171349, false, true);
      }

      a(30375, "Event Activity Viewer", this.a, 2, 16750623, true, true);
      a(30376, "<img=50> To prevent excessive farming, activities have timed limits on token earnings", this.a, 1, 16750623, false, true);
      a(30377, "<img=78> @cya@The limit on an activity resets once its timer reaches <img=37> @whi@0:00", this.a, 1, 16750623, false, true);
      var1.k(7);
      var1.b(0, 30330, 10, 11);
      var1.b(1, 30332, 25, 47);
      var1.b(2, 30375, 260, 27);
      var1.b(3, 30376, 23, 287);
      var1.b(4, 30377, 110, 304);
      var1.b(5, 63740, 474, 25);
      var1.b(6, 63741, 474, 25);

      for (int var4 = 0; var4 < var1.al.length; var4++) {
         var1.bc[var4] = var1.bc[var4] - 10;
      }
   }

   private static void j() {
      rs.p_n.C_e var0 = rs.p_n.C_e.H[30332];
      var0.k(f * 7);
      byte var1 = 0;
      int var2 = 10;
      int var3 = 0;

      for (byte var4 = 0; var4 < f * 7; var4 += 7) {
         int var5 = 30333 + var3++ * 6;
         var0.b(var4, var5, var1 + 1, var2);
         byte var6 = 0;

         for (int var7 = 0; var7 < 3; var7++) {
            var0.b(var4 + 3 + var7, var5 + 3 + var7, var1 + 1, var2 + 40 + 1 + var6 - 22);
            if (!rs.p_n.C_e.H[var5 + 3 + var7].at.equalsIgnoreCase("")) {
               var6 += 15;
            }
         }

         var0.b(var4 + 1, var5 + 1, var1 + 1, var2 + 20 + var6 + 3);
         var0.b(var4 + 2, var5 + 2, var1 + 229, var2 + 22 + var6 + 3);
         var0.b(var4 + 6, 30331, var1 + 20, var2 + 40 + var6 + 10);
         var2 = var2 + 40 + 15 + 15 + var6;
      }
   }

   private static void b(String var0, String[] var1, int var2, int var3, long var4) {
      C_J_uc.a var6 = new C_J_uc.a(var0, var4);
      rs.p_n.C_e.H[30333 + f * 6].at = var6.a();

      for (int var7 = 0; var7 < 3; var7++) {
         if (var7 >= var1.length) {
            rs.p_n.C_e.H[30333 + f * 6 + 3 + var7].at = "";
         } else {
            rs.p_n.C_e.H[30333 + f * 6 + 3 + var7].at = var1[var7];
         }
      }

      if (var3 == -1) {
         rs.p_n.C_e.H[30333 + f * 6 + 1].z = 16746752;
         rs.p_n.C_e.H[30333 + f * 6 + 1].w = 100;
         rs.p_n.C_e.H[30333 + f * 6 + 2].at = "<img=81> Activity locked! <img=81>";
         var6.b = "<img=81>";
      } else if (var3 == 0) {
         rs.p_n.C_e.H[30333 + f * 6 + 1].z = 7788154;
         rs.p_n.C_e.H[30333 + f * 6 + 1].w = 100;
         rs.p_n.C_e.H[30333 + f * 6 + 2].at = "No token limit!";
      } else {
         if (var2 >= var3) {
            rs.p_n.C_e.H[30333 + f * 6 + 2].at = "@whi@<shad=1>Limit reached! Token earnings are locked until the limit timer ends..";
         } else {
            rs.p_n.C_e.H[30333 + f * 6 + 2].at = var2 + " / " + var3 + " token limit";
         }

         rs.p_n.C_e.H[30333 + f * 6 + 2].z = 16721949;
         rs.p_n.C_e.H[30333 + f * 6 + 1].w = (int)((float)var2 / (float)var3 * 100.0F);
      }

      g.add(var6);
      f++;
   }

   private static void k() {
      f = 0;
   }

   static class a {
      public String a;
      public String b = "<img=82>";
      public long c;
      public long d;

      public a(String var1, long var2) {
         this.a = var1;
         this.c = var2;
         this.d = System.currentTimeMillis();
      }

      public String a() {
         String var1 = "";
         if (this.c > 0L) {
            long var2 = this.c - (System.currentTimeMillis() - this.d);
            if (var2 <= 0L) {
               var2 = 0L;
            }

            long var4 = var2 / 1000L;
            var1 = " <img=46> <img=37> @or1@";
            if (var4 >= 3600L) {
               long var6 = var4 / 3600L;
               long var8 = var4 / 60L % 60L;
               var4 %= 60L;
               var1 = var1 + var6 + ":" + (var8 < 10L ? "0" + var8 : var8) + ":" + (var4 < 10L ? "0" + var4 : var4);
            } else {
               long var13 = var4 / 60L;
               var4 %= 60L;
               var1 = var1 + var13 + ":" + (var4 < 10L ? "0" + var4 : var4);
            }
         }

         return this.b + " @yel@" + this.a + var1;
      }
   }
}
