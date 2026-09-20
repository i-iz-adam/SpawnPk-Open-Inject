package rs.p_s.p_o;

import java.awt.Color;
import rs.p_e.C_g;
import rs.p_e.C_l;
import rs.p_e.C_o;

@rs.p_e.C_e(
   a = "npcindicators"
)
public interface C_d extends rs.p_e.C_b {
   String a = "npcindicators";
   @C_l(
      a = "Render style",
      b = "The render style of NPC highlighting",
      c = 0
   )
   String b = "renderStyleSection";

   @C_g(
      a = 0,
      b = "highlightHull",
      c = "Highlight hull",
      d = "Configures whether or not NPC should be highlighted by hull",
      h = "renderStyleSection"
   )
   default boolean a() {
      return true;
   }

   @C_g(
      a = 1,
      b = "highlightTile",
      c = "Highlight tile",
      d = "Configures whether or not NPC should be highlighted by tile",
      h = "renderStyleSection"
   )
   default boolean b() {
      return false;
   }

   @C_g(
      a = 2,
      b = "highlightTrueTile",
      c = "Highlight true tile",
      d = "Configures whether or not NPC should be highlighted by true tile",
      h = "renderStyleSection"
   )
   default boolean c() {
      return false;
   }

   @C_g(
      a = 3,
      b = "highlightSouthWestTile",
      c = "Highlight south west tile",
      d = "Configures whether or not NPC should be highlighted by south western tile",
      h = "renderStyleSection"
   )
   default boolean d() {
      return false;
   }

   @C_g(
      a = 4,
      b = "highlightSouthWestTrueTile",
      c = "Highlight south west true tile",
      d = "Configures whether or not NPC should be highlighted by south western true tile",
      h = "renderStyleSection"
   )
   default boolean e() {
      return false;
   }

   @C_g(
      a = 5,
      b = "highlightOutline",
      c = "Highlight outline",
      d = "Configures whether or not the model of the NPC should be highlighted by outline",
      h = "renderStyleSection"
   )
   default boolean f() {
      return false;
   }

   @C_g(
      a = 8,
      b = "drawNames",
      c = "Draw names above NPC",
      d = "Configures whether or not NPC names should be drawn above the NPC"
   )
   default boolean g() {
      return false;
   }

   @rs.p_e.C_a
   @C_g(
      a = 10,
      b = "npcColor",
      c = "Highlight Color",
      d = "Color of the NPC highlight border, menu, and text",
      h = "renderStyleSection"
   )
   default Color h() {
      return Color.CYAN;
   }

   @rs.p_e.C_a
   @C_g(
      a = 11,
      b = "fillColor",
      c = "Fill Color",
      d = "Color of the NPC highlight fill",
      h = "renderStyleSection"
   )
   default Color i() {
      return new Color(0, 255, 255, 20);
   }

   @C_g(
      a = 12,
      b = "borderWidth",
      c = "Border Width",
      d = "Width of the highlighted NPC border",
      h = "renderStyleSection"
   )
   default double j() {
      return 2.0;
   }

   @C_g(
      a = 13,
      b = "outlineFeather",
      c = "Outline feather",
      d = "Specify between 0-4 how much of the model outline should be faded",
      h = "renderStyleSection"
   )
   @C_o(
      a = 0,
      b = 4
   )
   default int k() {
      return 0;
   }

   @C_g(
      a = 7,
      b = "npcToHighlight",
      c = "NPCs to Highlight",
      d = "List of NPC names to highlight. Format: (NPC), (NPC)"
   )
   default String l() {
      return "";
   }

   @C_g(
      b = "npcToHighlight",
      c = "",
      d = ""
   )
   void a(String var1);

   @C_g(
      a = 14,
      b = "ignorePets",
      c = "Ignore pets",
      d = "Excludes pets from being highlighted"
   )
   default boolean m() {
      return true;
   }

   @C_g(
      a = 15,
      b = "hullClickBox",
      c = "Extend clickbox to hull",
      d = "Extends the clickbox to the hull of the NPC (when hull highlighting is enabled)"
   )
   default boolean n() {
      return true;
   }
}
