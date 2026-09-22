package rs;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/* JADX INFO: loaded from: client-final.jar:rs/class_28.class */
class class_28 extends ComponentAdapter {
    final /* synthetic */ class_27 a;

    class_28(class_27 class_27Var) {
        this.a = class_27Var;
    }

    public void componentMoved(ComponentEvent componentEvent) {
        if (System.currentTimeMillis() - Client.j > 100) {
            Client.h = true;
            Client.j = System.currentTimeMillis();
        }
    }
}
