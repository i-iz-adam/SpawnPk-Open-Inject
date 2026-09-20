package rs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class C_y {
   private static int[] a(ArrayList<Integer> var0) {
      int[] var1 = new int[var0.size()];

      for (int var2 = 0; var2 < var0.size(); var2++) {
         var1[var2] = (Integer)var0.get(var2);
      }

      return var1;
   }

   public static rs.p_d.C_a[] a(rs.p_d.C_a[] var0) {
      return a(var0, new File(rs.p_v.C_a.f(), "configs/old_a.dat"));
   }

   public static rs.p_d.C_a[] a(rs.p_d.C_a[] var0, File var1) {
      rs.p_d.C_a[] var2 = new rs.p_d.C_a[var0.length];

      for (int var3 = 0; var3 < var2.length; var3++) {
         if (var0[var3] != null) {
            var2[var3] = new rs.p_d.C_a(var0[var3]);
         }
      }

      try {
         BufferedReader var15 = new BufferedReader(new FileReader(var1));
         int var5 = -1;

         String var4;
         while ((var4 = var15.readLine()) != null) {
            String[] var6 = var4.split(" ");
            if (var4.toLowerCase().contains("anim ")) {
               var5 = Integer.parseInt(var6[1]);
            } else if (var5 != -1) {
               if (var4.contains("arr1:")) {
                  ArrayList var16 = new ArrayList();
                  String var17 = var6[1];

                  for (String var21 : var17.split(",")) {
                     var16.add(Integer.parseInt(var21));
                  }

                  var2[var5].g = a(var16);
               } else if (!var4.contains("arr2:")) {
                  if (var4.contains("other:")) {
                     var2[var5].o = Integer.parseInt(var6[1]);
                     var2[var5].p = Integer.parseInt(var6[2]);
                     var2[var5].k = Integer.parseInt(var6[3]);
                     var2[var5].d = Integer.parseInt(var6[4]);
                     var5 = -1;
                  }
               } else {
                  ArrayList var7 = new ArrayList();
                  String var8 = var6[1];

                  for (String var12 : var8.split(",")) {
                     var7.add(Integer.parseInt(var12));
                  }

                  var2[var5].e = a(var7);
               }
            }
         }

         var15.close();
      } catch (FileNotFoundException var13) {
         var13.printStackTrace();
      } catch (IOException var14) {
         var14.printStackTrace();
      }

      return var2;
   }
}
