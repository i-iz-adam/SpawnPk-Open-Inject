package rs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/* JADX INFO: loaded from: client-final.jar:rs/class_574.class */
class class_574 implements KeyListener {
    final /* synthetic */ class_572 a;

    class_574(class_572 class_572Var) {
        this.a = class_572Var;
    }

    public void keyTyped(KeyEvent keyEvent) {
    }

    public void keyPressed(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case 10:
            case 40:
                this.a.a(false);
                break;
            case 33:
            case 34:
                String text = this.a.c.getText();
                String text2 = this.a.a.getText();
                int iLastIndexOf = keyEvent.getKeyCode() == 34 ? text2.lastIndexOf(text, text2.length() - 1) : text2.indexOf(text, 0);
                this.a.a(iLastIndexOf, iLastIndexOf + 1);
                break;
            case 38:
                this.a.a(true);
                break;
        }
    }

    public void keyReleased(KeyEvent keyEvent) {
    }
}
