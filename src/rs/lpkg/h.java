package rs.lpkg;

/* JADX INFO: loaded from: client-final.jar:rs/l/h.class */
public class h {
    private h() {
    }

    public static float[] a() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static float[] a(float f, float f2, float f3) {
        return new float[]{f, 0.0f, 0.0f, 0.0f, 0.0f, f2, 0.0f, 0.0f, 0.0f, 0.0f, f3, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static float[] b(float f, float f2, float f3) {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, f, f2, f3, 1.0f};
    }

    public static float[] a(float f) {
        float fSin = (float) Math.sin(f);
        float fCos = (float) Math.cos(f);
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, fCos, fSin, 0.0f, 0.0f, -fSin, fCos, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static float[] b(float f) {
        float fSin = (float) Math.sin(f);
        float fCos = (float) Math.cos(f);
        return new float[]{fCos, 0.0f, -fSin, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, fSin, 0.0f, fCos, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static float[] c(float f, float f2, float f3) {
        return new float[]{2.0f / f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f / f2, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, (-2.0f) * f3, 0.0f};
    }

    public static void a(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        float f4 = fArr2[3];
        float f5 = fArr2[4];
        float f6 = fArr2[5];
        float f7 = fArr2[6];
        float f8 = fArr2[7];
        float f9 = fArr2[8];
        float f10 = fArr2[9];
        float f11 = fArr2[10];
        float f12 = fArr2[11];
        float f13 = fArr2[12];
        float f14 = fArr2[13];
        float f15 = fArr2[14];
        float f16 = fArr2[15];
        float f17 = fArr[0];
        float f18 = fArr[4];
        float f19 = fArr[8];
        float f20 = fArr[12];
        fArr[0] = (f17 * f) + (f18 * f2) + (f19 * f3) + (f20 * f4);
        fArr[4] = (f17 * f5) + (f18 * f6) + (f19 * f7) + (f20 * f8);
        fArr[8] = (f17 * f9) + (f18 * f10) + (f19 * f11) + (f20 * f12);
        fArr[12] = (f17 * f13) + (f18 * f14) + (f19 * f15) + (f20 * f16);
        float f21 = fArr[1];
        float f22 = fArr[5];
        float f23 = fArr[9];
        float f24 = fArr[13];
        fArr[1] = (f21 * f) + (f22 * f2) + (f23 * f3) + (f24 * f4);
        fArr[5] = (f21 * f5) + (f22 * f6) + (f23 * f7) + (f24 * f8);
        fArr[9] = (f21 * f9) + (f22 * f10) + (f23 * f11) + (f24 * f12);
        fArr[13] = (f21 * f13) + (f22 * f14) + (f23 * f15) + (f24 * f16);
        float f25 = fArr[2];
        float f26 = fArr[6];
        float f27 = fArr[10];
        float f28 = fArr[14];
        fArr[2] = (f25 * f) + (f26 * f2) + (f27 * f3) + (f28 * f4);
        fArr[6] = (f25 * f5) + (f26 * f6) + (f27 * f7) + (f28 * f8);
        fArr[10] = (f25 * f9) + (f26 * f10) + (f27 * f11) + (f28 * f12);
        fArr[14] = (f25 * f13) + (f26 * f14) + (f27 * f15) + (f28 * f16);
        float f29 = fArr[3];
        float f30 = fArr[7];
        float f31 = fArr[11];
        float f32 = fArr[15];
        fArr[3] = (f29 * f) + (f30 * f2) + (f31 * f3) + (f32 * f4);
        fArr[7] = (f29 * f5) + (f30 * f6) + (f31 * f7) + (f32 * f8);
        fArr[11] = (f29 * f9) + (f30 * f10) + (f31 * f11) + (f32 * f12);
        fArr[15] = (f29 * f13) + (f30 * f14) + (f31 * f15) + (f32 * f16);
    }
}
