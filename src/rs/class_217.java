package rs;

import com.sun.jna.platform.win32.bk;

/* JADX INFO: loaded from: client-final.jar:rs/class_217.class */
public class class_217 {
    private float b;
    public static int a = 0;

    public void a(boolean z, int i, int i2, int i3) {
        a(a);
        int i4 = class_332.x[0];
        int i5 = (int) (i + this.b);
        int i6 = (int) (i2 + this.b);
        for (int i7 = 0; i7 < class_210.k; i7++) {
            for (int i8 = 0; i8 < class_210.n; i8++) {
                if (class_210.f[i4] >= i6) {
                    class_210.g[i4] = a;
                } else if (class_210.f[i4] >= i5) {
                    int i9 = ((int) (class_210.f[i4] - i5)) / i3;
                    int i10 = ((((a & 16711935) * i9) >> 8) & 16711935) + ((((a & bk.ao) * i9) >> 8) & bk.ao);
                    int i11 = 256 - i9;
                    int i12 = class_210.g[i4];
                    class_210.g[i4] = i10 + ((((i12 & 16711935) * i11) >> 8) & 16711935) + ((((i12 & bk.ao) * i11) >> 8) & bk.ao);
                }
                i4++;
            }
            i4 += class_210.h - class_210.n;
        }
    }

    public void a(float f) {
        this.b = f;
    }

    public void a(int i) {
        a = i;
    }
}
