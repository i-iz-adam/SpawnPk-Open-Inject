package rs.p_n.p_c;

public class C_aM_mc extends rs.p_n.C_c {
   public static rs.p_q.p_a.p_a.C_a c = new C_aN_mc();
   public static final int d = 50;
   public static rs.p_l.C_K_uc[] e;
   public static rs.p_n.C_e f;
   public static int g;
   public static int bI;
   public static int bJ;

   public C_aM_mc(rs.p_l.C_K_uc[] var1) {
      super(var1);
      e = var1;
   }

   public static void k(int var0, String var1) {
      rs.p_n.C_e.H[40405 + var0].at = var1;
   }

   public static void b(int var0, String var1, boolean var2) {
      int var3 = g++;
      byte var4 = 19;
      if (var2) {
         a(var3, var1, "Select", e, var0, 12171349, false, true, 125);
         rs.p_n.C_e.H[var3].br = 16777215;
      } else {
         a(var3, var1, e, var0, 16750623);
      }

      f.b(bI++, var3, 6, bJ);
      bJ += 17;
      if (var0 == 1) {
         bJ += 3;
      }

      if (var0 == 2) {
         bJ += 5;
      }
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(40403);
      c(40402, 8, "gameframe/SPRITE");
      byte var2 = 24;
      boolean var3 = false;
      boolean var4 = false;
      int var5 = 0;
      f = j(40404);
      f.k(50);
      bJ = 10;
      bI = 0;
      g = 40405;
      int var6 = 50 - bI;

      for (int var7 = 0; var7 < var6; var7++) {
         b(0, "", false);
      }

      f.P = 168;
      f.aR = 225 - var2;
      f.aH = 1320;
      var5 = 0;
      var1.k(6);
      var1.b(var5++, 40402, 0, 31 + var2);
      var1.b(var5++, 16022, 0, 28 + var2);
      var1.b(var5++, 16022, 0, 255);
      var1.b(var5++, 16023, 4, 251);
      var1.b(var5++, 32000, 0, 0);
      var1.b(var5++, 40404, 6, 30 + var2);
   }
}
