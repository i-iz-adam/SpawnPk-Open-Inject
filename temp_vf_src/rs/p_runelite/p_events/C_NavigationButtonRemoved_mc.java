package rs.p_runelite.p_events;

import rs.p_ui.C_l;

public final class C_NavigationButtonRemoved_mc {
   private final C_l button;

   public C_NavigationButtonRemoved_mc(C_l var1) {
      this.button = var1;
   }

   public C_l getButton() {
      return this.button;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof C_NavigationButtonRemoved_mc)) {
         return false;
      } else {
         C_NavigationButtonRemoved_mc var2 = (C_NavigationButtonRemoved_mc)var1;
         C_l var3 = this.getButton();
         C_l var4 = var2.getButton();
         return var3 == null ? var4 == null : var3.equals(var4);
      }
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      byte var2 = 1;
      C_l var3 = this.getButton();
      return var2 * 59 + (var3 == null ? 43 : var3.hashCode());
   }

   @Override
   public String toString() {
      return "NavigationButtonRemoved(button=" + this.getButton() + ")";
   }
}
