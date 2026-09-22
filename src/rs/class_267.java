package rs;

import java.awt.Color;

/* JADX INFO: loaded from: client-final.jar:rs/class_267.class */
public final class class_267 {
    public static final int a = 63;
    public static final int b = 7;
    public static final int c = 127;
    private static float[] d = new float[3];

    public static short a(int i, int i2, int i3) {
        return (short) ((((short) (i & 63)) << 10) | (((short) (i2 & 7)) << 7) | ((short) (i3 & 127)));
    }

    public static int a(short s) {
        return (s >> 10) & 63;
    }

    public static int b(short s) {
        return (s >> 7) & 7;
    }

    public static int c(short s) {
        return s & 127;
    }

    public static String d(short s) {
        return String.format("%02Xh%Xs%02Xl", Integer.valueOf(a(s)), Integer.valueOf(b(s)), Integer.valueOf(c(s)));
    }

    public static short a(int i, double d2) {
        if (i == 1) {
            return (short) 0;
        }
        double d3 = 1.0d / d2;
        Color.RGBtoHSB((int) (Math.pow(((double) ((i >> 16) & 255)) / 256.0d, d3) * 256.0d), (int) (Math.pow(((double) ((i >> 8) & 255)) / 256.0d, d3) * 256.0d), (int) (Math.pow(((double) (i & 255)) / 256.0d, d3) * 256.0d), d);
        double d4 = d[0];
        double d5 = d[2] - ((d[2] * d[1]) / 2.0f);
        return a((int) (Math.ceil(d4 * 64.0d) % 63.0d), (int) Math.ceil(((((double) d[2]) - d5) / Math.min(d5, 1.0d - d5)) * 7.0d), (int) Math.ceil(d5 * 127.0d));
    }

    public static int b(int i, int i2, int i3) {
        return (((short) (i & 63)) << 10) | (((short) (i2 & 7)) << 7) | ((short) (i3 & 127));
    }

    public static int a(int i) {
        if (i == 1) {
            return 0;
        }
        Color.RGBtoHSB((int) ((((double) ((i >> 16) & 255)) / 256.0d) * 256.0d), (int) ((((double) ((i >> 8) & 255)) / 256.0d) * 256.0d), (int) ((((double) (i & 255)) / 256.0d) * 256.0d), d);
        double d2 = d[0];
        double d3 = d[2] - ((d[2] * d[1]) / 2.0f);
        return b((int) (Math.ceil(d2 * 64.0d) % 63.0d), (int) Math.ceil(((((double) d[2]) - d3) / Math.min(d3, 1.0d - d3)) * 7.0d), (int) Math.ceil(d3 * 127.0d));
    }
}
