package rs.p_ui.p_components.p_b;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class C_e extends JPanel {
   private final JPanel a;
   private final List<C_a> b = new ArrayList<>();

   public C_e(JPanel var1) {
      this.a = var1;
      if (var1 != null) {
         this.a.setLayout(new BorderLayout());
      }

      this.setLayout(new FlowLayout(1, 8, 0));
      this.setOpaque(false);
   }

   public C_e() {
      this(null);
   }

   public C_a a(int var1) {
      return this.b != null && !this.b.isEmpty() ? this.b.get(var1) : null;
   }

   public void a(C_a var1) {
      this.b.add(var1);
      this.add(var1, "North");
   }

   public boolean b(C_a var1) {
      if (this.b.contains(var1) && !var1.d()) {
         if (!var1.a()) {
            return false;
         } else {
            if (this.a != null) {
               this.a.removeAll();
               this.a.add(var1.c());
               this.a.revalidate();
               this.a.repaint();
            }

            for (C_a var3 : this.b) {
               if (!var3.equals(var1)) {
                  var3.b();
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }
}
