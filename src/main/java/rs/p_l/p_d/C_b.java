package rs.p_l.p_d;

import rs.C_Client_mc;
import rs.p_l.C_F_uc;

public class C_b {
   private int a;
   private C_Client_mc b;
   private String c;
   private String d;
   private C_F_uc e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;
   private boolean k;

   public C_b(C_Client_mc var1, C_F_uc var2, String var3, String var4, boolean var5) {
      this.b = var1;
      this.e = var2;
      this.c = var3;
      this.d = var4;
      this.k = var5;
      this.a = var5 ? 1 : 255;
      this.f = 225;
      this.g = 50;
      this.i = true;
      this.j = true;
   }

   public void a() {
      this.a = this.k ? 1 : 255;
      this.i = true;
   }

   public void b() {
      if (this.a > 0) {
         short var1 = 175;
         if (this.k && this.i) {
            if (this.a < var1) {
               this.a += 2;
            } else {
               this.i = false;
            }
         }

         if (this.b.gm != null) {
            if (this.k) {
               this.e.g(this.f, this.g, this.a);
            } else {
               this.e.c(this.f, this.g);
            }

            if (this.j) {
               this.b.gm.d(this.c, this.f + 175, this.g + 20, 16777215, 0, this.a);
               this.b.gm.d(this.d, this.f + 175, this.g + 36, 16777215, 0, this.a);
            } else {
               this.b.gm.c(this.c, this.f + 15, this.g + 20, 16777215, 0, this.a);
               this.b.gm.c(this.d, this.f + 15, this.g + 36, 16777215, 0, this.a);
            }
         }
      }
   }

   public boolean c() {
      return this.a > 0;
   }

   public void a(boolean var1) {
      this.k = var1;
   }

   public void a(String var1, String var2) {
      this.c = var1;
      this.d = var2;
   }

   public void a(int var1) {
      this.f = var1;
   }

   public void b(int var1) {
      this.g = var1;
   }

   public void b(boolean var1) {
      this.j = var1;
   }

   public boolean d() {
      return this.j;
   }
}
