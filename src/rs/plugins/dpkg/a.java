package rs.plugins.dpkg;

import rs.class_132;
import rs.class_135;
import rs.class_137;
import rs.class_142;

/* JADX INFO: loaded from: client-final.jar:rs/s/d/a.class */
@class_135(a = a.a)
public interface a extends class_132 {
    public static final String a = "entityhider";

    @class_142(a = "Local player (You)", b = "", c = 1)
    public static final String b = "local";

    @class_142(a = "Other players", b = "", c = 2)
    public static final String c = "others";

    @class_142(a = "Miscellaneous", b = "", c = 3)
    public static final String d = "misc";

    @class_137(a = 1, b = "hideLocalPlayer", c = "Hide local player", d = "Configures whether or not the local player is hidden", h = b)
    default boolean a() {
        return true;
    }

    @class_137(a = 2, b = "hideLocalPlayer2D", c = "Hide local 2D (Non-wild)", d = "Configures whether or not the local player's hitpoints, prayers, HP bar, etc. is hidden", h = b)
    default boolean b() {
        return false;
    }

    @class_137(a = 3, b = "hideLocalPet", c = "Hide local pet", d = "Configures whether or not your pet is hidden", h = b)
    default boolean c() {
        return true;
    }

    @class_137(a = 1, b = "hidePlayers", c = "Hide others (Non-wild)", d = "Configures whether or not other players are hidden in non-wilderness areas", h = c)
    default boolean d() {
        return true;
    }

    @class_137(a = 2, b = "hidePlayers2D", c = "Hide other 2D (Non-wild)", d = "Configures whether or not other players HP bars, prayers, hitsplats, etc. are hidden in non-wilderness areas", h = c)
    default boolean e() {
        return false;
    }

    @class_137(a = 3, b = "hideOtherPets", c = "Hide other pets (Non-wild)", d = "Configures whether or not other player pets are hidden", h = c)
    default boolean f() {
        return true;
    }

    @class_137(a = 4, b = "hideOtherMinipets", c = "Hide other mini-pets", d = "Configures whether or not other player mini-pets are hidden", h = c)
    default boolean g() {
        return true;
    }

    @class_137(a = 0, b = "hideEdgeBots", c = "Hide edgeville bots", d = "Configures whether or not to hide the PK bots in edgeville", h = d)
    default boolean h() {
        return false;
    }

    @class_137(a = 1, b = "hideProjectiles", c = "Hide projectiles", d = "Configures whether or not projectiles are hidden", h = d)
    default boolean i() {
        return true;
    }

    @class_137(a = 2, b = "hideYoshi", c = "Hide standard yoshi pets (others)", d = "Configures whether or not to hide yoshi pets everywhere", h = d)
    default boolean j() {
        return true;
    }

    @class_137(a = 3, b = "hideYoshi", c = "Hide standard fairy pets (others)", d = "Configures whether or not to hide treasure fairy pets everywhere", h = d)
    default boolean k() {
        return true;
    }
}
