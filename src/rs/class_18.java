package rs;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: client-final.jar:rs/class_18.class */
public class class_18 {
    private static final String[] a = {"", "K", "M", "B", "T"};
    private static final Pattern b = Pattern.compile("^-?[0-9,.]+([a-zA-Z]?)$");
    private static final NumberFormat c = NumberFormat.getInstance(Locale.ENGLISH);
    private static final NumberFormat d = new DecimalFormat("#,###.#", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
    private static final NumberFormat e = new DecimalFormat("#,###.###", DecimalFormatSymbols.getInstance(Locale.ENGLISH));

    public static synchronized String a(long j) {
        if (j < 0) {
            return "-" + a(j == Long.MIN_VALUE ? Long.MAX_VALUE : -j);
        }
        if (j < 10000) {
            return c.format(j);
        }
        String str = a[0];
        long jPow = 1;
        for (int length = a.length - 1; length >= 0; length--) {
            jPow = (long) Math.pow(10.0d, length * 3);
            if (j / jPow >= 1.0d) {
                str = a[length];
                break;
            }
        }
        String str2 = c.format(j / jPow);
        String strSubstring = str2.length() > 4 ? str2.substring(0, 4) : str2;
        return (strSubstring.endsWith(".") ? strSubstring.substring(0, 3) : strSubstring) + str;
    }

    public static String a(int i) {
        return a(i, false);
    }

    public static synchronized String a(int i, boolean z) {
        String strValueOf = String.valueOf(i);
        if (strValueOf.length() <= 4) {
            return strValueOf;
        }
        int iLog10 = (int) Math.log10(i);
        return ((!z || iLog10 < 6) ? d : e).format(((double) i) / Math.pow(10.0d, (iLog10 / 3) * 3)) + a[iLog10 / 3];
    }

    public static synchronized long a(String str) throws ParseException {
        return (long) (c.parse(str).floatValue() * b(str));
    }

    public static synchronized String b(long j) {
        return c.format(j);
    }

    public static synchronized String a(double d2) {
        return c.format(d2);
    }

    private static int b(String str) throws ParseException {
        Matcher matcher = b.matcher(str);
        if (!matcher.find()) {
            throw new ParseException(str + " does not resemble a properly formatted stack.", str.length() - 1);
        }
        String strGroup = matcher.group(1);
        if (strGroup.equals("")) {
            return 1;
        }
        for (int i = 1; i < a.length; i++) {
            if (a[i].equals(strGroup.toUpperCase())) {
                return (int) Math.pow(10.0d, i * 3);
            }
        }
        throw new ParseException("Invalid Suffix: " + strGroup, str.length() - 1);
    }
}
