package rs.p_n.p_c;

public class C_aO_mc extends rs.p_n.C_c {
   public static final String[] c = new String[]{"Main stock"};
   public static rs.p_l.C_F_uc d;
   public static rs.p_l.C_F_uc e;
   public static int f;
   public static rs.p_q.p_a.p_a.C_a g = new C_aP_mc();

   public C_aO_mc(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = rs.p_n.C_e.H[3824];

      for (int var2 = 0; var2 < var1.al.length; var2++) {
         int var3 = var1.al[var2];
         rs.p_n.C_e var4 = rs.p_n.C_e.H[var3];
         if (var4.at != null && var4.at.contains("Right-click on shop")) {
            var4.at = "";
         }

         if (var3 == 3900) {
            var1.bc[var2] = var1.bc[var2] + 23;
         }
      }

      byte var8 = 10;
      int[] var9 = new int[var1.al.length + 10];
      int[] var10 = new int[var1.al.length + 10];
      int[] var5 = new int[var1.al.length + 10];
      int var6 = 0;

      for (int var7 = 0; var7 < var1.al.length; var7++) {
         var9[var7] = var1.am[var7];
         var10[var7] = var1.bc[var7];
         var5[var7] = var1.al[var7];
         var6++;
      }

      d = rs.p_n.C_e.j(10, "slayer/image");
      e = rs.p_n.C_e.j(9, "slayer/image");
      b(41043, 10, "slayer/image", "Select shop tab");
      b(41044, 9, "slayer/image", "Select shop tab");
      b(41045, 9, "slayer/image", "Select shop tab");
      b(41046, 9, "slayer/image", "Select shop tab");
      b(41047, 9, "slayer/image", "Select shop tab");
      a(41048, "Tab 1", this.a, 0, 16750623, true, true);
      a(41049, "Tab 2", this.a, 0, 16750623, true, true);
      a(41050, "Tab 3", this.a, 0, 16750623, true, true);
      a(41051, "Tab 4", this.a, 0, 16750623, true, true);
      a(41052, "Tab 5", this.a, 0, 16750623, true, true);
      var1.am = var9;
      var1.bc = var10;
      var1.al = var5;
      var1.b(var6++, 41043, 30, 59);
      var1.b(var6++, 41048, 71, 63);
      var1.b(var6++, 41044, 121, 59);
      var1.b(var6++, 41049, 162, 63);
      var1.b(var6++, 41045, 212, 59);
      var1.b(var6++, 41050, 253, 63);
      var1.b(var6++, 41046, 303, 59);
      var1.b(var6++, 41051, 344, 63);
      var1.b(var6++, 41047, 394, 59);
      var1.b(var6++, 41052, 435, 63);
      a(0, new String[]{"Main stock"});
   }

   public static void m(int var0) {
      rs.p_n.C_e var1 = rs.p_n.C_e.H[3824];

      for (int var2 = 0; var2 < f; var2++) {
         int var3 = 92 + var2 * 2;
         int var4 = 41043 + var2;
         if (var0 == var2) {
            rs.p_n.C_e.H[var4].E = d;
            rs.p_n.C_e.H[var4].aG = d;
         } else {
            rs.p_n.C_e.H[var4].E = e;
            rs.p_n.C_e.H[var4].aG = e;
         }
      }
   }

   public static void a(int var0, String[] var1) {
      f = 0;
      rs.p_n.C_e var2 = rs.p_n.C_e.H[3824];

      for (int var3 = 0; var3 < 5; var3++) {
         int var4 = 92 + var3 * 2;
         int var5 = 41043 + var3;
         int var6 = 92 + var3 * 2 + 1;
         int var7 = 41048 + var3;
         if (var3 < var1.length) {
            int var8 = 30 + 91 * var3;
            byte var9 = 59;
            int var10 = 71 + 91 * var3;
            byte var11 = 63;
            if (var0 == var3) {
               rs.p_n.C_e.H[var5].E = d;
               rs.p_n.C_e.H[var5].aG = d;
            } else {
               rs.p_n.C_e.H[var5].E = e;
               rs.p_n.C_e.H[var5].aG = e;
            }

            var2.am[var4] = var8;
            var2.bc[var4] = var9;
            var2.am[var6] = var10;
            var2.bc[var6] = var11;
            rs.p_n.C_e.H[var7].at = var1[var3];
            f++;
         } else {
            var2.am[var4] = -1500;
            var2.am[var6] = -1500;
         }
      }
   }
}
