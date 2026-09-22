package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_129.class */
public final class class_129 {
    public static class_129[] a;
    private static int d;
    private static int[] e;
    public int b;
    public boolean c = false;

    public static void a(class_663 class_663Var) {
        Buffer buffer = new Buffer(class_663Var.a("varp.dat"));
        d = 0;
        int iA = buffer.A();
        if (a == null) {
            a = new class_129[iA + 10000];
        }
        if (e == null) {
            e = new int[iA];
        }
        for (int i = 0; i < iA; i++) {
            if (a[i] == null) {
                a[i] = new class_129();
            }
            a[i].a(buffer, i);
        }
        if (buffer.h != buffer.g.length) {
            System.out.println("varptype load mismatch");
        }
    }

    private void a(Buffer buffer, int i) {
        while (true) {
            int iY = buffer.y();
            if (iY == 0) {
                return;
            }
            if (iY == 1) {
                buffer.y();
            } else if (iY == 2) {
                buffer.y();
            } else if (iY == 3) {
                int[] iArr = e;
                int i2 = d;
                d = i2 + 1;
                iArr[i2] = i;
            } else if (iY != 4) {
                if (iY == 5) {
                    this.b = buffer.A();
                } else if (iY != 6) {
                    if (iY == 7) {
                        buffer.D();
                    } else if (iY == 8) {
                        this.c = true;
                    } else if (iY == 10) {
                        buffer.F();
                    } else if (iY == 11) {
                        this.c = true;
                    } else if (iY == 12) {
                        buffer.D();
                    } else if (iY != 13) {
                        System.out.println("[VARP] Error unrecognised config code: " + iY);
                    }
                }
            }
        }
    }

    private class_129() {
    }
}
