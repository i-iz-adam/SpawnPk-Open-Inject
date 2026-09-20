package rs.p_s.p_c;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.GeneralPath;
import javax.inject.Inject;
import rs.C_Client_mc;
import rs.C_V_uc;
import rs.p_runelite.p_a.C_i;
import rs.p_runelite.p_a.C_p;

public class C_f extends rs.p_l.p_f.C_b {
   private static final Color e = Color.GREEN;
   private static final Color f = Color.BLUE;
   private static final Color g = new Color(141, 220, 26);
   private static final Color h = new Color(73, 122, 18);
   private static final Color i = new Color(204, 42, 219);
   private static final Color j = Color.CYAN;
   private static final int k = 128;
   private static final int l = 8;
   private static final int m = 64;
   private static final int n = 16;
   private static final int o = 4;
   private static final int p = 20;
   private static final int q = -16;
   private final C_a r;
   private rs.p_runelite.p_a.C_f s;
   private rs.p_runelite.p_a.C_f t;

   @Inject
   public C_f(C_a var1) {
      this.r = var1;
      this.a(rs.p_l.p_f.C_a.p);
   }

   @Override
   public void a() {
      if (this.r.c()) {
         this.a(rs.p_l.p_f.C_e.d().b(this.i()));
         if (C_V_uc.t != -1 && C_V_uc.u != -1) {
            rs.p_runelite.p_a.C_f var1 = rs.p_runelite.p_a.C_f.a(C_V_uc.t, C_V_uc.u);
            C_i var2 = rs.p_runelite.p_a.C_h.a(var1, C_Client_mc.dw);
            this.a(var2, C_V_uc.t + C_Client_mc.eh + "," + (C_V_uc.u + C_Client_mc.ei), Color.WHITE);
         }
      }

      if (this.r.k()) {
         if (C_Client_mc.ch) {
            if (this.s == null) {
               if (C_V_uc.t == -1 || C_V_uc.u == -1) {
                  return;
               }

               this.s = rs.p_runelite.p_a.C_f.a(C_V_uc.t, C_V_uc.u);
            }

            if (C_V_uc.t != -1 && C_V_uc.u != -1) {
               this.t = rs.p_runelite.p_a.C_f.a(C_V_uc.t, C_V_uc.u);
            }

            this.a(this.s, Color.RED, 1.0, new Color(255, 0, 0, 50));
            if (this.t != null && this.t.b() != this.s.b() && this.t.c() != this.s.c()) {
               C_p var7 = C_p.a(this.s);
               C_p var9 = C_p.a(this.t);

               for (int var3 = Math.min(var7.e(), var9.e()); var3 <= Math.max(var7.e(), var9.e()); var3++) {
                  for (int var4 = Math.min(var7.f(), var9.f()); var4 <= Math.max(var7.f(), var9.f()); var4++) {
                     this.a(rs.p_runelite.p_a.C_f.a(new C_p(var3, var4, C_Client_mc.dw)), Color.ORANGE, 1.0, new Color(255, 0, 0, 50));
                  }
               }
            }
         } else {
            if (this.s != null && this.t != null) {
               C_p var8 = C_p.a(this.s);
               C_p var10 = C_p.a(this.t);
               int var11 = Math.min(var8.e(), var10.e());
               int var12 = Math.min(var8.f(), var10.f());
               int var5 = Math.max(var8.e(), var10.e());
               int var6 = Math.max(var8.f(), var10.f());
               System.out.println("Range(" + var11 + ", " + var5 + ", " + var12 + ", " + var6 + ")");
            }

            this.k();
         }
      }
   }

   private void k() {
      this.s = null;
      this.t = null;
   }

   private void a(Graphics2D var1) {
      C_p var2 = this.a.aJ().g();
      int var3 = (var2.e() - 16 + 64 - 1) / 64 * 64;
      int var4 = (var2.f() - 16 + 64 - 1) / 64 * 64;
      int var5 = (var2.e() + 16) / 64 * 64;
      int var6 = (var2.f() + 16) / 64 * 64;
      var1.setStroke(new BasicStroke(4.0F));
      var1.setColor(e);
      GeneralPath var7 = new GeneralPath();

      for (int var8 = var3; var8 <= var5; var8 += 64) {
         rs.p_runelite.p_a.C_f var9 = rs.p_runelite.p_a.C_f.b(var8, var2.f() - 16);
         rs.p_runelite.p_a.C_f var10 = rs.p_runelite.p_a.C_f.b(var8, var2.f() + 16);
         boolean var11 = true;

         for (int var12 = var9.c(); var12 <= var10.c(); var12 += 128) {
            C_i var13 = rs.p_runelite.p_a.C_h.a(new rs.p_runelite.p_a.C_f(var9.b() - 64, var12 - 64), C_Client_mc.dw);
            if (var13 != null) {
               if (var12 % 15 == 0) {
                  C_p var14 = C_p.a(new rs.p_runelite.p_a.C_f(var8, var12));
                  C_i var15 = rs.p_runelite.p_a.C_h.a(new rs.p_runelite.p_a.C_f(var9.b() - 64 + 500, var12 - 64), C_Client_mc.dw);
                  this.a(var15, (var8 >> 6) * 256 + (var14.f() >> 6) + "", e);
                  var15 = rs.p_runelite.p_a.C_h.a(new rs.p_runelite.p_a.C_f(var9.b() - 64 - 500, var12 - 64), C_Client_mc.dw);
                  this.a(var15, (var8 - 1 >> 6) * 256 + (var14.f() >> 6) + "", e);
               }

               if (var11) {
                  var7.moveTo((float)var13.a(), (float)var13.b());
                  var11 = false;
               } else {
                  var7.lineTo((float)var13.a(), (float)var13.b());
               }
            }
         }
      }

      for (int var16 = var4; var16 <= var6; var16 += 64) {
         rs.p_runelite.p_a.C_f var17 = rs.p_runelite.p_a.C_f.b(var2.e() - 16, var16);
         rs.p_runelite.p_a.C_f var18 = rs.p_runelite.p_a.C_f.b(var2.e() + 16, var16);
         boolean var19 = true;

         for (int var20 = var17.b(); var20 <= var18.b(); var20 += 128) {
            C_i var21 = rs.p_runelite.p_a.C_h.a(new rs.p_runelite.p_a.C_f(var20 - 64, var17.c() - 64), C_Client_mc.dw);
            if (var21 != null) {
               if (var20 % 15 == 0) {
                  C_p var22 = C_p.a(new rs.p_runelite.p_a.C_f(var20, var16));
                  C_i var24 = rs.p_runelite.p_a.C_h.a(new rs.p_runelite.p_a.C_f(var20 - 64, var17.c() - 64 + 500), C_Client_mc.dw);
                  this.a(var24, (var22.e() >> 6) * 256 + (var16 >> 6) + "", e);
                  var24 = rs.p_runelite.p_a.C_h.a(new rs.p_runelite.p_a.C_f(var20 - 64, var17.c() - 64 - 500), C_Client_mc.dw);
                  this.a(var24, (var22.e() >> 6) * 256 + (var16 - 1 >> 6) + "", e);
               }

               if (var19) {
                  var7.moveTo((float)var21.a(), (float)var21.b());
                  var19 = false;
               } else {
                  var7.lineTo((float)var21.a(), (float)var21.b());
               }
            }
         }
      }

      var1.draw(var7);
   }

   private void a(rs.p_runelite.p_a.C_f var1, Color var2, double var3, Color var5) {
      if (var1 != null) {
         Polygon var6 = rs.p_runelite.p_a.C_h.a(var1);
         if (var6 != null) {
            this.a(var6, var2, var5, new BasicStroke((float)var3));
         }
      }
   }
}
