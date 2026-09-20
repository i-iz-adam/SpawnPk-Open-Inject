package rs;

public final class C_B_uc {
   private final C_a a = new C_a();
   private C_a b;

   public C_B_uc() {
      this.a.a = this.a;
      this.a.b = this.a;
   }

   public void a(C_a var1) {
      if (var1.b != null) {
         var1.a();
      }

      var1.b = this.a.b;
      var1.a = this.a;
      var1.b.a = var1;
      var1.a.b = var1;
   }

   public C_a a() {
      C_a var1 = this.a.a;
      if (var1 == this.a) {
         return null;
      } else {
         var1.a();
         return var1;
      }
   }

   public C_a b() {
      C_a var1 = this.a.a;
      if (var1 == this.a) {
         this.b = null;
         return null;
      } else {
         this.b = var1.a;
         return var1;
      }
   }

   public C_a c() {
      C_a var1 = this.b;
      if (var1 == this.a) {
         this.b = null;
         return null;
      } else {
         this.b = var1.a;
         return var1;
      }
   }

   public int d() {
      int var1 = 0;

      for (C_a var2 = this.a.a; var2 != this.a; var2 = var2.a) {
         var1++;
      }

      return var1;
   }
}
