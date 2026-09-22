package rs.gui.bpkg.apkg;

import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.lwjgl.system.windows.User32;
import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/a/A.class */
public class A extends JFrame {
    private final rs.gui.bpkg.d a;
    private final int b;
    private JButton c;
    private JTextField d;

    public A(rs.gui.bpkg.d dVar, int i) {
        this.a = dVar;
        this.b = i;
    }

    public void a() {
        setTitle("Set " + c() + " level");
        setSize(User32.VK_PLAY, 70);
        setResizable(false);
        Toolkit.getDefaultToolkit().getScreenSize();
        this.c = new JButton("Apply");
        this.d = new JTextField(2);
        JPanel jPanel = new JPanel();
        jPanel.add(this.d);
        jPanel.add(this.c);
        add(jPanel);
        this.d.addActionListener(actionEvent -> {
            b();
        });
        this.c.addActionListener(actionEvent2 -> {
            b();
        });
        setVisible(true);
    }

    private void b() {
        try {
            int i = Integer.parseInt(this.d.getText());
            if (i < 1) {
                i = 1;
            }
            if (i > 99) {
                i = 99;
            }
            this.a.c().c()[this.b] = i;
            this.a.a();
            Launcher.n().d();
            dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String c() {
        switch (this.b) {
            case 0:
                return "Attack";
            case 1:
                return com.google.a.l.c.E;
            case 2:
                return "Strength";
            case 3:
                return "Prayer";
            case 4:
                return "Defence";
            case 5:
                return "Magic";
            case 6:
                return "Hitpoints";
            default:
                return "Null";
        }
    }
}
