package rs.p_l.p_f.p_a.p_e;

import p_gnu.p_trove.p_f.C_M_uc;
import p_gnu.p_trove.p_f.p_b.C_cc;
import rs.C_Client_mc;

public class C_a extends rs.p_l.p_f.p_b.C_b {
   private final C_M_uc<C_a.a> i;

   public C_a() {
      this.a(rs.p_l.p_f.C_a.i);
      C_b.a(this);
      this.i = new C_cc();
   }

   @Override
   public void a() {
      if (this.i.w_((int)this.e.aG.x)) {
         C_a.a var1 = (C_a.a)this.i.b((int)this.e.aG.x);
         this.a(this.e.ac + var1.b, this.e.ad + var1.c, this.e.r + var1.d);
         C_Client_mc.fE[var1.a].f(this.c, this.d);
      }
   }

   @Override
   public void c() {
      this.k();
   }

   public void a(int var1, int var2, int var3, int var4, int var5) {
      this.i.a(var1, new C_a.a(var2, var3, var4, var5));
   }

   public void a(int var1) {
      this.i.c(var1);
   }

   public void k() {
      this.i.clear();
   }

   class a {
      int a;
      int b;
      int c;
      int d;

      public a(int var2, int var3, int var4, int var5) {
         this.a = var2;
         this.b = var3;
         this.c = var4;
         this.d = var5;
      }
   }
}
