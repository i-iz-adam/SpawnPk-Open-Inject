package rs.plugins.q;

import com.sun.jna.platform.win32.aU;
import rs.class_132;
import rs.class_135;
import rs.class_137;
import rs.class_145;

/* JADX INFO: loaded from: client-final.jar:rs/s/q/a.class */
@class_135(a = "pvptracker")
public interface a extends class_132 {
    @class_145(a = 1, b = 1000)
    @class_137(b = "fightHistoryRenderLimit", c = "Max Rendered Fights", d = "Maximum number of previous fights to be displayed in the fight history side-panel.<br>WILL cause lag spikes at very high numbers. This should be small if you have low RAM", a = aU.ho_)
    default int a() {
        return 10;
    }

    @class_137(b = "exactNameFilter", c = "Exact Name Filter", d = "Makes the username filter look for an exact match (case-insensitive), rather than any name starting with the filter.", a = 220)
    default boolean b() {
        return false;
    }

    @class_137(b = "nameFilter", c = "Name Filter", d = "Hidden config used to save user's selected name filter for the panel views.", a = 1000, e = true)
    default String c() {
        return "";
    }
}
