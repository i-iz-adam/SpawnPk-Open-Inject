package rs.p_w;

final class C_d {
   private C_a c;
   private C_a d;
   private C_a e;
   private C_a f;
   private C_a g;
   private C_a h;
   private C_a i;
   private C_a j;
   private final int[] k = new int[5];
   private final int[] l = new int[5];
   private final int[] m = new int[5];
   private int n;
   private int o = 100;
   private C_b p;
   private C_a q;
   int a = 500;
   int b;
   private static int[] r;
   private static int[] s;
   private static int[] t;
   private static final int[] u = new int[5];
   private static final int[] v = new int[5];
   private static final int[] w = new int[5];
   private static final int[] x = new int[5];
   private static final int[] y = new int[5];

   public static void a() {
      s = new int[32768];

      for (int var0 = 0; var0 < 32768; var0++) {
         if (Math.random() > 0.5) {
            s[var0] = 1;
         } else {
            s[var0] = -1;
         }
      }

      t = new int[32768];

      for (int var1 = 0; var1 < 32768; var1++) {
         t[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
      }

      r = new int[220500];
   }

   public int[] a(int var1, int var2) {
      for (int var3 = 0; var3 < var1; var3++) {
         r[var3] = 0;
      }

      if (var2 < 10) {
         return r;
      } else {
         double var19 = (double)var1 / (double)var2;
         this.c.a();
         this.d.a();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.e != null) {
            this.e.a();
            this.f.a();
            var5 = (int)((double)(this.e.b - this.e.a) * 32.768 / var19);
            var6 = (int)((double)this.e.a * 32.768 / var19);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.g != null) {
            this.g.a();
            this.h.a();
            var8 = (int)((double)(this.g.b - this.g.a) * 32.768 / var19);
            var9 = (int)((double)this.g.a * 32.768 / var19);
         }

         for (int var11 = 0; var11 < 5; var11++) {
            if (this.k[var11] != 0) {
               u[var11] = 0;
               v[var11] = (int)((double)this.m[var11] * var19);
               w[var11] = (this.k[var11] << 14) / 100;
               x[var11] = (int)((double)(this.c.b - this.c.a) * 32.768 * Math.pow(1.0057929410678534, (double)this.l[var11]) / var19);
               y[var11] = (int)((double)this.c.a * 32.768 / var19);
            }
         }

         for (int var20 = 0; var20 < var1; var20++) {
            int var12 = this.c.a(var1);
            int var13 = this.d.a(var1);
            if (this.e != null) {
               int var14 = this.e.a(var1);
               int var15 = this.f.a(var1);
               var12 += this.a(var15, var7, this.e.c) >> 1;
               var7 += (var14 * var5 >> 16) + var6;
            }

            if (this.g != null) {
               int var30 = this.g.a(var1);
               int var34 = this.h.a(var1);
               var13 = var13 * ((this.a(var34, var10, this.g.c) >> 1) + 32768) >> 15;
               var10 += (var30 * var8 >> 16) + var9;
            }

            for (int var31 = 0; var31 < 5; var31++) {
               if (this.k[var31] != 0) {
                  int var35 = var20 + v[var31];
                  if (var35 < var1) {
                     r[var35] = r[var35] + this.a(var13 * w[var31] >> 15, u[var31], this.c.c);
                     u[var31] = u[var31] + (var12 * x[var31] >> 16) + y[var31];
                  }
               }
            }
         }

         if (this.i != null) {
            this.i.a();
            this.j.a();
            short var21 = 0;
            boolean var25 = false;
            boolean var28 = true;

            for (int var32 = 0; var32 < var1; var32++) {
               int var36 = this.i.a(var1);
               int var16 = this.j.a(var1);
               int var17;
               if (var28) {
                  var17 = this.i.a + ((this.i.b - this.i.a) * var36 >> 8);
               } else {
                  var17 = this.i.a + ((this.i.b - this.i.a) * var16 >> 8);
               }

               var21 += 256;
               if (var21 >= var17) {
                  var21 = 0;
                  var28 = !var28;
               }

               if (var28) {
                  r[var32] = 0;
               }
            }
         }

         if (this.n > 0 && this.o > 0) {
            int var22 = (int)((double)this.n * var19);

            for (int var26 = var22; var26 < var1; var26++) {
               r[var26] = r[var26] + r[var26 - var22] * this.o / 100;
            }
         }

         if (this.p.a[0] > 0 || this.p.a[1] > 0) {
            this.q.a();
            int var23 = this.q.a(var1 + 1);
            int var27 = this.p.a(0, (float)var23 / 65536.0F);
            int var29 = this.p.a(1, (float)var23 / 65536.0F);
            if (var1 >= var27 + var29) {
               int var33 = 0;
               int var37 = var29;
               if (var29 > var1 - var27) {
                  var37 = var1 - var27;
               }

               while (var33 < var37) {
                  int var39 = (int)((long)r[var33 + var27] * (long)C_b.c >> 16);

                  for (int var41 = 0; var41 < var27; var41++) {
                     var39 += (int)((long)r[var33 + var27 - 1 - var41] * (long)C_b.b[0][var41] >> 16);
                  }

                  for (int var42 = 0; var42 < var33; var42++) {
                     var39 -= (int)((long)r[var33 - 1 - var42] * (long)C_b.b[1][var42] >> 16);
                  }

                  r[var33] = var39;
                  var23 = this.q.a(var1 + 1);
                  var33++;
               }

               short var40 = 128;
               var37 = var40;

               while (true) {
                  if (var37 > var1 - var27) {
                     var37 = var1 - var27;
                  }

                  while (var33 < var37) {
                     int var43 = (int)((long)r[var33 + var27] * (long)C_b.c >> 16);

                     for (int var18 = 0; var18 < var27; var18++) {
                        var43 += (int)((long)r[var33 + var27 - 1 - var18] * (long)C_b.b[0][var18] >> 16);
                     }

                     for (int var45 = 0; var45 < var29; var45++) {
                        var43 -= (int)((long)r[var33 - 1 - var45] * (long)C_b.b[1][var45] >> 16);
                     }

                     r[var33] = var43;
                     var23 = this.q.a(var1 + 1);
                     var33++;
                  }

                  if (var33 >= var1 - var27) {
                     while (var33 < var1) {
                        int var44 = 0;

                        for (int var46 = var33 + var27 - var1; var46 < var27; var46++) {
                           var44 += (int)((long)r[var33 + var27 - 1 - var46] * (long)C_b.b[0][var46] >> 16);
                        }

                        for (int var47 = 0; var47 < var29; var47++) {
                           var44 -= (int)((long)r[var33 - 1 - var47] * (long)C_b.b[1][var47] >> 16);
                        }

                        r[var33] = var44;
                        int var48 = this.q.a(var1 + 1);
                        var33++;
                     }
                     break;
                  }

                  var27 = this.p.a(0, (float)var23 / 65536.0F);
                  var29 = this.p.a(1, (float)var23 / 65536.0F);
                  var37 += var40;
               }
            }
         }

         for (int var24 = 0; var24 < var1; var24++) {
            if (r[var24] < -32768) {
               r[var24] = -32768;
            }

            if (r[var24] > 32767) {
               r[var24] = 32767;
            }
         }

         return r;
      }
   }

   private int a(int var1, int var2, int var3) {
      if (var3 == 1) {
         return (var2 & 32767) < 16384 ? var1 : -var1;
      } else if (var3 == 2) {
         return t[var2 & 32767] * var1 >> 14;
      } else if (var3 == 3) {
         return ((var2 & 32767) * var1 >> 14) - var1;
      } else {
         return var3 == 4 ? s[var2 / 2607 & 32767] * var1 : 0;
      }
   }

   public void a(rs.p_x.C_e var1) {
      this.c = new C_a();
      this.c.a(var1);
      this.d = new C_a();
      this.d.a(var1);
      int var2 = var1.y();
      if (var2 != 0) {
         var1.h--;
         this.e = new C_a();
         this.e.a(var1);
         this.f = new C_a();
         this.f.a(var1);
      }

      var2 = var1.y();
      if (var2 != 0) {
         var1.h--;
         this.g = new C_a();
         this.g.a(var1);
         this.h = new C_a();
         this.h.a(var1);
      }

      var2 = var1.y();
      if (var2 != 0) {
         var1.h--;
         this.i = new C_a();
         this.i.a(var1);
         this.j = new C_a();
         this.j.a(var1);
      }

      for (int var3 = 0; var3 < 10; var3++) {
         int var4 = var1.f();
         if (var4 == 0) {
            break;
         }

         this.k[var3] = var4;
         this.l[var3] = var1.n();
         this.m[var3] = var1.f();
      }

      this.n = var1.f();
      this.o = var1.f();
      this.a = var1.A();
      this.b = var1.A();
      this.p = new C_b();
      this.q = new C_a();
      this.p.a(var1, this.q);
   }

   public C_d() {
   }
}
