package rs.gui.bpkg;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import rs.gui.x;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/e.class */
public enum e {
    a("Melee", "/assets/gui/icons/melee.png"),
    b(com.google.a.l.c.E, "/assets/gui/icons/range.png"),
    c("Magic", "/assets/gui/icons/magic.png"),
    d("Pure", "/assets/gui/icons/pure.png"),
    e("Welfare", "/assets/gui/icons/welfare.png"),
    f("Skull", "/assets/gui/icons/skull.png"),
    g("Red Skull", "/assets/gui/icons/redskull.png"),
    h("Hotspot", "/assets/gui/icons/hotspot.png"),
    i("Slayer", "/assets/gui/icons/slayer.png"),
    j("Blood Slayer", "/assets/gui/icons/slayerblood.png"),
    k("PvM", "/assets/gui/icons/pvm.png"),
    l("Raids", "/assets/gui/icons/raids.png"),
    m("Raids 2", "/assets/gui/icons/raids 2.png"),
    n("Event", "/assets/gui/icons/event.png"),
    o("Cash", "/assets/gui/icons/cash 1.png"),
    p("Cash 2", "/assets/gui/icons/cash 2.png"),
    q("Barrage", "/assets/gui/icons/barrage.png"),
    r("Fun", "/assets/gui/icons/fun.png"),
    s("Box", "/assets/gui/icons/box.png"),
    t("Master Orb", "/assets/gui/icons/orb 3.png"),
    u("Cursed Orb", "/assets/gui/icons/orb 4.png"),
    v("Enchant", "/assets/gui/icons/enchant.png"),
    w("Emoji", "/assets/gui/icons/emoji 1.png"),
    x("Emoji 2", "/assets/gui/icons/emoji 2.png"),
    y("Emoji 3", "/assets/gui/icons/emoji 3.png"),
    z("Emoji 4", "/assets/gui/icons/emoji 4.png"),
    A("Emoji 5", "/assets/gui/icons/emoji 5.png"),
    B("Emoji 6", "/assets/gui/icons/emoji 6.png"),
    C("Emoji 7", "/assets/gui/icons/emoji 7.png");

    private x F;
    private Icon G;
    public String D;
    public String E;

    e(String str, String str2) {
        this.D = str;
        this.E = str2;
    }

    public Icon a() {
        if (this.F == null) {
            this.F = new x(0);
            if (!this.F.a(this.E)) {
                this.F = null;
            }
        }
        if (this.F == null) {
            return null;
        }
        if (this.G == null) {
            this.G = new ImageIcon(this.F.a);
        }
        return this.G;
    }
}
