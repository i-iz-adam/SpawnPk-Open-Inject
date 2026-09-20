package rs.p_s.p_m;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.undo.CannotUndoException;

class C_c extends AbstractAction {
   C_c(C_b var1, String var2) {
      super(var2);
      this.a = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      try {
         if (C_b.a(this.a).canUndo()) {
            C_b.a(this.a).undo();
         }
      } catch (CannotUndoException var3) {
         C_b.b().warn("Notes Document Unable To Undo: " + var3);
      }
   }
}
