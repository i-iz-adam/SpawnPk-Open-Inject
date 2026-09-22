package rs;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;

/* JADX INFO: loaded from: client-final.jar:rs/class_293.class */
public class class_293 extends class_315 {
    private static final Dimension t = new Dimension(504, 20);
    public static int r;
    public static int s;

    public class_293() {
        a(class_268.o);
        d(true);
        a("RaidTheatreBar");
        a(t);
        a(class_320.d);
        c(false);
        b(new Point(-1, -6));
        a(t);
    }

    @Override // rs.class_315
    public Dimension a(Graphics2D graphics2D) {
        s = graphics2D.getClipBounds().y;
        r = graphics2D.getClipBounds().x;
        return t;
    }
}
