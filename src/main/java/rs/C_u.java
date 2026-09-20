package rs;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class C_u {
   public static void a(String var0) {
      ArrayList var1 = new ArrayList();
      File var2 = new File(var0);
      if (!var2.exists()) {
         System.out.println("[Model Checker] Could not find directory \"" + var0 + "\"");
      } else {
         File[] var3 = var2.listFiles();

         for (File var7 : var3) {
            String var8 = var7.getName();
            if (var8 != null) {
               var8 = var8.replaceAll(".gz", "");
               var8 = var8.replaceAll(".dat", "");

               try {
                  int var9 = Integer.parseInt(var8);
                  var1.add(var9);
               } catch (Exception var11) {
                  var11.printStackTrace();
               }
            }
         }

         System.out.println("[Model Checker] Checking " + var1.size() + " models from [" + var0 + "]..");

         try {
            a(var1);
         } catch (Exception var10) {
            var10.printStackTrace();
         }
      }
   }

   public static void a(List<Integer> var0) {
      HashMap var1 = new HashMap();

      for (int var2 = 1; var2 < rs.p_d.C_k.ad; var2++) {
         rs.p_d.C_k var3 = rs.p_d.C_k.f(var2);
         if (var3 != null) {
            String var4 = var3.w == null ? "null" : var3.w;

            for (int var6 : var0) {
               if (var3.A == var6) {
                  System.out.println("[Model Checker] Found model ID " + var6 + " for ITEM: " + var4 + " (" + var2 + ") (modelID)");
                  var1.put(var6, true);
               }

               if (var3.r == var6) {
                  System.out.println("[Model Checker] Found model ID " + var6 + " for ITEM: " + var4 + " (" + var2 + ") (maleEquip1)");
                  var1.put(var6, true);
               }

               if (var3.K == var6) {
                  System.out.println("[Model Checker] Found model ID " + var6 + " for ITEM: " + var4 + " (" + var2 + ") (maleEquip2)");
                  var1.put(var6, true);
               }

               if (var3.aa == var6) {
                  System.out.println("[Model Checker] Found model ID " + var6 + " for ITEM: " + var4 + " (" + var2 + ") (femaleEquip1)");
                  var1.put(var6, true);
               }

               if (var3.q == var6) {
                  System.out.println("[Model Checker] Found model ID " + var6 + " for ITEM: " + var4 + " (" + var2 + ") (femaleEquip2)");
                  var1.put(var6, true);
               }
            }
         }
      }

      for (int var11 = 1; var11 < rs.p_d.C_r.A; var11++) {
         rs.p_d.C_r var15 = rs.p_d.C_r.c(var11);
         if (var15 != null && var15.an != null) {
            String var19 = var15.R == null ? "null" : var15.R;

            for (int var25 : var0) {
               for (int var10 : var15.an) {
                  if (var25 == var10) {
                     System.out.println("[Model Checker] Found model ID " + var25 + " for OBJECT: " + var19 + " (" + var11 + ")");
                     var1.put(var25, true);
                  }
               }
            }
         }
      }

      for (int var12 = 1; var12 < rs.p_d.C_d.f; var12++) {
         rs.p_d.C_d var16 = rs.p_d.C_d.c(var12);
         if (var16 != null && var16.L != null) {
            String var20 = var16.o == null ? "null" : var16.o;

            for (int var26 : var0) {
               for (int var30 : var16.L) {
                  if (var26 == var30) {
                     System.out.println("[Model Checker] Found model ID " + var26 + " for NPC: " + var20 + " (" + var12 + ")");
                     var1.put(var26, true);
                  }
               }
            }
         }
      }

      for (int var13 = 0; var13 < rs.p_d.C_x.c.length; var13++) {
         rs.p_d.C_x var17 = rs.p_d.C_x.c[var13];
         if (var17 != null) {
            for (int var24 : var0) {
               if (var17.e == var24) {
                  System.out.println("[Model Checker] Found model ID " + var24 + " for GFX: " + var13);
                  var1.put(var24, true);
               }
            }
         }
      }

      System.out.println("[Model Checker] Model scan complete! Found a total of " + var1.size() + " used models..");
      if (var1.size() > 0) {
         System.out.print("[Model Checker] " + var1.size() + " used models: ");

         for (Object var18Obj : var1.keySet()) {
            Integer var18 = (Integer)var18Obj;
            System.out.print(var18 + ",");
         }

         System.out.print("\n");
      }
   }
}
