package rs.ui.components.apkg;

import com.google.a.b.as;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;
import java.util.function.Consumer;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;
import org.pushingpixels.substance.internal.SubstanceSynapse;
import rs.class_139;
import rs.class_332;
import rs.class_9;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/a/q.class */
public class q extends JDialog {
    static final String a = "colorpicker";
    private static final int b = 410;
    private static final int c = 380;
    private static final int d = 160;
    private static final String e = "#000";
    private final a f;
    private final k g;
    private final n h;
    private final e i;
    private final e j;
    private final e k;
    private final e l;
    private final JTextField m;
    private final boolean n;
    private Color o;
    private Consumer<Color> p;
    private Consumer<Color> q;

    q(Window window, Color color, String str, boolean z, class_139 class_139Var, d dVar) {
        super(window, "Color Picker - " + str, Dialog.ModalityType.MODELESS);
        this.f = new a(160);
        this.g = new k(160);
        this.h = new n();
        this.i = new e("Red");
        this.j = new e("Green");
        this.k = new e("Blue");
        this.l = new e("Opacity");
        this.m = new JTextField();
        this.o = color;
        this.n = z;
        o oVar = new o(class_139Var);
        setDefaultCloseOperation(2);
        setResizable(false);
        setSize(b, c);
        setBackground(rs.gui.d.i);
        setDefaultCloseOperation(2);
        JPanel jPanel = new JPanel(new BorderLayout());
        jPanel.putClientProperty(SubstanceSynapse.COLORIZATION_FACTOR, Double.valueOf(1.0d));
        jPanel.setBorder(new EmptyBorder(15, 15, 15, 15));
        JPanel jPanel2 = new JPanel(new BorderLayout(15, 0));
        JPanel jPanel3 = new JPanel(new BorderLayout(15, 0));
        jPanel3.add(this.g, "West");
        jPanel3.add(this.f, "Center");
        JPanel jPanel4 = new JPanel();
        jPanel4.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.insets = new Insets(0, 0, 0, 0);
        JLabel jLabel = new JLabel("Previous");
        jLabel.setHorizontalAlignment(0);
        JLabel jLabel2 = new JLabel(" Current ");
        jLabel2.setHorizontalAlignment(0);
        n nVar = new n();
        nVar.a(color);
        this.h.a(color);
        JPanel jPanel5 = new JPanel(new GridBagLayout());
        JLabel jLabel3 = new JLabel("#");
        this.m.setBackground(rs.gui.d.c);
        JLabel jLabel4 = new JLabel("Hex color");
        jLabel4.setVerticalAlignment(3);
        gridBagConstraints.weightx = 0.0d;
        gridBagConstraints.fill = 1;
        gridBagConstraints.insets = new Insets(0, 1, 0, 1);
        jPanel5.add(jLabel3, gridBagConstraints);
        gridBagConstraints.weightx = 1.0d;
        gridBagConstraints.fill = 2;
        gridBagConstraints.gridwidth = 0;
        jPanel5.add(this.m, gridBagConstraints);
        gridBagConstraints.fill = 1;
        gridBagConstraints.weightx = 1.0d;
        gridBagConstraints.weighty = 1.0d;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridx = 0;
        jPanel4.add(oVar.a(color2 -> {
            if (!z) {
                this.l.a(color2.getAlpha());
            }
            a(color2);
            b();
        }, z), gridBagConstraints);
        gridBagConstraints.gridwidth = -1;
        gridBagConstraints.gridy++;
        jPanel4.add(jLabel, gridBagConstraints);
        gridBagConstraints.gridx++;
        jPanel4.add(jLabel2, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy++;
        gridBagConstraints.gridwidth = -1;
        gridBagConstraints.fill = 1;
        jPanel4.add(nVar, gridBagConstraints);
        gridBagConstraints.gridx++;
        jPanel4.add(this.h, gridBagConstraints);
        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy++;
        jPanel4.add(jLabel4, gridBagConstraints);
        gridBagConstraints.gridy++;
        gridBagConstraints.fill = 2;
        jPanel4.add(jPanel5, gridBagConstraints);
        JPanel jPanel6 = new JPanel(new GridLayout(4, 1, 0, 10));
        jPanel6.setBorder(new EmptyBorder(15, 0, 0, 0));
        jPanel6.add(this.i);
        jPanel6.add(this.j);
        jPanel6.add(this.k);
        jPanel6.add(this.l);
        if (z) {
            this.l.setVisible(false);
            setSize(b, class_332.l);
        }
        jPanel2.add(jPanel3, "West");
        jPanel2.add(jPanel4, "Center");
        jPanel2.add(jPanel6, "South");
        jPanel.add(jPanel2, "North");
        setContentPane(jPanel);
        nVar.addMouseListener(new r(this, z, nVar));
        this.g.a(num -> {
            this.f.a(num.intValue());
            c();
        });
        this.f.a(this::a);
        this.m.getDocument().setDocumentFilter(new s(this));
        this.m.addFocusListener(new t(this));
        this.m.addActionListener(actionEvent -> {
            d();
        });
        this.i.a(num2 -> {
            a(new Color(num2.intValue(), this.o.getGreen(), this.o.getBlue()));
            b();
        });
        this.j.a(num3 -> {
            a(new Color(this.o.getRed(), num3.intValue(), this.o.getBlue()));
            b();
        });
        this.k.a(num4 -> {
            a(new Color(this.o.getRed(), this.o.getGreen(), num4.intValue()));
            b();
        });
        this.l.a(num5 -> {
            a(new Color(this.o.getRed(), this.o.getGreen(), this.o.getBlue(), num5.intValue()));
        });
        b();
        c();
        addWindowListener(new u(this, color, oVar, dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.g.a(this.o);
        this.f.a(this.g.a(), this.o);
    }

    private void c() {
        this.m.setText((this.n ? class_9.c(a()) : class_9.d(a())).toUpperCase());
        this.h.a(this.o);
        this.i.a(this.o.getRed());
        this.j.a(this.o.getGreen());
        this.k.a(this.o.getBlue());
        if (this.n) {
            return;
        }
        this.l.a(this.o.getAlpha());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Color color) {
        if (color == this.o) {
            return;
        }
        this.o = color;
        if (this.o.getAlpha() != this.l.a()) {
            this.o = new Color(this.o.getRed(), this.o.getGreen(), this.o.getBlue(), this.l.a());
        }
        c();
        if (this.p != null) {
            this.p.accept(this.o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        String text = this.m.getText();
        if (as.c(text)) {
            text = e;
        }
        Color colorD = class_9.d(text);
        if (colorD == null) {
            return;
        }
        if (!this.n && class_9.a(text)) {
            this.l.a(colorD.getAlpha());
        }
        a(colorD);
        b();
    }

    public void setLocationRelativeTo(Component component) {
        if (getOwner() == null) {
            super.setLocationRelativeTo(component);
            return;
        }
        GraphicsConfiguration graphicsConfiguration = getOwner().getGraphicsConfiguration();
        Insets screenInsets = Toolkit.getDefaultToolkit().getScreenInsets(graphicsConfiguration);
        Rectangle bounds = graphicsConfiguration.getBounds();
        bounds.setRect(bounds.x + screenInsets.left, bounds.y + screenInsets.top, (bounds.width - screenInsets.left) - screenInsets.right, (bounds.height - screenInsets.top) - screenInsets.bottom);
        Dimension size = component.getSize();
        Point locationOnScreen = component.getLocationOnScreen();
        Dimension size2 = getSize();
        int i = locationOnScreen.x + ((size.width - size2.width) / 2);
        int i2 = locationOnScreen.y + ((size.height - size2.height) / 2);
        if (i2 + size2.height > bounds.y + bounds.height) {
            i2 = (bounds.y + bounds.height) - size2.height;
        }
        if (i2 < bounds.y) {
            i2 = bounds.y;
        }
        if (i + size2.width > bounds.x + bounds.width) {
            i = (bounds.x + bounds.width) - size2.width;
        }
        if (i < bounds.x) {
            i = bounds.x;
        }
        setLocation(i, i2);
    }

    static String a(DocumentFilter.FilterBypass filterBypass, int i, int i2, String str) {
        Document document = filterBypass.getDocument();
        StringBuilder sb = new StringBuilder(document.getText(0, document.getLength()));
        sb.replace(i, i + i2, str);
        return sb.toString();
    }

    public Color a() {
        return this.o;
    }

    public void a(Consumer<Color> consumer) {
        this.p = consumer;
    }

    public void b(Consumer<Color> consumer) {
        this.q = consumer;
    }
}
