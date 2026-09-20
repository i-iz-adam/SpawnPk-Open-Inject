package rs.p_m;

public final class C_a {
   public static final int a = 1;
   public static final int b = 2;
   public static final int c = 3;
   public static final int d = 4;
   public static final int e = 5;
   public static final int f = 256;
   private final C_a.a[] g = a();
   private int h;
   private int i;
   private long j;

   public static C_a.a[] a() {
      C_a.a[] var0 = new C_a.a[256];

      for (int var1 = 0; var1 < var0.length; var1++) {
         var0[var1] = new C_a.a();
      }

      return var0;
   }

   public synchronized void a(int var1, int var2, int var3, int var4, long var5) {
      if (var1 == 3 && this.i > 0) {
         C_a.a var7 = this.g[(this.h + this.i - 1) % this.g.length];
         if (var7.a == 3) {
            var7.c = var3;
            var7.d = var4;
            var7.i = var5;
            var7.e = Math.min(var7.e, var3);
            var7.f = Math.max(var7.f, var3);
            var7.g = Math.min(var7.g, var4);
            var7.h = Math.max(var7.h, var4);
            return;
         }
      }

      if (this.i == this.g.length) {
         this.j++;
         this.c();
      } else {
         this.g[(this.h + this.i++) % this.g.length].a(var1, var2, var3, var4, var5);
      }
   }

   public synchronized void b() {
      this.h = this.i = 0;
   }

   public synchronized void c() {
      this.b();
      this.a(4, 0, 0, 0, 0L);
   }

   public synchronized int a(C_a.a[] var1) {
      int var2 = Math.min(this.i, var1.length);

      for (int var3 = 0; var3 < var2; var3++) {
         C_a.a var4 = this.g[this.h];
         var1[var3].a(var4.a, var4.b, var4.c, var4.d, var4.i);
         var1[var3].e = var4.e;
         var1[var3].f = var4.f;
         var1[var3].g = var4.g;
         var1[var3].h = var4.h;
         this.h = (this.h + 1) % this.g.length;
      }

      this.i -= var2;
      return var2;
   }

   public synchronized long d() {
      return this.j;
   }

   public static final class a {
      public int a;
      public int b;
      public int c;
      public int d;
      public int e;
      public int f;
      public int g;
      public int h;
      public long i;

      private void a(int var1, int var2, int var3, int var4, long var5) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
         this.d = var4;
         this.i = var5;
         this.e = this.f = var3;
         this.g = this.h = var4;
      }
   }
}
