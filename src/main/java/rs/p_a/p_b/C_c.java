package rs.p_a.p_b;

import rs.p_a.C_h;

public class C_c {
   private C_d a;
   private C_e b;
   private C_a c;
   private int d = Integer.MAX_VALUE;

   public C_c(C_c var1) {
      this.a(var1.f());
      this.a(var1.g());
      this.a(var1.h());
      this.a(var1.i());
   }

   public C_c() {
   }

   public void a(C_h var1) {
      if (this.b()) {
         this.c.a(var1);
      }

      if (this.d()) {
         this.a.a(var1);
      }

      if (this.e() && var1.aq == null) {
         var1.aq = new int[var1.ah];
      }

      for (int var2 = 0; var2 < var1.ah; var2++) {
         if (this.b()) {
            this.c.a(var1, var2);
         }

         if (this.d()) {
            this.a.a(var1, var2);
         }

         if (this.e()) {
            var1.aq[var2] = 100 - this.d;
         }
      }

      if (this.c()) {
         this.b.a(var1);

         for (int var3 = 0; var3 < var1.ah; var3++) {
            this.b.a(var1, var3);
         }
      }
   }

   public C_e a() {
      if (this.b == null) {
         this.b = new C_e();
      }

      return this.b;
   }

   public boolean b() {
      return this.c != null;
   }

   public boolean c() {
      return this.b != null;
   }

   public boolean d() {
      return this.a != null;
   }

   public boolean e() {
      return this.d != Integer.MAX_VALUE;
   }

   public C_d f() {
      return this.a;
   }

   public void a(C_d var1) {
      this.a = var1;
   }

   public C_e g() {
      return this.b;
   }

   public void a(C_e var1) {
      this.b = var1;
   }

   public C_a h() {
      return this.c;
   }

   public void a(C_a var1) {
      this.c = var1;
   }

   public int i() {
      return this.d;
   }

   public void a(int var1) {
      this.d = var1;
   }
}
