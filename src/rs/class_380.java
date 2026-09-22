package rs;

import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/class_380.class */
class class_380 extends class_357 {
    final /* synthetic */ class_377 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    class_380(class_377 class_377Var, long j) {
        super(j);
        this.h = class_377Var;
    }

    @Override // rs.class_357
    public void e() {
        Launcher.n().o().b(f(), g(), " <img=25> Vote to skip\nIf enough players vote to skip, the\nhotspot will automatically change.");
    }
}
