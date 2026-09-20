package rs.p_s.p_a;

import com.google.inject.Provides;
import javax.inject.Inject;
import rs.p_e.C_i;
import rs.p_eventbus.C_Subscribe_mc;
import rs.p_runelite.p_events.C_ConfigChanged_mc;

@rs.p_s.C_e(
   a = "Combat overlays",
   b = "combatInfo",
   i = true,
   l = true,
   d = {"combat", "hits", "hit", "splat", "health", "bar"}
)
public class C_b extends rs.p_s.C_a {
   @Inject
   private C_a b;

   @Provides
   C_a a(C_i var1) {
      return var1.a(C_a.class);
   }

   @Override
   public void a() {
      this.g();
   }

   @C_Subscribe_mc
   public void onConfigChanged(C_ConfigChanged_mc var1) {
      this.g();
   }

   private void g() {
      rs.p_h.C_c.a(() -> {
         rs.p_f.C_a.ap = this.b.f() == C_e.c;
         rs.p_f.C_a.al = this.b.g() == C_d.b;
         rs.p_f.C_a.aq = this.b.f() == C_e.a;
         rs.p_f.C_a.as = this.b.d() == C_c.b;
         rs.p_f.C_a.ar = this.b.c() == C_c.b;
         rs.p_f.C_a.aB = this.b.a();
         rs.p_f.C_a.at = this.b.b();
         rs.p_f.C_a.ak = this.b.h();
      });
   }

   public C_a f() {
      return this.b;
   }
}
