package rs.ui.components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.text.Document;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/i.class */
public class i extends JPanel {
    private final JTextField a;
    private Color b = rs.gui.d.c;
    private Color c;
    private boolean d;

    public i() {
        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(0, 10, 0, 0));
        this.a = new JTextField();
        this.a.setBorder((Border) null);
        this.a.setOpaque(false);
        this.a.setSelectedTextColor(Color.WHITE);
        this.a.setSelectionColor(rs.gui.d.b);
        add(this.a, "Center");
        this.a.addMouseListener(new j(this));
    }

    public void a(ActionListener actionListener) {
        this.a.addActionListener(actionListener);
    }

    public String a() {
        return this.a.getText();
    }

    public void a(String str) {
        this.a.setText(str);
    }

    public void addKeyListener(KeyListener keyListener) {
        this.a.addKeyListener(keyListener);
    }

    public void removeKeyListener(KeyListener keyListener) {
        this.a.removeKeyListener(keyListener);
    }

    public void setBackground(Color color) {
        a(color, true);
    }

    public boolean requestFocusInWindow() {
        return this.a.requestFocusInWindow();
    }

    public void a(Color color, boolean z) {
        if (color == null) {
            return;
        }
        super.setBackground(color);
        if (z) {
            this.b = color;
        }
    }

    public void a(Color color) {
        if (color == null) {
            return;
        }
        this.c = color;
    }

    public void a(boolean z) {
        this.d = !z;
        this.a.setEditable(z);
        this.a.setFocusable(z);
        if (z) {
            return;
        }
        super.setBackground(this.b);
    }

    public Document b() {
        return this.a.getDocument();
    }

    public JTextField c() {
        return this.a;
    }

    public Color d() {
        return this.b;
    }

    public Color e() {
        return this.c;
    }

    public boolean f() {
        return this.d;
    }
}
