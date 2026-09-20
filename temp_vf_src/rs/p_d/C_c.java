package rs.p_d;

public final class C_c {
   private static String[] a = new String[]{
      "ass",
      "bastard",
      "beaner",
      "bitch",
      "blow job",
      "blowjob",
      "boner",
      "butt pirate",
      "carpetmuncher",
      "chink",
      "chode",
      "clit",
      "cancer",
      "aids",
      "my cock",
      "his cock",
      "coon",
      "cum",
      "cunt",
      "dick",
      "dike",
      "dildo",
      "dipshit",
      "douche",
      "dumbass",
      "dumbfuck",
      "dumbshit",
      "dyke",
      "fag",
      "fagg",
      "faggot",
      "fatass",
      "fuck",
      "gay",
      "handjob",
      "hard on",
      "hoe",
      "homo",
      "honkey",
      "humping",
      "jackass",
      "jap",
      "jerk off",
      "jizz",
      "kunt",
      "kyke",
      "lesbian",
      "lesbo",
      "nigga",
      "nigger",
      "niglet",
      "porch monkey",
      "porchmonkey",
      "porn",
      "prick",
      "punta",
      "pussy",
      "pussy",
      "puto",
      "queer",
      "rimjob",
      "skank",
      "skeet",
      "slut",
      "spic",
      "shit",
      "splooge",
      "spook",
      "tard",
      "suck my",
      "wank",
      "wetback",
      "whore",
      "xxx"
   };
   private static int[] b;
   private static char[][] c;
   private static byte[][][] d;
   private static char[][] e;
   private static char[][] f;
   private static int[] g;
   private static final String[] h = new String[]{"cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs"};

   public static String a(String var0) {
      String var1 = var0;

      for (String var5 : a) {
         if (var0.toLowerCase().contains(var5.toLowerCase())) {
            var1 = var1.toLowerCase().replace(var5.toLowerCase(), a(var5.length()));
         }
      }

      return var1;
   }

   public static String a(int var0) {
      String var1 = "";

      for (int var2 = 0; var2 < var0; var2++) {
         var1 = var1 + "*";
      }

      return var1;
   }

   public static void a(rs.p_x.C_f var0) {
      rs.p_x.C_e var1 = new rs.p_x.C_e(var0.a("fragmentsenc.txt"));
      rs.p_x.C_e var2 = new rs.p_x.C_e(var0.a("badenc.txt"));
      rs.p_x.C_e var3 = new rs.p_x.C_e(var0.a("domainenc.txt"));
      rs.p_x.C_e var4 = new rs.p_x.C_e(var0.a("tldlist.txt"));
      a(var1, var2, var3, var4);
   }

   private static void a(rs.p_x.C_e var0, rs.p_x.C_e var1, rs.p_x.C_e var2, rs.p_x.C_e var3) {
      b(var1);
      c(var2);
      d(var0);
      a(var3);
   }

   private static void a(rs.p_x.C_e var0) {
      int var1 = var0.D();
      f = new char[var1][];
      g = new int[var1];

      for (int var2 = 0; var2 < var1; var2++) {
         g[var2] = var0.y();
         char[] var3 = new char[var0.y()];

         for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4] = (char)var0.y();
         }

         f[var2] = var3;
      }
   }

   private static void b(rs.p_x.C_e var0) {
      int var1 = var0.D();
      c = new char[var1][];
      d = new byte[var1][][];
      a(var0, c, d);
   }

   private static void c(rs.p_x.C_e var0) {
      int var1 = var0.D();
      e = new char[var1][];
      a(e, var0);
   }

   private static void d(rs.p_x.C_e var0) {
      b = new int[var0.D()];

      for (int var1 = 0; var1 < b.length; var1++) {
         b[var1] = var0.A();
      }
   }

   private static void a(rs.p_x.C_e var0, char[][] var1, byte[][][] var2) {
      for (int var3 = 0; var3 < var1.length; var3++) {
         char[] var4 = new char[var0.y()];

         for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5] = (char)var0.y();
         }

         var1[var3] = var4;
         byte[][] var7 = new byte[var0.y()][2];

         for (int var6 = 0; var6 < var7.length; var6++) {
            var7[var6][0] = (byte)var0.y();
            var7[var6][1] = (byte)var0.y();
         }

         if (var7.length > 0) {
            var2[var3] = var7;
         }
      }
   }

   private static void a(char[][] var0, rs.p_x.C_e var1) {
      for (int var2 = 0; var2 < var0.length; var2++) {
         char[] var3 = new char[var1.y()];

         for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4] = (char)var1.y();
         }

         var0[var2] = var3;
      }
   }

   private static void a(char[] var0) {
      int var1 = 0;

      for (int var2 = 0; var2 < var0.length; var2++) {
         if (a(var0[var2])) {
            var0[var1] = var0[var2];
         } else {
            var0[var1] = ' ';
         }

         if (var1 == 0 || var0[var1] != ' ' || var0[var1 - 1] != ' ') {
            var1++;
         }
      }

      for (int var3 = var1; var3 < var0.length; var3++) {
         var0[var3] = ' ';
      }
   }

   private static boolean a(char var0) {
      return var0 >= ' ' && var0 <= 127 || var0 == ' ' || var0 == '\n' || var0 == '\t' || var0 == 163 || var0 == 8364;
   }

   public static String b(String var0) {
      return var0;
   }

   private static void a(char[] var0, char[] var1) {
      for (int var2 = 0; var2 < var0.length; var2++) {
         if (var1[var2] != '*' && h(var0[var2])) {
            var1[var2] = var0[var2];
         }
      }
   }

   private static void b(char[] var0) {
      boolean var1 = true;

      for (int var2 = 0; var2 < var0.length; var2++) {
         char var3 = var0[var2];
         if (e(var3)) {
            if (var1) {
               if (g(var3)) {
                  var1 = false;
               }
            } else if (h(var3)) {
               var0[var2] = (char)(var3 + 'a' - 65);
            }
         } else {
            var1 = true;
         }
      }
   }

   private static void c(char[] var0) {
      for (int var1 = 0; var1 < 2; var1++) {
         for (int var2 = c.length - 1; var2 >= 0; var2--) {
            a(d[var2], var0, c[var2]);
         }
      }
   }

   private static void d(char[] var0) {
      char[] var1 = (char[])var0.clone();
      char[] var2 = new char[]{'(', 'a', ')'};
      a(null, var1, var2);
      char[] var3 = (char[])var0.clone();
      char[] var4 = new char[]{'d', 'o', 't'};
      a(null, var3, var4);

      for (int var5 = e.length - 1; var5 >= 0; var5--) {
         a(var0, e[var5], var3, var1);
      }
   }

   private static void a(char[] var0, char[] var1, char[] var2, char[] var3) {
      if (var1.length <= var0.length) {
         int var5 = 0;

         while (var5 <= var0.length - var1.length) {
            int var6 = var5;
            int var7 = 0;
            int var4 = 1;

            while (var6 < var0.length) {
               char var9 = var0[var6];
               char var10 = 0;
               if (var6 + 1 < var0.length) {
                  var10 = var0[var6 + 1];
               }

               int var8;
               if (var7 < var1.length && (var8 = a(var9, var1[var7], var10)) > 0) {
                  var6 += var8;
                  var7++;
               } else {
                  if (var7 == 0) {
                     break;
                  }

                  if ((var8 = a(var9, var1[var7 - 1], var10)) > 0) {
                     var6 += var8;
                     if (var7 == 1) {
                        var4++;
                     }
                  } else {
                     if (var7 >= var1.length || !c(var9)) {
                        break;
                     }

                     var6++;
                  }
               }
            }

            if (var7 >= var1.length) {
               boolean var13 = false;
               int var14 = a(var0, var3, var5);
               int var15 = a(var2, var6 - 1, var0);
               if (var14 > 2 || var15 > 2) {
                  var13 = true;
               }

               if (var13) {
                  for (int var11 = var5; var11 < var6; var11++) {
                     var0[var11] = '*';
                  }
               }
            }

            var5 += var4;
         }
      }
   }

   private static int a(char[] var0, char[] var1, int var2) {
      if (var2 == 0) {
         return 2;
      } else {
         for (int var3 = var2 - 1; var3 >= 0 && c(var0[var3]); var3--) {
            if (var0[var3] == '@') {
               return 3;
            }
         }

         int var5 = 0;

         for (int var4 = var2 - 1; var4 >= 0 && c(var1[var4]); var4--) {
            if (var1[var4] == '*') {
               var5++;
            }
         }

         if (var5 >= 3) {
            return 4;
         } else {
            return !c(var0[var2 - 1]) ? 0 : 1;
         }
      }
   }

   private static int a(char[] var0, int var1, char[] var2) {
      if (var1 + 1 == var2.length) {
         return 2;
      } else {
         for (int var3 = var1 + 1; var3 < var2.length && c(var2[var3]); var3++) {
            if (var2[var3] == '.' || var2[var3] == ',') {
               return 3;
            }
         }

         int var5 = 0;

         for (int var4 = var1 + 1; var4 < var2.length && c(var0[var4]); var4++) {
            if (var0[var4] == '*') {
               var5++;
            }
         }

         if (var5 >= 3) {
            return 4;
         } else {
            return !c(var2[var1 + 1]) ? 0 : 1;
         }
      }
   }

   private static void e(char[] var0) {
      char[] var1 = (char[])var0.clone();
      char[] var2 = new char[]{'d', 'o', 't'};
      a(null, var1, var2);
      char[] var3 = (char[])var0.clone();
      char[] var4 = new char[]{'s', 'l', 'a', 's', 'h'};
      a(null, var3, var4);

      for (int var5 = 0; var5 < f.length; var5++) {
         a(var3, f[var5], g[var5], var1, var0);
      }
   }

   private static void a(char[] var0, char[] var1, int var2, char[] var3, char[] var4) {
      if (var1.length <= var4.length) {
         int var6 = 0;

         while (var6 <= var4.length - var1.length) {
            int var7 = var6;
            int var8 = 0;
            int var5 = 1;

            while (var7 < var4.length) {
               char var10 = var4[var7];
               char var11 = 0;
               if (var7 + 1 < var4.length) {
                  var11 = var4[var7 + 1];
               }

               int var9;
               if (var8 < var1.length && (var9 = a(var10, var1[var8], var11)) > 0) {
                  var7 += var9;
                  var8++;
               } else {
                  if (var8 == 0) {
                     break;
                  }

                  if ((var9 = a(var10, var1[var8 - 1], var11)) > 0) {
                     var7 += var9;
                     if (var8 == 1) {
                        var5++;
                     }
                  } else {
                     if (var8 >= var1.length || !c(var10)) {
                        break;
                     }

                     var7++;
                  }
               }
            }

            if (var8 >= var1.length) {
               boolean var17 = false;
               int var18 = b(var4, var6, var3);
               int var19 = b(var4, var0, var7 - 1);
               if (var2 == 1 && var18 > 0 && var19 > 0) {
                  var17 = true;
               }

               if (var2 == 2 && (var18 > 2 && var19 > 0 || var18 > 0 && var19 > 2)) {
                  var17 = true;
               }

               if (var2 == 3 && var18 > 0 && var19 > 2) {
                  var17 = true;
               }

               if (var17) {
                  int var12 = var6;
                  int var13 = var7 - 1;
                  if (var18 > 2) {
                     if (var18 == 4) {
                        boolean var14 = false;

                        for (int var15 = var6 - 1; var15 >= 0; var15--) {
                           if (var14) {
                              if (var3[var15] != '*') {
                                 break;
                              }

                              var12 = var15;
                           } else if (var3[var15] == '*') {
                              var12 = var15;
                              var14 = true;
                           }
                        }
                     }

                     boolean var20 = false;

                     for (int var24 = var12 - 1; var24 >= 0; var24--) {
                        if (var20) {
                           if (c(var4[var24])) {
                              break;
                           }

                           var12 = var24;
                        } else if (!c(var4[var24])) {
                           var20 = true;
                           var12 = var24;
                        }
                     }
                  }

                  if (var19 > 2) {
                     if (var19 == 4) {
                        boolean var21 = false;

                        for (int var25 = var13 + 1; var25 < var4.length; var25++) {
                           if (var21) {
                              if (var0[var25] != '*') {
                                 break;
                              }

                              var13 = var25;
                           } else if (var0[var25] == '*') {
                              var13 = var25;
                              var21 = true;
                           }
                        }
                     }

                     boolean var22 = false;

                     for (int var26 = var13 + 1; var26 < var4.length; var26++) {
                        if (var22) {
                           if (c(var4[var26])) {
                              break;
                           }

                           var13 = var26;
                        } else if (!c(var4[var26])) {
                           var22 = true;
                           var13 = var26;
                        }
                     }
                  }

                  for (int var23 = var12; var23 <= var13; var23++) {
                     var4[var23] = '*';
                  }
               }
            }

            var6 += var5;
         }
      }
   }

   private static int b(char[] var0, int var1, char[] var2) {
      if (var1 == 0) {
         return 2;
      } else {
         for (int var3 = var1 - 1; var3 >= 0 && c(var0[var3]); var3--) {
            if (var0[var3] == ',' || var0[var3] == '.') {
               return 3;
            }
         }

         int var5 = 0;

         for (int var4 = var1 - 1; var4 >= 0 && c(var2[var4]); var4--) {
            if (var2[var4] == '*') {
               var5++;
            }
         }

         if (var5 >= 3) {
            return 4;
         } else {
            return !c(var0[var1 - 1]) ? 0 : 1;
         }
      }
   }

   private static int b(char[] var0, char[] var1, int var2) {
      if (var2 + 1 == var0.length) {
         return 2;
      } else {
         for (int var3 = var2 + 1; var3 < var0.length && c(var0[var3]); var3++) {
            if (var0[var3] == '\\' || var0[var3] == '/') {
               return 3;
            }
         }

         int var5 = 0;

         for (int var4 = var2 + 1; var4 < var0.length && c(var1[var4]); var4++) {
            if (var1[var4] == '*') {
               var5++;
            }
         }

         if (var5 >= 5) {
            return 4;
         } else {
            return !c(var0[var2 + 1]) ? 0 : 1;
         }
      }
   }

   private static void a(byte[][] var0, char[] var1, char[] var2) {
      if (var2.length <= var1.length) {
         int var4 = 0;

         while (var4 <= var1.length - var2.length) {
            int var5 = var4;
            int var6 = 0;
            int var7 = 0;
            int var3 = 1;
            boolean var8 = false;
            boolean var9 = false;
            boolean var10 = false;

            while (var5 < var1.length && (!var9 || !var10)) {
               char var12 = var1[var5];
               char var13 = 0;
               if (var5 + 1 < var1.length) {
                  var13 = var1[var5 + 1];
               }

               int var11;
               if (var6 < var2.length && (var11 = b(var13, var12, var2[var6])) > 0) {
                  if (var11 == 1 && f(var12)) {
                     var9 = true;
                  }

                  if (var11 == 2 && (f(var12) || f(var13))) {
                     var9 = true;
                  }

                  var5 += var11;
                  var6++;
               } else {
                  if (var6 == 0) {
                     break;
                  }

                  if ((var11 = b(var13, var12, var2[var6 - 1])) > 0) {
                     var5 += var11;
                     if (var6 == 1) {
                        var3++;
                     }
                  } else {
                     if (var6 >= var2.length || !d(var12)) {
                        break;
                     }

                     if (c(var12) && var12 != '\'') {
                        var8 = true;
                     }

                     if (f(var12)) {
                        var10 = true;
                     }

                     var5++;
                     if (++var7 * 100 / (var5 - var4) > 90) {
                        break;
                     }
                  }
               }
            }

            if (var6 >= var2.length && (!var9 || !var10)) {
               boolean var20 = true;
               if (!var8) {
                  char var21 = ' ';
                  if (var4 - 1 >= 0) {
                     var21 = var1[var4 - 1];
                  }

                  char var24 = ' ';
                  if (var5 < var1.length) {
                     var24 = var1[var5];
                  }

                  byte var14 = b(var21);
                  byte var15 = b(var24);
                  if (var0 != null && a(var14, var0, var15)) {
                     var20 = false;
                  }
               } else {
                  boolean var22 = false;
                  boolean var25 = false;
                  if (var4 - 1 < 0 || c(var1[var4 - 1]) && var1[var4 - 1] != '\'') {
                     var22 = true;
                  }

                  if (var5 >= var1.length || c(var1[var5]) && var1[var5] != '\'') {
                     var25 = true;
                  }

                  if (!var22 || !var25) {
                     boolean var27 = false;
                     int var29 = var4 - 2;
                     if (var22) {
                        var29 = var4;
                     }

                     for (; !var27 && var29 < var5; var29++) {
                        if (var29 >= 0 && (!c(var1[var29]) || var1[var29] == '\'')) {
                           char[] var16 = new char[3];

                           int var17;
                           for (var17 = 0; var17 < 3 && var29 + var17 < var1.length && (!c(var1[var29 + var17]) || var1[var29 + var17] == '\''); var17++) {
                              var16[var17] = var1[var29 + var17];
                           }

                           boolean var18 = true;
                           if (var17 == 0) {
                              var18 = false;
                           }

                           if (var17 < 3 && var29 - 1 >= 0 && (!c(var1[var29 - 1]) || var1[var29 - 1] == '\'')) {
                              var18 = false;
                           }

                           if (var18 && !g(var16)) {
                              var27 = true;
                           }
                        }
                     }

                     if (!var27) {
                        var20 = false;
                     }
                  }
               }

               if (var20) {
                  int var23 = 0;
                  int var26 = 0;
                  int var28 = -1;

                  for (int var30 = var4; var30 < var5; var30++) {
                     if (f(var1[var30])) {
                        var23++;
                     } else if (e(var1[var30])) {
                        var26++;
                        var28 = var30;
                     }
                  }

                  if (var28 > -1) {
                     var23 -= var5 - 1 - var28;
                  }

                  if (var23 <= var26) {
                     for (int var31 = var4; var31 < var5; var31++) {
                        var1[var31] = '*';
                     }
                  } else {
                     var3 = 1;
                  }
               }
            }

            var4 += var3;
         }
      }
   }

   private static boolean a(byte var0, byte[][] var1, byte var2) {
      int var3 = 0;
      if (var1[var3][0] == var0 && var1[var3][1] == var2) {
         return true;
      } else {
         int var4 = var1.length - 1;
         if (var1[var4][0] == var0 && var1[var4][1] == var2) {
            return true;
         } else {
            do {
               int var5 = (var3 + var4) / 2;
               if (var1[var5][0] == var0 && var1[var5][1] == var2) {
                  return true;
               }

               if (var0 >= var1[var5][0] && (var0 != var1[var5][0] || var2 >= var1[var5][1])) {
                  var3 = var5;
               } else {
                  var4 = var5;
               }
            } while (var3 != var4 && var3 + 1 != var4);

            return false;
         }
      }
   }

   private static int a(char var0, char var1, char var2) {
      if (var1 == var0) {
         return 1;
      } else if (var1 == 'o' && var0 == '0') {
         return 1;
      } else if (var1 == 'o' && var0 == '(' && var2 == ')') {
         return 2;
      } else if (var1 != 'c' || var0 != '(' && var0 != '<' && var0 != '[') {
         if (var1 == 'e' && var0 == 8364) {
            return 1;
         } else if (var1 == 's' && var0 == '$') {
            return 1;
         } else {
            return var1 == 108 && var0 == 105 ? 1 : 0;
         }
      } else {
         return 1;
      }
   }

   private static int b(char var0, char var1, char var2) {
      if (var2 == var1) {
         return 1;
      } else {
         if (var2 >= 'a' && var2 <= 'm') {
            if (var2 == 'a') {
               if (var1 != '4' && var1 != '@' && var1 != '^') {
                  return var1 == 47 && var0 == 92 ? 2 : 0;
               }

               return 1;
            }

            if (var2 == 'b') {
               if (var1 != '6' && var1 != '8') {
                  return var1 == 49 && var0 == 51 || var1 == 105 && var0 == 51 ? 2 : 0;
               }

               return 1;
            }

            if (var2 == 'c') {
               return var1 != 40 && var1 != 60 && var1 != 123 && var1 != 91 ? 0 : 1;
            }

            if (var2 == 'd') {
               return var1 == 91 && var0 == 41 || var1 == 105 && var0 == 41 ? 2 : 0;
            }

            if (var2 == 'e') {
               return var1 != 51 && var1 != 8364 ? 0 : 1;
            }

            if (var2 == 'f') {
               if (var1 == 'p' && var0 == 'h') {
                  return 2;
               }

               return var1 != 163 ? 0 : 1;
            }

            if (var2 == 'g') {
               return var1 != 57 && var1 != 54 && var1 != 113 ? 0 : 1;
            }

            if (var2 == 'h') {
               return var1 != 35 ? 0 : 1;
            }

            if (var2 == 'i') {
               return var1 != 121 && var1 != 108 && var1 != 106 && var1 != 49 && var1 != 33 && var1 != 58 && var1 != 59 && var1 != 124 ? 0 : 1;
            }

            if (var2 == 'j') {
               return 0;
            }

            if (var2 == 'k') {
               return 0;
            }

            if (var2 == 'l') {
               return var1 != 49 && var1 != 124 && var1 != 105 ? 0 : 1;
            }

            if (var2 == 'm') {
               return 0;
            }
         }

         if (var2 >= 'n' && var2 <= 'z') {
            if (var2 == 'n') {
               return 0;
            }

            if (var2 == 'o') {
               if (var1 != '0' && var1 != '*') {
                  return var1 == 40 && var0 == 41 || var1 == 91 && var0 == 93 || var1 == 123 && var0 == 125 || var1 == 60 && var0 == 62 ? 2 : 0;
               }

               return 1;
            }

            if (var2 == 'p') {
               return 0;
            }

            if (var2 == 'q') {
               return 0;
            }

            if (var2 == 'r') {
               return 0;
            }

            if (var2 == 's') {
               return var1 != 53 && var1 != 122 && var1 != 36 && var1 != 50 ? 0 : 1;
            }

            if (var2 == 't') {
               return var1 != 55 && var1 != 43 ? 0 : 1;
            }

            if (var2 == 'u') {
               if (var1 == 'v') {
                  return 1;
               }

               return var1 == 92 && var0 == 47 || var1 == 92 && var0 == 124 || var1 == 124 && var0 == 47 ? 2 : 0;
            }

            if (var2 == 'v') {
               return var1 == 92 && var0 == 47 || var1 == 92 && var0 == 124 || var1 == 124 && var0 == 47 ? 2 : 0;
            }

            if (var2 == 'w') {
               return var1 == 118 && var0 == 118 ? 2 : 0;
            }

            if (var2 == 'x') {
               return var1 == 41 && var0 == 40 || var1 == 125 && var0 == 123 || var1 == 93 && var0 == 91 || var1 == 62 && var0 == 60 ? 2 : 0;
            }

            if (var2 == 'y') {
               return 0;
            }

            if (var2 == 'z') {
               return 0;
            }
         }

         if (var2 >= '0' && var2 <= '9') {
            if (var2 != '0') {
               if (var2 == '1') {
                  return var1 != 108 ? 0 : 1;
               } else {
                  return 0;
               }
            } else if (var1 != 'o' && var1 != 'O') {
               return var1 == 40 && var0 == 41 || var1 == 123 && var0 == 125 || var1 == 91 && var0 == 93 ? 2 : 0;
            } else {
               return 1;
            }
         } else if (var2 == ',') {
            return var1 != 46 ? 0 : 1;
         } else if (var2 == '.') {
            return var1 != 44 ? 0 : 1;
         } else if (var2 == '!') {
            return var1 != 105 ? 0 : 1;
         } else {
            return 0;
         }
      }
   }

   private static byte b(char var0) {
      if (var0 >= 'a' && var0 <= 'z') {
         return (byte)(var0 - 'a' + 1);
      } else if (var0 == '\'') {
         return 28;
      } else {
         return var0 >= '0' && var0 <= '9' ? (byte)(var0 - '0' + 29) : 27;
      }
   }

   private static void f(char[] var0) {
      int var2 = 0;
      int var3 = 0;
      int var4 = 0;

      int var1;
      while ((var1 = a(var0, var2)) != -1) {
         boolean var5 = false;

         for (int var6 = var2; var6 >= 0 && var6 < var1 && !var5; var6++) {
            if (!c(var0[var6]) && !d(var0[var6])) {
               var5 = true;
            }
         }

         if (var5) {
            var3 = 0;
         }

         if (var3 == 0) {
            var4 = var1;
         }

         var2 = b(var0, var1);
         int var8 = 0;

         for (int var7 = var1; var7 < var2; var7++) {
            var8 = var8 * 10 + var0[var7] - 48;
         }

         if (var8 <= 255 && var2 - var1 <= 8) {
            var3++;
         } else {
            var3 = 0;
         }

         if (var3 == 4) {
            for (int var9 = var4; var9 < var2; var9++) {
               var0[var9] = '*';
            }

            var3 = 0;
         }
      }
   }

   private static int a(char[] var0, int var1) {
      for (int var2 = var1; var2 < var0.length && var2 >= 0; var2++) {
         if (var0[var2] >= '0' && var0[var2] <= '9') {
            return var2;
         }
      }

      return -1;
   }

   private static int b(char[] var0, int var1) {
      for (int var2 = var1; var2 < var0.length && var2 >= 0; var2++) {
         if (var0[var2] < '0' || var0[var2] > '9') {
            return var2;
         }
      }

      return var0.length;
   }

   private static boolean c(char var0) {
      return !e(var0) && !f(var0);
   }

   private static boolean d(char var0) {
      return var0 < 'a' || var0 > 'z' || var0 == 'v' || var0 == 'x' || var0 == 'j' || var0 == 'q' || var0 == 'z';
   }

   private static boolean e(char var0) {
      return var0 >= 'a' && var0 <= 'z' || var0 >= 'A' && var0 <= 'Z';
   }

   private static boolean f(char var0) {
      return var0 >= '0' && var0 <= '9';
   }

   private static boolean g(char var0) {
      return var0 >= 'a' && var0 <= 'z';
   }

   private static boolean h(char var0) {
      return var0 >= 'A' && var0 <= 'Z';
   }

   private static boolean g(char[] var0) {
      boolean var1 = true;

      for (int var2 = 0; var2 < var0.length; var2++) {
         if (!f(var0[var2]) && var0[var2] != 0) {
            var1 = false;
         }
      }

      if (var1) {
         return true;
      } else {
         int var6 = h(var0);
         int var3 = 0;
         int var4 = b.length - 1;
         if (var6 != b[var3] && var6 != b[var4]) {
            do {
               int var5 = (var3 + var4) / 2;
               if (var6 == b[var5]) {
                  return true;
               }

               if (var6 < b[var5]) {
                  var4 = var5;
               } else {
                  var3 = var5;
               }
            } while (var3 != var4 && var3 + 1 != var4);

            return false;
         } else {
            return true;
         }
      }
   }

   private static int h(char[] var0) {
      if (var0.length > 6) {
         return 0;
      } else {
         int var1 = 0;

         for (int var2 = 0; var2 < var0.length; var2++) {
            char var3 = var0[var0.length - var2 - 1];
            if (var3 >= 'a' && var3 <= 'z') {
               var1 = var1 * 38 + var3 - 'a' + 1;
            } else if (var3 == '\'') {
               var1 = var1 * 38 + 27;
            } else if (var3 >= '0' && var3 <= '9') {
               var1 = var1 * 38 + var3 - '0' + 28;
            } else if (var3 != 0) {
               return 0;
            }
         }

         return var1;
      }
   }
}
