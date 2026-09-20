/*
 * Decompiled with CFR 0.152.
 */
package rs.p_e;

import rs.p_e.C_j;
import rs.p_e.C_l;

public final class C_m
implements C_j {
    private final String a;
    private final C_l b;

    @Override
    public String a() {
        return this.a;
    }

    @Override
    public String b() {
        return this.b.a();
    }

    @Override
    public int c() {
        return this.b.c();
    }

    public C_m(String string, C_l c_l) {
        this.a = string;
        this.b = c_l;
    }

    public String d() {
        return this.a;
    }

    public C_l e() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof C_m)) {
            return false;
        }
        C_m c_m = (C_m)object;
        String string = this.d();
        String string2 = c_m.d();
        if (string == null ? string2 != null : !string.equals(string2)) {
            return false;
        }
        C_l c_l = this.e();
        C_l c_l2 = c_m.e();
        return !(c_l == null ? c_l2 != null : !c_l.equals(c_l2));
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        String string = this.d();
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        C_l c_l = this.e();
        n2 = n2 * 59 + (c_l == null ? 43 : c_l.hashCode());
        return n2;
    }

    public String toString() {
        return "ConfigSectionDescriptor(key=" + this.d() + ", section=" + String.valueOf(this.e()) + ")";
    }
}

