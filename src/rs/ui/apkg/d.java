package rs.ui.apkg;

import com.google.a.b.as;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import rs.gui.w;
import rs.ui.components.q;
import rs.ui.components.x;

/* JADX INFO: loaded from: client-final.jar:rs/ui/a/d.class */
public class d implements q {
    private static final int a = 3;
    private static final int b = 32;
    private String c;
    private String g;
    private Font i;
    private boolean j;
    private BufferedImage l;
    private c m;
    private final Rectangle d = new Rectangle();
    private Point e = new Point();
    private Dimension f = new Dimension(32, 32);
    private Color h = Color.WHITE;
    private Color k = rs.ui.components.d.c;

    @Override // rs.ui.components.w
    public Dimension a(Graphics2D graphics2D) {
        if (this.l == null) {
            return new Dimension();
        }
        graphics2D.setFont(d() < 32 ? w.b() : this.i);
        int i = this.e.x;
        int i2 = this.e.y;
        FontMetrics fontMetrics = graphics2D.getFontMetrics();
        int iD = d();
        Rectangle rectangle = new Rectangle(i, i2, iD, iD);
        rs.ui.components.a aVar = new rs.ui.components.a();
        aVar.a(this.k);
        aVar.a(rectangle);
        aVar.a(graphics2D);
        graphics2D.drawImage(this.l, i + ((iD - this.l.getWidth((ImageObserver) null)) / 2), i2 + ((iD - this.l.getHeight((ImageObserver) null)) / 2), (ImageObserver) null);
        if (!as.c(this.g)) {
            x xVar = new x();
            xVar.a(this.h);
            xVar.a(this.j);
            xVar.a(this.g);
            xVar.a(new Point(i + ((iD - fontMetrics.stringWidth(this.g)) / 2), (i2 + iD) - 3));
            xVar.a(graphics2D);
        }
        this.d.setBounds(rectangle);
        return rectangle.getSize();
    }

    private int d() {
        return Math.max(this.f.width, this.f.height);
    }

    public void a(String str) {
        this.c = str;
    }

    @Override // rs.ui.components.q
    public void a(Point point) {
        this.e = point;
    }

    @Override // rs.ui.components.q
    public void a(Dimension dimension) {
        this.f = dimension;
    }

    public void b(String str) {
        this.g = str;
    }

    public void a(Color color) {
        this.h = color;
    }

    public void a(Font font) {
        this.i = font;
    }

    public void a(boolean z) {
        this.j = z;
    }

    public void b(Color color) {
        this.k = color;
    }

    public void a(BufferedImage bufferedImage) {
        this.l = bufferedImage;
    }

    public void a(c cVar) {
        this.m = cVar;
    }

    public String b() {
        return this.c;
    }

    @Override // rs.ui.components.q
    public Rectangle a() {
        return this.d;
    }

    public c c() {
        return this.m;
    }
}
