package rs.p_t.p_b;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import rs.p_d.C_d;

public class C_a {
   public static boolean a = false;
   public static boolean b = false;
   private static final String c = rs.p_v.C_a.b() + File.separator + "e.yaml";
   private static final String d = rs.p_v.C_a.b() + File.separator + "e.bin";

   public static void a() {
      if (rs.p_f.C_a.c == 1) {
         a = true;
         LinkedHashMap var0 = new LinkedHashMap();

         for (int var1 = 0; var1 < 25000; var1++) {
            try {
               b = true;
               C_d var2 = C_d.c(var1);
               Map var3 = a(var2, C_d.b((int)var2.x));
               if (var3.size() > 0) {
                  LinkedHashMap var4 = new LinkedHashMap();
                  var4.put("name", var2.o);

                  for (String var6 : var3.keySet()) {
                     var4.put(var6, var3.get(var6));
                  }

                  var0.put(var1, var4);
               }
            } catch (Exception var8) {
            }
         }

         rs.p_t.C_a var9 = new rs.p_t.C_a(c, d);

         try {
            var9.a(var0);
         } catch (IOException var7) {
            throw new RuntimeException(var7);
         }

         System.out.println("..Dump completed!");
         a = false;
      }
   }

   public static void b() {
      if (rs.p_f.C_a.c == 1) {
         String[] var0 = new String[]{"retextures", "srcColors", "destColors", "chatHeadModels"};
         rs.p_t.p_a.C_b var1 = new rs.p_t.p_a.C_b();
         var1.a();

         for (int var2 = 0; var2 < 25000; var2++) {
            try {
               C_d var3 = var1.a(var2);
               if (var3 == null) {
                  var3 = C_d.b(var2);
               }

               int var4 = 0;
               Map var5 = a(var3, C_d.c(var2));

               for (String var7 : var5.keySet()) {
                  if (!Arrays.asList(var0).contains(var7)) {
                     var4++;
                  }
               }

               if (var4 > 0) {
                  System.out.println("Found differences in NPC " + var2 + " (" + C_d.c(var2).o + ")");
                  System.out.println("{ ");

                  try {
                     for (String var11 : var5.keySet()) {
                        System.out.print(var11 + " => " + a(var5.get(var11)));
                        System.out.println();
                     }
                  } catch (Exception var8) {
                     var8.printStackTrace();
                  }

                  System.out.println("}\n");
               }
            } catch (Exception var9) {
            }
         }
      }
   }

   public static Map<String, Object> a(C_d var0, C_d var1) {
      LinkedHashMap var2 = new LinkedHashMap();
      if (!var0.o.equalsIgnoreCase(var1.o)) {
         var2.put("name", var0.o);
      }

      if (var0.n != var1.n) {
         var2.put("combatLevel", var0.n);
      }

      if (!Arrays.equals((Object[])var0.p, (Object[])var1.p)) {
         var2.put("actions", var0.p);
      }

      if (!Arrays.equals(var0.L, var1.L)) {
         var2.put("models", var0.L);
      }

      if (var0.I != var1.I) {
         var2.put("scaleWidth", var0.I);
      }

      if (var0.E != var1.E) {
         var2.put("scaleHeight", var0.E);
      }

      if (!Arrays.equals(var0.v, var1.v)) {
         var2.put("srcColors", var0.v);
      }

      if (!Arrays.equals(var0.s, var1.s)) {
         var2.put("destColors", var0.s);
      }

      if (!Arrays.equals(var0.t, var1.t)) {
         var2.put("chatHeadModels", var0.t);
      }

      if (var0.r != var1.r) {
         var2.put("size", var0.r);
      }

      if (var0.w != var1.w) {
         var2.put("standAnim", var0.w);
      }

      if (var0.q != var1.q) {
         var2.put("walkAnim", var0.q);
      }

      if (var0.l == var0.B && var0.l == var0.j && var0.l != var1.l) {
         var2.put("rotateAnim", var0.l);
      } else {
         if (var0.l != var1.l) {
            var2.put("rotateAnim180", var0.l);
         }

         if (var0.B != var1.B) {
            var2.put("rotateAnim90CW", var0.B);
         }

         if (var0.j != var1.j) {
            var2.put("rotateAnim90CCW", var0.j);
         }
      }

      if (var0.F != var1.F) {
         var2.put("minimap", var0.F);
      }

      if (var0.K != var1.K) {
         var2.put("priorityRender", var0.K);
      }

      if (var0.D != var1.D) {
         var2.put("ambient", var0.D);
      }

      if (var0.J != var1.J) {
         var2.put("contrast", var0.J);
      }

      if (var0.u != var1.u) {
         var2.put("headIcon", var0.u);
      }

      if (var0.y != var1.y) {
         var2.put("rotationSpeed", var0.y);
      }

      if (var0.k != var1.k) {
         var2.put("anInt57", var0.k);
      }

      if (var0.m != var1.m) {
         var2.put("anInt59", var0.m);
      }

      if (var0.h != var1.h) {
         var2.put("pet", var0.h);
      }

      if (var0.C != var1.C) {
         var2.put("clickable", var0.C);
      }

      if (var0.g != var1.g) {
         var2.put("renderIdle", var0.g);
      }

      return var2;
   }

   private static String a(Object var0) {
      if (var0 == null) {
         return "null";
      } else if (var0 instanceof int[]) {
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
