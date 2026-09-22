/*
 * Decompiled with CFR 0.152.
 * Post-processed: CFR emitted this top-level obfuscated class as "a.a"
 * (inner-class syntax); corrected to the real top-level name "a$a".
 * Verified against javap -p -cp client-final.jar rs.gui.b.a$a.
 */
package rs.gui.b;

public final class a$a
extends Enum<a$a> {
    public static final /* enum */ a$a a = new a$a(0, "/assets/gui/lunar.png", "Lunar");
    public static final /* enum */ a$a b = new a$a(1, "/assets/gui/ancients.png", "Ancients");
    public static final /* enum */ a$a c = new a$a(2, "/assets/gui/modern.png", "Modern");
    private String d;
    private String e;
    private int f;
    private static final /* synthetic */ a$a[] g;

    public static a$a[] values() {
        return (a$a[])g.clone();
    }

    public static a$a valueOf(String string) {
        return Enum.valueOf(a$a.class, string);
    }

    private a$a(int n2, String string2, String string3) {
        this.f = n2;
        this.e = string2;
        this.d = string3;
    }

    public String a() {
        return this.e;
    }

    public String b() {
        return this.d;
    }

    public int c() {
        return this.f;
    }

    public static a$a a(int n) {
        for (a$a a2 : a$a.values()) {
            if (a2.c() != n) continue;
            return a2;
        }
        return a;
    }

    private static /* synthetic */ a$a[] d() {
        return new a$a[]{a, b, c};
    }

    static {
        g = a$a.d();
    }
}
