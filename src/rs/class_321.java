package rs;

import com.google.a.b.as;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import rs.gui.w;
import rs.lpkg.e;
import rs.runelite.a.i;

/* JADX INFO: loaded from: client-final.jar:rs/class_321.class */
public class class_321 {
    private static final int b = 4;
    private static final Stroke c = new BasicStroke(2.0f);
    private static final Stroke d = new BasicStroke(1.0f);
    public static final Color a = new Color(0, 0, 0, 50);

    public static void a(Graphics2D graphics2D, Shape shape, Color color) {
        a(graphics2D, shape, color, a());
    }

    public static void a(Graphics2D graphics2D, Shape shape, Color color, Stroke stroke) {
        a(graphics2D, shape, color, a, stroke);
    }

    public static void a(Graphics2D graphics2D, Shape shape, Color color, Color color2, Stroke stroke) {
        graphics2D.setColor(color);
        Stroke stroke2 = graphics2D.getStroke();
        graphics2D.setStroke(stroke);
        graphics2D.draw(shape);
        graphics2D.setColor(color2);
        graphics2D.fill(shape);
        graphics2D.setStroke(stroke2);
    }

    public static void b(Graphics2D graphics2D, Shape shape, Color color, Color color2, Stroke stroke) {
        graphics2D.setColor(color);
        Stroke stroke2 = graphics2D.getStroke();
        graphics2D.setStroke(stroke);
        graphics2D.draw(shape);
        graphics2D.setColor(class_9.a(color2, color2.getAlpha() / 5));
        graphics2D.fill(shape);
        graphics2D.setStroke(stroke2);
    }

    public static void a(Graphics2D graphics2D, i iVar, String str, Color color) {
        if (as.c(str)) {
            return;
        }
        int iA = iVar.a();
        int iB = iVar.b();
        graphics2D.setFont(w.b());
        graphics2D.setColor(Color.BLACK);
        graphics2D.drawString(str, iA + 1, iB + 1);
        graphics2D.setColor(class_9.a(color, 255));
        graphics2D.drawString(str, iA, iB);
    }

    public static Stroke a() {
        return e.a() ? d : c;
    }

    static void a(class_320 class_320Var, Rectangle rectangle, Rectangle rectangle2, int i) {
        int iMin = rectangle.x;
        int iMin2 = rectangle.y;
        switch (class_322.a[class_320Var.ordinal()]) {
            case 1:
                iMin = Math.max(iMin, rectangle2.x + rectangle2.width + i);
                break;
            case 2:
                iMin = Math.min(iMin, rectangle2.x - i);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                iMin2 = Math.max(iMin2, rectangle2.y + rectangle2.height + i);
                break;
            case 7:
                iMin2 = Math.min(iMin2, rectangle2.y - i);
                break;
            default:
                throw new IllegalArgumentException();
        }
        rectangle.x = iMin;
        rectangle.y = iMin2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Point a(class_320 class_320Var, Dimension dimension) {
        Point point = new Point();
        switch (class_322.a[class_320Var.ordinal()]) {
            case 1:
                point.y = -dimension.height;
                return point;
            case 2:
            case 7:
                point.y = -dimension.height;
                point.x = -dimension.width;
                return point;
            case 3:
                return point;
            case 4:
                point.x = (-dimension.width) / 2;
                return point;
            case 5:
            case 6:
                point.x = -dimension.width;
                return point;
            default:
                throw new IllegalArgumentException();
        }
    }
}
