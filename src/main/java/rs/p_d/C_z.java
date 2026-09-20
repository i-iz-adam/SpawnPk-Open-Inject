package rs.p_d;

public final class C_z {
   public static C_z[] a;
   private static int d;
   private static int[] e;
   public int b;
   public boolean c = false;

   public static void a(rs.p_x.C_f var0) {
      rs.p_x.C_e var1 = new rs.p_x.C_e(var0.a("varp.dat"));
      d = 0;
      int var2 = var1.A();
      if (a == null) {
         a = new C_z[var2 + 10000];
      }

      if (e == null) {
         e = new int[var2];
      }

      for (int var3 = 0; var3 < var2; var3++) {
         if (a[var3] == null) {
            a[var3] = new C_z();
         }

         a[var3].a(var1, var3);
      }

      if (var1.h != var1.g.length) {
         System.out.println("varptype load mismatch");
      }
   }

   private void a(rs.p_x.C_e var1, int var2) {
      while (true) {
         int var3 = var1.y();
         if (var3 == 0) {
            return;
         }

         if (var3 == 1) {
            var1.y();
         } else if (var3 == 2) {
            var1.y();
         } else if (var3 == 3) {
            e[d++] = var2;
         } else if (var3 == 4) {
            byte var6 = 2;
         } else if (var3 == 5) {
            this.b = var1.A();
         } else if (var3 == 6) {
            byte var5 = 2;
         } else if (var3 == 7) {
            var1.D();
         } else if (var3 == 8) {
            this.c = true;
         } else if (var3 == 10) {
            var1.F();
         } else if (var3 == 11) {
            this.c = true;
         } else if (var3 == 12) {
            var1.D();
         } else if (var3 == 13) {
            byte var4 = 2;
         } else {
            System.out.println("[VARP] Error unrecognised config code: " + var3);
         }
      }
   }

   private C_z() {
   }
}
