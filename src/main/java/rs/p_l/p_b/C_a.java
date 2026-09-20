package rs.p_l.p_b;

import java.awt.Graphics;
import rs.C_Client_mc;
import rs.p_a.C_h;
import rs.p_gui.C_Launcher_mc;
import rs.p_l.C_C_uc;
import rs.p_l.C_E_uc;
import rs.p_l.C_F_uc;
import rs.p_l.C_q;
import rs.p_l.p_e.C_f;
import rs.p_l.p_f.C_e;
import rs.p_n.p_c.C_aC_mc;
import rs.p_runelite.p_events.C_GameStateChanged_mc;

public class C_a {
   public static boolean a = true;
   public static boolean b = false;
   public static int c = 0;
   public static int d = 0;
   private static long e = System.currentTimeMillis();
   private static int f = 0;

   public static void a(C_Client_mc var0) {
      C_e.d().b();
      C_q.a(!b());
      var0.ez = -1;
      if (b()) {
         if (var0.ck != 0) {
            var0.ck = 0;
         }

         if (!b || d != C_Client_mc.ah || c != C_Client_mc.ai) {
            if (rs.p_f.C_a.ai == rs.p_f.C_a.c.a) {
               C_Client_mc.aj = C_Client_mc.ai;
               C_Client_mc.ak = C_Client_mc.ah;
               var0.i();
               var0.j();
            }

            c = C_Client_mc.ai;
            d = C_Client_mc.ah;
            var0.gZ = new C_C_uc(C_Client_mc.ai, C_Client_mc.ah, var0.B());
            var0.gZ.a();
            b = true;
         }

         if (!a()) {
            if (C_Client_mc.ee == 2) {
               if (C_Client_mc.cH != -1) {
                  var0.j(var0.dE, C_Client_mc.cH);
               }

               if (!a()) {
                  C_Client_mc.gg++;
               }

               int var8 = C_E_uc.A;
               C_h.bt = true;
               C_h.bw = 0;
               C_h.bu = C_Client_mc.hP + (C_Client_mc.aj() ? 4 : 0);
               C_h.bv = C_Client_mc.hQ + (C_Client_mc.aj() ? 4 : 0);
               rs.p_l.C_c.d();
               if (rs.p_k.C_e.a()) {
                  var0.b.a();
               }

               var0.gZ.a();
               var0.dF.d();
               var0.ga = true;
               C_f.o = 0;

               for (C_f var3 : C_f.k) {
                  var3.a(var0, C_f.Mode.a);
               }

               int var10 = rs.p_k.C_e.a() ? 0 : 0;
               int var12 = rs.p_k.C_e.a() ? 0 : 0;
               var0.a(0, C_Client_mc.aj() ? var10 : C_Client_mc.ai / 2 - 356, rs.p_n.C_e.H[C_Client_mc.cH], C_Client_mc.aj() ? var12 : C_Client_mc.ah / 2 - 255);
               var0.f(var8);
               C_f.o = 0;

               for (C_f var5 : C_f.k) {
                  var5.a(var0, C_f.Mode.b);
               }

               C_f.o = 0;

               for (C_f var14 : C_f.l) {
                  var14.a(var0, C_f.Mode.b);
               }

               if (C_Client_mc.w.b) {
                  C_Client_mc.w.b();
               }

               if (!C_Client_mc.dj) {
                  var0.H();
                  var0.X();
               } else {
                  var0.b(0, 0);
               }

               var0.dE = 0;
               C_q.d();
               C_e.d().a(rs.p_l.p_f.C_a.A);
            }

            var0.ck++;
            Graphics var9 = rs.p_k.C_e.a() ? var0.B().getGraphics() : var0.hG;
            if (var0.gZ != null && var9 != null) {
               var0.gZ.a(var0.ae(), var0.hG, var0.af());
               if (rs.p_k.C_e.a()) {
                  int var11 = var0.ak();
                  var0.p(0);
                  var0.a.g();
                  var0.p(var11);
               }
            }

            C_e.d().c();
         }
      } else {
         if (b) {
            if (rs.p_f.C_a.ai == rs.p_f.C_a.c.a) {
               C_Client_mc.aj = 512;
               C_Client_mc.ak = 334;
               var0.i();
               var0.j();
            }

            b = false;
         }

         if (var0.ck != 0) {
            var0.ck = 0;
         }

         if (C_Client_mc.ee < 2) {
            var0.a(1, "Loading, please wait..", null);
            var0.gZ.a(0, var0.hG, 0);
            if (rs.p_k.C_e.a()) {
               var0.a.b(false);
            }
         } else {
            if (!var0.cd) {
               if (rs.p_k.C_e.a()) {
                  rs.p_k.C_e.a(true);
                  if (rs.p_k.C_b.i && rs.p_k.C_b.g != 0 && rs.p_k.C_b.h != 0 && !C_Client_mc.ai()) {
                     rs.p_k.C_b.f();
                  }
               }

               var0.cd = true;
               C_GameStateChanged_mc var1 = new C_GameStateChanged_mc();
               var1.setGameState(rs.p_runelite.p_a.C_c.g);
               var0.p.post(var1);
            }

            if (var0.ga) {
               var0.ga = false;
               C_Client_mc.fM = true;
               C_Client_mc.eM = true;
               if (C_Client_mc.ee != 2) {
               }
            }

            if (var0.fu != -1) {
               var0.j(var0.dE, var0.fu);
            }

            if (C_Client_mc.ee == 2) {
               C_E_uc.x = var0.bx;
            }

            var0.Q();
            if (var0.gp == -1) {
               var0.eu.V = C_Client_mc.fA - C_Client_mc.eD - 110;
               if (C_Client_mc.hP >= 496 && C_Client_mc.hP <= 511 && C_Client_mc.hQ > (rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 345 : C_Client_mc.ah - 158)) {
                  var0.a(
                     494,
                     110,
                     C_Client_mc.hP,
                     C_Client_mc.hQ - (rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 345 : C_Client_mc.ah - 158),
                     var0.eu,
                     0,
                     false,
                     C_Client_mc.fA
                  );
               }

               int var6 = C_Client_mc.fA - 110 - var0.eu.V;
               if (var6 < 0) {
                  var6 = 0;
               }

               if (var6 > C_Client_mc.fA - 110) {
                  var6 = C_Client_mc.fA - 110;
               }

               if (C_Client_mc.eD != var6) {
                  C_Client_mc.eD = var6;
                  C_Client_mc.fM = true;
               }
            }

            if (var0.gp != -1 && !rs.p_n.p_c.C_f.c && var0.gp == 35112) {
               rs.p_n.p_c.C_f.c = true;
               rs.p_n.C_e.H['顚'].E = C_aC_mc.c;
            }

            if (var0.gp != -1) {
               boolean var7 = var0.j(var0.dE, var0.gp);
               if (var7) {
                  C_Client_mc.fM = true;
               }
            }

            if (var0.fX == 3) {
               C_Client_mc.fM = true;
            }

            if (var0.eA == 3) {
               C_Client_mc.fM = true;
            }

            if (var0.cD != null) {
               C_Client_mc.fM = true;
            }

            if (C_Client_mc.dj && var0.dH == 2) {
               C_Client_mc.fM = true;
            }

            if (C_q.c()) {
               C_Client_mc.fM = true;
            }

            if (C_Client_mc.fM) {
               var0.g();
               C_Client_mc.fM = false;
            }

            if (C_Client_mc.ee == 2) {
               C_c.a(var0);
            } else {
               var0.Y();
            }

            if (!C_Client_mc.ai()) {
               if (C_b.a == null || C_b.b == null) {
                  C_b.a = new C_F_uc("gameframe/backleft1");
                  C_b.b = new C_F_uc("gameframe/backtop1");
               }

               C_b.a.f(0, 4);
               C_b.b.f(-4, 0);
            }

            if (var0.er != -1) {
               C_Client_mc.eM = true;
            }

            if (C_Client_mc.eM) {
               if (var0.er != -1 && var0.er == C_Client_mc.fL) {
                  var0.er = -1;
                  C_Client_mc.fv.a(120);
                  C_Client_mc.fv.b(C_Client_mc.fL);
               }

               C_Client_mc.eM = false;
            }

            var0.dE = 0;
            C_q.d();
            C_e.d().a(rs.p_l.p_f.C_a.A);
            var0.gZ.a(var0.ae(), var0.hG, var0.af());
            if (rs.p_k.C_e.a()) {
               var0.a.g();
            }

            C_e.d().c();
         }
      }
   }

   public static boolean a() {
      return !C_Launcher_mc.n().o().au() ? false : !C_Launcher_mc.n().o().bb();
   }

   public static boolean b() {
      return !a ? false : C_Client_mc.cH > 0 && rs.p_n.C_e.H[C_Client_mc.cH].bp;
   }
}
