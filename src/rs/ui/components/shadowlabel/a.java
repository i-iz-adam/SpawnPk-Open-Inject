package rs.ui.components.shadowlabel;

import java.awt.Color;
import java.awt.Point;
import javax.swing.JLabel;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/shadowlabel/a.class */
public class a extends JLabel {
    private Color a;
    private Point b;

    public a() {
        this.a = Color.BLACK;
        this.b = new Point(1, 1);
        setUI(new JShadowedLabelUI());
    }

    public a(String str) {
        super(str);
        this.a = Color.BLACK;
        this.b = new Point(1, 1);
        setUI(new JShadowedLabelUI());
    }

    public void a(Color color) {
        this.a = color;
        repaint();
    }

    public void a(Point point) {
        this.b = point;
        revalidate();
        repaint();
    }

    public Color a() {
        return this.a;
    }

    public Point b() {
        return this.b;
    }
}
