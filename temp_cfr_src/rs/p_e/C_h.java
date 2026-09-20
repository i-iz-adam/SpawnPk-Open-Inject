/*
 * Decompiled with CFR 0.152.
 */
package rs.p_e;

import java.lang.reflect.Type;
import rs.p_e.C_a;
import rs.p_e.C_g;
import rs.p_e.C_j;
import rs.p_e.C_o;
import rs.p_e.C_q;

public final class C_h
implements C_j {
    private final C_g a;
    private final Type b;
    private final C_o c;
    private final C_a d;
    private final C_q e;

    @Override
    public String a() {
        return this.a.b();
    }

    @Override
    public String b() {
        return this.a.c();
    }

    @Override
    public int c() {
        return this.a.a();
    }

    public C_h(C_g c_g, Type type, C_o c_o, C_a c_a, C_q c_q) {
        this.a = c_g;
        this.b = type;
        this.c = c_o;
        this.d = c_a;
        this.e = c_q;
    }

    public C_g d() {
        return this.a;
    }

    public Type e() {
        return this.b;
    }

    public C_o f() {
        return this.c;
    }

    public C_a g() {
        return this.d;
    }

    public C_q h() {
        return this.e;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof C_h)) {
            return false;
        }
        C_h c_h = (C_h)object;
        C_g c_g = this.d();
        C_g c_g2 = c_h.d();
        if (c_g == null ? c_g2 != null : !c_g.equals(c_g2)) {
            return false;
        }
        Type type = this.e();
        Type type2 = c_h.e();
        if (type == null ? type2 != null : !type.equals(type2)) {
            return false;
        }
        C_o c_o = this.f();
        C_o c_o2 = c_h.f();
        if (c_o == null ? c_o2 != null : !c_o.equals(c_o2)) {
            return false;
        }
        C_a c_a = this.g();
        C_a c_a2 = c_h.g();
        if (c_a == null ? c_a2 != null : !c_a.equals(c_a2)) {
            return false;
        }
        C_q c_q = this.h();
        C_q c_q2 = c_h.h();
        return !(c_q == null ? c_q2 != null : !c_q.equals(c_q2));
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        C_g c_g = this.d();
        n2 = n2 * 59 + (c_g == null ? 43 : c_g.hashCode());
        Type type = this.e();
        n2 = n2 * 59 + (type == null ? 43 : type.hashCode());
        C_o c_o = this.f();
        n2 = n2 * 59 + (c_o == null ? 43 : c_o.hashCode());
        C_a c_a = this.g();
        n2 = n2 * 59 + (c_a == null ? 43 : c_a.hashCode());
        C_q c_q = this.h();
        n2 = n2 * 59 + (c_q == null ? 43 : c_q.hashCode());
        return n2;
    }

    public String toString() {
        return "ConfigItemDescriptor(item=" + String.valueOf(this.d()) + ", type=" + String.valueOf(this.e()) + ", range=" + String.valueOf(this.f()) + ", alpha=" + String.valueOf(this.g()) + ", units=" + String.valueOf(this.h()) + ")";
    }
}

