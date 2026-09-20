package rs.p_s.p_o;

import com.google.a.a.d;
import com.google.a.b.L;
import com.google.inject.Provides;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.swing.SwingUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.C_Client_mc;
import rs.p_A_uc.C_s;
import rs.p_A_uc.C_t;
import rs.p_a.C_j;
import rs.p_e.C_i;
import rs.p_eventbus.C_Subscribe_mc;
import rs.p_runelite.p_a.C_g;
import rs.p_runelite.p_events.C_ConfigChanged_mc;
import rs.p_runelite.p_events.C_GameStateChanged_mc;
import rs.p_runelite.p_events.C_MenuHover_mc;
import rs.p_runelite.p_events.C_NpcSpawned_mc;

@rs.p_s.C_e(
   a = "NPC Indicators",
   c = "Highlight NPCs on-screen",
   d = {"highlight", "minimap", "npcs", "overlay", "respawn", "tags"}
)
public class C_e extends rs.p_s.C_a {
   private static final Logger b = LoggerFactory.getLogger(C_e.class);
   private static final int c = 15;
   private static final String d = "Tag";
   private static final String e = "Un-tag";
   private static final String f = "Tag-All";
   private static final String g = "Un-tag-All";
   private static final String h = "hull";
   private static final String i = "tile";
   private static final String j = "truetile";
   private static final String k = "swtile";
   private static final String l = "swtruetile";
   private static final String m = "outline";
   @Inject
   private C_Client_mc n;
   @Inject
   private C_d o;
   @Inject
   private C_c p;
   @Inject
   private C_i q;
   @Inject
   private rs.p_ui.p_components.p_a.C_d r;
   @Inject
   private rs.p_j.p_b.C_d s;
   private final Map<C_j, C_a> t = new HashMap<>();
   private List<String> u = new ArrayList<>();

   @Provides
   C_d a(C_i var1) {
      return var1.a(C_d.class);
   }

   @Override
   protected void a() {
      rs.p_h.C_c.a(() -> {
         rs.p_l.p_f.C_e.d().a(this.p);
         this.g();
      });
   }

   @Override
   protected void b() {
      rs.p_h.C_c.a(() -> {
         rs.p_l.p_f.C_e.d().b(this.p);
         this.t.clear();
      });
   }

   @C_Subscribe_mc
   public void onConfigChanged(C_ConfigChanged_mc var1) {
      if (var1.getGroup().equals("npcindicators")) {
         boolean var2 = this.o.n();
         rs.p_h.C_c.a(() -> C_c.i = var2);
         rs.p_h.C_c.a(this::g);
      }
   }

   @C_Subscribe_mc
   private void onGameStateChanged(C_GameStateChanged_mc var1) {
      if (var1.getGameState() == rs.p_runelite.p_a.C_c.f || var1.getGameState() == rs.p_runelite.p_a.C_c.c) {
         this.g();
      }
   }

   @C_Subscribe_mc
   private void onNpcSpawned(C_NpcSpawned_mc var1) {
      C_j var2 = var1.getNpc();
      if (var2.o() != null) {
         if (this.a(var2.o())) {
            C_a var3 = this.c(var2);
            this.t.put(var2, var3);
         }
      }
   }

   @C_Subscribe_mc
   private void onMenuHover(C_MenuHover_mc var1) {
      if (!C_Client_mc.dj) {
         if (C_g.a(var1.getMenuId())) {
            if (C_Client_mc.ag) {
               int var2 = this.n.eJ[var1.getRow()];
               if (var2 >= 0 && var2 < this.n.cA.length) {
                  C_j var3 = this.n.cA[var2];
                  if (var3 != null) {
                     boolean var4 = this.a(var3) != null;
                     this.s.c(var4 ? "<img=360> <img=25> Untag-All @yel@" + var3.o() : "<img=360> Tag-All @yel@" + var3.o(), () -> this.b(var3));
                     if (var4) {
                        int var5 = this.s.c("<img=360> <img=326> Tag color", () -> System.out.println("Change color"));
                        this.s
                           .b(var5)
                           .a("<img=78> Reset", () -> this.a(var3.n()))
                           .a("@mag@Magenta", () -> this.a(var3.n(), Color.MAGENTA))
                           .a("@yel@Yellow", () -> this.a(var3.n(), Color.YELLOW))
                           .a("@gre@Green", () -> this.a(var3.n(), Color.GREEN))
                           .a("@red@Red", () -> this.a(var3.n(), Color.RED));
                        String[] var6 = new String[]{"Hull", "Tile", "True tile", "South-west tile", "South-west true tile", "Outline"};
                        String[] var7 = new String[]{"hull", "tile", "truetile", "swtile", "swtruetile", "outline"};
                        int var8 = this.s.c("<img=360> <img=327> Tag style", () -> System.out.println("Change style"));
                        rs.p_j.p_b.C_a var9 = this.s.b(var8);
                        var9.a("<img=138> Reset", () -> this.c(var3.n()));

                        for (int var10 = var6.length - 1; var10 >= 0; var10--) {
                           String var11 = var7[var10];
                           var9.a(var6[var10], () -> this.a(var3.n(), var11));
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public C_a a(C_j var1) {
      if (var1.o() == null) {
         return null;
      } else {
         return this.t.get(var1) != null ? this.t.get(var1) : null;
      }
   }

   private void b(C_j var1) {
      String var2 = var1.o();
      ArrayList var3 = new ArrayList<>(this.u);
      if (!var3.removeIf(var2::equalsIgnoreCase)) {
         var3.add(var2);
      }

      SwingUtilities.invokeLater(() -> {
         this.o.a(C_s.a(var3));
         rs.p_h.C_c.a(this::g);
      });
   }

   @d
   List<String> f() {
      String var1 = this.o.l();
      return var1.isEmpty() ? Collections.emptyList() : C_s.a(var1);
   }

   void g() {
      this.u = this.f();
      this.t.clear();
      if (this.n.fc && this.n.cc && C_Client_mc.ee == 2) {
         for (C_j var4 : this.n.aK()) {
            if (var4 != null) {
               String var5 = var4.o();
               if (var5 != null && this.a(var5)) {
                  this.t.put(var4, this.c(var4));
               }
            }
         }
      }
   }

   private boolean a(String var1) {
      for (String var3 : this.u) {
         if (C_t.a(var3, var1)) {
            return true;
         }
      }

      return false;
   }

   private C_a c(C_j var1) {
      int var2 = var1.n();
      String var3 = this.d(var2);
      boolean var4;
      boolean var5;
      boolean var6;
      boolean var7;
      boolean var8;
      boolean var9;
      if (var3 != null) {
         var4 = "hull".equals(var3);
         var5 = "tile".equals(var3);
         var6 = "truetile".equals(var3);
         var7 = "swtile".equals(var3);
         var8 = "swtruetile".equals(var3);
         var9 = "outline".equals(var3);
      } else {
         var4 = this.o.a();
         var5 = this.o.b();
         var6 = this.o.c();
         var7 = this.o.d();
         var8 = this.o.e();
         var9 = this.o.f();
      }

      return C_a.a()
         .a(var1)
         .a((Color)L.a(this.b(var2), this.o.h()))
         .b(this.o.i())
         .a(var4)
         .b(var5)
         .c(var6)
         .d(var7)
         .e(var8)
         .f(var9)
         .g(this.o.g())
         .a((float)this.o.j())
         .a(this.o.k())
         .a(this::d)
         .a();
   }

   private boolean d(C_j var1) {
      rs.p_d.C_d var2 = var1.aG;
      return var2 == null || !var2.h || !this.o.m();
   }

   private void a(int var1, Color var2) {
      SwingUtilities.invokeLater(() -> {
         this.q.a("npcindicators", "highlightcolor_" + var1, var2);
         rs.p_h.C_c.a(this::g);
      });
   }

   private void a(int var1) {
      SwingUtilities.invokeLater(() -> {
         this.q.b("npcindicators", "highlightcolor_" + var1);
         rs.p_h.C_c.a(this::g);
      });
   }

   private Color b(int var1) {
      return this.q.a("npcindicators", "highlightcolor_" + var1, Color.class);
   }

   private void a(int var1, String var2) {
      SwingUtilities.invokeLater(() -> {
         this.q.b("npcindicators", "tagstyle_" + var1, var2);
         rs.p_h.C_c.a(this::g);
      });
   }

   private void c(int var1) {
      SwingUtilities.invokeLater(() -> {
         this.q.b("npcindicators", "tagstyle_" + var1);
         rs.p_h.C_c.a(this::g);
      });
   }

   private String d(int var1) {
      return this.q.a("npcindicators", "tagstyle_" + var1);
   }

   private List<Color> i() {
      ArrayList var1 = new ArrayList();

      for (C_j var5 : this.n.aK()) {
         Color var6 = this.b(var5.n());
         if (var6 != null && !var1.contains(var6)) {
            var1.add(var6);
            if (var1.size() >= 5) {
               break;
            }
         }
      }

      return var1;
   }

   Map<C_j, C_a> h() {
      return this.t;
   }
}
