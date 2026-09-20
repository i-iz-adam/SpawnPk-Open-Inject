package rs.p_runelite.p_events;

import rs.p_a.C_c;

public class C_EntityInteraction_mc {
   C_c entity;
   boolean combat = false;

   public C_c getEntity() {
      return this.entity;
   }

   public boolean isCombat() {
      return this.combat;
   }

   public void setEntity(C_c var1) {
      this.entity = var1;
   }

   public void setCombat(boolean var1) {
      this.combat = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof C_EntityInteraction_mc)) {
         return false;
      } else {
         C_EntityInteraction_mc var2 = (C_EntityInteraction_mc)var1;
         if (!var2.canEqual(this)) {
            return false;
         } else if (this.isCombat() != var2.isCombat()) {
            return false;
         } else {
            C_c var3 = this.getEntity();
            C_c var4 = var2.getEntity();
            return var3 == null ? var4 == null : var3.equals(var4);
         }
      }
   }

   protected boolean canEqual(Object var1) {
      return var1 instanceof C_EntityInteraction_mc;
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + (this.isCombat() ? 79 : 97);
      C_c var3 = this.getEntity();
      return var2 * 59 + (var3 == null ? 43 : var3.hashCode());
   }

   @Override
   public String toString() {
      return "EntityInteraction(entity=" + this.getEntity() + ", combat=" + this.isCombat() + ")";
   }
}
