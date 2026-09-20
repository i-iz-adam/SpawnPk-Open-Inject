package rs.p_s.p_i;

import com.google.inject.Inject;
import com.google.inject.Provides;
import rs.p_e.C_i;
import rs.p_eventbus.C_Subscribe_mc;
import rs.p_runelite.p_events.C_EntityInteraction_mc;
import rs.p_runelite.p_events.C_ObjectInteraction_mc;
import rs.p_s.C_e;

@C_e(
   a = "Interact Highlight",
   b = "interacthighlight",
   c = "Outlines npcs and objects you interact with or hover over",
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
      this.b.l();
      rs.p_l.p_f.C_e.d().b(this.b);
   }

   @C_Subscribe_mc
   private void onEntityInteraction(C_EntityInteraction_mc var1) {
      this.b.a(var1);
   }

   @C_Subscribe_mc
   private void onObjectInteraction(C_ObjectInteraction_mc var1) {
      this.b.a(var1);
   }
}
