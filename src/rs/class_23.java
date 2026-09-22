package rs;

import com.google.a.b.H;
import com.google.a.b.af;
import com.google.a.b.k;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.a.F;
import org.apache.commons.text.WordUtils;
import org.apache.commons.text.similarity.JaroWinklerDistance;

/* JADX INFO: loaded from: client-final.jar:rs/class_23.class */
public class class_23 {
    private static final JaroWinklerDistance b = new JaroWinklerDistance();
    private static final Pattern c = Pattern.compile("<[^>]*>");
    private static final af d = af.a(",").a().b();
    private static final H e = H.a(",").a();
    public static final k a = new class_13();

    public static List<String> a(String str) {
        return d.b((CharSequence) str);
    }

    public static String a(Collection<String> collection) {
        return e.a((Iterable<?>) collection);
    }

    public static String b(String str) {
        return c.matcher(str).replaceAll("");
    }

    public static String c(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = c.matcher(str);
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, "");
            String strGroup = matcher.group(0);
            switch (strGroup) {
                case "<lt>":
                case "<gt>":
                    stringBuffer.append(strGroup);
                    break;
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static String d(String str) {
        return b(str).replace((char) 160, ' ').trim().toLowerCase();
    }

    public static String e(String str) {
        return k.e().j(str.replaceAll("[ _-]", F.a)).trim();
    }

    public static String f(String str) {
        return b(str.replaceAll("-<br>", "-").replaceAll("<br>", F.a).replaceAll("[ ]+", F.a));
    }

    public static String g(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '<') {
                sb.append("<lt>");
            } else if (cCharAt == '>') {
                sb.append("<gt>");
            } else if (cCharAt == '\n') {
                sb.append("<br>");
            } else if (cCharAt != '\r') {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static String h(String str) {
        return (str.contains("<img") ? str.substring(str.lastIndexOf(62) + 1) : str).replace((char) 160, ' ');
    }

    public static String a(Enum r6) {
        String string = r6.toString();
        return r6.name().equals(string) ? WordUtils.capitalize(string.toLowerCase(), '_').replace("_", F.a) : string;
    }

    public static boolean a(Iterable<String> iterable, Collection<String> collection) {
        for (String str : iterable) {
            if (collection.stream().noneMatch(str2 -> {
                return str2.contains(str) || b.apply((CharSequence) str2, (CharSequence) str).doubleValue() > 0.9d;
            })) {
                return false;
            }
        }
        return true;
    }
}
