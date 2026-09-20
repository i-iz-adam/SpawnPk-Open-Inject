package rs.p_a;

public class C_d {
   public int[] a;
   public int b;
   public int c;
   public int d;

   public C_d(int var1) {
      this.a = new int[var1 * 3];
   }

   public int a(int var1) {
      return this.a[var1 * 3];
   }

   public int b(int var1) {
      return this.a[var1 * 3 + 1];
   }

   public int c(int var1) {
      return this.a[var1 * 3 + 2];
   }

   public void a(int var1, int var2) {
      this.a[var1 * 3] = var2;
   }

   public void b(int var1, int var2) {
      this.a[var1 * 3 + 1] = var2;
   }

   public void c(int var1, int var2) {
      this.a[var1 * 3 + 2] = var2;
   }

   public void d(int var1, int var2) {
      this.a[var1 * 3] = this.a[var1 * 3] + var2;
   }

   public void e(int var1, int var2) {
      this.a[var1 * 3 + 1] = this.a[var1 * 3 + 1] + var2;
   }

   public void f(int var1, int var2) {
      this.a[var1 * 3 + 2] = this.a[var1 * 3 + 2] + var2;
   }

   public int a() {
      return this.a.length / 3;
   }
}
