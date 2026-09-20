package rs.p_l.p_f.p_a.p_g;

import rs.C_Client_mc;
import rs.p_l.p_f.C_e;

public class C_b extends rs.p_l.p_f.C_b {
   private C_c e;
   private String f;
   private int g;
   private int h;
   private double i;
   private boolean j;

   public C_b() {
      this.a(rs.p_l.p_f.C_a.A);
   }

   @Override
   public void a() {
      short var1 = 500;
      byte var2 = 18;
      int var3 = 6 - (C_Client_mc.ai() ? 5 : 1) - C_c.r;
      int var4 = 15 - C_c.s - var2 / 2;
      double var5 = this.i / 100.0;
      int var7 = this.j ? 4095 : 13960709;
      int var8 = this.j ? '쓿' : 30976;
      int var9 = (int)Math.ceil((double)var1 * var5);
      rs.p_l.C_c.b(var2, var4, var3, 0, var1 + 4, 125);
      rs.p_l.C_c.b(14, var4 + 2, var3 + 2, var7, var1, 255);
      rs.p_l.C_c.b(14, var4 + 2, var3 + 2, var8, var9, 255);
      C_Client_mc.gl.c(this.f, var3 + (var1 + 4) / 2, var4 + 14, 16777215, 0);
   }

   @Override
   public void c() {
      C_e.d().b(this);
   }

   public void c(int var1, int var2) {
      this.g = var1;
      this.h = var2;
      this.i = (double)this.g / (double)var2 * 100.0;
      this.f = C_Client_mc.a((double)this.g) + " / " + C_Client_mc.a((double)this.h) + " @yel@(" + (int)this.i + "%)";
   }

   public void b(boolean var1) {
      this.j = var1;
   }
}
