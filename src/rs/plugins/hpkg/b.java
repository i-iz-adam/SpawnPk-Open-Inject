package rs.plugins.hpkg;

import rs.class_132;
import rs.class_135;
import rs.class_137;
import rs.class_142;
import rs.class_147;

/* JADX INFO: loaded from: client-final.jar:rs/s/h/b.class */
@class_135(a = b.a)
public interface b extends class_132 {
    public static final String a = "infoBoxes";

    @class_142(a = "Timers", b = "Info boxes for timers", c = 1)
    public static final String b = "timers";

    @class_142(a = "Counters", b = "Info boxes for counters", c = 2)
    public static final String c = "counters";

    @class_142(a = "Statuses", b = "Info boxes for statuses", c = 3)
    public static final String d = "statuses";

    @class_142(a = "Appearence", b = "The appearence of infoboxes", c = 0)
    public static final String e = "appearence";

    @class_137(b = "antifireTimer", c = "Antifire timer", d = "Display this timer as an infobox when active", h = b, a = 0)
    default boolean a() {
        return true;
    }

    @class_137(b = "antipoisonTimer", c = "Antipoison timer", d = "Display this timer as an infobox when active", h = b, a = 1)
    default boolean b() {
        return true;
    }

    @class_137(b = "antiVenomTimer", c = "Anti-venom timer", d = "Display this timer as an infobox when active", h = b, a = 2)
    default boolean c() {
        return true;
    }

    @class_137(b = "dfsTimer", c = "Dragonfire shield timer", d = "Display this timer as an infobox when active", h = b, a = 3)
    default boolean d() {
        return true;
    }

    @class_137(b = "freezeTimer", c = "Freeze timer", d = "Display this timer as an infobox when active", h = b, a = 4)
    default boolean e() {
        return true;
    }

    @class_137(b = "teleblockTimer", c = "Teleblock duration", d = "Display this timer as an infobox when active", h = b, a = 5)
    default boolean f() {
        return true;
    }

    @class_137(b = "bloodSlayerTimer", c = "Blood slayer task duration", d = "Display this timer as an infobox when active", h = b, a = 6)
    default boolean g() {
        return true;
    }

    @class_137(b = "counterTimeout", c = "Counter Expiry", d = "Set the time until counter info boxes expire", h = c, a = 0)
    @class_147(a = class_147.b)
    default int h() {
        return 5;
    }

    @class_137(b = "slayerCounter", c = "Slayer task progress", d = "Display this counter as an infobox when active", h = c, a = 1)
    default boolean i() {
        return true;
    }

    @class_137(b = "taskScroll", c = "Task scroll progress", d = "Display this counter as an infobox when active", h = c, a = 2, e = true)
    default boolean j() {
        return true;
    }

    @class_137(b = "soulHunter", c = "Soul hunter progress", d = "Display this counter as an infobox when active", h = c, a = 3)
    default boolean k() {
        return true;
    }

    @class_137(b = "wanderCounter", c = "Wanderer's task progress", d = "Display this counter as an infobox when active", h = c, a = 4)
    default boolean l() {
        return true;
    }

    @class_137(b = "showCombatSkillBoosts", c = "Combat buffs / debuffs", d = "Display this status as an infobox when active", h = d, a = 0)
    default boolean m() {
        return false;
    }

    @class_137(b = "showStatResetTimer", c = "Buff change timer", d = "Display this status as an infobox when active", h = d, a = 1)
    default boolean n() {
        return false;
    }

    @class_137(b = "raidAfflictionStatus", c = "Raid afflictions", d = "Display this status as an infobox when active", h = d, a = 3)
    default boolean o() {
        return true;
    }

    @class_137(b = "infoBoxVertical", c = "Display infoboxes vertically", d = "Toggles the infoboxes to display vertically", a = 40, h = e, e = true)
    default boolean p() {
        return false;
    }

    @class_137(b = "infoBoxSize", c = "Infobox size", d = "Configures the size of each infobox in pixels", a = 42, h = e)
    @class_147(a = class_147.d)
    default int q() {
        return 32;
    }

    @class_137(b = "infoBoxTextOutline", c = "Outline infobox text", d = "Draw a full outline instead of a simple shadow for infobox text", a = 43, h = e)
    default boolean r() {
        return false;
    }

    @class_137(b = "infoBoxTooltips", c = "Display infobox hover tooltips", d = "Whether to display the tooltips of infoboxes when hovering over them", a = 44, h = e)
    default boolean s() {
        return true;
    }
}
