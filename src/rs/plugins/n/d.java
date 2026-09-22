package rs.plugins.n;

import java.awt.TrayIcon;
import rs.class_144;
import rs.class_146;
import rs.lpkg.j;

/* JADX INFO: loaded from: client-final.jar:rs/s/n/d.class */
/* synthetic */ class d {
    static final /* synthetic */ int[] e = new int[TrayIcon.MessageType.values().length];

    static {
        try {
            e[TrayIcon.MessageType.WARNING.ordinal()] = 1;
        } catch (NoSuchFieldError e2) {
        }
        try {
            e[TrayIcon.MessageType.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError e3) {
        }
        d = new int[j.values().length];
        try {
            d[j.c.ordinal()] = 1;
        } catch (NoSuchFieldError e4) {
        }
        try {
            d[j.b.ordinal()] = 2;
        } catch (NoSuchFieldError e5) {
        }
        c = new int[class_144.values().length];
        try {
            c[class_144.b.ordinal()] = 1;
        } catch (NoSuchFieldError e6) {
        }
        try {
            c[class_144.c.ordinal()] = 2;
        } catch (NoSuchFieldError e7) {
        }
        try {
            c[class_144.e.ordinal()] = 3;
        } catch (NoSuchFieldError e8) {
        }
        try {
            c[class_144.d.ordinal()] = 4;
        } catch (NoSuchFieldError e9) {
        }
        b = new int[c.a.values().length];
        try {
            b[c.a.a.ordinal()] = 1;
        } catch (NoSuchFieldError e10) {
        }
        a = new int[class_146.values().length];
        try {
            a[class_146.b.ordinal()] = 1;
        } catch (NoSuchFieldError e11) {
        }
        try {
            a[class_146.c.ordinal()] = 2;
        } catch (NoSuchFieldError e12) {
        }
    }
}
