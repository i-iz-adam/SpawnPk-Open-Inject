package rs;

import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/class_235.class */
class class_235 implements class_257 {
    final /* synthetic */ class_233 a;

    class_235(class_233 class_233Var) {
        this.a = class_233Var;
    }

    @Override // rs.class_257
    public void a(Widget widget, int i, int i2) {
        if (!class_233.q || widget.ax[1] <= 0) {
            return;
        }
        int i3 = widget.ax[1] > 0 ? 50 : 0;
        Launcher.n().o();
        if (!Client.ag()) {
            i3 += 4;
            i2 += 4;
        }
        class_192.a.a((i - 7) + i3, i2, 160);
        class_192.a.a((i - 7) + i3, i2 + 2 + 15, 160);
        class_192.a.a(i + 23 + i3, i2, 160);
        class_192.a.a(i + 23 + i3, i2 + 2 + 15, 160);
    }
}
