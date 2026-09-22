package rs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: client-final.jar:rs/class_24.class */
public class class_24 {
    private static final Pattern a = Pattern.compile("(?i)[^*]+|(\\*)");

    public static boolean a(String str, String str2) {
        Matcher matcher = a.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("(?i)");
        while (matcher.find()) {
            if (matcher.group(1) != null) {
                matcher.appendReplacement(stringBuffer, ".*");
            } else {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(Pattern.quote(matcher.group(0))));
            }
        }
        matcher.appendTail(stringBuffer);
        return str2.matches(stringBuffer.toString());
    }
}
