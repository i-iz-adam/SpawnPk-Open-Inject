package rs.p_s.p_l;

import rs.p_e.C_e;
import rs.p_e.C_g;
import rs.p_e.C_l;

@C_e(
   a = "menuentryswapper"
)
public interface C_b extends rs.p_e.C_b {
   String a = "menuentryswapper";
   @C_l(
      a = "Item Swaps",
      b = "All options that swap item menu entries",
      c = 0,
      d = true
   )
   String b = "items";
   @C_l(
      a = "NPC Swaps",
      b = "All options that swap NPC menu entries",
      c = 1,
      d = true
   )
   String c = "npcs";

   @C_g(
      a = -3,
      b = "leftClickCustomization",
      c = "Customizable left-click",
      d = "Allows customization of left-clicks on items",
      h = "items"
   )
   default boolean a() {
      return true;
   }

   @C_g(
      a = -2,
      b = "shiftClickCustomization",
      c = "Customizable shift-click",
      d = "Allows customization of shift-clicks on items",
      h = "items"
   )
   default boolean b() {
      return true;
   }

   @C_g(
      a = -3,
      b = "npcLeftClickCustomization",
      c = "Customizable left and shift click",
      d = "Allows customization of left-clicks on NPCs",
      h = "npcs"
   )
   default boolean c() {
      return true;
   }
}
