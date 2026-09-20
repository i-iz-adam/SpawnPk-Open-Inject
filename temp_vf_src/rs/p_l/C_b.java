package rs.p_l;

public class C_b {
   private final int a = 1;
   private final int b = 45;
   private C_F_uc c;
   private C_F_uc d;
   private boolean e;
   private int f;
   private int g;
   private int h;
   private int i;
   private long j;

   public C_b(C_F_uc var1, C_F_uc var2, int var3) {
      this.c = var1;
      this.d = var2;
      this.g = var3;
   }

   public void a(int var1, int var2) {
      this.c.c(var1, var2);
      if (this.e) {
         if (System.currentTimeMillis() - this.j >= 45L) {
            if (this.h != this.g * (this.f / 1)) {
               this.h = this.h + this.f;
            } else {
               this.e = false;
            }

            this.j = System.currentTimeMillis();
         }
      } else {
         this.i = 0;
         if (System.currentTimeMillis() - this.j >= 45L) {
            if (this.h != 0) {
               this.h = this.h + this.f * -1;
               this.j = System.currentTimeMillis();
            } else if (Math.random() * 100.0 <= 2.0 || System.currentTimeMillis() - this.j >= 1000L) {
               this.f = this.f < 0 ? 1 : -1;
               this.e = true;
            }
         }
      }

      this.d.c(var1 + this.h, var2 + this.i);
   }
}
