package rs.p_s.p_k;

import java.awt.image.BufferedImage;
import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.p_A_uc.C_j;
import rs.p_gui.p_b.C_h;
import rs.p_s.C_e;
import rs.p_ui.C_l;

@C_e(
   a = "Loadouts",
   b = "loadouts",
   c = "Set up and switch between loadouts",
   d = {"panel"},
   i = true,
   k = true
)
public class C_a extends rs.p_s.C_a {
   private static final Logger b = LoggerFactory.getLogger(C_a.class);
   @Inject
   private rs.p_ui.C_e c;
   private C_l d;
   private C_h e;

   @Override
   protected void a() {
      BufferedImage var1 = C_j.b(this.getClass(), "ldt_icon.png");
      this.e = new C_h();
      C_h.b = this.e;
      this.d = C_l.a().a("Loadouts").a(var1).a(0).a(this.e).a();
      this.c.a(this.d);
   }
}
