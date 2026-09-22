package rs;

import com.sun.jna.platform.win32.bk;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_288.class */
public class class_288 {
    private static long a = 0;
    private static long b = 3000;
    private long c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int j;
    private long m;
    private long n;
    private double o;
    private double p;
    private int r;
    private int h = 1;
    private class_289 i = class_289.a;
    private int k = 10;
    private int l = 10;
    private int q = 255;

    public class_288(int i, int i2, int i3) {
        this.j = bk.aS;
        this.j = i3;
        long j = a;
        a = j + 1;
        this.c = j;
        this.p = 1.0d;
        this.n = User32.VK_PLAY + (User32.VK_PLAY * Client.d(3));
        a(i, i2);
    }

    public void a() {
        int iF = this.q - ((int) (((double) this.q) * f()));
        if (iF > 255) {
            iF = 255;
        }
        if (iF < 0) {
            iF = 0;
        }
        class_210.a(this.d, this.e, this.k, this.l, this.j, iF);
    }

    public void b() {
        this.r++;
        if (this.i == class_289.a) {
            this.d += this.h;
        } else {
            this.d -= this.h;
        }
        this.e = (int) (((double) this.e) + (this.p * ((double) (((int) (((((double) this.r) / 5.0d) * Math.log((((double) this.r) / 5.0d) * this.o)) + this.o)) / 2))));
    }

    public void a(int i, int i2) {
        this.r = 0;
        this.d = i;
        this.f = i;
        this.e = i2;
        this.g = i2;
        this.m = System.currentTimeMillis();
        this.o = 1 + Client.d(25);
    }

    public void b(int i, int i2) {
        this.k = i;
        this.l = i2;
    }

    public boolean c() {
        return d() < this.n;
    }

    public long d() {
        return System.currentTimeMillis() - this.m;
    }

    public long e() {
        return System.currentTimeMillis() - (this.m + this.n);
    }

    public double f() {
        return d() / this.n;
    }

    public long g() {
        return this.c;
    }

    public int h() {
        return this.d;
    }

    public int i() {
        return this.e;
    }

    public void a(int i) {
        this.d = i;
    }

    public void b(int i) {
        this.e = i;
    }

    public int j() {
        return this.f;
    }

    public int k() {
        return this.g;
    }

    public void c(int i) {
        this.f = i;
    }

    public void d(int i) {
        this.g = i;
    }

    public int l() {
        return this.h;
    }

    public void e(int i) {
        this.h = i;
    }

    public class_289 m() {
        return this.i;
    }

    public void a(class_289 class_289Var) {
        this.i = class_289Var;
    }

    public int n() {
        return this.j;
    }

    public void f(int i) {
        this.j = i;
    }

    public int o() {
        return this.k;
    }

    public int p() {
        return this.l;
    }

    public void g(int i) {
        this.k = i;
    }

    public void h(int i) {
        this.l = i;
    }

    public long q() {
        return this.m;
    }

    public void a(long j) {
        this.m = j;
    }

    public long r() {
        return this.n;
    }

    public void b(long j) {
        this.n = j;
    }

    public double s() {
        return this.o;
    }

    public void a(double d) {
        this.o = d;
    }

    public double t() {
        return this.p;
    }

    public void b(double d) {
        this.p = d;
    }

    public void i(int i) {
        this.q = i;
    }
}
