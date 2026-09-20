package rs;

public final class C_F_uc {
   private final C_a c = new C_a();
   private final int d;
   public C_o a;
   private final C_B_uc e = new C_B_uc();
   public int b;

   public C_F_uc(int var1) {
      this.d = var1;
      this.b = var1;
      this.a = new C_o();
   }

   public C_a a(long var1) {
      C_a var3 = (C_a)this.a.a(var1);
      if (var3 != null) {
         this.e.a(var3);
      }

      return var3;
   }

   public void a(C_a var1, long var2) {
      try {
         if (this.b == 0) {
            C_a var4 = this.e.a();
            var4.b();
            var4.a();
            if (var4 == this.c) {
               var4 = this.e.a();
               var4.b();
               var4.a();
            }
         } else {
            this.b--;
         }

         this.a.a(var1, var2);
         this.e.a(var1);
      } catch (RuntimeException var5) {
         rs.p_v.C_a.e("47547, " + var1 + ", " + var2 + ", 2, " + var5.toString());
         throw new RuntimeException();
      }
   }

   public void a() {
      while (true) {
         C_a var1 = this.e.a();
         if (var1 == null) {
            this.b = this.d;
            return;
         }

         var1.b();
         var1.a();
      }
   }
}
