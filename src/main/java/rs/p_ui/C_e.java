package rs.p_ui;

import java.util.HashSet;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import rs.p_eventbus.C_EventBus_mc;
import rs.p_runelite.p_events.C_NavigationButtonAdded_mc;
import rs.p_runelite.p_events.C_NavigationButtonRemoved_mc;

@Singleton
public class C_e {
   private final C_EventBus_mc a;
   private final Set<C_l> b = new HashSet<>();

   @Inject
   private C_e(C_EventBus_mc var1) {
      this.a = var1;
   }

   public void a(C_l var1) {
      if (!this.b.contains(var1)) {
         if (this.b.add(var1)) {
            this.a.post(new C_NavigationButtonAdded_mc(var1));
         }
      }
   }

   public void b(C_l var1) {
      if (this.b.remove(var1)) {
         this.a.post(new C_NavigationButtonRemoved_mc(var1));
      }
   }
}
