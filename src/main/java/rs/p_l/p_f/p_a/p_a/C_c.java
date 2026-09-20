package rs.p_l.p_f.p_a.p_a;

import java.util.ArrayList;
import java.util.List;

public class C_c extends rs.p_l.p_f.C_b {
   private static final int e = 3;
   private C_a f = null;
   private List<C_a> g = new ArrayList<>();

   public C_c() {
      this.a(rs.p_l.p_f.C_a.v);
   }

   @Override
   public void a() {
      if (this.f == null) {
         if (this.g.size() <= 0) {
            return;
         }

         this.f = this.g.get(this.g.size() - 1);
         this.f.a(System.currentTimeMillis());
         this.g.remove(this.g.size() - 1);
      }

      this.f.a();
      if (System.currentTimeMillis() - this.f.e() >= 5000L) {
         this.f = null;
      }
   }

   public void a(String var1, String var2, String var3) {
      if (this.f == null) {
         this.f = new C_a(var1, var2, var3);
      } else {
         this.b(var1, var2, var3);
      }
   }

   public void b(String var1, String var2, String var3) {
      for (C_a var5 : this.g) {
         if (var5.b().equals(var1) && var5.c().equals(var2) && var5.d().equals(var3)) {
            return;
         }
      }

      if (this.g.size() >= 3) {
         this.g.remove(0);
      }

      this.g.add(new C_a(var1, var2, var3));
   }
}
