/*
 * Decompiled with CFR 0.152.
 */
package rs.p_cache.p_b;

public final class C_b
extends Enum<C_b> {
    public static final /* enum */ C_b a = new C_b("Error in version check!\nCould not retrieve remote version file. Server is either offline or the remote file is corrupt.\n\nPlease try again in a few minutes.");
    public static final /* enum */ C_b b = new C_b("There has been an issue downloading a game asset!\nPlease try again in a few minutes.\nIf the issue continues, post a ticket on our website!");
    private String c;
    private static final /* synthetic */ C_b[] d;

    public static C_b[] values() {
        return (C_b[])d.clone();
    }

    public static C_b valueOf(String string) {
        return Enum.valueOf(C_b.class, string);
    }

    private C_b(String string2) {
        this.c = string2;
    }

    public String a() {
        return this.c;
    }

    private static /* synthetic */ C_b[] b() {
        return new C_b[]{a, b};
    }

    static {
        d = C_b.b();
    }
}

