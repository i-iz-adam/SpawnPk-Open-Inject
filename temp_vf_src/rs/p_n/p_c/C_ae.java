package rs.p_n.p_c;

import java.util.ArrayList;
import java.util.List;

public class C_ae extends rs.p_n.C_c {
   public static List<Integer[]> c = new ArrayList<>();
   public static int d = 22952;
   public static int e = 79938;
   public static int f = 59902;

   public C_ae(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   public static void a(List<Integer[]> var0) {
      c = new ArrayList<>(var0);
   }

   public static void a(Integer[] var0) {
      c.add(var0);
   }

   public static void h() {
      rs.p_n.C_e var0 = rs.p_n.C_e.H['\ue9fd'];
      a(f, Boolean.valueOf(false));
      int var1 = c.size() + 1;
      byte var2 = 3;

      while (var1 % var2 != 0) {
         var1++;
      }

      rs.p_n.C_e.H[f].az = new int[500];
      rs.p_n.C_e.H[f].ax = new int[500];
      rs.p_n.C_e.H[f].P = var2;
      rs.p_n.C_e.H[f].aR = 10;
      rs.p_n.C_e.H[f].ac = 11;
      rs.p_n.C_e.H[f].ap = 10;
      int var3 = 0;
      int var4 = 0;
      int var5 = e;
      byte var6 = 2;
      byte var7 = 3;
      var0.k(c.size() + 1);

      for (int var8 = 0; var8 < c.size(); var8++) {
         int var9 = c.get(var8)[0];
         int var10 = c.get(var8)[1];
         String var11 = "Select item " + rs.p_d.C_k.f(var9).w;
         rs.p_n.C_e.H[f].az[var4] = var9 + 1;
         rs.p_n.C_e.H[f].ax[var4] = var10;
         var4++;
         int var12 = var5++;
         rs.p_n.C_e var13 = H[var12] = new rs.p_n.C_e();
         var13.aw = var12;
         var13.ah = var12;
         var13.aI = 5;
         var13.M = 1;
         var13.J = 0;
         var13.aC = 0;
         var13.ab = 52;
         var13.E = new rs.p_l.C_F_uc("vote/sprite " + (var8 == 0 ? 2 : 1));
         var13.aG = new rs.p_l.C_F_uc("vote/sprite " + (var8 == 0 ? 2 : 1));
         var13.P = var13.E.n;
         var13.aR = var13.aG.o;
         var13.Q = var11;
         var0.b(var3++, var12, var6, var7);
         if (var6 >= 82) {
            var6 = 2;
            var7 += 41;
         } else {
            var6 += 42;
         }
      }

      var0.b(var3++, f, 4, 5);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(d);
      c(59900, 0, "vote/sprite");
      a(59990, "vote/SPRITE", 3, 100, 32, "Teleport to boss", -1, 59991, 1);
      a(59991, "vote/SPRITE", 4, 100, 32, 59992);
      a(59993, "Purchase", this.a, 0, 16751360, true, true);
      a(59994, "Item Sale Listings", this.a, 1, 16750623, true, true);
      a(59995, "Item Title", this.a, 1, 16750623, true, true);
      a(22953, "@whi@Price: @gre@500 VP", this.a, 0, 16750623, true, true);
      a(22954, "Description Line", this.a, 0, 16750623, true, true);
      a(22955, "Description Line", this.a, 0, 16750623, true, true);
      a(22956, "Description Line", this.a, 0, 16750623, true, true);
      a(22957, "Description Line", this.a, 0, 16750623, true, true);
      byte var2 = 6;
      rs.p_n.C_e var3 = rs.p_n.C_e.d(59901);
      var3.aH = 350;
      var3.P = 127;
      var3.aR = 182;
      var3.bj = 87;
      var3.k(var2 * 2);
      h();
      var1.k(14);
      var1.b(0, 59900, 85, 33);
      var1.b(1, 59994, 174, 54);
      var1.b(2, 59995, 358, 110);
      var1.b(3, 59901, 104, 76);
      var1.b(4, 59990, 307, 208);
      var1.b(5, 59991, 307, 208);
      var1.b(6, 59993, 358, 214);
      byte var4 = 12;
      var1.b(7, 22953, 356, 124 + var4);
      var1.b(8, 22954, 356, 139 + var4);
      var1.b(9, 22955, 356, 151 + var4);
      var1.b(10, 22956, 356, 163 + var4);
      var1.b(11, 22957, 356, 175 + var4);
      var1.b(12, 65418, 431, 86);
      var1.b(13, 65419, 431, 86);
   }
}
