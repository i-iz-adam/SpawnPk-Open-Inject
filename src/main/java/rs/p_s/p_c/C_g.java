package rs.p_s.p_c;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.inject.Inject;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import rs.p_A_uc.C_j;
import rs.p_s.p_b.C_q;
import rs.p_ui.C_m;

public class C_g extends C_m {
   private final C_d a;
   private final C_c b;
   private final rs.p_ui.p_components.p_b.C_e c;
   private final CardLayout d;
   private final JPanel e;
   private final rs.p_ui.p_components.p_b.C_a f;
   private final rs.p_ui.p_components.p_b.C_a g;
   private C_m k;
   private boolean l = false;
   private boolean m;
   private final C_q n;

   @Inject
   public C_g(C_q var1, C_c var2) {
      super(false);
      this.n = var1;
      this.b = var2;
      this.c = new rs.p_ui.p_components.p_b.C_e();
      this.c.setLayout(new GridLayout(1, 0, 7, 7));
      this.c.setBorder(new EmptyBorder(10, 10, 0, 10));
      this.e = new JPanel();
      this.d = new CardLayout();
      this.e.setLayout(this.d);
      this.setLayout(new BorderLayout());
      this.add(this.c, "North");
      this.add(this.e, "Center");
      this.a = C_c.b;
      this.f = this.a(this.a, "palette.png", "Recolor models");
      this.g = this.a(var1.b(var2), "interface.png", "Interfaces");
      this.c.b(this.f);
   }

   private rs.p_ui.p_components.p_b.C_a a(C_m var1, String var2, String var3) {
      rs.p_ui.p_components.p_b.C_a var4 = new rs.p_ui.p_components.p_b.C_a(new ImageIcon(C_j.b(C_g.class, var2)), this.c, null);
      var4.setToolTipText(var3);
      this.c.a(var4);
      this.e.add(var2, var1.l());
      var4.a(() -> {
         this.a(var2, var1, false);
         return true;
      });
      return var4;
   }

   private void a(String var1, C_m var2, boolean var3) {
      boolean var4 = this.m;
      C_m var5 = this.k;
      if (this.l) {
         var5.K_();
         var2.J_();
      }

      this.k = var2;
      this.m = var3;
      this.d.show(this.e, var1);
      if (var4) {
         this.e.remove(var5.l());
      }

      this.e.revalidate();
   }

   @Override
   public void J_() {
      this.l = true;
      this.k.J_();
   }

   @Override
   public void K_() {
      this.l = false;
      this.k.K_();
   }
}
