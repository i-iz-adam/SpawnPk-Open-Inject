package rs.p_l.p_e.p_a;

import rs.C_Client_mc;

public class C_c extends rs.p_l.p_e.C_f {
   public static boolean p = false;
   public static final int q = 140;
   public static final int r = 160;
   public static final int s = 88;
   public static final int t = 5918522;
   public static final int u = 2367511;
   private static final String w = "Correct F3:";
   private static final String x = "Magic:";
   private static final String y = "Damage:";
   public static rs.p_q.p_a.p_a.C_a v = new C_d();
   private static String z;
   private static String A;
   private static int B;
   private static int C;
   private static int D;
   private static int E;
   private static String F;
   private static String G;
   private static int H;
   private static int I;
   private static int J;
   private static int K;
   private static String L;
   private static String M;
   private static int N;
   private static int O;
   private static String P;
   private static String Q;
   private static int R;
   private static int S;
   private static int T;
   private static int U;
   private static String V;
   private static String W;
   private static String X;
   private static String Y;
   private static boolean Z = true;
   private static boolean aa = true;
   private static boolean ab = true;

   @Override
   public void b() {
      g();
      p = true;
   }

   @Override
   public void b(C_Client_mc var1, rs.p_l.p_e.C_f.a var2) {
      if (var2 != rs.p_l.p_e.C_f.a.b) {
         int var3 = 1;
         int var4 = 1;
         int var5 = 350;
         int var6 = 1;
         if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
            var3 = 10;
            var5 = C_Client_mc.aj - 400;
            var6 = 5;
            var4 = 5;
         } else {
            var3 += 4;
            var4 += 4;
            var5 += 4;
            var6 += 4;
         }

         this.a(var3, var4, z, B, C, F, L, P, V, X);
         this.a(var5, var6, A, D, E, G, M, Q, W, Y);
      }
   }

   @Override
   public void c() {
   }

   @Override
   public boolean a(C_Client_mc var1) {
      return f();
   }

   public void a(int var1, int var2, String var3, int var4, int var5, String var6, String var7, String var8, String var9, String var10) {
      byte var11 = 88;
      if (!Z) {
         var11 -= 17;
      }

      if (!aa) {
         var11 -= 17;
      }

      if (!ab) {
         var11 -= 17;
      }

      rs.p_l.C_c.b(var11, var2, var1, 5918522, 160, 140);
      rs.p_l.C_c.b(var11 - 4, var2 + 2, var1 + 2, 2367511, 156, 140);
      int var12 = var2 + 18;
      short var13 = 156;
      byte var14 = 15;
      int var15 = var1 + 2 + (160 - var13) / 2;
      rs.p_l.C_c.b(var14 + 2, var12 - 1, var15 - 1, 0, var13 - 4 + 2, 90);
      rs.p_l.C_c.b(var14, var12, var15, 13960709, var13 - 4, 150);
      rs.p_l.C_c.b(var14, var12, var15, 30976, this.a(var4, var5, var13), 255);
      C_Client_mc.fE[80].f(var15, var12 - 17);
      C_Client_mc.gl.b(var3, var15 + 15, var12 - 3, 16750623, 0);
      C_Client_mc.gl.c(var6, var15 + var13 / 2, var12 + 12, 16777215, 0);
      byte var16 = 83;
      byte var17 = 32;
      var12 += 29;
      if (aa) {
         int var18 = var1 + 5;
         rs.p_l.C_c.b(15, var12 - 12, var1 + 3, 65401, 154, 62);
         C_Client_mc.fE[85].f(var18 + 1, var12 - 12);
         C_Client_mc.gl.b("Correct F3:", var18 + 19, var12, 16777215, 0);
         C_Client_mc.gl.b(var7, var18 + 83 - 6, var12, 65401, 0);
         var12 += var14 + 2;
      }

      if (ab) {
         int var20 = var1 + 5;
         rs.p_l.C_c.b(15, var12 - 12, var1 + 3, 47103, 154, 62);
         C_Client_mc.fE[55].f(var20, var12 - 11);
         C_Client_mc.gl.b("Magic:", var20 + 19, var12, 16777215, 0);
         C_Client_mc.gl.b(var9, var20 + 83 - 30, var12, 47103, 0);
         C_Client_mc.gl.a(var10, var20 + 83 + 68, var12, 12171349, 0);
         var12 += var14 + 2;
      }

      if (Z) {
         int var21 = var1 + 5;
         rs.p_l.C_c.b(15, var12 - 12, var1 + 3, 16750623, 154, 62);
         C_Client_mc.fE[53].f(var21, var12 - 11);
         C_Client_mc.gl.b("Damage:", var21 + 19, var12, 16777215, 0);
         C_Client_mc.gl.b(var8, var21 + 83 - 20, var12, 16750623, 0);
      }
   }

   public void a(boolean var1) {
      p = var1;
   }

   public static boolean f() {
      return p && rs.p_f.C_a.bk;
   }

   public static void g() {
      A = "N/A";
      z = "N/A";
      E = 0;
      D = 0;
      C = 0;
      B = 0;
      G = "0 / 0";
      F = "0 / 0";
      J = 0;
      H = 0;
      K = 0;
      I = 0;
      M = "0/0 (0%)";
      L = "0/0 (0%)";
      O = 0;
      N = 0;
      Q = "0 (0)";
      P = "0 (0)";
      T = 0;
      R = 0;
      U = 0;
      S = 0;
      W = "0/0 (0%)";
      V = "0/0 (0%)";
      Y = "[0%]";
      X = "[0%]";
   }

   private int a(int var1, int var2, int var3) {
      int var4 = (int)((float)(var3 - 4) * ((float)var1 / (float)var2));
      if (var1 > 0 && var4 <= 0) {
         var4 = 1;
      }

      if (var4 > var3 - 4) {
         var4 = var3 - 4;
      }

      if (var4 < 0) {
         var4 = 0;
      }

      return var4;
   }
}
