package rs.p_s.p_b;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import rs.p_eventbus.C_EventBus_mc;

@Singleton
class C_w extends rs.p_ui.C_m {
   private final rs.p_ui.p_components.p_b.C_e a;
   private final CardLayout b;
   private final JPanel c;
   private final C_EventBus_mc d;
   private final C_q e;
   private final rs.p_ui.p_components.p_b.C_a f;
   private boolean g = false;
   private rs.p_ui.C_m k;
   private boolean l;

   @Inject
   C_w(C_EventBus_mc var1, C_q var2) {
      super(false);
      this.d = var1;
      this.a = new rs.p_ui.p_components.p_b.C_e();
      this.a.setLayout(new GridLayout(1, 0, 7, 7));
      this.a.setBorder(new EmptyBorder(10, 10, 0, 10));
      this.c = new JPanel();
      this.b = new CardLayout();
      this.c.setLayout(this.b);
      this.setLayout(new BorderLayout());
      this.add(this.c, "Center");
      this.e = var2;
      this.c.add(var2);
      this.f = this.a(var2.e(), "config_icon_lg.png", "Configuration");
   }

   private rs.p_ui.p_components.p_b.C_a a(rs.p_ui.C_m var1, String var2, String var3) {
      rs.p_ui.p_components.p_b.C_a var4 = new rs.p_ui.p_components.p_b.C_a(new ImageIcon(rs.p_A_uc.C_j.b(C_w.class, var2)), this.a, null);
      var4.setToolTipText(var3);
      this.a.a(var4);
      this.c.add(var2, var1.l());
      this.d.register(var1);
      var4.a(() -> {
         this.a(var2, var1, false);
         return true;
      });
      return var4;
   }

   private rs.p_ui.p_components.p_b.C_a a(Provider<? extends rs.p_ui.C_m> var1, String var2, String var3) {
      rs.p_ui.p_components.p_b.C_a var4 = new rs.p_ui.p_components.p_b.C_a(new ImageIcon(rs.p_A_uc.C_j.b(C_w.class, var2)), this.a, null);
      var4.setToolTipText(var3);
      this.a.a(var4);
      var4.a(() -> {
         rs.p_ui.C_m var3x = (rs.p_ui.C_m)var1.get();
         this.c.add(var2, var3x.l());
         this.d.register(var3x);
         this.a(var2, var3x, true);
         return true;
      });
      return var4;
   }

   private void a(String var1, rs.p_ui.C_m var2, boolean var3) {
      boolean var4 = this.l;
      rs.p_ui.C_m var5 = this.k;
      if (this.g) {
         var5.K_();
         var2.J_();
      }

      this.k = var2;
      this.l = var3;
      this.b.show(this.c, var1);
      if (var4) {
         this.c.remove(var5.l());
         this.d.unregister(var5);
      }

      this.c.revalidate();
   }

   @Override
   public void J_() {
      this.g = true;
      this.e.J_();
   }

   @Override
   public void K_() {
      this.g = false;
      this.e.K_();
   }

   public void a(String var1) {
      this.a.b(this.f);
      this.e.b(var1);
   }

   public void a(rs.p_s.C_a var1) {
      this.a.b(this.f);
      this.e.a(var1);
   }

   public void b(String var1) {
      this.a.b(this.f);
      this.e.a(var1);
   }
}
