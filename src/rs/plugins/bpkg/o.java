package rs.plugins.bpkg;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;
import org.apache.commons.a.F;
import rs.class_12;
import rs.class_317;
import rs.gui.M;

/* JADX INFO: loaded from: client-final.jar:rs/s/b/o.class */
public class o extends JPanel implements v {
    private static final ImageIcon a;
    private static final ImageIcon b;
    private static final ImageIcon c;
    private static final ImageIcon d;
    private final q e;
    private final n f;
    private final List<String> g = new ArrayList();
    private final JToggleButton h;
    private final u i;

    o(q qVar, n nVar) {
        this.e = qVar;
        this.f = nVar;
        Collections.addAll(this.g, nVar.d().toLowerCase().split(F.a));
        Collections.addAll(this.g, nVar.e().toLowerCase().split(F.a));
        Collections.addAll(this.g, nVar.f());
        String strC = nVar.c();
        if (strC != null) {
            this.g.add("pluginhub");
            this.g.add(strC);
        } else {
            this.g.add("plugin");
        }
        setLayout(new BorderLayout(3, 0));
        setPreferredSize(new Dimension(350, 20));
        JLabel jLabel = new JLabel(nVar.d());
        jLabel.setForeground(Color.WHITE);
        if (!nVar.e().isEmpty()) {
            jLabel.setToolTipText("<html>" + nVar.d() + ":<br>" + nVar.e() + "</html>");
        }
        this.h = new JToggleButton(d);
        this.h.setSelectedIcon(c);
        M.a((AbstractButton) this.h);
        M.a((AbstractButton) this.h, "Unpin plugin", "Pin plugin");
        this.h.setPreferredSize(new Dimension(21, 0));
        add(this.h, "Before");
        this.h.addActionListener(actionEvent -> {
            qVar.c();
            qVar.b();
        });
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(1, 2));
        add(jPanel, "After");
        if (nVar.a()) {
            JButton jButton = new JButton(a);
            jButton.setRolloverIcon(b);
            M.a((AbstractButton) jButton);
            jButton.setPreferredSize(new Dimension(25, 0));
            jButton.setVisible(false);
            jPanel.add(jButton);
            jButton.addActionListener(actionEvent2 -> {
                jButton.setIcon(a);
                e();
            });
            jButton.setVisible(true);
            jButton.setToolTipText("Edit plugin configuration");
            new JMenuItem(class_317.e).addActionListener(actionEvent3 -> {
                e();
            });
        }
        add(jLabel, "Center");
        this.i = new u();
        this.i.a(nVar.i());
        jPanel.add(this.i);
        if (nVar.j() != null) {
            this.i.addActionListener(actionEvent4 -> {
                if (this.i.isSelected()) {
                    qVar.c(nVar.j());
                } else {
                    if (((rs.plugins.e) nVar.j().getClass().getAnnotation(rs.plugins.e.class)).l()) {
                        return;
                    }
                    qVar.d(nVar.j());
                }
            });
        } else {
            this.i.setVisible(false);
        }
        if (((rs.plugins.e) nVar.j().getClass().getAnnotation(rs.plugins.e.class)).l()) {
            this.i.setVisible(false);
        }
    }

    @Override // rs.plugins.bpkg.v
    public String a() {
        return this.f.d();
    }

    @Override // rs.plugins.bpkg.v
    public boolean b() {
        return this.h.isSelected();
    }

    void a(boolean z) {
        this.h.setSelected(z);
    }

    void b(boolean z) {
        this.i.setSelected(z);
    }

    private void e() {
        this.e.a(this.f);
    }

    static void a(JLabel jLabel, JMenuItem... jMenuItemArr) {
        JPopupMenu jPopupMenu = new JPopupMenu();
        Color foreground = jLabel.getForeground();
        jPopupMenu.setBorder(new EmptyBorder(5, 5, 5, 5));
        for (JMenuItem jMenuItem : jMenuItemArr) {
            if (jMenuItem != null) {
                jMenuItem.addActionListener(actionEvent -> {
                    jLabel.setForeground(foreground);
                });
                jPopupMenu.add(jMenuItem);
            }
        }
        jLabel.addMouseListener(new p(jPopupMenu, jLabel));
    }

    public n c() {
        return this.f;
    }

    @Override // rs.plugins.bpkg.v
    public List<String> d() {
        return this.g;
    }

    static {
        BufferedImage bufferedImageB = class_12.b((Class<?>) a.class, "config_edit_icon.png");
        BufferedImage bufferedImageB2 = class_12.b((Class<?>) a.class, "star_on.png");
        a = new ImageIcon(bufferedImageB);
        c = new ImageIcon(bufferedImageB2);
        b = new ImageIcon(class_12.b((Image) bufferedImageB, -100));
        d = new ImageIcon(class_12.b((Image) class_12.a(bufferedImageB2), 0.77f));
    }
}
