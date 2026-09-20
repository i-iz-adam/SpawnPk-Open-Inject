package rs.p_s.p_c;

import java.awt.Color;
import java.awt.Polygon;
import java.awt.event.KeyEvent;
import javax.inject.Inject;
import rs.C_Client_mc;

public class C_b extends rs.p_l.p_f.C_b implements rs.p_g.p_a.C_a {
   private final C_a e;
   private final C_c f;
   private int g = 0;
   private int h = 0;
   private int i = 0;
   private int j = 0;
   private int k = 0;
   private long l = 0L;

   @Inject
   public C_b(C_c var1, C_a var2) {
      this.f = var1;
      this.e = var2;
      this.a(rs.p_l.p_f.C_a.A);
   }

   @Override
   public void a() {
      int var1 = C_Client_mc.hP + 5;
      int var2 = C_Client_mc.hQ + 15;
      if (this.k != this.e.m()) {
         this.k = this.e.m();
         this.i = 0;
         this.j = 0;
      }

      if (this.e.k()) {
         C_Client_mc.gl.b("@gre@m:" + C_Client_mc.hP + "," + C_Client_mc.hQ, var1, var2, 0, 0);
         var2 -= 15;
         if (C_Client_mc.ag) {
            int var3 = C_Client_mc.hP - this.g;
            int var4 = C_Client_mc.hQ - this.h;
            C_Client_mc.gl.b("@red@drag:" + var3 + "," + var4, var1, var2, 0, 0);
            var2 -= 15;
            Polygon var5 = new Polygon();
            var5.addPoint(this.g, this.h);
            if (C_Client_mc.hP > this.g) {
               var5.addPoint(this.g, C_Client_mc.hQ);
               var5.addPoint(C_Client_mc.hP, C_Client_mc.hQ);
               var5.addPoint(C_Client_mc.hP, this.h);
            }

            this.a(var5, Color.RED, new Color(255, 0, 0, 50));
         } else {
            this.g = C_Client_mc.hP;
            this.h = C_Client_mc.hQ;
         }
      }

      if (this.m()) {
         C_Client_mc.gl.b("@mag@intf:" + this.i + "," + this.j, var1, var2, 0, 0);
         var2 -= 15;
      }

      C_e.a var7;
      while ((var7 = this.f.f().k().poll()) != null) {
         Polygon var8 = new Polygon();
         var8.addPoint(var7.b(), var7.c());
         var8.addPoint(var7.b(), var7.c() + 1);
         var8.addPoint(var7.b() + 1, var7.c() + 1);
         var8.addPoint(var7.b() + 1, var7.c());
         int var9 = Math.max(Math.abs(var7.b() - C_Client_mc.hP), Math.abs(var7.c() - C_Client_mc.hQ));
         this.a(var8, var9 <= 1 ? Color.green : Color.magenta);
         C_Client_mc.gl.b(var7.a(), var7.b(), var7.c(), var9 <= 1 ? Color.green.getRGB() : var7.d().i, 0);
      }
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (this.m()) {
         int var2 = var1.isControlDown() ? 10 : 1;
         if (var1.getKeyCode() == 39) {
            this.i += var2;
            this.k();
            var1.consume();
         } else if (var1.getKeyCode() == 37) {
            this.i -= var2;
            this.k();
            var1.consume();
         }

         if (var1.getKeyCode() == 38) {
            this.j -= var2;
            this.k();
            var1.consume();
         } else if (var1.getKeyCode() == 40) {
            this.j += var2;
            this.k();
            var1.consume();
         }
      }
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   private void k() {
      if (this.l() != null && System.currentTimeMillis() - this.l >= 10L) {
         this.l = System.currentTimeMillis();
         this.l().a();
      }
   }

   private rs.p_n.p_d.C_c l() {
      if (this.e.l() > 0) {
         return C_c.c.get(this.e.l());
      } else {
         return this.e.m() > 0 && C_Client_mc.cH > 0 ? C_c.c.get(C_Client_mc.cH) : null;
      }
   }

   private boolean m() {
      return this.l() != null;
   }
}
