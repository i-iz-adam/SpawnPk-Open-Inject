package rs;

import org.lwjgl.opengl.KHRTextureCompressionASTCLDR;

/* JADX INFO: loaded from: client-final.jar:rs/p.class */
public class p {
    private static final int a = 2048;
    private static final double b = 0.17578125d;
    private static final double c = Math.toRadians(b);
    private static final int[] d = new int[2048];
    private static final int[] e = new int[2048];

    public static int a(int i, int i2) {
        int iA = 35 + ((int) (((double) ((a(i + 45365, i2 + 91923, 4) - 128) + ((a(10294 + i, i2 + KHRTextureCompressionASTCLDR.GL_COMPRESSED_RGBA_ASTC_12x12_KHR, 2) - 128) >> 1) + ((a(i, i2, 1) - 128) >> 2))) * 0.3d));
        if (iA < 10) {
            iA = 10;
        } else if (iA > 60) {
            iA = 60;
        }
        return iA;
    }

    public static int a(int i, int i2, int i3) {
        int i4 = i / i3;
        int i5 = i & (i3 - 1);
        int i6 = i2 / i3;
        return a(a(b(i4, i6), b(i4 + 1, i6), i5, i3), a(b(i4, i6 + 1), b(1 + i4, 1 + i6), i5, i3), i2 & (i3 - 1), i3);
    }

    public static int b(int i, int i2) {
        int iC = c(i - 1, i2 - 1) + c(i + 1, i2 - 1) + c(i - 1, 1 + i2) + c(i + 1, i2 + 1);
        return (c(i, i2) / 4) + ((((c(i - 1, i2) + c(1 + i, i2)) + c(i, i2 - 1)) + c(i, 1 + i2)) / 8) + (iC / 16);
    }

    public static int c(int i, int i2) {
        int i3 = i + (i2 * 57);
        int i4 = i3 ^ (i3 << 13);
        return ((((i4 * (((i4 * i4) * 15731) + 789221)) + 1376312589) & Integer.MAX_VALUE) >> 19) & 255;
    }

    public static int a(int i, int i2, int i3, int i4) {
        int i5 = (65536 - e[(1024 * i3) / i4]) >> 1;
        return ((i5 * i2) >> 16) + ((i * (65536 - i5)) >> 16);
    }

    static {
        for (int i = 0; i < 2048; i++) {
            d[i] = (int) (65536.0d * Math.sin(((double) i) * c));
            e[i] = (int) (65536.0d * Math.cos(((double) i) * c));
        }
    }
}
