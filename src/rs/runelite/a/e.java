package rs.runelite.a;

import java.util.List;

/* JADX INFO: loaded from: client-final.jar:rs/runelite/a/e.class */
public class e {
    @Deprecated
    public static List<i> a(List<i> list) {
        int[] iArr = new int[list.size()];
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            i iVar = list.get(i);
            iArr[i] = iVar.a();
            iArr2[i] = iVar.b();
        }
        m mVarA = a(iArr, iArr2);
        if (mVarA == null) {
            return null;
        }
        return mVarA.e();
    }

    public static m a(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (iArr[i] == Integer.MIN_VALUE) {
                i2 = 0 + 1;
                i++;
                break;
            }
            i++;
        }
        while (i < length) {
            if (iArr[i] == Integer.MIN_VALUE) {
                i2++;
            } else {
                iArr[i - i2] = iArr[i];
                iArr2[i - i2] = iArr2[i];
            }
            i++;
        }
        int i3 = length - i2;
        if (i3 < 3) {
            return null;
        }
        int iA = a(iArr, iArr2, i3);
        int i4 = iA;
        m mVar = new m(new int[16], new int[16], 0);
        do {
            int i5 = iArr[i4];
            int i6 = iArr2[i4];
            mVar.b(i5, i6);
            if (mVar.d() > i3) {
                return null;
            }
            int i7 = 0;
            int i8 = iArr[0];
            int i9 = iArr2[0];
            for (int i10 = 1; i10 < i3; i10++) {
                long jA = a(i5, i6, iArr[i10], iArr2[i10], i8, i9);
                if (jA > 0 || (jA == 0 && a(i5 - iArr[i10]) + a(i6 - iArr2[i10]) > a(i5 - i8) + a(i6 - i9))) {
                    i7 = i10;
                    i8 = iArr[i7];
                    i9 = iArr2[i7];
                }
            }
            i4 = i7;
        } while (i4 != iA);
        return mVar;
    }

    private static int a(int i) {
        return i * i;
    }

    private static int a(int[] iArr, int[] iArr2, int i) {
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = iArr2[0];
        for (int i5 = 1; i5 < i; i5++) {
            int i6 = iArr[i5];
            if (i6 < i3 || (i6 == i3 && iArr2[i5] < i4)) {
                i2 = i5;
                i3 = iArr[i2];
                i4 = iArr2[i2];
            }
        }
        return i2;
    }

    private static long a(int i, int i2, int i3, int i4, int i5, int i6) {
        return (((long) (i4 - i2)) * ((long) (i5 - i3))) - (((long) (i3 - i)) * ((long) (i6 - i4)));
    }
}
