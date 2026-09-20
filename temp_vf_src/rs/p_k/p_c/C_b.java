package rs.p_k.p_c;

public class C_b {
   public static final int a = 18;
   public static final int b = 6;
   private static final int[] c = new int[216];
   private static final int[] d = new int[72];
   private static int e;

   public static int[] a(int var0, int var1, int var2, int var3, int var4) {
      e = 0;
      a(var0 - var3, var1, var2 + var3, var4);
      a(var0 + var3, var1, var2 + var3, var4);
      a(var0, var1 - var3, var2, var4);
      a(var0 + var3, var1, var2 + var3, var4);
      a(var0 - var3, var1, var2 + var3, var4);
      a(var0, var1 + var3, var2, var4);
      a(var0 - var3, var1, var2 - var3, var4);
      a(var0 + var3, var1, var2 - var3, var4);
      a(var0, var1 - var3, var2, var4);
      a(var0 + var3, var1, var2 - var3, var4);
      a(var0 - var3, var1, var2 - var3, var4);
      a(var0, var1 + var3, var2, var4);
      a(var0 - var3, var1, var2, var4);
      a(var0 + var3, var1, var2, var4);
      a(var0, var1 - var3, var2, var4);
      a(var0 + var3, var1, var2, var4);
      a(var0 - var3, var1, var2, var4);
      a(var0, var1 + var3, var2, var4);
      a(var0 + var3, var1, var2 - var3, var4);
      a(var0 + var3, var1, var2 + var3, var4);
      a(var0, var1 - var3, var2, var4);
      a(var0 + var3, var1, var2 + var3, var4);
      a(var0 + var3, var1, var2 - var3, var4);
      a(var0, var1 + var3, var2, var4);
      a(var0 - var3, var1, var2 - var3, var4);
      a(var0 - var3, var1, var2 + var3, var4);
      a(var0, var1 - var3, var2, var4);
      a(var0 - var3, var1, var2 + var3, var4);
      a(var0 - var3, var1, var2 - var3, var4);
      a(var0, var1 + var3, var2, var4);
      a(var0, var1, var2 - var3, var4);
      a(var0, var1, var2 + var3, var4);
      a(var0, var1 - var3, var2, var4);
      a(var0, var1, var2 + var3, var4);
      a(var0, var1, var2 - var3, var4);
      a(var0, var1 + var3, var2, var4);
      a(var0 + var3, var1, var2 + var3, var4);
      a(var0 + var3, var1, var2 - var3, var4);
      a(var0, var1 - var3, var2, var4);
      a(var0 + var3, var1, var2 - var3, var4);
      a(var0 + var3, var1, var2 + var3, var4);
      a(var0, var1 + var3, var2, var4);
      a(var0 - var3, var1, var2 + var3, var4);
      a(var0 - var3, var1, var2 - var3, var4);
      a(var0, var1 - var3, var2, var4);
      a(var0 - var3, var1, var2 - var3, var4);
      a(var0 - var3, var1, var2 + var3, var4);
      a(var0, var1 + var3, var2, var4);
      a(var0, var1, var2 + var3, var4);
      a(var0, var1, var2 - var3, var4);
      a(var0, var1 - var3, var2, var4);
      a(var0, var1, var2 - var3, var4);
      a(var0, var1, var2 + var3, var4);
      a(var0, var1 + var3, var2, var4);
      return c;
   }

   public static int[] b(int var0, int var1, int var2, int var3, int var4) {
      e = 0;
      b(var0 + var3, var1, var2 + var3, var4);
      b(var0 - var3, var1, var2 + var3, var4);
      b(var0, var1 - var3, var2, var4);
      b(var0 - var3, var1, var2 + var3, var4);
      b(var0 + var3, var1, var2 + var3, var4);
      b(var0, var1 + var3, var2, var4);
      b(var0 + var3, var1, var2 - var3, var4);
      b(var0 - var3, var1, var2 - var3, var4);
      b(var0, var1 - var3, var2, var4);
      b(var0 - var3, var1, var2 - var3, var4);
      b(var0 + var3, var1, var2 - var3, var4);
      b(var0, var1 + var3, var2, var4);
      b(var0 + var3, var1, var2, var4);
      b(var0 - var3, var1, var2, var4);
      b(var0, var1 - var3, var2, var4);
      b(var0 - var3, var1, var2, var4);
      b(var0 + var3, var1, var2, var4);
      b(var0, var1 + var3, var2, var4);
      return d;
   }

   private static final void a(int var0, int var1, int var2, int var3) {
      a(c, var0, var1, var2, var3);
   }

   private static final void b(int var0, int var1, int var2, int var3) {
      a(d, var0, var1, var2, var3);
   }

   private static final void a(int[] var0, int var1, int var2, int var3, int var4) {
      var0[e++] = var1;
      var0[e++] = var2;
      var0[e++] = var3;
      var0[e++] = var4;
   }
}
