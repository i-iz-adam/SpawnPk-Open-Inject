package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_645.class */
public class class_645 {
    boolean a;
    boolean b;
    boolean d;
    class_647 e;
    class_647 f;
    class_639[] g;
    float h;
    float i;
    float j;
    float k;
    float[] n;
    int p;
    int q;
    boolean c = true;
    float[] l = new float[4];
    float[] m = new float[4];
    int o = 0;

    public int a(Buffer buffer, int i) {
        int iO = buffer.o();
        buffer.y();
        this.f = class_647.a(buffer.y());
        this.e = class_647.a(buffer.y());
        this.b = buffer.y() != 0;
        this.g = new class_639[iO];
        class_639 class_639Var = null;
        for (int i2 = 0; i2 < iO; i2++) {
            class_639 class_639Var2 = new class_639();
            class_639Var2.a(buffer, i);
            this.g[i2] = class_639Var2;
            if (null != class_639Var) {
                class_639Var.a = class_639Var2;
            }
            class_639Var = class_639Var2;
        }
        this.p = this.g[0].g;
        this.q = this.g[d() - 1].g;
        this.n = new float[c() + 1];
        for (int iA = a(); iA <= b(); iA++) {
            this.n[iA - a()] = a(this, iA);
        }
        this.g = null;
        this.j = a(this, a() - 1);
        this.k = a(this, b() + 1);
        return iO;
    }

    public float a(int i) {
        if (i < a()) {
            return this.j;
        }
        return i > b() ? this.k : this.n[i - a()];
    }

    int a() {
        return this.p;
    }

    int b() {
        return this.q;
    }

    int c() {
        return b() - a();
    }

    int a(float f) {
        if (this.o >= 0 && this.g[this.o].g <= f && (null == this.g[this.o].a || this.g[this.o].a.g > f)) {
            return this.o;
        }
        if (f < a() || f > b()) {
            return -1;
        }
        int iD = d();
        int i = this.o;
        if (iD > 0) {
            int i2 = 0;
            int i3 = iD - 1;
            do {
                int i4 = (i3 + i2) >> 1;
                if (f < this.g[i4].g) {
                    if (f > this.g[i4 - 1].g) {
                        i = i4 - 1;
                        break;
                    }
                    i3 = i4 - 1;
                } else {
                    if (f <= this.g[i4].g) {
                        i = i4;
                        break;
                    }
                    if (f < this.g[i4 + 1].g) {
                        i = i4;
                        break;
                    }
                    i2 = i4 + 1;
                }
            } while (i2 <= i3);
        }
        if (i != this.o) {
            this.o = i;
            this.c = true;
        }
        return this.o;
    }

    class_639 b(float f) {
        int iA = a(f);
        if (iA < 0 || iA >= this.g.length) {
            return null;
        }
        return this.g[iA];
    }

    int d() {
        if (this.g == null) {
            return 0;
        }
        return this.g.length;
    }

    static float a(class_645 class_645Var, float f) {
        if (class_645Var == null || class_645Var.d() == 0) {
            return 0.0f;
        }
        if (f < class_645Var.g[0].g) {
            return class_647.a == class_645Var.f ? class_645Var.g[0].b : a(class_645Var, f, true);
        }
        if (f > class_645Var.g[class_645Var.d() - 1].g) {
            return class_645Var.e == class_647.a ? class_645Var.g[class_645Var.d() - 1].b : a(class_645Var, f, false);
        }
        if (class_645Var.a) {
            return class_645Var.g[0].b;
        }
        class_639 class_639VarB = class_645Var.b(f);
        boolean z = false;
        boolean z2 = false;
        if (null == class_639VarB) {
            return 0.0f;
        }
        if (class_639VarB.e == 0.0d && 0.0d == class_639VarB.f) {
            z = true;
        } else if (Float.MAX_VALUE == class_639VarB.e && Float.MAX_VALUE == class_639VarB.f) {
            z2 = true;
        } else if (class_639VarB.a == null) {
            z = true;
        } else if (class_645Var.c) {
            float[] fArr = new float[4];
            float[] fArr2 = new float[4];
            fArr[0] = class_639VarB.g;
            fArr2[0] = class_639VarB.b;
            fArr[1] = fArr[0] + (0.33333334f * class_639VarB.e);
            fArr2[1] = (0.33333334f * class_639VarB.f) + fArr2[0];
            fArr[3] = class_639VarB.a.g;
            fArr2[3] = class_639VarB.a.b;
            fArr[2] = fArr[3] - (class_639VarB.a.d * 0.33333334f);
            fArr2[2] = fArr2[3] - (class_639VarB.a.c * 0.33333334f);
            if (class_645Var.b) {
                b(class_645Var, fArr, fArr2);
            } else {
                a(class_645Var, fArr, fArr2);
            }
            class_645Var.c = false;
        }
        if (z) {
            return class_639VarB.b;
        }
        if (z2) {
            return (((float) class_639VarB.g) == f || class_639VarB.a == null) ? class_639VarB.b : class_639VarB.a.b;
        }
        return class_645Var.b ? c(class_645Var, f) : b(class_645Var, f);
    }

    private static void b(class_645 class_645Var, float[] fArr, float[] fArr2) {
        if (null != class_645Var) {
            float f = fArr[3] - fArr[0];
            if (f != 0.0d) {
                float f2 = fArr[1] - fArr[0];
                float f3 = fArr[2] - fArr[0];
                Float fValueOf = Float.valueOf(f2 / f);
                Float fValueOf2 = Float.valueOf(f3 / f);
                class_645Var.d = fValueOf.floatValue() == 0.33333334f && fValueOf2.floatValue() == 0.6666667f;
                float fFloatValue = fValueOf.floatValue();
                float fFloatValue2 = fValueOf2.floatValue();
                if (fValueOf.floatValue() < 0.0d) {
                    fValueOf = Float.valueOf(0.0f);
                }
                if (fValueOf2.floatValue() > 1.0d) {
                    fValueOf2 = Float.valueOf(1.0f);
                }
                if (fValueOf.floatValue() > 1.0d || fValueOf2.floatValue() < -1.0f) {
                    Float fValueOf3 = fValueOf;
                    Float fValueOf4 = Float.valueOf(1.0f - fValueOf2.floatValue());
                    if (fValueOf.floatValue() < 0.0f) {
                        fValueOf3 = Float.valueOf(0.0f);
                    }
                    if (fValueOf4.floatValue() < 0.0f) {
                        fValueOf4 = Float.valueOf(0.0f);
                    }
                    if (fValueOf3.floatValue() > 1.0f || fValueOf4.floatValue() > 1.0f) {
                        if (class_644.a + ((float) (((double) (fValueOf3.floatValue() * ((fValueOf3.floatValue() - 2.0f) + fValueOf4.floatValue()))) + (((double) fValueOf4.floatValue()) * (((double) fValueOf4.floatValue()) - 2.0d)) + 1.0d)) > 0.0f) {
                            float[] fArrA = a(fValueOf3.floatValue(), fValueOf4.floatValue());
                            fValueOf3 = Float.valueOf(fArrA[0]);
                            fValueOf4 = Float.valueOf(fArrA[1]);
                        }
                    }
                    fValueOf = fValueOf3;
                    fValueOf2 = Float.valueOf(1.0f - fValueOf4.floatValue());
                }
                if (fValueOf.floatValue() != fFloatValue) {
                    fArr[1] = fArr[0] + (fValueOf.floatValue() * f);
                    if (0.0d != fFloatValue) {
                        fArr2[1] = fArr2[0] + (((fArr2[1] - fArr2[0]) * fValueOf.floatValue()) / fFloatValue);
                    }
                }
                if (fValueOf2.floatValue() != fFloatValue2) {
                    fArr[2] = fArr[0] + (fValueOf2.floatValue() * f);
                    if (fFloatValue2 != 1.0d) {
                        fArr2[2] = (float) (((double) fArr2[3]) - ((((double) (fArr2[3] - fArr2[2])) * (1.0d - ((double) fValueOf2.floatValue()))) / (1.0d - ((double) fFloatValue2))));
                    }
                }
                class_645Var.h = fArr[0];
                class_645Var.i = fArr[3];
                float fFloatValue3 = fValueOf.floatValue();
                float fFloatValue4 = fValueOf2.floatValue();
                float[] fArr3 = class_645Var.l;
                float f4 = fFloatValue3 - 0.0f;
                float f5 = fFloatValue4 - fFloatValue3;
                float f6 = 1.0f - fFloatValue4;
                float f7 = f5 - f4;
                fArr3[3] = (f6 - f5) - f7;
                fArr3[2] = f7 + f7 + f7;
                fArr3[1] = f4 + f4 + f4;
                fArr3[0] = 0.0f;
                float f8 = fArr2[0];
                float f9 = fArr2[1];
                float f10 = fArr2[2];
                float f11 = fArr2[3];
                float[] fArr4 = class_645Var.m;
                float f12 = f9 - f8;
                float f13 = f10 - f9;
                float f14 = f11 - f10;
                float f15 = f13 - f12;
                fArr4[3] = (f14 - f13) - f15;
                fArr4[2] = f15 + f15 + f15;
                fArr4[1] = f12 + f12 + f12;
                fArr4[0] = f8;
            }
        }
    }

    static float a(class_645 class_645Var, float f, boolean z) {
        if (class_645Var == null || class_645Var.d() == 0) {
            return 0.0f;
        }
        float f2 = class_645Var.g[0].g;
        float f3 = class_645Var.g[class_645Var.d() - 1].g;
        float f4 = f3 - f2;
        if (f4 == 0.0d) {
            return class_645Var.g[0].b;
        }
        float f5 = f > f3 ? (f - f3) / f4 : (f - f2) / f4;
        double d = (int) f5;
        float fAbs = f4 * Math.abs((float) (((double) f5) - d));
        double dAbs = Math.abs(d + 1.0d);
        double d2 = dAbs / 2.0d;
        float f6 = (float) (d2 - ((double) ((int) d2)));
        if (z) {
            if (class_645Var.f == class_647.c) {
                fAbs = ((double) f6) == 0.0d ? f3 - fAbs : fAbs + f2;
            } else if (class_647.e == class_645Var.f || class_647.d == class_645Var.f) {
                fAbs = f3 - fAbs;
            } else if (class_645Var.f == class_647.b) {
                float f7 = f2 - f;
                float f8 = class_645Var.g[0].d;
                float f9 = class_645Var.g[0].c;
                float f10 = class_645Var.g[0].b;
                if (f8 != 0.0d) {
                    f10 -= (f7 * f9) / f8;
                }
                return f10;
            }
        } else if (class_647.c == class_645Var.e) {
            fAbs = ((double) f6) == 0.0d ? fAbs + f2 : f3 - fAbs;
        } else if (class_647.e == class_645Var.e || class_647.d == class_645Var.e) {
            fAbs += f2;
        } else if (class_647.b == class_645Var.e) {
            float f11 = f - f3;
            float f12 = class_645Var.g[class_645Var.d() - 1].e;
            float f13 = class_645Var.g[class_645Var.d() - 1].f;
            float f14 = class_645Var.g[class_645Var.d() - 1].b;
            if (0.0d != f12) {
                f14 += (f11 * f13) / f12;
            }
            return f14;
        }
        float fA = a(class_645Var, fAbs);
        if (z && class_647.d == class_645Var.f) {
            fA = (float) (((double) fA) - (((double) (class_645Var.g[class_645Var.d() - 1].b - class_645Var.g[0].b)) * dAbs));
        } else if (!z && class_647.d == class_645Var.e) {
            fA = (float) (((double) fA) + (dAbs * ((double) (class_645Var.g[class_645Var.d() - 1].b - class_645Var.g[0].b))));
        }
        return fA;
    }

    static void a(class_645 class_645Var, float[] fArr, float[] fArr2) {
        if (class_645Var != null) {
            class_645Var.h = fArr[0];
            float f = fArr[3] - fArr[0];
            float f2 = fArr2[3] - fArr2[0];
            float f3 = fArr[1] - fArr[0];
            float f4 = 0.0f;
            float f5 = 0.0f;
            if (f3 != 0.0d) {
                f4 = (fArr2[1] - fArr2[0]) / f3;
            }
            float f6 = fArr[3] - fArr[2];
            if (0.0d != f6) {
                f5 = (fArr2[3] - fArr2[2]) / f6;
            }
            float f7 = 1.0f / (f * f);
            float f8 = f * f4;
            float f9 = f5 * f;
            class_645Var.l[0] = (f7 * (((f9 + f8) - f2) - f2)) / f;
            class_645Var.l[1] = f7 * (((((f2 + f2) + f2) - f8) - f8) - f9);
            class_645Var.l[2] = f4;
            class_645Var.l[3] = fArr2[0];
        }
    }

    static float b(class_645 class_645Var, float f) {
        if (class_645Var == null) {
            return 0.0f;
        }
        float f2 = f - class_645Var.h;
        return class_645Var.l[3] + ((class_645Var.l[2] + (((f2 * class_645Var.l[0]) + class_645Var.l[1]) * f2)) * f2);
    }

    static float c(class_645 class_645Var, float f) {
        float f2;
        float f3;
        if (class_645Var == null) {
            return 0.0f;
        }
        if (class_645Var.h == f) {
            f2 = 0.0f;
        } else {
            f2 = class_645Var.i == f ? 1.0f : (f - class_645Var.h) / (class_645Var.i - class_645Var.h);
        }
        if (class_645Var.d) {
            f3 = f2;
        } else {
            float[] fArr = new float[5];
            f3 = a(new float[]{class_645Var.l[0] - f2, class_645Var.l[1], class_645Var.l[2], class_645Var.l[3]}, 3, 0.0f, true, 1.0f, true, fArr) == 1 ? fArr[0] : 0.0f;
        }
        return (f3 * (class_645Var.m[1] + (f3 * (class_645Var.m[2] + (f3 * class_645Var.m[3]))))) + class_645Var.m[0];
    }

    public static int a(float[] fArr, int i, float f, boolean z, float f2, boolean z2, float[] fArr2) {
        float f3;
        float fA;
        float fAbs = 0.0f;
        for (int i2 = 0; i2 < 1 + i; i2++) {
            fAbs += Math.abs(fArr[i2]);
        }
        float fAbs2 = (Math.abs(f) + Math.abs(f2)) * (i + 1) * class_644.a;
        if (fAbs <= fAbs2) {
            return -1;
        }
        float[] fArr3 = new float[i + 1];
        for (int i3 = 0; i3 < i + 1; i3++) {
            fArr3[i3] = fArr[i3] * (1.0f / fAbs);
        }
        while (Math.abs(fArr3[i]) < fAbs2) {
            i--;
        }
        int i4 = 0;
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            fArr2[0] = (-fArr3[0]) / fArr3[1];
            int i5 = ((z ? f < fArr2[0] + fAbs2 : f < fArr2[0] - fAbs2) && (z2 ? f2 > fArr2[0] - fAbs2 : f2 > fArr2[0] + fAbs2)) ? 1 : 0;
            if (i5 > 0) {
                if (z && fArr2[0] < f) {
                    fArr2[0] = f;
                } else if (z2 && fArr2[0] > f2) {
                    fArr2[0] = f2;
                }
            }
            return i5;
        }
        class_646 class_646Var = new class_646(fArr3, i);
        float[] fArrA = class_646.a(i, fArr3);
        float[] fArr4 = new float[i + 1];
        int iA = a(fArrA, i - 1, f, false, f2, false, fArr4);
        if (iA == -1) {
            return 0;
        }
        boolean z3 = false;
        float fA2 = 0.0f;
        float f4 = 0.0f;
        for (int i6 = 0; i6 <= iA && i4 <= i; i6++) {
            if (i6 == 0) {
                f3 = f;
                fA = class_646.a(fArr3, i, f);
                if (Math.abs(fA) <= fAbs2 && z) {
                    int i7 = i4;
                    i4++;
                    fArr2[i7] = f;
                }
            } else {
                f3 = f4;
                fA = fA2;
            }
            if (i6 == iA) {
                f4 = f2;
                z3 = false;
            } else {
                f4 = fArr4[i6];
            }
            fA2 = class_646.a(fArr3, i, f4);
            if (z3) {
                z3 = false;
            } else if (Math.abs(fA2) < fAbs2) {
                if (i6 != iA || z2) {
                    int i8 = i4;
                    i4++;
                    fArr2[i8] = f4;
                    z3 = true;
                }
            } else if ((fA < 0.0f && fA2 > 0.0f) || (fA > 0.0f && fA2 < 0.0f)) {
                int i9 = i4;
                i4++;
                fArr2[i9] = a(class_646Var, f3, f4, 0.0f);
                if (i4 > 1 && fArr2[i4 - 2] >= fArr2[i4 - 1] - fAbs2) {
                    fArr2[i4 - 2] = 0.5f * (fArr2[i4 - 1] + fArr2[i4 - 2]);
                    i4--;
                }
            }
        }
        return i4;
    }

    public static float a(class_646 class_646Var, float f, float f2, float f3) {
        boolean z;
        float f4;
        float f5;
        float fA = class_646.a(class_646Var.a, class_646Var.b, f);
        if (Math.abs(fA) < class_644.a) {
            return f;
        }
        float fA2 = class_646.a(class_646Var.a, class_646Var.b, f2);
        if (Math.abs(fA2) < class_644.a) {
            return f2;
        }
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        boolean z2 = true;
        do {
            z = false;
            if (z2) {
                f6 = f;
                f9 = fA;
                f7 = f2 - f;
                f8 = f7;
                z2 = false;
            }
            if (Math.abs(f9) < Math.abs(fA2)) {
                f = f2;
                f2 = f6;
                f6 = f;
                fA = fA2;
                fA2 = f9;
                f9 = fA;
            }
            float fAbs = (class_644.b * Math.abs(f2)) + (f3 * 0.5f);
            float f10 = 0.5f * (f6 - f2);
            if (Math.abs(f10) > fAbs && 0.0f != fA2) {
                if (Math.abs(f8) < fAbs || Math.abs(fA) <= Math.abs(fA2)) {
                    f7 = f10;
                    f8 = f10;
                } else {
                    float f11 = fA2 / fA;
                    if (f6 == f) {
                        f4 = f10 * 2.0f * f11;
                        f5 = 1.0f - f11;
                    } else {
                        float f12 = fA / f9;
                        float f13 = fA2 / f9;
                        f4 = f11 * ((((f12 * f10) * 2.0f) * (f12 - f13)) - ((f2 - f) * (f13 - 1.0f)));
                        f5 = (f11 - 1.0f) * (f13 - 1.0f) * (f12 - 1.0f);
                    }
                    if (f4 > 0.0d) {
                        f5 = -f5;
                    } else {
                        f4 = -f4;
                    }
                    float f14 = f8;
                    f8 = f7;
                    if (2.0f * f4 >= ((f5 * f10) * 3.0f) - Math.abs(fAbs * f5) || f4 >= Math.abs(f5 * f14 * 0.5f)) {
                        f7 = f10;
                        f8 = f10;
                    } else {
                        f7 = f4 / f5;
                    }
                }
                f = f2;
                fA = fA2;
                if (Math.abs(f7) > fAbs) {
                    f2 += f7;
                } else {
                    f2 = ((double) f10) > 0.0d ? f2 + fAbs : f2 - fAbs;
                }
                fA2 = class_646.a(class_646Var.a, class_646Var.b, f2);
                if (fA2 * (f9 / Math.abs(f9)) > 0.0d) {
                    z2 = true;
                    z = true;
                } else {
                    z = true;
                }
            }
        } while (z);
        return f2;
    }

    public static float[] a(float f, float f2) {
        if (f + class_644.a < 1.3333334f) {
            float f3 = f - 2.0f;
            float f4 = f - 1.0f;
            float fSqrt = (float) Math.sqrt((f3 * f3) - ((f4 * f4) * 4.0f));
            float f5 = 0.5f * (fSqrt + (-f3));
            if (f2 + class_644.a > f5) {
                f2 = f5 - class_644.a;
            } else {
                float f6 = 0.5f * ((-f3) - fSqrt);
                if (f2 < f6 + class_644.a) {
                    f2 = class_644.a + f6;
                }
            }
        } else {
            f = 1.3333334f - class_644.a;
            f2 = 0.33333334f - class_644.a;
        }
        return new float[]{f, f2};
    }
}
