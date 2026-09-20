package rs.p_l.p_f.p_a.p_c;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import rs.C_Client_mc;
import rs.p_l.p_f.C_g;
import rs.p_l.p_f.C_l;

public class C_a extends C_g {
   private static final Dimension y = new Dimension(220, 40);
   private static final Dimension z = new Dimension(220, 22);
   private static final Dimension A = new Dimension();
   private static final int B = 13960709;
   private static final int C = 30976;
   private final rs.p_s.p_a.C_a D;
   int r = 0;
   int s = 13960709;
   int t = 30976;
   String u;
   String v;
   String w;
   String x;
   private boolean E;
   private boolean F;

   public C_a(rs.p_s.p_a.C_a var1) {
      this.a("BossBarOverlay");
      this.a(rs.p_l.p_f.C_a.A);
      this.a(C_l.d);
      this.a(10.0F);
      this.e.a(new Rectangle(2, 2, 2, 2));
      this.e.b(new Point(0, 2));
      this.D = var1;
   }

   public void L() {
      this.s = 13960709;
      this.t = 30976;
      this.r = 0;
      this.u = this.v = "100%";
      this.x = "";
      this.w = "";
   }

   @Override
   public Dimension a(Graphics2D var1) {
      if (C_Client_mc.cH != -1) {
         return A;
      } else if (!this.E) {
         return A;
      } else {
         int var2 = 220;
         byte var3 = 40;
         int var4 = this.f.x;
         int var5 = this.f.y;
         double var6 = (double)((float)this.r) / 100.0;
         if (this.D.e() == rs.p_s.p_a.C_c.b) {
            var3 -= 18;
            this.a(z);
            this.j = z;
         } else {
            this.a(y);
            this.j = y;
         }

         rs.p_l.C_c.b(var3, var5, var4, 5129018, var2, 255);
         rs.p_l.C_c.d(var4, var2, var3, 5918522, var5);
         rs.p_l.C_c.d(var4 - 1, var2 + 2, var3 + 2, 2367511, var5 - 1);
         if (this.D.e() == rs.p_s.p_a.C_c.a) {
            C_Client_mc.gl.c(this.w, var4 + (var2 + 4) / 2, var5 + 14, 16750623, 0);
            C_Client_mc.gl.a(this.x, var4 + var2 - 3, var5 + 14, 3135999, 0);
         }

         if (this.D.e() == rs.p_s.p_a.C_c.b) {
            var5 -= 17;
         }

         var5 += 18;
         var4 += 2;
         var2 -= 6;
         var3 = 20;
         int var8 = (int)Math.ceil((double)var2 * var6);
         rs.p_l.C_c.b(var3, var5, var4, 0, var2 + 2, 255);
         rs.p_l.C_c.b(var3 - 2, var5 + 1, var4 + 1, this.t, var2, 255);
         rs.p_l.C_c.b(var3 - 2, var5 + 1, var4 + 1, this.s, var8, 255);
         String var9 = this.D.e() == rs.p_s.p_a.C_c.b ? this.v : this.u;
         C_Client_mc.gl.c(var9, var4 + (var2 + 6) / 2, var5 + 15, 16777215, 0);
         if (this.D.e() == rs.p_s.p_a.C_c.b) {
            C_Client_mc.gl.a(this.x, var4 + var2 - 3, var5 + 15, 3135999, 0);
         }

         return this.j;
      }
   }

   @Override
   public void c() {
      this.E = false;
      this.F = true;
   }

   public void k(boolean var1) {
      this.E = var1;
   }

   public boolean M() {
      return this.F;
   }
}
