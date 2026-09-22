package rs.gui.b.a;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import rs.gui.Launcher;
import rs.gui.b.h;

class b implements ActionListener {
   b(h var1) {
      this.a = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      rs.gui.b.a var2 = this.a.f().c();
      if (var2 == null) {
         JOptionPane.showMessageDialog(null, "You don't have a loadout selected!");
      } else {
         JFrame var3 = new JFrame("Clone to " + var2.f() + "?");
         JButton var4 = new JButton("Yes");
         JButton var5 = new JButton("No");
         JPanel var6 = new JPanel();
         var3.setLayout(new FlowLayout());
         var3.setSize(300, 90);
         var3.setLocationRelativeTo(Launcher.n().i().getContentPane());
         var6.add(var4);
         var6.add(var5);
         var3.add(var6);
         var4.addActionListener(new c(this, var2, var3));
         var5.addActionListener(new d(this, var3));
         var3.setVisible(true);
      }
   }
}
