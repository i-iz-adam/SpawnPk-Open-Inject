package rs.p_s.p_r;

import com.google.inject.Provides;
import javax.inject.Inject;
import rs.p_e.C_i;
import rs.p_s.C_e;

@C_e(
   a = "Tile Indicators",
   b = "tileindicators",
   c = "Highlight the tile you are currently moving to",
   d = {"highlight", "overlay"},
   f = false
)
public class C_c extends rs.p_s.C_a {
   @Inject
   private C_b b;

   @Provides
   C_a a(C_i var1) {
      return var1.a(C_a.class);
   }

   @Override
   protected void a() {
      rs.p_l.p_f.C_e.d().a(this.b);
   }

   @Override
   protected void b() {
      rs.p_l.p_f.C_e.d().b(this.b);
   }
}
