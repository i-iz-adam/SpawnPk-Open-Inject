package rs.p_s.p_p;

import com.google.inject.Provides;
import javax.inject.Inject;
import rs.p_e.C_i;
import rs.p_eventbus.C_Subscribe_mc;
import rs.p_runelite.p_events.C_ConfigChanged_mc;
import rs.p_s.C_e;

@C_e(
   a = "Player Outline",
   b = "playeroutline",
   c = "A simple plugin that outlines the player allowing you to see the player behind objects.",
   d = {"highlight, player, outline, color"},
   f = false
)
public class C_d extends rs.p_s.C_a {
   @Inject
   private C_a b;
   @Inject
   private C_b c;
   @Inject
   private C_c d;

   @Provides
   C_a a(C_i var1) {
      return var1.a(C_a.class);
   }

   @Override
   protected void a() {
      rs.p_l.p_f.C_e.d().a(this.c);
      if (this.b.b()) {
         rs.p_l.p_f.C_e.d().a(this.d);
      } else {
         rs.p_l.p_f.C_e.d().b(this.d);
      }
   }

   @Override
   protected void b() {
      rs.p_l.p_f.C_e.d().b(this.c);
      rs.p_l.p_f.C_e.d().b(this.d);
   }

   @C_Subscribe_mc
   public void onConfigChanged(C_ConfigChanged_mc var1) {
      if (var1.getKey().equalsIgnoreCase("petOutline")) {
         if (this.b.b()) {
            rs.p_l.p_f.C_e.d().a(this.d);
         } else {
            rs.p_l.p_f.C_e.d().b(this.d);
         }
      }
   }
}
