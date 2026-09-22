package rs;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Arc2D;

/* JADX INFO: loaded from: client-final.jar:rs/class_305.class */
public class class_305 extends class_310 {
    private static final double h = 26.0d;
    private static final int i = 0;

    @Override // rs.class_306
    public void a() {
        if (class_452.bH > 0) {
            float f = class_452.bH / class_452.bI;
            if (this.a.gZ == null || this.a.gZ.e == null || this.a.gZ.e.getGraphics() == null) {
                return;
            }
            a((Graphics2D) this.a.gZ.e.getGraphics(), this.e, this.f, f, Color.GREEN);
        }
    }

    private void a(Graphics2D graphics2D, int i2, int i3, double d, Color color) {
        if (d < 0.01d) {
            return;
        }
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        Rectangle rectangle = new Rectangle((int) (((double) i2) - (68.0d / 2.0d)), (int) (((double) i3) - (68.0d / 2.0d)), 45, 45);
        Arc2D.Double r0 = new Arc2D.Double(rectangle.x + 0, (((double) rectangle.y) + (((double) (rectangle.height / 2)) - 13.0d)) - 1.0d, 68.0d, 68.0d, 90.0d, (-360.0d) * d, 0);
        graphics2D.setStroke(new BasicStroke(3.0f, 0, 0));
        graphics2D.setColor(color);
        graphics2D.draw(r0);
    }
}
