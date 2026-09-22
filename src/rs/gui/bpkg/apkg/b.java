package rs.gui.bpkg.apkg;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import rs.Client;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/a/B.class */
public class B {
    public static JButton a(rs.gui.bpkg.h hVar) {
        ImageIcon imageIcon = null;
        if (Client.class.getResource("Client.class").toString().startsWith("file")) {
            imageIcon = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/loadout.png"));
        } else {
            try {
                imageIcon = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/loadout.png")));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        JButton jButton = new JButton("Spawn Loadout", imageIcon);
        jButton.setToolTipText("Spawn this loadout in-game");
        jButton.setPreferredSize(new Dimension(165, 30));
        jButton.addActionListener(new C(hVar));
        return jButton;
    }
}
