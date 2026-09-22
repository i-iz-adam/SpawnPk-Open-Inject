package rs.ui.components.apkg;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.util.function.Consumer;
import javax.swing.JPanel;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/a/a.class */
public class a extends JPanel {
    private static final int a = 7;
    private final int b;
    private final BufferedImage c;
    private Point d;
    private int e;
    private boolean f;
    private Consumer<Color> g;

    a(int i) {
        this.b = i;
        this.c = new BufferedImage(i, i, 1);
        this.d = new Point(i, 0);
        setPreferredSize(new Dimension(i, i));
        addMouseMotionListener(new b(this));
        addMouseListener(new c(this));
    }

    void a(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        a();
        if (this.g != null) {
            this.g.accept(a(this.d.x, this.d.y));
        }
        paintImmediately(0, 0, this.b, this.b);
    }

    void a(int i, Color color) {
        Point pointA = a(color);
        if (this.e == i && pointA.x == this.d.x && pointA.y == this.d.y) {
            return;
        }
        this.e = i;
        a();
        a(pointA.x, pointA.y, false);
    }

    private Point a(Color color) {
        float[] fArrRGBtoHSB = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), (float[]) null);
        int i = this.b - 1;
        return new Point((int) (fArrRGBtoHSB[1] * i), i - ((int) (fArrRGBtoHSB[2] * i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2, boolean z) {
        if (this.d.x == i && this.d.y == i2 && !this.f) {
            return;
        }
        int iA = com.google.a.m.l.a(i, 0, this.b - 1);
        int iA2 = com.google.a.m.l.a(i2, 0, this.b - 1);
        this.d = new Point(iA, iA2);
        paintImmediately(0, 0, this.b, this.b);
        if (this.g != null && z) {
            this.g.accept(a(iA, iA2));
        }
        this.f = false;
    }

    public void paint(Graphics graphics) {
        graphics.drawImage(this.c, 0, 0, (ImageObserver) null);
        int i = this.d.x - 3;
        int i2 = this.d.y - 3;
        graphics.setColor(Color.WHITE);
        graphics.fillOval(i, i2, 7, 7);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(i, i2, 7, 7);
    }

    private void a() {
        Color hSBColor = Color.getHSBColor(1.0f - (this.e / (this.b - 1)), 1.0f, 1.0f);
        Graphics2D graphics2DCreateGraphics = this.c.createGraphics();
        GradientPaint gradientPaint = new GradientPaint(0.0f, 0.0f, Color.WHITE, this.b - 1, 0.0f, hSBColor);
        GradientPaint gradientPaint2 = new GradientPaint(0.0f, 0.0f, new Color(0, 0, 0, 0), 0.0f, this.b - 1, Color.BLACK);
        graphics2DCreateGraphics.setPaint(gradientPaint);
        graphics2DCreateGraphics.fillRect(0, 0, this.b, this.b);
        graphics2DCreateGraphics.setPaint(gradientPaint2);
        graphics2DCreateGraphics.fillRect(0, 0, this.b, this.b);
        graphics2DCreateGraphics.dispose();
        this.f = true;
    }

    private Color a(int i, int i2) {
        return new Color(this.c.getRGB(com.google.a.m.l.a(i, 0, this.b - 1), com.google.a.m.l.a(i2, 0, this.b - 1)));
    }

    public void a(Consumer<Color> consumer) {
        this.g = consumer;
    }
}
