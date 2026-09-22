package rs;

import java.awt.Rectangle;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: client-final.jar:rs/class_311.class */
final class class_311 {
    private final Rectangle a;
    private final Rectangle b;
    private final Rectangle c;
    private final Rectangle d;
    private final Rectangle e;
    private final Rectangle f;
    private final Rectangle g;

    class_311(class_311 class_311Var) {
        this.a = new Rectangle(class_311Var.a);
        this.b = new Rectangle(class_311Var.b);
        this.c = new Rectangle(class_311Var.c);
        this.d = new Rectangle(class_311Var.d);
        this.e = new Rectangle(class_311Var.e);
        this.f = new Rectangle(class_311Var.f);
        this.g = new Rectangle(class_311Var.g);
    }

    class_311 a(int i, int i2) {
        class_311 class_311Var = new class_311(this);
        class_311Var.d().translate(i, 0);
        class_311Var.c().translate(i / 2, 0);
        class_311Var.e().translate(0, i2);
        class_311Var.f().translate(i, i2);
        class_311Var.g().translate(i, i2);
        class_311Var.h().translate(i, 0);
        return class_311Var;
    }

    Rectangle a(class_320 class_320Var) {
        switch (class_320Var) {
            case c:
                return this.a;
            case d:
                return this.b;
            case e:
                return this.c;
            case f:
                return this.d;
            case g:
                return this.e;
            case h:
                return this.f;
            case i:
                return this.g;
            default:
                throw new IllegalArgumentException();
        }
    }

    class_320 a(Rectangle rectangle) {
        if (rectangle == this.a) {
            return class_320.c;
        }
        if (rectangle == this.b) {
            return class_320.d;
        }
        if (rectangle == this.c) {
            return class_320.e;
        }
        if (rectangle == this.d) {
            return class_320.f;
        }
        if (rectangle == this.e) {
            return class_320.g;
        }
        if (rectangle == this.f) {
            return class_320.h;
        }
        if (rectangle == this.g) {
            return class_320.i;
        }
        throw new IllegalArgumentException();
    }

    Collection<Rectangle> a() {
        return Arrays.asList(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public Rectangle b() {
        return this.a;
    }

    public Rectangle c() {
        return this.b;
    }

    public Rectangle d() {
        return this.c;
    }

    public Rectangle e() {
        return this.d;
    }

    public Rectangle f() {
        return this.e;
    }

    public Rectangle g() {
        return this.f;
    }

    public Rectangle h() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof class_311)) {
            return false;
        }
        class_311 class_311Var = (class_311) obj;
        Rectangle rectangleB = b();
        Rectangle rectangleB2 = class_311Var.b();
        if (rectangleB == null) {
            if (rectangleB2 != null) {
                return false;
            }
        } else if (!rectangleB.equals(rectangleB2)) {
            return false;
        }
        Rectangle rectangleC = c();
        Rectangle rectangleC2 = class_311Var.c();
        if (rectangleC == null) {
            if (rectangleC2 != null) {
                return false;
            }
        } else if (!rectangleC.equals(rectangleC2)) {
            return false;
        }
        Rectangle rectangleD = d();
        Rectangle rectangleD2 = class_311Var.d();
        if (rectangleD == null) {
            if (rectangleD2 != null) {
                return false;
            }
        } else if (!rectangleD.equals(rectangleD2)) {
            return false;
        }
        Rectangle rectangleE = e();
        Rectangle rectangleE2 = class_311Var.e();
        if (rectangleE == null) {
            if (rectangleE2 != null) {
                return false;
            }
        } else if (!rectangleE.equals(rectangleE2)) {
            return false;
        }
        Rectangle rectangleF = f();
        Rectangle rectangleF2 = class_311Var.f();
        if (rectangleF == null) {
            if (rectangleF2 != null) {
                return false;
            }
        } else if (!rectangleF.equals(rectangleF2)) {
            return false;
        }
        Rectangle rectangleG = g();
        Rectangle rectangleG2 = class_311Var.g();
        if (rectangleG == null) {
            if (rectangleG2 != null) {
                return false;
            }
        } else if (!rectangleG.equals(rectangleG2)) {
            return false;
        }
        Rectangle rectangleH = h();
        Rectangle rectangleH2 = class_311Var.h();
        if (rectangleH == null) {
            return rectangleH2 == null;
        }
        return rectangleH.equals(rectangleH2);
    }

    public int hashCode() {
        Rectangle rectangleB = b();
        int iHashCode = (1 * 59) + (rectangleB == null ? 43 : rectangleB.hashCode());
        Rectangle rectangleC = c();
        int iHashCode2 = (iHashCode * 59) + (rectangleC == null ? 43 : rectangleC.hashCode());
        Rectangle rectangleD = d();
        int iHashCode3 = (iHashCode2 * 59) + (rectangleD == null ? 43 : rectangleD.hashCode());
        Rectangle rectangleE = e();
        int iHashCode4 = (iHashCode3 * 59) + (rectangleE == null ? 43 : rectangleE.hashCode());
        Rectangle rectangleF = f();
        int iHashCode5 = (iHashCode4 * 59) + (rectangleF == null ? 43 : rectangleF.hashCode());
        Rectangle rectangleG = g();
        int iHashCode6 = (iHashCode5 * 59) + (rectangleG == null ? 43 : rectangleG.hashCode());
        Rectangle rectangleH = h();
        return (iHashCode6 * 59) + (rectangleH == null ? 43 : rectangleH.hashCode());
    }

    public String toString() {
        return "OverlayBounds(topLeft=" + String.valueOf(b()) + ", topCenter=" + String.valueOf(c()) + ", topRight=" + String.valueOf(d()) + ", bottomLeft=" + String.valueOf(e()) + ", bottomRight=" + String.valueOf(f()) + ", aboveChatboxRight=" + String.valueOf(g()) + ", canvasTopRight=" + String.valueOf(h()) + ")";
    }

    public class_311(Rectangle rectangle, Rectangle rectangle2, Rectangle rectangle3, Rectangle rectangle4, Rectangle rectangle5, Rectangle rectangle6, Rectangle rectangle7) {
        this.a = rectangle;
        this.b = rectangle2;
        this.c = rectangle3;
        this.d = rectangle4;
        this.e = rectangle5;
        this.f = rectangle6;
        this.g = rectangle7;
    }
}
