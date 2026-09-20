package rs.p_k;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class C_o {
   private static final double a = Math.sqrt(2.0);
   private static final double b = 3.075;
   private static final int c = 5;
   private static final int d = 13;
   private static final int e = 15;
   private static final Pattern f = Pattern.compile(
      "^[ \\t]*(?<expr>//.*$|m[ \\t]*(?<mrx>[0-9]+)[ \\t]+(?<mry>[0-9]+)|r[ \\t]*(?<rx>[0-9]+)[ \\t]+(?<ry>[0-9]+)|R[ \\t]*(?<rx1>[0-9]+)[ \\t]+(?<ry1>[0-9]+)[ \\t]+(?<rx2>[0-9]+)[ \\t]+(?<ry2>[0-9]+)|c[ \\t]*(?<cx>[0-9-]+)[ \\t]+(?<cy>[0-9-]+)|C[ \\t]*(?<cx1>[0-9-]+)[ \\t]+(?<cy1>[0-9-]+)[ \\t]+(?<cx2>[0-9-]+)[ \\t]+(?<cy2>[0-9-]+)|#[ \\t]*(?<color>[0-9a-fA-F]{6}|[0-9a-fA-F]{3})|p[ \\t]*(?<plane>all|0?[ \\t]*1?[ \\t]*2?[ \\t]*3?)|b[ \\t]*(?<blend>[0-9]+)|bounds[ \\t]+(?<bx1>[0-9]+)[ \\t]+(?<by1>[0-9]+)[ \\t]+(?<bx2>[0-9]+)[ \\t]+(?<by2>[0-9]+))[ \\t]*"
   );
   private final int[] g;
   private final int[] h;
   private final int i;
   private final int j;
   private final int k;
   private final int l;
   private final int m;

   public C_o(InputStream var1, String var2) {
      this(new InputStreamReader(var1), var2);
   }

   public C_o(Reader var1, String var2) {
      int[] var3 = null;
      int[] var4 = new int[64];
      byte var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      BufferedReader var11 = new BufferedReader(var1);
      int var12 = 1;
      int var13 = 0;
      int var14 = 15;
      int var15 = 0;
      int var16 = 0;
      int var17 = 0;
      int var18 = 0;

      String var20;
      try {
         for (Matcher var19 = f.matcher(""); (var20 = var11.readLine()) != null; var12++) {
            var19.reset(var20);
            int var21 = 0;

            while (var21 < var20.length()) {
               var19.region(var21, var20.length());
               if (!var19.find()) {
                  throw new IllegalArgumentException("Unexpected: \"" + var20.substring(var21) + "\" (" + var2 + ":" + var12 + ")");
               }

               var21 = var19.end();
               String var22 = var19.group("expr");
               if (var22 != null && var22.length() > 0 && !var22.startsWith("//")) {
                  if (var3 == null) {
                     if (!var22.startsWith("bounds")) {
                        throw new IllegalArgumentException("Expected bounds (" + var2 + ":" + var12 + ")");
                     }

                     var6 = Integer.parseInt(var19.group("bx1")) * 8;
                     var7 = Integer.parseInt(var19.group("by1")) * 8;
                     var8 = (Integer.parseInt(var19.group("bx2")) + 1) * 8;
                     var9 = (Integer.parseInt(var19.group("by2")) + 1) * 8;
                     var10 = var8 - var6;
                     var3 = new int[var10 * (var9 - var7)];
                     Arrays.fill(var3, -1);
                  } else {
                     char var23 = var22.charAt(0);
                     switch (var23) {
                        case '#':
                           String var24 = var19.group("color");
                           int var25 = Integer.parseInt(var24, 16);
                           int var47;
                           int var48;
                           int var49;
                           if (var24.length() == 3) {
                              var47 = var25 >> 8 & 15;
                              var47 |= var47 << 4;
                              var48 = var25 >> 4 & 15;
                              var48 |= var48 << 4;
                              var49 = var25 & 15;
                              var49 |= var49 << 4;
                           } else {
                              var47 = var25 >> 16 & 0xFF;
                              var48 = var25 >> 8 & 0xFF;
                              var49 = var25 & 0xFF;
                           }

                           byte var29 = (byte)(var49 - var47);
                           byte var30 = (byte)(var47 + (var29 >> 1));
                           byte var31 = (byte)(var30 - var48);
                           byte var32 = (byte)(var48 + (var31 >> 1));
                           var13 = var13 & 0xFF000000 | (var32 & 255) << 16 | (var29 & 255) << 8 | var31 & 255;
                           break;
                        case 'R':
                        case 'r':
                           if (var23 == 'r') {
                              var17 = var15 = Integer.parseInt(var19.group("rx"));
                              var18 = var16 = Integer.parseInt(var19.group("ry"));
                           } else {
                              var15 = Integer.parseInt(var19.group("rx1"));
                              var16 = Integer.parseInt(var19.group("ry1"));
                              var17 = Integer.parseInt(var19.group("rx2"));
                              var18 = Integer.parseInt(var19.group("ry2"));
                           }
                        case 'C':
                        case 'c':
                           int var50 = var15 * 8;
                           int var36 = var16 * 8;
                           int var37 = var17 * 8 + 7;
                           int var38 = var18 * 8 + 7;
                           if (var23 == 'c') {
                              var37 = var50 += Integer.parseInt(var19.group("cx"));
                              var38 = var36 += Integer.parseInt(var19.group("cy"));
                           } else if (var23 == 'C') {
                              var37 = var50 + Integer.parseInt(var19.group("cx2"));
                              var38 = var36 + Integer.parseInt(var19.group("cy2"));
                              var50 += Integer.parseInt(var19.group("cx1"));
                              var36 += Integer.parseInt(var19.group("cy1"));
                           }

                           if (var50 >= var6 && var36 >= var7 && var37 < var8 && var38 < var9) {
                              if (var50 <= var37 && var36 <= var38) {
                                 for (int var39 = var36; var39 <= var38; var39++) {
                                    int var40 = var10 * (var39 - var7);

                                    for (int var41 = var50; var41 <= var37; var41++) {
                                       int var42 = var41 - var6 + var40;
                                       if (var14 == 15) {
                                          var3[var42] = var13;
                                       } else {
                                          int var43 = var3[var42];
                                          int var44;
                                          if ((var43 & -2147483648) != 0 && var43 != -1) {
                                             var44 = var43 & 2147483647;
                                          } else {
                                             var44 = var5;
                                             var5 += 4;
                                             if (var5 > var4.length) {
                                                var4 = Arrays.copyOf(var4, var5 + 64);
                                             }

                                             var3[var42] = var44 | -2147483648;

                                             for (int var45 = 0; var45 < 4; var45++) {
                                                var4[var44 + var45] = var43;
                                             }
                                          }

                                          for (int var51 = 0; var51 < 4; var51++) {
                                             if ((var14 & 1 << var51) != 0) {
                                                var4[var44 + var51] = var13;
                                             }
                                          }
                                       }
                                    }
                                 }
                                 break;
                              }

                              throw new IllegalArgumentException("First coord must be before second (" + var2 + ":" + var12 + ")");
                           }

                           throw new IllegalArgumentException("Coordinate out of bounds (" + var2 + ":" + var12 + ")");
                        case 'b':
                           int var33 = Integer.parseInt(var19.group("blend"));
                           if (var33 < 0) {
                              throw new IllegalArgumentException("Blend must be >=0 (" + var2 + ":" + var12 + ")");
                           }

                           if (var33 > 13) {
                              throw new IllegalArgumentException("Blend must be <= 13 (" + var2 + ":" + var12 + ")");
                           }

                           var13 = var13 & 16777215 | var33 << 24;
                           break;
                        case 'm':
                           var17 = var15 = Integer.parseInt(var19.group("mrx"));
                           var18 = var16 = Integer.parseInt(var19.group("mry"));
                           break;
                        case 'p':
                           String var34 = var19.group("plane");
                           if (!"all".equals(var34)) {
                              var14 = 0;

                              for (int var35 = 0; var35 < var34.length(); var35++) {
                                 var14 |= 1 << var34.charAt(var35) - '0';
                              }
                           } else {
                              var14 = 15;
                           }
                     }
                  }
               }
            }
         }
      } catch (NumberFormatException var46) {
         throw new IllegalArgumentException("Expected number (" + var2 + ":" + var12 + ")", var46);
      }

      if (var3 == null) {
         throw new IllegalArgumentException(var2 + ": no data");
      } else {
         this.g = var3;
         this.h = var4;
         this.m = var10;
         this.i = var6;
         this.j = var7;
         this.k = var8;
         this.l = var9;
      }
   }

   private int a(int var1, int var2, int var3, C_o.a var4) {
      if (var4 != null) {
         int var5 = var4.a(var1, var2, var3);
         if (var5 == -1) {
            return -1;
         }

         var2 = var5 >> 3 & 2047;
         var1 = var5 >> 14 & 1023;
         var3 = var5 >> 24 & 3;
      }

      if (var1 < this.i) {
         var1 = this.i;
      }

      if (var1 >= this.k) {
         var1 = this.k - 1;
      }

      if (var2 < this.j) {
         var2 = this.j;
      }

      if (var2 >= this.l) {
         var2 = this.l - 1;
      }

      int var6 = this.g[this.m * (var2 - this.j) + (var1 - this.i)];
      if (var6 == -1) {
         return -1;
      } else {
         if ((var6 & -2147483648) != 0) {
            var6 = this.h[var6 & 2147483647 | var3];
         }

         return var6;
      }
   }

   public int a(double var1, double var3, int var5, int var6, int var7, double var8, C_o.a var10) {
      var1 /= 8.0;
      var3 /= 8.0;
      int var11 = (int)var1;
      int var12 = (int)var3;
      int var13 = this.a(var5 / 8, var6 / 8, var7, var10);
      if (var13 == -1) {
         return 0;
      } else {
         double var14 = 0.0;
         double var16 = 0.0;
         double var18 = 0.0;
         double var20 = 0.0;
         int var22 = (int)(var1 - 5.0);
         int var23 = (int)Math.ceil(var1 + 5.0);
         int var24 = (int)(var3 - 5.0);
         int var25 = (int)Math.ceil(var3 + 5.0);

         for (int var26 = var22; var26 < var23; var26++) {
            for (int var27 = var24; var27 <= var25; var27++) {
               int var28 = this.a(var26, var27, var7, var10);
               if (var28 != -1) {
                  double var29 = ((double)(var28 >>> 24) + 0.125) / 8.0;
                  double var31 = 1.0 + var29 * 3.075;
                  double var33 = (double)var26 - var1;
                  double var35 = var33 + 1.0;
                  if (!(var33 < -var31) && !(var33 > var31)) {
                     double var37 = (double)var27 - var3;
                     double var39 = var37 + 1.0;
                     if (!(var37 < -var31) && !(var39 > var31)) {
                        double var41 = var29 * a;
                        double var43 = (this.a(var33 / var41) - this.a(var35 / var41)) * (this.a(var37 / var41) - this.a(var39 / var41));
                        double var45 = (double)(var28 >>> 16 & 0xFF) / 255.0;
                        double var47 = (double)((byte)(var28 >>> 8)) / 128.0;
                        double var49 = (double)((byte)var28) / 128.0;
                        var16 += var45 * var43;
                        var18 += var47 * var43;
                        var20 += var49 * var43;
                        var14 += var43;
                     }
                  }
               }
            }
         }

         byte var53 = (byte)((int)Math.min(Math.max(Math.round(var16 / var14 * 255.0), 0L), 255L));
         byte var54 = (byte)((int)Math.min(Math.max(Math.round(var18 * 128.0 / var14), -128L), 127L));
         byte var55 = (byte)((int)Math.min(Math.max(Math.round(var20 * 128.0 / var14), -128L), 127L));
         int var56 = var53 - (var55 >> 1) & 0xFF;
         int var30 = var56 + var55 & 0xFF;
         int var57 = var30 - (var54 >> 1) & 0xFF;
         int var32 = var57 + var54 & 0xFF;
         float[] var58 = Color.RGBtoHSB(var57, var56, var32, null);
         var58[2] = (float)Math.pow((double)var58[2], var8);
         return 16777215 & Color.HSBtoRGB(var58[0], var58[1], var58[2]);
      }
   }

   private double a(double var1) {
      double var3 = Math.abs(var1);
      double var5 = 1.0 / (1.0 + var3 * 0.3275911);
      double var7 = 1.0
         - ((((1.061405429 * var5 - 1.453152027) * var5 + 1.421413741) * var5 - 0.284496736) * var5 + 0.254829592) * var5 * Math.exp(-var3 * var3);
      return Math.copySign(var7, var1);
   }

   BufferedImage a(double var1, int var3, int var4, C_o.a var5) {
      int var6 = (int)((double)((this.k - this.i) * 8) * var1);
      int var7 = (int)((double)((this.l - this.j) * 8) * var1);
      BufferedImage var8 = new BufferedImage(var6, var7, 2);
      int var9 = var3 <= 0 ? Integer.MAX_VALUE : (int)((double)var3 * var1);

      for (int var10 = 0; var10 < var7; var10++) {
         for (int var11 = 0; var11 < var6; var11++) {
            int var12;
            if (var11 % var9 != 0 && var10 % var9 != 0) {
               double var13 = (double)(this.i * 8) + (double)var11 / var1;
               double var15 = (double)(this.j * 8) + (double)var10 / var1;
               var12 = this.a(var13, var15, (int)var13, (int)var15, var4, 0.8, var5);
            } else {
               var12 = 16777215;
            }

            var8.setRGB(var11, var7 - 1 - var10, var12 | 0xFF000000);
         }
      }

      return var8;
   }

   @FunctionalInterface
   public interface a {
      int a(int var1, int var2, int var3);
   }
}
