package rs;

import java.awt.Color;
import java.util.regex.Pattern;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: client-final.jar:rs/class_9.class */
public class class_9 {
    public static final int a = 255;
    public static final int b = 0;
    private static final String d = "<col=";
    private static final String e = ">";
    public static final String c = "</col>";
    private static final Pattern f = Pattern.compile("^(#|0x)?[0-9a-fA-F]{7,8}");
    private static final Pattern g = Pattern.compile("^(#|0x)?[0-9a-fA-F]{1,8}");

    public static String a(Color color) {
        return "<col=" + c(color) + ">";
    }

    public static String a(String str, Color color) {
        return a(color) + str;
    }

    public static String b(String str, Color color) {
        return a(str, color) + "</col>";
    }

    public static String b(Color color) {
        return "#" + c(color);
    }

    public static Color a(Color color, Color color2, double d2) {
        double red = color.getRed();
        double red2 = color2.getRed();
        double green = color.getGreen();
        double green2 = color2.getGreen();
        double blue = color.getBlue();
        double blue2 = color2.getBlue();
        double alpha = color.getAlpha();
        return new Color((int) Math.round(red + (d2 * (red2 - red))), (int) Math.round(green + (d2 * (green2 - green))), (int) Math.round(blue + (d2 * (blue2 - blue))), (int) Math.round(alpha + (d2 * (((double) color2.getAlpha()) - alpha))));
    }

    public static String c(Color color) {
        return String.format("%06x", Integer.valueOf(color.getRGB() & class_492.c));
    }

    public static String d(Color color) {
        return String.format("%08x", Integer.valueOf(color.getRGB()));
    }

    public static Color a(Color color, int i) {
        if (color.getAlpha() == i) {
            return color;
        }
        return new Color((color.getRGB() & class_492.c) | (a(i) << 24), true);
    }

    public static boolean a(String str) {
        return f.matcher(str).matches();
    }

    public static boolean b(String str) {
        return g.matcher(str).matches();
    }

    public static int a(int i) {
        return com.google.a.m.l.a(i, 0, 255);
    }

    public static Color c(String str) {
        try {
            return new Color(Integer.decode(str).intValue(), true);
        } catch (NumberFormatException e2) {
            return null;
        }
    }

    public static Color d(String str) {
        if (!str.startsWith("#") && !str.startsWith("0x")) {
            str = "#" + str;
        }
        if ((str.length() > 7 || !str.startsWith("#")) && (str.length() > 8 || !str.startsWith("0x"))) {
            try {
                return new Color(Long.decode(str).intValue(), true);
            } catch (NumberFormatException e2) {
                return null;
            }
        }
        try {
            return Color.decode(str);
        } catch (NumberFormatException e3) {
            return null;
        }
    }

    public static Color a(@Nonnull Object obj) {
        return Color.getHSBColor((obj.hashCode() % 360) / 360.0f, 1.0f, 1.0f);
    }
}
