package rs.plugins.cpkg;

import java.util.Set;
import rs.class_132;
import rs.class_135;
import rs.class_137;
import rs.class_142;

/* JADX INFO: loaded from: client-final.jar:rs/s/c/a.class */
@class_135(a = "devtools")
public interface a extends class_132 {

    @class_142(a = "General", b = "General dev settings and toggles", c = 0)
    public static final String a = "general";

    @class_142(a = "Interfaces", b = "Dev settings for interfaces", c = 1)
    public static final String b = "interfaces";

    @class_142(a = "Interface Tools", b = "Dev tools for interfaces", c = 2)
    public static final String c = "interfaces2";

    @class_137(b = "showObjectIds", c = "Label object IDs", d = "Include IDs in the name of the entity", h = a, a = 0)
    default boolean a() {
        return true;
    }

    @class_137(b = "showNpcIds", c = "Label NPC IDs", d = "Include IDs in the name of the entity", h = a, a = 0)
    default boolean b() {
        return true;
    }

    @class_137(b = "showSceneInfo", c = "Show scene info", d = "Render scene info graphics", h = a, a = 0)
    default boolean c() {
        return true;
    }

    @class_137(b = "showColorOptions", c = "Show color options", d = "Show color options when right-clicking items/objects/npcs", h = a, a = 0)
    default boolean d() {
        return true;
    }

    @class_137(b = "alwaysOnTop", c = "Always on top", d = "Set window to always on top", h = a, a = 0)
    default boolean e() {
        return false;
    }

    @class_137(b = "labelIds", c = "Label widget IDs", d = "Label the ID of parent widgets", h = b, a = 0)
    default boolean f() {
        return false;
    }

    @class_137(b = "labelTypes", c = "Label widget types", h = b, d = "", a = 1)
    default boolean g() {
        return false;
    }

    @class_137(b = "showParents", c = "Show parent IDs", h = b, d = "", a = 5)
    default boolean h() {
        return true;
    }

    @class_137(b = "showChildren", c = "Show children IDs", h = b, d = "", a = 10)
    default boolean i() {
        return true;
    }

    @class_137(b = "showTypes", c = "Display widget types", h = b, d = "", a = 15)
    default Set<h> j() {
        return Set.of((Object[]) h.values());
    }

    @class_137(b = "mouseCoordinates", c = "Mouse tool", d = "", h = c, a = 20)
    default boolean k() {
        return false;
    }

    @class_137(b = "builderId", c = "Interface Builder", d = "", h = c, a = 21)
    default int l() {
        return 0;
    }

    @class_137(b = "builderChildId", c = "Builder child ID", d = "", h = c, a = 22)
    default int m() {
        return 0;
    }
}
