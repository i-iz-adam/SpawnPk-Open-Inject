/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  rs.gui.b.a$a
 */
package rs.gui.b;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import rs.gui.b.c.c;
import rs.gui.b.e;
import rs.gui.b.f;

public class Loadout {
    public static final int a = 0;
    public static final int b = 1;
    private String c;
    private Color d;
    private e e;
    private a$a f = rs.gui.b.a$a.a;
    private int g;
    private int h;
    private int i = 1;
    private final f[] j = new f[28];
    private final Map<LoadoutGroup, f> k = new HashMap<LoadoutGroup, f>();
    private int l;
    private final int[] m = new int[7];

    public Loadout(String string) {
        this.c = string;
        this.g = 0;
        this.h = 0;
        this.l = 0;
        this.d = Color.WHITE;
        for (int i = 0; i < this.m.length; ++i) {
            this.m[i] = 99;
        }
    }

    public Map<LoadoutGroup, f> a() {
        return this.k;
    }

    public int b() {
        return this.g;
    }

    public void a(int n) {
        this.g = n;
    }

    public int[] c() {
        return this.m;
    }

    public f[] d() {
        return this.j;
    }

    public void a(int n, f f2) {
        this.j[n] = f2;
    }

    public int e() {
        return this.i;
    }

    public void b(int n) {
        this.i = n;
    }

    public String f() {
        return this.c;
    }

    public void a(String string) {
        this.c = string;
    }

    public a$a g() {
        return this.f;
    }

    public void a(a$a a2) {
        this.f = a2;
    }

    public void a(LoadoutGroup c2, int n) {
        this.k.put(c2, new f(n));
    }

    public void a(LoadoutGroup c2, f f2) {
        this.k.put(c2, f2);
    }

    public int h() {
        return this.h;
    }

    public void c(int n) {
        this.h = n;
    }

    public void d(int n) {
        this.l = n;
    }

    public int i() {
        return this.l;
    }

    public Color j() {
        return this.d;
    }

    public void a(Color color) {
        this.d = color;
    }

    public e k() {
        return this.e;
    }

    public void a(e e2) {
        this.e = e2;
    }
}
