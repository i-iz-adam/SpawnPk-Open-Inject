package rs.ui.components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.text.Document;
import org.apache.commons.a.F;
import rs.gui.M;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/k.class */
public class k extends JPanel {
    private final JLabel b;
    private final i c;
    private final JButton d;
    private final JButton e;
    private final DefaultListModel<String> f;
    private final List<Runnable> g = new ArrayList();
    static final /* synthetic */ boolean a;

    /* JADX INFO: loaded from: client-final.jar:rs/ui/components/k$a.class */
    public enum a {
        a("search.png"),
        b("loading_spinner.gif"),
        c("loading_spinner_darker.gif"),
        d("error.png");

        private final String e;

        public String a() {
            return this.e;
        }

        a(String str) {
            this.e = str;
        }
    }

    public k() {
        setLayout(new BorderLayout());
        this.b = new JLabel();
        this.b.setPreferredSize(new Dimension(30, 0));
        this.b.setVerticalAlignment(0);
        this.b.setHorizontalAlignment(0);
        this.c = new i();
        this.c.setBorder(null);
        JTextField jTextFieldC = this.c.c();
        jTextFieldC.removeMouseListener(jTextFieldC.getMouseListeners()[jTextFieldC.getMouseListeners().length - 1]);
        MouseListener lVar = new l(this);
        this.c.addMouseListener(lVar);
        jTextFieldC.addMouseListener(lVar);
        this.d = a(rs.gui.d.j, Color.PINK, rs.gui.w.c());
        this.d.setText("×");
        this.d.addActionListener(actionEvent -> {
            a((String) null);
            Iterator<Runnable> it = this.g.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        });
        this.f = new DefaultListModel<>();
        this.f.addListDataListener(new m(this));
        JList jList = new JList();
        jList.setSelectionMode(0);
        jList.setModel(this.f);
        jList.addListSelectionListener(listSelectionEvent -> {
            String str = (String) jList.getSelectedValue();
            if (str == null) {
                return;
            }
            this.c.a(str);
            this.c.c().selectAll();
            this.c.c().requestFocusInWindow();
        });
        JPopupMenu jPopupMenu = new JPopupMenu();
        jPopupMenu.setLightWeightPopupEnabled(true);
        jPopupMenu.setLayout(new BorderLayout());
        jPopupMenu.add(jList, "Center");
        jPopupMenu.addFocusListener(new n(this, jPopupMenu, jList));
        this.e = a(rs.gui.d.f, rs.gui.d.e, rs.gui.w.e());
        this.e.setText("▾");
        this.e.addActionListener(actionEvent2 -> {
            jPopupMenu.setPopupSize(getWidth(), jList.getPreferredSize().height);
            jPopupMenu.show(this, 0, this.e.getHeight());
            jPopupMenu.revalidate();
            jPopupMenu.requestFocusInWindow();
        });
        this.c.c().getDocument().addDocumentListener(new o(this));
        JPanel jPanel = new JPanel();
        jPanel.setBackground(new Color(0, 0, 0, 0));
        jPanel.setOpaque(false);
        jPanel.setLayout(new BorderLayout());
        jPanel.add(this.d, "East");
        jPanel.add(this.e, "West");
        d();
        add(this.b, "West");
        add(this.c, "Center");
        add(jPanel, "East");
    }

    private JButton a(Color color, Color color2, Font font) {
        JButton jButton = new JButton();
        jButton.setPreferredSize(new Dimension(30, 0));
        jButton.setFont(font);
        jButton.setBorder((Border) null);
        jButton.setRolloverEnabled(true);
        M.a((AbstractButton) jButton);
        jButton.setForeground(color);
        jButton.addMouseListener(new p(this, jButton, color2, color));
        return jButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        boolean zC = F.c((CharSequence) this.c.a());
        this.d.setVisible(!zC);
        this.e.setVisible(!this.f.isEmpty() && zC);
    }

    public void a(ActionListener actionListener) {
        this.c.a(actionListener);
    }

    public void a(a aVar) {
        this.b.setIcon(new ImageIcon(getClass().getResource(aVar.a())));
    }

    public void a(ImageIcon imageIcon) {
        this.b.setIcon(imageIcon);
    }

    public String a() {
        return this.c.a();
    }

    public void a(String str) {
        if (!a && !SwingUtilities.isEventDispatchThread()) {
            throw new AssertionError();
        }
        this.c.a(str);
    }

    public void setBackground(Color color) {
        if (color == null) {
            return;
        }
        super.setBackground(color);
        if (this.c != null) {
            this.c.setBackground(color);
        }
    }

    public void a(Color color) {
        if (color == null) {
            return;
        }
        this.c.a(color);
    }

    public void addKeyListener(KeyListener keyListener) {
        this.c.addKeyListener(keyListener);
    }

    public void a(Runnable runnable) {
        this.g.add(runnable);
    }

    public void removeKeyListener(KeyListener keyListener) {
        this.c.removeKeyListener(keyListener);
    }

    public void a(boolean z) {
        this.c.a(z);
        if (z) {
            return;
        }
        super.setBackground(this.c.d());
    }

    public boolean requestFocusInWindow() {
        super.requestFocusInWindow();
        return this.c.requestFocusInWindow();
    }

    public Document b() {
        return this.c.b();
    }

    public DefaultListModel<String> c() {
        return this.f;
    }

    static {
        a = !k.class.desiredAssertionStatus();
    }
}
