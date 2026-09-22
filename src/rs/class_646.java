package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_646.class */
public class class_646 {
    public float[] a;
    public int b;

    public class_646(float[] fArr, int i) {
        this.a = fArr;
        this.b = i;
    }

    public static float a(float[] fArr, int i, float f) {
        float f2 = fArr[i];
        for (int i2 = i - 1; i2 >= 0; i2--) {
            f2 = (f * f2) + fArr[i2];
        }
        return f2;
    }

    static float[] a(int i, float[] fArr) {
        float[] fArr2 = new float[1 + i];
        for (int i2 = 1; i2 <= i; i2++) {
            fArr2[i2 - 1] = fArr[i2] * i2;
        }
        return fArr2;
    }
}
