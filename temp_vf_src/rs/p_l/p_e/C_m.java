package rs.p_l.p_e;

import java.util.ArrayList;
import java.util.List;
import rs.C_Client_mc;

public class C_m {
   private C_l a = null;
   private List<C_l> b = new ArrayList<>();
   private C_Client_mc c;

   public C_m(C_Client_mc var1) {
      this.c = var1;
   }

   public void a() {
      if (this.a == null) {
         if (!this.b.isEmpty()) {
            this.a = new C_l(this.b.get(0).a);
            this.b.remove(0);
         }
      } else {
         int var1 = this.c.gm.c(this.a.a);
         if (this.a.b <= -1 * var1) {
            this.a = null;
            return;
         }

         this.a.b--;
         this.c.gm.b(this.a.a, this.a.b, this.a.c, 16777215, 0);
      }
   }

   public void a(String var1) {
      this.b.add(new C_l(var1));
   }
}
