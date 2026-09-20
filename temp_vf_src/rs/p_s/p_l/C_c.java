package rs.p_s.p_l;

import com.google.a.b.as;
import com.google.a.d.ch;
import com.google.inject.Provides;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import rs.C_Client_mc;
import rs.p_a.C_j;
import rs.p_d.C_k;
import rs.p_e.C_i;
import rs.p_eventbus.C_Subscribe_mc;
import rs.p_gui.C_Launcher_mc;
import rs.p_j.p_b.C_d;
import rs.p_runelite.p_a.C_g;
import rs.p_runelite.p_events.C_MenuHover_mc;
import rs.p_runelite.p_events.C_MenuOpened_mc;
import rs.p_s.C_e;

@C_e(
   a = "Menu Entry Swapper",
   b = "menuSwapper",
   c = "Change the default option that is displayed when hovering over objects",
   d = {"npcs", "inventory", "items", "objects"},
   f = false
)
public class C_c extends rs.p_s.C_a {
   public static boolean b = false;
   private static final String c = "shiftclick";
   private static final String d = "item_";
   private static final String e = "object_";
   private static final String f = "object_shift_";
   private static final String g = "npc_";
   private static final String h = "npc_shift_";
   private static final String i = "wornitem_";
   private static final String j = "wornitem_shift_";
   @Inject
   private C_i k;
   @Inject
   private C_d l;
   @Inject
   private C_b m;
   @Inject
   private C_Client_mc n;
   private final C_a o = (var0, var1) -> C_g.e(var1) == var0;
   private Map<Integer, Integer> p = new HashMap<>();
   private Map<Integer, Integer> q = new HashMap<>();
   private final C_a r = (var0, var1) -> C_Launcher_mc.n().o().eJ[var1] == var0;
   private Map<Integer, Integer> s = new HashMap<>();
   private Map<Integer, Integer> t = new HashMap<>();
   private final C_a u = (var0, var1) -> C_Launcher_mc.n().o().eH[var1] == var0;
   private Map<Integer, Integer> v = new HashMap<>();
   private Map<Integer, Integer> w = new HashMap<>();
   private static final List<Integer> x = ch.a(20, 412, 225, 965, 478);
   private static final List<Integer> y = ch.a(74, 454, 539, 493, 847);

   @Provides
   C_b a(C_i var1) {
      return var1.a(C_b.class);
   }

   @Override
   protected void a() {
      rs.p_h.C_c.a(() -> b = true);
   }

   @Override
   protected void b() {
      rs.p_h.C_c.a(() -> b = false);
   }

   @C_Subscribe_mc
   public void onMenuHover(C_MenuHover_mc var1) {
      if (this.n.eV - 1 > 0) {
         int var2 = this.n.eV - 1;
         int var3 = this.n.eI[var2];
         if (C_g.a(var3)) {
            C_j var4 = C_g.f(var2);
            if (var4 != null) {
               Integer var5 = this.a(this.i(), var4.n());
               if (var5 != null && var5 == 516) {
                  for (int var6 = 0; var6 < this.n.eV; var6++) {
                     if (C_g.f(var6) != null && C_g.e(var6) != var4.n() && this.n.eI[var6] == var3) {
                        C_d.a(var2, var6);
                        return;
                     }
                  }
               }

               if (var5 != null && var5 != -1) {
                  this.a(this.o, var4.n(), var5);
               }
            }
         } else if (!C_g.c(var3) && C_g.d(var3)) {
            int var7 = this.n.eJ[var2];
            Integer var8 = this.b(this.i(), var7);
            if (rs.p_f.C_a.aC && this.i() && var8 == -1) {
               var8 = 847;
            }

            if (var8 != null && var8 != -1) {
               this.a(this.r, var7, var8);
            }
         }
      }
   }

   @C_Subscribe_mc
   public void onMenuOpened(C_MenuOpened_mc var1) {
      this.f();
      this.g();
   }

   private void f() {
      if (this.i() && this.m.c()) {
         for (int var1 = this.n.eV - 1; var1 >= 0; var1--) {
            int var2 = this.n.eI[var1];
            if (var2 == 1025) {
               C_j var3 = C_g.f(var1);
               if (var3 != null && var3.aG != null) {
                  rs.p_d.C_d var4 = rs.p_d.C_d.c(var3.n());
                  if (var4 != null && var4.o != null) {
                     rs.p_j.p_b.C_a var5 = this.l.a("Swap left click", this.l.c("Swap left click @yel@" + var4.o, () -> {
                     }));
                     rs.p_j.p_b.C_a var6 = this.l.a("Swap shift click", this.l.c("Swap shift click @yel@" + var4.o, () -> {
                     }));
                     int var7 = this.a(false, var3.n());
                     int var8 = this.a(true, var3.n());
                     if (var7 != -1) {
                        var5.a("Reset", () -> this.c(false, var3.n()));
                     }

                     if (var8 != -1) {
                        var6.a("Reset", () -> this.c(true, var3.n()));
                     }

                     var5.a("Walk here", () -> this.a(false, var3.n(), 516));
                     var6.a("Walk here", () -> this.a(true, var3.n(), 516));

                     for (int var9 = 0; var9 < var4.p.length; var9++) {
                        String var10 = var4.p[var9];
                        int var11 = var9;
                        if (!as.c(var10) && !var10.equalsIgnoreCase("Attack") && var8 != x.get(var9) && var7 != x.get(var9) && var9 != 0) {
                           var5.a(var10, () -> this.a(false, var3.n(), x.get(var11)));
                           var6.a(var10, () -> this.a(true, var3.n(), x.get(var11)));
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void g() {
      if (this.i() && (this.m.a() || this.m.b())) {
         for (int var1 = this.n.eV - 1; var1 >= 0; var1--) {
            int var2 = this.n.eI[var1];
            if (var2 == 1125) {
               int var3 = this.n.eJ[var1];
               C_k var4 = C_k.f(var3);
               if (var4 != null && var4.w != null) {
                  int var5 = this.b(false, var3);
                  int var6 = this.b(true, var3);
                  rs.p_j.p_b.C_a var7 = this.m.a() ? this.l.a(var4.x + " left click", this.l.c("Swap left click @lre@" + var4.x, () -> {
                  })) : null;
                  rs.p_j.p_b.C_a var8 = this.m.b() ? this.l.a(var4.x + " shift click", this.l.c("Swap shift click @lre@" + var4.x, () -> {
                  })) : null;
                  if (var5 != -1 && this.m.a()) {
                     var7.a("Reset", () -> this.d(false, var3));
                  }

                  if (var6 != -1 && this.m.b()) {
                     var8.a("Reset", () -> this.d(true, var3));
                  }

                  for (int var9 = 0; var9 < var4.L.length; var9++) {
                     String var10 = var4.L[var9];
                     int var11 = var9;
                     if (var6 != y.get(var9) && var5 != y.get(var9) && var9 != 0 && !as.c(var10)) {
                        if (this.m.a() && y.get(var9) != 454) {
                           var7.a(var10, () -> this.b(false, var3, y.get(var11)));
                        }

                        if (this.m.b()) {
                           var8.a(var10, () -> this.b(true, var3, y.get(var11)));
                        }
                     }
                  }

                  if (this.m.a() && var5 != 447) {
                     var7.a("Use", () -> this.b(false, var3, 447));
                  }

                  if (this.m.b() && var6 != 447) {
                     var8.a("Use", () -> this.b(true, var3, 447));
                  }
               }
            }
         }
      }
   }

   private void a(C_a var1, int var2, int var3) {
      int var4 = this.n.eV - 1;
      int var5 = -1;

      for (int var6 = 0; var6 < this.n.eV; var6++) {
         int var7 = this.n.eI[var6];
         if ((var3 == 516 || var1.isMatchingEntity(var2, var6)) && var7 == var3) {
            var5 = var6;
            break;
         }
      }

      if (var5 != -1 && var4 != -1) {
         C_d.a(var5, var4);
      }
   }

   private void h() {
   }

   private boolean i() {
      return C_Client_mc.ag;
   }

   private Integer a(boolean var1, int var2) {
      Map var3 = var1 ? this.q : this.p;
      if (var3.containsKey(var2)) {
         return (Integer)var3.get(var2);
      } else {
         String var4 = this.k.a("menuentryswapper", (var1 ? "npc_shift_" : "npc_") + var2);
         if (var4 != null && !var4.isEmpty()) {
            int var5 = Integer.parseInt(var4);
            var3.put(var2, var5);
            return var5;
         } else {
            return -1;
         }
      }
   }

   private Integer b(boolean var1, int var2) {
      Map var3 = var1 ? this.t : this.s;
      if (var3.containsKey(var2)) {
         return (Integer)var3.get(var2);
      } else {
         String var4 = this.k.a(var1 ? "shiftclick" : "menuentryswapper", "item_" + var2);
         return var4 != null && !var4.isEmpty() ? Integer.parseInt(var4) : -1;
      }
   }

   private void a(boolean var1, int var2, int var3) {
      if (var2 != -1) {
         (var1 ? this.q : this.p).put(var2, var3);
         this.k.a("menuentryswapper", (var1 ? "npc_shift_" : "npc_") + var2, var3);
      }
   }

   private void c(boolean var1, int var2) {
      if (var2 != -1) {
         (var1 ? this.q : this.p).remove(var2);
         this.k.b("menuentryswapper", (var1 ? "npc_shift_" : "npc_") + var2);
      }
   }

   private void b(boolean var1, int var2, int var3) {
      (var1 ? this.t : this.s).put(var2, var3);
      this.k.a(var1 ? "shiftclick" : "menuentryswapper", "item_" + var2, var3);
   }

   private void d(boolean var1, int var2) {
      (var1 ? this.t : this.s).remove(var2);
      this.k.b(var1 ? "shiftclick" : "menuentryswapper", "item_" + var2);
   }
}
