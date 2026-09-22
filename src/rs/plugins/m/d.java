package rs.plugins.m;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.undo.CannotUndoException;

/* JADX INFO: loaded from: client-final.jar:rs/s/m/d.class */
class d extends AbstractAction {
    final /* synthetic */ b a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(b bVar, String str) {
        super(str);
        this.a = bVar;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        try {
            if (this.a.c.canRedo()) {
                this.a.c.redo();
            }
        } catch (CannotUndoException e) {
            b.a.warn("Notes Document Unable To Redo: " + String.valueOf(e));
        }
    }
}
