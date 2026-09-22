package rs.plugins.epkg;

import rs.class_132;
import rs.class_135;
import rs.class_137;
import rs.class_145;

/* JADX INFO: loaded from: client-final.jar:rs/s/e/d.class */
@class_135(a = d.a)
public interface d extends class_132 {
    public static final String a = "gpu";

    /* JADX INFO: loaded from: client-final.jar:rs/s/e/d$a.class */
    public enum a {
        a,
        b,
        c
    }

    @class_137(b = "enabled", c = "Enabled", d = "Whether GPU is enabled or disabled", a = 1)
    default boolean a() {
        return false;
    }

    @class_137(b = "smoothBanding", c = "Smooth banding", d = "Smooths out the color banding that is present in the CPU renderer", a = 2)
    default boolean b() {
        return false;
    }

    @class_137(b = "antiAliasingMode", c = "Anti Aliasing", d = "Configures the anti-aliasing mode", a = 3)
    default rs.lpkg.apkg.a c() {
        return rs.lpkg.apkg.a.a;
    }

    @class_137(b = "stretchedMode", c = "Stretched Mode", d = "Allows you to stretch the game screen in fixed mode", a = 4)
    default boolean d() {
        return false;
    }

    @class_137(b = "maintainAspectRatio", c = "Maintain aspect ratio", d = "Whether or not to maintain aspect ratio in stretched mode", a = 5)
    default boolean e() {
        return false;
    }

    @class_137(b = "uiScalingMode", c = "UI scaling mode", d = "Sampling function to use for the UI in stretched mode", a = 6)
    default e f() {
        return e.d;
    }

    @class_145(a = 0, b = 16)
    @class_137(b = "anisotropicFilteringLevel", c = "Anisotropic Filtering", d = "Configures the anisotropic filtering level.", a = 7)
    default int g() {
        return 0;
    }

    @class_137(b = "colorBlindMode", c = "Colorblindness Correction", d = "Adjusts colors to account for colorblindness", a = 8)
    default rs.lpkg.apkg.b h() {
        return rs.lpkg.apkg.b.a;
    }

    @class_137(b = "vsyncMode", c = "Vsync Mode", d = "Method to synchronize frame rate with refresh rate", a = 11)
    default rs.lpkg.apkg.c i() {
        return rs.lpkg.apkg.c.c;
    }
}
