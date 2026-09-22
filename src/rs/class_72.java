package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_72.class */
final class class_72 {
    class_72() {
    }

    public static int a(int i, int i2, int i3) {
        int i4 = i & 3;
        if (i4 == 0) {
            return i3;
        }
        if (i4 == 1) {
            return i2;
        }
        return i4 == 2 ? 7 - i3 : 7 - i2;
    }

    public static int b(int i, int i2, int i3) {
        int i4 = i2 & 3;
        if (i4 == 0) {
            return i;
        }
        if (i4 == 1) {
            return 7 - i3;
        }
        return i4 == 2 ? 7 - i : i3;
    }

    public static int a(int i, int i2, int i3, int i4, int i5) {
        int i6 = i & 3;
        if (i6 == 0) {
            return i3;
        }
        if (i6 == 1) {
            return i4;
        }
        return i6 == 2 ? (7 - i3) - (i5 - 1) : (7 - i4) - (i2 - 1);
    }

    public static int b(int i, int i2, int i3, int i4, int i5) {
        int i6 = i3 & 3;
        if (i6 == 0) {
            return i;
        }
        if (i6 == 1) {
            return (7 - i5) - (i4 - 1);
        }
        return i6 == 2 ? (7 - i) - (i2 - 1) : i5;
    }
}
