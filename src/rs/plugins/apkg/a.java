package rs.plugins.apkg;

import rs.class_132;
import rs.class_135;
import rs.class_137;
import rs.class_142;

/* JADX INFO: loaded from: client-final.jar:rs/s/a/a.class */
@class_135(a = a.a)
public interface a extends class_132 {
    public static final String a = "combatInfo";

    @class_142(a = "Opponent overlays", b = "", c = 0)
    public static final String b = "opponentOverlay";

    @class_142(a = "Hits and health", b = "", c = 4)
    public static final String c = "hitOverlay";

    @class_137(b = "showOpponentOverlay", c = "Show opponent overlay", d = "Display the overlay with opponent information", h = b, a = 0)
    default boolean a() {
        return true;
    }

    @class_137(b = "animatedOverlayBar", c = "Animate overlay health bar", d = "Animate health loss on the overlay (or disable to keep changes instant)", h = b, a = 1)
    default boolean b() {
        return true;
    }

    @class_137(b = "opponentOverlayStyle", c = "Opponent overlay style", d = "The style of opponent overlay to display", h = b, a = 2)
    default c c() {
        return c.a;
    }

    @class_137(b = "bhOverlayStyle", c = "Bounty hunter overlay style", d = "The style of bounty hunter overlay to display", h = b, a = 3)
    default c d() {
        return c.a;
    }

    @class_137(b = "bossOverlayStyle", c = "Boss overlay style", d = "The style of boss overlay to display", h = b, a = 3)
    default c e() {
        return c.a;
    }

    @class_137(b = "hitMarkStyle", c = "Hitsplats", d = "The style of health bar to display", h = c, a = 0)
    default e f() {
        return e.a;
    }

    @class_137(b = "healthBarStyle", c = "Health bars", d = "The style of health bar to display", h = c, a = 1)
    default d g() {
        return d.a;
    }

    @class_137(b = "multipliedHits", c = "Multiplied 10x hits", d = "Display damage at a 10X multiple (e.g. 10 instead of 1)", h = c, a = 4)
    default boolean h() {
        return false;
    }
}
