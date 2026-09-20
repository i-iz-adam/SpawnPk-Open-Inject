/*
 * Decompiled with CFR 0.152.
 */
package rs.p_cache.p_osrs;

public final class C_a
extends Enum<C_a> {
    public static final /* enum */ C_a a = new C_a(1, "Model");
    public static final /* enum */ C_a b = new C_a(2, "Animation");
    public static final /* enum */ C_a c = new C_a(3, "Sounds");
    public static final /* enum */ C_a d = new C_a(4, "Map");
    private int e;
    private String f;
    private String g;
    private static final /* synthetic */ C_a[] h;

    public static C_a[] values() {
        return (C_a[])h.clone();
    }

    public static C_a valueOf(String string) {
        return Enum.valueOf(C_a.class, string);
    }

    private C_a(int n2, String string2) {
        this.e = n2;
        this.f = string2;
        this.g = rs.p_v.C_a.f() + "osrs_idx" + n2;
    }

    public int a() {
        return this.e;
    }

    public String b() {
        return this.f;
    }

    public String c() {
        return this.g;
    }

    private static /* synthetic */ C_a[] d() {
        return new C_a[]{a, b, c, d};
    }

    static {
        h = C_a.d();
    }
}

