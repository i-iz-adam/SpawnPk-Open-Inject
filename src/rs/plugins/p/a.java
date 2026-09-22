package rs.plugins.p;

import java.awt.Color;
import rs.class_131;
import rs.class_132;
import rs.class_135;
import rs.class_137;
import rs.class_145;

/* JADX INFO: loaded from: client-final.jar:rs/s/p/a.class */
@class_135(a = a.a)
public interface a extends class_132 {
    public static final String a = "playeroutline";

    @class_137(b = "playerOutlineColor", c = "Outline Color", d = "The color for the players outline", a = 0)
    @class_131
    default Color a() {
        return new Color(1023410176, true);
    }

    @class_137(b = "petOutline", c = "Outline your pet", d = "Display the player outline for your active pet as well", a = 10)
    default boolean b() {
        return true;
    }

    @class_137(b = "borderWidth", c = "Border Width", d = "Width of the player outline border", a = 20)
    default int c() {
        return 4;
    }

    @class_145(b = 4)
    @class_137(b = "outlineFeather", c = "Outline Feather", d = "Specify between 0-4 how much the player outline should be faded", a = 30)
    default int d() {
        return 4;
    }
}
