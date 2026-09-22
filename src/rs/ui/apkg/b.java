package rs.ui.apkg;

import java.awt.Color;
import java.awt.image.BufferedImage;

/* JADX INFO: loaded from: client-final.jar:rs/ui/a/b.class */
public class b extends c {
    private static final String b = "";
    private int c;

    public b(BufferedImage bufferedImage, String str, String str2, int i) {
        super(bufferedImage, str, str2);
        this.c = i;
    }

    @Override // rs.ui.a.c
    public String a() {
        return c() == -1 ? "" : Integer.toString(c());
    }

    @Override // rs.ui.a.c
    public Color b() {
        return Color.WHITE;
    }

    public String toString() {
        return "CounterInfoBox(count=" + c() + ")";
    }

    public int c() {
        return this.c;
    }

    public void a(int i) {
        this.c = i;
    }
}
