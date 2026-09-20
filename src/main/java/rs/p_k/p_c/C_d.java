package rs.p_k.p_c;

import p_gnu.p_trove.p_e.p_a.C_k;

public class C_d {
   private static final int a = 1000;
   private final C_k b = new C_k(1000);
   private final C_k c = new C_k(1000);
   private long d;
   private int e;

   public static C_d a() {
      return new C_d();
   }

   public boolean b() {
      this.d = System.currentTimeMillis();
      return this.b.size() < 1000;
   }

   public boolean a(C_a var1) {
      this.d = System.currentTimeMillis();
      this.b.b(var1.d());
      return true;
   }

   public void c() {
      this.c.clear();

      for (int var1 = 0; var1 < this.b.size(); var1++) {
         long var2 = this.b.a(var1);
         C_a var4 = C_c.a(var2);
         if (var4 == null) {
            this.c.b(var2);
         } else if (var4.m() != this.e) {
            this.c.b(var2);
         } else if (var4.i() || !C_c.b(var4)) {
            this.c.b(var2);
         }
      }

      for (int var5 = 0; var5 < this.c.size(); var5++) {
         this.b.c(this.c.a(var5));
      }
   }

   public void d() {
      this.c.clear();
      this.b.clear();
      this.e = -1;
   }

   public C_a a(int var1) {
      return C_c.a(this.b.a(var1));
   }

   public int e() {
      return this.b.size();
   }

   public long f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public void b(int var1) {
      this.e = var1;
   }
}
