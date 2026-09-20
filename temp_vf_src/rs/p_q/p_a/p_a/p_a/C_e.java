package rs.p_q.p_a.p_a.p_a;

import com.google.inject.Inject;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class C_e extends rs.p_q.p_a.p_a.C_a {
   private static final int d = 1;
   private static final int e = 2;
   private static final int f = 3;
   @Inject
   private rs.p_A_uc.C_a g;
   @Inject
   private rs.p_ui.p_a.C_f h;
   @Inject
   private rs.p_e.C_i i;

   @Override
   public void a() {
      int var1 = this.e();
      this.b(var1);
   }

   private void b(int var1) {
      int var2 = this.e();
      String var3 = this.h();
      if (var2 == 0) {
         this.h.b(var3);
      } else if (var2 == 2) {
         int var14 = this.g();
         rs.p_ui.p_a.C_c var15 = this.h.a(var3);
         if (var15 != null && var15 instanceof rs.p_ui.p_a.C_b) {
            rs.p_ui.p_a.C_b var16 = (rs.p_ui.p_a.C_b)var15;
            var16.a(var14);
         }
      } else {
         String var4 = this.h();
         if (var4.equalsIgnoreCase("def")) {
            var4 = "InfoBoxOverlay";
         }

         int var5 = 0;
         if (var1 != 3) {
            var5 = this.g();
         }

         int var6 = this.e();
         String var7 = null;
         int var8 = 1;
         switch (var6) {
            case 1:
               var7 = this.h();
               break;
            case 2:
               var8 = this.g();
         }

         boolean var9 = this.e() == 1;
         String var10 = null;
         if (var9) {
            var10 = this.h();
            var10 = "@lre@" + var3 + "\n" + var10.replace("[br]", "\n");
         }

         rs.p_ui.p_a.C_c var11 = this.h.a(var3);
         if (var11 != null) {
            switch (var1) {
               case 1:
                  if (var11 instanceof rs.p_ui.p_a.C_j) {
                     ((rs.p_ui.p_a.C_j)var11).b(Duration.of((long)var5, ChronoUnit.SECONDS));
                     return;
                  }

                  this.h.b(var3);
                  break;
               case 2:
                  if (var11 instanceof rs.p_ui.p_a.C_b) {
                     ((rs.p_ui.p_a.C_b)var11).a(var5);
                     var11.a(Instant.now());
                     this.h.b(var3);
                  } else {
                     this.h.b(var3);
                  }
                  break;
               case 3:
                  return;
            }
         }

         rs.p_A_uc.C_d var12 = this.a(var7, var8);
         Object var13 = null;
         switch (var1) {
            case 1:
               if (var5 <= 0) {
                  return;
               }

               var13 = new rs.p_ui.p_a.C_j((long)var5, ChronoUnit.SECONDS, var12, var4, var3);
               break;
            case 2:
               var13 = new rs.p_ui.p_a.C_b(var12, var4, var3, var5);
               break;
            case 3:
               var13 = new rs.p_ui.p_a.C_i(var12, var4, var3);
         }

         if (var13 != null) {
            if (var7 != null) {
               ((rs.p_ui.p_a.C_c)var13).a(rs.p_ui.p_a.C_e.b);
            } else {
               ((rs.p_ui.p_a.C_c)var13).a(rs.p_ui.p_a.C_e.a);
            }

            ((rs.p_ui.p_a.C_c)var13).a(Objects.requireNonNullElseGet(var10, () -> "@lre@" + var3));
            this.h.b((rs.p_ui.p_a.C_c)var13);
         }
      }
   }

   private rs.p_A_uc.C_d a(String var1, int var2) {
      return var1 != null ? this.g.a(var1, -1) : this.g.a(var2, Integer.MAX_VALUE, 32);
   }
}
