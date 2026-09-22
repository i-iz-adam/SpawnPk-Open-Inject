package rs.plugins.k;

import java.awt.image.BufferedImage;
import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.class_12;
import rs.gui.bpkg.h;
import rs.plugins.e;
import rs.ui.l;

/* JADX INFO: loaded from: client-final.jar:rs/s/k/a.class */
@e(a = "Loadouts", b = "loadouts", c = "Set up and switch between loadouts", d = {"panel"}, i = true, k = true)
public class a extends rs.plugins.a {
    private static final Logger b = LoggerFactory.getLogger((Class<?>) a.class);

    @Inject
    private rs.ui.e c;
    private l d;
    private h e;

    @Override // rs.s.a
    protected void a() {
        BufferedImage bufferedImageB = class_12.b(getClass(), "ldt_icon.png");
        this.e = new h();
        h.b = this.e;
        this.d = l.a().a("Loadouts").a(bufferedImageB).a(0).a(this.e).a();
        this.c.a(this.d);
    }
}
