package rs.p_l.p_f.p_a.p_b;

import java.awt.Dimension;
import java.awt.Graphics2D;
import rs.C_Client_mc;
import rs.p_l.C_F_uc;
import rs.p_l.p_f.C_g;
import rs.p_l.p_f.C_l;

public class C_a extends C_g {
   private static final Dimension r = new Dimension(40, 40);
   private static final int s = 4;
   private static final int t = 200;
   private static final int u = 100;
   private boolean v = true;
   private final String w;
   private final String x;
   private final String y;
   private final int z;
   private final int A;
   private C_F_uc B;
   private C_F_uc C;
   private boolean D = true;
   private int E = 200;
   private C_c F;
   private C_b G;

   public C_a(String var1, String var2, String var3, int var4, int var5) {
      this.y = var1;
      this.w = var2;
      this.x = var3;
      this.z = var4;
      this.A = var5;
      this.a(rs.p_l.p_f.C_a.q);
      this.a(C_l.e);
      this.a(r);
      this.c(false);
      this.h(false);
   }

   @Override
   public Dimension a(Graphics2D var1) {
      if (C_Client_mc.ed == 197) {
         return null;
      } else {
         if (this.B == null || this.C == null) {
            this.B = new C_F_uc(this.w);
            this.C = new C_F_uc(this.x);
         }

         int var2 = this.f.x;
         int var3 = this.f.y;
         boolean var4 = this.f.contains(C_Client_mc.hP, C_Client_mc.hQ) && this.l();
         if (!rs.p_l.p_b.C_a.a()) {
            if (this.D) {
               this.E -= 4;
               if (this.E <= 100) {
                  this.D = false;
               }
            } else {
               this.E += 4;
               if (this.E >= 200) {
                  this.D = true;
               }
            }
         }

         rs.p_l.C_c.b(r.height, var3, var2, this.z, r.width, this.E - 25);
         rs.p_l.C_c.b(r.height - 6, var3 + 3, var2 + 3, this.A, r.width - 6, this.E - 100);
         (var4 ? this.C : this.B).g(var2 + 2, var3 + 1, this.E + 50);
         if (this.v) {
            for (int var5 = 0; var5 < 2; var5++) {
               int var6 = this.E - 50;
               rs.p_l.p_a.C_b.a.a(var2 - 4, var3 - 1 + var5 * 30, var6);
               rs.p_l.p_a.C_b.a.a(var2 + 31, var3 - 1 + var5 * 30, var6);
            }
         }

         if (var4) {
            this.a.b(C_Client_mc.hP - r.width - 20, C_Client_mc.hQ + r.height - 30, " " + this.y);
         }

         if (this.F != null) {
            this.F.draw(var2, var3, this.E, var4);
         }

         return r;
      }
   }

   @Override
   public boolean n() {
      if (this.G != null) {
         rs.p_h.C_c.a(() -> this.G.execute());
      }

      return true;
   }

   public C_a a(C_c var1) {
      this.F = var1;
      return this;
   }

   public C_a a(C_b var1) {
      this.G = var1;
      return this;
   }

   public boolean L() {
      return this.v;
   }

   public void k(boolean var1) {
      this.v = var1;
   }
}
