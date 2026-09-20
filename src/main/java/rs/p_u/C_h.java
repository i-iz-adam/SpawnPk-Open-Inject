package rs.p_u;

public class C_h {
   public float[] a;
   public int b;

   public C_h(float[] var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public static float a(float[] var0, int var1, float var2) {
      float var3 = var0[var1];

      for (int var4 = var1 - 1; var4 >= 0; var4--) {
         var3 = var2 * var3 + var0[var4];
      }

      return var3;
   }

   static float[] a(int var0, float[] var1) {
      float[] var2 = new float[1 + var0];

      for (int var3 = 1; var3 <= var0; var3++) {
         var2[var3 - 1] = var1[var3] * (float)var3;
      }

      return var2;
   }
}
