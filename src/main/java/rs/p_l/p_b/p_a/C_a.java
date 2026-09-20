package rs.p_l.p_b.p_a;

import java.util.ArrayList;
import java.util.Arrays;
import rs.C_Client_mc;
import rs.p_d.C_k;
import rs.p_l.p_e.C_f;

public class C_a {
   private static final boolean a = true;

   public static void a(String var0, String var1, String[] var2) {
      String var3 = var1.toLowerCase();
      switch (var3) {
         case "col":
         case "cols":
         case "color":
         case "colors":
            boolean var5 = true;

            for (rs.p_l.p_b.p_a.p_a.C_a var17 : C_d.b.h()) {
               if (var17.h() || var17 instanceof rs.p_l.p_b.p_a.p_a.C_b) {
                  if (var17 instanceof rs.p_l.p_b.p_a.p_a.C_b) {
                     var5 = false;
                  }

                  if (var2.length == 0) {
                     var17.f();
                     return;
                  }

                  if (var1.toLowerCase().equals("colors") || var1.toLowerCase().equals("cols") || var2[0].equalsIgnoreCase("reset")) {
                     var17.k().clear();
                  }

                  if (!var2[0].equalsIgnoreCase("reset") && var2.length > 0) {
                     for (String var32 : var2[0].split(",")) {
                        int var34 = Integer.parseInt(var32);
                        if (!var17.k().contains(var34)) {
                           var17.k().add(var34);
                        }
                     }
                  }

                  C_d.b.c("Selected colors: @gre@" + Arrays.toString(var17.k().toArray()));
               }
            }

            if (var5) {
               C_d.b.f();
            }
            break;
         case "finditem":
         case "findnpc":
            ArrayList var6 = new ArrayList();
            String var7 = "";

            for (String var11 : var2) {
               if (!var7.isEmpty()) {
                  var7 = var7 + " ";
               }

               if (var11.contains("-")) {
                  var6.add(var11.substring(1).toLowerCase());
               } else {
                  var7 = var7 + var11.toLowerCase();
               }
            }

            ArrayList var18 = new ArrayList();
            if (var1.toLowerCase().contains("item")) {
               for (int var21 = 1; var21 < 40000; var21++) {
                  try {
                     C_k var26 = C_k.f(var21);
                     if (var26 != null && var26.w != null && var26.w.toLowerCase().contains(var7) && !var26.b()) {
                        if (!var26.w.contains("@gre@")) {
                        }

                        boolean var30 = false;

                        for (String var13 : (java.util.List<String>)(java.util.List<?>)var6) {
                           if (var26.w.contains(var13)) {
                              var30 = true;
                              break;
                           }
                        }

                        if (!var30) {
                           var18.add("@whi@" + var26.w + " @cya@[" + var26.i + "]");
                        }
                     }
                  } catch (Exception var15) {
                     break;
                  }
               }
            }

            if (var1.toLowerCase().contains("npc")) {
               for (int var22 = 1; var22 < 40000; var22++) {
                  try {
                     rs.p_d.C_d var27 = rs.p_d.C_d.c(var22);
                     if (var27 != null && var27.o != null && !var27.o.equals("null") && var27.o.toLowerCase().contains(var7)) {
                        boolean var31 = false;

                        for (String var35 : (java.util.List<String>)(java.util.List<?>)var6) {
                           if (var27.o.contains(var35)) {
                              var31 = true;
                              break;
                           }
                        }

                        if (!var31) {
                           var18.add("@whi@" + var27.o + " @cya@[" + var27.x + "]");
                        }
                     }
                  } catch (Exception var14) {
                     break;
                  }
               }
            }

            for (String var28 : (java.util.List<String>)(java.util.List<?>)var18) {
               C_d.b(var28);
            }
            break;
         case "itemdef":
            if (var2[0].equalsIgnoreCase("reset")) {
               C_Client_mc.M();
               C_k.b = new rs.p_t.p_a.C_d();
               C_k.b.a();
               C_k.k.a();
               C_k.l.a();
               C_d.b.f();
               C_d.b.c("Item definitions reset!");
            } else {
               int var9 = Integer.valueOf(var2[0]);
               C_k var10 = C_k.f(var9);
               System.out.println();
               System.out.println("[ITEM " + var9 + "]");
               System.out.println("modelID=" + var10.A);
               if (var10.r > 0) {
                  System.out.println("maleEquip1=" + var10.r);
               }

               if (var10.K > 0) {
                  System.out.println("maleEquip2=" + var10.K);
               }

               if (var10.aa > 0) {
                  System.out.println("femaleEquip1=" + var10.aa);
               }

               if (var10.q > 0) {
                  System.out.println("femaleEquip2=" + var10.q);
               }

               System.out.println("rotationX=" + var10.M);
               System.out.println("rotationY=" + var10.Z);
               System.out.println("zoom=" + var10.G);
               System.out.println("offset1=" + var10.v);
               System.out.println("offset2=" + var10.W);
               if (var10.o != -1) {
                  System.out.println("anInt162=" + var10.o);
               }

               if (var10.ae != 0) {
                  System.out.println("anInt204=" + var10.ae);
               }

               if (var10.h != null) {
                  System.out.println("modifiedModelColors=" + Arrays.toString(var10.g).replace("[", "").replace("]", "").replace(" ", ""));
                  System.out.println("originalModelColors=" + Arrays.toString(var10.h).replace("[", "").replace("]", "").replace(" ", ""));
               }

               if (var10.P != null) {
                  System.out.println("stackIds=" + Arrays.toString(var10.P).replace("[", "").replace("]", "").replace(" ", ""));
                  System.out.println("stackAmounts=" + Arrays.toString(var10.ab).replace("[", "").replace("]", "").replace(" ", ""));
               }

               C_Client_mc.M();
               System.out.println();
            }
            break;
         case "texture":
         case "textures":
            C_f.j.r = true;
            C_f.j.s = 0;
            C_d.b.c("Textures opened");
      }
   }
}
