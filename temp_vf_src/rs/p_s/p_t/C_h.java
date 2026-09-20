package rs.p_s.p_t;

import java.awt.BorderLayout;
import javax.inject.Inject;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class C_h extends rs.p_ui.C_m {
   private final JPanel a = new JPanel();
   private final rs.p_ui.p_components.p_b.C_e b = new rs.p_ui.p_components.p_b.C_e(this.a);
   private final rs.p_ui.p_components.p_b.C_a c;
   private final C_l d;
   private final C_g e;

   @Inject
   C_h(C_l var1, C_g var2) {
      super(false);
      this.d = var1;
      this.e = var2;
      this.setLayout(new BorderLayout());
      this.setBackground(rs.p_gui.C_d.d);
      rs.p_ui.p_components.p_b.C_a var3 = new rs.p_ui.p_components.p_b.C_a("Your Listings", this.b, var2);
      this.c = new rs.p_ui.p_components.p_b.C_a("Search", this.b, var1);
      this.b.setBorder(new EmptyBorder(5, 0, 0, 0));
      this.b.a(var3);
      this.b.a(this.c);
      this.b.b(var3);
      this.add(this.b, "North");
      this.add(this.a, "Center");
   }

   void b() {
      if (!this.d.isShowing()) {
         this.b.b(this.c);
         this.revalidate();
      }
   }

   public C_l c() {
      return this.d;
   }

   public C_g e() {
      return this.e;
   }
}
