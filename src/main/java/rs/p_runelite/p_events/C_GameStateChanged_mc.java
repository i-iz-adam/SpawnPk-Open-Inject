package rs.p_runelite.p_events;

import rs.p_runelite.p_a.C_c;

public class C_GameStateChanged_mc {
   private C_c gameState;

   public C_c getGameState() {
      return this.gameState;
   }

   public void setGameState(C_c var1) {
      this.gameState = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof C_GameStateChanged_mc)) {
         return false;
      } else {
         C_GameStateChanged_mc var2 = (C_GameStateChanged_mc)var1;
         if (!var2.canEqual(this)) {
            return false;
         } else {
            C_c var3 = this.getGameState();
            C_c var4 = var2.getGameState();
            return var3 == null ? var4 == null : var3.equals(var4);
         }
      }
   }

   protected boolean canEqual(Object var1) {
      return var1 instanceof C_GameStateChanged_mc;
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      byte var2 = 1;
      C_c var3 = this.getGameState();
      return var2 * 59 + (var3 == null ? 43 : var3.hashCode());
   }

   @Override
   public String toString() {
      return "GameStateChanged(gameState=" + this.getGameState() + ")";
   }
}
