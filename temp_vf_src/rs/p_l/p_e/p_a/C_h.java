package rs.p_l.p_e.p_a;

import java.util.HashMap;
import java.util.Map;
import rs.C_Client_mc;
import rs.p_l.C_F_uc;

public class C_h extends rs.p_l.p_e.C_f {
   public static final int p = 2;
   private static C_F_uc E;
   private static C_F_uc F;
   public static boolean q;
   public static int r;
   public static int s;
   public static int t = 0;
   public static int u = 1;
   public static int v = 2;
   public static int w;
   public static int x = 285;
   public static int y = 0;
   public static int z = 13;
   public static String A = "";
   public static String B = "";
   private static int G = 0;
   public static final Map<Integer, Boolean> C = new HashMap<>();
   public static final rs.p_q.p_a.p_a.C_a D = new C_i();
   private static final String H = "@yel@?";
   private static final String I = "None";

   @Override
   public void b() {
      E = new C_F_uc("fountain/event 3");
      F = new C_F_uc("fountain/event 4");
      this.a(60612, new C_j(this));
   }

   @Override
   public boolean a(C_Client_mc var1) {
      return C_Client_mc.cH == 60600;
   }

   @Override
   public void b(C_Client_mc var1, rs.p_l.p_e.C_f.a var2) {
      if (var2 == rs.p_l.p_e.C_f.a.b) {
         if (G == 0) {
            G = rs.p_n.C_e.H['\uecb8'].am[5];
         } else {
            rs.p_n.C_e.H['\uecb8'].am[5] = G;
         }

         int var3 = rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 0 : C_Client_mc.ai / 2 - 356;
         int var4 = rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 0 : C_Client_mc.ah / 2 - 230;
         if (!C_Client_mc.ai()) {
            var3 += 4;
            var4 += 4;
         }

         byte var5 = 0;
         if (!C_Client_mc.ai() && var1.v.h() && !var1.f()) {
            var4 += 50;
            var5 = 50;
         }

         if (rs.p_n.C_e.H['\uecc4'].az[0] <= 0) {
            var1.gn.c("@yel@?", 408, 266 + var5, 16750623, 1);
            var1.gm.c("None", 458, 266 + var5, 16750623, 1);
         } else if (rs.p_n.C_e.H['\uecc4'].az[1] <= 0) {
            var1.gn
               .c(
                  "@yel@?",
                  458 + (rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 0 : C_Client_mc.ai / 2 - 356),
                  266 + (rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 0 : C_Client_mc.ah / 2 - 230) + var5,
                  16750623,
                  1
               );
         }

         if (r == t) {
            int var6 = var3 + 20;
            int var7 = var4 + 48;
            short var8 = 457;
            short var9 = 185;
            rs.p_l.C_c.a(var6, var7, var8, var9, 16711680, 50);
            C_Client_mc.gl.c("<img=81> You must roll all the items from the previous tier! <img=81>", var6 + var8 / 2, var7 + var9 / 2 + 85, 16750623, 1);
            var6 = var3 + rs.p_n.C_e.H['\uecb8'].am[2];
            var7 = var4 + rs.p_n.C_e.H['\uecb8'].bc[2];
            byte var20 = 70;
            byte var24 = 41;
            rs.p_l.C_c.a(var6, var7, var20, var24, 16711680, 50);
            if (C_Client_mc.hP >= var6 && C_Client_mc.hP <= var6 + var20 && C_Client_mc.hQ >= var7 && C_Client_mc.hQ <= var7 + var24) {
               var1.b(C_Client_mc.hP - 10, C_Client_mc.hQ - 10, " <img=81> Locked!");
            }
         } else if (r == v) {
            int var13 = var3 + 20;
            int var17 = var4 + 48;
            short var21 = 457;
            short var25 = 185;
            rs.p_l.C_c.a(var13, var17, var21, var25, 65280, 20);
            if (s == 2) {
               rs.p_n.C_e.H['\uecb8'].am[5] = G + 4;
               C_Client_mc.gl.c("@gre@Congratulations! You've completed the entire event!", var13 + var21 / 2, var17 + var25 / 2 + 85, 16750623, 1);
            } else {
               C_Client_mc.gl.c("<img=46> @gre@You've completed this tier of the event! <img=46>", var13 + var21 / 2, var17 + var25 / 2 + 85, 16750623, 1);
            }
         } else {
            int var14 = var3 + rs.p_n.C_e.H['\uecb8'].am[2];
            int var18 = var4 + rs.p_n.C_e.H['\uecb8'].bc[2];
            byte var22 = 70;
            byte var26 = 41;
            if (C_Client_mc.hP >= var14 && C_Client_mc.hP <= var14 + var22 && C_Client_mc.hQ >= var18 && C_Client_mc.hQ <= var18 + var26) {
               var1.b(C_Client_mc.hP - 10, C_Client_mc.hQ - 10, B);
            }
         }

         if (w > y) {
            y += 5;
         }

         if (w < y) {
            y = w;
         }

         int var15 = y == x ? '\uff00' : 16760832;
         int var19 = y == x ? 150 : 200;
         rs.p_l.C_c.a(var3 + 192, var4 + 288, y, z, var15, var19);
         C_Client_mc.gl.c(A, var3 + 335, var4 + 299, 0, -1);
         int var23 = var3 + rs.p_n.C_e.H['\uecb8'].am[17];
         int var27 = var4 + rs.p_n.C_e.H['\uecb8'].bc[17];
         if (r == v) {
            byte var10 = 34;
            byte var11 = 32;
            rs.p_l.C_c.a(var23, var27, var10, var11, 65280, 25);
         } else {
            byte var28 = 125;
            rs.p_l.p_a.C_b.a.a(var23 - 5, var27, var28);
            rs.p_l.p_a.C_b.a.a(var23 - 5, var27 + 2 + 15, var28);
            rs.p_l.p_a.C_b.a.a(var23 + 25, var27, var28);
            rs.p_l.p_a.C_b.a.a(var23 + 25, var27 + 2 + 15, var28);
         }
      }
   }

   @Override
   public void c() {
      C.clear();
      q = false;
   }
}
