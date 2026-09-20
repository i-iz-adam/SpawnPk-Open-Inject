package rs.p_l.p_f.p_a.p_d;

import rs.p_d.C_r;
import rs.p_gui.C_Launcher_mc;

public class C_d extends C_b {
   private int n;
   private C_r o;

   public C_d() {
      this.a(rs.p_l.p_f.C_a.d);
   }

   @Override
   public int[] k() {
      return this.o.ax;
   }

   @Override
   public rs.p_a.p_b.C_c l() {
      return null;
   }

   @Override
   public void a() {
      if (this.n != -1) {
         if (this.m != null && this.m instanceof C_r) {
            if (((C_r)this.m).aa == this.n) {
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
         this.o = C_r.c(var3);
         C_Launcher_mc.n().o().l();
      } else {
         this.m();
      }
   }

   @Override
   public void m() {
      this.o();
      this.r().c();
      this.n = -1;
   }

   public boolean a(int var1) {
      return this.n == var1;
   }
}
