package rs.p_d;

public final class C_y {
   public static C_y[] a;
   public int b;
   public int c;
   public int d;
   private boolean e = false;

   public static void a(rs.p_x.C_f var0) {
      rs.p_x.C_e var1 = new rs.p_x.C_e(var0.a("varbit.dat"));
      int var2 = var1.A();
      if (a == null) {
         a = new C_y[var2];
      }

      for (int var3 = 0; var3 < var2; var3++) {
         if (a[var3] == null) {
            a[var3] = new C_y();
         }

         a[var3].a(var1);
         if (a[var3].e) {
            C_z.a[a[var3].b].c = true;
         }
      }

      if (var1.h != var1.g.length) {
         System.out.println("varbit load mismatch");
      }
   }

   private void a(rs.p_x.C_e var1) {
      while (true) {
         int var2 = var1.y();
         if (var2 == 0) {
            return;
         }

         if (var2 == 1) {
            this.b = var1.A();
            this.c = var1.y();
            this.d = var1.y();
         } else if (var2 == 10) {
            var1.F();
         } else if (var2 == 2) {
            this.e = true;
         } else if (var2 == 3) {
            var1.D();
         } else if (var2 == 4) {
            var1.D();
         } else {
            System.out.println("[VARB] Error unrecognised config code: " + var2);
         }
      }
   }

   private C_y() {
   }
}
