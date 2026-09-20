package rs.p_l.p_f.p_a.p_f;

import java.util.ArrayList;
import java.util.List;
import rs.C_Client_mc;

public class C_c extends rs.p_l.p_f.C_b {
   private static final int e = 1000;
   private final List<C_a> f = new ArrayList<>();
   private final List<C_a> g = new ArrayList<>();

   public C_c() {
      this.a(rs.p_l.p_f.C_a.A);
   }

   @Override
   public void a() {
      if (this.f.size() != 0) {
         for (int var1 = 0; var1 < this.f.size(); var1++) {
            C_a var2 = this.f.get(var1);
            var2.a();
            if (!rs.p_l.p_b.C_a.a()) {
               var2.b();
            }

            if (!var2.c()) {
               this.g.add(var2);
            }
         }

         for (int var3 = 0; var3 < this.g.size(); var3++) {
            this.f.remove(this.g.get(var3));
         }

         this.g.clear();
      }
   }

   public void c(int var1, int var2) {
      if (C_Client_mc.cH != -1) {
         ;
      }
   }

   public void a(int var1, int var2, int var3, int var4, int var5) {
      for (int var6 = 0; var6 < 4; var6++) {
         for (int var7 = 0; var7 < var1; var7++) {
            C_a var8 = new C_a(var2, var3, var4);
            if (var6 != 0 && var6 != 2) {
               var8.a(C_b.a);
            } else {
               var8.a(C_b.b);
            }

            var8.b(var6 >= 2 ? -0.25 : 0.25);
            var8.a((double)(1 + C_Client_mc.d(25)));
            var8.b(3, 3);
            var8.e(1 + C_Client_mc.d(2));
            var8.i(var5);
            this.a(var8);
         }
      }
   }

   public void b(int var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4, 255);
   }

   public void a(C_a var1) {
      if (this.f.size() < 1000) {
         this.f.add(var1);
      }
   }
}
