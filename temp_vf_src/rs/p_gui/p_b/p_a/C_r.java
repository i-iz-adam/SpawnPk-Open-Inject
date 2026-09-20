package rs.p_gui.p_b.p_a;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class C_r implements ActionListener {
   C_r(rs.p_gui.p_b.C_h var1) {
      this.a = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      JFrame var2 = new JFrame("Re-name Your Folder");
      JTextField var3 = new JTextField(10);
      JButton var4 = new JButton("Rename");
      JPanel var5 = new JPanel();
      var2.setLayout(new FlowLayout());
      var2.setSize(300, 90);
      Dimension var6 = Toolkit.getDefaultToolkit().getScreenSize();
      var2.setLocation(var6.width / 2 - var2.getSize().width / 2, var6.height / 2 - var2.getSize().height / 2);
      var5.add(var3);
      var5.add(var4);
      var2.add(var5);
      var5.getRootPane().setDefaultButton(var4);
      var4.addActionListener(new C_s(this, var3, var2));
      var2.setVisible(true);
   }
}
