package rs.p_p;

import com.google.c.l;
import com.google.c.r;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Names;
import java.awt.Color;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import rs.C_Client_mc;
import rs.p_A_uc.C_f;
import rs.p_A_uc.C_h;
import rs.p_e.C_i;
import rs.p_eventbus.C_DeferredEventBus_mc;
import rs.p_eventbus.C_EventBus_mc;
import rs.p_s.C_g;
import rs.p_y.C_c;

public class C_b extends AbstractModule {
   private static final l a = new r().a(Color.class, new C_f()).j();
   private final boolean b = rs.p_f.C_a.d;
   private final boolean c = false;

   protected void configure() {
      this.bindConstant().annotatedWith(Names.named("developerMode")).to(this.b);
      this.bindConstant().annotatedWith(Names.named("safeMode")).to(false);
      this.bind(rs.p_A_uc.C_a.class).toInstance(new rs.p_A_uc.C_a());
      this.bind(C_Client_mc.class).toInstance(new C_Client_mc());
      this.bind(ScheduledExecutorService.class).toInstance(new C_h(Executors.newSingleThreadScheduledExecutor()));
      this.bind(C_c.class);
      this.bind(C_g.class);
      this.bind(C_i.class);
      this.bind(l.class).toInstance(a);
      this.bind(l.class).toInstance(a);
      this.bind(C_EventBus_mc.class).toInstance(new C_EventBus_mc());
      this.bind(C_EventBus_mc.class).annotatedWith(Names.named("Deferred EventBus")).to(C_DeferredEventBus_mc.class);
   }

   @Provides
   @Singleton
   rs.p_s.C_h a(C_i var1) {
      return var1.a(rs.p_s.C_h.class);
   }
}
