package rs.gui;

import javax.swing.AbstractButton;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;

/* JADX INFO: loaded from: client-final.jar:rs/gui/c.class */
class cGui extends ClassicButtonShaper {
    final /* synthetic */ SubstanceSkin a;

    cGui(SubstanceSkin bVar) {
        this.a = bVar;
    }

    @Override // org.pushingpixels.substance.api.shaper.ClassicButtonShaper, org.pushingpixels.substance.api.shaper.RectangularButtonShaper
    public float getCornerRadius(AbstractButton abstractButton, float f) {
        return 0.0f;
    }
}
