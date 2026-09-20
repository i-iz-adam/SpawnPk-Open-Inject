package rs.p_s.p_g;

import java.awt.image.BufferedImage;
import javax.inject.Inject;
import rs.p_A_uc.C_j;
import rs.p_s.C_e;
import rs.p_ui.C_l;

@C_e(
   a = "Item ID Search",
   b = "itemsearch",
   c = "Enable the Item ID Search Panel",
   d = {"panel"},
   f = false
)
public class C_b extends rs.p_s.C_a {
   @Inject
   private rs.p_ui.C_e b;
   private C_a c;
   private C_l d;

   @Override
   protected void a() {
      this.c = (C_a)this.a.getInstance(C_a.class);
      this.c.b();
      BufferedImage var1 = C_j.b(this.getClass(), "search.png");
      this.d = C_l.a().a("Item ID Search").a(var1).a(6).a(this.c).a();
      this.b.a(this.d);
   }

   @Override
   protected void b() {
      this.b.b(this.d);
   }
}
