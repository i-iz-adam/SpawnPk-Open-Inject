package rs.p_l.p_b.p_a.p_a;

import java.awt.Color;
import java.awt.Polygon;
import rs.C_C_uc;
import rs.C_Client_mc;
import rs.C_V_uc;
import rs.p_a.C_h;
import rs.p_l.p_e.C_j;

public class C_c extends C_a {
   private int t;
   private rs.p_d.C_d u;

   public C_c(int var1) {
      this.t = var1;
      this.u = rs.p_d.C_d.c(var1);
   }

   @Override
   protected void b() {
      this.d(this.u.w);
   }

   @Override
   protected void c() {
      rs.p_d.C_a var1 = rs.p_d.C_a.a[this.h];
      int var2 = var1.e[this.i];
      C_h var3 = this.u.a(-1, var2, null, this.h);
      if (this.n) {
      }

      if (var3 != null) {
         Polygon var4 = var3.b(this.b, this.c, this.d - C_V_uc.k + C_Client_mc.cK, 0);
         C_j var5 = new C_j(this, var4, Color.GREEN, Color.BLACK, this.f);
         var5.f = Color.GREEN;
         C_Client_mc.ab.c.a(this.f, var5);
         var3.a(this.e, C_V_uc.m, C_V_uc.n, C_V_uc.o, C_V_uc.p, this.b - C_V_uc.j, this.d - C_V_uc.k, this.c - C_V_uc.l, this.f, 0);
         var3.K = 256;
         C_h.H = -1;
         if (var5.g && rs.p_l.p_b.p_a.C_d.b.j) {
            if (rs.p_l.p_b.p_a.C_d.b.k == 1) {
               rs.p_l.p_b.p_a.C_d.b.c("Selected @gre@NPC entity #" + (this.m + 1));
               this.n = true;
               rs.p_l.p_b.p_a.C_d.b.f();
            } else {
               this.o = false;
               rs.p_l.p_b.p_a.C_d.b.c("Deleted @red@NPC entity #" + (this.m + 1));
            }

            rs.p_l.p_b.p_a.C_d.b.j = false;
         }

         if (var5.g) {
            C_C_uc.a(rs.p_l.p_b.p_a.C_d.b.l, var4, new Color(0, 255, 0, 150), new Color(0, 255, 0, 25));
         }

         this.c(var3.g + 10);
         if (rs.p_l.p_b.p_a.C_d.e) {
            C_Client_mc.gl.a((this.n ? "@gre@" : "") + (this.m + 1), this.k, this.l);
         }

         if (this.n) {
            try {
               byte var6 = 10;
               int var7 = rs.p_l.p_b.p_a.C_d.b.f.B().getHeight() - 65;
               String var8 = "[ ";
               int var9 = 0;

               for (int var11 : this.q.keySet()) {
                  if (var9 == this.r) {
                     var8 = var8 + "<u=0>";
                  }

                  if (this.k().contains(var11)) {
                     var8 = var8 + "@gre@" + var11;
                  } else if (this.p.containsKey(var11)) {
                     var8 = var8 + "@whi@" + var11;
                  } else {
                     var8 = var8 + "@red@" + var11;
                  }

                  if (var9 == this.r) {
                     var8 = var8 + "</u>";
                  }

                  var8 = var8 + " ";
                  var9++;
               }

               var8 = var8 + "@whi@]";
               rs.p_l.p_b.p_a.C_d.b.f.gm.a(var8, var6, var7, 16777215, 0, false);
            } catch (Exception var12) {
               var12.printStackTrace();
            }
         }

         Object var13 = null;
      }
   }

   public void g(int var1) {
      this.t = var1;
      this.u = rs.p_d.C_d.c(var1);
      this.d(this.u.w);
      this.a(false);
   }

   public rs.p_d.C_d n() {
      return this.u;
   }

   public int o() {
      return this.t;
   }

   public void p() {
      this.b();
   }

   public void q() {
      this.d(this.u.q);
   }

   public void r() {
      this.d(this.u.w);
   }
}
