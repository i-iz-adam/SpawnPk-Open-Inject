package rs.p_ui.p_components.p_a;

import com.google.a.d.aN;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.function.Consumer;
import javax.swing.JPanel;

final class C_o {
   private static final String a = "recentColors";
   private static final int b = 16;
   private static final int c = 16;
   private final aN<String> d = aN.a(16);
   private final rs.p_e.C_i e;

   C_o(rs.p_e.C_i var1) {
      this.e = var1;
   }

   private void a() {
      String var1 = this.e.a("colorpicker", "recentColors");
      if (var1 != null) {
         this.d.addAll(rs.p_A_uc.C_s.a(var1));
      }
   }

   void a(String var1) {
      if (rs.p_A_uc.C_g.c(var1) != null) {
         this.d.remove(var1);
         this.d.add(var1);
         this.e.b("colorpicker", "recentColors", rs.p_A_uc.C_s.a(this.d));
      }
   }

   JPanel a(Consumer<Color> var1, boolean var2) {
      this.a();
      JPanel var3 = new JPanel(new GridBagLayout());
      GridBagConstraints var4 = new GridBagConstraints();
      var4.insets = new Insets(0, 1, 4, 2);
      var4.gridy = 0;
      var4.gridx = 0;
      var4.anchor = 17;

      for (String var6 : this.d) {
         if (var4.gridx == 8) {
            var4.gridy++;
            var4.gridx = 0;
         }

         if (var3.getComponentCount() == this.d.size() - 1) {
            var4.weightx = 1.0;
            var4.gridwidth = 8 - var4.gridx;
         }

         var3.add(a(rs.p_A_uc.C_g.c(var6), var1, var2), var4);
         var4.gridx++;
      }

      return var3;
   }

   private static JPanel a(Color var0, Consumer<Color> var1, boolean var2) {
      JPanel var3 = new JPanel();
      String var4 = var2 ? rs.p_A_uc.C_g.c(var0) : rs.p_A_uc.C_g.d(var0);
      var3.setBackground(var0);
      var3.setOpaque(true);
      var3.setPreferredSize(new Dimension(16, 16));
      var3.setToolTipText("#" + var4.toUpperCase());
      var3.addMouseListener(new C_p(var1, var0));
      return var3;
   }
}
