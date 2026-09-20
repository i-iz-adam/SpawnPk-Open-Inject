package rs.p_gui.p_b.p_a;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import rs.p_gui.C_Launcher_mc;

class C_v implements ActionListener {
   C_v(rs.p_gui.p_b.C_h var1) {
      this.a = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = this.a.f().e();
      if (var2 != null) {
         JFrame var3 = new JFrame("Delete " + var2 + "?");
         JButton var4 = new JButton("Yes, delete \"" + var2 + "\"");
         JButton var5 = new JButton("No, Nevermind.");
         var3.setLocationRelativeTo(C_Launcher_mc.n().i().getContentPane());
         JPanel var6 = new JPanel();
         var3.setLayout(new FlowLayout());
         var3.setSize(400, 90);
         var3.setLocationRelativeTo(C_Launcher_mc.n().i().getContentPane());
         var6.add(var4);
         var6.add(var5);
         var3.add(var6);
         var4.addActionListener(new C_w(this, var2, var3));
         var5.addActionListener(new C_x(this, var3));
         var3.setVisible(true);
      }
   }
}
