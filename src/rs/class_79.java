package rs;

import java.io.RandomAccessFile;

/* JADX INFO: loaded from: client-final.jar:rs/class_79.class */
public class class_79 {
    private RandomAccessFile b;
    private final RandomAccessFile[] c = new RandomAccessFile[5];
    private final class_76[] a = new class_76[5];

    public void a(String str, String str2) {
        try {
            this.b = new RandomAccessFile(class_650.f() + str, "rw");
            for (int i = 0; i < 5; i++) {
                this.c[i] = new RandomAccessFile(class_650.f() + str2 + i, "rw");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i2 = 0; i2 < 5; i2++) {
            this.a[i2] = new class_76(this.b, this.c[i2], i2 + 1);
        }
    }

    public class_76[] a() {
        return this.a;
    }
}
