package rs.p_runelite.p_events;

public class C_FocusChanged_mc {
   private boolean focused;

   public boolean isFocused() {
      return this.focused;
   }

   public void setFocused(boolean var1) {
      this.focused = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof C_FocusChanged_mc)) {
         return false;
      } else {
         C_FocusChanged_mc var2 = (C_FocusChanged_mc)var1;
         return !var2.canEqual(this) ? false : this.isFocused() == var2.isFocused();
      }
   }

   protected boolean canEqual(Object var1) {
      return var1 instanceof C_FocusChanged_mc;
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      byte var2 = 1;
      return var2 * 59 + (this.isFocused() ? 79 : 97);
   }

   @Override
   public String toString() {
      return "FocusChanged(focused=" + this.isFocused() + ")";
   }
}
