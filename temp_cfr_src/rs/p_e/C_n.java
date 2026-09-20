/*
 * Decompiled with CFR 0.152.
 */
package rs.p_e;

public final class C_n
extends Enum<C_n> {
    public static final /* enum */ C_n a = new C_n("Off");
    public static final /* enum */ C_n b = new C_n("Flash for 2 seconds");
    public static final /* enum */ C_n c = new C_n("Solid for 2 seconds");
    public static final /* enum */ C_n d = new C_n("Flash until cancelled");
    public static final /* enum */ C_n e = new C_n("Solid until cancelled");
    private final String f;
    private static final /* synthetic */ C_n[] g;

    public static C_n[] values() {
        return (C_n[])g.clone();
    }

    public static C_n valueOf(String string) {
        return Enum.valueOf(C_n.class, string);
    }

    public String toString() {
        return this.f;
    }

    public String a() {
        return this.f;
    }

    private C_n(String string2) {
        this.f = string2;
    }

    private static /* synthetic */ C_n[] b() {
        return new C_n[]{a, b, c, d, e};
    }

    static {
        g = C_n.b();
    }
}

