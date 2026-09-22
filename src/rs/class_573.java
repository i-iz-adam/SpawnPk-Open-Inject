package rs;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/* JADX INFO: loaded from: client-final.jar:rs/class_573.class */
class class_573 extends KeyAdapter {
    final /* synthetic */ class_572 a;

    class_573(class_572 class_572Var) {
        this.a = class_572Var;
    }

    public void keyPressed(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 70 || (keyEvent.getModifiersEx() & 128) == 0) {
            return;
        }
        this.a.d.setVisible(true);
    }
}
