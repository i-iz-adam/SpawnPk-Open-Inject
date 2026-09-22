package rs.ui.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/a.class */
public class a implements w {
    private static final int a = 2;
    private static final float b = 0.2f;
    private static final float c = 0.8f;
    private static final float d = 1.2f;
    private static final float e = 1.4f;
    private Color f;
    private Rectangle g;
    private boolean h;

    @Override // rs.ui.components.w
    public Dimension a(Graphics2D graphics2D) {
        Color color = new Color((int) (this.f.getRed() * c), (int) (this.f.getGreen() * c), (int) (this.f.getBlue() * c), Math.min(255, (int) (this.f.getAlpha() * e)));
        Color color2 = new Color(Math.min(255, (int) (this.f.getRed() * d)), Math.min(255, (int) (this.f.getGreen() * d)), Math.min(255, (int) (this.f.getBlue() * d)), Math.min(255, (int) (this.f.getAlpha() * e)));
        if (this.h) {
            graphics2D.setColor(this.f);
            graphics2D.fill(this.g);
        }
        Rectangle rectangle = new Rectangle();
        rectangle.setLocation(this.g.x, this.g.y);
        rectangle.setSize(this.g.width - 1, this.g.height - 1);
        graphics2D.setColor(color);
        graphics2D.draw(rectangle);
        Rectangle rectangle2 = new Rectangle();
        rectangle2.setLocation(this.g.x + 1, this.g.y + 1);
        rectangle2.setSize((this.g.width - 2) - 1, (this.g.height - 2) - 1);
        graphics2D.setColor(color2);
        graphics2D.draw(rectangle2);
        return new Dimension(this.g.getSize());
    }

    public a() {
        this.f = d.c;
        this.g = new Rectangle();
        this.h = true;
    }

    public a(Color color, Rectangle rectangle, boolean z) {
        this.f = d.c;
        this.g = new Rectangle();
        this.h = true;
        this.f = color;
        this.g = rectangle;
        this.h = z;
    }

    public void a(Color color) {
        this.f = color;
    }

    public void a(Rectangle rectangle) {
        this.g = rectangle;
    }

    public void a(boolean z) {
        this.h = z;
    }
}
