package rs.p_s.p_b;

import com.google.a.d.ch;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.p_eventbus.C_EventBus_mc;
import rs.p_eventbus.C_Subscribe_mc;
import rs.p_runelite.p_events.C_PluginChanged_mc;

@Singleton
public class C_q extends rs.p_ui.C_m {
   private static final Logger a = LoggerFactory.getLogger(C_q.class);
   private static final String b = rs.p_f.C_a.A;
   private static final String c = "pinnedPlugins";
   private static final ch<String> d = ch.a("Combat", "Chat", "Item", "Minigame", "Notification", "Plugin Hub", "Skilling", "XP");
   private final rs.p_e.C_i e;
   private final rs.p_s.C_g f;
   private final Provider<C_a> g;
   private final List<C_n> k = new ArrayList<>();
   private final rs.p_ui.C_k l;
   private final rs.p_ui.p_components.C_k m;
   private final JScrollPane n;
   private final C_h o;
   private List<C_o> p;

   @Inject
   public C_q(rs.p_e.C_i var1, rs.p_s.C_g var2, C_EventBus_mc var3, Provider<C_a> var4) {
      super(false);
      this.e = var1;
      this.f = var2;
      this.g = var4;
      this.l = new C_r(this, this, var3);
      this.m = new rs.p_ui.p_components.C_k();
      this.m.a(rs.p_ui.p_components.C_k.a.a);
      this.m.setPreferredSize(new Dimension(330, 30));
      this.m.setBackground(rs.p_gui.C_d.c);
      this.m.a(rs.p_gui.C_d.h);
      this.m.b().addDocumentListener(new C_s(this));
      d.forEach(this.m.c()::addElement);
      this.setLayout(new BorderLayout());
      this.setBackground(rs.p_gui.C_d.d);
      JPanel var5 = new JPanel();
      var5.setBorder(new EmptyBorder(10, 10, 10, 10));
      var5.setLayout(new BorderLayout(0, 6));
      var5.add(this.m, "Center");
      this.add(var5, "North");
      this.o = new C_h();
      this.o.setBorder(new EmptyBorder(8, 10, 10, 10));
      this.o.setLayout(new rs.p_ui.C_j(0, 1, 0, 5));
      this.o.setAlignmentX(0.0F);
      C_h var6 = new C_h();
      var6.setLayout(new BorderLayout());
      var6.add(this.o, "North");
      this.n = new JScrollPane(var6);
      this.n.setHorizontalScrollBarPolicy(31);
      this.add(this.n, "Center");
      this.a();
   }

   void a() {
      List var1 = this.g();
      this.p = Stream.concat(this.k.stream(), this.f.c().stream().filter(var0 -> !var0.getClass().getAnnotation(rs.p_s.C_e.class).g()).map(var1x -> {
         rs.p_s.C_e var2 = var1x.getClass().getAnnotation(rs.p_s.C_e.class);
         rs.p_e.C_b var3 = this.f.a(var1x);
         rs.p_e.C_d var4 = var3 == null ? null : this.e.a(var3);
         List var5 = this.f.g(var1x).stream().map(rs.p_s.C_a::e).collect(Collectors.toList());
         return new C_n(var2.a(), var2.c(), var2.d(), var1x, var3, var4, var5);
      })).map(var2 -> {
         C_o var3 = new C_o(this, var2);
         var3.a(var1.contains(var2.d()));
         return var3;
      }).sorted(Comparator.comparing(var0 -> var0.c().d())).collect(Collectors.toList());
      this.o.removeAll();
      this.b();
   }

   void a(C_n... var1) {
      Collections.addAll(this.k, var1);
   }

   void b() {
      this.p.forEach(var1x -> {
         rs.p_s.C_a var2 = var1x.c().j();
         if (var2 != null) {
            var1x.b(this.f.d(var2));
         }
      });
      int var1 = this.n.getVerticalScrollBar().getValue();
      this.f();
      this.m.requestFocusInWindow();
      this.validate();
      this.n.getVerticalScrollBar().setValue(var1);
   }

   void a(String var1) {
      this.m.a(var1);
      this.f();
      this.l.c(this);
   }

   private void f() {
      String var1 = this.m.a();
      this.p.forEach(this.o::remove);
      C_t.a(this.p.stream().filter(var0 -> !var0.c().j().getClass().getAnnotation(rs.p_s.C_e.class).k()).collect(Collectors.toList()), var1)
         .forEach(this.o::add);
      this.revalidate();
   }

   void b(String var1) {
      for (C_o var3 : this.p) {
         if (var3.c().d().equals(var1)) {
            this.a(var3.c());
            break;
         }
      }
   }

   public void a(rs.p_s.C_a var1) {
      for (C_o var3 : this.p) {
         if (var3.c().j() == var1) {
            this.a(var3.c());
            break;
         }
      }
   }

   public C_a b(rs.p_s.C_a var1) {
      for (C_o var3 : this.p) {
         if (var3.c().j() == var1) {
            C_a var4 = (C_a)this.g.get();
            var4.a(var3.c());
            return var4;
         }
      }

      return null;
   }

   void a(C_n var1) {
      C_a var2 = (C_a)this.g.get();
      var2.a(var1);
      this.l.c(this);
      this.l.c(var2);
   }

   void c(rs.p_s.C_a var1) {
      this.f.a(var1, true);

      try {
         this.f.b(var1);
      } catch (rs.p_s.C_f var3) {
         a.warn("Error when starting plugin {}", var1.getClass().getSimpleName(), var3);
      }
   }

   void d(rs.p_s.C_a var1) {
      this.f.a(var1, false);

      try {
         this.f.c(var1);
      } catch (rs.p_s.C_f var3) {
         a.warn("Error when stopping plugin {}", var1.getClass().getSimpleName(), var3);
      }
   }

   private List<String> g() {
      String var1 = this.e.a(b, "pinnedPlugins");
      return var1 == null ? Collections.emptyList() : rs.p_A_uc.C_s.a(var1);
   }

   void c() {
      String var1 = this.p.stream().filter(C_o::b).map(var0 -> var0.c().d()).collect(Collectors.joining(","));
      this.e.b(b, "pinnedPlugins", var1);
   }

   @C_Subscribe_mc
   public void onPluginChanged(C_PluginChanged_mc var1) {
      SwingUtilities.invokeLater(this::b);
   }

   @Override
   public Dimension getPreferredSize() {
      return new Dimension(367, super.getPreferredSize().height);
   }

   @Override
   public void J_() {
      super.J_();
      if (this.m.getParent() != null) {
         this.m.requestFocusInWindow();
      }
   }

   public rs.p_ui.C_k e() {
      return this.l;
   }
}
