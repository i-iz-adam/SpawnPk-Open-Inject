package rs.gui;

import java.awt.Dimension;

/* JADX INFO: loaded from: client-final.jar:rs/gui/D.class */
class D implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ Launcher e;

    D(Launcher launcher, int i, int i2, int i3, int i4) {
        this.e = launcher;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.e.i().setMinimumSize(new Dimension(this.a, this.b));
        this.e.i().setSize(this.c, this.d);
    }
}
