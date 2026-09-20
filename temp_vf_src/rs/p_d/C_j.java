package rs.p_d;

public final class C_j {
   public static int a;
   public static C_j[] b;
   public int c;
   public int[] d;
   private final int[] f;
   private final int[] g;
   private final int[] h = new int[]{-1, -1, -1, -1, -1};
   public boolean e;

   public static void a(rs.p_x.C_f var0) {
      rs.p_x.C_e var1 = new rs.p_x.C_e(var0.a("idk.dat"));
      a = var1.A();
      if (b == null) {
         b = new C_j[a];
      }

      for (int var2 = 0; var2 < a; var2++) {
         if (b[var2] == null) {
            b[var2] = new C_j();
         }

         b[var2].a(var1);
      }
   }

   private void a(rs.p_x.C_e var1) {
      while (true) {
         int var2 = var1.y();
         if (var2 == 0) {
            return;
         }

         if (var2 == 1) {
            this.c = var1.y();
         } else if (var2 == 2) {
            int var3 = var1.y();
            this.d = new int[var3];

            for (int var4 = 0; var4 < var3; var4++) {
               this.d[var4] = var1.A();
            }
         } else if (var2 == 3) {
            this.e = true;
         } else if (var2 >= 40 && var2 < 50) {
            this.f[var2 - 40] = var1.A();
         } else if (var2 >= 50 && var2 < 60) {
            this.g[var2 - 50] = var1.A();
         } else if (var2 >= 60 && var2 < 70) {
            this.h[var2 - 60] = var1.A();
         } else {
            System.out.println("[IDK] Error unrecognised config code: " + var2);
         }
      }
   }

   public boolean a() {
      if (this.d == null) {
         return true;
      } else {
         boolean var1 = true;

         for (int var2 = 0; var2 < this.d.length; var2++) {
            if (!rs.p_a.C_h.f(this.d[var2])) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   public rs.p_a.C_h b() {
      if (this.d == null) {
         return null;
      } else {
         rs.p_a.C_h[] var1 = new rs.p_a.C_h[this.d.length];

         for (int var2 = 0; var2 < this.d.length; var2++) {
            var1[var2] = rs.p_a.C_h.e(this.d[var2]);
            if (var1[var2] == null) {
               return null;
            }

            int[] var3 = new int[]{0};
            int[] var4 = new int[]{1};

            for (int var5 = 0; var5 < var3.length; var5++) {
               var1[var2].i(var3[var5], var4[var5]);
            }
         }

         rs.p_a.C_h var6;
         if (var1.length == 1) {
            var6 = var1[0];
         } else {
            var6 = new rs.p_a.C_h(var1.length, var1);
         }

         for (int var7 = 0; var7 < 6 && this.f[var7] != 0; var7++) {
            var6.i(this.f[var7], this.g[var7]);
         }

         return var6;
      }
   }

   public boolean c() {
      boolean var1 = true;

      for (int var2 = 0; var2 < 5; var2++) {
         if (this.h[var2] != -1 && !rs.p_a.C_h.f(this.h[var2])) {
            var1 = false;
         }
      }

      return var1;
   }

   public rs.p_a.C_h d() {
      rs.p_a.C_h[] var1 = new rs.p_a.C_h[5];
      int var2 = 0;

      for (int var3 = 0; var3 < 5; var3++) {
         if (this.h[var3] != -1) {
            var1[var2++] = rs.p_a.C_h.e(this.h[var3]);
         }
      }

      rs.p_a.C_h var5 = new rs.p_a.C_h(var2, var1);

      for (int var4 = 0; var4 < 6 && this.f[var4] != 0; var4++) {
         var5.i(this.f[var4], this.g[var4]);
      }

      return var5;
   }

   private C_j() {
      this.c = -1;
      this.f = new int[6];
      this.g = new int[6];
      this.e = false;
   }
}
