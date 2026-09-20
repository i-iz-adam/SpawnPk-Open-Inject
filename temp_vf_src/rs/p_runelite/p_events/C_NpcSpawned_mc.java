package rs.p_runelite.p_events;

import rs.p_a.C_j;

public class C_NpcSpawned_mc {
   private C_j npc;

   public C_j getNpc() {
      return this.npc;
   }

   public void setNpc(C_j var1) {
      this.npc = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof C_NpcSpawned_mc)) {
         return false;
      } else {
         C_NpcSpawned_mc var2 = (C_NpcSpawned_mc)var1;
         if (!var2.canEqual(this)) {
            return false;
         } else {
            C_j var3 = this.getNpc();
            C_j var4 = var2.getNpc();
            return var3 == null ? var4 == null : var3.equals(var4);
         }
      }
   }

   protected boolean canEqual(Object var1) {
      return var1 instanceof C_NpcSpawned_mc;
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      byte var2 = 1;
      C_j var3 = this.getNpc();
      return var2 * 59 + (var3 == null ? 43 : var3.hashCode());
   }

   @Override
   public String toString() {
      return "NpcSpawned(npc=" + this.getNpc() + ")";
   }
}
