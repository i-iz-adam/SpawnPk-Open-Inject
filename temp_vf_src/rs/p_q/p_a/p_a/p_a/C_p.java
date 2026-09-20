package rs.p_q.p_a.p_a.p_a;

import java.util.ArrayList;
import rs.p_l.p_e.C_q;

public class C_p extends rs.p_q.p_a.p_a.C_a {
   private C_q.a a(String var1) {
      switch (var1) {
         case "magic_sickness":
            return C_q.a.q;
         case "welfare_2x":
            return C_q.a.Q;
         case "event_elixir":
            return C_q.a.H;
         default:
            try {
               return C_q.a.valueOf(var1.toUpperCase());
            } catch (Exception var4) {
               return null;
            }
      }
   }

   @Override
   public void a() {
      String var1 = this.h();
      if (var1.startsWith("dyn_")) {
         this.b(var1);
      } else {
         int var2 = this.g();
         C_q.a var3 = this.a(var1.toLowerCase());
         if (var3 != null) {
            ArrayList var4 = new ArrayList();
            boolean var5 = false;

            for (C_q var7 : this.c.u) {
               if (var7.a() == var3) {
                  if (var2 > 0) {
                     var7.a(var2);
                     var5 = true;
                  } else {
                     var4.add(var7);
                  }
               }
            }

            for (C_q var9 : var4) {
               this.c.u.remove(var9);
            }

            if (!var5 && var3 != null) {
               if (var2 > 0) {
                  this.c.u.add(new C_q(this.c, var3, var2));
               }

               if (var2 == -1) {
                  this.c.u.add(new C_q(this.c, var3, -1));
               }
            }
         }
      }
   }

   private void b(String var1) {
      String var2 = var1.substring(4);
      int var3 = this.g();
      int var4 = this.g();
      String var5 = this.h();
      var5 = var2 + "\n" + var5.replace("[br]", "\n");
      ArrayList var6 = new ArrayList();
      boolean var7 = false;

      for (C_q var9 : this.c.u) {
         if (var9.b().equals(var2)) {
            var6.add(var9);
         }
      }

      for (C_q var12 : var6) {
         this.c.u.remove(var12);
      }

      if (!var7) {
         this.c.u.add(new C_q(this.c, var2, var5, var4, var3));
      }
   }
}
