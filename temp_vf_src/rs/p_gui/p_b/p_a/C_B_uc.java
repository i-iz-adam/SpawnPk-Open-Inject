package rs.p_gui.p_b.p_a;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import rs.C_Client_mc;

public class C_B_uc {
   public static JButton a(rs.p_gui.p_b.C_h var0) {
      ImageIcon var1 = null;
      if (C_Client_mc.class.getResource("Client.class").toString().startsWith("file")) {
         var1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/loadout.png"));
      } else {
         try {
            var1 = new ImageIcon(ImageIO.read(C_Client_mc.class.getResource("/assets/gui/loadout.png")));
         } catch (IOException var3) {
            var3.printStackTrace();
         }
      }

      JButton var2 = new JButton("Spawn Loadout", var1);
      var2.setToolTipText("Spawn this loadout in-game");
      var2.setPreferredSize(new Dimension(165, 30));
      var2.addActionListener(new C_C_uc(var0));
      return var2;
   }
}
