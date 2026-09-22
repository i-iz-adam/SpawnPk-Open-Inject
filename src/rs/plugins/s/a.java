package rs.plugins.s;

import java.awt.Color;
import rs.class_132;
import rs.class_135;
import rs.class_137;
import rs.class_142;
import rs.class_228;

/* JADX INFO: loaded from: client-final.jar:rs/s/s/a.class */
@class_135(a = a.a)
public interface a extends class_132 {
    public static final String a = "tooltip";

    @class_142(a = "Color scheme", b = "", c = 1)
    public static final String b = "colors";

    @class_142(a = "Item hovers", b = "", c = 2)
    public static final String c = "items";

    @class_142(a = "Entity hovers", b = "", c = 3)
    public static final String d = "entities";

    @class_137(b = "backgroundColor", c = "Background color", d = "The background color for tooltip overlays", a = 10, h = b)
    default Color a() {
        return new Color(4077096);
    }

    @class_137(b = "borderColor", c = "Inner border color", d = "The inner border color for tooltip overlays", a = 11, h = b)
    default Color b() {
        return new Color(class_228.t);
    }

    @class_137(b = "outerBorderColor", c = "Outer border color", d = "The outer border color for tooltip overlays", a = 12, h = b)
    default Color c() {
        return new Color(class_228.u);
    }

    @class_137(b = "hideItemsWildy", c = "Hide item hovers in wild", d = "Whether to hide item tooltips when in the wilderness", a = 0, h = "items")
    default boolean d() {
        return true;
    }

    @class_137(b = "hideDescWildy", c = "Hide descriptions in wild", d = "Whether to hide item tooltips when in the wilderness", a = 0, h = "items", e = true)
    default boolean e() {
        return false;
    }

    @class_137(b = "showInInventory", c = "Show hovers on inventory", d = "Whether to show item tooltips on your inventory items", a = 5, h = "items")
    default boolean f() {
        return false;
    }

    @class_137(b = "showInBank", c = "Descriptions on bank screen", d = "Whether to show item tooltip descriptions in the bank", a = 20, h = "items")
    default boolean g() {
        return true;
    }

    @class_137(b = "showInEquip", c = "Descriptions on equipment screen", d = "Whether to show item tooltips on the equipment screen", a = 30, h = "items")
    default boolean h() {
        return true;
    }

    @class_137(b = "descInInventory", c = "Descriptions on inventory", d = "Whether to show item tooltips on the inventory items", a = 30, h = "items")
    default boolean i() {
        return false;
    }

    @class_137(b = "showCurrencies", c = "Show sink values (Blood diamonds, shards, etc.)", d = "Whether to show the sink value of an item in the tooltip", a = 40, h = "items")
    default boolean j() {
        return true;
    }

    @class_137(b = "showWandering", c = "Display wandering merchant", d = "Whether to include an icon on the tooltip if the item is a potential task from the wandering merchant", a = 45, h = "items")
    default boolean k() {
        return true;
    }

    @class_137(b = "hideWildEntity", c = "Hide all entity hovers in wild", d = "Whether to hide entity tooltip hovers when in the wilderness", a = 0, h = d)
    default boolean l() {
        return false;
    }

    @class_137(b = "showPlayers", c = "Display hovers for Players", d = "Whether to show tooltips with the hover menu for Players", a = 14, h = d)
    default boolean m() {
        return false;
    }

    @class_137(b = "showNpcs", c = "Display hovers for NPCs", d = "Whether to show tooltips with the hover menu for NPCs", a = 15, h = d)
    default boolean n() {
        return false;
    }

    @class_137(b = "showObjects", c = "Display hovers for Objects", d = "Whether to show tooltips with the hover menu for objects", a = 16, h = d)
    default boolean o() {
        return false;
    }

    @class_137(b = "showGuides", c = "Display hovers for Guides", d = "Whether to show knowledgebase guide shortcuts with the hover menu", a = 17, h = d)
    default boolean p() {
        return true;
    }
}
