package rs.p_t.p_b;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import rs.p_d.C_k;
import rs.p_t.p_a.C_d;

public class C_b {
   private static final String a = rs.p_v.C_a.b() + File.separator + "i.yaml";
   private static final String b = rs.p_v.C_a.b() + File.separator + "i.bin";

   public static void a() {
      if (rs.p_f.C_a.c == 1) {
         rs.p_f.C_a.aa = false;
         LinkedHashMap var0 = new LinkedHashMap();

         for (int var1 = 0; var1 < C_k.a; var1++) {
            try {
               C_k var2 = C_k.f(var1);
               Map var3 = a(var2, C_k.e(var2.i), true);
               if (var3.size() > 0) {
                  LinkedHashMap var4 = new LinkedHashMap();
                  var4.put("name", var2.w);

                  for (String var6 : var3.keySet()) {
                     if (!var6.equals("name")) {
                        var4.put(var6, var3.get(var6));
                     }
                  }

                  var0.put(var1, var4);
               }
            } catch (Exception var8) {
               var8.printStackTrace();
            }
         }

         rs.p_t.C_a var9 = new rs.p_t.C_a(a, b);

         try {
            var9.a(var0);
         } catch (IOException var7) {
            throw new RuntimeException(var7);
         }

         System.out.println("..Dump completed!");
      }
   }

   public static void b() {
      if (rs.p_f.C_a.c == 1) {
         String[] var0 = new String[]{
            "srcColors", "destColors", "retextures", "maleOffsets", "femaleOffsets", "maleChatModels", "femaleChatModels", "ambient", "contrast", "stackable"
         };
         String[] var1 = new String[]{"modelId", "rotations", "zoom", "offsets"};
         C_d var2 = new C_d();
         var2.a();
         System.out.println("Running test..");

         for (int var3 = 0; var3 < C_k.a; var3++) {
            if (var2.a(var3) != null) {
               C_k var4 = C_k.f(var3);
               C_k var5 = var2.a(var3);
               Map var6 = a(var5, var4, false);
               if (var6.size() > 0) {
                  int var7 = 0;

                  for (String var9 : var6.keySet()) {
                     if (!Arrays.asList(var0).contains(var9) && (var5.F <= 0 || var4.F <= 0 || var5.F != var4.F || !Arrays.asList(var1).contains(var9))) {
                        var7++;
                     }
                  }

                  if (var7 > 0) {
                     System.out.println("Found differences in item " + var3 + " (" + C_k.f(var3).w + ")");
                     System.out.println("{ ");

                     for (String var11 : var6.keySet()) {
                        if (!Arrays.asList(var0).contains(var11) && (var5.F <= 0 || var4.F <= 0 || var5.F != var4.F || !Arrays.asList(var1).contains(var11))) {
                           System.out.print(var11 + " => " + a(var6.get(var11)));
                           if (var11.equalsIgnoreCase("modelid")) {
                              System.out.print("  vs. (old) " + var4.A);
                           }

                           if (var11.equalsIgnoreCase("actions")) {
                              System.out.print("  vs. (old) " + Arrays.toString((Object[])var4.L));
                           }

                           if (var11.equalsIgnoreCase("maleModels")) {
                              System.out.print("  vs. (old) " + Arrays.toString(new int[]{var4.r, var4.K, var4.J}));
                           }

                           if (var11.equalsIgnoreCase("femaleModels")) {
                              System.out.print("  vs. (old) " + Arrays.toString(new int[]{var4.aa, var4.q, var4.o}));
                           }

                           System.out.println();
                        }
                     }

                     System.out.println("}\n");
                  }
               }
            }
         }

         System.out.println("..Test completed!");
      }
   }

   public static Map<String, Object> a(C_k var0, C_k var1, boolean var2) {
      LinkedHashMap var3 = new LinkedHashMap();
      if (var0.w.equals("Dwarf remains") && var1.w.equals("Dwarf remains")) {
         return var3;
      } else if (var0.w == null && var1.w == null) {
         return var3;
      } else {
         if (!var0.w.equalsIgnoreCase(var1.w)) {
            var3.put("name", var0.w);
         }

         boolean var4 = false;
         if (var0.F != var1.F) {
            var3.put("note", var0.F);
            var4 = true;
         }

         if (var0.p != var1.p) {
            if (var4 && var0.p != 799) {
               var3.put("template", var0.p);
            }

            if (!Arrays.equals((Object[])var0.L, (Object[])(new String[]{null, null, null, null, "Drop"}))) {
               var3.put("actions", var0.L);
            }
         }

         if (var4) {
            if (var0.F != -1 && var0.p != -1) {
               return var3;
            }

            var3.put("note", -1);
            var3.put("template", -1);
         }

         if (var0.w.toLowerCase().contains("(broken)")) {
            var3.put("broken", true);
         } else {
            if (!Arrays.equals((Object[])var0.L, (Object[])var1.L)) {
               var3.put("actions", var0.L);
            }

            if (!Arrays.equals((Object[])var0.u, (Object[])var1.u)) {
               var3.put("groundActions", var0.u);
            }

            if (var0.D != var1.D) {
               var3.put("stackable", var0.D);
            }

            if (!Arrays.equals(var0.P, var1.P)) {
               var3.put("stackIds", var0.P);
            }

            if (!Arrays.equals(var0.ab, var1.ab)) {
               var3.put("stackAmounts", var0.ab);
            }
         }

         if (!Arrays.equals(var0.g, var1.g) || !Arrays.equals(var0.h, var1.h)) {
            var3.put("srcColors", var0.g);
            var3.put("destColors", var0.h);
         }

         boolean var5 = false;
         boolean var6 = false;
         if (var2 && var3.size() > 1 && var0.A != var1.A && var0.A > 0) {
            for (int var7 = 0; var7 < var0.i; var7++) {
               C_k var8 = C_k.f(var7);
               if (var0.F == -1
                  && var0.A == var8.A
                  && var0.G == var8.G
                  && var0.M == var8.M
                  && var0.Z == var8.Z
                  && var0.v == var8.v
                  && var0.W == var8.W
                  && var0.ae == var8.ae) {
                  boolean var9 = false;
                  if (!var9) {
                     var3.put("clone", var7);
                     if (Arrays.equals((Object[])var0.L, (Object[])var8.L)) {
                        var3.remove("actions");
                     }

                     if (Arrays.equals((Object[])var0.u, (Object[])var8.u)) {
                        var3.remove("groundActions");
                     }

                     var5 = true;
                     if (var0.r == var8.r
                        && var0.K == var8.K
                        && var0.J == var8.J
                        && var0.aa == var8.aa
                        && var0.q == var8.q
                        && var0.o == var8.o
                        && var0.af == var8.af
                        && var0.ag == var8.ag
                        && var0.ah == var8.ah
                        && var0.ai == var8.ai
                        && var0.ak == var8.ak
                        && var0.aj == var8.aj) {
                        var6 = true;
                     }
                  }
                  break;
               }
            }
         }

         if (!var5) {
            if (var0.A != var1.A) {
               var3.put("modelId", var0.A);
            }

            if (var0.G != var1.G) {
               var3.put("zoom", var0.G);
            }

            if (var0.M != var1.M || var0.Z != var1.Z) {
               var3.put("rotations", new int[]{var0.M, var0.Z});
            }

            if (var0.v != var1.v || var0.W != var1.W) {
               var3.put("offsets", new int[]{var0.v, var0.W});
            }

            if (var0.ae != var1.ae) {
               var3.put("zan2d", var0.ae);
            }
         }

         if (var0.R != var1.R) {
            var3.put("fullTexture", var0.R);
         }

         if (var0.U != var1.U) {
            var3.put("textureInvAnim", var0.U);
         }

         if (!Arrays.equals(var0.S, var1.S) || !Arrays.equals(var0.T, var1.T)) {
            var3.put("retextures", new int[][][]{{var0.S, var0.T}});
         }

         if (var0.t != var1.t || var0.O != var1.O || var0.N != var1.N) {
            var3.put("resize", new int[]{var0.t, var0.O, var0.N});
         }

         if (!var6 && var0.L[1] != null) {
            if (var0.r != var1.r || var0.K != var1.K || var0.J != var1.J) {
               var3.put("maleModels", new int[]{var0.r, var0.K, var0.J});
            }

            if (var0.aa != var1.aa || var0.q != var1.q || var0.o != var1.o) {
               var3.put("femaleModels", new int[]{var0.aa, var0.q, var0.o});
            }

            if (var0.af != var1.af || var0.ag != var1.ag || var0.ah != var1.ah) {
               var3.put("maleOffsets", new int[]{var0.af, var0.ag, var0.ah});
            }

            if (var0.ai != var1.ai || var0.ak != var1.ak || var0.aj != var1.aj) {
               var3.put("femaleOffsets", new int[]{var0.ai, var0.ak, var0.aj});
            }
         }

         if (var0.B != var1.B || var0.s != var1.s) {
            var3.put("maleChatModels", new int[]{var0.B, var0.s});
         }

         if (var0.Y != var1.Y || var0.z != var1.z) {
            var3.put("femaleChatModels", new int[]{var0.Y, var0.z});
         }

         if (var0.X != var1.X) {
            var3.put("ambient", var0.X);
         }

         if (var0.I != var1.I) {
            var3.put("contrast", var0.I);
         }

         return var3;
      }
   }

   private static String a(Object var0) {
      if (var0 instanceof int[]) {
         return Arrays.toString((int[])var0);
      } else if (var0.getClass().isArray()) {
         try {
            return Arrays.toString((Object[])var0);
         } catch (Exception var2) {
            return var0.toString();
         }
      } else {
         return var0.toString();
      }
   }
}
