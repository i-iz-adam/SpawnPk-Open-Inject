package rs.gui.b.a;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import rs.Client;
import rs.gui.b.h;

public class a {
   public static JButton a(h var0) {
      ImageIcon var1 = null;
      if (Client.class.getResource("Client.class").toString().startsWith("file")) {
         var1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/clone.png"));
      } else {
         try {
            var1 = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/clone.png")));
         } catch (IOException var3) {
            var3.printStackTrace();
         }
      }

      JButton var2 = new JButton("Clone", var1);
      var2.setToolTipText("<html>Take the items you're equipping in game, and<br>set them as the current active loadout.</html>");
      var2.setPreferredSize(new Dimension(100, 30));
      var2.addActionListener(new b(var0));
      return var2;
   }
}
