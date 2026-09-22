package rs;

import java.awt.Color;
import java.awt.Shape;
import java.awt.Stroke;
import rs.runelite.a.f;
import rs.runelite.a.h;
import rs.runelite.a.i;
import rs.plugins.s.b;

/* JADX INFO: loaded from: client-final.jar:rs/class_306.class */
public abstract class class_306 {
    protected Client a;
    protected boolean b = true;
    private int e;
    private class_268 f;
    private class_268 g;
    protected int c;
    protected int d;

    public abstract void a();

    public void b() {
    }

    public void c() {
    }

    public void a(class_268 class_268Var) {
        this.f = class_268Var;
        this.g = class_268Var;
    }

    protected void a(f fVar, String str, Color color, int i) {
        i iVarA = h.a(class_313.d().b(this.f), fVar, str, 0);
        if (iVarA != null) {
            class_321.a(class_313.d().b(this.f), iVarA, str, color);
        }
    }

    protected void a(Shape shape, Color color) {
        class_321.a(class_313.d().b(this.f), shape, color, class_321.a());
    }

    protected void a(Shape shape, Color color, Color color2) {
        class_321.a(class_313.d().b(this.f), shape, color, color2, class_321.a());
    }

    protected void a(Shape shape, Color color, Color color2, Stroke stroke) {
        class_321.a(class_313.d().b(this.f), shape, color, color2, stroke);
    }

    protected void b(Shape shape, Color color, Color color2, Stroke stroke) {
        class_321.b(class_313.d().b(this.f), shape, color, color2, stroke);
    }

    protected void a(i iVar, String str, Color color) {
        if (iVar == null) {
            return;
        }
        class_321.a(class_313.d().b(this.f), iVar, str, color);
    }

    protected void a(int i, int i2, int i3, int i4) {
        a(i, i2, i3, i4, b.p, b.r, b.q);
    }

    protected void a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        class_210.b(i4, i2, i, i5, i3, class_324.ap != 256 ? class_324.ap : 200);
        if (class_324.ap != 256) {
            class_210.e(i, i3, i4, i7, i2, class_324.ap);
        } else {
            class_210.d(i, i3, i4, i7, i2);
        }
        if (class_324.ap != 256) {
            class_210.e(i - 1, i3 + (1 * 2), i4 + (1 * 2), i6, i2 - 1, class_324.ap);
        } else {
            class_210.d(i - 1, i3 + (1 * 2), i4 + (1 * 2), i6, i2 - 1);
        }
    }

    protected void a(int i, int i2, int i3) {
        if (i < 128 || i2 < 128 || i > 13056 || i2 > 13056) {
            this.c = -1;
            this.d = -1;
            return;
        }
        int iC = this.a.c(Client.dw, i2, i) - i3;
        int i4 = i - Client.cJ;
        int i5 = iC - Client.cK;
        int i6 = i2 - Client.cL;
        int i7 = ColorUtility.bA[this.a.cR];
        int i8 = ColorUtility.bB[this.a.cR];
        int i9 = ColorUtility.bA[this.a.cS];
        int i10 = ColorUtility.bB[this.a.cS];
        int i11 = ((i6 * i9) + (i4 * i10)) >> 16;
        int i12 = ((i6 * i10) - (i4 * i9)) >> 16;
        int i13 = ((i5 * i8) - (i12 * i7)) >> 16;
        int i14 = ((i5 * i7) + (i12 * i8)) >> 16;
        if (i14 >= 50) {
            this.c = class_332.s + ((i11 << 9) / i14);
            this.d = class_332.t + ((i13 << 9) / i14);
        } else {
            this.c = -1;
            this.d = -1;
        }
    }

    protected int a(int i, int i2) {
        int iD = d() - i;
        int iE = e() - i2;
        return (int) Math.ceil(Math.sqrt((iD * iD) + (iE * iE)));
    }

    protected boolean b(int i, int i2) {
        return i >= 128 && i2 >= 128 && i <= 13056 && i2 <= 13056;
    }

    protected int d() {
        return Client.eh + ((Client.eR.ac - 6) >> 7);
    }

    protected int e() {
        return Client.ei + ((Client.eR.ad - 6) >> 7);
    }

    public void a(Client client) {
        this.a = client;
    }

    public Client f() {
        return this.a;
    }

    public boolean g() {
        return this.b;
    }

    public void a(boolean z) {
        this.b = z;
    }

    public int h() {
        return this.e;
    }

    public class_268 i() {
        return this.f;
    }

    public void b(class_268 class_268Var) {
        this.f = class_268Var;
    }

    public class_268 j() {
        return this.g;
    }
}
