package rs.p_s.p_e;

import com.google.inject.Provides;
import java.awt.image.BufferedImage;
import javax.inject.Inject;
import javax.swing.SwingUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.C_Client_mc;
import rs.p_A_uc.C_j;
import rs.p_e.C_i;
import rs.p_eventbus.C_Subscribe_mc;
import rs.p_gui.C_Launcher_mc;
import rs.p_runelite.p_events.C_ConfigChanged_mc;
import rs.p_ui.C_l;

@rs.p_s.C_e(
   a = "GPU Mode (Beta)",
   b = "gpu",
   c = "Enhance the graphics and performance of the game",
   d = {"panel"},
   i = true,
   k = true
)
public class C_c extends rs.p_s.C_a {
   private static final Logger b = LoggerFactory.getLogger(C_c.class);
   @Inject
   private rs.p_ui.C_e c;
   @Inject
   private C_d d;
   @Inject
   private C_Client_mc e;
   private C_l f;
   private C_b g;

   @Provides
   C_d a(C_i var1) {
      return var1.a(C_d.class);
   }

   @Override
   protected void a() {
      BufferedImage var1 = C_j.b(this.getClass(), "gpu_icon.png");
      this.g = (C_b)this.a.getInstance(C_b.class);
      this.f = C_l.a().a("GPU Mode").a(var1).a(1).a(this.g).a();
      this.c.a(this.f);
      rs.p_f.C_a.Q = this.d.a();
      rs.p_k.C_b.b = this.d.c();
      rs.p_k.C_b.i = this.d.d();
      rs.p_k.C_b.j = this.d.e();
      rs.p_k.C_b.c = this.d.g();
      rs.p_k.C_b.e = this.d.h();
      rs.p_k.C_b.k = this.d.f().b();
      rs.p_k.C_b.f = this.d.b();
   }

   @C_Subscribe_mc
   public void onConfigChanged(C_ConfigChanged_mc var1) {
      if (var1.getGroup().equals("gpu")) {
         rs.p_h.C_c.a(() -> {
            boolean var1x = rs.p_f.C_a.Q;
            boolean var2 = rs.p_k.C_b.i;
            boolean var3 = rs.p_k.C_b.j;
            rs.p_f.C_a.Q = this.d.a();
            rs.p_k.C_b.b = this.d.c();
            rs.p_k.C_b.i = this.d.d();
            rs.p_k.C_b.j = this.d.e();
            rs.p_k.C_b.c = this.d.g();
            rs.p_k.C_b.e = this.d.h();
            rs.p_k.C_b.k = this.d.f().b();
            rs.p_k.C_b.f = this.d.b();
            rs.p_k.C_b.d = this.d.i();
            if (this.e.fc) {
               if (rs.p_f.C_a.Q && !var1x) {
                  rs.p_k.C_b.b();
               }

               if (!rs.p_f.C_a.Q && var1x) {
                  rs.p_k.C_b.c();
               }

               if (rs.p_k.C_b.i && !C_Client_mc.ai()) {
                  if (rs.p_k.C_b.i != var2) {
                     if (rs.p_k.C_b.i) {
                        SwingUtilities.invokeLater(rs.p_k.C_b::f);
                     } else {
                        SwingUtilities.invokeLater(() -> C_Launcher_mc.n().p().a(765, 503));
                     }
                  }

                  if (rs.p_k.C_b.j != var3) {
                     this.e.ba();
                  }
               }
            }
         });
         if (var1.getKey().equals("vsyncMode")) {
            rs.p_h.C_c.a(() -> {
               rs.p_k.C_b.b = this.d.c();
               this.e.a.e();
            });
         }
      }
   }
}
