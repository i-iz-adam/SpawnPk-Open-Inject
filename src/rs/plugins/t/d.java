package rs.plugins.t;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.annotation.Nullable;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;
import rs.ClientThread;
import rs.class_12;
import rs.class_18;
import rs.class_9;
import rs.gui.w;
import rs.ui.components.y;

/* JADX INFO: loaded from: client-final.jar:rs/s/t/d.class */
public class d extends JPanel {
    private static final int a = 45;
    private static final String b = "FACE_CARD";
    private static final String c = "DETAILS_CARD";
    private static final ImageIcon d;
    private static final ImageIcon e;
    private final i f;
    private final JPanel g = new JPanel();
    private final CardLayout h = new CardLayout();
    private final JLabel i = new JLabel();
    private final JLabel j = new JLabel();
    private final JLabel k = new JLabel();
    private final JLabel l = new JLabel();
    private final JLabel m = new JLabel();
    private final y n = new y();
    private boolean o = true;
    private int p;

    d(i iVar) {
        this.f = iVar;
        setLayout(new BorderLayout());
        setBackground(rs.gui.d.d);
        setBorder(new EmptyBorder(7, 0, 0, 0));
        e eVar = new e(this);
        this.g.setLayout(this.h);
        this.g.setBackground(rs.gui.d.c);
        JPanel jPanel = new JPanel();
        jPanel.setBackground(rs.gui.d.c);
        jPanel.setLayout(new BorderLayout());
        jPanel.addMouseListener(eVar);
        this.i.setVerticalAlignment(0);
        this.i.setHorizontalAlignment(0);
        this.i.setPreferredSize(new Dimension(45, 45));
        this.j.setForeground(Color.WHITE);
        this.j.setVerticalAlignment(3);
        this.j.setFont(w.b());
        this.k.setForeground(rs.gui.d.f);
        this.k.setVerticalAlignment(1);
        this.k.setFont(w.b());
        JLabel jLabel = new JLabel();
        jLabel.setIcon(d);
        jLabel.setVerticalAlignment(0);
        jLabel.setHorizontalAlignment(0);
        jLabel.setPreferredSize(new Dimension(30, 45));
        JPanel jPanel2 = new JPanel();
        jPanel2.setBackground(rs.gui.d.c);
        jPanel2.setLayout(new GridLayout(2, 1, 0, 2));
        jPanel2.add(this.j);
        jPanel2.add(this.k);
        jPanel.add(jPanel2, "Center");
        jPanel.add(this.i, "West");
        jPanel.add(jLabel, "East");
        JPanel jPanel3 = new JPanel();
        jPanel3.setBackground(rs.gui.d.c);
        jPanel3.setLayout(new BorderLayout());
        jPanel3.setBorder(new EmptyBorder(0, 15, 0, 0));
        jPanel3.addMouseListener(eVar);
        this.l.setForeground(Color.WHITE);
        this.l.setVerticalAlignment(3);
        this.l.setFont(w.b());
        this.m.setForeground(Color.WHITE);
        this.m.setVerticalAlignment(1);
        this.m.setFont(w.b());
        JLabel jLabel2 = new JLabel();
        jLabel2.setIcon(e);
        jLabel2.setVerticalAlignment(0);
        jLabel2.setHorizontalAlignment(0);
        jLabel2.setPreferredSize(new Dimension(30, 45));
        JPanel jPanel4 = new JPanel();
        jPanel4.setBackground(rs.gui.d.c);
        jPanel4.setLayout(new BoxLayout(jPanel4, 3));
        jPanel4.setPreferredSize(new Dimension(0, 45));
        JPanel jPanel5 = new JPanel();
        jPanel5.setBackground(rs.gui.d.c);
        jPanel5.setLayout(new BoxLayout(jPanel5, 3));
        jPanel5.add(this.l);
        jPanel5.add(this.m);
        jPanel4.add(Box.createVerticalGlue());
        jPanel4.add(jPanel5);
        jPanel4.add(Box.createVerticalGlue());
        jPanel3.add(jPanel4, "Center");
        jPanel3.add(jLabel2, "East");
        this.g.add(jPanel, b);
        this.g.add(jPanel3, c);
        this.h.show(this.g, b);
        add(this.g, "Center");
        add(this.n, "South");
    }

    void a(@Nullable c cVar) {
        if (cVar == null) {
            return;
        }
        this.h.show(this.g, b);
        this.j.setText(cVar.a());
        Image imageA = this.f.a(cVar.f());
        if (imageA == null) {
            ClientThread.a("TPOS" + System.nanoTime(), new f(this, cVar));
        } else {
            this.i.setIcon(new ImageIcon(imageA));
        }
        this.k.setText("Sold: " + class_18.a(cVar.g()) + " / " + class_18.a(cVar.h()));
        this.l.setIcon(new ImageIcon(cVar.j().c()));
        this.l.setText(a("Price each: ", class_18.b(cVar.i())));
        String str = class_18.b(cVar.b()) + " / " + class_18.b(((long) cVar.i()) * ((long) cVar.h()));
        if (cVar.j().b() > 1) {
            str = str + " <font color='" + class_9.b(rs.gui.d.i) + "''>(" + class_18.a(((long) cVar.g()) * ((long) cVar.i()) * ((long) cVar.j().b())) + ")</font>";
        }
        this.m.setIcon(m.a);
        this.m.setText(a("Received: ", str));
        this.n.setForeground(b(cVar));
        this.n.a(cVar.h());
        this.n.b(cVar.g());
        JPopupMenu jPopupMenu = new JPopupMenu();
        jPopupMenu.setBorder(new EmptyBorder(5, 5, 5, 5));
        for (JPanel jPanel : this.g.getComponents()) {
            if (jPanel instanceof JPanel) {
                JPanel jPanel2 = jPanel;
                jPanel2.setToolTipText(a(((int) this.n.a()) + "%"));
                jPanel2.setComponentPopupMenu(jPopupMenu);
            }
        }
        this.p = cVar.f();
        revalidate();
    }

    private String a(String str) {
        return "<html><body style = 'color:" + class_9.b(rs.gui.d.f) + "'>Progress: <span style = 'color:white'>" + str + "</span></body></html>";
    }

    private String a(String str, String str2) {
        return "<html><body style = 'color:white'>" + str + "<span style = 'color:" + class_9.b(rs.gui.d.f) + "'>" + str2 + "</span></body></html>";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.o = !this.o;
        this.h.show(this.g, this.o ? b : c);
    }

    private Color b(c cVar) {
        return cVar.g() >= cVar.h() ? rs.gui.d.i : rs.gui.d.k;
    }

    public int a() {
        return this.p;
    }

    static {
        BufferedImage bufferedImageA = class_12.a((Image) class_12.b((Class<?>) d.class, "/util/arrow_right.png"), 0.25f);
        d = new ImageIcon(bufferedImageA);
        e = new ImageIcon(class_12.a(bufferedImageA, true, false));
    }
}
