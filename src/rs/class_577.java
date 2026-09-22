package rs;

import java.util.Queue;

/* JADX INFO: loaded from: client-final.jar:rs/class_577.class */
class class_577 implements Runnable {
    final /* synthetic */ class_572[] a;
    final /* synthetic */ Queue b;
    final /* synthetic */ class_575 c;

    class_577(class_575 class_575Var, class_572[] class_572VarArr, Queue queue) {
        this.c = class_575Var;
        this.a = class_572VarArr;
        this.b = queue;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.a[0] == null) {
            this.a[0] = new class_572();
        }
        while (true) {
            String str = (String) this.b.poll();
            if (str == null) {
                return;
            } else {
                this.a[0].a().append(str + "\n");
            }
        }
    }
}
