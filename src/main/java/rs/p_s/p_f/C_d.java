package rs.p_s.p_f;

import com.google.a.b.as;
import com.google.c.l;
import com.google.inject.Provides;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import javax.inject.Inject;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.C_Client_mc;
import rs.p_A_uc.C_g;
import rs.p_e.C_i;
import rs.p_eventbus.C_Subscribe_mc;
import rs.p_gui.C_Launcher_mc;
import rs.p_runelite.p_a.C_p;
import rs.p_runelite.p_events.C_GameStateChanged_mc;
import rs.p_runelite.p_events.C_MenuHover_mc;
import rs.p_ui.p_components.p_a.C_q;

@rs.p_s.C_e(
   a = "Ground Markers",
   b = "groundmarkers",
   c = "Enable marking of tiles using the Shift key",
   d = {"overlay", "tiles"},
   f = false
)
public class C_d extends rs.p_s.C_a {
   private static final Logger b = LoggerFactory.getLogger(C_d.class);
   private static final String c = "groundMarker";
   private static final String d = "region_";
   private final CopyOnWriteArrayList<C_a> e = new CopyOnWriteArrayList<>();
   @Inject
   private C_b f;
   @Inject
   private rs.p_j.p_a.C_b g;
   @Inject
   private rs.p_j.p_b.C_d h;
   @Inject
   private C_i i;
   @Inject
   private C_c j;
   @Inject
   private C_Client_mc k;
   @Inject
   private l l;
   @Inject
   private rs.p_ui.p_components.p_a.C_d m;

   @Override
   public void a() {
      rs.p_l.p_f.C_e.d().a(this.j);
      this.f();
   }

   @Override
   public void b() {
      rs.p_l.p_f.C_e.d().b(this.j);
      this.e.clear();
   }

   @C_Subscribe_mc
   private void onGameStateChanged(C_GameStateChanged_mc var1) {
      if (var1.getGameState() == rs.p_runelite.p_a.C_c.g || var1.getGameState() == rs.p_runelite.p_a.C_c.f) {
         this.f();
      }
   }

   @C_Subscribe_mc
   private void onMenuHover(C_MenuHover_mc var1) {
      if (!C_Client_mc.dj) {
         if (C_Client_mc.ag && var1.getMenuId() == 516) {
            rs.p_runelite.p_a.C_f var2 = this.k.aG();
            if (var2 == null) {
               return;
            }

            C_p var3 = C_p.a(this.k.aG());
            rs.p_runelite.p_a.C_f var4 = this.k.aG();
            int var5 = var3.b();
            Collection var6 = this.a(var5);
            Optional var7 = var6.stream().filter(var1x -> var1x.b() == var3.c() && var1x.c() == var3.d() && var1x.d() == var3.g()).findFirst();
            if (var4 == null) {
               return;
            }

            if (var7.isPresent()) {
               int[] var8 = this.k.fR;
               C_f var9 = (C_f)var7.get();
               this.h.b("<img=288> <img=138> Reset all", () -> this.a(var8));
               this.h.b("<img=283> Label", () -> this.a(var9));
               int var10 = this.h.b("<img=326> Color", () -> {
               });
               rs.p_j.p_b.C_a var11 = this.h.b(var10);
               var11.a("Reset color", () -> this.a(var9, this.f.a()));
               var11.a("Pick color", () -> {
                  Color var2x = var9.e();
                  SwingUtilities.invokeLater(() -> {
                     C_q var3x = this.m.a(SwingUtilities.windowForComponent(this.k), var2x, "Tile marker color", false);
                     var3x.b(var2xxx -> this.a(var9, var2xxx));
                     var3x.setLocationRelativeTo(this.k);
                     var3x.setVisible(true);
                  });
               });

               for (Color var14 : this.e.stream().map(C_a::b).distinct().collect(Collectors.toList())) {
                  if (!var14.equals(var9.e())) {
                     var11.a(C_g.a("Color", var14), () -> this.a(var9, var14));
                  }
               }

               this.h.b("<img=25> Unmark", () -> SwingUtilities.invokeLater(() -> this.a(var4)));
            } else {
               this.h.b("Mark", () -> SwingUtilities.invokeLater(() -> this.a(var4)));
            }
         }
      }
   }

   void a(int var1, Collection<C_f> var2) {
      if (var2 != null && !var2.isEmpty()) {
         String var3 = this.l.b(var2);
         this.i.b("groundMarker", "region_" + var1, var3);
      } else {
         this.i.b("groundMarker", "region_" + var1);
      }
   }

   Collection<C_f> a(int var1) {
      String var2 = this.i.a("groundMarker", "region_" + var1);
      return (Collection<C_f>)(as.c(var2) ? Collections.emptyList() : (Collection)this.l.a(var2, new C_e(this).b()));
   }

   @Provides
   C_b a(C_i var1) {
      return var1.a(C_b.class);
   }

   void f() {
      this.e.clear();
      int[] var1 = this.k.fR;
      if (var1 != null) {
         for (int var5 : var1) {
            b.debug("Loading points for region {}", var5);
            Collection var6 = this.a(var5);
            Collection var7 = this.a(var6);
            this.e.addAll(var7);
         }
      }
   }

   private Collection<C_a> a(Collection<C_f> var1) {
      return var1.isEmpty()
         ? Collections.emptyList()
         : var1.stream().map(var0 -> new C_a(C_p.a(var0.a(), var0.b(), var0.c(), var0.d()), var0.e(), var0.f())).flatMap(var0 -> {
            Collection var1x = C_p.c(var0.a());
            return var1x.stream().map(var1xx -> new C_a(var1xx, var0.b(), var0.c()));
         }).collect(Collectors.toList());
   }

   private void a(rs.p_runelite.p_a.C_f var1) {
      if (var1 != null) {
         C_p var2 = C_p.a(var1);
         int var3 = var2.b();
         C_f var4 = new C_f(var3, var2.c(), var2.d(), var2.g(), this.f.a(), null);
         b.debug("Updating point: {} - {}", var4, var2);
         ArrayList var5 = new ArrayList<>(this.a(var3));
         if (var5.contains(var4)) {
            var5.remove(var4);
         } else {
            var5.add(var4);
         }

         this.a(var3, var5);
         this.f();
      }
   }

   private void a(C_f var1, Color var2) {
      C_f var3 = new C_f(var1.a(), var1.b(), var1.c(), var1.d(), var2, var1.f());
      ArrayList var4 = new ArrayList<>(this.a(var1.a()));
      var4.remove(var3);
      var4.add(var3);
      this.a(var1.a(), var4);
      this.f();
   }

   private void a(C_f var1) {
      this.g.a("Tile label").b(Optional.ofNullable(var1.f()).orElse("")).a(var2 -> {
         var2 = as.b(var2);
         C_f var3 = new C_f(var1.a(), var1.b(), var1.c(), var1.d(), var1.e(), var2);
         ArrayList var4 = new ArrayList<>(this.a(var1.a()));
         var4.remove(var1);
         var4.add(var3);
         this.a(var1.a(), var4);
         this.f();
      }).a();
   }

   private void a(int[] var1) {
      if (var1 != null) {
         long var2 = Arrays.stream(var1).mapToLong(var1x -> (long)this.a(var1x).size()).sum();
         if (var2 != 0L) {
            SwingUtilities.invokeLater(() -> {
               int var2x = JOptionPane.showConfirmDialog(C_Launcher_mc.n().i(), "Are you sure you want to reset all markers in this area?", "Warning", 0);
               if (var2x == 0) {
                  for (int var6 : var1) {
                     this.a(var6, null);
                  }

                  this.f();
               }
            });
         }
      }
   }

   CopyOnWriteArrayList<C_a> g() {
      return this.e;
   }
}
