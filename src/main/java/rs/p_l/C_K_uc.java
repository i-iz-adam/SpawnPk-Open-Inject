package rs.p_l;

import java.util.Random;

public class C_K_uc extends C_c {
   public String q;
   private final char[] s = new char[100];
   private final byte[][] t;
   private final int[] u;
   private final int[] v;
   private final int[] w;
   private final int[] x;
   private final int[] y;
   public int r;
   private final Random z;
   private boolean A;

   public C_K_uc(boolean var1, String var2, rs.p_x.C_f var3) {
      int var4 = !var2.equals("hit_full") && !var2.equals("critical_full") ? 256 : 58;
      this.q = var2;
      this.t = new byte[var4][];
      this.u = new int[var4];
      this.v = new int[var4];
      this.w = new int[var4];
      this.x = new int[var4];
      this.y = new int[var4];
      this.z = new Random();
      this.A = false;
      rs.p_x.C_e var5 = new rs.p_x.C_e(var3.a(var2 + ".dat"));
      rs.p_x.C_e var6 = new rs.p_x.C_e(var3.a("index.dat"));
      var6.h = var5.A() + 4;
      int var7 = var6.y();
      if (var7 > 0) {
         var6.h += 3 * (var7 - 1);
      }

      for (int var8 = 0; var8 < var4; var8++) {
         this.w[var8] = var6.y();
         this.x[var8] = var6.y();
         int var9 = this.u[var8] = var6.A();
         int var10 = this.v[var8] = var6.A();
         int var11 = var6.y();
         int var12 = var9 * var10;
         this.t[var8] = new byte[var12];
         if (var11 == 0) {
            for (int var15 = 0; var15 < var12; var15++) {
               this.t[var8][var15] = var5.z();
            }
         } else if (var11 == 1) {
            for (int var13 = 0; var13 < var9; var13++) {
               for (int var14 = 0; var14 < var10; var14++) {
                  this.t[var8][var13 + var14 * var9] = var5.z();
               }
            }
         }

         if (var10 > this.r && var8 < 128) {
            this.r = var10;
         }

         this.w[var8] = 1;
         this.y[var8] = var9 + 2;
         byte var16 = 0;

         for (int var18 = var10 / 7; var18 < var10; var18++) {
            var16 += this.t[var8][var18 * var9];
         }

         if (var16 <= var10 / 7) {
            this.y[var8]--;
            this.w[var8] = 0;
         }

         var16 = 0;

         for (int var19 = var10 / 7; var19 < var10; var19++) {
            var16 += this.t[var8][var9 - 1 + var19 * var9];
         }

         if (var16 <= var10 / 7) {
            this.y[var8]--;
         }
      }

      if (var1) {
         this.y[32] = this.y[73];
      } else {
         this.y[32] = this.y[105];
      }
   }

   public void a(String var1, int var2, int var3, int var4) {
      this.b(var3, var1, var4, var2 - this.b(var1));
   }

   public void a(int var1, String var2, int var3, int var4) {
      this.b(var1, var2, var3, var4 - this.b(var2) / 2);
   }

   public void a(int var1, int var2, String var3, int var4, boolean var5) {
      this.a(var5, var2 - this.a(var3) / 2, var1, var3, var4);
   }

   public void b(int var1, int var2, String var3, int var4, boolean var5) {
      this.a(var5, var2, var1, var3, var4);
   }

   public int a(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = 0;
         boolean var3 = false;

         for (int var4 = 0; var4 < var1.length(); var4++) {
            if (var1.charAt(var4) == '@' && var4 + 4 < var1.length() && var1.charAt(var4 + 4) == '@') {
               var4 += 4;
            } else if (var3) {
               if (var1.charAt(var4) == '=' && var4 > 3 && var1.charAt(var4 - 3) == 'i' && var1.charAt(var4 - 2) == 'm' && var1.charAt(var4 - 1) == 'g') {
                  var2 += 12;
               }

               if (var1.charAt(var4) == '>') {
                  var3 = false;
               }
            } else if (var1.charAt(var4) == '<') {
               var3 = true;
            } else {
               var2 += this.y[var1.charAt(var4)];
            }
         }

         return var2;
      }
   }

   public int b(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = 0;

         for (int var3 = 0; var3 < var1.length(); var3++) {
            var2 += this.y[var1.charAt(var3)];
         }

         return var2;
      }
   }

   public void b(int var1, String var2, int var3, int var4) {
      if (var2 != null) {
         var3 -= this.r;

         for (int var5 = 0; var5 < var2.length(); var5++) {
            char var6 = var2.charAt(var5);
            if (var6 != ' ') {
               this.a(this.t[var6], var4 + this.w[var6], var3 + this.x[var6], this.u[var6], this.v[var6], var1);
            }

            var4 += this.y[var6];
         }
      }
   }

   public void e(int var1, int var2, int var3, int var4) {
      var3 -= this.r;
      int var5 = 0;
      int var6 = 0;
      if (var2 == 0) {
         byte var11 = 48;
         var6 += this.y[var11];
         this.s[var5++] = (char)var11;
      } else {
         while (var2 > 0) {
            char var7 = (char)(var2 % 10 + 48);
            var6 += this.y[var7];
            this.s[var5++] = var7;
            var2 /= 10;
         }
      }

      if (var5 != 0) {
         var4 -= var6 / 2;

         for (int var12 = var5 - 1; var12 >= 0; var12--) {
            char var8 = this.s[var12];
            if (var8 != ' ') {
               this.a(this.t[var8], var4 + this.w[var8], var3 + this.x[var8], this.u[var8], this.v[var8], var1);
            }

            var4 += this.y[var8];
         }
      }
   }

   public void a(int var1, String var2, int var3, int var4, int var5) {
      if (var2 != null) {
         var3 -= this.b(var2) / 2;
         var5 -= this.r;

         for (int var6 = 0; var6 < var2.length(); var6++) {
            char var7 = var2.charAt(var6);
            if (var7 != ' ') {
               this.a(
                  this.t[var7],
                  var3 + this.w[var7],
                  var5 + this.x[var7] + (int)(Math.sin((double)var6 / 2.0 + (double)var4 / 5.0) * 5.0),
                  this.u[var7],
                  this.v[var7],
                  var1
               );
            }

            var3 += this.y[var7];
         }
      }
   }

   public void b(int var1, String var2, int var3, int var4, int var5) {
      if (var2 != null) {
         var1 -= this.b(var2) / 2;
         var4 -= this.r;

         for (int var6 = 0; var6 < var2.length(); var6++) {
            char var7 = var2.charAt(var6);
            if (var7 != ' ') {
               this.a(
                  this.t[var7],
                  var1 + this.w[var7] + (int)(Math.sin((double)var6 / 5.0 + (double)var3 / 5.0) * 5.0),
                  var4 + this.x[var7] + (int)(Math.sin((double)var6 / 3.0 + (double)var3 / 5.0) * 5.0),
                  this.u[var7],
                  this.v[var7],
                  var5
               );
            }

            var1 += this.y[var7];
         }
      }
   }

   public void a(int var1, String var2, int var3, int var4, int var5, int var6) {
      if (var2 != null) {
         double var7 = 7.0 - (double)var1 / 8.0;
         if (var7 < 0.0) {
            var7 = 0.0;
         }

         var5 -= this.b(var2) / 2;
         var4 -= this.r;

         for (int var9 = 0; var9 < var2.length(); var9++) {
            char var10 = var2.charAt(var9);
            if (var10 != ' ') {
               this.a(
                  this.t[var10],
                  var5 + this.w[var10],
                  var4 + this.x[var10] + (int)(Math.sin((double)var9 + (double)var3) * var7),
                  this.u[var10],
                  this.v[var10],
                  var6
               );
            }

            var5 += this.y[var10];
         }
      }
   }

   public void a(boolean var1, int var2, int var3, String var4, int var5) {
      this.A = false;
      int var6 = var2;
      if (var4 != null) {
         var5 -= this.r;

         for (int var7 = 0; var7 < var4.length(); var7++) {
            if (var4.charAt(var7) == '@' && var7 + 4 < var4.length() && var4.charAt(var7 + 4) == '@') {
               int var10 = this.c(var4.substring(var7 + 1, var7 + 4));
               if (var10 != -1) {
                  var3 = var10;
               }

               var7 += 4;
            } else {
               char var8 = var4.charAt(var7);
               if (var8 != ' ') {
                  if (var1) {
                     this.a(this.t[var8], var2 + this.w[var8] + 1, var5 + this.x[var8] + 1, this.u[var8], this.v[var8], 0);
                  }

                  this.a(this.t[var8], var2 + this.w[var8], var5 + this.x[var8], this.u[var8], this.v[var8], var3);
               }

               var2 += this.y[var8];
            }
         }

         if (this.A) {
            b(var5 + (int)((double)this.r * 0.7), 8388608, var2 - var6, var6);
         }
      }
   }

   public void a(int var1, int var2, String var3, int var4, int var5) {
      if (var3 != null) {
         this.z.setSeed((long)var4);
         int var6 = 192 + (this.z.nextInt() & 31);
         var5 -= this.r;

         for (int var7 = 0; var7 < var3.length(); var7++) {
            if (var3.charAt(var7) == '@' && var7 + 4 < var3.length() && var3.charAt(var7 + 4) == '@') {
               int var10 = this.c(var3.substring(var7 + 1, var7 + 4));
               if (var10 != -1) {
                  var2 = var10;
               }

               var7 += 4;
            } else {
               char var8 = var3.charAt(var7);
               if (var8 != ' ') {
                  this.a(192, var1 + this.w[var8] + 1, this.t[var8], this.u[var8], var5 + this.x[var8] + 1, this.v[var8], 0);
                  this.a(var6, var1 + this.w[var8], this.t[var8], this.u[var8], var5 + this.x[var8], this.v[var8], var2);
               }

               var1 += this.y[var8];
               if ((this.z.nextInt() & 3) == 0) {
                  var1++;
               }
            }
         }
      }
   }

   private int c(String var1) {
      if (var1.equals("red")) {
         return 16711680;
      } else if (var1.equals("gre")) {
         return 65280;
      } else if (var1.equals("blu")) {
         return 255;
      } else if (var1.equals("yel")) {
         return 16776960;
      } else if (var1.equals("cya")) {
         return 65535;
      } else if (var1.equals("mag")) {
         return 16711935;
      } else if (var1.equals("whi")) {
         return 16777215;
      } else if (var1.equals("bla")) {
         return 0;
      } else if (var1.equals("lre")) {
         return 16748608;
      } else if (var1.equals("dre")) {
         return 8388608;
      } else if (var1.equals("dbl")) {
         return 128;
      } else if (var1.equals("or1")) {
         return 16756736;
      } else if (var1.equals("or2")) {
         return 16740352;
      } else if (var1.equals("or3")) {
         return 16723968;
      } else if (var1.equals("gr1")) {
         return 12648192;
      } else if (var1.equals("gr2")) {
         return 8453888;
      } else if (var1.equals("gr3")) {
         return 4259584;
      } else {
         if (var1.equals("str")) {
            this.A = true;
         }

         if (var1.equals("end")) {
            this.A = false;
         }

         return -1;
      }
   }

   private void a(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var2 + var3 * h;
      int var8 = h - var4;
      int var9 = 0;
      int var10 = 0;
      if (var3 < j) {
         int var11 = j - var3;
         var5 -= var11;
         var3 = j;
         var10 += var11 * var4;
         var7 += var11 * h;
      }

      if (var3 + var5 >= k) {
         var5 -= var3 + var5 - k + 1;
      }

      if (var2 < l) {
         int var12 = l - var2;
         var4 -= var12;
         var2 = l;
         var10 += var12;
         var7 += var12;
         var9 += var12;
         var8 += var12;
      }

      if (var2 + var4 >= m) {
         int var13 = var2 + var4 - m + 1;
         var4 -= var13;
         var9 += var13;
         var8 += var13;
      }

      if (var4 > 0 && var5 > 0) {
         this.a(g, var1, var6, var10, var7, var4, var5, var8, var9);
      }
   }

   private void a(int[] var1, byte[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = -(var6 >> 2);
      var6 = -(var6 & 3);

      for (int var11 = -var7; var11 < 0; var11++) {
         for (int var12 = var10; var12 < 0; var12++) {
            if (var2[var4++] != 0) {
               a(var1, var5++, var3, var3, 255);
            } else {
               var5++;
            }

            if (var2[var4++] != 0) {
               a(var1, var5++, var3, var3, 255);
            } else {
               var5++;
            }

            if (var2[var4++] != 0) {
               a(var1, var5++, var3, var3, 255);
            } else {
               var5++;
            }

            if (var2[var4++] != 0) {
               a(var1, var5++, var3, var3, 255);
            } else {
               var5++;
            }
         }

         for (int var20 = var6; var20 < 0; var20++) {
            if (var2[var4++] != 0) {
               a(var1, var5++, var3, var3, 255);
            } else {
               var5++;
            }
         }

         var5 += var8;
         var4 += var9;
      }
   }

   private void a(int var1, int var2, byte[] var3, int var4, int var5, int var6, int var7) {
      int var8 = var2 + var5 * h;
      int var9 = h - var4;
      int var10 = 0;
      int var11 = 0;
      if (var5 < j) {
         int var12 = j - var5;
         var6 -= var12;
         var5 = j;
         var11 += var12 * var4;
         var8 += var12 * h;
      }

      if (var5 + var6 >= k) {
         var6 -= var5 + var6 - k + 1;
      }

      if (var2 < l) {
         int var13 = l - var2;
         var4 -= var13;
         var2 = l;
         var11 += var13;
         var8 += var13;
         var10 += var13;
         var9 += var13;
      }

      if (var2 + var4 >= m) {
         int var14 = var2 + var4 - m + 1;
         var4 -= var14;
         var10 += var14;
         var9 += var14;
      }

      if (var4 > 0 && var6 > 0) {
         this.a(var3, var6, var8, g, var11, var4, var10, var9, var7, var1);
      }
   }

   private void a(byte[] var1, int var2, int var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      var9 = ((var9 & 16711935) * var10 & -16711936) + ((var9 & 0xFF00) * var10 & 0xFF0000) >> 8;
      var10 = 256 - var10;

      for (int var11 = -var2; var11 < 0; var11++) {
         for (int var12 = -var6; var12 < 0; var12++) {
            if (var1[var5++] != 0) {
               int var13 = var4[var3];
               var4[var3++] = (((var13 & 16711935) * var10 & -16711936) + ((var13 & 0xFF00) * var10 & 0xFF0000) >> 8) + var9;
            } else {
               var3++;
            }
         }

         var3 += var8;
         var5 += var7;
      }
   }
}
