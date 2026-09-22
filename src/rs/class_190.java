package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_190.class */
public final class class_190 extends class_329 {
    float f;
    float g;
    public final int[] h;
    public byte[] i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;

    public float c() {
        return this.f;
    }

    public void a(float f) {
        this.f = f;
    }

    public float d() {
        return this.g;
    }

    public void b(float f) {
        this.g = f;
    }

    public class_190(class_663 class_663Var, String str, int i) {
        Buffer buffer = new Buffer(class_663Var.a(str + ".dat"));
        Buffer buffer2 = new Buffer(class_663Var.a("index.dat"));
        buffer2.h = buffer.A();
        this.n = buffer2.A();
        this.o = buffer2.A();
        int iY = buffer2.y();
        this.h = new int[iY];
        for (int i2 = 0; i2 < iY - 1; i2++) {
            this.h[i2 + 1] = buffer2.C();
        }
        for (int i3 = 0; i3 < i; i3++) {
            buffer2.h += 2;
            buffer.h += buffer2.A() * buffer2.A();
            buffer2.h++;
        }
        this.l = buffer2.y();
        this.m = buffer2.y();
        this.j = buffer2.A();
        this.k = buffer2.A();
        int iY2 = buffer2.y();
        int i4 = this.j * this.k;
        this.i = new byte[i4];
        if (iY2 == 0) {
            for (int i5 = 0; i5 < i4; i5++) {
                this.i[i5] = buffer.z();
            }
            return;
        }
        if (iY2 == 1) {
            for (int i6 = 0; i6 < this.j; i6++) {
                for (int i7 = 0; i7 < this.k; i7++) {
                    this.i[i6 + (i7 * this.j)] = buffer.z();
                }
            }
        }
    }

    public void a(int i, int i2) {
        int i3 = i + this.l;
        int i4 = i2 + this.m;
        int i5 = i3 + (i4 * class_210.h);
        int i6 = 0;
        int i7 = this.k;
        int i8 = this.j;
        int i9 = class_210.h - i8;
        int i10 = 0;
        if (i4 < class_210.j) {
            int i11 = class_210.j - i4;
            i7 -= i11;
            i4 = class_210.j;
            i6 = 0 + (i11 * i8);
            i5 += i11 * class_210.h;
        }
        if (i4 + i7 > class_210.k) {
            i7 -= (i4 + i7) - class_210.k;
        }
        if (i3 < class_210.l) {
            int i12 = class_210.l - i3;
            i8 -= i12;
            i3 = class_210.l;
            i6 += i12;
            i5 += i12;
            i10 = 0 + i12;
            i9 += i12;
        }
        if (i3 + i8 > class_210.m) {
            int i13 = (i3 + i8) - class_210.m;
            i8 -= i13;
            i10 += i13;
            i9 += i13;
        }
        if (i8 <= 0 || i7 <= 0) {
            return;
        }
        a(i7, class_210.g, this.i, i9, i5, i8, i6, this.h, i10);
    }

    public void e() {
        this.n /= 2;
        this.o /= 2;
        byte[] bArr = new byte[this.n * this.o];
        int i = 0;
        for (int i2 = 0; i2 < this.k; i2++) {
            for (int i3 = 0; i3 < this.j; i3++) {
                int i4 = i;
                i++;
                bArr[((i3 + this.l) >> 1) + (((i2 + this.m) >> 1) * this.n)] = this.i[i4];
            }
        }
        this.i = bArr;
        this.j = this.n;
        this.k = this.o;
        this.l = 0;
        this.m = 0;
    }

    public void f() {
        if (this.j == this.n && this.k == this.o) {
            return;
        }
        if (this.n * this.o > 16384) {
            System.out.println("Blocked background: " + (this.n * this.o));
            return;
        }
        byte[] bArr = new byte[this.n * this.o];
        int i = 0;
        for (int i2 = 0; i2 < this.k; i2++) {
            for (int i3 = 0; i3 < this.j; i3++) {
                int i4 = i;
                i++;
                bArr[i3 + this.l + ((i2 + this.m) * this.n)] = this.i[i4];
            }
        }
        this.i = bArr;
        this.j = this.n;
        this.k = this.o;
        this.l = 0;
        this.m = 0;
    }

    public void g() {
        byte[] bArr = new byte[this.j * this.k];
        int i = 0;
        for (int i2 = 0; i2 < this.k; i2++) {
            for (int i3 = this.j - 1; i3 >= 0; i3--) {
                int i4 = i;
                i++;
                bArr[i4] = this.i[i3 + (i2 * this.j)];
            }
        }
        this.i = bArr;
        this.l = (this.n - this.j) - this.l;
    }

    public void h() {
        byte[] bArr = new byte[this.j * this.k];
        int i = 0;
        for (int i2 = this.k - 1; i2 >= 0; i2--) {
            for (int i3 = 0; i3 < this.j; i3++) {
                int i4 = i;
                i++;
                bArr[i4] = this.i[i3 + (i2 * this.j)];
            }
        }
        this.i = bArr;
        this.m = (this.o - this.k) - this.m;
    }

    public void a(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.h.length; i4++) {
            int i5 = ((this.h[i4] >> 16) & 255) + i;
            if (i5 < 0) {
                i5 = 0;
            } else if (i5 > 255) {
                i5 = 255;
            }
            int i6 = ((this.h[i4] >> 8) & 255) + i2;
            if (i6 < 0) {
                i6 = 0;
            } else if (i6 > 255) {
                i6 = 255;
            }
            int i7 = (this.h[i4] & 255) + i3;
            if (i7 < 0) {
                i7 = 0;
            } else if (i7 > 255) {
                i7 = 255;
            }
            this.h[i4] = (i5 << 16) + (i6 << 8) + i7;
        }
    }

    public void b(int i, int i2) {
        int i3 = i + this.l;
        int i4 = i2 + this.m;
        int i5 = i3 + (i4 * class_210.h);
        int i6 = 0;
        int i7 = this.k;
        int i8 = this.j;
        int i9 = class_210.h - i8;
        int i10 = 0;
        if (i4 < class_210.j) {
            int i11 = class_210.j - i4;
            i7 -= i11;
            i4 = class_210.j;
            i6 = 0 + (i11 * i8);
            i5 += i11 * class_210.h;
        }
        if (i4 + i7 > class_210.k) {
            i7 -= (i4 + i7) - class_210.k;
        }
        if (i3 < class_210.l) {
            int i12 = class_210.l - i3;
            i8 -= i12;
            i3 = class_210.l;
            i6 += i12;
            i5 += i12;
            i10 = 0 + i12;
            i9 += i12;
        }
        if (i3 + i8 > class_210.m) {
            int i13 = (i3 + i8) - class_210.m;
            i8 -= i13;
            i10 += i13;
            i9 += i13;
        }
        if (i8 <= 0 || i7 <= 0) {
            return;
        }
        a(i7, class_210.g, this.i, i9, i5, i8, i6, this.h, i10);
    }

    private void a(int i, int[] iArr, byte[] bArr, int i2, int i3, int i4, int i5, int[] iArr2, int i6) {
        int i7;
        int i8;
        int i9;
        int i10 = -(i4 >> 2);
        int i11 = -(i4 & 3);
        for (int i12 = -i; i12 < 0; i12++) {
            for (int i13 = i10; i13 < 0; i13++) {
                int i14 = i5;
                int i15 = i5 + 1;
                byte b = bArr[i14];
                if (b != 0) {
                    int i16 = i3;
                    i7 = i3 + 1;
                    b(iArr, i16, iArr2[b & 255], iArr2[b & 255], 255);
                } else {
                    i7 = i3 + 1;
                }
                int i17 = i15 + 1;
                byte b2 = bArr[i15];
                if (b2 != 0) {
                    int i18 = i7;
                    i8 = i7 + 1;
                    b(iArr, i18, iArr2[b2 & 255], iArr2[b2 & 255], 255);
                } else {
                    i8 = i7 + 1;
                }
                int i19 = i17 + 1;
                byte b3 = bArr[i17];
                if (b3 != 0) {
                    int i20 = i8;
                    i9 = i8 + 1;
                    b(iArr, i20, iArr2[b3 & 255], iArr2[b3 & 255], 255);
                } else {
                    i9 = i8 + 1;
                }
                i5 = i19 + 1;
                byte b4 = bArr[i19];
                if (b4 != 0) {
                    int i21 = i9;
                    i3 = i9 + 1;
                    b(iArr, i21, iArr2[b4 & 255], iArr2[b4 & 255], 255);
                } else {
                    i3 = i9 + 1;
                }
            }
            for (int i22 = i11; i22 < 0; i22++) {
                int i23 = i5;
                i5++;
                byte b5 = bArr[i23];
                if (b5 != 0) {
                    int i24 = i3;
                    i3++;
                    b(iArr, i24, iArr2[b5 & 255], iArr2[b5 & 255], 255);
                } else {
                    i3++;
                }
            }
            i3 += i2;
            i5 += i6;
        }
    }

    public int i() {
        return 3;
    }

    public int j() {
        return 1;
    }
}
