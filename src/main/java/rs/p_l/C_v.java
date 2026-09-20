package rs.p_l;

public final class C_v {
   public static final int a = 15;
   public static final int b = 0;
   private static final int c = 1536;
   private static final int d = 512;
   private static final int e = 20;
   private static final int f = 300;
   private static final int g = 9;
   private static final int h = 40;
   private static final int i = 1579032;
   private static final int j = 6316128;
   private static final int k = 49151;
   private static final int l = 256;
   private static final String[] m = new String[256];
   private static final int[] n = new int[256];
   private static final int[] o = new int[256];
   private static final C_v.a[] p = new C_v.a[256];
   private static final int[] q = new int[]{0, 0, 15022389, 2201331, 4431943, 16757504, 0, 11225020};
   private static final int[][] r = new int[][]{
      null, null, {16724016, 7340032}, {1402367, 6737151}, {43067, 8257405}, {14260736, 16772469}, null, {8072447, 13868287}
   };

   private C_v() {
   }

   public static C_v.a a(String var0, int var1, int var2) {
      if (var0 != null && var1 >= 0 && var2 > var1) {
         int var3 = System.identityHashCode(var0) * 31 + var1 * 17 + var2 & 0xFF;
         if (m[var3] == var0 && n[var3] == var1 && o[var3] == var2) {
            return p[var3];
         } else {
            int var4 = var1 + 1;
            if (!a(var0, var4, "pbar")) {
               return null;
            } else {
               var4 += 4;
               int var5 = 1;
               if (var4 < var2 && var0.charAt(var4) >= '2' && var0.charAt(var4) <= '7') {
                  var5 = var0.charAt(var4++) - '0';
               }

               if (var4 < var2 && var0.charAt(var4++) == '=') {
                  int var6 = a(var0, ':', var4, var2);
                  if (var6 == -1) {
                     return null;
                  } else {
                     int var7 = a(var0, ':', var6 + 1, var2);
                     int var8 = c(var0, var4, var6);
                     if (var8 < 0) {
                        return null;
                     } else {
                        var8 = Math.max(20, Math.min(300, var8));
                        int var9 = var7 == -1 ? var2 : var7;
                        int var10 = a(var0, var6 + 1, var9, var8 - 4);
                        if (var10 < 0) {
                           return null;
                        } else {
                           int var12 = 1579032;
                           int var13 = 6316128;
                           int var14 = 15;
                           int var11;
                           if (var5 == 1) {
                              var11 = 49151;
                              if (var7 != -1) {
                                 int var15 = a(var0, ':', var7 + 1, var2);
                                 int var16 = var15 == -1 ? var2 : var15;
                                 var11 = d(var0, var7 + 1, var16);
                                 if (var11 < 0) {
                                    return null;
                                 }

                                 if (var15 != -1) {
                                    int var17 = a(var0, ':', var15 + 1, var2);
                                    int var18 = var17 == -1 ? var2 : var17;
                                    var12 = d(var0, var15 + 1, var18);
                                    if (var12 < 0) {
                                       return null;
                                    }

                                    if (var17 != -1) {
                                       int var19 = a(var0, ':', var17 + 1, var2);
                                       int var20 = var19 == -1 ? var2 : var19;
                                       var13 = d(var0, var17 + 1, var20);
                                       if (var13 < 0) {
                                          return null;
                                       }

                                       if (var19 != -1) {
                                          var14 = b(var0, var19 + 1, var2);
                                          if (var14 < 0) {
                                             return null;
                                          }
                                       }
                                    }
                                 }
                              }
                           } else {
                              if (var7 != -1) {
                                 var14 = b(var0, var7 + 1, var2);
                                 if (var14 < 0) {
                                    return null;
                                 }
                              }

                              var11 = q[var5];
                           }

                           String var24 = "</pbar" + (var5 == 1 ? "" : Integer.toString(var5)) + ">";
                           int var25 = var0.indexOf(var24, var2 + 1);
                           if (var25 == -1) {
                              return a(var0, var1, var2, var3, new C_v.a(var8, var14, var10, var11, var12, var13, "", var2, var5));
                           } else {
                              String var26 = var0.substring(var2 + 1, var25);
                              return a(
                                 var0, var1, var2, var3, new C_v.a(var8, var14, var10, var11, var12, var13, var26, var25 + var24.length() - 1, var5)
                              );
                           }
                        }
                     }
                  }
               } else {
                  return null;
               }
            }
         }
      } else {
         return null;
      }
   }

   private static C_v.a a(String var0, int var1, int var2, int var3, C_v.a var4) {
      m[var3] = var0;
      n[var3] = var1;
      o[var3] = var2;
      p[var3] = var4;
      return var4;
   }

   public static void a(C_v.a var0, int var1, int var2) {
      C_c.a(var0.b, var2, var1, var0.f, var0.a);
      C_c.a(var0.b - 2, var2 + 1, var1 + 1, var0.e, var0.a - 2);
      if (var0.i >= 2 && var0.c > 0) {
         long var3 = System.nanoTime() / 1000000L / 8L;
         int var5 = var0.i == 6 ? 1536 : 512;
         int var6 = (int)(var3 % (long)var5);

         for (int var7 = 0; var7 < var0.c; var7++) {
            int var8 = (var6 + var7 * var5 / Math.max(1, var0.c)) % var5;
            int var9 = var0.i == 6 ? a(var8) : a(var0.i, var8);
            C_c.a(var0.b - 4, var2 + 2, var1 + 2 + var7, var9, 1);
         }

         C_s.c();
      } else if (var0.c > 0) {
         C_c.a(var0.b - 4, var2 + 2, var1 + 2, var0.d, var0.c);
      }
   }

   private static int b(String var0, int var1, int var2) {
      int var3 = c(var0, var1, var2);
      return var3 < 0 ? -1 : Math.max(9, Math.min(40, var3));
   }

   private static int a(String var0, int var1, int var2, int var3) {
      int var4 = a(var0, '/', var1, var2);
      long var5;
      long var7;
      if (var4 == -1) {
         var5 = (long)c(var0, var1, var2);
         var7 = 100L;
      } else {
         var5 = (long)c(var0, var1, var4);
         var7 = (long)c(var0, var4 + 1, var2);
      }

      if (var5 >= 0L && var7 > 0L) {
         double var9 = Math.max(0.0, Math.min(1.0, (double)var5 / (double)var7));
         return (int)Math.round((double)var3 * var9);
      } else {
         return -1;
      }
   }

   private static int c(String var0, int var1, int var2) {
      if (var1 >= var2) {
         return -1;
      } else {
         int var3 = 0;

         for (int var4 = var1; var4 < var2; var4++) {
            char var5 = var0.charAt(var4);
            if (var5 < '0' || var5 > '9') {
               return -1;
            }

            var3 = var3 * 10 + var5 - 48;
            if (var3 > 1000000) {
               return -1;
            }
         }

         return var3;
      }
   }

   private static int d(String var0, int var1, int var2) {
      if (var1 < var2 && var2 - var1 <= 6) {
         int var3 = var2 - var1 >= 6 ? 16 : 10;
         if (var3 == 10) {
            for (int var4 = var1; var4 < var2; var4++) {
               char var5 = var0.charAt(var4);
               if (var5 >= 'a' && var5 <= 'f' || var5 >= 'A' && var5 <= 'F') {
                  var3 = 16;
                  break;
               }
            }
         }

         int var7 = 0;

         for (int var8 = var1; var8 < var2; var8++) {
            int var6 = Character.digit(var0.charAt(var8), var3);
            if (var6 == -1) {
               return -1;
            }

            var7 = var7 * var3 + var6;
         }

         return var7 & 16777215;
      } else {
         return -1;
      }
   }

   private static int a(int var0) {
      int var1 = var0 >>> 8;
      int var2 = var0 & 0xFF;
      switch (var1) {
         case 0:
            return 0xFF0000 | var2 << 8;
         case 1:
            return 255 - var2 << 16 | 0xFF00;
         case 2:
            return 0xFF00 | var2;
         case 3:
            return 255 - var2 << 8 | 0xFF;
         case 4:
            return var2 << 16 | 0xFF;
         default:
            return 0xFF0000 | 255 - var2;
      }
   }

   private static int a(int var0, int var1) {
      int[] var2 = r[var0];
      int var3 = var1 & 0xFF;
      return var1 < 256 ? a(var2[0], var2[1], var3) : a(var2[1], var2[0], var3);
   }

   private static int a(int var0, int var1, int var2) {
      int var3 = 255 - var2;
      int var4 = ((var0 >> 16 & 0xFF) * var3 + (var1 >> 16 & 0xFF) * var2) / 255;
      int var5 = ((var0 >> 8 & 0xFF) * var3 + (var1 >> 8 & 0xFF) * var2) / 255;
      int var6 = ((var0 & 0xFF) * var3 + (var1 & 0xFF) * var2) / 255;
      return var4 << 16 | var5 << 8 | var6;
   }

   private static int a(String var0, char var1, int var2, int var3) {
      for (int var4 = var2; var4 < var3; var4++) {
         if (var0.charAt(var4) == var1) {
            return var4;
         }
      }

      return -1;
   }

   private static boolean a(String var0, int var1, String var2) {
      if (var1 >= 0 && var1 + var2.length() <= var0.length()) {
         for (int var3 = 0; var3 < var2.length(); var3++) {
            if (var0.charAt(var1 + var3) != var2.charAt(var3)) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static final class a {
      public final int a;
      public final int b;
      public final int c;
      public final int d;
      public final int e;
      public final int f;
      public final String g;
      public final int h;
      public final int i;

      private a(int var1, int var2, int var3, int var4, int var5, int var6, String var7, int var8, int var9) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
         this.d = var4;
         this.e = var5;
         this.f = var6;
         this.g = var7;
         this.h = var8;
         this.i = var9;
      }
   }
}
