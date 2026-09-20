package rs;

public final class C_I_uc {
   public int a = -1;
   public int b = -1;
   public int c = -1;
   public final int[] d;
   public final int[] e;
   public final int[] f;
   public final int[] g;
   public final int[] h;
   public final int[] i;
   public final int[] j;
   public final int[] k;
   public final int[] l;
   int[] m;
   public final boolean n;
   public final int o;
   public final int p;
   public final int q;
   public final int r;
   public static final int[] s = new int[6];
   public static final int[] t = new int[6];
   public static final int[] u = new int[6];
   public static final int[] v = new int[6];
   public static final int[] w = new int[6];
   public static final int[] x = new int[6];
   public static final int[] y = new int[]{1, 0};
   public static final int[] z = new int[]{2, 1};
   public static final int[] A = new int[]{3, 3};
   private static final int[][] B = new int[][]{
      {1, 3, 5, 7},
      {1, 3, 5, 7},
      {1, 3, 5, 7},
      {1, 3, 5, 7, 6},
      {1, 3, 5, 7, 6},
      {1, 3, 5, 7, 6},
      {1, 3, 5, 7, 6},
      {1, 3, 5, 7, 2, 6},
      {1, 3, 5, 7, 2, 8},
      {1, 3, 5, 7, 2, 8},
      {1, 3, 5, 7, 11, 12},
      {1, 3, 5, 7, 11, 12},
      {1, 3, 5, 7, 13, 14}
   };
   private static final int[][] C = new int[][]{
      {0, 1, 2, 3, 0, 0, 1, 3},
      {1, 1, 2, 3, 1, 0, 1, 3},
      {0, 1, 2, 3, 1, 0, 1, 3},
      {0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3},
      {0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4},
      {0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4},
      {0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3},
      {0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3},
      {0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5},
      {0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5},
      {0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3},
      {1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3},
      {1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5}
   };

   public void a(int var1) {
      this.a = var1;
   }

   public void b(int var1) {
      this.b = var1;
   }

   public void c(int var1) {
      this.c = var1;
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }

   public int[] d() {
      return this.d;
   }

   public int[] e() {
      return this.e;
   }

   public int[] f() {
      return this.f;
   }

   public int[] g() {
      return rs.p_k.C_e.a ? this.m : null;
   }

   public int[] h() {
      return this.j;
   }

   public int[] i() {
      return this.k;
   }

   public int[] j() {
      return this.l;
   }

   public int[] k() {
      return this.g;
   }

   public int[] l() {
      return this.h;
   }

   public int[] m() {
      return this.i;
   }

   public C_I_uc(
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19
   ) {
      this.n = var13 == var12 && var13 == var4 && var13 == var11;
      this.o = var14;
      this.p = var7;
      this.q = var9;
      this.r = var19;
      short var20 = 128;
      int var21 = var20 / 2;
      int var22 = var20 / 4;
      int var23 = var20 * 3 / 4;
      int[] var24 = B[var14];
      int var25 = var24.length;
      this.d = new int[var25];
      this.e = new int[var25];
      this.f = new int[var25];
      int[] var26 = new int[var25];
      int[] var27 = new int[var25];
      int var28 = var18 * var20;
      int var29 = var1 * var20;

      for (int var30 = 0; var30 < var25; var30++) {
         int var31 = var24[var30];
         if ((var31 & 1) == 0 && var31 <= 8) {
            var31 = (var31 - var7 - var7 - 1 & 7) + 1;
         }

         if (var31 > 8 && var31 <= 12) {
            var31 = (var31 - 9 - var7 & 3) + 9;
         }

         if (var31 > 12 && var31 <= 16) {
            var31 = (var31 - 13 - var7 & 3) + 13;
         }

         int var32;
         int var33;
         int var34;
         int var35;
         int var36;
         if (var31 == 1) {
            var32 = var28;
            var33 = var29;
            var34 = var13;
            var35 = var8;
            var36 = var2;
         } else if (var31 == 2) {
            var32 = var28 + var21;
            var33 = var29;
            var34 = var13 + var12 >> 1;
            var35 = var8 + var17 >> 1;
            var36 = var2 + var16 >> 1;
         } else if (var31 == 3) {
            var32 = var28 + var20;
            var33 = var29;
            var34 = var12;
            var35 = var17;
            var36 = var16;
         } else if (var31 == 4) {
            var32 = var28 + var20;
            var33 = var29 + var21;
            var34 = var12 + var4 >> 1;
            var35 = var17 + var10 >> 1;
            var36 = var16 + var6 >> 1;
         } else if (var31 == 5) {
            var32 = var28 + var20;
            var33 = var29 + var20;
            var34 = var4;
            var35 = var10;
            var36 = var6;
         } else if (var31 == 6) {
            var32 = var28 + var21;
            var33 = var29 + var20;
            var34 = var4 + var11 >> 1;
            var35 = var10 + var3 >> 1;
            var36 = var6 + var15 >> 1;
         } else if (var31 == 7) {
            var32 = var28;
            var33 = var29 + var20;
            var34 = var11;
            var35 = var3;
            var36 = var15;
         } else if (var31 == 8) {
            var32 = var28;
            var33 = var29 + var21;
            var34 = var11 + var13 >> 1;
            var35 = var3 + var8 >> 1;
            var36 = var15 + var2 >> 1;
         } else if (var31 == 9) {
            var32 = var28 + var21;
            var33 = var29 + var22;
            var34 = var13 + var12 >> 1;
            var35 = var8 + var17 >> 1;
            var36 = var2 + var16 >> 1;
         } else if (var31 == 10) {
            var32 = var28 + var23;
            var33 = var29 + var21;
            var34 = var12 + var4 >> 1;
            var35 = var17 + var10 >> 1;
            var36 = var16 + var6 >> 1;
         } else if (var31 == 11) {
            var32 = var28 + var21;
            var33 = var29 + var23;
            var34 = var4 + var11 >> 1;
            var35 = var10 + var3 >> 1;
            var36 = var6 + var15 >> 1;
         } else if (var31 == 12) {
            var32 = var28 + var22;
            var33 = var29 + var21;
            var34 = var11 + var13 >> 1;
            var35 = var3 + var8 >> 1;
            var36 = var15 + var2 >> 1;
         } else if (var31 == 13) {
            var32 = var28 + var22;
            var33 = var29 + var22;
            var34 = var13;
            var35 = var8;
            var36 = var2;
         } else if (var31 == 14) {
            var32 = var28 + var23;
            var33 = var29 + var22;
            var34 = var12;
            var35 = var17;
            var36 = var16;
         } else if (var31 == 15) {
            var32 = var28 + var23;
            var33 = var29 + var23;
            var34 = var4;
            var35 = var10;
            var36 = var6;
         } else {
            var32 = var28 + var22;
            var33 = var29 + var23;
            var34 = var11;
            var35 = var3;
            var36 = var15;
         }

         this.d[var30] = var32;
         this.e[var30] = var34;
         this.f[var30] = var33;
         var26[var30] = var35;
         var27[var30] = var36;
      }

      int[] var38 = C[var14];
      int var39 = var38.length / 4;
      this.j = new int[var39];
      this.k = new int[var39];
      this.l = new int[var39];
      this.g = new int[var39];
      this.h = new int[var39];
      this.i = new int[var39];
      if (var5 != -1) {
         this.m = new int[var39];
      }

      byte var40 = 0;

      for (int var41 = 0; var41 < var39; var41++) {
         int var44 = var38[var40];
         int var47 = var38[var40 + 1];
         int var48 = var38[var40 + 2];
         int var37 = var38[var40 + 3];
         var40 += 4;
         if (var47 < 4) {
            var47 = var47 - var7 & 3;
         }

         if (var48 < 4) {
            var48 = var48 - var7 & 3;
         }

         if (var37 < 4) {
            var37 = var37 - var7 & 3;
         }

         this.j[var41] = var47;
         this.k[var41] = var48;
         this.l[var41] = var37;
         if (var44 == 0) {
            this.g[var41] = var26[var47];
            this.h[var41] = var26[var48];
            this.i[var41] = var26[var37];
            if (this.m != null) {
               this.m[var41] = -1;
            }
         } else {
            this.g[var41] = var27[var47];
            this.h[var41] = var27[var48];
            this.i[var41] = var27[var37];
            if (this.m != null) {
               this.m[var41] = var5;
            }
         }
      }

      int var42 = var13;
      int var45 = var12;
      if (var12 < var13) {
         var42 = var12;
      }

      if (var12 > var12) {
         var45 = var12;
      }

      if (var4 < var42) {
         var42 = var4;
      }

      if (var4 > var45) {
         var45 = var4;
      }

      if (var11 < var42) {
         var42 = var11;
      }

      if (var11 > var45) {
         var45 = var11;
      }

      var42 /= 14;
      var45 /= 14;
   }
}
