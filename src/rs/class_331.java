package rs;

import java.awt.Dimension;
import java.awt.Toolkit;
import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/class_331.class */
class class_331 implements Runnable {
    final /* synthetic */ class_330 a;

    class_331(class_330 class_330Var) {
        this.a = class_330Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (class_205.c) {
            Launcher.n().i().setVisible(true);
        }
        int i = 1134;
        int i2 = 537;
        if (class_205.c) {
            i = 1312;
            i2 = 800;
        }
        Launcher.n().i().setSize(i, i2);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Launcher.n().i().setLocation((screenSize.width / 2) - (Launcher.n().i().getSize().width / 2), (screenSize.height / 2) - (Launcher.n().i().getSize().height / 2));
        if (!class_205.c || screenSize.getWidth() >= i) {
            return;
        }
        Launcher.n().i().setExtendedState(6);
    }
}
