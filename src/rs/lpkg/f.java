package rs.lpkg;

import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/l/f.class */
class f implements Runnable {
    final /* synthetic */ e a;

    f(e eVar) {
        this.a = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        e.a(true);
        if (this.a.v != e.a.a) {
            this.a.v();
            this.a.w();
        }
        Launcher.n().o().D();
        Launcher.n().o().d();
    }
}
