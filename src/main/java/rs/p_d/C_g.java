package rs.p_d;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import p_gnu.p_trove.p_f.p_b.C_cc;

public class C_g {
   private static final String b = rs.p_v.C_a.f() + "configs/old_i.dat";
   private static final Logger c = Logger.getLogger(C_g.class.getName());
   public static final List<String> a = new ArrayList<>();

   public static void a() {
      if (rs.p_f.C_a.d) {
         try {
            BufferedReader var0 = new BufferedReader(new FileReader(new File(b)));

            for (String var1 = var0.readLine(); var1 != null; var1 = var0.readLine()) {
               a.add(var1);
            }

            var0.close();
         } catch (Exception var2) {
            var2.printStackTrace();
         }
      }
   }

   public static C_cc<C_k> b() {
      C_cc var0 = new C_cc();
      int var1 = 0;

      try {
         BufferedReader var2 = new BufferedReader(new FileReader(new File(b)));
         String var3 = var2.readLine();
         C_k var4 = null;
         int var5 = 0;

         while (var3 != null) {
            var1++;
            if (var3.toLowerCase().contains("[item")) {
               var5 = Integer.valueOf(var3.toLowerCase().split("item ")[1].replace("]", ""));
               var0.a(var5, new C_k(C_k.a(var5, false, false)));
               var4 = (C_k)var0.b(var5);
            } else if (var3.contains("=")) {
               if (var4 == null) {
                  c.info("Error! Detected mismatch at line: " + var1);
                  throw new IndexOutOfBoundsException();
               }

               var3 = var3.replace(" = ", "=");
               var3 = var3.replace("= ", "=");
               String var6 = var3.toLowerCase().split("=")[0];
               String var7 = var3.split("=")[1];
               if (var6.toLowerCase().contains("name")) {
                  var4.w = var7;
               } else if (var6.toLowerCase().contains("modelid") || var6.toLowerCase().contains("groundmodel")) {
                  var4.A = Integer.valueOf(var7);
               } else if (var6.toLowerCase().contains("clone")) {
                  var4 = new C_k((C_k)var0.b(Integer.valueOf(var7)));
                  var4.i = var5;
               } else if (var6.toLowerCase().contains("description")) {
                  var4.E = var7.getBytes();
               } else if (var6.toLowerCase().contains("zoom")) {
                  var4.G = Integer.valueOf(var7);
               } else if (var6.toLowerCase().contains("rotation1") || var6.toLowerCase().contains("rotationx")) {
                  var4.M = Integer.valueOf(var7);
               } else if (var6.toLowerCase().contains("rotation2") || var6.toLowerCase().contains("rotationy")) {
                  var4.Z = Integer.valueOf(var7);
               } else if (var6.toLowerCase().contains("offset1") || var6.toLowerCase().contains("offsetx")) {
                  var4.v = Integer.valueOf(var7);
               } else if (var6.toLowerCase().contains("offset2") || var6.toLowerCase().contains("offsety")) {
                  var4.W = Integer.valueOf(var7);
               } else if (var6.toLowerCase().contains("value")) {
                  var4.f = Integer.valueOf(var7);
               } else if (var6.toLowerCase().contains("anint204") || var6.toLowerCase().contains("zan2d")) {
                  var4.ae = Integer.valueOf(var7);
               } else if (var6.toLowerCase().contains("anint167")) {
                  var4.t = Integer.valueOf(var7);
               } else if (var6.toLowerCase().contains("anint191")) {
                  var4.N = Integer.valueOf(var7);
               } else if (var6.toLowerCase().contains("anint192")) {
                  var4.O = Integer.valueOf(var7);
               } else if (var6.equalsIgnoreCase("texture")) {
                  var4.R = Integer.valueOf(var7);
               } else if (var6.toLowerCase().contains("textureinvanim")) {
                  var4.U = Boolean.valueOf(var7);
               } else if (!var6.toLowerCase().contains("texturecolors") && !var6.toLowerCase().contains("textureids")) {
                  if (!var6.toLowerCase().contains("anint165") && (!var6.toLowerCase().contains("male") || var6.toLowerCase().contains("female"))) {
                     if (!var6.toLowerCase().contains("anint200") && !var6.toLowerCase().contains("female")) {
                        if ((var6.toLowerCase().contains("actions") || var6.toLowerCase().contains("options")) && !var6.toLowerCase().contains("ground")) {
                           String[] var21 = new String[5];
                           String var27 = var7;

                           for (int var38 = 0; var38 < var27.split(",").length && var38 < var21.length; var38++) {
                              if (var27.split(",")[var38] != null && !var27.split(",")[var38].equalsIgnoreCase("null")) {
                                 var21[var38] = var27.split(",")[var38];
                              }
                           }

                           var4.L = var21;
                        } else if (var6.toLowerCase().contains("ground") || var6.toLowerCase().contains("floor")) {
                           String[] var20 = new String[5];
                           String var26 = var7;

                           for (int var37 = 0; var37 < var26.split(",").length && var37 < var20.length; var37++) {
                              if (var26.split(",")[var37] != null && !var26.split(",")[var37].equalsIgnoreCase("null")) {
                                 var20[var37] = var26.split(",")[var37];
                              }
                           }

                           var4.u = var20;
                        } else if (var6.toLowerCase().contains("original")) {
                           ArrayList var19 = new ArrayList();
                           String var25 = var7;

                           for (int var35 = 0; var35 < var25.split(",").length; var35++) {
                              if (var25.split(",")[var35] != null) {
                                 var19.add(Integer.valueOf(var25.split(",")[var35]));
                              }
                           }

                           int[] var36 = new int[var19.size()];

                           for (int var42 = 0; var42 < var19.size(); var42++) {
                              var36[var42] = (Integer)var19.get(var42);
                           }

                           var4.h = var36;
                        } else if (var6.toLowerCase().contains("modified")) {
                           ArrayList var18 = new ArrayList();
                           String var24 = var7;

                           for (int var33 = 0; var33 < var24.split(",").length; var33++) {
                              if (var24.split(",")[var33] != null) {
                                 var18.add(Integer.valueOf(var24.split(",")[var33]));
                              }
                           }

                           int[] var34 = new int[var18.size()];

                           for (int var41 = 0; var41 < var18.size(); var41++) {
                              var34[var41] = (Integer)var18.get(var41);
                           }

                           var4.g = var34;
                        } else if (var6.toLowerCase().contains("stacks") || var6.toLowerCase().contains("stackids")) {
                           ArrayList var17 = new ArrayList();
                           String var23 = var7;

                           for (int var31 = 0; var31 < var23.split(",").length; var31++) {
                              if (var23.split(",")[var31] != null) {
                                 var17.add(Integer.valueOf(var23.split(",")[var31]));
                              }
                           }

                           int[] var32 = new int[10];

                           for (int var40 = 0; var40 < var17.size(); var40++) {
                              var32[var40] = (Integer)var17.get(var40);
                           }

                           var4.P = var32;
                        } else if (var6.toLowerCase().contains("stackamounts")) {
                           ArrayList var16 = new ArrayList();
                           String var22 = var7;

                           for (int var29 = 0; var29 < var22.split(",").length; var29++) {
                              if (var22.split(",")[var29] != null) {
                                 var16.add(Integer.valueOf(var22.split(",")[var29]));
                              }
                           }

                           int[] var30 = new int[10];

                           for (int var39 = 0; var39 < var16.size(); var39++) {
                              var30[var39] = (Integer)var16.get(var39);
                           }

                           var4.ab = var30;
                        } else if (var6.toLowerCase().contains("light")) {
                           var4.X = Integer.valueOf(var7);
                        } else if (var6.toLowerCase().contains("shadow")) {
                           var4.I = Integer.valueOf(var7);
                        } else if (var6.toLowerCase().contains("abyte205") || var6.toLowerCase().contains("mequipoffy")) {
                           var4.ag = (byte)Integer.valueOf(var7).intValue();
                        } else if (var6.toLowerCase().contains("mequipoffx")) {
                           var4.af = (byte)Integer.valueOf(var7).intValue();
                        } else if (var6.toLowerCase().contains("fequipoffx")) {
                           var4.ai = (byte)Integer.valueOf(var7).intValue();
                        } else if (var6.toLowerCase().contains("mequipoffz")) {
                           var4.ah = (byte)Integer.valueOf(var7).intValue();
                        } else if (var6.toLowerCase().contains("fequipoffz")) {
                           var4.aj = (byte)Integer.valueOf(var7).intValue();
                        } else if (var6.toLowerCase().contains("abyte154") || var6.toLowerCase().contains("fequipoffy")) {
                           var4.ak = (byte)Integer.valueOf(var7).intValue();
                        } else if ((var6.toLowerCase().contains("certid") || var6.toLowerCase().contains("note")) && !var6.toLowerCase().contains("template")) {
                           var4.F = Integer.valueOf(var7);
                        } else if (var6.toLowerCase().contains("template")) {
                           var4.p = Integer.valueOf(var7);
                        } else if (var6.toLowerCase().contains("stackable")) {
                           var4.C = Boolean.valueOf(var7);
                           var4.D = Boolean.valueOf(var7);
                        }
                     } else if (!var6.toLowerCase().contains("femaleequip2") && !var6.toLowerCase().contains("femalemodel2")) {
                        var4.aa = Integer.valueOf(var7);
                     } else {
                        var4.q = Integer.valueOf(var7);
                     }
                  } else if (!var6.toLowerCase().contains("maleequip2") && !var6.toLowerCase().contains("malemodel2")) {
                     var4.r = Integer.valueOf(var7);
                  } else {
                     var4.K = Integer.valueOf(var7);
                  }
               } else {
                  ArrayList var8 = new ArrayList();
                  String var9 = var7;

                  for (int var10 = 0; var10 < var9.split(",").length; var10++) {
                     if (var9.split(",")[var10] != null) {
                        var8.add(Integer.valueOf(var9.split(",")[var10]));
                     }
                  }

                  int[] var28 = new int[var8.size()];

                  for (int var11 = 0; var11 < var8.size(); var11++) {
                     var28[var11] = (Integer)var8.get(var11);
                  }

                  if (var6.toLowerCase().contains("textureids")) {
                     var4.T = var28;
                  } else {
                     var4.S = var28;
                  }
               }
            }

            var3 = var2.readLine();
            var0.a(var5, var4);
         }

         var2.close();
      } catch (FileNotFoundException var12) {
         System.out.println(var1);
         var12.printStackTrace();
      } catch (IOException var13) {
         System.out.println(var1);
         var13.printStackTrace();
      }

      return var0;
   }
}
