package rs.p_l.p_e.p_a;

import rs.C_Client_mc;

public class C_m extends rs.p_l.p_e.C_f {
   public static final int p = 54484;
   public static final int q = 9765;
   public static final int r = 13960709;
   public static final int s = 30976;
   public static final int t = 13960709;
   public static final int u = 30976;
   public int v = 500;
   public int w = 500;
   public int x = 18;
   public int y = 0;
   public int z = 13960709;
   public int A = 30976;
   public String B;
   public String C;
   public String D;
   public boolean E;
   public static rs.p_q.p_a.p_a.C_a F = new C_n();

   @Override
   public void b() {
      this.z = 13960709;
      this.A = 30976;
      this.w = 0;
      this.y = 0;
      this.B = "100%";
      this.C = "";
   }

   @Override
   public boolean a(C_Client_mc var1) {
      return this.E;
   }

   @Override
   public void b(C_Client_mc var1, rs.p_l.p_e.C_f.a var2) {
      if (C_Client_mc.cH == -1 && var2 == rs.p_l.p_e.C_f.a.b) {
         int var3 = 220;
         byte var4 = 40;
         int var5 = 150;
         int var6 = 10;
         if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
            var5 = C_Client_mc.aj / 2 - var3 / 2;
            var6 = 23;
         }

         var6 -= 4;
         if (!C_Client_mc.ai()) {
            var5 += 4;
            var6 += 4;
         }

         double var7 = (double)((float)this.y) / 100.0;
         rs.p_l.C_c.b(var4, var6, var5, 5129018, var3, 255);
         rs.p_l.C_c.d(var5, var3, var4, 5918522, var6);
         byte var9 = 1;
         rs.p_l.C_c.d(var5 - var9, var3 + var9 * 2, var4 + var9 * 2, 2367511, var6 - var9);
         C_Client_mc.gl.c(this.C, var5 + (var3 + 4) / 2, var6 + 14, 16750623, 0);
         C_Client_mc.gl.a(this.D, var5 + var3 - 3, var6 + 14, 3135999, 0);
         var6 += 18;
         var5 += 2;
         var3 -= 6;
         var4 = 20;
         int var10 = (int)Math.ceil((double)var3 * var7);
         rs.p_l.C_c.b(var4, var6, var5, 0, var3 + 2, 255);
         rs.p_l.C_c.b(var4 - 2, var6 + 1, var5 + 1, this.A, var3, 255);
         rs.p_l.C_c.b(var4 - 2, var6 + 1, var5 + 1, this.z, var10, 255);
         C_Client_mc.gl.c(this.B, var5 + (var3 + 6) / 2, var6 + 15, 16777215, 0);
      }
   }

   @Override
   public void c() {
      this.E = false;
   }

   public void a(boolean var1) {
      this.E = var1;
   }
}
