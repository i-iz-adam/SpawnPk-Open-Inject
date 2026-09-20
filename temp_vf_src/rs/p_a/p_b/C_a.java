package rs.p_a.p_b;

import java.util.ArrayList;
import java.util.List;
import p_gnu.p_trove.p_i.p_a.C_i;
import rs.p_a.C_h;

public class C_a extends C_b {
   private C_i a;
   private C_i b;
   private List<C_a.a> c = new ArrayList<>();

   public C_a(int[][][] var1) {
      this.a = new C_i();
      if (rs.p_s.p_c.C_d.b()) {
         this.b = new C_i();
      }

      for (int[][] var5 : var1) {
         C_a.a var6 = new C_a.a();
         var6.c = new C_i();
         var6.d = var5[1];

         for (int var10 : var5[0]) {
            if (rs.p_s.p_c.C_d.b()) {
               this.b.b(var10);
            }

            this.a.b(var10);
            var6.c.b(var10);
         }

         this.c.add(var6);
      }
   }

   @Override
   public void a(C_h var1) {
      for (int var2 = 0; var2 < this.c.size(); var2++) {
         this.c.get(var2).a = 0;
      }
   }

   @Override
   public void a(C_h var1, int var2) {
      if (this.a.a_(var1.ar[var2])) {
         for (int var3 = 0; var3 < this.c.size(); var3++) {
            if (this.c.get(var3).c.a_(var1.ar[var2])) {
               var1.ar[var2] = this.c.get(var3).a();
               break;
            }
         }
      }
   }

   public C_i a() {
      return this.a;
   }

   public C_i b() {
      return this.b;
   }

   class a {
      int a;
      private C_i c;
      private int[] d;

      public int a() {
         int var1 = this.d[this.a++];
         if (this.a >= this.d.length) {
            this.a = 0;
         }

         return var1;
      }
   }
}
