package rs.plugins.i;

import java.awt.Color;
import rs.class_131;
import rs.class_132;
import rs.class_135;
import rs.class_137;
import rs.class_142;
import rs.class_145;

/* JADX INFO: loaded from: client-final.jar:rs/s/i/a.class */
@class_135(a = "interacthighlight")
public interface a extends class_132 {

    @class_142(a = "NPCs", b = "Settings for NPC highlight", c = 0)
    public static final String a = "npcSection";

    @class_142(a = "Objects", b = "Settings for object highlight", c = 1)
    public static final String b = "objectSection";

    @class_137(b = "npcShowHover", c = "Show on hover", d = "Outline NPCs when hovered", a = 1, h = a)
    default boolean a() {
        return true;
    }

    @class_137(b = "npcShowInteract", c = "Show on interact", d = "Outline NPCs when interacted", a = 2, h = a)
    default boolean b() {
        return true;
    }

    @class_137(b = "npcHoverHighlightColor", c = "NPC hover", d = "The color of the hover outline for NPCs", a = 3, h = a)
    @class_131
    default Color c() {
        return new Color(-1862271232, true);
    }

    @class_137(b = "npcAttackHoverHighlightColor", c = "NPC attack hover", d = "The color of the attack hover outline for NPCs", a = 4, h = a)
    @class_131
    default Color d() {
        return new Color(-1862271232, true);
    }

    @class_137(b = "npcInteractHighlightColor", c = "NPC interact", d = "The color of the target outline for NPCs", a = 5, h = a)
    @class_131
    default Color e() {
        return new Color(-1862336512, true);
    }

    @class_137(b = "npcAttackHighlightColor", c = "NPC attack", d = "The color of the outline on attacked NPCs", a = 6, h = a)
    @class_131
    default Color f() {
        return new Color(-1862336512, true);
    }

    @class_137(b = "objectShowHover", c = "Show on hover", d = "Outline objects when hovered", a = 1, h = b)
    default boolean g() {
        return true;
    }

    @class_137(b = "objectShowInteract", c = "Show on interact", d = "Outline objects when interacted", a = 2, h = b)
    default boolean h() {
        return true;
    }

    @class_137(b = "objectHoverHighlightColor", c = "Object hover", d = "The color of the hover outline for objects", a = 4, h = b)
    @class_131
    default Color i() {
        return new Color(-1878982657, true);
    }

    @class_137(b = "objectInteractHighlightColor", c = "Object interact", d = "The color of the target outline for objects", a = 6, h = b)
    @class_131
    default Color j() {
        return new Color(-1862336512, true);
    }

    @class_137(b = "borderWidth", c = "Border Width", d = "Width of the outlined border", a = 7)
    default int k() {
        return 4;
    }

    @class_145(b = 4)
    @class_137(b = "outlineFeather", c = "Outline feather", d = "Specify between 0-4 how much of the model outline should be faded", a = 8)
    default int l() {
        return 4;
    }
}
