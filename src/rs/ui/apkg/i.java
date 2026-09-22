package rs.ui.apkg;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Objects;

/* JADX INFO: loaded from: client-final.jar:rs/ui/a/i.class */
public class i extends c {
    private final String b = "";

    public i(BufferedImage bufferedImage, String str, String str2) {
        super(bufferedImage, str, str2);
        this.b = "";
    }

    @Override // rs.ui.a.c
    public String a() {
        return "";
    }

    @Override // rs.ui.a.c
    public Color b() {
        return Color.WHITE;
    }

    public String toString() {
        Objects.requireNonNull(this);
        return "StatusInfoBox(EMPTY=" + "" + ")";
    }
}
