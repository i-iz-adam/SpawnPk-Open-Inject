package rs.p_x;

import java.util.ArrayList;
import java.util.List;

public class C_d {
   private final List<C_c> a = new ArrayList<>();
   private final long b;
   private final int c;

   public C_d(int var1, long var2) {
      this.c = var1;
      this.b = var2;
   }

   public void a() {
      if (this.b != 0L) {
         ArrayList var1 = new ArrayList();

         for (C_c var3 : this.a) {
            if (System.currentTimeMillis() - var3.c() >= this.b) {
               var1.add(var3);
            }
         }

         for (C_c var5 : var1) {
            this.a.remove(var5);
         }
      }
   }

   public int b() {
      return this.c;
   }

   public void a(int var1, long var2) {
      C_c var4 = new C_c(this.c, var1, var2);
      this.a.add(var4);
   }

   public int c() {
      int var1 = 0;

      for (C_c var3 : this.a) {
         var1 += var3.b();
      }

      return var1;
   }

   public int d() {
      int var1 = 0;

      for (C_c var3 : this.a) {
         var1++;
      }

      return var1;
   }
}
