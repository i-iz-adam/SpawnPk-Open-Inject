package rs.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

/* JADX INFO: loaded from: client-final.jar:rs/ui/m.class */
public class m extends JPanel {
    public static final int h = 350;
    public static final int i = 17;
    public static final int j = 6;
    private static final EmptyBorder a = new EmptyBorder(6, 6, 6, 6);
    private static final Dimension b = new Dimension(367, 0);
    private final JScrollPane c;
    private final JPanel d;

    protected m() {
        this(true);
    }

    protected m(boolean z) {
        if (!z) {
            this.c = null;
            this.d = this;
            return;
        }
        setBorder(a);
        setLayout(new j(0, 1, 0, 3));
        setBackground(rs.gui.d.d);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add(this, "North");
        jPanel.setBackground(rs.gui.d.d);
        this.c = new JScrollPane(jPanel);
        this.c.setHorizontalScrollBarPolicy(31);
        this.d = new JPanel();
        this.d.setPreferredSize(b);
        this.d.setLayout(new BorderLayout());
        this.d.add(this.c, "Center");
    }

    public Dimension getPreferredSize() {
        return new Dimension(this == this.d ? 367 : 350, super.getPreferredSize().height);
    }

    public void J_() {
    }

    public void K_() {
    }

    protected JScrollPane k() {
        return this.c;
    }

    public JPanel l() {
        return this.d;
    }
}
