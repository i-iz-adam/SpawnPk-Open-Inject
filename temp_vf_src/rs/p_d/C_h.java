package rs.p_d;

import java.awt.Color;
import java.io.File;
import rs.C_Client_mc;

public final class C_h {
   public static C_h.a a = C_h.a.a;
   public static C_h[] b;
   public int c;
   public int d = -1;
   public boolean e = true;
   public int f;
   public int g;
   public int h;
   public int i;
   public int j;
   public int k;

   public static void a(C_h.a var0) {
      rs.p_x.C_e var1 = null;
      a = var0;
      switch (var0) {
         case a:
            var1 = new rs.p_x.C_e(C_Client_mc.a(rs.p_v.C_a.f() + "flo.dat"));
            break;
         case b:
            var1 = new rs.p_x.C_e(C_Client_mc.a(rs.p_v.C_a.f() + "osrs_flo.dat"));
            break;
         case c:
            var1 = new rs.p_x.C_e(C_Client_mc.a(rs.p_v.C_a.f() + "osrs_config" + File.separator + "flo.dat"));
      }

      int var2 = var1.A();
      if (b == null || b.length != var2) {
         b = new C_h[var2];
      }

      for (int var3 = 0; var3 < var2; var3++) {
         if (b[var3] == null) {
            b[var3] = new C_h();
         }

         b[var3].a(var1);
      }
   }

   public static void a(rs.p_x.C_f var0) {
      rs.p_x.C_e var1 = null;
      var1 = new rs.p_x.C_e(C_Client_mc.a(rs.p_v.C_a.f() + "flo.dat"));
      int var2 = var1.A();
      if (b == null) {
         b = new C_h[var2];
      }

      for (int var3 = 0; var3 < var2; var3++) {
         if (b[var3] == null) {
            b[var3] = new C_h();
         }

         b[var3].a(var1);
      }
   }

   private boolean a(rs.p_x.C_e var1) {
      while (true) {
         int var2 = var1.y();
         if (var2 == 0) {
            return true;
         }

         if (var2 != 1) {
            if (var2 == 2) {
               this.d = var1.y();
            } else if (var2 == 3) {
               boolean var3 = true;
            } else if (var2 == 5) {
               this.e = false;
            } else if (var2 == 6) {
               var1.F();
            } else if (var2 == 7) {
               int var9 = this.f;
               int var10 = this.g;
               int var6 = this.h;
               int var7 = this.i;
               int var8 = var1.C();
               this.a(var8);
               this.f = var9;
               this.g = var10;
               this.h = var6;
               this.i = var7;
               this.j = var7;
            } else {
               System.out.println("[FLO] Error unrecognised config code: " + var2);
            }
         } else {
            this.c = var1.C();
            if (rs.p_f.C_a.r != rs.p_f.C_a.b.a) {
               Color var4 = Color.decode(this.c + "");
               byte var5 = 10;
               if (Math.abs(var4.getGreen() - var4.getRed()) > var5
                  || Math.abs(var4.getRed() - var4.getBlue()) > var5
                  || Math.abs(var4.getGreen() - var4.getBlue()) > var5) {
                  if (rs.p_f.C_a.r == rs.p_f.C_a.b.c && var4.getGreen() > 50) {
                     this.c = 2238754;
                  }

                  if (var4.getGreen() > 100) {
                     this.c = rs.p_f.C_a.r.f;
                  }
               }
            }

            this.a(this.c);
         }
      }
   }

   private void a(int var1) {
      double var2 = (double)(var1 >> 16 & 0xFF) / 256.0;
      double var4 = (double)(var1 >> 8 & 0xFF) / 256.0;
      double var6 = (double)(var1 & 0xFF) / 256.0;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0;
      double var14 = 0.0;
      double var16 = (var8 + var10) / 2.0;
      if (var8 != var10) {
         if (var16 < 0.5) {
            var14 = (var10 - var8) / (var10 + var8);
         }

         if (var16 >= 0.5) {
            var14 = (var10 - var8) / (2.0 - var10 - var8);
         }

         if (var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var4 == var10) {
            var12 = 2.0 + (var6 - var2) / (var10 - var8);
         } else if (var6 == var10) {
            var12 = 4.0 + (var2 - var4) / (var10 - var8);
         }
      }

      var12 /= 6.0;
      this.f = (int)(var12 * 256.0);
      this.g = (int)(var14 * 256.0);
      this.h = (int)(var16 * 256.0);
      if (this.g < 0) {
         this.g = 0;
      } else if (this.g > 255) {
         this.g = 255;
      }

      if (this.h < 0) {
         this.h = 0;
      } else if (this.h > 255) {
         this.h = 255;
      }

      if (var16 > 0.5) {
         this.j = (int)((1.0 - var16) * var14 * 512.0);
      } else {
         this.j = (int)(var16 * var14 * 512.0);
      }

      if (this.j < 1) {
         this.j = 1;
      }

      this.i = (int)(var12 * (double)this.j);
      int var18 = this.f + (int)(Math.random() * 16.0) - 8;
      if (var18 < 0) {
         var18 = 0;
      } else if (var18 > 255) {
         var18 = 255;
      }

      int var19 = this.g + (int)(Math.random() * 48.0) - 24;
      if (var19 < 0) {
         var19 = 0;
      } else if (var19 > 255) {
         var19 = 255;
      }

      int var20 = this.h + (int)(Math.random() * 48.0) - 24;
      if (var20 < 0) {
         var20 = 0;
      } else if (var20 > 255) {
         var20 = 255;
      }

      this.k = this.a(var18, var19, var20);
   }

   private int a(int var1, int var2, int var3) {
      if (var3 > 179) {
         var2 /= 2;
      }

      if (var3 > 192) {
         var2 /= 2;
      }

      if (var3 > 217) {
         var2 /= 2;
      }

      if (var3 > 243) {
         var2 /= 2;
      }

      return (var1 / 4 << 10) + (var2 / 32 << 7) + var3 / 2;
   }

   private C_h() {
   }

   public static enum a {
      a,
      b,
      c;
   }
}
