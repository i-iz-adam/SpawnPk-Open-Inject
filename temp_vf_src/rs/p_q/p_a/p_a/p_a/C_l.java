package rs.p_q.p_a.p_a.p_a;

import javax.inject.Inject;
import rs.C_Client_mc;

public class C_l extends rs.p_q.p_a.p_a.C_a {
   private final rs.p_l.p_f.p_a.p_b.C_a d = new rs.p_l.p_f.p_a.p_b.C_a("<img=9> Claim", "misc/treasure", "misc/treasure 2", 16753931, 7359745)
      .a((var0, var1, var2, var3) -> C_Client_mc.fE[106].g(var0 + 21, var1 + 21, var2 - 25))
      .a(() -> rs.p_n.C_a.a("::claimcoffer"));
   private final rs.p_l.p_f.p_a.p_b.C_a e = new rs.p_l.p_f.p_a.p_b.C_a("<img=288> View", "misc/mail 7", "misc/mail 8", 9568136, 26904)
      .a((var0, var1, var2, var3) -> C_Client_mc.fE[106].g(var0 + 21, var1 + 21, var2 - 25))
      .a(() -> rs.p_n.C_a.a("::mail"));
   @Inject
   private rs.p_l.p_f.C_e f;

   @Override
   public void a() {
      int var1 = this.c();
      boolean var2 = this.e() == 1;
      rs.p_l.p_f.p_a.p_b.C_a var3 = null;
      switch (var1) {
         case 1:
            var3 = this.d;
            break;
         case 2:
            var3 = this.e;
      }

      if (var3 != null) {
         if (var2) {
            if (!this.f.c(var3)) {
               this.f.a(var3);
            }
         } else {
            this.f.b(var3);
         }
      }
   }
}
