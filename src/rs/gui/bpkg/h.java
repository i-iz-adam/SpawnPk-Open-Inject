package rs.gui.bpkg;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import rs.Client;
import rs.Configuration;
import rs.gui.F;
import rs.gui.Launcher;
import rs.gui.bpkg.apkg.A;
import rs.gui.bpkg.apkg.B;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/h.class */
public class h extends rs.ui.m {
    public static final String a = "Main folder";
    public static h b;
    public F c;
    private d e;
    private rs.gui.bpkg.bpkg.d f;
    private rs.gui.bpkg.cpkg.b g;
    public JComboBox<String> d;
    private JPopupMenu k;
    private JButton l;
    private A m;
    private Icon n;
    private Icon o;
    private Icon p;
    private Icon q;
    private Icon r;
    private Icon s;

    public h() {
        super(false);
        g.a();
        this.g = new rs.gui.bpkg.cpkg.b();
        this.f = new rs.gui.bpkg.bpkg.d(this);
        this.e = new d(this);
        c cVarA = this.f.a(a, true);
        if (!cVarA.isEmpty()) {
            this.e.put(a, cVarA);
            this.f.a(a, this.e.get(a));
        } else if (this.f.a().isEmpty()) {
            c cVar = new c(a);
            this.e.put(a, cVar);
            rs.gui.bpkg.c.a.a(a, cVar, this.f);
            this.e.a(a, cVar.get(0));
        }
        for (String str : this.f.a()) {
            this.e.put(str, this.f.a(str, false));
        }
        this.f.b();
        new File(rs.gui.bpkg.bpkg.d.e).delete();
        new File(rs.gui.bpkg.bpkg.d.e).delete();
        new File(rs.gui.bpkg.bpkg.d.e).delete();
        new File(rs.gui.bpkg.bpkg.d.b).delete();
        new File(rs.gui.bpkg.bpkg.d.c).delete();
        new File(rs.gui.bpkg.bpkg.d.d).delete();
        try {
            this.e.a((String) this.e.keySet().toArray()[0], 0);
        } catch (Exception e) {
            System.out.println("Loadout Error 120");
            if (Configuration.h.booleanValue()) {
                this.e.clear();
                c cVar2 = new c(a);
                this.e.put(a, cVar2);
                rs.gui.bpkg.c.a.a(a, cVar2, this.f);
                this.e.a(a, cVar2.get(0));
                this.f.b();
            }
        }
        JPanel jPanel = new JPanel();
        BoxLayout boxLayout = new BoxLayout(jPanel, 1);
        jPanel.setPreferredSize(new Dimension(350, 488));
        jPanel.setLayout(boxLayout);
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new BoxLayout(jPanel2, 1));
        jPanel2.setPreferredSize(new Dimension(350, 55));
        Iterator<JPanel> it = m().iterator();
        while (it.hasNext()) {
            jPanel2.add(it.next());
        }
        jPanel.add(jPanel2);
        this.c = new F();
        this.c.setPreferredSize(new Dimension(0, 400));
        this.c.setBackground(new Color(50, 50, 50));
        jPanel.add(this.c);
        add(jPanel, "North");
    }

    private List<JPanel> m() {
        ArrayList arrayList = new ArrayList();
        JPanel jPanel = new JPanel();
        if (Client.class.getResource("Client.class").toString().startsWith("file")) {
            this.n = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/folder.png"));
            this.o = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/create.png"));
            this.p = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/delete.png"));
            this.q = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/edit.png"));
            this.r = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/up.png"));
            this.s = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/down.png"));
        } else {
            try {
                this.n = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/folder.png")));
                this.o = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/create.png")));
                this.p = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/delete.png")));
                this.q = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/edit.png")));
                this.r = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/up.png")));
                this.s = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/down.png")));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        d();
        JButton jButtonA = B.a(this);
        JButton jButtonA2 = rs.gui.bpkg.a.Spellbook.a(this);
        this.l = new JButton("", this.n);
        this.l.setToolTipText("<html>Loadout folders</html>");
        this.l.setPreferredSize(new Dimension(38, 30));
        this.l.addMouseListener(new i(this));
        jPanel.add(jButtonA);
        jPanel.add(jButtonA2);
        jPanel.add(this.l);
        JPanel jPanel2 = new JPanel();
        rs.gui.bpkg.a.g gVar = new rs.gui.bpkg.apkg.g(this.o, this.e);
        gVar.setToolTipText("Create a new loadout");
        gVar.setPreferredSize(new Dimension(20, 25));
        JButton jButton = new JButton("", this.p);
        jButton.setToolTipText("Delete this loadout");
        jButton.setPreferredSize(new Dimension(20, 25));
        jButton.addActionListener(actionEvent -> {
            a aVarC = this.e.c();
            String strE = this.e.e();
            if (aVarC == null) {
                return;
            }
            JFrame jFrame = new JFrame("Delete " + aVarC.f() + "?");
            JButton jButton2 = new JButton("Yes, delete \"" + aVarC.f() + "\"");
            JButton jButton3 = new JButton("No, Nevermind.");
            JPanel jPanel3 = new JPanel();
            jFrame.setLayout(new FlowLayout());
            jFrame.setSize(400, 90);
            jFrame.setLocationRelativeTo(Launcher.n().i().getContentPane());
            jPanel3.add(jButton2);
            jPanel3.add(jButton3);
            jFrame.add(jPanel3);
            jButton2.addActionListener(new j(this, strE, aVarC, jFrame));
            jButton3.addActionListener(new k(this, jFrame));
            jFrame.setVisible(true);
        });
        JButton jButton2 = new JButton("", this.q);
        jButton2.setToolTipText("Rename the active loadout");
        jButton2.setPreferredSize(new Dimension(20, 25));
        jButton2.addActionListener(new l(this));
        JButton jButton3 = new JButton("", this.r);
        jButton3.setToolTipText("Move loadout up in the list");
        jButton3.setPreferredSize(new Dimension(20, 25));
        jButton3.addActionListener(new n(this));
        JButton jButton4 = new JButton("", this.s);
        jButton4.setToolTipText("Move loadout down in the list");
        jButton4.setPreferredSize(new Dimension(20, 25));
        jButton4.addActionListener(new o(this));
        addMouseListener(new p(this));
        a(0);
        jPanel2.add(gVar);
        jPanel2.add(jButton);
        jPanel2.add(this.d);
        jPanel2.add(jButton2);
        jPanel2.add(jButton3);
        jPanel2.add(jButton4);
        arrayList.add(jPanel);
        arrayList.add(jPanel2);
        return arrayList;
    }

    public void a(Graphics graphics) {
        this.g.a(graphics);
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        this.g.a(graphics);
    }

    public void a() {
        Launcher.n().b(20, true);
    }

    public void a(int i) {
        c cVarD = this.e.d();
        if (i < 0 || i >= cVarD.size()) {
            i = 0;
        }
        String[] strArr = new String[cVarD.size()];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            strArr[i2] = cVarD.get(i2).f();
        }
        if (this.d == null) {
            this.d = new rs.gui.bpkg.apkg.k(this.e, strArr);
        } else {
            DefaultComboBoxModel model = this.d.getModel();
            model.removeAllElements();
            for (String str : strArr) {
                model.addElement(str);
            }
            this.d.setModel(model);
        }
        this.e.a(this.e.e(), cVarD.get(this.d.getSelectedIndex()));
        if (i != 0) {
            this.d.setSelectedIndex(i);
        }
    }

    public void b() {
        a(0);
    }

    public void c() {
        if (this.m != null) {
            this.m.dispose();
            this.m = null;
        }
    }

    public void d() {
        this.k = rs.gui.bpkg.apkg.n.a(this);
    }

    public rs.gui.bpkg.bpkg.d e() {
        return this.f;
    }

    public d f() {
        return this.e;
    }

    public rs.gui.bpkg.cpkg.b g() {
        return this.g;
    }

    public JComboBox<String> h() {
        return this.d;
    }

    public JButton i() {
        return this.l;
    }

    public JPopupMenu j() {
        return this.k;
    }
}
