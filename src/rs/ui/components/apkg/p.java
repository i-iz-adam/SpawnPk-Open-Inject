package rs.ui.components.apkg;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.function.Consumer;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/a/p.class */
class p extends MouseAdapter {
    final /* synthetic */ Consumer a;
    final /* synthetic */ Color b;

    p(Consumer consumer, Color color) {
        this.a = consumer;
        this.b = color;
    }

    public void mouseClicked(MouseEvent mouseEvent) {
        this.a.accept(this.b);
    }
}
