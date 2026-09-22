package rs.ui.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/x.class */
public class x implements w {
    private static final Pattern a = Pattern.compile("<col=([0-9a-fA-F]{2,6})>");
    private String b;
    private Point c = new Point();
    private Color d = Color.WHITE;
    private boolean e;

    @Nullable
    private Font f;

    @Override // rs.ui.components.w
    public Dimension a(Graphics2D graphics2D) {
        Font font = null;
        if (this.f != null) {
            font = graphics2D.getFont();
            graphics2D.setFont(this.f);
        }
        FontMetrics fontMetrics = graphics2D.getFontMetrics();
        Matcher matcher = a.matcher(this.b);
        Color colorDecode = this.d;
        int iEnd = 0;
        int iStringWidth = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            String strSubstring = this.b.substring(iEnd, matcher.start());
            iEnd = matcher.end();
            a(graphics2D, colorDecode, this.c.x + iStringWidth, this.c.y, strSubstring);
            iStringWidth += fontMetrics.stringWidth(strSubstring);
            colorDecode = Color.decode("#" + strGroup);
        }
        String strSubstring2 = this.b.substring(iEnd);
        a(graphics2D, colorDecode, this.c.x + iStringWidth, this.c.y, strSubstring2);
        int iStringWidth2 = iStringWidth + fontMetrics.stringWidth(strSubstring2);
        int height = fontMetrics.getHeight();
        if (font != null) {
            graphics2D.setFont(font);
        }
        return new Dimension(iStringWidth2, height);
    }

    private void a(Graphics2D graphics2D, Color color, int i, int i2, String str) {
        if (str.isEmpty()) {
            return;
        }
        graphics2D.setColor(Color.BLACK);
        if (this.e) {
            graphics2D.drawString(str, i, i2 + 1);
            graphics2D.drawString(str, i, i2 - 1);
            graphics2D.drawString(str, i + 1, i2);
            graphics2D.drawString(str, i - 1, i2);
        } else {
            graphics2D.drawString(str, i + 1, i2 + 1);
        }
        graphics2D.setColor(color);
        graphics2D.drawString(str, i, i2);
    }

    public void a(String str) {
        this.b = str;
    }

    public void a(Point point) {
        this.c = point;
    }

    public void a(Color color) {
        this.d = color;
    }

    public void a(boolean z) {
        this.e = z;
    }

    public void a(@Nullable Font font) {
        this.f = font;
    }
}
