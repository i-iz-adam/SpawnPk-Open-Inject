package rs.gui.cpkg;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import rs.Client;

/* JADX INFO: loaded from: client-final.jar:rs/gui/c/a.class */
public class a extends JPanel {
    private JLabel a;
    private JLabel b;
    private JLabel c;
    private JLabel d;
    private JLabel e;
    private JLabel f;
    private JLabel g;
    private JLabel h;
    private JLabel i;
    private JLabel j;
    private JLabel k;
    private JLabel l;
    private JLabel m;
    private JLabel n;
    private JLabel o;
    private JLabel p;
    private JLabel q;
    private JLabel r;
    private JLabel s;
    private JLabel t;
    private JLabel u;
    private JLabel v;
    private ImageIcon w;
    private ImageIcon x;
    private ImageIcon y;
    private ImageIcon z;
    private ImageIcon A;

    public a() {
        b();
        a();
    }

    public void a() {
        removeAll();
        setLayout(new BoxLayout(this, 1));
        JPanel jPanel = new JPanel();
        jPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 28));
        jPanel.add(new JLabel("<html><p style='font-size: 9px'><font style='bold' color='rgb(150,150,255)'>Type ::pvptracker to view overlay in-game</font></p></html>"));
        add(jPanel);
        add(Box.createRigidArea(new Dimension(0, 2)));
        JPanel jPanel2 = new JPanel();
        jPanel2.setBackground(new Color(15, 15, 15));
        jPanel2.setMaximumSize(new Dimension(Integer.MAX_VALUE, 32));
        jPanel2.add(new JLabel("<html><p style='font-size: 10px'><font style='bold' color='rgb(255,100,100)'><u>Most Recent 1v1 Fight</u></font></p></html>"));
        add(jPanel2);
        add(Box.createRigidArea(new Dimension(0, 5)));
        ImageIcon imageIcon = this.w;
        JLabel jLabel = new JLabel("<html><font style='bold'>N/A</font></html>");
        this.c = jLabel;
        a(imageIcon, jLabel, 16);
        ImageIcon imageIcon2 = this.y;
        JLabel jLabel2 = new JLabel("<html>Correct overheads: <font color='35FFA6'>0/0 (0%)</font></html>");
        this.g = jLabel2;
        a(imageIcon2, jLabel2, 20, new Dimension(10, 0));
        ImageIcon imageIcon3 = this.A;
        JLabel jLabel3 = new JLabel("<html>Spell casts: <font color='5AA8FF'>0/0 (0%)</font></html>");
        this.i = jLabel3;
        a(imageIcon3, jLabel3, 20, new Dimension(10, 0));
        ImageIcon imageIcon4 = this.z;
        JLabel jLabel4 = new JLabel("<html>Damage Dealt: <font color='FF6C3A'>0 (0)</font></html>");
        this.k = jLabel4;
        a(imageIcon4, jLabel4, 20, new Dimension(10, 0));
        add(Box.createRigidArea(new Dimension(0, 3)));
        add(Box.createRigidArea(new Dimension(0, 5)));
        ImageIcon imageIcon5 = this.w;
        JLabel jLabel5 = new JLabel("<html><font style='bold'>N/A</font></html>");
        this.m = jLabel5;
        a(imageIcon5, jLabel5, 16);
        ImageIcon imageIcon6 = this.y;
        JLabel jLabel6 = new JLabel("<html>Correct overheads: <font color='35FFA6'>0/0 (0%)</font></html>");
        this.q = jLabel6;
        a(imageIcon6, jLabel6, 20, new Dimension(10, 0));
        ImageIcon imageIcon7 = this.A;
        JLabel jLabel7 = new JLabel("<html>Spell casts: <font color='5AA8FF'>0/0 (0%)</font></html>");
        this.s = jLabel7;
        a(imageIcon7, jLabel7, 20, new Dimension(10, 0));
        ImageIcon imageIcon8 = this.z;
        JLabel jLabel8 = new JLabel("<html>Damage Dealt: <font color='FF6C3A'>0 (0)</font></html>");
        this.u = jLabel8;
        a(imageIcon8, jLabel8, 20, new Dimension(10, 0));
        add(Box.createRigidArea(new Dimension(0, 5)));
        JPanel jPanel3 = new JPanel();
        jPanel3.setBackground(new Color(15, 15, 15));
        jPanel3.setMaximumSize(new Dimension(Integer.MAX_VALUE, 32));
        jPanel3.add(new JLabel("<html><p style='font-size: 10px'><font style='bold' color='rgb(255,100,100)'><u>Previous 1v1 Fight</u></font></p></html>"));
        add(jPanel3);
        add(Box.createRigidArea(new Dimension(0, 5)));
        ImageIcon imageIcon9 = this.w;
        JLabel jLabel9 = new JLabel("<html><font style='bold'>N/A</font></html>");
        this.d = jLabel9;
        a(imageIcon9, jLabel9, 16);
        ImageIcon imageIcon10 = this.y;
        JLabel jLabel10 = new JLabel("<html>Correct overheads: <font color='35FFA6'>0/0 (0%)</font></html>");
        this.h = jLabel10;
        a(imageIcon10, jLabel10, 20, new Dimension(10, 0));
        ImageIcon imageIcon11 = this.A;
        JLabel jLabel11 = new JLabel("<html>Spell casts: <font color='5AA8FF'>0/0 (0%)</font></html>");
        this.j = jLabel11;
        a(imageIcon11, jLabel11, 20, new Dimension(10, 0));
        ImageIcon imageIcon12 = this.z;
        JLabel jLabel12 = new JLabel("<html>Damage Dealt: <font color='FF6C3A'>0 (0)</font></html>");
        this.l = jLabel12;
        a(imageIcon12, jLabel12, 20, new Dimension(10, 0));
        add(Box.createRigidArea(new Dimension(0, 3)));
        add(Box.createRigidArea(new Dimension(0, 5)));
        ImageIcon imageIcon13 = this.w;
        JLabel jLabel13 = new JLabel("<html><font style='bold'>N/A</font></html>");
        this.n = jLabel13;
        a(imageIcon13, jLabel13, 16);
        ImageIcon imageIcon14 = this.y;
        JLabel jLabel14 = new JLabel("<html>Correct overheads: <font color='35FFA6'>0/0 (0%)</font></html>");
        this.r = jLabel14;
        a(imageIcon14, jLabel14, 20, new Dimension(10, 0));
        ImageIcon imageIcon15 = this.A;
        JLabel jLabel15 = new JLabel("<html>Spell casts: <font color='5AA8FF'>0/0 (0%)</font></html>");
        this.t = jLabel15;
        a(imageIcon15, jLabel15, 20, new Dimension(10, 0));
        ImageIcon imageIcon16 = this.z;
        JLabel jLabel16 = new JLabel("<html>Damage Dealt: <font color='FF6C3A'>0 (0)</font></html>");
        this.v = jLabel16;
        a(imageIcon16, jLabel16, 20, new Dimension(10, 0));
        add(Box.createRigidArea(new Dimension(0, 5)));
    }

    public void a(int i, String str, String str2, String str3, String str4) {
        EventQueue.invokeLater(new b(this, i, str, str2, str3, str4));
    }

    public void b(int i, String str, String str2, String str3, String str4) {
        EventQueue.invokeLater(new c(this, i, str, str2, str3, str4));
    }

    private void a(ImageIcon imageIcon, JLabel jLabel, int i, Dimension dimension) {
        JPanel jPanel = new JPanel();
        jPanel.setBackground(new Color(15, 15, 15));
        jPanel.setLayout(new BoxLayout(jPanel, 0));
        jPanel.add(Box.createRigidArea(dimension));
        if (imageIcon != null) {
            jLabel.setIcon(imageIcon);
        }
        jPanel.add(jLabel);
        jPanel.add(Box.createHorizontalGlue());
        add(jPanel);
    }

    private void a(ImageIcon imageIcon, JLabel jLabel, int i) {
        a(imageIcon, jLabel, i, new Dimension(3, 0));
    }

    private void b() {
        if (Client.class.getResource("Client.class").toString().startsWith("file")) {
            this.w = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/ico_user.png"));
            this.x = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/ico_skull.png"));
            this.y = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/ico_pray.png"));
            this.z = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/ico_damage.png"));
            this.A = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/ico_magic.png"));
            return;
        }
        try {
            this.w = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/ico_user.png")));
            this.x = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/ico_skull.png")));
            this.y = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/ico_pray.png")));
            this.z = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/ico_damage.png")));
            this.A = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/ico_magic.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
