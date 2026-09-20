package rs.p_n.p_c;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import rs.C_Client_mc;

public class C_b extends rs.p_n.C_c {
   public static rs.p_l.C_F_uc c;
   public static final List<C_b.a> d = new ArrayList<>();
   public static rs.p_l.C_K_uc[] e;

   public C_b(rs.p_l.C_K_uc[] var1) {
      super(var1);
      e = var1;
   }

   public static void m(int var0) {
      if (var0 >= 44105 && var0 <= 44220) {
         for (int var1 = 0; var1 < d.size(); var1++) {
            C_b.a var2 = d.get(var1);
            if (var2 != null && var0 == 44105 + var1 * 12) {
               C_Client_mc.ap = "::claimchallenge " + var2.a;
               break;
            }

            if (var2 != null && var0 == 44112 + var1 * 12) {
               C_Client_mc.ap = "::infochallenge " + var2.a;
               break;
            }
         }
      }
   }

   public static void a(String var0, String var1, int var2, int var3, int var4, int var5) {
      C_b.a var6 = new C_b.a();
      var6.a = var0;
      var6.b = var1;
      var6.c = var2;
      var6.d = var3;
      var6.e = var4;
      var6.f = var5;
      d.add(var6);
   }

   public static void b(String var0) {
      ArrayList var1 = new ArrayList();

      for (C_b.a var3 : d) {
         if (var3.a.equalsIgnoreCase(var0)) {
            var1.add(var3);
         }
      }

      for (C_b.a var5 : var1) {
         d.remove(var5);
      }
   }

   public static void a(String var0, int var1, int var2) {
      char var3 = '걇';

      for (C_b.a var5 : d) {
         if (var5.a.equalsIgnoreCase(var0)) {
            var5.e = var1;
            var5.f = var2;
            double var6 = (double)var5.e / (double)var5.f * 100.0;
            if (var6 >= 100.0) {
               var6 = 100.0;
            }

            DecimalFormat var8 = new DecimalFormat("###.#");
            rs.p_n.C_e.H[var3 + 6].E = new rs.p_l.C_F_uc("gameframe/tab/bar1", (int)((double)c.n * (var6 / 100.0)), c.o);
            rs.p_n.C_e.H[var3 + 7].at = "@gre@" + var5.e + "/" + var5.f + " (" + var8.format(var6) + "%)";
            break;
         }

         var3 += '\f';
      }

      C_Client_mc.fb = true;
   }

   public static void h() {
      rs.p_n.C_e var0 = rs.p_n.C_e.H['걅'];
      int var1 = 44103;
      int var2 = 1;

      for (int var3 = 0; var3 < 10; var3++) {
         int var4 = 23 + var3 * 80;
         if (var3 < d.size() && d.get(var3) != null) {
            C_b.a var5 = d.get(var3);
            a(var1++, var5.a, e, 1, 16750623, false, true);
            a(var1++, var5.b, e, 0, 16777215, false, true);
            a(var1++, "gameframe/tab/button", 1, 35, 19, "Collect reward", -1, var1, 1);
            a(var1++, "gameframe/tab/button", 2, 35, 19, var1);
            var1++;
            double var6 = (double)var5.e / (double)var5.f * 100.0;
            if (var6 >= 100.0) {
               var6 = 100.0;
            }

            DecimalFormat var8 = new DecimalFormat("###.#");
            h(var1++, "gameframe/tab/bar2");
            rs.p_n.C_e.H[var1 - 1].bn = false;
            h(var1++, "null");
            rs.p_n.C_e.H[var1 - 1].bn = false;
            rs.p_n.C_e.H[var1 - 1].E = new rs.p_l.C_F_uc("gameframe/tab/bar1", (int)((double)c.n * (var6 / 100.0)), c.o);
            a(var1++, "@gre@" + var5.e + "/" + var5.f + " (" + var8.format(var6) + "%)", e, 0, 16777215, false, true);
            rs.p_n.C_e.H[var1 - 1].bn = false;
            h(var1++, "gameframe/tab/divider");
            rs.p_n.C_e.H[var1 - 1].bn = false;
            a(var1++, "gameframe/tab/button", 3, 35, 12, "View information", -1, var1, 1);
            a(var1++, "gameframe/tab/button", 4, 35, 12, var1);
            var1++;
         } else {
            if (var3 == 0) {
               a(var1++, "<col=FF9B00>You don't have any challenges!", e, 0, 16750623, false, true);
               a(var1++, "", e, 0, 16750623, false, true);
               a(var1++, "", e, 0, 16750623, false, true);
               a(var1++, "", e, 0, 16750623, false, true);
               var0.b(var2++, var1 - 4, 2, 1 + var4);
               var0.b(var2++, var1 - 3, 2, 25 + var4);
               var0.b(var2++, var1 - 2, 2, 40 + var4);
               var0.b(var2++, var1 - 1, 2, 55 + var4);
               rs.p_n.C_e.H[var1++].bf = false;
               rs.p_n.C_e.H[var1++].bf = false;
               rs.p_n.C_e.H[var1++].bf = false;
               rs.p_n.C_e.H[var1++].bf = false;
               rs.p_n.C_e.H[var1++].bf = false;
               rs.p_n.C_e.H[var1++].bf = false;
               rs.p_n.C_e.H[var1++].bf = false;
               rs.p_n.C_e.H[var1++].bf = false;
               continue;
            }

            rs.p_n.C_e.H[var1++].bf = false;
            rs.p_n.C_e.H[var1++].bf = false;
            rs.p_n.C_e.H[var1++].bf = false;
            rs.p_n.C_e.H[var1++].bf = false;
            rs.p_n.C_e.H[var1++].bf = false;
            rs.p_n.C_e.H[var1++].bf = false;
            rs.p_n.C_e.H[var1++].bf = false;
            rs.p_n.C_e.H[var1++].bf = false;
            rs.p_n.C_e.H[var1++].bf = false;
            rs.p_n.C_e.H[var1++].bf = false;
            rs.p_n.C_e.H[var1++].bf = false;
            rs.p_n.C_e.H[var1++].bf = false;
         }

         var0.b(var2++, var1 - 12, 39, 1 + var4);
         var0.b(var2++, var1 - 11, 39, 16 + var4);
         var0.b(var2++, var1 - 10, 0, 6 + var4 - 5);
         var0.b(var2++, var1 - 9, 0, 6 + var4 - 5);
         var0.b(var2++, var1 - 7, 0, 6 + var4 + 35 + 4);
         var0.b(var2++, var1 - 6, 0, 6 + var4 + 35 + 4);
         var0.b(var2++, var1 - 5, 0, 6 + var4 + 46 + 4);
         var0.b(var2++, var1 - 4, 0, 6 + var4 + 63);
         var0.b(var2++, var1 - 3, 0, 6 + var4 + 23);
         var0.b(var2++, var1 - 2, 0, 6 + var4 + 23);
      }
   }

   @Override
   public void a() {
      d.clear();
      rs.p_n.C_e var1 = d(44100);
      rs.p_n.C_e var2 = j(44101);
      h(44099, "gameframe/tab/background");
      byte var3 = 50;
      var2.P = 168;
      var2.aR = 225 - var3;
      var2.aH = 850;
      var2.k(101);
      c = new rs.p_l.C_F_uc("gameframe/tab/bar2");
      int var4 = 44102;
      int var5 = 0;
      a(var4++, "<img=217> <u=16754944>Daily Challenges", e, 2, 16750623, false, true);
      var2.b(var5++, var4 - 1, 0, 4);

      for (int var6 = 0; var6 < 10; var6++) {
         a(var4++, "Deep wild pking", e, 1, 16750623, false, true);
         a(var4++, "Kill 50 players in\\nlevel 30+ wild", e, 0, 16777215, false, true);
         a(var4++, "gameframe/tab/button", 1, 35, 19, "Collect reward", -1, var4, 1);
         a(var4++, "gameframe/tab/button", 2, 35, 19, var4);
         int var34 = ++var4;
         var4++;
         h(var34, "gameframe/tab/bar2");
         h(var4++, "gameframe/tab/bar1");
         a(var4++, "@gre@0/" + var6 + " (0.0%)", e, 0, 16777215, false, true);
         h(var4++, "gameframe/tab/divider");
         a(var4++, "gameframe/tab/button", 3, 35, 12, "View information", -1, var4, 1);
         a(var4++, "gameframe/tab/button", 4, 35, 12, var4);
         var4++;
         int var7 = 23 + var6 * 80;
         var2.b(var5++, var4 - 12, 39, 1 + var7);
         var2.b(var5++, var4 - 11, 39, 16 + var7);
         var2.b(var5++, var4 - 10, 0, 6 + var7 - 5);
         var2.b(var5++, var4 - 9, 0, 6 + var7 - 5);
         var2.b(var5++, var4 - 7, 0, 6 + var7 + 35 + 4);
         var2.b(var5++, var4 - 6, 0, 6 + var7 + 35 + 4);
         var2.b(var5++, var4 - 5, 0, 6 + var7 + 46 + 4);
         var2.b(var5++, var4 - 4, 0, 6 + var7 + 63);
         var2.b(var5++, var4 - 3, 0, 6 + var7 + 23);
         var2.b(var5++, var4 - 2, 0, 6 + var7 + 23);
      }

      var1.k(9);
      var1.b(0, 32000, 0, 0);
      var1.b(1, 44099, 0, 31 + var3);
      var1.b(2, 16022, 0, 28 + var3);
      var1.b(3, 44101, 6, 30 + var3);
      var1.b(4, 16022, -1, 205 + var3);
      var1.b(5, 16018, 11, 54);
      var1.b(6, 16019, 37, 55);
      var1.b(7, 16020, 37, 55);
      var1.b(8, 640, 106, 59);
   }

   static class a {
      public String a;
      public String b;
      public int c;
      public int d;
      public int e;
      public int f;
   }
}
