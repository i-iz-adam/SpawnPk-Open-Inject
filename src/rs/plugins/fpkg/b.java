package rs.plugins.fpkg;

import java.awt.Color;
import rs.class_131;
import rs.class_132;
import rs.class_135;
import rs.class_137;
import rs.class_145;

/* JADX INFO: loaded from: client-final.jar:rs/s/f/b.class */
@class_135(a = b.a)
public interface b extends class_132 {
    public static final String a = "groundMarker";
    public static final String b = "showImportExport";

    @class_137(b = "markerColor", c = "Tile color", d = "The default color for marked tiles")
    @class_131
    default Color a() {
        return Color.YELLOW;
    }

    @class_137(b = "drawOnMinimap", c = "Draw tiles on minimap", d = "Configures whether marked tiles should be drawn on minimap")
    default boolean b() {
        return false;
    }

    @class_137(b = b, c = "Show Import/Export/Clear options", d = "Show the Import, Export, and Clear options on the world map right-click menu")
    default boolean c() {
        return true;
    }

    @class_137(b = "borderWidth", c = "Border Width", d = "Width of the marked tile border")
    default double d() {
        return 2.0d;
    }

    @class_145(b = 255)
    @class_137(b = "fillOpacity", c = "Fill Opacity", d = "Opacity of the tile fill color")
    default int e() {
        return 50;
    }
}
