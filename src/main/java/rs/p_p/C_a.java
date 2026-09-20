package rs.p_p;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;
import java.io.File;
import javax.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.C_Client_mc;
import rs.p_A_uc.C_q;
import rs.p_e.C_i;
import rs.p_eventbus.C_EventBus_mc;
import rs.p_gui.C_Launcher_mc;
import rs.p_s.C_g;
import rs.p_ui.C_f;
import rs.p_y.C_c;

@Singleton
public class C_a {
   private static final Logger d = LoggerFactory.getLogger(C_a.class);
   public static final File a = new File(System.getProperty("user.home"), ".spawnpk-data");
   public static final File b = new File(a, "plugins");
   public static final File c = new File(a, "screenshots");
   private static Injector e;
   @Inject
   private C_g f;
   @Inject
   private C_EventBus_mc g;
   @Inject
   private C_c h;
   @Inject
   private C_f i;
   @Inject
   private C_i j;
   @Inject
   private C_Client_mc k;

   public static void a() {
      e = Guice.createInjector(new Module[]{new C_b()});
      C_Launcher_mc.a((C_Launcher_mc)e.getInstance(C_Launcher_mc.class));

      try {
         ((C_a)e.getInstance(C_a.class)).b();
      } catch (Exception var1) {
         throw new RuntimeException(var1);
      }
   }

   public void b() {
      this.j.a();
      this.f.b();
      this.f.b(null);
      this.i.a();
      this.g.register(this.i);
      this.g.register(this.f);
      this.g.register(this.j);
      this.f.a();
      this.i.b();
      C_q.a(e);
      C_q.a();
   }

   public static Injector c() {
      return e;
   }

   public C_Client_mc d() {
      return this.k;
   }
}
