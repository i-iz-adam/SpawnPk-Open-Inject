package rs.p_ui.p_components;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class C_u extends JPanel {
   private final JLabel a = new rs.p_ui.p_components.p_shadowlabel.C_a();
   private final JLabel b = new rs.p_ui.p_components.p_shadowlabel.C_a();

   public C_u() {
      this.setOpaque(false);
      this.setBorder(new EmptyBorder(50, 10, 0, 10));
      this.setLayout(new BorderLayout());
      this.a.setForeground(Color.WHITE);
      this.a.setHorizontalAlignment(0);
      this.b.setFont(rs.p_gui.C_w.b());
      this.b.setForeground(Color.GRAY);
      this.b.setHorizontalAlignment(0);
      this.add(this.a, "North");
      this.add(this.b, "Center");
      this.setVisible(false);
   }

   public void a(String var1, String var2) {
      this.a.setText(var1);
      this.b.setText("<html><body style = 'text-align:center'>" + var2 + "</body></html>");
      this.setVisible(true);
   }
}
