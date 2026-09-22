package rs.gui;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import javax.swing.text.StyleContext;

/* JADX INFO: loaded from: client-final.jar:rs/gui/w.class */
public class w {
    private static final Font a;
    private static final Font b;
    private static final Font c;
    private static final Font d;
    private static final Font e;

    public static Font a() {
        return a;
    }

    public static Font b() {
        return b;
    }

    public static Font c() {
        return c;
    }

    public static Font d() {
        return d;
    }

    public static Font e() {
        return e;
    }

    static {
        GraphicsEnvironment localGraphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        try {
            Font fontDeriveFont = Font.createFont(0, w.class.getResourceAsStream("runescape.ttf")).deriveFont(0, 16.0f);
            localGraphicsEnvironment.registerFont(fontDeriveFont);
            a = StyleContext.getDefaultStyleContext().getFont(fontDeriveFont.getName(), 0, 16);
            localGraphicsEnvironment.registerFont(a);
            Font fontDeriveFont2 = Font.createFont(0, w.class.getResourceAsStream("runescape_small.ttf")).deriveFont(0, 16.0f);
            localGraphicsEnvironment.registerFont(fontDeriveFont2);
            b = StyleContext.getDefaultStyleContext().getFont(fontDeriveFont2.getName(), 0, 16);
            localGraphicsEnvironment.registerFont(b);
            Font fontDeriveFont3 = Font.createFont(0, w.class.getResourceAsStream("runescape_bold.ttf")).deriveFont(0, 16.0f);
            localGraphicsEnvironment.registerFont(fontDeriveFont3);
            c = StyleContext.getDefaultStyleContext().getFont(fontDeriveFont3.getName(), 0, 16);
            localGraphicsEnvironment.registerFont(c);
            d = new Font("Dialog", 0, 16);
            e = new Font("Dialog", 1, 16);
        } catch (FontFormatException e2) {
            throw new RuntimeException("Font loaded, but format incorrect.", e2);
        } catch (IOException e3) {
            throw new RuntimeException("Font file not found.", e3);
        }
    }
}
