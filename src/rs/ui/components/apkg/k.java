package rs.ui.components.apkg;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.function.Consumer;
import javax.swing.JPanel;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/a/k.class */
public class k extends JPanel {
    private static final int a = 15;
    private static final int b = 4;
    private final int c;
    private int d;
    private Consumer<Integer> e;

    k(int i) {
        this.c = i;
        setPreferredSize(new Dimension(15, i));
        addMouseMotionListener(new l(this));
        addMouseListener(new m(this));
    }

    public void a(Color color) {
        this.d = b(color);
        paintImmediately(0, 0, 15, this.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        int iA = com.google.a.m.l.a(i, 0, this.c - 1);
        if (iA == this.d) {
            return;
        }
        this.d = iA;
        paintImmediately(0, 0, 15, this.c);
        if (this.e != null) {
            this.e.accept(Integer.valueOf(iA));
        }
    }

    private int b(Color color) {
        float f = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), (float[]) null)[0];
        int i = this.c - 1;
        return Math.round(i - (f * i));
    }

    public void paint(Graphics graphics) {
        for (int i = 0; i < this.c; i++) {
            graphics.setColor(b(i));
            graphics.fillRect(0, i, 15, 1);
        }
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, this.d - 1, 15, 4);
        graphics.setColor(Color.BLACK);
        graphics.drawLine(0, this.d - 2, 15, this.d - 2);
        graphics.drawLine(0, this.d + 2, 15, this.d + 2);
    }

    private Color b(int i) {
        return Color.getHSBColor(1.0f - (i / (this.c - 1)), 1.0f, 1.0f);
    }

    public int a() {
        return this.d;
    }

    public void a(Consumer<Integer> consumer) {
        this.e = consumer;
    }
}
