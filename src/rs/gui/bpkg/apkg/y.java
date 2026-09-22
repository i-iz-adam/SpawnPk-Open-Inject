package rs.gui.bpkg.apkg;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/a/y.class */
public class y extends JFrame {
    static Color[] a = {Color.WHITE, new Color(255, 50, 50), new Color(255, 150, 50), Color.CYAN, Color.GREEN, Color.YELLOW, Color.MAGENTA};
    static String[] b = {"Default", "Red", "Orange", "Blue", "Green", "Yellow", "Magenta"};
    private String c;
    private rs.gui.bpkg.d d;
    private final JTextField e;
    private JButton f;
    private JComboBox<String> g;
    private JComboBox<String> h;

    public y(rs.gui.bpkg.d dVar, String str, String str2) {
        super(str);
        this.e = new JTextField(14);
        this.d = dVar;
        this.c = str2;
    }

    public void a(ActionListener actionListener) {
        setSize(400, 100);
        setResizable(false);
        Toolkit.getDefaultToolkit().getScreenSize();
        setLocationRelativeTo(Launcher.n().i().getContentPane());
        this.f = new JButton(this.c);
        this.g = new JComboBox<>(b);
        e eVar = new e(this.g);
        eVar.a(a);
        eVar.a(b);
        this.g.setRenderer(eVar);
        String[] strArr = new String[rs.gui.bpkg.e.values().length + 1];
        strArr[0] = "None (Default)";
        for (int i = 0; i < rs.gui.bpkg.e.values().length; i++) {
            strArr[i + 1] = rs.gui.bpkg.e.values()[i].D;
        }
        this.h = new JComboBox<>(strArr);
        this.h.setRenderer(new j(this.h));
        JPanel jPanel = new JPanel();
        jPanel.add(this.e);
        jPanel.add(this.f);
        JPanel jPanel2 = new JPanel();
        jPanel2.add(new JLabel("Color: "));
        jPanel2.add(this.g);
        jPanel2.add(new JSeparator(1));
        jPanel2.add(new JLabel("Icon: "));
        jPanel2.add(this.h);
        getContentPane().add(jPanel, "Center");
        jPanel.getRootPane().setDefaultButton(this.f);
        getContentPane().add(jPanel2, "South");
        this.f.addActionListener(actionListener);
        this.f.addActionListener(new z(this));
        setVisible(true);
    }

    public void a(Color color) {
        if (color == null) {
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i].getRGB() == color.getRGB()) {
                this.g.setSelectedIndex(i);
            }
        }
    }

    public void a(rs.gui.bpkg.e eVar) {
        if (eVar == null) {
            return;
        }
        for (int i = 0; i < rs.gui.bpkg.e.values().length; i++) {
            if (rs.gui.bpkg.e.values()[i].D.equalsIgnoreCase(eVar.D)) {
                this.h.setSelectedIndex(i + 1);
            }
        }
    }

    public void setName(String str) {
        if (str == null) {
            return;
        }
        this.e.setText(str);
    }

    public Color a() {
        return a[this.g.getSelectedIndex()];
    }

    public rs.gui.bpkg.e b() {
        for (rs.gui.bpkg.e eVar : rs.gui.bpkg.e.values()) {
            if (eVar.D.equals(this.h.getSelectedItem())) {
                return eVar;
            }
        }
        return null;
    }

    public String c() {
        return this.e.getText();
    }
}
