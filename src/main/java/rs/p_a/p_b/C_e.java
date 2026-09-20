package rs.p_a.p_b;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p_gnu.p_trove.p_f.p_b.C_bU_mc;
import p_gnu.p_trove.p_i.p_a.C_i;
import rs.p_a.C_h;

public class C_e extends C_b {
   private final C_i b;
   private final List<C_bU_mc> c;
   private int[] d;
   HashSet<Integer> a = new HashSet<>();
   private int e;
   private int f;

   public C_e() {
      this.b = new C_i();
      this.c = new ArrayList<>();
   }

   public void a(int[][][] var1) {
      for (int[][] var5 : var1) {
         C_bU_mc var6 = new C_bU_mc();
         int[] var7 = var5[0];
         int[] var8 = var5[1];

         for (int var9 = 0; var9 < var7.length && var9 < var8.length; var9++) {
            this.a.add(var8[var9]);
            this.b.b(var7[var9]);
            var6.a(var7[var9], var8[var9]);
         }

         this.c.add(var6);
      }
   }

   public void a(int var1, int[] var2) {
      C_bU_mc var3 = new C_bU_mc();

      for (int var7 : var2) {
         this.a.add(var1);
         this.b.b(var7);
         var3.a(var7, var1);
      }

      this.c.add(var3);
   }

   public int[] a() {
      if (this.d != null) {
         return this.d;
      } else {
         this.d = this.a.stream().mapToInt(Number::intValue).toArray();
         return this.d;
      }
   }

   @Override
   public void a(C_h var1) {
      int var2 = 0;
      this.e = 0;
      this.f = 0;

      for (int var3 = 0; var3 < var1.ar.length; var3++) {
         if (this.b.a_(var1.ar[var3])) {
            var2++;
         }
      }

      var1.av = var2;
      if (var1.ao == null) {
         var1.ao = new int[var1.ah];
      }

      if (var1.ar == null) {
         var1.ar = new int[var2];
      }

      var1.aw = new int[var2];
      var1.ax = new int[var2];
      var1.ay = new int[var2];
      var1.as = new boolean[var1.ah];
   }

   @Override
   public void a(C_h var1, int var2) {
      if (var1.as == null || !var1.as[var2]) {
         if (var1.Z == null) {
            if (this.b.a_(var1.ar[var2])) {
               for (int var3 = 0; var3 < this.c.size(); var3++) {
                  if (this.c.get(var3).r_(var1.ar[var2])) {
                     int var4 = this.c.get(var3).c(var1.ar[var2]);
                     var1.as[var2] = true;
                     var1.ar[var2] = var4;
                     var1.ao[var2] = 3 + this.f;
                     this.f += 4;
                     var1.aw[this.e] = var1.ai[var2];
                     var1.ax[this.e] = var1.aj[var2];
                     var1.ay[this.e] = var1.ak[var2];
                     this.e++;
                     break;
                  }
               }
            }
         }
      }
   }

   public C_i b() {
      return this.b;
   }

   public List<C_bU_mc> c() {
      return this.c;
   }
}
