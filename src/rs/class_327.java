package rs;

import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_327.class */
public class class_327 {
    public static int a = -10;
    public static class_325 b = new class_325(25);
    public static class_325 c = new class_325(50);
    public static class_325 d = new class_325(125);
    public static class_325 e = new class_325(User32.VK_PLAY);

    public static int a(String str, int i, int i2) {
        int i3 = Client.bN;
        char cCharAt = str.charAt(i2);
        char cCharAt2 = str.charAt(i2 + 1);
        char cCharAt3 = str.charAt(i2 + 2);
        if (cCharAt == 'p' && cCharAt2 == 'u' && cCharAt3 == '1') {
            return 4784273 + (256 * 1 * e.b());
        }
        return (cCharAt == 'p' && cCharAt2 == 'u' && cCharAt3 == '2') ? 4784273 + (1 * Math.min(100, i3 / 2)) + (131072 * (i3 / 2)) : a;
    }

    public static int b(String str, int i, int i2) {
        if (i <= i2 + 5) {
            return a;
        }
        if (str.charAt(i2 + 1) != 'i' || str.charAt(i2 + 2) != 't' || str.charAt(i2 + 3) != 'e' || str.charAt(i2 + 4) != 'm' || str.charAt(i2 + 5) != '=') {
            return a;
        }
        int iA = 0;
        for (int i3 = i2 + 5 + 1; i3 < i; i3++) {
            iA = class_324.a(iA, str.charAt(i3));
        }
        return iA;
    }

    public static int c(String str, int i, int i2) {
        if (i <= i2 + 4) {
            return a;
        }
        if (str.charAt(i2 + 1) != 'i' || str.charAt(i2 + 2) != 'm' || str.charAt(i2 + 3) != 'g' || str.charAt(i2 + 4) != '=') {
            return a;
        }
        int iA = 0;
        for (int i3 = i2 + 4 + 1; i3 < i; i3++) {
            iA = class_324.a(iA, str.charAt(i3));
        }
        return iA;
    }

    public static int d(String str, int i, int i2) {
        if (i <= i2 + 4) {
            return a;
        }
        if (str.charAt(i2 + 1) == '/' && str.charAt(i2 + 2) == 'c' && str.charAt(i2 + 3) == 'o' && str.charAt(i2 + 4) == 'l') {
            return class_324.ac;
        }
        if (str.charAt(i2 + 1) != 'c' || str.charAt(i2 + 2) != 'o' || str.charAt(i2 + 3) != 'l' || str.charAt(i2 + 4) != '=') {
            return a;
        }
        int iA = a(str, i, i2 + 5);
        if (iA != a) {
            return iA;
        }
        int iA2 = 0;
        boolean z = i - ((i2 + 4) + 1) >= 6;
        for (int i3 = i2 + 4 + 1; i3 < i; i3++) {
            iA2 = z ? class_324.a(iA2, str.charAt(i3), 16) : class_324.a(iA2, str.charAt(i3));
        }
        return z ? -iA2 : iA2;
    }

    public static int e(String str, int i, int i2) {
        if (i <= i2 + 6) {
            return a;
        }
        if (str.charAt(i2 + 1) == '/' && str.charAt(i2 + 2) == 't' && str.charAt(i2 + 3) == 'r' && str.charAt(i2 + 4) == 'a' && str.charAt(i2 + 5) == 'n' && str.charAt(i2 + 6) == 's') {
            return class_324.af;
        }
        if (str.charAt(i2 + 1) != 't' || str.charAt(i2 + 2) != 'r' || str.charAt(i2 + 3) != 'a' || str.charAt(i2 + 4) != 'n' || str.charAt(i2 + 5) != 's' || str.charAt(i2 + 6) != '=') {
            return a;
        }
        int iA = 0;
        boolean z = i - ((i2 + 5) + 1) >= 6;
        for (int i3 = i2 + 5 + 1; i3 < i; i3++) {
            iA = z ? class_324.a(iA, str.charAt(i3), 16) : class_324.a(iA, str.charAt(i3));
        }
        return z ? -iA : iA;
    }

    public static int f(String str, int i, int i2) {
        if (i <= i2 + 5) {
            return a;
        }
        if (str.charAt(i2 + 1) == '/' && str.charAt(i2 + 2) == 's' && str.charAt(i2 + 3) == 'h' && str.charAt(i2 + 4) == 'a' && str.charAt(i2 + 5) == 'd') {
            return class_324.ai;
        }
        if (str.charAt(i2 + 1) != 's' || str.charAt(i2 + 2) != 'h' || str.charAt(i2 + 3) != 'a' || str.charAt(i2 + 4) != 'd' || str.charAt(i2 + 5) != '=') {
            return a;
        }
        int iA = a(str, i, i2 + 6);
        if (iA != a) {
            return iA;
        }
        int iA2 = 0;
        boolean z = i - ((i2 + 5) + 1) >= 6;
        for (int i3 = i2 + 5 + 1; i3 < i; i3++) {
            iA2 = z ? class_324.a(iA2, str.charAt(i3), 16) : class_324.a(iA2, str.charAt(i3));
        }
        return z ? -iA2 : iA2;
    }

    public static int g(String str, int i, int i2) {
        if (i > i2 + 2 && str.charAt(i2 + 1) == '/' && str.charAt(i2 + 2) == 'u') {
            return -1;
        }
        if (i <= i2 + 1 || str.charAt(i2 + 1) != 'u') {
            return a;
        }
        if (i <= i2 + 2 || str.charAt(i2 + 2) != '=') {
            return 1;
        }
        int iA = 0;
        for (int i3 = i2 + 2 + 1; i3 < i; i3++) {
            iA = class_324.a(iA, str.charAt(i3));
        }
        return iA;
    }

    public static int h(String str, int i, int i2) {
        if (i > i2 + 4 && str.charAt(i2 + 1) == '/' && str.charAt(i2 + 2) == 's' && str.charAt(i2 + 3) == 't' && str.charAt(i2 + 4) == 'r') {
            return -1;
        }
        if (i <= i2 + 3 || str.charAt(i2 + 1) != 's' || str.charAt(i2 + 2) != 't' || str.charAt(i2 + 3) != 'r') {
            return a;
        }
        if (i <= i2 + 4 || str.charAt(i2 + 4) != '=') {
            return 8388608;
        }
        int iA = 0;
        for (int i3 = i2 + 4 + 1; i3 < i; i3++) {
            iA = class_324.a(iA, str.charAt(i3));
        }
        return iA;
    }

    public static int i(String str, int i, int i2) {
        if (i <= i2 + 4) {
            return a;
        }
        if (str.charAt(i2 + 1) != 't' || str.charAt(i2 + 2) != 'a' || str.charAt(i2 + 3) != 'b' || str.charAt(i2 + 4) != '=') {
            return a;
        }
        int iA = 0;
        for (int i3 = i2 + 4 + 1; i3 < i; i3++) {
            iA = class_324.a(iA, str.charAt(i3));
        }
        return iA;
    }

    public static int j(String str, int i, int i2) {
        if (i <= i2 + 5) {
            return a;
        }
        if (str.charAt(i2 + 1) != 'y' || str.charAt(i2 + 2) != 'o' || str.charAt(i2 + 3) != 'f' || str.charAt(i2 + 4) != 'f' || str.charAt(i2 + 5) != '=') {
            return a;
        }
        int iA = 0;
        for (int i3 = i2 + 5 + 1; i3 < i; i3++) {
            iA = class_324.a(iA, str.charAt(i3));
        }
        return iA;
    }
}
