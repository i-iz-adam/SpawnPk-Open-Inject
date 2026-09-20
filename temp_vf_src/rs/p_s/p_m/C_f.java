package rs.p_s.p_m;

import com.google.inject.Provides;
import java.awt.image.BufferedImage;
import javax.inject.Inject;
import rs.p_A_uc.C_j;
import rs.p_e.C_i;
import rs.p_ui.C_l;

@rs.p_s.C_e(
   a = "Notes",
   b = "notes",
   c = "Enable the Notes panel",
   d = {"panel"},
   i = true,
   k = true
)
public class C_f extends rs.p_s.C_a {
   @Inject
   private rs.p_ui.C_e b;
   @Inject
   private C_a c;
   private C_b d;
   private C_l e;

   @Provides
   C_a a(C_i var1) {
      return var1.a(C_a.class);
   }

   @Override
   protected void a() {
      this.d = (C_b)this.a.getInstance(C_b.class);
      this.d.a(this.c);
      BufferedImage var1 = C_j.b(this.getClass(), "notes_icon.png");
      this.e = C_l.a().a("Notes").a(var1).a(5).a(this.d).a();
      this.b.a(this.e);
   }

   @Override
   protected void b() {
      this.b.b(this.e);
   }
}
