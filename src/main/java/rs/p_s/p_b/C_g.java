package rs.p_s.p_b;

import java.awt.image.BufferedImage;
import javax.inject.Inject;
import javax.inject.Provider;

@rs.p_s.C_e(
   a = "Configuration",
   b = "configs",
   i = true,
   g = true
)
public class C_g extends rs.p_s.C_a {
   @Inject
   private rs.p_ui.C_e b;
   @Inject
   private Provider<C_q> c;
   @Inject
   private Provider<C_w> d;
   @Inject
   private rs.p_e.C_i e;
   private C_w f;
   private rs.p_ui.C_l g;

   @Override
   protected void a() {
      this.f = (C_w)this.d.get();
      BufferedImage var1 = rs.p_A_uc.C_j.b(this.getClass(), "config_icon.png");
      this.g = rs.p_ui.C_l.a().a("Configuration").a(var1).a(3).a(this.f).a();
      this.b.a(this.g);
   }

   @Override
   protected void b() {
      this.b.b(this.g);
   }
}
