package rs;

public final class C_o {
   public final int a;
   public final C_t[] b;

   public C_o() {
      short var1 = 1024;
      this.a = var1;
      this.b = new C_t[var1];

      for (int var2 = 0; var2 < var1; var2++) {
         C_t var3 = this.b[var2] = new C_t();
         var3.d = var3;
         var3.e = var3;
      }
   }

   public C_t a(long var1) {
      C_t var3 = this.b[(int)(var1 & (long)(this.a - 1))];

      for (C_t var4 = var3.d; var4 != var3; var4 = var4.d) {
         if (var4.c == var1) {
            return var4;
         }
      }

      return null;
   }

   public void a(C_t var1, long var2) {
      try {
         if (var1.e != null) {
            var1.b();
         }

         C_t var4 = this.b[(int)(var2 & (long)(this.a - 1))];
         var1.e = var4.e;
         var1.d = var4;
         var1.e.d = var1;
         var1.d.e = var1;
         var1.c = var2;
      } catch (RuntimeException var5) {
         rs.p_v.C_a.e("91499, " + var1 + ", " + var2 + ", 7, " + var5.toString());
         throw new RuntimeException();
      }
   }
}
