package rs.ui.components;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/b.class */
public class b extends JButton {
    private static final int a = 120;
    private static final int b = 10;
    private Color c;

    public b(String str, Color color) {
        super(str);
        setContentAreaFilled(false);
        a(color);
    }

    public void a(Color color) {
        this.c = color;
        setForeground(((((0.299d * ((double) color.getRed())) + (0.587d * ((double) color.getGreen()))) + (0.114d * ((double) color.getBlue()))) / 255.0d > 0.5d || color.getAlpha() < 120) ? Color.BLACK : Color.WHITE);
    }

    public void paint(Graphics graphics) {
        if (this.c.getAlpha() != 255) {
            for (int i = 0; i < getWidth(); i += 10) {
                for (int i2 = 0; i2 < getHeight(); i2 += 10) {
                    graphics.setColor(((i / 10) + (i2 / 10)) % 2 == 0 ? Color.LIGHT_GRAY : Color.WHITE);
                    graphics.fillRect(i, i2, 10, 10);
                }
            }
        }
        graphics.setColor(this.c);
        graphics.fillRect(0, 0, getWidth(), getHeight());
        super.paint(graphics);
    }

    public Color a() {
        return this.c;
    }
}
