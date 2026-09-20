package rs.p_l.p_b;

import java.awt.Graphics2D;
import rs.C_C_uc;
import rs.C_Client_mc;
import rs.p_a.C_h;
import rs.p_k.C_e;
import rs.p_l.C_E_uc;
import rs.p_l.p_e.C_j;
import rs.p_l.p_e.C_n;

public class C_c {
   public static void a(C_Client_mc var0) {
      C_Client_mc.gf++;
      if (!C_a.a()) {
         C_Client_mc.gg++;
      }

      var0.e(true);
      var0.d(true);
      var0.e(false);
      var0.d(false);
      var0.r();
      var0.R();
      if (!var0.fe) {
         int var1 = var0.fs;
         if (var0.dQ / 256 > var1) {
            var1 = var0.dQ / 256;
         }

         if (var0.dh[4] && var0.fy[4] + 128 > var1) {
            var1 = var0.fy[4] + 128;
         }

         int var2 = var0.ft + var0.dp & 2047;
         int var3 = -50;
         short var4 = 200;
         if (C_Client_mc.al < var4) {
            var3 -= (var4 - C_Client_mc.al) / 5;
         }

         var0.b(C_Client_mc.al + var1 * 3, var1, var0.eb, var0.c(C_Client_mc.dw, C_Client_mc.eR.ad, C_Client_mc.eR.ac) + var3, var2, var0.ec);
      }

      int var10;
      if (!var0.fe) {
         var10 = var0.U();
      } else {
         var10 = var0.V();
      }

      int var11 = C_Client_mc.cJ;
      int var12 = C_Client_mc.cK;
      int var13 = C_Client_mc.cL;
      int var5 = var0.cR;
      int var6 = var0.cS;

      for (int var7 = 0; var7 < 5; var7++) {
         if (var0.dh[var7]) {
            int var8 = (int)(
               Math.random() * (double)(var0.dg[var7] * 2 + 1)
                  - (double)var0.dg[var7]
                  + Math.sin((double)var0.eg[var7] * ((double)var0.dy[var7] / 100.0)) * (double)var0.fy[var7]
            );
            if (var7 == 0) {
               C_Client_mc.cJ += var8;
            }

            if (var7 == 1) {
               C_Client_mc.cK += var8;
            }

            if (var7 == 2) {
               C_Client_mc.cL += var8;
            }

            if (var7 == 3) {
               var0.cS = var0.cS + var8 & 2047;
            }

            if (var7 == 4) {
               var0.cR += var8;
               if (var0.cR < 128) {
                  var0.cR = 128;
               }

               if (var0.cR > 383) {
                  var0.cR = 383;
               }
            }
         }
      }

      int var14 = C_E_uc.A;
      C_h.bt = true;
      C_h.bw = 0;
      C_h.bu = C_Client_mc.hP;
      C_h.bv = C_Client_mc.hQ;
      rs.p_l.C_c.d();
      if (C_e.a()) {
         var0.b.a();
      }

      boolean var15 = rs.p_f.C_a.H;
      if (C_Client_mc.cH > 0 && rs.p_n.C_e.l(C_Client_mc.cH).bw) {
         var15 = false;
      }

      if (var15) {
         C_E_uc.x = var0.bx;
         int var9 = C_Client_mc.aj() ? 4 : 0;
         rs.p_l.C_c.c(var0.as() + var9, var9, var0.at() + var9, var9);
         var0.dF.a(C_Client_mc.cJ, C_Client_mc.cL, var0.cS, C_Client_mc.cK, var10, var0.cR);
         var0.gZ.a();
      }

      var0.dF.d();
      if (rs.p_f.C_a.az && !rs.p_f.C_a.ah && !C_e.a()) {
         for (int var16 = 0; var16 < C_Client_mc.by.length; var16++) {
            if (C_Client_mc.by[var16].b().size() > 0) {
               C_Client_mc.by[var16].a();
            }
         }
      }

      if (C_e.a()) {
         rs.p_k.p_c.C_c.b();
         b(var0);
      }

      rs.p_l.p_f.C_e.d().a(rs.p_l.p_f.C_a.n);
      var0.o();
      var0.t();
      var0.f(var14);
      rs.p_l.p_f.C_e.d().a(rs.p_l.p_f.C_a.o);
      C_b.a(var0);
      var0.Y();
      var0.g();
      var0.Q();
      C_Client_mc.cJ = var11;
      C_Client_mc.cK = var12;
      C_Client_mc.cL = var13;
      var0.cR = var5;
      var0.cS = var6;
      if (C_Client_mc.cM == -1 || !C_a.a()) {
         C_Client_mc.cM = C_Client_mc.cJ;
         C_Client_mc.cN = C_Client_mc.cK;
         C_Client_mc.cO = C_Client_mc.cL;
         C_Client_mc.cP = var0.cS;
         C_Client_mc.cQ = var0.cR;
      }
   }

   public static void b(C_Client_mc var0) {
      if (C_Client_mc.cH == -1) {
         try {
            boolean var1 = false;
            if (C_Client_mc.ab.d.size() > 0 || C_Client_mc.ab.c.size() > 0) {
               var1 = true;
            }

            if (C_Client_mc.aa.c.size() > 0 || C_Client_mc.aa.b.size() > 0) {
               var1 = true;
            }

            if (var1) {
               Graphics2D var2 = rs.p_l.C_c.a(rs.p_l.C_c.g, rs.p_l.C_c.h, rs.p_l.C_c.i);

               for (int var6 : C_Client_mc.ab.c.b()) {
                  C_j var7 = (C_j)C_Client_mc.ab.c.b(var6);
                  if (var7.a != null) {
                     C_C_uc.a(var2, var7.a, var7.a(), var7.b());
                  }
               }

               for (C_n var11 : C_Client_mc.aa.c) {
                  if (var11.a != null) {
                     C_C_uc.a(var2, var11.a, var11.b(), var11.c());
                  }
               }

               for (C_n var12 : C_Client_mc.aa.b.values()) {
                  if (var12.a != null) {
                     C_C_uc.a(var2, var12.a, var12.b(), var12.c());
                  }
               }
            }
         } catch (Exception var8) {
            var8.printStackTrace();
         }
      }
   }
}
