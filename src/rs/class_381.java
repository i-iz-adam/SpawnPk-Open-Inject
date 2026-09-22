package rs;

import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/class_381.class */
class class_381 extends class_357 {
    final /* synthetic */ class_357 h;
    final /* synthetic */ class_377 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    class_381(class_377 class_377Var, long j, class_357 class_357Var) {
        super(j);
        this.i = class_377Var;
        this.h = class_357Var;
    }

    @Override // rs.class_357
    public void e() {
        if (class_357.g.contains(this.h)) {
            return;
        }
        Launcher.n().o().b(f(), g(), "<img=158> PvP Hotspot\n" + Launcher.n().o().bS + "\nChance to receive @yel@wild caskets@whi@ from PKs!\n(Blood orbs earn you better caskets)");
    }
}
