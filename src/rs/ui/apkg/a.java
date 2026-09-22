package rs.ui.apkg;

import java.awt.Color;
import java.awt.image.BufferedImage;

/* JADX INFO: loaded from: client-final.jar:rs/ui/a/a.class */
public class a extends c {
    private int b;
    private int c;

    public a(BufferedImage bufferedImage, String str, String str2, int i, int i2) {
        super(bufferedImage, str, str2);
        this.b = i;
        this.c = i2;
    }

    @Override // rs.ui.a.c
    public String a() {
        return c() > 0 ? "+" + c() : String.valueOf(c());
    }

    @Override // rs.ui.a.c
    public Color b() {
        return this.b < 0 ? Color.RED : Color.GREEN;
    }

    public String toString() {
        return "BoostInfoBox(offset=" + c() + ", skillId=" + d() + ")";
    }

    public int c() {
        return this.b;
    }

    public void a(int i) {
        this.b = i;
    }

    public int d() {
        return this.c;
    }

    public void b(int i) {
        this.c = i;
    }
}
