package rs.p_l.p_a;

import rs.p_l.C_F_uc;

public class C_b {
   public static C_b a;
   protected final long b;
   protected final C_F_uc[] c;
   protected int d;
   protected long e;

   public static void a() {
      a = new C_b("glitter", 4, 100L);
   }

   public C_b(C_F_uc[] var1, long var2) {
      this.c = var1;
      this.b = var2;
   }

   public C_b(String var1, int var2, long var3) {
      this.c = new C_F_uc[var2];

      for (int var5 = 0; var5 < var2; var5++) {
         this.c[var5] = new C_F_uc("anim/" + var1 + " " + var5);
      }

      this.b = var3;
   }

   public void b() {
      if (this.c != null) {
         if (System.currentTimeMillis() > this.e) {
            this.d++;
            if (this.d >= this.c.length) {
               this.d = 0;
            }

            this.e = System.currentTimeMillis() + this.b;
         }
      }
   }

   public C_F_uc c() {
      if (this.c == null) {
         return null;
      } else {
         this.b();
         return this.c[this.d];
      }
   }

   public void a(int var1, int var2) {
      if (this.c() != null) {
         this.c().f(var1, var2);
      }
   }

   public void a(int var1, int var2, int var3) {
      if (this.c() != null) {
         this.c().g(var1, var2, var3);
      }
   }

   public void b(int var1, int var2) {
      if (this.c() != null) {
         this.c().c(var1, var2);
      }
   }
}
