package rs.p_runelite.p_events;

public class C_ClientStartUp_mc {
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof C_ClientStartUp_mc)) {
         return false;
      } else {
         C_ClientStartUp_mc var2 = (C_ClientStartUp_mc)var1;
         return var2.canEqual(this);
      }
   }

   protected boolean canEqual(Object var1) {
      return var1 instanceof C_ClientStartUp_mc;
   }

   @Override
   public int hashCode() {
      boolean var1 = true;
      return 1;
   }

   @Override
   public String toString() {
      return "ClientStartUp()";
   }
}
