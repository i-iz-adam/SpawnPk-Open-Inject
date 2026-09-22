package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_128.class */
public final class class_128 {
    public static class_128[] a;
    public int b;
    public int c;
    public int d;
    private boolean e = false;

    public static void a(class_663 class_663Var) {
        Buffer buffer = new Buffer(class_663Var.a("varbit.dat"));
        int iA = buffer.A();
        if (a == null) {
            a = new class_128[iA];
        }
        for (int i = 0; i < iA; i++) {
            if (a[i] == null) {
                a[i] = new class_128();
            }
            a[i].a(buffer);
            if (a[i].e) {
                class_129.a[a[i].b].c = true;
            }
        }
        if (buffer.h != buffer.g.length) {
            System.out.println("varbit load mismatch");
        }
    }

    private void a(Buffer buffer) {
        while (true) {
            int iY = buffer.y();
            if (iY == 0) {
                return;
            }
            if (iY == 1) {
                this.b = buffer.A();
                this.c = buffer.y();
                this.d = buffer.y();
            } else if (iY == 10) {
                buffer.F();
            } else if (iY == 2) {
                this.e = true;
            } else if (iY == 3) {
                buffer.D();
            } else if (iY == 4) {
                buffer.D();
            } else {
                System.out.println("[VARB] Error unrecognised config code: " + iY);
            }
        }
    }

    private class_128() {
    }
}
