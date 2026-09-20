package rs.p_u;

public class C_j {
   C_d[] a;
   int b;

   public C_j(rs.p_x.C_e var1, int var2) {
      this.a = new C_d[var2];
      this.b = var1.y();

      for (int var3 = 0; var3 < this.a.length; var3++) {
         C_d var4 = new C_d(this.b, var1, false);
         this.a[var3] = var4;
      }

      this.a();
   }

   void a() {
      for (int var1 = 0; var1 < this.a.length; var1++) {
         C_d var2 = this.a[var1];
         if (var2.n >= 0) {
            var2.m = this.a[var2.n];
         }
      }
   }

   public int b() {
      return this.a.length;
   }

   public C_d a(int var1) {
      return var1 >= this.b() ? null : this.a[var1];
   }

   C_d[] c() {
      return this.a;
   }

   public void a(C_b var1, int var2) {
      this.a(var1, var2, (boolean[])null, false);
   }

   public void a(C_b var1, int var2, boolean[] var3, boolean var4) {
      int var5 = var1.c();
      int var6 = 0;
      C_d[] var7 = this.c();

      for (int var8 = 0; var8 < var7.length; var8++) {
         C_d var9 = var7[var8];
         if (var3 == null || var3[var6] == var4) {
            var1.a(var2, var9, var6, var5);
         }

         var6++;
      }
   }
}
