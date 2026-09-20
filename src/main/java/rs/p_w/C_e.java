package rs.p_w;

public final class C_e {
   private static final C_e[] b = new C_e[105000];
   public static final int[] a = new int[105000];
   private static byte[] c;
   private static rs.p_x.C_e d;
   private final C_d[] e = new C_d[10];
   private int f;
   private int g;

   private C_e() {
   }

   public static void a(rs.p_x.C_e var0) {
      c = new byte[441000];
      d = new rs.p_x.C_e(c);
      C_d.a();

      while (true) {
         int var1 = var0.A();
         if (var1 == 65535) {
            return;
         }

         b[var1] = new C_e();
         b[var1].b(var0);
         a[var1] = b[var1].a();
      }
   }

   public static rs.p_x.C_e a(int var0, int var1) {
      if (b[var1] != null) {
         C_e var2 = b[var1];
         return var2.a(var0);
      } else {
         return null;
      }
   }

   private void b(rs.p_x.C_e var1) {
      for (int var2 = 0; var2 < 10; var2++) {
         int var3 = var1.y();
         if (var3 != 0) {
            var1.h--;
            this.e[var2] = new C_d();
            this.e[var2].a(var1);
         }
      }

      this.f = var1.A();
      this.g = var1.A();
   }

   private int a() {
      int var1 = 9999999;

      for (int var2 = 0; var2 < 10; var2++) {
         if (this.e[var2] != null && this.e[var2].b / 20 < var1) {
            var1 = this.e[var2].b / 20;
         }
      }

      if (this.f < this.g && this.f / 20 < var1) {
         var1 = this.f / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for (int var3 = 0; var3 < 10; var3++) {
            if (this.e[var3] != null) {
               this.e[var3].b -= var1 * 20;
            }
         }

         if (this.f < this.g) {
            this.f -= var1 * 20;
            this.g -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   private rs.p_x.C_e a(int var1) {
      int var2 = this.b(var1);
      d.h = 0;
      d.g(1380533830);
      d.h(36 + var2);
      d.g(1463899717);
      d.g(1718449184);
      d.h(16);
      d.e(1);
      d.e(1);
      d.h(22050);
      d.h(22050);
      d.e(1);
      d.e(8);
      d.g(1684108385);
      d.h(var2);
      d.h += var2;
      return d;
   }

   private int b(int var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < 10; var3++) {
         if (this.e[var3] != null && this.e[var3].a + this.e[var3].b > var2) {
            var2 = this.e[var3].a + this.e[var3].b;
         }
      }

      if (var2 == 0) {
         return 0;
      } else {
         int var12 = 22050 * var2 / 1000;
         int var4 = 22050 * this.f / 1000;
         int var5 = 22050 * this.g / 1000;
         if (var4 < 0 || var4 > var12 || var5 < 0 || var5 > var12 || var4 >= var5) {
            var1 = 0;
         }

         int var6 = var12 + (var5 - var4) * (var1 - 1);

         for (int var7 = 44; var7 < var6 + 44; var7++) {
            c[var7] = -128;
         }

         for (int var17 = 0; var17 < 10; var17++) {
            if (this.e[var17] != null) {
               int var8 = this.e[var17].a * 22050 / 1000;
               int var9 = this.e[var17].b * 22050 / 1000;
               int[] var10 = this.e[var17].a(var8, this.e[var17].a);

               for (int var11 = 0; var11 < var8; var11++) {
                  c[var11 + var9 + 44] = (byte)(c[var11 + var9 + 44] + (byte)(var10[var11] >> 8));
               }
            }
         }

         if (var1 > 1) {
            var4 += 44;
            var5 += 44;
            var12 += 44;
            var6 += 44;
            int var18 = var6 - var12;

            for (int var19 = var12 - 1; var19 >= var5; var19--) {
               c[var19 + var18] = c[var19];
            }

            for (int var20 = 1; var20 < var1; var20++) {
               int var21 = (var5 - var4) * var20;
               System.arraycopy(c, var4, c, var4 + var21, var5 - var4);
            }

            var6 -= 44;
         }

         return var6;
      }
   }
}
