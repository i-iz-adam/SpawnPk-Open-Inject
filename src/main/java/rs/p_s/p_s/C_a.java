package rs.p_s.p_s;

import java.awt.Color;
import rs.p_e.C_e;
import rs.p_e.C_g;
import rs.p_e.C_l;

@C_e(
   a = "tooltip"
)
public interface C_a extends rs.p_e.C_b {
   String a = "tooltip";
   @C_l(
      a = "Color scheme",
      b = "",
      c = 1
   )
   String b = "colors";
   @C_l(
      a = "Item hovers",
      b = "",
      c = 2
   )
   String c = "items";
   @C_l(
      a = "Entity hovers",
      b = "",
      c = 3
   )
   String d = "entities";

   @C_g(
      b = "backgroundColor",
      c = "Background color",
      d = "The background color for tooltip overlays",
      a = 10,
      h = "colors"
   )
   default Color a() {
      return new Color(4077096);
   }

   @C_g(
      b = "borderColor",
      c = "Inner border color",
      d = "The inner border color for tooltip overlays",
      a = 11,
      h = "colors"
   )
   default Color b() {
      return new Color(5918522);
   }

   @C_g(
      b = "outerBorderColor",
      c = "Outer border color",
      d = "The outer border color for tooltip overlays",
      a = 12,
      h = "colors"
   )
   default Color c() {
      return new Color(2367511);
   }

   @C_g(
      b = "hideItemsWildy",
      c = "Hide item hovers in wild",
      d = "Whether to hide item tooltips when in the wilderness",
      a = 0,
      h = "items"
   )
   default boolean d() {
      return true;
   }

   @C_g(
      b = "hideDescWildy",
      c = "Hide descriptions in wild",
      d = "Whether to hide item tooltips when in the wilderness",
      a = 0,
      h = "items",
      e = true
   )
   default boolean e() {
      return false;
   }

   @C_g(
      b = "showInInventory",
      c = "Show hovers on inventory",
      d = "Whether to show item tooltips on your inventory items",
      a = 5,
      h = "items"
   )
   default boolean f() {
      return false;
   }

   @C_g(
      b = "showInBank",
      c = "Descriptions on bank screen",
      d = "Whether to show item tooltip descriptions in the bank",
      a = 20,
      h = "items"
   )
   default boolean g() {
      return true;
   }

   @C_g(
      b = "showInEquip",
      c = "Descriptions on equipment screen",
      d = "Whether to show item tooltips on the equipment screen",
      a = 30,
      h = "items"
   )
   default boolean h() {
      return true;
   }

   @C_g(
      b = "descInInventory",
      c = "Descriptions on inventory",
      d = "Whether to show item tooltips on the inventory items",
      a = 30,
      h = "items"
   )
   default boolean i() {
      return false;
   }

   @C_g(
      b = "showCurrencies",
      c = "Show sink values (Blood diamonds, shards, etc.)",
      d = "Whether to show the sink value of an item in the tooltip",
      a = 40,
      h = "items"
   )
   default boolean j() {
      return true;
   }

   @C_g(
      b = "showWandering",
      c = "Display wandering merchant",
      d = "Whether to include an icon on the tooltip if the item is a potential task from the wandering merchant",
      a = 45,
      h = "items"
   )
   default boolean k() {
      return true;
   }

   @C_g(
      b = "hideWildEntity",
      c = "Hide all entity hovers in wild",
      d = "Whether to hide entity tooltip hovers when in the wilderness",
      a = 0,
      h = "entities"
   )
   default boolean l() {
      return false;
   }

   @C_g(
      b = "showPlayers",
      c = "Display hovers for Players",
      d = "Whether to show tooltips with the hover menu for Players",
      a = 14,
      h = "entities"
   )
   default boolean m() {
      return false;
   }

   @C_g(
      b = "showNpcs",
      c = "Display hovers for NPCs",
      d = "Whether to show tooltips with the hover menu for NPCs",
      a = 15,
      h = "entities"
   )
   default boolean n() {
      return false;
   }

   @C_g(
      b = "showObjects",
      c = "Display hovers for Objects",
      d = "Whether to show tooltips with the hover menu for objects",
      a = 16,
      h = "entities"
   )
   default boolean o() {
      return false;
   }

   @C_g(
      b = "showGuides",
      c = "Display hovers for Guides",
      d = "Whether to show knowledgebase guide shortcuts with the hover menu",
      a = 17,
      h = "entities"
   )
   default boolean p() {
      return true;
   }
}
