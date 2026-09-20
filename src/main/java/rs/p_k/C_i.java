package rs.p_k;

public class C_i {
   private static final int[] c = new int[12];
   private static final float[] d = new float[12];
   private static final int[] e = new int[12];
   private static final float[] f = new float[12];
   public static final int a = 12;
   public static final int b = 4;

   public void a() {
   }

   public int a(rs.p_a.C_h var1, C_d var2, C_c var3, long var4) {
      this.a();
      rs.p_k.p_c.C_d var6 = null;
      if (rs.p_f.C_a.az && !rs.p_f.C_a.ah && (var6 = rs.p_k.p_c.C_c.a((int)var4, false)) != null) {
         var6.c();
      }

      int[] var7 = var1.ae;
      int[] var8 = var1.af;
      int[] var9 = var1.ag;
      int[] var10 = var1.ai;
      int[] var11 = var1.aj;
      int[] var12 = var1.ak;
      int[] var13 = var1.al;
      int[] var14 = var1.am;
      int[] var15 = var1.an;
      int[] var16 = var1.aq;
      short[] var17 = var1.Y;
      int[] var18 = var1.ap;
      byte var19 = var1.V;
      byte var20 = var1.S;
      byte var21 = var1.T;
      byte var22 = var1.U;
      boolean var23 = var1.d();
      boolean var24 = C_e.a() && (var17 != null || var1.d());
      int var25 = Math.min(6144, var1.ah);
      byte var26 = 0;

      for (int var27 = 0; var27 < var25; var27++) {
         int var28 = var10[var27];
         int var29 = var11[var27];
         int var30 = var12[var27];
         int var31 = var13[var27];
         int var32 = var14[var27];
         int var33 = var15[var27];
         if (rs.p_a.C_h.H != -1) {
            var33 = rs.p_a.C_h.H;
            var32 = rs.p_a.C_h.H;
            var31 = rs.p_a.C_h.H;
         }

         int var34 = 0;
         if (var16 != null && (var17 == null || var17[var27] == -1)) {
            int var35 = var16[var27];
            if (var1.K != 256) {
               var35 = var1.K;
            }

            var34 = (var35 & 0xFF) << 24;
            if (var35 == 255) {
               var33 = -2;
            }
         }

         int var41 = 0;
         if (var18 != null) {
            var41 = (var18[var27] & 0xFF) << 16;
         }

         if (var33 == -1) {
            var33 = var31;
            var32 = var31;
         } else if (var33 == -2) {
            continue;
         }

         if ((var17 == null || var17[var27] == -1) && var19 > 0) {
            var31 = a(var31, var20, var21, var22, var19);
            var32 = a(var32, var20, var21, var22, var19);
            var33 = a(var33, var20, var21, var22, var19);
         }

         c[0] = var7[var28];
         c[1] = var8[var28];
         c[2] = var9[var28];
         c[3] = var34 | var41 | var31;
         c[4] = var7[var29];
         c[5] = var8[var29];
         c[6] = var9[var29];
         c[7] = var34 | var41 | var32;
         c[8] = var7[var30];
         c[9] = var8[var30];
         c[10] = var9[var30];
         c[11] = var34 | var41 | var33;
         var2.a(c);
         if (var24) {
            if (var1.e() != null && rs.p_a.C_h.H <= 1) {
               float var39 = 0.0F;
               if (var1.ao != null && var1.d() && (var17 == null || var17[var27] <= 0)) {
                  if ((var1.ao[var27] & 1) == 1) {
                     if (var1.ao[var27] >= 3) {
                        var39 = var1.ao[var27] > 0 ? (float)var1.ar[var27] + 1.0F : 0.0F;
                     } else {
                        var39 = 0.0F;
                     }
                  } else {
                     var39 = var1.ao[var27] > 0 ? (float)var1.ar[var27] + 1.0F : 0.0F;
                  }
               } else {
                  var39 = (float)var17[var27] + 1.0F;
               }

               d[0] = var39;
               d[1] = var1.a(var27, 0);
               d[2] = var1.b(var27, 0);
               d[3] = 0.0F;
               d[4] = var39;
               d[5] = var1.a(var27, 1);
               d[6] = var1.b(var27, 1);
               d[7] = 0.0F;
               d[8] = var39;
               d[9] = var1.a(var27, 2);
               d[10] = var1.b(var27, 2);
               d[11] = 0.0F;
               var3.a(d);
            } else {
               var3.a(f);
            }
         }

         var26 += 3;
      }

      return var26;
   }

   public int a(rs.p_a.C_h var1, C_d var2, rs.p_k.p_c.C_a var3, boolean var4) {
      int var5 = (var1.ap[var3.n()] & 0xFF) << 16;
      int var6 = 255 - (int)(255.0F * var3.g());
      int var7 = (var6 & 0xFF) << 24;
      int var8 = rs.p_l.C_f.a(var3.e());
      int var9 = !var4 ? 18 : 6;
      int var10 = 3 * var9;
      int var11 = (int)(3.5F + var3.f());
      int var12 = var3.j();
      int var13 = var3.k() * -1;
      int var14 = var3.l();
      if (var4) {
         var2.a(rs.p_k.p_c.C_b.b(var12, var13, var14, var11, var7 | var5 | var8));
      } else {
         var2.a(rs.p_k.p_c.C_b.a(var12, var13, var14, var11, var7 | var5 | var8));
      }

      return var10;
   }

   public static int a(int var0, byte var1, byte var2, byte var3, byte var4) {
      int var5 = var0 >> 10 & 63;
      int var6 = var0 >> 7 & 7;
      int var7 = var0 & 127;
      int var8 = var4 & 255;
      if (var1 != -1) {
         var5 += var8 * (var1 - var5) >> 7;
      }

      if (var2 != -1) {
         var6 += var8 * (var2 - var6) >> 7;
      }

      if (var3 != -1) {
         var7 += var8 * (var3 - var7) >> 7;
      }

      return (var5 << 10 | var6 << 7 | var7) & 65535;
   }
}
