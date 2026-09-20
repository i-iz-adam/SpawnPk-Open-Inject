package rs.p_l;

import java.awt.Color;

public final class C_f {
   public static final int a = 63;
   public static final int b = 7;
   public static final int c = 127;
   private static float[] d = new float[3];

   public static short a(int var0, int var1, int var2) {
      return (short)((short)(var0 & 63) << 10 | (short)(var1 & 7) << 7 | (short)(var2 & 127));
   }

   public static int a(short var0) {
      return var0 >> 10 & 63;
   }

   public static int b(short var0) {
      return var0 >> 7 & 7;
   }

   public static int c(short var0) {
      return var0 & 127;
   }

   public static String d(short var0) {
      return String.format("%02Xh%Xs%02Xl", a(var0), b(var0), c(var0));
   }

   public static short a(int var0, double var1) {
      if (var0 == 1) {
         return 0;
      } else {
         var1 = 1.0 / var1;
         double var3 = (double)(var0 >> 16 & 0xFF) / 256.0;
         double var5 = (double)(var0 >> 8 & 0xFF) / 256.0;
         double var7 = (double)(var0 & 0xFF) / 256.0;
         var3 = Math.pow(var3, var1);
         var5 = Math.pow(var5, var1);
         var7 = Math.pow(var7, var1);
         Color.RGBtoHSB((int)(var3 * 256.0), (int)(var5 * 256.0), (int)(var7 * 256.0), d);
         double var9 = (double)d[0];
         double var11 = (double)(d[2] - d[2] * d[1] / 2.0F);
         double var13 = ((double)d[2] - var11) / Math.min(var11, 1.0 - var11);
         return a((int)(Math.ceil(var9 * 64.0) % 63.0), (int)Math.ceil(var13 * 7.0), (int)Math.ceil(var11 * 127.0));
      }
   }

   public static int b(int var0, int var1, int var2) {
      return (short)(var0 & 63) << 10 | (short)(var1 & 7) << 7 | (short)(var2 & 127);
   }

   public static int a(int var0) {
      if (var0 == 1) {
         return 0;
      } else {
         double var1 = (double)(var0 >> 16 & 0xFF) / 256.0;
         double var3 = (double)(var0 >> 8 & 0xFF) / 256.0;
         double var5 = (double)(var0 & 0xFF) / 256.0;
         Color.RGBtoHSB((int)(var1 * 256.0), (int)(var3 * 256.0), (int)(var5 * 256.0), d);
         double var7 = (double)d[0];
         double var9 = (double)(d[2] - d[2] * d[1] / 2.0F);
         double var11 = ((double)d[2] - var9) / Math.min(var9, 1.0 - var9);
         return b((int)(Math.ceil(var7 * 64.0) % 63.0), (int)Math.ceil(var11 * 7.0), (int)Math.ceil(var9 * 127.0));
      }
   }
}
