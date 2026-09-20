package rs.p_s.p_b;

import java.awt.Dimension;
import javax.swing.JPanel;

class C_h extends JPanel {
   @Override
   public Dimension getPreferredSize() {
      return new Dimension(350, super.getPreferredSize().height);
   }
}
