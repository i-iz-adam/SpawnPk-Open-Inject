package rs.p_x;

final class C_a {
   private static final C_b a = new C_b();

   public static int a(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      synchronized (a) {
         a.a = var2;
         a.b = var4;
         a.f = var0;
         a.g = 0;
         a.c = var3;
         a.h = var1;
         a.o = 0;
         a.n = 0;
         a.d = 0;
         a.e = 0;
         a.i = 0;
         a.j = 0;
         a.q = 0;
         b(a);
         return var1 - a.h;
      }
   }

   private static void a(C_b var0) {
      byte var1 = var0.k;
      int var2 = var0.l;
      int var3 = var0.v;
      int var4 = var0.t;
      int[] var5 = C_b.x;
      int var6 = var0.s;
      byte[] var7 = var0.f;
      int var8 = var0.g;
      int var9 = var0.h;
      int var10 = var9;
      int var11 = var0.L + 1;

      label68:
      while (true) {
         if (var2 > 0) {
            while (true) {
               if (var9 == 0) {
                  break label68;
               }

               if (var2 == 1) {
                  if (var9 == 0) {
                     var2 = 1;
                     break label68;
                  }

                  var7[var8] = var1;
                  var8++;
                  var9--;
                  break;
               }

               var7[var8] = var1;
               var2--;
               var8++;
               var9--;
            }
         }

         boolean var12 = true;

         while (var12) {
            var12 = false;
            if (var3 == var11) {
               var2 = 0;
               break label68;
            }

            var1 = (byte)var4;
            var6 = var5[var6];
            byte var13 = (byte)(var6 & 0xFF);
            var6 >>= 8;
            var3++;
            if (var13 != var4) {
               var4 = var13;
               if (var9 == 0) {
                  var2 = 1;
                  break label68;
               }

               var7[var8] = var1;
               var8++;
               var9--;
               var12 = true;
            } else if (var3 == var11) {
               if (var9 == 0) {
                  var2 = 1;
                  break label68;
               }

               var7[var8] = var1;
               var8++;
               var9--;
               var12 = true;
            }
         }

         var2 = 2;
         var6 = var5[var6];
         byte var24 = (byte)(var6 & 0xFF);
         var6 >>= 8;
         if (++var3 != var11) {
            if (var24 != var4) {
               var4 = var24;
            } else {
               var2 = 3;
               var6 = var5[var6];
               byte var14 = (byte)(var6 & 0xFF);
               var6 >>= 8;
               if (++var3 != var11) {
                  if (var14 != var4) {
                     var4 = var14;
                  } else {
                     var6 = var5[var6];
                     byte var15 = (byte)(var6 & 0xFF);
                     var6 >>= 8;
                     var3++;
                     var2 = (var15 & 255) + 4;
                     var6 = var5[var6];
                     var4 = (byte)(var6 & 0xFF);
                     var6 >>= 8;
                     var3++;
                  }
               }
            }
         }
      }

      int var23 = var0.i;
      var0.i += var10 - var9;
      if (var0.i < var23) {
         var0.j++;
      }

      var0.k = var1;
      var0.l = var2;
      var0.v = var3;
      var0.t = var4;
      C_b.x = var5;
      var0.s = var6;
      var0.f = var7;
      var0.g = var8;
      var0.h = var9;
   }

   private static void b(C_b var0) {
      int var1 = 0;
      int[] var2 = null;
      int[] var3 = null;
      int[] var4 = null;
      var0.p = 1;
      if (C_b.x == null) {
         C_b.x = new int[var0.p * 100000];
      }

      for (boolean var5 = true; var5; var5 = var0.v == var0.L + 1 && var0.l == 0) {
         byte var6 = c(var0);
         if (var6 == 23) {
            return;
         }

         var6 = c(var0);
         var6 = c(var0);
         var6 = c(var0);
         var6 = c(var0);
         var6 = c(var0);
         var0.q++;
         var6 = c(var0);
         var6 = c(var0);
         var6 = c(var0);
         var6 = c(var0);
         var6 = d(var0);
         var0.m = var6 != 0;
         if (var0.m) {
            System.out.println("PANIC! RANDOMISED BLOCK!");
         }

         var0.r = 0;
         var6 = c(var0);
         var0.r = var0.r << 8 | var6 & 255;
         var6 = c(var0);
         var0.r = var0.r << 8 | var6 & 255;
         var6 = c(var0);
         var0.r = var0.r << 8 | var6 & 255;

         for (int var7 = 0; var7 < 16; var7++) {
            byte var8 = d(var0);
            var0.A[var7] = var8 == 1;
         }

         for (int var41 = 0; var41 < 256; var41++) {
            var0.z[var41] = false;
         }

         for (int var42 = 0; var42 < 16; var42++) {
            if (var0.A[var42]) {
               for (int var44 = 0; var44 < 16; var44++) {
                  byte var9 = d(var0);
                  if (var9 == 1) {
                     var0.z[var42 * 16 + var44] = true;
                  }
               }
            }
         }

         e(var0);
         int var43 = var0.y + 2;
         int var45 = a(3, var0);
         int var46 = a(15, var0);

         for (int var10 = 0; var10 < var46; var10++) {
            int var11 = 0;

            while (true) {
               byte var12 = d(var0);
               if (var12 == 0) {
                  var0.F[var10] = (byte)var11;
                  break;
               }

               var11++;
            }
         }

         byte[] var47 = new byte[6];
         int var48 = 0;

         while (var48 < var45) {
            var47[var48] = var48++;
         }

         for (int var49 = 0; var49 < var46; var49++) {
            byte var53 = var0.F[var49];

            byte var13;
            for (var13 = var47[var53]; var53 > 0; var53--) {
               var47[var53] = var47[var53 - 1];
            }

            var47[0] = var13;
            var0.E[var49] = var13;
         }

         for (int var50 = 0; var50 < var45; var50++) {
            int var54 = a(5, var0);

            for (int var57 = 0; var57 < var43; var57++) {
               while (true) {
                  byte var14 = d(var0);
                  if (var14 == 0) {
                     var0.G[var50][var57] = (byte)var54;
                     break;
                  }

                  var14 = d(var0);
                  if (var14 == 0) {
                     var54++;
                  } else {
                     var54--;
                  }
               }
            }
         }

         for (int var51 = 0; var51 < var45; var51++) {
            byte var55 = 32;
            byte var58 = 0;

            for (int var62 = 0; var62 < var43; var62++) {
               if (var0.G[var51][var62] > var58) {
                  var58 = var0.G[var51][var62];
               }

               if (var0.G[var51][var62] < var55) {
                  var55 = var0.G[var51][var62];
               }
            }

            a(var0.H[var51], var0.I[var51], var0.J[var51], var0.G[var51], var55, var58, var43);
            var0.K[var51] = var55;
         }

         var48 = var0.y + 1;
         int var56 = -1;
         int var59 = 0;

         for (int var63 = 0; var63 <= 255; var63++) {
            var0.u[var63] = 0;
         }

         int var64 = 4095;

         for (int var15 = 15; var15 >= 0; var15--) {
            for (int var16 = 15; var16 >= 0; var16--) {
               var0.C[var64] = (byte)(var15 * 16 + var16);
               var64--;
            }

            var0.D[var15] = var64 + 1;
         }

         int var65 = 0;
         if (var59 == 0) {
            var56++;
            var59 = 50;
            byte var66 = var0.E[var56];
            var1 = var0.K[var66];
            var2 = var0.H[var66];
            var4 = var0.J[var66];
            var3 = var0.I[var66];
         }

         var59--;
         int var67 = var1;
         int var17 = a(var1, var0);

         while (var17 > var2[var67]) {
            var67++;
            byte var18 = d(var0);
            var17 = var17 << 1 | var18;
         }

         int var19 = var4[var17 - var3[var67]];

         while (var19 != var48) {
            if (var19 != 0 && var19 != 1) {
               int var72 = var19 - 1;
               byte var74;
               if (var72 < 16) {
                  int var78 = var0.D[0];

                  for (var74 = var0.C[var78 + var72]; var72 > 3; var72 -= 4) {
                     int var82 = var78 + var72;
                     var0.C[var82] = var0.C[var82 - 1];
                     var0.C[var82 - 1] = var0.C[var82 - 2];
                     var0.C[var82 - 2] = var0.C[var82 - 3];
                     var0.C[var82 - 3] = var0.C[var82 - 4];
                  }

                  while (var72 > 0) {
                     var0.C[var78 + var72] = var0.C[var78 + var72 - 1];
                     var72--;
                  }

                  var0.C[var78] = var74;
               } else {
                  int var77 = var72 / 16;
                  int var81 = var72 % 16;
                  int var84 = var0.D[var77] + var81;

                  for (var74 = var0.C[var84]; var84 > var0.D[var77]; var84--) {
                     var0.C[var84] = var0.C[var84 - 1];
                  }

                  var0.D[var77]++;

                  while (var77 > 0) {
                     var0.D[var77]--;
                     var0.C[var0.D[var77]] = var0.C[var0.D[var77 - 1] + 16 - 1];
                     var77--;
                  }

                  var0.D[0]--;
                  var0.C[var0.D[0]] = var74;
                  if (var0.D[0] == 0) {
                     int var25 = 4095;

                     for (int var26 = 15; var26 >= 0; var26--) {
                        for (int var27 = 15; var27 >= 0; var27--) {
                           var0.C[var25] = var0.C[var0.D[var26] + var27];
                           var25--;
                        }

                        var0.D[var26] = var25 + 1;
                     }
                  }
               }

               var0.u[var0.B[var74 & 255] & 255]++;
               C_b.x[var65] = var0.B[var74 & 255] & 255;
               var65++;
               if (var59 == 0) {
                  var56++;
                  var59 = 50;
                  byte var79 = var0.E[var56];
                  var1 = var0.K[var79];
                  var2 = var0.H[var79];
                  var4 = var0.J[var79];
                  var3 = var0.I[var79];
               }

               var59--;
               int var80 = var1;
               int var83 = a(var1, var0);

               while (var83 > var2[var80]) {
                  var80++;
                  byte var85 = d(var0);
                  var83 = var83 << 1 | var85;
               }

               var19 = var4[var83 - var3[var80]];
            } else {
               int var20 = -1;
               byte var21 = 1;

               do {
                  if (var19 == 0) {
                     var20 += var21;
                  } else if (var19 == 1) {
                     var20 += 2 * var21;
                  }

                  var21 *= 2;
                  if (var59 == 0) {
                     var56++;
                     var59 = 50;
                     byte var22 = var0.E[var56];
                     var1 = var0.K[var22];
                     var2 = var0.H[var22];
                     var4 = var0.J[var22];
                     var3 = var0.I[var22];
                  }

                  var59--;
                  int var75 = var1;
                  int var23 = a(var1, var0);

                  while (var23 > var2[var75]) {
                     var75++;
                     byte var24 = d(var0);
                     var23 = var23 << 1 | var24;
                  }

                  var19 = var4[var23 - var3[var75]];
               } while (var19 == 0 || var19 == 1);

               var20++;
               byte var76 = var0.B[var0.C[var0.D[0]] & 255];

               for (var0.u[var76 & 255] = var0.u[var76 & 255] + var20; var20 > 0; var20--) {
                  C_b.x[var65] = var76 & 255;
                  var65++;
               }
            }
         }

         var0.l = 0;
         var0.k = 0;
         var0.w[0] = 0;

         for (int var68 = 1; var68 <= 256; var68++) {
            var0.w[var68] = var0.u[var68 - 1];
         }

         for (int var69 = 1; var69 <= 256; var69++) {
            var0.w[var69] = var0.w[var69] + var0.w[var69 - 1];
         }

         for (int var70 = 0; var70 < var65; var70++) {
            byte var73 = (byte)(C_b.x[var70] & 0xFF);
            C_b.x[var0.w[var73 & 255]] = C_b.x[var0.w[var73 & 255]] | var70 << 8;
            var0.w[var73 & 255]++;
         }

         var0.s = C_b.x[var0.r] >> 8;
         var0.v = 0;
         var0.s = C_b.x[var0.s];
         var0.t = (byte)(var0.s & 0xFF);
         var0.s >>= 8;
         var0.v++;
         var0.L = var65;
         a(var0);
      }
   }

   private static byte c(C_b var0) {
      return (byte)a(8, var0);
   }

   private static byte d(C_b var0) {
      return (byte)a(1, var0);
   }

   private static int a(int var0, C_b var1) {
      while (var1.o < var0) {
         var1.n = var1.n << 8 | var1.a[var1.b] & 255;
         var1.o += 8;
         var1.b++;
         var1.c--;
         var1.d++;
         if (var1.d == 0) {
            var1.e++;
         }
      }

      int var3 = var1.n >> var1.o - var0 & (1 << var0) - 1;
      var1.o -= var0;
      return var3;
   }

   private static void e(C_b var0) {
      var0.y = 0;

      for (int var1 = 0; var1 < 256; var1++) {
         if (var0.z[var1]) {
            var0.B[var0.y] = (byte)var1;
            var0.y++;
         }
      }
   }

   private static void a(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      for (int var8 = var4; var8 <= var5; var8++) {
         for (int var9 = 0; var9 < var6; var9++) {
            if (var3[var9] == var8) {
               var2[var7] = var9;
               var7++;
            }
         }
      }

      for (int var10 = 0; var10 < 23; var10++) {
         var1[var10] = 0;
      }

      for (int var11 = 0; var11 < var6; var11++) {
         var1[var3[var11] + 1]++;
      }

      for (int var12 = 1; var12 < 23; var12++) {
         var1[var12] += var1[var12 - 1];
      }

      for (int var13 = 0; var13 < 23; var13++) {
         var0[var13] = 0;
      }

      int var14 = 0;

      for (int var16 = var4; var16 <= var5; var16++) {
         var14 += var1[var16 + 1] - var1[var16];
         var0[var16] = var14 - 1;
         var14 <<= 1;
      }

      for (int var17 = var4 + 1; var17 <= var5; var17++) {
         var1[var17] = (var0[var17 - 1] + 1 << 1) - var1[var17];
      }
   }
}
