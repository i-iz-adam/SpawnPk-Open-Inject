package rs.ui.components.bpkg;

import com.google.a.b.as;
import java.awt.Color;
import java.util.function.BooleanSupplier;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/b/a.class */
public class a extends JLabel {
    private static final Border a = new CompoundBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, rs.gui.d.a), BorderFactory.createEmptyBorder(5, 10, 4, 10));
    private static final Border b = BorderFactory.createEmptyBorder(5, 10, 5, 10);
    private final JComponent c;
    private BooleanSupplier d;
    private boolean e;

    public a(String str, e eVar, JComponent jComponent) {
        super(str);
        this.c = jComponent;
        if (this.e) {
            a();
        } else {
            b();
        }
        addMouseListener(new b(this, eVar));
        if (as.c(str)) {
            return;
        }
        addMouseListener(new c(this));
    }

    public a(ImageIcon imageIcon, e eVar, JComponent jComponent) {
        this("", eVar, jComponent);
        setIcon(imageIcon);
        setOpaque(true);
        setVerticalAlignment(0);
        setHorizontalAlignment(0);
        setBackground(rs.gui.d.c);
        addMouseListener(new d(this));
    }

    public boolean a() {
        if (this.d != null && !this.d.getAsBoolean()) {
            return false;
        }
        setBorder(a);
        setForeground(Color.WHITE);
        this.e = true;
        return true;
    }

    public void b() {
        setBorder(b);
        setForeground(Color.GRAY);
        this.e = false;
    }

    public JComponent c() {
        return this.c;
    }

    public void a(BooleanSupplier booleanSupplier) {
        this.d = booleanSupplier;
    }

    public boolean d() {
        return this.e;
    }
}
