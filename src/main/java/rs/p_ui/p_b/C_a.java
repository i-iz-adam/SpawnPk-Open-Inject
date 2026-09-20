package rs.p_ui.p_b;

import java.util.Arrays;

class C_a {
   public static final int a = 10;
   public static final int b = 1024;
   private int[] c = new int[0];
   private int[] d = new int[0];
   private int e;

   private void c() {
      int var1 = this.c.length >> 10;
      int var2 = Math.max(1, var1 * 2);
      this.c = Arrays.copyOf(this.c, var2 * 1024);
      this.d = Arrays.copyOf(this.d, var2);
      int var3 = var1;

      while (var3 < var2) {
         this.d[this.e++] = var3++;
      }
   }

   public int[] a() {
      return this.c;
   }

   public int b() {
      if (this.e == 0) {
         this.c();
      }

      return this.d[--this.e];
   }

   public void a(int var1) {
      this.d[this.e++] = var1;
   }
}
