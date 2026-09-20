package rs.p_a;

import rs.C_Client_mc;
import rs.p_l.C_F_uc;
import rs.p_l.C_J_uc;

public class C_f {
   private int a;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;

   public C_f(int var1, int var2, int var3) {
      this.d = var1;
      this.e = var2;
      this.c = var3;
   }

   public void a(C_Client_mc var1, C_c var2, int var3, int var4, int var5) {
      if (var4 > -1) {
         if (var3 == 1) {
            var5 -= 20;
         }

         if (var3 == 2) {
            var4 -= 15;
            var5 -= 10;
         }

         if (var3 == 3) {
            var4 += 15;
            var5 -= 10;
         }

         if (this.e == 0) {
            var1.dS[0].f(var4 - 12, var5 - 12);
         } else {
            switch (this.d) {
               case 1:
                  if (var2 instanceof C_j && ((C_j)var2).aG.x == 3329L) {
                     var1.db.f(var4 - 12, var5 - 12);
                  } else {
                     var1.dS[this.d].f(var4 - 12, var5 - 12);
                  }
                  break;
               case 2:
                  var1.dS[2].f(var4 - 11, var5 - 12);
                  break;
               case 3:
                  var1.cZ.f(var4 - 11, var5 - 12);
                  break;
               case 4:
                  var1.dS[4].f(var4 - 11, var5 - 12);
                  var5 += 2;
                  var4 += 2;
                  break;
               case 5:
                  var1.dc.f(var4 - 11, var5 - 12);
                  break;
               case 6:
                  var1.da.f(var4 - 12, var5 - 12);
                  break;
               case 7:
                  var1.db.f(var4 - 12, var5 - 12);
                  break;
               case 8:
                  C_J_uc.g.f(var4 - 11, var5 - 12);
                  break;
               default:
                  var1.dS[this.d].f(var4 - 12, var5 - 12);
            }
         }

         if (rs.p_f.C_a.aq && this.c != 255 && this.e > 0) {
            short var6 = 200;
            if (var3 == 0) {
               var1.df[this.c].a(var4 - 3, var5 - 8, var6);
            } else if (var3 == 1) {
               var1.df[this.c].a(var4 - 3, var5 - 8, var6);
            } else if (var3 == 2) {
               var1.df[this.c].a(var4 - 26, var5 - 13, var6);
            } else {
               var1.df[this.c].a(var4 - 3, var5 - 13, var6);
            }
         }

         C_Client_mc.gh.e(0, this.e, var5 + 4, var4);
         C_Client_mc.gh.e(16777215, this.e, var5 + 3, var4 - 1);
      }
   }

   public void b(C_Client_mc var1, C_c var2, int var3, int var4, int var5) {
      var5 += 20 * var3;
      if (!rs.p_l.p_b.C_a.a()) {
         if (C_Client_mc.ff % 5 == 0 && this.a > -15) {
            this.a--;
         }

         if (this.g - 40 < C_Client_mc.ff) {
            this.b -= 5;
         }
      }

      byte var6 = 1;
      if (this.e >= 10 && this.e < 100) {
         var6 = 2;
      }

      if (this.e >= 100) {
         var6 = 3;
      }

      int var7 = this.b;
      if (var7 < 0) {
         var7 = 0;
      }

      if (this.e <= 0) {
         var1.dd.a(var4 - 12, var5 - 14 + this.a, var7);
      } else {
         C_F_uc var8 = null;
         C_F_uc var9 = null;
         C_F_uc var10 = null;
         int var11 = 0;
         switch (var6) {
            case 1:
               var11 = 8;
               break;
            case 2:
               var11 = 4;
               break;
            case 3:
               var11 = 1;
         }

         switch (this.d) {
            case 0:
            case 1:
               var8 = var1.de[0];
               var9 = var1.de[1];
               var10 = var1.de[2];
               break;
            case 2:
               var8 = var1.de[6];
               var9 = var1.de[7];
               var10 = var1.de[8];
               break;
            case 3:
               var8 = var1.de[9];
               var9 = var1.de[10];
               var10 = var1.de[11];
               break;
            case 4:
               var8 = var1.de[18];
               var9 = var1.de[19];
               var10 = var1.de[20];
               break;
            case 5:
               var8 = var1.de[12];
               var9 = var1.de[13];
               var10 = var1.de[14];
               break;
            case 6:
               var8 = var1.de[3];
               var9 = var1.de[4];
               var10 = var1.de[5];
               break;
            case 7:
               var8 = var1.de[16];
               var9 = var1.de[15];
               var10 = var1.de[17];
               break;
            case 8:
               var8 = var1.de[18];
               var9 = var1.de[19];
               var10 = var1.de[20];
         }

         if (this.c != 255) {
            var1.df[this.c].a(var4 - 34 + var11, var5 - 14 + this.a, var7);
         }

         var8.a(var4 - 12 + var11, var5 - 12 + this.a, var7);
         var11 += 4;

         for (int var12 = 0; var12 < var6 * 2; var12++) {
            var9.a(var4 - 12 + var11, var5 - 12 + this.a, var7);
            var11 += 4;
         }

         var10.a(var4 - 12 + var11, var5 - 12 + this.a, var7);
         if (var7 > 100) {
            (this.d == 1 ? C_Client_mc.gh : C_Client_mc.gh).e(16777215, this.e, var5 + (this.d != 0 ? 2 : 32) + this.a + 2, var4 + 4);
         }
      }
   }

   public int a() {
      return this.a;
   }

   public void a(int var1) {
      this.a = var1;
   }

   public int b() {
      return this.b;
   }

   public void b(int var1) {
      this.b = var1;
   }

   public int c() {
      return this.c;
   }

   public void c(int var1) {
      this.c = var1;
   }

   public int d() {
      return this.d;
   }

   public void d(int var1) {
      this.d = var1;
   }

   public int e() {
      return this.e;
   }

   public void e(int var1) {
      this.e = var1;
   }

   public int f() {
      return this.f;
   }

   public void f(int var1) {
      this.f = var1;
   }

   public int g() {
      return this.g;
   }

   public void g(int var1) {
      this.g = var1;
   }
}
