package rs.p_a.p_a;

import rs.p_x.C_e;

public class C_c {
   private static final int b = 10;
   private static int c;
   public static C_e[] a = new C_e[10];

   public static C_e a(byte[] var0) {
      if (a[c] == null) {
         a[c] = new C_e(var0);
      } else {
         a[c].b(var0);
      }

      return a[c++];
   }

   public static void a() {
      for (int var0 = 0; var0 <= c; var0++) {
         if (a[c] != null) {
            a[c].b(null);
         }
      }

      c = 0;
   }
}
