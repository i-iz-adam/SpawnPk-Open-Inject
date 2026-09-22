package rs;

import java.awt.Color;
import java.awt.Polygon;

/* JADX INFO: loaded from: client-final.jar:rs/class_258.class */
public class class_258 {
    public Polygon a;
    public Object b;
    public Color c;
    public Color d;
    public Color e = new Color(0, 0, 0, 50);
    public Color f = new Color(0, 0, 0, 50);
    public boolean g;
    public int h;

    public class_258(Object obj, Polygon polygon, Color color, Color color2, int i) {
        this.a = polygon;
        this.c = color;
        this.d = color2;
        this.h = i;
        this.b = obj;
    }

    public Color a() {
        return this.g ? this.d : this.c;
    }

    public Color b() {
        return this.g ? this.f : this.e;
    }
}
