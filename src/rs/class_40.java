package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_40.class */
public final class class_40 {
    private static final char[] a = new char[100];
    private static final Buffer b = new Buffer(new byte[100]);
    private static char[] c = {' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', 163, '$', '%', '\"', '[', ']', '>', '<', '^', '/', '_'};

    public static String a(int i, Buffer buffer) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i2;
            i2++;
            a[i4] = c[buffer.y()];
        }
        boolean z = true;
        for (int i5 = 0; i5 < i2; i5++) {
            char c2 = a[i5];
            if (z && c2 >= 'a' && c2 <= 'z') {
                char[] cArr = a;
                int i6 = i5;
                cArr[i6] = (char) (cArr[i6] + 65504);
                z = false;
            }
            if (c2 == '.' || c2 == '!' || c2 == '?') {
                z = true;
            }
        }
        return new String(a, 0, i2);
    }

    public static void a(String str, Buffer buffer) {
        if (str.length() > 80) {
            str = str.substring(0, 80);
        }
        String lowerCase = str.toLowerCase();
        for (int i = 0; i < lowerCase.length(); i++) {
            char cCharAt = lowerCase.charAt(i);
            int i2 = 0;
            for (int i3 = 0; i3 < c.length; i3++) {
                if (cCharAt == c[i3]) {
                    i2 = i3;
                    break;
                }
            }
            buffer.b(i2);
        }
    }

    public static String a(String str) {
        b.h = 0;
        a(str, b);
        int i = b.h;
        b.h = 0;
        return a(i, b);
    }
}
