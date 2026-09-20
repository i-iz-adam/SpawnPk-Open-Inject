package rs.p_s.p_h;

import com.google.inject.Provides;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
import javax.inject.Inject;
import rs.C_Client_mc;
import rs.p_A_uc.C_d;
import rs.p_e.C_i;
import rs.p_eventbus.C_Subscribe_mc;
import rs.p_runelite.p_events.C_ConfigChanged_mc;
import rs.p_runelite.p_events.C_SkillLevelChanged_mc;
import rs.p_s.C_e;
import rs.p_ui.p_a.C_c;
import rs.p_ui.p_a.C_f;
import rs.p_ui.p_a.C_h;
import rs.p_ui.p_a.C_j;

@C_e(
   a = "Timers / Info Boxes",
   b = "infoBoxes",
   i = true,
   d = {"potions", "boost", "buff", "skill"}
)
public class C_a extends rs.p_s.C_a {
   public static boolean b = true;
   public static final KeySetView<String, Boolean> c = ConcurrentHashMap.newKeySet();
   public static final KeySetView<String, Boolean> d = ConcurrentHashMap.newKeySet();
   public static int e = 5;
   @Inject
   private C_b f;
   @Inject
   private C_f g;
   @Inject
   private rs.p_A_uc.C_a h;

   @Provides
   C_b a(C_i var1) {
      return var1.a(C_b.class);
   }

   @Override
   public void a() {
      b = true;
      this.h();
   }

   @Override
   public void b() {
      b = false;
   }

   @C_Subscribe_mc
   public void onConfigChanged(C_ConfigChanged_mc var1) {
      this.h();
      if (var1.getKey().equalsIgnoreCase("infoBoxSize")) {
         this.h.a();
         this.g.c().values().forEach(var1x -> var1x.M().forEach(var1xx -> this.g.d(var1xx)));
      }

      if (var1.getKey().equalsIgnoreCase("counterTimeout")) {
         this.g.c().values().forEach(var1x -> var1x.M().forEach(var1xx -> {
               if (var1xx.q() > 0 && var1xx instanceof rs.p_ui.p_a.C_b) {
                  var1xx.c(this.f.h());
               }
            }));
      }
   }

   @C_Subscribe_mc
   public void onSkillLevelChanged(C_SkillLevelChanged_mc var1) {
      if (var1.getSkillId() == 0 || var1.getSkillId() == 2 || var1.getSkillId() == 4 || var1.getSkillId() == 1 || var1.getSkillId() == 6) {
         if (this.f.m()) {
            int var2 = var1.getSkillId();
            int var3 = var1.getCurrentLevel();
            int var4 = var1.getMaximumLevel();
            String var5 = rs.p_f.C_e.b[var1.getSkillId()];
            String var6 = var5.substring(0, 1).toUpperCase() + var5.substring(1) + " boost";
            if (var1.getCurrentLevel() == var1.getMaximumLevel()) {
               this.g.b(var6);
               if (this.g.c().get("Combat boosts") != null) {
                  List var10 = this.g.c().get("Combat boosts").M();
                  if (var10.size() == 1 && var10.get(0) instanceof C_j) {
                     this.g.b("Next buff change");
                  }
               }
            } else {
               C_d var7 = this.h.a("skills/" + var2, -1);
               C_c var8 = this.g.a(var6);
               if (var8 != null) {
                  ((rs.p_ui.p_a.C_a)var8).a(var3 - var4);
               } else {
                  rs.p_ui.p_a.C_a var9 = new rs.p_ui.p_a.C_a(var7, "Combat boosts", var6, var3 - var4, var2);
                  var9.a(rs.p_ui.p_a.C_e.b);
                  var9.a("@lre@" + var6);
                  this.g.b(var9);
               }

               this.g();
            }
         }
      }
   }

   private void g() {
      if (C_Client_mc.dx > 0) {
         C_d var1 = this.h.a("skills/1338", -1);
         C_c var2 = this.g.a("Next buff change");
         if (var2 != null) {
            ((C_j)var2).b(Duration.of((long)C_Client_mc.dx, ChronoUnit.SECONDS));
         } else {
            C_j var3 = new C_j((long)C_Client_mc.dx, ChronoUnit.SECONDS, var1, "Combat boosts", "Next buff change");
            var3.a("@lre@Next buff change");
            var3.a(C_h.d);
            this.g.b(var3);
         }
      }
   }

   private void h() {
      rs.p_h.C_c.a(() -> {
         this.i();
         e = this.f.h();
      });
   }

   private void i() {
      c.clear();
      d.clear();
      this.j();
      this.k();
   }

   private void j() {
      if (!this.f.g()) {
         c.add("Blood slayer");
      }

      if (!this.f.d()) {
         c.add("DFS Cooldown");
      }

      if (!this.f.e()) {
         c.add("Freeze timer");
      }

      if (!this.f.a()) {
         c.add("Antifire");
      }

      if (!this.f.b()) {
         c.add("Antipoison");
      }

      if (!this.f.c()) {
         c.add("Antivenom");
      }

      if (!this.f.f()) {
         c.add("Teleport block");
      }

      if (!this.f.n()) {
         c.add("Next buff change");
      }

      if (!this.f.i()) {
         c.add("Slayer task");
         c.add("Blood slayer task");
         c.add("Slayer task (normal)");
      }

      if (!this.f.k()) {
         c.add("Soul hunter task");
      }

      if (!this.f.m()) {
         c.add("Ranged boost");
         c.add("Magic boost");
         c.add("Attack boost");
         c.add("Defence boost");
         c.add("Strength boost");
      }

      if (!this.f.k()) {
         c.add("Soul hunter task");
      }

      if (!this.f.j()) {
         c.add("Task scroll (primary)");
         c.add("Task scroll (secondary)");
         c.add("Task scroll (req. #1)");
         c.add("Task scroll (req. #2)");
      }

      if (!this.f.o()) {
         d.add("raid_affs");
      }
   }

   private void k() {
      if (!this.f.l()) {
         d.add("Wanderer");
      }
   }

   public C_b f() {
      return this.f;
   }
}
