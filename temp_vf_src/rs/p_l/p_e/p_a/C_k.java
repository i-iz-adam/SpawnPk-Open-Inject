package rs.p_l.p_e.p_a;

import rs.C_Client_mc;

public class C_k extends rs.p_l.p_e.C_f {
   public static final rs.p_q.p_a.p_a.C_a p = new C_l();
   private int q = 0;
   private int r = 0;
   private long s = 0L;

   @Override
   public void b() {
   }

   @Override
   public boolean a(C_Client_mc var1) {
      return this.r != 0;
   }

   @Override
   public void b(C_Client_mc var1, rs.p_l.p_e.C_f.a var2) {
      if (var2 == rs.p_l.p_e.C_f.a.b) {
         if (this.r != 0) {
            if (this.s == 0L) {
               this.s = System.currentTimeMillis();
            }

            long var3 = this.s + 1000L * (long)this.q;
            long var5 = (var3 - this.s) / 100L;
            if (var5 > 0L) {
               int var7 = C_Client_mc.ai() ? 0 : 4;
               int var8 = C_Client_mc.ai() ? 0 : 4;
               long var9 = (System.currentTimeMillis() - this.s) / var5;
               int var11 = (int)(var9 * 1L * 2L);
               if (this.r < 0) {
                  var11 = 255 - var11;
               }

               if (var11 > 255) {
                  var11 = 255;
                  this.f();
               }

               if (var11 < 0) {
                  var11 = 0;
                  this.f();
               }

               rs.p_l.C_c.b(C_Client_mc.ak, var8, var7, 0, C_Client_mc.aj, var11);
            }
         }
      }
   }

   @Override
   public void c() {
      this.f();
   }

   public void a(int var1, int var2) {
      this.r = var1;
      this.q = var2;
      this.s = 0L;
   }

   public void f() {
      this.r = 0;
      this.s = 0L;
   }
}
