package rs.p_l;

public final class C_a extends C_B_uc {
   float f;
   float g;
   public final int[] h;
   public byte[] i;
   public int j;
   public int k;
   public int l;
   public int m;
   public int n;
   public int o;

   public float c() {
      return this.f;
   }

   public void a(float var1) {
      this.f = var1;
   }

   public float d() {
      return this.g;
   }

   public void b(float var1) {
      this.g = var1;
   }

   public C_a(rs.p_x.C_f var1, String var2, int var3) {
      rs.p_x.C_e var4 = new rs.p_x.C_e(var1.a(var2 + ".dat"));
      rs.p_x.C_e var5 = new rs.p_x.C_e(var1.a("index.dat"));
      var5.h = var4.A();
      this.n = var5.A();
      this.o = var5.A();
      int var6 = var5.y();
      this.h = new int[var6];

      for (int var7 = 0; var7 < var6 - 1; var7++) {
         this.h[var7 + 1] = var5.C();
      }

      for (int var11 = 0; var11 < var3; var11++) {
         var5.h += 2;
         var4.h = var4.h + var5.A() * var5.A();
         var5.h++;
      }

      this.l = var5.y();
      this.m = var5.y();
      this.j = var5.A();
      this.k = var5.A();
      int var12 = var5.y();
      int var8 = this.j * this.k;
      this.i = new byte[var8];
      if (var12 == 0) {
         for (int var13 = 0; var13 < var8; var13++) {
            this.i[var13] = var4.z();
         }
      } else {
         if (var12 == 1) {
            for (int var9 = 0; var9 < this.j; var9++) {
               for (int var10 = 0; var10 < this.k; var10++) {
                  this.i[var9 + var10 * this.j] = var4.z();
               }
            }
         }
      }
   }

   public void a(int var1, int var2) {
      var1 += this.l;
      var2 += this.m;
      int var3 = var1 + var2 * C_c.h;
      int var4 = 0;
      int var5 = this.k;
      int var6 = this.j;
      int var7 = C_c.h - var6;
      int var8 = 0;
      if (var2 < C_c.j) {
         int var9 = C_c.j - var2;
         var5 -= var9;
         var2 = C_c.j;
         var4 += var9 * var6;
         var3 += var9 * C_c.h;
      }

      if (var2 + var5 > C_c.k) {
         var5 -= var2 + var5 - C_c.k;
      }

      if (var1 < C_c.l) {
         int var12 = C_c.l - var1;
         var6 -= var12;
         var1 = C_c.l;
         var4 += var12;
         var3 += var12;
         var8 += var12;
         var7 += var12;
      }

      if (var1 + var6 > C_c.m) {
         int var13 = var1 + var6 - C_c.m;
         var6 -= var13;
         var8 += var13;
         var7 += var13;
      }

      if (var6 > 0 && var5 > 0) {
         this.a(var5, C_c.g, this.i, var7, var3, var6, var4, this.h, var8);
      }
   }

   public void e() {
      this.n /= 2;
      this.o /= 2;
      byte[] var1 = new byte[this.n * this.o];
      int var2 = 0;

      for (int var3 = 0; var3 < this.k; var3++) {
         for (int var4 = 0; var4 < this.j; var4++) {
            var1[(var4 + this.l >> 1) + (var3 + this.m >> 1) * this.n] = this.i[var2++];
         }
      }

      this.i = var1;
      this.j = this.n;
      this.k = this.o;
      this.l = 0;
      this.m = 0;
   }

   public void f() {
      if (this.j != this.n || this.k != this.o) {
         if (this.n * this.o > 16384) {
            System.out.println("Blocked background: " + this.n * this.o);
         } else {
            byte[] var1 = new byte[this.n * this.o];
            int var2 = 0;

            for (int var3 = 0; var3 < this.k; var3++) {
               for (int var4 = 0; var4 < this.j; var4++) {
                  var1[var4 + this.l + (var3 + this.m) * this.n] = this.i[var2++];
               }
            }

            this.i = var1;
            this.j = this.n;
            this.k = this.o;
            this.l = 0;
            this.m = 0;
         }
      }
   }

   public void g() {
      byte[] var1 = new byte[this.j * this.k];
      int var2 = 0;

      for (int var3 = 0; var3 < this.k; var3++) {
         for (int var4 = this.j - 1; var4 >= 0; var4--) {
            var1[var2++] = this.i[var4 + var3 * this.j];
         }
      }

      this.i = var1;
      this.l = this.n - this.j - this.l;
   }

   public void h() {
      byte[] var1 = new byte[this.j * this.k];
      int var2 = 0;

      for (int var3 = this.k - 1; var3 >= 0; var3--) {
         for (int var4 = 0; var4 < this.j; var4++) {
            var1[var2++] = this.i[var4 + var3 * this.j];
         }
      }

      this.i = var1;
      this.m = this.o - this.k - this.m;
   }

   public void a(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.h.length; var4++) {
         int var5 = this.h[var4] >> 16 & 0xFF;
         var5 += var1;
         if (var5 < 0) {
            var5 = 0;
         } else if (var5 > 255) {
            var5 = 255;
         }

         int var6 = this.h[var4] >> 8 & 0xFF;
         var6 += var2;
         if (var6 < 0) {
            var6 = 0;
         } else if (var6 > 255) {
            var6 = 255;
         }

         int var7 = this.h[var4] & 0xFF;
         var7 += var3;
         if (var7 < 0) {
            var7 = 0;
         } else if (var7 > 255) {
            var7 = 255;
         }

         this.h[var4] = (var5 << 16) + (var6 << 8) + var7;
      }
   }

   public void b(int var1, int var2) {
      var1 += this.l;
      var2 += this.m;
      int var3 = var1 + var2 * C_c.h;
      int var4 = 0;
      int var5 = this.k;
      int var6 = this.j;
      int var7 = C_c.h - var6;
      int var8 = 0;
      if (var2 < C_c.j) {
         int var9 = C_c.j - var2;
         var5 -= var9;
         var2 = C_c.j;
         var4 += var9 * var6;
         var3 += var9 * C_c.h;
      }

      if (var2 + var5 > C_c.k) {
         var5 -= var2 + var5 - C_c.k;
      }

      if (var1 < C_c.l) {
         int var12 = C_c.l - var1;
         var6 -= var12;
         var1 = C_c.l;
         var4 += var12;
         var3 += var12;
         var8 += var12;
         var7 += var12;
      }

      if (var1 + var6 > C_c.m) {
         int var13 = var1 + var6 - C_c.m;
         var6 -= var13;
         var8 += var13;
         var7 += var13;
      }

      if (var6 > 0 && var5 > 0) {
         this.a(var5, C_c.g, this.i, var7, var3, var6, var4, this.h, var8);
      }
   }

   private void a(int var1, int[] var2, byte[] var3, int var4, int var5, int var6, int var7, int[] var8, int var9) {
      int var10 = -(var6 >> 2);
      var6 = -(var6 & 3);

      for (int var11 = -var1; var11 < 0; var11++) {
         for (int var12 = var10; var12 < 0; var12++) {
            byte var13 = var3[var7++];
            if (var13 != 0) {
               b(var2, var5++, var8[var13 & 255], var8[var13 & 255], 255);
            } else {
               var5++;
            }

            var13 = var3[var7++];
            if (var13 != 0) {
               b(var2, var5++, var8[var13 & 255], var8[var13 & 255], 255);
            } else {
               var5++;
            }

            var13 = var3[var7++];
            if (var13 != 0) {
               b(var2, var5++, var8[var13 & 255], var8[var13 & 255], 255);
            } else {
               var5++;
            }

            var13 = var3[var7++];
            if (var13 != 0) {
               b(var2, var5++, var8[var13 & 255], var8[var13 & 255], 255);
            } else {
               var5++;
            }
         }

         for (int var21 = var6; var21 < 0; var21++) {
            byte var25 = var3[var7++];
            if (var25 != 0) {
               b(var2, var5++, var8[var25 & 255], var8[var25 & 255], 255);
            } else {
               var5++;
            }
         }

         var5 += var4;
         var7 += var9;
      }
   }

   public int i() {
      return 3;
   }

   public int j() {
      return 1;
   }
}
