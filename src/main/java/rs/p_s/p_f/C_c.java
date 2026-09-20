package rs.p_s.p_f;

import com.google.a.b.as;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.Stroke;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.Nullable;
import javax.inject.Inject;
import rs.C_Client_mc;
import rs.p_runelite.p_a.C_h;
import rs.p_runelite.p_a.C_p;

public class C_c extends rs.p_l.p_f.C_b {
   private static final int e = 32;
   private final C_b f;
   private final C_d g;

   @Inject
   public C_c(C_b var1, C_d var2) {
      this.f = var1;
      this.g = var2;
      this.a(rs.p_l.p_f.C_a.o);
   }

   @Override
   public void a() {
      CopyOnWriteArrayList var1 = this.g.g();
      if (!var1.isEmpty()) {
         BasicStroke var2 = new BasicStroke((float)this.f.d());

         for (C_a var4 : var1) {
            C_p var5 = var4.a();
            if (var5.g() == C_Client_mc.dw) {
               Color var6 = var4.b();
               if (var6 == null) {
                  var6 = this.f.a();
               }

               this.a(var5, var6, var4.c(), var2);
            }
         }
      }
   }

   private void a(C_p var1, Color var2, @Nullable String var3, Stroke var4) {
      C_p var5 = C_Client_mc.eR.g();
      if (var1.a(var5) < 32) {
         rs.p_runelite.p_a.C_f var6 = rs.p_runelite.p_a.C_f.a(var1);
         if (var6 != null) {
            Polygon var7 = C_h.a(var6);
            if (var7 != null) {
               this.a(var7, var2, new Color(0, 0, 0, this.f.e()), var4);
            }

            if (!as.c(var3)) {
               this.a(var6, var3, var2, 0);
            }
         }
      }
   }
}
