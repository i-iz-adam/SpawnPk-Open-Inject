package rs.p_s.p_o;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Polygon;
import javax.inject.Inject;
import rs.C_Client_mc;
import rs.p_a.C_h;
import rs.p_runelite.p_a.C_f;
import rs.p_runelite.p_a.C_i;
import rs.p_runelite.p_a.C_m;

public class C_c extends rs.p_l.p_f.p_b.C_b {
   public static boolean i = true;
   private final C_d j;
   private final C_e k;

   @Inject
   public C_c(C_d var1, C_e var2) {
      this.j = var1;
      this.k = var2;
      this.a(rs.p_l.p_f.C_a.f);
   }

   @Override
   public void a() {
      if (this.g != null) {
         if (this.e != null && this.e.aG != null) {
            if (!this.e.aG.h) {
               C_a var1 = this.k.a(this.e);
               if (var1 != null) {
                  try {
                     this.a(var1);
                  } catch (Exception var3) {
                  }
               }
            }
         }
      }
   }

   private void a(C_a var1) {
      Color var2 = var1.c();
      float var3 = var1.m();
      Color var4 = var1.d();
      BasicStroke var5 = new BasicStroke(var3);
      if (var1.e()) {
         C_m var6 = this.l();
         if (i && var6.contains((double)C_Client_mc.hP, (double)C_Client_mc.hQ)) {
            C_h.by[C_h.bw] = this.n().au;
            C_h.bx[C_h.bw++] = this.n().at;
            this.b(var6, var2.brighter(), var2.brighter(), var5);
         } else {
            this.b(var6, var2, var4, var5);
         }
      }

      if (var1.f()) {
         Polygon var11 = this.e.a(this.e.aG.r);
         this.a(var11, var2, var4, var5);
      }

      if (var1.g()) {
         C_f var12 = C_f.a(this.e.g());
         if (var12 != null) {
            byte var7 = this.e.aG.r;
            C_f var8 = new C_f(var12.b() + 128 * (var7 - 1) / 2, var12.c() + 128 * (var7 - 1) / 2);
            Polygon var9 = rs.p_runelite.p_a.C_h.c(var8, var7);
            this.a(var9, var2, var4, var5);
         }
      }

      if (var1.h()) {
         byte var13 = this.e.aG.r;
         C_f var16 = new C_f(this.e.ac, this.e.ad);
         int var19 = var16.b() - (var13 - 1) * 128 / 2;
         int var20 = var16.c() - (var13 - 1) * 128 / 2;
         Polygon var10 = rs.p_runelite.p_a.C_h.a(new C_f(var19, var20));
         this.a(var10, var2, var4, var5);
      }

      if (var1.i()) {
         C_f var14 = C_f.a(this.e.g());
         if (var14 != null) {
            Polygon var17 = rs.p_runelite.p_a.C_h.a(var14);
            this.a(var17, var2, var4, var5);
         }
      }

      if (var1.j()) {
         rs.p_ui.p_b.C_b.a().a(this.e, (int)var3, var2, var1.n());
      }

      if (var1.k()) {
         C_f var15 = new C_f(this.e.ac, this.e.ad);
         C_i var18 = rs.p_runelite.p_a.C_h.a(rs.p_l.p_f.C_e.d().b(this.i()), var15, this.e.o(), this.e.r);
         if (var18 != null) {
            C_Client_mc.gl.c(this.e.o(), var18.a(), var18.b(), var2.getRGB(), 0);
         }
      }
   }

   private void a(C_f var1, Color var2, double var3, Color var5) {
      if (var1 != null) {
         Polygon var6 = rs.p_runelite.p_a.C_h.a(var1);
         if (var6 != null) {
            this.a(var6, var2, var5, new BasicStroke((float)var3));
         }
      }
   }
}
