package rs.p_u;

public class C_g {
   boolean a;
   boolean b;
   boolean c = true;
   boolean d;
   C_i e;
   C_i f;
   C_a[] g;
   float h;
   float i;
   float j;
   float k;
   float[] l = new float[4];
   float[] m = new float[4];
   float[] n;
   int o = 0;
   int p;
   int q;

   public int a(rs.p_x.C_e var1, int var2) {
      int var3 = var1.o();
      var1.y();
      this.f = C_i.a(var1.y());
      this.e = C_i.a(var1.y());
      this.b = var1.y() != 0;
      this.g = new C_a[var3];
      C_a var4 = null;

      for (int var5 = 0; var5 < var3; var5++) {
         C_a var6 = new C_a();
         var6.a(var1, var2);
         this.g[var5] = var6;
         if (null != var4) {
            var4.a = var6;
         }

         var4 = var6;
      }

      this.p = this.g[0].g;
      this.q = this.g[this.d() - 1].g;
      this.n = new float[this.c() + 1];

      for (int var7 = this.a(); var7 <= this.b(); var7++) {
         this.n[var7 - this.a()] = a(this, (float)var7);
      }

      this.g = null;
      this.j = a(this, (float)(this.a() - 1));
      this.k = a(this, (float)(this.b() + 1));
      return var3;
   }

   public float a(int var1) {
      if (var1 < this.a()) {
         return this.j;
      } else {
         return var1 > this.b() ? this.k : this.n[var1 - this.a()];
      }
   }

   int a() {
      return this.p;
   }

   int b() {
      return this.q;
   }

   int c() {
      return this.b() - this.a();
   }

   int a(float var1) {
      if (this.o < 0 || !((float)this.g[this.o].g <= var1) || null != this.g[this.o].a && !((float)this.g[this.o].a.g > var1)) {
         if (!(var1 < (float)this.a()) && !(var1 > (float)this.b())) {
            int var2 = this.d();
            int var3 = this.o;
            if (var2 > 0) {
               int var4 = 0;
               int var5 = var2 - 1;

               do {
                  int var6 = var5 + var4 >> 1;
                  if (var1 < (float)this.g[var6].g) {
                     if (var1 > (float)this.g[var6 - 1].g) {
                        var3 = var6 - 1;
                        break;
                     }

                     var5 = var6 - 1;
                  } else {
                     if (!(var1 > (float)this.g[var6].g)) {
                        var3 = var6;
                        break;
                     }

                     if (var1 < (float)this.g[var6 + 1].g) {
                        var3 = var6;
                        break;
                     }

                     var4 = var6 + 1;
                  }
               } while (var4 <= var5);
            }

            if (var3 != this.o) {
               this.o = var3;
               this.c = true;
            }

            return this.o;
         } else {
            return -1;
         }
      } else {
         return this.o;
      }
   }

   C_a b(float var1) {
      int var2 = this.a(var1);
      return var2 >= 0 && var2 < this.g.length ? this.g[var2] : null;
   }

   int d() {
      return this.g == null ? 0 : this.g.length;
   }

   static float a(C_g var0, float var1) {
      if (var0 == null || var0.d() == 0) {
         return 0.0F;
      } else if (var1 < (float)var0.g[0].g) {
         return C_i.a == var0.f ? var0.g[0].b : a(var0, var1, true);
      } else if (var1 > (float)var0.g[var0.d() - 1].g) {
         return var0.e == C_i.a ? var0.g[var0.d() - 1].b : a(var0, var1, false);
      } else if (var0.a) {
         return var0.g[0].b;
      } else {
         C_a var2 = var0.b(var1);
         boolean var3 = false;
         boolean var4 = false;
         if (null == var2) {
            return 0.0F;
         } else {
            if ((double)var2.e == 0.0 && 0.0 == (double)var2.f) {
               var3 = true;
            } else if (Float.MAX_VALUE == var2.e && Float.MAX_VALUE == var2.f) {
               var4 = true;
            } else if (var2.a == null) {
               var3 = true;
            } else if (var0.c) {
               float[] var5 = new float[4];
               float[] var6 = new float[4];
               var5[0] = (float)var2.g;
               var6[0] = var2.b;
               var5[1] = var5[0] + 0.33333334F * var2.e;
               var6[1] = 0.33333334F * var2.f + var6[0];
               var5[3] = (float)var2.a.g;
               var6[3] = var2.a.b;
               var5[2] = var5[3] - var2.a.d * 0.33333334F;
               var6[2] = var6[3] - var2.a.c * 0.33333334F;
               if (var0.b) {
                  b(var0, var5, var6);
               } else {
                  a(var0, var5, var6);
               }

               var0.c = false;
            }

            if (var3) {
               return var2.b;
            } else if (!var4) {
               return var0.b ? c(var0, var1) : b(var0, var1);
            } else {
               return (float)var2.g != var1 && var2.a != null ? var2.a.b : var2.b;
            }
         }
      }
   }

   private static void b(C_g var0, float[] var1, float[] var2) {
      if (null != var0) {
         float var3 = var1[3] - var1[0];
         if ((double)var3 != 0.0) {
            float var4 = var1[1] - var1[0];
            float var5 = var1[2] - var1[0];
            Float var6 = var4 / var3;
            Float var7 = var5 / var3;
            var0.d = var6 == 0.33333334F && var7 == 0.6666667F;
            float var8 = var6;
            float var9 = var7;
            if ((double)var6.floatValue() < 0.0) {
               var6 = 0.0F;
            }

            if ((double)var7.floatValue() > 1.0) {
               var7 = 1.0F;
            }

            if ((double)var6.floatValue() > 1.0 || var7 < -1.0F) {
               Float var10 = var6;
               Float var11 = 1.0F - var7;
               if (var6 < 0.0F) {
                  var10 = 0.0F;
               }

               if (var11 < 0.0F) {
                  var11 = 0.0F;
               }

               if (var10 > 1.0F || var11 > 1.0F) {
                  float var12 = (float)((double)(var10 * (var10 - 2.0F + var11)) + (double)var11.floatValue() * ((double)var11.floatValue() - 2.0) + 1.0);
                  if (C_f.a + var12 > 0.0F) {
                     float[] var13 = a(var10, var11);
                     var10 = var13[0];
                     var11 = var13[1];
                  }
               }

               var11 = 1.0F - var11;
               var6 = var10;
               var7 = var11;
            }

            if (var6 != var8) {
               var1[1] = var1[0] + var6 * var3;
               if (0.0 != (double)var8) {
                  var2[1] = var2[0] + (var2[1] - var2[0]) * var6 / var8;
               }
            }

            if (var7 != var9) {
               var1[2] = var1[0] + var7 * var3;
               if ((double)var9 != 1.0) {
                  var2[2] = (float)((double)var2[3] - (double)(var2[3] - var2[2]) * (1.0 - (double)var7.floatValue()) / (1.0 - (double)var9));
               }
            }

            var0.h = var1[0];
            var0.i = var1[3];
            float var26 = var6;
            float var28 = var7;
            float[] var29 = var0.l;
            float var30 = var26 - 0.0F;
            float var14 = var28 - var26;
            float var15 = 1.0F - var28;
            float var16 = var14 - var30;
            var29[3] = var15 - var14 - var16;
            var29[2] = var16 + var16 + var16;
            var29[1] = var30 + var30 + var30;
            var29[0] = 0.0F;
            float var17 = var2[0];
            float var18 = var2[1];
            float var19 = var2[2];
            float var20 = var2[3];
            float[] var21 = var0.m;
            float var22 = var18 - var17;
            float var23 = var19 - var18;
            float var24 = var20 - var19;
            float var25 = var23 - var22;
            var21[3] = var24 - var23 - var25;
            var21[2] = var25 + var25 + var25;
            var21[1] = var22 + var22 + var22;
            var21[0] = var17;
         }
      }
   }

   static float a(C_g var0, float var1, boolean var2) {
      if (var0 != null && var0.d() != 0) {
         float var3 = (float)var0.g[0].g;
         float var4 = (float)var0.g[var0.d() - 1].g;
         float var5 = var4 - var3;
         if ((double)var5 == 0.0) {
            return var0.g[0].b;
         } else {
            float var6 = 0.0F;
            if (var1 > var4) {
               var6 = (var1 - var4) / var5;
            } else {
               var6 = (var1 - var3) / var5;
            }

            double var7 = (double)((int)var6);
            float var9 = Math.abs((float)((double)var6 - var7));
            float var10 = var5 * var9;
            double var11 = Math.abs(var7 + 1.0);
            double var13 = var11 / 2.0;
            double var15 = (double)((int)var13);
            float var17 = (float)(var13 - var15);
            if (var2) {
               if (var0.f == C_i.c) {
                  if ((double)var17 == 0.0) {
                     var10 = var4 - var10;
                  } else {
                     var10 += var3;
                  }
               } else if (C_i.e != var0.f && C_i.d != var0.f) {
                  if (var0.f == C_i.b) {
                     var10 = var3 - var1;
                     float var18 = var0.g[0].d;
                     float var19 = var0.g[0].c;
                     float var20 = var0.g[0].b;
                     if ((double)var18 != 0.0) {
                        var20 -= var10 * var19 / var18;
                     }

                     return var20;
                  }
               } else {
                  var10 = var4 - var10;
               }
            } else if (C_i.c == var0.e) {
               if ((double)var17 == 0.0) {
                  var10 += var3;
               } else {
                  var10 = var4 - var10;
               }
            } else if (C_i.e != var0.e && C_i.d != var0.e) {
               if (C_i.b == var0.e) {
                  var10 = var1 - var4;
                  float var25 = var0.g[var0.d() - 1].e;
                  float var28 = var0.g[var0.d() - 1].f;
                  float var29 = var0.g[var0.d() - 1].b;
                  if (0.0 != (double)var25) {
                     var29 += var10 * var28 / var25;
                  }

                  return var29;
               }
            } else {
               var10 += var3;
            }

            float var24 = a(var0, var10);
            if (var2 && C_i.d == var0.f) {
               float var27 = var0.g[var0.d() - 1].b - var0.g[0].b;
               var24 = (float)((double)var24 - (double)var27 * var11);
            } else if (!var2 && C_i.d == var0.e) {
               float var26 = var0.g[var0.d() - 1].b - var0.g[0].b;
               var24 = (float)((double)var24 + var11 * (double)var26);
            }

            return var24;
         }
      } else {
         return 0.0F;
      }
   }

   static void a(C_g var0, float[] var1, float[] var2) {
      if (var0 != null) {
         var0.h = var1[0];
         float var3 = var1[3] - var1[0];
         float var4 = var2[3] - var2[0];
         float var5 = var1[1] - var1[0];
         float var6 = 0.0F;
         float var7 = 0.0F;
         if ((double)var5 != 0.0) {
            var6 = (var2[1] - var2[0]) / var5;
         }

         var5 = var1[3] - var1[2];
         if (0.0 != (double)var5) {
            var7 = (var2[3] - var2[2]) / var5;
         }

         float var8 = 1.0F / (var3 * var3);
         float var9 = var3 * var6;
         float var10 = var7 * var3;
         var0.l[0] = var8 * (var10 + var9 - var4 - var4) / var3;
         var0.l[1] = var8 * (var4 + var4 + var4 - var9 - var9 - var10);
         var0.l[2] = var6;
         var0.l[3] = var2[0];
      }
   }

   static float b(C_g var0, float var1) {
      if (var0 == null) {
         return 0.0F;
      } else {
         float var2 = var1 - var0.h;
         return var0.l[3] + (var0.l[2] + (var2 * var0.l[0] + var0.l[1]) * var2) * var2;
      }
   }

   static float c(C_g var0, float var1) {
      if (var0 == null) {
         return 0.0F;
      } else {
         float var2;
         if (var0.h == var1) {
            var2 = 0.0F;
         } else if (var0.i == var1) {
            var2 = 1.0F;
         } else {
            var2 = (var1 - var0.h) / (var0.i - var0.h);
         }

         float var3;
         if (var0.d) {
            var3 = var2;
         } else {
            float[] var4 = new float[]{var0.l[0] - var2, var0.l[1], var0.l[2], var0.l[3]};
            float[] var5 = new float[5];
            int var6 = a(var4, 3, 0.0F, true, 1.0F, true, var5);
            if (var6 == 1) {
               var3 = var5[0];
            } else {
               var3 = 0.0F;
            }
         }

         return var3 * (var0.m[1] + var3 * (var0.m[2] + var3 * var0.m[3])) + var0.m[0];
      }
   }

   public static int a(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
      float var7 = 0.0F;

      for (int var8 = 0; var8 < 1 + var1; var8++) {
         var7 += Math.abs(var0[var8]);
      }

      float var21 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * C_f.a;
      if (var7 <= var21) {
         return -1;
      } else {
         float[] var9 = new float[var1 + 1];

         for (int var10 = 0; var10 < var1 + 1; var10++) {
            var9[var10] = var0[var10] * (1.0F / var7);
         }

         while (Math.abs(var9[var1]) < var21) {
            var1--;
         }

         int var22 = 0;
         if (var1 == 0) {
            return var22;
         } else if (var1 == 1) {
            var6[0] = -var9[0] / var9[1];
            boolean var24 = var3 ? var2 < var6[0] + var21 : var2 < var6[0] - var21;
            boolean var25 = var5 ? var4 > var6[0] - var21 : var4 > var6[0] + var21;
            var22 = var24 && var25 ? 1 : 0;
            if (var22 > 0) {
               if (var3 && var6[0] < var2) {
                  var6[0] = var2;
               } else if (var5 && var6[0] > var4) {
                  var6[0] = var4;
               }
            }

            return var22;
         } else {
            C_h var11 = new C_h(var9, var1);
            float[] var12 = C_h.a(var1, var9);
            float[] var13 = new float[var1 + 1];
            int var14 = a(var12, var1 - 1, var2, false, var4, false, var13);
            if (var14 == -1) {
               return 0;
            } else {
               boolean var15 = false;
               float var16 = 0.0F;
               float var17 = 0.0F;
               float var18 = 0.0F;

               for (int var19 = 0; var19 <= var14; var19++) {
                  if (var22 > var1) {
                     return var22;
                  }

                  float var20;
                  if (var19 == 0) {
                     var20 = var2;
                     var17 = C_h.a(var9, var1, var2);
                     if (Math.abs(var17) <= var21 && var3) {
                        var6[var22++] = var2;
                     }
                  } else {
                     var20 = var18;
                     var17 = var16;
                  }

                  if (var19 == var14) {
                     var18 = var4;
                     var15 = false;
                  } else {
                     var18 = var13[var19];
                  }

                  var16 = C_h.a(var9, var1, var18);
                  if (var15) {
                     var15 = false;
                  } else if (Math.abs(var16) < var21) {
                     if (var19 != var14 || var5) {
                        var6[var22++] = var18;
                        var15 = true;
                     }
                  } else if (var17 < 0.0F && var16 > 0.0F || var17 > 0.0F && var16 < 0.0F) {
                     var6[var22++] = a(var11, var20, var18, 0.0F);
                     if (var22 > 1 && var6[var22 - 2] >= var6[var22 - 1] - var21) {
                        var6[var22 - 2] = 0.5F * (var6[var22 - 1] + var6[var22 - 2]);
                        var22--;
                     }
                  }
               }

               return var22;
            }
         }
      }
   }

   public static float a(C_h var0, float var1, float var2, float var3) {
      float var4 = C_h.a(var0.a, var0.b, var1);
      if (Math.abs(var4) < C_f.a) {
         return var1;
      } else {
         float var5 = C_h.a(var0.a, var0.b, var2);
         if (Math.abs(var5) < C_f.a) {
            return var2;
         } else {
            float var6 = 0.0F;
            float var7 = 0.0F;
            float var8 = 0.0F;
            float var9 = 0.0F;
            boolean var10 = true;
            boolean var11 = false;

            do {
               var11 = false;
               if (var10) {
                  var6 = var1;
                  var9 = var4;
                  var7 = var2 - var1;
                  var8 = var7;
                  var10 = false;
               }

               if (Math.abs(var9) < Math.abs(var5)) {
                  var1 = var2;
                  var2 = var6;
                  var6 = var1;
                  var4 = var5;
                  var5 = var9;
                  var9 = var4;
               }

               float var12 = C_f.b * Math.abs(var2) + var3 * 0.5F;
               float var13 = 0.5F * (var6 - var2);
               boolean var14 = Math.abs(var13) > var12 && 0.0F != var5;
               if (var14) {
                  if (!(Math.abs(var8) < var12) && !(Math.abs(var4) <= Math.abs(var5))) {
                     float var15 = var5 / var4;
                     float var16;
                     float var17;
                     if (var6 == var1) {
                        var16 = var13 * 2.0F * var15;
                        var17 = 1.0F - var15;
                     } else {
                        var17 = var4 / var9;
                        float var18 = var5 / var9;
                        var16 = var15 * (var17 * var13 * 2.0F * (var17 - var18) - (var2 - var1) * (var18 - 1.0F));
                        var17 = (var15 - 1.0F) * (var18 - 1.0F) * (var17 - 1.0F);
                     }

                     if ((double)var16 > 0.0) {
                        var17 = -var17;
                     } else {
                        var16 = -var16;
                     }

                     var15 = var8;
                     var8 = var7;
                     if (2.0F * var16 < var17 * var13 * 3.0F - Math.abs(var12 * var17) && var16 < Math.abs(var17 * var15 * 0.5F)) {
                        var7 = var16 / var17;
                     } else {
                        var7 = var13;
                        var8 = var13;
                     }
                  } else {
                     var7 = var13;
                     var8 = var13;
                  }

                  var1 = var2;
                  var4 = var5;
                  if (Math.abs(var7) > var12) {
                     var2 += var7;
                  } else if ((double)var13 > 0.0) {
                     var2 += var12;
                  } else {
                     var2 -= var12;
                  }

                  var5 = C_h.a(var0.a, var0.b, var2);
                  if ((double)(var5 * (var9 / Math.abs(var9))) > 0.0) {
                     var10 = true;
                     var11 = true;
                  } else {
                     var11 = true;
                  }
               }
            } while (var11);

            return var2;
         }
      }
   }

   public static float[] a(float var0, float var1) {
      if (var0 + C_f.a < 1.3333334F) {
         float var2 = var0 - 2.0F;
         float var3 = var0 - 1.0F;
         float var4 = (float)Math.sqrt((double)(var2 * var2 - var3 * var3 * 4.0F));
         float var5 = 0.5F * (var4 + -var2);
         if (var1 + C_f.a > var5) {
            var1 = var5 - C_f.a;
         } else {
            var5 = 0.5F * (-var2 - var4);
            if (var1 < var5 + C_f.a) {
               var1 = C_f.a + var5;
            }
         }
      } else {
         var0 = 1.3333334F - C_f.a;
         var1 = 0.33333334F - C_f.a;
      }

      return new float[]{var0, var1};
   }
}
