package rs.ui.components.apkg;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/a/n.class */
class n extends JPanel {
    private static final int a = 10;
    private Color b;

    n() {
    }

    void a(Color color) {
        this.b = color;
        paintImmediately(0, 0, getWidth(), getHeight());
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        if (this.b.getAlpha() != 255) {
            for (int i = 0; i < getWidth(); i += 10) {
                for (int i2 = 0; i2 < getHeight(); i2 += 10) {
                    graphics.setColor(((i / 10) + (i2 / 10)) % 2 == 0 ? Color.LIGHT_GRAY : Color.WHITE);
                    graphics.fillRect(i, i2, 10, 10);
                }
            }
        }
        graphics.setColor(this.b);
        graphics.fillRect(0, 0, getWidth(), getHeight());
    }

    public Color a() {
        return this.b;
    }
}
