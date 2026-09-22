package rs;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/* JADX INFO: loaded from: client-final.jar:rs/class_222.class */
class class_222 extends MouseAdapter {
    final /* synthetic */ class_220 a;

    class_222(class_220 class_220Var) {
        this.a = class_220Var;
    }

    public void mousePressed(MouseEvent mouseEvent) {
        if (this.a.p != null && !this.a.p.fc && mouseEvent.getY() >= 460 && mouseEvent.getY() <= 485 && mouseEvent.getX() >= 10 && mouseEvent.getX() <= 132) {
            Client.d("https://spawnpk.net/forums/index.php?/forum/10-updates/");
        }
    }
}
