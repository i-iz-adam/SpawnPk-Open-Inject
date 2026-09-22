package rs;

import gnu.trove.i.a.i;

/* JADX INFO: loaded from: client-final.jar:rs/class_57.class */
class class_57 {
    int a;
    private i c;
    private int[] d;
    final /* synthetic */ class_56 b;

    class_57(class_56 class_56Var) {
        this.b = class_56Var;
    }

    public int a() {
        int[] iArr = this.d;
        int i = this.a;
        this.a = i + 1;
        int i2 = iArr[i];
        if (this.a >= this.d.length) {
            this.a = 0;
        }
        return i2;
    }
}
