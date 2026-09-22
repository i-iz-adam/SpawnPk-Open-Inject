package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_54.class */
public class class_54 {
    private static final int b = 10;
    private static int c;
    public static Buffer[] a = new Buffer[10];

    public static Buffer a(byte[] bArr) {
        if (a[c] == null) {
            a[c] = new Buffer(bArr);
        } else {
            a[c].b(bArr);
        }
        Buffer[] bufferArr = a;
        int i = c;
        c = i + 1;
        return bufferArr[i];
    }

    public static void a() {
        for (int i = 0; i <= c; i++) {
            if (a[c] != null) {
                a[c].b((byte[]) null);
            }
        }
        c = 0;
    }
}
