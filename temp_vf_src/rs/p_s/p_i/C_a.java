package rs.p_s.p_i;

import java.awt.Color;
import rs.p_e.C_e;
import rs.p_e.C_g;
import rs.p_e.C_l;
import rs.p_e.C_o;

@C_e(
   a = "interacthighlight"
)
public interface C_a extends rs.p_e.C_b {
   @C_l(
      a = "NPCs",
      b = "Settings for NPC highlight",
      c = 0
   )
   String a = "npcSection";
   @C_l(
      a = "Objects",
      b = "Settings for object highlight",
      c = 1
   )
   String b = "objectSection";

   @C_g(
      b = "npcShowHover",
      c = "Show on hover",
      d = "Outline NPCs when hovered",
      a = 1,
      h = "npcSection"
   )
   default boolean a() {
      return true;
   }

   @C_g(
      b = "npcShowInteract",
      c = "Show on interact",
      d = "Outline NPCs when interacted",
      a = 2,
      h = "npcSection"
   )
   default boolean b() {
      return true;
   }

   @rs.p_e.C_a
   @C_g(
      b = "npcHoverHighlightColor",
      c = "NPC hover",
      d = "The color of the hover outline for NPCs",
      a = 3,
      h = "npcSection"
   )
   default Color c() {
      return new Color(-1862271232, true);
   }

   @rs.p_e.C_a
   @C_g(
      b = "npcAttackHoverHighlightColor",
      c = "NPC attack hover",
      d = "The color of the attack hover outline for NPCs",
      a = 4,
      h = "npcSection"
   )
   default Color d() {
      return new Color(-1862271232, true);
   }

   @rs.p_e.C_a
   @C_g(
      b = "npcInteractHighlightColor",
      c = "NPC interact",
      d = "The color of the target outline for NPCs",
      a = 5,
      h = "npcSection"
   )
   default Color e() {
      return new Color(-1862336512, true);
   }

   @rs.p_e.C_a
   @C_g(
      b = "npcAttackHighlightColor",
      c = "NPC attack",
      d = "The color of the outline on attacked NPCs",
      a = 6,
      h = "npcSection"
   )
   default Color f() {
      return new Color(-1862336512, true);
   }

   @C_g(
      b = "objectShowHover",
      c = "Show on hover",
      d = "Outline objects when hovered",
      a = 1,
      h = "objectSection"
   )
   default boolean g() {
      return true;
   }

   @C_g(
      b = "objectShowInteract",
      c = "Show on interact",
      d = "Outline objects when interacted",
      a = 2,
      h = "objectSection"
   )
   default boolean h() {
      return true;
   }

   @rs.p_e.C_a
   @C_g(
      b = "objectHoverHighlightColor",
      c = "Object hover",
      d = "The color of the hover outline for objects",
      a = 4,
      h = "objectSection"
   )
   default Color i() {
      return new Color(-1878982657, true);
   }

   @rs.p_e.C_a
   @C_g(
      b = "objectInteractHighlightColor",
      c = "Object interact",
      d = "The color of the target outline for objects",
      a = 6,
      h = "objectSection"
   )
   default Color j() {
      return new Color(-1862336512, true);
   }

   @C_g(
      b = "borderWidth",
      c = "Border Width",
      d = "Width of the outlined border",
      a = 7
   )
   default int k() {
      return 4;
   }

   @C_g(
      b = "outlineFeather",
      c = "Outline feather",
      d = "Specify between 0-4 how much of the model outline should be faded",
      a = 8
   )
   @C_o(
      b = 4
   )
   default int l() {
      return 4;
   }
}
