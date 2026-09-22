package rs;

import java.util.Random;

/* JADX INFO: loaded from: client-final.jar:rs/class_593.class */
public class class_593 {
    private int m;
    private class_333 n;
    private class_42 r;
    private int t;
    private class_42 u;
    private int v;
    private float w;
    private float x;
    public static int a = 0;
    public static final Random b = new Random(System.currentTimeMillis());
    public static class_593[] c = {new class_594(), new class_605(), new class_616(), new class_583(), new class_584(), new class_585(), new class_586(), new class_587(), new class_588(), new class_595(), new class_596(), new class_597(), new class_598(), new class_599(), new class_600(), new class_601(), new class_602(), new class_603(), new class_604(), new class_606(), new class_607(), new class_608(), new class_609(), new class_610(), new class_611(), new class_612(), new class_613(), new class_614(), new class_615(), new class_580(), new class_581(), new class_582()};
    private static int k = 10000;
    private float d = 1.0f;
    private float e = 1.0f;
    private int f = -1;
    private int g = -1;
    private class_42 h = class_42.a;
    private class_42 i = class_42.a;
    private int j = 1;
    private int l = 1;
    private boolean o = false;
    private float p = 1.0f;
    private float q = 0.05f;
    private class_37 s = new class_0(class_42.a);

    public class_42 a() {
        return (this.t == 31 && a(1, 3) == 1) ? new class_42(0, 0, 0) : this.r;
    }

    public void a(class_42 class_42Var) {
        this.r = class_42Var;
    }

    public int b() {
        return this.m;
    }

    public void a(int i) {
        this.m = i;
    }

    public float c() {
        return this.p;
    }

    public void a(float f) {
        this.p = f;
    }

    public float d() {
        return this.q;
    }

    public void b(float f) {
        this.q = f;
    }

    public float e() {
        return this.x;
    }

    public void c(float f) {
        this.x = f;
    }

    public class_333 f() {
        return this.n;
    }

    public void a(class_333 class_333Var) {
        this.n = class_333Var;
    }

    public class_37 g() {
        return this.s;
    }

    public void a(class_37 class_37Var) {
        this.s = class_37Var;
    }

    public int a(int i, int i2) {
        return ((int) (Math.random() * ((double) ((i2 - i) + 1)))) + i;
    }

    public int h() {
        return this.l;
    }

    public void b(int i) {
        this.l = i;
    }

    public static int i() {
        return k;
    }

    public void c(int i) {
        k = i;
    }

    public float j() {
        return this.d;
    }

    public void d(float f) {
        this.d = f;
    }

    public float k() {
        return this.e;
    }

    public void e(float f) {
        this.e = f;
    }

    public int l() {
        return this.f;
    }

    public void d(int i) {
        this.f = i;
    }

    public int m() {
        return this.g;
    }

    public void e(int i) {
        this.g = i;
    }

    public class_42 n() {
        return this.h;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0001. Please report as an issue. */
    public class_42 f(int i) {
        switch (i) {
        }
        return new class_42(this.h.a() + a(-1, 1), this.h.b() + a(0, 1), this.h.c() + a(-1, 1));
    }

    public void g(int i) {
        this.t = i;
    }

    public void b(class_42 class_42Var) {
        this.h = class_42Var;
    }

    public class_42 o() {
        return this.i;
    }

    public void a(boolean z) {
        this.o = z;
    }

    public boolean p() {
        return this.o;
    }

    public void c(class_42 class_42Var) {
        this.i = class_42Var;
    }

    public int q() {
        return this.j;
    }

    public void h(int i) {
        this.j = i;
    }

    public void d(class_42 class_42Var) {
        this.u = class_42Var;
    }

    public void i(int i) {
        this.v = i;
    }

    public void f(float f) {
        this.w = f;
    }

    public float r() {
        return this.w;
    }

    public class_42 s() {
        return this.u;
    }

    public int t() {
        return this.v;
    }

    public void u() {
        this.w = (this.e - this.d) / (this.j * 1.0f);
        this.v = (this.g - this.f) / this.j;
        if (this.h.a() == 0 && this.h.b() == 0 && this.h.c() == 0) {
            this.u = new class_42(0, 0, 0);
        } else {
            this.u = this.i.a(this.h).a(this.j);
        }
        this.x = (this.q - this.p) / this.j;
    }

    public void v() {
        this.w = (this.e - this.d) / (this.j * 1.0f);
        this.v = (this.g - this.f) / this.j;
        this.u = this.i.a(this.h).a(this.j);
    }

    public int w() {
        return this.t;
    }
}
