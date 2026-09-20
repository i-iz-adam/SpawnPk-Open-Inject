package rs.p_l.p_f.p_a.p_d;

import rs.C_Client_mc;
import rs.p_d.C_k;

public class C_a extends C_b {
   private int n;
   private C_k o;

   public C_a() {
      this.a(rs.p_l.p_f.C_a.a);
   }

   @Override
   public int[] k() {
      return this.o.g;
   }

   @Override
   public rs.p_a.p_b.C_c l() {
      return this.o.aw;
   }

   @Override
   public void a() {
      if (this.n != -1) {
         if (this.m != null && this.m instanceof C_k) {
            if (((C_k)this.m).i == this.n) {
               int var1 = this.h.size();
               this.s();

               for (int var2 = 0; var2 < this.l.ah; var2++) {
                  if (!this.g || !this.i.a_(this.l.ar[var2])) {
                     this.h.add(this.l.ar[var2]);
                  }
               }

               if (var1 != this.h.size()) {
                  this.n();
               }

               super.a();
            }
         }
      }
   }

   @Override
   public void a(Object var1, boolean var2) {
      int var3 = (Integer)var1;
      if (this.n == var3) {
         if (!var2) {
            this.m();
            return;
         }

         this.p();
      }

      if (this.n != -1 && this.n != var3 && !var2) {
         this.m();
      }

      this.n = var3;
      if (this.n != -1) {
         C_Client_mc.eR.i = true;
         this.o = C_k.f(var3);
         C_Client_mc.eR.i = true;
         C_Client_mc.ba = true;
         C_Client_mc.bb = var3;
         C_Client_mc.fb = true;
         C_Client_mc.bd = this.o.Z;
         C_Client_mc.be = this.o.G;
         C_Client_mc.bc = this.o.M;
         C_Client_mc.bf = this.o.v;
         C_Client_mc.bg = this.o.W;
      } else {
         this.n = -1;
         this.m();
      }
   }

   public void m() {
      this.o();
      this.r().c();
      this.n = -1;
      C_Client_mc.eR.i = false;
      C_Client_mc.ba = false;
   }
}
