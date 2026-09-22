package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_654.class */
public final class class_654 {
    public final int[] a = new int[2];
    private final int[][][] d = new int[2][2][4];
    private final int[][][] e = new int[2][2][4];
    private final int[] f = new int[2];
    private static final float[][] g = new float[2][8];
    public static final int[][] b = new int[2][8];
    private static float h;
    public static int c;

    private float a(int i, int i2, float f) {
        return 1.0f - ((float) Math.pow(10.0d, (-((this.e[i][0][i2] + (f * (this.e[i][1][i2] - this.e[i][0][i2]))) * 0.001525879f)) / 20.0f));
    }

    private float a(float f) {
        return ((32.7032f * ((float) Math.pow(2.0d, f))) * 3.141593f) / 11025.0f;
    }

    private float a(float f, int i, int i2) {
        return a((this.d[i2][0][i] + (f * (this.d[i2][1][i] - this.d[i2][0][i]))) * 1.220703E-4f);
    }

    public int a(int i, float f) {
        if (i == 0) {
            h = (float) Math.pow(0.1d, ((this.f[0] + ((this.f[1] - this.f[0]) * f)) * 0.003051758f) / 20.0f);
            c = (int) (h * 65536.0f);
        }
        if (this.a[i] == 0) {
            return 0;
        }
        float fA = a(i, 0, f);
        g[i][0] = (-2.0f) * fA * ((float) Math.cos(a(f, 0, i)));
        g[i][1] = fA * fA;
        for (int i2 = 1; i2 < this.a[i]; i2++) {
            float fA2 = a(i, i2, f);
            float fCos = (-2.0f) * fA2 * ((float) Math.cos(a(f, i2, i)));
            float f2 = fA2 * fA2;
            g[i][(i2 * 2) + 1] = g[i][(i2 * 2) - 1] * f2;
            g[i][i2 * 2] = (g[i][(i2 * 2) - 1] * fCos) + (g[i][(i2 * 2) - 2] * f2);
            for (int i3 = (i2 * 2) - 1; i3 >= 2; i3--) {
                float[] fArr = g[i];
                int i4 = i3;
                fArr[i4] = fArr[i4] + (g[i][i3 - 1] * fCos) + (g[i][i3 - 2] * f2);
            }
            float[] fArr2 = g[i];
            fArr2[1] = fArr2[1] + (g[i][0] * fCos) + f2;
            float[] fArr3 = g[i];
            fArr3[0] = fArr3[0] + fCos;
        }
        if (i == 0) {
            for (int i5 = 0; i5 < this.a[0] * 2; i5++) {
                float[] fArr4 = g[0];
                int i6 = i5;
                fArr4[i6] = fArr4[i6] * h;
            }
        }
        for (int i7 = 0; i7 < this.a[i] * 2; i7++) {
            b[i][i7] = (int) (g[i][i7] * 65536.0f);
        }
        return this.a[i] * 2;
    }

    public void a(Buffer buffer, class_653 class_653Var) {
        int iY = buffer.y();
        this.a[0] = iY >> 4;
        this.a[1] = iY & 15;
        if (iY == 0) {
            int[] iArr = this.f;
            this.f[1] = 0;
            iArr[0] = 0;
            return;
        }
        this.f[0] = buffer.A();
        this.f[1] = buffer.A();
        int iY2 = buffer.y();
        for (int i = 0; i < 2; i++) {
            for (int i2 = 0; i2 < this.a[i]; i2++) {
                this.d[i][0][i2] = buffer.A();
                this.e[i][0][i2] = buffer.A();
            }
        }
        for (int i3 = 0; i3 < 2; i3++) {
            for (int i4 = 0; i4 < this.a[i3]; i4++) {
                if ((iY2 & ((1 << (i3 * 4)) << i4)) != 0) {
                    this.d[i3][1][i4] = buffer.A();
                    this.e[i3][1][i4] = buffer.A();
                } else {
                    this.d[i3][1][i4] = this.d[i3][0][i4];
                    this.e[i3][1][i4] = this.e[i3][0][i4];
                }
            }
        }
        if (iY2 == 0 && this.f[1] == this.f[0]) {
            return;
        }
        class_653Var.b(buffer);
    }
}
