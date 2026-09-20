package rs.p_s.p_c;

import com.google.inject.Provides;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import javax.inject.Inject;
import rs.C_Client_mc;
import rs.p_A_uc.C_j;
import rs.p_e.C_i;
import rs.p_eventbus.C_Subscribe_mc;
import rs.p_gui.C_Launcher_mc;
import rs.p_runelite.p_events.C_ConfigChanged_mc;
import rs.p_ui.C_l;

@rs.p_s.C_e(
   a = "Developer Tools",
   b = "devtools",
   d = {"panel"},
   h = true
)
public class C_c extends rs.p_s.C_a {
   public static C_d b = null;
   public static HashMap<Integer, rs.p_n.p_d.C_c> c = new HashMap<>();
   @Inject
   private C_Client_mc h;
   @Inject
   private rs.p_ui.C_e i;
   @Inject
   private C_a j;
   @Inject
   private rs.p_g.p_a.C_b k;
   private C_e l;
   private C_b m;
   private C_f n;
   private C_l o;
   public static boolean d = false;
   public static boolean e = false;
   public static boolean f = false;
   public static boolean g = false;

   @Override
   protected void a() {
      b = new C_d();
      C_g var1 = (C_g)this.a.getInstance(C_g.class);
      this.l = (C_e)this.a.getInstance(C_e.class);
      this.m = (C_b)this.a.getInstance(C_b.class);
      this.n = (C_f)this.a.getInstance(C_f.class);
      this.k.a(this.m);
      BufferedImage var2 = C_j.b(this.getClass(), "devtools_icon.png");
      this.o = C_l.a().a("Developer Tools").a(var2).a(1).a(var1).a();
      this.i.a(this.o);
      rs.p_l.p_f.C_e.d().e().add(this.l);
      rs.p_l.p_f.C_e.d().a(this.m);
      rs.p_l.p_f.C_e.d().a(this.n);
      this.i();
      C_Launcher_mc.n().p().m().setAlwaysOnTop(this.j.e());
   }

   @Override
   protected void b() {
      this.i.b(this.o);
      rs.p_l.p_f.C_e.d().e().remove(this.l);
   }

   @C_Subscribe_mc
   public void onConfigChanged(C_ConfigChanged_mc var1) {
      this.i();
      if (var1.getKey().equalsIgnoreCase("showObjectIds")) {
         rs.p_h.C_c.a(() -> this.h.b());
      }

      if (var1.getKey().equalsIgnoreCase("alwaysOnTop")) {
         C_Launcher_mc.n().p().m().setAlwaysOnTop(this.j.e());
      }
   }

   @Provides
   C_a a(C_i var1) {
      return var1.a(C_a.class);
   }

   private void i() {
      d = this.j.d();
      e = this.j.a();
      f = this.j.b();
      g = this.j.k();
   }

   public C_e f() {
      return this.l;
   }

   public C_b g() {
      return this.m;
   }

   public C_f h() {
      return this.n;
   }
}
