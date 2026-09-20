package rs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class C_z {
   private static int[] a(ArrayList<Integer> var0) {
      int[] var1 = new int[var0.size()];

      for (int var2 = 0; var2 < var0.size(); var2++) {
         var1[var2] = (Integer)var0.get(var2);
      }

      return var1;
   }

   public static rs.p_d.C_x[] a(rs.p_d.C_x[] var0) {
      try {
         BufferedReader var1 = new BufferedReader(new FileReader(rs.p_v.C_a.f() + "/configs/old_g.dat"));
         int var3 = -1;

         String var2;
         while ((var2 = var1.readLine()) != null) {
            String[] var4 = var2.split(" ");
            if (var2.toLowerCase().contains("graphic ")) {
               var3 = Integer.parseInt(var4[1]);
            } else if (var3 != -1) {
               if (var2.contains("data:")) {
                  ArrayList var13 = new ArrayList();
                  String var14 = var4[1];

                  for (String var19 : var14.split(",")) {
                     var13.add(Integer.parseInt(var19));
                  }

                  int[] var16 = a(var13);
                  var0[var3].e = var16[0];
                  var0[var3].f = var16[1];
                  var0[var3].j = var16[2];
                  var0[var3].k = var16[3];
                  var0[var3].l = var16[4];
                  var0[var3].m = var16[5];
                  var0[var3].n = var16[6];
                  var0[var3].g = rs.p_d.C_a.a[var0[var3].f];
               } else if (var2.contains("arr1:") || var2.contains("arr2:")) {
                  ArrayList var5 = new ArrayList();
                  String var6 = var4[1];

                  for (String var10 : var6.split(",")) {
                     var5.add(Integer.parseInt(var10));
                  }

                  if (var2.contains("arr2:")) {
                     var0[var3].i = a(var5);
                  } else {
                     var0[var3].h = a(var5);
                  }
               }
            }
         }

         var1.close();
      } catch (FileNotFoundException var11) {
         var11.printStackTrace();
      } catch (IOException var12) {
         var12.printStackTrace();
      }

      return var0;
   }
}
