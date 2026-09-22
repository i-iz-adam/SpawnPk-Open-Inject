package rs;

import com.a.a.a.a;
import com.a.b.a.b;
import com.a.b.a.c;

/* JADX INFO: loaded from: client-final.jar:rs/class_640.class */
public class class_640 {
    boolean a;
    int c;
    public class_35 base;
    public static class_640[] f;
    class_645[][] b = (class_645[][]) null;
    int d = 0;
    public class_645[][] e = (class_645[][]) null;

    public class_640 a() {
        try {
            if (f[this.c] == null) {
                class_176.a(this.c, true);
            }
            return f[this.c];
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static class_640 a(int i) {
        try {
            int i2 = i >>> 16;
            int i3 = i & 65535;
            if (f[i2] == null) {
                class_176.a(i2, true);
            }
            return f[i2];
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static final void b(int i) {
        boolean zA = class_83.a();
        try {
            class_83.a(true);
            Client.ew.a(1, i);
        } finally {
            class_83.a(zA);
        }
    }

    public static void b() {
        f = new class_640[5000];
    }

    public static void a(int i, byte[] bArr) {
        try {
            Buffer buffer = new Buffer(bArr);
            if (buffer.A() != 420) {
                System.err.println("Not a keyframe file!");
            }
            int iD = buffer.D();
            byte[] bArr2 = new byte[iD];
            buffer.a(iD, 0, bArr2);
            Buffer buffer2 = new Buffer(bArr2);
            int iY = buffer.y();
            buffer.A();
            class_640[] class_640VarArr = f;
            class_640 class_640Var = new class_640();
            class_640VarArr[i] = class_640Var;
            class_640Var.c = i;
            try {
                class_640Var.base = new class_35(buffer2, false, iD);
            } catch (RuntimeException e) {
                f[i] = null;
                System.err.println(e.getMessage());
                System.err.println("Error1 unpacking base for keyframe " + i);
                e.printStackTrace();
            }
            try {
                class_640Var.a(buffer, iY);
            } catch (RuntimeException e2) {
                f[i] = null;
                System.err.println("Error1 unpacking keyframes " + i + " file size from cache = " + bArr.length);
                e2.printStackTrace();
            }
        } catch (Exception e3) {
            System.err.println("Error2 unpacking keyframes " + i);
            e3.printStackTrace();
        }
    }

    void a(Buffer buffer, int i) {
        int iR = buffer.r();
        int i2 = buffer.h;
        buffer.o();
        buffer.o();
        this.d = buffer.y();
        int iO = buffer.o();
        this.b = new class_645[this.base.b().b()][];
        this.e = new class_645[this.base.a()][];
        for (int i3 = 0; i3 < iO; i3++) {
            class_641 class_641Var = (class_641) a.a(new class_641[]{class_641.f, class_641.d, class_641.b, class_641.c, class_641.a, class_641.e}, buffer.y());
            if (class_641Var == null) {
                class_641Var = class_641.f;
            }
            int iT = buffer.t();
            class_643 class_643VarA = class_643.a(buffer.y());
            class_645 class_645Var = new class_645();
            class_645Var.a(buffer, i);
            int iB = class_641Var.b();
            class_645[][] class_645VarArr = class_641.d == class_641Var ? this.b : this.e;
            if (class_645VarArr[iT] == null) {
                class_645VarArr[iT] = new class_645[iB];
            }
            class_645VarArr[iT][class_643VarA.c()] = class_645Var;
            if (class_641.a == class_641Var) {
                this.a = true;
            }
        }
        int i4 = buffer.h - i2;
        if (i4 != iR) {
            throw new RuntimeException("AnimKeyFrameSet size mismatch! keyframe " + this.d + ", frame size: " + iR + ", actual read: " + i4);
        }
    }

    public int c() {
        return this.d;
    }

    public boolean d() {
        return this.a;
    }

    public void a(int i, class_642 class_642Var, int i2, int i3) {
        b bVarA = b.a();
        a(bVarA, i2, class_642Var, i);
        c(bVarA, i2, class_642Var, i);
        b(bVarA, i2, class_642Var, i);
        class_642Var.a(bVarA);
        bVarA.b();
    }

    void a(b bVar, int i, class_642 class_642Var, int i2) {
        float[] fArrE = class_642Var.e(this.d);
        float fA = fArrE[0];
        float fA2 = fArrE[1];
        float fA3 = fArrE[2];
        if (null != this.b[i]) {
            class_645 class_645Var = this.b[i][0];
            class_645 class_645Var2 = this.b[i][1];
            class_645 class_645Var3 = this.b[i][2];
            if (class_645Var != null) {
                fA = class_645Var.a(i2);
            }
            if (class_645Var2 != null) {
                fA2 = class_645Var2.a(i2);
            }
            if (class_645Var3 != null) {
                fA3 = class_645Var3.a(i2);
            }
        }
        c cVarA = c.a();
        cVarA.b(1.0f, 0.0f, 0.0f, fA);
        c cVarA2 = c.a();
        cVarA2.b(0.0f, 1.0f, 0.0f, fA2);
        c cVarA3 = c.a();
        cVarA3.b(0.0f, 0.0f, 1.0f, fA3);
        c cVarA4 = c.a();
        cVarA4.a(cVarA3);
        cVarA4.a(cVarA);
        cVarA4.a(cVarA2);
        b bVarA = b.a();
        bVarA.a(cVarA4);
        bVar.c(bVarA);
        cVarA.b();
        cVarA2.b();
        cVarA3.b();
        cVarA4.b();
        bVarA.b();
    }

    void b(b bVar, int i, class_642 class_642Var, int i2) {
        float[] fArrF = class_642Var.f(this.d);
        float fA = fArrF[0];
        float fA2 = fArrF[1];
        float fA3 = fArrF[2];
        if (this.b[i] != null) {
            class_645 class_645Var = this.b[i][3];
            class_645 class_645Var2 = this.b[i][4];
            class_645 class_645Var3 = this.b[i][5];
            if (class_645Var != null) {
                fA = class_645Var.a(i2);
            }
            if (null != class_645Var2) {
                fA2 = class_645Var2.a(i2);
            }
            if (null != class_645Var3) {
                fA3 = class_645Var3.a(i2);
            }
        }
        bVar.e[12] = fA;
        bVar.e[13] = fA2;
        bVar.e[14] = fA3;
    }

    void c(b bVar, int i, class_642 class_642Var, int i2) {
        float[] fArrG = class_642Var.g(this.d);
        float fA = fArrG[0];
        float fA2 = fArrG[1];
        float fA3 = fArrG[2];
        if (this.b[i] != null) {
            class_645 class_645Var = this.b[i][6];
            class_645 class_645Var2 = this.b[i][7];
            class_645 class_645Var3 = this.b[i][8];
            if (class_645Var != null) {
                fA = class_645Var.a(i2);
            }
            if (class_645Var2 != null) {
                fA2 = class_645Var2.a(i2);
            }
            if (class_645Var3 != null) {
                fA3 = class_645Var3.a(i2);
            }
        }
        b bVarA = b.a();
        bVarA.a(fA, fA2, fA3);
        bVar.c(bVarA);
        bVarA.b();
    }
}
