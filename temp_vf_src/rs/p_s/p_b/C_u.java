package rs.p_s.p_b;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import rs.p_gui.C_M_uc;

class C_u extends JToggleButton {
   private static final ImageIcon a;
   private static final ImageIcon b;
   private String c = "";

   public C_u() {
      super(b);
      this.setSelectedIcon(a);
      C_M_uc.a(this);
      this.setPreferredSize(new Dimension(25, 0));
      this.addItemListener(var1 -> this.a());
      this.a();
   }

   private void a() {
      this.setToolTipText(this.isSelected() ? "Disable plugin" : "<html>Enable plugin" + this.c);
   }

   public void a(List<String> var1) {
      if (var1 != null && !var1.isEmpty()) {
         StringBuilder var2 = new StringBuilder("<br>Plugin conflicts: ");

         for (int var3 = 0; var3 < var1.size() - 2; var3++) {
            var2.append((String)var1.get(var3));
            var2.append(", ");
         }

         if (var1.size() >= 2) {
            var2.append((String)var1.get(var1.size() - 2));
            var2.append(" and ");
         }

         var2.append((String)var1.get(var1.size() - 1));
         this.c = var2.toString();
      } else {
         this.c = "";
      }

      this.a();
   }

   static {
      BufferedImage var0 = rs.p_A_uc.C_j.b(C_a.class, "switcher_on.png");
      a = new ImageIcon(var0);
      b = new ImageIcon(rs.p_A_uc.C_j.a(rs.p_A_uc.C_j.b(rs.p_A_uc.C_j.a(var0), 0.61F), true, false));
   }
}
