package rs.p_q;

public final class C_a {
   private int a;
   private final int[] b;
   private final int[] c = new int[256];
   private int d;
   private int e;
   private int f;

   public C_a(int[] var1) {
      this.b = new int[256];
      System.arraycopy(var1, 0, this.b, 0, var1.length);
      this.c();
   }

   public int a() {
      if (this.a-- == 0) {
         this.b();
         this.a = 255;
      }

      return this.b[this.a];
   }

   private void b() {
      this.e = this.e + ++this.f;

      for (int var1 = 0; var1 < 256; var1++) {
         int var2 = this.c[var1];
         if ((var1 & 3) == 0) {
            this.d = this.d ^ this.d << 13;
         } else if ((var1 & 3) == 1) {
            this.d = this.d ^ this.d >>> 6;
         } else if ((var1 & 3) == 2) {
            this.d = this.d ^ this.d << 2;
         } else if ((var1 & 3) == 3) {
            this.d = this.d ^ this.d >>> 16;
         }

         this.d = this.d + this.c[var1 + 128 & 0xFF];
         int var3;
         this.c[var1] = var3 = this.c[(var2 & 1020) >> 2] + this.d + this.e;
         this.b[var1] = this.e = this.c[(var3 >> 8 & 1020) >> 2] + var2;
      }
   }

   private void c() {
      int var7 = -1640531527;
      int var6 = -1640531527;
      int var5 = -1640531527;
      int var4 = -1640531527;
      int var3 = -1640531527;
      int var2 = -1640531527;
      int var1 = -1640531527;
      int var8 = -1640531527;

      for (int var9 = 0; var9 < 4; var9++) {
         var8 ^= var1 << 11;
         int var26 = var3 + var8;
         int var10 = var1 + var2;
         int var11 = var10 ^ var2 >>> 2;
         int var34 = var4 + var11;
         var2 += var26;
         var2 ^= var26 << 8;
         int var42 = var5 + var2;
         int var27 = var26 + var34;
         var3 = var27 ^ var34 >>> 16;
         int var50 = var6 + var3;
         int var35 = var34 + var42;
         var4 = var35 ^ var42 << 10;
         int var58 = var7 + var4;
         int var43 = var42 + var50;
         var5 = var43 ^ var50 >>> 4;
         var8 += var5;
         int var51 = var50 + var58;
         var6 = var51 ^ var58 << 8;
         var1 = var11 + var6;
         int var59 = var58 + var8;
         var7 = var59 ^ var8 >>> 9;
         var2 += var7;
         var8 += var1;
      }

      for (byte var74 = 0; var74 < 256; var74 += 8) {
         int var68 = var8 + this.b[var74];
         int var12 = var1 + this.b[var74 + 1];
         int var20 = var2 + this.b[var74 + 2];
         int var28 = var3 + this.b[var74 + 3];
         int var36 = var4 + this.b[var74 + 4];
         int var44 = var5 + this.b[var74 + 5];
         int var52 = var6 + this.b[var74 + 6];
         int var60 = var7 + this.b[var74 + 7];
         int var69 = var68 ^ var12 << 11;
         int var29 = var28 + var69;
         int var13 = var12 + var20;
         int var14 = var13 ^ var20 >>> 2;
         int var37 = var36 + var14;
         int var21 = var20 + var29;
         int var22 = var21 ^ var29 << 8;
         int var45 = var44 + var22;
         int var30 = var29 + var37;
         var3 = var30 ^ var37 >>> 16;
         int var53 = var52 + var3;
         int var38 = var37 + var45;
         var4 = var38 ^ var45 << 10;
         int var61 = var60 + var4;
         int var46 = var45 + var53;
         var5 = var46 ^ var53 >>> 4;
         int var70 = var69 + var5;
         int var54 = var53 + var61;
         var6 = var54 ^ var61 << 8;
         var1 = var14 + var6;
         int var62 = var61 + var70;
         var7 = var62 ^ var70 >>> 9;
         var2 = var22 + var7;
         var8 = var70 + var1;
         this.c[var74] = var8;
         this.c[var74 + 1] = var1;
         this.c[var74 + 2] = var2;
         this.c[var74 + 3] = var3;
         this.c[var74 + 4] = var4;
         this.c[var74 + 5] = var5;
         this.c[var74 + 6] = var6;
         this.c[var74 + 7] = var7;
      }

      for (byte var75 = 0; var75 < 256; var75 += 8) {
         int var71 = var8 + this.c[var75];
         int var15 = var1 + this.c[var75 + 1];
         int var23 = var2 + this.c[var75 + 2];
         int var31 = var3 + this.c[var75 + 3];
         int var39 = var4 + this.c[var75 + 4];
         int var47 = var5 + this.c[var75 + 5];
         int var55 = var6 + this.c[var75 + 6];
         int var63 = var7 + this.c[var75 + 7];
         int var72 = var71 ^ var15 << 11;
         int var32 = var31 + var72;
         int var16 = var15 + var23;
         int var17 = var16 ^ var23 >>> 2;
         int var40 = var39 + var17;
         int var24 = var23 + var32;
         int var25 = var24 ^ var32 << 8;
         int var48 = var47 + var25;
         int var33 = var32 + var40;
         var3 = var33 ^ var40 >>> 16;
         int var56 = var55 + var3;
         int var41 = var40 + var48;
         var4 = var41 ^ var48 << 10;
         int var64 = var63 + var4;
         int var49 = var48 + var56;
         var5 = var49 ^ var56 >>> 4;
         int var73 = var72 + var5;
         int var57 = var56 + var64;
         var6 = var57 ^ var64 << 8;
         var1 = var17 + var6;
         int var65 = var64 + var73;
         var7 = var65 ^ var73 >>> 9;
         var2 = var25 + var7;
         var8 = var73 + var1;
         this.c[var75] = var8;
         this.c[var75 + 1] = var1;
         this.c[var75 + 2] = var2;
         this.c[var75 + 3] = var3;
         this.c[var75 + 4] = var4;
         this.c[var75 + 5] = var5;
         this.c[var75 + 6] = var6;
         this.c[var75 + 7] = var7;
      }

      this.b();
      this.a = 256;
   }
}
