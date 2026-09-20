package rs.p_l.p_f.p_a.p_d;

import java.util.HashSet;
import p_gnu.p_trove.p_i.p_a.C_i;
import rs.p_a.C_j;

public class C_c extends C_b {
   private C_j n;
   private int o;
   private rs.p_d.C_d p;

   public C_c() {
      this.a(rs.p_l.p_f.C_a.c);
      this.h = new HashSet<>();
      this.e = new HashSet<>();
      this.i = new C_i();
   }

   @Override
   public int[] k() {
      return this.p.v;
   }

   @Override
   public rs.p_a.p_b.C_c l() {
      return this.p.i;
   }

   @Override
   public void a() {
      if (this.m instanceof C_j) {
         C_j var1 = (C_j)this.m;
         if (var1.aG.x == (long)this.o) {
            this.p = rs.p_d.C_d.c(this.o);
            var1.i = true;
            super.a();
         }
      }
   }

   @Override
   public void a(Object var1, boolean var2) {
      C_j var3 = (C_j)var1;
      if (var3 == this.n) {
         if (!var2) {
            var3.av = true;
            this.m();
            return;
         }

         this.p();
      }

      if (this.n != null && this.n != var3 && !var2) {
         this.m();
      }

      this.n = var3;
      if (this.n != null && this.n.aG != null) {
         this.n.i = true;
         this.o = (int)var3.aG.x;
      } else {
         this.o = -1;
      }
   }

   public void m() {
      this.o();
      this.r().c();
      this.n = null;
      this.o = -1;
   }

   public C_j u() {
      return this.n;
   }
}
