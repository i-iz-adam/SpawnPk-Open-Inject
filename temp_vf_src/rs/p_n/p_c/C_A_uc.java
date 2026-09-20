package rs.p_n.p_c;

public class C_A_uc extends rs.p_n.C_c {
   private final int[] d = new int[]{6179, 2459, 2469, 2480, 2492};
   public static final rs.p_q.p_a.p_a.C_a c = new C_B_uc();

   public C_A_uc(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      a(true);
      this.j();
      rs.p_n.C_e.H[14175].Q = "Confirm";
   }

   public static void a(boolean var0) {
      int var1 = 5;
      byte var2 = 0;
      int var3 = 0;
      int var4 = 10;
      int var5 = -10;
      byte var6 = 0;
      if (!var0) {
         byte var7 = -55;
         byte var9 = 25;
         byte var8 = -82;
         var4 = var9 + 10;
         var1 = var7 + 10;
         var5 -= 15;
         var5 += 26;
         var3 = var8 + 41;
         var2 += 41;
      } else {
         var6 -= 10;
      }

      rs.p_n.C_e.H[14170].al = new int[]{14171, 14172, 14173, 14174, 14175, 14176, 14178, 14179, 14180, 14181, 14184};
      rs.p_n.C_e.H[14170].am = new int[]{var5, 225 + var3, 358 + var3, 0, 226 + var3, 362 + var3, 408, 15, 0 + var2, 0 + var2, 62 + var2};
      rs.p_n.C_e.H[14170].bc = new int[]{var6, 24 + var4, 25 + var4, -1, 32 + var4, 32 + var4, 0, 1, 50 + var1, 60 + var1, 32 + var1};
      i();
   }

   public static void h() {
      rs.p_n.C_e.H[14170].al = new int[]{14172, 14173, 14174, 14175, 14176, 14178, 14179, 14180, 14181, 14184};
      rs.p_n.C_e.H[14170].am = new int[]{145, 278, 0, 146, 282, 408, 15, 0, 0, 62};
      rs.p_n.C_e.H[14170].bc = new int[]{49, 50, -1, 54, 54, 0, 1, 50, 5, 32};

      for (int var0 = 0; var0 < rs.p_n.C_e.H[14170].al.length; var0++) {
         rs.p_n.C_e.H[14170].bc[var0] = rs.p_n.C_e.H[14170].bc[var0] + 5;
      }

      rs.p_n.C_e.H[14174].at = "Please confirm your choice.";
      rs.p_n.C_e.H[14183].at = "";
      i();
   }

   public static void i() {
      rs.p_n.C_e.H[14172].af = 8685;
      rs.p_n.C_e.H[14172].aI = 6;
      rs.p_n.C_e.H[14172].P = 32;
      rs.p_n.C_e.H[14172].aR = 32;
      rs.p_n.C_e.H[14172].aN = 0;
      rs.p_n.C_e.H[14172].aU = 291;
      rs.p_n.C_e.H[14172].aV = 2032;
      rs.p_n.C_e.H[14172].aK = false;
      rs.p_n.C_e.H[14172].aM = 0;
      rs.p_n.C_e.H[14172].aL = 0;
      rs.p_n.C_e.H[14172].ae = 1;
      rs.p_n.C_e.H[14172].aT = 1463;
   }

   public static void a(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      rs.p_n.C_e.a(var0, var1, var3, var4, (int)((double)rs.p_d.C_k.f(var1).G * 0.4));
      rs.p_d.C_k var6 = rs.p_d.C_k.f(var1);
      rs.p_n.C_e.H[var0].bq = var2;
      rs.p_n.C_e.H[var0].aN = var1;
      rs.p_n.C_e.H[var0].aU = var6.M;
      rs.p_n.C_e.H[var0].aV = var6.Z;
      if (var5) {
         rs.p_n.C_e.H[var0].aK = true;
         rs.p_n.C_e.H[var0].aM = rs.p_d.C_k.f(var1).Z;
         rs.p_n.C_e.H[var0].aL = rs.p_d.C_k.f(var1).M;
      } else {
         rs.p_n.C_e.H[var0].aK = false;
      }
   }

   private void j() {
      boolean var1 = true;

      for (int var5 : this.d) {
         rs.p_n.C_e var6 = rs.p_n.C_e.H[var5];
         int[] var7 = new int[var6.al.length + 1];
         int[] var8 = new int[var6.al.length + 1];
         int[] var9 = new int[var6.al.length + 1];
         int var10 = 0;

         for (int var11 = 0; var11 < var6.al.length; var11++) {
            var7[var11] = var6.am[var11];
            var8[var11] = var6.bc[var11];
            var9[var11] = var6.al[var11];
            var10++;
         }

         a(54195, "<img=25> Close window", "Cancel", this.a, 0, 8912896, false, false, 300);
         short var14 = 400;
         byte var12 = 1;
         var6.am = var7;
         var6.bc = var8;
         var6.al = var9;
         var6.b(var10++, 54195, var14, var12);
      }
   }

   public static enum a {
      a,
      b,
      c;
   }
}
