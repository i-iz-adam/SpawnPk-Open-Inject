package rs.p_s.p_r;

import java.awt.Color;
import rs.p_e.C_e;
import rs.p_e.C_g;
import rs.p_e.C_l;

@C_e(
   a = "tileindicators"
)
public interface C_a extends rs.p_e.C_b {
   @C_l(
      a = "Destination Tile",
      b = "Destination tile configuration",
      c = 0
   )
   String a = "destinationTile";
   @C_l(
      a = "Hovered Tile",
      b = "Hovered tile configuration",
      c = 1
   )
   String b = "hoveredTile";
   @C_l(
      a = "Current Tile",
      b = "Current tile configuration",
      c = 2
   )
   String c = "currentTile";

   @C_g(
      b = "highlightDestinationTile",
      c = "Highlight destination tile",
      d = "Highlights tile player is walking to",
      a = 1,
      h = "destinationTile"
   )
   default boolean a() {
      return true;
   }

   @rs.p_e.C_a
   @C_g(
      b = "highlightDestinationColor",
      c = "Highlight color",
      d = "Configures the highlight color of current destination",
      a = 2,
      h = "destinationTile"
   )
   default Color b() {
      return Color.GRAY;
   }

   @rs.p_e.C_a
   @C_g(
      b = "destinationTileFillColor",
      c = "Fill color",
      d = "Configures the fill color of destination tile",
      a = 3,
      h = "destinationTile"
   )
   default Color c() {
      return new Color(0, 0, 0, 50);
   }

   @C_g(
      b = "destinationTileBorderWidth",
      c = "Border width",
      d = "Width of the destination tile marker border",
      a = 4,
      h = "destinationTile"
   )
   default double d() {
      return 2.0;
   }

   @C_g(
      b = "highlightHoveredTile",
      c = "Highlight hovered tile",
      d = "Highlights tile player is hovering with mouse",
      a = 1,
      h = "hoveredTile"
   )
   default boolean e() {
      return false;
   }

   @rs.p_e.C_a
   @C_g(
      b = "highlightHoveredColor",
      c = "Highlight color",
      d = "Configures the highlight color of hovered tile",
      a = 2,
      h = "hoveredTile"
   )
   default Color f() {
      return new Color(0, 0, 0, 0);
   }

   @rs.p_e.C_a
   @C_g(
      b = "hoveredTileFillColor",
      c = "Fill color",
      d = "Configures the fill color of hovered tile",
      a = 3,
      h = "hoveredTile"
   )
   default Color g() {
      return new Color(0, 0, 0, 50);
   }

   @C_g(
      b = "hoveredTileBorderWidth",
      c = "Border width",
      d = "Width of the hovered tile marker border",
      a = 4,
      h = "hoveredTile"
   )
   default double h() {
      return 2.0;
   }

   @C_g(
      b = "highlightCurrentTile",
      c = "Highlight true tile",
      d = "Highlights true tile player is on as seen by server",
      a = 1,
      h = "currentTile"
   )
   default boolean i() {
      return false;
   }

   @rs.p_e.C_a
   @C_g(
      b = "highlightCurrentColor",
      c = "Highlight color",
      d = "Configures the highlight color of current true tile",
      a = 2,
      h = "currentTile"
   )
   default Color j() {
      return Color.CYAN;
   }

   @rs.p_e.C_a
   @C_g(
      b = "currentTileFillColor",
      c = "Fill color",
      d = "Configures the fill color of current true tile",
      a = 3,
      h = "currentTile"
   )
   default Color k() {
      return new Color(0, 0, 0, 50);
   }

   @C_g(
      b = "currentTileBorderWidth",
      c = "Border width",
      d = "Width of the true tile marker border",
      a = 4,
      h = "currentTile"
   )
   default double l() {
      return 2.0;
   }
}
