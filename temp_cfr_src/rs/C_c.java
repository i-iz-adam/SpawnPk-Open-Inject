/*
 * Decompiled with CFR 0.152.
 */
package rs;

final class C_c {
    C_c() {
    }

    public static int a(int n, int n2, int n3) {
        if ((n &= 3) == 0) {
            return n3;
        }
        if (n == 1) {
            return n2;
        }
        if (n == 2) {
            return 7 - n3;
        }
        return 7 - n2;
    }

    public static int b(int n, int n2, int n3) {
        if ((n2 &= 3) == 0) {
            return n;
        }
        if (n2 == 1) {
            return 7 - n3;
        }
        if (n2 == 2) {
            return 7 - n;
        }
        return n3;
    }

    public static int a(int n, int n2, int n3, int n4, int n5) {
        if ((n &= 3) == 0) {
            return n3;
        }
        if (n == 1) {
            return n4;
        }
        if (n == 2) {
            return 7 - n3 - (n5 - 1);
        }
        return 7 - n4 - (n2 - 1);
    }

    public static int b(int n, int n2, int n3, int n4, int n5) {
        if ((n3 &= 3) == 0) {
            return n;
        }
        if (n3 == 1) {
            return 7 - n5 - (n4 - 1);
        }
        if (n3 == 2) {
            return 7 - n - (n2 - 1);
        }
        return n5;
    }
}

