package rs.gui.bpkg.apkg;

import java.awt.Color;
import java.awt.Toolkit;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import rs.Client;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/a/n.class */
public class n {
    private static Icon a = null;
    private static Icon b = null;
    private static Icon c = null;
    private static Icon d = null;
    private static Icon e = null;
    private static Icon f = null;

    public static JPopupMenu a(rs.gui.bpkg.h hVar) {
        a();
        JPopupMenu jPopupMenu = new JPopupMenu("Loadout folders");
        for (String str : hVar.f().keySet()) {
            JMenuItem jMenuItem = new JMenuItem(str, a);
            jMenuItem.addActionListener(new o(jPopupMenu, jMenuItem, hVar, str));
            if (jMenuItem.getText().equalsIgnoreCase(hVar.f().e())) {
                jMenuItem.setBackground(Color.ORANGE);
            }
            jPopupMenu.add(jMenuItem);
        }
        JMenuItem jMenuItem2 = new JMenuItem("Create new folder", b);
        jMenuItem2.addActionListener(new p(hVar));
        jPopupMenu.add(jMenuItem2);
        JMenuItem jMenuItem3 = new JMenuItem("Rename", d);
        jMenuItem3.addActionListener(new r(hVar));
        jPopupMenu.add(jMenuItem3);
        JMenuItem jMenuItem4 = new JMenuItem("Move up", e);
        jMenuItem4.addActionListener(new t(hVar));
        if (hVar.f().size() > 1) {
            jPopupMenu.add(jMenuItem4);
        }
        JMenuItem jMenuItem5 = new JMenuItem("Move down", f);
        jMenuItem5.addActionListener(new u(hVar));
        if (hVar.f().size() > 1) {
            jPopupMenu.add(jMenuItem5);
        }
        JMenuItem jMenuItem6 = new JMenuItem("Delete", c);
        jMenuItem6.addActionListener(new v(hVar));
        jPopupMenu.add(jMenuItem6);
        return jPopupMenu;
    }

    public static void a() {
        if (a == null || b == null || c == null || d == null || e == null || f == null) {
            if (Client.class.getResource("Client.class").toString().startsWith("file")) {
                a = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/folder.png"));
                b = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/create.png"));
                c = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/delete.png"));
                d = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/edit.png"));
                e = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/up.png"));
                f = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/down.png"));
                return;
            }
            try {
                a = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/folder.png")));
                b = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/create.png")));
                c = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/delete.png")));
                d = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/edit.png")));
                e = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/up.png")));
                f = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/down.png")));
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }
}
