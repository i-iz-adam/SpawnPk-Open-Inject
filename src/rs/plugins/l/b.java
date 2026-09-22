package rs.plugins.l;

import rs.class_132;
import rs.class_135;
import rs.class_137;
import rs.class_142;

/* JADX INFO: loaded from: client-final.jar:rs/s/l/b.class */
@class_135(a = b.a)
public interface b extends class_132 {
    public static final String a = "menuentryswapper";

    @class_142(a = "Item Swaps", b = "All options that swap item menu entries", c = 0, d = true)
    public static final String b = "items";

    @class_142(a = "NPC Swaps", b = "All options that swap NPC menu entries", c = 1, d = true)
    public static final String c = "npcs";

    @class_137(a = -3, b = "leftClickCustomization", c = "Customizable left-click", d = "Allows customization of left-clicks on items", h = "items")
    default boolean a() {
        return true;
    }

    @class_137(a = -2, b = "shiftClickCustomization", c = "Customizable shift-click", d = "Allows customization of shift-clicks on items", h = "items")
    default boolean b() {
        return true;
    }

    @class_137(a = -3, b = "npcLeftClickCustomization", c = "Customizable left and shift click", d = "Allows customization of left-clicks on NPCs", h = c)
    default boolean c() {
        return true;
    }
}
