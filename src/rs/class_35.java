package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_35.class */
public final class class_35 {
    class_648 a;
    public int b;
    public int c;
    public final int[] d;
    public final int[][] e;

    public class_35(Buffer buffer, boolean z, int i) {
        int i2 = buffer.h;
        this.b = z ? buffer.o() : buffer.y();
        this.d = new int[this.b];
        this.e = new int[this.b][];
        for (int i3 = 0; i3 < this.b; i3++) {
            this.d[i3] = z ? buffer.o() : buffer.y();
        }
        for (int i4 = 0; i4 < this.b; i4++) {
            this.e[i4] = new int[z ? buffer.o() : buffer.y()];
        }
        for (int i5 = 0; i5 < this.b; i5++) {
            for (int i6 = 0; i6 < this.e[i5].length; i6++) {
                this.e[i5][i6] = z ? buffer.o() : buffer.y();
            }
        }
        int i7 = buffer.h - i2;
        if (z) {
            return;
        }
        if (i7 != i) {
            try {
                int iO = buffer.o();
                if (iO > 0) {
                    this.a = new class_648(buffer, iO);
                }
            } catch (Throwable th) {
                System.err.println("Tried to load base because there was extra base data but skeletal failed to load.");
                th.printStackTrace();
            }
        }
        int i8 = buffer.h - i2;
        if (i8 != i) {
            throw new RuntimeException("base data size mismatch: " + i8 + ", expected " + i);
        }
    }

    public class_35(int[] iArr, int[][] iArr2) {
        this.d = iArr;
        this.e = iArr2;
    }

    public class_35(Buffer buffer) {
        this(buffer, class_83.a());
    }

    public class_35(Buffer buffer, boolean z) {
        this.c = z ? buffer.y() : buffer.A();
        this.d = new int[this.c];
        this.e = new int[this.c][];
        for (int i = 0; i < this.c; i++) {
            this.d[i] = z ? buffer.y() : buffer.A();
        }
        for (int i2 = 0; i2 < this.c; i2++) {
            this.e[i2] = new int[z ? buffer.y() : buffer.A()];
        }
        for (int i3 = 0; i3 < this.c; i3++) {
            for (int i4 = 0; i4 < this.e[i3].length; i4++) {
                this.e[i3][i4] = z ? buffer.y() : buffer.A();
            }
        }
    }

    public int a() {
        return this.b;
    }

    public class_648 b() {
        return this.a;
    }
}
