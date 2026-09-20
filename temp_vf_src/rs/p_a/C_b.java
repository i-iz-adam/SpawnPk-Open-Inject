package rs.p_a;

import rs.p_d.C_x;

public final class C_b extends C_a {
   public final int h;
   public final int i;
   public final int j;
   public final int k;
   public final int l;
   public boolean m = false;
   private final C_x n;
   private int o;
   private int p;

   public C_b(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.n = C_x.c[var4];
      this.h = var1;
      this.i = var7;
      this.j = var6;
      this.k = var5;
      this.l = var2 + var3;
      this.m = false;
   }

   @Override
   public C_h c() {
      C_h var1 = this.n.a();
      if (var1 == null) {
         return null;
      } else {
         C_h var2 = null;
         rs.p_d.C_a var3 = this.n.g;
         boolean var4 = false;
         rs.p_a.p_a.C_a var5 = C_h.h;
         if (var3.b()) {
            var2 = var3.a(var1, this.o);
         } else {
            int var6 = this.n.g.e[this.o];
            var2 = new C_h(true, rs.C_k.g(var6), false, var1);
            var2.i = var5;
            if (!this.m) {
               var2.n();
               var2.f(var6, this.n.g.r);
               var2.aM = null;
               var2.aL = null;
            }
         }

         if (this.n.j != 128 || this.n.k != 128) {
            var2.b(this.n.j, this.n.j, this.n.k);
         }

         if (this.n.l != 0) {
            if (this.n.l == 90) {
               var2.o();
            }

            if (this.n.l == 180) {
               var2.o();
               var2.o();
            }

            if (this.n.l == 270) {
               var2.o();
               var2.o();
               var2.o();
            }
         }

         var2.b(64 + this.n.m, 850 + this.n.n, -30, -50, -30, true);
         if (var4) {
            C_x.q.a(var5, (long)this.n.d);
         }

         return var2;
      }
   }

   public void a(int var1) {
      if (this.n.g.b()) {
         this.p += var1;
         this.o += var1;
         if (this.o >= this.n.g.c()) {
            this.m = true;
         }
      } else {
         this.p += var1;

         while (this.p > this.n.g.a(this.o)) {
            this.p = this.p - (this.n.g.a(this.o) + 1);
            this.o++;
            if (this.o >= this.n.g.d && (this.o < 0 || this.o >= this.n.g.d)) {
               this.o = 0;
               this.m = true;
            }
         }
      }
   }
}
