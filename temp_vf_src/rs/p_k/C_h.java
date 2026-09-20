package rs.p_k;

public class C_h {
   private C_h() {
   }

   public static float[] a() {
      return new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
   }

   public static float[] a(float var0, float var1, float var2) {
      return new float[]{var0, 0.0F, 0.0F, 0.0F, 0.0F, var1, 0.0F, 0.0F, 0.0F, 0.0F, var2, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
   }

   public static float[] b(float var0, float var1, float var2) {
      return new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, var0, var1, var2, 1.0F};
   }

   public static float[] a(float var0) {
      float var1 = (float)Math.sin((double)var0);
      float var2 = (float)Math.cos((double)var0);
      return new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, var2, var1, 0.0F, 0.0F, -var1, var2, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
   }

   public static float[] b(float var0) {
      float var1 = (float)Math.sin((double)var0);
      float var2 = (float)Math.cos((double)var0);
      return new float[]{var2, 0.0F, -var1, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, var1, 0.0F, var2, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
   }

   public static float[] c(float var0, float var1, float var2) {
      return new float[]{2.0F / var0, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F / var1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -2.0F * var2, 0.0F};
   }

   public static void a(float[] var0, float[] var1) {
      float var2 = var1[0];
      float var3 = var1[1];
      float var4 = var1[2];
      float var5 = var1[3];
      float var6 = var1[4];
      float var7 = var1[5];
      float var8 = var1[6];
      float var9 = var1[7];
      float var10 = var1[8];
      float var11 = var1[9];
      float var12 = var1[10];
      float var13 = var1[11];
      float var14 = var1[12];
      float var15 = var1[13];
      float var16 = var1[14];
      float var17 = var1[15];
      float var18 = var0[0];
      float var19 = var0[4];
      float var20 = var0[8];
      float var21 = var0[12];
      var0[0] = var18 * var2 + var19 * var3 + var20 * var4 + var21 * var5;
      var0[4] = var18 * var6 + var19 * var7 + var20 * var8 + var21 * var9;
      var0[8] = var18 * var10 + var19 * var11 + var20 * var12 + var21 * var13;
      var0[12] = var18 * var14 + var19 * var15 + var20 * var16 + var21 * var17;
      var18 = var0[1];
      var19 = var0[5];
      var20 = var0[9];
      var21 = var0[13];
      var0[1] = var18 * var2 + var19 * var3 + var20 * var4 + var21 * var5;
      var0[5] = var18 * var6 + var19 * var7 + var20 * var8 + var21 * var9;
      var0[9] = var18 * var10 + var19 * var11 + var20 * var12 + var21 * var13;
      var0[13] = var18 * var14 + var19 * var15 + var20 * var16 + var21 * var17;
      var18 = var0[2];
      var19 = var0[6];
      var20 = var0[10];
      var21 = var0[14];
      var0[2] = var18 * var2 + var19 * var3 + var20 * var4 + var21 * var5;
      var0[6] = var18 * var6 + var19 * var7 + var20 * var8 + var21 * var9;
      var0[10] = var18 * var10 + var19 * var11 + var20 * var12 + var21 * var13;
      var0[14] = var18 * var14 + var19 * var15 + var20 * var16 + var21 * var17;
      var18 = var0[3];
      var19 = var0[7];
      var20 = var0[11];
      var21 = var0[15];
      var0[3] = var18 * var2 + var19 * var3 + var20 * var4 + var21 * var5;
      var0[7] = var18 * var6 + var19 * var7 + var20 * var8 + var21 * var9;
      var0[11] = var18 * var10 + var19 * var11 + var20 * var12 + var21 * var13;
      var0[15] = var18 * var14 + var19 * var15 + var20 * var16 + var21 * var17;
   }
}
