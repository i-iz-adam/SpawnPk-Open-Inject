package rs.ui.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/y.class */
public class y extends JPanel {
    private int a = 1;
    private int b;

    public y() {
        setForeground(Color.GREEN);
        setMaximumSize(new Dimension(Integer.MAX_VALUE, 4));
        setMinimumSize(new Dimension(0, 4));
        setPreferredSize(new Dimension(0, 4));
        setSize(new Dimension(0, 4));
        setOpaque(true);
    }

    public double a() {
        return (this.b * 100) / this.a;
    }

    public void setForeground(Color color) {
        super.setForeground(color);
        setBackground(color.darker().darker());
    }

    public void a(int i) {
        if (i < 1) {
            i = 1;
        }
        this.a = i;
        repaint();
    }

    public void b(int i) {
        this.b = i;
        repaint();
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        int width = getWidth();
        int height = getHeight();
        int i = (this.b * width) / this.a;
        graphics.setColor(getBackground());
        graphics.fillRect(i, 0, width, height);
        graphics.setColor(getForeground());
        graphics.fillRect(0, 0, i, height);
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }
}
