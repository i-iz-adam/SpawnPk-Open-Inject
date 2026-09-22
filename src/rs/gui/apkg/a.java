package rs.gui.apkg;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import rs.Client;
import rs.ClientThread;
import rs.Configuration;
import rs.class_210;
import rs.class_650;
import rs.gui.Launcher;
import rs.lpkg.apkg.c;
import rs.lpkg.b;
import rs.lpkg.e;

/* JADX INFO: loaded from: client-final.jar:rs/gui/a/a.class */
public class a extends JPanel {
    private JCheckBox a;
    private JCheckBox b;
    private JCheckBox c;
    private JComboBox d;
    private JComboBox e;
    private JComboBox f;
    private JCheckBox g;
    private JCheckBox h;
    private JComboBox i;

    public a() {
        a();
    }

    public void a() {
        if (!b.g()) {
            b.e();
        }
        setLayout(new BoxLayout(this, 1));
        add(Box.createRigidArea(new Dimension(0, 10)));
        if (class_650.i()) {
            JPanel jPanel = new JPanel();
            jPanel.setAlignmentX(0.0f);
            jPanel.setBackground(new Color(15, 15, 15));
            jPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 100));
            jPanel.add(new JLabel("<html><center><p style='font-size: 12px'><font style='bold' color='rgb(255,100,100)'><u>Error Warning, PLEASE READ!</p></u><p style='font-size: 9px'><font color='rgb(255,150,150)'>You are running 32-bit Java on a 64-bit machine!<br>This can cause performance issues, and even crashes.<br>Please <u>uninstall Java</u>, and then <u>install the 64-bit version</u></font></p></center></html>"));
            add(jPanel);
            add(Box.createRigidArea(new Dimension(0, 5)));
        }
        d();
        e();
        f();
        b();
        add(Box.createVerticalGlue());
    }

    private void d() {
        JPanel jPanel = new JPanel();
        jPanel.setAlignmentX(0.0f);
        jPanel.setBackground(new Color(15, 15, 15));
        jPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 32));
        jPanel.add(new JLabel("<html><p style='font-size: 9px'><font style='bold' color='rgb(150,150,255)'>GPU Settings</font></p></html>"));
        add(jPanel);
        add(Box.createRigidArea(new Dimension(0, 5)));
        this.a = new JCheckBox("GPU Mode");
        add(this.a);
        JPanel jPanel2 = new JPanel(new FlowLayout(0));
        jPanel2.setAlignmentX(0.0f);
        jPanel2.setMaximumSize(new Dimension(Integer.MAX_VALUE, 25));
        jPanel2.add(new JLabel("Anti Aliasing:"));
        this.d = new JComboBox(rs.lpkg.apkg.a.values());
        jPanel2.add(this.d);
        add(jPanel2);
        JPanel jPanel3 = new JPanel(new FlowLayout(0));
        jPanel3.setAlignmentX(0.0f);
        jPanel3.setMaximumSize(new Dimension(Integer.MAX_VALUE, 25));
        jPanel3.add(new JLabel("VSync Mode:"));
        this.e = new JComboBox(c.values());
        jPanel3.add(this.e);
        add(jPanel3);
        JPanel jPanel4 = new JPanel(new FlowLayout(0));
        jPanel4.setAlignmentX(0.0f);
        jPanel4.setMaximumSize(new Dimension(Integer.MAX_VALUE, 25));
        jPanel4.add(new JLabel("Colorblind Mode:"));
        this.f = new JComboBox(rs.lpkg.apkg.b.values());
        jPanel4.add(this.f);
        add(jPanel4);
        this.b = new JCheckBox("Anisotropic filtering");
        add(this.b);
        this.c = new JCheckBox("Smooth banding");
        add(this.c);
        add(Box.createRigidArea(new Dimension(0, 10)));
    }

    private void e() {
        JPanel jPanel = new JPanel();
        jPanel.setAlignmentX(0.0f);
        jPanel.setBackground(new Color(15, 15, 15));
        jPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 32));
        jPanel.add(new JLabel("<html><p style='font-size: 9px'><font style='bold' color='rgb(150,150,255)'>Stretched Mode Settings</font></p></html>"));
        add(jPanel);
        add(Box.createRigidArea(new Dimension(0, 5)));
        this.g = new JCheckBox("Stretched Mode");
        add(this.g);
        this.h = new JCheckBox("Maintain aspect ratio");
        add(this.h);
        JPanel jPanel2 = new JPanel(new FlowLayout(0));
        jPanel2.setAlignmentX(0.0f);
        jPanel2.setMaximumSize(new Dimension(Integer.MAX_VALUE, 25));
        this.i = new JComboBox(new String[]{"Bilinear", "Bicubic (Mitchell)", "Bicubic (Catmull-Rom)", "xBR"});
        jPanel2.add(new JLabel("UI Scaling:"));
        jPanel2.add(this.i);
        add(jPanel2);
        add(Box.createRigidArea(new Dimension(0, 10)));
    }

    private void f() {
        this.d.setSelectedItem(b.b);
        this.e.setSelectedItem(b.d);
        this.f.setSelectedItem(b.e);
        this.b.setSelected(b.c > 0);
        this.g.setSelected(b.i);
        this.h.setSelected(b.j);
        this.i.setSelectedIndex(b.k);
        this.c.setSelected(b.f);
        this.a.addActionListener(actionEvent -> {
            ClientThread.queue(() -> {
                b.a();
                Configuration.Q = e.a();
                if (e.a() && b.i) {
                    b.f();
                }
                b.d();
                SwingUtilities.invokeLater(() -> {
                    b();
                });
            });
        });
        this.d.addActionListener(actionEvent2 -> {
            ClientThread.queue(() -> {
                b.b = (rs.lpkg.apkg.a) this.d.getSelectedItem();
                b.d();
                SwingUtilities.invokeLater(() -> {
                    b();
                });
            });
        });
        this.e.addActionListener(actionEvent3 -> {
            ClientThread.queue(() -> {
                b.d = (c) this.e.getSelectedItem();
                b.d();
                Launcher.n().o().a.e();
                SwingUtilities.invokeLater(() -> {
                    b();
                });
            });
        });
        this.f.addActionListener(actionEvent4 -> {
            ClientThread.queue(() -> {
                b.e = (rs.lpkg.apkg.b) this.f.getSelectedItem();
                b.d();
                SwingUtilities.invokeLater(() -> {
                    b();
                });
            });
        });
        this.b.addActionListener(actionEvent5 -> {
            ClientThread.queue(() -> {
                b.c = this.b.isSelected() ? 2 : 0;
                b.d();
                SwingUtilities.invokeLater(() -> {
                    b();
                });
            });
        });
        this.c.addActionListener(actionEvent6 -> {
            ClientThread.queue(() -> {
                b.f = this.c.isSelected();
                b.d();
                SwingUtilities.invokeLater(() -> {
                    b();
                });
            });
        });
        this.g.addActionListener(actionEvent7 -> {
            ClientThread.queue(() -> {
                Client clientO = Launcher.n().o();
                b.i = this.g.isSelected();
                if (!b.i) {
                    Launcher.n().o().at = "::stretchflagoff";
                    clientO.a(Configuration.ai);
                    clientO.gZ.a();
                    class_210.d();
                } else if (!Client.ag()) {
                    b.f();
                    Launcher.n().o().at = "::stretchflagon";
                }
                b.d();
                SwingUtilities.invokeLater(() -> {
                    b();
                });
            });
        });
        this.i.addActionListener(actionEvent8 -> {
            ClientThread.queue(() -> {
                b.k = this.i.getSelectedIndex();
                b.d();
                SwingUtilities.invokeLater(() -> {
                    b();
                });
            });
        });
        this.h.addActionListener(actionEvent9 -> {
            ClientThread.queue(() -> {
                b.j = this.h.isSelected();
                Launcher.n().o().a(Configuration.ai);
                b.d();
                SwingUtilities.invokeLater(() -> {
                    b();
                });
            });
        });
    }

    public void b() {
        if (Launcher.n().o() == null || !Launcher.n().o().cd || !Launcher.n().o().fc) {
            c();
            return;
        }
        g();
        if (this.a.isSelected() != e.a()) {
            this.a.setSelected(e.a());
        }
        if (this.g.isSelected() != b.i) {
            this.g.setSelected(b.i);
        }
        if (this.a.isSelected()) {
            a(false, true);
        } else {
            a(false, false);
        }
    }

    public void c() {
        a(true, false);
    }

    private void g() {
        a(true, true);
    }

    private void a(boolean z, boolean z2) {
        if (z) {
            this.a.setEnabled(z2);
        }
        this.d.setEnabled(z2);
        this.e.setEnabled(z2);
        this.f.setEnabled(z2);
        this.b.setEnabled(z2);
        this.g.setEnabled(z2);
        this.h.setEnabled(z2);
        this.i.setEnabled(z2);
        this.c.setEnabled(z2);
    }
}
