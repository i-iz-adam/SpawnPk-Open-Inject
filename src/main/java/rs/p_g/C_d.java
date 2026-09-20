package rs.p_g;

import rs.C_Client_mc;
import rs.p_gui.C_Launcher_mc;

public class C_d extends C_b {
   long a = System.nanoTime();
   private long b;

   @Override
   public void a() {
      this.a = System.nanoTime();
   }

   @Override
   public int a(int var1, int var2) {
      C_Client_mc var3 = C_Launcher_mc.n().o();
      long var4 = 0L;
      boolean var6 = var3.au();
      boolean var7 = var3.cc;
      if (var6 && var7) {
         long var16 = System.nanoTime();
         if (var16 >= this.b() && var16 >= this.b) {
            if (var4 > 0L) {
               long var17 = var16 - this.b;
               long var19 = var4 - var17;
               var19 /= 1000000L;
               if (var19 > 0L) {
                  try {
                     if (var19 % 10L == 0L) {
                        Thread.sleep(var19 - 1L);
                        Thread.sleep(1L);
                     } else {
                        Thread.sleep(var19);
                     }
                  } catch (InterruptedException var15) {
                     var15.printStackTrace();
                  }

                  var16 = System.nanoTime();
               }
            }

            this.b = var16;
            long var18 = (long)var1 * 1000000L;
            long var21 = var16 - this.b();
            int var22 = (int)(var21 / var18);
            this.a(this.b() + (long)var22 * var18);
            if (var22 > 10) {
               var22 = 10;
            }

            return var22;
         } else {
            this.a(this.b = var16);
            return 1;
         }
      } else {
         long var8 = (long)var2 * 1000000L;
         long var10 = this.a - System.nanoTime();
         if (var10 < var8) {
            var10 = var8;
         }

         C_e.a(var10 / 1000000L);
         long var12 = System.nanoTime();
         int var14 = 0;

         while (var14 < 10 && (var14 < 1 || this.a < var12)) {
            var14++;
            this.a += (long)var1 * 1000000L;
         }

         if (this.a < var12) {
            this.a = var12;
         }

         return var14;
      }
   }

   public long b() {
      return this.a;
   }

   public void a(long var1) {
      this.a = var1;
   }
}
