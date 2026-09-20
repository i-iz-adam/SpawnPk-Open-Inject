package rs.p_g;

public class C_c extends C_b {
   long[] a = new long[10];
   int b = 256;
   int c = 1;
   long d;
   int e = 0;
   int f;
   static long g;
   static long h;

   public C_c() {
      this.d = b();

      for (int var1 = 0; var1 < 10; var1++) {
         this.a[var1] = this.d;
      }
   }

   @Override
   public void a() {
      for (int var1 = 0; var1 < 10; var1++) {
         this.a[var1] = 0L;
      }
   }

   public static synchronized long b() {
      long var0 = System.currentTimeMillis();
      if (var0 < g) {
         h = h + (g - var0);
      }

      g = var0;
      return h + var0;
   }

   @Override
   public int a(int var1, int var2) {
      int var3 = this.b;
      int var4 = this.c;
      this.b = 300;
      this.c = 1;
      this.d = b();
      if (this.a[this.f] == 0L) {
         this.b = var3;
         this.c = var4;
      } else if (this.d > this.a[this.f]) {
         this.b = (int)((long)(var1 * 2560) / (this.d - this.a[this.f]));
      }

      if (this.b < 25) {
         this.b = 25;
      }

      if (this.b > 256) {
         this.b = 256;
         this.c = (int)((long)var1 - (this.d - this.a[this.f]) / 10L);
      }

      if (this.c > var1) {
         this.c = var1;
      }

      this.a[this.f] = this.d;
      this.f = (this.f + 1) % 10;
      if (this.c > 1) {
         for (int var5 = 0; var5 < 10; var5++) {
            if (this.a[var5] != 0L) {
               this.a[var5] = this.a[var5] + (long)this.c;
            }
         }
      }

      if (this.c < var2) {
         this.c = var2;
      }

      C_e.a((long)this.c);

      int var6;
      for (var6 = 0; this.e < 256; this.e = this.e + this.b) {
         var6++;
      }

      this.e &= 255;
      return var6;
   }
}
