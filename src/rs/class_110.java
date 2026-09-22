package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_110.class */
public final class class_110 {
    public static int a;
    public static class_110[] b;
    public int[] d;
    private final int[] h = {-1, -1, -1, -1, -1};
    public int c = -1;
    private final int[] f = new int[6];
    private final int[] g = new int[6];
    public boolean e = false;

    public static void a(class_663 class_663Var) {
        Buffer buffer = new Buffer(class_663Var.a("idk.dat"));
        a = buffer.A();
        if (b == null) {
            b = new class_110[a];
        }
        for (int i = 0; i < a; i++) {
            if (b[i] == null) {
                b[i] = new class_110();
            }
            b[i].a(buffer);
        }
    }

    private void a(Buffer buffer) {
        while (true) {
            int iY = buffer.y();
            if (iY == 0) {
                return;
            }
            if (iY == 1) {
                this.c = buffer.y();
            } else if (iY == 2) {
                int iY2 = buffer.y();
                this.d = new int[iY2];
                for (int i = 0; i < iY2; i++) {
                    this.d[i] = buffer.A();
                }
            } else if (iY == 3) {
                this.e = true;
            } else if (iY >= 40 && iY < 50) {
                this.f[iY - 40] = buffer.A();
            } else if (iY >= 50 && iY < 60) {
                this.g[iY - 50] = buffer.A();
            } else if (iY < 60 || iY >= 70) {
                System.out.println("[IDK] Error unrecognised config code: " + iY);
            } else {
                this.h[iY - 60] = buffer.A();
            }
        }
    }

    public boolean a() {
        if (this.d == null) {
            return true;
        }
        boolean z = true;
        for (int i = 0; i < this.d.length; i++) {
            if (!ColorUtility.f(this.d[i])) {
                z = false;
            }
        }
        return z;
    }

    public ColorUtility b() {
        if (this.d == null) {
            return null;
        }
        ColorUtility[] colorUtilityArr = new ColorUtility[this.d.length];
        for (int i = 0; i < this.d.length; i++) {
            colorUtilityArr[i] = ColorUtility.e(this.d[i]);
            if (colorUtilityArr[i] == null) {
                return null;
            }
            int[] iArr = {0};
            int[] iArr2 = {1};
            for (int i2 = 0; i2 < iArr.length; i2++) {
                colorUtilityArr[i].i(iArr[i2], iArr2[i2]);
            }
        }
        ColorUtility colorUtility = colorUtilityArr.length == 1 ? colorUtilityArr[0] : new ColorUtility(colorUtilityArr.length, colorUtilityArr);
        for (int i3 = 0; i3 < 6 && this.f[i3] != 0; i3++) {
            colorUtility.i(this.f[i3], this.g[i3]);
        }
        return colorUtility;
    }

    public boolean c() {
        boolean z = true;
        for (int i = 0; i < 5; i++) {
            if (this.h[i] != -1 && !ColorUtility.f(this.h[i])) {
                z = false;
            }
        }
        return z;
    }

    public ColorUtility d() {
        ColorUtility[] colorUtilityArr = new ColorUtility[5];
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            if (this.h[i2] != -1) {
                int i3 = i;
                i++;
                colorUtilityArr[i3] = ColorUtility.e(this.h[i2]);
            }
        }
        ColorUtility colorUtility = new ColorUtility(i, colorUtilityArr);
        for (int i4 = 0; i4 < 6 && this.f[i4] != 0; i4++) {
            colorUtility.i(this.f[i4], this.g[i4]);
        }
        return colorUtility;
    }

    private class_110() {
    }
}
