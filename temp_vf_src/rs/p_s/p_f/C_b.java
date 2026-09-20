package rs.p_s.p_f;

import java.awt.Color;
import rs.p_e.C_g;
import rs.p_e.C_o;

@rs.p_e.C_e(
   a = "groundMarker"
)
public interface C_b extends rs.p_e.C_b {
   String a = "groundMarker";
   String b = "showImportExport";

   @rs.p_e.C_a
   @C_g(
      b = "markerColor",
      c = "Tile color",
      d = "The default color for marked tiles"
   )
   default Color a() {
      return Color.YELLOW;
   }

   @C_g(
      b = "drawOnMinimap",
      c = "Draw tiles on minimap",
      d = "Configures whether marked tiles should be drawn on minimap"
   )
   default boolean b() {
      return false;
   }

   @C_g(
      b = "showImportExport",
      c = "Show Import/Export/Clear options",
      d = "Show the Import, Export, and Clear options on the world map right-click menu"
   )
   default boolean c() {
      return true;
   }

   @C_g(
      b = "borderWidth",
      c = "Border Width",
      d = "Width of the marked tile border"
   )
   default double d() {
      return 2.0;
   }

   @C_g(
      b = "fillOpacity",
      c = "Fill Opacity",
      d = "Opacity of the tile fill color"
   )
   @C_o(
      b = 255
   )
   default int e() {
      return 50;
   }
}
