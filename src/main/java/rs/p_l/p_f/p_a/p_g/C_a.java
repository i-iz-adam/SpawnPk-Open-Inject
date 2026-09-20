package rs.p_l.p_f.p_a.p_g;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import rs.C_Client_mc;
import rs.p_l.p_f.C_g;
import rs.p_l.p_f.C_l;

public class C_a extends C_g {
   private static final int r = 125;
   private static final int s = 33;
   private static final Dimension t = new Dimension(127, 34);
   private static final String u = "Your points:";
   private static final String v = "Time:";
   private String w = "0";
   private String x = "0:00";
   private long y = 0L;
   private boolean z = false;

   public C_a() {
      this.a("RaidPartyOverlay");
      this.a(rs.p_l.p_f.C_a.p);
      this.a(C_l.c);
      this.e.a(new Rectangle(2, 2, 2, 2));
      this.e.b(new Point(0, 2));
   }

   @Override
   public Dimension a(Graphics2D var1) {
      int var2 = this.f.x;
      int var3 = this.f.y;
      this.a(t);
      rs.p_l.C_c.b(33, var3, var2, 4077096, 125, 125);
      rs.p_l.C_c.d(var2, 125, 33, 5918522, var3);
      rs.p_l.C_c.d(var2 - 1, 127, 33, 2367511, var3 - 1);
      C_Client_mc.gl.b("Your points:", var2 + 4, var3 + 13, 16750623, 0);
      C_Client_mc.gl.a(this.w, var2 + 125 - 3, var3 + 13, 16777215, 0);
      C_Client_mc.gl.b("Time:", var2 + 4, var3 + 27, 16750623, 0);
      C_Client_mc.gl.a(this.x, var2 + 125 - 3, var3 + 27, 16777215, 0);
      if (!this.z && System.currentTimeMillis() - this.y > 1000L) {
         long var4 = System.currentTimeMillis() - this.y;
         int var6 = (int)(var4 / 1000L);
         int var7 = var6 % 3600 / 60;
         int var8 = var6 % 60;
         this.x = String.format("%d:%02d", var7, var8);
      }

      return this.j;
   }

   public void b(String var1) {
      this.w = var1;
   }

   public void c(String var1) {
      this.x = var1;
   }

   public void a(long var1) {
      this.y = var1;
   }

   public void k(boolean var1) {
      this.z = var1;
   }
}
