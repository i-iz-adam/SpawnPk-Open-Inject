/*
 * Decompiled with CFR 0.152.
 */
package rs.p_a;

public class C_d {
    public int[] a;
    public int b;
    public int c;
    public int d;

    public C_d(int n) {
        this.a = new int[n * 3];
    }

    public int a(int n) {
        return this.a[n * 3];
    }

    public int b(int n) {
        return this.a[n * 3 + 1];
    }

    public int c(int n) {
        return this.a[n * 3 + 2];
    }

    public void a(int n, int n2) {
        this.a[n * 3] = n2;
    }

    public void b(int n, int n2) {
        this.a[n * 3 + 1] = n2;
    }

    public void c(int n, int n2) {
        this.a[n * 3 + 2] = n2;
    }

    public void d(int n, int n2) {
        int n3 = n * 3;
        this.a[n3] = this.a[n3] + n2;
    }

    public void e(int n, int n2) {
        int n3 = n * 3 + 1;
        this.a[n3] = this.a[n3] + n2;
    }

    public void f(int n, int n2) {
        int n3 = n * 3 + 2;
        this.a[n3] = this.a[n3] + n2;
    }

    public int a() {
        return this.a.length / 3;
    }
}

