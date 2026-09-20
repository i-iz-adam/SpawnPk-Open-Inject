package rs.p_ui.p_components;

import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

class C_m implements ListDataListener {
   C_m(C_k var1) {
      this.a = var1;
   }

   @Override
   public void intervalAdded(ListDataEvent var1) {
      C_k.b(this.a);
   }

   @Override
   public void intervalRemoved(ListDataEvent var1) {
      C_k.b(this.a);
   }

   @Override
   public void contentsChanged(ListDataEvent var1) {
      C_k.b(this.a);
   }
}
