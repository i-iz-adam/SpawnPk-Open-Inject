package rs.p_l.p_f.p_a.p_c;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import rs.C_Client_mc;
import rs.p_a.C_j;
import rs.p_a.C_k;
import rs.p_l.p_e.C_f;
import rs.p_l.p_f.C_g;
import rs.p_l.p_f.C_l;

public class C_d extends C_g {
   private static final int x = 1;
   private static final Dimension y = new Dimension();
   private static final Dimension z = new Dimension(142, 33);
   private static final Dimension A = new Dimension(142, 21);
   public String r;
   public int s;
   public int t;
   public int u;
   public int v;
   public long w;

   public C_d() {
      this.a("CombatOverlay");
      this.a(rs.p_l.p_f.C_a.p);
      this.c(rs.p_l.p_f.C_a.A);
      this.a(C_l.c);
      this.a(10.0F);
      this.e.a(new Rectangle(2, 2, 2, 2));
      this.e.b(new Point(0, 2));
   }

   @Override
   public Dimension a(Graphics2D var1) {
      if (this.r == null || this.s <= 0) {
         return y;
      } else if (rs.p_l.p_e.p_a.C_c.f()) {
         return y;
      } else if (System.currentTimeMillis() - this.w >= 20000L) {
         return y;
      } else if (!rs.p_f.C_a.aB) {
         return y;
      } else if (C_f.e.E) {
         return y;
      } else {
         short var2 = 140;
         int var3 = 32;
         int var4 = this.f.x + 1;
         int var5 = this.f.y;
         int var6 = 0;
         if (rs.p_f.C_a.ar) {
            this.a(A);
         } else {
            this.a(z);
         }

         if (C_Client_mc.eR.m != -1) {
            this.v = C_Client_mc.eR.m;
         }

         if (this.v != -1 && this.v < 32768) {
            C_j var7 = this.a.cA[this.v];
            if (var7 != null && var7.aG.o.equalsIgnoreCase(this.r)) {
               var6 = var7.M;
               if (var7.N * 2 == this.s) {
                  var6 *= 2;
               }
            }
         }

         if (this.v >= 32768) {
            int var14 = this.v - 32768;
            C_k var8 = C_Client_mc.kw_do[var14];
            if (var8 != null && var8.aZ.equalsIgnoreCase(this.r)) {
               var6 = var8.M;
            }
         }

         if (var6 > 0 && var6 != this.t) {
            this.u = this.c((int)((float)(var2 - 4) * ((float)this.t / (float)this.s)), var2);
            this.t = var6;
         }

         if (this.t == 0 && System.currentTimeMillis() - this.w < 17000L) {
            this.w = System.currentTimeMillis() - 17000L;
         }

         int var15 = (int)((float)(var2 - 4) * ((float)this.t / (float)this.s));
         if (rs.p_f.C_a.at) {
            if (!rs.p_l.p_b.C_a.a() && this.u > var15) {
               this.u -= 2;
            }
         } else {
            this.u = var15;
         }

         if (rs.p_f.C_a.ar) {
            var3 -= 12;
            rs.p_l.C_c.b(var3, var5, var4, 4077096, var2, 125);
            rs.p_l.C_c.d(var4, var2, var3, 5918522, var5);
            rs.p_l.C_c.d(var4 - 1, var2 + 2, var3 + 2, 2367511, var5 - 1);
            var5 -= 13;
            rs.p_l.C_c.b(15, var5 + 15, var4 + 2, 13960709, var2 - 4, 150);
            rs.p_l.C_c.b(15, var5 + 15, var4 + 2, 11297536, this.c(this.u, var2), 255);
            rs.p_l.C_c.b(15, var5 + 15, var4 + 2, 39186, this.c(var15, var2), 255);
            int var16 = this.t;
            int var9 = this.s;
            if (rs.p_f.C_a.ak) {
               var16 *= 10;
               var9 *= 10;
            }

            String var10 = this.r;
            byte var11 = 12;
            if (var9 >= 1000) {
               var11 = 10;
            }

            if (var9 >= 10000) {
               var11 = 8;
            }

            if (var10.length() > var11) {
               var10 = var10.substring(0, var11).trim() + "..";
            } else {
               var10 = var10 + ":";
            }

            C_Client_mc.gl.c(var10 + " @yel@" + var16 + " / " + var9, var4 + var2 / 2, var5 + 27, 16777215, 0);
         } else {
            rs.p_l.C_c.b(var3, var5, var4, 4077096, var2, 125);
            rs.p_l.C_c.d(var4, var2, var3, 5918522, var5);
            rs.p_l.C_c.d(var4 - 1, var2 + 2, var3 + 2, 2367511, var5 - 1);
            C_Client_mc.gl.c(this.r, var4 + var2 / 2, var5 + 12, 16777215, 0);
            rs.p_l.C_c.b(15, var5 + 15, var4 + 2, 13960709, var2 - 4, 150);
            rs.p_l.C_c.b(15, var5 + 15, var4 + 2, 11297536, this.c(this.u, var2), 255);
            rs.p_l.C_c.b(15, var5 + 15, var4 + 2, 39186, this.c(var15, var2), 255);
            int var17 = this.t;
            int var18 = this.s;
            if (rs.p_f.C_a.ak) {
               var17 *= 10;
               var18 *= 10;
            }

            C_Client_mc.gl.c(var17 + " / " + var18, var4 + var2 / 2, var5 + 27, 16777215, 0);
         }

         return this.j;
      }
   }

   public int c(int var1, int var2) {
      int var3 = var1;
      if (this.t > 0 && var1 <= 0) {
         var3 = 1;
      }

      if (var3 > var2 - 4) {
         var3 = var2 - 4;
      }

      if (var3 < 0) {
         var3 = 0;
      }

      return var3;
   }
}
