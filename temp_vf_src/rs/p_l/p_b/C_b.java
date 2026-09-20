package rs.p_l.p_b;

import rs.C_Client_mc;
import rs.p_gui.C_Launcher_mc;
import rs.p_l.C_F_uc;
import rs.p_l.C_J_uc;
import rs.p_l.p_e.C_f;
import rs.p_l.p_e.C_q;
import rs.p_n.C_e;
import rs.p_n.p_c.C_G_uc;
import rs.p_n.p_c.C_s;

public class C_b {
   public static C_F_uc a;
   public static C_F_uc b;

   public static void a(C_Client_mc var0) {
      var0.D();
      if (var0.dv == 1) {
         byte var1 = 0;
         var0.fa[var0.du / 100].f(var0.ds - 8 - var1, var0.dt - 8 - var1);
         C_Client_mc.eX++;
         if (C_Client_mc.eX > 67) {
            C_Client_mc.eX = 0;
         }
      }

      if (var0.dv == 2) {
         byte var10 = 0;
         var0.fa[4 + var0.du / 100].f(var0.ds - 8 - var10, var0.dt - 8 - var10);
      }

      if (C_Client_mc.ed != -1) {
         var0.j(var0.dE, C_Client_mc.ed);
         if (C_Client_mc.ed == 197 && rs.p_f.C_a.ai != rs.p_f.C_a.c.a) {
            byte var12 = 40;
            byte var34 = 7;
            String var3 = C_e.H[199].at.replace("@yel@", "");
            int var4 = var0.gi.a(var3);
            var0.eK[0].f(C_Client_mc.ai - 200 + var12 + 15, 168 + var34 + 10);
            var0.gm.c(var3, C_Client_mc.ai - 174 + (var3.length() == 8 ? 2 : 0) + var12, 207 + var34 + 10, 16776960, 0);
         } else if (C_Client_mc.ed == 201 && rs.p_f.C_a.ai != rs.p_f.C_a.c.a) {
            var0.a(0, C_Client_mc.ai - 560, C_e.H[C_Client_mc.ed], -109);
         } else {
            byte var11 = 4;
            byte var2 = 4;
            if (!C_Client_mc.ai() && rs.p_f.C_a.aD) {
               var2 -= 25;
            }

            if (var0.v.h() && !var0.f()) {
               var2 += 125;
            }

            var0.a(
               0,
               rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? var11 : C_Client_mc.ai / 2 - 356,
               C_e.H[C_Client_mc.ed],
               rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? var2 : C_Client_mc.ah / 2 - 230
            );
         }
      }

      if (var0.es >= 1 && var0.es <= 3) {
         byte var13 = 0;
         short var35 = 0;
         if (C_Client_mc.ai()) {
            var13 = -65;
            var35 = 30;
         } else {
            var13 = 4;
            var35 = 4;
            if (var0.v.h() && !var0.f()) {
               var35 += 131;
            }
         }

         if (!C_Client_mc.ai() && rs.p_f.C_a.aD) {
            var35 -= 25;
         }

         C_F_uc var48 = var0.es == 1 ? var0.bs : C_J_uc.a;
         if (var0.es == 3) {
            var48 = C_J_uc.b;
         }

         var48.f(rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 472 + var13 : C_Client_mc.ai - 80 + var13, rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 296 + var35 : 200 + var35);
      }

      if (C_Client_mc.cH != -1) {
         C_q.a(var0.u);
      }

      C_f.o = 0;

      for (int var15 = 0; var15 < C_f.k.size(); var15++) {
         C_f.k.get(var15).a(var0, C_f.a.a);
      }

      rs.p_l.p_f.C_e.d().a(rs.p_l.p_f.C_a.p);
      rs.p_l.p_f.C_e.d().a(rs.p_l.p_f.C_a.q);
      if (C_Client_mc.cH != -1) {
         C_e var16 = C_e.H[C_Client_mc.cH];
         var0.j(var0.dE, C_Client_mc.cH);
         if (C_Client_mc.cH == 15944 && rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
            rs.p_l.C_c.b(C_Client_mc.ah, 0, 0, 110, C_Client_mc.ai, 130);
            rs.p_l.C_c.d(0, C_Client_mc.ai, C_Client_mc.ah, 0, 0);
         }

         int var37 = 4;
         int var49 = 4;
         if (C_Client_mc.ai()) {
            var37 = C_Client_mc.ai / 2 - 356;
            var49 = C_Client_mc.ah / 2 - 230;
         } else if (var0.v.h() && !var0.f()) {
            var49 += 50;
         }

         if (var16.C != Integer.MAX_VALUE) {
            var37 = C_e.H[C_Client_mc.cH].C;
         }

         if (var16.D != Integer.MAX_VALUE) {
            var49 = C_e.H[C_Client_mc.cH].D;
         }

         C_Client_mc.cq = var37;
         C_Client_mc.cr = var49;
         if (C_Client_mc.aj()) {
            C_Client_mc.cq -= 4;
            C_Client_mc.cr -= 4;
         }

         var0.a(0, var37, C_e.H[C_Client_mc.cH], var49);
      }

      if (var0.ae && (C_Client_mc.cH == -1 || C_Client_mc.cH == 18551)) {
         short var17 = 15;
         if (C_Client_mc.aj() && var0.v.h() && !var0.f()) {
            var17 += 138;
         }

         byte var38 = 14;
         int var50 = C_Client_mc.aj() ? 295 + var17 : C_Client_mc.ah - 205 + var17;
         var0.a(0, var38, C_e.H['훠'], var50);
         String var59 = "Tracking: @yel@" + var0.af;
         if (C_e.H['훣'].at.contains("100%")) {
            var59 = var59 + " @gre@(COMPLETE)";
         }

         C_Client_mc.gl.c(var59, var38 + 246, var50 + 3, 16777215, 0);
         if (C_Client_mc.hP >= var38 + 96 && C_Client_mc.hP <= var38 + 386 && C_Client_mc.hQ >= var50 && C_Client_mc.hQ <= var50 + 20) {
         }
      }

      var0.y();
      C_f.o = 0;

      for (int var18 = 0; var18 < C_f.k.size(); var18++) {
         C_f.k.get(var18).a(var0, C_f.a.b);
      }

      rs.p_l.p_f.C_e.d().a(rs.p_l.p_f.C_a.v);
      rs.p_l.p_f.C_e.d().a(rs.p_l.p_f.C_a.y);
      if (!C_Client_mc.dj) {
         var0.H();
         var0.X();
      } else if (var0.dH == 0) {
      }

      C_f.o = 0;

      for (int var19 = 0; var19 < C_f.l.size(); var19++) {
         C_f.l.get(var19).a(var0, C_f.a.b);
      }

      rs.p_l.p_f.C_e.d().a(rs.p_l.p_f.C_a.w);
      if (C_Client_mc.ba) {
         var0.gi.b(16776960, "Debug Item: " + C_Client_mc.bb, 201, 5);
         var0.gi.b(16776960, "Debug RotX: " + C_Client_mc.bc, 215, 5);
         var0.gi.b(16776960, "Debug RotY: " + C_Client_mc.bd, 229, 5);
         var0.gi.b(16776960, "Debug Zoom: " + C_Client_mc.be, 243, 5);
         var0.gi.b(16776960, "Debug Offset1: " + C_Client_mc.bf, 257, 5);
         var0.gi.b(16776960, "Debug Offset2: " + C_Client_mc.bg, 271, 5);
      } else if (C_Client_mc.aW != -1) {
         var0.gi.b(16776960, "Debug Interface: " + C_Client_mc.aW, 201, 5);
         var0.gi.b(16776960, "Debug Interface Position X: " + C_Client_mc.aX, 215, 5);
         var0.gi.b(16776960, "Debug Interface Position tY: " + C_Client_mc.aY, 229, 5);
      }

      if (rs.p_f.C_a.am) {
         short var20 = 507;
         int var39 = C_Client_mc.eh + (C_Client_mc.eR.ac - 6 >> 7);
         int var51 = C_Client_mc.ei + (C_Client_mc.eR.ad - 6 >> 7);
         int var60 = 20;
         var0.gi.a("RUNTIME INFORMATION", var20, 16729156, var60);
         var60 += 15;
         var0.gi.a("Fps: " + C_Client_mc.gR, var20, 16776960, var60);
         var60 += 15;
         Runtime var5 = Runtime.getRuntime();
         int var6 = (int)((var5.totalMemory() - var5.freeMemory()) / 1024L);
         var0.gi.a("Mem: " + var6 + "k", var20, 16776960, var60);
         var60 += 30;
         var0.gi.a("COORDINATE INFORMATION", var20, 16729156, var60);
         var60 += 15;
         var0.gi.a("Mouse X: " + C_Client_mc.hP + " , Mouse Y: " + C_Client_mc.hQ, var20, 16776960, var60);
         var60 += 15;
         var0.gi.a("FW: " + C_Client_mc.ai + " , FH: " + C_Client_mc.ah, var20, 16776960, var60);
         var60 += 15;
         var0.gi.a("Coords: " + var39 + ", " + var51, var20, 16776960, var60);
         var60 += 15;
         int var7 = var39 >> 6;
         int var8 = var51 >> 6;
         int var9 = var7 * 256 + var8;
         var0.gi.a("Region ID: " + var9, var20, 16776960, var60);
      } else if (rs.p_f.C_a.bm) {
         int var21 = rs.p_f.C_a.ai == rs.p_f.C_a.c.b ? C_Client_mc.ai - 700 : 0;
         var0.gm.b("FPS: " + C_Client_mc.gR, 460 + var21, 20, 16776960, 0);
         if (rs.p_f.C_a.bn) {
            String var40 = "Ping: " + C_Client_mc.bh + "ms";
            var0.gm.b(var40, 460 + var21 + 41 - var0.gm.c(var40), 38, 16776960, 0);
         }
      } else if (rs.p_f.C_a.bn) {
         int var22 = rs.p_f.C_a.ai == rs.p_f.C_a.c.b ? C_Client_mc.ai - 700 : 0;
         String var41 = "Ping: " + C_Client_mc.bh + "ms";
         var0.gm.b(var41, 460 + var22 + 41 - var0.gm.c(var41), 20, 16776960, 0);
      }

      if (var0.eN != 0L) {
         long var23 = var0.c() / 1000L;
         long var52 = var23 / 60L;
         int var71 = C_Client_mc.aj() ? 4 : 0;
         int var75 = rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 4 : C_Client_mc.ah - 499;
         if (var0.v.h() && !var0.f()) {
            var75 += 136;
         }

         var23 %= 60L;
         String var77 = var23 < 10L ? var52 + ":0" + var23 : var52 + ":" + var23;
         if (!var77.equalsIgnoreCase("0:00")) {
            var77 = " in: @gre@" + var77;
         } else {
            var77 = "Soon";
            if (C_Client_mc.ff % 200 < 50) {
               var77 = var77 + ".";
            } else if (C_Client_mc.ff % 200 >= 50 && C_Client_mc.ff % 200 < 100) {
               var77 = var77 + "..";
            } else if (C_Client_mc.ff % 200 >= 100 && C_Client_mc.ff % 200 < 150) {
               var77 = var77 + "...";
            }

            var77 = ": @gre@" + var77;
            if (C_Client_mc.eR != null && C_Client_mc.eR.aZ != null && C_Client_mc.eR.aZ.equalsIgnoreCase("Ryan") && var0.eO == 2 && !var0.eP) {
               C_Launcher_mc.n().a("SpawnPK", "System update warning timer is complete!", true);
               var0.eP = true;
            }
         }

         if (var0.eO == 1) {
            var0.gm.b("@or2@[Warning] <img=37> @yel@System update" + var77, 4 + var71, 329 + var75, 0, 0);
         } else {
            var0.gm.b("@or2@[Warning] <img=37> @yel@System update @or1@(5 min timer)@yel@ starts" + var77, 4 + var71, 329 + var75, 0, 0);
         }

         C_Client_mc.cF++;
         if (C_Client_mc.cF > 75) {
            C_Client_mc.cF = 0;
            C_Client_mc.fv.a(148);
         }
      }

      if (var0.k != null) {
         short var25 = 144;
         byte var42 = 22;
         byte var53 = 26;
         short var68 = 200;
         rs.p_l.C_c.b(var53, var42, var25, 0, var68, 125);
         var0.gm.c(var0.k, var25 + 97, var42 + 17, 16777215, 0);
      }

      if (var0.aC) {
         short var26 = 140;
         byte var43 = 35;
         byte var54 = 4;
         byte var69 = 60;
         if (!rs.p_f.C_a.aB || var0.z.r == null || var0.z.s <= 0 || System.currentTimeMillis() - var0.z.w >= 20000L) {
            var69 = 23;
         }

         rs.p_l.C_c.b(var43, var69, var54, 0, var26, 125);
         C_Client_mc.gl.b("@or2@Your points: @whi@" + var0.aM, var54 + 5, var69 + 14, 16776960, 0);
         C_Client_mc.gl.b("@or2@Total: @whi@" + var0.aN, var54 + 5, var69 + 14 + 15, 16776960, 0);
      }

      if (C_Client_mc.cH == 6575 && var0.cG > 0) {
         String var27 = "<img=40> @whi@WHIP + DDS ONLY <img=40>";
         short var44 = 130;
         short var55 = 195;
         if (var0.cG == 2) {
            var27 = "<img=40> @whi@WHIP ONLY <img=40>";
            var55 += 19;
         }

         var0.gn.a(var27, var55, var44);
         var0.gn.a(var27, var55, var44 + 25);
         var0.gn.a(var27, var55, var44 + 50);
         var0.gn.a(var27, var55, var44 + 75);
      }

      if (var0.aF && C_e.H[199].at.contains("LMS") && C_Client_mc.ed == 197) {
         var0.aA.c(0, 0);
         if (C_Client_mc.aj > 800) {
            var0.aA.c(800, 0);
         }

         if (C_Client_mc.aj > 1600) {
            var0.aA.c(1600, 0);
         }
      }

      if (C_e.H[199].at.contains("LMS") && C_Client_mc.ed == 197 && C_Client_mc.eR.ay == 6095 && C_Client_mc.eR.aT != null) {
         var0.fu = 3209;
      } else if (var0.fu == 3209) {
         var0.fu = -1;
         C_Client_mc.fb = true;
         C_Client_mc.eM = true;
      }

      if (var0.aE) {
         byte var28 = 12;
         byte var45 = 12;
         rs.p_l.C_c.b(55, var28, var45, 12884294, 180, 50);
         rs.p_l.C_c.b(49, var28 + 3, var45 + 3, 4863488, 174, 100);
         C_Client_mc.gl.b(var0.aG, var28 + 8, var45 + 18, 16777215, 0);
         C_Client_mc.gl.b(var0.aH, var28 + 8, var45 + 18 + 14, 16777215, 0);
         C_Client_mc.gl.b(var0.aI, var28 + 8, var45 + 18 + 14 + 14, 16777215, 0);
      }

      if (C_e.H[199].at.contains("LMS") && C_Client_mc.ed == 197) {
         short var29 = 397;
         byte var46 = 2;
         rs.p_l.C_c.b(56, var46, var29, 12884294, 113, 50);
         rs.p_l.C_c.b(50, var46 + 3, var29 + 3, 4863488, 107, 100);
         C_Client_mc.gl.b(var0.aG, var29 + 8, var46 + 18, 16777215, 0);
         C_Client_mc.gl.b(var0.aH, var29 + 8, var46 + 18 + 14, 16777215, 0);
         C_Client_mc.gl.b(var0.aI, var29 + 8, var46 + 18 + 14 + 14, 16777215, 0);
      }

      if (var0.aC && var0.aL > 0.0) {
         short var30 = 500;
         byte var47 = 18;
         short var56 = 4;
         byte var70 = 3;
         if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
            var56 = 150;
            var70 = 23;
         }

         int var72 = var0.aK ? 4095 : 13960709;
         int var76 = var0.aK ? '쓿' : 30976;
         double var80 = var0.aL / 100.0;
         int var81 = (int)Math.ceil((double)var30 * var80);
         rs.p_l.C_c.b(var47, var70, var56, 0, var30 + 4, 125);
         rs.p_l.C_c.b(14, var70 + 2, var56 + 2, var72, var30, 255);
         rs.p_l.C_c.b(14, var70 + 2, var56 + 2, var76, var81, 255);
         C_Client_mc.gl.c(var0.aL + "%", var56 + (var30 + 4) / 2, var70 + 14, 16777215, 0);
      } else {
         var0.aL = 0.0;
      }

      if (C_Client_mc.ed == 197 && C_e.H[199].at.contains("Tourney")) {
         if (var0.R == -1L) {
            String var31 = "Waiting for more players";
            if (C_Client_mc.ff % 200 < 50) {
               var31 = var31 + ".";
            } else if (C_Client_mc.ff % 200 >= 50 && C_Client_mc.ff % 200 < 100) {
               var31 = var31 + "..";
            } else if (C_Client_mc.ff % 200 >= 100 && C_Client_mc.ff % 200 < 150) {
               var31 = var31 + "...";
            }

            C_s.d.c(195, 5);
            C_Client_mc.gl.c(var31, 268, 24, 16750623, 1);
         } else {
            C_s.d.c(195, 5);
            long var32 = (var0.R - System.currentTimeMillis()) / 1000L;
            long var57 = var32 - var32 / 60L * 60L;
            long var73 = var32 / 60L;
            if (var0.Q == 1) {
               C_Client_mc.gl.c("Round starts in:", 270, 18, 16750623, 1);
            } else if (var0.Q == 2) {
               C_Client_mc.gl.c("Round ends in:", 270, 18, 16750623, 1);
            } else {
               C_Client_mc.gl.c("Tournament starts in:", 270, 18, 16750623, 1);
            }

            var0.gm.c("@yel@" + var73 + ":" + (var57 < 10L ? "0" : "") + var57, 270, 31, 16750623, 1);
         }
      }

      if (var0.K) {
         if (var0.O - System.currentTimeMillis() > 0L) {
            C_s.c.c(230, 5);
            var0.go.c("Begin in..", 270, 25, 16777215, 1);
            long var33 = (var0.O - System.currentTimeMillis()) / 1000L;
            long var58 = var33 - var33 / 60L * 60L;
            long var74 = var33 / 60L;
            var0.go.c(var74 + ":" + (var58 < 10L ? "0" : "") + var58, 270, 45, 16750623, 1);
         }

         C_s.d.c(360, 5);
         C_Client_mc.gl.c(var0.L == 0 ? "Fighters:" : "Kills:", 386, 29, 16750623, 1);
         C_Client_mc.gl.c("Your clan", 417, 18, 16711680, 1);
         C_Client_mc.gl.c(var0.M + "", 417, 29, 16711680, 1);
         C_Client_mc.gl.c("Opponents", 472, 18, 4550143, 1);
         C_Client_mc.gl.c(var0.N + "", 472, 29, 4550143, 1);
      }

      C_G_uc.h();
      var0.m.a();
      var0.o.a();
      var0.n.a();
      C_q.a(var0.u);
      var0.y.a();
      if (C_Client_mc.w.b) {
         C_Client_mc.w.b();
      }

      if (!rs.p_k.C_e.a()) {
         C_c.b(var0);
      }
   }
}
