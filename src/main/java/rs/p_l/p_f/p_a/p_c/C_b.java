package rs.p_l.p_f.p_a.p_c;

import javax.inject.Inject;
import rs.p_e.C_i;
import rs.p_l.p_f.C_e;

public class C_b extends rs.p_q.p_a.p_a.C_a {
   @Inject
   private C_i d;
   private C_a e;

   @Override
   public void a() {
      if (this.e == null || this.e.M()) {
         this.e = new C_a(this.d.a(rs.p_s.p_a.C_a.class));
         C_e.d().a(this.e);
      }

      int var1 = this.e();
      if (var1 == 1) {
         this.e.L();
         this.e.k(this.e() == 1);
      } else if (var1 == 2) {
         this.e.s = this.g();
         this.e.t = this.g();
      } else if (var1 == 4) {
         int var2 = this.g();
         int var3 = this.g();
         if (var2 == var3) {
            this.e.r = 100;
         } else if (var2 == 0) {
            this.e.r = 0;
         } else {
            this.e.r = (int)((float)var2 / (float)var3 * 100.0F);
         }

         this.e.u = var2 + " / " + var3 + " @yel@(" + this.e.r + "%)";
         this.e.v = var2 + " @yel@(" + this.e.r + "%)";
      } else if (var1 == 5) {
         this.e.w = this.h();
      } else if (var1 == 6) {
         int var5 = this.g();
         this.e.x = "<img=381>" + var5;
      } else if (var1 == 7) {
         int var6 = this.g();
         int var7 = this.g();
         if (var6 == var7) {
            this.e.r = 100;
         } else if (var6 == 0) {
            this.e.r = 0;
         } else {
            this.e.r = (int)((float)var6 / (float)var7 * 100.0F);
         }

         String var4 = this.h();
         this.e.u = this.e.v = var4;
      }
   }
}
