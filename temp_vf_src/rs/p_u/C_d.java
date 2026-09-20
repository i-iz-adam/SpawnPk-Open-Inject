package rs.p_u;

import com.a.b.a.b;

public class C_d {
   boolean a = true;
   boolean b = true;
   b c = new b();
   b d = new b();
   b e = new b();
   b[] f;
   b[] g;
   float[][] h;
   float[][] i;
   float[][] j;
   float[][] k;
   final b[] l;
   public C_d m;
   public final int n;

   public C_d(int var1, rs.p_x.C_e var2, boolean var3) {
      this.n = var2.B();
      this.l = new b[var1];
      this.f = new b[this.l.length];
      this.g = new b[this.l.length];
      this.k = new float[this.l.length][3];

      for (int var4 = 0; var4 < this.l.length; var4++) {
         this.l[var4] = new b(var2, var3);
         this.k[var4][0] = var2.s();
         this.k[var4][1] = var2.s();
         this.k[var4][2] = var2.s();
      }

      this.a();
   }

   void a() {
      this.i = new float[this.l.length][3];
      this.h = new float[this.l.length][3];
      this.j = new float[this.l.length][3];
      b var1 = com.a.b.a.b.a();

      for (int var2 = 0; var2 < this.l.length; var2++) {
         b var3 = this.a(var2);
         var1.a(var3);
         var1.h();
         this.i[var2] = var1.d();
         this.h[var2][0] = var3.e[12];
         this.h[var2][1] = var3.e[13];
         this.h[var2][2] = var3.e[14];
         this.j[var2] = var3.i();
      }

      var1.b();
   }

   b a(int var1) {
      return this.l[var1];
   }

   b b(int var1) {
      if (null == this.f[var1]) {
         this.f[var1] = new b(this.a(var1));
         if (null != this.m) {
            this.f[var1].c(this.m.b(var1));
         } else {
            this.f[var1].c(com.a.b.a.b.a);
         }
      }

      return this.f[var1];
   }

   b c(int var1) {
      if (null == this.g[var1]) {
         this.g[var1] = new b(this.b(var1));
         this.g[var1].h();
      }

      return this.g[var1];
   }

   void a(b var1) {
      this.e.a(var1);
      this.b = true;
      this.a = true;
   }

   b b() {
      return this.e;
   }

   b c() {
      try {
         if (this.b) {
            this.c.a(this.b());
            if (this.m != null) {
               this.c.c(this.m.c());
            }

            this.b = false;
         }
      } catch (StackOverflowError var2) {
         System.out.println("parent " + this.n + ", " + this.m + ", parent parent: " + (this.m != null ? this.m.n : -1) + ", bone_pose_transform: " + this.c);
         System.exit(1);
      }

      return this.c;
   }

   public b d(int var1) {
      if (this.a) {
         this.d.a(this.c(var1));
         this.d.c(this.c());
         this.a = false;
      }

      return this.d;
   }

   float[] e(int var1) {
      return this.i[var1];
   }

   float[] f(int var1) {
      return this.h[var1];
   }

   float[] g(int var1) {
      return this.j[var1];
   }
}
