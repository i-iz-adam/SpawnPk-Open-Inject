package rs.p_s.p_m;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.undo.CannotUndoException;

class C_d extends AbstractAction {
   C_d(C_b var1, String var2) {
      super(var2);
      this.a = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      try {
         if (C_b.a(this.a).canRedo()) {
            C_b.a(this.a).redo();
         }
      } catch (CannotUndoException var3) {
         C_b.b().warn("Notes Document Unable To Redo: " + var3);
      }
   }
}
