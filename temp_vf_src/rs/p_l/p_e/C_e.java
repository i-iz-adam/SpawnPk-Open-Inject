package rs.p_l.p_e;

import java.util.ArrayList;
import java.util.List;
import rs.C_Client_mc;
import rs.p_l.C_F_uc;

public class C_e {
   private static final int b = 460;
   private static final int c = 30;
   private static final long d = 650L;
   private static final double e = 1.05;
   private static final double f = 1.25;
   private long g;
   private C_Client_mc h;
   public C_F_uc[] a = new C_F_uc[23];
   private List<C_d> i = new ArrayList<>();
   private List<C_d> j = new ArrayList<>();

   public C_e(C_Client_mc var1) {
      this.h = var1;

      for (int var2 = 0; var2 < this.a.length; var2++) {
         this.a[var2] = new C_F_uc(C_F_uc.a(C_F_uc.b("skills/" + var2), 13, 13));
      }
   }

   public void a(int var1, int var2) {
      if (var2 >= 0) {
         int[] var3 = new int[]{0, 1, 2, 4, 6};
         boolean var4 = false;

         for (int var8 : var3) {
            if (var1 == var8) {
               var4 = true;
            }
         }

         if (var2 != 0) {
            C_d var9 = new C_d(var2, var1);
            var9.b = 460;
            var9.c = 0;
            if ((var4 || var1 == 3) && System.currentTimeMillis() - this.g <= 650L && !this.i.isEmpty()) {
               C_d var10 = this.i.get(this.i.size() - 1);
               var10.d += var2;
               if (!var10.a.contains(var1)) {
                  var10.a.add(var1);
               }

               this.g = System.currentTimeMillis();
            } else {
               this.g = System.currentTimeMillis();
               if (!this.b()) {
                  this.j.add(var9);
               } else {
                  this.i.add(var9);
               }
            }
         }
      }
   }

   public void a() {
      ArrayList var1 = new ArrayList();
      if (this.b() && !this.j.isEmpty()) {
         C_d var2 = this.j.get(0);
         this.i.add(var2);
         this.j.remove(var2);
         this.g = System.currentTimeMillis();
      }

      for (int var11 = 0; var11 < this.i.size(); var11++) {
         C_d var3 = this.i.get(var11);
         if (!rs.p_l.p_b.C_a.a()) {
            if (var3.f) {
               var3.e = (int)((double)var3.e + 15.75);
               if (var3.e >= 255) {
                  var3.e = 255;
                  var3.f = false;
               }
            } else {
               var3.e = (int)(255.0 - (double)var3.c * 1.05);
            }

            if (var3.e < 0) {
               var3.e = 0;
            }

            var3.c = (int)((double)var3.c + 1.25);
         }

         int var4 = var3.d;
         String var5 = "+" + var4;
         if (var4 >= 10000) {
            var5 = "+" + C_Client_mc.g(var4);
         }

         int var6 = C_Client_mc.ai() ? C_Client_mc.ai - 750 : 4;
         int var7 = C_Client_mc.ai() ? 0 : 4;
         int var8 = 0;
         if (var5.length() >= 6) {
            var6 -= 5;
            var8 -= 3;
         }

         if (var5.length() == 5) {
            var6 -= 3;
            var8--;
         }

         if (this.h.v.g()) {
            for (int var9 = 0; var9 < var3.a.size(); var9++) {
               this.a[var3.a.get(var9)].g(var6 + var3.b - var9 * 15 - (int)((double)var5.length() * 0.75) + 9 + var8, var7 + var3.c + 3, var3.e);
            }
         }

         int var13 = 35 + var6;
         int var10 = 15 + var7;
         if (this.h.v.g()) {
            C_Client_mc.gl.d(var5, var3.b + var13, var3.c + var10, 16777215, 100, var3.e);
         }

         if (255.0 - (double)var3.c * 1.05 <= -10.0) {
            var1.add(var3);
         }
      }

      for (int var12 = 0; var12 < var1.size(); var12++) {
         this.i.remove(var1.get(var12));
      }
   }

   private boolean b() {
      for (int var1 = 0; var1 < this.i.size(); var1++) {
         if (this.i.get(var1).c <= 40) {
            return false;
         }
      }

      return true;
   }
}
