package rs.p_ui.p_a;

import com.google.a.b.V;
import com.google.a.b.as;
import com.google.a.d.ag;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.apache.commons.text.WordUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.C_Client_mc;
import rs.p_eventbus.C_EventBus_mc;
import rs.p_eventbus.C_Subscribe_mc;
import rs.p_runelite.p_events.C_GameStateChanged_mc;
import rs.p_runelite.p_events.C_MenuHover_mc;

@Singleton
public class C_f {
   private static final Logger c = LoggerFactory.getLogger(C_f.class);
   public static final String a = "Default Group";
   public static final String b = "InfoBoxOverlay";
   private static final String d = "infoboxgroup";
   private static final String e = "infoboxoverlay";
   private static final String f = "orient_";
   private static final String g = "Detach InfoBox";
   private static final String h = "Flip";
   private static final String i = "Delete";
   private static final rs.p_l.p_f.C_f j = new rs.p_l.p_f.C_f(1504, "Detach InfoBox", "InfoBox");
   private static final rs.p_l.p_f.C_f k = new rs.p_l.p_f.C_f(1504, "Flip", "InfoBox Group");
   private static final rs.p_l.p_f.C_f l = new rs.p_l.p_f.C_f(1504, "Delete", "InfoBox Group");
   private final Map<String, C_g> m = new ConcurrentHashMap<>();
   private final C_Client_mc n;
   private final C_EventBus_mc o;
   private final rs.p_e.C_i p;
   private final rs.p_l.p_f.C_e q;
   private final rs.p_s.C_h r;
   private final rs.p_j.p_b.C_d s;
   private final rs.p_s.p_h.C_b t;
   private C_c u;

   @Inject
   private C_f(C_Client_mc var1, C_EventBus_mc var2, rs.p_e.C_i var3, rs.p_l.p_f.C_e var4, rs.p_s.C_h var5, rs.p_j.p_b.C_d var6) {
      this.n = var1;
      this.o = var2;
      this.p = var3;
      this.q = var4;
      this.r = var5;
      this.t = var3.a(rs.p_s.p_h.C_b.class);
      this.s = var6;
      var2.register(this);
   }

   public C_c a(String var1) {
      return this.m.values().stream().flatMap(var0 -> var0.M().stream()).filter(var1x -> var1x.h().equals(var1)).findFirst().orElse(null);
   }

   public void b(String var1) {
      this.m.values().forEach(var1x -> var1x.M().removeIf(var1xx -> var1xx.h().equals(var1)));
   }

   @C_Subscribe_mc
   private void onGameStateChanged(C_GameStateChanged_mc var1) {
      if (var1.getGameState() == rs.p_runelite.p_a.C_c.c) {
         this.m.clear();
      }
   }

   @C_Subscribe_mc
   private void onMenuHover(C_MenuHover_mc var1) {
      if (this.u != null) {
         this.a(this.u);
      }

      this.u = null;
   }

   public boolean a(C_c var1) {
      if (!C_Client_mc.ag) {
         return false;
      } else if (C_Client_mc.dj) {
         return false;
      } else {
         String var2 = this.e(var1.j());
         C_g var3 = this.m.get(var1.j());
         boolean var4 = var1.j().equals(var1.i());
         if (var3.M().size() > 1) {
            this.s.b("Detach InfoBox", () -> {
               if (var1.j().equalsIgnoreCase(var1.i())) {
                  this.a(var1.h() + "_cust_" + System.currentTimeMillis(), var1);
               } else {
                  String var2x = var1.j();
                  this.a(var1, var1.i());
                  var1.a = var1.i();
                  this.m.get(var2x).M().remove(var1);
                  C_g var3x = this.m.computeIfAbsent(var1.i(), this::f);
                  var3x.M().add(var1);
               }
            });
         }

         this.s.a("Flip InfoBox Group \"" + var2 + "\"", () -> {
            rs.p_ui.p_components.C_e var2x = var3.L();
            this.a(var3.K(), var2x);
         });
         HashSet var5 = new HashSet();

         for (C_c var7 : var3.M()) {
            if (!var7.i().equals(var1.j())) {
               var5.add(var7.i());
            }
         }

         if (var5.size() > 0) {
            for (String var9 : var5) {
               this.s.c("Unmerge InfoBox Group \"" + this.e(var9) + "\"", () -> {
                  ArrayList var4x = new ArrayList();
                  C_g var5x = this.m.computeIfAbsent(var9, this::f);

                  for (C_c var7x : this.m.get(var1.j()).M()) {
                     if (var7x.i().equals(var9)) {
                        var4x.add(var7x);
                     }
                  }

                  for (C_c var9x : var4x) {
                     var3.M().remove(var9x);
                     var9x.a = var9;
                     this.a(var9x, var9);
                     var5x.M().add(var9x);
                  }
               });
            }
         }

         if (this.f(var1) && !var4) {
            this.s.b("Delete InfoBox Group \"" + var2 + "\"", () -> {
               if (!var4) {
                  C_g var4x = this.m.computeIfAbsent(var1.i(), this::f);
                  if (var3 != var4x) {
                     this.a(var3, var4x);
                  }
               }
            });
         }

         return true;
      }
   }

   public void b(C_c var1) {
      V.a(var1);
      c.debug("Adding InfoBox {}", var1);
      this.d(var1);
      String var2 = this.g(var1);
      C_g var3 = this.m.computeIfAbsent(var2, this::f);
      List var4 = var1.o();
      var1.a = var2;
      if (var1 instanceof C_b) {
         var1.a(Instant.now());
         var1.c(this.t.h());
      }

      var4.add(j);
      var4.add(k);
      if (this.f(var1)) {
         var4.add(l);
      }

      synchronized (this) {
         int var6 = a(var3.M(), var1, (var0, var1x) -> ag.a().a(var0.m(), var1x.m()).a(var0.j(), var1x.j()).b());
         var3.M().add(var6, var1);
      }

      BufferedImage var5 = var1.k();
      this.d(var1);
      if (var5 instanceof rs.p_A_uc.C_d) {
         rs.p_A_uc.C_d var9 = (rs.p_A_uc.C_d)var5;
         var9.a(() -> this.d(var1));
      }
   }

   private String e(String var1) {
      if (var1.equals("InfoBoxOverlay")) {
         return "Default Group";
      } else {
         return var1.contains("_cust_") ? "(Custom)" : WordUtils.capitalize(var1);
      }
   }

   private boolean f(C_c var1) {
      return !var1.j().equals(var1.i()) && !var1.j().equals("InfoBoxOverlay") && var1.j().contains("_cust_");
   }

   public synchronized void c(C_c var1) {
      if (var1 != null && var1.j() != null) {
         if (this.m.get(var1.j()).M().remove(var1)) {
            c.debug("Removed InfoBox {}", var1);
         }

         var1.o().remove(j);
         var1.o().remove(k);
         var1.o().remove(l);
      }
   }

   public synchronized void a(Predicate<C_c> var1) {
      for (C_g var3 : this.m.values()) {
         if (var3.M().removeIf(var1)) {
            c.debug("Removed InfoBoxes for filter {} from {}", var1, var3);
         }
      }
   }

   public List<C_c> a() {
      return this.m.values().stream().map(C_g::M).flatMap(Collection::stream).collect(Collectors.toList());
   }

   public synchronized void b() {
      this.m.values().forEach(var0 -> var0.M().removeIf(C_c::f));
   }

   public void d(C_c var1) {
      if (var1.k() != null) {
         BufferedImage var2 = var1.k();
         BufferedImage var3 = var2;
         double var4 = (double)var2.getWidth(null);
         double var6 = (double)var2.getHeight(null);
         double var8 = this.a(var1.p() == C_e.b);
         if (var8 < var4 || var8 < var6) {
            double var10 = var8 / var4;
            double var12 = var8 / var6;
            if (var10 == 1.0 && var12 == 1.0) {
               return;
            }

            double var14 = Math.min(var10, var12);
            int var16 = (int)(var4 * var14);
            int var17 = (int)(var6 * var14);
            BufferedImage var18 = new BufferedImage(var16, var17, 2);
            Graphics2D var19 = var18.createGraphics();
            var19.drawImage(var2, 0, 0, var16, var17, null);
            var19.dispose();
            var3 = var18;
         }

         var1.b(var3);
      }
   }

   public double a(boolean var1) {
      return !var1 ? (double)Math.max(2, Math.max(this.t.q() - 2, 16)) : (double)Math.max(2, this.t.q());
   }

   private C_g f(String var1) {
      rs.p_ui.p_components.C_e var2 = this.c(var1);
      if (var2 == null) {
         if (var1.equals("InfoBoxOverlay")) {
            var2 = this.t.p() ? rs.p_ui.p_components.C_e.b : rs.p_ui.p_components.C_e.a;
            this.a(var1, var2);
         } else {
            var2 = rs.p_ui.p_components.C_e.a;
         }
      }

      C_g var3 = new C_g(this, this.n, this.o, var1, this.t, var2);
      this.q.a(var3);
      this.o.register(var3);
      return var3;
   }

   private void a(C_g var1) {
      this.o.unregister(var1);
      this.q.b(var1);
      this.m.remove(var1.K());
   }

   private synchronized void a(String var1, C_c var2) {
      String var3 = var2.j();
      C_g var4 = this.m.get(var2.j());
      Collection var5 = var4.M().stream().filter(var1x -> var1x.h().equals(var2.h())).collect(Collectors.toList());
      var4.M().removeAll(var5);
      if (var4.M().isEmpty()) {
         c.debug("Deleted layer: {}", var4.K());
         this.d(var4.K());
         this.a(var4);
      }

      C_g var6 = this.m.computeIfAbsent(var1, this::f);
      var6.M().addAll(var5);

      for (C_c var8 : var5) {
         this.a(var8, var1);
         var8.a = var1;
         if (!var8.o().contains(l)) {
            var8.o().add(l);
         }
      }

      c.debug("Moving infobox named {} (layer {}) to layer {}: {} boxes", new Object[]{var2.h(), var3, var1, var5.size()});
   }

   public synchronized void a(C_g var1, C_g var2) {
      List var3 = var1.M();
      boolean var4 = var2.K().equals("InfoBoxOverlay");
      c.debug("Merging InfoBoxes from {} into {} ({} boxes)", new Object[]{var1.K(), var2.K(), var3.size()});

      for (C_c var6 : var3) {
         this.a(var6, var2.K());
         var6.a = var2.K();
         if (var4) {
            var6.o().remove(l);
         }
      }

      var2.M().addAll(var3);
      var1.M().clear();
      this.d(var1.K());
      this.a(var1);
      c.debug("Deleted layer: {}", var1.K());
   }

   private String g(C_c var1) {
      String var2 = this.p.a("infoboxgroup", var1.h());
      return as.c(var2) ? var1.j() : var2;
   }

   private void a(C_c var1, String var2) {
      if (!var2.equals("InfoBoxOverlay") && !var2.equals(var1.i())) {
         this.p.b("infoboxgroup", var1.h(), var2);
      } else {
         this.p.b("infoboxgroup", var1.h());
      }
   }

   rs.p_ui.p_components.C_e c(String var1) {
      return this.p.a("infoboxoverlay", "orient_" + var1, rs.p_ui.p_components.C_e.class);
   }

   void a(String var1, rs.p_ui.p_components.C_e var2) {
      this.p.a("infoboxoverlay", "orient_" + var1, var2);
   }

   void d(String var1) {
      this.p.b("infoboxoverlay", "orient_" + var1);
   }

   private static <T> int a(List<? extends T> var0, T var1, Comparator<? super T> var2) {
      int var3 = Collections.binarySearch(var0, var1, var2);
      if (var3 < 0) {
         return -var3 - 1;
      } else {
         for (int var4 = var3 + 1; var4 < var0.size(); var4++) {
            Object var5 = var0.get(var4);
            int var6 = var2.compare(var5, var1);
            if (var6 > 0) {
               return var4;
            }
         }

         return var0.size();
      }
   }

   public Map<String, C_g> c() {
      return this.m;
   }

   public void e(C_c var1) {
      this.u = var1;
   }
}
