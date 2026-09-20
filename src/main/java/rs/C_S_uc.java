package rs;

public final class C_S_uc {
   public int[] a;

   public C_S_uc(int var1) {
      this.a = new int[var1 * 4];
   }

   public int a() {
      return this.a.length / 4;
   }

   public int a(int var1) {
      return this.a[var1 * 4];
   }

   public int b(int var1) {
      return this.a[var1 * 4 + 1];
   }

   public int c(int var1) {
      return this.a[var1 * 4 + 2];
   }

   public int d(int var1) {
      return this.a[var1 * 4 + 3];
   }

   public void a(int var1, int var2) {
      this.a[var1 * 4] = var2;
   }

   public void b(int var1, int var2) {
      this.a[var1 * 4 + 1] = var2;
   }

   public void c(int var1, int var2) {
      this.a[var1 * 4 + 2] = var2;
   }

   public void d(int var1, int var2) {
      this.a[var1 * 4 + 3] = var2;
   }

   public void e(int var1, int var2) {
      this.a[var1 * 4] = this.a[var1 * 4] + var2;
   }

   public void f(int var1, int var2) {
      this.a[var1 * 4 + 1] = this.a[var1 * 4 + 1] + var2;
   }

   public void g(int var1, int var2) {
      this.a[var1 * 4 + 2] = this.a[var1 * 4 + 2] + var2;
   }

   public void h(int var1, int var2) {
      this.a[var1 * 4 + 3] = this.a[var1 * 4 + 3] + var2;
   }

   public boolean e(int var1) {
      return this.a(var1) == -2147483647;
   }
}
