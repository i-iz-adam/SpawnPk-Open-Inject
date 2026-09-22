package rs.plugins.r;

import java.awt.Color;
import rs.class_131;
import rs.class_132;
import rs.class_135;
import rs.class_137;
import rs.class_142;

/* JADX INFO: loaded from: client-final.jar:rs/s/r/a.class */
@class_135(a = "tileindicators")
public interface a extends class_132 {

    @class_142(a = "Destination Tile", b = "Destination tile configuration", c = 0)
    public static final String a = "destinationTile";

    @class_142(a = "Hovered Tile", b = "Hovered tile configuration", c = 1)
    public static final String b = "hoveredTile";

    @class_142(a = "Current Tile", b = "Current tile configuration", c = 2)
    public static final String c = "currentTile";

    @class_137(b = "highlightDestinationTile", c = "Highlight destination tile", d = "Highlights tile player is walking to", a = 1, h = a)
    default boolean a() {
        return true;
    }

    @class_137(b = "highlightDestinationColor", c = "Highlight color", d = "Configures the highlight color of current destination", a = 2, h = a)
    @class_131
    default Color b() {
        return Color.GRAY;
    }

    @class_137(b = "destinationTileFillColor", c = "Fill color", d = "Configures the fill color of destination tile", a = 3, h = a)
    @class_131
    default Color c() {
        return new Color(0, 0, 0, 50);
    }

    @class_137(b = "destinationTileBorderWidth", c = "Border width", d = "Width of the destination tile marker border", a = 4, h = a)
    default double d() {
        return 2.0d;
    }

    @class_137(b = "highlightHoveredTile", c = "Highlight hovered tile", d = "Highlights tile player is hovering with mouse", a = 1, h = b)
    default boolean e() {
        return false;
    }

    @class_137(b = "highlightHoveredColor", c = "Highlight color", d = "Configures the highlight color of hovered tile", a = 2, h = b)
    @class_131
    default Color f() {
        return new Color(0, 0, 0, 0);
    }

    @class_137(b = "hoveredTileFillColor", c = "Fill color", d = "Configures the fill color of hovered tile", a = 3, h = b)
    @class_131
    default Color g() {
        return new Color(0, 0, 0, 50);
    }

    @class_137(b = "hoveredTileBorderWidth", c = "Border width", d = "Width of the hovered tile marker border", a = 4, h = b)
    default double h() {
        return 2.0d;
    }

    @class_137(b = "highlightCurrentTile", c = "Highlight true tile", d = "Highlights true tile player is on as seen by server", a = 1, h = c)
    default boolean i() {
        return false;
    }

    @class_137(b = "highlightCurrentColor", c = "Highlight color", d = "Configures the highlight color of current true tile", a = 2, h = c)
    @class_131
    default Color j() {
        return Color.CYAN;
    }

    @class_137(b = "currentTileFillColor", c = "Fill color", d = "Configures the fill color of current true tile", a = 3, h = c)
    @class_131
    default Color k() {
        return new Color(0, 0, 0, 50);
    }

    @class_137(b = "currentTileBorderWidth", c = "Border width", d = "Width of the true tile marker border", a = 4, h = c)
    default double l() {
        return 2.0d;
    }
}
