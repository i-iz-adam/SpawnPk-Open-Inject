package rs;

public final class C_h {
   private final C_t a = new C_t();
   private C_t b;

   public C_h() {
      this.a.d = this.a;
      this.a.e = this.a;
   }

   public void a(C_t var1) {
      if (var1.e != null) {
         var1.b();
      }

      var1.e = this.a.e;
      var1.d = this.a;
      var1.e.d = var1;
      var1.d.e = var1;
   }

   public void b(C_t var1) {
      if (var1.e != null) {
         var1.b();
      }

      var1.e = this.a;
      var1.d = this.a.d;
      var1.e.d = var1;
      var1.d.e = var1;
   }

   public C_t a() {
      C_t var1 = this.a.d;
      if (var1 == this.a) {
         return null;
      } else {
         var1.b();
         return var1;
      }
   }

   public C_t b() {
      C_t var1 = this.a.d;
      if (var1 == this.a) {
         this.b = null;
         return null;
      } else {
         this.b = var1.d;
         return var1;
      }
   }

   public C_t c() {
      C_t var1 = this.a.e;
      if (var1 == this.a) {
         this.b = null;
         return null;
      } else {
         this.b = var1.e;
         return var1;
      }
   }

   public C_t d() {
      C_t var1 = this.b;
      if (var1 == this.a) {
         this.b = null;
         return null;
      } else {
         this.b = var1.d;
         return var1;
      }
   }

   public C_t e() {
      C_t var1 = this.b;
      if (var1 == this.a) {
         this.b = null;
         return null;
      } else {
         this.b = var1.e;
         return var1;
      }
   }

   public void f() {
      if (this.a.d != this.a) {
         while (true) {
            C_t var1 = this.a.d;
            if (var1 == this.a) {
               return;
            }

            var1.b();
         }
      }
   }
}
