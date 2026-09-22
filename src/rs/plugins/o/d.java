package rs.plugins.o;

import java.awt.Color;
import rs.class_131;
import rs.class_132;
import rs.class_135;
import rs.class_137;
import rs.class_142;
import rs.class_145;

/* JADX INFO: loaded from: client-final.jar:rs/s/o/d.class */
@class_135(a = d.a)
public interface d extends class_132 {
    public static final String a = "npcindicators";

    @class_142(a = "Render style", b = "The render style of NPC highlighting", c = 0)
    public static final String b = "renderStyleSection";

    @class_137(a = 0, b = "highlightHull", c = "Highlight hull", d = "Configures whether or not NPC should be highlighted by hull", h = b)
    default boolean a() {
        return true;
    }

    @class_137(a = 1, b = "highlightTile", c = "Highlight tile", d = "Configures whether or not NPC should be highlighted by tile", h = b)
    default boolean b() {
        return false;
    }

    @class_137(a = 2, b = "highlightTrueTile", c = "Highlight true tile", d = "Configures whether or not NPC should be highlighted by true tile", h = b)
    default boolean c() {
        return false;
    }

    @class_137(a = 3, b = "highlightSouthWestTile", c = "Highlight south west tile", d = "Configures whether or not NPC should be highlighted by south western tile", h = b)
    default boolean d() {
        return false;
    }

    @class_137(a = 4, b = "highlightSouthWestTrueTile", c = "Highlight south west true tile", d = "Configures whether or not NPC should be highlighted by south western true tile", h = b)
    default boolean e() {
        return false;
    }

    @class_137(a = 5, b = "highlightOutline", c = "Highlight outline", d = "Configures whether or not the model of the NPC should be highlighted by outline", h = b)
    default boolean f() {
        return false;
    }

    @class_137(a = 8, b = "drawNames", c = "Draw names above NPC", d = "Configures whether or not NPC names should be drawn above the NPC")
    default boolean g() {
        return false;
    }

    @class_137(a = 10, b = "npcColor", c = "Highlight Color", d = "Color of the NPC highlight border, menu, and text", h = b)
    @class_131
    default Color h() {
        return Color.CYAN;
    }

    @class_137(a = 11, b = "fillColor", c = "Fill Color", d = "Color of the NPC highlight fill", h = b)
    @class_131
    default Color i() {
        return new Color(0, 255, 255, 20);
    }

    @class_137(a = 12, b = "borderWidth", c = "Border Width", d = "Width of the highlighted NPC border", h = b)
    default double j() {
        return 2.0d;
    }

    @class_145(a = 0, b = 4)
    @class_137(a = 13, b = "outlineFeather", c = "Outline feather", d = "Specify between 0-4 how much of the model outline should be faded", h = b)
    default int k() {
        return 0;
    }

    @class_137(a = 7, b = "npcToHighlight", c = "NPCs to Highlight", d = "List of NPC names to highlight. Format: (NPC), (NPC)")
    default String l() {
        return "";
    }

    @class_137(b = "npcToHighlight", c = "", d = "")
    void a(String str);

    @class_137(a = 14, b = "ignorePets", c = "Ignore pets", d = "Excludes pets from being highlighted")
    default boolean m() {
        return true;
    }

    @class_137(a = 15, b = "hullClickBox", c = "Extend clickbox to hull", d = "Extends the clickbox to the hull of the NPC (when hull highlighting is enabled)")
    default boolean n() {
        return true;
    }
}
