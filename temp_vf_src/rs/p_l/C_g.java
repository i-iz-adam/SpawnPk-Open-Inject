package rs.p_l;

import rs.C_Client_mc;

public class C_g {
   protected C_Client_mc a;
   protected C_F_uc b;
   protected C_F_uc c;
   protected int d;
   protected int e;
   protected int f;
   protected int g;
   protected int h;
   protected boolean i;
   protected boolean j;

   public C_g(C_Client_mc var1, C_F_uc var2, C_F_uc var3, int var4, int var5, int var6) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.e = var4;
      this.f = var5;
      this.g = var6;
   }

   public C_g(C_Client_mc var1, C_F_uc var2, C_F_uc var3, int var4, int var5) {
      this(var1, var2, var3, var4, var5, 0);
   }

   public void a(int var1, int var2) {
      boolean var3 = this.b(var1, var2);
      this.a(var1, var2, var3);
   }

   public boolean b(int var1, int var2) {
      return C_Client_mc.hP >= var1 && C_Client_mc.hP <= var1 + this.b.n && C_Client_mc.hQ >= var2 && C_Client_mc.hQ <= var2 + this.b.o;
   }

   public void a(int var1, int var2, boolean var3) {
      this.b.c(var1, var2);
      this.i = var3;
      this.j = this.i;
      if (this.g > 0 && this.h < this.g) {
         this.h++;
      } else {
         this.h = 0;
         if (this.i) {
            if (this.j) {
               if (this.d < this.e) {
                  this.d = this.d + this.f;
               } else {
                  this.j = false;
               }
            } else {
               if (this.d > 0) {
                  this.d = this.d - this.f;
               }

               if (this.d < 0) {
                  this.d = 0;
               }
            }
         } else {
            if (this.d > 0) {
               this.d = this.d - this.f;
            }

            if (this.d < 0) {
               this.d = 0;
            }
         }
      }

      this.c.g(var1, var2, this.d);
   }

   public boolean a() {
      return this.j;
   }

   public boolean b() {
      return this.i;
   }

   public int c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
