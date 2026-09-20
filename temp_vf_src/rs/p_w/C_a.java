package rs.p_w;

public final class C_a {
   private int d;
   private int[] e;
   private int[] f;
   public int a;
   public int b;
   public int c;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k;

   public void a(rs.p_x.C_e var1) {
      this.c = var1.y();
      this.a = var1.D();
      this.b = var1.D();
      this.b(var1);
   }

   public void b(rs.p_x.C_e var1) {
      this.d = var1.y();
      this.e = new int[this.d];
      this.f = new int[this.d];

      for (int var2 = 0; var2 < this.d; var2++) {
         this.e[var2] = var1.A();
         this.f[var2] = var1.A();
      }
   }

   public void a() {
      this.g = 0;
      this.h = 0;
      this.i = 0;
      this.j = 0;
      this.k = 0;
   }

   public int a(int var1) {
      if (this.k >= this.g) {
         this.j = this.f[this.h++] << 15;
         if (this.h >= this.d) {
            this.h = this.d - 1;
         }

         this.g = (int)((double)this.e[this.h] / 65536.0 * (double)var1);
         if (this.g > this.k) {
            this.i = ((this.f[this.h] << 15) - this.j) / (this.g - this.k);
         }
      }

      this.j = this.j + this.i;
      this.k++;
      return this.j - this.i >> 15;
   }
}
