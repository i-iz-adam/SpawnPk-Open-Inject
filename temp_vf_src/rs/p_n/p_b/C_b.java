package rs.p_n.p_b;

import java.util.ArrayList;
import java.util.List;
import p_gnu.p_trove.p_f.p_b.C_cc;

public class C_b<T extends C_a> {
   private final C_cc<List<T>> a = new C_cc();

   public void a(int var1, T var2) {
      if (this.a.b(var1) == null) {
         this.a.a(var1, new ArrayList());
      }

      ((List)this.a.b(var1)).add(var2);
   }

   public void a(int var1) {
      if (this.a.b(var1) != null) {
         for (C_a var3 : (List)this.a.b(var1)) {
            var3.b();
         }
      }
   }

   public void a() {
      this.a.clear();
   }

   public C_cc<List<T>> b() {
      return this.a;
   }
}
